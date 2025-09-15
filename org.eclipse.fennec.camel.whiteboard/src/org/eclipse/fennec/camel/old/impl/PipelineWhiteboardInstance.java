/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.eclipse.fennec.camel.old.impl;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.camel.CamelContext;
import org.apache.camel.karaf.core.OsgiDefaultCamelContext;
import org.eclipse.fennec.camel.old.ConfigurationAgent;
import org.eclipse.fennec.camel.old.PipelineInstance;
import org.eclipse.fennec.camel.old.PipelineMonitoringService;
import org.eclipse.fennec.camel.old.PipelineStateReporter;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.condition.Condition;
import org.osgi.util.promise.Deferred;
import org.osgi.util.promise.Promise;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Pipeline Whiteboard Instance - one instance per pipeline configuration.
 * 
 * <p>This component implements the hybrid activation approach:
 * <ul>
 * <li><strong>Early Activation</strong>: Component activates immediately when configuration is available</li>
 * <li><strong>Deferred Camel Context</strong>: Camel context creation waits until all dependencies are satisfied</li>
 * </ul>
 * 
 * <p>The component uses programmatic ServiceTrackers to monitor dependencies and automatically
 * starts/stops the Camel context based on dependency availability. When all dependencies are
 * satisfied, it publishes an OSGi Condition service to signal pipeline readiness.
 * 
 * <p>Key features:
 * <ul>
 * <li>Immediate activation for monitoring and setup</li>
 * <li>Automatic Camel context lifecycle management</li>
 * <li>Dynamic dependency tracking with ServiceTrackers</li>
 * <li>OSGi Condition service for external readiness checks</li>
 * <li>Configuration updates support</li>
 * </ul>
 */
@Component(
		name = ConfigurationAgent.PIPELINE_WHITEBOARD_FACTORY_PID,
		configurationPolicy = ConfigurationPolicy.REQUIRE
		)
public class PipelineWhiteboardInstance implements PipelineInstance {

	private static final Logger logger = LoggerFactory.getLogger(PipelineWhiteboardInstance.class);
	String COMPONENT_TEMPLATE = "(&(objectClass=org.apache.camel.spi.ComponentResolver)%s)";
	String LANGUAGE_TEMPLATE = "(&(objectClass=org.apache.camel.spi.LanguageResolver)%s)";
	String CONFIGURER_TEMPLATE = "(&(objectClass=org.apache.camel.spi.ConfigurerResolver)%s)";

	// Configuration
	private String pipelineId;
	private String pipelineName;
	private boolean autoStart;
	private String[] dependencyFilters;
	private Map<String, String> parameterValues;

	// Runtime state
	private BundleContext bundleContext;
	private List<ServiceTracker<?, ?>> serviceTrackers = new ArrayList<>();
	private CamelContext camelContext;
	private ServiceRegistration<Condition> readinessCondition;
	private final AtomicBoolean camelContextStarted = new AtomicBoolean(false);

	// PipelineInstance state tracking
	private volatile PipelineState currentState = PipelineState.CONFIGURED;
	private final List<StateChangeListener> stateChangeListeners = new CopyOnWriteArrayList<>();
	private final List<String> missingDependencies = new ArrayList<>();
	private final List<String> resolvedDependencies = new ArrayList<>();
	private volatile String lastError;

	// Asynchronous dependency resolution
	private Deferred<Boolean> readinessDeferred;
	private ScheduledExecutorService executorService;

	// State reporter for monitoring service
	@Reference
	private PipelineStateReporter stateReporter;

	@Activate
	public void activate(BundleContext bundleContext, Map<String, Object> config) throws ConfigurationException {
		this.bundleContext = bundleContext;

		// Extract configuration
		this.pipelineId = getRequiredString(config, ConfigurationAgent.ConfigKeys.PIPELINE_ID);
		this.pipelineName = getString(config, ConfigurationAgent.ConfigKeys.PIPELINE_NAME, pipelineId);
		this.autoStart = getBoolean(config, ConfigurationAgent.ConfigKeys.AUTO_START, true);
		this.dependencyFilters = getStringArray(config, ConfigurationAgent.ConfigKeys.DEPENDENCY_FILTERS);
		this.parameterValues = extractParameterValues(config);

		logger.info("Pipeline whiteboard instance '{}' ({}) activated with {} dependencies", 
				pipelineId, pipelineName, dependencyFilters.length);

		// Report initial state to monitoring service
		if (stateReporter != null) {
			stateReporter.updatePipelineState(pipelineId, PipelineMonitoringService.PipelineState.CONFIGURED);
		}

		// Set initial state
		changeState(PipelineState.CONFIGURED);

		// Initialize executor service for asynchronous operations
		this.executorService = Executors.newSingleThreadScheduledExecutor(r -> {
			Thread t = new Thread(r, "PipelineInstance-" + pipelineId);
			t.setDaemon(true);
			return t;
		});

		// Initialize readiness promise
		this.readinessDeferred = new Deferred<>();

		// Start dependency monitoring asynchronously to avoid blocking activation
		if (autoStart) {
			startDependencyMonitoring();
//			startDependencyMonitoringAsync();
		} else {
			logger.info("Pipeline '{}' configured for manual start", pipelineId);
		}
	}

	@Deactivate
	public void deactivate() {
		logger.info("Deactivating pipeline whiteboard instance: {}", pipelineId);

		// Report deactivation state
		if (stateReporter != null) {
			stateReporter.updatePipelineState(pipelineId, PipelineMonitoringService.PipelineState.DEACTIVATED);
		}

		// Set deactivated state
		changeState(PipelineState.DEACTIVATED);

		// Stop Camel context
		stopCamelContext();

		// Close all service trackers
		serviceTrackers.forEach(tracker -> {
			try {
				tracker.close();
			} catch (Exception e) {
				logger.warn("Error closing service tracker", e);
			}
		});
		serviceTrackers.clear();

		// Remove from monitoring service
		if (stateReporter != null) {
			stateReporter.removePipeline(pipelineId);
		}

		// Shutdown executor service
		if (executorService != null) {
			executorService.shutdown();
		}

		// Reject readiness promise if still pending
		if (readinessDeferred != null && !readinessDeferred.getPromise().isDone()) {
			readinessDeferred.fail(new IllegalStateException("Pipeline deactivated before becoming ready"));
		}

		logger.info("Pipeline whiteboard instance '{}' deactivated", pipelineId);
	}

	@Modified
	public void modified(Map<String, Object> config) throws ConfigurationException {
		logger.info("Pipeline '{}' configuration modified", pipelineId);

		// For simplicity, restart with new configuration
		// In production, you might want more sophisticated update logic
		deactivate();
		activate(bundleContext, config);
	}

	/**
	 * Starts dependency monitoring asynchronously to avoid blocking component activation.
	 */
	private void startDependencyMonitoringAsync() {
		executorService.execute(() -> {
			try {
				startDependencyMonitoring();
			} catch (Exception e) {
				logger.error("Error during asynchronous dependency monitoring for pipeline '{}'", pipelineId, e);
				// Change to error state but don't let the exception bubble up to cause component deactivation
				changeState(PipelineState.ERROR, e.getMessage());

				// Resolve readiness promise with failure
				if (readinessDeferred != null && !readinessDeferred.getPromise().isDone()) {
					readinessDeferred.resolve(false);
				}
			}
		});
	}

	/**
	 * Starts monitoring all configured dependencies using ServiceTrackers.
	 * This includes both pipeline-specific services and core Camel services.
	 * 
	 * <p>This method runs asynchronously to avoid blocking component activation.
	 */
	private void startDependencyMonitoring() {
		logger.debug("Starting dependency monitoring for pipeline: {}", pipelineId);

		// Always add core Camel service dependencies
		List<String> allFilters = new ArrayList<>();

		// Add core Camel services that must be available before starting any pipeline
		// These are typically registered by Camel core bundles
		addCoreCamelServiceFilters(allFilters);

		// Add pipeline-specific dependencies
		if (dependencyFilters != null) {
			for (String filter : dependencyFilters) {
				String theFilter;
				if (filter.contains("language")) {
					theFilter = String.format(LANGUAGE_TEMPLATE, filter);
				} else if (filter.contains("component")) {
					theFilter = String.format(COMPONENT_TEMPLATE, filter);
				} else if (filter.contains("configurer")) {
					theFilter = String.format(CONFIGURER_TEMPLATE, filter);
				} else {
					theFilter = filter;
				}
				logger.info("Add filter for dependencies '{}'", theFilter);
				allFilters.add(theFilter);
			}
		}

		if (allFilters.isEmpty()) {
			logger.info("No dependencies configured for pipeline '{}', starting Camel context immediately", pipelineId);
			changeState(PipelineState.DEPENDENCIES_RESOLVED);
			startCamelContext();
			return;
		} else {
			changeState(PipelineState.WAITING_FOR_DEPENDENCIES);
		}

		// Create ServiceTracker for each dependency
		for (int i = 0; i < allFilters.size(); i++) {
			String filterString = allFilters.get(i);
			createServiceTracker(filterString, i);
		}

		logger.info("Started monitoring {} total dependencies for pipeline '{}' ({} core Camel + {} pipeline-specific)", 
				serviceTrackers.size(), pipelineId, 
				allFilters.size() - (dependencyFilters != null ? dependencyFilters.length : 0),
				dependencyFilters != null ? dependencyFilters.length : 0);
	}

	/**
	 * Adds core Camel service filters that should be available before starting any pipeline.
	 * These are services that Camel OSGi integration requires.
	 */
	private void addCoreCamelServiceFilters(List<String> filters) {
		// Note: OsgiDefaultCamelContext will handle most of these automatically,
		// but we can add specific core services that must be pre-registered

		// Example core services (uncomment as needed based on your requirements):
		// filters.add("(objectClass=org.apache.camel.spi.TypeConverterRegistry)");
		// filters.add("(objectClass=org.apache.camel.spi.ComponentResolver)");
		// filters.add("(objectClass=org.apache.camel.spi.LanguageResolver)");

		// For now, let OSGi CamelContext handle core service discovery automatically
		// This allows for faster startup and leverages Camel's built-in OSGi integration

		logger.debug("Core Camel service filters added: {} (letting OSGi CamelContext handle core services automatically)", 
				filters.size());
	}

	/**
	 * Creates a ServiceTracker for a specific dependency.
	 */
	private void createServiceTracker(String filterString, int dependencyIndex) {
		try {
			Filter filter = bundleContext.createFilter(filterString);
			logger.info("Create service tracker for filter {}", filterString); 
			ServiceTracker<?, ?> tracker = new ServiceTracker<>(
					bundleContext, filter, new ServiceTrackerCustomizer<Object, Object>() {

						@Override
						public Object addingService(ServiceReference<Object> reference) {
							logger.info("Dependency {} satisfied for pipeline '{}': {}", 
									dependencyIndex, pipelineId, reference);

							Object service = bundleContext.getService(reference);
							checkAndStartCamelContext();
							return service;
						}

						@Override
						public void modifiedService(ServiceReference<Object> reference, Object service) {
						}

						@Override
						public void removedService(ServiceReference<Object> reference, Object service) {
							logger.debug("Dependency {} lost for pipeline '{}': {}", 
									dependencyIndex, pipelineId, reference);

							stopCamelContext();
						}
					});

//				@Override
//				public Object addingService(ServiceReference<Object> reference) {
//					logger.info("Dependency {} satisfied for pipeline '{}': {}", 
//							dependencyIndex, pipelineId, reference);
//
//					Object service = super.addingService(reference);
//					checkAndStartCamelContext();
//					return service;
//				}
//
//				@Override
//				public void removedService(ServiceReference<Object> reference, Object service) {
//					logger.debug("Dependency {} lost for pipeline '{}': {}", 
//							dependencyIndex, pipelineId, reference);
//
//					stopCamelContext();
//					super.removedService(reference, service);
//				}
//			};

			serviceTrackers.add(tracker);
			tracker.open(true);

			logger.debug("Created service tracker {} for dependency: {}", dependencyIndex, filterString);

		} catch (InvalidSyntaxException e) {
			logger.error("Invalid dependency filter for pipeline '{}': {}", pipelineId, filterString, e);
		}
	}

	/**
	 * Checks if all dependencies are satisfied and starts Camel context if ready.
	 */
	private synchronized void checkAndStartCamelContext() {
		if (camelContextStarted.get()) {
			return; // Already started
		}

		if (allDependenciesSatisfied()) {
			logger.info("All dependencies satisfied for pipeline '{}', starting Camel context", pipelineId);

			// Report dependencies resolved state
			if (stateReporter != null) {
				stateReporter.updatePipelineState(pipelineId, PipelineMonitoringService.PipelineState.DEPENDENCIES_RESOLVED);
				updateMonitoringDependencies();
			}

			// Change state to dependencies resolved
			changeState(PipelineState.DEPENDENCIES_RESOLVED);

			startCamelContext();
		} else {
			logger.debug("Pipeline '{}' waiting for dependencies: {}/{} satisfied", 
					pipelineId, getSatisfiedDependencyCount(), dependencyFilters.length);

			// Report waiting for dependencies
			if (stateReporter != null) {
				updateMonitoringDependencies();
			}
		}
	}

	/**
	 * Starts the Camel context with resolved services.
	 */
	private synchronized void startCamelContext() {
		if (camelContextStarted.get()) {
			return; // Already started
		}

		try {
			logger.info("Starting Camel context for pipeline: {}", pipelineId);

			// Report starting state
			if (stateReporter != null) {
				stateReporter.updatePipelineState(pipelineId, PipelineMonitoringService.PipelineState.STARTING);
			}

			// Change to starting state
			changeState(PipelineState.STARTING);

			// Create Camel context
			logger.debug("Creating Camel context for pipeline: {}", pipelineId);
			camelContext = createCamelContext();
			logger.debug("Camel context created successfully for pipeline: {}", pipelineId);

			// Configure routes using resolved services
			logger.debug("Configuring routes for pipeline: {}", pipelineId);
			configureRoutes(camelContext);
			logger.debug("Routes configured successfully for pipeline: {}", pipelineId);

			// Start the context
			logger.debug("Starting Camel context for pipeline: {}", pipelineId);
			camelContext.start();
			logger.debug("Camel context started successfully for pipeline: {}", pipelineId);
			camelContextStarted.set(true);

			// Publish readiness condition
			publishReadinessCondition();

			// Report active state
			if (stateReporter != null) {
				stateReporter.updatePipelineState(pipelineId, PipelineMonitoringService.PipelineState.ACTIVE);
			}

			// Change to active state
			changeState(PipelineState.ACTIVE);

			// Resolve readiness promise
			if (readinessDeferred != null && !readinessDeferred.getPromise().isDone()) {
				readinessDeferred.resolve(true);
			}

			logger.info("Pipeline '{}' Camel context started successfully", pipelineId);

		} catch (Exception e) {
			logger.error("Failed to start Camel context for pipeline '{}'", pipelineId, e);
			camelContextStarted.set(false);

			// Report error state
			if (stateReporter != null) {
				stateReporter.updateError(pipelineId, e.getMessage());
			}

			// Change to error state
			changeState(PipelineState.ERROR, e.getMessage());

			// Resolve readiness promise with failure
			if (readinessDeferred != null && !readinessDeferred.getPromise().isDone()) {
				readinessDeferred.resolve(false);
			}
		}
	}

	/**
	 * Stops the Camel context and readiness condition.
	 */
	private synchronized void stopCamelContext() {
		if (!camelContextStarted.get()) {
			return; // Not started
		}

		logger.info("Stopping Camel context for pipeline: {}", pipelineId);

		// Unregister readiness condition
		if (readinessCondition != null) {
			try {
				readinessCondition.unregister();
			} catch (Exception e) {
				logger.warn("Error unregistering readiness condition", e);
			}
			readinessCondition = null;
		}

		// Stop Camel context
		if (camelContext != null) {
			try {
				camelContext.stop();
			} catch (Exception e) {
				logger.error("Error stopping Camel context for pipeline '{}'", pipelineId, e);
			}
			camelContext = null;
		}

		camelContextStarted.set(false);

		// Change to stopped state
		changeState(PipelineState.STOPPED);

		logger.info("Pipeline '{}' Camel context stopped", pipelineId);
	}

	/**
	 * Creates a new OSGi-aware Camel context for this pipeline.
	 */
	private CamelContext createCamelContext() {
		logger.debug("Creating OSGi CamelContext for pipeline: {}", pipelineId);

		// Create OSGi-aware Camel context that integrates with OSGi service registry
		OsgiDefaultCamelContext context = new OsgiDefaultCamelContext(bundleContext);

		// Set context name via global options (OSGi context manages naming internally)
		context.getGlobalOptions().put("CamelContextName", "pipeline-" + pipelineId);

		// The OSGi context automatically provides:
		// - OSGi service registry integration for components/processors
		// - OSGi-aware component/language/data format resolvers  
		// - Bundle-aware classloading
		// - Service reference management

		logger.debug("OSGi CamelContext created for pipeline '{}' with OSGi service integration", pipelineId);
		return context;
	}

	/**
	 * Configures Camel routes using resolved services and parameters.
	 * 
	 * <p>This method integrates with:
	 * <ul>
	 * <li>OSGi service registry (automatically via OsgiDefaultCamelContext)</li>
	 * <li>Resolved pipeline-specific services from ServiceTrackers</li>
	 * <li>Parameter values from configuration</li>
	 * <li>Pipeline definition from ConfigurationManager</li>
	 * </ul>
	 */
	private void configureRoutes(CamelContext context) {
		logger.debug("Configuring routes for pipeline '{}' with {} parameters and {} resolved services", 
				pipelineId, parameterValues.size(), getResolvedServiceCount());

		try {
			// Add resolved services to the Camel registry
			addResolvedServicesToRegistry(context);

			// Apply parameter values to context
			applyParameterValues(context);

			// TODO: Load and configure routes from pipeline definition
			// This would typically involve:
			// 1. Getting the pipeline definition from ConfigurationManager
			// 2. Converting EMF route definition to Camel routes
			// 3. Applying parameter substitution
			// 4. Adding routes to the context

			logger.info("Routes configured for pipeline '{}' - ready to start", pipelineId);

		} catch (Exception e) {
			logger.error("Failed to configure routes for pipeline '{}'", pipelineId, e);
			throw new RuntimeException("Route configuration failed", e);
		}
	}

	/**
	 * Adds resolved services from ServiceTrackers to the Camel registry.
	 * This makes them available for injection into routes and processors.
	 */
	private void addResolvedServicesToRegistry(CamelContext context) {
		int serviceCount = 0;

		for (int i = 0; i < serviceTrackers.size(); i++) {
			ServiceTracker<?, ?> tracker = serviceTrackers.get(i);

			// Get all available services for this dependency
			Object[] services = tracker.getServices();
			if (services != null && services.length > 0) {
				for (Object service : services) {
					// Register service in Camel registry with a meaningful name
					String serviceName = generateServiceName(service, i);
					context.getRegistry().bind(serviceName, service);
					serviceCount++;

					logger.debug("Registered service '{}' of type {} in Camel registry", 
							serviceName, service.getClass().getSimpleName());
				}
			}
		}

		logger.info("Registered {} resolved services in Camel registry for pipeline '{}'", 
				serviceCount, pipelineId);
	}

	/**
	 * Applies parameter values to the Camel context as properties.
	 */
	private void applyParameterValues(CamelContext context) {
		if (parameterValues != null && !parameterValues.isEmpty()) {
			// Convert Map<String,String> to Properties
			java.util.Properties properties = new java.util.Properties();
			for (Map.Entry<String, String> param : parameterValues.entrySet()) {
				properties.setProperty(param.getKey(), param.getValue());
				logger.debug("Applied parameter '{}' = '{}' to pipeline '{}'", 
						param.getKey(), param.getValue(), pipelineId);
			}

			// Set properties for route substitution
			context.getPropertiesComponent().setInitialProperties(properties);

			logger.info("Applied {} parameter values to pipeline '{}'", 
					parameterValues.size(), pipelineId);
		}
	}

	/**
	 * Generates a meaningful service name for registration in Camel registry.
	 */
	private String generateServiceName(Object service, int trackerIndex) {
		String className = service.getClass().getSimpleName();
		return String.format("%s.%s.%d", pipelineId, className, trackerIndex);
	}

	/**
	 * Gets the total number of resolved services across all trackers.
	 */
	private int getResolvedServiceCount() {
		return serviceTrackers.stream()
				.mapToInt(tracker -> tracker.getServices() != null ? tracker.getServices().length : 0)
				.sum();
	}

	/**
	 * Publishes OSGi Condition service to signal pipeline readiness.
	 */
	private void publishReadinessCondition() {
		Dictionary<String, Object> props = new Hashtable<>();
		props.put(Condition.CONDITION_ID, "pipeline.ready." + pipelineId);
		props.put("pipeline.id", pipelineId);
		props.put("pipeline.name", pipelineName);

		Condition readyCondition = new Condition() {
			// Marker interface - registration indicates readiness
		};

		readinessCondition = bundleContext.registerService(
				Condition.class, readyCondition, props);

		logger.info("Published readiness condition for pipeline: {}", pipelineId);
	}

	/**
	 * Checks if all configured dependencies are satisfied.
	 */
	private boolean allDependenciesSatisfied() {
		if (dependencyFilters.length == 0) {
			return true; // No dependencies
		}

		return serviceTrackers.stream().allMatch(tracker -> tracker.size() > 0);
	}

	/**
	 * Gets the number of currently satisfied dependencies.
	 */
	private int getSatisfiedDependencyCount() {
		return (int) serviceTrackers.stream().filter(tracker -> tracker.size() > 0).count();
	}

	// Configuration helper methods

	private String getRequiredString(Map<String, Object> config, String key) throws ConfigurationException {
		Object value = config.get(key);
		if (value == null || !(value instanceof String)) {
			throw new ConfigurationException(key, "Required string property missing or invalid");
		}
		return (String) value;
	}

	private String getString(Map<String, Object> config, String key, String defaultValue) {
		Object value = config.get(key);
		return value instanceof String ? (String) value : defaultValue;
	}

	private boolean getBoolean(Map<String, Object> config, String key, boolean defaultValue) {
		Object value = config.get(key);
		return value instanceof Boolean ? (Boolean) value : defaultValue;
	}

	private String[] getStringArray(Map<String, Object> config, String key) {
		Object value = config.get(key);
		if (value instanceof String[]) {
			return (String[]) value;
		} else if (value instanceof String) {
			return new String[] { (String) value };
		}
		return new String[0];
	}

	private Map<String, String> extractParameterValues(Map<String, Object> config) {
		Map<String, String> parameters = new HashMap<>();
		for (Map.Entry<String, Object> entry : config.entrySet()) {
			String key = entry.getKey();
			if (key.startsWith("parameter.") && entry.getValue() instanceof String) {
				String paramName = key.substring("parameter.".length());
				parameters.put(paramName, (String) entry.getValue());
			}
		}
		return parameters;
	}

	/**
	 * Updates monitoring service with current dependency states.
	 */
	private synchronized void updateMonitoringDependencies() {
		if (stateReporter == null || dependencyFilters == null) {
			return;
		}

		List<String> missing = new ArrayList<>();
		List<String> resolved = new ArrayList<>();

		for (int i = 0; i < dependencyFilters.length && i < serviceTrackers.size(); i++) {
			String filter = dependencyFilters[i];
			ServiceTracker<?, ?> tracker = serviceTrackers.get(i);

			if (tracker.size() > 0) {
				resolved.add(filter + " (" + tracker.size() + " services)");
			} else {
				missing.add(filter);
			}
		}

		// Update local dependency lists
		this.missingDependencies.clear();
		this.missingDependencies.addAll(missing);

		this.resolvedDependencies.clear();
		this.resolvedDependencies.addAll(resolved);

		// Update monitoring service
		stateReporter.updateMissingDependencies(pipelineId, missing);
		stateReporter.updateResolvedDependencies(pipelineId, resolved);
	}

	// PipelineInstance interface implementation

	@Override
	public String getPipelineId() {
		return pipelineId;
	}

	@Override
	public String getPipelineName() {
		return pipelineName;
	}

	@Override
	public PipelineState getCurrentState() {
		return currentState;
	}

	@Override
	public synchronized List<String> getMissingDependencies() {
		return new ArrayList<>(missingDependencies);
	}

	@Override
	public synchronized List<String> getResolvedDependencies() {
		return new ArrayList<>(resolvedDependencies);
	}

	@Override
	public String getLastError() {
		return lastError;
	}

	@Override
	public void addStateChangeListener(StateChangeListener listener) {
		if (listener == null) {
			throw new IllegalArgumentException("StateChangeListener cannot be null");
		}
		stateChangeListeners.add(listener);
	}

	@Override
	public boolean removeStateChangeListener(StateChangeListener listener) {
		return stateChangeListeners.remove(listener);
	}

	@Override
	public Promise<Boolean> getReadinessPromise() {
		if (readinessDeferred == null) {
			// If not initialized yet, return a rejected promise
			Deferred<Boolean> tempDeferred = new Deferred<>();
			tempDeferred.fail(new IllegalStateException("Pipeline not properly initialized"));
			return tempDeferred.getPromise();
		}

		// If already active, return resolved promise
		if (currentState == PipelineState.ACTIVE) {
			Deferred<Boolean> resolvedDeferred = new Deferred<>();
			resolvedDeferred.resolve(true);
			return resolvedDeferred.getPromise();
		}

		// If in error state, return resolved promise with false
		if (currentState == PipelineState.ERROR) {
			Deferred<Boolean> resolvedDeferred = new Deferred<>();
			resolvedDeferred.resolve(false);
			return resolvedDeferred.getPromise();
		}

		// Otherwise return the pending promise
		return readinessDeferred.getPromise();
	}

	/**
	 * Changes the pipeline state and notifies listeners.
	 */
	private void changeState(PipelineState newState) {
		changeState(newState, null);
	}

	/**
	 * Changes the pipeline state with optional error and notifies listeners.
	 */
	private void changeState(PipelineState newState, String error) {
		PipelineState oldState = this.currentState;
		this.currentState = newState;
		this.lastError = error;

		// Notify listeners
		for (StateChangeListener listener : stateChangeListeners) {
			try {
				listener.onStateChanged(pipelineId, oldState, newState, error);
			} catch (Exception e) {
				logger.warn("Error notifying state change listener", e);
			}
		}

		logger.debug("Pipeline '{}' state changed: {} -> {}", pipelineId, oldState, newState);
	}
}
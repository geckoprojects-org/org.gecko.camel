/**
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
 *     Data In Motion - initial API and implementation
 */
package org.gecko.camel.example.impl;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.camel.spi.ComponentResolver;
import org.apache.camel.spi.ConfigurerResolver;
import org.apache.camel.spi.LanguageResolver;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.condition.Condition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Comprehensive CamelCondition that tracks all essential Camel OSGi services
 * and publishes a condition service with aggregated properties.
 * 
 * State machine: camel=starting -> camel=ready
 * 
 * @author mark
 * @since 06.09.2025
 */
@Component(immediate = true)
public class CamelCondition implements Condition {

	private static final Logger LOG = LoggerFactory.getLogger(CamelCondition.class);

	// Required minimum services for Camel to be considered ready
	private static final Set<String> REQUIRED_LANGUAGES = Set.of("simple", "constant", "header");
	private static final Set<String> REQUIRED_COMPONENTS = Set.of("timer", "log", "direct", "bean", "class", "language", "kafka");
//	private static final Set<String> REQUIRED_COMPONENTS = Set.of("timer", "log", "direct", "bean", "class", "language");

	// Track all discovered service properties
	private final Map<ServiceReference<?>, Map<String, Object>> languageServices = new ConcurrentHashMap<>();
	private final Map<ServiceReference<?>, Map<String, Object>> componentServices = new ConcurrentHashMap<>();
	private final Map<ServiceReference<?>, Map<String, Object>> configurerServices = new ConcurrentHashMap<>();

	// Track what we've found
	private final Set<String> foundLanguages = new HashSet<>();
	private final Set<String> foundComponents = new HashSet<>();

	private volatile BundleContext bundleContext;
	private volatile ServiceRegistration<Condition> conditionRegistration;

	@Activate
	public void activate(BundleContext context) {
		LOG.info("Activating CamelCondition - starting service discovery");
		this.bundleContext = context;

		// Check if we're already ready (in case services came in before activation)
		checkReadiness();
	}

	@Deactivate
	public void deactivate() {
		LOG.info("Deactivating CamelCondition");

		if (conditionRegistration != null) {
			try {
				conditionRegistration.unregister();
			} catch (Exception e) {
				LOG.debug("Error unregistering condition service: {}", e.getMessage());
			}
			conditionRegistration = null;
		}

		// Clear tracking maps
		languageServices.clear();
		componentServices.clear();
		configurerServices.clear();
		foundLanguages.clear();
		foundComponents.clear();

		bundleContext = null;
	}

	// LanguageResolver bind/unbind callbacks
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, 
			policy = ReferencePolicy.DYNAMIC)
	public void bindLanguageResolvers(ServiceReference<LanguageResolver> ref) {

		Map<String, Object> props = getServiceProperties(ref);
		languageServices.put(ref, props);

		Object languages = props.get("language");
		if (languages != null) {
			if (languages instanceof String[]) {
				// Handle array property
				String[] langs = (String[]) languages;
				for (String lang : langs) {
					foundLanguages.add(lang.trim());
					LOG.debug("Found language: {}", lang.trim());
				}
			} else {
				// Handle string property (comma-separated)
				String[] langs = languages.toString().split(",\\s*");
				for (String lang : langs) {
					foundLanguages.add(lang.trim());
					LOG.debug("Found language: {}", lang.trim());
				}
			}
		}

		LOG.info("Bound LanguageResolver with languages: {} (total languages: {})", 
				languages, foundLanguages.size());
		checkReadiness();
	}

	public void unbindLanguageResolvers(ServiceReference<LanguageResolver> ref) {
		Map<String, Object> props = languageServices.remove(ref);
		if (props != null) {
			Object languages = props.get("language");
			if (languages != null) {
				if (languages instanceof String[]) {
					String[] langs = (String[]) languages;
					for (String lang : langs) {
						foundLanguages.remove(lang.trim());
					}
				} else {
					String[] langs = languages.toString().split(",\\s*");
					for (String lang : langs) {
						foundLanguages.remove(lang.trim());
					}
				}
			}
			LOG.debug("Unbound LanguageResolver with languages: {}", languages);
			checkReadiness();
		}
	}

	// ComponentResolver bind/unbind callbacks  
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, 
			policy = ReferencePolicy.DYNAMIC)
	public void bindComponentResolvers(ServiceReference<ComponentResolver> ref) {

		Map<String, Object> props = getServiceProperties(ref);
		componentServices.put(ref, props);

		Object components = props.get("component");
		if (components != null) {
			if (components instanceof String[]) {
				// Handle array property
				String[] comps = (String[]) components;
				for (String comp : comps) {
					foundComponents.add(comp.trim());
					LOG.debug("Found component: {}", comp.trim());
				}
			} else {
				// Handle string property (comma-separated)
				String[] comps = components.toString().split(",\\s*");
				for (String comp : comps) {
					foundComponents.add(comp.trim());
					LOG.debug("Found component: {}", comp.trim());
				}
			}
		}

		LOG.debug("Bound ComponentResolver with components: {}", components);
		checkReadiness();
	}

	public void unbindComponentResolvers(ServiceReference<ComponentResolver> ref) {
		Map<String, Object> props = componentServices.remove(ref);
		if (props != null) {
			Object components = props.get("component");
			if (components != null) {
				if (components instanceof String[]) {
					String[] comps = (String[]) components;
					for (String comp : comps) {
						foundComponents.remove(comp.trim());
					}
				} else {
					String[] comps = components.toString().split(",\\s*");
					for (String comp : comps) {
						foundComponents.remove(comp.trim());
					}
				}
			}
			LOG.debug("Unbound ComponentResolver with components: {}", components);
			checkReadiness();
		}
	}

	// ConfigurerResolver bind/unbind callbacks
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, 
			policy = ReferencePolicy.DYNAMIC)
	public void bindConfigurerResolvers(ServiceReference<ConfigurerResolver> ref) {

		Map<String, Object> props = getServiceProperties(ref);
		configurerServices.put(ref, props);

		LOG.debug("Bound ConfigurerResolver with configurers: {}", props.get("configurer"));
		checkReadiness();
	}

	public void unbindConfigurerResolvers(ServiceReference<ConfigurerResolver> ref) {
		configurerServices.remove(ref);
		LOG.debug("Unbound ConfigurerResolver");
		checkReadiness();
	}

	private Map<String, Object> getServiceProperties(ServiceReference<?> ref) {
		Map<String, Object> props = new ConcurrentHashMap<>();
		for (String key : ref.getPropertyKeys()) {
			props.put(key, ref.getProperty(key));
		}
		return props;
	}

	private synchronized void checkReadiness() {

		// Check if we have all required services
		boolean hasRequiredLanguages = foundLanguages.containsAll(REQUIRED_LANGUAGES);
		boolean hasRequiredComponents = foundComponents.containsAll(REQUIRED_COMPONENTS);
		boolean hasConfigurers = !configurerServices.isEmpty();

		boolean ready = hasRequiredLanguages && hasRequiredComponents && hasConfigurers;

		LOG.debug("Readiness check - Languages: {} (required: {}), Components: {} (required: {}), Configurers: {}, Ready: {}", 
				foundLanguages, REQUIRED_LANGUAGES, foundComponents, REQUIRED_COMPONENTS, configurerServices.size(), ready);

		// Update condition service if readiness changed
		String state = ready ? "ready" : "starting";
		if (ready) {
			LOG.info("Camel readiness changed to: {} - Found languages: {}, components: {}, configurers: {}", 
					state, foundLanguages, foundComponents, configurerServices.size());
		}
		// Build aggregated properties from all discovered services
		Dictionary<String, Object> props = new Hashtable<>();
		props.put(Condition.CONDITION_ID, "Camel");
		props.put("camel", state);

		// Add aggregated language properties
		if (!foundLanguages.isEmpty()) {
			props.put("languages", String.join(",", foundLanguages));
		}

		// Add aggregated component properties  
		if (!foundComponents.isEmpty()) {
			props.put("components", String.join(",", foundComponents));
		}

		// Add configurer count
		props.put("configurers", configurerServices.size());

		// Add detailed service counts for debugging
		props.put("service.counts", String.format("languages:%d,components:%d,configurers:%d", 
				languageServices.size(), componentServices.size(), configurerServices.size()));
		updateConditionService(props);
	}

	private synchronized void updateConditionService(Dictionary<String, Object> props) {
		if (isNull(conditionRegistration)) {
			if (nonNull(bundleContext)) {
				conditionRegistration = bundleContext.registerService(Condition.class, this, props);
				LOG.info("Registered Camel condition service with initial state='{}'", props.get("camel"));
			} else {
				LOG.debug("Not registered Camel condition service because context its not available yet");

			}
		} else {
			conditionRegistration.setProperties(props);
			LOG.debug("Updated Camel condition service properties with state='{}', languages=[{}], components=[{}]", 
					props.get("camel"), String.join(",", foundLanguages), String.join(",", foundComponents));
		}
	}
}

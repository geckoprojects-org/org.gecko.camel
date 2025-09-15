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
package org.eclipse.fennec.camel.whiteboard.impl;

import static java.util.Objects.nonNull;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.camel.CamelContext;
import org.apache.camel.karaf.core.OsgiDefaultCamelContext;
import org.eclipse.fennec.camel.whiteboard.CamelContextConfigurer;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.condition.Condition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Per-route configurable whiteboard instance that waits for Camel infrastructure readiness.
 * 
 * <p>This component represents a single pipeline/route configuration instance that:</p>
 * <ul>
 * <li><strong>Early Activation</strong>: Activates immediately when ConfigAdmin provides configuration</li>
 * <li><strong>Condition Dependency</strong>: Waits for CamelCondition (camel=ready) before creating CamelContext</li>
 * <li><strong>Per-Route Context</strong>: Creates dedicated OsgiDefaultCamelContext for this route</li>
 * <li><strong>Dynamic Lifecycle</strong>: Automatic start/stop based on condition availability</li>
 * </ul>
 * 
 * <p><strong>Architectural Flow:</strong></p>
 * <ol>
 * <li>ConfigAdmin factory configuration → PipelineWhiteboardInstance activation</li>
 * <li>Component waits for CamelCondition (camel=ready)</li>
 * <li>When condition ready → Creates OsgiDefaultCamelContext</li>
 * <li>Loads route definition and starts Camel context</li>
 * <li>Publishes readiness condition: pipeline.ready.{consumerId}</li>
 * </ol>
 * 
 * <p><strong>Factory Configuration Properties:</strong></p>
 * <ul>
 * <li><code>consumer.id</code> - Unique consumer identifier</li>
 * <li><code>consumer.name</code> - Human-readable consumer name</li>
 * <li><code>auto.start</code> - Whether to auto-start when ready</li>
 * <li><code>pipeline.id</code> - Reference to pipeline definition</li>
 * <li><code>param.*</code> - Parameter values for route configuration</li>
 * </ul>
 * 
 * @author Mark Hoffmann
 * @since 2025-09-12
 */
@Component(
    immediate = true,
    configurationPid = ConfigurationAgentImpl.FACTORY_PID,
    configurationPolicy = ConfigurationPolicy.REQUIRE,
    reference = {
    		@Reference(name = "camelReady", service = Condition.class, target = "(&(" + Condition.CONDITION_ID + "=Camel)(camel=ready))")
    }
)
public class PipelineWhiteboardInstance {

    private static final Logger LOG = LoggerFactory.getLogger(PipelineWhiteboardInstance.class);
    
    // Configuration properties
    private volatile String consumerId;
    private volatile boolean autoStart = true;
    private volatile String pipelineId;
    private volatile Map<String, Object> parameters = new ConcurrentHashMap<>();
    
    // Runtime state
    private volatile BundleContext bundleContext;
    private volatile CamelContext camelContext;
    private volatile ServiceRegistration<Condition> readinessCondition;
    
    @Reference
    private CamelContextConfigurer configurer;
    
    @Activate
    public void activate(BundleContext context, Map<String, Object> properties) {
        this.bundleContext = context;
        
        // Extract configuration from factory properties
        consumerId = (String) properties.get("consumer.id");
        autoStart = Boolean.parseBoolean(String.valueOf(properties.getOrDefault("auto.start", "true")));
        pipelineId = (String) properties.get("pipeline.id");
        
        // Extract parameter values (prefixed with "param.")
        parameters.clear();
        properties.entrySet().stream()
            .filter(entry -> entry.getKey().startsWith("param."))
            .forEach(entry -> {
                String paramName = entry.getKey().substring("param.".length());
                parameters.put(paramName, entry.getValue());
            });
        
        LOG.info("Activated PipelineWhiteboardInstance for consumer: {} (pipeline: {}) with {} parameters", 
                consumerId, pipelineId, parameters.size());
        
        // Start pipeline if auto-start enabled and Camel condition is ready
        if (autoStart) {
            startPipeline();
        }
    }
    
    @Modified
    public void modified(Map<String, Object> properties) {
        LOG.info("Modified PipelineWhiteboardInstance configuration for consumer: {}", consumerId);
        
        // Stop current pipeline
        stopPipeline();
        
        // Update configuration
        activate(bundleContext, properties);
    }
    
    @Deactivate 
    public void deactivate() {
        LOG.info("Deactivating PipelineWhiteboardInstance for consumer: {}", consumerId);
        
        stopPipeline();
        
        bundleContext = null;
        consumerId = null;
        pipelineId = null;
        parameters.clear();
    }
    
    /**
     * Called when Camel infrastructure condition becomes ready.
     * This triggers pipeline startup if auto-start is enabled.
     */
    public void camelConditionReady(Condition condition) {
        LOG.info("Camel infrastructure ready for consumer: {} - starting pipeline", consumerId);
        
        if (autoStart) {
            startPipeline();
        }
    }
    
    /**
     * Called when Camel infrastructure condition becomes unavailable.
     * This triggers pipeline shutdown.
     */
    public void camelConditionGone(Condition condition) {
        LOG.info("Camel infrastructure unavailable for consumer: {} - stopping pipeline", consumerId);
        
        stopPipeline();
    }
    
    /**
     * Starts the Camel pipeline with OsgiDefaultCamelContext.
     */
    private synchronized void startPipeline() {
        if (camelContext != null) {
            LOG.debug("Pipeline already started for consumer: {}", consumerId);
            return;
        }
        
        try {
            LOG.info("Starting Camel pipeline for consumer: {} (pipeline: {})", consumerId, pipelineId);
            
            // Create OSGi-aware Camel context
            camelContext = new OsgiDefaultCamelContext(bundleContext);
            
            // Apply parameter values as Camel properties
            Properties initialProp = new Properties();
            parameters.forEach((key, value) -> {
            	initialProp.put(key, value);
                LOG.debug("Set Camel property: {} = {}", key, value);
            });
            camelContext.getPropertiesComponent().setInitialProperties(initialProp);
            
            // TODO: Load and configure route definition from pipeline model
            // For now, create a simple test route
//            camelContext.addRouteDefinition(createTestRoute());
            
            // Start the Camel context
            camelContext.start();
            
            LOG.info("Successfully started Camel pipeline for consumer: {}", consumerId);
            
            // Publish pipeline readiness condition
            publishReadinessCondition();
            
        } catch (Exception e) {
            LOG.error("Failed to start Camel pipeline for consumer: {}", consumerId, e);
            stopPipeline();
        }
    }
    
    /**
     * Stops the Camel pipeline and cleans up resources.
     */
    private synchronized void stopPipeline() {
        // Unregister readiness condition
        if (readinessCondition != null) {
            try {
                readinessCondition.unregister();
                LOG.debug("Unregistered readiness condition for consumer: {}", consumerId);
            } catch (Exception e) {
                LOG.debug("Error unregistering readiness condition: {}", e.getMessage());
            }
            readinessCondition = null;
        }
        
        // Stop and cleanup Camel context
        if (camelContext != null) {
            try {
                LOG.info("Stopping Camel pipeline for consumer: {}", consumerId);
                camelContext.stop();
                LOG.debug("Successfully stopped Camel context for consumer: {}", consumerId);
            } catch (Exception e) {
                LOG.error("Error stopping Camel context for consumer: {}", consumerId, e);
            }
            camelContext = null;
        }
    }
    
    /**
     * Publishes an OSGi Condition service indicating this pipeline is ready.
     */
    private void publishReadinessCondition() {
        if (nonNull(bundleContext) && nonNull(consumerId)) {
            Dictionary<String, Object> props = new Hashtable<>();
            props.put(Condition.CONDITION_ID, "Pipeline");
            props.put("consumer.id", consumerId);
            props.put("pipeline.id", pipelineId != null ? pipelineId : "unknown");
            props.put("pipeline.ready", consumerId);
            
            readinessCondition = bundleContext.registerService(Condition.class, Condition.INSTANCE, props);
            
            LOG.info("Published readiness condition for consumer: {} (pipeline.ready={})", 
                    consumerId, consumerId);
        }
    }
    
}
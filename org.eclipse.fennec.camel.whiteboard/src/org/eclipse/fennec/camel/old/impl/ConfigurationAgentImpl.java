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

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.fennec.camel.old.ConfigurationAgent;
import org.eclipse.fennec.camel.old.ConfigurationManager;
import org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration;
import org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition;
import org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of ConfigurationAgent that creates OSGi configurations for pipeline instances.
 * 
 * <p>This implementation integrates with the existing ConfigurationManager to extract service
 * dependencies from pipeline definitions, then creates OSGi ConfigAdmin configurations that
 * will be processed by PipelineWhiteboardInstance components.
 */
@Component
public class ConfigurationAgentImpl implements ConfigurationAgent {
    
    private static final Logger logger = LoggerFactory.getLogger(ConfigurationAgentImpl.class);
    
    @Reference
    private ConfigurationAdmin configAdmin;
    
    @Reference
    private ConfigurationManager configurationManager;
    
    // Track managed configurations for cleanup
    private final Map<String, String> consumerIdToPid = new ConcurrentHashMap<>();
    
    @Activate
    public void activate() {
        logger.info("ConfigurationAgent activated");
    }
    
    @Deactivate
    public void deactivate() {
        logger.info("Deactivating ConfigurationAgent");
        
        // Clean up all managed configurations
        consumerIdToPid.values().forEach(pid -> {
            try {
                Configuration config = configAdmin.getConfiguration(pid);
                if (config != null) {
                    config.delete();
                    logger.debug("Deleted configuration: {}", pid);
                }
            } catch (IOException e) {
                logger.warn("Failed to delete configuration {}", pid, e);
            }
        });
        
        consumerIdToPid.clear();
        logger.info("ConfigurationAgent deactivated");
    }
    
    @Override
    public String processConsumerConfiguration(ConsumerConfiguration consumerConfig) throws IOException {
        Objects.requireNonNull(consumerConfig, "Consumer configuration cannot be null");
        Objects.requireNonNull(consumerConfig.getId(), "Consumer ID cannot be null");
        
        String consumerId = consumerConfig.getId();
        logger.info("Processing consumer configuration: {}", consumerId);
        
        // Get pipeline definition (inline or referenced)
        PipelineDefinition pipeline = getPipelineDefinition(consumerConfig);
        if (pipeline == null) {
            throw new IllegalArgumentException("No pipeline definition found for consumer: " + consumerId);
        }
        
        // Extract service dependencies using existing ConfigurationManager
        Set<ServiceDependency> dependencies = configurationManager.extractDependencies(pipeline);
        logger.debug("Extracted {} dependencies for consumer: {}", dependencies.size(), consumerId);
        
        // Create dependency filter strings
        String[] dependencyFilters = dependencies.stream()
            .map(this::createDependencyFilter)
            .toArray(String[]::new);
        
        // Create OSGi configuration properties
        Dictionary<String, Object> properties = new Hashtable<>();
        properties.put(ConfigKeys.PIPELINE_ID, consumerId);
        properties.put(ConfigKeys.PIPELINE_NAME, 
            consumerConfig.getName() != null ? consumerConfig.getName() : consumerId);
        properties.put(ConfigKeys.DEPENDENCY_FILTERS, dependencyFilters);
        properties.put(ConfigKeys.AUTO_START, consumerConfig.isAutoStart());
        properties.put(ConfigKeys.RESTART_POLICY, "automatic");
        
        // Add parameter values as individual properties with prefix
        if (consumerConfig.getParameterValues() != null) {
            for (ParameterValue paramValue : consumerConfig.getParameterValues()) {
                String key = "parameter." + paramValue.getParameterName();
                properties.put(key, paramValue.getValue());
            }
        }
        
        // Create factory configuration
        Configuration config = configAdmin.createFactoryConfiguration(
            PIPELINE_WHITEBOARD_FACTORY_PID, null);
        config.update(properties);
        
        String configPid = config.getPid();
        consumerIdToPid.put(consumerId, configPid);
        
        logger.info("Created configuration {} for consumer: {}", configPid, consumerId);
        return configPid;
    }
    
    @Override
    public void updateConsumerConfiguration(String configurationPid, ConsumerConfiguration consumerConfig) throws IOException {
        Objects.requireNonNull(configurationPid, "Configuration PID cannot be null");
        Objects.requireNonNull(consumerConfig, "Consumer configuration cannot be null");
        
        logger.info("Updating configuration: {}", configurationPid);
        
        Configuration config = configAdmin.getConfiguration(configurationPid);
        if (config == null) {
            throw new IllegalArgumentException("Configuration not found: " + configurationPid);
        }
        
        // Process the updated configuration (reuse the same logic)
        removeConsumerConfiguration(configurationPid);
        processConsumerConfiguration(consumerConfig);
    }
    
    @Override
    public void removeConsumerConfiguration(String configurationPid) throws IOException {
        Objects.requireNonNull(configurationPid, "Configuration PID cannot be null");
        
        logger.info("Removing configuration: {}", configurationPid);
        
        Configuration config = configAdmin.getConfiguration(configurationPid);
        if (config != null) {
            config.delete();
            
            // Remove from tracking
            consumerIdToPid.values().remove(configurationPid);
            
            logger.info("Removed configuration: {}", configurationPid);
        } else {
            logger.warn("Configuration not found for removal: {}", configurationPid);
        }
    }
    
    @Override
    public Set<String> getManagedConfigurations() {
        return Set.copyOf(consumerIdToPid.values());
    }
    
    @Override
    public String createDependencyFilter(ServiceDependency dependency) {
        Objects.requireNonNull(dependency, "Service dependency cannot be null");
        Objects.requireNonNull(dependency.getServiceInterface(), "Service interface cannot be null");
        
        String serviceInterface = dependency.getServiceInterface();
        String customFilter = dependency.getFilter();
        
        StringBuilder filterBuilder = new StringBuilder();
        filterBuilder.append("(&(objectClass=").append(serviceInterface).append(")");
        
        // Add custom filter if present
        if (customFilter != null && !customFilter.trim().isEmpty()) {
            String trimmedFilter = customFilter.trim();
            // Ensure the custom filter is properly wrapped if needed
            if (!trimmedFilter.startsWith("(")) {
                filterBuilder.append("(").append(trimmedFilter).append(")");
            } else {
                filterBuilder.append(trimmedFilter);
            }
        }
        
        filterBuilder.append(")");
        
        String filter = filterBuilder.toString();
        logger.debug("Created dependency filter for {}: {}", serviceInterface, filter);
        
        return filter;
    }
    
    /**
     * Gets the pipeline definition from consumer configuration.
     * Handles both inline pipelines and pipeline references.
     */
    private PipelineDefinition getPipelineDefinition(ConsumerConfiguration consumerConfig) {
        // First check for inline pipeline
        if (consumerConfig.getInlinePipeline() != null) {
            return consumerConfig.getInlinePipeline();
        }
        
        // Then check for pipeline reference
        if (consumerConfig.getPipeline() != null) {
            return consumerConfig.getPipeline();
        }
        
        return null;
    }
}
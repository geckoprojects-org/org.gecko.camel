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

import static java.util.Objects.requireNonNull;

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.fennec.camel.whiteboard.ConfigurationAgent;
import org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration;
import org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of ConfigurationAgent that processes EMF consumer configurations
 * and creates OSGi factory configurations for PipelineWhiteboardInstance components.
 * 
 * <p>This component converts {@link ConsumerConfiguration} EMF models into OSGi 
 * ConfigAdmin factory configurations. Each consumer configuration creates a separate
 * PipelineWhiteboardInstance component instance via the factory pattern.</p>
 * 
 * <p><strong>OSGi Factory Pattern Flow:</strong></p>
 * <ol>
 * <li>EMF ConsumerConfiguration → ConfigurationAgentImpl</li>
 * <li>ConfigurationAgentImpl → OSGi ConfigAdmin factory configuration</li>
 * <li>OSGi ConfigAdmin → PipelineWhiteboardInstance component (via Felix SCR)</li>
 * <li>PipelineWhiteboardInstance → ServiceTrackers + CamelContext creation</li>
 * </ol>
 * 
 * @author Mark Hoffmann
 * @since 2025-09-12
 */
@Component
public class ConfigurationAgentImpl implements ConfigurationAgent {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationAgentImpl.class);
    
    public static final String FACTORY_PID = "org.eclipse.fennec.camel.whiteboard.PipelineWhiteboardInstance";
    
    @Reference
    private ConfigurationAdmin configAdmin;

    @Override
    public void processConsumerConfiguration(ConsumerConfiguration configuration) {
        requireNonNull(configuration, "Consumer configuration cannot be null");
        requireNonNull(configuration.getId(), "Consumer configuration ID cannot be null");
        
        LOG.info("Processing consumer configuration: {}", configuration.getId());
        
        try {
            // Create factory configuration properties from EMF model
            Dictionary<String, Object> props = new Hashtable<>();
            
            // Basic configuration properties
            props.put("consumer.id", configuration.getId());
            if (configuration.getName() != null) {
                props.put("consumer.name", configuration.getName());
            }
            props.put("auto.start", configuration.isAutoStart());
            
            // Pipeline reference
            if (configuration.getPipeline() != null) {
                props.put("pipeline.id", configuration.getPipeline().getId());
                props.put("pipeline.name", configuration.getPipeline().getName());
                props.put("pipeline.version", configuration.getPipeline().getVersion());
            }
            
            // Add parameter values as properties
            for (ParameterValue paramValue : configuration.getParameterValues()) {
                String key = "param." + paramValue.getParameterName();
                props.put(key, paramValue.getValue());
                LOG.debug("Added parameter: {} = {}", key, paramValue.getValue());
            }
            
            // Create factory configuration
            Configuration factoryConfig = configAdmin.getFactoryConfiguration(FACTORY_PID, 
                    configuration.getId());
            factoryConfig.updateIfDifferent(props);
            
            LOG.info("Created factory configuration for consumer: {} with {} parameters", 
                    configuration.getId(), configuration.getParameterValues().size());
                    
        } catch (IOException e) {
            LOG.error("Failed to create factory configuration for consumer: {}", 
                    configuration.getId(), e);
            throw new IllegalStateException("Failed to create factory configuration", e);
        }
    }

    @Override
    public void removeConsumerConfiguration(String configurationId) {
        requireNonNull(configurationId, "Configuration ID cannot be null");
        
        LOG.info("Removing consumer configuration: {}", configurationId);
        
        try {
            Configuration factoryConfig = configAdmin.getFactoryConfiguration(FACTORY_PID, 
                    configurationId);
            factoryConfig.delete();
            
            LOG.info("Deleted factory configuration for consumer: {}", configurationId);
            
        } catch (IOException e) {
            LOG.error("Failed to delete factory configuration for consumer: {}", 
                    configurationId, e);
            throw new IllegalStateException("Failed to delete factory configuration", e);
        }
    }
}
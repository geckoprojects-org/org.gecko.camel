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
package org.eclipse.fennec.camel.old;

import java.io.IOException;
import java.util.Set;

import org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration;
import org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency;
import org.osgi.annotation.versioning.ProviderType;

/**
 * Configuration Agent responsible for creating OSGi configurations for pipeline whiteboard instances.
 * 
 * <p>This agent processes pipeline consumer configurations and creates corresponding OSGi ConfigAdmin
 * configurations that will trigger the instantiation of PipelineWhiteboardInstance components. Each
 * consumer configuration results in one whiteboard instance with appropriate dependency filters.
 * 
 * <p>Key responsibilities:
 * <ul>
 * <li>Process ConsumerConfiguration from EMF models</li>
 * <li>Extract service dependencies using existing ConfigurationManager</li>
 * <li>Create OSGi ConfigAdmin factory configurations</li>
 * <li>Convert ServiceDependency models to LDAP filter strings</li>
 * <li>Handle configuration updates and removals</li>
 * </ul>
 */
@ProviderType
public interface ConfigurationAgent {
    
    /**
     * Factory PID for pipeline whiteboard instances.
     */
    String PIPELINE_WHITEBOARD_FACTORY_PID = "CamelPipelineInstance";
    
    /**
     * Configuration property keys.
     */
    interface ConfigKeys {
        String PIPELINE_ID = "pipeline.id";
        String PIPELINE_NAME = "pipeline.name"; 
        String DEPENDENCY_FILTERS = "dependency.filters";
        String AUTO_START = "auto.start";
        String RESTART_POLICY = "restart.policy";
    }
    
    /**
     * Processes a consumer configuration and creates corresponding OSGi configuration.
     * 
     * <p>This method analyzes the consumer configuration, extracts dependencies from
     * the pipeline definition, and creates a factory configuration that will instantiate
     * a PipelineWhiteboardInstance when activated by SCR.
     * 
     * @param consumerConfig the consumer configuration to process
     * @return the PID of the created configuration
     * @throws IOException if configuration creation fails
     * @throws IllegalArgumentException if consumerConfig is null
     */
    String processConsumerConfiguration(ConsumerConfiguration consumerConfig) throws IOException;
    
    /**
     * Updates an existing pipeline configuration.
     * 
     * @param configurationPid the PID of the configuration to update
     * @param consumerConfig the updated consumer configuration
     * @throws IOException if configuration update fails
     * @throws IllegalArgumentException if parameters are null
     */
    void updateConsumerConfiguration(String configurationPid, ConsumerConfiguration consumerConfig) throws IOException;
    
    /**
     * Removes a pipeline configuration.
     * 
     * <p>This will stop the corresponding PipelineWhiteboardInstance and clean up
     * all associated resources.
     * 
     * @param configurationPid the PID of the configuration to remove
     * @throws IOException if configuration removal fails
     * @throws IllegalArgumentException if configurationPid is null
     */
    void removeConsumerConfiguration(String configurationPid) throws IOException;
    
    /**
     * Gets all currently managed configuration PIDs.
     * 
     * @return set of configuration PIDs managed by this agent
     */
    Set<String> getManagedConfigurations();
    
    /**
     * Creates an LDAP filter string from a ServiceDependency.
     * 
     * <p>This method converts the structured ServiceDependency model into an
     * LDAP filter that can be used by OSGi ServiceTracker for service discovery.
     * 
     * @param dependency the service dependency to convert
     * @return LDAP filter string for the dependency
     * @throws IllegalArgumentException if dependency is null or invalid
     */
    String createDependencyFilter(ServiceDependency dependency);
}
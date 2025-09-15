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
package org.eclipse.fennec.camel.whiteboard;

import org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration;

/**
 * Interface for processing EMF consumer configurations and creating OSGi factory configurations.
 * 
 * <p>The ConfigurationAgent processes {@link ConsumerConfiguration} EMF models and converts
 * them into OSGi ConfigAdmin factory configurations that instantiate 
 * {@link org.eclipse.fennec.camel.whiteboard.impl.PipelineWhiteboardInstance} components.</p>
 * 
 * <p>Each consumer configuration results in a separate factory configuration with the
 * factory PID: {@code org.eclipse.fennec.camel.whiteboard.PipelineWhiteboardInstance}</p>
 * 
 * @author Mark Hoffmann
 * @since 2025-09-12
 */
public interface ConfigurationAgent {

    /**
     * Processes a consumer configuration and creates the corresponding OSGi factory configuration.
     * 
     * @param configuration the EMF consumer configuration to process
     * @throws IllegalArgumentException if the configuration is invalid
     * @throws IllegalStateException if ConfigAdmin is not available
     */
    void processConsumerConfiguration(ConsumerConfiguration configuration);

    /**
     * Removes the factory configuration for the given consumer configuration ID.
     * 
     * @param configurationId the ID of the consumer configuration to remove
     */
    void removeConsumerConfiguration(String configurationId);
}
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

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Interface for pipeline instances to report their state changes to the monitoring service.
 * 
 * <p>This interface is used internally by {@code PipelineWhiteboardInstance} components
 * to report state transitions and dependency information. It's separate from the 
 * {@link PipelineMonitoringService} which is used by external consumers to track states.
 * 
 * <p>All methods in this interface must be thread-safe as they will be called
 * concurrently by multiple pipeline instances.
 */
@ProviderType
public interface PipelineStateReporter {
    
    /**
     * Report a pipeline state change.
     * This method is thread-safe and can be called concurrently.
     * 
     * @param pipelineId the pipeline identifier
     * @param newState the new state of the pipeline
     */
    void updatePipelineState(String pipelineId, PipelineMonitoringService.PipelineState newState);
    
    /**
     * Update missing dependencies for a pipeline.
     * This method is thread-safe and can be called concurrently.
     * 
     * @param pipelineId the pipeline identifier
     * @param missingDependencies list of missing dependency descriptions
     */
    void updateMissingDependencies(String pipelineId, List<String> missingDependencies);
    
    /**
     * Update resolved dependencies for a pipeline.
     * This method is thread-safe and can be called concurrently.
     * 
     * @param pipelineId the pipeline identifier
     * @param resolvedDependencies list of resolved dependency descriptions
     */
    void updateResolvedDependencies(String pipelineId, List<String> resolvedDependencies);
    
    /**
     * Report an error for a pipeline.
     * This method is thread-safe and can be called concurrently.
     * 
     * @param pipelineId the pipeline identifier
     * @param errorMessage the error message
     */
    void updateError(String pipelineId, String errorMessage);
    
    /**
     * Remove a pipeline from monitoring (when deactivated).
     * This method is thread-safe and can be called concurrently.
     * 
     * @param pipelineId the pipeline identifier to remove
     */
    void removePipeline(String pipelineId);
}
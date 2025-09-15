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

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.util.promise.Promise;

/**
 * Monitoring and control service for pipeline lifecycle management.
 * 
 * <p>This service provides real-time monitoring of pipeline states and allows
 * external control of pipeline lifecycle operations. It replaces crude Thread.sleep()
 * patterns with proper event-based synchronization using OSGi Promises.
 * 
 * <p>Key capabilities:
 * <ul>
 * <li>Real-time pipeline state tracking</li>
 * <li>Promise-based waiting for state changes</li>
 * <li>Pipeline lifecycle control (start/stop/cancel)</li>
 * <li>Service dependency monitoring</li>
 * <li>Proper synchronization for testing and management</li>
 * </ul>
 */
@ProviderType
public interface PipelineMonitoringService {
    
    /**
     * Pipeline lifecycle states.
     */
    enum PipelineState {
        /** Pipeline configuration received, but dependencies not resolved */
        CONFIGURED,
        /** All dependencies available, but pipeline not started */
        DEPENDENCIES_RESOLVED,
        /** Pipeline starting (Camel context creation in progress) */
        STARTING,
        /** Pipeline fully active and running */
        ACTIVE,
        /** Pipeline stopping */
        STOPPING,
        /** Pipeline stopped (dependencies still available) */
        STOPPED,
        /** Pipeline failed due to error */
        FAILED,
        /** Pipeline deactivated (dependencies unavailable) */
        DEACTIVATED
    }
    
    /**
     * Get current state of a pipeline.
     * 
     * @param pipelineId the pipeline identifier
     * @return current pipeline state, or null if pipeline not found
     */
    PipelineState getPipelineState(String pipelineId);
    
    /**
     * Get all monitored pipeline IDs.
     * 
     * @return list of pipeline IDs currently being monitored
     */
    List<String> getMonitoredPipelines();
    
    /**
     * Wait for a pipeline to reach a specific state.
     * 
     * @param pipelineId the pipeline identifier
     * @param expectedState the state to wait for
     * @param timeout maximum wait time
     * @param unit time unit for timeout
     * @return Promise that resolves to true when state is reached, false on timeout
     */
    Promise<Boolean> waitForState(String pipelineId, PipelineState expectedState, 
                                long timeout, TimeUnit unit);
    
    /**
     * Wait for a pipeline to become active and ready.
     * 
     * @param pipelineId the pipeline identifier
     * @param timeout maximum wait time
     * @param unit time unit for timeout
     * @return Promise that resolves to true when pipeline is active
     */
    Promise<Boolean> waitForPipelineReady(String pipelineId, long timeout, TimeUnit unit);
    
    /**
     * Start a pipeline manually (if it's configured for manual start).
     * 
     * @param pipelineId the pipeline identifier
     * @return Promise that resolves when start operation finishes
     */
    Promise<Boolean> startPipeline(String pipelineId);
    
    /**
     * Stop a pipeline gracefully.
     * 
     * @param pipelineId the pipeline identifier
     * @return Promise that resolves when stop operation finishes
     */
    Promise<Boolean> stopPipeline(String pipelineId);
    
    /**
     * Cancel a pipeline operation (force stop).
     * 
     * @param pipelineId the pipeline identifier
     * @return Promise that resolves when cancel operation finishes
     */
    Promise<Boolean> cancelPipeline(String pipelineId);
    
    /**
     * Get detailed information about missing dependencies for a pipeline.
     * 
     * @param pipelineId the pipeline identifier
     * @return list of missing dependency descriptions
     */
    List<String> getMissingDependencies(String pipelineId);
    
    /**
     * Get detailed information about resolved dependencies for a pipeline.
     * 
     * @param pipelineId the pipeline identifier
     * @return list of resolved dependency descriptions
     */
    List<String> getResolvedDependencies(String pipelineId);
    
    /**
     * Get last error message for a pipeline (if in FAILED state).
     * 
     * @param pipelineId the pipeline identifier
     * @return error message or null if no error
     */
    String getLastError(String pipelineId);
}
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
import org.osgi.util.promise.Promise;

/**
 * Pipeline Instance service interface that represents a single active pipeline.
 * 
 * <p>Each PipelineWhiteboardInstance registers itself as a PipelineInstance service
 * with pipelineId property, allowing tests and monitoring tools to track individual
 * pipelines directly through OSGi service registry instead of centralized monitoring.
 * 
 * <p>This interface provides event-driven state change notifications through listeners
 * and exposes current pipeline state and dependency information for monitoring purposes.
 * 
 * <p>Service properties when registered:
 * <ul>
 * <li>pipelineId: The unique identifier for this pipeline</li>
 * <li>pipelineName: The human-readable name of the pipeline</li>
 * <li>autoStart: Whether this pipeline starts automatically</li>
 * </ul>
 */
@ProviderType
public interface PipelineInstance {
    
    /**
     * Pipeline state enumeration.
     */
    enum PipelineState {
        /** Pipeline configuration received and validated */
        CONFIGURED,
        /** Waiting for service dependencies to be resolved */
        WAITING_FOR_DEPENDENCIES,
        /** All dependencies resolved, ready to start */
        DEPENDENCIES_RESOLVED,
        /** Camel context is starting */
        STARTING,
        /** Pipeline is active and running */
        ACTIVE,
        /** Pipeline stopped due to missing dependencies */
        STOPPED,
        /** Error occurred during pipeline lifecycle */
        ERROR,
        /** Pipeline is being deactivated */
        DEACTIVATED
    }
    
    /**
     * State change listener interface for event-driven monitoring.
     */
    @FunctionalInterface
    interface StateChangeListener {
        /**
         * Called when pipeline state changes.
         * 
         * @param pipelineId the pipeline identifier
         * @param oldState the previous state
         * @param newState the new state
         * @param error optional error message if state is ERROR
         */
        void onStateChanged(String pipelineId, PipelineState oldState, PipelineState newState, String error);
    }
    
    /**
     * Gets the unique pipeline identifier.
     * 
     * @return the pipeline ID
     */
    String getPipelineId();
    
    /**
     * Gets the human-readable pipeline name.
     * 
     * @return the pipeline name
     */
    String getPipelineName();
    
    /**
     * Gets the current pipeline state.
     * 
     * @return current pipeline state
     */
    PipelineState getCurrentState();
    
    /**
     * Gets the list of missing service dependencies.
     * 
     * @return list of missing dependency filter strings, empty if none
     */
    List<String> getMissingDependencies();
    
    /**
     * Gets the list of resolved service dependencies.
     * 
     * @return list of resolved dependency descriptions, empty if none
     */
    List<String> getResolvedDependencies();
    
    /**
     * Gets the last error message if pipeline is in ERROR state.
     * 
     * @return error message or null if no error
     */
    String getLastError();
    
    /**
     * Adds a state change listener for event-driven monitoring.
     * 
     * <p>Listeners are called synchronously when state changes occur.
     * Multiple listeners can be registered and will be called in registration order.
     * 
     * @param listener the state change listener to add
     * @throws IllegalArgumentException if listener is null
     */
    void addStateChangeListener(StateChangeListener listener);
    
    /**
     * Removes a previously registered state change listener.
     * 
     * @param listener the state change listener to remove
     * @return true if listener was removed, false if not found
     */
    boolean removeStateChangeListener(StateChangeListener listener);
    
    /**
     * Checks if the pipeline is currently active and running.
     * 
     * @return true if pipeline state is ACTIVE
     */
    default boolean isActive() {
        return getCurrentState() == PipelineState.ACTIVE;
    }
    
    /**
     * Checks if the pipeline has all dependencies resolved.
     * 
     * @return true if no missing dependencies
     */
    default boolean hasAllDependencies() {
        return getMissingDependencies().isEmpty();
    }
    
    /**
     * Returns a Promise that resolves when the pipeline becomes active.
     * 
     * <p>This allows consumers to wait asynchronously for pipeline readiness
     * without blocking activation. The Promise will:
     * <ul>
     * <li>Resolve to {@code true} when pipeline reaches ACTIVE state</li>
     * <li>Resolve to {@code false} if pipeline transitions to ERROR state</li>
     * <li>Be rejected if pipeline is deactivated before becoming active</li>
     * </ul>
     * 
     * <p>The Promise includes timeout and failure handling, making it suitable
     * for integration tests and service consumers.
     * 
     * @return Promise that resolves when pipeline is ready or fails
     */
    Promise<Boolean> getReadinessPromise();
}
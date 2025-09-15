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

import java.util.Map;
import java.util.Set;

import org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency;
import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.ServiceReference;
import org.osgi.util.promise.Promise;

/**
 * Service interface for centralized tracking of OSGi service dependencies.
 * 
 * <p>The Dependency Tracker provides centralized, Promise-based dependency resolution 
 * for Camel pipelines. It maintains a cache of dependency Promises keyed by service 
 * interface and filter, ensuring that identical dependencies are resolved only once 
 * and shared across multiple pipelines.
 * 
 * <p>Key responsibilities:
 * <ul>
 * <li>Centralized dependency Promise caching (one Promise per unique dependency)</li>
 * <li>Promise-based pipeline readiness tracking using Promises.all()</li>
 * <li>Dynamic service lifecycle handling with Promise state updates</li>
 * <li>Efficient resource usage through shared dependency resolution</li>
 * <li>OSGi condition service publishing for ready pipelines</li>
 * </ul>
 */
@ProviderType
public interface DependencyTracker {

    /**
     * Gets or creates a cached Promise for a service dependency.
     * 
     * <p>This method implements centralized dependency resolution. If a Promise for 
     * the same service interface and filter already exists, it returns the cached 
     * Promise. Otherwise, it creates a new Promise backed by a ServiceTracker.
     * 
     * @param dependency the service dependency to track
     * @return Promise that resolves when the service becomes available
     * @throws IllegalArgumentException if dependency is null
     */
    Promise<ServiceReference<?>> getDependencyPromise(ServiceDependency dependency);

    /**
     * Tracks pipeline dependencies using centralized Promise resolution.
     * 
     * <p>This method creates a composite Promise using Promises.all() that resolves 
     * only when all pipeline dependencies are satisfied. It reuses cached dependency 
     * Promises for efficient resource utilization.
     * 
     * @param pipelineId unique identifier for the pipeline
     * @param dependencies the set of service dependencies to track
     * @return Promise that resolves with a map of dependency name to ServiceReference
     * @throws IllegalArgumentException if pipelineId or dependencies are null
     */
    Promise<Map<String, ServiceReference<?>>> trackPipelineDependencies(
        String pipelineId, Set<ServiceDependency> dependencies);

    /**
     * Stops tracking dependencies for a pipeline.
     * 
     * <p>This removes the pipeline from tracking but does NOT stop the underlying 
     * dependency Promises, as they may be shared with other pipelines. The cached 
     * dependency Promises remain active for reuse.
     * 
     * @param pipelineId the ID of the pipeline to stop tracking
     * @return true if tracking was stopped, false if pipeline was not being tracked
     * @throws IllegalArgumentException if pipelineId is null or empty
     */
    boolean stopTrackingPipeline(String pipelineId);

    /**
     * Checks if a pipeline's dependencies Promise is resolved.
     * 
     * @param pipelineId the ID of the pipeline to check
     * @return true if pipeline dependencies Promise is resolved, false otherwise
     * @throws IllegalArgumentException if pipelineId is null or empty
     * @throws InterruptedException if interrupted while checking Promise state
     */
    boolean isPipelineReady(String pipelineId) throws InterruptedException;

    /**
     * Gets the pipeline dependencies Promise for a tracked pipeline.
     * 
     * @param pipelineId the ID of the pipeline
     * @return Promise for pipeline dependencies, or null if not tracked
     * @throws IllegalArgumentException if pipelineId is null or empty
     */
    Promise<Map<String, ServiceReference<?>>> getPipelinePromise(String pipelineId);

    /**
     * Gets all pipeline IDs currently being tracked.
     * 
     * @return set of pipeline IDs being tracked
     */
    Set<String> getTrackedPipelineIds();

    /**
     * Gets statistics about cached dependency Promises.
     * 
     * @return information about cached dependencies and their states
     */
    DependencyCacheStats getCacheStats();

    /**
     * Forces cleanup of resolved/failed dependency Promises that are no longer referenced.
     * 
     * <p>This can help free memory by removing cached Promises that are no longer 
     * being used by any pipeline.
     */
    void cleanupUnusedDependencies();

    /**
     * Statistics about cached dependency Promises.
     */
    interface DependencyCacheStats {
        /**
         * Gets the total number of cached dependency Promises.
         */
        int getTotalCachedDependencies();
        
        /**
         * Gets the number of resolved dependency Promises.
         */
        int getResolvedDependencies();
        
        /**
         * Gets the number of pending dependency Promises.
         */
        int getPendingDependencies();
        
        /**
         * Gets the number of failed dependency Promises.
         */
        int getFailedDependencies();
        
        /**
         * Gets the cache hit ratio (reused vs newly created).
         */
        double getCacheHitRatio();
        
        /**
         * Gets a set of all cached dependency keys (service interface + filter).
         */
        Set<String> getCachedDependencyKeys();
        
        /**
         * Gets human-readable cache statistics.
         */
        String getStatsSummary();
    }
}
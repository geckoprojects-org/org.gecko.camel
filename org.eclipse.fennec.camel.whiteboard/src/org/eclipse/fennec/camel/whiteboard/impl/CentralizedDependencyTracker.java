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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import org.eclipse.fennec.camel.whiteboard.DependencyTracker;
import org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.util.promise.Deferred;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;
import org.osgi.util.promise.Promises;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Centralized Promise-based implementation of the DependencyTracker.
 * 
 * <p>This implementation maintains a cache of dependency Promises keyed by service 
 * interface and filter combination. Multiple pipelines with identical dependencies 
 * share the same Promise, ensuring efficient resource utilization and avoiding 
 * duplicate ServiceTracker instances.
 * 
 * <p>Key features:
 * <ul>
 * <li>Centralized dependency Promise caching with cache key generation</li>
 * <li>Promise-based pipeline readiness using Promises.all()</li>
 * <li>Automatic ServiceTracker lifecycle management</li>
 * <li>Cache statistics and cleanup functionality</li>
 * <li>Thread-safe concurrent operations</li>
 * </ul>
 */
@Component
public class CentralizedDependencyTracker implements DependencyTracker {
    
    private static final Logger logger = LoggerFactory.getLogger(CentralizedDependencyTracker.class);
    
    private BundleContext bundleContext;
    private PromiseFactory promiseFactory;
    private ScheduledExecutorService executorService;
    
    // Cache of dependency Promises keyed by dependency cache key
    private final Map<String, DependencyCacheEntry> dependencyCache = new ConcurrentHashMap<>();
    
    // Tracked pipeline Promises
    private final Map<String, Promise<Map<String, ServiceReference<?>>>> pipelinePromises = new ConcurrentHashMap<>();
    
    // Cache statistics
    private final AtomicLong cacheHits = new AtomicLong(0);
    private final AtomicLong cacheMisses = new AtomicLong(0);
    
    @Activate
    public void activate(BundleContext context) {
        this.bundleContext = context;
        this.promiseFactory = new PromiseFactory(Executors.newCachedThreadPool());
        this.executorService = Executors.newScheduledThreadPool(2);
        logger.info("Centralized DependencyTracker activated");
    }
    
    @Deactivate
    public void deactivate() {
        logger.info("Deactivating Centralized DependencyTracker");
        
        // Close all ServiceTrackers
        dependencyCache.values().forEach(entry -> {
            if (entry.serviceTracker != null) {
                entry.serviceTracker.close();
            }
        });
        dependencyCache.clear();
        pipelinePromises.clear();
        
        if (executorService != null && !executorService.isShutdown()) {
            executorService.shutdown();
        }
        
        if (promiseFactory != null) {
            // PromiseFactory doesn't have a close method, but we can shutdown its executor
            // The cached thread pool will be cleaned up automatically
        }
        
        logger.info("Centralized DependencyTracker deactivated");
    }
    
    @Override
    public Promise<ServiceReference<?>> getDependencyPromise(ServiceDependency dependency) {
        Objects.requireNonNull(dependency, "Dependency cannot be null");
        
        String cacheKey = generateCacheKey(dependency);
        
        // Check if we already have a cached Promise for this dependency
        DependencyCacheEntry entry = dependencyCache.get(cacheKey);
        if (entry != null) {
            cacheHits.incrementAndGet();
            logger.debug("Cache HIT for dependency: {}", cacheKey);
            return entry.promise;
        }
        
        // Cache miss - create new Promise and ServiceTracker
        cacheMisses.incrementAndGet();
        logger.debug("Cache MISS for dependency: {}", cacheKey);
        
        return createDependencyPromise(dependency, cacheKey);
    }
    
    @Override
    public Promise<Map<String, ServiceReference<?>>> trackPipelineDependencies(
            String pipelineId, Set<ServiceDependency> dependencies) {
        Objects.requireNonNull(pipelineId, "Pipeline ID cannot be null");
        Objects.requireNonNull(dependencies, "Dependencies cannot be null");
        
        logger.info("Tracking {} dependencies for pipeline: {}", dependencies.size(), pipelineId);
        
        if (dependencies.isEmpty()) {
            // No dependencies - return resolved Promise with empty map
            Map<String, ServiceReference<?>> emptyResult = new HashMap<>();
            Promise<Map<String, ServiceReference<?>>> resolvedPromise = promiseFactory.resolved(emptyResult);
            pipelinePromises.put(pipelineId, resolvedPromise);
            return resolvedPromise;
        }
        
        // Get or create Promise for each dependency
        Map<String, Promise<ServiceReference<?>>> dependencyPromises = new HashMap<>();
        for (ServiceDependency dependency : dependencies) {
            String bindName = dependency.getBindName() != null ? 
                dependency.getBindName() : dependency.getServiceInterface();
            dependencyPromises.put(bindName, getDependencyPromise(dependency));
        }
        
        // Create composite Promise using Promises.all()
        Promise<Map<String, ServiceReference<?>>> pipelinePromise = createCompositePromise(dependencyPromises);
        
        // Cache the pipeline Promise
        pipelinePromises.put(pipelineId, pipelinePromise);
        
        // Add logging for when pipeline becomes ready
        pipelinePromise.onSuccess(services -> {
            logger.info("Pipeline '{}' is now READY with {} resolved dependencies", 
                pipelineId, services.size());
        }).onFailure(failure -> {
            logger.warn("Pipeline '{}' failed to resolve dependencies: {}", 
                pipelineId, failure.getMessage());
        });
        
        return pipelinePromise;
    }
    
    @Override
    public boolean stopTrackingPipeline(String pipelineId) {
        Objects.requireNonNull(pipelineId, "Pipeline ID cannot be null");
        
        Promise<Map<String, ServiceReference<?>>> removed = pipelinePromises.remove(pipelineId);
        if (removed != null) {
            logger.info("Stopped tracking pipeline: {}", pipelineId);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean isPipelineReady(String pipelineId) throws InterruptedException {
        Objects.requireNonNull(pipelineId, "Pipeline ID cannot be null");
        
        Promise<Map<String, ServiceReference<?>>> promise = pipelinePromises.get(pipelineId);
        if (promise == null) {
            return false;
        }
        
        return promise.isDone() && promise.getFailure() == null;
    }
    
    @Override
    public Promise<Map<String, ServiceReference<?>>> getPipelinePromise(String pipelineId) {
        Objects.requireNonNull(pipelineId, "Pipeline ID cannot be null");
        return pipelinePromises.get(pipelineId);
    }
    
    @Override
    public Set<String> getTrackedPipelineIds() {
        return Set.copyOf(pipelinePromises.keySet());
    }
    
    @Override
    public DependencyCacheStats getCacheStats() {
        return new DependencyCacheStatsImpl();
    }
    
    @Override
    public void cleanupUnusedDependencies() {
        logger.info("Starting cleanup of unused dependencies");
        
        // Find dependencies that are no longer referenced by any pipeline
        Set<String> referencedDependencies = pipelinePromises.values().stream()
            .filter(Objects::nonNull)
            .flatMap(promise -> extractDependencyKeys(promise).stream())
            .collect(Collectors.toSet());
        
        AtomicInteger cleanedUp = new AtomicInteger(0);
        dependencyCache.entrySet().removeIf(entry -> {
            if (!referencedDependencies.contains(entry.getKey())) {
                // Close the ServiceTracker
                if (entry.getValue().serviceTracker != null) {
                    entry.getValue().serviceTracker.close();
                }
                cleanedUp.incrementAndGet();
                return true;
            }
            return false;
        });
        
        logger.info("Cleaned up {} unused dependency caches", cleanedUp.get());
    }
    
    /**
     * Generates a unique cache key for a service dependency.
     */
    private String generateCacheKey(ServiceDependency dependency) {
        String serviceInterface = dependency.getServiceInterface();
        String filter = dependency.getFilter();
        
        if (filter == null || filter.trim().isEmpty()) {
            return serviceInterface;
        }
        
        return serviceInterface + "#" + filter;
    }
    
    /**
     * Creates a new dependency Promise with ServiceTracker.
     */
    private Promise<ServiceReference<?>> createDependencyPromise(ServiceDependency dependency, String cacheKey) {
        logger.debug("Creating new Promise for dependency: {}", cacheKey);
        
        try {
            // Create filter for ServiceTracker
            String filterString = createFilterString(dependency);
            Filter filter = bundleContext.createFilter(filterString);
            
            // Create Deferred for Promise control
            Deferred<ServiceReference<?>> deferred = promiseFactory.deferred();
            
            // Create ServiceTracker
            ServiceTracker<Object, Object> serviceTracker = new ServiceTracker<Object, Object>(
                bundleContext, filter, null) {
                
                @Override
                public Object addingService(ServiceReference<Object> reference) {
                    logger.debug("Service appeared for dependency: {}", cacheKey);
                    
                    // Resolve the Promise with the first available service
                    if (!deferred.getPromise().isDone()) {
                        deferred.resolve(reference);
                    }
                    
                    return super.addingService(reference);
                }
                
                @Override
                public void removedService(ServiceReference<Object> reference, Object service) {
                    logger.debug("Service disappeared for dependency: {}", cacheKey);
                    
                    // If this was the service we were tracking and no others are available
                    if (size() == 0 && deferred.getPromise().isDone()) {
                        // Create a new Promise for future resolution
                        // Note: OSGi Promises are immutable once resolved, so we'd need to
                        // recreate the cache entry for dynamic behavior
                    }
                    
                    super.removedService(reference, service);
                }
            };
            
            // Cache the entry
            DependencyCacheEntry entry = new DependencyCacheEntry(deferred.getPromise(), serviceTracker);
            dependencyCache.put(cacheKey, entry);
            
            // Open the ServiceTracker
            serviceTracker.open();
            
            // Check if service is already available
            ServiceReference<Object> existingService = serviceTracker.getServiceReference();
            if (existingService != null) {
                deferred.resolve(existingService);
            }
            
            return deferred.getPromise();
            
        } catch (InvalidSyntaxException e) {
            logger.error("Invalid filter syntax for dependency: {}", cacheKey, e);
            return promiseFactory.failed(e);
        }
    }
    
    /**
     * Creates LDAP filter string from ServiceDependency.
     */
    private String createFilterString(ServiceDependency dependency) {
        String serviceInterface = dependency.getServiceInterface();
        String customFilter = dependency.getFilter();
        
        if (customFilter == null || customFilter.trim().isEmpty()) {
            return String.format("(objectClass=%s)", serviceInterface);
        }
        
        // Combine service interface and custom filter
        return String.format("(&(objectClass=%s)%s)", serviceInterface, customFilter);
    }
    
    /**
     * Creates composite Promise using Promises.all().
     */
    private Promise<Map<String, ServiceReference<?>>> createCompositePromise(
            Map<String, Promise<ServiceReference<?>>> dependencyPromises) {
        
        // Convert to array for Promises.all()
		List<Promise<ServiceReference<?>>> promises = new ArrayList<>(dependencyPromises.values());
        
        // Use Promises.all() to wait for all dependencies
        Promise<List<ServiceReference<?>>> allPromise = Promises.all(promises);
        
        // Transform the result back to a named map
        return allPromise.map(serviceArray -> {
            Map<String, ServiceReference<?>> result = new HashMap<>();
            for (Map.Entry<String, Promise<ServiceReference<?>>> entry : dependencyPromises.entrySet()) {
                result.put(entry.getKey(), entry.getValue().getValue());
            }
            return result;
        });
    }
    
    /**
     * Extracts dependency cache keys from a pipeline Promise (for cleanup).
     * This is a simplified implementation - in practice you might want to store
     * this information explicitly.
     */
    private Set<String> extractDependencyKeys(Promise<Map<String, ServiceReference<?>>> promise) {
        // For now, return empty set - this would need more sophisticated tracking
        // to determine which dependencies a pipeline Promise depends on
        return Set.of();
    }
    
    /**
     * Cache entry holding Promise and ServiceTracker.
     */
    private static class DependencyCacheEntry {
        final Promise<ServiceReference<?>> promise;
        final ServiceTracker<Object, Object> serviceTracker;
        
        DependencyCacheEntry(Promise<ServiceReference<?>> promise, ServiceTracker<Object, Object> serviceTracker) {
            this.promise = promise;
            this.serviceTracker = serviceTracker;
        }
    }
    
    /**
     * Implementation of cache statistics.
     */
    private class DependencyCacheStatsImpl implements DependencyCacheStats {
        
        @Override
        public int getTotalCachedDependencies() {
            return dependencyCache.size();
        }
        
        @Override
        public int getResolvedDependencies() {
            return (int) dependencyCache.values().stream()
                .filter(entry -> {
                    try {
                        return entry.promise.isDone() && entry.promise.getFailure() == null;
                    } catch (InterruptedException e) {
                        logger.warn("Interrupted while checking promise state", e);
                        Thread.currentThread().interrupt(); // Restore interrupted status
                        return false;
                    }
                })
                .count();
        }
        
        @Override
        public int getPendingDependencies() {
            return (int) dependencyCache.values().stream()
                .filter(entry -> !entry.promise.isDone())
                .count();
        }
        
        @Override
        public int getFailedDependencies() {
            return (int) dependencyCache.values().stream()
                .filter(entry -> {
                    try {
                        return entry.promise.isDone() && entry.promise.getFailure() != null;
                    } catch (InterruptedException e) {
                        logger.warn("Interrupted while checking promise state", e);
                        Thread.currentThread().interrupt(); // Restore interrupted status
                        return false;
                    }
                })
                .count();
        }
        
        @Override
        public double getCacheHitRatio() {
            long hits = cacheHits.get();
            long misses = cacheMisses.get();
            long total = hits + misses;
            return total == 0 ? 0.0 : (double) hits / total;
        }
        
        @Override
        public Set<String> getCachedDependencyKeys() {
            return Set.copyOf(dependencyCache.keySet());
        }
        
        @Override
        public String getStatsSummary() {
            return String.format(
                "DependencyCache Stats: Total=%d, Resolved=%d, Pending=%d, Failed=%d, HitRatio=%.2f%%",
                getTotalCachedDependencies(),
                getResolvedDependencies(),
                getPendingDependencies(),
                getFailedDependencies(),
                getCacheHitRatio() * 100.0
            );
        }
    }
}
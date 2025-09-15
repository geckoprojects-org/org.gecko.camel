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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.fennec.camel.old.PipelineMonitoringService;
import org.eclipse.fennec.camel.old.PipelineStateReporter;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.util.promise.Deferred;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.Promises;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of pipeline monitoring and control service.
 * 
 * <p>This service tracks the state of all pipeline instances and provides
 * Promise-based synchronization for tests and management operations.
 * It maintains a registry of pipeline states and provides event-driven
 * notifications when states change.
 */
@Component(service = {PipelineMonitoringService.class, PipelineStateReporter.class})
public class PipelineMonitoringServiceImpl implements PipelineMonitoringService, PipelineStateReporter {

    private static final Logger logger = LoggerFactory.getLogger(PipelineMonitoringServiceImpl.class);
    
    private final Map<String, PipelineState> pipelineStates = new ConcurrentHashMap<>();
    private final Map<String, List<String>> missingDependencies = new ConcurrentHashMap<>();
    private final Map<String, List<String>> resolvedDependencies = new ConcurrentHashMap<>();
    private final Map<String, String> lastErrors = new ConcurrentHashMap<>();
    private final Map<String, List<StateChangeListener>> stateListeners = new ConcurrentHashMap<>();
    
    private ScheduledExecutorService scheduler;
    
    @Activate
    public void activate() {
        this.scheduler = Executors.newScheduledThreadPool(2, r -> {
            Thread t = new Thread(r, "pipeline-monitor");
            t.setDaemon(true);
            return t;
        });
        logger.info("Pipeline monitoring service activated");
    }
    
    @Deactivate
    public void deactivate() {
        if (scheduler != null && !scheduler.isShutdown()) {
            scheduler.shutdown();
            try {
                if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                    scheduler.shutdownNow();
                }
            } catch (InterruptedException e) {
                scheduler.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
        logger.info("Pipeline monitoring service deactivated");
    }
    
    @Override
    public PipelineState getPipelineState(String pipelineId) {
        return pipelineStates.get(pipelineId);
    }
    
    @Override
    public List<String> getMonitoredPipelines() {
        return new ArrayList<>(pipelineStates.keySet());
    }
    
    @Override
    public Promise<Boolean> waitForState(String pipelineId, PipelineState expectedState, 
                                       long timeout, TimeUnit unit) {
        PipelineState currentState = pipelineStates.get(pipelineId);
        if (currentState == expectedState) {
            return Promises.resolved(true);
        }
        
        Deferred<Boolean> deferred = new Deferred<>();
        StateChangeListener listener = new StateChangeListener(expectedState, deferred);
        
        stateListeners.computeIfAbsent(pipelineId, k -> new ArrayList<>()).add(listener);
        
        // Set timeout
        scheduler.schedule(() -> {
            if (!deferred.getPromise().isDone()) {
                removeListener(pipelineId, listener);
                deferred.resolve(false);
            }
        }, timeout, unit);
        
        return deferred.getPromise();
    }
    
    @Override
    public Promise<Boolean> waitForPipelineReady(String pipelineId, long timeout, TimeUnit unit) {
        return waitForState(pipelineId, PipelineState.ACTIVE, timeout, unit);
    }
    
    @Override
    public Promise<Boolean> startPipeline(String pipelineId) {
        // TODO: Integrate with PipelineWhiteboardInstance to trigger start
        logger.info("Start pipeline requested: {}", pipelineId);
        return Promises.resolved(true);
    }
    
    @Override
    public Promise<Boolean> stopPipeline(String pipelineId) {
        // TODO: Integrate with PipelineWhiteboardInstance to trigger stop
        logger.info("Stop pipeline requested: {}", pipelineId);
        return Promises.resolved(true);
    }
    
    @Override
    public Promise<Boolean> cancelPipeline(String pipelineId) {
        // TODO: Integrate with PipelineWhiteboardInstance to trigger cancel
        logger.info("Cancel pipeline requested: {}", pipelineId);
        return Promises.resolved(true);
    }
    
    @Override
    public List<String> getMissingDependencies(String pipelineId) {
        return missingDependencies.getOrDefault(pipelineId, List.of());
    }
    
    @Override
    public List<String> getResolvedDependencies(String pipelineId) {
        return resolvedDependencies.getOrDefault(pipelineId, List.of());
    }
    
    @Override
    public String getLastError(String pipelineId) {
        return lastErrors.get(pipelineId);
    }
    
    // PipelineStateReporter implementation (thread-safe methods for pipeline instances)
    
    @Override
    public void updatePipelineState(String pipelineId, PipelineState newState) {
        PipelineState oldState = pipelineStates.put(pipelineId, newState);
        logger.debug("Pipeline '{}' state changed: {} -> {}", pipelineId, oldState, newState);
        
        // Synchronize listener notifications to ensure consistency
        synchronized (this) {
            notifyStateListeners(pipelineId, newState);
        }
    }
    
    @Override
    public void updateMissingDependencies(String pipelineId, List<String> missing) {
        missingDependencies.put(pipelineId, new ArrayList<>(missing));
    }
    
    @Override
    public void updateResolvedDependencies(String pipelineId, List<String> resolved) {
        resolvedDependencies.put(pipelineId, new ArrayList<>(resolved));
    }
    
    @Override
    public void updateError(String pipelineId, String error) {
        lastErrors.put(pipelineId, error);
        updatePipelineState(pipelineId, PipelineState.FAILED);
    }
    
    @Override
    public void removePipeline(String pipelineId) {
        pipelineStates.remove(pipelineId);
        missingDependencies.remove(pipelineId);
        resolvedDependencies.remove(pipelineId);
        lastErrors.remove(pipelineId);
        
        // Synchronize listener cleanup
        synchronized (this) {
            stateListeners.remove(pipelineId);
        }
        
        logger.debug("Removed pipeline from monitoring: {}", pipelineId);
    }
    
    private void notifyStateListeners(String pipelineId, PipelineState newState) {
        List<StateChangeListener> listeners = stateListeners.get(pipelineId);
        if (listeners != null) {
            listeners.removeIf(listener -> {
                if (listener.expectedState == newState) {
                    listener.deferred.resolve(true);
                    return true;
                }
                return false;
            });
        }
    }
    
    private void removeListener(String pipelineId, StateChangeListener listener) {
        List<StateChangeListener> listeners = stateListeners.get(pipelineId);
        if (listeners != null) {
            listeners.remove(listener);
        }
    }
    
    private static class StateChangeListener {
        final PipelineState expectedState;
        final Deferred<Boolean> deferred;
        
        StateChangeListener(PipelineState expectedState, Deferred<Boolean> deferred) {
            this.expectedState = expectedState;
            this.deferred = deferred;
        }
    }
}
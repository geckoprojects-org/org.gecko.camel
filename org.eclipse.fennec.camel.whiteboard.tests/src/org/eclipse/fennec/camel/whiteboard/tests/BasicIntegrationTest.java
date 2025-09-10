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
package org.eclipse.fennec.camel.whiteboard.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.apache.camel.spi.ComponentResolver;
import org.apache.camel.spi.ConfigurerResolver;
import org.eclipse.fennec.camel.whiteboard.ConfigurationAgent;
import org.eclipse.fennec.camel.whiteboard.ConfigurationManager;
import org.eclipse.fennec.camel.whiteboard.PipelineInstance;
import org.eclipse.fennec.camel.whiteboard.PipelineMonitoringService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.Property.Scalar;
import org.osgi.test.common.annotation.Property.Type;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;
import org.osgi.util.promise.Promise;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/**
 * Basic integration tests that verify the OSGi-native configuration-driven
 * pipeline system is working correctly with proper compilation.
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
public class BasicIntegrationTest {

    @Test
    public void testServicesAvailable(@InjectBundleContext BundleContext bundleContext,
                                    @InjectService ConfigurationAgent configAgent,
                                    @InjectService ConfigurationManager configManager,
                                    @InjectService ConfigurationAdmin configAdmin,
                                    @InjectService PipelineMonitoringService monitoringService) {
        // Basic service availability test
        assertNotNull(bundleContext, "BundleContext should be available");
        assertNotNull(configAgent, "ConfigurationAgent should be available");
        assertNotNull(configManager, "ConfigurationManager should be available");
        assertNotNull(configAdmin, "ConfigurationAdmin should be available");
        assertNotNull(monitoringService, "PipelineMonitoringService should be available");
        
        // Check if PipelineStateReporter service is also available (needed by PipelineWhiteboardInstance)
        try {
            var stateReporterRef = bundleContext.getServiceReference("org.eclipse.fennec.camel.whiteboard.PipelineStateReporter");
            System.out.println("PipelineStateReporter service reference: " + stateReporterRef);
            if (stateReporterRef != null) {
                var stateReporter = bundleContext.getService(stateReporterRef);
                System.out.println("PipelineStateReporter service: " + stateReporter);
            }
        } catch (Exception e) {
            System.out.println("Error checking PipelineStateReporter: " + e.getMessage());
        }
        
        assertTrue(true, "All core services are available - basic OSGi integration working");
    }
    
    @Test
    public void testCamelServicesAvailable(@InjectBundleContext BundleContext bundleContext) throws InterruptedException, InvalidSyntaxException {
    	// Basic service availability test
    	assertNotNull(bundleContext, "BundleContext should be available");
    	String filterString = "(&(objectClass=org.apache.camel.spi.ComponentResolver)(component=timer))";
    	Filter filter = bundleContext.createFilter(filterString);
    	CountDownLatch cdl = new CountDownLatch(1);
    	ServiceTracker<?, ?> tracker = new ServiceTracker<>(bundleContext, filter, new ServiceTrackerCustomizer<Object, String>() {

			@Override
			public String addingService(ServiceReference<Object> reference) {
				System.out.println("ADD " + reference);
				cdl.countDown();
				return null;
			}

			@Override
			public void modifiedService(ServiceReference reference, String service) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removedService(ServiceReference reference, String service) {
				// TODO Auto-generated method stub
				
			}
    		
		});
    	tracker.open(true);
    	
    	if (!cdl.await(10, TimeUnit.SECONDS)) {
    		fail("Fehlgeschlagen");
    	}
    }

    @Test
    @WithFactoryConfiguration(
        factoryPid = "CamelPipelineInstance",
        name = "basic-test",
        properties = {
            @Property(key = "pipeline.id", value = "basic-test-pipeline"),
            @Property(key = "pipeline.name", value = "Basic Test Pipeline"),
            @Property(key = "auto.start", value = "true"),
            @Property(key = "dependency.filters", value = {"(component=timer)", "(component=log)", "(language=simple)"}, scalar = Scalar.String, type = Type.Array),
            @Property(key = "routeContent", value = "- route:\\n    from:\\n      uri: timer:basic-test?period=10000\\n    steps:\\n      - log: 'Basic integration test working'")
        }
    )
    public void testBasicPipelineCreation(
            @InjectService(filter = "(pipeline.id=basic-test-pipeline)")
            ServiceAware<PipelineInstance> pipelineServiceAware) throws Exception {
        
        // Wait for the PipelineInstance service to be available
        PipelineInstance pipeline = pipelineServiceAware.waitForService(10000);
        assertNotNull(pipeline, "PipelineInstance service should be available within 10 seconds");
        // Verify the pipeline ID matches
        assertEquals("basic-test-pipeline", pipeline.getPipelineId());
        
        // Use Promise-based readiness waiting - non-blocking approach
        Promise<Boolean> readinessPromise = pipeline.getReadinessPromise();
        
        // Add a state change listener for debugging
        pipeline.addStateChangeListener((pipelineId, oldState, newState, error) -> {
            System.out.println("Pipeline '" + pipelineId + "' state changed: " + oldState + " -> " + newState);
            if (error != null) {
                System.out.println("Error: " + error);
            }
        });
        
        // Check current state
        System.out.println("Current pipeline state: " + pipeline.getCurrentState());
        
        // Wait for the promise to resolve (10 second timeout)
        Boolean isReady = readinessPromise.timeout(10000).getValue();
        
        assertNotNull(isReady, "Readiness promise should resolve within 10 seconds");
        assertTrue(isReady, "Pipeline should become ready");
        
        // Verify final state
        assertEquals(PipelineInstance.PipelineState.ACTIVE, pipeline.getCurrentState());
        assertTrue(pipeline.isActive(), "Pipeline should be active");
        assertTrue(pipeline.hasAllDependencies(), "Pipeline should have all dependencies resolved");
    }

    @Test
    @WithFactoryConfiguration(
        factoryPid = "org.eclipse.fennec.camel.whiteboard.PipelineWhiteboardInstance", 
        name = "annotation-readiness-test",
        properties = {
            @Property(key = "pipeline.id", value = "annotation-readiness-pipeline"),
            @Property(key = "pipeline.name", value = "Annotation Readiness Test"),
            @Property(key = "auto.start", value = "true"),
            @Property(key = "routeContent", value = "- route:\\n    from:\\n      uri: timer:readiness-test?period=15000\\n    steps:\\n      - log: 'Testing pipeline readiness condition'")
        }
    )
    
    public void testPipelineReadinessWithServiceAware(
            @InjectService(filter = "(pipeline.id=annotation-readiness-pipeline)")
            ServiceAware<PipelineInstance> pipelineServiceAware) throws Exception {
        
        // Wait for the PipelineInstance service to be available
        PipelineInstance pipeline = pipelineServiceAware.waitForService(15000);
        assertNotNull(pipeline, "PipelineInstance service should be available within 15 seconds");
        
        // Verify the pipeline ID matches
        assertEquals("annotation-readiness-pipeline", pipeline.getPipelineId());
        
        // Use Promise-based readiness waiting
        Promise<Boolean> readinessPromise = pipeline.getReadinessPromise();
        
        // Wait for the promise to resolve
        Boolean isReady = readinessPromise.timeout(10000).getValue();
        assertTrue(isReady, "Pipeline should become ready within 10 seconds");
        
        // Verify service reference properties are forwarded from configuration
        var serviceRef = pipelineServiceAware.getServiceReference();
        assertNotNull(serviceRef, "Should have service reference for PipelineInstance");
        
        String pipelineId = (String) serviceRef.getProperty("pipeline.id");
        assertEquals("annotation-readiness-pipeline", pipelineId, "Service property should match configuration");
    }
}
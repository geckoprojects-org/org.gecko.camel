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
package org.gecko.camel.example;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dragino.DraginoFactory;

/**
 * Example business logic component that demonstrates how to consume
 * a CamelContext from the whiteboard prototype service factory.
 * 
 * This shows how any OSGi component can get its own CamelContext instance
 * with all processors, routes, and components automatically wired.
 * 
 * Benefits over the manual approach:
 * - CamelContext is automatically injected via DS
 * - No need to manage CamelContext lifecycle
 * - All processors and routes are automatically available
 * - Type-safe service injection
 * - Hot-swappable (can be updated without system restart)
 * 
 * @author Mark Hoffmann
 */
@Component(property = {
               "business.component=emf-processor",
               "service.description=Example EMF processing business logic"
           })
public class ExampleBusinessLogic {
    
    private static final Logger LOG = LoggerFactory.getLogger(ExampleBusinessLogic.class);
    
    // Auto-injected CamelContext from the prototype service factory!
    // Each component gets its own CamelContext instance with all
    // processors, routes, and components wired automatically
    @Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
    private CamelContext camelContext;
    
    private static final String body = "<dragino:DraginoLSE01Uplink xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:dragino=\"https://eclipse.org/fennec/lorawan/dragino\">\n"
    		+ "  <deviceInfo deviceName=\"11e33513-3cc4-4497-85a1-c9caa5b4bf0b\"/>\n"
    		+ "</dragino:DraginoLSE01Uplink>";
    
    private ProducerTemplate producerTemplate;
    
    @Activate
    public void activate() {
        LOG.info("Activating EMF business logic component");
        
        // Create producer template for sending messages
        producerTemplate = camelContext.createProducerTemplate();
        // Start the CamelContext if not already started
        try {
            if (!camelContext.isStarted()) {
                camelContext.start();
                LOG.info("Started CamelContext: {}", camelContext.getName());
            }
            producerTemplate.requestBody("direct:emf-process", body);
        } catch (Exception e) {
            LOG.error("Failed to start CamelContext", e);
        }
        LOG.info("EMF business logic component activated successfully");
    }
    
    @Deactivate
    public void deactivate() {
        LOG.info("Deactivating EMF business logic component");
        
        // Clean up producer template
        if (producerTemplate != null) {
            try {
                producerTemplate.stop();
            } catch (Exception e) {
                LOG.warn("Error stopping producer template", e);
            }
        }
        
        // CamelContext will be automatically cleaned up by the prototype service factory
        LOG.info("EMF business logic component deactivated");
    }
    
    /**
     * Process an EMF object using the Camel routes.
     * 
     * This demonstrates how business logic can easily send messages
     * to Camel routes without knowing about the internal routing details.
     * 
     * @param eObject the EMF object to process
     * @return processing result
     */
    public String processEMFObject(EObject eObject) {
        LOG.debug("Processing EMF object: {}", eObject);
        
        try {
            // Send the EObject to the EMF processing route
            // The route will automatically use the EMFLoad and EMFSave processors
            // that were discovered and wired by the whiteboard
            Object result = producerTemplate.requestBody("direct:emf-process", eObject);
            
            LOG.debug("EMF processing completed with result: {}", result);
            return String.valueOf(result);
            
        } catch (Exception e) {
            LOG.error("Error processing EMF object", e);
            return "Processing failed: " + e.getMessage();
        }
    }
    
    /**
     * Process EMF object asynchronously.
     * 
     * @param eObject the EMF object to process
     */
    public void processEMFObjectAsync(EObject eObject) {
        LOG.debug("Processing EMF object asynchronously: {}", eObject);
        
        try {
            // Send asynchronously - fire and forget
            producerTemplate.sendBody("direct:emf-process", eObject);
            LOG.debug("EMF object sent for async processing");
            
        } catch (Exception e) {
            LOG.error("Error sending EMF object for async processing", e);
        }
    }
    
    /**
     * Get status information about the CamelContext.
     * 
     * @return status information
     */
    public String getCamelContextStatus() {
        if (camelContext != null) {
            return String.format("CamelContext '%s' is %s with %d routes", 
                                camelContext.getName(),
                                camelContext.getStatus().toString().toLowerCase(),
                                camelContext.getRoutes().size());
        }
        return "CamelContext not available";
    }
    
    /**
     * List available processors in the CamelContext.
     * 
     * @return processor information
     */
    public String listAvailableProcessors() {
        if (camelContext != null) {
            StringBuilder sb = new StringBuilder("Available processors:\n");
            
            // Check if our expected processors are available
            if (camelContext.getRegistry().lookupByName("EMFSave") != null) {
                sb.append("- EMFSave processor: available\n");
            }
            if (camelContext.getRegistry().lookupByName("EMFLoad") != null) {
                sb.append("- EMFLoad processor: available\n");
            }
            if (camelContext.getRegistry().lookupByName("resourceSet") != null) {
                sb.append("- ResourceSet: available\n");
            }
            
            return sb.toString();
        }
        return "CamelContext not available";
    }
}
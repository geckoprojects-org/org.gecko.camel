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

import static org.apache.camel.builder.Builder.header;
import static org.apache.camel.builder.Builder.constant;
import org.osgi.service.component.annotations.Component;
import org.apache.camel.builder.RouteBuilder;

/**
 * Example RouteProvider that replaces the manual route configuration
 * from SimpleCamelRouteComponent.java.
 * 
 * This demonstrates how routes can be contributed to the whiteboard
 * CamelContext using the declarative services approach instead of
 * manual CamelContext creation and route registration.
 * 
 * Benefits over the original approach:
 * - No manual CamelContext lifecycle management
 * - Automatic processor discovery and binding
 * - Hot-swappable routes (can be updated without restart)
 * - Clean separation of concerns
 * - Type-safe configuration
 * 
 * The processors (EMFSave, EMFLoad) are automatically resolved from
 * the whiteboard and bound to the CamelContext registry, so they can
 * be referenced by name in the routes.
 * 
 * @author Mark Hoffmann
 */
@Component(property = {
               "route.description=EMF processing routes",
               "route.version=1.0",
               "camel.route=my"
           }, immediate = true)
public class EMFRouteProvider implements RouteProvider {
    
    @Override
    public void configureRoutes(RouteBuilder builder) throws Exception {
        
        // Main EMF processing route
        // Processors are automatically resolved from the whiteboard
        builder.from("direct:emf-process")
               .routeId("emf-main-processing")
               .log("Starting EMF processing for: ${body}")
               .to("direct:load-emf")
               .process("EMFSave")  // Auto-resolved EMFSaveProcessor
               .log("EMF processing completed")
               .to("direct:emf-result");
        
        // EMF loading sub-route
        builder.from("direct:load-emf")
               .routeId("emf-load")
               .log("Loading EMF resource: ${body}")
               .process("EMFLoad")  // Auto-resolved EMFLoadProcessor
               .log("EMF resource loaded successfully");
        
        // Result handling route
        builder.from("direct:emf-result")
               .routeId("emf-result-handler")
               .choice()
                   .when(header("error").isNotNull())
                       .log("EMF processing failed: ${header.error}")
                       .to("direct:emf-error")
                   .otherwise()
                       .log("EMF processing successful: ${body}")
                       .to("direct:emf-success");
        
        // Error handling route
        builder.from("direct:emf-error")
               .routeId("emf-error-handler")
               .log("Handling EMF processing error")
               .setBody(constant("Processing failed"))
               .setHeader("processingStatus", constant("FAILED"));
        
        // Success handling route  
        builder.from("direct:emf-success")
               .routeId("emf-success-handler")
               .log("EMF processing completed successfully")
               .setHeader("processingStatus", constant("SUCCESS"));
    }
    
    @Override
    public String getRouteId() {
        return "emf-processing-routes";
    }
    
}
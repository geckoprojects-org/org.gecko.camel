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
package org.gecko.camel.example.impl.routes;

import static org.apache.camel.builder.Builder.header;
import static org.apache.camel.builder.Builder.constant;
import org.osgi.service.component.annotations.Component;
import org.apache.camel.builder.RouteBuilder;
import org.gecko.camel.example.RouteProvider;

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
               "route.description=Kafka processing routes",
               "route.version=1.0",
               "camel.route=myK"
           }, immediate = true)
public class KafkaRouteProvider implements RouteProvider {
    
    @Override
    public void configureRoutes(RouteBuilder builder) throws Exception {
        
        // Main EMF processing route
        // Processors are automatically resolved from the whiteboard
        builder.from("kafka:dummy?brokers=localhost:19092&groupId=my-consumer-group")
               .routeId("kafka-main-processing")
               .log("Received message from Kafka: ${body}")
               .process(exchange -> {
                   // Process the received message
                   String message = exchange.getIn().getBody(String.class);
                   System.out.println("Processing: " + message);
               });
        
    }
    
    @Override
    public String getRouteId() {
        return "kafka-processing-routes";
    }
    
}
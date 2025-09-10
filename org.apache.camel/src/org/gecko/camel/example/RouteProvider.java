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

import org.apache.camel.builder.RouteBuilder;

/**
 * Service interface for components that want to contribute routes to CamelContext instances.
 * 
 * Implementations of this interface should be registered as OSGi services using 
 * {@code @Component(service = RouteProvider.class)}.
 * 
 * The whiteboard CamelContext will automatically discover all RouteProvider services
 * and configure their routes in every CamelContext instance it creates.
 * 
 * Example usage:
 * <pre>
 * {@code
 * @Component(service = RouteProvider.class)
 * public class MyRouteProvider implements RouteProvider {
 *     
 *     @Override
 *     public void configureRoutes(RouteBuilder builder) {
 *         builder.from("direct:start")
 *                .process("myProcessor")  // Auto-resolved from whiteboard
 *                .to("direct:end");
 *     }
 *     
 *     @Override
 *     public String getRouteId() {
 *         return "my-business-route";
 *     }
 * }
 * }
 * </pre>
 * 
 * @author Mark Hoffmann
 */
public interface RouteProvider {
    
    /**
     * Configure routes using the provided RouteBuilder.
     * 
     * This method will be called when a new CamelContext is being created.
     * All processors, components, and other services registered with the 
     * whiteboard will be available for use in the routes.
     * 
     * @param builder the RouteBuilder to configure routes with
     * @throws Exception if route configuration fails
     */
    void configureRoutes(RouteBuilder builder) throws Exception;
    
    /**
     * Returns a unique identifier for this route provider.
     * 
     * This is used for logging and debugging purposes to identify
     * which RouteProvider contributed specific routes.
     * 
     * @return unique identifier for this route provider
     */
    String getRouteId();
    
    /**
     * Optional method to specify route startup order.
     * Routes with lower order values are started first.
     * 
     * Default implementation returns 1000.
     * 
     * @return startup order for routes from this provider
     */
    default int getStartupOrder() {
        return 1000;
    }
    
    /**
     * Optional method to specify if routes should be auto-started.
     * 
     * Default implementation returns true.
     * 
     * @return true if routes should be auto-started, false otherwise
     */
    default boolean isAutoStartup() {
        return true;
    }
}
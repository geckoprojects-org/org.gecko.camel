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
import org.osgi.framework.Bundle;

/**
 * Service interface for components that want to perform custom configuration
 * of CamelContext instances during their creation.
 * 
 * Implementations of this interface should be registered as OSGi services using 
 * {@code @Component(service = CamelContextConfigurer.class)}.
 * 
 * The whiteboard CamelContext will automatically discover all CamelContextConfigurer 
 * services and apply their configuration to every CamelContext instance it creates.
 * 
 * This is useful for:
 * - Setting global properties and options
 * - Configuring error handlers
 * - Setting up intercepts and event notifiers
 * - Bundle-specific configuration
 * - Registering custom registry entries
 * 
 * Example usage:
 * <pre>
 * {@code
 * @Component(service = CamelContextConfigurer.class)
 * public class MyContextConfigurer implements CamelContextConfigurer {
 *     
 *     @Override
 *     public void configure(CamelContext context, Bundle requestingBundle) {
 *         // Set bundle-specific properties
 *         String bundleName = requestingBundle.getSymbolicName();
 *         context.getGlobalOptions().put("bundle.name", bundleName);
 *         
 *         // Configure error handling
 *         context.setErrorHandlerBuilder(deadLetterChannel("log:error"));
 *         
 *         // Add event notifier
 *         context.getManagementStrategy().addEventNotifier(new MyEventNotifier());
 *         
 *         // Register shared resources
 *         context.getRegistry().bind("sharedResource", createSharedResource());
 *     }
 *     
 *     @Override
 *     public int getPriority() {
 *         return 100; // High priority to configure context early
 *     }
 * }
 * }
 * </pre>
 * 
 * @author Mark Hoffmann
 */
public interface CamelContextConfigurer {
    
    /**
     * Configure the CamelContext for the requesting bundle.
     * 
     * This method is called during CamelContext creation, after the context
     * is instantiated but before routes are added and the context is started.
     * 
     * @param context the CamelContext being configured
     * @param requestingBundle the bundle that requested the CamelContext
     * @throws Exception if configuration fails
     */
    void configure(CamelContext context, Bundle requestingBundle) throws Exception;
    
    /**
     * Optional method to specify configuration priority.
     * Configurers with lower priority values are applied first.
     * 
     * This allows for ordered configuration where some configurers
     * need to run before others.
     * 
     * Default implementation returns 1000.
     * 
     * @return configuration priority (lower values = higher priority)
     */
    default int getPriority() {
        return 1000;
    }
    
    /**
     * Optional method to specify if this configurer should only
     * apply to specific bundles.
     * 
     * Default implementation returns true for all bundles.
     * 
     * @param bundle the bundle requesting CamelContext configuration
     * @return true if this configurer should apply to the bundle
     */
    default boolean appliesTo(Bundle bundle) {
        return true;
    }
    
    /**
     * Optional method to get a description of what this configurer does.
     * Used for logging and debugging purposes.
     * 
     * Default implementation returns the class name.
     * 
     * @return description of this configurer
     */
    default String getDescription() {
        return getClass().getSimpleName();
    }
}
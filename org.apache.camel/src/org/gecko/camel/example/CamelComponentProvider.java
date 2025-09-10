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

import org.apache.camel.Component;

/**
 * Service interface for components that want to contribute Camel components 
 * to CamelContext instances.
 * 
 * Implementations of this interface should be registered as OSGi services using 
 * {@code @Component(service = CamelComponentProvider.class)}.
 * 
 * The whiteboard CamelContext will automatically discover all CamelComponentProvider 
 * services and register their components in every CamelContext instance it creates.
 * 
 * Example usage:
 * <pre>
 * {@code
 * @Component(service = CamelComponentProvider.class)
 * public class MyComponentProvider implements CamelComponentProvider {
 *     
 *     @Override
 *     public Component getComponent() {
 *         return new MyCustomComponent();
 *     }
 *     
 *     @Override
 *     public String getComponentName() {
 *         return "mycustom";
 *     }
 * }
 * }
 * </pre>
 * 
 * Then routes can use the component like:
 * <pre>
 * from("mycustom://endpoint").to("direct:process");
 * </pre>
 * 
 * @author Mark Hoffmann
 */
public interface CamelComponentProvider {
    
    /**
     * Returns the Camel component instance to be registered.
     * 
     * This method will be called when a new CamelContext is being created.
     * The returned component will be registered with the CamelContext using
     * the name returned by {@link #getComponentName()}.
     * 
     * Note: A new component instance may be requested for each CamelContext,
     * so implementations should be prepared to create multiple instances.
     * 
     * @return the Camel component instance
     */
    Component getComponent();
    
    /**
     * Returns the name under which the component should be registered.
     * 
     * This name will be used as the scheme in Camel endpoint URIs.
     * For example, if this returns "mycomponent", then routes can use
     * URIs like "mycomponent://endpoint".
     * 
     * @return the component name/scheme
     */
    String getComponentName();
    
    /**
     * Optional method to specify component loading priority.
     * Components with lower priority values are loaded first.
     * 
     * This can be useful when components have dependencies on each other.
     * 
     * Default implementation returns 1000.
     * 
     * @return loading priority for this component
     */
    default int getPriority() {
        return 1000;
    }
    
    /**
     * Optional method to specify if this component should replace
     * any existing component with the same name.
     * 
     * Default implementation returns false, meaning existing components
     * with the same name will not be replaced.
     * 
     * @return true if this component should replace existing ones with same name
     */
    default boolean shouldReplace() {
        return false;
    }
}
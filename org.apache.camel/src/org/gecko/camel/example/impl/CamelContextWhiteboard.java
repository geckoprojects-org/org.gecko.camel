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
package org.gecko.camel.example.impl;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.camel.CamelContext;
import org.apache.camel.Processor;
import org.apache.camel.TypeConverter;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.direct.DirectComponent;
import org.apache.camel.karaf.core.OsgiDefaultCamelContext;
import org.gecko.camel.example.CamelComponentProvider;
import org.gecko.camel.example.CamelContextConfigurer;
import org.gecko.camel.example.RouteProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.PrototypeServiceFactory;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.condition.Condition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OSGi Declarative Services based whiteboard component that orchestrates CamelContext creation.
 * This component tracks all Camel-related services (processors, routes, components, converters)
 * and provides them through a PrototypeServiceFactory for CamelContext.
 * 
 * Benefits over Blueprint approach:
 * - Type-safe (compile-time checking vs Blueprint XML)
 * - Dynamic hot-swap of routes/processors at runtime
 * - Clean separation of concerns using whiteboard pattern
 * - Standard OSGi DS patterns
 * - Each bundle gets its own CamelContext instance
 * 
 * @author Mark Hoffmann
 */
@Component(reference = {
		@Reference(name = "start", service = Condition.class, target = "(&(" + Condition.CONDITION_ID + "=Camel)(camel=ready))")
})
public class CamelContextWhiteboard {
    
    private static final Logger LOG = LoggerFactory.getLogger(CamelContextWhiteboard.class);
    
    // Track all processors by name using volatile for thread safety
    @Reference(cardinality = ReferenceCardinality.MULTIPLE, 
               policy = ReferencePolicy.DYNAMIC,
               target = "(camel.processorName=*)")
    private volatile List<Processor> processors = new ArrayList<>();
    
    // Track route providers
    @Reference(cardinality = ReferenceCardinality.MULTIPLE, 
               policy = ReferencePolicy.DYNAMIC)
    private volatile List<RouteProvider> routeProviders = new ArrayList<>();
    
    // Track components 
    @Reference(cardinality = ReferenceCardinality.MULTIPLE, 
               policy = ReferencePolicy.DYNAMIC)
    private volatile List<CamelComponentProvider> componentProviders = new ArrayList<>();
    
    // Track type converters
    @Reference(cardinality = ReferenceCardinality.MULTIPLE, 
               policy = ReferencePolicy.DYNAMIC,
               target = "(camel.converter=true)")
    private volatile List<TypeConverter> converters = new ArrayList<>();
    
    // Track context configurers
//    @Reference(cardinality = ReferenceCardinality.MULTIPLE, 
//               policy = ReferencePolicy.DYNAMIC)
//    private volatile List<CamelContextConfigurer> configurers = new ArrayList<>();
    
    @Reference
    private CamelContextConfigurer configurer;
    
    // Cache of processor names for quick lookup
    private final Map<Processor, String> processorNames = new ConcurrentHashMap<>();
    
    // OSGi bundle context for programmatic service registration
    private BundleContext bundleContext;
    
    // Service registration for the PrototypeServiceFactory
    private ServiceRegistration<?> factoryRegistration;
    
    /**
     * Creates a fully configured CamelContext for the requesting bundle.
     * All registered processors, routes, components, and converters are automatically wired.
     * 
     * @param requestingBundle the bundle requesting the CamelContext
     * @return configured CamelContext instance
     */
    public CamelContext createConfiguredCamelContext(Bundle requestingBundle) {
        LOG.info("Creating CamelContext for bundle: {}", requestingBundle.getSymbolicName());
        
        // Use OSGi-aware CamelContext that includes OSGi resolvers for languages, components, etc.
        OsgiDefaultCamelContext camelContext = new OsgiDefaultCamelContext(requestingBundle.getBundleContext());
        
        
        // Apply bundle-specific configuration
        try {
        	configurer.configure(camelContext, requestingBundle);
        	LOG.info("Added configurer '{}' to CamelContext", configurer.getDescription());
        } catch (Exception e) {
        	LOG.warn("Error applying configurer: {}", configurer.getClass().getName(), e);
        }
//        configurers.forEach(configurer -> {
//            try {
//                configurer.configure(camelContext, requestingBundle);
//                LOG.info("Added configurer '{}' to CamelContext", configurer.getDescription());
//            } catch (Exception e) {
//                LOG.warn("Error applying configurer: {}", configurer.getClass().getName(), e);
//            }
//        });
        
//        // Register all processors with their names in the Camel registry
//        processors.forEach(processor -> {
//            String name = processorNames.get(processor);
//            if (name != null) {
//                camelContext.getRegistry().bind(name, processor);
//                LOG.debug("Bound processor '{}' to CamelContext", name);
//            }
//        });
//        
//        // Register all components
//        componentProviders.forEach(provider -> {
//            try {
//                camelContext.addComponent(provider.getComponentName(), provider.getComponent());
//                LOG.info("Added component '{}' to CamelContext", provider.getComponentName());
//            } catch (Exception e) {
//                LOG.warn("Error adding component: {}", provider.getComponentName(), e);
//            }
//        });
//
//        // Add all routes
//        routeProviders.forEach(provider -> {
//            try {
//                camelContext.addRoutes(new RouteBuilder() {
//                    @Override
//                    public void configure() throws Exception {
//                        provider.configureRoutes(this);
//                    }
//                });
//                LOG.debug("Added routes from provider: {}", provider.getClass().getName());
//            } catch (Exception e) {
//                LOG.warn("Error adding routes from provider: {}", provider.getClass().getName(), e);
//            }
//        });
//
//        
//        
//        // Register type converters
//        converters.forEach(converter -> {
//            try {
//                // Note: This is simplified - real implementation would need proper type converter registration
//                LOG.debug("Added type converter: {}", converter.getClass().getName());
//            } catch (Exception e) {
//                LOG.warn("Error adding type converter: {}", converter.getClass().getName(), e);
//            }
//        });
        
        LOG.info("Created CamelContext for bundle '{}' with {} processors, {} routes, {} components", 
                requestingBundle.getSymbolicName(), processors.size(), routeProviders.size(), componentProviders.size());
        
        return camelContext;
    }
    
    // DS callback for dynamic processor addition
    public void addProcessor(Processor processor, Map<String, Object> props) {
        String name = (String) props.get("camel.processorName");
        if (name != null) {
            processorNames.put(processor, name);
            LOG.debug("Added processor '{}': {}", name, processor.getClass().getName());
            // TODO: Notify existing contexts about the new processor
        }
    }
    
    // DS callback for dynamic processor removal
    public void removeProcessor(Processor processor, Map<String, Object> props) {
        String name = processorNames.remove(processor);
        if (name != null) {
            LOG.debug("Removed processor '{}': {}", name, processor.getClass().getName());
            // TODO: Notify existing contexts about the removed processor
        }
    }
    
    // DS callback for route provider addition
    public void addRouteProvider(RouteProvider provider) {
        LOG.debug("Added route provider: {}", provider.getClass().getName());
        // TODO: Notify existing contexts about new routes
    }
    
    // DS callback for route provider removal  
    public void removeRouteProvider(RouteProvider provider) {
        LOG.debug("Removed route provider: {}", provider.getClass().getName());
        // TODO: Notify existing contexts about removed routes
    }
    
    @Activate
    public void activate(BundleContext context) {
        LOG.debug("Activating CamelContextWhiteboard");
        this.bundleContext = context;
        
        // Register the PrototypeServiceFactory programmatically
        CamelContextFactory factory = new CamelContextFactory();
        
        Dictionary<String, Object> props = new Hashtable<>();
        props.put("service.scope", "prototype");
        props.put("service.description", "CamelContext Prototype Factory");
        props.put("component.name", "CamelContextFactory");
        
        factoryRegistration = context.registerService(
            CamelContext.class.getName(), 
            factory, 
            props
        );
        
        LOG.info("CamelContextWhiteboard activated and PrototypeServiceFactory registered");
    }
    
    @Deactivate
    public void deactivate() {
        LOG.debug("Deactivating CamelContextWhiteboard");
        
        if (factoryRegistration != null) {
            factoryRegistration.unregister();
            factoryRegistration = null;
            LOG.debug("PrototypeServiceFactory unregistered");
        }
        
        bundleContext = null;
        LOG.info("CamelContextWhiteboard deactivated");
    }
    
    /**
     * Prototype Service Factory for CamelContext.
     * Each requesting bundle gets its own CamelContext instance with all
     * currently available processors, routes, and components wired in.
     */
    public class CamelContextFactory implements PrototypeServiceFactory<CamelContext> {
        
        @Override
        public CamelContext getService(Bundle bundle, ServiceRegistration<CamelContext> registration) {
            LOG.debug("Creating CamelContext service for bundle: {}", bundle.getSymbolicName());
            return createConfiguredCamelContext(bundle);
        }
        
        @Override
        public void ungetService(Bundle bundle, ServiceRegistration<CamelContext> registration, CamelContext service) {
            LOG.debug("Releasing CamelContext service for bundle: {}", bundle.getSymbolicName());
            try {
                if (service != null) {
                    service.close();
                }
            } catch (Exception e) {
                LOG.warn("Error closing CamelContext for bundle: {}", bundle.getSymbolicName(), e);
            }
        }
    }
}
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

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.camel.spi.ComponentResolver;
import org.apache.camel.spi.ConfigurerResolver;
import org.apache.camel.spi.LanguageResolver;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
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
 * CamelCondition service responsible for collecting needed dependencies to make OsgiCamelContext work.
 * 
 * <p>This condition service monitors and aggregates all essential Apache Camel OSGi services
 * required for successful OsgiDefaultCamelContext initialization and operation. It publishes
 * an OSGi Condition service that other components can depend on to ensure all necessary
 * Camel infrastructure is available before creating their own CamelContext instances.</p>
 * 
 * <h2>OsgiCamelContext Dependencies</h2>
 * <p>The OsgiDefaultCamelContext requires several categories of OSGi services to function properly:</p>
 * 
 * <h3>Essential Language Resolvers</h3>
 * <ul>
 * <li><strong>simple</strong> - Simple expression language for basic route expressions</li>
 * <li><strong>constant</strong> - Constant language for static values</li>
 * <li><strong>header</strong> - Header language for accessing message headers</li>
 * </ul>
 * 
 * <h3>Essential Component Resolvers</h3>
 * <ul>
 * <li><strong>timer</strong> - Timer component for scheduled route triggers</li>
 * <li><strong>log</strong> - Logging component for route debugging and monitoring</li>
 * <li><strong>direct</strong> - Direct component for synchronous in-memory routing</li>
 * <li><strong>bean</strong> - Bean component for method invocation</li>
 * <li><strong>class</strong> - Class component for creating objects</li>
 * <li><strong>language</strong> - Language component for dynamic expressions</li>
 * </ul>
 * 
 * <h3>Configurer Resolvers</h3>
 * <p>At least one ConfigurerResolver must be available for component configuration.</p>
 * 
 * <h2>Condition Service Publication</h2>
 * <p>State machine: <code>camel=starting</code> → <code>camel=ready</code></p>
 * <p>When all required dependencies are satisfied, publishes:</p>
 * <ul>
 * <li><strong>Condition ID</strong>: "Camel"</li>
 * <li><strong>State Property</strong>: camel=ready</li>
 * <li><strong>Aggregated Properties</strong>: Available languages, components, configurers</li>
 * </ul>
 * 
 * <h2>Usage Pattern</h2>
 * <p>Other components creating OsgiCamelContext instances should wait for this condition:</p>
 * <pre>
 * &#64;Reference(target = "(&(condition.id=Camel)(camel=ready))")
 * Condition camelInfrastructureReady;
 * </pre>
 * 
 * <p>This ensures that the OsgiDefaultCamelContext will have all necessary resolvers
 * available during initialization, preventing ClassNotFoundException and other
 * initialization failures.</p>
 * 
 * @author Mark Hoffmann
 * @since 2025-09-12
 */
@Component(immediate = true)
public class CamelCondition implements Condition {

    private static final Logger LOG = LoggerFactory.getLogger(CamelCondition.class);

    // Required minimum services for Camel to be considered ready
    private static final Set<String> REQUIRED_LANGUAGES = Set.of("simple", "constant", "header");
    private static final Set<String> REQUIRED_COMPONENTS = Set.of("timer", "log", "direct", "bean", "class", "language");

    // Track all discovered service properties
    private final Map<ServiceReference<?>, Map<String, Object>> languageServices = new ConcurrentHashMap<>();
    private final Map<ServiceReference<?>, Map<String, Object>> componentServices = new ConcurrentHashMap<>();
    private final Map<ServiceReference<?>, Map<String, Object>> configurerServices = new ConcurrentHashMap<>();

    // Track what we've found
    private final Set<String> foundLanguages = new HashSet<>();
    private final Set<String> foundComponents = new HashSet<>();

    private volatile BundleContext bundleContext;
    private volatile ServiceRegistration<Condition> conditionRegistration;

    @Activate
    public void activate(BundleContext context) {
        LOG.info("Activating CamelConditionService - starting Apache Camel service discovery");
        this.bundleContext = context;

        // Check if we're already ready (in case services came in before activation)
        checkReadiness();
    }

    @Deactivate
    public void deactivate() {
        LOG.info("Deactivating CamelConditionService");

        if (conditionRegistration != null) {
            try {
                conditionRegistration.unregister();
                LOG.debug("Unregistered Camel condition service");
            } catch (Exception e) {
                LOG.debug("Error unregistering condition service: {}", e.getMessage());
            }
            conditionRegistration = null;
        }

        // Clear tracking maps
        languageServices.clear();
        componentServices.clear();
        configurerServices.clear();
        foundLanguages.clear();
        foundComponents.clear();

        bundleContext = null;
        LOG.info("CamelConditionService deactivated");
    }

    // LanguageResolver bind/unbind callbacks
    @Reference(cardinality = ReferenceCardinality.MULTIPLE, 
            policy = ReferencePolicy.DYNAMIC)
    public void bindLanguageResolvers(ServiceReference<LanguageResolver> ref) {

        Map<String, Object> props = getServiceProperties(ref);
        languageServices.put(ref, props);

        Object languages = props.get("language");
        if (languages != null) {
            if (languages instanceof String[]) {
                // Handle array property
                String[] langs = (String[]) languages;
                for (String lang : langs) {
                    foundLanguages.add(lang.trim());
                    LOG.debug("Found language: {}", lang.trim());
                }
            } else {
                // Handle string property (comma-separated)
                String[] langs = languages.toString().split(",\\s*");
                for (String lang : langs) {
                    foundLanguages.add(lang.trim());
                    LOG.debug("Found language: {}", lang.trim());
                }
            }
        }

        LOG.info("Bound LanguageResolver with languages: {} (total languages: {})", 
                languages, foundLanguages.size());
        checkReadiness();
    }

    public void unbindLanguageResolvers(ServiceReference<LanguageResolver> ref) {
        Map<String, Object> props = languageServices.remove(ref);
        if (props != null) {
            Object languages = props.get("language");
            if (languages != null) {
                if (languages instanceof String[]) {
                    String[] langs = (String[]) languages;
                    for (String lang : langs) {
                        foundLanguages.remove(lang.trim());
                    }
                } else {
                    String[] langs = languages.toString().split(",\\s*");
                    for (String lang : langs) {
                        foundLanguages.remove(lang.trim());
                    }
                }
            }
            LOG.debug("Unbound LanguageResolver with languages: {}", languages);
            checkReadiness();
        }
    }

    // ComponentResolver bind/unbind callbacks  
    @Reference(cardinality = ReferenceCardinality.MULTIPLE, 
            policy = ReferencePolicy.DYNAMIC)
    public void bindComponentResolvers(ServiceReference<ComponentResolver> ref) {

        Map<String, Object> props = getServiceProperties(ref);
        componentServices.put(ref, props);

        Object components = props.get("component");
        if (components != null) {
            if (components instanceof String[]) {
                // Handle array property
                String[] comps = (String[]) components;
                for (String comp : comps) {
                    foundComponents.add(comp.trim());
                    LOG.debug("Found component: {}", comp.trim());
                }
            } else {
                // Handle string property (comma-separated)
                String[] comps = components.toString().split(",\\s*");
                for (String comp : comps) {
                    foundComponents.add(comp.trim());
                    LOG.debug("Found component: {}", comp.trim());
                }
            }
        }

        LOG.debug("Bound ComponentResolver with components: {}", components);
        checkReadiness();
    }

    public void unbindComponentResolvers(ServiceReference<ComponentResolver> ref) {
        Map<String, Object> props = componentServices.remove(ref);
        if (props != null) {
            Object components = props.get("component");
            if (components != null) {
                if (components instanceof String[]) {
                    String[] comps = (String[]) components;
                    for (String comp : comps) {
                        foundComponents.remove(comp.trim());
                    }
                } else {
                    String[] comps = components.toString().split(",\\s*");
                    for (String comp : comps) {
                        foundComponents.remove(comp.trim());
                    }
                }
            }
            LOG.debug("Unbound ComponentResolver with components: {}", components);
            checkReadiness();
        }
    }

    // ConfigurerResolver bind/unbind callbacks
    @Reference(cardinality = ReferenceCardinality.MULTIPLE, 
            policy = ReferencePolicy.DYNAMIC)
    public void bindConfigurerResolvers(ServiceReference<ConfigurerResolver> ref) {

        Map<String, Object> props = getServiceProperties(ref);
        configurerServices.put(ref, props);

        LOG.debug("Bound ConfigurerResolver with configurers: {}", props.get("configurer"));
        checkReadiness();
    }

    public void unbindConfigurerResolvers(ServiceReference<ConfigurerResolver> ref) {
        configurerServices.remove(ref);
        LOG.debug("Unbound ConfigurerResolver");
        checkReadiness();
    }

    /**
     * Extracts service properties from a service reference into a map.
     */
    private Map<String, Object> getServiceProperties(ServiceReference<?> ref) {
        Map<String, Object> props = new ConcurrentHashMap<>();
        for (String key : ref.getPropertyKeys()) {
            props.put(key, ref.getProperty(key));
        }
        return props;
    }

    /**
     * Checks if all required Camel services are available and updates the condition service.
     */
    private synchronized void checkReadiness() {

        // Check if we have all required services
        boolean hasRequiredLanguages = foundLanguages.containsAll(REQUIRED_LANGUAGES);
        boolean hasRequiredComponents = foundComponents.containsAll(REQUIRED_COMPONENTS);
        boolean hasConfigurers = !configurerServices.isEmpty();

        boolean ready = hasRequiredLanguages && hasRequiredComponents && hasConfigurers;

        LOG.debug("Readiness check - Languages: {} (required: {}), Components: {} (required: {}), Configurers: {}, Ready: {}", 
                foundLanguages, REQUIRED_LANGUAGES, foundComponents, REQUIRED_COMPONENTS, configurerServices.size(), ready);

        // Update condition service if readiness changed
        String state = ready ? "ready" : "starting";
        if (ready) {
            LOG.info("Camel readiness changed to: {} - Found languages: {}, components: {}, configurers: {}", 
                    state, foundLanguages, foundComponents, configurerServices.size());
        }

        // Build aggregated properties from all discovered services
        Dictionary<String, Object> props = new Hashtable<>();
        props.put(Condition.CONDITION_ID, "Camel");
        props.put("camel", state);

        // Add aggregated language properties
        if (!foundLanguages.isEmpty()) {
            props.put("languages", String.join(",", foundLanguages));
        }

        // Add aggregated component properties  
        if (!foundComponents.isEmpty()) {
            props.put("components", String.join(",", foundComponents));
        }

        // Add configurer count
        props.put("configurers", configurerServices.size());

        // Add detailed service counts for debugging
        props.put("service.counts", String.format("languages:%d,components:%d,configurers:%d", 
                languageServices.size(), componentServices.size(), configurerServices.size()));

        updateConditionService(props);
    }

    /**
     * Updates or creates the OSGi Condition service registration with current readiness state.
     */
    private synchronized void updateConditionService(Dictionary<String, Object> props) {
        if (isNull(conditionRegistration)) {
            if (nonNull(bundleContext)) {
                conditionRegistration = bundleContext.registerService(Condition.class, this, props);
                LOG.info("Registered Camel condition service with initial state='{}'", props.get("camel"));
            } else {
                LOG.debug("Not registered Camel condition service because context is not available yet");
            }
        } else {
            conditionRegistration.setProperties(props);
            LOG.debug("Updated Camel condition service properties with state='{}', languages=[{}], components=[{}]", 
                    props.get("camel"), String.join(",", foundLanguages), String.join(",", foundComponents));
        }
    }
}
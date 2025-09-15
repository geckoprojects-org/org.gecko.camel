///*
// * Copyright (c) 2012 - 2025 Data In Motion and others.
// * All rights reserved.
// *
// * This program and the accompanying materials are made
// * available under the terms of the Eclipse Public License 2.0
// * which is available at https://www.eclipse.org/legal/epl-2.0/
// *
// * SPDX-License-Identifier: EPL-2.0
// *
// * Contributors:
// *      Mark Hoffmann - initial API and implementation
// */
//package org.eclipse.fennec.camel.old.impl;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.eclipse.emf.common.util.TreeIterator;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.util.EcoreUtil;
//import org.eclipse.fennec.camel.camelspring.BeanDefinition;
//import org.eclipse.fennec.camel.camelspring.FromDefinition;
//import org.eclipse.fennec.camel.camelspring.ProcessDefinition;
//import org.eclipse.fennec.camel.camelspring.RouteDefinition;
//import org.eclipse.fennec.camel.camelspring.SendDefinition;
//import org.eclipse.fennec.camel.camelspring.ToDefinition;
//import org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality;
//import org.eclipse.fennec.camel.whiteboard.pipeline.PipelineFactory;
//import org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency;
//import org.eclipse.fennec.camel.whiteboard.pipeline.TextualRouteDefinition;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// * Enhanced dependency extractor that works with both EMF-based Camel route models
// * and textual route definitions.
// * 
// * <p>This extractor can traverse the rich Camel EMF model to accurately identify
// * all dependencies, components, processors, and services required by a route.
// */
//public class CamelModelDependencyExtractor {
//
//    private static final Logger LOG = LoggerFactory.getLogger(CamelModelDependencyExtractor.class);
//
//    // Fallback regex patterns for textual routes
//    private static final Pattern COMPONENT_PATTERN = Pattern.compile("(\\w+)://");
//    private static final Pattern PROCESSOR_PATTERN = Pattern.compile("\\.processor\\(\"([^\"]+)\"\\)");
//    private static final Pattern BEAN_PATTERN = Pattern.compile("\\.bean\\(\"([^\"]+)\"\\)");
////    private static final Pattern TO_PATTERN = Pattern.compile("\\.to\\(\"([^\"]+)\"\\)");
//
//    private final PipelineFactory factory;
//
//    public CamelModelDependencyExtractor() {
//        this.factory = PipelineFactory.eINSTANCE;
//    }
//
//    /**
//     * Extract dependencies from any type of route definition.
//     * 
//     * @param routeDefinition the route definition (EMF Camel model or textual)
//     * @return set of extracted service dependencies
//     */
//    public Set<ServiceDependency> extractDependencies(org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinition routeDefinition) {
//        if (routeDefinition == null) {
//            return new HashSet<>();
//        }
//
//        Set<ServiceDependency> dependencies = new HashSet<>();
//
//        if (routeDefinition instanceof TextualRouteDefinition) {
//            // Handle textual route definitions with regex fallback
//            dependencies.addAll(extractFromTextualRoute((TextualRouteDefinition) routeDefinition));
//        } else {
//            // TODO: Handle other route definition types when they're added to the model
//            LOG.debug("Unknown route definition type: {}", routeDefinition.getClass().getSimpleName());
//        }
//
//        return dependencies;
//    }
//
//    /**
//     * Extract dependencies from a Camel EMF RouteDefinition model.
//     * 
//     * @param camelRoute the Camel EMF route definition
//     * @return set of extracted service dependencies
//     */
//    public Set<ServiceDependency> extractFromCamelModel(RouteDefinition camelRoute) {
//        if (camelRoute == null) {
//            return new HashSet<>();
//        }
//
//        Set<ServiceDependency> dependencies = new HashSet<>();
//
//        // Extract from 'from' endpoint
//        FromDefinition fromDef = camelRoute.getFrom();
//        if (fromDef != null && fromDef.getUri() != null) {
//            dependencies.addAll(extractFromEndpointUri(fromDef.getUri()));
//        }
//
//        // Traverse the entire route model to find all dependencies
//        TreeIterator<EObject> iterator = EcoreUtil.getAllContents(camelRoute, false);
//        while (iterator.hasNext()) {
//            EObject child = iterator.next();
//            dependencies.addAll(extractFromEObject(child));
//        }
//
//        LOG.debug("Extracted {} dependencies from Camel EMF route", dependencies.size());
//        return dependencies;
//    }
//
//    private Set<ServiceDependency> extractFromTextualRoute(TextualRouteDefinition textualRoute) {
//        Set<ServiceDependency> dependencies = new HashSet<>();
//        String routeText = textualRoute.getContent();
//        
//        if (routeText == null || routeText.trim().isEmpty()) {
//            return dependencies;
//        }
//
//        // Extract Camel components using regex (fallback method)
//        Matcher componentMatcher = COMPONENT_PATTERN.matcher(routeText);
//        while (componentMatcher.find()) {
//            String componentName = componentMatcher.group(1);
//            dependencies.add(createComponentDependency(componentName));
//        }
//
//        // Extract processor references
//        Matcher processorMatcher = PROCESSOR_PATTERN.matcher(routeText);
//        while (processorMatcher.find()) {
//            String processorName = processorMatcher.group(1);
//            dependencies.add(createProcessorDependency(processorName));
//        }
//
//        // Extract bean references
//        Matcher beanMatcher = BEAN_PATTERN.matcher(routeText);
//        while (beanMatcher.find()) {
//            String beanName = beanMatcher.group(1);
//            dependencies.add(createBeanDependency(beanName));
//        }
//
//        LOG.debug("Extracted {} dependencies from textual route using regex", dependencies.size());
//        return dependencies;
//    }
//
//    private Set<ServiceDependency> extractFromEObject(EObject eObject) {
//        Set<ServiceDependency> dependencies = new HashSet<>();
//
//        if (eObject instanceof ToDefinition) {
//            ToDefinition toDef = (ToDefinition) eObject;
//            if (toDef.getUri() != null) {
//                dependencies.addAll(extractFromEndpointUri(toDef.getUri()));
//            }
//        } else if (eObject instanceof SendDefinition) {
//            SendDefinition sendDef = (SendDefinition) eObject;
//            if (sendDef.getUri() != null) {
//                dependencies.addAll(extractFromEndpointUri(sendDef.getUri()));
//            }
//        } else if (eObject instanceof BeanDefinition) {
//            BeanDefinition beanDef = (BeanDefinition) eObject;
//            if (beanDef.getRef() != null) {
//                dependencies.add(createBeanDependency(beanDef.getRef()));
//            } else if (beanDef.getBeanType() != null) {
//                dependencies.add(createTypeDependency(beanDef.getBeanType()));
//            }
//        } else if (eObject instanceof ProcessDefinition) {
//            ProcessDefinition processDef = (ProcessDefinition) eObject;
//            if (processDef.getRef() != null) {
//                dependencies.add(createProcessorDependency(processDef.getRef()));
//            }
//        }
//
//        return dependencies;
//    }
//
//    private Set<ServiceDependency> extractFromEndpointUri(String endpointUri) {
//        Set<ServiceDependency> dependencies = new HashSet<>();
//
//        try {
//            // Parse the endpoint URI to extract component name
//            String componentName = extractComponentFromUri(endpointUri);
//            if (componentName != null && !componentName.isEmpty()) {
//                dependencies.add(createComponentDependency(componentName));
//            }
//        } catch (Exception e) {
//            LOG.warn("Failed to parse endpoint URI: {}", endpointUri, e);
//            // Fallback to regex extraction
//            Matcher matcher = COMPONENT_PATTERN.matcher(endpointUri);
//            if (matcher.find()) {
//                dependencies.add(createComponentDependency(matcher.group(1)));
//            }
//        }
//
//        return dependencies;
//    }
//
//    private String extractComponentFromUri(String endpointUri) {
//        if (endpointUri == null || endpointUri.isEmpty()) {
//            return null;
//        }
//
//        try {
//            // Handle standard URI format: component://path?options
//            if (endpointUri.contains("://")) {
//                return endpointUri.substring(0, endpointUri.indexOf("://"));
//            }
//            
//            // Handle short format: component:path
//            if (endpointUri.contains(":")) {
//                return endpointUri.substring(0, endpointUri.indexOf(":"));
//            }
//            
//            return endpointUri; // Simple component name
//        } catch (Exception e) {
//            LOG.debug("Failed to extract component from URI: {}", endpointUri, e);
//            return null;
//        }
//    }
//
//    private ServiceDependency createComponentDependency(String componentName) {
//        ServiceDependency dependency = factory.createServiceDependency();
//        dependency.setServiceInterface("org.apache.camel.Component");
//        dependency.setFilter("(component=" + componentName + ")");
//        dependency.setCardinality(DependencyCardinality.SINGLE);
//        dependency.setOptional(false);
//        dependency.setBindName(componentName + "-component");
//        return dependency;
//    }
//
//    private ServiceDependency createProcessorDependency(String processorName) {
//        ServiceDependency dependency = factory.createServiceDependency();
//        dependency.setServiceInterface("org.apache.camel.Processor");
//        dependency.setFilter("(processor.name=" + processorName + ")");
//        dependency.setCardinality(DependencyCardinality.SINGLE);
//        dependency.setOptional(false);
//        dependency.setBindName(processorName + "-processor");
//        return dependency;
//    }
//
//    private ServiceDependency createBeanDependency(String beanName) {
//        ServiceDependency dependency = factory.createServiceDependency();
//        dependency.setServiceInterface("java.lang.Object");
//        dependency.setFilter("(bean.name=" + beanName + ")");
//        dependency.setCardinality(DependencyCardinality.SINGLE);
//        dependency.setOptional(false);
//        dependency.setBindName(beanName);
//        return dependency;
//    }
//
//    private ServiceDependency createTypeDependency(String typeName) {
//        ServiceDependency dependency = factory.createServiceDependency();
//        dependency.setServiceInterface(typeName);
//        dependency.setFilter(null); // No filter for type-based dependencies
//        dependency.setCardinality(DependencyCardinality.SINGLE);
//        dependency.setOptional(false);
//        dependency.setBindName(typeName.substring(typeName.lastIndexOf('.') + 1).toLowerCase());
//        return dependency;
//    }
//}
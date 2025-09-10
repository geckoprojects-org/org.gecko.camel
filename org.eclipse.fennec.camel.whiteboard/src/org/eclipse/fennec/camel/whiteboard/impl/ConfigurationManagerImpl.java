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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.fennec.camel.whiteboard.ConfigurationManager;
import org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration;
import org.eclipse.fennec.camel.whiteboard.pipeline.Parameter;
import org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition;
import org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinition;
import org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency;
import org.eclipse.fennec.camel.whiteboard.pipeline.TextualRouteDefinition;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of the Configuration Manager service.
 * 
 * <p>This implementation provides configuration validation, dependency extraction,
 * and pipeline registry functionality for the Camel whiteboard pattern.
 */
@Component(immediate = true)
public class ConfigurationManagerImpl implements ConfigurationManager {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationManagerImpl.class);

    // Registry for pipeline definitions
    private final Map<String, PipelineDefinition> pipelineRegistry = new ConcurrentHashMap<>();

    // Enhanced dependency extractor for working with Camel EMF models
    private final CamelModelDependencyExtractor dependencyExtractor = new CamelModelDependencyExtractor();

    @Override
    public ValidationResult validateConsumerConfiguration(ConsumerConfiguration consumerConfig) {
        if (consumerConfig == null) {
            throw new IllegalArgumentException("Consumer configuration cannot be null");
        }

        List<String> errors = new ArrayList<>();
        List<String> warnings = new ArrayList<>();

        // Check basic fields
        if (consumerConfig.getId() == null || consumerConfig.getId().trim().isEmpty()) {
            errors.add("Consumer configuration must have a non-empty ID");
        }

        if (consumerConfig.getName() == null || consumerConfig.getName().trim().isEmpty()) {
            warnings.add("Consumer configuration should have a name for better identification");
        }

        // Check pipeline configuration
        boolean hasPipelineReference = consumerConfig.getPipeline() != null;
        boolean hasInlinePipeline = consumerConfig.getInlinePipeline() != null;

        if (!hasPipelineReference && !hasInlinePipeline) {
            errors.add("Consumer configuration must have either a pipeline reference or inline pipeline");
        } else if (hasPipelineReference && hasInlinePipeline) {
            errors.add("Consumer configuration cannot have both pipeline reference and inline pipeline");
        }

        // Validate pipeline reference if present
        if (hasPipelineReference) {
            PipelineDefinition referencedPipeline = consumerConfig.getPipeline();
            if (referencedPipeline.getId() == null || referencedPipeline.getId().trim().isEmpty()) {
                errors.add("Pipeline reference cannot be empty");
            } else if (!pipelineRegistry.containsKey(referencedPipeline.getId())) {
                warnings.add("Referenced pipeline '" + referencedPipeline.getId() + "' is not currently registered");
            }
        }

        // Validate inline pipeline if present
        if (hasInlinePipeline) {
            ValidationResult pipelineValidation = validatePipelineDefinition(consumerConfig.getInlinePipeline());
            errors.addAll(pipelineValidation.getErrors());
            warnings.addAll(pipelineValidation.getWarnings());
        }

        // Validate parameter values
        validateParameterValues(consumerConfig, errors, warnings);

        boolean isValid = errors.isEmpty();
        return new ValidationResult(isValid, errors, warnings);
    }

    @Override
    public ValidationResult validatePipelineDefinition(PipelineDefinition pipeline) {
        if (pipeline == null) {
            throw new IllegalArgumentException("Pipeline definition cannot be null");
        }

        List<String> errors = new ArrayList<>();
        List<String> warnings = new ArrayList<>();

        // Check basic fields
        if (pipeline.getId() == null || pipeline.getId().trim().isEmpty()) {
            errors.add("Pipeline definition must have a non-empty ID");
        }

        if (pipeline.getName() == null || pipeline.getName().trim().isEmpty()) {
            warnings.add("Pipeline definition should have a name for better identification");
        }

        if (pipeline.getVersion() == null || pipeline.getVersion().trim().isEmpty()) {
            warnings.add("Pipeline definition should have a version for better management");
        }

        // Validate route definition
        RouteDefinition routeDefinition = pipeline.getRouteDefinition();
        if (routeDefinition == null) {
            errors.add("Pipeline definition must have a route definition");
        } else {
            validateRouteDefinition(routeDefinition, errors, warnings);
        }

        // Validate parameters
        for (Parameter param : pipeline.getParameters()) {
            if (param.getName() == null || param.getName().trim().isEmpty()) {
                errors.add("Parameter must have a non-empty name");
            }
            if (param.getType() == null) {
                errors.add("Parameter '" + param.getName() + "' must have a type");
            }
        }

        // Validate dependencies
        for (ServiceDependency dependency : pipeline.getDependencies()) {
            if (dependency.getServiceInterface() == null || dependency.getServiceInterface().trim().isEmpty()) {
                errors.add("Service dependency must have a non-empty service interface");
            }
        }

        boolean isValid = errors.isEmpty();
        return new ValidationResult(isValid, errors, warnings);
    }

    @Override
    public Set<ServiceDependency> extractDependencies(PipelineDefinition pipeline) {
        if (pipeline == null) {
            throw new IllegalArgumentException("Pipeline definition cannot be null");
        }

        Set<ServiceDependency> dependencies = new HashSet<>();

        // Add explicitly declared dependencies
        dependencies.addAll(pipeline.getDependencies());

        // Extract implicit dependencies from route definition using enhanced extractor
        RouteDefinition routeDefinition = pipeline.getRouteDefinition();
        if (routeDefinition != null) {
            dependencies.addAll(dependencyExtractor.extractDependencies(routeDefinition));
        }

        LOG.debug("Extracted {} dependencies from pipeline {}", dependencies.size(), pipeline.getId());
        return dependencies;
    }

    @Override
    public PipelineDefinition getEffectivePipeline(ConsumerConfiguration consumerConfig) {
        if (consumerConfig == null) {
            throw new IllegalArgumentException("Consumer configuration cannot be null");
        }

        // Check for inline pipeline first
        if (consumerConfig.getInlinePipeline() != null) {
            return consumerConfig.getInlinePipeline();
        }

        // Check for pipeline reference
        if (consumerConfig.getPipeline() != null) {
            PipelineDefinition referencedPipeline = consumerConfig.getPipeline();
            if (referencedPipeline.getId() != null && !referencedPipeline.getId().trim().isEmpty()) {
                return pipelineRegistry.get(referencedPipeline.getId());
            }
        }

        return null;
    }

    @Override
    public void registerPipelineDefinition(PipelineDefinition pipeline) {
        if (pipeline == null) {
            throw new IllegalArgumentException("Pipeline definition cannot be null");
        }

        ValidationResult validation = validatePipelineDefinition(pipeline);
        if (!validation.isValid()) {
            throw new IllegalArgumentException("Invalid pipeline definition: " + validation.getErrors());
        }

        String pipelineId = pipeline.getId();
        pipelineRegistry.put(pipelineId, pipeline);
        LOG.info("Registered pipeline definition: {}", pipelineId);
    }

    @Override
    public void unregisterPipelineDefinition(String pipelineId) {
        if (pipelineId == null || pipelineId.trim().isEmpty()) {
            throw new IllegalArgumentException("Pipeline ID cannot be null or empty");
        }

        PipelineDefinition removed = pipelineRegistry.remove(pipelineId);
        if (removed != null) {
            LOG.info("Unregistered pipeline definition: {}", pipelineId);
        } else {
            LOG.debug("Pipeline definition {} was not registered", pipelineId);
        }
    }

    @Override
    public PipelineDefinition getPipelineDefinition(String pipelineId) {
        if (pipelineId == null || pipelineId.trim().isEmpty()) {
            throw new IllegalArgumentException("Pipeline ID cannot be null or empty");
        }
        return pipelineRegistry.get(pipelineId);
    }

    @Override
    public List<PipelineDefinition> getAllPipelineDefinitions() {
        return new ArrayList<>(pipelineRegistry.values());
    }

    private void validateParameterValues(ConsumerConfiguration consumerConfig, List<String> errors, List<String> warnings) {
        PipelineDefinition effectivePipeline = getEffectivePipeline(consumerConfig);
        if (effectivePipeline == null) {
            return; // Cannot validate parameter values without pipeline
        }

        Map<String, Parameter> pipelineParameters = new HashMap<>();
        for (Parameter param : effectivePipeline.getParameters()) {
            pipelineParameters.put(param.getName(), param);
        }

        // Check provided parameter values
        for (ParameterValue paramValue : consumerConfig.getParameterValues()) {
            String paramName = paramValue.getParameterName();
            if (!pipelineParameters.containsKey(paramName)) {
                warnings.add("Parameter value '" + paramName + "' is not defined in the pipeline");
            } else {
                Parameter param = pipelineParameters.get(paramName);
                // Additional type validation could be added here
            }
        }

        // Check for missing required parameters
        for (Parameter param : effectivePipeline.getParameters()) {
            if (param.isRequired()) {
                boolean hasValue = consumerConfig.getParameterValues().stream()
                    .anyMatch(pv -> param.getName().equals(pv.getParameterName()));
                if (!hasValue) {
                    errors.add("Required parameter '" + param.getName() + "' is not provided");
                }
            }
        }
    }

    private void validateRouteDefinition(RouteDefinition routeDefinition, List<String> errors, List<String> warnings) {
        if (routeDefinition instanceof TextualRouteDefinition) {
            TextualRouteDefinition textualRoute = (TextualRouteDefinition) routeDefinition;
            String routeText = textualRoute.getContent();
            if (routeText == null || routeText.trim().isEmpty()) {
                errors.add("Route definition cannot be empty");
            }
            // Additional syntax validation could be added here
        }
    }

}
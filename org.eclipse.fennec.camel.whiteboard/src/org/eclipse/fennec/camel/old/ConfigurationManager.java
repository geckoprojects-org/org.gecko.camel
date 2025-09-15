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
package org.eclipse.fennec.camel.old;

import java.util.List;
import java.util.Set;

import org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition;
import org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency;
import org.osgi.annotation.versioning.ProviderType;

/**
 * Service interface for managing Camel pipeline configurations.
 * 
 * <p>The Configuration Manager is responsible for:
 * <ul>
 * <li>Parsing and validating consumer configurations</li>
 * <li>Managing reusable pipeline definitions</li>
 * <li>Extracting service dependencies from pipeline configurations</li>
 * <li>Handling configuration updates and lifecycle</li>
 * </ul>
 */
@ProviderType
public interface ConfigurationManager {

    /**
     * Validates a consumer configuration for correctness and completeness.
     * 
     * @param consumerConfig the consumer configuration to validate
     * @return validation result with any errors or warnings
     * @throws IllegalArgumentException if consumerConfig is null
     */
    ValidationResult validateConsumerConfiguration(ConsumerConfiguration consumerConfig);

    /**
     * Validates a pipeline definition for correctness and completeness.
     * 
     * @param pipeline the pipeline definition to validate
     * @return validation result with any errors or warnings
     * @throws IllegalArgumentException if pipeline is null
     */
    ValidationResult validatePipelineDefinition(PipelineDefinition pipeline);

    /**
     * Extracts all service dependencies from a pipeline definition by analyzing
     * the route configuration and identifying required Camel components, processors,
     * languages, and other OSGi services.
     * 
     * @param pipeline the pipeline definition to analyze
     * @return set of service dependencies required by this pipeline
     * @throws IllegalArgumentException if pipeline is null
     * @throws ConfigurationException if the pipeline cannot be analyzed
     */
    Set<ServiceDependency> extractDependencies(PipelineDefinition pipeline);

    /**
     * Gets the effective pipeline definition for a consumer configuration.
     * If the consumer references a pipeline, returns that pipeline.
     * If the consumer has an inline pipeline, returns the inline pipeline.
     * 
     * @param consumerConfig the consumer configuration
     * @return the effective pipeline definition, or null if none available
     * @throws IllegalArgumentException if consumerConfig is null
     */
    PipelineDefinition getEffectivePipeline(ConsumerConfiguration consumerConfig);

    /**
     * Registers a pipeline definition for reuse by consumers.
     * 
     * @param pipeline the pipeline definition to register
     * @throws IllegalArgumentException if pipeline is null or invalid
     * @throws ConfigurationException if registration fails
     */
    void registerPipelineDefinition(PipelineDefinition pipeline);

    /**
     * Unregisters a pipeline definition.
     * 
     * @param pipelineId the ID of the pipeline to unregister
     * @throws IllegalArgumentException if pipelineId is null or empty
     */
    void unregisterPipelineDefinition(String pipelineId);

    /**
     * Gets a registered pipeline definition by ID.
     * 
     * @param pipelineId the pipeline ID
     * @return the pipeline definition, or null if not found
     * @throws IllegalArgumentException if pipelineId is null or empty
     */
    PipelineDefinition getPipelineDefinition(String pipelineId);

    /**
     * Gets all registered pipeline definitions.
     * 
     * @return list of all registered pipeline definitions
     */
    List<PipelineDefinition> getAllPipelineDefinitions();

    /**
     * Configuration exception for handling configuration-related errors.
     */
    public static class ConfigurationException extends Exception {
        private static final long serialVersionUID = 1L;

        public ConfigurationException(String message) {
            super(message);
        }

        public ConfigurationException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    /**
     * Result of configuration validation.
     */
    public static class ValidationResult {
        private final boolean valid;
        private final List<String> errors;
        private final List<String> warnings;

        public ValidationResult(boolean valid, List<String> errors, List<String> warnings) {
            this.valid = valid;
            this.errors = errors != null ? List.copyOf(errors) : List.of();
            this.warnings = warnings != null ? List.copyOf(warnings) : List.of();
        }

        public boolean isValid() {
            return valid;
        }

        public List<String> getErrors() {
            return errors;
        }

        public List<String> getWarnings() {
            return warnings;
        }

        public boolean hasErrors() {
            return !errors.isEmpty();
        }

        public boolean hasWarnings() {
            return !warnings.isEmpty();
        }
    }
}
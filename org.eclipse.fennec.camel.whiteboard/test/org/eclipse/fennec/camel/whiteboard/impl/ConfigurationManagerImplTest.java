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

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.eclipse.fennec.camel.whiteboard.ConfigurationManager;
import org.eclipse.fennec.camel.whiteboard.ConfigurationManager.ValidationResult;
import org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration;
import org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality;
import org.eclipse.fennec.camel.whiteboard.pipeline.Parameter;
import org.eclipse.fennec.camel.whiteboard.pipeline.ParameterType;
import org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelineFactory;
import org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinitionFormat;
import org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency;
import org.eclipse.fennec.camel.whiteboard.pipeline.TextualRouteDefinition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for ConfigurationManagerImpl that don't require OSGi runtime.
 * 
 * These tests focus on the core logic without OSGi service dependencies.
 */
public class ConfigurationManagerImplTest {

    private ConfigurationManager configManager;
    private PipelineFactory factory;

    @BeforeEach
    void setUp() {
        configManager = new ConfigurationManagerImpl();
        factory = PipelineFactory.eINSTANCE;
    }

    @Test
    void testValidateConsumerConfiguration_ValidInlinePipeline() {
        // Create a valid consumer configuration with inline pipeline
        ConsumerConfiguration consumer = factory.createConsumerConfiguration();
        consumer.setId("test-consumer");
        consumer.setName("Test Consumer");
        consumer.setAutoStart(true);

        // Create inline pipeline
        PipelineDefinition pipeline = createValidPipeline("inline-pipeline");
        consumer.setInlinePipeline(pipeline);

        ValidationResult result = configManager.validateConsumerConfiguration(consumer);

        assertTrue(result.isValid());
        assertFalse(result.hasErrors());
    }

    @Test
    void testValidateConsumerConfiguration_MissingId() {
        ConsumerConfiguration consumer = factory.createConsumerConfiguration();
        consumer.setName("Test Consumer");
        
        PipelineDefinition pipeline = createValidPipeline("test-pipeline");
        consumer.setInlinePipeline(pipeline);

        ValidationResult result = configManager.validateConsumerConfiguration(consumer);

        assertFalse(result.isValid());
        assertTrue(result.hasErrors());
        assertTrue(result.getErrors().stream()
            .anyMatch(error -> error.contains("Consumer configuration must have a non-empty ID")));
    }

    @Test
    void testValidateConsumerConfiguration_NoPipelineOrReference() {
        ConsumerConfiguration consumer = factory.createConsumerConfiguration();
        consumer.setId("test-consumer");
        consumer.setName("Test Consumer");

        ValidationResult result = configManager.validateConsumerConfiguration(consumer);

        assertFalse(result.isValid());
        assertTrue(result.hasErrors());
        assertTrue(result.getErrors().stream()
            .anyMatch(error -> error.contains("must have either a pipeline reference or inline pipeline")));
    }

    @Test
    void testValidateConsumerConfiguration_BothPipelineAndReference() {
        ConsumerConfiguration consumer = factory.createConsumerConfiguration();
        consumer.setId("test-consumer");
        consumer.setName("Test Consumer");
        
        PipelineDefinition pipeline = createValidPipeline("test-pipeline");
        consumer.setInlinePipeline(pipeline);
        consumer.setPipeline(pipeline); // This should cause an error

        ValidationResult result = configManager.validateConsumerConfiguration(consumer);

        assertFalse(result.isValid());
        assertTrue(result.hasErrors());
        assertTrue(result.getErrors().stream()
            .anyMatch(error -> error.contains("cannot have both pipeline reference and inline pipeline")));
    }

    @Test
    void testValidatePipelineDefinition_Valid() {
        PipelineDefinition pipeline = createValidPipeline("test-pipeline");

        ValidationResult result = configManager.validatePipelineDefinition(pipeline);

        assertTrue(result.isValid());
        assertFalse(result.hasErrors());
    }

    @Test
    void testValidatePipelineDefinition_MissingId() {
        PipelineDefinition pipeline = factory.createPipelineDefinition();
        pipeline.setName("Test Pipeline");
        pipeline.setVersion("1.0.0");
        
        TextualRouteDefinition routeDefinition = factory.createTextualRouteDefinition();
        routeDefinition.setFormat(RouteDefinitionFormat.JAVA_DSL);
        routeDefinition.setContent("from(\"timer:test\").to(\"log:test\")");
        pipeline.setRouteDefinition(routeDefinition);

        ValidationResult result = configManager.validatePipelineDefinition(pipeline);

        assertFalse(result.isValid());
        assertTrue(result.hasErrors());
        assertTrue(result.getErrors().stream()
            .anyMatch(error -> error.contains("Pipeline definition must have a non-empty ID")));
    }

    @Test
    void testValidatePipelineDefinition_EmptyRouteDefinition() {
        PipelineDefinition pipeline = factory.createPipelineDefinition();
        pipeline.setId("test-pipeline");
        pipeline.setName("Test Pipeline");
        pipeline.setVersion("1.0.0");
        
        TextualRouteDefinition routeDefinition = factory.createTextualRouteDefinition();
        routeDefinition.setFormat(RouteDefinitionFormat.JAVA_DSL);
        routeDefinition.setContent(""); // Empty content should cause error
        pipeline.setRouteDefinition(routeDefinition);

        ValidationResult result = configManager.validatePipelineDefinition(pipeline);

        assertFalse(result.isValid());
        assertTrue(result.hasErrors());
        assertTrue(result.getErrors().stream()
            .anyMatch(error -> error.contains("Route definition cannot be empty")));
    }

    @Test
    void testExtractDependencies_FromRouteText() {
        PipelineDefinition pipeline = factory.createPipelineDefinition();
        pipeline.setId("test-pipeline");
        
        TextualRouteDefinition routeDefinition = factory.createTextualRouteDefinition();
        routeDefinition.setFormat(RouteDefinitionFormat.JAVA_DSL);
        routeDefinition.setContent("from(\"timer://test\").processor(\"myProcessor\").bean(\"myBean\").to(\"direct://output\")");
        pipeline.setRouteDefinition(routeDefinition);

        Set<ServiceDependency> dependencies = configManager.extractDependencies(pipeline);

        assertFalse(dependencies.isEmpty());
        
        // Should extract timer and direct components using enhanced extractor
        assertTrue(dependencies.stream().anyMatch(dep -> 
            dep.getFilter() != null && dep.getFilter().contains("timer") && dep.getServiceInterface().equals("org.apache.camel.Component")));
        assertTrue(dependencies.stream().anyMatch(dep -> 
            dep.getFilter() != null && dep.getFilter().contains("direct") && dep.getServiceInterface().equals("org.apache.camel.Component")));
        
        // Should extract processor reference
        assertTrue(dependencies.stream().anyMatch(dep -> 
            dep.getFilter() != null && dep.getFilter().contains("myProcessor") && dep.getServiceInterface().equals("org.apache.camel.Processor")));
        
        // Should extract bean reference
        assertTrue(dependencies.stream().anyMatch(dep -> 
            dep.getFilter() != null && dep.getFilter().contains("myBean") && dep.getServiceInterface().equals("java.lang.Object")));
    }

    @Test
    void testExtractDependencies_WithExplicitDependencies() {
        PipelineDefinition pipeline = factory.createPipelineDefinition();
        pipeline.setId("test-pipeline");
        
        // Add explicit dependency
        ServiceDependency explicitDep = factory.createServiceDependency();
        explicitDep.setServiceInterface("com.example.MyService");
        explicitDep.setFilter("(name=myService)");
        explicitDep.setCardinality(DependencyCardinality.SINGLE);
        pipeline.getDependencies().add(explicitDep);
        
        TextualRouteDefinition routeDefinition = factory.createTextualRouteDefinition();
        routeDefinition.setFormat(RouteDefinitionFormat.JAVA_DSL);
        routeDefinition.setContent("from(\"timer://test\").to(\"log://test\")");
        pipeline.setRouteDefinition(routeDefinition);

        Set<ServiceDependency> dependencies = configManager.extractDependencies(pipeline);

        // Should include both explicit and implicit dependencies
        assertTrue(dependencies.stream().anyMatch(dep -> 
            dep.getServiceInterface().equals("com.example.MyService")));
        assertTrue(dependencies.stream().anyMatch(dep -> 
            dep.getFilter() != null && dep.getFilter().contains("timer")));
    }

    @Test
    void testPipelineRegistry_Operations() {
        PipelineDefinition pipeline1 = createValidPipeline("pipeline1");
        PipelineDefinition pipeline2 = createValidPipeline("pipeline2");

        // Register pipelines
        assertDoesNotThrow(() -> configManager.registerPipelineDefinition(pipeline1));
        assertDoesNotThrow(() -> configManager.registerPipelineDefinition(pipeline2));

        // Retrieve pipelines
        PipelineDefinition retrieved1 = configManager.getPipelineDefinition("pipeline1");
        assertNotNull(retrieved1);
        assertEquals("pipeline1", retrieved1.getId());

        PipelineDefinition retrieved2 = configManager.getPipelineDefinition("pipeline2");
        assertNotNull(retrieved2);
        assertEquals("pipeline2", retrieved2.getId());

        // Get all pipelines
        assertEquals(2, configManager.getAllPipelineDefinitions().size());

        // Unregister pipeline
        configManager.unregisterPipelineDefinition("pipeline1");
        assertNull(configManager.getPipelineDefinition("pipeline1"));
        assertEquals(1, configManager.getAllPipelineDefinitions().size());
    }

    @Test
    void testGetEffectivePipeline_InlinePipeline() {
        ConsumerConfiguration consumer = factory.createConsumerConfiguration();
        consumer.setId("test-consumer");
        
        PipelineDefinition inlinePipeline = createValidPipeline("inline-pipeline");
        consumer.setInlinePipeline(inlinePipeline);

        PipelineDefinition effective = configManager.getEffectivePipeline(consumer);

        assertNotNull(effective);
        assertEquals("inline-pipeline", effective.getId());
        assertSame(inlinePipeline, effective);
    }

    @Test
    void testGetEffectivePipeline_ReferencedPipeline() {
        // Register a pipeline
        PipelineDefinition registeredPipeline = createValidPipeline("registered-pipeline");
        configManager.registerPipelineDefinition(registeredPipeline);

        ConsumerConfiguration consumer = factory.createConsumerConfiguration();
        consumer.setId("test-consumer");
        consumer.setPipeline(registeredPipeline);

        PipelineDefinition effective = configManager.getEffectivePipeline(consumer);

        assertNotNull(effective);
        assertEquals("registered-pipeline", effective.getId());
    }

    @Test
    void testParameterValidation_RequiredParameterMissing() {
        // Create pipeline with required parameter
        PipelineDefinition pipeline = createValidPipeline("test-pipeline");
        Parameter requiredParam = factory.createParameter();
        requiredParam.setName("requiredParam");
        requiredParam.setType(ParameterType.STRING);
        requiredParam.setRequired(true);
        pipeline.getParameters().add(requiredParam);

        // Create consumer without providing the required parameter
        ConsumerConfiguration consumer = factory.createConsumerConfiguration();
        consumer.setId("test-consumer");
        consumer.setInlinePipeline(pipeline);

        ValidationResult result = configManager.validateConsumerConfiguration(consumer);

        assertFalse(result.isValid());
        assertTrue(result.hasErrors());
        assertTrue(result.getErrors().stream()
            .anyMatch(error -> error.contains("Required parameter 'requiredParam' is not provided")));
    }

    @Test
    void testParameterValidation_UnknownParameterProvided() {
        PipelineDefinition pipeline = createValidPipeline("test-pipeline");
        
        ConsumerConfiguration consumer = factory.createConsumerConfiguration();
        consumer.setId("test-consumer");
        consumer.setInlinePipeline(pipeline);
        
        // Add parameter value that doesn't exist in pipeline
        ParameterValue paramValue = factory.createParameterValue();
        paramValue.setParameterName("unknownParam");
        paramValue.setValue("someValue");
        consumer.getParameterValues().add(paramValue);

        ValidationResult result = configManager.validateConsumerConfiguration(consumer);

        assertTrue(result.isValid()); // Should be valid but have warnings
        assertTrue(result.hasWarnings());
        assertTrue(result.getWarnings().stream()
            .anyMatch(warning -> warning.contains("Parameter value 'unknownParam' is not defined in the pipeline")));
    }

    @Test
    void testEnhancedDependencyExtractor_DirectUsage() {
        // Test the enhanced dependency extractor directly
        CamelModelDependencyExtractor extractor = new CamelModelDependencyExtractor();
        
        TextualRouteDefinition routeDefinition = factory.createTextualRouteDefinition();
        routeDefinition.setFormat(RouteDefinitionFormat.JAVA_DSL);
        routeDefinition.setContent("from(\"file://input\").to(\"activemq://queue:output\")");

        Set<ServiceDependency> dependencies = extractor.extractDependencies(routeDefinition);

        assertFalse(dependencies.isEmpty());
        
        // Should extract file and activemq components
        assertTrue(dependencies.stream().anyMatch(dep -> 
            dep.getFilter() != null && dep.getFilter().contains("file") && dep.getServiceInterface().equals("org.apache.camel.Component")));
        assertTrue(dependencies.stream().anyMatch(dep -> 
            dep.getFilter() != null && dep.getFilter().contains("activemq") && dep.getServiceInterface().equals("org.apache.camel.Component")));
            
        // Check that bind names are set properly
        assertTrue(dependencies.stream().anyMatch(dep -> 
            dep.getBindName() != null && dep.getBindName().contains("component")));
    }

    private PipelineDefinition createValidPipeline(String id) {
        PipelineDefinition pipeline = factory.createPipelineDefinition();
        pipeline.setId(id);
        pipeline.setName("Test Pipeline " + id);
        pipeline.setVersion("1.0.0");
        pipeline.setDescription("Test pipeline for unit testing");

        TextualRouteDefinition routeDefinition = factory.createTextualRouteDefinition();
        routeDefinition.setFormat(RouteDefinitionFormat.JAVA_DSL);
        routeDefinition.setContent("from(\"timer://test\").to(\"log://test\")");
        pipeline.setRouteDefinition(routeDefinition);

        return pipeline;
    }
}
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
package org.eclipse.fennec.camel.whiteboard.pipeline;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelineFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = PipelinePackage.eNS_URI, genModel = "/model/camel-pipeline.genmodel", genModelSourceLocations = {"model/camel-pipeline.genmodel","org.eclipse.fennec.camel.whiteboard/model/camel-pipeline.genmodel"}, ecore="/model/camel-pipeline.ecore", ecoreSourceLocations="/model/camel-pipeline.ecore")
public interface PipelinePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pipeline";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fennec.eclipse.org/camel/pipeline/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pipeline";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipelinePackage eINSTANCE = org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getPipelineDefinition()
	 * @generated
	 */
	int PIPELINE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION__DEPENDENCIES = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION__PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Route Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION__ROUTE_DEFINITION = 6;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ServiceDependencyImpl <em>Service Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.ServiceDependencyImpl
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getServiceDependency()
	 * @generated
	 */
	int SERVICE_DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Service Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__SERVICE_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__FILTER = 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__CARDINALITY = 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__OPTIONAL = 3;

	/**
	 * The feature id for the '<em><b>Bind Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__BIND_NAME = 4;

	/**
	 * The number of structural features of the '<em>Service Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.ParameterImpl
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.RouteDefinitionImpl <em>Route Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.RouteDefinitionImpl
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getRouteDefinition()
	 * @generated
	 */
	int ROUTE_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_DEFINITION__FORMAT = 0;

	/**
	 * The number of structural features of the '<em>Route Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.JavaDSLRouteDefinitionImpl <em>Java DSL Route Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.JavaDSLRouteDefinitionImpl
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getJavaDSLRouteDefinition()
	 * @generated
	 */
	int JAVA_DSL_ROUTE_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DSL_ROUTE_DEFINITION__FORMAT = ROUTE_DEFINITION__FORMAT;

	/**
	 * The feature id for the '<em><b>Builder Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DSL_ROUTE_DEFINITION__BUILDER_CLASS_NAME = ROUTE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java DSL Route Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DSL_ROUTE_DEFINITION_FEATURE_COUNT = ROUTE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Java DSL Route Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DSL_ROUTE_DEFINITION_OPERATION_COUNT = ROUTE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.TextualRouteDefinitionImpl <em>Textual Route Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.TextualRouteDefinitionImpl
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getTextualRouteDefinition()
	 * @generated
	 */
	int TEXTUAL_ROUTE_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ROUTE_DEFINITION__FORMAT = ROUTE_DEFINITION__FORMAT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ROUTE_DEFINITION__CONTENT = ROUTE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textual Route Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ROUTE_DEFINITION_FEATURE_COUNT = ROUTE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Textual Route Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ROUTE_DEFINITION_OPERATION_COUNT = ROUTE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ConsumerConfigurationImpl <em>Consumer Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.ConsumerConfigurationImpl
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getConsumerConfiguration()
	 * @generated
	 */
	int CONSUMER_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_CONFIGURATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_CONFIGURATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_CONFIGURATION__PIPELINE = 2;

	/**
	 * The feature id for the '<em><b>Inline Pipeline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_CONFIGURATION__INLINE_PIPELINE = 3;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_CONFIGURATION__PARAMETER_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Auto Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_CONFIGURATION__AUTO_START = 5;

	/**
	 * The number of structural features of the '<em>Consumer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Consumer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.ParameterValueImpl
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__PARAMETER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality <em>Dependency Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getDependencyCardinality()
	 * @generated
	 */
	int DEPENDENCY_CARDINALITY = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ParameterType
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinitionFormat <em>Route Definition Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinitionFormat
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getRouteDefinitionFormat()
	 * @generated
	 */
	int ROUTE_DEFINITION_FORMAT = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition
	 * @generated
	 */
	EClass getPipelineDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getId()
	 * @see #getPipelineDefinition()
	 * @generated
	 */
	EAttribute getPipelineDefinition_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getName()
	 * @see #getPipelineDefinition()
	 * @generated
	 */
	EAttribute getPipelineDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getVersion()
	 * @see #getPipelineDefinition()
	 * @generated
	 */
	EAttribute getPipelineDefinition_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getDescription()
	 * @see #getPipelineDefinition()
	 * @generated
	 */
	EAttribute getPipelineDefinition_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getDependencies()
	 * @see #getPipelineDefinition()
	 * @generated
	 */
	EReference getPipelineDefinition_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getParameters()
	 * @see #getPipelineDefinition()
	 * @generated
	 */
	EReference getPipelineDefinition_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getRouteDefinition <em>Route Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route Definition</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition#getRouteDefinition()
	 * @see #getPipelineDefinition()
	 * @generated
	 */
	EReference getPipelineDefinition_RouteDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency <em>Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Dependency</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency
	 * @generated
	 */
	EClass getServiceDependency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Interface</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getServiceInterface()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_ServiceInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getFilter()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getCardinality()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#isOptional()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getBindName <em>Bind Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind Name</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency#getBindName()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_BindName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.camel.whiteboard.pipeline.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.Parameter#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.Parameter#isRequired()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.Parameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.Parameter#getDefaultValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinition <em>Route Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Definition</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinition
	 * @generated
	 */
	EClass getRouteDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinition#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinition#getFormat()
	 * @see #getRouteDefinition()
	 * @generated
	 */
	EAttribute getRouteDefinition_Format();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.camel.whiteboard.pipeline.JavaDSLRouteDefinition <em>Java DSL Route Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java DSL Route Definition</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.JavaDSLRouteDefinition
	 * @generated
	 */
	EClass getJavaDSLRouteDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.JavaDSLRouteDefinition#getBuilderClassName <em>Builder Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Builder Class Name</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.JavaDSLRouteDefinition#getBuilderClassName()
	 * @see #getJavaDSLRouteDefinition()
	 * @generated
	 */
	EAttribute getJavaDSLRouteDefinition_BuilderClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.camel.whiteboard.pipeline.TextualRouteDefinition <em>Textual Route Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Route Definition</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.TextualRouteDefinition
	 * @generated
	 */
	EClass getTextualRouteDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.TextualRouteDefinition#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.TextualRouteDefinition#getContent()
	 * @see #getTextualRouteDefinition()
	 * @generated
	 */
	EAttribute getTextualRouteDefinition_Content();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration <em>Consumer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer Configuration</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration
	 * @generated
	 */
	EClass getConsumerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getId()
	 * @see #getConsumerConfiguration()
	 * @generated
	 */
	EAttribute getConsumerConfiguration_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getName()
	 * @see #getConsumerConfiguration()
	 * @generated
	 */
	EAttribute getConsumerConfiguration_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getPipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pipeline</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getPipeline()
	 * @see #getConsumerConfiguration()
	 * @generated
	 */
	EReference getConsumerConfiguration_Pipeline();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getInlinePipeline <em>Inline Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inline Pipeline</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getInlinePipeline()
	 * @see #getConsumerConfiguration()
	 * @generated
	 */
	EReference getConsumerConfiguration_InlinePipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Values</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#getParameterValues()
	 * @see #getConsumerConfiguration()
	 * @generated
	 */
	EReference getConsumerConfiguration_ParameterValues();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#isAutoStart <em>Auto Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Start</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration#isAutoStart()
	 * @see #getConsumerConfiguration()
	 * @generated
	 */
	EAttribute getConsumerConfiguration_AutoStart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue#getParameterName()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue#getValue()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality <em>Dependency Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Cardinality</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality
	 * @generated
	 */
	EEnum getDependencyCardinality();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinitionFormat <em>Route Definition Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Route Definition Format</em>'.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinitionFormat
	 * @generated
	 */
	EEnum getRouteDefinitionFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PipelineFactory getPipelineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getPipelineDefinition()
		 * @generated
		 */
		EClass PIPELINE_DEFINITION = eINSTANCE.getPipelineDefinition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_DEFINITION__ID = eINSTANCE.getPipelineDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_DEFINITION__NAME = eINSTANCE.getPipelineDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_DEFINITION__VERSION = eINSTANCE.getPipelineDefinition_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_DEFINITION__DESCRIPTION = eINSTANCE.getPipelineDefinition_Description();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_DEFINITION__DEPENDENCIES = eINSTANCE.getPipelineDefinition_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_DEFINITION__PARAMETERS = eINSTANCE.getPipelineDefinition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Route Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_DEFINITION__ROUTE_DEFINITION = eINSTANCE.getPipelineDefinition_RouteDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ServiceDependencyImpl <em>Service Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.ServiceDependencyImpl
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getServiceDependency()
		 * @generated
		 */
		EClass SERVICE_DEPENDENCY = eINSTANCE.getServiceDependency();

		/**
		 * The meta object literal for the '<em><b>Service Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__SERVICE_INTERFACE = eINSTANCE.getServiceDependency_ServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__FILTER = eINSTANCE.getServiceDependency_Filter();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__CARDINALITY = eINSTANCE.getServiceDependency_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__OPTIONAL = eINSTANCE.getServiceDependency_Optional();

		/**
		 * The meta object literal for the '<em><b>Bind Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__BIND_NAME = eINSTANCE.getServiceDependency_BindName();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.ParameterImpl
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REQUIRED = eINSTANCE.getParameter_Required();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.RouteDefinitionImpl <em>Route Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.RouteDefinitionImpl
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getRouteDefinition()
		 * @generated
		 */
		EClass ROUTE_DEFINITION = eINSTANCE.getRouteDefinition();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_DEFINITION__FORMAT = eINSTANCE.getRouteDefinition_Format();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.JavaDSLRouteDefinitionImpl <em>Java DSL Route Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.JavaDSLRouteDefinitionImpl
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getJavaDSLRouteDefinition()
		 * @generated
		 */
		EClass JAVA_DSL_ROUTE_DEFINITION = eINSTANCE.getJavaDSLRouteDefinition();

		/**
		 * The meta object literal for the '<em><b>Builder Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DSL_ROUTE_DEFINITION__BUILDER_CLASS_NAME = eINSTANCE.getJavaDSLRouteDefinition_BuilderClassName();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.TextualRouteDefinitionImpl <em>Textual Route Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.TextualRouteDefinitionImpl
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getTextualRouteDefinition()
		 * @generated
		 */
		EClass TEXTUAL_ROUTE_DEFINITION = eINSTANCE.getTextualRouteDefinition();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_ROUTE_DEFINITION__CONTENT = eINSTANCE.getTextualRouteDefinition_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ConsumerConfigurationImpl <em>Consumer Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.ConsumerConfigurationImpl
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getConsumerConfiguration()
		 * @generated
		 */
		EClass CONSUMER_CONFIGURATION = eINSTANCE.getConsumerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMER_CONFIGURATION__ID = eINSTANCE.getConsumerConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMER_CONFIGURATION__NAME = eINSTANCE.getConsumerConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Pipeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER_CONFIGURATION__PIPELINE = eINSTANCE.getConsumerConfiguration_Pipeline();

		/**
		 * The meta object literal for the '<em><b>Inline Pipeline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER_CONFIGURATION__INLINE_PIPELINE = eINSTANCE.getConsumerConfiguration_InlinePipeline();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER_CONFIGURATION__PARAMETER_VALUES = eINSTANCE.getConsumerConfiguration_ParameterValues();

		/**
		 * The meta object literal for the '<em><b>Auto Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMER_CONFIGURATION__AUTO_START = eINSTANCE.getConsumerConfiguration_AutoStart();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.ParameterValueImpl
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__PARAMETER_NAME = eINSTANCE.getParameterValue_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__VALUE = eINSTANCE.getParameterValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality <em>Dependency Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getDependencyCardinality()
		 * @generated
		 */
		EEnum DEPENDENCY_CARDINALITY = eINSTANCE.getDependencyCardinality();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.ParameterType
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinitionFormat <em>Route Definition Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinitionFormat
		 * @see org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelinePackageImpl#getRouteDefinitionFormat()
		 * @generated
		 */
		EEnum ROUTE_DEFINITION_FORMAT = eINSTANCE.getRouteDefinitionFormat();

	}

} //PipelinePackage

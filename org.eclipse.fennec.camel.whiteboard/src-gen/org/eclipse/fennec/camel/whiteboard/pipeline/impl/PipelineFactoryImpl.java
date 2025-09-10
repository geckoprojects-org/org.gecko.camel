/**
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
package org.eclipse.fennec.camel.whiteboard.pipeline.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fennec.camel.whiteboard.pipeline.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelineFactoryImpl extends EFactoryImpl implements PipelineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PipelineFactory init() {
		try {
			PipelineFactory thePipelineFactory = (PipelineFactory)EPackage.Registry.INSTANCE.getEFactory(PipelinePackage.eNS_URI);
			if (thePipelineFactory != null) {
				return thePipelineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PipelineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PipelinePackage.PIPELINE_DEFINITION: return createPipelineDefinition();
			case PipelinePackage.SERVICE_DEPENDENCY: return createServiceDependency();
			case PipelinePackage.PARAMETER: return createParameter();
			case PipelinePackage.JAVA_DSL_ROUTE_DEFINITION: return createJavaDSLRouteDefinition();
			case PipelinePackage.TEXTUAL_ROUTE_DEFINITION: return createTextualRouteDefinition();
			case PipelinePackage.CONSUMER_CONFIGURATION: return createConsumerConfiguration();
			case PipelinePackage.PARAMETER_VALUE: return createParameterValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PipelinePackage.DEPENDENCY_CARDINALITY:
				return createDependencyCardinalityFromString(eDataType, initialValue);
			case PipelinePackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case PipelinePackage.ROUTE_DEFINITION_FORMAT:
				return createRouteDefinitionFormatFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PipelinePackage.DEPENDENCY_CARDINALITY:
				return convertDependencyCardinalityToString(eDataType, instanceValue);
			case PipelinePackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case PipelinePackage.ROUTE_DEFINITION_FORMAT:
				return convertRouteDefinitionFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelineDefinition createPipelineDefinition() {
		PipelineDefinitionImpl pipelineDefinition = new PipelineDefinitionImpl();
		return pipelineDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceDependency createServiceDependency() {
		ServiceDependencyImpl serviceDependency = new ServiceDependencyImpl();
		return serviceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaDSLRouteDefinition createJavaDSLRouteDefinition() {
		JavaDSLRouteDefinitionImpl javaDSLRouteDefinition = new JavaDSLRouteDefinitionImpl();
		return javaDSLRouteDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextualRouteDefinition createTextualRouteDefinition() {
		TextualRouteDefinitionImpl textualRouteDefinition = new TextualRouteDefinitionImpl();
		return textualRouteDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsumerConfiguration createConsumerConfiguration() {
		ConsumerConfigurationImpl consumerConfiguration = new ConsumerConfigurationImpl();
		return consumerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValue createParameterValue() {
		ParameterValueImpl parameterValue = new ParameterValueImpl();
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyCardinality createDependencyCardinalityFromString(EDataType eDataType, String initialValue) {
		DependencyCardinality result = DependencyCardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependencyCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteDefinitionFormat createRouteDefinitionFormatFromString(EDataType eDataType, String initialValue) {
		RouteDefinitionFormat result = RouteDefinitionFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRouteDefinitionFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelinePackage getPipelinePackage() {
		return (PipelinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PipelinePackage getPackage() {
		return PipelinePackage.eINSTANCE;
	}

} //PipelineFactoryImpl

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
package org.eclipse.fennec.camel.camelspring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformers Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransformersDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransformersDefinition#getDataFormatTransformer <em>Data Format Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransformersDefinition#getEndpointTransformer <em>Endpoint Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransformersDefinition#getLoadTransformer <em>Load Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TransformersDefinition#getCustomTransformer <em>Custom Transformer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformersDefinition()
 * @model extendedMetaData="name='transformersDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TransformersDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformersDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Data Format Transformer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.DataFormatTransformerDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Represents a org.apache.camel.processor.transformer.DataFormatTransformer which leverages
	 * org.apache.camel.spi.DataFormat to perform transformation. One of the DataFormat 'ref' or DataFormat 'type' needs to be
	 * specified.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Format Transformer</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformersDefinition_DataFormatTransformer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataFormatTransformer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DataFormatTransformerDefinition> getDataFormatTransformer();

	/**
	 * Returns the value of the '<em><b>Endpoint Transformer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.EndpointTransformerDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a Camel endpoint to perform transformation on the route level.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint Transformer</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformersDefinition_EndpointTransformer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='endpointTransformer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EndpointTransformerDefinition> getEndpointTransformer();

	/**
	 * Returns the value of the '<em><b>Load Transformer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.LoadTransformerDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To load custom transformers from classpath scanning to be used for route level transformations.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Transformer</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformersDefinition_LoadTransformer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadTransformer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LoadTransformerDefinition> getLoadTransformer();

	/**
	 * Returns the value of the '<em><b>Custom Transformer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CustomTransformerDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom transformer on a route level.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Transformer</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformersDefinition_CustomTransformer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customTransformer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CustomTransformerDefinition> getCustomTransformer();

} // TransformersDefinition

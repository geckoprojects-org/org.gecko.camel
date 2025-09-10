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
 * A representation of the model object '<em><b>Validators Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidatorsDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidatorsDefinition#getEndpointValidator <em>Endpoint Validator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidatorsDefinition#getPredicateValidator <em>Predicate Validator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ValidatorsDefinition#getCustomValidator <em>Custom Validator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidatorsDefinition()
 * @model extendedMetaData="name='validatorsDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ValidatorsDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidatorsDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Endpoint Validator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.EndpointValidatorDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a Camel endpoint to perform validation on the route level.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint Validator</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidatorsDefinition_EndpointValidator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='endpointValidator' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EndpointValidatorDefinition> getEndpointValidator();

	/**
	 * Returns the value of the '<em><b>Predicate Validator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PredicateValidatorDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a predicate to perform validation on the route level.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predicate Validator</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidatorsDefinition_PredicateValidator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='predicateValidator' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PredicateValidatorDefinition> getPredicateValidator();

	/**
	 * Returns the value of the '<em><b>Custom Validator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CustomValidatorDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom validator on the route level.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Validator</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getValidatorsDefinition_CustomValidator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customValidator' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CustomValidatorDefinition> getCustomValidator();

} // ValidatorsDefinition

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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.InputTypeDefinition#getUrn <em>Urn</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.InputTypeDefinition#getValidate <em>Validate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getInputTypeDefinition()
 * @model extendedMetaData="name='inputTypeDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface InputTypeDefinition extends OptionalIdentifiedDefinition {
	/**
	 * Returns the value of the '<em><b>Urn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The input type URN.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Urn</em>' attribute.
	 * @see #setUrn(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getInputTypeDefinition_Urn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='urn'"
	 * @generated
	 */
	String getUrn();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.InputTypeDefinition#getUrn <em>Urn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urn</em>' attribute.
	 * @see #getUrn()
	 * @generated
	 */
	void setUrn(String value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether if validation is required for this input type. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getInputTypeDefinition_Validate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='validate'"
	 * @generated
	 */
	String getValidate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.InputTypeDefinition#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(String value);

} // InputTypeDefinition

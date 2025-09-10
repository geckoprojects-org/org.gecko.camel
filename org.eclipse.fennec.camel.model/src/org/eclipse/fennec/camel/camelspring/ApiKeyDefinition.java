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
 * A representation of the model object '<em><b>Api Key Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ApiKeyDefinition#getInCookie <em>In Cookie</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ApiKeyDefinition#getInHeader <em>In Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ApiKeyDefinition#getInQuery <em>In Query</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ApiKeyDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getApiKeyDefinition()
 * @model extendedMetaData="name='apiKeyDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface ApiKeyDefinition extends RestSecurityDefinition {
	/**
	 * Returns the value of the '<em><b>In Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a cookie as the location of the API key. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Cookie</em>' attribute.
	 * @see #setInCookie(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getApiKeyDefinition_InCookie()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inCookie'"
	 * @generated
	 */
	String getInCookie();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ApiKeyDefinition#getInCookie <em>In Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Cookie</em>' attribute.
	 * @see #getInCookie()
	 * @generated
	 */
	void setInCookie(String value);

	/**
	 * Returns the value of the '<em><b>In Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use header as the location of the API key. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Header</em>' attribute.
	 * @see #setInHeader(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getApiKeyDefinition_InHeader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inHeader'"
	 * @generated
	 */
	String getInHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ApiKeyDefinition#getInHeader <em>In Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Header</em>' attribute.
	 * @see #getInHeader()
	 * @generated
	 */
	void setInHeader(String value);

	/**
	 * Returns the value of the '<em><b>In Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use query parameter as the location of the API key. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Query</em>' attribute.
	 * @see #setInQuery(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getApiKeyDefinition_InQuery()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inQuery'"
	 * @generated
	 */
	String getInQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ApiKeyDefinition#getInQuery <em>In Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Query</em>' attribute.
	 * @see #getInQuery()
	 * @generated
	 */
	void setInQuery(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The name of the header or query parameter to be used.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getApiKeyDefinition_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ApiKeyDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ApiKeyDefinition

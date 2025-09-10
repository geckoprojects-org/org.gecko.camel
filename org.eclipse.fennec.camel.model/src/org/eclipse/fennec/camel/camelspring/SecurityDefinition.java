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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SecurityDefinition#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SecurityDefinition#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSecurityDefinition()
 * @model extendedMetaData="name='securityDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface SecurityDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Key used to refer to this security definition.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSecurityDefinition_Key()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='key'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SecurityDefinition#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The scopes to allow (separate multiple scopes by comma).
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scopes</em>' attribute.
	 * @see #setScopes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSecurityDefinition_Scopes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scopes'"
	 * @generated
	 */
	String getScopes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SecurityDefinition#getScopes <em>Scopes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scopes</em>' attribute.
	 * @see #getScopes()
	 * @generated
	 */
	void setScopes(String value);

} // SecurityDefinition

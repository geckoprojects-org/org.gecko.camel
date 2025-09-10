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
 * A representation of the model object '<em><b>Abstract Key Managers Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractKeyManagersParametersFactoryBean#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractKeyManagersParametersFactoryBean#getKeyPassword <em>Key Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractKeyManagersParametersFactoryBean#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractKeyManagersParametersFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractKeyManagersParametersFactoryBean' kind='empty'"
 * @generated
 */
@ProviderType
public interface AbstractKeyManagersParametersFactoryBean extends AbstractJsseUtilFactoryBean {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractKeyManagersParametersFactoryBean_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractKeyManagersParametersFactoryBean#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Key Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Password</em>' attribute.
	 * @see #setKeyPassword(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractKeyManagersParametersFactoryBean_KeyPassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyPassword'"
	 * @generated
	 */
	String getKeyPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractKeyManagersParametersFactoryBean#getKeyPassword <em>Key Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Password</em>' attribute.
	 * @see #getKeyPassword()
	 * @generated
	 */
	void setKeyPassword(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractKeyManagersParametersFactoryBean_Provider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='provider'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractKeyManagersParametersFactoryBean#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

} // AbstractKeyManagersParametersFactoryBean

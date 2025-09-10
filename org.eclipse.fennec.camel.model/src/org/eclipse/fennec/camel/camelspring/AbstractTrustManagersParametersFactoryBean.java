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
 * A representation of the model object '<em><b>Abstract Trust Managers Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractTrustManagersParametersFactoryBean#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractTrustManagersParametersFactoryBean#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractTrustManagersParametersFactoryBean#getTrustManager <em>Trust Manager</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractTrustManagersParametersFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractTrustManagersParametersFactoryBean' kind='empty'"
 * @generated
 */
@ProviderType
public interface AbstractTrustManagersParametersFactoryBean extends AbstractJsseUtilFactoryBean {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractTrustManagersParametersFactoryBean_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractTrustManagersParametersFactoryBean#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractTrustManagersParametersFactoryBean_Provider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='provider'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractTrustManagersParametersFactoryBean#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Trust Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust Manager</em>' attribute.
	 * @see #setTrustManager(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractTrustManagersParametersFactoryBean_TrustManager()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trustManager'"
	 * @generated
	 */
	String getTrustManager();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractTrustManagersParametersFactoryBean#getTrustManager <em>Trust Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Manager</em>' attribute.
	 * @see #getTrustManager()
	 * @generated
	 */
	void setTrustManager(String value);

} // AbstractTrustManagersParametersFactoryBean

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
 * A representation of the model object '<em><b>Ssl Context Server Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getCipherSuites <em>Cipher Suites</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getCipherSuitesFilter <em>Cipher Suites Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getSecureSocketProtocols <em>Secure Socket Protocols</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getSecureSocketProtocolsFilter <em>Secure Socket Protocols Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getClientAuthentication <em>Client Authentication</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextServerParametersFactoryBean()
 * @model extendedMetaData="name='sslContextServerParametersFactoryBean' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SslContextServerParametersFactoryBean extends AbstractJsseUtilFactoryBean {
	/**
	 * Returns the value of the '<em><b>Cipher Suites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipher Suites</em>' containment reference.
	 * @see #setCipherSuites(CipherSuitesParameters)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextServerParametersFactoryBean_CipherSuites()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cipherSuites' namespace='##targetNamespace'"
	 * @generated
	 */
	CipherSuitesParameters getCipherSuites();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getCipherSuites <em>Cipher Suites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Suites</em>' containment reference.
	 * @see #getCipherSuites()
	 * @generated
	 */
	void setCipherSuites(CipherSuitesParameters value);

	/**
	 * Returns the value of the '<em><b>Cipher Suites Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipher Suites Filter</em>' containment reference.
	 * @see #setCipherSuitesFilter(FilterParameters)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextServerParametersFactoryBean_CipherSuitesFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cipherSuitesFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterParameters getCipherSuitesFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getCipherSuitesFilter <em>Cipher Suites Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Suites Filter</em>' containment reference.
	 * @see #getCipherSuitesFilter()
	 * @generated
	 */
	void setCipherSuitesFilter(FilterParameters value);

	/**
	 * Returns the value of the '<em><b>Secure Socket Protocols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure Socket Protocols</em>' containment reference.
	 * @see #setSecureSocketProtocols(SecureSocketProtocolsParameters)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextServerParametersFactoryBean_SecureSocketProtocols()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='secureSocketProtocols' namespace='##targetNamespace'"
	 * @generated
	 */
	SecureSocketProtocolsParameters getSecureSocketProtocols();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getSecureSocketProtocols <em>Secure Socket Protocols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Socket Protocols</em>' containment reference.
	 * @see #getSecureSocketProtocols()
	 * @generated
	 */
	void setSecureSocketProtocols(SecureSocketProtocolsParameters value);

	/**
	 * Returns the value of the '<em><b>Secure Socket Protocols Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure Socket Protocols Filter</em>' containment reference.
	 * @see #setSecureSocketProtocolsFilter(FilterParameters)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextServerParametersFactoryBean_SecureSocketProtocolsFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='secureSocketProtocolsFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterParameters getSecureSocketProtocolsFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getSecureSocketProtocolsFilter <em>Secure Socket Protocols Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Socket Protocols Filter</em>' containment reference.
	 * @see #getSecureSocketProtocolsFilter()
	 * @generated
	 */
	void setSecureSocketProtocolsFilter(FilterParameters value);

	/**
	 * Returns the value of the '<em><b>Client Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Authentication</em>' attribute.
	 * @see #setClientAuthentication(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextServerParametersFactoryBean_ClientAuthentication()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientAuthentication'"
	 * @generated
	 */
	String getClientAuthentication();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getClientAuthentication <em>Client Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Authentication</em>' attribute.
	 * @see #getClientAuthentication()
	 * @generated
	 */
	void setClientAuthentication(String value);

	/**
	 * Returns the value of the '<em><b>Session Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Timeout</em>' attribute.
	 * @see #setSessionTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextServerParametersFactoryBean_SessionTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sessionTimeout'"
	 * @generated
	 */
	String getSessionTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean#getSessionTimeout <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Timeout</em>' attribute.
	 * @see #getSessionTimeout()
	 * @generated
	 */
	void setSessionTimeout(String value);

} // SslContextServerParametersFactoryBean

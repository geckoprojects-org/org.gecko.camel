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
 * A representation of the model object '<em><b>Ssl Context Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getCipherSuites <em>Cipher Suites</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getCipherSuitesFilter <em>Cipher Suites Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getSecureSocketProtocols <em>Secure Socket Protocols</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getSecureSocketProtocolsFilter <em>Secure Socket Protocols Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getKeyManagers <em>Key Managers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getTrustManagers <em>Trust Managers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getSecureRandom <em>Secure Random</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getClientParameters <em>Client Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getServerParameters <em>Server Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getCertAlias <em>Cert Alias</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getSecureSocketProtocol <em>Secure Socket Protocol</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean()
 * @model extendedMetaData="name='sslContextParametersFactoryBean' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SslContextParametersFactoryBean extends AbstractJsseUtilFactoryBean {
	/**
	 * Returns the value of the '<em><b>Cipher Suites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipher Suites</em>' containment reference.
	 * @see #setCipherSuites(CipherSuitesParameters)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_CipherSuites()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cipherSuites' namespace='##targetNamespace'"
	 * @generated
	 */
	CipherSuitesParameters getCipherSuites();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getCipherSuites <em>Cipher Suites</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_CipherSuitesFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cipherSuitesFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterParameters getCipherSuitesFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getCipherSuitesFilter <em>Cipher Suites Filter</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_SecureSocketProtocols()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='secureSocketProtocols' namespace='##targetNamespace'"
	 * @generated
	 */
	SecureSocketProtocolsParameters getSecureSocketProtocols();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getSecureSocketProtocols <em>Secure Socket Protocols</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_SecureSocketProtocolsFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='secureSocketProtocolsFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterParameters getSecureSocketProtocolsFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getSecureSocketProtocolsFilter <em>Secure Socket Protocols Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Socket Protocols Filter</em>' containment reference.
	 * @see #getSecureSocketProtocolsFilter()
	 * @generated
	 */
	void setSecureSocketProtocolsFilter(FilterParameters value);

	/**
	 * Returns the value of the '<em><b>Key Managers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Managers</em>' containment reference.
	 * @see #setKeyManagers(KeyManagersParametersFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_KeyManagers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='keyManagers' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyManagersParametersFactoryBean getKeyManagers();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getKeyManagers <em>Key Managers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Managers</em>' containment reference.
	 * @see #getKeyManagers()
	 * @generated
	 */
	void setKeyManagers(KeyManagersParametersFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Trust Managers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust Managers</em>' containment reference.
	 * @see #setTrustManagers(TrustManagersParametersFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_TrustManagers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trustManagers' namespace='##targetNamespace'"
	 * @generated
	 */
	TrustManagersParametersFactoryBean getTrustManagers();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getTrustManagers <em>Trust Managers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Managers</em>' containment reference.
	 * @see #getTrustManagers()
	 * @generated
	 */
	void setTrustManagers(TrustManagersParametersFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Secure Random</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure Random</em>' containment reference.
	 * @see #setSecureRandom(SecureRandomParametersFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_SecureRandom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='secureRandom' namespace='##targetNamespace'"
	 * @generated
	 */
	SecureRandomParametersFactoryBean getSecureRandom();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getSecureRandom <em>Secure Random</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Random</em>' containment reference.
	 * @see #getSecureRandom()
	 * @generated
	 */
	void setSecureRandom(SecureRandomParametersFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Client Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Parameters</em>' containment reference.
	 * @see #setClientParameters(SslContextClientParametersFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_ClientParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clientParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	SslContextClientParametersFactoryBean getClientParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getClientParameters <em>Client Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Parameters</em>' containment reference.
	 * @see #getClientParameters()
	 * @generated
	 */
	void setClientParameters(SslContextClientParametersFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Server Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Parameters</em>' containment reference.
	 * @see #setServerParameters(SslContextServerParametersFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_ServerParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serverParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	SslContextServerParametersFactoryBean getServerParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getServerParameters <em>Server Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Parameters</em>' containment reference.
	 * @see #getServerParameters()
	 * @generated
	 */
	void setServerParameters(SslContextServerParametersFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Cert Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * An optional certificate alias to use. This is useful when the keystore has multiple certificates.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cert Alias</em>' attribute.
	 * @see #setCertAlias(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_CertAlias()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='certAlias'"
	 * @generated
	 */
	String getCertAlias();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getCertAlias <em>Cert Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cert Alias</em>' attribute.
	 * @see #getCertAlias()
	 * @generated
	 */
	void setCertAlias(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The provider identifier for the JSSE implementation to use when constructing an SSLContext.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_Provider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='provider'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Secure Socket Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The protocol for the secure sockets created by the SSLContext represented by this instance's configuration. See
	 * https://docs.oracle.com/en/java/javase/17/docs/specs/security/standard-names.html.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secure Socket Protocol</em>' attribute.
	 * @see #setSecureSocketProtocol(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_SecureSocketProtocol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='secureSocketProtocol'"
	 * @generated
	 */
	String getSecureSocketProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getSecureSocketProtocol <em>Secure Socket Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Socket Protocol</em>' attribute.
	 * @see #getSecureSocketProtocol()
	 * @generated
	 */
	void setSecureSocketProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Session Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The optional SSLSessionContext timeout time for javax.net.ssl.SSLSession in seconds.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Timeout</em>' attribute.
	 * @see #setSessionTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSslContextParametersFactoryBean_SessionTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sessionTimeout'"
	 * @generated
	 */
	String getSessionTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean#getSessionTimeout <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Timeout</em>' attribute.
	 * @see #getSessionTimeout()
	 * @generated
	 */
	void setSessionTimeout(String value);

} // SslContextParametersFactoryBean

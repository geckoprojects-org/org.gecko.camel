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
 * A representation of the model object '<em><b>Kubernetes Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getCaCertData <em>Ca Cert Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getCaCertFile <em>Ca Cert File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientCertData <em>Client Cert Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientCertFile <em>Client Cert File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientKeyAlgo <em>Client Key Algo</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientKeyData <em>Client Key Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientKeyFile <em>Client Key File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientKeyPassphrase <em>Client Key Passphrase</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getDnsDomain <em>Dns Domain</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getLookup <em>Lookup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getMasterUrl <em>Master Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getOauthToken <em>Oauth Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getPortProtocol <em>Port Protocol</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getTrustCerts <em>Trust Certs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration()
 * @model extendedMetaData="name='kubernetesServiceCallServiceDiscoveryConfiguration' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KubernetesServiceCallServiceDiscoveryConfiguration extends ServiceCallServiceDiscoveryConfiguration {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the API version when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see #setApiVersion(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_ApiVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='apiVersion'"
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getApiVersion <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Version</em>' attribute.
	 * @see #getApiVersion()
	 * @generated
	 */
	void setApiVersion(String value);

	/**
	 * Returns the value of the '<em><b>Ca Cert Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the Certificate Authority data when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ca Cert Data</em>' attribute.
	 * @see #setCaCertData(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_CaCertData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='caCertData'"
	 * @generated
	 */
	String getCaCertData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getCaCertData <em>Ca Cert Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ca Cert Data</em>' attribute.
	 * @see #getCaCertData()
	 * @generated
	 */
	void setCaCertData(String value);

	/**
	 * Returns the value of the '<em><b>Ca Cert File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the Certificate Authority data that are loaded from the file when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ca Cert File</em>' attribute.
	 * @see #setCaCertFile(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_CaCertFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='caCertFile'"
	 * @generated
	 */
	String getCaCertFile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getCaCertFile <em>Ca Cert File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ca Cert File</em>' attribute.
	 * @see #getCaCertFile()
	 * @generated
	 */
	void setCaCertFile(String value);

	/**
	 * Returns the value of the '<em><b>Client Cert Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the Client Certificate data when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Cert Data</em>' attribute.
	 * @see #setClientCertData(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_ClientCertData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientCertData'"
	 * @generated
	 */
	String getClientCertData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientCertData <em>Client Cert Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Cert Data</em>' attribute.
	 * @see #getClientCertData()
	 * @generated
	 */
	void setClientCertData(String value);

	/**
	 * Returns the value of the '<em><b>Client Cert File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the Client Certificate data that are loaded from the file when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Cert File</em>' attribute.
	 * @see #setClientCertFile(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_ClientCertFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientCertFile'"
	 * @generated
	 */
	String getClientCertFile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientCertFile <em>Client Cert File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Cert File</em>' attribute.
	 * @see #getClientCertFile()
	 * @generated
	 */
	void setClientCertFile(String value);

	/**
	 * Returns the value of the '<em><b>Client Key Algo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the Client Keystore algorithm, such as RSA when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Key Algo</em>' attribute.
	 * @see #setClientKeyAlgo(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_ClientKeyAlgo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientKeyAlgo'"
	 * @generated
	 */
	String getClientKeyAlgo();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientKeyAlgo <em>Client Key Algo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Key Algo</em>' attribute.
	 * @see #getClientKeyAlgo()
	 * @generated
	 */
	void setClientKeyAlgo(String value);

	/**
	 * Returns the value of the '<em><b>Client Key Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the Client Keystore data when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Key Data</em>' attribute.
	 * @see #setClientKeyData(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_ClientKeyData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientKeyData'"
	 * @generated
	 */
	String getClientKeyData();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientKeyData <em>Client Key Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Key Data</em>' attribute.
	 * @see #getClientKeyData()
	 * @generated
	 */
	void setClientKeyData(String value);

	/**
	 * Returns the value of the '<em><b>Client Key File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the Client Keystore data that are loaded from the file when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Key File</em>' attribute.
	 * @see #setClientKeyFile(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_ClientKeyFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientKeyFile'"
	 * @generated
	 */
	String getClientKeyFile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientKeyFile <em>Client Key File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Key File</em>' attribute.
	 * @see #getClientKeyFile()
	 * @generated
	 */
	void setClientKeyFile(String value);

	/**
	 * Returns the value of the '<em><b>Client Key Passphrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the Client Keystore passphrase when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Key Passphrase</em>' attribute.
	 * @see #setClientKeyPassphrase(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_ClientKeyPassphrase()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientKeyPassphrase'"
	 * @generated
	 */
	String getClientKeyPassphrase();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getClientKeyPassphrase <em>Client Key Passphrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Key Passphrase</em>' attribute.
	 * @see #getClientKeyPassphrase()
	 * @generated
	 */
	void setClientKeyPassphrase(String value);

	/**
	 * Returns the value of the '<em><b>Dns Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the DNS domain to use for DNS lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dns Domain</em>' attribute.
	 * @see #setDnsDomain(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_DnsDomain()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dnsDomain'"
	 * @generated
	 */
	String getDnsDomain();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getDnsDomain <em>Dns Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns Domain</em>' attribute.
	 * @see #getDnsDomain()
	 * @generated
	 */
	void setDnsDomain(String value);

	/**
	 * Returns the value of the '<em><b>Lookup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * How to perform service lookup. Possible values: client, dns, environment. When using client, then the client queries the
	 * kubernetes master to obtain a list of active pods that provides the service, and then random (or round robin) select a
	 * pod. When using dns the service name is resolved as name.namespace.svc.dnsDomain. When using dnssrv the service name is
	 * resolved with SRV query for _._...svc... When using environment then environment variables are used to lookup the
	 * service. By default environment is used. Default value: environment
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lookup</em>' attribute.
	 * @see #setLookup(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_Lookup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lookup'"
	 * @generated
	 */
	String getLookup();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getLookup <em>Lookup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup</em>' attribute.
	 * @see #getLookup()
	 * @generated
	 */
	void setLookup(String value);

	/**
	 * Returns the value of the '<em><b>Master Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the URL to the master when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Master Url</em>' attribute.
	 * @see #setMasterUrl(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_MasterUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='masterUrl'"
	 * @generated
	 */
	String getMasterUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getMasterUrl <em>Master Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Url</em>' attribute.
	 * @see #getMasterUrl()
	 * @generated
	 */
	void setMasterUrl(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the namespace to use. Will by default use namespace from the ENV variable KUBERNETES_MASTER.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_Namespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Oauth Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the OAUTH token for authentication (instead of username/password) when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oauth Token</em>' attribute.
	 * @see #setOauthToken(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_OauthToken()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='oauthToken'"
	 * @generated
	 */
	String getOauthToken();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getOauthToken <em>Oauth Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oauth Token</em>' attribute.
	 * @see #getOauthToken()
	 * @generated
	 */
	void setOauthToken(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the password for authentication when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the Port Name to use for DNS/DNSSRV lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Name</em>' attribute.
	 * @see #setPortName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_PortName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='portName'"
	 * @generated
	 */
	String getPortName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getPortName <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Name</em>' attribute.
	 * @see #getPortName()
	 * @generated
	 */
	void setPortName(String value);

	/**
	 * Returns the value of the '<em><b>Port Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the Port Protocol to use for DNS/DNSSRV lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Protocol</em>' attribute.
	 * @see #setPortProtocol(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_PortProtocol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='portProtocol'"
	 * @generated
	 */
	String getPortProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getPortProtocol <em>Port Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Protocol</em>' attribute.
	 * @see #getPortProtocol()
	 * @generated
	 */
	void setPortProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Trust Certs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether to turn on trust certificate check when using client lookup. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trust Certs</em>' attribute.
	 * @see #setTrustCerts(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_TrustCerts()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trustCerts'"
	 * @generated
	 */
	String getTrustCerts();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getTrustCerts <em>Trust Certs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Certs</em>' attribute.
	 * @see #getTrustCerts()
	 * @generated
	 */
	void setTrustCerts(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the username for authentication when using client lookup.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getKubernetesServiceCallServiceDiscoveryConfiguration_Username()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

} // KubernetesServiceCallServiceDiscoveryConfiguration

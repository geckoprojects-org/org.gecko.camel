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
package org.eclipse.fennec.camel.camelspring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kubernetes Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getCaCertData <em>Ca Cert Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getCaCertFile <em>Ca Cert File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getClientCertData <em>Client Cert Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getClientCertFile <em>Client Cert File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getClientKeyAlgo <em>Client Key Algo</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getClientKeyData <em>Client Key Data</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getClientKeyFile <em>Client Key File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getClientKeyPassphrase <em>Client Key Passphrase</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getDnsDomain <em>Dns Domain</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getLookup <em>Lookup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getMasterUrl <em>Master Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getOauthToken <em>Oauth Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getPortProtocol <em>Port Protocol</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getTrustCerts <em>Trust Certs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.KubernetesServiceCallServiceDiscoveryConfigurationImpl#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KubernetesServiceCallServiceDiscoveryConfigurationImpl extends ServiceCallServiceDiscoveryConfigurationImpl implements KubernetesServiceCallServiceDiscoveryConfiguration {
	/**
	 * The default value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String API_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected String apiVersion = API_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaCertData() <em>Ca Cert Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaCertData()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_CERT_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaCertData() <em>Ca Cert Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaCertData()
	 * @generated
	 * @ordered
	 */
	protected String caCertData = CA_CERT_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaCertFile() <em>Ca Cert File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaCertFile()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_CERT_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaCertFile() <em>Ca Cert File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaCertFile()
	 * @generated
	 * @ordered
	 */
	protected String caCertFile = CA_CERT_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientCertData() <em>Client Cert Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCertData()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_CERT_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientCertData() <em>Client Cert Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCertData()
	 * @generated
	 * @ordered
	 */
	protected String clientCertData = CLIENT_CERT_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientCertFile() <em>Client Cert File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCertFile()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_CERT_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientCertFile() <em>Client Cert File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCertFile()
	 * @generated
	 * @ordered
	 */
	protected String clientCertFile = CLIENT_CERT_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientKeyAlgo() <em>Client Key Algo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyAlgo()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_KEY_ALGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientKeyAlgo() <em>Client Key Algo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyAlgo()
	 * @generated
	 * @ordered
	 */
	protected String clientKeyAlgo = CLIENT_KEY_ALGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientKeyData() <em>Client Key Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyData()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_KEY_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientKeyData() <em>Client Key Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyData()
	 * @generated
	 * @ordered
	 */
	protected String clientKeyData = CLIENT_KEY_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientKeyFile() <em>Client Key File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyFile()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_KEY_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientKeyFile() <em>Client Key File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyFile()
	 * @generated
	 * @ordered
	 */
	protected String clientKeyFile = CLIENT_KEY_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientKeyPassphrase() <em>Client Key Passphrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyPassphrase()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_KEY_PASSPHRASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientKeyPassphrase() <em>Client Key Passphrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientKeyPassphrase()
	 * @generated
	 * @ordered
	 */
	protected String clientKeyPassphrase = CLIENT_KEY_PASSPHRASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDnsDomain() <em>Dns Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDnsDomain() <em>Dns Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsDomain()
	 * @generated
	 * @ordered
	 */
	protected String dnsDomain = DNS_DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLookup() <em>Lookup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookup()
	 * @generated
	 * @ordered
	 */
	protected static final String LOOKUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLookup() <em>Lookup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookup()
	 * @generated
	 * @ordered
	 */
	protected String lookup = LOOKUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterUrl() <em>Master Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterUrl() <em>Master Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterUrl()
	 * @generated
	 * @ordered
	 */
	protected String masterUrl = MASTER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOauthToken() <em>Oauth Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauthToken()
	 * @generated
	 * @ordered
	 */
	protected static final String OAUTH_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOauthToken() <em>Oauth Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauthToken()
	 * @generated
	 * @ordered
	 */
	protected String oauthToken = OAUTH_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected String portName = PORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortProtocol() <em>Port Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortProtocol() <em>Port Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProtocol()
	 * @generated
	 * @ordered
	 */
	protected String portProtocol = PORT_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrustCerts() <em>Trust Certs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustCerts()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUST_CERTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrustCerts() <em>Trust Certs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustCerts()
	 * @generated
	 * @ordered
	 */
	protected String trustCerts = TRUST_CERTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KubernetesServiceCallServiceDiscoveryConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getKubernetesServiceCallServiceDiscoveryConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiVersion(String newApiVersion) {
		String oldApiVersion = apiVersion;
		apiVersion = newApiVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__API_VERSION, oldApiVersion, apiVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaCertData() {
		return caCertData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaCertData(String newCaCertData) {
		String oldCaCertData = caCertData;
		caCertData = newCaCertData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CA_CERT_DATA, oldCaCertData, caCertData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaCertFile() {
		return caCertFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaCertFile(String newCaCertFile) {
		String oldCaCertFile = caCertFile;
		caCertFile = newCaCertFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CA_CERT_FILE, oldCaCertFile, caCertFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientCertData() {
		return clientCertData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientCertData(String newClientCertData) {
		String oldClientCertData = clientCertData;
		clientCertData = newClientCertData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_CERT_DATA, oldClientCertData, clientCertData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientCertFile() {
		return clientCertFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientCertFile(String newClientCertFile) {
		String oldClientCertFile = clientCertFile;
		clientCertFile = newClientCertFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_CERT_FILE, oldClientCertFile, clientCertFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientKeyAlgo() {
		return clientKeyAlgo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientKeyAlgo(String newClientKeyAlgo) {
		String oldClientKeyAlgo = clientKeyAlgo;
		clientKeyAlgo = newClientKeyAlgo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_ALGO, oldClientKeyAlgo, clientKeyAlgo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientKeyData() {
		return clientKeyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientKeyData(String newClientKeyData) {
		String oldClientKeyData = clientKeyData;
		clientKeyData = newClientKeyData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_DATA, oldClientKeyData, clientKeyData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientKeyFile() {
		return clientKeyFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientKeyFile(String newClientKeyFile) {
		String oldClientKeyFile = clientKeyFile;
		clientKeyFile = newClientKeyFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_FILE, oldClientKeyFile, clientKeyFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientKeyPassphrase() {
		return clientKeyPassphrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientKeyPassphrase(String newClientKeyPassphrase) {
		String oldClientKeyPassphrase = clientKeyPassphrase;
		clientKeyPassphrase = newClientKeyPassphrase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_PASSPHRASE, oldClientKeyPassphrase, clientKeyPassphrase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDnsDomain() {
		return dnsDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDnsDomain(String newDnsDomain) {
		String oldDnsDomain = dnsDomain;
		dnsDomain = newDnsDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_DOMAIN, oldDnsDomain, dnsDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLookup() {
		return lookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLookup(String newLookup) {
		String oldLookup = lookup;
		lookup = newLookup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__LOOKUP, oldLookup, lookup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMasterUrl() {
		return masterUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMasterUrl(String newMasterUrl) {
		String oldMasterUrl = masterUrl;
		masterUrl = newMasterUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__MASTER_URL, oldMasterUrl, masterUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOauthToken() {
		return oauthToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOauthToken(String newOauthToken) {
		String oldOauthToken = oauthToken;
		oauthToken = newOauthToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__OAUTH_TOKEN, oldOauthToken, oauthToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortName() {
		return portName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortName(String newPortName) {
		String oldPortName = portName;
		portName = newPortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PORT_NAME, oldPortName, portName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortProtocol() {
		return portProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortProtocol(String newPortProtocol) {
		String oldPortProtocol = portProtocol;
		portProtocol = newPortProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PORT_PROTOCOL, oldPortProtocol, portProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrustCerts() {
		return trustCerts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrustCerts(String newTrustCerts) {
		String oldTrustCerts = trustCerts;
		trustCerts = newTrustCerts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__TRUST_CERTS, oldTrustCerts, trustCerts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__API_VERSION:
				return getApiVersion();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CA_CERT_DATA:
				return getCaCertData();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CA_CERT_FILE:
				return getCaCertFile();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_CERT_DATA:
				return getClientCertData();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_CERT_FILE:
				return getClientCertFile();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_ALGO:
				return getClientKeyAlgo();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_DATA:
				return getClientKeyData();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_FILE:
				return getClientKeyFile();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_PASSPHRASE:
				return getClientKeyPassphrase();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_DOMAIN:
				return getDnsDomain();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__LOOKUP:
				return getLookup();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__MASTER_URL:
				return getMasterUrl();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NAMESPACE:
				return getNamespace();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__OAUTH_TOKEN:
				return getOauthToken();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PASSWORD:
				return getPassword();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PORT_NAME:
				return getPortName();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PORT_PROTOCOL:
				return getPortProtocol();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__TRUST_CERTS:
				return getTrustCerts();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__USERNAME:
				return getUsername();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__API_VERSION:
				setApiVersion((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CA_CERT_DATA:
				setCaCertData((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CA_CERT_FILE:
				setCaCertFile((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_CERT_DATA:
				setClientCertData((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_CERT_FILE:
				setClientCertFile((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_ALGO:
				setClientKeyAlgo((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_DATA:
				setClientKeyData((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_FILE:
				setClientKeyFile((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_PASSPHRASE:
				setClientKeyPassphrase((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_DOMAIN:
				setDnsDomain((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__LOOKUP:
				setLookup((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__MASTER_URL:
				setMasterUrl((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__OAUTH_TOKEN:
				setOauthToken((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PASSWORD:
				setPassword((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PORT_NAME:
				setPortName((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PORT_PROTOCOL:
				setPortProtocol((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__TRUST_CERTS:
				setTrustCerts((String)newValue);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__USERNAME:
				setUsername((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__API_VERSION:
				setApiVersion(API_VERSION_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CA_CERT_DATA:
				setCaCertData(CA_CERT_DATA_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CA_CERT_FILE:
				setCaCertFile(CA_CERT_FILE_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_CERT_DATA:
				setClientCertData(CLIENT_CERT_DATA_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_CERT_FILE:
				setClientCertFile(CLIENT_CERT_FILE_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_ALGO:
				setClientKeyAlgo(CLIENT_KEY_ALGO_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_DATA:
				setClientKeyData(CLIENT_KEY_DATA_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_FILE:
				setClientKeyFile(CLIENT_KEY_FILE_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_PASSPHRASE:
				setClientKeyPassphrase(CLIENT_KEY_PASSPHRASE_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_DOMAIN:
				setDnsDomain(DNS_DOMAIN_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__LOOKUP:
				setLookup(LOOKUP_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__MASTER_URL:
				setMasterUrl(MASTER_URL_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__OAUTH_TOKEN:
				setOauthToken(OAUTH_TOKEN_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PORT_NAME:
				setPortName(PORT_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PORT_PROTOCOL:
				setPortProtocol(PORT_PROTOCOL_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__TRUST_CERTS:
				setTrustCerts(TRUST_CERTS_EDEFAULT);
				return;
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__API_VERSION:
				return API_VERSION_EDEFAULT == null ? apiVersion != null : !API_VERSION_EDEFAULT.equals(apiVersion);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CA_CERT_DATA:
				return CA_CERT_DATA_EDEFAULT == null ? caCertData != null : !CA_CERT_DATA_EDEFAULT.equals(caCertData);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CA_CERT_FILE:
				return CA_CERT_FILE_EDEFAULT == null ? caCertFile != null : !CA_CERT_FILE_EDEFAULT.equals(caCertFile);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_CERT_DATA:
				return CLIENT_CERT_DATA_EDEFAULT == null ? clientCertData != null : !CLIENT_CERT_DATA_EDEFAULT.equals(clientCertData);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_CERT_FILE:
				return CLIENT_CERT_FILE_EDEFAULT == null ? clientCertFile != null : !CLIENT_CERT_FILE_EDEFAULT.equals(clientCertFile);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_ALGO:
				return CLIENT_KEY_ALGO_EDEFAULT == null ? clientKeyAlgo != null : !CLIENT_KEY_ALGO_EDEFAULT.equals(clientKeyAlgo);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_DATA:
				return CLIENT_KEY_DATA_EDEFAULT == null ? clientKeyData != null : !CLIENT_KEY_DATA_EDEFAULT.equals(clientKeyData);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_FILE:
				return CLIENT_KEY_FILE_EDEFAULT == null ? clientKeyFile != null : !CLIENT_KEY_FILE_EDEFAULT.equals(clientKeyFile);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CLIENT_KEY_PASSPHRASE:
				return CLIENT_KEY_PASSPHRASE_EDEFAULT == null ? clientKeyPassphrase != null : !CLIENT_KEY_PASSPHRASE_EDEFAULT.equals(clientKeyPassphrase);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DNS_DOMAIN:
				return DNS_DOMAIN_EDEFAULT == null ? dnsDomain != null : !DNS_DOMAIN_EDEFAULT.equals(dnsDomain);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__LOOKUP:
				return LOOKUP_EDEFAULT == null ? lookup != null : !LOOKUP_EDEFAULT.equals(lookup);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__MASTER_URL:
				return MASTER_URL_EDEFAULT == null ? masterUrl != null : !MASTER_URL_EDEFAULT.equals(masterUrl);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__OAUTH_TOKEN:
				return OAUTH_TOKEN_EDEFAULT == null ? oauthToken != null : !OAUTH_TOKEN_EDEFAULT.equals(oauthToken);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PORT_NAME:
				return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PORT_PROTOCOL:
				return PORT_PROTOCOL_EDEFAULT == null ? portProtocol != null : !PORT_PROTOCOL_EDEFAULT.equals(portProtocol);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__TRUST_CERTS:
				return TRUST_CERTS_EDEFAULT == null ? trustCerts != null : !TRUST_CERTS_EDEFAULT.equals(trustCerts);
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (apiVersion: ");
		result.append(apiVersion);
		result.append(", caCertData: ");
		result.append(caCertData);
		result.append(", caCertFile: ");
		result.append(caCertFile);
		result.append(", clientCertData: ");
		result.append(clientCertData);
		result.append(", clientCertFile: ");
		result.append(clientCertFile);
		result.append(", clientKeyAlgo: ");
		result.append(clientKeyAlgo);
		result.append(", clientKeyData: ");
		result.append(clientKeyData);
		result.append(", clientKeyFile: ");
		result.append(clientKeyFile);
		result.append(", clientKeyPassphrase: ");
		result.append(clientKeyPassphrase);
		result.append(", dnsDomain: ");
		result.append(dnsDomain);
		result.append(", lookup: ");
		result.append(lookup);
		result.append(", masterUrl: ");
		result.append(masterUrl);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", oauthToken: ");
		result.append(oauthToken);
		result.append(", password: ");
		result.append(password);
		result.append(", portName: ");
		result.append(portName);
		result.append(", portProtocol: ");
		result.append(portProtocol);
		result.append(", trustCerts: ");
		result.append(trustCerts);
		result.append(", username: ");
		result.append(username);
		result.append(')');
		return result.toString();
	}

} //KubernetesServiceCallServiceDiscoveryConfigurationImpl

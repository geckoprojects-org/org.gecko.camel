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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CipherSuitesParameters;
import org.eclipse.fennec.camel.camelspring.FilterParameters;
import org.eclipse.fennec.camel.camelspring.KeyManagersParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.SecureRandomParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.SecureSocketProtocolsParameters;
import org.eclipse.fennec.camel.camelspring.SslContextClientParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.TrustManagersParametersFactoryBean;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssl Context Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getCipherSuites <em>Cipher Suites</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getCipherSuitesFilter <em>Cipher Suites Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getSecureSocketProtocols <em>Secure Socket Protocols</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getSecureSocketProtocolsFilter <em>Secure Socket Protocols Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getKeyManagers <em>Key Managers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getTrustManagers <em>Trust Managers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getSecureRandom <em>Secure Random</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getClientParameters <em>Client Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getServerParameters <em>Server Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getCertAlias <em>Cert Alias</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getSecureSocketProtocol <em>Secure Socket Protocol</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextParametersFactoryBeanImpl#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SslContextParametersFactoryBeanImpl extends AbstractJsseUtilFactoryBeanImpl implements SslContextParametersFactoryBean {
	/**
	 * The cached value of the '{@link #getCipherSuites() <em>Cipher Suites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherSuites()
	 * @generated
	 * @ordered
	 */
	protected CipherSuitesParameters cipherSuites;

	/**
	 * The cached value of the '{@link #getCipherSuitesFilter() <em>Cipher Suites Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherSuitesFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterParameters cipherSuitesFilter;

	/**
	 * The cached value of the '{@link #getSecureSocketProtocols() <em>Secure Socket Protocols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureSocketProtocols()
	 * @generated
	 * @ordered
	 */
	protected SecureSocketProtocolsParameters secureSocketProtocols;

	/**
	 * The cached value of the '{@link #getSecureSocketProtocolsFilter() <em>Secure Socket Protocols Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureSocketProtocolsFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterParameters secureSocketProtocolsFilter;

	/**
	 * The cached value of the '{@link #getKeyManagers() <em>Key Managers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyManagers()
	 * @generated
	 * @ordered
	 */
	protected KeyManagersParametersFactoryBean keyManagers;

	/**
	 * The cached value of the '{@link #getTrustManagers() <em>Trust Managers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustManagers()
	 * @generated
	 * @ordered
	 */
	protected TrustManagersParametersFactoryBean trustManagers;

	/**
	 * The cached value of the '{@link #getSecureRandom() <em>Secure Random</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureRandom()
	 * @generated
	 * @ordered
	 */
	protected SecureRandomParametersFactoryBean secureRandom;

	/**
	 * The cached value of the '{@link #getClientParameters() <em>Client Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientParameters()
	 * @generated
	 * @ordered
	 */
	protected SslContextClientParametersFactoryBean clientParameters;

	/**
	 * The cached value of the '{@link #getServerParameters() <em>Server Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerParameters()
	 * @generated
	 * @ordered
	 */
	protected SslContextServerParametersFactoryBean serverParameters;

	/**
	 * The default value of the '{@link #getCertAlias() <em>Cert Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String CERT_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertAlias() <em>Cert Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertAlias()
	 * @generated
	 * @ordered
	 */
	protected String certAlias = CERT_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecureSocketProtocol() <em>Secure Socket Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureSocketProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURE_SOCKET_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecureSocketProtocol() <em>Secure Socket Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureSocketProtocol()
	 * @generated
	 * @ordered
	 */
	protected String secureSocketProtocol = SECURE_SOCKET_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionTimeout() <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionTimeout() <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected String sessionTimeout = SESSION_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SslContextParametersFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSslContextParametersFactoryBean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherSuitesParameters getCipherSuites() {
		return cipherSuites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCipherSuites(CipherSuitesParameters newCipherSuites, NotificationChain msgs) {
		CipherSuitesParameters oldCipherSuites = cipherSuites;
		cipherSuites = newCipherSuites;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES, oldCipherSuites, newCipherSuites);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCipherSuites(CipherSuitesParameters newCipherSuites) {
		if (newCipherSuites != cipherSuites) {
			NotificationChain msgs = null;
			if (cipherSuites != null)
				msgs = ((InternalEObject)cipherSuites).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES, null, msgs);
			if (newCipherSuites != null)
				msgs = ((InternalEObject)newCipherSuites).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES, null, msgs);
			msgs = basicSetCipherSuites(newCipherSuites, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES, newCipherSuites, newCipherSuites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterParameters getCipherSuitesFilter() {
		return cipherSuitesFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCipherSuitesFilter(FilterParameters newCipherSuitesFilter, NotificationChain msgs) {
		FilterParameters oldCipherSuitesFilter = cipherSuitesFilter;
		cipherSuitesFilter = newCipherSuitesFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER, oldCipherSuitesFilter, newCipherSuitesFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCipherSuitesFilter(FilterParameters newCipherSuitesFilter) {
		if (newCipherSuitesFilter != cipherSuitesFilter) {
			NotificationChain msgs = null;
			if (cipherSuitesFilter != null)
				msgs = ((InternalEObject)cipherSuitesFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER, null, msgs);
			if (newCipherSuitesFilter != null)
				msgs = ((InternalEObject)newCipherSuitesFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER, null, msgs);
			msgs = basicSetCipherSuitesFilter(newCipherSuitesFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER, newCipherSuitesFilter, newCipherSuitesFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecureSocketProtocolsParameters getSecureSocketProtocols() {
		return secureSocketProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecureSocketProtocols(SecureSocketProtocolsParameters newSecureSocketProtocols, NotificationChain msgs) {
		SecureSocketProtocolsParameters oldSecureSocketProtocols = secureSocketProtocols;
		secureSocketProtocols = newSecureSocketProtocols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS, oldSecureSocketProtocols, newSecureSocketProtocols);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecureSocketProtocols(SecureSocketProtocolsParameters newSecureSocketProtocols) {
		if (newSecureSocketProtocols != secureSocketProtocols) {
			NotificationChain msgs = null;
			if (secureSocketProtocols != null)
				msgs = ((InternalEObject)secureSocketProtocols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS, null, msgs);
			if (newSecureSocketProtocols != null)
				msgs = ((InternalEObject)newSecureSocketProtocols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS, null, msgs);
			msgs = basicSetSecureSocketProtocols(newSecureSocketProtocols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS, newSecureSocketProtocols, newSecureSocketProtocols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterParameters getSecureSocketProtocolsFilter() {
		return secureSocketProtocolsFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecureSocketProtocolsFilter(FilterParameters newSecureSocketProtocolsFilter, NotificationChain msgs) {
		FilterParameters oldSecureSocketProtocolsFilter = secureSocketProtocolsFilter;
		secureSocketProtocolsFilter = newSecureSocketProtocolsFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER, oldSecureSocketProtocolsFilter, newSecureSocketProtocolsFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecureSocketProtocolsFilter(FilterParameters newSecureSocketProtocolsFilter) {
		if (newSecureSocketProtocolsFilter != secureSocketProtocolsFilter) {
			NotificationChain msgs = null;
			if (secureSocketProtocolsFilter != null)
				msgs = ((InternalEObject)secureSocketProtocolsFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER, null, msgs);
			if (newSecureSocketProtocolsFilter != null)
				msgs = ((InternalEObject)newSecureSocketProtocolsFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER, null, msgs);
			msgs = basicSetSecureSocketProtocolsFilter(newSecureSocketProtocolsFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER, newSecureSocketProtocolsFilter, newSecureSocketProtocolsFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyManagersParametersFactoryBean getKeyManagers() {
		return keyManagers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyManagers(KeyManagersParametersFactoryBean newKeyManagers, NotificationChain msgs) {
		KeyManagersParametersFactoryBean oldKeyManagers = keyManagers;
		keyManagers = newKeyManagers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__KEY_MANAGERS, oldKeyManagers, newKeyManagers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyManagers(KeyManagersParametersFactoryBean newKeyManagers) {
		if (newKeyManagers != keyManagers) {
			NotificationChain msgs = null;
			if (keyManagers != null)
				msgs = ((InternalEObject)keyManagers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__KEY_MANAGERS, null, msgs);
			if (newKeyManagers != null)
				msgs = ((InternalEObject)newKeyManagers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__KEY_MANAGERS, null, msgs);
			msgs = basicSetKeyManagers(newKeyManagers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__KEY_MANAGERS, newKeyManagers, newKeyManagers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrustManagersParametersFactoryBean getTrustManagers() {
		return trustManagers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrustManagers(TrustManagersParametersFactoryBean newTrustManagers, NotificationChain msgs) {
		TrustManagersParametersFactoryBean oldTrustManagers = trustManagers;
		trustManagers = newTrustManagers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__TRUST_MANAGERS, oldTrustManagers, newTrustManagers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrustManagers(TrustManagersParametersFactoryBean newTrustManagers) {
		if (newTrustManagers != trustManagers) {
			NotificationChain msgs = null;
			if (trustManagers != null)
				msgs = ((InternalEObject)trustManagers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__TRUST_MANAGERS, null, msgs);
			if (newTrustManagers != null)
				msgs = ((InternalEObject)newTrustManagers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__TRUST_MANAGERS, null, msgs);
			msgs = basicSetTrustManagers(newTrustManagers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__TRUST_MANAGERS, newTrustManagers, newTrustManagers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecureRandomParametersFactoryBean getSecureRandom() {
		return secureRandom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecureRandom(SecureRandomParametersFactoryBean newSecureRandom, NotificationChain msgs) {
		SecureRandomParametersFactoryBean oldSecureRandom = secureRandom;
		secureRandom = newSecureRandom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_RANDOM, oldSecureRandom, newSecureRandom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecureRandom(SecureRandomParametersFactoryBean newSecureRandom) {
		if (newSecureRandom != secureRandom) {
			NotificationChain msgs = null;
			if (secureRandom != null)
				msgs = ((InternalEObject)secureRandom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_RANDOM, null, msgs);
			if (newSecureRandom != null)
				msgs = ((InternalEObject)newSecureRandom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_RANDOM, null, msgs);
			msgs = basicSetSecureRandom(newSecureRandom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_RANDOM, newSecureRandom, newSecureRandom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SslContextClientParametersFactoryBean getClientParameters() {
		return clientParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientParameters(SslContextClientParametersFactoryBean newClientParameters, NotificationChain msgs) {
		SslContextClientParametersFactoryBean oldClientParameters = clientParameters;
		clientParameters = newClientParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CLIENT_PARAMETERS, oldClientParameters, newClientParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientParameters(SslContextClientParametersFactoryBean newClientParameters) {
		if (newClientParameters != clientParameters) {
			NotificationChain msgs = null;
			if (clientParameters != null)
				msgs = ((InternalEObject)clientParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CLIENT_PARAMETERS, null, msgs);
			if (newClientParameters != null)
				msgs = ((InternalEObject)newClientParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CLIENT_PARAMETERS, null, msgs);
			msgs = basicSetClientParameters(newClientParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CLIENT_PARAMETERS, newClientParameters, newClientParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SslContextServerParametersFactoryBean getServerParameters() {
		return serverParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerParameters(SslContextServerParametersFactoryBean newServerParameters, NotificationChain msgs) {
		SslContextServerParametersFactoryBean oldServerParameters = serverParameters;
		serverParameters = newServerParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SERVER_PARAMETERS, oldServerParameters, newServerParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerParameters(SslContextServerParametersFactoryBean newServerParameters) {
		if (newServerParameters != serverParameters) {
			NotificationChain msgs = null;
			if (serverParameters != null)
				msgs = ((InternalEObject)serverParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SERVER_PARAMETERS, null, msgs);
			if (newServerParameters != null)
				msgs = ((InternalEObject)newServerParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SERVER_PARAMETERS, null, msgs);
			msgs = basicSetServerParameters(newServerParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SERVER_PARAMETERS, newServerParameters, newServerParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertAlias() {
		return certAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertAlias(String newCertAlias) {
		String oldCertAlias = certAlias;
		certAlias = newCertAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CERT_ALIAS, oldCertAlias, certAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecureSocketProtocol() {
		return secureSocketProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecureSocketProtocol(String newSecureSocketProtocol) {
		String oldSecureSocketProtocol = secureSocketProtocol;
		secureSocketProtocol = newSecureSocketProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOL, oldSecureSocketProtocol, secureSocketProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionTimeout() {
		return sessionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionTimeout(String newSessionTimeout) {
		String oldSessionTimeout = sessionTimeout;
		sessionTimeout = newSessionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT, oldSessionTimeout, sessionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
				return basicSetCipherSuites(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
				return basicSetCipherSuitesFilter(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
				return basicSetSecureSocketProtocols(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
				return basicSetSecureSocketProtocolsFilter(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__KEY_MANAGERS:
				return basicSetKeyManagers(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__TRUST_MANAGERS:
				return basicSetTrustManagers(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_RANDOM:
				return basicSetSecureRandom(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CLIENT_PARAMETERS:
				return basicSetClientParameters(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SERVER_PARAMETERS:
				return basicSetServerParameters(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
				return getCipherSuites();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
				return getCipherSuitesFilter();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
				return getSecureSocketProtocols();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
				return getSecureSocketProtocolsFilter();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__KEY_MANAGERS:
				return getKeyManagers();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__TRUST_MANAGERS:
				return getTrustManagers();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_RANDOM:
				return getSecureRandom();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CLIENT_PARAMETERS:
				return getClientParameters();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SERVER_PARAMETERS:
				return getServerParameters();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CERT_ALIAS:
				return getCertAlias();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__PROVIDER:
				return getProvider();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOL:
				return getSecureSocketProtocol();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT:
				return getSessionTimeout();
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
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
				setCipherSuites((CipherSuitesParameters)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
				setCipherSuitesFilter((FilterParameters)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
				setSecureSocketProtocols((SecureSocketProtocolsParameters)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
				setSecureSocketProtocolsFilter((FilterParameters)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__KEY_MANAGERS:
				setKeyManagers((KeyManagersParametersFactoryBean)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__TRUST_MANAGERS:
				setTrustManagers((TrustManagersParametersFactoryBean)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_RANDOM:
				setSecureRandom((SecureRandomParametersFactoryBean)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CLIENT_PARAMETERS:
				setClientParameters((SslContextClientParametersFactoryBean)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SERVER_PARAMETERS:
				setServerParameters((SslContextServerParametersFactoryBean)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CERT_ALIAS:
				setCertAlias((String)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__PROVIDER:
				setProvider((String)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOL:
				setSecureSocketProtocol((String)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT:
				setSessionTimeout((String)newValue);
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
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
				setCipherSuites((CipherSuitesParameters)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
				setCipherSuitesFilter((FilterParameters)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
				setSecureSocketProtocols((SecureSocketProtocolsParameters)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
				setSecureSocketProtocolsFilter((FilterParameters)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__KEY_MANAGERS:
				setKeyManagers((KeyManagersParametersFactoryBean)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__TRUST_MANAGERS:
				setTrustManagers((TrustManagersParametersFactoryBean)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_RANDOM:
				setSecureRandom((SecureRandomParametersFactoryBean)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CLIENT_PARAMETERS:
				setClientParameters((SslContextClientParametersFactoryBean)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SERVER_PARAMETERS:
				setServerParameters((SslContextServerParametersFactoryBean)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CERT_ALIAS:
				setCertAlias(CERT_ALIAS_EDEFAULT);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOL:
				setSecureSocketProtocol(SECURE_SOCKET_PROTOCOL_EDEFAULT);
				return;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT:
				setSessionTimeout(SESSION_TIMEOUT_EDEFAULT);
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
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
				return cipherSuites != null;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
				return cipherSuitesFilter != null;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
				return secureSocketProtocols != null;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
				return secureSocketProtocolsFilter != null;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__KEY_MANAGERS:
				return keyManagers != null;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__TRUST_MANAGERS:
				return trustManagers != null;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_RANDOM:
				return secureRandom != null;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CLIENT_PARAMETERS:
				return clientParameters != null;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SERVER_PARAMETERS:
				return serverParameters != null;
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__CERT_ALIAS:
				return CERT_ALIAS_EDEFAULT == null ? certAlias != null : !CERT_ALIAS_EDEFAULT.equals(certAlias);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOL:
				return SECURE_SOCKET_PROTOCOL_EDEFAULT == null ? secureSocketProtocol != null : !SECURE_SOCKET_PROTOCOL_EDEFAULT.equals(secureSocketProtocol);
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT:
				return SESSION_TIMEOUT_EDEFAULT == null ? sessionTimeout != null : !SESSION_TIMEOUT_EDEFAULT.equals(sessionTimeout);
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
		result.append(" (certAlias: ");
		result.append(certAlias);
		result.append(", provider: ");
		result.append(provider);
		result.append(", secureSocketProtocol: ");
		result.append(secureSocketProtocol);
		result.append(", sessionTimeout: ");
		result.append(sessionTimeout);
		result.append(')');
		return result.toString();
	}

} //SslContextParametersFactoryBeanImpl

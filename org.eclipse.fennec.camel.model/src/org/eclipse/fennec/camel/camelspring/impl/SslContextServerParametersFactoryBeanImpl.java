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
import org.eclipse.fennec.camel.camelspring.SecureSocketProtocolsParameters;
import org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssl Context Server Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextServerParametersFactoryBeanImpl#getCipherSuites <em>Cipher Suites</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextServerParametersFactoryBeanImpl#getCipherSuitesFilter <em>Cipher Suites Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextServerParametersFactoryBeanImpl#getSecureSocketProtocols <em>Secure Socket Protocols</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextServerParametersFactoryBeanImpl#getSecureSocketProtocolsFilter <em>Secure Socket Protocols Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextServerParametersFactoryBeanImpl#getClientAuthentication <em>Client Authentication</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SslContextServerParametersFactoryBeanImpl#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SslContextServerParametersFactoryBeanImpl extends AbstractJsseUtilFactoryBeanImpl implements SslContextServerParametersFactoryBean {
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
	 * The default value of the '{@link #getClientAuthentication() <em>Client Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientAuthentication()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_AUTHENTICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientAuthentication() <em>Client Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientAuthentication()
	 * @generated
	 * @ordered
	 */
	protected String clientAuthentication = CLIENT_AUTHENTICATION_EDEFAULT;

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
	protected SslContextServerParametersFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSslContextServerParametersFactoryBean();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES, oldCipherSuites, newCipherSuites);
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
				msgs = ((InternalEObject)cipherSuites).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES, null, msgs);
			if (newCipherSuites != null)
				msgs = ((InternalEObject)newCipherSuites).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES, null, msgs);
			msgs = basicSetCipherSuites(newCipherSuites, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES, newCipherSuites, newCipherSuites));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER, oldCipherSuitesFilter, newCipherSuitesFilter);
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
				msgs = ((InternalEObject)cipherSuitesFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER, null, msgs);
			if (newCipherSuitesFilter != null)
				msgs = ((InternalEObject)newCipherSuitesFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER, null, msgs);
			msgs = basicSetCipherSuitesFilter(newCipherSuitesFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER, newCipherSuitesFilter, newCipherSuitesFilter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS, oldSecureSocketProtocols, newSecureSocketProtocols);
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
				msgs = ((InternalEObject)secureSocketProtocols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS, null, msgs);
			if (newSecureSocketProtocols != null)
				msgs = ((InternalEObject)newSecureSocketProtocols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS, null, msgs);
			msgs = basicSetSecureSocketProtocols(newSecureSocketProtocols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS, newSecureSocketProtocols, newSecureSocketProtocols));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER, oldSecureSocketProtocolsFilter, newSecureSocketProtocolsFilter);
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
				msgs = ((InternalEObject)secureSocketProtocolsFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER, null, msgs);
			if (newSecureSocketProtocolsFilter != null)
				msgs = ((InternalEObject)newSecureSocketProtocolsFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER, null, msgs);
			msgs = basicSetSecureSocketProtocolsFilter(newSecureSocketProtocolsFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER, newSecureSocketProtocolsFilter, newSecureSocketProtocolsFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientAuthentication() {
		return clientAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientAuthentication(String newClientAuthentication) {
		String oldClientAuthentication = clientAuthentication;
		clientAuthentication = newClientAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CLIENT_AUTHENTICATION, oldClientAuthentication, clientAuthentication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT, oldSessionTimeout, sessionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
				return basicSetCipherSuites(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
				return basicSetCipherSuitesFilter(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
				return basicSetSecureSocketProtocols(null, msgs);
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
				return basicSetSecureSocketProtocolsFilter(null, msgs);
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
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
				return getCipherSuites();
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
				return getCipherSuitesFilter();
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
				return getSecureSocketProtocols();
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
				return getSecureSocketProtocolsFilter();
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CLIENT_AUTHENTICATION:
				return getClientAuthentication();
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT:
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
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
				setCipherSuites((CipherSuitesParameters)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
				setCipherSuitesFilter((FilterParameters)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
				setSecureSocketProtocols((SecureSocketProtocolsParameters)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
				setSecureSocketProtocolsFilter((FilterParameters)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CLIENT_AUTHENTICATION:
				setClientAuthentication((String)newValue);
				return;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT:
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
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
				setCipherSuites((CipherSuitesParameters)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
				setCipherSuitesFilter((FilterParameters)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
				setSecureSocketProtocols((SecureSocketProtocolsParameters)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
				setSecureSocketProtocolsFilter((FilterParameters)null);
				return;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CLIENT_AUTHENTICATION:
				setClientAuthentication(CLIENT_AUTHENTICATION_EDEFAULT);
				return;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT:
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
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES:
				return cipherSuites != null;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CIPHER_SUITES_FILTER:
				return cipherSuitesFilter != null;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS:
				return secureSocketProtocols != null;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SECURE_SOCKET_PROTOCOLS_FILTER:
				return secureSocketProtocolsFilter != null;
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__CLIENT_AUTHENTICATION:
				return CLIENT_AUTHENTICATION_EDEFAULT == null ? clientAuthentication != null : !CLIENT_AUTHENTICATION_EDEFAULT.equals(clientAuthentication);
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN__SESSION_TIMEOUT:
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
		result.append(" (clientAuthentication: ");
		result.append(clientAuthentication);
		result.append(", sessionTimeout: ");
		result.append(sessionTimeout);
		result.append(')');
		return result.toString();
	}

} //SslContextServerParametersFactoryBeanImpl

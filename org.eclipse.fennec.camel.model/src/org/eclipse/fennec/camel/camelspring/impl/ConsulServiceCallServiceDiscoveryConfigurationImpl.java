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
import org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consul Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConsulServiceCallServiceDiscoveryConfigurationImpl#getAclToken <em>Acl Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConsulServiceCallServiceDiscoveryConfigurationImpl#getBlockSeconds <em>Block Seconds</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConsulServiceCallServiceDiscoveryConfigurationImpl#getConnectTimeoutMillis <em>Connect Timeout Millis</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConsulServiceCallServiceDiscoveryConfigurationImpl#getDatacenter <em>Datacenter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConsulServiceCallServiceDiscoveryConfigurationImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConsulServiceCallServiceDiscoveryConfigurationImpl#getReadTimeoutMillis <em>Read Timeout Millis</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConsulServiceCallServiceDiscoveryConfigurationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConsulServiceCallServiceDiscoveryConfigurationImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConsulServiceCallServiceDiscoveryConfigurationImpl#getWriteTimeoutMillis <em>Write Timeout Millis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsulServiceCallServiceDiscoveryConfigurationImpl extends ServiceCallServiceDiscoveryConfigurationImpl implements ConsulServiceCallServiceDiscoveryConfiguration {
	/**
	 * The default value of the '{@link #getAclToken() <em>Acl Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAclToken()
	 * @generated
	 * @ordered
	 */
	protected static final String ACL_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAclToken() <em>Acl Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAclToken()
	 * @generated
	 * @ordered
	 */
	protected String aclToken = ACL_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockSeconds() <em>Block Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_SECONDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockSeconds() <em>Block Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSeconds()
	 * @generated
	 * @ordered
	 */
	protected String blockSeconds = BLOCK_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectTimeoutMillis() <em>Connect Timeout Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTimeoutMillis()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECT_TIMEOUT_MILLIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectTimeoutMillis() <em>Connect Timeout Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTimeoutMillis()
	 * @generated
	 * @ordered
	 */
	protected String connectTimeoutMillis = CONNECT_TIMEOUT_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacenter() <em>Datacenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenter()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatacenter() <em>Datacenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenter()
	 * @generated
	 * @ordered
	 */
	protected String datacenter = DATACENTER_EDEFAULT;

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
	 * The default value of the '{@link #getReadTimeoutMillis() <em>Read Timeout Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadTimeoutMillis()
	 * @generated
	 * @ordered
	 */
	protected static final String READ_TIMEOUT_MILLIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadTimeoutMillis() <em>Read Timeout Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadTimeoutMillis()
	 * @generated
	 * @ordered
	 */
	protected String readTimeoutMillis = READ_TIMEOUT_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteTimeoutMillis() <em>Write Timeout Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteTimeoutMillis()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITE_TIMEOUT_MILLIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteTimeoutMillis() <em>Write Timeout Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteTimeoutMillis()
	 * @generated
	 * @ordered
	 */
	protected String writeTimeoutMillis = WRITE_TIMEOUT_MILLIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsulServiceCallServiceDiscoveryConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getConsulServiceCallServiceDiscoveryConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAclToken() {
		return aclToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAclToken(String newAclToken) {
		String oldAclToken = aclToken;
		aclToken = newAclToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__ACL_TOKEN, oldAclToken, aclToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlockSeconds() {
		return blockSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockSeconds(String newBlockSeconds) {
		String oldBlockSeconds = blockSeconds;
		blockSeconds = newBlockSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__BLOCK_SECONDS, oldBlockSeconds, blockSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectTimeoutMillis() {
		return connectTimeoutMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectTimeoutMillis(String newConnectTimeoutMillis) {
		String oldConnectTimeoutMillis = connectTimeoutMillis;
		connectTimeoutMillis = newConnectTimeoutMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONNECT_TIMEOUT_MILLIS, oldConnectTimeoutMillis, connectTimeoutMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatacenter() {
		return datacenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatacenter(String newDatacenter) {
		String oldDatacenter = datacenter;
		datacenter = newDatacenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DATACENTER, oldDatacenter, datacenter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReadTimeoutMillis() {
		return readTimeoutMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadTimeoutMillis(String newReadTimeoutMillis) {
		String oldReadTimeoutMillis = readTimeoutMillis;
		readTimeoutMillis = newReadTimeoutMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__READ_TIMEOUT_MILLIS, oldReadTimeoutMillis, readTimeoutMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWriteTimeoutMillis() {
		return writeTimeoutMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteTimeoutMillis(String newWriteTimeoutMillis) {
		String oldWriteTimeoutMillis = writeTimeoutMillis;
		writeTimeoutMillis = newWriteTimeoutMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__WRITE_TIMEOUT_MILLIS, oldWriteTimeoutMillis, writeTimeoutMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__ACL_TOKEN:
				return getAclToken();
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__BLOCK_SECONDS:
				return getBlockSeconds();
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONNECT_TIMEOUT_MILLIS:
				return getConnectTimeoutMillis();
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DATACENTER:
				return getDatacenter();
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PASSWORD:
				return getPassword();
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__READ_TIMEOUT_MILLIS:
				return getReadTimeoutMillis();
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__URL:
				return getUrl();
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__USER_NAME:
				return getUserName();
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__WRITE_TIMEOUT_MILLIS:
				return getWriteTimeoutMillis();
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
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__ACL_TOKEN:
				setAclToken((String)newValue);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__BLOCK_SECONDS:
				setBlockSeconds((String)newValue);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONNECT_TIMEOUT_MILLIS:
				setConnectTimeoutMillis((String)newValue);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DATACENTER:
				setDatacenter((String)newValue);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PASSWORD:
				setPassword((String)newValue);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__READ_TIMEOUT_MILLIS:
				setReadTimeoutMillis((String)newValue);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__URL:
				setUrl((String)newValue);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__USER_NAME:
				setUserName((String)newValue);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__WRITE_TIMEOUT_MILLIS:
				setWriteTimeoutMillis((String)newValue);
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
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__ACL_TOKEN:
				setAclToken(ACL_TOKEN_EDEFAULT);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__BLOCK_SECONDS:
				setBlockSeconds(BLOCK_SECONDS_EDEFAULT);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONNECT_TIMEOUT_MILLIS:
				setConnectTimeoutMillis(CONNECT_TIMEOUT_MILLIS_EDEFAULT);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DATACENTER:
				setDatacenter(DATACENTER_EDEFAULT);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__READ_TIMEOUT_MILLIS:
				setReadTimeoutMillis(READ_TIMEOUT_MILLIS_EDEFAULT);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__URL:
				setUrl(URL_EDEFAULT);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__WRITE_TIMEOUT_MILLIS:
				setWriteTimeoutMillis(WRITE_TIMEOUT_MILLIS_EDEFAULT);
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
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__ACL_TOKEN:
				return ACL_TOKEN_EDEFAULT == null ? aclToken != null : !ACL_TOKEN_EDEFAULT.equals(aclToken);
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__BLOCK_SECONDS:
				return BLOCK_SECONDS_EDEFAULT == null ? blockSeconds != null : !BLOCK_SECONDS_EDEFAULT.equals(blockSeconds);
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONNECT_TIMEOUT_MILLIS:
				return CONNECT_TIMEOUT_MILLIS_EDEFAULT == null ? connectTimeoutMillis != null : !CONNECT_TIMEOUT_MILLIS_EDEFAULT.equals(connectTimeoutMillis);
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__DATACENTER:
				return DATACENTER_EDEFAULT == null ? datacenter != null : !DATACENTER_EDEFAULT.equals(datacenter);
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__READ_TIMEOUT_MILLIS:
				return READ_TIMEOUT_MILLIS_EDEFAULT == null ? readTimeoutMillis != null : !READ_TIMEOUT_MILLIS_EDEFAULT.equals(readTimeoutMillis);
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__WRITE_TIMEOUT_MILLIS:
				return WRITE_TIMEOUT_MILLIS_EDEFAULT == null ? writeTimeoutMillis != null : !WRITE_TIMEOUT_MILLIS_EDEFAULT.equals(writeTimeoutMillis);
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
		result.append(" (aclToken: ");
		result.append(aclToken);
		result.append(", blockSeconds: ");
		result.append(blockSeconds);
		result.append(", connectTimeoutMillis: ");
		result.append(connectTimeoutMillis);
		result.append(", datacenter: ");
		result.append(datacenter);
		result.append(", password: ");
		result.append(password);
		result.append(", readTimeoutMillis: ");
		result.append(readTimeoutMillis);
		result.append(", url: ");
		result.append(url);
		result.append(", userName: ");
		result.append(userName);
		result.append(", writeTimeoutMillis: ");
		result.append(writeTimeoutMillis);
		result.append(')');
		return result.toString();
	}

} //ConsulServiceCallServiceDiscoveryConfigurationImpl

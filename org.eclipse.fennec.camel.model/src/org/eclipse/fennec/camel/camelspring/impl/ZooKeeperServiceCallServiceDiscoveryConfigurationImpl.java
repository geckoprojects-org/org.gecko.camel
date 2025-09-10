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
import org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zoo Keeper Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZooKeeperServiceCallServiceDiscoveryConfigurationImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZooKeeperServiceCallServiceDiscoveryConfigurationImpl#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZooKeeperServiceCallServiceDiscoveryConfigurationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZooKeeperServiceCallServiceDiscoveryConfigurationImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZooKeeperServiceCallServiceDiscoveryConfigurationImpl#getReconnectBaseSleepTime <em>Reconnect Base Sleep Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZooKeeperServiceCallServiceDiscoveryConfigurationImpl#getReconnectMaxRetries <em>Reconnect Max Retries</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZooKeeperServiceCallServiceDiscoveryConfigurationImpl#getReconnectMaxSleepTime <em>Reconnect Max Sleep Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZooKeeperServiceCallServiceDiscoveryConfigurationImpl#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZooKeeperServiceCallServiceDiscoveryConfigurationImpl extends ServiceCallServiceDiscoveryConfigurationImpl implements ZooKeeperServiceCallServiceDiscoveryConfiguration {
	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeout()
	 * @generated
	 * @ordered
	 */
	protected String connectionTimeout = CONNECTION_TIMEOUT_EDEFAULT;

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
	 * The default value of the '{@link #getNodes() <em>Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected static final String NODES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected String nodes = NODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReconnectBaseSleepTime() <em>Reconnect Base Sleep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconnectBaseSleepTime()
	 * @generated
	 * @ordered
	 */
	protected static final String RECONNECT_BASE_SLEEP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReconnectBaseSleepTime() <em>Reconnect Base Sleep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconnectBaseSleepTime()
	 * @generated
	 * @ordered
	 */
	protected String reconnectBaseSleepTime = RECONNECT_BASE_SLEEP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReconnectMaxRetries() <em>Reconnect Max Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconnectMaxRetries()
	 * @generated
	 * @ordered
	 */
	protected static final String RECONNECT_MAX_RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReconnectMaxRetries() <em>Reconnect Max Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconnectMaxRetries()
	 * @generated
	 * @ordered
	 */
	protected String reconnectMaxRetries = RECONNECT_MAX_RETRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReconnectMaxSleepTime() <em>Reconnect Max Sleep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconnectMaxSleepTime()
	 * @generated
	 * @ordered
	 */
	protected static final String RECONNECT_MAX_SLEEP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReconnectMaxSleepTime() <em>Reconnect Max Sleep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconnectMaxSleepTime()
	 * @generated
	 * @ordered
	 */
	protected String reconnectMaxSleepTime = RECONNECT_MAX_SLEEP_TIME_EDEFAULT;

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
	protected ZooKeeperServiceCallServiceDiscoveryConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getZooKeeperServiceCallServiceDiscoveryConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectionTimeout() {
		return connectionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionTimeout(String newConnectionTimeout) {
		String oldConnectionTimeout = connectionTimeout;
		connectionTimeout = newConnectionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONNECTION_TIMEOUT, oldConnectionTimeout, connectionTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodes() {
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodes(String newNodes) {
		String oldNodes = nodes;
		nodes = newNodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NODES, oldNodes, nodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReconnectBaseSleepTime() {
		return reconnectBaseSleepTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconnectBaseSleepTime(String newReconnectBaseSleepTime) {
		String oldReconnectBaseSleepTime = reconnectBaseSleepTime;
		reconnectBaseSleepTime = newReconnectBaseSleepTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_BASE_SLEEP_TIME, oldReconnectBaseSleepTime, reconnectBaseSleepTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReconnectMaxRetries() {
		return reconnectMaxRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconnectMaxRetries(String newReconnectMaxRetries) {
		String oldReconnectMaxRetries = reconnectMaxRetries;
		reconnectMaxRetries = newReconnectMaxRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_MAX_RETRIES, oldReconnectMaxRetries, reconnectMaxRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReconnectMaxSleepTime() {
		return reconnectMaxSleepTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconnectMaxSleepTime(String newReconnectMaxSleepTime) {
		String oldReconnectMaxSleepTime = reconnectMaxSleepTime;
		reconnectMaxSleepTime = newReconnectMaxSleepTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_MAX_SLEEP_TIME, oldReconnectMaxSleepTime, reconnectMaxSleepTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__SESSION_TIMEOUT, oldSessionTimeout, sessionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__BASE_PATH:
				return getBasePath();
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONNECTION_TIMEOUT:
				return getConnectionTimeout();
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NAMESPACE:
				return getNamespace();
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NODES:
				return getNodes();
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_BASE_SLEEP_TIME:
				return getReconnectBaseSleepTime();
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_MAX_RETRIES:
				return getReconnectMaxRetries();
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_MAX_SLEEP_TIME:
				return getReconnectMaxSleepTime();
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__SESSION_TIMEOUT:
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
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONNECTION_TIMEOUT:
				setConnectionTimeout((String)newValue);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NODES:
				setNodes((String)newValue);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_BASE_SLEEP_TIME:
				setReconnectBaseSleepTime((String)newValue);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_MAX_RETRIES:
				setReconnectMaxRetries((String)newValue);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_MAX_SLEEP_TIME:
				setReconnectMaxSleepTime((String)newValue);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__SESSION_TIMEOUT:
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
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONNECTION_TIMEOUT:
				setConnectionTimeout(CONNECTION_TIMEOUT_EDEFAULT);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NODES:
				setNodes(NODES_EDEFAULT);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_BASE_SLEEP_TIME:
				setReconnectBaseSleepTime(RECONNECT_BASE_SLEEP_TIME_EDEFAULT);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_MAX_RETRIES:
				setReconnectMaxRetries(RECONNECT_MAX_RETRIES_EDEFAULT);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_MAX_SLEEP_TIME:
				setReconnectMaxSleepTime(RECONNECT_MAX_SLEEP_TIME_EDEFAULT);
				return;
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__SESSION_TIMEOUT:
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
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__CONNECTION_TIMEOUT:
				return CONNECTION_TIMEOUT_EDEFAULT == null ? connectionTimeout != null : !CONNECTION_TIMEOUT_EDEFAULT.equals(connectionTimeout);
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__NODES:
				return NODES_EDEFAULT == null ? nodes != null : !NODES_EDEFAULT.equals(nodes);
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_BASE_SLEEP_TIME:
				return RECONNECT_BASE_SLEEP_TIME_EDEFAULT == null ? reconnectBaseSleepTime != null : !RECONNECT_BASE_SLEEP_TIME_EDEFAULT.equals(reconnectBaseSleepTime);
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_MAX_RETRIES:
				return RECONNECT_MAX_RETRIES_EDEFAULT == null ? reconnectMaxRetries != null : !RECONNECT_MAX_RETRIES_EDEFAULT.equals(reconnectMaxRetries);
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__RECONNECT_MAX_SLEEP_TIME:
				return RECONNECT_MAX_SLEEP_TIME_EDEFAULT == null ? reconnectMaxSleepTime != null : !RECONNECT_MAX_SLEEP_TIME_EDEFAULT.equals(reconnectMaxSleepTime);
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION__SESSION_TIMEOUT:
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
		result.append(" (basePath: ");
		result.append(basePath);
		result.append(", connectionTimeout: ");
		result.append(connectionTimeout);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", nodes: ");
		result.append(nodes);
		result.append(", reconnectBaseSleepTime: ");
		result.append(reconnectBaseSleepTime);
		result.append(", reconnectMaxRetries: ");
		result.append(reconnectMaxRetries);
		result.append(", reconnectMaxSleepTime: ");
		result.append(reconnectMaxSleepTime);
		result.append(", sessionTimeout: ");
		result.append(sessionTimeout);
		result.append(')');
		return result.toString();
	}

} //ZooKeeperServiceCallServiceDiscoveryConfigurationImpl

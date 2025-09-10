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
 * A representation of the model object '<em><b>Zoo Keeper Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getReconnectBaseSleepTime <em>Reconnect Base Sleep Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getReconnectMaxRetries <em>Reconnect Max Retries</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getReconnectMaxSleepTime <em>Reconnect Max Sleep Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZooKeeperServiceCallServiceDiscoveryConfiguration()
 * @model extendedMetaData="name='zooKeeperServiceCallServiceDiscoveryConfiguration' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ZooKeeperServiceCallServiceDiscoveryConfiguration extends ServiceCallServiceDiscoveryConfiguration {
	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the base path to store in ZK.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZooKeeperServiceCallServiceDiscoveryConfiguration_BasePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='basePath'"
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Connection Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Connection timeout.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Timeout</em>' attribute.
	 * @see #setConnectionTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZooKeeperServiceCallServiceDiscoveryConfiguration_ConnectionTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='connectionTimeout'"
	 * @generated
	 */
	String getConnectionTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getConnectionTimeout <em>Connection Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Timeout</em>' attribute.
	 * @see #getConnectionTimeout()
	 * @generated
	 */
	void setConnectionTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * As ZooKeeper is a shared space, users of a given cluster should stay within a pre-defined namespace. If a namespace is
	 * set here, all paths will get pre-pended with the namespace.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZooKeeperServiceCallServiceDiscoveryConfiguration_Namespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A comma separate list of servers to connect to in the form host:port.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nodes</em>' attribute.
	 * @see #setNodes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZooKeeperServiceCallServiceDiscoveryConfiguration_Nodes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='nodes'"
	 * @generated
	 */
	String getNodes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getNodes <em>Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' attribute.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(String value);

	/**
	 * Returns the value of the '<em><b>Reconnect Base Sleep Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Initial amount of time to wait between retries.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconnect Base Sleep Time</em>' attribute.
	 * @see #setReconnectBaseSleepTime(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZooKeeperServiceCallServiceDiscoveryConfiguration_ReconnectBaseSleepTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='reconnectBaseSleepTime'"
	 * @generated
	 */
	String getReconnectBaseSleepTime();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getReconnectBaseSleepTime <em>Reconnect Base Sleep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconnect Base Sleep Time</em>' attribute.
	 * @see #getReconnectBaseSleepTime()
	 * @generated
	 */
	void setReconnectBaseSleepTime(String value);

	/**
	 * Returns the value of the '<em><b>Reconnect Max Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Max number of times to retry.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconnect Max Retries</em>' attribute.
	 * @see #setReconnectMaxRetries(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZooKeeperServiceCallServiceDiscoveryConfiguration_ReconnectMaxRetries()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='reconnectMaxRetries'"
	 * @generated
	 */
	String getReconnectMaxRetries();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getReconnectMaxRetries <em>Reconnect Max Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconnect Max Retries</em>' attribute.
	 * @see #getReconnectMaxRetries()
	 * @generated
	 */
	void setReconnectMaxRetries(String value);

	/**
	 * Returns the value of the '<em><b>Reconnect Max Sleep Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Max time in ms to sleep on each retry.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconnect Max Sleep Time</em>' attribute.
	 * @see #setReconnectMaxSleepTime(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZooKeeperServiceCallServiceDiscoveryConfiguration_ReconnectMaxSleepTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='reconnectMaxSleepTime'"
	 * @generated
	 */
	String getReconnectMaxSleepTime();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getReconnectMaxSleepTime <em>Reconnect Max Sleep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconnect Max Sleep Time</em>' attribute.
	 * @see #getReconnectMaxSleepTime()
	 * @generated
	 */
	void setReconnectMaxSleepTime(String value);

	/**
	 * Returns the value of the '<em><b>Session Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Session timeout.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Timeout</em>' attribute.
	 * @see #setSessionTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getZooKeeperServiceCallServiceDiscoveryConfiguration_SessionTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sessionTimeout'"
	 * @generated
	 */
	String getSessionTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration#getSessionTimeout <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Timeout</em>' attribute.
	 * @see #getSessionTimeout()
	 * @generated
	 */
	void setSessionTimeout(String value);

} // ZooKeeperServiceCallServiceDiscoveryConfiguration

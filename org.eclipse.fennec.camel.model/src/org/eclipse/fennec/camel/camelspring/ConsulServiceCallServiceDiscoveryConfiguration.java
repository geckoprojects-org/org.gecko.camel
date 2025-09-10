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
 * A representation of the model object '<em><b>Consul Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getAclToken <em>Acl Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getBlockSeconds <em>Block Seconds</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getConnectTimeoutMillis <em>Connect Timeout Millis</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getDatacenter <em>Datacenter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getReadTimeoutMillis <em>Read Timeout Millis</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getWriteTimeoutMillis <em>Write Timeout Millis</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConsulServiceCallServiceDiscoveryConfiguration()
 * @model extendedMetaData="name='consulServiceCallServiceDiscoveryConfiguration' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConsulServiceCallServiceDiscoveryConfiguration extends ServiceCallServiceDiscoveryConfiguration {
	/**
	 * Returns the value of the '<em><b>Acl Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the ACL token to be used with Consul.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acl Token</em>' attribute.
	 * @see #setAclToken(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConsulServiceCallServiceDiscoveryConfiguration_AclToken()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aclToken'"
	 * @generated
	 */
	String getAclToken();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getAclToken <em>Acl Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acl Token</em>' attribute.
	 * @see #getAclToken()
	 * @generated
	 */
	void setAclToken(String value);

	/**
	 * Returns the value of the '<em><b>Block Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The seconds to wait for a watch event, default 10 seconds. Default value: 10
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Seconds</em>' attribute.
	 * @see #setBlockSeconds(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConsulServiceCallServiceDiscoveryConfiguration_BlockSeconds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='blockSeconds'"
	 * @generated
	 */
	String getBlockSeconds();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getBlockSeconds <em>Block Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Seconds</em>' attribute.
	 * @see #getBlockSeconds()
	 * @generated
	 */
	void setBlockSeconds(String value);

	/**
	 * Returns the value of the '<em><b>Connect Timeout Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Connect timeout for OkHttpClient.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connect Timeout Millis</em>' attribute.
	 * @see #setConnectTimeoutMillis(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConsulServiceCallServiceDiscoveryConfiguration_ConnectTimeoutMillis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='connectTimeoutMillis'"
	 * @generated
	 */
	String getConnectTimeoutMillis();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getConnectTimeoutMillis <em>Connect Timeout Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Timeout Millis</em>' attribute.
	 * @see #getConnectTimeoutMillis()
	 * @generated
	 */
	void setConnectTimeoutMillis(String value);

	/**
	 * Returns the value of the '<em><b>Datacenter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The data center.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacenter</em>' attribute.
	 * @see #setDatacenter(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConsulServiceCallServiceDiscoveryConfiguration_Datacenter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='datacenter'"
	 * @generated
	 */
	String getDatacenter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getDatacenter <em>Datacenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter</em>' attribute.
	 * @see #getDatacenter()
	 * @generated
	 */
	void setDatacenter(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the password to be used for basic authentication.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConsulServiceCallServiceDiscoveryConfiguration_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Read Timeout Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Read timeout for OkHttpClient.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Timeout Millis</em>' attribute.
	 * @see #setReadTimeoutMillis(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConsulServiceCallServiceDiscoveryConfiguration_ReadTimeoutMillis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='readTimeoutMillis'"
	 * @generated
	 */
	String getReadTimeoutMillis();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getReadTimeoutMillis <em>Read Timeout Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Timeout Millis</em>' attribute.
	 * @see #getReadTimeoutMillis()
	 * @generated
	 */
	void setReadTimeoutMillis(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The Consul agent URL.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConsulServiceCallServiceDiscoveryConfiguration_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='url'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the username to be used for basic authentication.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConsulServiceCallServiceDiscoveryConfiguration_UserName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='userName'"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Write Timeout Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Write timeout for OkHttpClient.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Timeout Millis</em>' attribute.
	 * @see #setWriteTimeoutMillis(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getConsulServiceCallServiceDiscoveryConfiguration_WriteTimeoutMillis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='writeTimeoutMillis'"
	 * @generated
	 */
	String getWriteTimeoutMillis();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration#getWriteTimeoutMillis <em>Write Timeout Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Timeout Millis</em>' attribute.
	 * @see #getWriteTimeoutMillis()
	 * @generated
	 */
	void setWriteTimeoutMillis(String value);

} // ConsulServiceCallServiceDiscoveryConfiguration

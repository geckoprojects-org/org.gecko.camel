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
 * A representation of the model object '<em><b>Camel JMX Agent Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getEndpointRuntimeStatisticsEnabled <em>Endpoint Runtime Statistics Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getIncludeHostName <em>Include Host Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getLoadStatisticsEnabled <em>Load Statistics Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getMask <em>Mask</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getMbeanObjectDomainName <em>Mbean Object Domain Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getMbeanServerDefaultDomain <em>Mbean Server Default Domain</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getMbeansLevel <em>Mbeans Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getOnlyRegisterProcessorWithCustomId <em>Only Register Processor With Custom Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getRegisterAlways <em>Register Always</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getRegisterNewRoutes <em>Register New Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getStatisticsLevel <em>Statistics Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getUpdateRouteEnabled <em>Update Route Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getUseHostIPAddress <em>Use Host IP Address</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getUsePlatformMBeanServer <em>Use Platform MBean Server</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition()
 * @model extendedMetaData="name='camelJMXAgentDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface CamelJMXAgentDefinition extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Disable JMI (default false). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_Disabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='disabled'"
	 * @generated
	 */
	String getDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint Runtime Statistics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A flag that indicates whether endpoint runtime statistics is enabled. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint Runtime Statistics Enabled</em>' attribute.
	 * @see #setEndpointRuntimeStatisticsEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_EndpointRuntimeStatisticsEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endpointRuntimeStatisticsEnabled'"
	 * @generated
	 */
	String getEndpointRuntimeStatisticsEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getEndpointRuntimeStatisticsEnabled <em>Endpoint Runtime Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Runtime Statistics Enabled</em>' attribute.
	 * @see #getEndpointRuntimeStatisticsEnabled()
	 * @generated
	 */
	void setEndpointRuntimeStatisticsEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Include Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A flag that indicates whether to include hostname in JMX MBean names. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Host Name</em>' attribute.
	 * @see #setIncludeHostName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_IncludeHostName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='includeHostName'"
	 * @generated
	 */
	String getIncludeHostName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getIncludeHostName <em>Include Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Host Name</em>' attribute.
	 * @see #getIncludeHostName()
	 * @generated
	 */
	void setIncludeHostName(String value);

	/**
	 * Returns the value of the '<em><b>Load Statistics Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A flag that indicates whether Load statistics is enabled. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Statistics Enabled</em>' attribute.
	 * @see #setLoadStatisticsEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_LoadStatisticsEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='loadStatisticsEnabled'"
	 * @generated
	 */
	String getLoadStatisticsEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getLoadStatisticsEnabled <em>Load Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Statistics Enabled</em>' attribute.
	 * @see #getLoadStatisticsEnabled()
	 * @generated
	 */
	void setLoadStatisticsEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A flag that indicates whether to remove detected sensitive information (such as passwords) from MBean names and
	 * attributes. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_Mask()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mask'"
	 * @generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String value);

	/**
	 * Returns the value of the '<em><b>Mbean Object Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * MBean object domain name (default org.apache.camel). Default value: org.apache.camel
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mbean Object Domain Name</em>' attribute.
	 * @see #setMbeanObjectDomainName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_MbeanObjectDomainName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mbeanObjectDomainName'"
	 * @generated
	 */
	String getMbeanObjectDomainName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getMbeanObjectDomainName <em>Mbean Object Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mbean Object Domain Name</em>' attribute.
	 * @see #getMbeanObjectDomainName()
	 * @generated
	 */
	void setMbeanObjectDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Mbean Server Default Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * MBean server default domain name (default org.apache.camel). Default value: org.apache.camel
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mbean Server Default Domain</em>' attribute.
	 * @see #setMbeanServerDefaultDomain(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_MbeanServerDefaultDomain()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mbeanServerDefaultDomain'"
	 * @generated
	 */
	String getMbeanServerDefaultDomain();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getMbeanServerDefaultDomain <em>Mbean Server Default Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mbean Server Default Domain</em>' attribute.
	 * @see #getMbeanServerDefaultDomain()
	 * @generated
	 */
	void setMbeanServerDefaultDomain(String value);

	/**
	 * Returns the value of the '<em><b>Mbeans Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the mbeans registration level. The default value is Default. Default value: Default
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mbeans Level</em>' attribute.
	 * @see #setMbeansLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_MbeansLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mbeansLevel'"
	 * @generated
	 */
	String getMbeansLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getMbeansLevel <em>Mbeans Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mbeans Level</em>' attribute.
	 * @see #getMbeansLevel()
	 * @generated
	 */
	void setMbeansLevel(String value);

	/**
	 * Returns the value of the '<em><b>Only Register Processor With Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Only register processor if a custom id was defined for it. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Only Register Processor With Custom Id</em>' attribute.
	 * @see #setOnlyRegisterProcessorWithCustomId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_OnlyRegisterProcessorWithCustomId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onlyRegisterProcessorWithCustomId'"
	 * @generated
	 */
	String getOnlyRegisterProcessorWithCustomId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getOnlyRegisterProcessorWithCustomId <em>Only Register Processor With Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Register Processor With Custom Id</em>' attribute.
	 * @see #getOnlyRegisterProcessorWithCustomId()
	 * @generated
	 */
	void setOnlyRegisterProcessorWithCustomId(String value);

	/**
	 * Returns the value of the '<em><b>Register Always</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A flag that indicates whether to register mbeans always. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register Always</em>' attribute.
	 * @see #setRegisterAlways(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_RegisterAlways()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='registerAlways'"
	 * @generated
	 */
	String getRegisterAlways();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getRegisterAlways <em>Register Always</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Always</em>' attribute.
	 * @see #getRegisterAlways()
	 * @generated
	 */
	void setRegisterAlways(String value);

	/**
	 * Returns the value of the '<em><b>Register New Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A flag that indicates whether to register mbeans when starting new routes. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register New Routes</em>' attribute.
	 * @see #setRegisterNewRoutes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_RegisterNewRoutes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='registerNewRoutes'"
	 * @generated
	 */
	String getRegisterNewRoutes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getRegisterNewRoutes <em>Register New Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register New Routes</em>' attribute.
	 * @see #getRegisterNewRoutes()
	 * @generated
	 */
	void setRegisterNewRoutes(String value);

	/**
	 * Returns the value of the '<em><b>Statistics Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Level of granularity for performance statistics enabled. Default value: Default
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statistics Level</em>' attribute.
	 * @see #setStatisticsLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_StatisticsLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='statisticsLevel'"
	 * @generated
	 */
	String getStatisticsLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getStatisticsLevel <em>Statistics Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistics Level</em>' attribute.
	 * @see #getStatisticsLevel()
	 * @generated
	 */
	void setStatisticsLevel(String value);

	/**
	 * Returns the value of the '<em><b>Update Route Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether updating routes via JMX is allowed (is default disabled). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Route Enabled</em>' attribute.
	 * @see #setUpdateRouteEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_UpdateRouteEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='updateRouteEnabled'"
	 * @generated
	 */
	String getUpdateRouteEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getUpdateRouteEnabled <em>Update Route Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Route Enabled</em>' attribute.
	 * @see #getUpdateRouteEnabled()
	 * @generated
	 */
	void setUpdateRouteEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Use Host IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A flag that indicates whether to use hostname or IP Address in the service url. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Host IP Address</em>' attribute.
	 * @see #setUseHostIPAddress(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_UseHostIPAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useHostIPAddress'"
	 * @generated
	 */
	String getUseHostIPAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getUseHostIPAddress <em>Use Host IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Host IP Address</em>' attribute.
	 * @see #getUseHostIPAddress()
	 * @generated
	 */
	void setUseHostIPAddress(String value);

	/**
	 * Returns the value of the '<em><b>Use Platform MBean Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A flag that indicates whether the platform mbean server should be used. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Platform MBean Server</em>' attribute.
	 * @see #setUsePlatformMBeanServer(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelJMXAgentDefinition_UsePlatformMBeanServer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='usePlatformMBeanServer'"
	 * @generated
	 */
	String getUsePlatformMBeanServer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition#getUsePlatformMBeanServer <em>Use Platform MBean Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Platform MBean Server</em>' attribute.
	 * @see #getUsePlatformMBeanServer()
	 * @generated
	 */
	void setUsePlatformMBeanServer(String value);

} // CamelJMXAgentDefinition

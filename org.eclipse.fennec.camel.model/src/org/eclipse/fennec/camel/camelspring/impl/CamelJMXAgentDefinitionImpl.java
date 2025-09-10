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

import org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel JMX Agent Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getEndpointRuntimeStatisticsEnabled <em>Endpoint Runtime Statistics Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getIncludeHostName <em>Include Host Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getLoadStatisticsEnabled <em>Load Statistics Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getMbeanObjectDomainName <em>Mbean Object Domain Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getMbeanServerDefaultDomain <em>Mbean Server Default Domain</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getMbeansLevel <em>Mbeans Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getOnlyRegisterProcessorWithCustomId <em>Only Register Processor With Custom Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getRegisterAlways <em>Register Always</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getRegisterNewRoutes <em>Register New Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getStatisticsLevel <em>Statistics Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getUpdateRouteEnabled <em>Update Route Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getUseHostIPAddress <em>Use Host IP Address</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelJMXAgentDefinitionImpl#getUsePlatformMBeanServer <em>Use Platform MBean Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamelJMXAgentDefinitionImpl extends IdentifiedTypeImpl implements CamelJMXAgentDefinition {
	/**
	 * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final String DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected String disabled = DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpointRuntimeStatisticsEnabled() <em>Endpoint Runtime Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointRuntimeStatisticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_RUNTIME_STATISTICS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointRuntimeStatisticsEnabled() <em>Endpoint Runtime Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointRuntimeStatisticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected String endpointRuntimeStatisticsEnabled = ENDPOINT_RUNTIME_STATISTICS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeHostName() <em>Include Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeHostName()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_HOST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeHostName() <em>Include Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeHostName()
	 * @generated
	 * @ordered
	 */
	protected String includeHostName = INCLUDE_HOST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadStatisticsEnabled() <em>Load Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadStatisticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_STATISTICS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadStatisticsEnabled() <em>Load Statistics Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadStatisticsEnabled()
	 * @generated
	 * @ordered
	 */
	protected String loadStatisticsEnabled = LOAD_STATISTICS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected static final String MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected String mask = MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMbeanObjectDomainName() <em>Mbean Object Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbeanObjectDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String MBEAN_OBJECT_DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMbeanObjectDomainName() <em>Mbean Object Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbeanObjectDomainName()
	 * @generated
	 * @ordered
	 */
	protected String mbeanObjectDomainName = MBEAN_OBJECT_DOMAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMbeanServerDefaultDomain() <em>Mbean Server Default Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbeanServerDefaultDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String MBEAN_SERVER_DEFAULT_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMbeanServerDefaultDomain() <em>Mbean Server Default Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbeanServerDefaultDomain()
	 * @generated
	 * @ordered
	 */
	protected String mbeanServerDefaultDomain = MBEAN_SERVER_DEFAULT_DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMbeansLevel() <em>Mbeans Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbeansLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String MBEANS_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMbeansLevel() <em>Mbeans Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbeansLevel()
	 * @generated
	 * @ordered
	 */
	protected String mbeansLevel = MBEANS_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnlyRegisterProcessorWithCustomId() <em>Only Register Processor With Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlyRegisterProcessorWithCustomId()
	 * @generated
	 * @ordered
	 */
	protected static final String ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnlyRegisterProcessorWithCustomId() <em>Only Register Processor With Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlyRegisterProcessorWithCustomId()
	 * @generated
	 * @ordered
	 */
	protected String onlyRegisterProcessorWithCustomId = ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisterAlways() <em>Register Always</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterAlways()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTER_ALWAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisterAlways() <em>Register Always</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterAlways()
	 * @generated
	 * @ordered
	 */
	protected String registerAlways = REGISTER_ALWAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisterNewRoutes() <em>Register New Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterNewRoutes()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTER_NEW_ROUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisterNewRoutes() <em>Register New Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterNewRoutes()
	 * @generated
	 * @ordered
	 */
	protected String registerNewRoutes = REGISTER_NEW_ROUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatisticsLevel() <em>Statistics Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticsLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String STATISTICS_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatisticsLevel() <em>Statistics Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticsLevel()
	 * @generated
	 * @ordered
	 */
	protected String statisticsLevel = STATISTICS_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateRouteEnabled() <em>Update Route Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateRouteEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_ROUTE_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateRouteEnabled() <em>Update Route Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateRouteEnabled()
	 * @generated
	 * @ordered
	 */
	protected String updateRouteEnabled = UPDATE_ROUTE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseHostIPAddress() <em>Use Host IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseHostIPAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_HOST_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseHostIPAddress() <em>Use Host IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseHostIPAddress()
	 * @generated
	 * @ordered
	 */
	protected String useHostIPAddress = USE_HOST_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsePlatformMBeanServer() <em>Use Platform MBean Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePlatformMBeanServer()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_PLATFORM_MBEAN_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsePlatformMBeanServer() <em>Use Platform MBean Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePlatformMBeanServer()
	 * @generated
	 * @ordered
	 */
	protected String usePlatformMBeanServer = USE_PLATFORM_MBEAN_SERVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelJMXAgentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCamelJMXAgentDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabled(String newDisabled) {
		String oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED, oldDisabled, disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndpointRuntimeStatisticsEnabled() {
		return endpointRuntimeStatisticsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointRuntimeStatisticsEnabled(String newEndpointRuntimeStatisticsEnabled) {
		String oldEndpointRuntimeStatisticsEnabled = endpointRuntimeStatisticsEnabled;
		endpointRuntimeStatisticsEnabled = newEndpointRuntimeStatisticsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__ENDPOINT_RUNTIME_STATISTICS_ENABLED, oldEndpointRuntimeStatisticsEnabled, endpointRuntimeStatisticsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncludeHostName() {
		return includeHostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeHostName(String newIncludeHostName) {
		String oldIncludeHostName = includeHostName;
		includeHostName = newIncludeHostName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__INCLUDE_HOST_NAME, oldIncludeHostName, includeHostName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoadStatisticsEnabled() {
		return loadStatisticsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadStatisticsEnabled(String newLoadStatisticsEnabled) {
		String oldLoadStatisticsEnabled = loadStatisticsEnabled;
		loadStatisticsEnabled = newLoadStatisticsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__LOAD_STATISTICS_ENABLED, oldLoadStatisticsEnabled, loadStatisticsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMask(String newMask) {
		String oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMbeanObjectDomainName() {
		return mbeanObjectDomainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMbeanObjectDomainName(String newMbeanObjectDomainName) {
		String oldMbeanObjectDomainName = mbeanObjectDomainName;
		mbeanObjectDomainName = newMbeanObjectDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME, oldMbeanObjectDomainName, mbeanObjectDomainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMbeanServerDefaultDomain() {
		return mbeanServerDefaultDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMbeanServerDefaultDomain(String newMbeanServerDefaultDomain) {
		String oldMbeanServerDefaultDomain = mbeanServerDefaultDomain;
		mbeanServerDefaultDomain = newMbeanServerDefaultDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN, oldMbeanServerDefaultDomain, mbeanServerDefaultDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMbeansLevel() {
		return mbeansLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMbeansLevel(String newMbeansLevel) {
		String oldMbeansLevel = mbeansLevel;
		mbeansLevel = newMbeansLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEANS_LEVEL, oldMbeansLevel, mbeansLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnlyRegisterProcessorWithCustomId() {
		return onlyRegisterProcessorWithCustomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnlyRegisterProcessorWithCustomId(String newOnlyRegisterProcessorWithCustomId) {
		String oldOnlyRegisterProcessorWithCustomId = onlyRegisterProcessorWithCustomId;
		onlyRegisterProcessorWithCustomId = newOnlyRegisterProcessorWithCustomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID, oldOnlyRegisterProcessorWithCustomId, onlyRegisterProcessorWithCustomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegisterAlways() {
		return registerAlways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegisterAlways(String newRegisterAlways) {
		String oldRegisterAlways = registerAlways;
		registerAlways = newRegisterAlways;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS, oldRegisterAlways, registerAlways));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegisterNewRoutes() {
		return registerNewRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegisterNewRoutes(String newRegisterNewRoutes) {
		String oldRegisterNewRoutes = registerNewRoutes;
		registerNewRoutes = newRegisterNewRoutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES, oldRegisterNewRoutes, registerNewRoutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatisticsLevel() {
		return statisticsLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatisticsLevel(String newStatisticsLevel) {
		String oldStatisticsLevel = statisticsLevel;
		statisticsLevel = newStatisticsLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL, oldStatisticsLevel, statisticsLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpdateRouteEnabled() {
		return updateRouteEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateRouteEnabled(String newUpdateRouteEnabled) {
		String oldUpdateRouteEnabled = updateRouteEnabled;
		updateRouteEnabled = newUpdateRouteEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__UPDATE_ROUTE_ENABLED, oldUpdateRouteEnabled, updateRouteEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseHostIPAddress() {
		return useHostIPAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseHostIPAddress(String newUseHostIPAddress) {
		String oldUseHostIPAddress = useHostIPAddress;
		useHostIPAddress = newUseHostIPAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_HOST_IP_ADDRESS, oldUseHostIPAddress, useHostIPAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsePlatformMBeanServer() {
		return usePlatformMBeanServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsePlatformMBeanServer(String newUsePlatformMBeanServer) {
		String oldUsePlatformMBeanServer = usePlatformMBeanServer;
		usePlatformMBeanServer = newUsePlatformMBeanServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER, oldUsePlatformMBeanServer, usePlatformMBeanServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED:
				return getDisabled();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__ENDPOINT_RUNTIME_STATISTICS_ENABLED:
				return getEndpointRuntimeStatisticsEnabled();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__INCLUDE_HOST_NAME:
				return getIncludeHostName();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__LOAD_STATISTICS_ENABLED:
				return getLoadStatisticsEnabled();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MASK:
				return getMask();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME:
				return getMbeanObjectDomainName();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN:
				return getMbeanServerDefaultDomain();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEANS_LEVEL:
				return getMbeansLevel();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID:
				return getOnlyRegisterProcessorWithCustomId();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS:
				return getRegisterAlways();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES:
				return getRegisterNewRoutes();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL:
				return getStatisticsLevel();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__UPDATE_ROUTE_ENABLED:
				return getUpdateRouteEnabled();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_HOST_IP_ADDRESS:
				return getUseHostIPAddress();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER:
				return getUsePlatformMBeanServer();
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
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED:
				setDisabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__ENDPOINT_RUNTIME_STATISTICS_ENABLED:
				setEndpointRuntimeStatisticsEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__INCLUDE_HOST_NAME:
				setIncludeHostName((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__LOAD_STATISTICS_ENABLED:
				setLoadStatisticsEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MASK:
				setMask((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME:
				setMbeanObjectDomainName((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN:
				setMbeanServerDefaultDomain((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEANS_LEVEL:
				setMbeansLevel((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID:
				setOnlyRegisterProcessorWithCustomId((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS:
				setRegisterAlways((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES:
				setRegisterNewRoutes((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL:
				setStatisticsLevel((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__UPDATE_ROUTE_ENABLED:
				setUpdateRouteEnabled((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_HOST_IP_ADDRESS:
				setUseHostIPAddress((String)newValue);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER:
				setUsePlatformMBeanServer((String)newValue);
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
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__ENDPOINT_RUNTIME_STATISTICS_ENABLED:
				setEndpointRuntimeStatisticsEnabled(ENDPOINT_RUNTIME_STATISTICS_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__INCLUDE_HOST_NAME:
				setIncludeHostName(INCLUDE_HOST_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__LOAD_STATISTICS_ENABLED:
				setLoadStatisticsEnabled(LOAD_STATISTICS_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MASK:
				setMask(MASK_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME:
				setMbeanObjectDomainName(MBEAN_OBJECT_DOMAIN_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN:
				setMbeanServerDefaultDomain(MBEAN_SERVER_DEFAULT_DOMAIN_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEANS_LEVEL:
				setMbeansLevel(MBEANS_LEVEL_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID:
				setOnlyRegisterProcessorWithCustomId(ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS:
				setRegisterAlways(REGISTER_ALWAYS_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES:
				setRegisterNewRoutes(REGISTER_NEW_ROUTES_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL:
				setStatisticsLevel(STATISTICS_LEVEL_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__UPDATE_ROUTE_ENABLED:
				setUpdateRouteEnabled(UPDATE_ROUTE_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_HOST_IP_ADDRESS:
				setUseHostIPAddress(USE_HOST_IP_ADDRESS_EDEFAULT);
				return;
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER:
				setUsePlatformMBeanServer(USE_PLATFORM_MBEAN_SERVER_EDEFAULT);
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
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__DISABLED:
				return DISABLED_EDEFAULT == null ? disabled != null : !DISABLED_EDEFAULT.equals(disabled);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__ENDPOINT_RUNTIME_STATISTICS_ENABLED:
				return ENDPOINT_RUNTIME_STATISTICS_ENABLED_EDEFAULT == null ? endpointRuntimeStatisticsEnabled != null : !ENDPOINT_RUNTIME_STATISTICS_ENABLED_EDEFAULT.equals(endpointRuntimeStatisticsEnabled);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__INCLUDE_HOST_NAME:
				return INCLUDE_HOST_NAME_EDEFAULT == null ? includeHostName != null : !INCLUDE_HOST_NAME_EDEFAULT.equals(includeHostName);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__LOAD_STATISTICS_ENABLED:
				return LOAD_STATISTICS_ENABLED_EDEFAULT == null ? loadStatisticsEnabled != null : !LOAD_STATISTICS_ENABLED_EDEFAULT.equals(loadStatisticsEnabled);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MASK:
				return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_OBJECT_DOMAIN_NAME:
				return MBEAN_OBJECT_DOMAIN_NAME_EDEFAULT == null ? mbeanObjectDomainName != null : !MBEAN_OBJECT_DOMAIN_NAME_EDEFAULT.equals(mbeanObjectDomainName);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEAN_SERVER_DEFAULT_DOMAIN:
				return MBEAN_SERVER_DEFAULT_DOMAIN_EDEFAULT == null ? mbeanServerDefaultDomain != null : !MBEAN_SERVER_DEFAULT_DOMAIN_EDEFAULT.equals(mbeanServerDefaultDomain);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__MBEANS_LEVEL:
				return MBEANS_LEVEL_EDEFAULT == null ? mbeansLevel != null : !MBEANS_LEVEL_EDEFAULT.equals(mbeansLevel);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID:
				return ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID_EDEFAULT == null ? onlyRegisterProcessorWithCustomId != null : !ONLY_REGISTER_PROCESSOR_WITH_CUSTOM_ID_EDEFAULT.equals(onlyRegisterProcessorWithCustomId);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_ALWAYS:
				return REGISTER_ALWAYS_EDEFAULT == null ? registerAlways != null : !REGISTER_ALWAYS_EDEFAULT.equals(registerAlways);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__REGISTER_NEW_ROUTES:
				return REGISTER_NEW_ROUTES_EDEFAULT == null ? registerNewRoutes != null : !REGISTER_NEW_ROUTES_EDEFAULT.equals(registerNewRoutes);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__STATISTICS_LEVEL:
				return STATISTICS_LEVEL_EDEFAULT == null ? statisticsLevel != null : !STATISTICS_LEVEL_EDEFAULT.equals(statisticsLevel);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__UPDATE_ROUTE_ENABLED:
				return UPDATE_ROUTE_ENABLED_EDEFAULT == null ? updateRouteEnabled != null : !UPDATE_ROUTE_ENABLED_EDEFAULT.equals(updateRouteEnabled);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_HOST_IP_ADDRESS:
				return USE_HOST_IP_ADDRESS_EDEFAULT == null ? useHostIPAddress != null : !USE_HOST_IP_ADDRESS_EDEFAULT.equals(useHostIPAddress);
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION__USE_PLATFORM_MBEAN_SERVER:
				return USE_PLATFORM_MBEAN_SERVER_EDEFAULT == null ? usePlatformMBeanServer != null : !USE_PLATFORM_MBEAN_SERVER_EDEFAULT.equals(usePlatformMBeanServer);
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
		result.append(" (disabled: ");
		result.append(disabled);
		result.append(", endpointRuntimeStatisticsEnabled: ");
		result.append(endpointRuntimeStatisticsEnabled);
		result.append(", includeHostName: ");
		result.append(includeHostName);
		result.append(", loadStatisticsEnabled: ");
		result.append(loadStatisticsEnabled);
		result.append(", mask: ");
		result.append(mask);
		result.append(", mbeanObjectDomainName: ");
		result.append(mbeanObjectDomainName);
		result.append(", mbeanServerDefaultDomain: ");
		result.append(mbeanServerDefaultDomain);
		result.append(", mbeansLevel: ");
		result.append(mbeansLevel);
		result.append(", onlyRegisterProcessorWithCustomId: ");
		result.append(onlyRegisterProcessorWithCustomId);
		result.append(", registerAlways: ");
		result.append(registerAlways);
		result.append(", registerNewRoutes: ");
		result.append(registerNewRoutes);
		result.append(", statisticsLevel: ");
		result.append(statisticsLevel);
		result.append(", updateRouteEnabled: ");
		result.append(updateRouteEnabled);
		result.append(", useHostIPAddress: ");
		result.append(useHostIPAddress);
		result.append(", usePlatformMBeanServer: ");
		result.append(usePlatformMBeanServer);
		result.append(')');
		return result.toString();
	}

} //CamelJMXAgentDefinitionImpl

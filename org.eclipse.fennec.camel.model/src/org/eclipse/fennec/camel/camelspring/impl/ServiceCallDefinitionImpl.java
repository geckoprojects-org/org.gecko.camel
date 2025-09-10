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

import org.eclipse.fennec.camel.camelspring.BlacklistServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.CustomServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.DefaultServiceCallServiceLoadBalancerConfiguration;
import org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.HealthyServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.PassThroughServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.ServiceCallDefinition;
import org.eclipse.fennec.camel.camelspring.ServiceCallExpressionConfiguration;
import org.eclipse.fennec.camel.camelspring.StaticServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Call Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getCachingServiceDiscovery <em>Caching Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getCombinedServiceDiscovery <em>Combined Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getConsulServiceDiscovery <em>Consul Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getDnsServiceDiscovery <em>Dns Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getStaticServiceDiscovery <em>Static Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getZookeeperServiceDiscovery <em>Zookeeper Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getBlacklistServiceFilter <em>Blacklist Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getCombinedServiceFilter <em>Combined Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getCustomServiceFilter <em>Custom Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getHealthyServiceFilter <em>Healthy Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getPassThroughServiceFilter <em>Pass Through Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getDefaultLoadBalancer <em>Default Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getConfigurationRef <em>Configuration Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getExpressionRef <em>Expression Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getLoadBalancerRef <em>Load Balancer Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getServiceChooserRef <em>Service Chooser Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getServiceDiscoveryRef <em>Service Discovery Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getServiceFilterRef <em>Service Filter Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ServiceCallDefinitionImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceCallDefinitionImpl extends NoOutputDefinitionImpl implements ServiceCallDefinition {
	/**
	 * The cached value of the '{@link #getCachingServiceDiscovery() <em>Caching Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachingServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected CachingServiceCallServiceDiscoveryConfiguration cachingServiceDiscovery;

	/**
	 * The cached value of the '{@link #getCombinedServiceDiscovery() <em>Combined Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected CombinedServiceCallServiceDiscoveryConfiguration combinedServiceDiscovery;

	/**
	 * The cached value of the '{@link #getConsulServiceDiscovery() <em>Consul Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsulServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected ConsulServiceCallServiceDiscoveryConfiguration consulServiceDiscovery;

	/**
	 * The cached value of the '{@link #getDnsServiceDiscovery() <em>Dns Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected DnsServiceCallServiceDiscoveryConfiguration dnsServiceDiscovery;

	/**
	 * The cached value of the '{@link #getKubernetesServiceDiscovery() <em>Kubernetes Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKubernetesServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected KubernetesServiceCallServiceDiscoveryConfiguration kubernetesServiceDiscovery;

	/**
	 * The cached value of the '{@link #getStaticServiceDiscovery() <em>Static Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected StaticServiceCallServiceDiscoveryConfiguration staticServiceDiscovery;

	/**
	 * The cached value of the '{@link #getZookeeperServiceDiscovery() <em>Zookeeper Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZookeeperServiceDiscovery()
	 * @generated
	 * @ordered
	 */
	protected ZooKeeperServiceCallServiceDiscoveryConfiguration zookeeperServiceDiscovery;

	/**
	 * The cached value of the '{@link #getBlacklistServiceFilter() <em>Blacklist Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlacklistServiceFilter()
	 * @generated
	 * @ordered
	 */
	protected BlacklistServiceCallServiceFilterConfiguration blacklistServiceFilter;

	/**
	 * The cached value of the '{@link #getCombinedServiceFilter() <em>Combined Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedServiceFilter()
	 * @generated
	 * @ordered
	 */
	protected CombinedServiceCallServiceFilterConfiguration combinedServiceFilter;

	/**
	 * The cached value of the '{@link #getCustomServiceFilter() <em>Custom Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomServiceFilter()
	 * @generated
	 * @ordered
	 */
	protected CustomServiceCallServiceFilterConfiguration customServiceFilter;

	/**
	 * The cached value of the '{@link #getHealthyServiceFilter() <em>Healthy Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthyServiceFilter()
	 * @generated
	 * @ordered
	 */
	protected HealthyServiceCallServiceFilterConfiguration healthyServiceFilter;

	/**
	 * The cached value of the '{@link #getPassThroughServiceFilter() <em>Pass Through Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassThroughServiceFilter()
	 * @generated
	 * @ordered
	 */
	protected PassThroughServiceCallServiceFilterConfiguration passThroughServiceFilter;

	/**
	 * The cached value of the '{@link #getDefaultLoadBalancer() <em>Default Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected DefaultServiceCallServiceLoadBalancerConfiguration defaultLoadBalancer;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected ServiceCallExpressionConfiguration expression;

	/**
	 * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected String component = COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationRef() <em>Configuration Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationRef() <em>Configuration Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationRef()
	 * @generated
	 * @ordered
	 */
	protected String configurationRef = CONFIGURATION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpressionRef() <em>Expression Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionRef()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionRef() <em>Expression Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionRef()
	 * @generated
	 * @ordered
	 */
	protected String expressionRef = EXPRESSION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadBalancerRef() <em>Load Balancer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_BALANCER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadBalancerRef() <em>Load Balancer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerRef()
	 * @generated
	 * @ordered
	 */
	protected String loadBalancerRef = LOAD_BALANCER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceChooserRef() <em>Service Chooser Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceChooserRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_CHOOSER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceChooserRef() <em>Service Chooser Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceChooserRef()
	 * @generated
	 * @ordered
	 */
	protected String serviceChooserRef = SERVICE_CHOOSER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDiscoveryRef() <em>Service Discovery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDiscoveryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DISCOVERY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDiscoveryRef() <em>Service Discovery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDiscoveryRef()
	 * @generated
	 * @ordered
	 */
	protected String serviceDiscoveryRef = SERVICE_DISCOVERY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceFilterRef() <em>Service Filter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFilterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_FILTER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceFilterRef() <em>Service Filter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFilterRef()
	 * @generated
	 * @ordered
	 */
	protected String serviceFilterRef = SERVICE_FILTER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCallDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getServiceCallDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachingServiceCallServiceDiscoveryConfiguration getCachingServiceDiscovery() {
		return cachingServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCachingServiceDiscovery(CachingServiceCallServiceDiscoveryConfiguration newCachingServiceDiscovery, NotificationChain msgs) {
		CachingServiceCallServiceDiscoveryConfiguration oldCachingServiceDiscovery = cachingServiceDiscovery;
		cachingServiceDiscovery = newCachingServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__CACHING_SERVICE_DISCOVERY, oldCachingServiceDiscovery, newCachingServiceDiscovery);
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
	public void setCachingServiceDiscovery(CachingServiceCallServiceDiscoveryConfiguration newCachingServiceDiscovery) {
		if (newCachingServiceDiscovery != cachingServiceDiscovery) {
			NotificationChain msgs = null;
			if (cachingServiceDiscovery != null)
				msgs = ((InternalEObject)cachingServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__CACHING_SERVICE_DISCOVERY, null, msgs);
			if (newCachingServiceDiscovery != null)
				msgs = ((InternalEObject)newCachingServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__CACHING_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetCachingServiceDiscovery(newCachingServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__CACHING_SERVICE_DISCOVERY, newCachingServiceDiscovery, newCachingServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombinedServiceCallServiceDiscoveryConfiguration getCombinedServiceDiscovery() {
		return combinedServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration newCombinedServiceDiscovery, NotificationChain msgs) {
		CombinedServiceCallServiceDiscoveryConfiguration oldCombinedServiceDiscovery = combinedServiceDiscovery;
		combinedServiceDiscovery = newCombinedServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_DISCOVERY, oldCombinedServiceDiscovery, newCombinedServiceDiscovery);
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
	public void setCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration newCombinedServiceDiscovery) {
		if (newCombinedServiceDiscovery != combinedServiceDiscovery) {
			NotificationChain msgs = null;
			if (combinedServiceDiscovery != null)
				msgs = ((InternalEObject)combinedServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_DISCOVERY, null, msgs);
			if (newCombinedServiceDiscovery != null)
				msgs = ((InternalEObject)newCombinedServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetCombinedServiceDiscovery(newCombinedServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_DISCOVERY, newCombinedServiceDiscovery, newCombinedServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsulServiceCallServiceDiscoveryConfiguration getConsulServiceDiscovery() {
		return consulServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsulServiceDiscovery(ConsulServiceCallServiceDiscoveryConfiguration newConsulServiceDiscovery, NotificationChain msgs) {
		ConsulServiceCallServiceDiscoveryConfiguration oldConsulServiceDiscovery = consulServiceDiscovery;
		consulServiceDiscovery = newConsulServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__CONSUL_SERVICE_DISCOVERY, oldConsulServiceDiscovery, newConsulServiceDiscovery);
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
	public void setConsulServiceDiscovery(ConsulServiceCallServiceDiscoveryConfiguration newConsulServiceDiscovery) {
		if (newConsulServiceDiscovery != consulServiceDiscovery) {
			NotificationChain msgs = null;
			if (consulServiceDiscovery != null)
				msgs = ((InternalEObject)consulServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__CONSUL_SERVICE_DISCOVERY, null, msgs);
			if (newConsulServiceDiscovery != null)
				msgs = ((InternalEObject)newConsulServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__CONSUL_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetConsulServiceDiscovery(newConsulServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__CONSUL_SERVICE_DISCOVERY, newConsulServiceDiscovery, newConsulServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DnsServiceCallServiceDiscoveryConfiguration getDnsServiceDiscovery() {
		return dnsServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDnsServiceDiscovery(DnsServiceCallServiceDiscoveryConfiguration newDnsServiceDiscovery, NotificationChain msgs) {
		DnsServiceCallServiceDiscoveryConfiguration oldDnsServiceDiscovery = dnsServiceDiscovery;
		dnsServiceDiscovery = newDnsServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__DNS_SERVICE_DISCOVERY, oldDnsServiceDiscovery, newDnsServiceDiscovery);
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
	public void setDnsServiceDiscovery(DnsServiceCallServiceDiscoveryConfiguration newDnsServiceDiscovery) {
		if (newDnsServiceDiscovery != dnsServiceDiscovery) {
			NotificationChain msgs = null;
			if (dnsServiceDiscovery != null)
				msgs = ((InternalEObject)dnsServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__DNS_SERVICE_DISCOVERY, null, msgs);
			if (newDnsServiceDiscovery != null)
				msgs = ((InternalEObject)newDnsServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__DNS_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetDnsServiceDiscovery(newDnsServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__DNS_SERVICE_DISCOVERY, newDnsServiceDiscovery, newDnsServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesServiceCallServiceDiscoveryConfiguration getKubernetesServiceDiscovery() {
		return kubernetesServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration newKubernetesServiceDiscovery, NotificationChain msgs) {
		KubernetesServiceCallServiceDiscoveryConfiguration oldKubernetesServiceDiscovery = kubernetesServiceDiscovery;
		kubernetesServiceDiscovery = newKubernetesServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__KUBERNETES_SERVICE_DISCOVERY, oldKubernetesServiceDiscovery, newKubernetesServiceDiscovery);
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
	public void setKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration newKubernetesServiceDiscovery) {
		if (newKubernetesServiceDiscovery != kubernetesServiceDiscovery) {
			NotificationChain msgs = null;
			if (kubernetesServiceDiscovery != null)
				msgs = ((InternalEObject)kubernetesServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__KUBERNETES_SERVICE_DISCOVERY, null, msgs);
			if (newKubernetesServiceDiscovery != null)
				msgs = ((InternalEObject)newKubernetesServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__KUBERNETES_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetKubernetesServiceDiscovery(newKubernetesServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__KUBERNETES_SERVICE_DISCOVERY, newKubernetesServiceDiscovery, newKubernetesServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticServiceCallServiceDiscoveryConfiguration getStaticServiceDiscovery() {
		return staticServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration newStaticServiceDiscovery, NotificationChain msgs) {
		StaticServiceCallServiceDiscoveryConfiguration oldStaticServiceDiscovery = staticServiceDiscovery;
		staticServiceDiscovery = newStaticServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__STATIC_SERVICE_DISCOVERY, oldStaticServiceDiscovery, newStaticServiceDiscovery);
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
	public void setStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration newStaticServiceDiscovery) {
		if (newStaticServiceDiscovery != staticServiceDiscovery) {
			NotificationChain msgs = null;
			if (staticServiceDiscovery != null)
				msgs = ((InternalEObject)staticServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__STATIC_SERVICE_DISCOVERY, null, msgs);
			if (newStaticServiceDiscovery != null)
				msgs = ((InternalEObject)newStaticServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__STATIC_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetStaticServiceDiscovery(newStaticServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__STATIC_SERVICE_DISCOVERY, newStaticServiceDiscovery, newStaticServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZooKeeperServiceCallServiceDiscoveryConfiguration getZookeeperServiceDiscovery() {
		return zookeeperServiceDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZookeeperServiceDiscovery(ZooKeeperServiceCallServiceDiscoveryConfiguration newZookeeperServiceDiscovery, NotificationChain msgs) {
		ZooKeeperServiceCallServiceDiscoveryConfiguration oldZookeeperServiceDiscovery = zookeeperServiceDiscovery;
		zookeeperServiceDiscovery = newZookeeperServiceDiscovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__ZOOKEEPER_SERVICE_DISCOVERY, oldZookeeperServiceDiscovery, newZookeeperServiceDiscovery);
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
	public void setZookeeperServiceDiscovery(ZooKeeperServiceCallServiceDiscoveryConfiguration newZookeeperServiceDiscovery) {
		if (newZookeeperServiceDiscovery != zookeeperServiceDiscovery) {
			NotificationChain msgs = null;
			if (zookeeperServiceDiscovery != null)
				msgs = ((InternalEObject)zookeeperServiceDiscovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__ZOOKEEPER_SERVICE_DISCOVERY, null, msgs);
			if (newZookeeperServiceDiscovery != null)
				msgs = ((InternalEObject)newZookeeperServiceDiscovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__ZOOKEEPER_SERVICE_DISCOVERY, null, msgs);
			msgs = basicSetZookeeperServiceDiscovery(newZookeeperServiceDiscovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__ZOOKEEPER_SERVICE_DISCOVERY, newZookeeperServiceDiscovery, newZookeeperServiceDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlacklistServiceCallServiceFilterConfiguration getBlacklistServiceFilter() {
		return blacklistServiceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlacklistServiceFilter(BlacklistServiceCallServiceFilterConfiguration newBlacklistServiceFilter, NotificationChain msgs) {
		BlacklistServiceCallServiceFilterConfiguration oldBlacklistServiceFilter = blacklistServiceFilter;
		blacklistServiceFilter = newBlacklistServiceFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__BLACKLIST_SERVICE_FILTER, oldBlacklistServiceFilter, newBlacklistServiceFilter);
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
	public void setBlacklistServiceFilter(BlacklistServiceCallServiceFilterConfiguration newBlacklistServiceFilter) {
		if (newBlacklistServiceFilter != blacklistServiceFilter) {
			NotificationChain msgs = null;
			if (blacklistServiceFilter != null)
				msgs = ((InternalEObject)blacklistServiceFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__BLACKLIST_SERVICE_FILTER, null, msgs);
			if (newBlacklistServiceFilter != null)
				msgs = ((InternalEObject)newBlacklistServiceFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__BLACKLIST_SERVICE_FILTER, null, msgs);
			msgs = basicSetBlacklistServiceFilter(newBlacklistServiceFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__BLACKLIST_SERVICE_FILTER, newBlacklistServiceFilter, newBlacklistServiceFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombinedServiceCallServiceFilterConfiguration getCombinedServiceFilter() {
		return combinedServiceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedServiceFilter(CombinedServiceCallServiceFilterConfiguration newCombinedServiceFilter, NotificationChain msgs) {
		CombinedServiceCallServiceFilterConfiguration oldCombinedServiceFilter = combinedServiceFilter;
		combinedServiceFilter = newCombinedServiceFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_FILTER, oldCombinedServiceFilter, newCombinedServiceFilter);
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
	public void setCombinedServiceFilter(CombinedServiceCallServiceFilterConfiguration newCombinedServiceFilter) {
		if (newCombinedServiceFilter != combinedServiceFilter) {
			NotificationChain msgs = null;
			if (combinedServiceFilter != null)
				msgs = ((InternalEObject)combinedServiceFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_FILTER, null, msgs);
			if (newCombinedServiceFilter != null)
				msgs = ((InternalEObject)newCombinedServiceFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_FILTER, null, msgs);
			msgs = basicSetCombinedServiceFilter(newCombinedServiceFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_FILTER, newCombinedServiceFilter, newCombinedServiceFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomServiceCallServiceFilterConfiguration getCustomServiceFilter() {
		return customServiceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomServiceFilter(CustomServiceCallServiceFilterConfiguration newCustomServiceFilter, NotificationChain msgs) {
		CustomServiceCallServiceFilterConfiguration oldCustomServiceFilter = customServiceFilter;
		customServiceFilter = newCustomServiceFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__CUSTOM_SERVICE_FILTER, oldCustomServiceFilter, newCustomServiceFilter);
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
	public void setCustomServiceFilter(CustomServiceCallServiceFilterConfiguration newCustomServiceFilter) {
		if (newCustomServiceFilter != customServiceFilter) {
			NotificationChain msgs = null;
			if (customServiceFilter != null)
				msgs = ((InternalEObject)customServiceFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__CUSTOM_SERVICE_FILTER, null, msgs);
			if (newCustomServiceFilter != null)
				msgs = ((InternalEObject)newCustomServiceFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__CUSTOM_SERVICE_FILTER, null, msgs);
			msgs = basicSetCustomServiceFilter(newCustomServiceFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__CUSTOM_SERVICE_FILTER, newCustomServiceFilter, newCustomServiceFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthyServiceCallServiceFilterConfiguration getHealthyServiceFilter() {
		return healthyServiceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthyServiceFilter(HealthyServiceCallServiceFilterConfiguration newHealthyServiceFilter, NotificationChain msgs) {
		HealthyServiceCallServiceFilterConfiguration oldHealthyServiceFilter = healthyServiceFilter;
		healthyServiceFilter = newHealthyServiceFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__HEALTHY_SERVICE_FILTER, oldHealthyServiceFilter, newHealthyServiceFilter);
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
	public void setHealthyServiceFilter(HealthyServiceCallServiceFilterConfiguration newHealthyServiceFilter) {
		if (newHealthyServiceFilter != healthyServiceFilter) {
			NotificationChain msgs = null;
			if (healthyServiceFilter != null)
				msgs = ((InternalEObject)healthyServiceFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__HEALTHY_SERVICE_FILTER, null, msgs);
			if (newHealthyServiceFilter != null)
				msgs = ((InternalEObject)newHealthyServiceFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__HEALTHY_SERVICE_FILTER, null, msgs);
			msgs = basicSetHealthyServiceFilter(newHealthyServiceFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__HEALTHY_SERVICE_FILTER, newHealthyServiceFilter, newHealthyServiceFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassThroughServiceCallServiceFilterConfiguration getPassThroughServiceFilter() {
		return passThroughServiceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassThroughServiceFilter(PassThroughServiceCallServiceFilterConfiguration newPassThroughServiceFilter, NotificationChain msgs) {
		PassThroughServiceCallServiceFilterConfiguration oldPassThroughServiceFilter = passThroughServiceFilter;
		passThroughServiceFilter = newPassThroughServiceFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__PASS_THROUGH_SERVICE_FILTER, oldPassThroughServiceFilter, newPassThroughServiceFilter);
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
	public void setPassThroughServiceFilter(PassThroughServiceCallServiceFilterConfiguration newPassThroughServiceFilter) {
		if (newPassThroughServiceFilter != passThroughServiceFilter) {
			NotificationChain msgs = null;
			if (passThroughServiceFilter != null)
				msgs = ((InternalEObject)passThroughServiceFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__PASS_THROUGH_SERVICE_FILTER, null, msgs);
			if (newPassThroughServiceFilter != null)
				msgs = ((InternalEObject)newPassThroughServiceFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__PASS_THROUGH_SERVICE_FILTER, null, msgs);
			msgs = basicSetPassThroughServiceFilter(newPassThroughServiceFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__PASS_THROUGH_SERVICE_FILTER, newPassThroughServiceFilter, newPassThroughServiceFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultServiceCallServiceLoadBalancerConfiguration getDefaultLoadBalancer() {
		return defaultLoadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultLoadBalancer(DefaultServiceCallServiceLoadBalancerConfiguration newDefaultLoadBalancer, NotificationChain msgs) {
		DefaultServiceCallServiceLoadBalancerConfiguration oldDefaultLoadBalancer = defaultLoadBalancer;
		defaultLoadBalancer = newDefaultLoadBalancer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__DEFAULT_LOAD_BALANCER, oldDefaultLoadBalancer, newDefaultLoadBalancer);
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
	public void setDefaultLoadBalancer(DefaultServiceCallServiceLoadBalancerConfiguration newDefaultLoadBalancer) {
		if (newDefaultLoadBalancer != defaultLoadBalancer) {
			NotificationChain msgs = null;
			if (defaultLoadBalancer != null)
				msgs = ((InternalEObject)defaultLoadBalancer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__DEFAULT_LOAD_BALANCER, null, msgs);
			if (newDefaultLoadBalancer != null)
				msgs = ((InternalEObject)newDefaultLoadBalancer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__DEFAULT_LOAD_BALANCER, null, msgs);
			msgs = basicSetDefaultLoadBalancer(newDefaultLoadBalancer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__DEFAULT_LOAD_BALANCER, newDefaultLoadBalancer, newDefaultLoadBalancer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallExpressionConfiguration getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ServiceCallExpressionConfiguration newExpression, NotificationChain msgs) {
		ServiceCallExpressionConfiguration oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(ServiceCallExpressionConfiguration newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(String newComponent) {
		String oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationRef() {
		return configurationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationRef(String newConfigurationRef) {
		String oldConfigurationRef = configurationRef;
		configurationRef = newConfigurationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__CONFIGURATION_REF, oldConfigurationRef, configurationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpressionRef() {
		return expressionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionRef(String newExpressionRef) {
		String oldExpressionRef = expressionRef;
		expressionRef = newExpressionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION_REF, oldExpressionRef, expressionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoadBalancerRef() {
		return loadBalancerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalancerRef(String newLoadBalancerRef) {
		String oldLoadBalancerRef = loadBalancerRef;
		loadBalancerRef = newLoadBalancerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__LOAD_BALANCER_REF, oldLoadBalancerRef, loadBalancerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceChooserRef() {
		return serviceChooserRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceChooserRef(String newServiceChooserRef) {
		String oldServiceChooserRef = serviceChooserRef;
		serviceChooserRef = newServiceChooserRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_CHOOSER_REF, oldServiceChooserRef, serviceChooserRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceDiscoveryRef() {
		return serviceDiscoveryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceDiscoveryRef(String newServiceDiscoveryRef) {
		String oldServiceDiscoveryRef = serviceDiscoveryRef;
		serviceDiscoveryRef = newServiceDiscoveryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_DISCOVERY_REF, oldServiceDiscoveryRef, serviceDiscoveryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceFilterRef() {
		return serviceFilterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceFilterRef(String newServiceFilterRef) {
		String oldServiceFilterRef = serviceFilterRef;
		serviceFilterRef = newServiceFilterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_FILTER_REF, oldServiceFilterRef, serviceFilterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SERVICE_CALL_DEFINITION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CACHING_SERVICE_DISCOVERY:
				return basicSetCachingServiceDiscovery(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_DISCOVERY:
				return basicSetCombinedServiceDiscovery(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CONSUL_SERVICE_DISCOVERY:
				return basicSetConsulServiceDiscovery(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__DNS_SERVICE_DISCOVERY:
				return basicSetDnsServiceDiscovery(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__KUBERNETES_SERVICE_DISCOVERY:
				return basicSetKubernetesServiceDiscovery(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__STATIC_SERVICE_DISCOVERY:
				return basicSetStaticServiceDiscovery(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__ZOOKEEPER_SERVICE_DISCOVERY:
				return basicSetZookeeperServiceDiscovery(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__BLACKLIST_SERVICE_FILTER:
				return basicSetBlacklistServiceFilter(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_FILTER:
				return basicSetCombinedServiceFilter(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CUSTOM_SERVICE_FILTER:
				return basicSetCustomServiceFilter(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__HEALTHY_SERVICE_FILTER:
				return basicSetHealthyServiceFilter(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__PASS_THROUGH_SERVICE_FILTER:
				return basicSetPassThroughServiceFilter(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__DEFAULT_LOAD_BALANCER:
				return basicSetDefaultLoadBalancer(null, msgs);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CACHING_SERVICE_DISCOVERY:
				return getCachingServiceDiscovery();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_DISCOVERY:
				return getCombinedServiceDiscovery();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CONSUL_SERVICE_DISCOVERY:
				return getConsulServiceDiscovery();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__DNS_SERVICE_DISCOVERY:
				return getDnsServiceDiscovery();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__KUBERNETES_SERVICE_DISCOVERY:
				return getKubernetesServiceDiscovery();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__STATIC_SERVICE_DISCOVERY:
				return getStaticServiceDiscovery();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__ZOOKEEPER_SERVICE_DISCOVERY:
				return getZookeeperServiceDiscovery();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__BLACKLIST_SERVICE_FILTER:
				return getBlacklistServiceFilter();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_FILTER:
				return getCombinedServiceFilter();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CUSTOM_SERVICE_FILTER:
				return getCustomServiceFilter();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__HEALTHY_SERVICE_FILTER:
				return getHealthyServiceFilter();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__PASS_THROUGH_SERVICE_FILTER:
				return getPassThroughServiceFilter();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__DEFAULT_LOAD_BALANCER:
				return getDefaultLoadBalancer();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION:
				return getExpression();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMPONENT:
				return getComponent();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CONFIGURATION_REF:
				return getConfigurationRef();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION_REF:
				return getExpressionRef();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__LOAD_BALANCER_REF:
				return getLoadBalancerRef();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__NAME:
				return getName();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__PATTERN:
				return getPattern();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_CHOOSER_REF:
				return getServiceChooserRef();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_DISCOVERY_REF:
				return getServiceDiscoveryRef();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_FILTER_REF:
				return getServiceFilterRef();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__URI:
				return getUri();
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
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CACHING_SERVICE_DISCOVERY:
				setCachingServiceDiscovery((CachingServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_DISCOVERY:
				setCombinedServiceDiscovery((CombinedServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CONSUL_SERVICE_DISCOVERY:
				setConsulServiceDiscovery((ConsulServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__DNS_SERVICE_DISCOVERY:
				setDnsServiceDiscovery((DnsServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__KUBERNETES_SERVICE_DISCOVERY:
				setKubernetesServiceDiscovery((KubernetesServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__STATIC_SERVICE_DISCOVERY:
				setStaticServiceDiscovery((StaticServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__ZOOKEEPER_SERVICE_DISCOVERY:
				setZookeeperServiceDiscovery((ZooKeeperServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__BLACKLIST_SERVICE_FILTER:
				setBlacklistServiceFilter((BlacklistServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_FILTER:
				setCombinedServiceFilter((CombinedServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CUSTOM_SERVICE_FILTER:
				setCustomServiceFilter((CustomServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__HEALTHY_SERVICE_FILTER:
				setHealthyServiceFilter((HealthyServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__PASS_THROUGH_SERVICE_FILTER:
				setPassThroughServiceFilter((PassThroughServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__DEFAULT_LOAD_BALANCER:
				setDefaultLoadBalancer((DefaultServiceCallServiceLoadBalancerConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION:
				setExpression((ServiceCallExpressionConfiguration)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMPONENT:
				setComponent((String)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CONFIGURATION_REF:
				setConfigurationRef((String)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION_REF:
				setExpressionRef((String)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__LOAD_BALANCER_REF:
				setLoadBalancerRef((String)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__PATTERN:
				setPattern((String)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_CHOOSER_REF:
				setServiceChooserRef((String)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_DISCOVERY_REF:
				setServiceDiscoveryRef((String)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_FILTER_REF:
				setServiceFilterRef((String)newValue);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__URI:
				setUri((String)newValue);
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
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CACHING_SERVICE_DISCOVERY:
				setCachingServiceDiscovery((CachingServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_DISCOVERY:
				setCombinedServiceDiscovery((CombinedServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CONSUL_SERVICE_DISCOVERY:
				setConsulServiceDiscovery((ConsulServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__DNS_SERVICE_DISCOVERY:
				setDnsServiceDiscovery((DnsServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__KUBERNETES_SERVICE_DISCOVERY:
				setKubernetesServiceDiscovery((KubernetesServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__STATIC_SERVICE_DISCOVERY:
				setStaticServiceDiscovery((StaticServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__ZOOKEEPER_SERVICE_DISCOVERY:
				setZookeeperServiceDiscovery((ZooKeeperServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__BLACKLIST_SERVICE_FILTER:
				setBlacklistServiceFilter((BlacklistServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_FILTER:
				setCombinedServiceFilter((CombinedServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CUSTOM_SERVICE_FILTER:
				setCustomServiceFilter((CustomServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__HEALTHY_SERVICE_FILTER:
				setHealthyServiceFilter((HealthyServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__PASS_THROUGH_SERVICE_FILTER:
				setPassThroughServiceFilter((PassThroughServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__DEFAULT_LOAD_BALANCER:
				setDefaultLoadBalancer((DefaultServiceCallServiceLoadBalancerConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION:
				setExpression((ServiceCallExpressionConfiguration)null);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMPONENT:
				setComponent(COMPONENT_EDEFAULT);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CONFIGURATION_REF:
				setConfigurationRef(CONFIGURATION_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION_REF:
				setExpressionRef(EXPRESSION_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__LOAD_BALANCER_REF:
				setLoadBalancerRef(LOAD_BALANCER_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_CHOOSER_REF:
				setServiceChooserRef(SERVICE_CHOOSER_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_DISCOVERY_REF:
				setServiceDiscoveryRef(SERVICE_DISCOVERY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_FILTER_REF:
				setServiceFilterRef(SERVICE_FILTER_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__URI:
				setUri(URI_EDEFAULT);
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
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CACHING_SERVICE_DISCOVERY:
				return cachingServiceDiscovery != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_DISCOVERY:
				return combinedServiceDiscovery != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CONSUL_SERVICE_DISCOVERY:
				return consulServiceDiscovery != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__DNS_SERVICE_DISCOVERY:
				return dnsServiceDiscovery != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__KUBERNETES_SERVICE_DISCOVERY:
				return kubernetesServiceDiscovery != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__STATIC_SERVICE_DISCOVERY:
				return staticServiceDiscovery != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__ZOOKEEPER_SERVICE_DISCOVERY:
				return zookeeperServiceDiscovery != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__BLACKLIST_SERVICE_FILTER:
				return blacklistServiceFilter != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMBINED_SERVICE_FILTER:
				return combinedServiceFilter != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CUSTOM_SERVICE_FILTER:
				return customServiceFilter != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__HEALTHY_SERVICE_FILTER:
				return healthyServiceFilter != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__PASS_THROUGH_SERVICE_FILTER:
				return passThroughServiceFilter != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__DEFAULT_LOAD_BALANCER:
				return defaultLoadBalancer != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION:
				return expression != null;
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__COMPONENT:
				return COMPONENT_EDEFAULT == null ? component != null : !COMPONENT_EDEFAULT.equals(component);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__CONFIGURATION_REF:
				return CONFIGURATION_REF_EDEFAULT == null ? configurationRef != null : !CONFIGURATION_REF_EDEFAULT.equals(configurationRef);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__EXPRESSION_REF:
				return EXPRESSION_REF_EDEFAULT == null ? expressionRef != null : !EXPRESSION_REF_EDEFAULT.equals(expressionRef);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__LOAD_BALANCER_REF:
				return LOAD_BALANCER_REF_EDEFAULT == null ? loadBalancerRef != null : !LOAD_BALANCER_REF_EDEFAULT.equals(loadBalancerRef);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_CHOOSER_REF:
				return SERVICE_CHOOSER_REF_EDEFAULT == null ? serviceChooserRef != null : !SERVICE_CHOOSER_REF_EDEFAULT.equals(serviceChooserRef);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_DISCOVERY_REF:
				return SERVICE_DISCOVERY_REF_EDEFAULT == null ? serviceDiscoveryRef != null : !SERVICE_DISCOVERY_REF_EDEFAULT.equals(serviceDiscoveryRef);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__SERVICE_FILTER_REF:
				return SERVICE_FILTER_REF_EDEFAULT == null ? serviceFilterRef != null : !SERVICE_FILTER_REF_EDEFAULT.equals(serviceFilterRef);
			case CamelSpringPackage.SERVICE_CALL_DEFINITION__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
		result.append(" (component: ");
		result.append(component);
		result.append(", configurationRef: ");
		result.append(configurationRef);
		result.append(", expressionRef: ");
		result.append(expressionRef);
		result.append(", loadBalancerRef: ");
		result.append(loadBalancerRef);
		result.append(", name: ");
		result.append(name);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", serviceChooserRef: ");
		result.append(serviceChooserRef);
		result.append(", serviceDiscoveryRef: ");
		result.append(serviceDiscoveryRef);
		result.append(", serviceFilterRef: ");
		result.append(serviceFilterRef);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ServiceCallDefinitionImpl

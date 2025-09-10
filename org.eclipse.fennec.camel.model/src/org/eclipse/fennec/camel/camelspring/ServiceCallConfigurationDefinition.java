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
 * A representation of the model object '<em><b>Service Call Configuration Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getCachingServiceDiscovery <em>Caching Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getCombinedServiceDiscovery <em>Combined Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getConsulServiceDiscovery <em>Consul Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getDnsServiceDiscovery <em>Dns Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getStaticServiceDiscovery <em>Static Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getZookeeperServiceDiscovery <em>Zookeeper Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getBlacklistServiceFilter <em>Blacklist Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getCombinedServiceFilter <em>Combined Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getCustomServiceFilter <em>Custom Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getHealthyServiceFilter <em>Healthy Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getPassThroughServiceFilter <em>Pass Through Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getDefaultLoadBalancer <em>Default Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getExpressionRef <em>Expression Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getLoadBalancerRef <em>Load Balancer Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getServiceChooserRef <em>Service Chooser Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getServiceDiscoveryRef <em>Service Discovery Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getServiceFilterRef <em>Service Filter Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition()
 * @model extendedMetaData="name='serviceCallConfigurationDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceCallConfigurationDefinition extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Caching Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caching Service Discovery</em>' containment reference.
	 * @see #setCachingServiceDiscovery(CachingServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_CachingServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cachingServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	CachingServiceCallServiceDiscoveryConfiguration getCachingServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getCachingServiceDiscovery <em>Caching Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caching Service Discovery</em>' containment reference.
	 * @see #getCachingServiceDiscovery()
	 * @generated
	 */
	void setCachingServiceDiscovery(CachingServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Combined Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combined Service Discovery</em>' containment reference.
	 * @see #setCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_CombinedServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combinedServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	CombinedServiceCallServiceDiscoveryConfiguration getCombinedServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getCombinedServiceDiscovery <em>Combined Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Service Discovery</em>' containment reference.
	 * @see #getCombinedServiceDiscovery()
	 * @generated
	 */
	void setCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Consul Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consul Service Discovery</em>' containment reference.
	 * @see #setConsulServiceDiscovery(ConsulServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_ConsulServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consulServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsulServiceCallServiceDiscoveryConfiguration getConsulServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getConsulServiceDiscovery <em>Consul Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consul Service Discovery</em>' containment reference.
	 * @see #getConsulServiceDiscovery()
	 * @generated
	 */
	void setConsulServiceDiscovery(ConsulServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Dns Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dns Service Discovery</em>' containment reference.
	 * @see #setDnsServiceDiscovery(DnsServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_DnsServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dnsServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	DnsServiceCallServiceDiscoveryConfiguration getDnsServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getDnsServiceDiscovery <em>Dns Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns Service Discovery</em>' containment reference.
	 * @see #getDnsServiceDiscovery()
	 * @generated
	 */
	void setDnsServiceDiscovery(DnsServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Kubernetes Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kubernetes Service Discovery</em>' containment reference.
	 * @see #setKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_KubernetesServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kubernetesServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	KubernetesServiceCallServiceDiscoveryConfiguration getKubernetesServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kubernetes Service Discovery</em>' containment reference.
	 * @see #getKubernetesServiceDiscovery()
	 * @generated
	 */
	void setKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Static Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Service Discovery</em>' containment reference.
	 * @see #setStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_StaticServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staticServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticServiceCallServiceDiscoveryConfiguration getStaticServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getStaticServiceDiscovery <em>Static Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Service Discovery</em>' containment reference.
	 * @see #getStaticServiceDiscovery()
	 * @generated
	 */
	void setStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Zookeeper Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zookeeper Service Discovery</em>' containment reference.
	 * @see #setZookeeperServiceDiscovery(ZooKeeperServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_ZookeeperServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zookeeperServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	ZooKeeperServiceCallServiceDiscoveryConfiguration getZookeeperServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getZookeeperServiceDiscovery <em>Zookeeper Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zookeeper Service Discovery</em>' containment reference.
	 * @see #getZookeeperServiceDiscovery()
	 * @generated
	 */
	void setZookeeperServiceDiscovery(ZooKeeperServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Blacklist Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blacklist Service Filter</em>' containment reference.
	 * @see #setBlacklistServiceFilter(BlacklistServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_BlacklistServiceFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='blacklistServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	BlacklistServiceCallServiceFilterConfiguration getBlacklistServiceFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getBlacklistServiceFilter <em>Blacklist Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blacklist Service Filter</em>' containment reference.
	 * @see #getBlacklistServiceFilter()
	 * @generated
	 */
	void setBlacklistServiceFilter(BlacklistServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Combined Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combined Service Filter</em>' containment reference.
	 * @see #setCombinedServiceFilter(CombinedServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_CombinedServiceFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combinedServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	CombinedServiceCallServiceFilterConfiguration getCombinedServiceFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getCombinedServiceFilter <em>Combined Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Service Filter</em>' containment reference.
	 * @see #getCombinedServiceFilter()
	 * @generated
	 */
	void setCombinedServiceFilter(CombinedServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Custom Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Service Filter</em>' containment reference.
	 * @see #setCustomServiceFilter(CustomServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_CustomServiceFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='customServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomServiceCallServiceFilterConfiguration getCustomServiceFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getCustomServiceFilter <em>Custom Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Service Filter</em>' containment reference.
	 * @see #getCustomServiceFilter()
	 * @generated
	 */
	void setCustomServiceFilter(CustomServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Healthy Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Healthy Service Filter</em>' containment reference.
	 * @see #setHealthyServiceFilter(HealthyServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_HealthyServiceFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='healthyServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	HealthyServiceCallServiceFilterConfiguration getHealthyServiceFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getHealthyServiceFilter <em>Healthy Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Healthy Service Filter</em>' containment reference.
	 * @see #getHealthyServiceFilter()
	 * @generated
	 */
	void setHealthyServiceFilter(HealthyServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Pass Through Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pass Through Service Filter</em>' containment reference.
	 * @see #setPassThroughServiceFilter(PassThroughServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_PassThroughServiceFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='passThroughServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	PassThroughServiceCallServiceFilterConfiguration getPassThroughServiceFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getPassThroughServiceFilter <em>Pass Through Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Through Service Filter</em>' containment reference.
	 * @see #getPassThroughServiceFilter()
	 * @generated
	 */
	void setPassThroughServiceFilter(PassThroughServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Default Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Load Balancer</em>' containment reference.
	 * @see #setDefaultLoadBalancer(DefaultServiceCallServiceLoadBalancerConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_DefaultLoadBalancer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultLoadBalancer' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultServiceCallServiceLoadBalancerConfiguration getDefaultLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getDefaultLoadBalancer <em>Default Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Load Balancer</em>' containment reference.
	 * @see #getDefaultLoadBalancer()
	 * @generated
	 */
	void setDefaultLoadBalancer(DefaultServiceCallServiceLoadBalancerConfiguration value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the Expression using the given configuration.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ServiceCallExpressionConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_Expression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCallExpressionConfiguration getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ServiceCallExpressionConfiguration value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The component to use. Default value: http
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' attribute.
	 * @see #setComponent(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_Component()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='component'"
	 * @generated
	 */
	String getComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getComponent <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' attribute.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(String value);

	/**
	 * Returns the value of the '<em><b>Expression Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set a reference to a custom Expression to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression Ref</em>' attribute.
	 * @see #setExpressionRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_ExpressionRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='expressionRef'"
	 * @generated
	 */
	String getExpressionRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getExpressionRef <em>Expression Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Ref</em>' attribute.
	 * @see #getExpressionRef()
	 * @generated
	 */
	void setExpressionRef(String value);

	/**
	 * Returns the value of the '<em><b>Load Balancer Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a reference to a custom ServiceLoadBalancer to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Balancer Ref</em>' attribute.
	 * @see #setLoadBalancerRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_LoadBalancerRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='loadBalancerRef'"
	 * @generated
	 */
	String getLoadBalancerRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getLoadBalancerRef <em>Load Balancer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer Ref</em>' attribute.
	 * @see #getLoadBalancerRef()
	 * @generated
	 */
	void setLoadBalancerRef(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the optional ExchangePattern used to invoke this endpoint.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Service Chooser Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a reference to a custom ServiceChooser to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Chooser Ref</em>' attribute.
	 * @see #setServiceChooserRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_ServiceChooserRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serviceChooserRef'"
	 * @generated
	 */
	String getServiceChooserRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getServiceChooserRef <em>Service Chooser Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Chooser Ref</em>' attribute.
	 * @see #getServiceChooserRef()
	 * @generated
	 */
	void setServiceChooserRef(String value);

	/**
	 * Returns the value of the '<em><b>Service Discovery Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a reference to a custom ServiceDiscovery to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Discovery Ref</em>' attribute.
	 * @see #setServiceDiscoveryRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_ServiceDiscoveryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serviceDiscoveryRef'"
	 * @generated
	 */
	String getServiceDiscoveryRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getServiceDiscoveryRef <em>Service Discovery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Discovery Ref</em>' attribute.
	 * @see #getServiceDiscoveryRef()
	 * @generated
	 */
	void setServiceDiscoveryRef(String value);

	/**
	 * Returns the value of the '<em><b>Service Filter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a reference to a custom ServiceFilter to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Filter Ref</em>' attribute.
	 * @see #setServiceFilterRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_ServiceFilterRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serviceFilterRef'"
	 * @generated
	 */
	String getServiceFilterRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getServiceFilterRef <em>Service Filter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Filter Ref</em>' attribute.
	 * @see #getServiceFilterRef()
	 * @generated
	 */
	void setServiceFilterRef(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The uri of the endpoint to send to. The uri can be dynamic computed using the simple language expression.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getServiceCallConfigurationDefinition_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // ServiceCallConfigurationDefinition

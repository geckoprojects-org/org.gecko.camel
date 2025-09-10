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
 * A representation of the model object '<em><b>Caching Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getConsulServiceDiscovery <em>Consul Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getDnsServiceDiscovery <em>Dns Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getCombinedServiceDiscovery <em>Combined Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getStaticServiceDiscovery <em>Static Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCachingServiceCallServiceDiscoveryConfiguration()
 * @model extendedMetaData="name='cachingServiceCallServiceDiscoveryConfiguration' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CachingServiceCallServiceDiscoveryConfiguration extends ServiceCallServiceDiscoveryConfiguration {
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCachingServiceCallServiceDiscoveryConfiguration_ConsulServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consulServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsulServiceCallServiceDiscoveryConfiguration getConsulServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getConsulServiceDiscovery <em>Consul Service Discovery</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCachingServiceCallServiceDiscoveryConfiguration_DnsServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dnsServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	DnsServiceCallServiceDiscoveryConfiguration getDnsServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getDnsServiceDiscovery <em>Dns Service Discovery</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCachingServiceCallServiceDiscoveryConfiguration_KubernetesServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kubernetesServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	KubernetesServiceCallServiceDiscoveryConfiguration getKubernetesServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kubernetes Service Discovery</em>' containment reference.
	 * @see #getKubernetesServiceDiscovery()
	 * @generated
	 */
	void setKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCachingServiceCallServiceDiscoveryConfiguration_CombinedServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combinedServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	CombinedServiceCallServiceDiscoveryConfiguration getCombinedServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getCombinedServiceDiscovery <em>Combined Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Service Discovery</em>' containment reference.
	 * @see #getCombinedServiceDiscovery()
	 * @generated
	 */
	void setCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCachingServiceCallServiceDiscoveryConfiguration_StaticServiceDiscovery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staticServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticServiceCallServiceDiscoveryConfiguration getStaticServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getStaticServiceDiscovery <em>Static Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Service Discovery</em>' containment reference.
	 * @see #getStaticServiceDiscovery()
	 * @generated
	 */
	void setStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the time the services will be retained. Default value: 60
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCachingServiceCallServiceDiscoveryConfiguration_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the time unit for the timeout. Default value: SECONDS
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCachingServiceCallServiceDiscoveryConfiguration_Units()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='units'"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

} // CachingServiceCallServiceDiscoveryConfiguration

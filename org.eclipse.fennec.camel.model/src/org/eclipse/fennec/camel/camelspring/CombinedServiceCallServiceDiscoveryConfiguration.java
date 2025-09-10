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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Service Call Service Discovery Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration#getConsulServiceDiscovery <em>Consul Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration#getDnsServiceDiscovery <em>Dns Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration#getStaticServiceDiscovery <em>Static Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration#getCachingServiceDiscovery <em>Caching Service Discovery</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceDiscoveryConfiguration()
 * @model extendedMetaData="name='combinedServiceCallServiceDiscoveryConfiguration' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CombinedServiceCallServiceDiscoveryConfiguration extends ServiceCallServiceDiscoveryConfiguration {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceDiscoveryConfiguration_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:2'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Consul Service Discovery</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consul Service Discovery</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceDiscoveryConfiguration_ConsulServiceDiscovery()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='consulServiceDiscovery' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<ConsulServiceCallServiceDiscoveryConfiguration> getConsulServiceDiscovery();

	/**
	 * Returns the value of the '<em><b>Dns Service Discovery</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dns Service Discovery</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceDiscoveryConfiguration_DnsServiceDiscovery()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dnsServiceDiscovery' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<DnsServiceCallServiceDiscoveryConfiguration> getDnsServiceDiscovery();

	/**
	 * Returns the value of the '<em><b>Kubernetes Service Discovery</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kubernetes Service Discovery</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceDiscoveryConfiguration_KubernetesServiceDiscovery()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kubernetesServiceDiscovery' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<KubernetesServiceCallServiceDiscoveryConfiguration> getKubernetesServiceDiscovery();

	/**
	 * Returns the value of the '<em><b>Static Service Discovery</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.StaticServiceCallServiceDiscoveryConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Service Discovery</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceDiscoveryConfiguration_StaticServiceDiscovery()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='staticServiceDiscovery' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<StaticServiceCallServiceDiscoveryConfiguration> getStaticServiceDiscovery();

	/**
	 * Returns the value of the '<em><b>Caching Service Discovery</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caching Service Discovery</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceDiscoveryConfiguration_CachingServiceDiscovery()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cachingServiceDiscovery' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<CachingServiceCallServiceDiscoveryConfiguration> getCachingServiceDiscovery();

} // CombinedServiceCallServiceDiscoveryConfiguration

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
 * A representation of the model object '<em><b>Combined Service Call Service Filter Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceFilterConfiguration#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceFilterConfiguration#getBlacklistServiceFilter <em>Blacklist Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceFilterConfiguration#getCustomServiceFilter <em>Custom Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceFilterConfiguration#getHealthyServiceFilter <em>Healthy Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceFilterConfiguration#getPassThroughServiceFilter <em>Pass Through Service Filter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceFilterConfiguration()
 * @model extendedMetaData="name='combinedServiceCallServiceFilterConfiguration' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CombinedServiceCallServiceFilterConfiguration extends ServiceCallServiceFilterConfiguration {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceFilterConfiguration_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:2'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Blacklist Service Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.BlacklistServiceCallServiceFilterConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blacklist Service Filter</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceFilterConfiguration_BlacklistServiceFilter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blacklistServiceFilter' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<BlacklistServiceCallServiceFilterConfiguration> getBlacklistServiceFilter();

	/**
	 * Returns the value of the '<em><b>Custom Service Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CustomServiceCallServiceFilterConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Service Filter</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceFilterConfiguration_CustomServiceFilter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customServiceFilter' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<CustomServiceCallServiceFilterConfiguration> getCustomServiceFilter();

	/**
	 * Returns the value of the '<em><b>Healthy Service Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.HealthyServiceCallServiceFilterConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Healthy Service Filter</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceFilterConfiguration_HealthyServiceFilter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='healthyServiceFilter' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<HealthyServiceCallServiceFilterConfiguration> getHealthyServiceFilter();

	/**
	 * Returns the value of the '<em><b>Pass Through Service Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PassThroughServiceCallServiceFilterConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pass Through Service Filter</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCombinedServiceCallServiceFilterConfiguration_PassThroughServiceFilter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='passThroughServiceFilter' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<PassThroughServiceCallServiceFilterConfiguration> getPassThroughServiceFilter();

} // CombinedServiceCallServiceFilterConfiguration

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
 * A representation of the model object '<em><b>Weighted Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.WeightedLoadBalancerDefinition#getDistributionRatio <em>Distribution Ratio</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.WeightedLoadBalancerDefinition#getDistributionRatioDelimiter <em>Distribution Ratio Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.WeightedLoadBalancerDefinition#getRoundRobin <em>Round Robin</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWeightedLoadBalancerDefinition()
 * @model extendedMetaData="name='weightedLoadBalancerDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface WeightedLoadBalancerDefinition extends LoadBalancerDefinition {
	/**
	 * Returns the value of the '<em><b>Distribution Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The distribution ratio is a delimited String consisting on integer weights separated by delimiters for example 2,3,5.
	 * The distributionRatio must match the number of endpoints and/or processors specified in the load balancer list.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distribution Ratio</em>' attribute.
	 * @see #setDistributionRatio(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWeightedLoadBalancerDefinition_DistributionRatio()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='distributionRatio'"
	 * @generated
	 */
	String getDistributionRatio();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.WeightedLoadBalancerDefinition#getDistributionRatio <em>Distribution Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Ratio</em>' attribute.
	 * @see #getDistributionRatio()
	 * @generated
	 */
	void setDistributionRatio(String value);

	/**
	 * Returns the value of the '<em><b>Distribution Ratio Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Delimiter used to specify the distribution ratio. The default value is , (comma). Default value: ,
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distribution Ratio Delimiter</em>' attribute.
	 * @see #setDistributionRatioDelimiter(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWeightedLoadBalancerDefinition_DistributionRatioDelimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='distributionRatioDelimiter'"
	 * @generated
	 */
	String getDistributionRatioDelimiter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.WeightedLoadBalancerDefinition#getDistributionRatioDelimiter <em>Distribution Ratio Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Ratio Delimiter</em>' attribute.
	 * @see #getDistributionRatioDelimiter()
	 * @generated
	 */
	void setDistributionRatioDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Round Robin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To enable round robin mode. By default the weighted distribution mode is used. The default value is false. Default
	 * value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Round Robin</em>' attribute.
	 * @see #setRoundRobin(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWeightedLoadBalancerDefinition_RoundRobin()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='roundRobin'"
	 * @generated
	 */
	String getRoundRobin();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.WeightedLoadBalancerDefinition#getRoundRobin <em>Round Robin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Robin</em>' attribute.
	 * @see #getRoundRobin()
	 * @generated
	 */
	void setRoundRobin(String value);

} // WeightedLoadBalancerDefinition

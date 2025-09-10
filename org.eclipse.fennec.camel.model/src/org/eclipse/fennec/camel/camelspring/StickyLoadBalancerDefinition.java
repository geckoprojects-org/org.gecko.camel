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
 * A representation of the model object '<em><b>Sticky Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.StickyLoadBalancerDefinition#getCorrelationExpression <em>Correlation Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStickyLoadBalancerDefinition()
 * @model extendedMetaData="name='stickyLoadBalancerDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StickyLoadBalancerDefinition extends LoadBalancerDefinition {
	/**
	 * Returns the value of the '<em><b>Correlation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The correlation expression to use to calculate the correlation key.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #setCorrelationExpression(ExpressionSubElementDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStickyLoadBalancerDefinition_CorrelationExpression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='correlationExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionSubElementDefinition getCorrelationExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.StickyLoadBalancerDefinition#getCorrelationExpression <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #getCorrelationExpression()
	 * @generated
	 */
	void setCorrelationExpression(ExpressionSubElementDefinition value);

} // StickyLoadBalancerDefinition

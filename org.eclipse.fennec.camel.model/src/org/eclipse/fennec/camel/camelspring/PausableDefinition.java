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
 * A representation of the model object '<em><b>Pausable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PausableDefinition#getConsumerListener <em>Consumer Listener</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.PausableDefinition#getUntilCheck <em>Until Check</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPausableDefinition()
 * @model extendedMetaData="name='pausableDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface PausableDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Consumer Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the consumer listener to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer Listener</em>' attribute.
	 * @see #setConsumerListener(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPausableDefinition_ConsumerListener()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='consumerListener'"
	 * @generated
	 */
	String getConsumerListener();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PausableDefinition#getConsumerListener <em>Consumer Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Listener</em>' attribute.
	 * @see #getConsumerListener()
	 * @generated
	 */
	void setConsumerListener(String value);

	/**
	 * Returns the value of the '<em><b>Until Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * References to a java.util.function.Predicate to use for until checks. The predicate is responsible for evaluating
	 * whether the processing can resume or not. Such predicate should return true if the consumption can resume, or false
	 * otherwise. The exact point of when the predicate is called is dependent on the component, and it may be called on either
	 * one of the available events. Implementations should not assume the predicate to be called at any specific point.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Until Check</em>' attribute.
	 * @see #setUntilCheck(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getPausableDefinition_UntilCheck()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='untilCheck'"
	 * @generated
	 */
	String getUntilCheck();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.PausableDefinition#getUntilCheck <em>Until Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Check</em>' attribute.
	 * @see #getUntilCheck()
	 * @generated
	 */
	void setUntilCheck(String value);

} // PausableDefinition

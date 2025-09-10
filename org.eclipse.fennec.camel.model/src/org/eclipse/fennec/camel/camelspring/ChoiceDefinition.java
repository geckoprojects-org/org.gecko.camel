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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ChoiceDefinition#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ChoiceDefinition#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ChoiceDefinition#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getChoiceDefinition()
 * @model extendedMetaData="name='choiceDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ChoiceDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.WhenDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Triggers a route when the expression evaluates to true
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getChoiceDefinition_When()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WhenDefinition> getWhen();

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route to be executed when all other choices evaluate to false
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Otherwise</em>' containment reference.
	 * @see #setOtherwise(OtherwiseDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getChoiceDefinition_Otherwise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherwise' namespace='##targetNamespace'"
	 * @generated
	 */
	OtherwiseDefinition getOtherwise();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ChoiceDefinition#getOtherwise <em>Otherwise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise</em>' containment reference.
	 * @see #getOtherwise()
	 * @generated
	 */
	void setOtherwise(OtherwiseDefinition value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Indicates whether this Choice EIP is in precondition mode or not. If so its branches (when/otherwise) are evaluated
	 * during startup to keep at runtime only the branch that matched. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' attribute.
	 * @see #setPrecondition(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getChoiceDefinition_Precondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='precondition'"
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ChoiceDefinition#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

} // ChoiceDefinition

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
 * A representation of the model object '<em><b>Set Variables Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SetVariablesDefinition#getSetVariable <em>Set Variable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSetVariablesDefinition()
 * @model extendedMetaData="name='setVariablesDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SetVariablesDefinition extends ProcessorDefinition {
	/**
	 * Returns the value of the '<em><b>Set Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SetVariableDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the value of a variable
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Variable</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSetVariablesDefinition_SetVariable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='setVariable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SetVariableDefinition> getSetVariable();

} // SetVariablesDefinition

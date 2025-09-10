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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allowable Values Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AllowableValuesType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAllowableValuesType()
 * @model extendedMetaData="name='allowableValues_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllowableValuesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A single value
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAllowableValuesType_Value()
	 * @model unique="false" dataType="org.eclipse.fennec.camel.camelspring.ValueDefinition"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getValue();

} // AllowableValuesType

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
 * A representation of the model object '<em><b>Global Options Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.GlobalOptionsDefinition#getGlobalOption <em>Global Option</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getGlobalOptionsDefinition()
 * @model extendedMetaData="name='globalOptionsDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GlobalOptionsDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Global Option</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.GlobalOptionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Models a string key/value pair for configuring some global options on a Camel context such as max debug log length.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Option</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getGlobalOptionsDefinition_GlobalOption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='globalOption' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GlobalOptionDefinition> getGlobalOption();

} // GlobalOptionsDefinition

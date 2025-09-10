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
 * A representation of the model object '<em><b>Data Formats Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsType#getDataFormat <em>Data Format</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsType()
 * @model extendedMetaData="name='dataFormats_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataFormatsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.DataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel data formats.
	 * 
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Format</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsType_DataFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataFormat> getDataFormat();

} // DataFormatsType

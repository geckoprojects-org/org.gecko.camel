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
 * A representation of the model object '<em><b>Hl7 Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Hl7DataFormat#getValidate <em>Validate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getHl7DataFormat()
 * @model extendedMetaData="name='hl7DataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface Hl7DataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to validate the HL7 message Is by default true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getHl7DataFormat_Validate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='validate'"
	 * @generated
	 */
	String getValidate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Hl7DataFormat#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(String value);

} // Hl7DataFormat

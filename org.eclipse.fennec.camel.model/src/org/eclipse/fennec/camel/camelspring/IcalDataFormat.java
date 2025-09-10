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
 * A representation of the model object '<em><b>Ical Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.IcalDataFormat#getValidating <em>Validating</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getIcalDataFormat()
 * @model extendedMetaData="name='icalDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface IcalDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Validating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to validate. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validating</em>' attribute.
	 * @see #setValidating(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getIcalDataFormat_Validating()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='validating'"
	 * @generated
	 */
	String getValidating();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.IcalDataFormat#getValidating <em>Validating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validating</em>' attribute.
	 * @see #getValidating()
	 * @generated
	 */
	void setValidating(String value);

} // IcalDataFormat

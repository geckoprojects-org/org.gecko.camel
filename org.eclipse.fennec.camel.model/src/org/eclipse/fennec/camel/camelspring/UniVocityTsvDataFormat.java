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
 * A representation of the model object '<em><b>Uni Vocity Tsv Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityTsvDataFormat#getEscapeChar <em>Escape Char</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityTsvDataFormat()
 * @model extendedMetaData="name='uniVocityTsvDataFormat' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UniVocityTsvDataFormat extends UniVocityAbstractDataFormat {
	/**
	 * Returns the value of the '<em><b>Escape Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The escape character. Default value: \
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Escape Char</em>' attribute.
	 * @see #setEscapeChar(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityTsvDataFormat_EscapeChar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='escapeChar'"
	 * @generated
	 */
	String getEscapeChar();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityTsvDataFormat#getEscapeChar <em>Escape Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape Char</em>' attribute.
	 * @see #getEscapeChar()
	 * @generated
	 */
	void setEscapeChar(String value);

} // UniVocityTsvDataFormat

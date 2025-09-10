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
 * A representation of the model object '<em><b>Uni Vocity Fixed Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat#getRecordEndsOnNewline <em>Record Ends On Newline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat#getSkipTrailingCharsUntilNewline <em>Skip Trailing Chars Until Newline</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityFixedDataFormat()
 * @model extendedMetaData="name='uniVocityFixedDataFormat' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UniVocityFixedDataFormat extends UniVocityAbstractDataFormat {
	/**
	 * Returns the value of the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The padding character. The default value is a space.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Padding</em>' attribute.
	 * @see #setPadding(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityFixedDataFormat_Padding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='padding'"
	 * @generated
	 */
	String getPadding();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat#getPadding <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' attribute.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(String value);

	/**
	 * Returns the value of the '<em><b>Record Ends On Newline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not the record ends on new line. The default value is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Ends On Newline</em>' attribute.
	 * @see #setRecordEndsOnNewline(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityFixedDataFormat_RecordEndsOnNewline()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='recordEndsOnNewline'"
	 * @generated
	 */
	String getRecordEndsOnNewline();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat#getRecordEndsOnNewline <em>Record Ends On Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Ends On Newline</em>' attribute.
	 * @see #getRecordEndsOnNewline()
	 * @generated
	 */
	void setRecordEndsOnNewline(String value);

	/**
	 * Returns the value of the '<em><b>Skip Trailing Chars Until Newline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not the trailing characters until new line must be ignored. The default value is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skip Trailing Chars Until Newline</em>' attribute.
	 * @see #setSkipTrailingCharsUntilNewline(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityFixedDataFormat_SkipTrailingCharsUntilNewline()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='skipTrailingCharsUntilNewline'"
	 * @generated
	 */
	String getSkipTrailingCharsUntilNewline();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat#getSkipTrailingCharsUntilNewline <em>Skip Trailing Chars Until Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Trailing Chars Until Newline</em>' attribute.
	 * @see #getSkipTrailingCharsUntilNewline()
	 * @generated
	 */
	void setSkipTrailingCharsUntilNewline(String value);

} // UniVocityFixedDataFormat

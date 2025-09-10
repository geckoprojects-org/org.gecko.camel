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
 * A representation of the model object '<em><b>Base64 Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Base64DataFormat#getLineLength <em>Line Length</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Base64DataFormat#getLineSeparator <em>Line Separator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Base64DataFormat#getUrlSafe <em>Url Safe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBase64DataFormat()
 * @model extendedMetaData="name='base64DataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface Base64DataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Line Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To specific a maximum line length for the encoded data. By default 76 is used. Default value: 76
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Length</em>' attribute.
	 * @see #setLineLength(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBase64DataFormat_LineLength()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lineLength'"
	 * @generated
	 */
	String getLineLength();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Base64DataFormat#getLineLength <em>Line Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Length</em>' attribute.
	 * @see #getLineLength()
	 * @generated
	 */
	void setLineLength(String value);

	/**
	 * Returns the value of the '<em><b>Line Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The line separators to use. Uses new line characters (CRLF) by default.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Separator</em>' attribute.
	 * @see #setLineSeparator(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBase64DataFormat_LineSeparator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lineSeparator'"
	 * @generated
	 */
	String getLineSeparator();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Base64DataFormat#getLineSeparator <em>Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Separator</em>' attribute.
	 * @see #getLineSeparator()
	 * @generated
	 */
	void setLineSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Url Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Instead of emitting '' and '/' we emit '-' and '_' respectively. urlSafe is only applied to encode operations. Decoding
	 * seamlessly handles both modes. Is by default false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url Safe</em>' attribute.
	 * @see #setUrlSafe(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBase64DataFormat_UrlSafe()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='urlSafe'"
	 * @generated
	 */
	String getUrlSafe();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Base64DataFormat#getUrlSafe <em>Url Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Safe</em>' attribute.
	 * @see #getUrlSafe()
	 * @generated
	 */
	void setUrlSafe(String value);

} // Base64DataFormat

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
 * A representation of the model object '<em><b>Grok Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.GrokDataFormat#getAllowMultipleMatchesPerLine <em>Allow Multiple Matches Per Line</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.GrokDataFormat#getFlattened <em>Flattened</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.GrokDataFormat#getNamedOnly <em>Named Only</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.GrokDataFormat#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getGrokDataFormat()
 * @model extendedMetaData="name='grokDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface GrokDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Allow Multiple Matches Per Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If false, every line of input is matched for pattern only once. Otherwise the line can be scanned multiple times when
	 * non-terminal pattern is used. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Multiple Matches Per Line</em>' attribute.
	 * @see #setAllowMultipleMatchesPerLine(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getGrokDataFormat_AllowMultipleMatchesPerLine()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowMultipleMatchesPerLine'"
	 * @generated
	 */
	String getAllowMultipleMatchesPerLine();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.GrokDataFormat#getAllowMultipleMatchesPerLine <em>Allow Multiple Matches Per Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Multiple Matches Per Line</em>' attribute.
	 * @see #getAllowMultipleMatchesPerLine()
	 * @generated
	 */
	void setAllowMultipleMatchesPerLine(String value);

	/**
	 * Returns the value of the '<em><b>Flattened</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Turns on flattened mode. In flattened mode the exception is thrown when there are multiple pattern matches with same
	 * key. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flattened</em>' attribute.
	 * @see #setFlattened(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getGrokDataFormat_Flattened()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='flattened'"
	 * @generated
	 */
	String getFlattened();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.GrokDataFormat#getFlattened <em>Flattened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flattened</em>' attribute.
	 * @see #getFlattened()
	 * @generated
	 */
	void setFlattened(String value);

	/**
	 * Returns the value of the '<em><b>Named Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to capture named expressions only or not (i.e. %{IP:ip} but not ${IP}). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Named Only</em>' attribute.
	 * @see #setNamedOnly(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getGrokDataFormat_NamedOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='namedOnly'"
	 * @generated
	 */
	String getNamedOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.GrokDataFormat#getNamedOnly <em>Named Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Only</em>' attribute.
	 * @see #getNamedOnly()
	 * @generated
	 */
	void setNamedOnly(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The grok pattern to match lines of input.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getGrokDataFormat_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.GrokDataFormat#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // GrokDataFormat

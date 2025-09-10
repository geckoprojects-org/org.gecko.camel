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
 * A representation of the model object '<em><b>Uni Vocity Csv Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat#getQuoteAllFields <em>Quote All Fields</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat#getQuoteEscape <em>Quote Escape</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityCsvDataFormat()
 * @model extendedMetaData="name='uniVocityCsvDataFormat' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UniVocityCsvDataFormat extends UniVocityAbstractDataFormat {
	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The delimiter of values. Default value: ,
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delimiter</em>' attribute.
	 * @see #setDelimiter(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityCsvDataFormat_Delimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delimiter'"
	 * @generated
	 */
	String getDelimiter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat#getDelimiter <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' attribute.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Quote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The quote symbol. Default value: "
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quote</em>' attribute.
	 * @see #setQuote(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityCsvDataFormat_Quote()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='quote'"
	 * @generated
	 */
	String getQuote();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat#getQuote <em>Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote</em>' attribute.
	 * @see #getQuote()
	 * @generated
	 */
	void setQuote(String value);

	/**
	 * Returns the value of the '<em><b>Quote All Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not all values must be quoted when writing them. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quote All Fields</em>' attribute.
	 * @see #setQuoteAllFields(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityCsvDataFormat_QuoteAllFields()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='quoteAllFields'"
	 * @generated
	 */
	String getQuoteAllFields();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat#getQuoteAllFields <em>Quote All Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote All Fields</em>' attribute.
	 * @see #getQuoteAllFields()
	 * @generated
	 */
	void setQuoteAllFields(String value);

	/**
	 * Returns the value of the '<em><b>Quote Escape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The quote escape symbol. Default value: "
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quote Escape</em>' attribute.
	 * @see #setQuoteEscape(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityCsvDataFormat_QuoteEscape()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='quoteEscape'"
	 * @generated
	 */
	String getQuoteEscape();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat#getQuoteEscape <em>Quote Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Escape</em>' attribute.
	 * @see #getQuoteEscape()
	 * @generated
	 */
	void setQuoteEscape(String value);

} // UniVocityCsvDataFormat

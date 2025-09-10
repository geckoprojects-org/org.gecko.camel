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
package org.eclipse.fennec.camel.camelspring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uni Vocity Csv Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityCsvDataFormatImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityCsvDataFormatImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityCsvDataFormatImpl#getQuoteAllFields <em>Quote All Fields</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityCsvDataFormatImpl#getQuoteEscape <em>Quote Escape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniVocityCsvDataFormatImpl extends UniVocityAbstractDataFormatImpl implements UniVocityCsvDataFormat {
	/**
	 * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String delimiter = DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuote() <em>Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuote()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuote() <em>Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuote()
	 * @generated
	 * @ordered
	 */
	protected String quote = QUOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuoteAllFields() <em>Quote All Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteAllFields()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_ALL_FIELDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteAllFields() <em>Quote All Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteAllFields()
	 * @generated
	 * @ordered
	 */
	protected String quoteAllFields = QUOTE_ALL_FIELDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuoteEscape() <em>Quote Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteEscape()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_ESCAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteEscape() <em>Quote Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteEscape()
	 * @generated
	 * @ordered
	 */
	protected String quoteEscape = QUOTE_ESCAPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniVocityCsvDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getUniVocityCsvDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelimiter() {
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimiter(String newDelimiter) {
		String oldDelimiter = delimiter;
		delimiter = newDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__DELIMITER, oldDelimiter, delimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuote() {
		return quote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuote(String newQuote) {
		String oldQuote = quote;
		quote = newQuote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE, oldQuote, quote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteAllFields() {
		return quoteAllFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteAllFields(String newQuoteAllFields) {
		String oldQuoteAllFields = quoteAllFields;
		quoteAllFields = newQuoteAllFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE_ALL_FIELDS, oldQuoteAllFields, quoteAllFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteEscape() {
		return quoteEscape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteEscape(String newQuoteEscape) {
		String oldQuoteEscape = quoteEscape;
		quoteEscape = newQuoteEscape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE_ESCAPE, oldQuoteEscape, quoteEscape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__DELIMITER:
				return getDelimiter();
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE:
				return getQuote();
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE_ALL_FIELDS:
				return getQuoteAllFields();
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE_ESCAPE:
				return getQuoteEscape();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__DELIMITER:
				setDelimiter((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE:
				setQuote((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE_ALL_FIELDS:
				setQuoteAllFields((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE_ESCAPE:
				setQuoteEscape((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__DELIMITER:
				setDelimiter(DELIMITER_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE:
				setQuote(QUOTE_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE_ALL_FIELDS:
				setQuoteAllFields(QUOTE_ALL_FIELDS_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE_ESCAPE:
				setQuoteEscape(QUOTE_ESCAPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__DELIMITER:
				return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE:
				return QUOTE_EDEFAULT == null ? quote != null : !QUOTE_EDEFAULT.equals(quote);
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE_ALL_FIELDS:
				return QUOTE_ALL_FIELDS_EDEFAULT == null ? quoteAllFields != null : !QUOTE_ALL_FIELDS_EDEFAULT.equals(quoteAllFields);
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT__QUOTE_ESCAPE:
				return QUOTE_ESCAPE_EDEFAULT == null ? quoteEscape != null : !QUOTE_ESCAPE_EDEFAULT.equals(quoteEscape);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (delimiter: ");
		result.append(delimiter);
		result.append(", quote: ");
		result.append(quote);
		result.append(", quoteAllFields: ");
		result.append(quoteAllFields);
		result.append(", quoteEscape: ");
		result.append(quoteEscape);
		result.append(')');
		return result.toString();
	}

} //UniVocityCsvDataFormatImpl

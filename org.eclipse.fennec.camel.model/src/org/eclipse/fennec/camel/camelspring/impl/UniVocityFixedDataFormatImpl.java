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
import org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uni Vocity Fixed Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityFixedDataFormatImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityFixedDataFormatImpl#getRecordEndsOnNewline <em>Record Ends On Newline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityFixedDataFormatImpl#getSkipTrailingCharsUntilNewline <em>Skip Trailing Chars Until Newline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniVocityFixedDataFormatImpl extends UniVocityAbstractDataFormatImpl implements UniVocityFixedDataFormat {
	/**
	 * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected String padding = PADDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordEndsOnNewline() <em>Record Ends On Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordEndsOnNewline()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_ENDS_ON_NEWLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordEndsOnNewline() <em>Record Ends On Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordEndsOnNewline()
	 * @generated
	 * @ordered
	 */
	protected String recordEndsOnNewline = RECORD_ENDS_ON_NEWLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkipTrailingCharsUntilNewline() <em>Skip Trailing Chars Until Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipTrailingCharsUntilNewline()
	 * @generated
	 * @ordered
	 */
	protected static final String SKIP_TRAILING_CHARS_UNTIL_NEWLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipTrailingCharsUntilNewline() <em>Skip Trailing Chars Until Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipTrailingCharsUntilNewline()
	 * @generated
	 * @ordered
	 */
	protected String skipTrailingCharsUntilNewline = SKIP_TRAILING_CHARS_UNTIL_NEWLINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniVocityFixedDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getUniVocityFixedDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPadding(String newPadding) {
		String oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__PADDING, oldPadding, padding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecordEndsOnNewline() {
		return recordEndsOnNewline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordEndsOnNewline(String newRecordEndsOnNewline) {
		String oldRecordEndsOnNewline = recordEndsOnNewline;
		recordEndsOnNewline = newRecordEndsOnNewline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__RECORD_ENDS_ON_NEWLINE, oldRecordEndsOnNewline, recordEndsOnNewline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSkipTrailingCharsUntilNewline() {
		return skipTrailingCharsUntilNewline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkipTrailingCharsUntilNewline(String newSkipTrailingCharsUntilNewline) {
		String oldSkipTrailingCharsUntilNewline = skipTrailingCharsUntilNewline;
		skipTrailingCharsUntilNewline = newSkipTrailingCharsUntilNewline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__SKIP_TRAILING_CHARS_UNTIL_NEWLINE, oldSkipTrailingCharsUntilNewline, skipTrailingCharsUntilNewline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__PADDING:
				return getPadding();
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__RECORD_ENDS_ON_NEWLINE:
				return getRecordEndsOnNewline();
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__SKIP_TRAILING_CHARS_UNTIL_NEWLINE:
				return getSkipTrailingCharsUntilNewline();
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
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__PADDING:
				setPadding((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__RECORD_ENDS_ON_NEWLINE:
				setRecordEndsOnNewline((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__SKIP_TRAILING_CHARS_UNTIL_NEWLINE:
				setSkipTrailingCharsUntilNewline((String)newValue);
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
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__PADDING:
				setPadding(PADDING_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__RECORD_ENDS_ON_NEWLINE:
				setRecordEndsOnNewline(RECORD_ENDS_ON_NEWLINE_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__SKIP_TRAILING_CHARS_UNTIL_NEWLINE:
				setSkipTrailingCharsUntilNewline(SKIP_TRAILING_CHARS_UNTIL_NEWLINE_EDEFAULT);
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
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__PADDING:
				return PADDING_EDEFAULT == null ? padding != null : !PADDING_EDEFAULT.equals(padding);
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__RECORD_ENDS_ON_NEWLINE:
				return RECORD_ENDS_ON_NEWLINE_EDEFAULT == null ? recordEndsOnNewline != null : !RECORD_ENDS_ON_NEWLINE_EDEFAULT.equals(recordEndsOnNewline);
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT__SKIP_TRAILING_CHARS_UNTIL_NEWLINE:
				return SKIP_TRAILING_CHARS_UNTIL_NEWLINE_EDEFAULT == null ? skipTrailingCharsUntilNewline != null : !SKIP_TRAILING_CHARS_UNTIL_NEWLINE_EDEFAULT.equals(skipTrailingCharsUntilNewline);
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
		result.append(" (padding: ");
		result.append(padding);
		result.append(", recordEndsOnNewline: ");
		result.append(recordEndsOnNewline);
		result.append(", skipTrailingCharsUntilNewline: ");
		result.append(skipTrailingCharsUntilNewline);
		result.append(')');
		return result.toString();
	}

} //UniVocityFixedDataFormatImpl

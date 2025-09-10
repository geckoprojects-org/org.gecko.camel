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
import org.eclipse.fennec.camel.camelspring.UniVocityTsvDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uni Vocity Tsv Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityTsvDataFormatImpl#getEscapeChar <em>Escape Char</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniVocityTsvDataFormatImpl extends UniVocityAbstractDataFormatImpl implements UniVocityTsvDataFormat {
	/**
	 * The default value of the '{@link #getEscapeChar() <em>Escape Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeChar()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPE_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscapeChar() <em>Escape Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeChar()
	 * @generated
	 * @ordered
	 */
	protected String escapeChar = ESCAPE_CHAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniVocityTsvDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getUniVocityTsvDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEscapeChar() {
		return escapeChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscapeChar(String newEscapeChar) {
		String oldEscapeChar = escapeChar;
		escapeChar = newEscapeChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_TSV_DATA_FORMAT__ESCAPE_CHAR, oldEscapeChar, escapeChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.UNI_VOCITY_TSV_DATA_FORMAT__ESCAPE_CHAR:
				return getEscapeChar();
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
			case CamelSpringPackage.UNI_VOCITY_TSV_DATA_FORMAT__ESCAPE_CHAR:
				setEscapeChar((String)newValue);
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
			case CamelSpringPackage.UNI_VOCITY_TSV_DATA_FORMAT__ESCAPE_CHAR:
				setEscapeChar(ESCAPE_CHAR_EDEFAULT);
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
			case CamelSpringPackage.UNI_VOCITY_TSV_DATA_FORMAT__ESCAPE_CHAR:
				return ESCAPE_CHAR_EDEFAULT == null ? escapeChar != null : !ESCAPE_CHAR_EDEFAULT.equals(escapeChar);
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
		result.append(" (escapeChar: ");
		result.append(escapeChar);
		result.append(')');
		return result.toString();
	}

} //UniVocityTsvDataFormatImpl

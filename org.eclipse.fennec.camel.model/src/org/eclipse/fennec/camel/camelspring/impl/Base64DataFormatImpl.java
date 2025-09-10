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

import org.eclipse.fennec.camel.camelspring.Base64DataFormat;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base64 Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Base64DataFormatImpl#getLineLength <em>Line Length</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Base64DataFormatImpl#getLineSeparator <em>Line Separator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Base64DataFormatImpl#getUrlSafe <em>Url Safe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Base64DataFormatImpl extends DataFormatImpl implements Base64DataFormat {
	/**
	 * The default value of the '{@link #getLineLength() <em>Line Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineLength() <em>Line Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineLength()
	 * @generated
	 * @ordered
	 */
	protected String lineLength = LINE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineSeparator() <em>Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineSeparator() <em>Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSeparator()
	 * @generated
	 * @ordered
	 */
	protected String lineSeparator = LINE_SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrlSafe() <em>Url Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlSafe()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_SAFE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlSafe() <em>Url Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlSafe()
	 * @generated
	 * @ordered
	 */
	protected String urlSafe = URL_SAFE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Base64DataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getBase64DataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineLength() {
		return lineLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineLength(String newLineLength) {
		String oldLineLength = lineLength;
		lineLength = newLineLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BASE64_DATA_FORMAT__LINE_LENGTH, oldLineLength, lineLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineSeparator() {
		return lineSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineSeparator(String newLineSeparator) {
		String oldLineSeparator = lineSeparator;
		lineSeparator = newLineSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BASE64_DATA_FORMAT__LINE_SEPARATOR, oldLineSeparator, lineSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrlSafe() {
		return urlSafe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrlSafe(String newUrlSafe) {
		String oldUrlSafe = urlSafe;
		urlSafe = newUrlSafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BASE64_DATA_FORMAT__URL_SAFE, oldUrlSafe, urlSafe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.BASE64_DATA_FORMAT__LINE_LENGTH:
				return getLineLength();
			case CamelSpringPackage.BASE64_DATA_FORMAT__LINE_SEPARATOR:
				return getLineSeparator();
			case CamelSpringPackage.BASE64_DATA_FORMAT__URL_SAFE:
				return getUrlSafe();
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
			case CamelSpringPackage.BASE64_DATA_FORMAT__LINE_LENGTH:
				setLineLength((String)newValue);
				return;
			case CamelSpringPackage.BASE64_DATA_FORMAT__LINE_SEPARATOR:
				setLineSeparator((String)newValue);
				return;
			case CamelSpringPackage.BASE64_DATA_FORMAT__URL_SAFE:
				setUrlSafe((String)newValue);
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
			case CamelSpringPackage.BASE64_DATA_FORMAT__LINE_LENGTH:
				setLineLength(LINE_LENGTH_EDEFAULT);
				return;
			case CamelSpringPackage.BASE64_DATA_FORMAT__LINE_SEPARATOR:
				setLineSeparator(LINE_SEPARATOR_EDEFAULT);
				return;
			case CamelSpringPackage.BASE64_DATA_FORMAT__URL_SAFE:
				setUrlSafe(URL_SAFE_EDEFAULT);
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
			case CamelSpringPackage.BASE64_DATA_FORMAT__LINE_LENGTH:
				return LINE_LENGTH_EDEFAULT == null ? lineLength != null : !LINE_LENGTH_EDEFAULT.equals(lineLength);
			case CamelSpringPackage.BASE64_DATA_FORMAT__LINE_SEPARATOR:
				return LINE_SEPARATOR_EDEFAULT == null ? lineSeparator != null : !LINE_SEPARATOR_EDEFAULT.equals(lineSeparator);
			case CamelSpringPackage.BASE64_DATA_FORMAT__URL_SAFE:
				return URL_SAFE_EDEFAULT == null ? urlSafe != null : !URL_SAFE_EDEFAULT.equals(urlSafe);
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
		result.append(" (lineLength: ");
		result.append(lineLength);
		result.append(", lineSeparator: ");
		result.append(lineSeparator);
		result.append(", urlSafe: ");
		result.append(urlSafe);
		result.append(')');
		return result.toString();
	}

} //Base64DataFormatImpl

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
import org.eclipse.fennec.camel.camelspring.SwiftMtDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swift Mt Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SwiftMtDataFormatImpl#getWriteInJson <em>Write In Json</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwiftMtDataFormatImpl extends DataFormatImpl implements SwiftMtDataFormat {
	/**
	 * The default value of the '{@link #getWriteInJson() <em>Write In Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteInJson()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITE_IN_JSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteInJson() <em>Write In Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteInJson()
	 * @generated
	 * @ordered
	 */
	protected String writeInJson = WRITE_IN_JSON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwiftMtDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSwiftMtDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWriteInJson() {
		return writeInJson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteInJson(String newWriteInJson) {
		String oldWriteInJson = writeInJson;
		writeInJson = newWriteInJson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SWIFT_MT_DATA_FORMAT__WRITE_IN_JSON, oldWriteInJson, writeInJson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.SWIFT_MT_DATA_FORMAT__WRITE_IN_JSON:
				return getWriteInJson();
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
			case CamelSpringPackage.SWIFT_MT_DATA_FORMAT__WRITE_IN_JSON:
				setWriteInJson((String)newValue);
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
			case CamelSpringPackage.SWIFT_MT_DATA_FORMAT__WRITE_IN_JSON:
				setWriteInJson(WRITE_IN_JSON_EDEFAULT);
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
			case CamelSpringPackage.SWIFT_MT_DATA_FORMAT__WRITE_IN_JSON:
				return WRITE_IN_JSON_EDEFAULT == null ? writeInJson != null : !WRITE_IN_JSON_EDEFAULT.equals(writeInJson);
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
		result.append(" (writeInJson: ");
		result.append(writeInJson);
		result.append(')');
		return result.toString();
	}

} //SwiftMtDataFormatImpl

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
import org.eclipse.fennec.camel.camelspring.JsonApiDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Api Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JsonApiDataFormatImpl#getDataFormatTypes <em>Data Format Types</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JsonApiDataFormatImpl#getMainFormatType <em>Main Format Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonApiDataFormatImpl extends DataFormatImpl implements JsonApiDataFormat {
	/**
	 * The default value of the '{@link #getDataFormatTypes() <em>Data Format Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormatTypes()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FORMAT_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFormatTypes() <em>Data Format Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormatTypes()
	 * @generated
	 * @ordered
	 */
	protected String dataFormatTypes = DATA_FORMAT_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainFormatType() <em>Main Format Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFormatType()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_FORMAT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainFormatType() <em>Main Format Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFormatType()
	 * @generated
	 * @ordered
	 */
	protected String mainFormatType = MAIN_FORMAT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonApiDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getJsonApiDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataFormatTypes() {
		return dataFormatTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFormatTypes(String newDataFormatTypes) {
		String oldDataFormatTypes = dataFormatTypes;
		dataFormatTypes = newDataFormatTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JSON_API_DATA_FORMAT__DATA_FORMAT_TYPES, oldDataFormatTypes, dataFormatTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMainFormatType() {
		return mainFormatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainFormatType(String newMainFormatType) {
		String oldMainFormatType = mainFormatType;
		mainFormatType = newMainFormatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JSON_API_DATA_FORMAT__MAIN_FORMAT_TYPE, oldMainFormatType, mainFormatType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.JSON_API_DATA_FORMAT__DATA_FORMAT_TYPES:
				return getDataFormatTypes();
			case CamelSpringPackage.JSON_API_DATA_FORMAT__MAIN_FORMAT_TYPE:
				return getMainFormatType();
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
			case CamelSpringPackage.JSON_API_DATA_FORMAT__DATA_FORMAT_TYPES:
				setDataFormatTypes((String)newValue);
				return;
			case CamelSpringPackage.JSON_API_DATA_FORMAT__MAIN_FORMAT_TYPE:
				setMainFormatType((String)newValue);
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
			case CamelSpringPackage.JSON_API_DATA_FORMAT__DATA_FORMAT_TYPES:
				setDataFormatTypes(DATA_FORMAT_TYPES_EDEFAULT);
				return;
			case CamelSpringPackage.JSON_API_DATA_FORMAT__MAIN_FORMAT_TYPE:
				setMainFormatType(MAIN_FORMAT_TYPE_EDEFAULT);
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
			case CamelSpringPackage.JSON_API_DATA_FORMAT__DATA_FORMAT_TYPES:
				return DATA_FORMAT_TYPES_EDEFAULT == null ? dataFormatTypes != null : !DATA_FORMAT_TYPES_EDEFAULT.equals(dataFormatTypes);
			case CamelSpringPackage.JSON_API_DATA_FORMAT__MAIN_FORMAT_TYPE:
				return MAIN_FORMAT_TYPE_EDEFAULT == null ? mainFormatType != null : !MAIN_FORMAT_TYPE_EDEFAULT.equals(mainFormatType);
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
		result.append(" (dataFormatTypes: ");
		result.append(dataFormatTypes);
		result.append(", mainFormatType: ");
		result.append(mainFormatType);
		result.append(')');
		return result.toString();
	}

} //JsonApiDataFormatImpl

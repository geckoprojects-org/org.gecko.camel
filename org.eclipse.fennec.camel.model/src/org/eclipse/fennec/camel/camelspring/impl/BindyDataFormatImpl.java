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

import org.eclipse.fennec.camel.camelspring.BindyDataFormat;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bindy Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BindyDataFormatImpl#getAllowEmptyStream <em>Allow Empty Stream</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BindyDataFormatImpl#getClassType <em>Class Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BindyDataFormatImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BindyDataFormatImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BindyDataFormatImpl#getUnwrapSingleInstance <em>Unwrap Single Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindyDataFormatImpl extends DataFormatImpl implements BindyDataFormat {
	/**
	 * The default value of the '{@link #getAllowEmptyStream() <em>Allow Empty Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyStream()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_EMPTY_STREAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowEmptyStream() <em>Allow Empty Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyStream()
	 * @generated
	 * @ordered
	 */
	protected String allowEmptyStream = ALLOW_EMPTY_STREAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected String classType = CLASS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected String locale = LOCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnwrapSingleInstance() <em>Unwrap Single Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnwrapSingleInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String UNWRAP_SINGLE_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnwrapSingleInstance() <em>Unwrap Single Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnwrapSingleInstance()
	 * @generated
	 * @ordered
	 */
	protected String unwrapSingleInstance = UNWRAP_SINGLE_INSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindyDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getBindyDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowEmptyStream() {
		return allowEmptyStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowEmptyStream(String newAllowEmptyStream) {
		String oldAllowEmptyStream = allowEmptyStream;
		allowEmptyStream = newAllowEmptyStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BINDY_DATA_FORMAT__ALLOW_EMPTY_STREAM, oldAllowEmptyStream, allowEmptyStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassType() {
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassType(String newClassType) {
		String oldClassType = classType;
		classType = newClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BINDY_DATA_FORMAT__CLASS_TYPE, oldClassType, classType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocale(String newLocale) {
		String oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BINDY_DATA_FORMAT__LOCALE, oldLocale, locale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BINDY_DATA_FORMAT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnwrapSingleInstance() {
		return unwrapSingleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnwrapSingleInstance(String newUnwrapSingleInstance) {
		String oldUnwrapSingleInstance = unwrapSingleInstance;
		unwrapSingleInstance = newUnwrapSingleInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BINDY_DATA_FORMAT__UNWRAP_SINGLE_INSTANCE, oldUnwrapSingleInstance, unwrapSingleInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.BINDY_DATA_FORMAT__ALLOW_EMPTY_STREAM:
				return getAllowEmptyStream();
			case CamelSpringPackage.BINDY_DATA_FORMAT__CLASS_TYPE:
				return getClassType();
			case CamelSpringPackage.BINDY_DATA_FORMAT__LOCALE:
				return getLocale();
			case CamelSpringPackage.BINDY_DATA_FORMAT__TYPE:
				return getType();
			case CamelSpringPackage.BINDY_DATA_FORMAT__UNWRAP_SINGLE_INSTANCE:
				return getUnwrapSingleInstance();
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
			case CamelSpringPackage.BINDY_DATA_FORMAT__ALLOW_EMPTY_STREAM:
				setAllowEmptyStream((String)newValue);
				return;
			case CamelSpringPackage.BINDY_DATA_FORMAT__CLASS_TYPE:
				setClassType((String)newValue);
				return;
			case CamelSpringPackage.BINDY_DATA_FORMAT__LOCALE:
				setLocale((String)newValue);
				return;
			case CamelSpringPackage.BINDY_DATA_FORMAT__TYPE:
				setType((String)newValue);
				return;
			case CamelSpringPackage.BINDY_DATA_FORMAT__UNWRAP_SINGLE_INSTANCE:
				setUnwrapSingleInstance((String)newValue);
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
			case CamelSpringPackage.BINDY_DATA_FORMAT__ALLOW_EMPTY_STREAM:
				setAllowEmptyStream(ALLOW_EMPTY_STREAM_EDEFAULT);
				return;
			case CamelSpringPackage.BINDY_DATA_FORMAT__CLASS_TYPE:
				setClassType(CLASS_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.BINDY_DATA_FORMAT__LOCALE:
				setLocale(LOCALE_EDEFAULT);
				return;
			case CamelSpringPackage.BINDY_DATA_FORMAT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.BINDY_DATA_FORMAT__UNWRAP_SINGLE_INSTANCE:
				setUnwrapSingleInstance(UNWRAP_SINGLE_INSTANCE_EDEFAULT);
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
			case CamelSpringPackage.BINDY_DATA_FORMAT__ALLOW_EMPTY_STREAM:
				return ALLOW_EMPTY_STREAM_EDEFAULT == null ? allowEmptyStream != null : !ALLOW_EMPTY_STREAM_EDEFAULT.equals(allowEmptyStream);
			case CamelSpringPackage.BINDY_DATA_FORMAT__CLASS_TYPE:
				return CLASS_TYPE_EDEFAULT == null ? classType != null : !CLASS_TYPE_EDEFAULT.equals(classType);
			case CamelSpringPackage.BINDY_DATA_FORMAT__LOCALE:
				return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
			case CamelSpringPackage.BINDY_DATA_FORMAT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CamelSpringPackage.BINDY_DATA_FORMAT__UNWRAP_SINGLE_INSTANCE:
				return UNWRAP_SINGLE_INSTANCE_EDEFAULT == null ? unwrapSingleInstance != null : !UNWRAP_SINGLE_INSTANCE_EDEFAULT.equals(unwrapSingleInstance);
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
		result.append(" (allowEmptyStream: ");
		result.append(allowEmptyStream);
		result.append(", classType: ");
		result.append(classType);
		result.append(", locale: ");
		result.append(locale);
		result.append(", type: ");
		result.append(type);
		result.append(", unwrapSingleInstance: ");
		result.append(unwrapSingleInstance);
		result.append(')');
		return result.toString();
	}

} //BindyDataFormatImpl

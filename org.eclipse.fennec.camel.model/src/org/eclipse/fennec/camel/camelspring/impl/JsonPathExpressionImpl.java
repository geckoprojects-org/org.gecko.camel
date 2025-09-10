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
import org.eclipse.fennec.camel.camelspring.JsonPathExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Path Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JsonPathExpressionImpl#getAllowEasyPredicate <em>Allow Easy Predicate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JsonPathExpressionImpl#getAllowSimple <em>Allow Simple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JsonPathExpressionImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JsonPathExpressionImpl#getSuppressExceptions <em>Suppress Exceptions</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JsonPathExpressionImpl#getUnpackArray <em>Unpack Array</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JsonPathExpressionImpl#getWriteAsString <em>Write As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonPathExpressionImpl extends SingleInputTypedExpressionDefinitionImpl implements JsonPathExpression {
	/**
	 * The default value of the '{@link #getAllowEasyPredicate() <em>Allow Easy Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEasyPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_EASY_PREDICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowEasyPredicate() <em>Allow Easy Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEasyPredicate()
	 * @generated
	 * @ordered
	 */
	protected String allowEasyPredicate = ALLOW_EASY_PREDICATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowSimple() <em>Allow Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowSimple()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_SIMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowSimple() <em>Allow Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowSimple()
	 * @generated
	 * @ordered
	 */
	protected String allowSimple = ALLOW_SIMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected String option = OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuppressExceptions() <em>Suppress Exceptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressExceptions()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPRESS_EXCEPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuppressExceptions() <em>Suppress Exceptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressExceptions()
	 * @generated
	 * @ordered
	 */
	protected String suppressExceptions = SUPPRESS_EXCEPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnpackArray() <em>Unpack Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnpackArray()
	 * @generated
	 * @ordered
	 */
	protected static final String UNPACK_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnpackArray() <em>Unpack Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnpackArray()
	 * @generated
	 * @ordered
	 */
	protected String unpackArray = UNPACK_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteAsString() <em>Write As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteAsString() <em>Write As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteAsString()
	 * @generated
	 * @ordered
	 */
	protected String writeAsString = WRITE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonPathExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getJsonPathExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowEasyPredicate() {
		return allowEasyPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowEasyPredicate(String newAllowEasyPredicate) {
		String oldAllowEasyPredicate = allowEasyPredicate;
		allowEasyPredicate = newAllowEasyPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JSON_PATH_EXPRESSION__ALLOW_EASY_PREDICATE, oldAllowEasyPredicate, allowEasyPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowSimple() {
		return allowSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowSimple(String newAllowSimple) {
		String oldAllowSimple = allowSimple;
		allowSimple = newAllowSimple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JSON_PATH_EXPRESSION__ALLOW_SIMPLE, oldAllowSimple, allowSimple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOption(String newOption) {
		String oldOption = option;
		option = newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JSON_PATH_EXPRESSION__OPTION, oldOption, option));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuppressExceptions() {
		return suppressExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuppressExceptions(String newSuppressExceptions) {
		String oldSuppressExceptions = suppressExceptions;
		suppressExceptions = newSuppressExceptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JSON_PATH_EXPRESSION__SUPPRESS_EXCEPTIONS, oldSuppressExceptions, suppressExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnpackArray() {
		return unpackArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnpackArray(String newUnpackArray) {
		String oldUnpackArray = unpackArray;
		unpackArray = newUnpackArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JSON_PATH_EXPRESSION__UNPACK_ARRAY, oldUnpackArray, unpackArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWriteAsString() {
		return writeAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteAsString(String newWriteAsString) {
		String oldWriteAsString = writeAsString;
		writeAsString = newWriteAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JSON_PATH_EXPRESSION__WRITE_AS_STRING, oldWriteAsString, writeAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.JSON_PATH_EXPRESSION__ALLOW_EASY_PREDICATE:
				return getAllowEasyPredicate();
			case CamelSpringPackage.JSON_PATH_EXPRESSION__ALLOW_SIMPLE:
				return getAllowSimple();
			case CamelSpringPackage.JSON_PATH_EXPRESSION__OPTION:
				return getOption();
			case CamelSpringPackage.JSON_PATH_EXPRESSION__SUPPRESS_EXCEPTIONS:
				return getSuppressExceptions();
			case CamelSpringPackage.JSON_PATH_EXPRESSION__UNPACK_ARRAY:
				return getUnpackArray();
			case CamelSpringPackage.JSON_PATH_EXPRESSION__WRITE_AS_STRING:
				return getWriteAsString();
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
			case CamelSpringPackage.JSON_PATH_EXPRESSION__ALLOW_EASY_PREDICATE:
				setAllowEasyPredicate((String)newValue);
				return;
			case CamelSpringPackage.JSON_PATH_EXPRESSION__ALLOW_SIMPLE:
				setAllowSimple((String)newValue);
				return;
			case CamelSpringPackage.JSON_PATH_EXPRESSION__OPTION:
				setOption((String)newValue);
				return;
			case CamelSpringPackage.JSON_PATH_EXPRESSION__SUPPRESS_EXCEPTIONS:
				setSuppressExceptions((String)newValue);
				return;
			case CamelSpringPackage.JSON_PATH_EXPRESSION__UNPACK_ARRAY:
				setUnpackArray((String)newValue);
				return;
			case CamelSpringPackage.JSON_PATH_EXPRESSION__WRITE_AS_STRING:
				setWriteAsString((String)newValue);
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
			case CamelSpringPackage.JSON_PATH_EXPRESSION__ALLOW_EASY_PREDICATE:
				setAllowEasyPredicate(ALLOW_EASY_PREDICATE_EDEFAULT);
				return;
			case CamelSpringPackage.JSON_PATH_EXPRESSION__ALLOW_SIMPLE:
				setAllowSimple(ALLOW_SIMPLE_EDEFAULT);
				return;
			case CamelSpringPackage.JSON_PATH_EXPRESSION__OPTION:
				setOption(OPTION_EDEFAULT);
				return;
			case CamelSpringPackage.JSON_PATH_EXPRESSION__SUPPRESS_EXCEPTIONS:
				setSuppressExceptions(SUPPRESS_EXCEPTIONS_EDEFAULT);
				return;
			case CamelSpringPackage.JSON_PATH_EXPRESSION__UNPACK_ARRAY:
				setUnpackArray(UNPACK_ARRAY_EDEFAULT);
				return;
			case CamelSpringPackage.JSON_PATH_EXPRESSION__WRITE_AS_STRING:
				setWriteAsString(WRITE_AS_STRING_EDEFAULT);
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
			case CamelSpringPackage.JSON_PATH_EXPRESSION__ALLOW_EASY_PREDICATE:
				return ALLOW_EASY_PREDICATE_EDEFAULT == null ? allowEasyPredicate != null : !ALLOW_EASY_PREDICATE_EDEFAULT.equals(allowEasyPredicate);
			case CamelSpringPackage.JSON_PATH_EXPRESSION__ALLOW_SIMPLE:
				return ALLOW_SIMPLE_EDEFAULT == null ? allowSimple != null : !ALLOW_SIMPLE_EDEFAULT.equals(allowSimple);
			case CamelSpringPackage.JSON_PATH_EXPRESSION__OPTION:
				return OPTION_EDEFAULT == null ? option != null : !OPTION_EDEFAULT.equals(option);
			case CamelSpringPackage.JSON_PATH_EXPRESSION__SUPPRESS_EXCEPTIONS:
				return SUPPRESS_EXCEPTIONS_EDEFAULT == null ? suppressExceptions != null : !SUPPRESS_EXCEPTIONS_EDEFAULT.equals(suppressExceptions);
			case CamelSpringPackage.JSON_PATH_EXPRESSION__UNPACK_ARRAY:
				return UNPACK_ARRAY_EDEFAULT == null ? unpackArray != null : !UNPACK_ARRAY_EDEFAULT.equals(unpackArray);
			case CamelSpringPackage.JSON_PATH_EXPRESSION__WRITE_AS_STRING:
				return WRITE_AS_STRING_EDEFAULT == null ? writeAsString != null : !WRITE_AS_STRING_EDEFAULT.equals(writeAsString);
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
		result.append(" (allowEasyPredicate: ");
		result.append(allowEasyPredicate);
		result.append(", allowSimple: ");
		result.append(allowSimple);
		result.append(", option: ");
		result.append(option);
		result.append(", suppressExceptions: ");
		result.append(suppressExceptions);
		result.append(", unpackArray: ");
		result.append(unpackArray);
		result.append(", writeAsString: ");
		result.append(writeAsString);
		result.append(')');
		return result.toString();
	}

} //JsonPathExpressionImpl

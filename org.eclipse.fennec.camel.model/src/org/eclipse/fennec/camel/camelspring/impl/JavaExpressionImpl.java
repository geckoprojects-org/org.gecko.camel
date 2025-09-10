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
import org.eclipse.fennec.camel.camelspring.JavaExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JavaExpressionImpl#getPreCompile <em>Pre Compile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JavaExpressionImpl#getSingleQuotes <em>Single Quotes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaExpressionImpl extends TypedExpressionDefinitionImpl implements JavaExpression {
	/**
	 * The default value of the '{@link #getPreCompile() <em>Pre Compile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCompile()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_COMPILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreCompile() <em>Pre Compile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCompile()
	 * @generated
	 * @ordered
	 */
	protected String preCompile = PRE_COMPILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSingleQuotes() <em>Single Quotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleQuotes()
	 * @generated
	 * @ordered
	 */
	protected static final String SINGLE_QUOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingleQuotes() <em>Single Quotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleQuotes()
	 * @generated
	 * @ordered
	 */
	protected String singleQuotes = SINGLE_QUOTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getJavaExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreCompile() {
		return preCompile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreCompile(String newPreCompile) {
		String oldPreCompile = preCompile;
		preCompile = newPreCompile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAVA_EXPRESSION__PRE_COMPILE, oldPreCompile, preCompile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSingleQuotes() {
		return singleQuotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleQuotes(String newSingleQuotes) {
		String oldSingleQuotes = singleQuotes;
		singleQuotes = newSingleQuotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAVA_EXPRESSION__SINGLE_QUOTES, oldSingleQuotes, singleQuotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.JAVA_EXPRESSION__PRE_COMPILE:
				return getPreCompile();
			case CamelSpringPackage.JAVA_EXPRESSION__SINGLE_QUOTES:
				return getSingleQuotes();
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
			case CamelSpringPackage.JAVA_EXPRESSION__PRE_COMPILE:
				setPreCompile((String)newValue);
				return;
			case CamelSpringPackage.JAVA_EXPRESSION__SINGLE_QUOTES:
				setSingleQuotes((String)newValue);
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
			case CamelSpringPackage.JAVA_EXPRESSION__PRE_COMPILE:
				setPreCompile(PRE_COMPILE_EDEFAULT);
				return;
			case CamelSpringPackage.JAVA_EXPRESSION__SINGLE_QUOTES:
				setSingleQuotes(SINGLE_QUOTES_EDEFAULT);
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
			case CamelSpringPackage.JAVA_EXPRESSION__PRE_COMPILE:
				return PRE_COMPILE_EDEFAULT == null ? preCompile != null : !PRE_COMPILE_EDEFAULT.equals(preCompile);
			case CamelSpringPackage.JAVA_EXPRESSION__SINGLE_QUOTES:
				return SINGLE_QUOTES_EDEFAULT == null ? singleQuotes != null : !SINGLE_QUOTES_EDEFAULT.equals(singleQuotes);
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
		result.append(" (preCompile: ");
		result.append(preCompile);
		result.append(", singleQuotes: ");
		result.append(singleQuotes);
		result.append(')');
		return result.toString();
	}

} //JavaExpressionImpl

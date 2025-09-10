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
import org.eclipse.fennec.camel.camelspring.XQueryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XQuery Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XQueryExpressionImpl#getConfigurationRef <em>Configuration Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XQueryExpressionImpl extends NamespaceAwareExpressionImpl implements XQueryExpression {
	/**
	 * The default value of the '{@link #getConfigurationRef() <em>Configuration Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationRef() <em>Configuration Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationRef()
	 * @generated
	 * @ordered
	 */
	protected String configurationRef = CONFIGURATION_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XQueryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getXQueryExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationRef() {
		return configurationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationRef(String newConfigurationRef) {
		String oldConfigurationRef = configurationRef;
		configurationRef = newConfigurationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XQUERY_EXPRESSION__CONFIGURATION_REF, oldConfigurationRef, configurationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.XQUERY_EXPRESSION__CONFIGURATION_REF:
				return getConfigurationRef();
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
			case CamelSpringPackage.XQUERY_EXPRESSION__CONFIGURATION_REF:
				setConfigurationRef((String)newValue);
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
			case CamelSpringPackage.XQUERY_EXPRESSION__CONFIGURATION_REF:
				setConfigurationRef(CONFIGURATION_REF_EDEFAULT);
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
			case CamelSpringPackage.XQUERY_EXPRESSION__CONFIGURATION_REF:
				return CONFIGURATION_REF_EDEFAULT == null ? configurationRef != null : !CONFIGURATION_REF_EDEFAULT.equals(configurationRef);
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
		result.append(" (configurationRef: ");
		result.append(configurationRef);
		result.append(')');
		return result.toString();
	}

} //XQueryExpressionImpl

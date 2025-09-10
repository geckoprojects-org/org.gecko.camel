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
import org.eclipse.fennec.camel.camelspring.SmooksDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smooks Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SmooksDataFormatImpl#getSmooksConfig <em>Smooks Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmooksDataFormatImpl extends DataFormatImpl implements SmooksDataFormat {
	/**
	 * The default value of the '{@link #getSmooksConfig() <em>Smooks Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmooksConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String SMOOKS_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmooksConfig() <em>Smooks Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmooksConfig()
	 * @generated
	 * @ordered
	 */
	protected String smooksConfig = SMOOKS_CONFIG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmooksDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSmooksDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmooksConfig() {
		return smooksConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmooksConfig(String newSmooksConfig) {
		String oldSmooksConfig = smooksConfig;
		smooksConfig = newSmooksConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SMOOKS_DATA_FORMAT__SMOOKS_CONFIG, oldSmooksConfig, smooksConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.SMOOKS_DATA_FORMAT__SMOOKS_CONFIG:
				return getSmooksConfig();
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
			case CamelSpringPackage.SMOOKS_DATA_FORMAT__SMOOKS_CONFIG:
				setSmooksConfig((String)newValue);
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
			case CamelSpringPackage.SMOOKS_DATA_FORMAT__SMOOKS_CONFIG:
				setSmooksConfig(SMOOKS_CONFIG_EDEFAULT);
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
			case CamelSpringPackage.SMOOKS_DATA_FORMAT__SMOOKS_CONFIG:
				return SMOOKS_CONFIG_EDEFAULT == null ? smooksConfig != null : !SMOOKS_CONFIG_EDEFAULT.equals(smooksConfig);
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
		result.append(" (smooksConfig: ");
		result.append(smooksConfig);
		result.append(')');
		return result.toString();
	}

} //SmooksDataFormatImpl

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
import org.eclipse.fennec.camel.camelspring.LoadTransformerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Transformer Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LoadTransformerDefinitionImpl#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LoadTransformerDefinitionImpl#getPackageScan <em>Package Scan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadTransformerDefinitionImpl extends TransformerImpl implements LoadTransformerDefinition {
	/**
	 * The default value of the '{@link #getDefaults() <em>Defaults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaults()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaults() <em>Defaults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaults()
	 * @generated
	 * @ordered
	 */
	protected String defaults = DEFAULTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageScan() <em>Package Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageScan()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_SCAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageScan() <em>Package Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageScan()
	 * @generated
	 * @ordered
	 */
	protected String packageScan = PACKAGE_SCAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadTransformerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getLoadTransformerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaults() {
		return defaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaults(String newDefaults) {
		String oldDefaults = defaults;
		defaults = newDefaults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION__DEFAULTS, oldDefaults, defaults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackageScan() {
		return packageScan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageScan(String newPackageScan) {
		String oldPackageScan = packageScan;
		packageScan = newPackageScan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION__PACKAGE_SCAN, oldPackageScan, packageScan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION__DEFAULTS:
				return getDefaults();
			case CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION__PACKAGE_SCAN:
				return getPackageScan();
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
			case CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION__DEFAULTS:
				setDefaults((String)newValue);
				return;
			case CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION__PACKAGE_SCAN:
				setPackageScan((String)newValue);
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
			case CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION__DEFAULTS:
				setDefaults(DEFAULTS_EDEFAULT);
				return;
			case CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION__PACKAGE_SCAN:
				setPackageScan(PACKAGE_SCAN_EDEFAULT);
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
			case CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION__DEFAULTS:
				return DEFAULTS_EDEFAULT == null ? defaults != null : !DEFAULTS_EDEFAULT.equals(defaults);
			case CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION__PACKAGE_SCAN:
				return PACKAGE_SCAN_EDEFAULT == null ? packageScan != null : !PACKAGE_SCAN_EDEFAULT.equals(packageScan);
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
		result.append(" (defaults: ");
		result.append(defaults);
		result.append(", packageScan: ");
		result.append(packageScan);
		result.append(')');
		return result.toString();
	}

} //LoadTransformerDefinitionImpl

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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.PackageScanDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Scan Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PackageScanDefinitionImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PackageScanDefinitionImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PackageScanDefinitionImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageScanDefinitionImpl extends MinimalEObjectImpl.Container implements PackageScanDefinition {
	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> package_;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> excludes;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> includes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageScanDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getPackageScanDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPackage() {
		if (package_ == null) {
			package_ = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.PACKAGE_SCAN_DEFINITION__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getExcludes() {
		if (excludes == null) {
			excludes = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.PACKAGE_SCAN_DEFINITION__EXCLUDES);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIncludes() {
		if (includes == null) {
			includes = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.PACKAGE_SCAN_DEFINITION__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__PACKAGE:
				return getPackage();
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__EXCLUDES:
				return getExcludes();
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__INCLUDES:
				return getIncludes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends String>)newValue);
				return;
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__EXCLUDES:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends String>)newValue);
				return;
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends String>)newValue);
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
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__PACKAGE:
				getPackage().clear();
				return;
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__EXCLUDES:
				getExcludes().clear();
				return;
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__INCLUDES:
				getIncludes().clear();
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
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__EXCLUDES:
				return excludes != null && !excludes.isEmpty();
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION__INCLUDES:
				return includes != null && !includes.isEmpty();
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
		result.append(" (package: ");
		result.append(package_);
		result.append(", excludes: ");
		result.append(excludes);
		result.append(", includes: ");
		result.append(includes);
		result.append(')');
		return result.toString();
	}

} //PackageScanDefinitionImpl

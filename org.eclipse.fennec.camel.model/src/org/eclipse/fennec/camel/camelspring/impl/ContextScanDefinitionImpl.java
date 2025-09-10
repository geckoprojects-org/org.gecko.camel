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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.ContextScanDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Scan Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ContextScanDefinitionImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ContextScanDefinitionImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ContextScanDefinitionImpl#getIncludeNonSingletons <em>Include Non Singletons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextScanDefinitionImpl extends MinimalEObjectImpl.Container implements ContextScanDefinition {
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
	 * The default value of the '{@link #getIncludeNonSingletons() <em>Include Non Singletons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeNonSingletons()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_NON_SINGLETONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeNonSingletons() <em>Include Non Singletons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeNonSingletons()
	 * @generated
	 * @ordered
	 */
	protected String includeNonSingletons = INCLUDE_NON_SINGLETONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextScanDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getContextScanDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getExcludes() {
		if (excludes == null) {
			excludes = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.CONTEXT_SCAN_DEFINITION__EXCLUDES);
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
			includes = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.CONTEXT_SCAN_DEFINITION__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncludeNonSingletons() {
		return includeNonSingletons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeNonSingletons(String newIncludeNonSingletons) {
		String oldIncludeNonSingletons = includeNonSingletons;
		includeNonSingletons = newIncludeNonSingletons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONTEXT_SCAN_DEFINITION__INCLUDE_NON_SINGLETONS, oldIncludeNonSingletons, includeNonSingletons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__EXCLUDES:
				return getExcludes();
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__INCLUDES:
				return getIncludes();
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__INCLUDE_NON_SINGLETONS:
				return getIncludeNonSingletons();
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
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__EXCLUDES:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends String>)newValue);
				return;
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends String>)newValue);
				return;
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__INCLUDE_NON_SINGLETONS:
				setIncludeNonSingletons((String)newValue);
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
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__EXCLUDES:
				getExcludes().clear();
				return;
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__INCLUDES:
				getIncludes().clear();
				return;
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__INCLUDE_NON_SINGLETONS:
				setIncludeNonSingletons(INCLUDE_NON_SINGLETONS_EDEFAULT);
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
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__EXCLUDES:
				return excludes != null && !excludes.isEmpty();
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__INCLUDES:
				return includes != null && !includes.isEmpty();
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION__INCLUDE_NON_SINGLETONS:
				return INCLUDE_NON_SINGLETONS_EDEFAULT == null ? includeNonSingletons != null : !INCLUDE_NON_SINGLETONS_EDEFAULT.equals(includeNonSingletons);
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
		result.append(" (excludes: ");
		result.append(excludes);
		result.append(", includes: ");
		result.append(includes);
		result.append(", includeNonSingletons: ");
		result.append(includeNonSingletons);
		result.append(')');
		return result.toString();
	}

} //ContextScanDefinitionImpl

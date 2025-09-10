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
import org.eclipse.fennec.camel.camelspring.RemovePropertiesDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Properties Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RemovePropertiesDefinitionImpl#getExcludePattern <em>Exclude Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RemovePropertiesDefinitionImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemovePropertiesDefinitionImpl extends NoOutputDefinitionImpl implements RemovePropertiesDefinition {
	/**
	 * The default value of the '{@link #getExcludePattern() <em>Exclude Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludePattern() <em>Exclude Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludePattern()
	 * @generated
	 * @ordered
	 */
	protected String excludePattern = EXCLUDE_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemovePropertiesDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getRemovePropertiesDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExcludePattern() {
		return excludePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludePattern(String newExcludePattern) {
		String oldExcludePattern = excludePattern;
		excludePattern = newExcludePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION__EXCLUDE_PATTERN, oldExcludePattern, excludePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION__EXCLUDE_PATTERN:
				return getExcludePattern();
			case CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION__PATTERN:
				return getPattern();
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
			case CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION__EXCLUDE_PATTERN:
				setExcludePattern((String)newValue);
				return;
			case CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION__PATTERN:
				setPattern((String)newValue);
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
			case CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION__EXCLUDE_PATTERN:
				setExcludePattern(EXCLUDE_PATTERN_EDEFAULT);
				return;
			case CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION__PATTERN:
				setPattern(PATTERN_EDEFAULT);
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
			case CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION__EXCLUDE_PATTERN:
				return EXCLUDE_PATTERN_EDEFAULT == null ? excludePattern != null : !EXCLUDE_PATTERN_EDEFAULT.equals(excludePattern);
			case CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
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
		result.append(" (excludePattern: ");
		result.append(excludePattern);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(')');
		return result.toString();
	}

} //RemovePropertiesDefinitionImpl

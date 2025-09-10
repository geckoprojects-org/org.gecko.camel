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
import org.eclipse.fennec.camel.camelspring.GrokDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grok Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.GrokDataFormatImpl#getAllowMultipleMatchesPerLine <em>Allow Multiple Matches Per Line</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.GrokDataFormatImpl#getFlattened <em>Flattened</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.GrokDataFormatImpl#getNamedOnly <em>Named Only</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.GrokDataFormatImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrokDataFormatImpl extends DataFormatImpl implements GrokDataFormat {
	/**
	 * The default value of the '{@link #getAllowMultipleMatchesPerLine() <em>Allow Multiple Matches Per Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMultipleMatchesPerLine()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_MULTIPLE_MATCHES_PER_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowMultipleMatchesPerLine() <em>Allow Multiple Matches Per Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMultipleMatchesPerLine()
	 * @generated
	 * @ordered
	 */
	protected String allowMultipleMatchesPerLine = ALLOW_MULTIPLE_MATCHES_PER_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlattened() <em>Flattened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlattened()
	 * @generated
	 * @ordered
	 */
	protected static final String FLATTENED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlattened() <em>Flattened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlattened()
	 * @generated
	 * @ordered
	 */
	protected String flattened = FLATTENED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamedOnly() <em>Named Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedOnly()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMED_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamedOnly() <em>Named Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedOnly()
	 * @generated
	 * @ordered
	 */
	protected String namedOnly = NAMED_ONLY_EDEFAULT;

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
	protected GrokDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getGrokDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowMultipleMatchesPerLine() {
		return allowMultipleMatchesPerLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowMultipleMatchesPerLine(String newAllowMultipleMatchesPerLine) {
		String oldAllowMultipleMatchesPerLine = allowMultipleMatchesPerLine;
		allowMultipleMatchesPerLine = newAllowMultipleMatchesPerLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.GROK_DATA_FORMAT__ALLOW_MULTIPLE_MATCHES_PER_LINE, oldAllowMultipleMatchesPerLine, allowMultipleMatchesPerLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlattened() {
		return flattened;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlattened(String newFlattened) {
		String oldFlattened = flattened;
		flattened = newFlattened;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.GROK_DATA_FORMAT__FLATTENED, oldFlattened, flattened));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamedOnly() {
		return namedOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamedOnly(String newNamedOnly) {
		String oldNamedOnly = namedOnly;
		namedOnly = newNamedOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.GROK_DATA_FORMAT__NAMED_ONLY, oldNamedOnly, namedOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.GROK_DATA_FORMAT__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.GROK_DATA_FORMAT__ALLOW_MULTIPLE_MATCHES_PER_LINE:
				return getAllowMultipleMatchesPerLine();
			case CamelSpringPackage.GROK_DATA_FORMAT__FLATTENED:
				return getFlattened();
			case CamelSpringPackage.GROK_DATA_FORMAT__NAMED_ONLY:
				return getNamedOnly();
			case CamelSpringPackage.GROK_DATA_FORMAT__PATTERN:
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
			case CamelSpringPackage.GROK_DATA_FORMAT__ALLOW_MULTIPLE_MATCHES_PER_LINE:
				setAllowMultipleMatchesPerLine((String)newValue);
				return;
			case CamelSpringPackage.GROK_DATA_FORMAT__FLATTENED:
				setFlattened((String)newValue);
				return;
			case CamelSpringPackage.GROK_DATA_FORMAT__NAMED_ONLY:
				setNamedOnly((String)newValue);
				return;
			case CamelSpringPackage.GROK_DATA_FORMAT__PATTERN:
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
			case CamelSpringPackage.GROK_DATA_FORMAT__ALLOW_MULTIPLE_MATCHES_PER_LINE:
				setAllowMultipleMatchesPerLine(ALLOW_MULTIPLE_MATCHES_PER_LINE_EDEFAULT);
				return;
			case CamelSpringPackage.GROK_DATA_FORMAT__FLATTENED:
				setFlattened(FLATTENED_EDEFAULT);
				return;
			case CamelSpringPackage.GROK_DATA_FORMAT__NAMED_ONLY:
				setNamedOnly(NAMED_ONLY_EDEFAULT);
				return;
			case CamelSpringPackage.GROK_DATA_FORMAT__PATTERN:
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
			case CamelSpringPackage.GROK_DATA_FORMAT__ALLOW_MULTIPLE_MATCHES_PER_LINE:
				return ALLOW_MULTIPLE_MATCHES_PER_LINE_EDEFAULT == null ? allowMultipleMatchesPerLine != null : !ALLOW_MULTIPLE_MATCHES_PER_LINE_EDEFAULT.equals(allowMultipleMatchesPerLine);
			case CamelSpringPackage.GROK_DATA_FORMAT__FLATTENED:
				return FLATTENED_EDEFAULT == null ? flattened != null : !FLATTENED_EDEFAULT.equals(flattened);
			case CamelSpringPackage.GROK_DATA_FORMAT__NAMED_ONLY:
				return NAMED_ONLY_EDEFAULT == null ? namedOnly != null : !NAMED_ONLY_EDEFAULT.equals(namedOnly);
			case CamelSpringPackage.GROK_DATA_FORMAT__PATTERN:
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
		result.append(" (allowMultipleMatchesPerLine: ");
		result.append(allowMultipleMatchesPerLine);
		result.append(", flattened: ");
		result.append(flattened);
		result.append(", namedOnly: ");
		result.append(namedOnly);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(')');
		return result.toString();
	}

} //GrokDataFormatImpl

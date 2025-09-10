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
import org.eclipse.fennec.camel.camelspring.ToDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDefinitionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDefinitionImpl#getVariableReceive <em>Variable Receive</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ToDefinitionImpl#getVariableSend <em>Variable Send</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToDefinitionImpl extends SendDefinitionImpl implements ToDefinition {
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
	 * The default value of the '{@link #getVariableReceive() <em>Variable Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableReceive()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_RECEIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableReceive() <em>Variable Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableReceive()
	 * @generated
	 * @ordered
	 */
	protected String variableReceive = VARIABLE_RECEIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableSend() <em>Variable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSend()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_SEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableSend() <em>Variable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSend()
	 * @generated
	 * @ordered
	 */
	protected String variableSend = VARIABLE_SEND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getToDefinition();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DEFINITION__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariableReceive() {
		return variableReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableReceive(String newVariableReceive) {
		String oldVariableReceive = variableReceive;
		variableReceive = newVariableReceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DEFINITION__VARIABLE_RECEIVE, oldVariableReceive, variableReceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariableSend() {
		return variableSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableSend(String newVariableSend) {
		String oldVariableSend = variableSend;
		variableSend = newVariableSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TO_DEFINITION__VARIABLE_SEND, oldVariableSend, variableSend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.TO_DEFINITION__PATTERN:
				return getPattern();
			case CamelSpringPackage.TO_DEFINITION__VARIABLE_RECEIVE:
				return getVariableReceive();
			case CamelSpringPackage.TO_DEFINITION__VARIABLE_SEND:
				return getVariableSend();
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
			case CamelSpringPackage.TO_DEFINITION__PATTERN:
				setPattern((String)newValue);
				return;
			case CamelSpringPackage.TO_DEFINITION__VARIABLE_RECEIVE:
				setVariableReceive((String)newValue);
				return;
			case CamelSpringPackage.TO_DEFINITION__VARIABLE_SEND:
				setVariableSend((String)newValue);
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
			case CamelSpringPackage.TO_DEFINITION__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case CamelSpringPackage.TO_DEFINITION__VARIABLE_RECEIVE:
				setVariableReceive(VARIABLE_RECEIVE_EDEFAULT);
				return;
			case CamelSpringPackage.TO_DEFINITION__VARIABLE_SEND:
				setVariableSend(VARIABLE_SEND_EDEFAULT);
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
			case CamelSpringPackage.TO_DEFINITION__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case CamelSpringPackage.TO_DEFINITION__VARIABLE_RECEIVE:
				return VARIABLE_RECEIVE_EDEFAULT == null ? variableReceive != null : !VARIABLE_RECEIVE_EDEFAULT.equals(variableReceive);
			case CamelSpringPackage.TO_DEFINITION__VARIABLE_SEND:
				return VARIABLE_SEND_EDEFAULT == null ? variableSend != null : !VARIABLE_SEND_EDEFAULT.equals(variableSend);
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
		result.append(" (pattern: ");
		result.append(pattern);
		result.append(", variableReceive: ");
		result.append(variableReceive);
		result.append(", variableSend: ");
		result.append(variableSend);
		result.append(')');
		return result.toString();
	}

} //ToDefinitionImpl

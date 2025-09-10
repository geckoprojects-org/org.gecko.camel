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
import org.eclipse.fennec.camel.camelspring.InputTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.InputTypeDefinitionImpl#getUrn <em>Urn</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.InputTypeDefinitionImpl#getValidate <em>Validate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputTypeDefinitionImpl extends OptionalIdentifiedDefinitionImpl implements InputTypeDefinition {
	/**
	 * The default value of the '{@link #getUrn() <em>Urn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrn()
	 * @generated
	 * @ordered
	 */
	protected static final String URN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrn() <em>Urn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrn()
	 * @generated
	 * @ordered
	 */
	protected String urn = URN_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected String validate = VALIDATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getInputTypeDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrn() {
		return urn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrn(String newUrn) {
		String oldUrn = urn;
		urn = newUrn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.INPUT_TYPE_DEFINITION__URN, oldUrn, urn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidate(String newValidate) {
		String oldValidate = validate;
		validate = newValidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.INPUT_TYPE_DEFINITION__VALIDATE, oldValidate, validate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.INPUT_TYPE_DEFINITION__URN:
				return getUrn();
			case CamelSpringPackage.INPUT_TYPE_DEFINITION__VALIDATE:
				return getValidate();
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
			case CamelSpringPackage.INPUT_TYPE_DEFINITION__URN:
				setUrn((String)newValue);
				return;
			case CamelSpringPackage.INPUT_TYPE_DEFINITION__VALIDATE:
				setValidate((String)newValue);
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
			case CamelSpringPackage.INPUT_TYPE_DEFINITION__URN:
				setUrn(URN_EDEFAULT);
				return;
			case CamelSpringPackage.INPUT_TYPE_DEFINITION__VALIDATE:
				setValidate(VALIDATE_EDEFAULT);
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
			case CamelSpringPackage.INPUT_TYPE_DEFINITION__URN:
				return URN_EDEFAULT == null ? urn != null : !URN_EDEFAULT.equals(urn);
			case CamelSpringPackage.INPUT_TYPE_DEFINITION__VALIDATE:
				return VALIDATE_EDEFAULT == null ? validate != null : !VALIDATE_EDEFAULT.equals(validate);
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
		result.append(" (urn: ");
		result.append(urn);
		result.append(", validate: ");
		result.append(validate);
		result.append(')');
		return result.toString();
	}

} //InputTypeDefinitionImpl

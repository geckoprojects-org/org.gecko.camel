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
import org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convert Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConvertVariableDefinitionImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConvertVariableDefinitionImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConvertVariableDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConvertVariableDefinitionImpl#getToName <em>To Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ConvertVariableDefinitionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConvertVariableDefinitionImpl extends NoOutputDefinitionImpl implements ConvertVariableDefinition {
	/**
	 * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected String charset = CHARSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final String MANDATORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected String mandatory = MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getToName() <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToName()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToName() <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToName()
	 * @generated
	 * @ordered
	 */
	protected String toName = TO_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConvertVariableDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getConvertVariableDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharset() {
		return charset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharset(String newCharset) {
		String oldCharset = charset;
		charset = newCharset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__CHARSET, oldCharset, charset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatory(String newMandatory) {
		String oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToName() {
		return toName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToName(String newToName) {
		String oldToName = toName;
		toName = newToName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__TO_NAME, oldToName, toName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__CHARSET:
				return getCharset();
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__MANDATORY:
				return getMandatory();
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__NAME:
				return getName();
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__TO_NAME:
				return getToName();
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__TYPE:
				return getType();
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
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__CHARSET:
				setCharset((String)newValue);
				return;
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__MANDATORY:
				setMandatory((String)newValue);
				return;
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__TO_NAME:
				setToName((String)newValue);
				return;
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__TYPE:
				setType((String)newValue);
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
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__CHARSET:
				setCharset(CHARSET_EDEFAULT);
				return;
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__TO_NAME:
				setToName(TO_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__CHARSET:
				return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__MANDATORY:
				return MANDATORY_EDEFAULT == null ? mandatory != null : !MANDATORY_EDEFAULT.equals(mandatory);
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__TO_NAME:
				return TO_NAME_EDEFAULT == null ? toName != null : !TO_NAME_EDEFAULT.equals(toName);
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (charset: ");
		result.append(charset);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", name: ");
		result.append(name);
		result.append(", toName: ");
		result.append(toName);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ConvertVariableDefinitionImpl

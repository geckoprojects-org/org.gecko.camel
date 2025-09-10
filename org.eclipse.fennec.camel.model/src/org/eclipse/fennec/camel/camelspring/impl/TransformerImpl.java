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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.Transformer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransformerImpl#getFromType <em>From Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransformerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransformerImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransformerImpl#getToType <em>To Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransformerImpl extends MinimalEObjectImpl.Container implements Transformer {
	/**
	 * The default value of the '{@link #getFromType() <em>From Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromType()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromType() <em>From Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromType()
	 * @generated
	 * @ordered
	 */
	protected String fromType = FROM_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getToType() <em>To Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToType()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToType() <em>To Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToType()
	 * @generated
	 * @ordered
	 */
	protected String toType = TO_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getTransformer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromType() {
		return fromType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromType(String newFromType) {
		String oldFromType = fromType;
		fromType = newFromType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TRANSFORMER__FROM_TYPE, oldFromType, fromType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TRANSFORMER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TRANSFORMER__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToType() {
		return toType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToType(String newToType) {
		String oldToType = toType;
		toType = newToType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TRANSFORMER__TO_TYPE, oldToType, toType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.TRANSFORMER__FROM_TYPE:
				return getFromType();
			case CamelSpringPackage.TRANSFORMER__NAME:
				return getName();
			case CamelSpringPackage.TRANSFORMER__SCHEME:
				return getScheme();
			case CamelSpringPackage.TRANSFORMER__TO_TYPE:
				return getToType();
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
			case CamelSpringPackage.TRANSFORMER__FROM_TYPE:
				setFromType((String)newValue);
				return;
			case CamelSpringPackage.TRANSFORMER__NAME:
				setName((String)newValue);
				return;
			case CamelSpringPackage.TRANSFORMER__SCHEME:
				setScheme((String)newValue);
				return;
			case CamelSpringPackage.TRANSFORMER__TO_TYPE:
				setToType((String)newValue);
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
			case CamelSpringPackage.TRANSFORMER__FROM_TYPE:
				setFromType(FROM_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.TRANSFORMER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CamelSpringPackage.TRANSFORMER__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case CamelSpringPackage.TRANSFORMER__TO_TYPE:
				setToType(TO_TYPE_EDEFAULT);
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
			case CamelSpringPackage.TRANSFORMER__FROM_TYPE:
				return FROM_TYPE_EDEFAULT == null ? fromType != null : !FROM_TYPE_EDEFAULT.equals(fromType);
			case CamelSpringPackage.TRANSFORMER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CamelSpringPackage.TRANSFORMER__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
			case CamelSpringPackage.TRANSFORMER__TO_TYPE:
				return TO_TYPE_EDEFAULT == null ? toType != null : !TO_TYPE_EDEFAULT.equals(toType);
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
		result.append(" (fromType: ");
		result.append(fromType);
		result.append(", name: ");
		result.append(name);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(", toType: ");
		result.append(toType);
		result.append(')');
		return result.toString();
	}

} //TransformerImpl

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

import org.eclipse.fennec.camel.camelspring.AbstractCamelFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Camel Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.AbstractCamelFactoryBeanImpl#getCamelContextId <em>Camel Context Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCamelFactoryBeanImpl extends IdentifiedTypeImpl implements AbstractCamelFactoryBean {
	/**
	 * The default value of the '{@link #getCamelContextId() <em>Camel Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamelContextId()
	 * @generated
	 * @ordered
	 */
	protected static final String CAMEL_CONTEXT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCamelContextId() <em>Camel Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamelContextId()
	 * @generated
	 * @ordered
	 */
	protected String camelContextId = CAMEL_CONTEXT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCamelFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getAbstractCamelFactoryBean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCamelContextId() {
		return camelContextId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCamelContextId(String newCamelContextId) {
		String oldCamelContextId = camelContextId;
		camelContextId = newCamelContextId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN__CAMEL_CONTEXT_ID, oldCamelContextId, camelContextId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN__CAMEL_CONTEXT_ID:
				return getCamelContextId();
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
			case CamelSpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN__CAMEL_CONTEXT_ID:
				setCamelContextId((String)newValue);
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
			case CamelSpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN__CAMEL_CONTEXT_ID:
				setCamelContextId(CAMEL_CONTEXT_ID_EDEFAULT);
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
			case CamelSpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN__CAMEL_CONTEXT_ID:
				return CAMEL_CONTEXT_ID_EDEFAULT == null ? camelContextId != null : !CAMEL_CONTEXT_ID_EDEFAULT.equals(camelContextId);
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
		result.append(" (camelContextId: ");
		result.append(camelContextId);
		result.append(')');
		return result.toString();
	}

} //AbstractCamelFactoryBeanImpl

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
import org.eclipse.fennec.camel.camelspring.ForyDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fory Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ForyDataFormatImpl#getAllowAutoWiredFory <em>Allow Auto Wired Fory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ForyDataFormatImpl#getRequireClassRegistration <em>Require Class Registration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ForyDataFormatImpl#getThreadSafe <em>Thread Safe</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ForyDataFormatImpl#getUnmarshalType <em>Unmarshal Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForyDataFormatImpl extends DataFormatImpl implements ForyDataFormat {
	/**
	 * The default value of the '{@link #getAllowAutoWiredFory() <em>Allow Auto Wired Fory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAutoWiredFory()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_AUTO_WIRED_FORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowAutoWiredFory() <em>Allow Auto Wired Fory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAutoWiredFory()
	 * @generated
	 * @ordered
	 */
	protected String allowAutoWiredFory = ALLOW_AUTO_WIRED_FORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequireClassRegistration() <em>Require Class Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireClassRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRE_CLASS_REGISTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequireClassRegistration() <em>Require Class Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireClassRegistration()
	 * @generated
	 * @ordered
	 */
	protected String requireClassRegistration = REQUIRE_CLASS_REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadSafe() <em>Thread Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadSafe()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_SAFE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadSafe() <em>Thread Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadSafe()
	 * @generated
	 * @ordered
	 */
	protected String threadSafe = THREAD_SAFE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnmarshalType() <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshalType()
	 * @generated
	 * @ordered
	 */
	protected static final String UNMARSHAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnmarshalType() <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshalType()
	 * @generated
	 * @ordered
	 */
	protected String unmarshalType = UNMARSHAL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForyDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getForyDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowAutoWiredFory() {
		return allowAutoWiredFory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAutoWiredFory(String newAllowAutoWiredFory) {
		String oldAllowAutoWiredFory = allowAutoWiredFory;
		allowAutoWiredFory = newAllowAutoWiredFory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FORY_DATA_FORMAT__ALLOW_AUTO_WIRED_FORY, oldAllowAutoWiredFory, allowAutoWiredFory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequireClassRegistration() {
		return requireClassRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireClassRegistration(String newRequireClassRegistration) {
		String oldRequireClassRegistration = requireClassRegistration;
		requireClassRegistration = newRequireClassRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FORY_DATA_FORMAT__REQUIRE_CLASS_REGISTRATION, oldRequireClassRegistration, requireClassRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThreadSafe() {
		return threadSafe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadSafe(String newThreadSafe) {
		String oldThreadSafe = threadSafe;
		threadSafe = newThreadSafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FORY_DATA_FORMAT__THREAD_SAFE, oldThreadSafe, threadSafe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnmarshalType() {
		return unmarshalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnmarshalType(String newUnmarshalType) {
		String oldUnmarshalType = unmarshalType;
		unmarshalType = newUnmarshalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FORY_DATA_FORMAT__UNMARSHAL_TYPE, oldUnmarshalType, unmarshalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.FORY_DATA_FORMAT__ALLOW_AUTO_WIRED_FORY:
				return getAllowAutoWiredFory();
			case CamelSpringPackage.FORY_DATA_FORMAT__REQUIRE_CLASS_REGISTRATION:
				return getRequireClassRegistration();
			case CamelSpringPackage.FORY_DATA_FORMAT__THREAD_SAFE:
				return getThreadSafe();
			case CamelSpringPackage.FORY_DATA_FORMAT__UNMARSHAL_TYPE:
				return getUnmarshalType();
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
			case CamelSpringPackage.FORY_DATA_FORMAT__ALLOW_AUTO_WIRED_FORY:
				setAllowAutoWiredFory((String)newValue);
				return;
			case CamelSpringPackage.FORY_DATA_FORMAT__REQUIRE_CLASS_REGISTRATION:
				setRequireClassRegistration((String)newValue);
				return;
			case CamelSpringPackage.FORY_DATA_FORMAT__THREAD_SAFE:
				setThreadSafe((String)newValue);
				return;
			case CamelSpringPackage.FORY_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType((String)newValue);
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
			case CamelSpringPackage.FORY_DATA_FORMAT__ALLOW_AUTO_WIRED_FORY:
				setAllowAutoWiredFory(ALLOW_AUTO_WIRED_FORY_EDEFAULT);
				return;
			case CamelSpringPackage.FORY_DATA_FORMAT__REQUIRE_CLASS_REGISTRATION:
				setRequireClassRegistration(REQUIRE_CLASS_REGISTRATION_EDEFAULT);
				return;
			case CamelSpringPackage.FORY_DATA_FORMAT__THREAD_SAFE:
				setThreadSafe(THREAD_SAFE_EDEFAULT);
				return;
			case CamelSpringPackage.FORY_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType(UNMARSHAL_TYPE_EDEFAULT);
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
			case CamelSpringPackage.FORY_DATA_FORMAT__ALLOW_AUTO_WIRED_FORY:
				return ALLOW_AUTO_WIRED_FORY_EDEFAULT == null ? allowAutoWiredFory != null : !ALLOW_AUTO_WIRED_FORY_EDEFAULT.equals(allowAutoWiredFory);
			case CamelSpringPackage.FORY_DATA_FORMAT__REQUIRE_CLASS_REGISTRATION:
				return REQUIRE_CLASS_REGISTRATION_EDEFAULT == null ? requireClassRegistration != null : !REQUIRE_CLASS_REGISTRATION_EDEFAULT.equals(requireClassRegistration);
			case CamelSpringPackage.FORY_DATA_FORMAT__THREAD_SAFE:
				return THREAD_SAFE_EDEFAULT == null ? threadSafe != null : !THREAD_SAFE_EDEFAULT.equals(threadSafe);
			case CamelSpringPackage.FORY_DATA_FORMAT__UNMARSHAL_TYPE:
				return UNMARSHAL_TYPE_EDEFAULT == null ? unmarshalType != null : !UNMARSHAL_TYPE_EDEFAULT.equals(unmarshalType);
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
		result.append(" (allowAutoWiredFory: ");
		result.append(allowAutoWiredFory);
		result.append(", requireClassRegistration: ");
		result.append(requireClassRegistration);
		result.append(", threadSafe: ");
		result.append(threadSafe);
		result.append(", unmarshalType: ");
		result.append(unmarshalType);
		result.append(')');
		return result.toString();
	}

} //ForyDataFormatImpl

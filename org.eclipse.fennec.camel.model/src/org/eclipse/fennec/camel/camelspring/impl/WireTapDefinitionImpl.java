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
import org.eclipse.fennec.camel.camelspring.WireTapDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Tap Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.WireTapDefinitionImpl#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.WireTapDefinitionImpl#getDynamicUri <em>Dynamic Uri</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.WireTapDefinitionImpl#getExecutorService <em>Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.WireTapDefinitionImpl#getOnPrepare <em>On Prepare</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WireTapDefinitionImpl extends ToDynamicDefinitionImpl implements WireTapDefinition {
	/**
	 * The default value of the '{@link #getCopy() <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopy()
	 * @generated
	 * @ordered
	 */
	protected static final String COPY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopy() <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopy()
	 * @generated
	 * @ordered
	 */
	protected String copy = COPY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamicUri() <em>Dynamic Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicUri()
	 * @generated
	 * @ordered
	 */
	protected static final String DYNAMIC_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicUri() <em>Dynamic Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicUri()
	 * @generated
	 * @ordered
	 */
	protected String dynamicUri = DYNAMIC_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutorService() <em>Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorService()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTOR_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutorService() <em>Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorService()
	 * @generated
	 * @ordered
	 */
	protected String executorService = EXECUTOR_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnPrepare() <em>On Prepare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPrepare()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PREPARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPrepare() <em>On Prepare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPrepare()
	 * @generated
	 * @ordered
	 */
	protected String onPrepare = ON_PREPARE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireTapDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getWireTapDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCopy() {
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopy(String newCopy) {
		String oldCopy = copy;
		copy = newCopy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.WIRE_TAP_DEFINITION__COPY, oldCopy, copy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDynamicUri() {
		return dynamicUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamicUri(String newDynamicUri) {
		String oldDynamicUri = dynamicUri;
		dynamicUri = newDynamicUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.WIRE_TAP_DEFINITION__DYNAMIC_URI, oldDynamicUri, dynamicUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExecutorService() {
		return executorService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutorService(String newExecutorService) {
		String oldExecutorService = executorService;
		executorService = newExecutorService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.WIRE_TAP_DEFINITION__EXECUTOR_SERVICE, oldExecutorService, executorService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnPrepare() {
		return onPrepare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnPrepare(String newOnPrepare) {
		String oldOnPrepare = onPrepare;
		onPrepare = newOnPrepare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.WIRE_TAP_DEFINITION__ON_PREPARE, oldOnPrepare, onPrepare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.WIRE_TAP_DEFINITION__COPY:
				return getCopy();
			case CamelSpringPackage.WIRE_TAP_DEFINITION__DYNAMIC_URI:
				return getDynamicUri();
			case CamelSpringPackage.WIRE_TAP_DEFINITION__EXECUTOR_SERVICE:
				return getExecutorService();
			case CamelSpringPackage.WIRE_TAP_DEFINITION__ON_PREPARE:
				return getOnPrepare();
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
			case CamelSpringPackage.WIRE_TAP_DEFINITION__COPY:
				setCopy((String)newValue);
				return;
			case CamelSpringPackage.WIRE_TAP_DEFINITION__DYNAMIC_URI:
				setDynamicUri((String)newValue);
				return;
			case CamelSpringPackage.WIRE_TAP_DEFINITION__EXECUTOR_SERVICE:
				setExecutorService((String)newValue);
				return;
			case CamelSpringPackage.WIRE_TAP_DEFINITION__ON_PREPARE:
				setOnPrepare((String)newValue);
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
			case CamelSpringPackage.WIRE_TAP_DEFINITION__COPY:
				setCopy(COPY_EDEFAULT);
				return;
			case CamelSpringPackage.WIRE_TAP_DEFINITION__DYNAMIC_URI:
				setDynamicUri(DYNAMIC_URI_EDEFAULT);
				return;
			case CamelSpringPackage.WIRE_TAP_DEFINITION__EXECUTOR_SERVICE:
				setExecutorService(EXECUTOR_SERVICE_EDEFAULT);
				return;
			case CamelSpringPackage.WIRE_TAP_DEFINITION__ON_PREPARE:
				setOnPrepare(ON_PREPARE_EDEFAULT);
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
			case CamelSpringPackage.WIRE_TAP_DEFINITION__COPY:
				return COPY_EDEFAULT == null ? copy != null : !COPY_EDEFAULT.equals(copy);
			case CamelSpringPackage.WIRE_TAP_DEFINITION__DYNAMIC_URI:
				return DYNAMIC_URI_EDEFAULT == null ? dynamicUri != null : !DYNAMIC_URI_EDEFAULT.equals(dynamicUri);
			case CamelSpringPackage.WIRE_TAP_DEFINITION__EXECUTOR_SERVICE:
				return EXECUTOR_SERVICE_EDEFAULT == null ? executorService != null : !EXECUTOR_SERVICE_EDEFAULT.equals(executorService);
			case CamelSpringPackage.WIRE_TAP_DEFINITION__ON_PREPARE:
				return ON_PREPARE_EDEFAULT == null ? onPrepare != null : !ON_PREPARE_EDEFAULT.equals(onPrepare);
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
		result.append(" (copy: ");
		result.append(copy);
		result.append(", dynamicUri: ");
		result.append(dynamicUri);
		result.append(", executorService: ");
		result.append(executorService);
		result.append(", onPrepare: ");
		result.append(onPrepare);
		result.append(')');
		return result.toString();
	}

} //WireTapDefinitionImpl

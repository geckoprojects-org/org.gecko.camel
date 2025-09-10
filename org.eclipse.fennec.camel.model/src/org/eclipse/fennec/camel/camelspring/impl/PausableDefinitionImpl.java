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
import org.eclipse.fennec.camel.camelspring.PausableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pausable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PausableDefinitionImpl#getConsumerListener <em>Consumer Listener</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.PausableDefinitionImpl#getUntilCheck <em>Until Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PausableDefinitionImpl extends NoOutputDefinitionImpl implements PausableDefinition {
	/**
	 * The default value of the '{@link #getConsumerListener() <em>Consumer Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerListener()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_LISTENER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerListener() <em>Consumer Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerListener()
	 * @generated
	 * @ordered
	 */
	protected String consumerListener = CONSUMER_LISTENER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUntilCheck() <em>Until Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilCheck()
	 * @generated
	 * @ordered
	 */
	protected static final String UNTIL_CHECK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUntilCheck() <em>Until Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilCheck()
	 * @generated
	 * @ordered
	 */
	protected String untilCheck = UNTIL_CHECK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PausableDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getPausableDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsumerListener() {
		return consumerListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumerListener(String newConsumerListener) {
		String oldConsumerListener = consumerListener;
		consumerListener = newConsumerListener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PAUSABLE_DEFINITION__CONSUMER_LISTENER, oldConsumerListener, consumerListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUntilCheck() {
		return untilCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUntilCheck(String newUntilCheck) {
		String oldUntilCheck = untilCheck;
		untilCheck = newUntilCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PAUSABLE_DEFINITION__UNTIL_CHECK, oldUntilCheck, untilCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.PAUSABLE_DEFINITION__CONSUMER_LISTENER:
				return getConsumerListener();
			case CamelSpringPackage.PAUSABLE_DEFINITION__UNTIL_CHECK:
				return getUntilCheck();
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
			case CamelSpringPackage.PAUSABLE_DEFINITION__CONSUMER_LISTENER:
				setConsumerListener((String)newValue);
				return;
			case CamelSpringPackage.PAUSABLE_DEFINITION__UNTIL_CHECK:
				setUntilCheck((String)newValue);
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
			case CamelSpringPackage.PAUSABLE_DEFINITION__CONSUMER_LISTENER:
				setConsumerListener(CONSUMER_LISTENER_EDEFAULT);
				return;
			case CamelSpringPackage.PAUSABLE_DEFINITION__UNTIL_CHECK:
				setUntilCheck(UNTIL_CHECK_EDEFAULT);
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
			case CamelSpringPackage.PAUSABLE_DEFINITION__CONSUMER_LISTENER:
				return CONSUMER_LISTENER_EDEFAULT == null ? consumerListener != null : !CONSUMER_LISTENER_EDEFAULT.equals(consumerListener);
			case CamelSpringPackage.PAUSABLE_DEFINITION__UNTIL_CHECK:
				return UNTIL_CHECK_EDEFAULT == null ? untilCheck != null : !UNTIL_CHECK_EDEFAULT.equals(untilCheck);
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
		result.append(" (consumerListener: ");
		result.append(consumerListener);
		result.append(", untilCheck: ");
		result.append(untilCheck);
		result.append(')');
		return result.toString();
	}

} //PausableDefinitionImpl

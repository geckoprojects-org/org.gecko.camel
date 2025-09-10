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
import org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimistic Lock Retry Policy Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OptimisticLockRetryPolicyDefinitionImpl#getExponentialBackOff <em>Exponential Back Off</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OptimisticLockRetryPolicyDefinitionImpl#getMaximumRetries <em>Maximum Retries</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OptimisticLockRetryPolicyDefinitionImpl#getMaximumRetryDelay <em>Maximum Retry Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OptimisticLockRetryPolicyDefinitionImpl#getRandomBackOff <em>Random Back Off</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OptimisticLockRetryPolicyDefinitionImpl#getRetryDelay <em>Retry Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimisticLockRetryPolicyDefinitionImpl extends MinimalEObjectImpl.Container implements OptimisticLockRetryPolicyDefinition {
	/**
	 * The default value of the '{@link #getExponentialBackOff() <em>Exponential Back Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponentialBackOff()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPONENTIAL_BACK_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExponentialBackOff() <em>Exponential Back Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponentialBackOff()
	 * @generated
	 * @ordered
	 */
	protected String exponentialBackOff = EXPONENTIAL_BACK_OFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRetries() <em>Maximum Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRetries()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumRetries() <em>Maximum Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRetries()
	 * @generated
	 * @ordered
	 */
	protected String maximumRetries = MAXIMUM_RETRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRetryDelay() <em>Maximum Retry Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRetryDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_RETRY_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumRetryDelay() <em>Maximum Retry Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRetryDelay()
	 * @generated
	 * @ordered
	 */
	protected String maximumRetryDelay = MAXIMUM_RETRY_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRandomBackOff() <em>Random Back Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomBackOff()
	 * @generated
	 * @ordered
	 */
	protected static final String RANDOM_BACK_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRandomBackOff() <em>Random Back Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomBackOff()
	 * @generated
	 * @ordered
	 */
	protected String randomBackOff = RANDOM_BACK_OFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryDelay() <em>Retry Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRY_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetryDelay() <em>Retry Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryDelay()
	 * @generated
	 * @ordered
	 */
	protected String retryDelay = RETRY_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimisticLockRetryPolicyDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getOptimisticLockRetryPolicyDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExponentialBackOff() {
		return exponentialBackOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExponentialBackOff(String newExponentialBackOff) {
		String oldExponentialBackOff = exponentialBackOff;
		exponentialBackOff = newExponentialBackOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__EXPONENTIAL_BACK_OFF, oldExponentialBackOff, exponentialBackOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaximumRetries() {
		return maximumRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumRetries(String newMaximumRetries) {
		String oldMaximumRetries = maximumRetries;
		maximumRetries = newMaximumRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__MAXIMUM_RETRIES, oldMaximumRetries, maximumRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaximumRetryDelay() {
		return maximumRetryDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumRetryDelay(String newMaximumRetryDelay) {
		String oldMaximumRetryDelay = maximumRetryDelay;
		maximumRetryDelay = newMaximumRetryDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__MAXIMUM_RETRY_DELAY, oldMaximumRetryDelay, maximumRetryDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRandomBackOff() {
		return randomBackOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRandomBackOff(String newRandomBackOff) {
		String oldRandomBackOff = randomBackOff;
		randomBackOff = newRandomBackOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__RANDOM_BACK_OFF, oldRandomBackOff, randomBackOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRetryDelay() {
		return retryDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryDelay(String newRetryDelay) {
		String oldRetryDelay = retryDelay;
		retryDelay = newRetryDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__RETRY_DELAY, oldRetryDelay, retryDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__EXPONENTIAL_BACK_OFF:
				return getExponentialBackOff();
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__MAXIMUM_RETRIES:
				return getMaximumRetries();
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__MAXIMUM_RETRY_DELAY:
				return getMaximumRetryDelay();
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__RANDOM_BACK_OFF:
				return getRandomBackOff();
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__RETRY_DELAY:
				return getRetryDelay();
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
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__EXPONENTIAL_BACK_OFF:
				setExponentialBackOff((String)newValue);
				return;
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__MAXIMUM_RETRIES:
				setMaximumRetries((String)newValue);
				return;
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__MAXIMUM_RETRY_DELAY:
				setMaximumRetryDelay((String)newValue);
				return;
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__RANDOM_BACK_OFF:
				setRandomBackOff((String)newValue);
				return;
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__RETRY_DELAY:
				setRetryDelay((String)newValue);
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
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__EXPONENTIAL_BACK_OFF:
				setExponentialBackOff(EXPONENTIAL_BACK_OFF_EDEFAULT);
				return;
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__MAXIMUM_RETRIES:
				setMaximumRetries(MAXIMUM_RETRIES_EDEFAULT);
				return;
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__MAXIMUM_RETRY_DELAY:
				setMaximumRetryDelay(MAXIMUM_RETRY_DELAY_EDEFAULT);
				return;
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__RANDOM_BACK_OFF:
				setRandomBackOff(RANDOM_BACK_OFF_EDEFAULT);
				return;
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__RETRY_DELAY:
				setRetryDelay(RETRY_DELAY_EDEFAULT);
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
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__EXPONENTIAL_BACK_OFF:
				return EXPONENTIAL_BACK_OFF_EDEFAULT == null ? exponentialBackOff != null : !EXPONENTIAL_BACK_OFF_EDEFAULT.equals(exponentialBackOff);
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__MAXIMUM_RETRIES:
				return MAXIMUM_RETRIES_EDEFAULT == null ? maximumRetries != null : !MAXIMUM_RETRIES_EDEFAULT.equals(maximumRetries);
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__MAXIMUM_RETRY_DELAY:
				return MAXIMUM_RETRY_DELAY_EDEFAULT == null ? maximumRetryDelay != null : !MAXIMUM_RETRY_DELAY_EDEFAULT.equals(maximumRetryDelay);
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__RANDOM_BACK_OFF:
				return RANDOM_BACK_OFF_EDEFAULT == null ? randomBackOff != null : !RANDOM_BACK_OFF_EDEFAULT.equals(randomBackOff);
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION__RETRY_DELAY:
				return RETRY_DELAY_EDEFAULT == null ? retryDelay != null : !RETRY_DELAY_EDEFAULT.equals(retryDelay);
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
		result.append(" (exponentialBackOff: ");
		result.append(exponentialBackOff);
		result.append(", maximumRetries: ");
		result.append(maximumRetries);
		result.append(", maximumRetryDelay: ");
		result.append(maximumRetryDelay);
		result.append(", randomBackOff: ");
		result.append(randomBackOff);
		result.append(", retryDelay: ");
		result.append(retryDelay);
		result.append(')');
		return result.toString();
	}

} //OptimisticLockRetryPolicyDefinitionImpl

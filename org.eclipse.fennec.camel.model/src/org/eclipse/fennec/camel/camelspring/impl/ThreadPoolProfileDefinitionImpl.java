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
import org.eclipse.fennec.camel.camelspring.ThreadPoolProfileDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread Pool Profile Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadPoolProfileDefinitionImpl#getAllowCoreThreadTimeOut <em>Allow Core Thread Time Out</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadPoolProfileDefinitionImpl#getDefaultProfile <em>Default Profile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadPoolProfileDefinitionImpl#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadPoolProfileDefinitionImpl#getMaxPoolSize <em>Max Pool Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadPoolProfileDefinitionImpl#getMaxQueueSize <em>Max Queue Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadPoolProfileDefinitionImpl#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadPoolProfileDefinitionImpl#getRejectedPolicy <em>Rejected Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadPoolProfileDefinitionImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadPoolProfileDefinitionImpl extends OptionalIdentifiedDefinitionImpl implements ThreadPoolProfileDefinition {
	/**
	 * The default value of the '{@link #getAllowCoreThreadTimeOut() <em>Allow Core Thread Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowCoreThreadTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_CORE_THREAD_TIME_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowCoreThreadTimeOut() <em>Allow Core Thread Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowCoreThreadTimeOut()
	 * @generated
	 * @ordered
	 */
	protected String allowCoreThreadTimeOut = ALLOW_CORE_THREAD_TIME_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultProfile() <em>Default Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_PROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultProfile() <em>Default Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultProfile()
	 * @generated
	 * @ordered
	 */
	protected String defaultProfile = DEFAULT_PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeepAliveTime() <em>Keep Alive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAliveTime()
	 * @generated
	 * @ordered
	 */
	protected static final String KEEP_ALIVE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeepAliveTime() <em>Keep Alive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAliveTime()
	 * @generated
	 * @ordered
	 */
	protected String keepAliveTime = KEEP_ALIVE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPoolSize() <em>Max Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPoolSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_POOL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPoolSize() <em>Max Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPoolSize()
	 * @generated
	 * @ordered
	 */
	protected String maxPoolSize = MAX_POOL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxQueueSize() <em>Max Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_QUEUE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxQueueSize() <em>Max Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQueueSize()
	 * @generated
	 * @ordered
	 */
	protected String maxQueueSize = MAX_QUEUE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSize()
	 * @generated
	 * @ordered
	 */
	protected static final String POOL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSize()
	 * @generated
	 * @ordered
	 */
	protected String poolSize = POOL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRejectedPolicy() <em>Rejected Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String REJECTED_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRejectedPolicy() <em>Rejected Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedPolicy()
	 * @generated
	 * @ordered
	 */
	protected String rejectedPolicy = REJECTED_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected String timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadPoolProfileDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getThreadPoolProfileDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowCoreThreadTimeOut() {
		return allowCoreThreadTimeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowCoreThreadTimeOut(String newAllowCoreThreadTimeOut) {
		String oldAllowCoreThreadTimeOut = allowCoreThreadTimeOut;
		allowCoreThreadTimeOut = newAllowCoreThreadTimeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__ALLOW_CORE_THREAD_TIME_OUT, oldAllowCoreThreadTimeOut, allowCoreThreadTimeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultProfile() {
		return defaultProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultProfile(String newDefaultProfile) {
		String oldDefaultProfile = defaultProfile;
		defaultProfile = newDefaultProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE, oldDefaultProfile, defaultProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeepAliveTime() {
		return keepAliveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeepAliveTime(String newKeepAliveTime) {
		String oldKeepAliveTime = keepAliveTime;
		keepAliveTime = newKeepAliveTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME, oldKeepAliveTime, keepAliveTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxPoolSize() {
		return maxPoolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPoolSize(String newMaxPoolSize) {
		String oldMaxPoolSize = maxPoolSize;
		maxPoolSize = newMaxPoolSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE, oldMaxPoolSize, maxPoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxQueueSize() {
		return maxQueueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxQueueSize(String newMaxQueueSize) {
		String oldMaxQueueSize = maxQueueSize;
		maxQueueSize = newMaxQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE, oldMaxQueueSize, maxQueueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPoolSize() {
		return poolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolSize(String newPoolSize) {
		String oldPoolSize = poolSize;
		poolSize = newPoolSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE, oldPoolSize, poolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRejectedPolicy() {
		return rejectedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRejectedPolicy(String newRejectedPolicy) {
		String oldRejectedPolicy = rejectedPolicy;
		rejectedPolicy = newRejectedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY, oldRejectedPolicy, rejectedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeUnit(String newTimeUnit) {
		String oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__ALLOW_CORE_THREAD_TIME_OUT:
				return getAllowCoreThreadTimeOut();
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE:
				return getDefaultProfile();
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME:
				return getKeepAliveTime();
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE:
				return getMaxPoolSize();
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE:
				return getMaxQueueSize();
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE:
				return getPoolSize();
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY:
				return getRejectedPolicy();
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT:
				return getTimeUnit();
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
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__ALLOW_CORE_THREAD_TIME_OUT:
				setAllowCoreThreadTimeOut((String)newValue);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE:
				setDefaultProfile((String)newValue);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME:
				setKeepAliveTime((String)newValue);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE:
				setMaxPoolSize((String)newValue);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE:
				setMaxQueueSize((String)newValue);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE:
				setPoolSize((String)newValue);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY:
				setRejectedPolicy((String)newValue);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT:
				setTimeUnit((String)newValue);
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
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__ALLOW_CORE_THREAD_TIME_OUT:
				setAllowCoreThreadTimeOut(ALLOW_CORE_THREAD_TIME_OUT_EDEFAULT);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE:
				setDefaultProfile(DEFAULT_PROFILE_EDEFAULT);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME:
				setKeepAliveTime(KEEP_ALIVE_TIME_EDEFAULT);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE:
				setMaxPoolSize(MAX_POOL_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE:
				setMaxQueueSize(MAX_QUEUE_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE:
				setPoolSize(POOL_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY:
				setRejectedPolicy(REJECTED_POLICY_EDEFAULT);
				return;
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
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
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__ALLOW_CORE_THREAD_TIME_OUT:
				return ALLOW_CORE_THREAD_TIME_OUT_EDEFAULT == null ? allowCoreThreadTimeOut != null : !ALLOW_CORE_THREAD_TIME_OUT_EDEFAULT.equals(allowCoreThreadTimeOut);
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__DEFAULT_PROFILE:
				return DEFAULT_PROFILE_EDEFAULT == null ? defaultProfile != null : !DEFAULT_PROFILE_EDEFAULT.equals(defaultProfile);
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__KEEP_ALIVE_TIME:
				return KEEP_ALIVE_TIME_EDEFAULT == null ? keepAliveTime != null : !KEEP_ALIVE_TIME_EDEFAULT.equals(keepAliveTime);
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_POOL_SIZE:
				return MAX_POOL_SIZE_EDEFAULT == null ? maxPoolSize != null : !MAX_POOL_SIZE_EDEFAULT.equals(maxPoolSize);
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__MAX_QUEUE_SIZE:
				return MAX_QUEUE_SIZE_EDEFAULT == null ? maxQueueSize != null : !MAX_QUEUE_SIZE_EDEFAULT.equals(maxQueueSize);
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__POOL_SIZE:
				return POOL_SIZE_EDEFAULT == null ? poolSize != null : !POOL_SIZE_EDEFAULT.equals(poolSize);
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__REJECTED_POLICY:
				return REJECTED_POLICY_EDEFAULT == null ? rejectedPolicy != null : !REJECTED_POLICY_EDEFAULT.equals(rejectedPolicy);
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION__TIME_UNIT:
				return TIME_UNIT_EDEFAULT == null ? timeUnit != null : !TIME_UNIT_EDEFAULT.equals(timeUnit);
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
		result.append(" (allowCoreThreadTimeOut: ");
		result.append(allowCoreThreadTimeOut);
		result.append(", defaultProfile: ");
		result.append(defaultProfile);
		result.append(", keepAliveTime: ");
		result.append(keepAliveTime);
		result.append(", maxPoolSize: ");
		result.append(maxPoolSize);
		result.append(", maxQueueSize: ");
		result.append(maxQueueSize);
		result.append(", poolSize: ");
		result.append(poolSize);
		result.append(", rejectedPolicy: ");
		result.append(rejectedPolicy);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(')');
		return result.toString();
	}

} //ThreadPoolProfileDefinitionImpl

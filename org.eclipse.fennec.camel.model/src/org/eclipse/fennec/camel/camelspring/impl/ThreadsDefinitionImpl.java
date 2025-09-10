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
import org.eclipse.fennec.camel.camelspring.ThreadsDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threads Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadsDefinitionImpl#getAllowCoreThreadTimeOut <em>Allow Core Thread Time Out</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadsDefinitionImpl#getCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadsDefinitionImpl#getExecutorService <em>Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadsDefinitionImpl#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadsDefinitionImpl#getMaxPoolSize <em>Max Pool Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadsDefinitionImpl#getMaxQueueSize <em>Max Queue Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadsDefinitionImpl#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadsDefinitionImpl#getRejectedPolicy <em>Rejected Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadsDefinitionImpl#getThreadName <em>Thread Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThreadsDefinitionImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadsDefinitionImpl extends NoOutputDefinitionImpl implements ThreadsDefinition {
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
	 * The default value of the '{@link #getCallerRunsWhenRejected() <em>Caller Runs When Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerRunsWhenRejected()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLER_RUNS_WHEN_REJECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallerRunsWhenRejected() <em>Caller Runs When Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerRunsWhenRejected()
	 * @generated
	 * @ordered
	 */
	protected String callerRunsWhenRejected = CALLER_RUNS_WHEN_REJECTED_EDEFAULT;

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
	 * The default value of the '{@link #getThreadName() <em>Thread Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadName()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadName() <em>Thread Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadName()
	 * @generated
	 * @ordered
	 */
	protected String threadName = THREAD_NAME_EDEFAULT;

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
	protected ThreadsDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getThreadsDefinition();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREADS_DEFINITION__ALLOW_CORE_THREAD_TIME_OUT, oldAllowCoreThreadTimeOut, allowCoreThreadTimeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCallerRunsWhenRejected() {
		return callerRunsWhenRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallerRunsWhenRejected(String newCallerRunsWhenRejected) {
		String oldCallerRunsWhenRejected = callerRunsWhenRejected;
		callerRunsWhenRejected = newCallerRunsWhenRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED, oldCallerRunsWhenRejected, callerRunsWhenRejected));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREADS_DEFINITION__EXECUTOR_SERVICE, oldExecutorService, executorService));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME, oldKeepAliveTime, keepAliveTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE, oldMaxPoolSize, maxPoolSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE, oldMaxQueueSize, maxQueueSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREADS_DEFINITION__POOL_SIZE, oldPoolSize, poolSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREADS_DEFINITION__REJECTED_POLICY, oldRejectedPolicy, rejectedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThreadName() {
		return threadName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadName(String newThreadName) {
		String oldThreadName = threadName;
		threadName = newThreadName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREADS_DEFINITION__THREAD_NAME, oldThreadName, threadName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THREADS_DEFINITION__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.THREADS_DEFINITION__ALLOW_CORE_THREAD_TIME_OUT:
				return getAllowCoreThreadTimeOut();
			case CamelSpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
				return getCallerRunsWhenRejected();
			case CamelSpringPackage.THREADS_DEFINITION__EXECUTOR_SERVICE:
				return getExecutorService();
			case CamelSpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME:
				return getKeepAliveTime();
			case CamelSpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE:
				return getMaxPoolSize();
			case CamelSpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE:
				return getMaxQueueSize();
			case CamelSpringPackage.THREADS_DEFINITION__POOL_SIZE:
				return getPoolSize();
			case CamelSpringPackage.THREADS_DEFINITION__REJECTED_POLICY:
				return getRejectedPolicy();
			case CamelSpringPackage.THREADS_DEFINITION__THREAD_NAME:
				return getThreadName();
			case CamelSpringPackage.THREADS_DEFINITION__TIME_UNIT:
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
			case CamelSpringPackage.THREADS_DEFINITION__ALLOW_CORE_THREAD_TIME_OUT:
				setAllowCoreThreadTimeOut((String)newValue);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
				setCallerRunsWhenRejected((String)newValue);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__EXECUTOR_SERVICE:
				setExecutorService((String)newValue);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME:
				setKeepAliveTime((String)newValue);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE:
				setMaxPoolSize((String)newValue);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE:
				setMaxQueueSize((String)newValue);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__POOL_SIZE:
				setPoolSize((String)newValue);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__REJECTED_POLICY:
				setRejectedPolicy((String)newValue);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__THREAD_NAME:
				setThreadName((String)newValue);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__TIME_UNIT:
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
			case CamelSpringPackage.THREADS_DEFINITION__ALLOW_CORE_THREAD_TIME_OUT:
				setAllowCoreThreadTimeOut(ALLOW_CORE_THREAD_TIME_OUT_EDEFAULT);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
				setCallerRunsWhenRejected(CALLER_RUNS_WHEN_REJECTED_EDEFAULT);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__EXECUTOR_SERVICE:
				setExecutorService(EXECUTOR_SERVICE_EDEFAULT);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME:
				setKeepAliveTime(KEEP_ALIVE_TIME_EDEFAULT);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE:
				setMaxPoolSize(MAX_POOL_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE:
				setMaxQueueSize(MAX_QUEUE_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__POOL_SIZE:
				setPoolSize(POOL_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__REJECTED_POLICY:
				setRejectedPolicy(REJECTED_POLICY_EDEFAULT);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__THREAD_NAME:
				setThreadName(THREAD_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.THREADS_DEFINITION__TIME_UNIT:
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
			case CamelSpringPackage.THREADS_DEFINITION__ALLOW_CORE_THREAD_TIME_OUT:
				return ALLOW_CORE_THREAD_TIME_OUT_EDEFAULT == null ? allowCoreThreadTimeOut != null : !ALLOW_CORE_THREAD_TIME_OUT_EDEFAULT.equals(allowCoreThreadTimeOut);
			case CamelSpringPackage.THREADS_DEFINITION__CALLER_RUNS_WHEN_REJECTED:
				return CALLER_RUNS_WHEN_REJECTED_EDEFAULT == null ? callerRunsWhenRejected != null : !CALLER_RUNS_WHEN_REJECTED_EDEFAULT.equals(callerRunsWhenRejected);
			case CamelSpringPackage.THREADS_DEFINITION__EXECUTOR_SERVICE:
				return EXECUTOR_SERVICE_EDEFAULT == null ? executorService != null : !EXECUTOR_SERVICE_EDEFAULT.equals(executorService);
			case CamelSpringPackage.THREADS_DEFINITION__KEEP_ALIVE_TIME:
				return KEEP_ALIVE_TIME_EDEFAULT == null ? keepAliveTime != null : !KEEP_ALIVE_TIME_EDEFAULT.equals(keepAliveTime);
			case CamelSpringPackage.THREADS_DEFINITION__MAX_POOL_SIZE:
				return MAX_POOL_SIZE_EDEFAULT == null ? maxPoolSize != null : !MAX_POOL_SIZE_EDEFAULT.equals(maxPoolSize);
			case CamelSpringPackage.THREADS_DEFINITION__MAX_QUEUE_SIZE:
				return MAX_QUEUE_SIZE_EDEFAULT == null ? maxQueueSize != null : !MAX_QUEUE_SIZE_EDEFAULT.equals(maxQueueSize);
			case CamelSpringPackage.THREADS_DEFINITION__POOL_SIZE:
				return POOL_SIZE_EDEFAULT == null ? poolSize != null : !POOL_SIZE_EDEFAULT.equals(poolSize);
			case CamelSpringPackage.THREADS_DEFINITION__REJECTED_POLICY:
				return REJECTED_POLICY_EDEFAULT == null ? rejectedPolicy != null : !REJECTED_POLICY_EDEFAULT.equals(rejectedPolicy);
			case CamelSpringPackage.THREADS_DEFINITION__THREAD_NAME:
				return THREAD_NAME_EDEFAULT == null ? threadName != null : !THREAD_NAME_EDEFAULT.equals(threadName);
			case CamelSpringPackage.THREADS_DEFINITION__TIME_UNIT:
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
		result.append(", callerRunsWhenRejected: ");
		result.append(callerRunsWhenRejected);
		result.append(", executorService: ");
		result.append(executorService);
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
		result.append(", threadName: ");
		result.append(threadName);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(')');
		return result.toString();
	}

} //ThreadsDefinitionImpl

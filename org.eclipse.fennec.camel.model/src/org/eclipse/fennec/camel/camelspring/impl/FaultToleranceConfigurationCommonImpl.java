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
import org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Tolerance Configuration Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getBulkheadEnabled <em>Bulkhead Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getBulkheadMaxConcurrentCalls <em>Bulkhead Max Concurrent Calls</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getBulkheadWaitingTaskQueue <em>Bulkhead Waiting Task Queue</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getFailureRatio <em>Failure Ratio</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getRequestVolumeThreshold <em>Request Volume Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getSuccessThreshold <em>Success Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getThreadOffloadExecutorService <em>Thread Offload Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getTimeoutDuration <em>Timeout Duration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getTimeoutEnabled <em>Timeout Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getTimeoutPoolSize <em>Timeout Pool Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FaultToleranceConfigurationCommonImpl#getTypedGuard <em>Typed Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultToleranceConfigurationCommonImpl extends IdentifiedTypeImpl implements FaultToleranceConfigurationCommon {
	/**
	 * The default value of the '{@link #getBulkheadEnabled() <em>Bulkhead Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkheadEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String BULKHEAD_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBulkheadEnabled() <em>Bulkhead Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkheadEnabled()
	 * @generated
	 * @ordered
	 */
	protected String bulkheadEnabled = BULKHEAD_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBulkheadMaxConcurrentCalls() <em>Bulkhead Max Concurrent Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkheadMaxConcurrentCalls()
	 * @generated
	 * @ordered
	 */
	protected static final String BULKHEAD_MAX_CONCURRENT_CALLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBulkheadMaxConcurrentCalls() <em>Bulkhead Max Concurrent Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkheadMaxConcurrentCalls()
	 * @generated
	 * @ordered
	 */
	protected String bulkheadMaxConcurrentCalls = BULKHEAD_MAX_CONCURRENT_CALLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBulkheadWaitingTaskQueue() <em>Bulkhead Waiting Task Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkheadWaitingTaskQueue()
	 * @generated
	 * @ordered
	 */
	protected static final String BULKHEAD_WAITING_TASK_QUEUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBulkheadWaitingTaskQueue() <em>Bulkhead Waiting Task Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkheadWaitingTaskQueue()
	 * @generated
	 * @ordered
	 */
	protected String bulkheadWaitingTaskQueue = BULKHEAD_WAITING_TASK_QUEUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected String delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureRatio() <em>Failure Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRatio()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureRatio() <em>Failure Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRatio()
	 * @generated
	 * @ordered
	 */
	protected String failureRatio = FAILURE_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestVolumeThreshold() <em>Request Volume Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestVolumeThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_VOLUME_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestVolumeThreshold() <em>Request Volume Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestVolumeThreshold()
	 * @generated
	 * @ordered
	 */
	protected String requestVolumeThreshold = REQUEST_VOLUME_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuccessThreshold() <em>Success Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String SUCCESS_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuccessThreshold() <em>Success Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessThreshold()
	 * @generated
	 * @ordered
	 */
	protected String successThreshold = SUCCESS_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadOffloadExecutorService() <em>Thread Offload Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadOffloadExecutorService()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_OFFLOAD_EXECUTOR_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadOffloadExecutorService() <em>Thread Offload Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadOffloadExecutorService()
	 * @generated
	 * @ordered
	 */
	protected String threadOffloadExecutorService = THREAD_OFFLOAD_EXECUTOR_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutDuration() <em>Timeout Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutDuration() <em>Timeout Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutDuration()
	 * @generated
	 * @ordered
	 */
	protected String timeoutDuration = TIMEOUT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutEnabled() <em>Timeout Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutEnabled() <em>Timeout Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutEnabled()
	 * @generated
	 * @ordered
	 */
	protected String timeoutEnabled = TIMEOUT_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutPoolSize() <em>Timeout Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutPoolSize()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_POOL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutPoolSize() <em>Timeout Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutPoolSize()
	 * @generated
	 * @ordered
	 */
	protected String timeoutPoolSize = TIMEOUT_POOL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypedGuard() <em>Typed Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPED_GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypedGuard() <em>Typed Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedGuard()
	 * @generated
	 * @ordered
	 */
	protected String typedGuard = TYPED_GUARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultToleranceConfigurationCommonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getFaultToleranceConfigurationCommon();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBulkheadEnabled() {
		return bulkheadEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBulkheadEnabled(String newBulkheadEnabled) {
		String oldBulkheadEnabled = bulkheadEnabled;
		bulkheadEnabled = newBulkheadEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_ENABLED, oldBulkheadEnabled, bulkheadEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBulkheadMaxConcurrentCalls() {
		return bulkheadMaxConcurrentCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBulkheadMaxConcurrentCalls(String newBulkheadMaxConcurrentCalls) {
		String oldBulkheadMaxConcurrentCalls = bulkheadMaxConcurrentCalls;
		bulkheadMaxConcurrentCalls = newBulkheadMaxConcurrentCalls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_MAX_CONCURRENT_CALLS, oldBulkheadMaxConcurrentCalls, bulkheadMaxConcurrentCalls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBulkheadWaitingTaskQueue() {
		return bulkheadWaitingTaskQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBulkheadWaitingTaskQueue(String newBulkheadWaitingTaskQueue) {
		String oldBulkheadWaitingTaskQueue = bulkheadWaitingTaskQueue;
		bulkheadWaitingTaskQueue = newBulkheadWaitingTaskQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_WAITING_TASK_QUEUE, oldBulkheadWaitingTaskQueue, bulkheadWaitingTaskQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelay(String newDelay) {
		String oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFailureRatio() {
		return failureRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureRatio(String newFailureRatio) {
		String oldFailureRatio = failureRatio;
		failureRatio = newFailureRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__FAILURE_RATIO, oldFailureRatio, failureRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestVolumeThreshold() {
		return requestVolumeThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestVolumeThreshold(String newRequestVolumeThreshold) {
		String oldRequestVolumeThreshold = requestVolumeThreshold;
		requestVolumeThreshold = newRequestVolumeThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__REQUEST_VOLUME_THRESHOLD, oldRequestVolumeThreshold, requestVolumeThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuccessThreshold() {
		return successThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessThreshold(String newSuccessThreshold) {
		String oldSuccessThreshold = successThreshold;
		successThreshold = newSuccessThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__SUCCESS_THRESHOLD, oldSuccessThreshold, successThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThreadOffloadExecutorService() {
		return threadOffloadExecutorService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadOffloadExecutorService(String newThreadOffloadExecutorService) {
		String oldThreadOffloadExecutorService = threadOffloadExecutorService;
		threadOffloadExecutorService = newThreadOffloadExecutorService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__THREAD_OFFLOAD_EXECUTOR_SERVICE, oldThreadOffloadExecutorService, threadOffloadExecutorService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutDuration() {
		return timeoutDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutDuration(String newTimeoutDuration) {
		String oldTimeoutDuration = timeoutDuration;
		timeoutDuration = newTimeoutDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_DURATION, oldTimeoutDuration, timeoutDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutEnabled() {
		return timeoutEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutEnabled(String newTimeoutEnabled) {
		String oldTimeoutEnabled = timeoutEnabled;
		timeoutEnabled = newTimeoutEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_ENABLED, oldTimeoutEnabled, timeoutEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutPoolSize() {
		return timeoutPoolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutPoolSize(String newTimeoutPoolSize) {
		String oldTimeoutPoolSize = timeoutPoolSize;
		timeoutPoolSize = newTimeoutPoolSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_POOL_SIZE, oldTimeoutPoolSize, timeoutPoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypedGuard() {
		return typedGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypedGuard(String newTypedGuard) {
		String oldTypedGuard = typedGuard;
		typedGuard = newTypedGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TYPED_GUARD, oldTypedGuard, typedGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_ENABLED:
				return getBulkheadEnabled();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_MAX_CONCURRENT_CALLS:
				return getBulkheadMaxConcurrentCalls();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_WAITING_TASK_QUEUE:
				return getBulkheadWaitingTaskQueue();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__DELAY:
				return getDelay();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__FAILURE_RATIO:
				return getFailureRatio();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__REQUEST_VOLUME_THRESHOLD:
				return getRequestVolumeThreshold();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__SUCCESS_THRESHOLD:
				return getSuccessThreshold();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__THREAD_OFFLOAD_EXECUTOR_SERVICE:
				return getThreadOffloadExecutorService();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_DURATION:
				return getTimeoutDuration();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_ENABLED:
				return getTimeoutEnabled();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_POOL_SIZE:
				return getTimeoutPoolSize();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TYPED_GUARD:
				return getTypedGuard();
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
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_ENABLED:
				setBulkheadEnabled((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_MAX_CONCURRENT_CALLS:
				setBulkheadMaxConcurrentCalls((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_WAITING_TASK_QUEUE:
				setBulkheadWaitingTaskQueue((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__DELAY:
				setDelay((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__FAILURE_RATIO:
				setFailureRatio((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__REQUEST_VOLUME_THRESHOLD:
				setRequestVolumeThreshold((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__SUCCESS_THRESHOLD:
				setSuccessThreshold((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__THREAD_OFFLOAD_EXECUTOR_SERVICE:
				setThreadOffloadExecutorService((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_DURATION:
				setTimeoutDuration((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_ENABLED:
				setTimeoutEnabled((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_POOL_SIZE:
				setTimeoutPoolSize((String)newValue);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TYPED_GUARD:
				setTypedGuard((String)newValue);
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
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_ENABLED:
				setBulkheadEnabled(BULKHEAD_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_MAX_CONCURRENT_CALLS:
				setBulkheadMaxConcurrentCalls(BULKHEAD_MAX_CONCURRENT_CALLS_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_WAITING_TASK_QUEUE:
				setBulkheadWaitingTaskQueue(BULKHEAD_WAITING_TASK_QUEUE_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__FAILURE_RATIO:
				setFailureRatio(FAILURE_RATIO_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__REQUEST_VOLUME_THRESHOLD:
				setRequestVolumeThreshold(REQUEST_VOLUME_THRESHOLD_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__SUCCESS_THRESHOLD:
				setSuccessThreshold(SUCCESS_THRESHOLD_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__THREAD_OFFLOAD_EXECUTOR_SERVICE:
				setThreadOffloadExecutorService(THREAD_OFFLOAD_EXECUTOR_SERVICE_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_DURATION:
				setTimeoutDuration(TIMEOUT_DURATION_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_ENABLED:
				setTimeoutEnabled(TIMEOUT_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_POOL_SIZE:
				setTimeoutPoolSize(TIMEOUT_POOL_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TYPED_GUARD:
				setTypedGuard(TYPED_GUARD_EDEFAULT);
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
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_ENABLED:
				return BULKHEAD_ENABLED_EDEFAULT == null ? bulkheadEnabled != null : !BULKHEAD_ENABLED_EDEFAULT.equals(bulkheadEnabled);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_MAX_CONCURRENT_CALLS:
				return BULKHEAD_MAX_CONCURRENT_CALLS_EDEFAULT == null ? bulkheadMaxConcurrentCalls != null : !BULKHEAD_MAX_CONCURRENT_CALLS_EDEFAULT.equals(bulkheadMaxConcurrentCalls);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__BULKHEAD_WAITING_TASK_QUEUE:
				return BULKHEAD_WAITING_TASK_QUEUE_EDEFAULT == null ? bulkheadWaitingTaskQueue != null : !BULKHEAD_WAITING_TASK_QUEUE_EDEFAULT.equals(bulkheadWaitingTaskQueue);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__DELAY:
				return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__FAILURE_RATIO:
				return FAILURE_RATIO_EDEFAULT == null ? failureRatio != null : !FAILURE_RATIO_EDEFAULT.equals(failureRatio);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__REQUEST_VOLUME_THRESHOLD:
				return REQUEST_VOLUME_THRESHOLD_EDEFAULT == null ? requestVolumeThreshold != null : !REQUEST_VOLUME_THRESHOLD_EDEFAULT.equals(requestVolumeThreshold);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__SUCCESS_THRESHOLD:
				return SUCCESS_THRESHOLD_EDEFAULT == null ? successThreshold != null : !SUCCESS_THRESHOLD_EDEFAULT.equals(successThreshold);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__THREAD_OFFLOAD_EXECUTOR_SERVICE:
				return THREAD_OFFLOAD_EXECUTOR_SERVICE_EDEFAULT == null ? threadOffloadExecutorService != null : !THREAD_OFFLOAD_EXECUTOR_SERVICE_EDEFAULT.equals(threadOffloadExecutorService);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_DURATION:
				return TIMEOUT_DURATION_EDEFAULT == null ? timeoutDuration != null : !TIMEOUT_DURATION_EDEFAULT.equals(timeoutDuration);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_ENABLED:
				return TIMEOUT_ENABLED_EDEFAULT == null ? timeoutEnabled != null : !TIMEOUT_ENABLED_EDEFAULT.equals(timeoutEnabled);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TIMEOUT_POOL_SIZE:
				return TIMEOUT_POOL_SIZE_EDEFAULT == null ? timeoutPoolSize != null : !TIMEOUT_POOL_SIZE_EDEFAULT.equals(timeoutPoolSize);
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON__TYPED_GUARD:
				return TYPED_GUARD_EDEFAULT == null ? typedGuard != null : !TYPED_GUARD_EDEFAULT.equals(typedGuard);
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
		result.append(" (bulkheadEnabled: ");
		result.append(bulkheadEnabled);
		result.append(", bulkheadMaxConcurrentCalls: ");
		result.append(bulkheadMaxConcurrentCalls);
		result.append(", bulkheadWaitingTaskQueue: ");
		result.append(bulkheadWaitingTaskQueue);
		result.append(", delay: ");
		result.append(delay);
		result.append(", failureRatio: ");
		result.append(failureRatio);
		result.append(", requestVolumeThreshold: ");
		result.append(requestVolumeThreshold);
		result.append(", successThreshold: ");
		result.append(successThreshold);
		result.append(", threadOffloadExecutorService: ");
		result.append(threadOffloadExecutorService);
		result.append(", timeoutDuration: ");
		result.append(timeoutDuration);
		result.append(", timeoutEnabled: ");
		result.append(timeoutEnabled);
		result.append(", timeoutPoolSize: ");
		result.append(timeoutPoolSize);
		result.append(", typedGuard: ");
		result.append(typedGuard);
		result.append(')');
		return result.toString();
	}

} //FaultToleranceConfigurationCommonImpl

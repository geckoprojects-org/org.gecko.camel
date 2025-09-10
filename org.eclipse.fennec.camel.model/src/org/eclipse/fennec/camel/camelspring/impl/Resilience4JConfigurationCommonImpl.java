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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resilience4 JConfiguration Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getRecordException <em>Record Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getIgnoreException <em>Ignore Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getAutomaticTransitionFromOpenToHalfOpenEnabled <em>Automatic Transition From Open To Half Open Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getBulkheadEnabled <em>Bulkhead Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getBulkheadMaxConcurrentCalls <em>Bulkhead Max Concurrent Calls</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getBulkheadMaxWaitDuration <em>Bulkhead Max Wait Duration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getFailureRateThreshold <em>Failure Rate Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getMinimumNumberOfCalls <em>Minimum Number Of Calls</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getPermittedNumberOfCallsInHalfOpenState <em>Permitted Number Of Calls In Half Open State</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getSlidingWindowSize <em>Sliding Window Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getSlidingWindowType <em>Sliding Window Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getSlowCallDurationThreshold <em>Slow Call Duration Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getSlowCallRateThreshold <em>Slow Call Rate Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getThrowExceptionWhenHalfOpenOrOpenState <em>Throw Exception When Half Open Or Open State</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getTimeoutCancelRunningFuture <em>Timeout Cancel Running Future</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getTimeoutDuration <em>Timeout Duration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getTimeoutEnabled <em>Timeout Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getTimeoutExecutorService <em>Timeout Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getWaitDurationInOpenState <em>Wait Duration In Open State</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Resilience4JConfigurationCommonImpl#getWritableStackTraceEnabled <em>Writable Stack Trace Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Resilience4JConfigurationCommonImpl extends IdentifiedTypeImpl implements Resilience4JConfigurationCommon {
	/**
	 * The cached value of the '{@link #getRecordException() <em>Record Exception</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordException()
	 * @generated
	 * @ordered
	 */
	protected EList<String> recordException;

	/**
	 * The cached value of the '{@link #getIgnoreException() <em>Ignore Exception</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreException()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ignoreException;

	/**
	 * The default value of the '{@link #getAutomaticTransitionFromOpenToHalfOpenEnabled() <em>Automatic Transition From Open To Half Open Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticTransitionFromOpenToHalfOpenEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOMATIC_TRANSITION_FROM_OPEN_TO_HALF_OPEN_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomaticTransitionFromOpenToHalfOpenEnabled() <em>Automatic Transition From Open To Half Open Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticTransitionFromOpenToHalfOpenEnabled()
	 * @generated
	 * @ordered
	 */
	protected String automaticTransitionFromOpenToHalfOpenEnabled = AUTOMATIC_TRANSITION_FROM_OPEN_TO_HALF_OPEN_ENABLED_EDEFAULT;

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
	 * The default value of the '{@link #getBulkheadMaxWaitDuration() <em>Bulkhead Max Wait Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkheadMaxWaitDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String BULKHEAD_MAX_WAIT_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBulkheadMaxWaitDuration() <em>Bulkhead Max Wait Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkheadMaxWaitDuration()
	 * @generated
	 * @ordered
	 */
	protected String bulkheadMaxWaitDuration = BULKHEAD_MAX_WAIT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCircuitBreaker() <em>Circuit Breaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitBreaker()
	 * @generated
	 * @ordered
	 */
	protected static final String CIRCUIT_BREAKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCircuitBreaker() <em>Circuit Breaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitBreaker()
	 * @generated
	 * @ordered
	 */
	protected String circuitBreaker = CIRCUIT_BREAKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected String config = CONFIG_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureRateThreshold() <em>Failure Rate Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRateThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_RATE_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureRateThreshold() <em>Failure Rate Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRateThreshold()
	 * @generated
	 * @ordered
	 */
	protected String failureRateThreshold = FAILURE_RATE_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumNumberOfCalls() <em>Minimum Number Of Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumNumberOfCalls()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_NUMBER_OF_CALLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumNumberOfCalls() <em>Minimum Number Of Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumNumberOfCalls()
	 * @generated
	 * @ordered
	 */
	protected String minimumNumberOfCalls = MINIMUM_NUMBER_OF_CALLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermittedNumberOfCallsInHalfOpenState() <em>Permitted Number Of Calls In Half Open State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedNumberOfCallsInHalfOpenState()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMITTED_NUMBER_OF_CALLS_IN_HALF_OPEN_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermittedNumberOfCallsInHalfOpenState() <em>Permitted Number Of Calls In Half Open State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedNumberOfCallsInHalfOpenState()
	 * @generated
	 * @ordered
	 */
	protected String permittedNumberOfCallsInHalfOpenState = PERMITTED_NUMBER_OF_CALLS_IN_HALF_OPEN_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlidingWindowSize() <em>Sliding Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlidingWindowSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SLIDING_WINDOW_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlidingWindowSize() <em>Sliding Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlidingWindowSize()
	 * @generated
	 * @ordered
	 */
	protected String slidingWindowSize = SLIDING_WINDOW_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlidingWindowType() <em>Sliding Window Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlidingWindowType()
	 * @generated
	 * @ordered
	 */
	protected static final String SLIDING_WINDOW_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlidingWindowType() <em>Sliding Window Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlidingWindowType()
	 * @generated
	 * @ordered
	 */
	protected String slidingWindowType = SLIDING_WINDOW_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlowCallDurationThreshold() <em>Slow Call Duration Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlowCallDurationThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String SLOW_CALL_DURATION_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlowCallDurationThreshold() <em>Slow Call Duration Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlowCallDurationThreshold()
	 * @generated
	 * @ordered
	 */
	protected String slowCallDurationThreshold = SLOW_CALL_DURATION_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlowCallRateThreshold() <em>Slow Call Rate Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlowCallRateThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String SLOW_CALL_RATE_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlowCallRateThreshold() <em>Slow Call Rate Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlowCallRateThreshold()
	 * @generated
	 * @ordered
	 */
	protected String slowCallRateThreshold = SLOW_CALL_RATE_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getThrowExceptionWhenHalfOpenOrOpenState() <em>Throw Exception When Half Open Or Open State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrowExceptionWhenHalfOpenOrOpenState()
	 * @generated
	 * @ordered
	 */
	protected static final String THROW_EXCEPTION_WHEN_HALF_OPEN_OR_OPEN_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThrowExceptionWhenHalfOpenOrOpenState() <em>Throw Exception When Half Open Or Open State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrowExceptionWhenHalfOpenOrOpenState()
	 * @generated
	 * @ordered
	 */
	protected String throwExceptionWhenHalfOpenOrOpenState = THROW_EXCEPTION_WHEN_HALF_OPEN_OR_OPEN_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutCancelRunningFuture() <em>Timeout Cancel Running Future</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutCancelRunningFuture()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_CANCEL_RUNNING_FUTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutCancelRunningFuture() <em>Timeout Cancel Running Future</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutCancelRunningFuture()
	 * @generated
	 * @ordered
	 */
	protected String timeoutCancelRunningFuture = TIMEOUT_CANCEL_RUNNING_FUTURE_EDEFAULT;

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
	 * The default value of the '{@link #getTimeoutExecutorService() <em>Timeout Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutExecutorService()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EXECUTOR_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutExecutorService() <em>Timeout Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutExecutorService()
	 * @generated
	 * @ordered
	 */
	protected String timeoutExecutorService = TIMEOUT_EXECUTOR_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitDurationInOpenState() <em>Wait Duration In Open State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitDurationInOpenState()
	 * @generated
	 * @ordered
	 */
	protected static final String WAIT_DURATION_IN_OPEN_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitDurationInOpenState() <em>Wait Duration In Open State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitDurationInOpenState()
	 * @generated
	 * @ordered
	 */
	protected String waitDurationInOpenState = WAIT_DURATION_IN_OPEN_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWritableStackTraceEnabled() <em>Writable Stack Trace Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritableStackTraceEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITABLE_STACK_TRACE_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWritableStackTraceEnabled() <em>Writable Stack Trace Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritableStackTraceEnabled()
	 * @generated
	 * @ordered
	 */
	protected String writableStackTraceEnabled = WRITABLE_STACK_TRACE_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Resilience4JConfigurationCommonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getResilience4JConfigurationCommon();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRecordException() {
		if (recordException == null) {
			recordException = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__RECORD_EXCEPTION);
		}
		return recordException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIgnoreException() {
		if (ignoreException == null) {
			ignoreException = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__IGNORE_EXCEPTION);
		}
		return ignoreException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutomaticTransitionFromOpenToHalfOpenEnabled() {
		return automaticTransitionFromOpenToHalfOpenEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticTransitionFromOpenToHalfOpenEnabled(String newAutomaticTransitionFromOpenToHalfOpenEnabled) {
		String oldAutomaticTransitionFromOpenToHalfOpenEnabled = automaticTransitionFromOpenToHalfOpenEnabled;
		automaticTransitionFromOpenToHalfOpenEnabled = newAutomaticTransitionFromOpenToHalfOpenEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__AUTOMATIC_TRANSITION_FROM_OPEN_TO_HALF_OPEN_ENABLED, oldAutomaticTransitionFromOpenToHalfOpenEnabled, automaticTransitionFromOpenToHalfOpenEnabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_ENABLED, oldBulkheadEnabled, bulkheadEnabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_MAX_CONCURRENT_CALLS, oldBulkheadMaxConcurrentCalls, bulkheadMaxConcurrentCalls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBulkheadMaxWaitDuration() {
		return bulkheadMaxWaitDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBulkheadMaxWaitDuration(String newBulkheadMaxWaitDuration) {
		String oldBulkheadMaxWaitDuration = bulkheadMaxWaitDuration;
		bulkheadMaxWaitDuration = newBulkheadMaxWaitDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_MAX_WAIT_DURATION, oldBulkheadMaxWaitDuration, bulkheadMaxWaitDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCircuitBreaker() {
		return circuitBreaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCircuitBreaker(String newCircuitBreaker) {
		String oldCircuitBreaker = circuitBreaker;
		circuitBreaker = newCircuitBreaker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__CIRCUIT_BREAKER, oldCircuitBreaker, circuitBreaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(String newConfig) {
		String oldConfig = config;
		config = newConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__CONFIG, oldConfig, config));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFailureRateThreshold() {
		return failureRateThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureRateThreshold(String newFailureRateThreshold) {
		String oldFailureRateThreshold = failureRateThreshold;
		failureRateThreshold = newFailureRateThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__FAILURE_RATE_THRESHOLD, oldFailureRateThreshold, failureRateThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinimumNumberOfCalls() {
		return minimumNumberOfCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumNumberOfCalls(String newMinimumNumberOfCalls) {
		String oldMinimumNumberOfCalls = minimumNumberOfCalls;
		minimumNumberOfCalls = newMinimumNumberOfCalls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__MINIMUM_NUMBER_OF_CALLS, oldMinimumNumberOfCalls, minimumNumberOfCalls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPermittedNumberOfCallsInHalfOpenState() {
		return permittedNumberOfCallsInHalfOpenState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermittedNumberOfCallsInHalfOpenState(String newPermittedNumberOfCallsInHalfOpenState) {
		String oldPermittedNumberOfCallsInHalfOpenState = permittedNumberOfCallsInHalfOpenState;
		permittedNumberOfCallsInHalfOpenState = newPermittedNumberOfCallsInHalfOpenState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__PERMITTED_NUMBER_OF_CALLS_IN_HALF_OPEN_STATE, oldPermittedNumberOfCallsInHalfOpenState, permittedNumberOfCallsInHalfOpenState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSlidingWindowSize() {
		return slidingWindowSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlidingWindowSize(String newSlidingWindowSize) {
		String oldSlidingWindowSize = slidingWindowSize;
		slidingWindowSize = newSlidingWindowSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLIDING_WINDOW_SIZE, oldSlidingWindowSize, slidingWindowSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSlidingWindowType() {
		return slidingWindowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlidingWindowType(String newSlidingWindowType) {
		String oldSlidingWindowType = slidingWindowType;
		slidingWindowType = newSlidingWindowType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLIDING_WINDOW_TYPE, oldSlidingWindowType, slidingWindowType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSlowCallDurationThreshold() {
		return slowCallDurationThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlowCallDurationThreshold(String newSlowCallDurationThreshold) {
		String oldSlowCallDurationThreshold = slowCallDurationThreshold;
		slowCallDurationThreshold = newSlowCallDurationThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLOW_CALL_DURATION_THRESHOLD, oldSlowCallDurationThreshold, slowCallDurationThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSlowCallRateThreshold() {
		return slowCallRateThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlowCallRateThreshold(String newSlowCallRateThreshold) {
		String oldSlowCallRateThreshold = slowCallRateThreshold;
		slowCallRateThreshold = newSlowCallRateThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLOW_CALL_RATE_THRESHOLD, oldSlowCallRateThreshold, slowCallRateThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThrowExceptionWhenHalfOpenOrOpenState() {
		return throwExceptionWhenHalfOpenOrOpenState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrowExceptionWhenHalfOpenOrOpenState(String newThrowExceptionWhenHalfOpenOrOpenState) {
		String oldThrowExceptionWhenHalfOpenOrOpenState = throwExceptionWhenHalfOpenOrOpenState;
		throwExceptionWhenHalfOpenOrOpenState = newThrowExceptionWhenHalfOpenOrOpenState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__THROW_EXCEPTION_WHEN_HALF_OPEN_OR_OPEN_STATE, oldThrowExceptionWhenHalfOpenOrOpenState, throwExceptionWhenHalfOpenOrOpenState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutCancelRunningFuture() {
		return timeoutCancelRunningFuture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutCancelRunningFuture(String newTimeoutCancelRunningFuture) {
		String oldTimeoutCancelRunningFuture = timeoutCancelRunningFuture;
		timeoutCancelRunningFuture = newTimeoutCancelRunningFuture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_CANCEL_RUNNING_FUTURE, oldTimeoutCancelRunningFuture, timeoutCancelRunningFuture));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_DURATION, oldTimeoutDuration, timeoutDuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_ENABLED, oldTimeoutEnabled, timeoutEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutExecutorService() {
		return timeoutExecutorService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutExecutorService(String newTimeoutExecutorService) {
		String oldTimeoutExecutorService = timeoutExecutorService;
		timeoutExecutorService = newTimeoutExecutorService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_EXECUTOR_SERVICE, oldTimeoutExecutorService, timeoutExecutorService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWaitDurationInOpenState() {
		return waitDurationInOpenState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitDurationInOpenState(String newWaitDurationInOpenState) {
		String oldWaitDurationInOpenState = waitDurationInOpenState;
		waitDurationInOpenState = newWaitDurationInOpenState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__WAIT_DURATION_IN_OPEN_STATE, oldWaitDurationInOpenState, waitDurationInOpenState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWritableStackTraceEnabled() {
		return writableStackTraceEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWritableStackTraceEnabled(String newWritableStackTraceEnabled) {
		String oldWritableStackTraceEnabled = writableStackTraceEnabled;
		writableStackTraceEnabled = newWritableStackTraceEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__WRITABLE_STACK_TRACE_ENABLED, oldWritableStackTraceEnabled, writableStackTraceEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__RECORD_EXCEPTION:
				return getRecordException();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__IGNORE_EXCEPTION:
				return getIgnoreException();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__AUTOMATIC_TRANSITION_FROM_OPEN_TO_HALF_OPEN_ENABLED:
				return getAutomaticTransitionFromOpenToHalfOpenEnabled();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_ENABLED:
				return getBulkheadEnabled();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_MAX_CONCURRENT_CALLS:
				return getBulkheadMaxConcurrentCalls();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_MAX_WAIT_DURATION:
				return getBulkheadMaxWaitDuration();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__CIRCUIT_BREAKER:
				return getCircuitBreaker();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__CONFIG:
				return getConfig();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__FAILURE_RATE_THRESHOLD:
				return getFailureRateThreshold();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__MINIMUM_NUMBER_OF_CALLS:
				return getMinimumNumberOfCalls();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__PERMITTED_NUMBER_OF_CALLS_IN_HALF_OPEN_STATE:
				return getPermittedNumberOfCallsInHalfOpenState();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLIDING_WINDOW_SIZE:
				return getSlidingWindowSize();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLIDING_WINDOW_TYPE:
				return getSlidingWindowType();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLOW_CALL_DURATION_THRESHOLD:
				return getSlowCallDurationThreshold();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLOW_CALL_RATE_THRESHOLD:
				return getSlowCallRateThreshold();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__THROW_EXCEPTION_WHEN_HALF_OPEN_OR_OPEN_STATE:
				return getThrowExceptionWhenHalfOpenOrOpenState();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_CANCEL_RUNNING_FUTURE:
				return getTimeoutCancelRunningFuture();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_DURATION:
				return getTimeoutDuration();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_ENABLED:
				return getTimeoutEnabled();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_EXECUTOR_SERVICE:
				return getTimeoutExecutorService();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__WAIT_DURATION_IN_OPEN_STATE:
				return getWaitDurationInOpenState();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__WRITABLE_STACK_TRACE_ENABLED:
				return getWritableStackTraceEnabled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__RECORD_EXCEPTION:
				getRecordException().clear();
				getRecordException().addAll((Collection<? extends String>)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__IGNORE_EXCEPTION:
				getIgnoreException().clear();
				getIgnoreException().addAll((Collection<? extends String>)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__AUTOMATIC_TRANSITION_FROM_OPEN_TO_HALF_OPEN_ENABLED:
				setAutomaticTransitionFromOpenToHalfOpenEnabled((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_ENABLED:
				setBulkheadEnabled((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_MAX_CONCURRENT_CALLS:
				setBulkheadMaxConcurrentCalls((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_MAX_WAIT_DURATION:
				setBulkheadMaxWaitDuration((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__CIRCUIT_BREAKER:
				setCircuitBreaker((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__CONFIG:
				setConfig((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__FAILURE_RATE_THRESHOLD:
				setFailureRateThreshold((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__MINIMUM_NUMBER_OF_CALLS:
				setMinimumNumberOfCalls((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__PERMITTED_NUMBER_OF_CALLS_IN_HALF_OPEN_STATE:
				setPermittedNumberOfCallsInHalfOpenState((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLIDING_WINDOW_SIZE:
				setSlidingWindowSize((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLIDING_WINDOW_TYPE:
				setSlidingWindowType((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLOW_CALL_DURATION_THRESHOLD:
				setSlowCallDurationThreshold((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLOW_CALL_RATE_THRESHOLD:
				setSlowCallRateThreshold((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__THROW_EXCEPTION_WHEN_HALF_OPEN_OR_OPEN_STATE:
				setThrowExceptionWhenHalfOpenOrOpenState((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_CANCEL_RUNNING_FUTURE:
				setTimeoutCancelRunningFuture((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_DURATION:
				setTimeoutDuration((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_ENABLED:
				setTimeoutEnabled((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_EXECUTOR_SERVICE:
				setTimeoutExecutorService((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__WAIT_DURATION_IN_OPEN_STATE:
				setWaitDurationInOpenState((String)newValue);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__WRITABLE_STACK_TRACE_ENABLED:
				setWritableStackTraceEnabled((String)newValue);
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
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__RECORD_EXCEPTION:
				getRecordException().clear();
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__IGNORE_EXCEPTION:
				getIgnoreException().clear();
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__AUTOMATIC_TRANSITION_FROM_OPEN_TO_HALF_OPEN_ENABLED:
				setAutomaticTransitionFromOpenToHalfOpenEnabled(AUTOMATIC_TRANSITION_FROM_OPEN_TO_HALF_OPEN_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_ENABLED:
				setBulkheadEnabled(BULKHEAD_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_MAX_CONCURRENT_CALLS:
				setBulkheadMaxConcurrentCalls(BULKHEAD_MAX_CONCURRENT_CALLS_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_MAX_WAIT_DURATION:
				setBulkheadMaxWaitDuration(BULKHEAD_MAX_WAIT_DURATION_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__CIRCUIT_BREAKER:
				setCircuitBreaker(CIRCUIT_BREAKER_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__CONFIG:
				setConfig(CONFIG_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__FAILURE_RATE_THRESHOLD:
				setFailureRateThreshold(FAILURE_RATE_THRESHOLD_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__MINIMUM_NUMBER_OF_CALLS:
				setMinimumNumberOfCalls(MINIMUM_NUMBER_OF_CALLS_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__PERMITTED_NUMBER_OF_CALLS_IN_HALF_OPEN_STATE:
				setPermittedNumberOfCallsInHalfOpenState(PERMITTED_NUMBER_OF_CALLS_IN_HALF_OPEN_STATE_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLIDING_WINDOW_SIZE:
				setSlidingWindowSize(SLIDING_WINDOW_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLIDING_WINDOW_TYPE:
				setSlidingWindowType(SLIDING_WINDOW_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLOW_CALL_DURATION_THRESHOLD:
				setSlowCallDurationThreshold(SLOW_CALL_DURATION_THRESHOLD_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLOW_CALL_RATE_THRESHOLD:
				setSlowCallRateThreshold(SLOW_CALL_RATE_THRESHOLD_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__THROW_EXCEPTION_WHEN_HALF_OPEN_OR_OPEN_STATE:
				setThrowExceptionWhenHalfOpenOrOpenState(THROW_EXCEPTION_WHEN_HALF_OPEN_OR_OPEN_STATE_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_CANCEL_RUNNING_FUTURE:
				setTimeoutCancelRunningFuture(TIMEOUT_CANCEL_RUNNING_FUTURE_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_DURATION:
				setTimeoutDuration(TIMEOUT_DURATION_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_ENABLED:
				setTimeoutEnabled(TIMEOUT_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_EXECUTOR_SERVICE:
				setTimeoutExecutorService(TIMEOUT_EXECUTOR_SERVICE_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__WAIT_DURATION_IN_OPEN_STATE:
				setWaitDurationInOpenState(WAIT_DURATION_IN_OPEN_STATE_EDEFAULT);
				return;
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__WRITABLE_STACK_TRACE_ENABLED:
				setWritableStackTraceEnabled(WRITABLE_STACK_TRACE_ENABLED_EDEFAULT);
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
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__RECORD_EXCEPTION:
				return recordException != null && !recordException.isEmpty();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__IGNORE_EXCEPTION:
				return ignoreException != null && !ignoreException.isEmpty();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__AUTOMATIC_TRANSITION_FROM_OPEN_TO_HALF_OPEN_ENABLED:
				return AUTOMATIC_TRANSITION_FROM_OPEN_TO_HALF_OPEN_ENABLED_EDEFAULT == null ? automaticTransitionFromOpenToHalfOpenEnabled != null : !AUTOMATIC_TRANSITION_FROM_OPEN_TO_HALF_OPEN_ENABLED_EDEFAULT.equals(automaticTransitionFromOpenToHalfOpenEnabled);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_ENABLED:
				return BULKHEAD_ENABLED_EDEFAULT == null ? bulkheadEnabled != null : !BULKHEAD_ENABLED_EDEFAULT.equals(bulkheadEnabled);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_MAX_CONCURRENT_CALLS:
				return BULKHEAD_MAX_CONCURRENT_CALLS_EDEFAULT == null ? bulkheadMaxConcurrentCalls != null : !BULKHEAD_MAX_CONCURRENT_CALLS_EDEFAULT.equals(bulkheadMaxConcurrentCalls);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__BULKHEAD_MAX_WAIT_DURATION:
				return BULKHEAD_MAX_WAIT_DURATION_EDEFAULT == null ? bulkheadMaxWaitDuration != null : !BULKHEAD_MAX_WAIT_DURATION_EDEFAULT.equals(bulkheadMaxWaitDuration);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__CIRCUIT_BREAKER:
				return CIRCUIT_BREAKER_EDEFAULT == null ? circuitBreaker != null : !CIRCUIT_BREAKER_EDEFAULT.equals(circuitBreaker);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__CONFIG:
				return CONFIG_EDEFAULT == null ? config != null : !CONFIG_EDEFAULT.equals(config);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__FAILURE_RATE_THRESHOLD:
				return FAILURE_RATE_THRESHOLD_EDEFAULT == null ? failureRateThreshold != null : !FAILURE_RATE_THRESHOLD_EDEFAULT.equals(failureRateThreshold);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__MINIMUM_NUMBER_OF_CALLS:
				return MINIMUM_NUMBER_OF_CALLS_EDEFAULT == null ? minimumNumberOfCalls != null : !MINIMUM_NUMBER_OF_CALLS_EDEFAULT.equals(minimumNumberOfCalls);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__PERMITTED_NUMBER_OF_CALLS_IN_HALF_OPEN_STATE:
				return PERMITTED_NUMBER_OF_CALLS_IN_HALF_OPEN_STATE_EDEFAULT == null ? permittedNumberOfCallsInHalfOpenState != null : !PERMITTED_NUMBER_OF_CALLS_IN_HALF_OPEN_STATE_EDEFAULT.equals(permittedNumberOfCallsInHalfOpenState);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLIDING_WINDOW_SIZE:
				return SLIDING_WINDOW_SIZE_EDEFAULT == null ? slidingWindowSize != null : !SLIDING_WINDOW_SIZE_EDEFAULT.equals(slidingWindowSize);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLIDING_WINDOW_TYPE:
				return SLIDING_WINDOW_TYPE_EDEFAULT == null ? slidingWindowType != null : !SLIDING_WINDOW_TYPE_EDEFAULT.equals(slidingWindowType);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLOW_CALL_DURATION_THRESHOLD:
				return SLOW_CALL_DURATION_THRESHOLD_EDEFAULT == null ? slowCallDurationThreshold != null : !SLOW_CALL_DURATION_THRESHOLD_EDEFAULT.equals(slowCallDurationThreshold);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__SLOW_CALL_RATE_THRESHOLD:
				return SLOW_CALL_RATE_THRESHOLD_EDEFAULT == null ? slowCallRateThreshold != null : !SLOW_CALL_RATE_THRESHOLD_EDEFAULT.equals(slowCallRateThreshold);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__THROW_EXCEPTION_WHEN_HALF_OPEN_OR_OPEN_STATE:
				return THROW_EXCEPTION_WHEN_HALF_OPEN_OR_OPEN_STATE_EDEFAULT == null ? throwExceptionWhenHalfOpenOrOpenState != null : !THROW_EXCEPTION_WHEN_HALF_OPEN_OR_OPEN_STATE_EDEFAULT.equals(throwExceptionWhenHalfOpenOrOpenState);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_CANCEL_RUNNING_FUTURE:
				return TIMEOUT_CANCEL_RUNNING_FUTURE_EDEFAULT == null ? timeoutCancelRunningFuture != null : !TIMEOUT_CANCEL_RUNNING_FUTURE_EDEFAULT.equals(timeoutCancelRunningFuture);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_DURATION:
				return TIMEOUT_DURATION_EDEFAULT == null ? timeoutDuration != null : !TIMEOUT_DURATION_EDEFAULT.equals(timeoutDuration);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_ENABLED:
				return TIMEOUT_ENABLED_EDEFAULT == null ? timeoutEnabled != null : !TIMEOUT_ENABLED_EDEFAULT.equals(timeoutEnabled);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__TIMEOUT_EXECUTOR_SERVICE:
				return TIMEOUT_EXECUTOR_SERVICE_EDEFAULT == null ? timeoutExecutorService != null : !TIMEOUT_EXECUTOR_SERVICE_EDEFAULT.equals(timeoutExecutorService);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__WAIT_DURATION_IN_OPEN_STATE:
				return WAIT_DURATION_IN_OPEN_STATE_EDEFAULT == null ? waitDurationInOpenState != null : !WAIT_DURATION_IN_OPEN_STATE_EDEFAULT.equals(waitDurationInOpenState);
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON__WRITABLE_STACK_TRACE_ENABLED:
				return WRITABLE_STACK_TRACE_ENABLED_EDEFAULT == null ? writableStackTraceEnabled != null : !WRITABLE_STACK_TRACE_ENABLED_EDEFAULT.equals(writableStackTraceEnabled);
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
		result.append(" (recordException: ");
		result.append(recordException);
		result.append(", ignoreException: ");
		result.append(ignoreException);
		result.append(", automaticTransitionFromOpenToHalfOpenEnabled: ");
		result.append(automaticTransitionFromOpenToHalfOpenEnabled);
		result.append(", bulkheadEnabled: ");
		result.append(bulkheadEnabled);
		result.append(", bulkheadMaxConcurrentCalls: ");
		result.append(bulkheadMaxConcurrentCalls);
		result.append(", bulkheadMaxWaitDuration: ");
		result.append(bulkheadMaxWaitDuration);
		result.append(", circuitBreaker: ");
		result.append(circuitBreaker);
		result.append(", config: ");
		result.append(config);
		result.append(", failureRateThreshold: ");
		result.append(failureRateThreshold);
		result.append(", minimumNumberOfCalls: ");
		result.append(minimumNumberOfCalls);
		result.append(", permittedNumberOfCallsInHalfOpenState: ");
		result.append(permittedNumberOfCallsInHalfOpenState);
		result.append(", slidingWindowSize: ");
		result.append(slidingWindowSize);
		result.append(", slidingWindowType: ");
		result.append(slidingWindowType);
		result.append(", slowCallDurationThreshold: ");
		result.append(slowCallDurationThreshold);
		result.append(", slowCallRateThreshold: ");
		result.append(slowCallRateThreshold);
		result.append(", throwExceptionWhenHalfOpenOrOpenState: ");
		result.append(throwExceptionWhenHalfOpenOrOpenState);
		result.append(", timeoutCancelRunningFuture: ");
		result.append(timeoutCancelRunningFuture);
		result.append(", timeoutDuration: ");
		result.append(timeoutDuration);
		result.append(", timeoutEnabled: ");
		result.append(timeoutEnabled);
		result.append(", timeoutExecutorService: ");
		result.append(timeoutExecutorService);
		result.append(", waitDurationInOpenState: ");
		result.append(waitDurationInOpenState);
		result.append(", writableStackTraceEnabled: ");
		result.append(writableStackTraceEnabled);
		result.append(')');
		return result.toString();
	}

} //Resilience4JConfigurationCommonImpl

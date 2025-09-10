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
import org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redelivery Policy Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getAllowRedeliveryWhileStopping <em>Allow Redelivery While Stopping</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getAsyncDelayedRedelivery <em>Async Delayed Redelivery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getBackOffMultiplier <em>Back Off Multiplier</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getCollisionAvoidanceFactor <em>Collision Avoidance Factor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getDelayPattern <em>Delay Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getDisableRedelivery <em>Disable Redelivery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getExchangeFormatterRef <em>Exchange Formatter Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getLogContinued <em>Log Continued</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getLogExhausted <em>Log Exhausted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getLogExhaustedMessageBody <em>Log Exhausted Message Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getLogExhaustedMessageHistory <em>Log Exhausted Message History</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getLogHandled <em>Log Handled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getLogNewException <em>Log New Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getLogRetryAttempted <em>Log Retry Attempted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getLogRetryStackTrace <em>Log Retry Stack Trace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getLogStackTrace <em>Log Stack Trace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getMaximumRedeliveries <em>Maximum Redeliveries</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getMaximumRedeliveryDelay <em>Maximum Redelivery Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getRedeliveryDelay <em>Redelivery Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getRetriesExhaustedLogLevel <em>Retries Exhausted Log Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getRetryAttemptedLogInterval <em>Retry Attempted Log Interval</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getRetryAttemptedLogLevel <em>Retry Attempted Log Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getUseCollisionAvoidance <em>Use Collision Avoidance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RedeliveryPolicyDefinitionImpl#getUseExponentialBackOff <em>Use Exponential Back Off</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedeliveryPolicyDefinitionImpl extends IdentifiedTypeImpl implements RedeliveryPolicyDefinition {
	/**
	 * The default value of the '{@link #getAllowRedeliveryWhileStopping() <em>Allow Redelivery While Stopping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowRedeliveryWhileStopping()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_REDELIVERY_WHILE_STOPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowRedeliveryWhileStopping() <em>Allow Redelivery While Stopping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowRedeliveryWhileStopping()
	 * @generated
	 * @ordered
	 */
	protected String allowRedeliveryWhileStopping = ALLOW_REDELIVERY_WHILE_STOPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsyncDelayedRedelivery() <em>Async Delayed Redelivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyncDelayedRedelivery()
	 * @generated
	 * @ordered
	 */
	protected static final String ASYNC_DELAYED_REDELIVERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsyncDelayedRedelivery() <em>Async Delayed Redelivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyncDelayedRedelivery()
	 * @generated
	 * @ordered
	 */
	protected String asyncDelayedRedelivery = ASYNC_DELAYED_REDELIVERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackOffMultiplier() <em>Back Off Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_OFF_MULTIPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackOffMultiplier() <em>Back Off Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackOffMultiplier()
	 * @generated
	 * @ordered
	 */
	protected String backOffMultiplier = BACK_OFF_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollisionAvoidanceFactor() <em>Collision Avoidance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisionAvoidanceFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLISION_AVOIDANCE_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollisionAvoidanceFactor() <em>Collision Avoidance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisionAvoidanceFactor()
	 * @generated
	 * @ordered
	 */
	protected String collisionAvoidanceFactor = COLLISION_AVOIDANCE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelayPattern() <em>Delay Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelayPattern() <em>Delay Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayPattern()
	 * @generated
	 * @ordered
	 */
	protected String delayPattern = DELAY_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisableRedelivery() <em>Disable Redelivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableRedelivery()
	 * @generated
	 * @ordered
	 */
	protected static final String DISABLE_REDELIVERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisableRedelivery() <em>Disable Redelivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableRedelivery()
	 * @generated
	 * @ordered
	 */
	protected String disableRedelivery = DISABLE_REDELIVERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExchangeFormatterRef() <em>Exchange Formatter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeFormatterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGE_FORMATTER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExchangeFormatterRef() <em>Exchange Formatter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeFormatterRef()
	 * @generated
	 * @ordered
	 */
	protected String exchangeFormatterRef = EXCHANGE_FORMATTER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogContinued() <em>Log Continued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogContinued()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_CONTINUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogContinued() <em>Log Continued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogContinued()
	 * @generated
	 * @ordered
	 */
	protected String logContinued = LOG_CONTINUED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogExhausted() <em>Log Exhausted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogExhausted()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_EXHAUSTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogExhausted() <em>Log Exhausted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogExhausted()
	 * @generated
	 * @ordered
	 */
	protected String logExhausted = LOG_EXHAUSTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogExhaustedMessageBody() <em>Log Exhausted Message Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogExhaustedMessageBody()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_EXHAUSTED_MESSAGE_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogExhaustedMessageBody() <em>Log Exhausted Message Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogExhaustedMessageBody()
	 * @generated
	 * @ordered
	 */
	protected String logExhaustedMessageBody = LOG_EXHAUSTED_MESSAGE_BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogExhaustedMessageHistory() <em>Log Exhausted Message History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogExhaustedMessageHistory()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_EXHAUSTED_MESSAGE_HISTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogExhaustedMessageHistory() <em>Log Exhausted Message History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogExhaustedMessageHistory()
	 * @generated
	 * @ordered
	 */
	protected String logExhaustedMessageHistory = LOG_EXHAUSTED_MESSAGE_HISTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogHandled() <em>Log Handled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogHandled()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_HANDLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogHandled() <em>Log Handled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogHandled()
	 * @generated
	 * @ordered
	 */
	protected String logHandled = LOG_HANDLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogNewException() <em>Log New Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogNewException()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_NEW_EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogNewException() <em>Log New Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogNewException()
	 * @generated
	 * @ordered
	 */
	protected String logNewException = LOG_NEW_EXCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogRetryAttempted() <em>Log Retry Attempted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRetryAttempted()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_RETRY_ATTEMPTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogRetryAttempted() <em>Log Retry Attempted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRetryAttempted()
	 * @generated
	 * @ordered
	 */
	protected String logRetryAttempted = LOG_RETRY_ATTEMPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogRetryStackTrace() <em>Log Retry Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRetryStackTrace()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_RETRY_STACK_TRACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogRetryStackTrace() <em>Log Retry Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRetryStackTrace()
	 * @generated
	 * @ordered
	 */
	protected String logRetryStackTrace = LOG_RETRY_STACK_TRACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogStackTrace() <em>Log Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogStackTrace()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_STACK_TRACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogStackTrace() <em>Log Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogStackTrace()
	 * @generated
	 * @ordered
	 */
	protected String logStackTrace = LOG_STACK_TRACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRedeliveries() <em>Maximum Redeliveries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRedeliveries()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_REDELIVERIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumRedeliveries() <em>Maximum Redeliveries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRedeliveries()
	 * @generated
	 * @ordered
	 */
	protected String maximumRedeliveries = MAXIMUM_REDELIVERIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRedeliveryDelay() <em>Maximum Redelivery Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRedeliveryDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_REDELIVERY_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumRedeliveryDelay() <em>Maximum Redelivery Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRedeliveryDelay()
	 * @generated
	 * @ordered
	 */
	protected String maximumRedeliveryDelay = MAXIMUM_REDELIVERY_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedeliveryDelay() <em>Redelivery Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String REDELIVERY_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedeliveryDelay() <em>Redelivery Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryDelay()
	 * @generated
	 * @ordered
	 */
	protected String redeliveryDelay = REDELIVERY_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetriesExhaustedLogLevel() <em>Retries Exhausted Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetriesExhaustedLogLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIES_EXHAUSTED_LOG_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetriesExhaustedLogLevel() <em>Retries Exhausted Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetriesExhaustedLogLevel()
	 * @generated
	 * @ordered
	 */
	protected String retriesExhaustedLogLevel = RETRIES_EXHAUSTED_LOG_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryAttemptedLogInterval() <em>Retry Attempted Log Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryAttemptedLogInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRY_ATTEMPTED_LOG_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetryAttemptedLogInterval() <em>Retry Attempted Log Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryAttemptedLogInterval()
	 * @generated
	 * @ordered
	 */
	protected String retryAttemptedLogInterval = RETRY_ATTEMPTED_LOG_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryAttemptedLogLevel() <em>Retry Attempted Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryAttemptedLogLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRY_ATTEMPTED_LOG_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetryAttemptedLogLevel() <em>Retry Attempted Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryAttemptedLogLevel()
	 * @generated
	 * @ordered
	 */
	protected String retryAttemptedLogLevel = RETRY_ATTEMPTED_LOG_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseCollisionAvoidance() <em>Use Collision Avoidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCollisionAvoidance()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_COLLISION_AVOIDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseCollisionAvoidance() <em>Use Collision Avoidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCollisionAvoidance()
	 * @generated
	 * @ordered
	 */
	protected String useCollisionAvoidance = USE_COLLISION_AVOIDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseExponentialBackOff() <em>Use Exponential Back Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseExponentialBackOff()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_EXPONENTIAL_BACK_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseExponentialBackOff() <em>Use Exponential Back Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseExponentialBackOff()
	 * @generated
	 * @ordered
	 */
	protected String useExponentialBackOff = USE_EXPONENTIAL_BACK_OFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedeliveryPolicyDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getRedeliveryPolicyDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowRedeliveryWhileStopping() {
		return allowRedeliveryWhileStopping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowRedeliveryWhileStopping(String newAllowRedeliveryWhileStopping) {
		String oldAllowRedeliveryWhileStopping = allowRedeliveryWhileStopping;
		allowRedeliveryWhileStopping = newAllowRedeliveryWhileStopping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__ALLOW_REDELIVERY_WHILE_STOPPING, oldAllowRedeliveryWhileStopping, allowRedeliveryWhileStopping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAsyncDelayedRedelivery() {
		return asyncDelayedRedelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsyncDelayedRedelivery(String newAsyncDelayedRedelivery) {
		String oldAsyncDelayedRedelivery = asyncDelayedRedelivery;
		asyncDelayedRedelivery = newAsyncDelayedRedelivery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__ASYNC_DELAYED_REDELIVERY, oldAsyncDelayedRedelivery, asyncDelayedRedelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackOffMultiplier() {
		return backOffMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackOffMultiplier(String newBackOffMultiplier) {
		String oldBackOffMultiplier = backOffMultiplier;
		backOffMultiplier = newBackOffMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__BACK_OFF_MULTIPLIER, oldBackOffMultiplier, backOffMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCollisionAvoidanceFactor() {
		return collisionAvoidanceFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollisionAvoidanceFactor(String newCollisionAvoidanceFactor) {
		String oldCollisionAvoidanceFactor = collisionAvoidanceFactor;
		collisionAvoidanceFactor = newCollisionAvoidanceFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__COLLISION_AVOIDANCE_FACTOR, oldCollisionAvoidanceFactor, collisionAvoidanceFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelayPattern() {
		return delayPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelayPattern(String newDelayPattern) {
		String oldDelayPattern = delayPattern;
		delayPattern = newDelayPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__DELAY_PATTERN, oldDelayPattern, delayPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisableRedelivery() {
		return disableRedelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisableRedelivery(String newDisableRedelivery) {
		String oldDisableRedelivery = disableRedelivery;
		disableRedelivery = newDisableRedelivery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__DISABLE_REDELIVERY, oldDisableRedelivery, disableRedelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExchangeFormatterRef() {
		return exchangeFormatterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExchangeFormatterRef(String newExchangeFormatterRef) {
		String oldExchangeFormatterRef = exchangeFormatterRef;
		exchangeFormatterRef = newExchangeFormatterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__EXCHANGE_FORMATTER_REF, oldExchangeFormatterRef, exchangeFormatterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogContinued() {
		return logContinued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogContinued(String newLogContinued) {
		String oldLogContinued = logContinued;
		logContinued = newLogContinued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_CONTINUED, oldLogContinued, logContinued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogExhausted() {
		return logExhausted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogExhausted(String newLogExhausted) {
		String oldLogExhausted = logExhausted;
		logExhausted = newLogExhausted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED, oldLogExhausted, logExhausted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogExhaustedMessageBody() {
		return logExhaustedMessageBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogExhaustedMessageBody(String newLogExhaustedMessageBody) {
		String oldLogExhaustedMessageBody = logExhaustedMessageBody;
		logExhaustedMessageBody = newLogExhaustedMessageBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED_MESSAGE_BODY, oldLogExhaustedMessageBody, logExhaustedMessageBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogExhaustedMessageHistory() {
		return logExhaustedMessageHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogExhaustedMessageHistory(String newLogExhaustedMessageHistory) {
		String oldLogExhaustedMessageHistory = logExhaustedMessageHistory;
		logExhaustedMessageHistory = newLogExhaustedMessageHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED_MESSAGE_HISTORY, oldLogExhaustedMessageHistory, logExhaustedMessageHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogHandled() {
		return logHandled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogHandled(String newLogHandled) {
		String oldLogHandled = logHandled;
		logHandled = newLogHandled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_HANDLED, oldLogHandled, logHandled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogNewException() {
		return logNewException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogNewException(String newLogNewException) {
		String oldLogNewException = logNewException;
		logNewException = newLogNewException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_NEW_EXCEPTION, oldLogNewException, logNewException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogRetryAttempted() {
		return logRetryAttempted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogRetryAttempted(String newLogRetryAttempted) {
		String oldLogRetryAttempted = logRetryAttempted;
		logRetryAttempted = newLogRetryAttempted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_ATTEMPTED, oldLogRetryAttempted, logRetryAttempted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogRetryStackTrace() {
		return logRetryStackTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogRetryStackTrace(String newLogRetryStackTrace) {
		String oldLogRetryStackTrace = logRetryStackTrace;
		logRetryStackTrace = newLogRetryStackTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_STACK_TRACE, oldLogRetryStackTrace, logRetryStackTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogStackTrace() {
		return logStackTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogStackTrace(String newLogStackTrace) {
		String oldLogStackTrace = logStackTrace;
		logStackTrace = newLogStackTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_STACK_TRACE, oldLogStackTrace, logStackTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaximumRedeliveries() {
		return maximumRedeliveries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumRedeliveries(String newMaximumRedeliveries) {
		String oldMaximumRedeliveries = maximumRedeliveries;
		maximumRedeliveries = newMaximumRedeliveries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERIES, oldMaximumRedeliveries, maximumRedeliveries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaximumRedeliveryDelay() {
		return maximumRedeliveryDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumRedeliveryDelay(String newMaximumRedeliveryDelay) {
		String oldMaximumRedeliveryDelay = maximumRedeliveryDelay;
		maximumRedeliveryDelay = newMaximumRedeliveryDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERY_DELAY, oldMaximumRedeliveryDelay, maximumRedeliveryDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRedeliveryDelay() {
		return redeliveryDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedeliveryDelay(String newRedeliveryDelay) {
		String oldRedeliveryDelay = redeliveryDelay;
		redeliveryDelay = newRedeliveryDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__REDELIVERY_DELAY, oldRedeliveryDelay, redeliveryDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRetriesExhaustedLogLevel() {
		return retriesExhaustedLogLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetriesExhaustedLogLevel(String newRetriesExhaustedLogLevel) {
		String oldRetriesExhaustedLogLevel = retriesExhaustedLogLevel;
		retriesExhaustedLogLevel = newRetriesExhaustedLogLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRIES_EXHAUSTED_LOG_LEVEL, oldRetriesExhaustedLogLevel, retriesExhaustedLogLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRetryAttemptedLogInterval() {
		return retryAttemptedLogInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryAttemptedLogInterval(String newRetryAttemptedLogInterval) {
		String oldRetryAttemptedLogInterval = retryAttemptedLogInterval;
		retryAttemptedLogInterval = newRetryAttemptedLogInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_INTERVAL, oldRetryAttemptedLogInterval, retryAttemptedLogInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRetryAttemptedLogLevel() {
		return retryAttemptedLogLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryAttemptedLogLevel(String newRetryAttemptedLogLevel) {
		String oldRetryAttemptedLogLevel = retryAttemptedLogLevel;
		retryAttemptedLogLevel = newRetryAttemptedLogLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_LEVEL, oldRetryAttemptedLogLevel, retryAttemptedLogLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseCollisionAvoidance() {
		return useCollisionAvoidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCollisionAvoidance(String newUseCollisionAvoidance) {
		String oldUseCollisionAvoidance = useCollisionAvoidance;
		useCollisionAvoidance = newUseCollisionAvoidance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__USE_COLLISION_AVOIDANCE, oldUseCollisionAvoidance, useCollisionAvoidance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseExponentialBackOff() {
		return useExponentialBackOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseExponentialBackOff(String newUseExponentialBackOff) {
		String oldUseExponentialBackOff = useExponentialBackOff;
		useExponentialBackOff = newUseExponentialBackOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__USE_EXPONENTIAL_BACK_OFF, oldUseExponentialBackOff, useExponentialBackOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__ALLOW_REDELIVERY_WHILE_STOPPING:
				return getAllowRedeliveryWhileStopping();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__ASYNC_DELAYED_REDELIVERY:
				return getAsyncDelayedRedelivery();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__BACK_OFF_MULTIPLIER:
				return getBackOffMultiplier();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__COLLISION_AVOIDANCE_FACTOR:
				return getCollisionAvoidanceFactor();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__DELAY_PATTERN:
				return getDelayPattern();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__DISABLE_REDELIVERY:
				return getDisableRedelivery();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__EXCHANGE_FORMATTER_REF:
				return getExchangeFormatterRef();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_CONTINUED:
				return getLogContinued();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED:
				return getLogExhausted();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED_MESSAGE_BODY:
				return getLogExhaustedMessageBody();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED_MESSAGE_HISTORY:
				return getLogExhaustedMessageHistory();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_HANDLED:
				return getLogHandled();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_NEW_EXCEPTION:
				return getLogNewException();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_ATTEMPTED:
				return getLogRetryAttempted();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_STACK_TRACE:
				return getLogRetryStackTrace();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_STACK_TRACE:
				return getLogStackTrace();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERIES:
				return getMaximumRedeliveries();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERY_DELAY:
				return getMaximumRedeliveryDelay();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__REDELIVERY_DELAY:
				return getRedeliveryDelay();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRIES_EXHAUSTED_LOG_LEVEL:
				return getRetriesExhaustedLogLevel();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_INTERVAL:
				return getRetryAttemptedLogInterval();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_LEVEL:
				return getRetryAttemptedLogLevel();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__USE_COLLISION_AVOIDANCE:
				return getUseCollisionAvoidance();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__USE_EXPONENTIAL_BACK_OFF:
				return getUseExponentialBackOff();
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
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__ALLOW_REDELIVERY_WHILE_STOPPING:
				setAllowRedeliveryWhileStopping((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__ASYNC_DELAYED_REDELIVERY:
				setAsyncDelayedRedelivery((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__BACK_OFF_MULTIPLIER:
				setBackOffMultiplier((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__COLLISION_AVOIDANCE_FACTOR:
				setCollisionAvoidanceFactor((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__DELAY_PATTERN:
				setDelayPattern((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__DISABLE_REDELIVERY:
				setDisableRedelivery((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__EXCHANGE_FORMATTER_REF:
				setExchangeFormatterRef((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_CONTINUED:
				setLogContinued((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED:
				setLogExhausted((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED_MESSAGE_BODY:
				setLogExhaustedMessageBody((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED_MESSAGE_HISTORY:
				setLogExhaustedMessageHistory((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_HANDLED:
				setLogHandled((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_NEW_EXCEPTION:
				setLogNewException((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_ATTEMPTED:
				setLogRetryAttempted((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_STACK_TRACE:
				setLogRetryStackTrace((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_STACK_TRACE:
				setLogStackTrace((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERIES:
				setMaximumRedeliveries((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERY_DELAY:
				setMaximumRedeliveryDelay((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__REDELIVERY_DELAY:
				setRedeliveryDelay((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRIES_EXHAUSTED_LOG_LEVEL:
				setRetriesExhaustedLogLevel((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_INTERVAL:
				setRetryAttemptedLogInterval((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_LEVEL:
				setRetryAttemptedLogLevel((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__USE_COLLISION_AVOIDANCE:
				setUseCollisionAvoidance((String)newValue);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__USE_EXPONENTIAL_BACK_OFF:
				setUseExponentialBackOff((String)newValue);
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
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__ALLOW_REDELIVERY_WHILE_STOPPING:
				setAllowRedeliveryWhileStopping(ALLOW_REDELIVERY_WHILE_STOPPING_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__ASYNC_DELAYED_REDELIVERY:
				setAsyncDelayedRedelivery(ASYNC_DELAYED_REDELIVERY_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__BACK_OFF_MULTIPLIER:
				setBackOffMultiplier(BACK_OFF_MULTIPLIER_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__COLLISION_AVOIDANCE_FACTOR:
				setCollisionAvoidanceFactor(COLLISION_AVOIDANCE_FACTOR_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__DELAY_PATTERN:
				setDelayPattern(DELAY_PATTERN_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__DISABLE_REDELIVERY:
				setDisableRedelivery(DISABLE_REDELIVERY_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__EXCHANGE_FORMATTER_REF:
				setExchangeFormatterRef(EXCHANGE_FORMATTER_REF_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_CONTINUED:
				setLogContinued(LOG_CONTINUED_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED:
				setLogExhausted(LOG_EXHAUSTED_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED_MESSAGE_BODY:
				setLogExhaustedMessageBody(LOG_EXHAUSTED_MESSAGE_BODY_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED_MESSAGE_HISTORY:
				setLogExhaustedMessageHistory(LOG_EXHAUSTED_MESSAGE_HISTORY_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_HANDLED:
				setLogHandled(LOG_HANDLED_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_NEW_EXCEPTION:
				setLogNewException(LOG_NEW_EXCEPTION_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_ATTEMPTED:
				setLogRetryAttempted(LOG_RETRY_ATTEMPTED_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_STACK_TRACE:
				setLogRetryStackTrace(LOG_RETRY_STACK_TRACE_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_STACK_TRACE:
				setLogStackTrace(LOG_STACK_TRACE_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERIES:
				setMaximumRedeliveries(MAXIMUM_REDELIVERIES_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERY_DELAY:
				setMaximumRedeliveryDelay(MAXIMUM_REDELIVERY_DELAY_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__REDELIVERY_DELAY:
				setRedeliveryDelay(REDELIVERY_DELAY_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRIES_EXHAUSTED_LOG_LEVEL:
				setRetriesExhaustedLogLevel(RETRIES_EXHAUSTED_LOG_LEVEL_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_INTERVAL:
				setRetryAttemptedLogInterval(RETRY_ATTEMPTED_LOG_INTERVAL_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_LEVEL:
				setRetryAttemptedLogLevel(RETRY_ATTEMPTED_LOG_LEVEL_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__USE_COLLISION_AVOIDANCE:
				setUseCollisionAvoidance(USE_COLLISION_AVOIDANCE_EDEFAULT);
				return;
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__USE_EXPONENTIAL_BACK_OFF:
				setUseExponentialBackOff(USE_EXPONENTIAL_BACK_OFF_EDEFAULT);
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
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__ALLOW_REDELIVERY_WHILE_STOPPING:
				return ALLOW_REDELIVERY_WHILE_STOPPING_EDEFAULT == null ? allowRedeliveryWhileStopping != null : !ALLOW_REDELIVERY_WHILE_STOPPING_EDEFAULT.equals(allowRedeliveryWhileStopping);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__ASYNC_DELAYED_REDELIVERY:
				return ASYNC_DELAYED_REDELIVERY_EDEFAULT == null ? asyncDelayedRedelivery != null : !ASYNC_DELAYED_REDELIVERY_EDEFAULT.equals(asyncDelayedRedelivery);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__BACK_OFF_MULTIPLIER:
				return BACK_OFF_MULTIPLIER_EDEFAULT == null ? backOffMultiplier != null : !BACK_OFF_MULTIPLIER_EDEFAULT.equals(backOffMultiplier);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__COLLISION_AVOIDANCE_FACTOR:
				return COLLISION_AVOIDANCE_FACTOR_EDEFAULT == null ? collisionAvoidanceFactor != null : !COLLISION_AVOIDANCE_FACTOR_EDEFAULT.equals(collisionAvoidanceFactor);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__DELAY_PATTERN:
				return DELAY_PATTERN_EDEFAULT == null ? delayPattern != null : !DELAY_PATTERN_EDEFAULT.equals(delayPattern);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__DISABLE_REDELIVERY:
				return DISABLE_REDELIVERY_EDEFAULT == null ? disableRedelivery != null : !DISABLE_REDELIVERY_EDEFAULT.equals(disableRedelivery);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__EXCHANGE_FORMATTER_REF:
				return EXCHANGE_FORMATTER_REF_EDEFAULT == null ? exchangeFormatterRef != null : !EXCHANGE_FORMATTER_REF_EDEFAULT.equals(exchangeFormatterRef);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_CONTINUED:
				return LOG_CONTINUED_EDEFAULT == null ? logContinued != null : !LOG_CONTINUED_EDEFAULT.equals(logContinued);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED:
				return LOG_EXHAUSTED_EDEFAULT == null ? logExhausted != null : !LOG_EXHAUSTED_EDEFAULT.equals(logExhausted);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED_MESSAGE_BODY:
				return LOG_EXHAUSTED_MESSAGE_BODY_EDEFAULT == null ? logExhaustedMessageBody != null : !LOG_EXHAUSTED_MESSAGE_BODY_EDEFAULT.equals(logExhaustedMessageBody);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_EXHAUSTED_MESSAGE_HISTORY:
				return LOG_EXHAUSTED_MESSAGE_HISTORY_EDEFAULT == null ? logExhaustedMessageHistory != null : !LOG_EXHAUSTED_MESSAGE_HISTORY_EDEFAULT.equals(logExhaustedMessageHistory);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_HANDLED:
				return LOG_HANDLED_EDEFAULT == null ? logHandled != null : !LOG_HANDLED_EDEFAULT.equals(logHandled);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_NEW_EXCEPTION:
				return LOG_NEW_EXCEPTION_EDEFAULT == null ? logNewException != null : !LOG_NEW_EXCEPTION_EDEFAULT.equals(logNewException);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_ATTEMPTED:
				return LOG_RETRY_ATTEMPTED_EDEFAULT == null ? logRetryAttempted != null : !LOG_RETRY_ATTEMPTED_EDEFAULT.equals(logRetryAttempted);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_RETRY_STACK_TRACE:
				return LOG_RETRY_STACK_TRACE_EDEFAULT == null ? logRetryStackTrace != null : !LOG_RETRY_STACK_TRACE_EDEFAULT.equals(logRetryStackTrace);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__LOG_STACK_TRACE:
				return LOG_STACK_TRACE_EDEFAULT == null ? logStackTrace != null : !LOG_STACK_TRACE_EDEFAULT.equals(logStackTrace);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERIES:
				return MAXIMUM_REDELIVERIES_EDEFAULT == null ? maximumRedeliveries != null : !MAXIMUM_REDELIVERIES_EDEFAULT.equals(maximumRedeliveries);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__MAXIMUM_REDELIVERY_DELAY:
				return MAXIMUM_REDELIVERY_DELAY_EDEFAULT == null ? maximumRedeliveryDelay != null : !MAXIMUM_REDELIVERY_DELAY_EDEFAULT.equals(maximumRedeliveryDelay);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__REDELIVERY_DELAY:
				return REDELIVERY_DELAY_EDEFAULT == null ? redeliveryDelay != null : !REDELIVERY_DELAY_EDEFAULT.equals(redeliveryDelay);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRIES_EXHAUSTED_LOG_LEVEL:
				return RETRIES_EXHAUSTED_LOG_LEVEL_EDEFAULT == null ? retriesExhaustedLogLevel != null : !RETRIES_EXHAUSTED_LOG_LEVEL_EDEFAULT.equals(retriesExhaustedLogLevel);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_INTERVAL:
				return RETRY_ATTEMPTED_LOG_INTERVAL_EDEFAULT == null ? retryAttemptedLogInterval != null : !RETRY_ATTEMPTED_LOG_INTERVAL_EDEFAULT.equals(retryAttemptedLogInterval);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__RETRY_ATTEMPTED_LOG_LEVEL:
				return RETRY_ATTEMPTED_LOG_LEVEL_EDEFAULT == null ? retryAttemptedLogLevel != null : !RETRY_ATTEMPTED_LOG_LEVEL_EDEFAULT.equals(retryAttemptedLogLevel);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__USE_COLLISION_AVOIDANCE:
				return USE_COLLISION_AVOIDANCE_EDEFAULT == null ? useCollisionAvoidance != null : !USE_COLLISION_AVOIDANCE_EDEFAULT.equals(useCollisionAvoidance);
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION__USE_EXPONENTIAL_BACK_OFF:
				return USE_EXPONENTIAL_BACK_OFF_EDEFAULT == null ? useExponentialBackOff != null : !USE_EXPONENTIAL_BACK_OFF_EDEFAULT.equals(useExponentialBackOff);
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
		result.append(" (allowRedeliveryWhileStopping: ");
		result.append(allowRedeliveryWhileStopping);
		result.append(", asyncDelayedRedelivery: ");
		result.append(asyncDelayedRedelivery);
		result.append(", backOffMultiplier: ");
		result.append(backOffMultiplier);
		result.append(", collisionAvoidanceFactor: ");
		result.append(collisionAvoidanceFactor);
		result.append(", delayPattern: ");
		result.append(delayPattern);
		result.append(", disableRedelivery: ");
		result.append(disableRedelivery);
		result.append(", exchangeFormatterRef: ");
		result.append(exchangeFormatterRef);
		result.append(", logContinued: ");
		result.append(logContinued);
		result.append(", logExhausted: ");
		result.append(logExhausted);
		result.append(", logExhaustedMessageBody: ");
		result.append(logExhaustedMessageBody);
		result.append(", logExhaustedMessageHistory: ");
		result.append(logExhaustedMessageHistory);
		result.append(", logHandled: ");
		result.append(logHandled);
		result.append(", logNewException: ");
		result.append(logNewException);
		result.append(", logRetryAttempted: ");
		result.append(logRetryAttempted);
		result.append(", logRetryStackTrace: ");
		result.append(logRetryStackTrace);
		result.append(", logStackTrace: ");
		result.append(logStackTrace);
		result.append(", maximumRedeliveries: ");
		result.append(maximumRedeliveries);
		result.append(", maximumRedeliveryDelay: ");
		result.append(maximumRedeliveryDelay);
		result.append(", redeliveryDelay: ");
		result.append(redeliveryDelay);
		result.append(", retriesExhaustedLogLevel: ");
		result.append(retriesExhaustedLogLevel);
		result.append(", retryAttemptedLogInterval: ");
		result.append(retryAttemptedLogInterval);
		result.append(", retryAttemptedLogLevel: ");
		result.append(retryAttemptedLogLevel);
		result.append(", useCollisionAvoidance: ");
		result.append(useCollisionAvoidance);
		result.append(", useExponentialBackOff: ");
		result.append(useExponentialBackOff);
		result.append(')');
		return result.toString();
	}

} //RedeliveryPolicyDefinitionImpl

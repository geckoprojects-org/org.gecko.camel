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
package org.eclipse.fennec.camel.camelspring;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redelivery Policy Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getAllowRedeliveryWhileStopping <em>Allow Redelivery While Stopping</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getAsyncDelayedRedelivery <em>Async Delayed Redelivery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getBackOffMultiplier <em>Back Off Multiplier</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getCollisionAvoidanceFactor <em>Collision Avoidance Factor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getDelayPattern <em>Delay Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getDisableRedelivery <em>Disable Redelivery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getExchangeFormatterRef <em>Exchange Formatter Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogContinued <em>Log Continued</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogExhausted <em>Log Exhausted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogExhaustedMessageBody <em>Log Exhausted Message Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogExhaustedMessageHistory <em>Log Exhausted Message History</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogHandled <em>Log Handled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogNewException <em>Log New Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogRetryAttempted <em>Log Retry Attempted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogRetryStackTrace <em>Log Retry Stack Trace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogStackTrace <em>Log Stack Trace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getMaximumRedeliveries <em>Maximum Redeliveries</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getMaximumRedeliveryDelay <em>Maximum Redelivery Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getRedeliveryDelay <em>Redelivery Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getRetriesExhaustedLogLevel <em>Retries Exhausted Log Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getRetryAttemptedLogInterval <em>Retry Attempted Log Interval</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getRetryAttemptedLogLevel <em>Retry Attempted Log Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getUseCollisionAvoidance <em>Use Collision Avoidance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getUseExponentialBackOff <em>Use Exponential Back Off</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition()
 * @model extendedMetaData="name='redeliveryPolicyDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface RedeliveryPolicyDefinition extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Allow Redelivery While Stopping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Controls whether to allow redelivery while stopping/shutting down a route that uses error handling. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Redelivery While Stopping</em>' attribute.
	 * @see #setAllowRedeliveryWhileStopping(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_AllowRedeliveryWhileStopping()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowRedeliveryWhileStopping'"
	 * @generated
	 */
	String getAllowRedeliveryWhileStopping();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getAllowRedeliveryWhileStopping <em>Allow Redelivery While Stopping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Redelivery While Stopping</em>' attribute.
	 * @see #getAllowRedeliveryWhileStopping()
	 * @generated
	 */
	void setAllowRedeliveryWhileStopping(String value);

	/**
	 * Returns the value of the '<em><b>Async Delayed Redelivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allow asynchronous delayed redelivery. The route, in particular the consumer's component, must support the Asynchronous
	 * Routing Engine (e.g. seda). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Async Delayed Redelivery</em>' attribute.
	 * @see #setAsyncDelayedRedelivery(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_AsyncDelayedRedelivery()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='asyncDelayedRedelivery'"
	 * @generated
	 */
	String getAsyncDelayedRedelivery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getAsyncDelayedRedelivery <em>Async Delayed Redelivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Async Delayed Redelivery</em>' attribute.
	 * @see #getAsyncDelayedRedelivery()
	 * @generated
	 */
	void setAsyncDelayedRedelivery(String value);

	/**
	 * Returns the value of the '<em><b>Back Off Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the back off multiplier. Default value: 2.0
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back Off Multiplier</em>' attribute.
	 * @see #setBackOffMultiplier(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_BackOffMultiplier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='backOffMultiplier'"
	 * @generated
	 */
	String getBackOffMultiplier();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getBackOffMultiplier <em>Back Off Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Off Multiplier</em>' attribute.
	 * @see #getBackOffMultiplier()
	 * @generated
	 */
	void setBackOffMultiplier(String value);

	/**
	 * Returns the value of the '<em><b>Collision Avoidance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the collision avoidance factor. Default value: 0.15
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collision Avoidance Factor</em>' attribute.
	 * @see #setCollisionAvoidanceFactor(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_CollisionAvoidanceFactor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='collisionAvoidanceFactor'"
	 * @generated
	 */
	String getCollisionAvoidanceFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getCollisionAvoidanceFactor <em>Collision Avoidance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collision Avoidance Factor</em>' attribute.
	 * @see #getCollisionAvoidanceFactor()
	 * @generated
	 */
	void setCollisionAvoidanceFactor(String value);

	/**
	 * Returns the value of the '<em><b>Delay Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the delay pattern with delay intervals.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay Pattern</em>' attribute.
	 * @see #setDelayPattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_DelayPattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delayPattern'"
	 * @generated
	 */
	String getDelayPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getDelayPattern <em>Delay Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Pattern</em>' attribute.
	 * @see #getDelayPattern()
	 * @generated
	 */
	void setDelayPattern(String value);

	/**
	 * Returns the value of the '<em><b>Disable Redelivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Disables redelivery (same as setting maximum redeliveries to 0). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disable Redelivery</em>' attribute.
	 * @see #setDisableRedelivery(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_DisableRedelivery()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='disableRedelivery'"
	 * @generated
	 */
	String getDisableRedelivery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getDisableRedelivery <em>Disable Redelivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Redelivery</em>' attribute.
	 * @see #getDisableRedelivery()
	 * @generated
	 */
	void setDisableRedelivery(String value);

	/**
	 * Returns the value of the '<em><b>Exchange Formatter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the reference of the instance of org.apache.camel.spi.ExchangeFormatter to generate the log message from exchange.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Formatter Ref</em>' attribute.
	 * @see #setExchangeFormatterRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_ExchangeFormatterRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exchangeFormatterRef'"
	 * @generated
	 */
	String getExchangeFormatterRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getExchangeFormatterRef <em>Exchange Formatter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Formatter Ref</em>' attribute.
	 * @see #getExchangeFormatterRef()
	 * @generated
	 */
	void setExchangeFormatterRef(String value);

	/**
	 * Returns the value of the '<em><b>Log Continued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether continued exceptions should be logged or not. Can be used to include or reduce verbose. Default value:
	 * false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Continued</em>' attribute.
	 * @see #setLogContinued(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_LogContinued()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logContinued'"
	 * @generated
	 */
	String getLogContinued();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogContinued <em>Log Continued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Continued</em>' attribute.
	 * @see #getLogContinued()
	 * @generated
	 */
	void setLogContinued(String value);

	/**
	 * Returns the value of the '<em><b>Log Exhausted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether exhausted exceptions should be logged or not. Can be used to include or reduce verbose. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Exhausted</em>' attribute.
	 * @see #setLogExhausted(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_LogExhausted()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logExhausted'"
	 * @generated
	 */
	String getLogExhausted();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogExhausted <em>Log Exhausted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Exhausted</em>' attribute.
	 * @see #getLogExhausted()
	 * @generated
	 */
	void setLogExhausted(String value);

	/**
	 * Returns the value of the '<em><b>Log Exhausted Message Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether exhausted message body should be logged including message history or not (supports property placeholders).
	 * Can be used to include or reduce verbose. Requires logExhaustedMessageHistory to be enabled. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Exhausted Message Body</em>' attribute.
	 * @see #setLogExhaustedMessageBody(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_LogExhaustedMessageBody()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logExhaustedMessageBody'"
	 * @generated
	 */
	String getLogExhaustedMessageBody();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogExhaustedMessageBody <em>Log Exhausted Message Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Exhausted Message Body</em>' attribute.
	 * @see #getLogExhaustedMessageBody()
	 * @generated
	 */
	void setLogExhaustedMessageBody(String value);

	/**
	 * Returns the value of the '<em><b>Log Exhausted Message History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether exhausted exceptions should be logged including message history or not (supports property placeholders).
	 * Can be used to include or reduce verbose. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Exhausted Message History</em>' attribute.
	 * @see #setLogExhaustedMessageHistory(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_LogExhaustedMessageHistory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logExhaustedMessageHistory'"
	 * @generated
	 */
	String getLogExhaustedMessageHistory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogExhaustedMessageHistory <em>Log Exhausted Message History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Exhausted Message History</em>' attribute.
	 * @see #getLogExhaustedMessageHistory()
	 * @generated
	 */
	void setLogExhaustedMessageHistory(String value);

	/**
	 * Returns the value of the '<em><b>Log Handled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether handled exceptions should be logged or not. Can be used to include or reduce verbose. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Handled</em>' attribute.
	 * @see #setLogHandled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_LogHandled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logHandled'"
	 * @generated
	 */
	String getLogHandled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogHandled <em>Log Handled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Handled</em>' attribute.
	 * @see #getLogHandled()
	 * @generated
	 */
	void setLogHandled(String value);

	/**
	 * Returns the value of the '<em><b>Log New Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether new exceptions should be logged or not. Can be used to include or reduce verbose. A new exception is an
	 * exception that was thrown while handling a previous exception. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log New Exception</em>' attribute.
	 * @see #setLogNewException(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_LogNewException()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logNewException'"
	 * @generated
	 */
	String getLogNewException();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogNewException <em>Log New Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log New Exception</em>' attribute.
	 * @see #getLogNewException()
	 * @generated
	 */
	void setLogNewException(String value);

	/**
	 * Returns the value of the '<em><b>Log Retry Attempted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether retry attempts should be logged or not. Can be used to include or reduce verbose. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Retry Attempted</em>' attribute.
	 * @see #setLogRetryAttempted(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_LogRetryAttempted()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logRetryAttempted'"
	 * @generated
	 */
	String getLogRetryAttempted();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogRetryAttempted <em>Log Retry Attempted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Retry Attempted</em>' attribute.
	 * @see #getLogRetryAttempted()
	 * @generated
	 */
	void setLogRetryAttempted(String value);

	/**
	 * Returns the value of the '<em><b>Log Retry Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether stack traces should be logged when an retry attempt failed. Can be used to include or reduce verbose.
	 * Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Retry Stack Trace</em>' attribute.
	 * @see #setLogRetryStackTrace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_LogRetryStackTrace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logRetryStackTrace'"
	 * @generated
	 */
	String getLogRetryStackTrace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogRetryStackTrace <em>Log Retry Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Retry Stack Trace</em>' attribute.
	 * @see #getLogRetryStackTrace()
	 * @generated
	 */
	void setLogRetryStackTrace(String value);

	/**
	 * Returns the value of the '<em><b>Log Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether stack traces should be logged. Can be used to include or reduce verbose. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Stack Trace</em>' attribute.
	 * @see #setLogStackTrace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_LogStackTrace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logStackTrace'"
	 * @generated
	 */
	String getLogStackTrace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getLogStackTrace <em>Log Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Stack Trace</em>' attribute.
	 * @see #getLogStackTrace()
	 * @generated
	 */
	void setLogStackTrace(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Redeliveries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum redeliveries x = redeliver at most x times 0 = no redeliveries -1 = redeliver forever.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Redeliveries</em>' attribute.
	 * @see #setMaximumRedeliveries(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_MaximumRedeliveries()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maximumRedeliveries'"
	 * @generated
	 */
	String getMaximumRedeliveries();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getMaximumRedeliveries <em>Maximum Redeliveries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Redeliveries</em>' attribute.
	 * @see #getMaximumRedeliveries()
	 * @generated
	 */
	void setMaximumRedeliveries(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Redelivery Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum delay between redelivery. Default value: 60000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Redelivery Delay</em>' attribute.
	 * @see #setMaximumRedeliveryDelay(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_MaximumRedeliveryDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maximumRedeliveryDelay'"
	 * @generated
	 */
	String getMaximumRedeliveryDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getMaximumRedeliveryDelay <em>Maximum Redelivery Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Redelivery Delay</em>' attribute.
	 * @see #getMaximumRedeliveryDelay()
	 * @generated
	 */
	void setMaximumRedeliveryDelay(String value);

	/**
	 * Returns the value of the '<em><b>Redelivery Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the initial redelivery delay. Default value: 1000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redelivery Delay</em>' attribute.
	 * @see #setRedeliveryDelay(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_RedeliveryDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redeliveryDelay'"
	 * @generated
	 */
	String getRedeliveryDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getRedeliveryDelay <em>Redelivery Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redelivery Delay</em>' attribute.
	 * @see #getRedeliveryDelay()
	 * @generated
	 */
	void setRedeliveryDelay(String value);

	/**
	 * Returns the value of the '<em><b>Retries Exhausted Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the logging level to use when retries have been exhausted. Default value: ERROR
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retries Exhausted Log Level</em>' attribute.
	 * @see #setRetriesExhaustedLogLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_RetriesExhaustedLogLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='retriesExhaustedLogLevel'"
	 * @generated
	 */
	String getRetriesExhaustedLogLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getRetriesExhaustedLogLevel <em>Retries Exhausted Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retries Exhausted Log Level</em>' attribute.
	 * @see #getRetriesExhaustedLogLevel()
	 * @generated
	 */
	void setRetriesExhaustedLogLevel(String value);

	/**
	 * Returns the value of the '<em><b>Retry Attempted Log Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the interval to use for logging retry attempts. Default value: 1
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Attempted Log Interval</em>' attribute.
	 * @see #setRetryAttemptedLogInterval(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_RetryAttemptedLogInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='retryAttemptedLogInterval'"
	 * @generated
	 */
	String getRetryAttemptedLogInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getRetryAttemptedLogInterval <em>Retry Attempted Log Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Attempted Log Interval</em>' attribute.
	 * @see #getRetryAttemptedLogInterval()
	 * @generated
	 */
	void setRetryAttemptedLogInterval(String value);

	/**
	 * Returns the value of the '<em><b>Retry Attempted Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the logging level to use for logging retry attempts. Default value: DEBUG
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Attempted Log Level</em>' attribute.
	 * @see #setRetryAttemptedLogLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_RetryAttemptedLogLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='retryAttemptedLogLevel'"
	 * @generated
	 */
	String getRetryAttemptedLogLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getRetryAttemptedLogLevel <em>Retry Attempted Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Attempted Log Level</em>' attribute.
	 * @see #getRetryAttemptedLogLevel()
	 * @generated
	 */
	void setRetryAttemptedLogLevel(String value);

	/**
	 * Returns the value of the '<em><b>Use Collision Avoidance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Turn on collision avoidance. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Collision Avoidance</em>' attribute.
	 * @see #setUseCollisionAvoidance(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_UseCollisionAvoidance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useCollisionAvoidance'"
	 * @generated
	 */
	String getUseCollisionAvoidance();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getUseCollisionAvoidance <em>Use Collision Avoidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Collision Avoidance</em>' attribute.
	 * @see #getUseCollisionAvoidance()
	 * @generated
	 */
	void setUseCollisionAvoidance(String value);

	/**
	 * Returns the value of the '<em><b>Use Exponential Back Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Turn on exponential back off. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Exponential Back Off</em>' attribute.
	 * @see #setUseExponentialBackOff(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRedeliveryPolicyDefinition_UseExponentialBackOff()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useExponentialBackOff'"
	 * @generated
	 */
	String getUseExponentialBackOff();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition#getUseExponentialBackOff <em>Use Exponential Back Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Exponential Back Off</em>' attribute.
	 * @see #getUseExponentialBackOff()
	 * @generated
	 */
	void setUseExponentialBackOff(String value);

} // RedeliveryPolicyDefinition

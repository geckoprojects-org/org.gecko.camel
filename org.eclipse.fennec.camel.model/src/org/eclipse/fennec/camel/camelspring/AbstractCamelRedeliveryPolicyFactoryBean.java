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
 * A representation of the model object '<em><b>Abstract Camel Redelivery Policy Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getAllowRedeliveryWhileStopping <em>Allow Redelivery While Stopping</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getAsyncDelayedRedelivery <em>Async Delayed Redelivery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getBackOffMultiplier <em>Back Off Multiplier</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getCollisionAvoidanceFactor <em>Collision Avoidance Factor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getDelayPattern <em>Delay Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getDisableRedelivery <em>Disable Redelivery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getExchangeFormatterRef <em>Exchange Formatter Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogContinued <em>Log Continued</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogExhausted <em>Log Exhausted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogExhaustedMessageBody <em>Log Exhausted Message Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogExhaustedMessageHistory <em>Log Exhausted Message History</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogHandled <em>Log Handled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogNewException <em>Log New Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogRetryAttempted <em>Log Retry Attempted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogRetryStackTrace <em>Log Retry Stack Trace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogStackTrace <em>Log Stack Trace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getMaximumRedeliveries <em>Maximum Redeliveries</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getMaximumRedeliveryDelay <em>Maximum Redelivery Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getRedeliveryDelay <em>Redelivery Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getRetriesExhaustedLogLevel <em>Retries Exhausted Log Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getRetryAttemptedLogInterval <em>Retry Attempted Log Interval</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getRetryAttemptedLogLevel <em>Retry Attempted Log Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getUseCollisionAvoidance <em>Use Collision Avoidance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getUseExponentialBackOff <em>Use Exponential Back Off</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractCamelRedeliveryPolicyFactoryBean' kind='empty'"
 * @generated
 */
@ProviderType
public interface AbstractCamelRedeliveryPolicyFactoryBean extends AbstractCamelFactoryBean {
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_AllowRedeliveryWhileStopping()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowRedeliveryWhileStopping'"
	 * @generated
	 */
	String getAllowRedeliveryWhileStopping();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getAllowRedeliveryWhileStopping <em>Allow Redelivery While Stopping</em>}' attribute.
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
	 * Sets whether asynchronous delayed redelivery is allowed. This is disabled by default. When enabled it allows Camel to
	 * schedule a future task for delayed redelivery which prevents current thread from blocking while waiting. Exchange which
	 * is transacted will however always use synchronous delayed redelivery because the transaction must execute in the same
	 * thread context. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Async Delayed Redelivery</em>' attribute.
	 * @see #setAsyncDelayedRedelivery(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_AsyncDelayedRedelivery()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='asyncDelayedRedelivery'"
	 * @generated
	 */
	String getAsyncDelayedRedelivery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getAsyncDelayedRedelivery <em>Async Delayed Redelivery</em>}' attribute.
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
	 * Sets the multiplier used to increase the delay between redeliveries if useExponentialBackOff is enabled. Default value:
	 * 2
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back Off Multiplier</em>' attribute.
	 * @see #setBackOffMultiplier(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_BackOffMultiplier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='backOffMultiplier'"
	 * @generated
	 */
	String getBackOffMultiplier();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getBackOffMultiplier <em>Back Off Multiplier</em>}' attribute.
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
	 * Sets the factor used for collision avoidance if enabled via useCollisionAvoidance. Default value: 0.15
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collision Avoidance Factor</em>' attribute.
	 * @see #setCollisionAvoidanceFactor(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_CollisionAvoidanceFactor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='collisionAvoidanceFactor'"
	 * @generated
	 */
	String getCollisionAvoidanceFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getCollisionAvoidanceFactor <em>Collision Avoidance Factor</em>}' attribute.
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
	 * Sets an optional delay pattern to use instead of fixed delay.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay Pattern</em>' attribute.
	 * @see #setDelayPattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_DelayPattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delayPattern'"
	 * @generated
	 */
	String getDelayPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getDelayPattern <em>Delay Pattern</em>}' attribute.
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
	 * Disables redelivery by setting maximum redeliveries to 0. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disable Redelivery</em>' attribute.
	 * @see #setDisableRedelivery(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_DisableRedelivery()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='disableRedelivery'"
	 * @generated
	 */
	String getDisableRedelivery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getDisableRedelivery <em>Disable Redelivery</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_ExchangeFormatterRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exchangeFormatterRef'"
	 * @generated
	 */
	String getExchangeFormatterRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getExchangeFormatterRef <em>Exchange Formatter Ref</em>}' attribute.
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
	 * Sets whether errors should be logged even if its continued. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Continued</em>' attribute.
	 * @see #setLogContinued(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogContinued()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logContinued'"
	 * @generated
	 */
	String getLogContinued();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogContinued <em>Log Continued</em>}' attribute.
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
	 * Sets whether exhausted exceptions should be logged or not. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Exhausted</em>' attribute.
	 * @see #setLogExhausted(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogExhausted()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logExhausted'"
	 * @generated
	 */
	String getLogExhausted();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogExhausted <em>Log Exhausted</em>}' attribute.
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
	 * Sets whether exhausted message body/headers should be logged with message history included. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Exhausted Message Body</em>' attribute.
	 * @see #setLogExhaustedMessageBody(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogExhaustedMessageBody()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logExhaustedMessageBody'"
	 * @generated
	 */
	String getLogExhaustedMessageBody();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogExhaustedMessageBody <em>Log Exhausted Message Body</em>}' attribute.
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
	 * Sets whether to log exhausted errors including message history. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Exhausted Message History</em>' attribute.
	 * @see #setLogExhaustedMessageHistory(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogExhaustedMessageHistory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logExhaustedMessageHistory'"
	 * @generated
	 */
	String getLogExhaustedMessageHistory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogExhaustedMessageHistory <em>Log Exhausted Message History</em>}' attribute.
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
	 * Sets whether errors should be logged even if its handled. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Handled</em>' attribute.
	 * @see #setLogHandled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogHandled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logHandled'"
	 * @generated
	 */
	String getLogHandled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogHandled <em>Log Handled</em>}' attribute.
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
	 * Sets whether errors should be logged when a new exception occurred during handling a previous exception. Default value:
	 * true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log New Exception</em>' attribute.
	 * @see #setLogNewException(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogNewException()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logNewException'"
	 * @generated
	 */
	String getLogNewException();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogNewException <em>Log New Exception</em>}' attribute.
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
	 * Sets whether to log retry attempts. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Retry Attempted</em>' attribute.
	 * @see #setLogRetryAttempted(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogRetryAttempted()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logRetryAttempted'"
	 * @generated
	 */
	String getLogRetryAttempted();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogRetryAttempted <em>Log Retry Attempted</em>}' attribute.
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
	 * Sets whether stack traces should be logged or not. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Retry Stack Trace</em>' attribute.
	 * @see #setLogRetryStackTrace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogRetryStackTrace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logRetryStackTrace'"
	 * @generated
	 */
	String getLogRetryStackTrace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogRetryStackTrace <em>Log Retry Stack Trace</em>}' attribute.
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
	 * Sets whether stack traces should be logged or not. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Stack Trace</em>' attribute.
	 * @see #setLogStackTrace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_LogStackTrace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logStackTrace'"
	 * @generated
	 */
	String getLogStackTrace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getLogStackTrace <em>Log Stack Trace</em>}' attribute.
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
	 * Sets the maximum number of times a message exchange will be redelivered. Setting a negative value will retry forever.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Redeliveries</em>' attribute.
	 * @see #setMaximumRedeliveries(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_MaximumRedeliveries()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maximumRedeliveries'"
	 * @generated
	 */
	String getMaximumRedeliveries();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getMaximumRedeliveries <em>Maximum Redeliveries</em>}' attribute.
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
	 * Sets the maximum redelivery delay. Use -1 if you wish to have no maximum. Default value: 60000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Redelivery Delay</em>' attribute.
	 * @see #setMaximumRedeliveryDelay(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_MaximumRedeliveryDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maximumRedeliveryDelay'"
	 * @generated
	 */
	String getMaximumRedeliveryDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getMaximumRedeliveryDelay <em>Maximum Redelivery Delay</em>}' attribute.
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
	 * Sets the maximum redelivery delay. Use -1 if you wish to have no maximum. Default value: 1000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redelivery Delay</em>' attribute.
	 * @see #setRedeliveryDelay(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_RedeliveryDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redeliveryDelay'"
	 * @generated
	 */
	String getRedeliveryDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getRedeliveryDelay <em>Redelivery Delay</em>}' attribute.
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
	 * Sets the logging level to use for log messages when retries have been exhausted. Default value: ERROR
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retries Exhausted Log Level</em>' attribute.
	 * @see #setRetriesExhaustedLogLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_RetriesExhaustedLogLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='retriesExhaustedLogLevel'"
	 * @generated
	 */
	String getRetriesExhaustedLogLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getRetriesExhaustedLogLevel <em>Retries Exhausted Log Level</em>}' attribute.
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
	 * Sets the interval for log messages when retries are attempted. Default value: 0
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Attempted Log Interval</em>' attribute.
	 * @see #setRetryAttemptedLogInterval(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_RetryAttemptedLogInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='retryAttemptedLogInterval'"
	 * @generated
	 */
	String getRetryAttemptedLogInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getRetryAttemptedLogInterval <em>Retry Attempted Log Interval</em>}' attribute.
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
	 * Sets the logging level to use for log messages when retries are attempted. Default value: DEBUG
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Attempted Log Level</em>' attribute.
	 * @see #setRetryAttemptedLogLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_RetryAttemptedLogLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='retryAttemptedLogLevel'"
	 * @generated
	 */
	String getRetryAttemptedLogLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getRetryAttemptedLogLevel <em>Retry Attempted Log Level</em>}' attribute.
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
	 * Enables/disables collision avoidance which adds some randomization to the backoff timings to reduce contention
	 * probability. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Collision Avoidance</em>' attribute.
	 * @see #setUseCollisionAvoidance(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_UseCollisionAvoidance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useCollisionAvoidance'"
	 * @generated
	 */
	String getUseCollisionAvoidance();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getUseCollisionAvoidance <em>Use Collision Avoidance</em>}' attribute.
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
	 * Enables/disables exponential backoff using the backOffMultiplier to increase the time between retries. Default value:
	 * false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Exponential Back Off</em>' attribute.
	 * @see #setUseExponentialBackOff(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelRedeliveryPolicyFactoryBean_UseExponentialBackOff()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useExponentialBackOff'"
	 * @generated
	 */
	String getUseExponentialBackOff();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean#getUseExponentialBackOff <em>Use Exponential Back Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Exponential Back Off</em>' attribute.
	 * @see #getUseExponentialBackOff()
	 * @generated
	 */
	void setUseExponentialBackOff(String value);

} // AbstractCamelRedeliveryPolicyFactoryBean

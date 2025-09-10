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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resilience4 JConfiguration Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getRecordException <em>Record Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getIgnoreException <em>Ignore Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getAutomaticTransitionFromOpenToHalfOpenEnabled <em>Automatic Transition From Open To Half Open Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getBulkheadEnabled <em>Bulkhead Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getBulkheadMaxConcurrentCalls <em>Bulkhead Max Concurrent Calls</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getBulkheadMaxWaitDuration <em>Bulkhead Max Wait Duration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getConfig <em>Config</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getFailureRateThreshold <em>Failure Rate Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getMinimumNumberOfCalls <em>Minimum Number Of Calls</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getPermittedNumberOfCallsInHalfOpenState <em>Permitted Number Of Calls In Half Open State</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getSlidingWindowSize <em>Sliding Window Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getSlidingWindowType <em>Sliding Window Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getSlowCallDurationThreshold <em>Slow Call Duration Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getSlowCallRateThreshold <em>Slow Call Rate Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getThrowExceptionWhenHalfOpenOrOpenState <em>Throw Exception When Half Open Or Open State</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getTimeoutCancelRunningFuture <em>Timeout Cancel Running Future</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getTimeoutDuration <em>Timeout Duration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getTimeoutEnabled <em>Timeout Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getTimeoutExecutorService <em>Timeout Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getWaitDurationInOpenState <em>Wait Duration In Open State</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getWritableStackTraceEnabled <em>Writable Stack Trace Enabled</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon()
 * @model extendedMetaData="name='resilience4JConfigurationCommon' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Resilience4JConfigurationCommon extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Record Exception</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configure a list of exceptions that are recorded as a failure and thus increase the failure rate. Any exception matching
	 * or inheriting from one of the list counts as a failure, unless explicitly ignored via ignoreExceptions.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Exception</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_RecordException()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='recordException' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getRecordException();

	/**
	 * Returns the value of the '<em><b>Ignore Exception</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configure a list of exceptions that are ignored and neither count as a failure nor success. Any exception matching or
	 * inheriting from one of the list will not count as a failure nor success, even if the exceptions is part of
	 * recordExceptions.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Exception</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_IgnoreException()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ignoreException' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getIgnoreException();

	/**
	 * Returns the value of the '<em><b>Automatic Transition From Open To Half Open Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enables automatic transition from OPEN to HALF_OPEN state once the waitDurationInOpenState has passed. Default value:
	 * false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Transition From Open To Half Open Enabled</em>' attribute.
	 * @see #setAutomaticTransitionFromOpenToHalfOpenEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_AutomaticTransitionFromOpenToHalfOpenEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='automaticTransitionFromOpenToHalfOpenEnabled'"
	 * @generated
	 */
	String getAutomaticTransitionFromOpenToHalfOpenEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getAutomaticTransitionFromOpenToHalfOpenEnabled <em>Automatic Transition From Open To Half Open Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Transition From Open To Half Open Enabled</em>' attribute.
	 * @see #getAutomaticTransitionFromOpenToHalfOpenEnabled()
	 * @generated
	 */
	void setAutomaticTransitionFromOpenToHalfOpenEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Bulkhead Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether bulkhead is enabled or not on the circuit breaker. Default is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bulkhead Enabled</em>' attribute.
	 * @see #setBulkheadEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_BulkheadEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bulkheadEnabled'"
	 * @generated
	 */
	String getBulkheadEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getBulkheadEnabled <em>Bulkhead Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulkhead Enabled</em>' attribute.
	 * @see #getBulkheadEnabled()
	 * @generated
	 */
	void setBulkheadEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Bulkhead Max Concurrent Calls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the max amount of concurrent calls the bulkhead will support. Default value: 25
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bulkhead Max Concurrent Calls</em>' attribute.
	 * @see #setBulkheadMaxConcurrentCalls(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_BulkheadMaxConcurrentCalls()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bulkheadMaxConcurrentCalls'"
	 * @generated
	 */
	String getBulkheadMaxConcurrentCalls();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getBulkheadMaxConcurrentCalls <em>Bulkhead Max Concurrent Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulkhead Max Concurrent Calls</em>' attribute.
	 * @see #getBulkheadMaxConcurrentCalls()
	 * @generated
	 */
	void setBulkheadMaxConcurrentCalls(String value);

	/**
	 * Returns the value of the '<em><b>Bulkhead Max Wait Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures a maximum amount of time which the calling thread will wait to enter the bulkhead. If bulkhead has space
	 * available, entry is guaranteed and immediate. If bulkhead is full, calling threads will contest for space, if it becomes
	 * available. maxWaitDuration can be set to 0. Note: for threads running on an event-loop or equivalent (rx computation
	 * pool, etc), setting maxWaitDuration to 0 is highly recommended. Blocking an event-loop thread will most likely have a
	 * negative effect on application throughput. Default value: 0
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bulkhead Max Wait Duration</em>' attribute.
	 * @see #setBulkheadMaxWaitDuration(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_BulkheadMaxWaitDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bulkheadMaxWaitDuration'"
	 * @generated
	 */
	String getBulkheadMaxWaitDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getBulkheadMaxWaitDuration <em>Bulkhead Max Wait Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulkhead Max Wait Duration</em>' attribute.
	 * @see #getBulkheadMaxWaitDuration()
	 * @generated
	 */
	void setBulkheadMaxWaitDuration(String value);

	/**
	 * Returns the value of the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to an existing io.github.resilience4j.circuitbreaker.CircuitBreaker instance to lookup and use from the registry.
	 * When using this, then any other circuit breaker options are not in use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circuit Breaker</em>' attribute.
	 * @see #setCircuitBreaker(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_CircuitBreaker()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='circuitBreaker'"
	 * @generated
	 */
	String getCircuitBreaker();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getCircuitBreaker <em>Circuit Breaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Breaker</em>' attribute.
	 * @see #getCircuitBreaker()
	 * @generated
	 */
	void setCircuitBreaker(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to an existing io.github.resilience4j.circuitbreaker.CircuitBreakerConfig instance to lookup and use from the
	 * registry.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_Config()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='config'"
	 * @generated
	 */
	String getConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(String value);

	/**
	 * Returns the value of the '<em><b>Failure Rate Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the failure rate threshold in percentage. If the failure rate is equal or greater than the threshold the
	 * CircuitBreaker transitions to open and starts short-circuiting calls. The threshold must be greater than 0 and not
	 * greater than 100. Default value is 50 percentage. Default value: 50
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Rate Threshold</em>' attribute.
	 * @see #setFailureRateThreshold(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_FailureRateThreshold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='failureRateThreshold'"
	 * @generated
	 */
	String getFailureRateThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getFailureRateThreshold <em>Failure Rate Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Rate Threshold</em>' attribute.
	 * @see #getFailureRateThreshold()
	 * @generated
	 */
	void setFailureRateThreshold(String value);

	/**
	 * Returns the value of the '<em><b>Minimum Number Of Calls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the minimum number of calls which are required (per sliding window period) before the CircuitBreaker can
	 * calculate the error rate. For example, if minimumNumberOfCalls is 10, then at least 10 calls must be recorded, before
	 * the failure rate can be calculated. If only 9 calls have been recorded the CircuitBreaker will not transition to open
	 * even if all 9 calls have failed. Default minimumNumberOfCalls is 100. Default value: 100
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Number Of Calls</em>' attribute.
	 * @see #setMinimumNumberOfCalls(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_MinimumNumberOfCalls()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='minimumNumberOfCalls'"
	 * @generated
	 */
	String getMinimumNumberOfCalls();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getMinimumNumberOfCalls <em>Minimum Number Of Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Number Of Calls</em>' attribute.
	 * @see #getMinimumNumberOfCalls()
	 * @generated
	 */
	void setMinimumNumberOfCalls(String value);

	/**
	 * Returns the value of the '<em><b>Permitted Number Of Calls In Half Open State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the number of permitted calls when the CircuitBreaker is half open. The size must be greater than 0. Default
	 * size is 10. Default value: 10
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permitted Number Of Calls In Half Open State</em>' attribute.
	 * @see #setPermittedNumberOfCallsInHalfOpenState(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_PermittedNumberOfCallsInHalfOpenState()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='permittedNumberOfCallsInHalfOpenState'"
	 * @generated
	 */
	String getPermittedNumberOfCallsInHalfOpenState();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getPermittedNumberOfCallsInHalfOpenState <em>Permitted Number Of Calls In Half Open State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permitted Number Of Calls In Half Open State</em>' attribute.
	 * @see #getPermittedNumberOfCallsInHalfOpenState()
	 * @generated
	 */
	void setPermittedNumberOfCallsInHalfOpenState(String value);

	/**
	 * Returns the value of the '<em><b>Sliding Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the size of the sliding window which is used to record the outcome of calls when the CircuitBreaker is
	 * closed. slidingWindowSize configures the size of the sliding window. Sliding window can either be count-based or
	 * time-based. If slidingWindowType is COUNT_BASED, the last slidingWindowSize calls are recorded and aggregated. If
	 * slidingWindowType is TIME_BASED, the calls of the last slidingWindowSize seconds are recorded and aggregated. The
	 * slidingWindowSize must be greater than 0. The minimumNumberOfCalls must be greater than 0. If the slidingWindowType is
	 * COUNT_BASED, the minimumNumberOfCalls cannot be greater than slidingWindowSize . If the slidingWindowType is TIME_BASED,
	 * you can pick whatever you want. Default slidingWindowSize is 100. Default value: 100
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sliding Window Size</em>' attribute.
	 * @see #setSlidingWindowSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_SlidingWindowSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='slidingWindowSize'"
	 * @generated
	 */
	String getSlidingWindowSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getSlidingWindowSize <em>Sliding Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sliding Window Size</em>' attribute.
	 * @see #getSlidingWindowSize()
	 * @generated
	 */
	void setSlidingWindowSize(String value);

	/**
	 * Returns the value of the '<em><b>Sliding Window Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the type of the sliding window which is used to record the outcome of calls when the CircuitBreaker is
	 * closed. Sliding window can either be count-based or time-based. If slidingWindowType is COUNT_BASED, the last
	 * slidingWindowSize calls are recorded and aggregated. If slidingWindowType is TIME_BASED, the calls of the last
	 * slidingWindowSize seconds are recorded and aggregated. Default slidingWindowType is COUNT_BASED. Default value:
	 * COUNT_BASED
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sliding Window Type</em>' attribute.
	 * @see #setSlidingWindowType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_SlidingWindowType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='slidingWindowType'"
	 * @generated
	 */
	String getSlidingWindowType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getSlidingWindowType <em>Sliding Window Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sliding Window Type</em>' attribute.
	 * @see #getSlidingWindowType()
	 * @generated
	 */
	void setSlidingWindowType(String value);

	/**
	 * Returns the value of the '<em><b>Slow Call Duration Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the duration threshold (seconds) above which calls are considered as slow and increase the slow calls
	 * percentage. Default value is 60 seconds. Default value: 60
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slow Call Duration Threshold</em>' attribute.
	 * @see #setSlowCallDurationThreshold(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_SlowCallDurationThreshold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='slowCallDurationThreshold'"
	 * @generated
	 */
	String getSlowCallDurationThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getSlowCallDurationThreshold <em>Slow Call Duration Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slow Call Duration Threshold</em>' attribute.
	 * @see #getSlowCallDurationThreshold()
	 * @generated
	 */
	void setSlowCallDurationThreshold(String value);

	/**
	 * Returns the value of the '<em><b>Slow Call Rate Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures a threshold in percentage. The CircuitBreaker considers a call as slow when the call duration is greater than
	 * slowCallDurationThreshold Duration. When the percentage of slow calls is equal or greater the threshold, the
	 * CircuitBreaker transitions to open and starts short-circuiting calls. The threshold must be greater than 0 and not
	 * greater than 100. Default value is 100 percentage which means that all recorded calls must be slower than
	 * slowCallDurationThreshold. Default value: 100
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slow Call Rate Threshold</em>' attribute.
	 * @see #setSlowCallRateThreshold(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_SlowCallRateThreshold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='slowCallRateThreshold'"
	 * @generated
	 */
	String getSlowCallRateThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getSlowCallRateThreshold <em>Slow Call Rate Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slow Call Rate Threshold</em>' attribute.
	 * @see #getSlowCallRateThreshold()
	 * @generated
	 */
	void setSlowCallRateThreshold(String value);

	/**
	 * Returns the value of the '<em><b>Throw Exception When Half Open Or Open State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to throw io.github.resilience4j.circuitbreaker.CallNotPermittedException when the call is rejected due circuit
	 * breaker is half open (and was not attempted but rejected immediately) or open (always rejected). This option is only in
	 * use when there is NOT a fallback configured on the circuit breaker. When there is a fallback then the fallback is always
	 * executed and CallNotPermittedException is not thrown. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throw Exception When Half Open Or Open State</em>' attribute.
	 * @see #setThrowExceptionWhenHalfOpenOrOpenState(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_ThrowExceptionWhenHalfOpenOrOpenState()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='throwExceptionWhenHalfOpenOrOpenState'"
	 * @generated
	 */
	String getThrowExceptionWhenHalfOpenOrOpenState();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getThrowExceptionWhenHalfOpenOrOpenState <em>Throw Exception When Half Open Or Open State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throw Exception When Half Open Or Open State</em>' attribute.
	 * @see #getThrowExceptionWhenHalfOpenOrOpenState()
	 * @generated
	 */
	void setThrowExceptionWhenHalfOpenOrOpenState(String value);

	/**
	 * Returns the value of the '<em><b>Timeout Cancel Running Future</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures whether cancel is called on the running future. Defaults to true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout Cancel Running Future</em>' attribute.
	 * @see #setTimeoutCancelRunningFuture(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_TimeoutCancelRunningFuture()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeoutCancelRunningFuture'"
	 * @generated
	 */
	String getTimeoutCancelRunningFuture();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getTimeoutCancelRunningFuture <em>Timeout Cancel Running Future</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Cancel Running Future</em>' attribute.
	 * @see #getTimeoutCancelRunningFuture()
	 * @generated
	 */
	void setTimeoutCancelRunningFuture(String value);

	/**
	 * Returns the value of the '<em><b>Timeout Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the thread execution timeout. Default value is 1 second. Default value: 1000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout Duration</em>' attribute.
	 * @see #setTimeoutDuration(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_TimeoutDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeoutDuration'"
	 * @generated
	 */
	String getTimeoutDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getTimeoutDuration <em>Timeout Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Duration</em>' attribute.
	 * @see #getTimeoutDuration()
	 * @generated
	 */
	void setTimeoutDuration(String value);

	/**
	 * Returns the value of the '<em><b>Timeout Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether timeout is enabled or not on the circuit breaker. Default is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout Enabled</em>' attribute.
	 * @see #setTimeoutEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_TimeoutEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeoutEnabled'"
	 * @generated
	 */
	String getTimeoutEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getTimeoutEnabled <em>Timeout Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Enabled</em>' attribute.
	 * @see #getTimeoutEnabled()
	 * @generated
	 */
	void setTimeoutEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Timeout Executor Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * References to a custom thread pool to use when timeout is enabled (uses ForkJoinPool#commonPool() by default).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout Executor Service</em>' attribute.
	 * @see #setTimeoutExecutorService(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_TimeoutExecutorService()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeoutExecutorService'"
	 * @generated
	 */
	String getTimeoutExecutorService();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getTimeoutExecutorService <em>Timeout Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Executor Service</em>' attribute.
	 * @see #getTimeoutExecutorService()
	 * @generated
	 */
	void setTimeoutExecutorService(String value);

	/**
	 * Returns the value of the '<em><b>Wait Duration In Open State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the wait duration (in seconds) which specifies how long the CircuitBreaker should stay open, before it
	 * switches to half open. Default value is 60 seconds. Default value: 60
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wait Duration In Open State</em>' attribute.
	 * @see #setWaitDurationInOpenState(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_WaitDurationInOpenState()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='waitDurationInOpenState'"
	 * @generated
	 */
	String getWaitDurationInOpenState();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getWaitDurationInOpenState <em>Wait Duration In Open State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Duration In Open State</em>' attribute.
	 * @see #getWaitDurationInOpenState()
	 * @generated
	 */
	void setWaitDurationInOpenState(String value);

	/**
	 * Returns the value of the '<em><b>Writable Stack Trace Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enables writable stack traces. When set to false, Exception.getStackTrace returns a zero length array. This may be used
	 * to reduce log spam when the circuit breaker is open as the cause of the exceptions is already known (the circuit breaker
	 * is short-circuiting calls). Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Writable Stack Trace Enabled</em>' attribute.
	 * @see #setWritableStackTraceEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResilience4JConfigurationCommon_WritableStackTraceEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='writableStackTraceEnabled'"
	 * @generated
	 */
	String getWritableStackTraceEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon#getWritableStackTraceEnabled <em>Writable Stack Trace Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writable Stack Trace Enabled</em>' attribute.
	 * @see #getWritableStackTraceEnabled()
	 * @generated
	 */
	void setWritableStackTraceEnabled(String value);

} // Resilience4JConfigurationCommon

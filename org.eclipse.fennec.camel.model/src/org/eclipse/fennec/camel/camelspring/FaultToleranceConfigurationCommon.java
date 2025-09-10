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
 * A representation of the model object '<em><b>Fault Tolerance Configuration Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getBulkheadEnabled <em>Bulkhead Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getBulkheadMaxConcurrentCalls <em>Bulkhead Max Concurrent Calls</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getBulkheadWaitingTaskQueue <em>Bulkhead Waiting Task Queue</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getFailureRatio <em>Failure Ratio</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getRequestVolumeThreshold <em>Request Volume Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getSuccessThreshold <em>Success Threshold</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getThreadOffloadExecutorService <em>Thread Offload Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getTimeoutDuration <em>Timeout Duration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getTimeoutEnabled <em>Timeout Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getTimeoutPoolSize <em>Timeout Pool Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getTypedGuard <em>Typed Guard</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon()
 * @model extendedMetaData="name='faultToleranceConfigurationCommon' kind='empty'"
 * @generated
 */
@ProviderType
public interface FaultToleranceConfigurationCommon extends IdentifiedType {
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_BulkheadEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bulkheadEnabled'"
	 * @generated
	 */
	String getBulkheadEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getBulkheadEnabled <em>Bulkhead Enabled</em>}' attribute.
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
	 * Configures the max amount of concurrent calls the bulkhead will support. Default value: 10
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bulkhead Max Concurrent Calls</em>' attribute.
	 * @see #setBulkheadMaxConcurrentCalls(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_BulkheadMaxConcurrentCalls()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bulkheadMaxConcurrentCalls'"
	 * @generated
	 */
	String getBulkheadMaxConcurrentCalls();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getBulkheadMaxConcurrentCalls <em>Bulkhead Max Concurrent Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulkhead Max Concurrent Calls</em>' attribute.
	 * @see #getBulkheadMaxConcurrentCalls()
	 * @generated
	 */
	void setBulkheadMaxConcurrentCalls(String value);

	/**
	 * Returns the value of the '<em><b>Bulkhead Waiting Task Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the task queue size for holding waiting tasks to be processed by the bulkhead. Default value: 10
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bulkhead Waiting Task Queue</em>' attribute.
	 * @see #setBulkheadWaitingTaskQueue(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_BulkheadWaitingTaskQueue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bulkheadWaitingTaskQueue'"
	 * @generated
	 */
	String getBulkheadWaitingTaskQueue();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getBulkheadWaitingTaskQueue <em>Bulkhead Waiting Task Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulkhead Waiting Task Queue</em>' attribute.
	 * @see #getBulkheadWaitingTaskQueue()
	 * @generated
	 */
	void setBulkheadWaitingTaskQueue(String value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Control how long the circuit breaker stays open. The default is 5 seconds. Default value: 5000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_Delay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delay'"
	 * @generated
	 */
	String getDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(String value);

	/**
	 * Returns the value of the '<em><b>Failure Ratio</b></em>' attribute.
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
	 * @return the value of the '<em>Failure Ratio</em>' attribute.
	 * @see #setFailureRatio(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_FailureRatio()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='failureRatio'"
	 * @generated
	 */
	String getFailureRatio();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getFailureRatio <em>Failure Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Ratio</em>' attribute.
	 * @see #getFailureRatio()
	 * @generated
	 */
	void setFailureRatio(String value);

	/**
	 * Returns the value of the '<em><b>Request Volume Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Controls the size of the rolling window used when the circuit breaker is closed. Default value: 20
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Volume Threshold</em>' attribute.
	 * @see #setRequestVolumeThreshold(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_RequestVolumeThreshold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='requestVolumeThreshold'"
	 * @generated
	 */
	String getRequestVolumeThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getRequestVolumeThreshold <em>Request Volume Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Volume Threshold</em>' attribute.
	 * @see #getRequestVolumeThreshold()
	 * @generated
	 */
	void setRequestVolumeThreshold(String value);

	/**
	 * Returns the value of the '<em><b>Success Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Controls the number of trial calls which are allowed when the circuit breaker is half-open. Default value: 1
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Success Threshold</em>' attribute.
	 * @see #setSuccessThreshold(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_SuccessThreshold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='successThreshold'"
	 * @generated
	 */
	String getSuccessThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getSuccessThreshold <em>Success Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Threshold</em>' attribute.
	 * @see #getSuccessThreshold()
	 * @generated
	 */
	void setSuccessThreshold(String value);

	/**
	 * Returns the value of the '<em><b>Thread Offload Executor Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * References a custom thread pool to use when offloading a guarded action to another thread.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Offload Executor Service</em>' attribute.
	 * @see #setThreadOffloadExecutorService(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_ThreadOffloadExecutorService()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='threadOffloadExecutorService'"
	 * @generated
	 */
	String getThreadOffloadExecutorService();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getThreadOffloadExecutorService <em>Thread Offload Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Offload Executor Service</em>' attribute.
	 * @see #getThreadOffloadExecutorService()
	 * @generated
	 */
	void setThreadOffloadExecutorService(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_TimeoutDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeoutDuration'"
	 * @generated
	 */
	String getTimeoutDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getTimeoutDuration <em>Timeout Duration</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_TimeoutEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeoutEnabled'"
	 * @generated
	 */
	String getTimeoutEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getTimeoutEnabled <em>Timeout Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Enabled</em>' attribute.
	 * @see #getTimeoutEnabled()
	 * @generated
	 */
	void setTimeoutEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Timeout Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures the pool size of the thread pool when timeout is enabled. Default value is 10. Default value: 10
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout Pool Size</em>' attribute.
	 * @see #setTimeoutPoolSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_TimeoutPoolSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeoutPoolSize'"
	 * @generated
	 */
	String getTimeoutPoolSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getTimeoutPoolSize <em>Timeout Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Pool Size</em>' attribute.
	 * @see #getTimeoutPoolSize()
	 * @generated
	 */
	void setTimeoutPoolSize(String value);

	/**
	 * Returns the value of the '<em><b>Typed Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to an existing io.smallrye.faulttolerance.api.TypedGuard instance to lookup and use from the registry. When using
	 * this, then any other TypedGuard circuit breaker options are not in use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typed Guard</em>' attribute.
	 * @see #setTypedGuard(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFaultToleranceConfigurationCommon_TypedGuard()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='typedGuard'"
	 * @generated
	 */
	String getTypedGuard();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon#getTypedGuard <em>Typed Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Guard</em>' attribute.
	 * @see #getTypedGuard()
	 * @generated
	 */
	void setTypedGuard(String value);

} // FaultToleranceConfigurationCommon

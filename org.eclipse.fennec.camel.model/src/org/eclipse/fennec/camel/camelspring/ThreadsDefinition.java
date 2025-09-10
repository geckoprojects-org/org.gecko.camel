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
 * A representation of the model object '<em><b>Threads Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getAllowCoreThreadTimeOut <em>Allow Core Thread Time Out</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getExecutorService <em>Executor Service</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getMaxPoolSize <em>Max Pool Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getMaxQueueSize <em>Max Queue Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getRejectedPolicy <em>Rejected Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getThreadName <em>Thread Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition()
 * @model extendedMetaData="name='threadsDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface ThreadsDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Allow Core Thread Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether idle core threads are allowed to timeout and therefore can shrink the pool size below the core pool size Is by
	 * default false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Core Thread Time Out</em>' attribute.
	 * @see #setAllowCoreThreadTimeOut(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition_AllowCoreThreadTimeOut()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowCoreThreadTimeOut'"
	 * @generated
	 */
	String getAllowCoreThreadTimeOut();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getAllowCoreThreadTimeOut <em>Allow Core Thread Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Core Thread Time Out</em>' attribute.
	 * @see #getAllowCoreThreadTimeOut()
	 * @generated
	 */
	void setAllowCoreThreadTimeOut(String value);

	/**
	 * Returns the value of the '<em><b>Caller Runs When Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not to use as caller runs as fallback when a task is rejected being added to the thread pool (when its full).
	 * This is only used as fallback if no rejectedPolicy has been configured, or the thread pool has no configured rejection
	 * handler. Is by default true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caller Runs When Rejected</em>' attribute.
	 * @see #setCallerRunsWhenRejected(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition_CallerRunsWhenRejected()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='callerRunsWhenRejected'"
	 * @generated
	 */
	String getCallerRunsWhenRejected();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getCallerRunsWhenRejected <em>Caller Runs When Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller Runs When Rejected</em>' attribute.
	 * @see #getCallerRunsWhenRejected()
	 * @generated
	 */
	void setCallerRunsWhenRejected(String value);

	/**
	 * Returns the value of the '<em><b>Executor Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom thread pool.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executor Service</em>' attribute.
	 * @see #setExecutorService(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition_ExecutorService()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='executorService'"
	 * @generated
	 */
	String getExecutorService();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getExecutorService <em>Executor Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor Service</em>' attribute.
	 * @see #getExecutorService()
	 * @generated
	 */
	void setExecutorService(String value);

	/**
	 * Returns the value of the '<em><b>Keep Alive Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the keep alive time for idle threads.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keep Alive Time</em>' attribute.
	 * @see #setKeepAliveTime(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition_KeepAliveTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keepAliveTime'"
	 * @generated
	 */
	String getKeepAliveTime();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getKeepAliveTime <em>Keep Alive Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive Time</em>' attribute.
	 * @see #getKeepAliveTime()
	 * @generated
	 */
	void setKeepAliveTime(String value);

	/**
	 * Returns the value of the '<em><b>Max Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum pool size.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Pool Size</em>' attribute.
	 * @see #setMaxPoolSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition_MaxPoolSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxPoolSize'"
	 * @generated
	 */
	String getMaxPoolSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getMaxPoolSize <em>Max Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pool Size</em>' attribute.
	 * @see #getMaxPoolSize()
	 * @generated
	 */
	void setMaxPoolSize(String value);

	/**
	 * Returns the value of the '<em><b>Max Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum number of tasks in the work queue. Use -1 or Integer.MAX_VALUE for an unbounded queue.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Queue Size</em>' attribute.
	 * @see #setMaxQueueSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition_MaxQueueSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxQueueSize'"
	 * @generated
	 */
	String getMaxQueueSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getMaxQueueSize <em>Max Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Queue Size</em>' attribute.
	 * @see #getMaxQueueSize()
	 * @generated
	 */
	void setMaxQueueSize(String value);

	/**
	 * Returns the value of the '<em><b>Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the core pool size.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pool Size</em>' attribute.
	 * @see #setPoolSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition_PoolSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='poolSize'"
	 * @generated
	 */
	String getPoolSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getPoolSize <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size</em>' attribute.
	 * @see #getPoolSize()
	 * @generated
	 */
	void setPoolSize(String value);

	/**
	 * Returns the value of the '<em><b>Rejected Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the handler for tasks which cannot be executed by the thread pool.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rejected Policy</em>' attribute.
	 * @see #setRejectedPolicy(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition_RejectedPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rejectedPolicy'"
	 * @generated
	 */
	String getRejectedPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getRejectedPolicy <em>Rejected Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected Policy</em>' attribute.
	 * @see #getRejectedPolicy()
	 * @generated
	 */
	void setRejectedPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Thread Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the thread name to use. Default value: Threads
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Name</em>' attribute.
	 * @see #setThreadName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition_ThreadName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='threadName'"
	 * @generated
	 */
	String getThreadName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getThreadName <em>Thread Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Name</em>' attribute.
	 * @see #getThreadName()
	 * @generated
	 */
	void setThreadName(String value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the keep alive time unit. By default SECONDS is used.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThreadsDefinition_TimeUnit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeUnit'"
	 * @generated
	 */
	String getTimeUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(String value);

} // ThreadsDefinition

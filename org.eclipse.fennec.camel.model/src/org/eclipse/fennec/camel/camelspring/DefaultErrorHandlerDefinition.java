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
 * A representation of the model object '<em><b>Default Error Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getLoggerRef <em>Logger Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getOnExceptionOccurredRef <em>On Exception Occurred Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getOnPrepareFailureRef <em>On Prepare Failure Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getOnRedeliveryRef <em>On Redelivery Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getRetryWhileRef <em>Retry While Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getUseOriginalBody <em>Use Original Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getUseOriginalMessage <em>Use Original Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition()
 * @model extendedMetaData="name='defaultErrorHandlerDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DefaultErrorHandlerDefinition extends BaseErrorHandlerDefinition {
	/**
	 * Returns the value of the '<em><b>Redelivery Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure re-delivery for error handling
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redelivery Policy</em>' containment reference.
	 * @see #setRedeliveryPolicy(RedeliveryPolicyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_RedeliveryPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='redeliveryPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	RedeliveryPolicyDefinition getRedeliveryPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getRedeliveryPolicy <em>Redelivery Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redelivery Policy</em>' containment reference.
	 * @see #getRedeliveryPolicy()
	 * @generated
	 */
	void setRedeliveryPolicy(RedeliveryPolicyDefinition value);

	/**
	 * Returns the value of the '<em><b>Executor Service Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a reference to a thread pool to be used by the error handler.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executor Service Ref</em>' attribute.
	 * @see #setExecutorServiceRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_ExecutorServiceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='executorServiceRef'"
	 * @generated
	 */
	String getExecutorServiceRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor Service Ref</em>' attribute.
	 * @see #getExecutorServiceRef()
	 * @generated
	 */
	void setExecutorServiceRef(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Logging level to use by error handler. Default value: ERROR
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_Level()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='level'"
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Logger Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * References to a logger to use as logger for the error handler.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logger Ref</em>' attribute.
	 * @see #setLoggerRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_LoggerRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='loggerRef'"
	 * @generated
	 */
	String getLoggerRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getLoggerRef <em>Logger Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger Ref</em>' attribute.
	 * @see #getLoggerRef()
	 * @generated
	 */
	void setLoggerRef(String value);

	/**
	 * Returns the value of the '<em><b>Log Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of the logger to use by the error handler.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Name</em>' attribute.
	 * @see #setLogName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_LogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logName'"
	 * @generated
	 */
	String getLogName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getLogName <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Name</em>' attribute.
	 * @see #getLogName()
	 * @generated
	 */
	void setLogName(String value);

	/**
	 * Returns the value of the '<em><b>On Exception Occurred Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a reference to a processor that should be processed just after an exception occurred. Can be used to perform custom
	 * logging about the occurred exception at the exact time it happened. Important: Any exception thrown from this processor
	 * will be ignored.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Exception Occurred Ref</em>' attribute.
	 * @see #setOnExceptionOccurredRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_OnExceptionOccurredRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onExceptionOccurredRef'"
	 * @generated
	 */
	String getOnExceptionOccurredRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getOnExceptionOccurredRef <em>On Exception Occurred Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Exception Occurred Ref</em>' attribute.
	 * @see #getOnExceptionOccurredRef()
	 * @generated
	 */
	void setOnExceptionOccurredRef(String value);

	/**
	 * Returns the value of the '<em><b>On Prepare Failure Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a reference to a processor to prepare the org.apache.camel.Exchange before handled by the failure processor / dead
	 * letter channel. This allows for example to enrich the message before sending to a dead letter queue.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Prepare Failure Ref</em>' attribute.
	 * @see #setOnPrepareFailureRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_OnPrepareFailureRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onPrepareFailureRef'"
	 * @generated
	 */
	String getOnPrepareFailureRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getOnPrepareFailureRef <em>On Prepare Failure Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Prepare Failure Ref</em>' attribute.
	 * @see #getOnPrepareFailureRef()
	 * @generated
	 */
	void setOnPrepareFailureRef(String value);

	/**
	 * Returns the value of the '<em><b>On Redelivery Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a reference to a processor that should be processed before a redelivery attempt. Can be used to change the
	 * org.apache.camel.Exchange before its being redelivered.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Redelivery Ref</em>' attribute.
	 * @see #setOnRedeliveryRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_OnRedeliveryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onRedeliveryRef'"
	 * @generated
	 */
	String getOnRedeliveryRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getOnRedeliveryRef <em>On Redelivery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Redelivery Ref</em>' attribute.
	 * @see #getOnRedeliveryRef()
	 * @generated
	 */
	void setOnRedeliveryRef(String value);

	/**
	 * Returns the value of the '<em><b>Redelivery Policy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a reference to a RedeliveryPolicy to be used for redelivery settings.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redelivery Policy Ref</em>' attribute.
	 * @see #setRedeliveryPolicyRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_RedeliveryPolicyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redeliveryPolicyRef'"
	 * @generated
	 */
	String getRedeliveryPolicyRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redelivery Policy Ref</em>' attribute.
	 * @see #getRedeliveryPolicyRef()
	 * @generated
	 */
	void setRedeliveryPolicyRef(String value);

	/**
	 * Returns the value of the '<em><b>Retry While Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a retry while predicate. Will continue retrying until the predicate evaluates to false.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry While Ref</em>' attribute.
	 * @see #setRetryWhileRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_RetryWhileRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='retryWhileRef'"
	 * @generated
	 */
	String getRetryWhileRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getRetryWhileRef <em>Retry While Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry While Ref</em>' attribute.
	 * @see #getRetryWhileRef()
	 * @generated
	 */
	void setRetryWhileRef(String value);

	/**
	 * Returns the value of the '<em><b>Use Original Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Will use the original input org.apache.camel.Message body (original body only) when an org.apache.camel.Exchange is
	 * moved to the dead letter queue. Notice: this only applies when all redeliveries attempt have failed and the
	 * org.apache.camel.Exchange is doomed for failure. Instead of using the current inprogress org.apache.camel.Exchange IN
	 * message we use the original IN message instead. This allows you to store the original input in the dead letter queue
	 * instead of the inprogress snapshot of the IN message. For instance if you route transform the IN body during routing and
	 * then failed. With the original exchange store in the dead letter queue it might be easier to manually re submit the
	 * org.apache.camel.Exchange again as the IN message is the same as when Camel received it. So you should be able to send
	 * the org.apache.camel.Exchange to the same input. The difference between useOriginalMessage and useOriginalBody is that
	 * the former includes both the original body and headers, where as the latter only includes the original body. You can use
	 * the latter to enrich the message with custom headers and include the original message body. The former wont let you do
	 * this, as its using the original message body and headers as they are. You cannot enable both useOriginalMessage and
	 * useOriginalBody. The original input message is defensively copied, and the copied message body is converted to
	 * org.apache.camel.StreamCache if possible (stream caching is enabled, can be disabled globally or on the original route),
	 * to ensure the body can be read when the original message is being used later. If the body is converted to
	 * org.apache.camel.StreamCache then the message body on the current org.apache.camel.Exchange is replaced with the
	 * org.apache.camel.StreamCache body. If the body is not converted to org.apache.camel.StreamCache then the body will not
	 * be able to re-read when accessed later. Important: The original input means the input message that are bounded by the
	 * current org.apache.camel.spi.UnitOfWork . An unit of work typically spans one route, or multiple routes if they are
	 * connected using internal endpoints such as direct or seda. When messages is passed via external endpoints such as JMS or
	 * HTTP then the consumer will create a new unit of work, with the message it received as input as the original input. Also
	 * some EIP patterns such as splitter, multicast, will create a new unit of work boundary for the messages in their
	 * sub-route (eg the splitted message); however these EIPs have an option named shareUnitOfWork which allows to combine
	 * with the parent unit of work in regard to error handling and therefore use the parent original message. By default this
	 * feature is off. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Original Body</em>' attribute.
	 * @see #setUseOriginalBody(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_UseOriginalBody()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useOriginalBody'"
	 * @generated
	 */
	String getUseOriginalBody();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getUseOriginalBody <em>Use Original Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Original Body</em>' attribute.
	 * @see #getUseOriginalBody()
	 * @generated
	 */
	void setUseOriginalBody(String value);

	/**
	 * Returns the value of the '<em><b>Use Original Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Will use the original input org.apache.camel.Message (original body and headers) when an org.apache.camel.Exchange is
	 * moved to the dead letter queue. Notice: this only applies when all redeliveries attempt have failed and the
	 * org.apache.camel.Exchange is doomed for failure. Instead of using the current inprogress org.apache.camel.Exchange IN
	 * message we use the original IN message instead. This allows you to store the original input in the dead letter queue
	 * instead of the inprogress snapshot of the IN message. For instance if you route transform the IN body during routing and
	 * then failed. With the original exchange store in the dead letter queue it might be easier to manually re submit the
	 * org.apache.camel.Exchange again as the IN message is the same as when Camel received it. So you should be able to send
	 * the org.apache.camel.Exchange to the same input. The difference between useOriginalMessage and useOriginalBody is that
	 * the former includes both the original body and headers, where as the latter only includes the original body. You can use
	 * the latter to enrich the message with custom headers and include the original message body. The former wont let you do
	 * this, as its using the original message body and headers as they are. You cannot enable both useOriginalMessage and
	 * useOriginalBody. The original input message is defensively copied, and the copied message body is converted to
	 * org.apache.camel.StreamCache if possible (stream caching is enabled, can be disabled globally or on the original route),
	 * to ensure the body can be read when the original message is being used later. If the body is converted to
	 * org.apache.camel.StreamCache then the message body on the current org.apache.camel.Exchange is replaced with the
	 * org.apache.camel.StreamCache body. If the body is not converted to org.apache.camel.StreamCache then the body will not
	 * be able to re-read when accessed later. Important: The original input means the input message that are bounded by the
	 * current org.apache.camel.spi.UnitOfWork . An unit of work typically spans one route, or multiple routes if they are
	 * connected using internal endpoints such as direct or seda. When messages is passed via external endpoints such as JMS or
	 * HTTP then the consumer will create a new unit of work, with the message it received as input as the original input. Also
	 * some EIP patterns such as splitter, multicast, will create a new unit of work boundary for the messages in their
	 * sub-route (eg the splitted message); however these EIPs have an option named shareUnitOfWork which allows to combine
	 * with the parent unit of work in regard to error handling and therefore use the parent original message. By default this
	 * feature is off. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Original Message</em>' attribute.
	 * @see #setUseOriginalMessage(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDefaultErrorHandlerDefinition_UseOriginalMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useOriginalMessage'"
	 * @generated
	 */
	String getUseOriginalMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition#getUseOriginalMessage <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Original Message</em>' attribute.
	 * @see #getUseOriginalMessage()
	 * @generated
	 */
	void setUseOriginalMessage(String value);

} // DefaultErrorHandlerDefinition

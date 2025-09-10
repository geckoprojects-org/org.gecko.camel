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
 * A representation of the model object '<em><b>Spring Error Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getDeadLetterHandleNewException <em>Dead Letter Handle New Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getDeadLetterUri <em>Dead Letter Uri</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getOnExceptionOccurredRef <em>On Exception Occurred Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getOnPrepareFailureRef <em>On Prepare Failure Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getOnRedeliveryRef <em>On Redelivery Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getRetryWhileRef <em>Retry While Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getRollbackLoggingLevel <em>Rollback Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getTransactionManagerRef <em>Transaction Manager Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getTransactionTemplateRef <em>Transaction Template Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#isUseOriginalBody <em>Use Original Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#isUseOriginalMessage <em>Use Original Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition()
 * @model extendedMetaData="name='springErrorHandlerDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpringErrorHandlerDefinition extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Redelivery Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redelivery Policy</em>' containment reference.
	 * @see #setRedeliveryPolicy(CamelRedeliveryPolicyFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_RedeliveryPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='redeliveryPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelRedeliveryPolicyFactoryBean getRedeliveryPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getRedeliveryPolicy <em>Redelivery Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redelivery Policy</em>' containment reference.
	 * @see #getRedeliveryPolicy()
	 * @generated
	 */
	void setRedeliveryPolicy(CamelRedeliveryPolicyFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Dead Letter Handle New Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Letter Handle New Exception</em>' attribute.
	 * @see #setDeadLetterHandleNewException(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_DeadLetterHandleNewException()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deadLetterHandleNewException'"
	 * @generated
	 */
	String getDeadLetterHandleNewException();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getDeadLetterHandleNewException <em>Dead Letter Handle New Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Handle New Exception</em>' attribute.
	 * @see #getDeadLetterHandleNewException()
	 * @generated
	 */
	void setDeadLetterHandleNewException(String value);

	/**
	 * Returns the value of the '<em><b>Dead Letter Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Letter Uri</em>' attribute.
	 * @see #setDeadLetterUri(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_DeadLetterUri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deadLetterUri'"
	 * @generated
	 */
	String getDeadLetterUri();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getDeadLetterUri <em>Dead Letter Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Uri</em>' attribute.
	 * @see #getDeadLetterUri()
	 * @generated
	 */
	void setDeadLetterUri(String value);

	/**
	 * Returns the value of the '<em><b>Executor Service Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor Service Ref</em>' attribute.
	 * @see #setExecutorServiceRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_ExecutorServiceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='executorServiceRef'"
	 * @generated
	 */
	String getExecutorServiceRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor Service Ref</em>' attribute.
	 * @see #getExecutorServiceRef()
	 * @generated
	 */
	void setExecutorServiceRef(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.LoggingLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.LoggingLevel
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #setLevel(LoggingLevel)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_Level()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='level'"
	 * @generated
	 */
	LoggingLevel getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.LoggingLevel
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LoggingLevel value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevel()
	 * @see #getLevel()
	 * @see #setLevel(LoggingLevel)
	 * @generated
	 */
	void unsetLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getLevel <em>Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Level</em>' attribute is set.
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @see #setLevel(LoggingLevel)
	 * @generated
	 */
	boolean isSetLevel();

	/**
	 * Returns the value of the '<em><b>Log Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Name</em>' attribute.
	 * @see #setLogName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_LogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logName'"
	 * @generated
	 */
	String getLogName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getLogName <em>Log Name</em>}' attribute.
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
	 * @return the value of the '<em>On Exception Occurred Ref</em>' attribute.
	 * @see #setOnExceptionOccurredRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_OnExceptionOccurredRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onExceptionOccurredRef'"
	 * @generated
	 */
	String getOnExceptionOccurredRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getOnExceptionOccurredRef <em>On Exception Occurred Ref</em>}' attribute.
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
	 * @return the value of the '<em>On Prepare Failure Ref</em>' attribute.
	 * @see #setOnPrepareFailureRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_OnPrepareFailureRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onPrepareFailureRef'"
	 * @generated
	 */
	String getOnPrepareFailureRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getOnPrepareFailureRef <em>On Prepare Failure Ref</em>}' attribute.
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
	 * @return the value of the '<em>On Redelivery Ref</em>' attribute.
	 * @see #setOnRedeliveryRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_OnRedeliveryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onRedeliveryRef'"
	 * @generated
	 */
	String getOnRedeliveryRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getOnRedeliveryRef <em>On Redelivery Ref</em>}' attribute.
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
	 * @return the value of the '<em>Redelivery Policy Ref</em>' attribute.
	 * @see #setRedeliveryPolicyRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_RedeliveryPolicyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redeliveryPolicyRef'"
	 * @generated
	 */
	String getRedeliveryPolicyRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}' attribute.
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
	 * @return the value of the '<em>Retry While Ref</em>' attribute.
	 * @see #setRetryWhileRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_RetryWhileRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='retryWhileRef'"
	 * @generated
	 */
	String getRetryWhileRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getRetryWhileRef <em>Retry While Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry While Ref</em>' attribute.
	 * @see #getRetryWhileRef()
	 * @generated
	 */
	void setRetryWhileRef(String value);

	/**
	 * Returns the value of the '<em><b>Rollback Logging Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.LoggingLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rollback Logging Level</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.LoggingLevel
	 * @see #isSetRollbackLoggingLevel()
	 * @see #unsetRollbackLoggingLevel()
	 * @see #setRollbackLoggingLevel(LoggingLevel)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_RollbackLoggingLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rollbackLoggingLevel'"
	 * @generated
	 */
	LoggingLevel getRollbackLoggingLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getRollbackLoggingLevel <em>Rollback Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rollback Logging Level</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.LoggingLevel
	 * @see #isSetRollbackLoggingLevel()
	 * @see #unsetRollbackLoggingLevel()
	 * @see #getRollbackLoggingLevel()
	 * @generated
	 */
	void setRollbackLoggingLevel(LoggingLevel value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getRollbackLoggingLevel <em>Rollback Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRollbackLoggingLevel()
	 * @see #getRollbackLoggingLevel()
	 * @see #setRollbackLoggingLevel(LoggingLevel)
	 * @generated
	 */
	void unsetRollbackLoggingLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getRollbackLoggingLevel <em>Rollback Logging Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rollback Logging Level</em>' attribute is set.
	 * @see #unsetRollbackLoggingLevel()
	 * @see #getRollbackLoggingLevel()
	 * @see #setRollbackLoggingLevel(LoggingLevel)
	 * @generated
	 */
	boolean isSetRollbackLoggingLevel();

	/**
	 * Returns the value of the '<em><b>Transaction Manager Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Manager Ref</em>' attribute.
	 * @see #setTransactionManagerRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_TransactionManagerRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='transactionManagerRef'"
	 * @generated
	 */
	String getTransactionManagerRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getTransactionManagerRef <em>Transaction Manager Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Manager Ref</em>' attribute.
	 * @see #getTransactionManagerRef()
	 * @generated
	 */
	void setTransactionManagerRef(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Template Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Template Ref</em>' attribute.
	 * @see #setTransactionTemplateRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_TransactionTemplateRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='transactionTemplateRef'"
	 * @generated
	 */
	String getTransactionTemplateRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getTransactionTemplateRef <em>Transaction Template Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Template Ref</em>' attribute.
	 * @see #getTransactionTemplateRef()
	 * @generated
	 */
	void setTransactionTemplateRef(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.SpringErrorHandlerType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(SpringErrorHandlerType)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	SpringErrorHandlerType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.SpringErrorHandlerType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(SpringErrorHandlerType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(SpringErrorHandlerType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(SpringErrorHandlerType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Use Original Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Original Body</em>' attribute.
	 * @see #isSetUseOriginalBody()
	 * @see #unsetUseOriginalBody()
	 * @see #setUseOriginalBody(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_UseOriginalBody()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='useOriginalBody'"
	 * @generated
	 */
	boolean isUseOriginalBody();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#isUseOriginalBody <em>Use Original Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Original Body</em>' attribute.
	 * @see #isSetUseOriginalBody()
	 * @see #unsetUseOriginalBody()
	 * @see #isUseOriginalBody()
	 * @generated
	 */
	void setUseOriginalBody(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#isUseOriginalBody <em>Use Original Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseOriginalBody()
	 * @see #isUseOriginalBody()
	 * @see #setUseOriginalBody(boolean)
	 * @generated
	 */
	void unsetUseOriginalBody();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#isUseOriginalBody <em>Use Original Body</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Original Body</em>' attribute is set.
	 * @see #unsetUseOriginalBody()
	 * @see #isUseOriginalBody()
	 * @see #setUseOriginalBody(boolean)
	 * @generated
	 */
	boolean isSetUseOriginalBody();

	/**
	 * Returns the value of the '<em><b>Use Original Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Original Message</em>' attribute.
	 * @see #isSetUseOriginalMessage()
	 * @see #unsetUseOriginalMessage()
	 * @see #setUseOriginalMessage(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSpringErrorHandlerDefinition_UseOriginalMessage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='useOriginalMessage'"
	 * @generated
	 */
	boolean isUseOriginalMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#isUseOriginalMessage <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Original Message</em>' attribute.
	 * @see #isSetUseOriginalMessage()
	 * @see #unsetUseOriginalMessage()
	 * @see #isUseOriginalMessage()
	 * @generated
	 */
	void setUseOriginalMessage(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#isUseOriginalMessage <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseOriginalMessage()
	 * @see #isUseOriginalMessage()
	 * @see #setUseOriginalMessage(boolean)
	 * @generated
	 */
	void unsetUseOriginalMessage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition#isUseOriginalMessage <em>Use Original Message</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Original Message</em>' attribute is set.
	 * @see #unsetUseOriginalMessage()
	 * @see #isUseOriginalMessage()
	 * @see #setUseOriginalMessage(boolean)
	 * @generated
	 */
	boolean isSetUseOriginalMessage();

} // SpringErrorHandlerDefinition

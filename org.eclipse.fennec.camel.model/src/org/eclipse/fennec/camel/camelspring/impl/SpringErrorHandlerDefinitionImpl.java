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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CamelRedeliveryPolicyFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.LoggingLevel;
import org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.SpringErrorHandlerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spring Error Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getDeadLetterHandleNewException <em>Dead Letter Handle New Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getDeadLetterUri <em>Dead Letter Uri</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getOnExceptionOccurredRef <em>On Exception Occurred Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getOnPrepareFailureRef <em>On Prepare Failure Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getOnRedeliveryRef <em>On Redelivery Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getRetryWhileRef <em>Retry While Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getRollbackLoggingLevel <em>Rollback Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getTransactionManagerRef <em>Transaction Manager Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getTransactionTemplateRef <em>Transaction Template Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#isUseOriginalBody <em>Use Original Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SpringErrorHandlerDefinitionImpl#isUseOriginalMessage <em>Use Original Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpringErrorHandlerDefinitionImpl extends IdentifiedTypeImpl implements SpringErrorHandlerDefinition {
	/**
	 * The cached value of the '{@link #getRedeliveryPolicy() <em>Redelivery Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicy()
	 * @generated
	 * @ordered
	 */
	protected CamelRedeliveryPolicyFactoryBean redeliveryPolicy;

	/**
	 * The default value of the '{@link #getDeadLetterHandleNewException() <em>Dead Letter Handle New Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterHandleNewException()
	 * @generated
	 * @ordered
	 */
	protected static final String DEAD_LETTER_HANDLE_NEW_EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadLetterHandleNewException() <em>Dead Letter Handle New Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterHandleNewException()
	 * @generated
	 * @ordered
	 */
	protected String deadLetterHandleNewException = DEAD_LETTER_HANDLE_NEW_EXCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadLetterUri() <em>Dead Letter Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterUri()
	 * @generated
	 * @ordered
	 */
	protected static final String DEAD_LETTER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadLetterUri() <em>Dead Letter Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterUri()
	 * @generated
	 * @ordered
	 */
	protected String deadLetterUri = DEAD_LETTER_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutorServiceRef() <em>Executor Service Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorServiceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTOR_SERVICE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutorServiceRef() <em>Executor Service Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorServiceRef()
	 * @generated
	 * @ordered
	 */
	protected String executorServiceRef = EXECUTOR_SERVICE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LoggingLevel LEVEL_EDEFAULT = LoggingLevel.TRACE;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected LoggingLevel level = LEVEL_EDEFAULT;

	/**
	 * This is true if the Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelESet;

	/**
	 * The default value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogName()
	 * @generated
	 * @ordered
	 */
	protected String logName = LOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnExceptionOccurredRef() <em>On Exception Occurred Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnExceptionOccurredRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_EXCEPTION_OCCURRED_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnExceptionOccurredRef() <em>On Exception Occurred Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnExceptionOccurredRef()
	 * @generated
	 * @ordered
	 */
	protected String onExceptionOccurredRef = ON_EXCEPTION_OCCURRED_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnPrepareFailureRef() <em>On Prepare Failure Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPrepareFailureRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PREPARE_FAILURE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPrepareFailureRef() <em>On Prepare Failure Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPrepareFailureRef()
	 * @generated
	 * @ordered
	 */
	protected String onPrepareFailureRef = ON_PREPARE_FAILURE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnRedeliveryRef() <em>On Redelivery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRedeliveryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_REDELIVERY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnRedeliveryRef() <em>On Redelivery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRedeliveryRef()
	 * @generated
	 * @ordered
	 */
	protected String onRedeliveryRef = ON_REDELIVERY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedeliveryPolicyRef() <em>Redelivery Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REDELIVERY_POLICY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedeliveryPolicyRef() <em>Redelivery Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicyRef()
	 * @generated
	 * @ordered
	 */
	protected String redeliveryPolicyRef = REDELIVERY_POLICY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryWhileRef() <em>Retry While Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryWhileRef()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRY_WHILE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetryWhileRef() <em>Retry While Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryWhileRef()
	 * @generated
	 * @ordered
	 */
	protected String retryWhileRef = RETRY_WHILE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRollbackLoggingLevel() <em>Rollback Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollbackLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LoggingLevel ROLLBACK_LOGGING_LEVEL_EDEFAULT = LoggingLevel.TRACE;

	/**
	 * The cached value of the '{@link #getRollbackLoggingLevel() <em>Rollback Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollbackLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected LoggingLevel rollbackLoggingLevel = ROLLBACK_LOGGING_LEVEL_EDEFAULT;

	/**
	 * This is true if the Rollback Logging Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rollbackLoggingLevelESet;

	/**
	 * The default value of the '{@link #getTransactionManagerRef() <em>Transaction Manager Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionManagerRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_MANAGER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionManagerRef() <em>Transaction Manager Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionManagerRef()
	 * @generated
	 * @ordered
	 */
	protected String transactionManagerRef = TRANSACTION_MANAGER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionTemplateRef() <em>Transaction Template Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionTemplateRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_TEMPLATE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionTemplateRef() <em>Transaction Template Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionTemplateRef()
	 * @generated
	 * @ordered
	 */
	protected String transactionTemplateRef = TRANSACTION_TEMPLATE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SpringErrorHandlerType TYPE_EDEFAULT = SpringErrorHandlerType.DEFAULT_ERROR_HANDLER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SpringErrorHandlerType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #isUseOriginalBody() <em>Use Original Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseOriginalBody()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ORIGINAL_BODY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseOriginalBody() <em>Use Original Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseOriginalBody()
	 * @generated
	 * @ordered
	 */
	protected boolean useOriginalBody = USE_ORIGINAL_BODY_EDEFAULT;

	/**
	 * This is true if the Use Original Body attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useOriginalBodyESet;

	/**
	 * The default value of the '{@link #isUseOriginalMessage() <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseOriginalMessage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ORIGINAL_MESSAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseOriginalMessage() <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseOriginalMessage()
	 * @generated
	 * @ordered
	 */
	protected boolean useOriginalMessage = USE_ORIGINAL_MESSAGE_EDEFAULT;

	/**
	 * This is true if the Use Original Message attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useOriginalMessageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpringErrorHandlerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSpringErrorHandlerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRedeliveryPolicyFactoryBean getRedeliveryPolicy() {
		return redeliveryPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedeliveryPolicy(CamelRedeliveryPolicyFactoryBean newRedeliveryPolicy, NotificationChain msgs) {
		CamelRedeliveryPolicyFactoryBean oldRedeliveryPolicy = redeliveryPolicy;
		redeliveryPolicy = newRedeliveryPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, oldRedeliveryPolicy, newRedeliveryPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedeliveryPolicy(CamelRedeliveryPolicyFactoryBean newRedeliveryPolicy) {
		if (newRedeliveryPolicy != redeliveryPolicy) {
			NotificationChain msgs = null;
			if (redeliveryPolicy != null)
				msgs = ((InternalEObject)redeliveryPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, null, msgs);
			if (newRedeliveryPolicy != null)
				msgs = ((InternalEObject)newRedeliveryPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, null, msgs);
			msgs = basicSetRedeliveryPolicy(newRedeliveryPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, newRedeliveryPolicy, newRedeliveryPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeadLetterHandleNewException() {
		return deadLetterHandleNewException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadLetterHandleNewException(String newDeadLetterHandleNewException) {
		String oldDeadLetterHandleNewException = deadLetterHandleNewException;
		deadLetterHandleNewException = newDeadLetterHandleNewException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__DEAD_LETTER_HANDLE_NEW_EXCEPTION, oldDeadLetterHandleNewException, deadLetterHandleNewException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeadLetterUri() {
		return deadLetterUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadLetterUri(String newDeadLetterUri) {
		String oldDeadLetterUri = deadLetterUri;
		deadLetterUri = newDeadLetterUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI, oldDeadLetterUri, deadLetterUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExecutorServiceRef() {
		return executorServiceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutorServiceRef(String newExecutorServiceRef) {
		String oldExecutorServiceRef = executorServiceRef;
		executorServiceRef = newExecutorServiceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF, oldExecutorServiceRef, executorServiceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoggingLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(LoggingLevel newLevel) {
		LoggingLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		boolean oldLevelESet = levelESet;
		levelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LEVEL, oldLevel, level, !oldLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLevel() {
		LoggingLevel oldLevel = level;
		boolean oldLevelESet = levelESet;
		level = LEVEL_EDEFAULT;
		levelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LEVEL, oldLevel, LEVEL_EDEFAULT, oldLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLevel() {
		return levelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogName() {
		return logName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogName(String newLogName) {
		String oldLogName = logName;
		logName = newLogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LOG_NAME, oldLogName, logName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnExceptionOccurredRef() {
		return onExceptionOccurredRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnExceptionOccurredRef(String newOnExceptionOccurredRef) {
		String oldOnExceptionOccurredRef = onExceptionOccurredRef;
		onExceptionOccurredRef = newOnExceptionOccurredRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_EXCEPTION_OCCURRED_REF, oldOnExceptionOccurredRef, onExceptionOccurredRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnPrepareFailureRef() {
		return onPrepareFailureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnPrepareFailureRef(String newOnPrepareFailureRef) {
		String oldOnPrepareFailureRef = onPrepareFailureRef;
		onPrepareFailureRef = newOnPrepareFailureRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_PREPARE_FAILURE_REF, oldOnPrepareFailureRef, onPrepareFailureRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnRedeliveryRef() {
		return onRedeliveryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnRedeliveryRef(String newOnRedeliveryRef) {
		String oldOnRedeliveryRef = onRedeliveryRef;
		onRedeliveryRef = newOnRedeliveryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF, oldOnRedeliveryRef, onRedeliveryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRedeliveryPolicyRef() {
		return redeliveryPolicyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedeliveryPolicyRef(String newRedeliveryPolicyRef) {
		String oldRedeliveryPolicyRef = redeliveryPolicyRef;
		redeliveryPolicyRef = newRedeliveryPolicyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF, oldRedeliveryPolicyRef, redeliveryPolicyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRetryWhileRef() {
		return retryWhileRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryWhileRef(String newRetryWhileRef) {
		String oldRetryWhileRef = retryWhileRef;
		retryWhileRef = newRetryWhileRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF, oldRetryWhileRef, retryWhileRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoggingLevel getRollbackLoggingLevel() {
		return rollbackLoggingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRollbackLoggingLevel(LoggingLevel newRollbackLoggingLevel) {
		LoggingLevel oldRollbackLoggingLevel = rollbackLoggingLevel;
		rollbackLoggingLevel = newRollbackLoggingLevel == null ? ROLLBACK_LOGGING_LEVEL_EDEFAULT : newRollbackLoggingLevel;
		boolean oldRollbackLoggingLevelESet = rollbackLoggingLevelESet;
		rollbackLoggingLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL, oldRollbackLoggingLevel, rollbackLoggingLevel, !oldRollbackLoggingLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRollbackLoggingLevel() {
		LoggingLevel oldRollbackLoggingLevel = rollbackLoggingLevel;
		boolean oldRollbackLoggingLevelESet = rollbackLoggingLevelESet;
		rollbackLoggingLevel = ROLLBACK_LOGGING_LEVEL_EDEFAULT;
		rollbackLoggingLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL, oldRollbackLoggingLevel, ROLLBACK_LOGGING_LEVEL_EDEFAULT, oldRollbackLoggingLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRollbackLoggingLevel() {
		return rollbackLoggingLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransactionManagerRef() {
		return transactionManagerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionManagerRef(String newTransactionManagerRef) {
		String oldTransactionManagerRef = transactionManagerRef;
		transactionManagerRef = newTransactionManagerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF, oldTransactionManagerRef, transactionManagerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransactionTemplateRef() {
		return transactionTemplateRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionTemplateRef(String newTransactionTemplateRef) {
		String oldTransactionTemplateRef = transactionTemplateRef;
		transactionTemplateRef = newTransactionTemplateRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF, oldTransactionTemplateRef, transactionTemplateRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpringErrorHandlerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(SpringErrorHandlerType newType) {
		SpringErrorHandlerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		SpringErrorHandlerType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseOriginalBody() {
		return useOriginalBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseOriginalBody(boolean newUseOriginalBody) {
		boolean oldUseOriginalBody = useOriginalBody;
		useOriginalBody = newUseOriginalBody;
		boolean oldUseOriginalBodyESet = useOriginalBodyESet;
		useOriginalBodyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY, oldUseOriginalBody, useOriginalBody, !oldUseOriginalBodyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUseOriginalBody() {
		boolean oldUseOriginalBody = useOriginalBody;
		boolean oldUseOriginalBodyESet = useOriginalBodyESet;
		useOriginalBody = USE_ORIGINAL_BODY_EDEFAULT;
		useOriginalBodyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY, oldUseOriginalBody, USE_ORIGINAL_BODY_EDEFAULT, oldUseOriginalBodyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUseOriginalBody() {
		return useOriginalBodyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseOriginalMessage() {
		return useOriginalMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseOriginalMessage(boolean newUseOriginalMessage) {
		boolean oldUseOriginalMessage = useOriginalMessage;
		useOriginalMessage = newUseOriginalMessage;
		boolean oldUseOriginalMessageESet = useOriginalMessageESet;
		useOriginalMessageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE, oldUseOriginalMessage, useOriginalMessage, !oldUseOriginalMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUseOriginalMessage() {
		boolean oldUseOriginalMessage = useOriginalMessage;
		boolean oldUseOriginalMessageESet = useOriginalMessageESet;
		useOriginalMessage = USE_ORIGINAL_MESSAGE_EDEFAULT;
		useOriginalMessageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE, oldUseOriginalMessage, USE_ORIGINAL_MESSAGE_EDEFAULT, oldUseOriginalMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUseOriginalMessage() {
		return useOriginalMessageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				return basicSetRedeliveryPolicy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				return getRedeliveryPolicy();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__DEAD_LETTER_HANDLE_NEW_EXCEPTION:
				return getDeadLetterHandleNewException();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI:
				return getDeadLetterUri();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				return getExecutorServiceRef();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LEVEL:
				return getLevel();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LOG_NAME:
				return getLogName();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_EXCEPTION_OCCURRED_REF:
				return getOnExceptionOccurredRef();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_PREPARE_FAILURE_REF:
				return getOnPrepareFailureRef();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				return getOnRedeliveryRef();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				return getRedeliveryPolicyRef();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				return getRetryWhileRef();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL:
				return getRollbackLoggingLevel();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF:
				return getTransactionManagerRef();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF:
				return getTransactionTemplateRef();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TYPE:
				return getType();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY:
				return isUseOriginalBody();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				return isUseOriginalMessage();
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
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				setRedeliveryPolicy((CamelRedeliveryPolicyFactoryBean)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__DEAD_LETTER_HANDLE_NEW_EXCEPTION:
				setDeadLetterHandleNewException((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI:
				setDeadLetterUri((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				setExecutorServiceRef((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LEVEL:
				setLevel((LoggingLevel)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LOG_NAME:
				setLogName((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_EXCEPTION_OCCURRED_REF:
				setOnExceptionOccurredRef((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_PREPARE_FAILURE_REF:
				setOnPrepareFailureRef((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				setOnRedeliveryRef((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				setRedeliveryPolicyRef((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				setRetryWhileRef((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL:
				setRollbackLoggingLevel((LoggingLevel)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF:
				setTransactionManagerRef((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF:
				setTransactionTemplateRef((String)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TYPE:
				setType((SpringErrorHandlerType)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY:
				setUseOriginalBody((Boolean)newValue);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				setUseOriginalMessage((Boolean)newValue);
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
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				setRedeliveryPolicy((CamelRedeliveryPolicyFactoryBean)null);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__DEAD_LETTER_HANDLE_NEW_EXCEPTION:
				setDeadLetterHandleNewException(DEAD_LETTER_HANDLE_NEW_EXCEPTION_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI:
				setDeadLetterUri(DEAD_LETTER_URI_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				setExecutorServiceRef(EXECUTOR_SERVICE_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LEVEL:
				unsetLevel();
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LOG_NAME:
				setLogName(LOG_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_EXCEPTION_OCCURRED_REF:
				setOnExceptionOccurredRef(ON_EXCEPTION_OCCURRED_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_PREPARE_FAILURE_REF:
				setOnPrepareFailureRef(ON_PREPARE_FAILURE_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				setOnRedeliveryRef(ON_REDELIVERY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				setRedeliveryPolicyRef(REDELIVERY_POLICY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				setRetryWhileRef(RETRY_WHILE_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL:
				unsetRollbackLoggingLevel();
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF:
				setTransactionManagerRef(TRANSACTION_MANAGER_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF:
				setTransactionTemplateRef(TRANSACTION_TEMPLATE_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TYPE:
				unsetType();
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY:
				unsetUseOriginalBody();
				return;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				unsetUseOriginalMessage();
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
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				return redeliveryPolicy != null;
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__DEAD_LETTER_HANDLE_NEW_EXCEPTION:
				return DEAD_LETTER_HANDLE_NEW_EXCEPTION_EDEFAULT == null ? deadLetterHandleNewException != null : !DEAD_LETTER_HANDLE_NEW_EXCEPTION_EDEFAULT.equals(deadLetterHandleNewException);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI:
				return DEAD_LETTER_URI_EDEFAULT == null ? deadLetterUri != null : !DEAD_LETTER_URI_EDEFAULT.equals(deadLetterUri);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				return EXECUTOR_SERVICE_REF_EDEFAULT == null ? executorServiceRef != null : !EXECUTOR_SERVICE_REF_EDEFAULT.equals(executorServiceRef);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LEVEL:
				return isSetLevel();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__LOG_NAME:
				return LOG_NAME_EDEFAULT == null ? logName != null : !LOG_NAME_EDEFAULT.equals(logName);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_EXCEPTION_OCCURRED_REF:
				return ON_EXCEPTION_OCCURRED_REF_EDEFAULT == null ? onExceptionOccurredRef != null : !ON_EXCEPTION_OCCURRED_REF_EDEFAULT.equals(onExceptionOccurredRef);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_PREPARE_FAILURE_REF:
				return ON_PREPARE_FAILURE_REF_EDEFAULT == null ? onPrepareFailureRef != null : !ON_PREPARE_FAILURE_REF_EDEFAULT.equals(onPrepareFailureRef);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				return ON_REDELIVERY_REF_EDEFAULT == null ? onRedeliveryRef != null : !ON_REDELIVERY_REF_EDEFAULT.equals(onRedeliveryRef);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				return REDELIVERY_POLICY_REF_EDEFAULT == null ? redeliveryPolicyRef != null : !REDELIVERY_POLICY_REF_EDEFAULT.equals(redeliveryPolicyRef);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				return RETRY_WHILE_REF_EDEFAULT == null ? retryWhileRef != null : !RETRY_WHILE_REF_EDEFAULT.equals(retryWhileRef);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL:
				return isSetRollbackLoggingLevel();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF:
				return TRANSACTION_MANAGER_REF_EDEFAULT == null ? transactionManagerRef != null : !TRANSACTION_MANAGER_REF_EDEFAULT.equals(transactionManagerRef);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF:
				return TRANSACTION_TEMPLATE_REF_EDEFAULT == null ? transactionTemplateRef != null : !TRANSACTION_TEMPLATE_REF_EDEFAULT.equals(transactionTemplateRef);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__TYPE:
				return isSetType();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY:
				return isSetUseOriginalBody();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				return isSetUseOriginalMessage();
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
		result.append(" (deadLetterHandleNewException: ");
		result.append(deadLetterHandleNewException);
		result.append(", deadLetterUri: ");
		result.append(deadLetterUri);
		result.append(", executorServiceRef: ");
		result.append(executorServiceRef);
		result.append(", level: ");
		if (levelESet) result.append(level); else result.append("<unset>");
		result.append(", logName: ");
		result.append(logName);
		result.append(", onExceptionOccurredRef: ");
		result.append(onExceptionOccurredRef);
		result.append(", onPrepareFailureRef: ");
		result.append(onPrepareFailureRef);
		result.append(", onRedeliveryRef: ");
		result.append(onRedeliveryRef);
		result.append(", redeliveryPolicyRef: ");
		result.append(redeliveryPolicyRef);
		result.append(", retryWhileRef: ");
		result.append(retryWhileRef);
		result.append(", rollbackLoggingLevel: ");
		if (rollbackLoggingLevelESet) result.append(rollbackLoggingLevel); else result.append("<unset>");
		result.append(", transactionManagerRef: ");
		result.append(transactionManagerRef);
		result.append(", transactionTemplateRef: ");
		result.append(transactionTemplateRef);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", useOriginalBody: ");
		if (useOriginalBodyESet) result.append(useOriginalBody); else result.append("<unset>");
		result.append(", useOriginalMessage: ");
		if (useOriginalMessageESet) result.append(useOriginalMessage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SpringErrorHandlerDefinitionImpl

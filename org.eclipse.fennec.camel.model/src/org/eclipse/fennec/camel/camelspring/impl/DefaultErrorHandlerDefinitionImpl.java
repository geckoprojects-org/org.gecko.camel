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

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Error Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getLoggerRef <em>Logger Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getOnExceptionOccurredRef <em>On Exception Occurred Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getOnPrepareFailureRef <em>On Prepare Failure Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getOnRedeliveryRef <em>On Redelivery Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getRetryWhileRef <em>Retry While Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getUseOriginalBody <em>Use Original Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DefaultErrorHandlerDefinitionImpl#getUseOriginalMessage <em>Use Original Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultErrorHandlerDefinitionImpl extends BaseErrorHandlerDefinitionImpl implements DefaultErrorHandlerDefinition {
	/**
	 * The cached value of the '{@link #getRedeliveryPolicy() <em>Redelivery Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicy()
	 * @generated
	 * @ordered
	 */
	protected RedeliveryPolicyDefinition redeliveryPolicy;

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
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoggerRef() <em>Logger Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggerRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGGER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoggerRef() <em>Logger Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggerRef()
	 * @generated
	 * @ordered
	 */
	protected String loggerRef = LOGGER_REF_EDEFAULT;

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
	 * The default value of the '{@link #getUseOriginalBody() <em>Use Original Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOriginalBody()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_ORIGINAL_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseOriginalBody() <em>Use Original Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOriginalBody()
	 * @generated
	 * @ordered
	 */
	protected String useOriginalBody = USE_ORIGINAL_BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseOriginalMessage() <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOriginalMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_ORIGINAL_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseOriginalMessage() <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOriginalMessage()
	 * @generated
	 * @ordered
	 */
	protected String useOriginalMessage = USE_ORIGINAL_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultErrorHandlerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getDefaultErrorHandlerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedeliveryPolicyDefinition getRedeliveryPolicy() {
		return redeliveryPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedeliveryPolicy(RedeliveryPolicyDefinition newRedeliveryPolicy, NotificationChain msgs) {
		RedeliveryPolicyDefinition oldRedeliveryPolicy = redeliveryPolicy;
		redeliveryPolicy = newRedeliveryPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, oldRedeliveryPolicy, newRedeliveryPolicy);
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
	public void setRedeliveryPolicy(RedeliveryPolicyDefinition newRedeliveryPolicy) {
		if (newRedeliveryPolicy != redeliveryPolicy) {
			NotificationChain msgs = null;
			if (redeliveryPolicy != null)
				msgs = ((InternalEObject)redeliveryPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, null, msgs);
			if (newRedeliveryPolicy != null)
				msgs = ((InternalEObject)newRedeliveryPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, null, msgs);
			msgs = basicSetRedeliveryPolicy(newRedeliveryPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, newRedeliveryPolicy, newRedeliveryPolicy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF, oldExecutorServiceRef, executorServiceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoggerRef() {
		return loggerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoggerRef(String newLoggerRef) {
		String oldLoggerRef = loggerRef;
		loggerRef = newLoggerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LOGGER_REF, oldLoggerRef, loggerRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LOG_NAME, oldLogName, logName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_EXCEPTION_OCCURRED_REF, oldOnExceptionOccurredRef, onExceptionOccurredRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_PREPARE_FAILURE_REF, oldOnPrepareFailureRef, onPrepareFailureRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF, oldOnRedeliveryRef, onRedeliveryRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF, oldRedeliveryPolicyRef, redeliveryPolicyRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF, oldRetryWhileRef, retryWhileRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseOriginalBody() {
		return useOriginalBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseOriginalBody(String newUseOriginalBody) {
		String oldUseOriginalBody = useOriginalBody;
		useOriginalBody = newUseOriginalBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY, oldUseOriginalBody, useOriginalBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseOriginalMessage() {
		return useOriginalMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseOriginalMessage(String newUseOriginalMessage) {
		String oldUseOriginalMessage = useOriginalMessage;
		useOriginalMessage = newUseOriginalMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE, oldUseOriginalMessage, useOriginalMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
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
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				return getRedeliveryPolicy();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				return getExecutorServiceRef();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LEVEL:
				return getLevel();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LOGGER_REF:
				return getLoggerRef();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LOG_NAME:
				return getLogName();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_EXCEPTION_OCCURRED_REF:
				return getOnExceptionOccurredRef();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_PREPARE_FAILURE_REF:
				return getOnPrepareFailureRef();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				return getOnRedeliveryRef();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				return getRedeliveryPolicyRef();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				return getRetryWhileRef();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY:
				return getUseOriginalBody();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				return getUseOriginalMessage();
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
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				setRedeliveryPolicy((RedeliveryPolicyDefinition)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				setExecutorServiceRef((String)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LEVEL:
				setLevel((String)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LOGGER_REF:
				setLoggerRef((String)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LOG_NAME:
				setLogName((String)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_EXCEPTION_OCCURRED_REF:
				setOnExceptionOccurredRef((String)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_PREPARE_FAILURE_REF:
				setOnPrepareFailureRef((String)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				setOnRedeliveryRef((String)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				setRedeliveryPolicyRef((String)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				setRetryWhileRef((String)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY:
				setUseOriginalBody((String)newValue);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				setUseOriginalMessage((String)newValue);
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
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				setRedeliveryPolicy((RedeliveryPolicyDefinition)null);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				setExecutorServiceRef(EXECUTOR_SERVICE_REF_EDEFAULT);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LOGGER_REF:
				setLoggerRef(LOGGER_REF_EDEFAULT);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LOG_NAME:
				setLogName(LOG_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_EXCEPTION_OCCURRED_REF:
				setOnExceptionOccurredRef(ON_EXCEPTION_OCCURRED_REF_EDEFAULT);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_PREPARE_FAILURE_REF:
				setOnPrepareFailureRef(ON_PREPARE_FAILURE_REF_EDEFAULT);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				setOnRedeliveryRef(ON_REDELIVERY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				setRedeliveryPolicyRef(REDELIVERY_POLICY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				setRetryWhileRef(RETRY_WHILE_REF_EDEFAULT);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY:
				setUseOriginalBody(USE_ORIGINAL_BODY_EDEFAULT);
				return;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				setUseOriginalMessage(USE_ORIGINAL_MESSAGE_EDEFAULT);
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
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				return redeliveryPolicy != null;
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				return EXECUTOR_SERVICE_REF_EDEFAULT == null ? executorServiceRef != null : !EXECUTOR_SERVICE_REF_EDEFAULT.equals(executorServiceRef);
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LOGGER_REF:
				return LOGGER_REF_EDEFAULT == null ? loggerRef != null : !LOGGER_REF_EDEFAULT.equals(loggerRef);
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__LOG_NAME:
				return LOG_NAME_EDEFAULT == null ? logName != null : !LOG_NAME_EDEFAULT.equals(logName);
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_EXCEPTION_OCCURRED_REF:
				return ON_EXCEPTION_OCCURRED_REF_EDEFAULT == null ? onExceptionOccurredRef != null : !ON_EXCEPTION_OCCURRED_REF_EDEFAULT.equals(onExceptionOccurredRef);
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_PREPARE_FAILURE_REF:
				return ON_PREPARE_FAILURE_REF_EDEFAULT == null ? onPrepareFailureRef != null : !ON_PREPARE_FAILURE_REF_EDEFAULT.equals(onPrepareFailureRef);
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				return ON_REDELIVERY_REF_EDEFAULT == null ? onRedeliveryRef != null : !ON_REDELIVERY_REF_EDEFAULT.equals(onRedeliveryRef);
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				return REDELIVERY_POLICY_REF_EDEFAULT == null ? redeliveryPolicyRef != null : !REDELIVERY_POLICY_REF_EDEFAULT.equals(redeliveryPolicyRef);
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				return RETRY_WHILE_REF_EDEFAULT == null ? retryWhileRef != null : !RETRY_WHILE_REF_EDEFAULT.equals(retryWhileRef);
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_BODY:
				return USE_ORIGINAL_BODY_EDEFAULT == null ? useOriginalBody != null : !USE_ORIGINAL_BODY_EDEFAULT.equals(useOriginalBody);
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				return USE_ORIGINAL_MESSAGE_EDEFAULT == null ? useOriginalMessage != null : !USE_ORIGINAL_MESSAGE_EDEFAULT.equals(useOriginalMessage);
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
		result.append(" (executorServiceRef: ");
		result.append(executorServiceRef);
		result.append(", level: ");
		result.append(level);
		result.append(", loggerRef: ");
		result.append(loggerRef);
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
		result.append(", useOriginalBody: ");
		result.append(useOriginalBody);
		result.append(", useOriginalMessage: ");
		result.append(useOriginalMessage);
		result.append(')');
		return result.toString();
	}

} //DefaultErrorHandlerDefinitionImpl

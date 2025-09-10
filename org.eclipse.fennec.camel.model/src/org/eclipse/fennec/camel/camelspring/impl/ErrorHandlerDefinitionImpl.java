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
import org.eclipse.fennec.camel.camelspring.DeadLetterChannelDefinition;
import org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.JtaTransactionErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.NoErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.RefErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.SpringTransactionErrorHandlerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ErrorHandlerDefinitionImpl#getDeadLetterChannel <em>Dead Letter Channel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ErrorHandlerDefinitionImpl#getDefaultErrorHandler <em>Default Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ErrorHandlerDefinitionImpl#getNoErrorHandler <em>No Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ErrorHandlerDefinitionImpl#getRefErrorHandler <em>Ref Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ErrorHandlerDefinitionImpl#getJtaTransactionErrorHandler <em>Jta Transaction Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ErrorHandlerDefinitionImpl#getSpringTransactionErrorHandler <em>Spring Transaction Error Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorHandlerDefinitionImpl extends IdentifiedTypeImpl implements ErrorHandlerDefinition {
	/**
	 * The cached value of the '{@link #getDeadLetterChannel() <em>Dead Letter Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterChannel()
	 * @generated
	 * @ordered
	 */
	protected DeadLetterChannelDefinition deadLetterChannel;

	/**
	 * The cached value of the '{@link #getDefaultErrorHandler() <em>Default Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected DefaultErrorHandlerDefinition defaultErrorHandler;

	/**
	 * The cached value of the '{@link #getNoErrorHandler() <em>No Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected NoErrorHandlerDefinition noErrorHandler;

	/**
	 * The cached value of the '{@link #getRefErrorHandler() <em>Ref Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected RefErrorHandlerDefinition refErrorHandler;

	/**
	 * The cached value of the '{@link #getJtaTransactionErrorHandler() <em>Jta Transaction Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJtaTransactionErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected JtaTransactionErrorHandlerDefinition jtaTransactionErrorHandler;

	/**
	 * The cached value of the '{@link #getSpringTransactionErrorHandler() <em>Spring Transaction Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpringTransactionErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected SpringTransactionErrorHandlerDefinition springTransactionErrorHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorHandlerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getErrorHandlerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeadLetterChannelDefinition getDeadLetterChannel() {
		return deadLetterChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeadLetterChannel(DeadLetterChannelDefinition newDeadLetterChannel, NotificationChain msgs) {
		DeadLetterChannelDefinition oldDeadLetterChannel = deadLetterChannel;
		deadLetterChannel = newDeadLetterChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_CHANNEL, oldDeadLetterChannel, newDeadLetterChannel);
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
	public void setDeadLetterChannel(DeadLetterChannelDefinition newDeadLetterChannel) {
		if (newDeadLetterChannel != deadLetterChannel) {
			NotificationChain msgs = null;
			if (deadLetterChannel != null)
				msgs = ((InternalEObject)deadLetterChannel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_CHANNEL, null, msgs);
			if (newDeadLetterChannel != null)
				msgs = ((InternalEObject)newDeadLetterChannel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_CHANNEL, null, msgs);
			msgs = basicSetDeadLetterChannel(newDeadLetterChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_CHANNEL, newDeadLetterChannel, newDeadLetterChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultErrorHandlerDefinition getDefaultErrorHandler() {
		return defaultErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultErrorHandler(DefaultErrorHandlerDefinition newDefaultErrorHandler, NotificationChain msgs) {
		DefaultErrorHandlerDefinition oldDefaultErrorHandler = defaultErrorHandler;
		defaultErrorHandler = newDefaultErrorHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEFAULT_ERROR_HANDLER, oldDefaultErrorHandler, newDefaultErrorHandler);
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
	public void setDefaultErrorHandler(DefaultErrorHandlerDefinition newDefaultErrorHandler) {
		if (newDefaultErrorHandler != defaultErrorHandler) {
			NotificationChain msgs = null;
			if (defaultErrorHandler != null)
				msgs = ((InternalEObject)defaultErrorHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEFAULT_ERROR_HANDLER, null, msgs);
			if (newDefaultErrorHandler != null)
				msgs = ((InternalEObject)newDefaultErrorHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEFAULT_ERROR_HANDLER, null, msgs);
			msgs = basicSetDefaultErrorHandler(newDefaultErrorHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEFAULT_ERROR_HANDLER, newDefaultErrorHandler, newDefaultErrorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoErrorHandlerDefinition getNoErrorHandler() {
		return noErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoErrorHandler(NoErrorHandlerDefinition newNoErrorHandler, NotificationChain msgs) {
		NoErrorHandlerDefinition oldNoErrorHandler = noErrorHandler;
		noErrorHandler = newNoErrorHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__NO_ERROR_HANDLER, oldNoErrorHandler, newNoErrorHandler);
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
	public void setNoErrorHandler(NoErrorHandlerDefinition newNoErrorHandler) {
		if (newNoErrorHandler != noErrorHandler) {
			NotificationChain msgs = null;
			if (noErrorHandler != null)
				msgs = ((InternalEObject)noErrorHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__NO_ERROR_HANDLER, null, msgs);
			if (newNoErrorHandler != null)
				msgs = ((InternalEObject)newNoErrorHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__NO_ERROR_HANDLER, null, msgs);
			msgs = basicSetNoErrorHandler(newNoErrorHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__NO_ERROR_HANDLER, newNoErrorHandler, newNoErrorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefErrorHandlerDefinition getRefErrorHandler() {
		return refErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefErrorHandler(RefErrorHandlerDefinition newRefErrorHandler, NotificationChain msgs) {
		RefErrorHandlerDefinition oldRefErrorHandler = refErrorHandler;
		refErrorHandler = newRefErrorHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__REF_ERROR_HANDLER, oldRefErrorHandler, newRefErrorHandler);
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
	public void setRefErrorHandler(RefErrorHandlerDefinition newRefErrorHandler) {
		if (newRefErrorHandler != refErrorHandler) {
			NotificationChain msgs = null;
			if (refErrorHandler != null)
				msgs = ((InternalEObject)refErrorHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__REF_ERROR_HANDLER, null, msgs);
			if (newRefErrorHandler != null)
				msgs = ((InternalEObject)newRefErrorHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__REF_ERROR_HANDLER, null, msgs);
			msgs = basicSetRefErrorHandler(newRefErrorHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__REF_ERROR_HANDLER, newRefErrorHandler, newRefErrorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JtaTransactionErrorHandlerDefinition getJtaTransactionErrorHandler() {
		return jtaTransactionErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJtaTransactionErrorHandler(JtaTransactionErrorHandlerDefinition newJtaTransactionErrorHandler, NotificationChain msgs) {
		JtaTransactionErrorHandlerDefinition oldJtaTransactionErrorHandler = jtaTransactionErrorHandler;
		jtaTransactionErrorHandler = newJtaTransactionErrorHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__JTA_TRANSACTION_ERROR_HANDLER, oldJtaTransactionErrorHandler, newJtaTransactionErrorHandler);
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
	public void setJtaTransactionErrorHandler(JtaTransactionErrorHandlerDefinition newJtaTransactionErrorHandler) {
		if (newJtaTransactionErrorHandler != jtaTransactionErrorHandler) {
			NotificationChain msgs = null;
			if (jtaTransactionErrorHandler != null)
				msgs = ((InternalEObject)jtaTransactionErrorHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__JTA_TRANSACTION_ERROR_HANDLER, null, msgs);
			if (newJtaTransactionErrorHandler != null)
				msgs = ((InternalEObject)newJtaTransactionErrorHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__JTA_TRANSACTION_ERROR_HANDLER, null, msgs);
			msgs = basicSetJtaTransactionErrorHandler(newJtaTransactionErrorHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__JTA_TRANSACTION_ERROR_HANDLER, newJtaTransactionErrorHandler, newJtaTransactionErrorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpringTransactionErrorHandlerDefinition getSpringTransactionErrorHandler() {
		return springTransactionErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpringTransactionErrorHandler(SpringTransactionErrorHandlerDefinition newSpringTransactionErrorHandler, NotificationChain msgs) {
		SpringTransactionErrorHandlerDefinition oldSpringTransactionErrorHandler = springTransactionErrorHandler;
		springTransactionErrorHandler = newSpringTransactionErrorHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__SPRING_TRANSACTION_ERROR_HANDLER, oldSpringTransactionErrorHandler, newSpringTransactionErrorHandler);
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
	public void setSpringTransactionErrorHandler(SpringTransactionErrorHandlerDefinition newSpringTransactionErrorHandler) {
		if (newSpringTransactionErrorHandler != springTransactionErrorHandler) {
			NotificationChain msgs = null;
			if (springTransactionErrorHandler != null)
				msgs = ((InternalEObject)springTransactionErrorHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__SPRING_TRANSACTION_ERROR_HANDLER, null, msgs);
			if (newSpringTransactionErrorHandler != null)
				msgs = ((InternalEObject)newSpringTransactionErrorHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ERROR_HANDLER_DEFINITION__SPRING_TRANSACTION_ERROR_HANDLER, null, msgs);
			msgs = basicSetSpringTransactionErrorHandler(newSpringTransactionErrorHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ERROR_HANDLER_DEFINITION__SPRING_TRANSACTION_ERROR_HANDLER, newSpringTransactionErrorHandler, newSpringTransactionErrorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_CHANNEL:
				return basicSetDeadLetterChannel(null, msgs);
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEFAULT_ERROR_HANDLER:
				return basicSetDefaultErrorHandler(null, msgs);
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__NO_ERROR_HANDLER:
				return basicSetNoErrorHandler(null, msgs);
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__REF_ERROR_HANDLER:
				return basicSetRefErrorHandler(null, msgs);
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__JTA_TRANSACTION_ERROR_HANDLER:
				return basicSetJtaTransactionErrorHandler(null, msgs);
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__SPRING_TRANSACTION_ERROR_HANDLER:
				return basicSetSpringTransactionErrorHandler(null, msgs);
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
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_CHANNEL:
				return getDeadLetterChannel();
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEFAULT_ERROR_HANDLER:
				return getDefaultErrorHandler();
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__NO_ERROR_HANDLER:
				return getNoErrorHandler();
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__REF_ERROR_HANDLER:
				return getRefErrorHandler();
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__JTA_TRANSACTION_ERROR_HANDLER:
				return getJtaTransactionErrorHandler();
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__SPRING_TRANSACTION_ERROR_HANDLER:
				return getSpringTransactionErrorHandler();
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
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_CHANNEL:
				setDeadLetterChannel((DeadLetterChannelDefinition)newValue);
				return;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEFAULT_ERROR_HANDLER:
				setDefaultErrorHandler((DefaultErrorHandlerDefinition)newValue);
				return;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__NO_ERROR_HANDLER:
				setNoErrorHandler((NoErrorHandlerDefinition)newValue);
				return;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__REF_ERROR_HANDLER:
				setRefErrorHandler((RefErrorHandlerDefinition)newValue);
				return;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__JTA_TRANSACTION_ERROR_HANDLER:
				setJtaTransactionErrorHandler((JtaTransactionErrorHandlerDefinition)newValue);
				return;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__SPRING_TRANSACTION_ERROR_HANDLER:
				setSpringTransactionErrorHandler((SpringTransactionErrorHandlerDefinition)newValue);
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
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_CHANNEL:
				setDeadLetterChannel((DeadLetterChannelDefinition)null);
				return;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEFAULT_ERROR_HANDLER:
				setDefaultErrorHandler((DefaultErrorHandlerDefinition)null);
				return;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__NO_ERROR_HANDLER:
				setNoErrorHandler((NoErrorHandlerDefinition)null);
				return;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__REF_ERROR_HANDLER:
				setRefErrorHandler((RefErrorHandlerDefinition)null);
				return;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__JTA_TRANSACTION_ERROR_HANDLER:
				setJtaTransactionErrorHandler((JtaTransactionErrorHandlerDefinition)null);
				return;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__SPRING_TRANSACTION_ERROR_HANDLER:
				setSpringTransactionErrorHandler((SpringTransactionErrorHandlerDefinition)null);
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
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_CHANNEL:
				return deadLetterChannel != null;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__DEFAULT_ERROR_HANDLER:
				return defaultErrorHandler != null;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__NO_ERROR_HANDLER:
				return noErrorHandler != null;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__REF_ERROR_HANDLER:
				return refErrorHandler != null;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__JTA_TRANSACTION_ERROR_HANDLER:
				return jtaTransactionErrorHandler != null;
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION__SPRING_TRANSACTION_ERROR_HANDLER:
				return springTransactionErrorHandler != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorHandlerDefinitionImpl

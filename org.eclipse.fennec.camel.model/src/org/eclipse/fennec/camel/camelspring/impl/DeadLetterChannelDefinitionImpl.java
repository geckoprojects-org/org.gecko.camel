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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.DeadLetterChannelDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dead Letter Channel Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DeadLetterChannelDefinitionImpl#getDeadLetterHandleNewException <em>Dead Letter Handle New Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DeadLetterChannelDefinitionImpl#getDeadLetterUri <em>Dead Letter Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeadLetterChannelDefinitionImpl extends DefaultErrorHandlerDefinitionImpl implements DeadLetterChannelDefinition {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeadLetterChannelDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getDeadLetterChannelDefinition();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION__DEAD_LETTER_HANDLE_NEW_EXCEPTION, oldDeadLetterHandleNewException, deadLetterHandleNewException));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION__DEAD_LETTER_URI, oldDeadLetterUri, deadLetterUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION__DEAD_LETTER_HANDLE_NEW_EXCEPTION:
				return getDeadLetterHandleNewException();
			case CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION__DEAD_LETTER_URI:
				return getDeadLetterUri();
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
			case CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION__DEAD_LETTER_HANDLE_NEW_EXCEPTION:
				setDeadLetterHandleNewException((String)newValue);
				return;
			case CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION__DEAD_LETTER_URI:
				setDeadLetterUri((String)newValue);
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
			case CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION__DEAD_LETTER_HANDLE_NEW_EXCEPTION:
				setDeadLetterHandleNewException(DEAD_LETTER_HANDLE_NEW_EXCEPTION_EDEFAULT);
				return;
			case CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION__DEAD_LETTER_URI:
				setDeadLetterUri(DEAD_LETTER_URI_EDEFAULT);
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
			case CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION__DEAD_LETTER_HANDLE_NEW_EXCEPTION:
				return DEAD_LETTER_HANDLE_NEW_EXCEPTION_EDEFAULT == null ? deadLetterHandleNewException != null : !DEAD_LETTER_HANDLE_NEW_EXCEPTION_EDEFAULT.equals(deadLetterHandleNewException);
			case CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION__DEAD_LETTER_URI:
				return DEAD_LETTER_URI_EDEFAULT == null ? deadLetterUri != null : !DEAD_LETTER_URI_EDEFAULT.equals(deadLetterUri);
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
		result.append(')');
		return result.toString();
	}

} //DeadLetterChannelDefinitionImpl

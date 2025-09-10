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
import org.eclipse.fennec.camel.camelspring.TransactionErrorHandlerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Error Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransactionErrorHandlerDefinitionImpl#getRollbackLoggingLevel <em>Rollback Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransactionErrorHandlerDefinitionImpl#getTransactedPolicyRef <em>Transacted Policy Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransactionErrorHandlerDefinitionImpl extends DefaultErrorHandlerDefinitionImpl implements TransactionErrorHandlerDefinition {
	/**
	 * The default value of the '{@link #getRollbackLoggingLevel() <em>Rollback Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollbackLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLLBACK_LOGGING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRollbackLoggingLevel() <em>Rollback Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollbackLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected String rollbackLoggingLevel = ROLLBACK_LOGGING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactedPolicyRef() <em>Transacted Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactedPolicyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTED_POLICY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactedPolicyRef() <em>Transacted Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactedPolicyRef()
	 * @generated
	 * @ordered
	 */
	protected String transactedPolicyRef = TRANSACTED_POLICY_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionErrorHandlerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getTransactionErrorHandlerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRollbackLoggingLevel() {
		return rollbackLoggingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRollbackLoggingLevel(String newRollbackLoggingLevel) {
		String oldRollbackLoggingLevel = rollbackLoggingLevel;
		rollbackLoggingLevel = newRollbackLoggingLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL, oldRollbackLoggingLevel, rollbackLoggingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransactedPolicyRef() {
		return transactedPolicyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactedPolicyRef(String newTransactedPolicyRef) {
		String oldTransactedPolicyRef = transactedPolicyRef;
		transactedPolicyRef = newTransactedPolicyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION__TRANSACTED_POLICY_REF, oldTransactedPolicyRef, transactedPolicyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL:
				return getRollbackLoggingLevel();
			case CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION__TRANSACTED_POLICY_REF:
				return getTransactedPolicyRef();
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
			case CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL:
				setRollbackLoggingLevel((String)newValue);
				return;
			case CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION__TRANSACTED_POLICY_REF:
				setTransactedPolicyRef((String)newValue);
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
			case CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL:
				setRollbackLoggingLevel(ROLLBACK_LOGGING_LEVEL_EDEFAULT);
				return;
			case CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION__TRANSACTED_POLICY_REF:
				setTransactedPolicyRef(TRANSACTED_POLICY_REF_EDEFAULT);
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
			case CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION__ROLLBACK_LOGGING_LEVEL:
				return ROLLBACK_LOGGING_LEVEL_EDEFAULT == null ? rollbackLoggingLevel != null : !ROLLBACK_LOGGING_LEVEL_EDEFAULT.equals(rollbackLoggingLevel);
			case CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION__TRANSACTED_POLICY_REF:
				return TRANSACTED_POLICY_REF_EDEFAULT == null ? transactedPolicyRef != null : !TRANSACTED_POLICY_REF_EDEFAULT.equals(transactedPolicyRef);
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
		result.append(" (rollbackLoggingLevel: ");
		result.append(rollbackLoggingLevel);
		result.append(", transactedPolicyRef: ");
		result.append(transactedPolicyRef);
		result.append(')');
		return result.toString();
	}

} //TransactionErrorHandlerDefinitionImpl

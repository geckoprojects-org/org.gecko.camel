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
import org.eclipse.fennec.camel.camelspring.RollbackDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rollback Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RollbackDefinitionImpl#getMarkRollbackOnly <em>Mark Rollback Only</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RollbackDefinitionImpl#getMarkRollbackOnlyLast <em>Mark Rollback Only Last</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RollbackDefinitionImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RollbackDefinitionImpl extends NoOutputDefinitionImpl implements RollbackDefinition {
	/**
	 * The default value of the '{@link #getMarkRollbackOnly() <em>Mark Rollback Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkRollbackOnly()
	 * @generated
	 * @ordered
	 */
	protected static final String MARK_ROLLBACK_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkRollbackOnly() <em>Mark Rollback Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkRollbackOnly()
	 * @generated
	 * @ordered
	 */
	protected String markRollbackOnly = MARK_ROLLBACK_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarkRollbackOnlyLast() <em>Mark Rollback Only Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkRollbackOnlyLast()
	 * @generated
	 * @ordered
	 */
	protected static final String MARK_ROLLBACK_ONLY_LAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkRollbackOnlyLast() <em>Mark Rollback Only Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkRollbackOnlyLast()
	 * @generated
	 * @ordered
	 */
	protected String markRollbackOnlyLast = MARK_ROLLBACK_ONLY_LAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RollbackDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getRollbackDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarkRollbackOnly() {
		return markRollbackOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkRollbackOnly(String newMarkRollbackOnly) {
		String oldMarkRollbackOnly = markRollbackOnly;
		markRollbackOnly = newMarkRollbackOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY, oldMarkRollbackOnly, markRollbackOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarkRollbackOnlyLast() {
		return markRollbackOnlyLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkRollbackOnlyLast(String newMarkRollbackOnlyLast) {
		String oldMarkRollbackOnlyLast = markRollbackOnlyLast;
		markRollbackOnlyLast = newMarkRollbackOnlyLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST, oldMarkRollbackOnlyLast, markRollbackOnlyLast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROLLBACK_DEFINITION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY:
				return getMarkRollbackOnly();
			case CamelSpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST:
				return getMarkRollbackOnlyLast();
			case CamelSpringPackage.ROLLBACK_DEFINITION__MESSAGE:
				return getMessage();
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
			case CamelSpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY:
				setMarkRollbackOnly((String)newValue);
				return;
			case CamelSpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST:
				setMarkRollbackOnlyLast((String)newValue);
				return;
			case CamelSpringPackage.ROLLBACK_DEFINITION__MESSAGE:
				setMessage((String)newValue);
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
			case CamelSpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY:
				setMarkRollbackOnly(MARK_ROLLBACK_ONLY_EDEFAULT);
				return;
			case CamelSpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST:
				setMarkRollbackOnlyLast(MARK_ROLLBACK_ONLY_LAST_EDEFAULT);
				return;
			case CamelSpringPackage.ROLLBACK_DEFINITION__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case CamelSpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY:
				return MARK_ROLLBACK_ONLY_EDEFAULT == null ? markRollbackOnly != null : !MARK_ROLLBACK_ONLY_EDEFAULT.equals(markRollbackOnly);
			case CamelSpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST:
				return MARK_ROLLBACK_ONLY_LAST_EDEFAULT == null ? markRollbackOnlyLast != null : !MARK_ROLLBACK_ONLY_LAST_EDEFAULT.equals(markRollbackOnlyLast);
			case CamelSpringPackage.ROLLBACK_DEFINITION__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
		result.append(" (markRollbackOnly: ");
		result.append(markRollbackOnly);
		result.append(", markRollbackOnlyLast: ");
		result.append(markRollbackOnlyLast);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //RollbackDefinitionImpl

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
import org.eclipse.fennec.camel.camelspring.ResumableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resumable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResumableDefinitionImpl#getIntermittent <em>Intermittent</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResumableDefinitionImpl#getLoggingLevel <em>Logging Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResumableDefinitionImpl#getResumeStrategy <em>Resume Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResumableDefinitionImpl extends NoOutputDefinitionImpl implements ResumableDefinition {
	/**
	 * The default value of the '{@link #getIntermittent() <em>Intermittent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermittent()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERMITTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntermittent() <em>Intermittent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermittent()
	 * @generated
	 * @ordered
	 */
	protected String intermittent = INTERMITTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoggingLevel() <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGGING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoggingLevel() <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected String loggingLevel = LOGGING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResumeStrategy() <em>Resume Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String RESUME_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResumeStrategy() <em>Resume Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeStrategy()
	 * @generated
	 * @ordered
	 */
	protected String resumeStrategy = RESUME_STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResumableDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getResumableDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntermittent() {
		return intermittent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntermittent(String newIntermittent) {
		String oldIntermittent = intermittent;
		intermittent = newIntermittent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESUMABLE_DEFINITION__INTERMITTENT, oldIntermittent, intermittent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoggingLevel() {
		return loggingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoggingLevel(String newLoggingLevel) {
		String oldLoggingLevel = loggingLevel;
		loggingLevel = newLoggingLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESUMABLE_DEFINITION__LOGGING_LEVEL, oldLoggingLevel, loggingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResumeStrategy() {
		return resumeStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResumeStrategy(String newResumeStrategy) {
		String oldResumeStrategy = resumeStrategy;
		resumeStrategy = newResumeStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESUMABLE_DEFINITION__RESUME_STRATEGY, oldResumeStrategy, resumeStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.RESUMABLE_DEFINITION__INTERMITTENT:
				return getIntermittent();
			case CamelSpringPackage.RESUMABLE_DEFINITION__LOGGING_LEVEL:
				return getLoggingLevel();
			case CamelSpringPackage.RESUMABLE_DEFINITION__RESUME_STRATEGY:
				return getResumeStrategy();
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
			case CamelSpringPackage.RESUMABLE_DEFINITION__INTERMITTENT:
				setIntermittent((String)newValue);
				return;
			case CamelSpringPackage.RESUMABLE_DEFINITION__LOGGING_LEVEL:
				setLoggingLevel((String)newValue);
				return;
			case CamelSpringPackage.RESUMABLE_DEFINITION__RESUME_STRATEGY:
				setResumeStrategy((String)newValue);
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
			case CamelSpringPackage.RESUMABLE_DEFINITION__INTERMITTENT:
				setIntermittent(INTERMITTENT_EDEFAULT);
				return;
			case CamelSpringPackage.RESUMABLE_DEFINITION__LOGGING_LEVEL:
				setLoggingLevel(LOGGING_LEVEL_EDEFAULT);
				return;
			case CamelSpringPackage.RESUMABLE_DEFINITION__RESUME_STRATEGY:
				setResumeStrategy(RESUME_STRATEGY_EDEFAULT);
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
			case CamelSpringPackage.RESUMABLE_DEFINITION__INTERMITTENT:
				return INTERMITTENT_EDEFAULT == null ? intermittent != null : !INTERMITTENT_EDEFAULT.equals(intermittent);
			case CamelSpringPackage.RESUMABLE_DEFINITION__LOGGING_LEVEL:
				return LOGGING_LEVEL_EDEFAULT == null ? loggingLevel != null : !LOGGING_LEVEL_EDEFAULT.equals(loggingLevel);
			case CamelSpringPackage.RESUMABLE_DEFINITION__RESUME_STRATEGY:
				return RESUME_STRATEGY_EDEFAULT == null ? resumeStrategy != null : !RESUME_STRATEGY_EDEFAULT.equals(resumeStrategy);
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
		result.append(" (intermittent: ");
		result.append(intermittent);
		result.append(", loggingLevel: ");
		result.append(loggingLevel);
		result.append(", resumeStrategy: ");
		result.append(resumeStrategy);
		result.append(')');
		return result.toString();
	}

} //ResumableDefinitionImpl

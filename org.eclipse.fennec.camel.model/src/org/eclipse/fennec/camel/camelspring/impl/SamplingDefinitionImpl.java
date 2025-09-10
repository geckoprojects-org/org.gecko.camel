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
import org.eclipse.fennec.camel.camelspring.SamplingDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampling Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SamplingDefinitionImpl#getMessageFrequency <em>Message Frequency</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SamplingDefinitionImpl#getSamplePeriod <em>Sample Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SamplingDefinitionImpl extends NoOutputDefinitionImpl implements SamplingDefinition {
	/**
	 * The default value of the '{@link #getMessageFrequency() <em>Message Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageFrequency() <em>Message Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFrequency()
	 * @generated
	 * @ordered
	 */
	protected String messageFrequency = MESSAGE_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplePeriod() <em>Sample Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLE_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplePeriod() <em>Sample Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplePeriod()
	 * @generated
	 * @ordered
	 */
	protected String samplePeriod = SAMPLE_PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SamplingDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSamplingDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageFrequency() {
		return messageFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageFrequency(String newMessageFrequency) {
		String oldMessageFrequency = messageFrequency;
		messageFrequency = newMessageFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY, oldMessageFrequency, messageFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSamplePeriod() {
		return samplePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSamplePeriod(String newSamplePeriod) {
		String oldSamplePeriod = samplePeriod;
		samplePeriod = newSamplePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD, oldSamplePeriod, samplePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY:
				return getMessageFrequency();
			case CamelSpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD:
				return getSamplePeriod();
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
			case CamelSpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY:
				setMessageFrequency((String)newValue);
				return;
			case CamelSpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD:
				setSamplePeriod((String)newValue);
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
			case CamelSpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY:
				setMessageFrequency(MESSAGE_FREQUENCY_EDEFAULT);
				return;
			case CamelSpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD:
				setSamplePeriod(SAMPLE_PERIOD_EDEFAULT);
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
			case CamelSpringPackage.SAMPLING_DEFINITION__MESSAGE_FREQUENCY:
				return MESSAGE_FREQUENCY_EDEFAULT == null ? messageFrequency != null : !MESSAGE_FREQUENCY_EDEFAULT.equals(messageFrequency);
			case CamelSpringPackage.SAMPLING_DEFINITION__SAMPLE_PERIOD:
				return SAMPLE_PERIOD_EDEFAULT == null ? samplePeriod != null : !SAMPLE_PERIOD_EDEFAULT.equals(samplePeriod);
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
		result.append(" (messageFrequency: ");
		result.append(messageFrequency);
		result.append(", samplePeriod: ");
		result.append(samplePeriod);
		result.append(')');
		return result.toString();
	}

} //SamplingDefinitionImpl

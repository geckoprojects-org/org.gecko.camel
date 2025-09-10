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
import org.eclipse.fennec.camel.camelspring.DatasonnetExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datasonnet Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DatasonnetExpressionImpl#getBodyMediaType <em>Body Media Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DatasonnetExpressionImpl#getOutputMediaType <em>Output Media Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasonnetExpressionImpl extends SingleInputTypedExpressionDefinitionImpl implements DatasonnetExpression {
	/**
	 * The default value of the '{@link #getBodyMediaType() <em>Body Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBodyMediaType() <em>Body Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyMediaType()
	 * @generated
	 * @ordered
	 */
	protected String bodyMediaType = BODY_MEDIA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputMediaType() <em>Output Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputMediaType() <em>Output Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMediaType()
	 * @generated
	 * @ordered
	 */
	protected String outputMediaType = OUTPUT_MEDIA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasonnetExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getDatasonnetExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBodyMediaType() {
		return bodyMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyMediaType(String newBodyMediaType) {
		String oldBodyMediaType = bodyMediaType;
		bodyMediaType = newBodyMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DATASONNET_EXPRESSION__BODY_MEDIA_TYPE, oldBodyMediaType, bodyMediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputMediaType() {
		return outputMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputMediaType(String newOutputMediaType) {
		String oldOutputMediaType = outputMediaType;
		outputMediaType = newOutputMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DATASONNET_EXPRESSION__OUTPUT_MEDIA_TYPE, oldOutputMediaType, outputMediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.DATASONNET_EXPRESSION__BODY_MEDIA_TYPE:
				return getBodyMediaType();
			case CamelSpringPackage.DATASONNET_EXPRESSION__OUTPUT_MEDIA_TYPE:
				return getOutputMediaType();
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
			case CamelSpringPackage.DATASONNET_EXPRESSION__BODY_MEDIA_TYPE:
				setBodyMediaType((String)newValue);
				return;
			case CamelSpringPackage.DATASONNET_EXPRESSION__OUTPUT_MEDIA_TYPE:
				setOutputMediaType((String)newValue);
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
			case CamelSpringPackage.DATASONNET_EXPRESSION__BODY_MEDIA_TYPE:
				setBodyMediaType(BODY_MEDIA_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.DATASONNET_EXPRESSION__OUTPUT_MEDIA_TYPE:
				setOutputMediaType(OUTPUT_MEDIA_TYPE_EDEFAULT);
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
			case CamelSpringPackage.DATASONNET_EXPRESSION__BODY_MEDIA_TYPE:
				return BODY_MEDIA_TYPE_EDEFAULT == null ? bodyMediaType != null : !BODY_MEDIA_TYPE_EDEFAULT.equals(bodyMediaType);
			case CamelSpringPackage.DATASONNET_EXPRESSION__OUTPUT_MEDIA_TYPE:
				return OUTPUT_MEDIA_TYPE_EDEFAULT == null ? outputMediaType != null : !OUTPUT_MEDIA_TYPE_EDEFAULT.equals(outputMediaType);
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
		result.append(" (bodyMediaType: ");
		result.append(bodyMediaType);
		result.append(", outputMediaType: ");
		result.append(outputMediaType);
		result.append(')');
		return result.toString();
	}

} //DatasonnetExpressionImpl

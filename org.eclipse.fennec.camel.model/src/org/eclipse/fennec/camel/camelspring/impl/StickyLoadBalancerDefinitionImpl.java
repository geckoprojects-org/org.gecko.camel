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
import org.eclipse.fennec.camel.camelspring.ExpressionSubElementDefinition;
import org.eclipse.fennec.camel.camelspring.StickyLoadBalancerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sticky Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.StickyLoadBalancerDefinitionImpl#getCorrelationExpression <em>Correlation Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StickyLoadBalancerDefinitionImpl extends LoadBalancerDefinitionImpl implements StickyLoadBalancerDefinition {
	/**
	 * The cached value of the '{@link #getCorrelationExpression() <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSubElementDefinition correlationExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StickyLoadBalancerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getStickyLoadBalancerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionSubElementDefinition getCorrelationExpression() {
		return correlationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationExpression(ExpressionSubElementDefinition newCorrelationExpression, NotificationChain msgs) {
		ExpressionSubElementDefinition oldCorrelationExpression = correlationExpression;
		correlationExpression = newCorrelationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION__CORRELATION_EXPRESSION, oldCorrelationExpression, newCorrelationExpression);
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
	public void setCorrelationExpression(ExpressionSubElementDefinition newCorrelationExpression) {
		if (newCorrelationExpression != correlationExpression) {
			NotificationChain msgs = null;
			if (correlationExpression != null)
				msgs = ((InternalEObject)correlationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION__CORRELATION_EXPRESSION, null, msgs);
			if (newCorrelationExpression != null)
				msgs = ((InternalEObject)newCorrelationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION__CORRELATION_EXPRESSION, null, msgs);
			msgs = basicSetCorrelationExpression(newCorrelationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION__CORRELATION_EXPRESSION, newCorrelationExpression, newCorrelationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION__CORRELATION_EXPRESSION:
				return basicSetCorrelationExpression(null, msgs);
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
			case CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION__CORRELATION_EXPRESSION:
				return getCorrelationExpression();
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
			case CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION__CORRELATION_EXPRESSION:
				setCorrelationExpression((ExpressionSubElementDefinition)newValue);
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
			case CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION__CORRELATION_EXPRESSION:
				setCorrelationExpression((ExpressionSubElementDefinition)null);
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
			case CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION__CORRELATION_EXPRESSION:
				return correlationExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //StickyLoadBalancerDefinitionImpl

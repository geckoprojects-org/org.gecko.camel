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
import org.eclipse.fennec.camel.camelspring.MethodCallExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MethodCallExpressionImpl#getBeanType <em>Bean Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MethodCallExpressionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MethodCallExpressionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MethodCallExpressionImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MethodCallExpressionImpl#getValidate <em>Validate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallExpressionImpl extends TypedExpressionDefinitionImpl implements MethodCallExpression {
	/**
	 * The default value of the '{@link #getBeanType() <em>Bean Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanType()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeanType() <em>Bean Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanType()
	 * @generated
	 * @ordered
	 */
	protected String beanType = BEAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected String validate = VALIDATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getMethodCallExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeanType() {
		return beanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeanType(String newBeanType) {
		String oldBeanType = beanType;
		beanType = newBeanType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.METHOD_CALL_EXPRESSION__BEAN_TYPE, oldBeanType, beanType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.METHOD_CALL_EXPRESSION__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.METHOD_CALL_EXPRESSION__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.METHOD_CALL_EXPRESSION__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidate(String newValidate) {
		String oldValidate = validate;
		validate = newValidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.METHOD_CALL_EXPRESSION__VALIDATE, oldValidate, validate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__BEAN_TYPE:
				return getBeanType();
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__METHOD:
				return getMethod();
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__REF:
				return getRef();
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__SCOPE:
				return getScope();
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__VALIDATE:
				return getValidate();
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
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__BEAN_TYPE:
				setBeanType((String)newValue);
				return;
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__METHOD:
				setMethod((String)newValue);
				return;
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__REF:
				setRef((String)newValue);
				return;
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__SCOPE:
				setScope((String)newValue);
				return;
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__VALIDATE:
				setValidate((String)newValue);
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
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__BEAN_TYPE:
				setBeanType(BEAN_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__REF:
				setRef(REF_EDEFAULT);
				return;
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__VALIDATE:
				setValidate(VALIDATE_EDEFAULT);
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
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__BEAN_TYPE:
				return BEAN_TYPE_EDEFAULT == null ? beanType != null : !BEAN_TYPE_EDEFAULT.equals(beanType);
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case CamelSpringPackage.METHOD_CALL_EXPRESSION__VALIDATE:
				return VALIDATE_EDEFAULT == null ? validate != null : !VALIDATE_EDEFAULT.equals(validate);
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
		result.append(" (beanType: ");
		result.append(beanType);
		result.append(", method: ");
		result.append(method);
		result.append(", ref: ");
		result.append(ref);
		result.append(", scope: ");
		result.append(scope);
		result.append(", validate: ");
		result.append(validate);
		result.append(')');
		return result.toString();
	}

} //MethodCallExpressionImpl

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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.InterceptDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptFromDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptSendToEndpointDefinition;
import org.eclipse.fennec.camel.camelspring.OnCompletionDefinition;
import org.eclipse.fennec.camel.camelspring.OnExceptionDefinition;
import org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Configuration Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteConfigurationDefinitionImpl#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteConfigurationDefinitionImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteConfigurationDefinitionImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteConfigurationDefinitionImpl#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteConfigurationDefinitionImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteConfigurationDefinitionImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteConfigurationDefinitionImpl#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteConfigurationDefinitionImpl extends OptionalIdentifiedDefinitionImpl implements RouteConfigurationDefinition {
	/**
	 * The cached value of the '{@link #getErrorHandler() <em>Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected EObject errorHandler;

	/**
	 * This is true if the Error Handler containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorHandlerESet;

	/**
	 * The cached value of the '{@link #getIntercept() <em>Intercept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercept()
	 * @generated
	 * @ordered
	 */
	protected EList<InterceptDefinition> intercept;

	/**
	 * The cached value of the '{@link #getInterceptFrom() <em>Intercept From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<InterceptFromDefinition> interceptFrom;

	/**
	 * The cached value of the '{@link #getInterceptSendToEndpoint() <em>Intercept Send To Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptSendToEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<InterceptSendToEndpointDefinition> interceptSendToEndpoint;

	/**
	 * The cached value of the '{@link #getOnException() <em>On Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnException()
	 * @generated
	 * @ordered
	 */
	protected EList<OnExceptionDefinition> onException;

	/**
	 * The cached value of the '{@link #getOnCompletion() <em>On Completion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCompletion()
	 * @generated
	 * @ordered
	 */
	protected EList<OnCompletionDefinition> onCompletion;

	/**
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteConfigurationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getRouteConfigurationDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getErrorHandler() {
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorHandler(EObject newErrorHandler, NotificationChain msgs) {
		EObject oldErrorHandler = errorHandler;
		errorHandler = newErrorHandler;
		boolean oldErrorHandlerESet = errorHandlerESet;
		errorHandlerESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER, oldErrorHandler, newErrorHandler, !oldErrorHandlerESet);
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
	public void setErrorHandler(EObject newErrorHandler) {
		if (newErrorHandler != errorHandler) {
			NotificationChain msgs = null;
			if (errorHandler != null)
				msgs = ((InternalEObject)errorHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER, null, msgs);
			if (newErrorHandler != null)
				msgs = ((InternalEObject)newErrorHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER, null, msgs);
			msgs = basicSetErrorHandler(newErrorHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldErrorHandlerESet = errorHandlerESet;
			errorHandlerESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER, newErrorHandler, newErrorHandler, !oldErrorHandlerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetErrorHandler(NotificationChain msgs) {
		EObject oldErrorHandler = errorHandler;
		errorHandler = null;
		boolean oldErrorHandlerESet = errorHandlerESet;
		errorHandlerESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER, oldErrorHandler, null, oldErrorHandlerESet);
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
	public void unsetErrorHandler() {
		if (errorHandler != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)errorHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER, null, msgs);
			msgs = basicUnsetErrorHandler(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldErrorHandlerESet = errorHandlerESet;
			errorHandlerESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER, null, null, oldErrorHandlerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetErrorHandler() {
		return errorHandlerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptDefinition> getIntercept() {
		if (intercept == null) {
			intercept = new EObjectContainmentEList<InterceptDefinition>(InterceptDefinition.class, this, CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT);
		}
		return intercept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptFromDefinition> getInterceptFrom() {
		if (interceptFrom == null) {
			interceptFrom = new EObjectContainmentEList<InterceptFromDefinition>(InterceptFromDefinition.class, this, CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_FROM);
		}
		return interceptFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint() {
		if (interceptSendToEndpoint == null) {
			interceptSendToEndpoint = new EObjectContainmentEList<InterceptSendToEndpointDefinition>(InterceptSendToEndpointDefinition.class, this, CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT);
		}
		return interceptSendToEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnExceptionDefinition> getOnException() {
		if (onException == null) {
			onException = new EObjectContainmentEList<OnExceptionDefinition>(OnExceptionDefinition.class, this, CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_EXCEPTION);
		}
		return onException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OnCompletionDefinition> getOnCompletion() {
		if (onCompletion == null) {
			onCompletion = new EObjectContainmentEList<OnCompletionDefinition>(OnCompletionDefinition.class, this, CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_COMPLETION);
		}
		return onCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecondition(String newPrecondition) {
		String oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__PRECONDITION, oldPrecondition, precondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER:
				return basicUnsetErrorHandler(msgs);
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT:
				return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_FROM:
				return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return ((InternalEList<?>)getInterceptSendToEndpoint()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_COMPLETION:
				return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER:
				return getErrorHandler();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT:
				return getIntercept();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_FROM:
				return getInterceptFrom();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return getInterceptSendToEndpoint();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_EXCEPTION:
				return getOnException();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_COMPLETION:
				return getOnCompletion();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__PRECONDITION:
				return getPrecondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER:
				setErrorHandler((EObject)newValue);
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT:
				getIntercept().clear();
				getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				getInterceptSendToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__PRECONDITION:
				setPrecondition((String)newValue);
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
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER:
				unsetErrorHandler();
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT:
				getIntercept().clear();
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_FROM:
				getInterceptFrom().clear();
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				getInterceptSendToEndpoint().clear();
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_EXCEPTION:
				getOnException().clear();
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_COMPLETION:
				getOnCompletion().clear();
				return;
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
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
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ERROR_HANDLER:
				return isSetErrorHandler();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT:
				return intercept != null && !intercept.isEmpty();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_FROM:
				return interceptFrom != null && !interceptFrom.isEmpty();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__INTERCEPT_SEND_TO_ENDPOINT:
				return interceptSendToEndpoint != null && !interceptSendToEndpoint.isEmpty();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_EXCEPTION:
				return onException != null && !onException.isEmpty();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__ON_COMPLETION:
				return onCompletion != null && !onCompletion.isEmpty();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
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
		result.append(" (precondition: ");
		result.append(precondition);
		result.append(')');
		return result.toString();
	}

} //RouteConfigurationDefinitionImpl

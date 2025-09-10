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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.RouteDefinition;
import org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition;
import org.eclipse.fennec.camel.camelspring.RouteTemplateParameterDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Template Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteTemplateDefinitionImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteTemplateDefinitionImpl#getTemplateBean <em>Template Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RouteTemplateDefinitionImpl#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteTemplateDefinitionImpl extends OptionalIdentifiedDefinitionImpl implements RouteTemplateDefinition {
	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteTemplateParameterDefinition> templateParameter;

	/**
	 * The cached value of the '{@link #getTemplateBean() <em>Template Bean</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBean()
	 * @generated
	 * @ordered
	 */
	protected EList<BeanFactoryDefinition> templateBean;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected RouteDefinition route;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteTemplateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getRouteTemplateDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteTemplateParameterDefinition> getTemplateParameter() {
		if (templateParameter == null) {
			templateParameter = new EObjectContainmentEList<RouteTemplateParameterDefinition>(RouteTemplateParameterDefinition.class, this, CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_PARAMETER);
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeanFactoryDefinition> getTemplateBean() {
		if (templateBean == null) {
			templateBean = new EObjectContainmentEList<BeanFactoryDefinition>(BeanFactoryDefinition.class, this, CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_BEAN);
		}
		return templateBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteDefinition getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(RouteDefinition newRoute, NotificationChain msgs) {
		RouteDefinition oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__ROUTE, oldRoute, newRoute);
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
	public void setRoute(RouteDefinition newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_PARAMETER:
				return ((InternalEList<?>)getTemplateParameter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_BEAN:
				return ((InternalEList<?>)getTemplateBean()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__ROUTE:
				return basicSetRoute(null, msgs);
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
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_BEAN:
				return getTemplateBean();
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__ROUTE:
				return getRoute();
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
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				getTemplateParameter().addAll((Collection<? extends RouteTemplateParameterDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_BEAN:
				getTemplateBean().clear();
				getTemplateBean().addAll((Collection<? extends BeanFactoryDefinition>)newValue);
				return;
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__ROUTE:
				setRoute((RouteDefinition)newValue);
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
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				return;
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_BEAN:
				getTemplateBean().clear();
				return;
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__ROUTE:
				setRoute((RouteDefinition)null);
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
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_PARAMETER:
				return templateParameter != null && !templateParameter.isEmpty();
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__TEMPLATE_BEAN:
				return templateBean != null && !templateBean.isEmpty();
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION__ROUTE:
				return route != null;
		}
		return super.eIsSet(featureID);
	}

} //RouteTemplateDefinitionImpl

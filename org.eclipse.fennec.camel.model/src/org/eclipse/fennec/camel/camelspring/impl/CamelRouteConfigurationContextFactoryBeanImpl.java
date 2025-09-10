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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelRouteConfigurationContextFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Route Configuration Context Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CamelRouteConfigurationContextFactoryBeanImpl#getRouteConfiguration <em>Route Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamelRouteConfigurationContextFactoryBeanImpl extends IdentifiedTypeImpl implements CamelRouteConfigurationContextFactoryBean {
	/**
	 * The cached value of the '{@link #getRouteConfiguration() <em>Route Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteConfigurationDefinition> routeConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelRouteConfigurationContextFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCamelRouteConfigurationContextFactoryBean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteConfigurationDefinition> getRouteConfiguration() {
		if (routeConfiguration == null) {
			routeConfiguration = new EObjectContainmentEList<RouteConfigurationDefinition>(RouteConfigurationDefinition.class, this, CamelSpringPackage.CAMEL_ROUTE_CONFIGURATION_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION);
		}
		return routeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.CAMEL_ROUTE_CONFIGURATION_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION:
				return ((InternalEList<?>)getRouteConfiguration()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.CAMEL_ROUTE_CONFIGURATION_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION:
				return getRouteConfiguration();
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
			case CamelSpringPackage.CAMEL_ROUTE_CONFIGURATION_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION:
				getRouteConfiguration().clear();
				getRouteConfiguration().addAll((Collection<? extends RouteConfigurationDefinition>)newValue);
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
			case CamelSpringPackage.CAMEL_ROUTE_CONFIGURATION_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION:
				getRouteConfiguration().clear();
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
			case CamelSpringPackage.CAMEL_ROUTE_CONFIGURATION_CONTEXT_FACTORY_BEAN__ROUTE_CONFIGURATION:
				return routeConfiguration != null && !routeConfiguration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CamelRouteConfigurationContextFactoryBeanImpl

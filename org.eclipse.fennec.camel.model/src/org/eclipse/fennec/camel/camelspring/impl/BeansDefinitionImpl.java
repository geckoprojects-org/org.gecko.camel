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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition;
import org.eclipse.fennec.camel.camelspring.BeansDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.ComponentScanDefinition;
import org.eclipse.fennec.camel.camelspring.DataFormatsType;
import org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.RestDefinition;
import org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.RouteDefinition;
import org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition;
import org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beans Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeansDefinitionImpl#getComponentScan <em>Component Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeansDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeansDefinitionImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeansDefinitionImpl#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeansDefinitionImpl#getRestConfiguration <em>Rest Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeansDefinitionImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeansDefinitionImpl#getRouteConfiguration <em>Route Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeansDefinitionImpl#getRouteTemplate <em>Route Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeansDefinitionImpl#getTemplatedRoute <em>Templated Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeansDefinitionImpl#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeansDefinitionImpl extends MinimalEObjectImpl.Container implements BeansDefinition {
	/**
	 * The cached value of the '{@link #getComponentScan() <em>Component Scan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentScan()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentScanDefinition> componentScan;

	/**
	 * The cached value of the '{@link #getBean() <em>Bean</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected EList<BeanFactoryDefinition> bean;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The cached value of the '{@link #getDataFormats() <em>Data Formats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormats()
	 * @generated
	 * @ordered
	 */
	protected DataFormatsType dataFormats;

	/**
	 * The cached value of the '{@link #getRestConfiguration() <em>Rest Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<RestConfigurationDefinition> restConfiguration;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected EList<RestDefinition> rest;

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
	 * The cached value of the '{@link #getRouteTemplate() <em>Route Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteTemplateDefinition> routeTemplate;

	/**
	 * The cached value of the '{@link #getTemplatedRoute() <em>Templated Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplatedRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplatedRouteDefinition> templatedRoute;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteDefinition> route;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeansDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getBeansDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentScanDefinition> getComponentScan() {
		if (componentScan == null) {
			componentScan = new EObjectContainmentEList<ComponentScanDefinition>(ComponentScanDefinition.class, this, CamelSpringPackage.BEANS_DEFINITION__COMPONENT_SCAN);
		}
		return componentScan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeanFactoryDefinition> getBean() {
		if (bean == null) {
			bean = new EObjectContainmentEList<BeanFactoryDefinition>(BeanFactoryDefinition.class, this, CamelSpringPackage.BEANS_DEFINITION__BEAN);
		}
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, CamelSpringPackage.BEANS_DEFINITION__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFormatsType getDataFormats() {
		return dataFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataFormats(DataFormatsType newDataFormats, NotificationChain msgs) {
		DataFormatsType oldDataFormats = dataFormats;
		dataFormats = newDataFormats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEANS_DEFINITION__DATA_FORMATS, oldDataFormats, newDataFormats);
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
	public void setDataFormats(DataFormatsType newDataFormats) {
		if (newDataFormats != dataFormats) {
			NotificationChain msgs = null;
			if (dataFormats != null)
				msgs = ((InternalEObject)dataFormats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.BEANS_DEFINITION__DATA_FORMATS, null, msgs);
			if (newDataFormats != null)
				msgs = ((InternalEObject)newDataFormats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.BEANS_DEFINITION__DATA_FORMATS, null, msgs);
			msgs = basicSetDataFormats(newDataFormats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEANS_DEFINITION__DATA_FORMATS, newDataFormats, newDataFormats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestConfigurationDefinition> getRestConfiguration() {
		if (restConfiguration == null) {
			restConfiguration = new EObjectContainmentEList<RestConfigurationDefinition>(RestConfigurationDefinition.class, this, CamelSpringPackage.BEANS_DEFINITION__REST_CONFIGURATION);
		}
		return restConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestDefinition> getRest() {
		if (rest == null) {
			rest = new EObjectContainmentEList<RestDefinition>(RestDefinition.class, this, CamelSpringPackage.BEANS_DEFINITION__REST);
		}
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteConfigurationDefinition> getRouteConfiguration() {
		if (routeConfiguration == null) {
			routeConfiguration = new EObjectContainmentEList<RouteConfigurationDefinition>(RouteConfigurationDefinition.class, this, CamelSpringPackage.BEANS_DEFINITION__ROUTE_CONFIGURATION);
		}
		return routeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteTemplateDefinition> getRouteTemplate() {
		if (routeTemplate == null) {
			routeTemplate = new EObjectContainmentEList<RouteTemplateDefinition>(RouteTemplateDefinition.class, this, CamelSpringPackage.BEANS_DEFINITION__ROUTE_TEMPLATE);
		}
		return routeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplatedRouteDefinition> getTemplatedRoute() {
		if (templatedRoute == null) {
			templatedRoute = new EObjectContainmentEList<TemplatedRouteDefinition>(TemplatedRouteDefinition.class, this, CamelSpringPackage.BEANS_DEFINITION__TEMPLATED_ROUTE);
		}
		return templatedRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteDefinition> getRoute() {
		if (route == null) {
			route = new EObjectContainmentEList<RouteDefinition>(RouteDefinition.class, this, CamelSpringPackage.BEANS_DEFINITION__ROUTE);
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.BEANS_DEFINITION__COMPONENT_SCAN:
				return ((InternalEList<?>)getComponentScan()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.BEANS_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.BEANS_DEFINITION__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.BEANS_DEFINITION__DATA_FORMATS:
				return basicSetDataFormats(null, msgs);
			case CamelSpringPackage.BEANS_DEFINITION__REST_CONFIGURATION:
				return ((InternalEList<?>)getRestConfiguration()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.BEANS_DEFINITION__REST:
				return ((InternalEList<?>)getRest()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE_CONFIGURATION:
				return ((InternalEList<?>)getRouteConfiguration()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE_TEMPLATE:
				return ((InternalEList<?>)getRouteTemplate()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.BEANS_DEFINITION__TEMPLATED_ROUTE:
				return ((InternalEList<?>)getTemplatedRoute()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.BEANS_DEFINITION__COMPONENT_SCAN:
				return getComponentScan();
			case CamelSpringPackage.BEANS_DEFINITION__BEAN:
				return getBean();
			case CamelSpringPackage.BEANS_DEFINITION__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case CamelSpringPackage.BEANS_DEFINITION__DATA_FORMATS:
				return getDataFormats();
			case CamelSpringPackage.BEANS_DEFINITION__REST_CONFIGURATION:
				return getRestConfiguration();
			case CamelSpringPackage.BEANS_DEFINITION__REST:
				return getRest();
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE_CONFIGURATION:
				return getRouteConfiguration();
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE_TEMPLATE:
				return getRouteTemplate();
			case CamelSpringPackage.BEANS_DEFINITION__TEMPLATED_ROUTE:
				return getTemplatedRoute();
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE:
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
			case CamelSpringPackage.BEANS_DEFINITION__COMPONENT_SCAN:
				getComponentScan().clear();
				getComponentScan().addAll((Collection<? extends ComponentScanDefinition>)newValue);
				return;
			case CamelSpringPackage.BEANS_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanFactoryDefinition>)newValue);
				return;
			case CamelSpringPackage.BEANS_DEFINITION__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case CamelSpringPackage.BEANS_DEFINITION__DATA_FORMATS:
				setDataFormats((DataFormatsType)newValue);
				return;
			case CamelSpringPackage.BEANS_DEFINITION__REST_CONFIGURATION:
				getRestConfiguration().clear();
				getRestConfiguration().addAll((Collection<? extends RestConfigurationDefinition>)newValue);
				return;
			case CamelSpringPackage.BEANS_DEFINITION__REST:
				getRest().clear();
				getRest().addAll((Collection<? extends RestDefinition>)newValue);
				return;
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE_CONFIGURATION:
				getRouteConfiguration().clear();
				getRouteConfiguration().addAll((Collection<? extends RouteConfigurationDefinition>)newValue);
				return;
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE_TEMPLATE:
				getRouteTemplate().clear();
				getRouteTemplate().addAll((Collection<? extends RouteTemplateDefinition>)newValue);
				return;
			case CamelSpringPackage.BEANS_DEFINITION__TEMPLATED_ROUTE:
				getTemplatedRoute().clear();
				getTemplatedRoute().addAll((Collection<? extends TemplatedRouteDefinition>)newValue);
				return;
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
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
			case CamelSpringPackage.BEANS_DEFINITION__COMPONENT_SCAN:
				getComponentScan().clear();
				return;
			case CamelSpringPackage.BEANS_DEFINITION__BEAN:
				getBean().clear();
				return;
			case CamelSpringPackage.BEANS_DEFINITION__ANY:
				getAny().clear();
				return;
			case CamelSpringPackage.BEANS_DEFINITION__DATA_FORMATS:
				setDataFormats((DataFormatsType)null);
				return;
			case CamelSpringPackage.BEANS_DEFINITION__REST_CONFIGURATION:
				getRestConfiguration().clear();
				return;
			case CamelSpringPackage.BEANS_DEFINITION__REST:
				getRest().clear();
				return;
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE_CONFIGURATION:
				getRouteConfiguration().clear();
				return;
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE_TEMPLATE:
				getRouteTemplate().clear();
				return;
			case CamelSpringPackage.BEANS_DEFINITION__TEMPLATED_ROUTE:
				getTemplatedRoute().clear();
				return;
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE:
				getRoute().clear();
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
			case CamelSpringPackage.BEANS_DEFINITION__COMPONENT_SCAN:
				return componentScan != null && !componentScan.isEmpty();
			case CamelSpringPackage.BEANS_DEFINITION__BEAN:
				return bean != null && !bean.isEmpty();
			case CamelSpringPackage.BEANS_DEFINITION__ANY:
				return any != null && !any.isEmpty();
			case CamelSpringPackage.BEANS_DEFINITION__DATA_FORMATS:
				return dataFormats != null;
			case CamelSpringPackage.BEANS_DEFINITION__REST_CONFIGURATION:
				return restConfiguration != null && !restConfiguration.isEmpty();
			case CamelSpringPackage.BEANS_DEFINITION__REST:
				return rest != null && !rest.isEmpty();
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE_CONFIGURATION:
				return routeConfiguration != null && !routeConfiguration.isEmpty();
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE_TEMPLATE:
				return routeTemplate != null && !routeTemplate.isEmpty();
			case CamelSpringPackage.BEANS_DEFINITION__TEMPLATED_ROUTE:
				return templatedRoute != null && !templatedRoute.isEmpty();
			case CamelSpringPackage.BEANS_DEFINITION__ROUTE:
				return route != null && !route.isEmpty();
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
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //BeansDefinitionImpl

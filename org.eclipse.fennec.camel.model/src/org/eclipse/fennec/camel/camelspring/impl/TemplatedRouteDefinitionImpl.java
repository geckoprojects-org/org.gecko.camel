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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition;
import org.eclipse.fennec.camel.camelspring.TemplatedRouteParameterDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Templated Route Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TemplatedRouteDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TemplatedRouteDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TemplatedRouteDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TemplatedRouteDefinitionImpl#getPrefixId <em>Prefix Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TemplatedRouteDefinitionImpl#getRouteId <em>Route Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TemplatedRouteDefinitionImpl#getRouteTemplateRef <em>Route Template Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplatedRouteDefinitionImpl extends MinimalEObjectImpl.Container implements TemplatedRouteDefinition {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplatedRouteParameterDefinition> parameter;

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
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefixId() <em>Prefix Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixId()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefixId() <em>Prefix Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixId()
	 * @generated
	 * @ordered
	 */
	protected String prefixId = PREFIX_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouteId() <em>Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteId() <em>Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteId()
	 * @generated
	 * @ordered
	 */
	protected String routeId = ROUTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouteTemplateRef() <em>Route Template Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteTemplateRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_TEMPLATE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteTemplateRef() <em>Route Template Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteTemplateRef()
	 * @generated
	 * @ordered
	 */
	protected String routeTemplateRef = ROUTE_TEMPLATE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplatedRouteDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getTemplatedRouteDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplatedRouteParameterDefinition> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<TemplatedRouteParameterDefinition>(TemplatedRouteParameterDefinition.class, this, CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeanFactoryDefinition> getBean() {
		if (bean == null) {
			bean = new EObjectContainmentEList<BeanFactoryDefinition>(BeanFactoryDefinition.class, this, CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__BEAN);
		}
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefixId() {
		return prefixId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefixId(String newPrefixId) {
		String oldPrefixId = prefixId;
		prefixId = newPrefixId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PREFIX_ID, oldPrefixId, prefixId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteId() {
		return routeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteId(String newRouteId) {
		String oldRouteId = routeId;
		routeId = newRouteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__ROUTE_ID, oldRouteId, routeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteTemplateRef() {
		return routeTemplateRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteTemplateRef(String newRouteTemplateRef) {
		String oldRouteTemplateRef = routeTemplateRef;
		routeTemplateRef = newRouteTemplateRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__ROUTE_TEMPLATE_REF, oldRouteTemplateRef, routeTemplateRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PARAMETER:
				return getParameter();
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__BEAN:
				return getBean();
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__GROUP:
				return getGroup();
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PREFIX_ID:
				return getPrefixId();
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__ROUTE_ID:
				return getRouteId();
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__ROUTE_TEMPLATE_REF:
				return getRouteTemplateRef();
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
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends TemplatedRouteParameterDefinition>)newValue);
				return;
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanFactoryDefinition>)newValue);
				return;
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__GROUP:
				setGroup((String)newValue);
				return;
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PREFIX_ID:
				setPrefixId((String)newValue);
				return;
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__ROUTE_ID:
				setRouteId((String)newValue);
				return;
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__ROUTE_TEMPLATE_REF:
				setRouteTemplateRef((String)newValue);
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
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PARAMETER:
				getParameter().clear();
				return;
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__BEAN:
				getBean().clear();
				return;
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PREFIX_ID:
				setPrefixId(PREFIX_ID_EDEFAULT);
				return;
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__ROUTE_ID:
				setRouteId(ROUTE_ID_EDEFAULT);
				return;
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__ROUTE_TEMPLATE_REF:
				setRouteTemplateRef(ROUTE_TEMPLATE_REF_EDEFAULT);
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
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__BEAN:
				return bean != null && !bean.isEmpty();
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__PREFIX_ID:
				return PREFIX_ID_EDEFAULT == null ? prefixId != null : !PREFIX_ID_EDEFAULT.equals(prefixId);
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__ROUTE_ID:
				return ROUTE_ID_EDEFAULT == null ? routeId != null : !ROUTE_ID_EDEFAULT.equals(routeId);
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION__ROUTE_TEMPLATE_REF:
				return ROUTE_TEMPLATE_REF_EDEFAULT == null ? routeTemplateRef != null : !ROUTE_TEMPLATE_REF_EDEFAULT.equals(routeTemplateRef);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", prefixId: ");
		result.append(prefixId);
		result.append(", routeId: ");
		result.append(routeId);
		result.append(", routeTemplateRef: ");
		result.append(routeTemplateRef);
		result.append(')');
		return result.toString();
	}

} //TemplatedRouteDefinitionImpl

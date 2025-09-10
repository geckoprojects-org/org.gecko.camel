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
package org.eclipse.fennec.camel.whiteboard.pipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.camel.whiteboard.pipeline.DependencyCardinality;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage;
import org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ServiceDependencyImpl#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ServiceDependencyImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ServiceDependencyImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ServiceDependencyImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ServiceDependencyImpl#getBindName <em>Bind Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDependencyImpl extends MinimalEObjectImpl.Container implements ServiceDependency {
	/**
	 * The default value of the '{@link #getServiceInterface() <em>Service Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInterface() <em>Service Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterface()
	 * @generated
	 * @ordered
	 */
	protected String serviceInterface = SERVICE_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final DependencyCardinality CARDINALITY_EDEFAULT = DependencyCardinality.SINGLE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected DependencyCardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindName() <em>Bind Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindName()
	 * @generated
	 * @ordered
	 */
	protected static final String BIND_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindName() <em>Bind Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindName()
	 * @generated
	 * @ordered
	 */
	protected String bindName = BIND_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.SERVICE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceInterface() {
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceInterface(String newServiceInterface) {
		String oldServiceInterface = serviceInterface;
		serviceInterface = newServiceInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.SERVICE_DEPENDENCY__SERVICE_INTERFACE, oldServiceInterface, serviceInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.SERVICE_DEPENDENCY__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependencyCardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(DependencyCardinality newCardinality) {
		DependencyCardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.SERVICE_DEPENDENCY__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.SERVICE_DEPENDENCY__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBindName() {
		return bindName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindName(String newBindName) {
		String oldBindName = bindName;
		bindName = newBindName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.SERVICE_DEPENDENCY__BIND_NAME, oldBindName, bindName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.SERVICE_DEPENDENCY__SERVICE_INTERFACE:
				return getServiceInterface();
			case PipelinePackage.SERVICE_DEPENDENCY__FILTER:
				return getFilter();
			case PipelinePackage.SERVICE_DEPENDENCY__CARDINALITY:
				return getCardinality();
			case PipelinePackage.SERVICE_DEPENDENCY__OPTIONAL:
				return isOptional();
			case PipelinePackage.SERVICE_DEPENDENCY__BIND_NAME:
				return getBindName();
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
			case PipelinePackage.SERVICE_DEPENDENCY__SERVICE_INTERFACE:
				setServiceInterface((String)newValue);
				return;
			case PipelinePackage.SERVICE_DEPENDENCY__FILTER:
				setFilter((String)newValue);
				return;
			case PipelinePackage.SERVICE_DEPENDENCY__CARDINALITY:
				setCardinality((DependencyCardinality)newValue);
				return;
			case PipelinePackage.SERVICE_DEPENDENCY__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case PipelinePackage.SERVICE_DEPENDENCY__BIND_NAME:
				setBindName((String)newValue);
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
			case PipelinePackage.SERVICE_DEPENDENCY__SERVICE_INTERFACE:
				setServiceInterface(SERVICE_INTERFACE_EDEFAULT);
				return;
			case PipelinePackage.SERVICE_DEPENDENCY__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case PipelinePackage.SERVICE_DEPENDENCY__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case PipelinePackage.SERVICE_DEPENDENCY__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case PipelinePackage.SERVICE_DEPENDENCY__BIND_NAME:
				setBindName(BIND_NAME_EDEFAULT);
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
			case PipelinePackage.SERVICE_DEPENDENCY__SERVICE_INTERFACE:
				return SERVICE_INTERFACE_EDEFAULT == null ? serviceInterface != null : !SERVICE_INTERFACE_EDEFAULT.equals(serviceInterface);
			case PipelinePackage.SERVICE_DEPENDENCY__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case PipelinePackage.SERVICE_DEPENDENCY__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case PipelinePackage.SERVICE_DEPENDENCY__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case PipelinePackage.SERVICE_DEPENDENCY__BIND_NAME:
				return BIND_NAME_EDEFAULT == null ? bindName != null : !BIND_NAME_EDEFAULT.equals(bindName);
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
		result.append(" (serviceInterface: ");
		result.append(serviceInterface);
		result.append(", filter: ");
		result.append(filter);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", optional: ");
		result.append(optional);
		result.append(", bindName: ");
		result.append(bindName);
		result.append(')');
		return result.toString();
	}

} //ServiceDependencyImpl

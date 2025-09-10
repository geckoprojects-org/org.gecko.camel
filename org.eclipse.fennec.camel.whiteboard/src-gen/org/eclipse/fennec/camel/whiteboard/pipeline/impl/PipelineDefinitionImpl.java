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

import org.eclipse.fennec.camel.whiteboard.pipeline.Parameter;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage;
import org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinition;
import org.eclipse.fennec.camel.whiteboard.pipeline.ServiceDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.PipelineDefinitionImpl#getRouteDefinition <em>Route Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineDefinitionImpl extends MinimalEObjectImpl.Container implements PipelineDefinition {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDependency> dependencies;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getRouteDefinition() <em>Route Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDefinition()
	 * @generated
	 * @ordered
	 */
	protected RouteDefinition routeDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.PIPELINE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE_DEFINITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE_DEFINITION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE_DEFINITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<ServiceDependency>(ServiceDependency.class, this, PipelinePackage.PIPELINE_DEFINITION__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, PipelinePackage.PIPELINE_DEFINITION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteDefinition getRouteDefinition() {
		return routeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteDefinition(RouteDefinition newRouteDefinition, NotificationChain msgs) {
		RouteDefinition oldRouteDefinition = routeDefinition;
		routeDefinition = newRouteDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE_DEFINITION__ROUTE_DEFINITION, oldRouteDefinition, newRouteDefinition);
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
	public void setRouteDefinition(RouteDefinition newRouteDefinition) {
		if (newRouteDefinition != routeDefinition) {
			NotificationChain msgs = null;
			if (routeDefinition != null)
				msgs = ((InternalEObject)routeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipelinePackage.PIPELINE_DEFINITION__ROUTE_DEFINITION, null, msgs);
			if (newRouteDefinition != null)
				msgs = ((InternalEObject)newRouteDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipelinePackage.PIPELINE_DEFINITION__ROUTE_DEFINITION, null, msgs);
			msgs = basicSetRouteDefinition(newRouteDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE_DEFINITION__ROUTE_DEFINITION, newRouteDefinition, newRouteDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.PIPELINE_DEFINITION__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case PipelinePackage.PIPELINE_DEFINITION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case PipelinePackage.PIPELINE_DEFINITION__ROUTE_DEFINITION:
				return basicSetRouteDefinition(null, msgs);
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
			case PipelinePackage.PIPELINE_DEFINITION__ID:
				return getId();
			case PipelinePackage.PIPELINE_DEFINITION__NAME:
				return getName();
			case PipelinePackage.PIPELINE_DEFINITION__VERSION:
				return getVersion();
			case PipelinePackage.PIPELINE_DEFINITION__DESCRIPTION:
				return getDescription();
			case PipelinePackage.PIPELINE_DEFINITION__DEPENDENCIES:
				return getDependencies();
			case PipelinePackage.PIPELINE_DEFINITION__PARAMETERS:
				return getParameters();
			case PipelinePackage.PIPELINE_DEFINITION__ROUTE_DEFINITION:
				return getRouteDefinition();
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
			case PipelinePackage.PIPELINE_DEFINITION__ID:
				setId((String)newValue);
				return;
			case PipelinePackage.PIPELINE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case PipelinePackage.PIPELINE_DEFINITION__VERSION:
				setVersion((String)newValue);
				return;
			case PipelinePackage.PIPELINE_DEFINITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PipelinePackage.PIPELINE_DEFINITION__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends ServiceDependency>)newValue);
				return;
			case PipelinePackage.PIPELINE_DEFINITION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case PipelinePackage.PIPELINE_DEFINITION__ROUTE_DEFINITION:
				setRouteDefinition((RouteDefinition)newValue);
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
			case PipelinePackage.PIPELINE_DEFINITION__ID:
				setId(ID_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE_DEFINITION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE_DEFINITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE_DEFINITION__DEPENDENCIES:
				getDependencies().clear();
				return;
			case PipelinePackage.PIPELINE_DEFINITION__PARAMETERS:
				getParameters().clear();
				return;
			case PipelinePackage.PIPELINE_DEFINITION__ROUTE_DEFINITION:
				setRouteDefinition((RouteDefinition)null);
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
			case PipelinePackage.PIPELINE_DEFINITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PipelinePackage.PIPELINE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PipelinePackage.PIPELINE_DEFINITION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case PipelinePackage.PIPELINE_DEFINITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PipelinePackage.PIPELINE_DEFINITION__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case PipelinePackage.PIPELINE_DEFINITION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case PipelinePackage.PIPELINE_DEFINITION__ROUTE_DEFINITION:
				return routeDefinition != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PipelineDefinitionImpl

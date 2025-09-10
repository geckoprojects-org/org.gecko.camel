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

import org.eclipse.fennec.camel.whiteboard.pipeline.JavaDSLRouteDefinition;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java DSL Route Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.JavaDSLRouteDefinitionImpl#getBuilderClassName <em>Builder Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaDSLRouteDefinitionImpl extends RouteDefinitionImpl implements JavaDSLRouteDefinition {
	/**
	 * The default value of the '{@link #getBuilderClassName() <em>Builder Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuilderClassName() <em>Builder Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderClassName()
	 * @generated
	 * @ordered
	 */
	protected String builderClassName = BUILDER_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaDSLRouteDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.JAVA_DSL_ROUTE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuilderClassName() {
		return builderClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuilderClassName(String newBuilderClassName) {
		String oldBuilderClassName = builderClassName;
		builderClassName = newBuilderClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.JAVA_DSL_ROUTE_DEFINITION__BUILDER_CLASS_NAME, oldBuilderClassName, builderClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.JAVA_DSL_ROUTE_DEFINITION__BUILDER_CLASS_NAME:
				return getBuilderClassName();
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
			case PipelinePackage.JAVA_DSL_ROUTE_DEFINITION__BUILDER_CLASS_NAME:
				setBuilderClassName((String)newValue);
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
			case PipelinePackage.JAVA_DSL_ROUTE_DEFINITION__BUILDER_CLASS_NAME:
				setBuilderClassName(BUILDER_CLASS_NAME_EDEFAULT);
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
			case PipelinePackage.JAVA_DSL_ROUTE_DEFINITION__BUILDER_CLASS_NAME:
				return BUILDER_CLASS_NAME_EDEFAULT == null ? builderClassName != null : !BUILDER_CLASS_NAME_EDEFAULT.equals(builderClassName);
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
		result.append(" (builderClassName: ");
		result.append(builderClassName);
		result.append(')');
		return result.toString();
	}

} //JavaDSLRouteDefinitionImpl

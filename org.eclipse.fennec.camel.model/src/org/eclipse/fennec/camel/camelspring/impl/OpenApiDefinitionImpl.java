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
import org.eclipse.fennec.camel.camelspring.OpenApiDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Api Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OpenApiDefinitionImpl#getApiContextPath <em>Api Context Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OpenApiDefinitionImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OpenApiDefinitionImpl#getMissingOperation <em>Missing Operation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OpenApiDefinitionImpl#getMockIncludePattern <em>Mock Include Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OpenApiDefinitionImpl#getRouteId <em>Route Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.OpenApiDefinitionImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenApiDefinitionImpl extends OptionalIdentifiedDefinitionImpl implements OpenApiDefinition {
	/**
	 * The default value of the '{@link #getApiContextPath() <em>Api Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiContextPath()
	 * @generated
	 * @ordered
	 */
	protected static final String API_CONTEXT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiContextPath() <em>Api Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiContextPath()
	 * @generated
	 * @ordered
	 */
	protected String apiContextPath = API_CONTEXT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final String DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected String disabled = DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissingOperation() <em>Missing Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissingOperation() <em>Missing Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingOperation()
	 * @generated
	 * @ordered
	 */
	protected String missingOperation = MISSING_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMockIncludePattern() <em>Mock Include Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMockIncludePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String MOCK_INCLUDE_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMockIncludePattern() <em>Mock Include Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMockIncludePattern()
	 * @generated
	 * @ordered
	 */
	protected String mockIncludePattern = MOCK_INCLUDE_PATTERN_EDEFAULT;

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
	 * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected String specification = SPECIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenApiDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getOpenApiDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiContextPath() {
		return apiContextPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiContextPath(String newApiContextPath) {
		String oldApiContextPath = apiContextPath;
		apiContextPath = newApiContextPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPEN_API_DEFINITION__API_CONTEXT_PATH, oldApiContextPath, apiContextPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabled(String newDisabled) {
		String oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPEN_API_DEFINITION__DISABLED, oldDisabled, disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMissingOperation() {
		return missingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMissingOperation(String newMissingOperation) {
		String oldMissingOperation = missingOperation;
		missingOperation = newMissingOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPEN_API_DEFINITION__MISSING_OPERATION, oldMissingOperation, missingOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMockIncludePattern() {
		return mockIncludePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMockIncludePattern(String newMockIncludePattern) {
		String oldMockIncludePattern = mockIncludePattern;
		mockIncludePattern = newMockIncludePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPEN_API_DEFINITION__MOCK_INCLUDE_PATTERN, oldMockIncludePattern, mockIncludePattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPEN_API_DEFINITION__ROUTE_ID, oldRouteId, routeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecification(String newSpecification) {
		String oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.OPEN_API_DEFINITION__SPECIFICATION, oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.OPEN_API_DEFINITION__API_CONTEXT_PATH:
				return getApiContextPath();
			case CamelSpringPackage.OPEN_API_DEFINITION__DISABLED:
				return getDisabled();
			case CamelSpringPackage.OPEN_API_DEFINITION__MISSING_OPERATION:
				return getMissingOperation();
			case CamelSpringPackage.OPEN_API_DEFINITION__MOCK_INCLUDE_PATTERN:
				return getMockIncludePattern();
			case CamelSpringPackage.OPEN_API_DEFINITION__ROUTE_ID:
				return getRouteId();
			case CamelSpringPackage.OPEN_API_DEFINITION__SPECIFICATION:
				return getSpecification();
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
			case CamelSpringPackage.OPEN_API_DEFINITION__API_CONTEXT_PATH:
				setApiContextPath((String)newValue);
				return;
			case CamelSpringPackage.OPEN_API_DEFINITION__DISABLED:
				setDisabled((String)newValue);
				return;
			case CamelSpringPackage.OPEN_API_DEFINITION__MISSING_OPERATION:
				setMissingOperation((String)newValue);
				return;
			case CamelSpringPackage.OPEN_API_DEFINITION__MOCK_INCLUDE_PATTERN:
				setMockIncludePattern((String)newValue);
				return;
			case CamelSpringPackage.OPEN_API_DEFINITION__ROUTE_ID:
				setRouteId((String)newValue);
				return;
			case CamelSpringPackage.OPEN_API_DEFINITION__SPECIFICATION:
				setSpecification((String)newValue);
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
			case CamelSpringPackage.OPEN_API_DEFINITION__API_CONTEXT_PATH:
				setApiContextPath(API_CONTEXT_PATH_EDEFAULT);
				return;
			case CamelSpringPackage.OPEN_API_DEFINITION__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.OPEN_API_DEFINITION__MISSING_OPERATION:
				setMissingOperation(MISSING_OPERATION_EDEFAULT);
				return;
			case CamelSpringPackage.OPEN_API_DEFINITION__MOCK_INCLUDE_PATTERN:
				setMockIncludePattern(MOCK_INCLUDE_PATTERN_EDEFAULT);
				return;
			case CamelSpringPackage.OPEN_API_DEFINITION__ROUTE_ID:
				setRouteId(ROUTE_ID_EDEFAULT);
				return;
			case CamelSpringPackage.OPEN_API_DEFINITION__SPECIFICATION:
				setSpecification(SPECIFICATION_EDEFAULT);
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
			case CamelSpringPackage.OPEN_API_DEFINITION__API_CONTEXT_PATH:
				return API_CONTEXT_PATH_EDEFAULT == null ? apiContextPath != null : !API_CONTEXT_PATH_EDEFAULT.equals(apiContextPath);
			case CamelSpringPackage.OPEN_API_DEFINITION__DISABLED:
				return DISABLED_EDEFAULT == null ? disabled != null : !DISABLED_EDEFAULT.equals(disabled);
			case CamelSpringPackage.OPEN_API_DEFINITION__MISSING_OPERATION:
				return MISSING_OPERATION_EDEFAULT == null ? missingOperation != null : !MISSING_OPERATION_EDEFAULT.equals(missingOperation);
			case CamelSpringPackage.OPEN_API_DEFINITION__MOCK_INCLUDE_PATTERN:
				return MOCK_INCLUDE_PATTERN_EDEFAULT == null ? mockIncludePattern != null : !MOCK_INCLUDE_PATTERN_EDEFAULT.equals(mockIncludePattern);
			case CamelSpringPackage.OPEN_API_DEFINITION__ROUTE_ID:
				return ROUTE_ID_EDEFAULT == null ? routeId != null : !ROUTE_ID_EDEFAULT.equals(routeId);
			case CamelSpringPackage.OPEN_API_DEFINITION__SPECIFICATION:
				return SPECIFICATION_EDEFAULT == null ? specification != null : !SPECIFICATION_EDEFAULT.equals(specification);
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
		result.append(" (apiContextPath: ");
		result.append(apiContextPath);
		result.append(", disabled: ");
		result.append(disabled);
		result.append(", missingOperation: ");
		result.append(missingOperation);
		result.append(", mockIncludePattern: ");
		result.append(mockIncludePattern);
		result.append(", routeId: ");
		result.append(routeId);
		result.append(", specification: ");
		result.append(specification);
		result.append(')');
		return result.toString();
	}

} //OpenApiDefinitionImpl

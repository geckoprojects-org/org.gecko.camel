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

import org.eclipse.fennec.camel.camelspring.ApiKeyDefinition;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api Key Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ApiKeyDefinitionImpl#getInCookie <em>In Cookie</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ApiKeyDefinitionImpl#getInHeader <em>In Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ApiKeyDefinitionImpl#getInQuery <em>In Query</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ApiKeyDefinitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiKeyDefinitionImpl extends RestSecurityDefinitionImpl implements ApiKeyDefinition {
	/**
	 * The default value of the '{@link #getInCookie() <em>In Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInCookie()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_COOKIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInCookie() <em>In Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInCookie()
	 * @generated
	 * @ordered
	 */
	protected String inCookie = IN_COOKIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInHeader() <em>In Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInHeader() <em>In Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInHeader()
	 * @generated
	 * @ordered
	 */
	protected String inHeader = IN_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInQuery() <em>In Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInQuery() <em>In Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInQuery()
	 * @generated
	 * @ordered
	 */
	protected String inQuery = IN_QUERY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApiKeyDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getApiKeyDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInCookie() {
		return inCookie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInCookie(String newInCookie) {
		String oldInCookie = inCookie;
		inCookie = newInCookie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.API_KEY_DEFINITION__IN_COOKIE, oldInCookie, inCookie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInHeader() {
		return inHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInHeader(String newInHeader) {
		String oldInHeader = inHeader;
		inHeader = newInHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.API_KEY_DEFINITION__IN_HEADER, oldInHeader, inHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInQuery() {
		return inQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInQuery(String newInQuery) {
		String oldInQuery = inQuery;
		inQuery = newInQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.API_KEY_DEFINITION__IN_QUERY, oldInQuery, inQuery));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.API_KEY_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.API_KEY_DEFINITION__IN_COOKIE:
				return getInCookie();
			case CamelSpringPackage.API_KEY_DEFINITION__IN_HEADER:
				return getInHeader();
			case CamelSpringPackage.API_KEY_DEFINITION__IN_QUERY:
				return getInQuery();
			case CamelSpringPackage.API_KEY_DEFINITION__NAME:
				return getName();
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
			case CamelSpringPackage.API_KEY_DEFINITION__IN_COOKIE:
				setInCookie((String)newValue);
				return;
			case CamelSpringPackage.API_KEY_DEFINITION__IN_HEADER:
				setInHeader((String)newValue);
				return;
			case CamelSpringPackage.API_KEY_DEFINITION__IN_QUERY:
				setInQuery((String)newValue);
				return;
			case CamelSpringPackage.API_KEY_DEFINITION__NAME:
				setName((String)newValue);
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
			case CamelSpringPackage.API_KEY_DEFINITION__IN_COOKIE:
				setInCookie(IN_COOKIE_EDEFAULT);
				return;
			case CamelSpringPackage.API_KEY_DEFINITION__IN_HEADER:
				setInHeader(IN_HEADER_EDEFAULT);
				return;
			case CamelSpringPackage.API_KEY_DEFINITION__IN_QUERY:
				setInQuery(IN_QUERY_EDEFAULT);
				return;
			case CamelSpringPackage.API_KEY_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
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
			case CamelSpringPackage.API_KEY_DEFINITION__IN_COOKIE:
				return IN_COOKIE_EDEFAULT == null ? inCookie != null : !IN_COOKIE_EDEFAULT.equals(inCookie);
			case CamelSpringPackage.API_KEY_DEFINITION__IN_HEADER:
				return IN_HEADER_EDEFAULT == null ? inHeader != null : !IN_HEADER_EDEFAULT.equals(inHeader);
			case CamelSpringPackage.API_KEY_DEFINITION__IN_QUERY:
				return IN_QUERY_EDEFAULT == null ? inQuery != null : !IN_QUERY_EDEFAULT.equals(inQuery);
			case CamelSpringPackage.API_KEY_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (inCookie: ");
		result.append(inCookie);
		result.append(", inHeader: ");
		result.append(inHeader);
		result.append(", inQuery: ");
		result.append(inQuery);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ApiKeyDefinitionImpl

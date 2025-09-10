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
import org.eclipse.fennec.camel.camelspring.DfdlDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dfdl Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DfdlDataFormatImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DfdlDataFormatImpl#getRootNamespace <em>Root Namespace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DfdlDataFormatImpl#getSchemaUri <em>Schema Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DfdlDataFormatImpl extends DataFormatImpl implements DfdlDataFormat {
	/**
	 * The default value of the '{@link #getRootElement() <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected String rootElement = ROOT_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootNamespace() <em>Root Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootNamespace() <em>Root Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNamespace()
	 * @generated
	 * @ordered
	 */
	protected String rootNamespace = ROOT_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaUri() <em>Schema Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaUri() <em>Schema Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaUri()
	 * @generated
	 * @ordered
	 */
	protected String schemaUri = SCHEMA_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DfdlDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getDfdlDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootElement(String newRootElement) {
		String oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DFDL_DATA_FORMAT__ROOT_ELEMENT, oldRootElement, rootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootNamespace() {
		return rootNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootNamespace(String newRootNamespace) {
		String oldRootNamespace = rootNamespace;
		rootNamespace = newRootNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DFDL_DATA_FORMAT__ROOT_NAMESPACE, oldRootNamespace, rootNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaUri() {
		return schemaUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaUri(String newSchemaUri) {
		String oldSchemaUri = schemaUri;
		schemaUri = newSchemaUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.DFDL_DATA_FORMAT__SCHEMA_URI, oldSchemaUri, schemaUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.DFDL_DATA_FORMAT__ROOT_ELEMENT:
				return getRootElement();
			case CamelSpringPackage.DFDL_DATA_FORMAT__ROOT_NAMESPACE:
				return getRootNamespace();
			case CamelSpringPackage.DFDL_DATA_FORMAT__SCHEMA_URI:
				return getSchemaUri();
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
			case CamelSpringPackage.DFDL_DATA_FORMAT__ROOT_ELEMENT:
				setRootElement((String)newValue);
				return;
			case CamelSpringPackage.DFDL_DATA_FORMAT__ROOT_NAMESPACE:
				setRootNamespace((String)newValue);
				return;
			case CamelSpringPackage.DFDL_DATA_FORMAT__SCHEMA_URI:
				setSchemaUri((String)newValue);
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
			case CamelSpringPackage.DFDL_DATA_FORMAT__ROOT_ELEMENT:
				setRootElement(ROOT_ELEMENT_EDEFAULT);
				return;
			case CamelSpringPackage.DFDL_DATA_FORMAT__ROOT_NAMESPACE:
				setRootNamespace(ROOT_NAMESPACE_EDEFAULT);
				return;
			case CamelSpringPackage.DFDL_DATA_FORMAT__SCHEMA_URI:
				setSchemaUri(SCHEMA_URI_EDEFAULT);
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
			case CamelSpringPackage.DFDL_DATA_FORMAT__ROOT_ELEMENT:
				return ROOT_ELEMENT_EDEFAULT == null ? rootElement != null : !ROOT_ELEMENT_EDEFAULT.equals(rootElement);
			case CamelSpringPackage.DFDL_DATA_FORMAT__ROOT_NAMESPACE:
				return ROOT_NAMESPACE_EDEFAULT == null ? rootNamespace != null : !ROOT_NAMESPACE_EDEFAULT.equals(rootNamespace);
			case CamelSpringPackage.DFDL_DATA_FORMAT__SCHEMA_URI:
				return SCHEMA_URI_EDEFAULT == null ? schemaUri != null : !SCHEMA_URI_EDEFAULT.equals(schemaUri);
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
		result.append(" (rootElement: ");
		result.append(rootElement);
		result.append(", rootNamespace: ");
		result.append(rootNamespace);
		result.append(", schemaUri: ");
		result.append(schemaUri);
		result.append(')');
		return result.toString();
	}

} //DfdlDataFormatImpl

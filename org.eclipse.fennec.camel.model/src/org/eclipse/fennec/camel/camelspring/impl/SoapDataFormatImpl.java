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
import org.eclipse.fennec.camel.camelspring.SoapDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soap Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SoapDataFormatImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SoapDataFormatImpl#getElementNameStrategyRef <em>Element Name Strategy Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SoapDataFormatImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SoapDataFormatImpl#getNamespacePrefixRef <em>Namespace Prefix Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SoapDataFormatImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SoapDataFormatImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoapDataFormatImpl extends DataFormatImpl implements SoapDataFormat {
	/**
	 * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPath()
	 * @generated
	 * @ordered
	 */
	protected String contextPath = CONTEXT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementNameStrategyRef() <em>Element Name Strategy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNameStrategyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_STRATEGY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementNameStrategyRef() <em>Element Name Strategy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNameStrategyRef()
	 * @generated
	 * @ordered
	 */
	protected String elementNameStrategyRef = ELEMENT_NAME_STRATEGY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespacePrefixRef() <em>Namespace Prefix Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefixRef()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_PREFIX_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespacePrefixRef() <em>Namespace Prefix Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefixRef()
	 * @generated
	 * @ordered
	 */
	protected String namespacePrefixRef = NAMESPACE_PREFIX_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoapDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSoapDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextPath() {
		return contextPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextPath(String newContextPath) {
		String oldContextPath = contextPath;
		contextPath = newContextPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SOAP_DATA_FORMAT__CONTEXT_PATH, oldContextPath, contextPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementNameStrategyRef() {
		return elementNameStrategyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementNameStrategyRef(String newElementNameStrategyRef) {
		String oldElementNameStrategyRef = elementNameStrategyRef;
		elementNameStrategyRef = newElementNameStrategyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SOAP_DATA_FORMAT__ELEMENT_NAME_STRATEGY_REF, oldElementNameStrategyRef, elementNameStrategyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SOAP_DATA_FORMAT__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespacePrefixRef() {
		return namespacePrefixRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespacePrefixRef(String newNamespacePrefixRef) {
		String oldNamespacePrefixRef = namespacePrefixRef;
		namespacePrefixRef = newNamespacePrefixRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SOAP_DATA_FORMAT__NAMESPACE_PREFIX_REF, oldNamespacePrefixRef, namespacePrefixRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SOAP_DATA_FORMAT__SCHEMA, oldSchema, schema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SOAP_DATA_FORMAT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.SOAP_DATA_FORMAT__CONTEXT_PATH:
				return getContextPath();
			case CamelSpringPackage.SOAP_DATA_FORMAT__ELEMENT_NAME_STRATEGY_REF:
				return getElementNameStrategyRef();
			case CamelSpringPackage.SOAP_DATA_FORMAT__ENCODING:
				return getEncoding();
			case CamelSpringPackage.SOAP_DATA_FORMAT__NAMESPACE_PREFIX_REF:
				return getNamespacePrefixRef();
			case CamelSpringPackage.SOAP_DATA_FORMAT__SCHEMA:
				return getSchema();
			case CamelSpringPackage.SOAP_DATA_FORMAT__VERSION:
				return getVersion();
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
			case CamelSpringPackage.SOAP_DATA_FORMAT__CONTEXT_PATH:
				setContextPath((String)newValue);
				return;
			case CamelSpringPackage.SOAP_DATA_FORMAT__ELEMENT_NAME_STRATEGY_REF:
				setElementNameStrategyRef((String)newValue);
				return;
			case CamelSpringPackage.SOAP_DATA_FORMAT__ENCODING:
				setEncoding((String)newValue);
				return;
			case CamelSpringPackage.SOAP_DATA_FORMAT__NAMESPACE_PREFIX_REF:
				setNamespacePrefixRef((String)newValue);
				return;
			case CamelSpringPackage.SOAP_DATA_FORMAT__SCHEMA:
				setSchema((String)newValue);
				return;
			case CamelSpringPackage.SOAP_DATA_FORMAT__VERSION:
				setVersion((String)newValue);
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
			case CamelSpringPackage.SOAP_DATA_FORMAT__CONTEXT_PATH:
				setContextPath(CONTEXT_PATH_EDEFAULT);
				return;
			case CamelSpringPackage.SOAP_DATA_FORMAT__ELEMENT_NAME_STRATEGY_REF:
				setElementNameStrategyRef(ELEMENT_NAME_STRATEGY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SOAP_DATA_FORMAT__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case CamelSpringPackage.SOAP_DATA_FORMAT__NAMESPACE_PREFIX_REF:
				setNamespacePrefixRef(NAMESPACE_PREFIX_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SOAP_DATA_FORMAT__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case CamelSpringPackage.SOAP_DATA_FORMAT__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case CamelSpringPackage.SOAP_DATA_FORMAT__CONTEXT_PATH:
				return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
			case CamelSpringPackage.SOAP_DATA_FORMAT__ELEMENT_NAME_STRATEGY_REF:
				return ELEMENT_NAME_STRATEGY_REF_EDEFAULT == null ? elementNameStrategyRef != null : !ELEMENT_NAME_STRATEGY_REF_EDEFAULT.equals(elementNameStrategyRef);
			case CamelSpringPackage.SOAP_DATA_FORMAT__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case CamelSpringPackage.SOAP_DATA_FORMAT__NAMESPACE_PREFIX_REF:
				return NAMESPACE_PREFIX_REF_EDEFAULT == null ? namespacePrefixRef != null : !NAMESPACE_PREFIX_REF_EDEFAULT.equals(namespacePrefixRef);
			case CamelSpringPackage.SOAP_DATA_FORMAT__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case CamelSpringPackage.SOAP_DATA_FORMAT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (contextPath: ");
		result.append(contextPath);
		result.append(", elementNameStrategyRef: ");
		result.append(elementNameStrategyRef);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", namespacePrefixRef: ");
		result.append(namespacePrefixRef);
		result.append(", schema: ");
		result.append(schema);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //SoapDataFormatImpl

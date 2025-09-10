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
import org.eclipse.fennec.camel.camelspring.ThriftDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thrift Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThriftDataFormatImpl#getContentTypeFormat <em>Content Type Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThriftDataFormatImpl#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ThriftDataFormatImpl#getInstanceClass <em>Instance Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThriftDataFormatImpl extends DataFormatImpl implements ThriftDataFormat {
	/**
	 * The default value of the '{@link #getContentTypeFormat() <em>Content Type Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentTypeFormat() <em>Content Type Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeFormat()
	 * @generated
	 * @ordered
	 */
	protected String contentTypeFormat = CONTENT_TYPE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentTypeHeader() <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentTypeHeader() <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected String contentTypeHeader = CONTENT_TYPE_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceClass() <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceClass() <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected String instanceClass = INSTANCE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThriftDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getThriftDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentTypeFormat() {
		return contentTypeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentTypeFormat(String newContentTypeFormat) {
		String oldContentTypeFormat = contentTypeFormat;
		contentTypeFormat = newContentTypeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THRIFT_DATA_FORMAT__CONTENT_TYPE_FORMAT, oldContentTypeFormat, contentTypeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentTypeHeader() {
		return contentTypeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentTypeHeader(String newContentTypeHeader) {
		String oldContentTypeHeader = contentTypeHeader;
		contentTypeHeader = newContentTypeHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THRIFT_DATA_FORMAT__CONTENT_TYPE_HEADER, oldContentTypeHeader, contentTypeHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceClass() {
		return instanceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceClass(String newInstanceClass) {
		String oldInstanceClass = instanceClass;
		instanceClass = newInstanceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.THRIFT_DATA_FORMAT__INSTANCE_CLASS, oldInstanceClass, instanceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.THRIFT_DATA_FORMAT__CONTENT_TYPE_FORMAT:
				return getContentTypeFormat();
			case CamelSpringPackage.THRIFT_DATA_FORMAT__CONTENT_TYPE_HEADER:
				return getContentTypeHeader();
			case CamelSpringPackage.THRIFT_DATA_FORMAT__INSTANCE_CLASS:
				return getInstanceClass();
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
			case CamelSpringPackage.THRIFT_DATA_FORMAT__CONTENT_TYPE_FORMAT:
				setContentTypeFormat((String)newValue);
				return;
			case CamelSpringPackage.THRIFT_DATA_FORMAT__CONTENT_TYPE_HEADER:
				setContentTypeHeader((String)newValue);
				return;
			case CamelSpringPackage.THRIFT_DATA_FORMAT__INSTANCE_CLASS:
				setInstanceClass((String)newValue);
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
			case CamelSpringPackage.THRIFT_DATA_FORMAT__CONTENT_TYPE_FORMAT:
				setContentTypeFormat(CONTENT_TYPE_FORMAT_EDEFAULT);
				return;
			case CamelSpringPackage.THRIFT_DATA_FORMAT__CONTENT_TYPE_HEADER:
				setContentTypeHeader(CONTENT_TYPE_HEADER_EDEFAULT);
				return;
			case CamelSpringPackage.THRIFT_DATA_FORMAT__INSTANCE_CLASS:
				setInstanceClass(INSTANCE_CLASS_EDEFAULT);
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
			case CamelSpringPackage.THRIFT_DATA_FORMAT__CONTENT_TYPE_FORMAT:
				return CONTENT_TYPE_FORMAT_EDEFAULT == null ? contentTypeFormat != null : !CONTENT_TYPE_FORMAT_EDEFAULT.equals(contentTypeFormat);
			case CamelSpringPackage.THRIFT_DATA_FORMAT__CONTENT_TYPE_HEADER:
				return CONTENT_TYPE_HEADER_EDEFAULT == null ? contentTypeHeader != null : !CONTENT_TYPE_HEADER_EDEFAULT.equals(contentTypeHeader);
			case CamelSpringPackage.THRIFT_DATA_FORMAT__INSTANCE_CLASS:
				return INSTANCE_CLASS_EDEFAULT == null ? instanceClass != null : !INSTANCE_CLASS_EDEFAULT.equals(instanceClass);
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
		result.append(" (contentTypeFormat: ");
		result.append(contentTypeFormat);
		result.append(", contentTypeHeader: ");
		result.append(contentTypeHeader);
		result.append(", instanceClass: ");
		result.append(instanceClass);
		result.append(')');
		return result.toString();
	}

} //ThriftDataFormatImpl

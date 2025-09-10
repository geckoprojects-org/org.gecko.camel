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
import org.eclipse.fennec.camel.camelspring.TidyMarkupDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tidy Markup Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TidyMarkupDataFormatImpl#getDataObjectType <em>Data Object Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TidyMarkupDataFormatImpl#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TidyMarkupDataFormatImpl extends DataFormatImpl implements TidyMarkupDataFormat {
	/**
	 * The default value of the '{@link #getDataObjectType() <em>Data Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_OBJECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataObjectType() <em>Data Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjectType()
	 * @generated
	 * @ordered
	 */
	protected String dataObjectType = DATA_OBJECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOmitXmlDeclaration() <em>Omit Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitXmlDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String OMIT_XML_DECLARATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOmitXmlDeclaration() <em>Omit Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitXmlDeclaration()
	 * @generated
	 * @ordered
	 */
	protected String omitXmlDeclaration = OMIT_XML_DECLARATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TidyMarkupDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getTidyMarkupDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataObjectType() {
		return dataObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataObjectType(String newDataObjectType) {
		String oldDataObjectType = dataObjectType;
		dataObjectType = newDataObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT__DATA_OBJECT_TYPE, oldDataObjectType, dataObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOmitXmlDeclaration() {
		return omitXmlDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOmitXmlDeclaration(String newOmitXmlDeclaration) {
		String oldOmitXmlDeclaration = omitXmlDeclaration;
		omitXmlDeclaration = newOmitXmlDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT__OMIT_XML_DECLARATION, oldOmitXmlDeclaration, omitXmlDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT__DATA_OBJECT_TYPE:
				return getDataObjectType();
			case CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT__OMIT_XML_DECLARATION:
				return getOmitXmlDeclaration();
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
			case CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT__DATA_OBJECT_TYPE:
				setDataObjectType((String)newValue);
				return;
			case CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT__OMIT_XML_DECLARATION:
				setOmitXmlDeclaration((String)newValue);
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
			case CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT__DATA_OBJECT_TYPE:
				setDataObjectType(DATA_OBJECT_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT__OMIT_XML_DECLARATION:
				setOmitXmlDeclaration(OMIT_XML_DECLARATION_EDEFAULT);
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
			case CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT__DATA_OBJECT_TYPE:
				return DATA_OBJECT_TYPE_EDEFAULT == null ? dataObjectType != null : !DATA_OBJECT_TYPE_EDEFAULT.equals(dataObjectType);
			case CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT__OMIT_XML_DECLARATION:
				return OMIT_XML_DECLARATION_EDEFAULT == null ? omitXmlDeclaration != null : !OMIT_XML_DECLARATION_EDEFAULT.equals(omitXmlDeclaration);
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
		result.append(" (dataObjectType: ");
		result.append(dataObjectType);
		result.append(", omitXmlDeclaration: ");
		result.append(omitXmlDeclaration);
		result.append(')');
		return result.toString();
	}

} //TidyMarkupDataFormatImpl

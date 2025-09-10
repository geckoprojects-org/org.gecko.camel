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
import org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swift Mx Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SwiftMxDataFormatImpl#getReadConfigRef <em>Read Config Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SwiftMxDataFormatImpl#getReadMessageId <em>Read Message Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SwiftMxDataFormatImpl#getWriteConfigRef <em>Write Config Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SwiftMxDataFormatImpl#getWriteInJson <em>Write In Json</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwiftMxDataFormatImpl extends DataFormatImpl implements SwiftMxDataFormat {
	/**
	 * The default value of the '{@link #getReadConfigRef() <em>Read Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadConfigRef()
	 * @generated
	 * @ordered
	 */
	protected static final String READ_CONFIG_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadConfigRef() <em>Read Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadConfigRef()
	 * @generated
	 * @ordered
	 */
	protected String readConfigRef = READ_CONFIG_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadMessageId() <em>Read Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadMessageId()
	 * @generated
	 * @ordered
	 */
	protected static final String READ_MESSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadMessageId() <em>Read Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadMessageId()
	 * @generated
	 * @ordered
	 */
	protected String readMessageId = READ_MESSAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteConfigRef() <em>Write Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteConfigRef()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITE_CONFIG_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteConfigRef() <em>Write Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteConfigRef()
	 * @generated
	 * @ordered
	 */
	protected String writeConfigRef = WRITE_CONFIG_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteInJson() <em>Write In Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteInJson()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITE_IN_JSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteInJson() <em>Write In Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteInJson()
	 * @generated
	 * @ordered
	 */
	protected String writeInJson = WRITE_IN_JSON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwiftMxDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSwiftMxDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReadConfigRef() {
		return readConfigRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadConfigRef(String newReadConfigRef) {
		String oldReadConfigRef = readConfigRef;
		readConfigRef = newReadConfigRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SWIFT_MX_DATA_FORMAT__READ_CONFIG_REF, oldReadConfigRef, readConfigRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReadMessageId() {
		return readMessageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadMessageId(String newReadMessageId) {
		String oldReadMessageId = readMessageId;
		readMessageId = newReadMessageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SWIFT_MX_DATA_FORMAT__READ_MESSAGE_ID, oldReadMessageId, readMessageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWriteConfigRef() {
		return writeConfigRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteConfigRef(String newWriteConfigRef) {
		String oldWriteConfigRef = writeConfigRef;
		writeConfigRef = newWriteConfigRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SWIFT_MX_DATA_FORMAT__WRITE_CONFIG_REF, oldWriteConfigRef, writeConfigRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWriteInJson() {
		return writeInJson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteInJson(String newWriteInJson) {
		String oldWriteInJson = writeInJson;
		writeInJson = newWriteInJson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.SWIFT_MX_DATA_FORMAT__WRITE_IN_JSON, oldWriteInJson, writeInJson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__READ_CONFIG_REF:
				return getReadConfigRef();
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__READ_MESSAGE_ID:
				return getReadMessageId();
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__WRITE_CONFIG_REF:
				return getWriteConfigRef();
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__WRITE_IN_JSON:
				return getWriteInJson();
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
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__READ_CONFIG_REF:
				setReadConfigRef((String)newValue);
				return;
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__READ_MESSAGE_ID:
				setReadMessageId((String)newValue);
				return;
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__WRITE_CONFIG_REF:
				setWriteConfigRef((String)newValue);
				return;
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__WRITE_IN_JSON:
				setWriteInJson((String)newValue);
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
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__READ_CONFIG_REF:
				setReadConfigRef(READ_CONFIG_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__READ_MESSAGE_ID:
				setReadMessageId(READ_MESSAGE_ID_EDEFAULT);
				return;
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__WRITE_CONFIG_REF:
				setWriteConfigRef(WRITE_CONFIG_REF_EDEFAULT);
				return;
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__WRITE_IN_JSON:
				setWriteInJson(WRITE_IN_JSON_EDEFAULT);
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
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__READ_CONFIG_REF:
				return READ_CONFIG_REF_EDEFAULT == null ? readConfigRef != null : !READ_CONFIG_REF_EDEFAULT.equals(readConfigRef);
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__READ_MESSAGE_ID:
				return READ_MESSAGE_ID_EDEFAULT == null ? readMessageId != null : !READ_MESSAGE_ID_EDEFAULT.equals(readMessageId);
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__WRITE_CONFIG_REF:
				return WRITE_CONFIG_REF_EDEFAULT == null ? writeConfigRef != null : !WRITE_CONFIG_REF_EDEFAULT.equals(writeConfigRef);
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT__WRITE_IN_JSON:
				return WRITE_IN_JSON_EDEFAULT == null ? writeInJson != null : !WRITE_IN_JSON_EDEFAULT.equals(writeInJson);
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
		result.append(" (readConfigRef: ");
		result.append(readConfigRef);
		result.append(", readMessageId: ");
		result.append(readMessageId);
		result.append(", writeConfigRef: ");
		result.append(writeConfigRef);
		result.append(", writeInJson: ");
		result.append(writeInJson);
		result.append(')');
		return result.toString();
	}

} //SwiftMxDataFormatImpl

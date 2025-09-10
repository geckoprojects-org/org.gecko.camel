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
import org.eclipse.fennec.camel.camelspring.Iso8583DataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iso8583 Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Iso8583DataFormatImpl#getAllowAutoWiredMessageFormat <em>Allow Auto Wired Message Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Iso8583DataFormatImpl#getConfigFile <em>Config File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.Iso8583DataFormatImpl#getIsoType <em>Iso Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Iso8583DataFormatImpl extends DataFormatImpl implements Iso8583DataFormat {
	/**
	 * The default value of the '{@link #getAllowAutoWiredMessageFormat() <em>Allow Auto Wired Message Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAutoWiredMessageFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_AUTO_WIRED_MESSAGE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowAutoWiredMessageFormat() <em>Allow Auto Wired Message Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAutoWiredMessageFormat()
	 * @generated
	 * @ordered
	 */
	protected String allowAutoWiredMessageFormat = ALLOW_AUTO_WIRED_MESSAGE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigFile() <em>Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigFile()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigFile() <em>Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigFile()
	 * @generated
	 * @ordered
	 */
	protected String configFile = CONFIG_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsoType() <em>Iso Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsoType()
	 * @generated
	 * @ordered
	 */
	protected static final String ISO_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsoType() <em>Iso Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsoType()
	 * @generated
	 * @ordered
	 */
	protected String isoType = ISO_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Iso8583DataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getIso8583DataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowAutoWiredMessageFormat() {
		return allowAutoWiredMessageFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAutoWiredMessageFormat(String newAllowAutoWiredMessageFormat) {
		String oldAllowAutoWiredMessageFormat = allowAutoWiredMessageFormat;
		allowAutoWiredMessageFormat = newAllowAutoWiredMessageFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ISO8583_DATA_FORMAT__ALLOW_AUTO_WIRED_MESSAGE_FORMAT, oldAllowAutoWiredMessageFormat, allowAutoWiredMessageFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigFile() {
		return configFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigFile(String newConfigFile) {
		String oldConfigFile = configFile;
		configFile = newConfigFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ISO8583_DATA_FORMAT__CONFIG_FILE, oldConfigFile, configFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsoType() {
		return isoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsoType(String newIsoType) {
		String oldIsoType = isoType;
		isoType = newIsoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ISO8583_DATA_FORMAT__ISO_TYPE, oldIsoType, isoType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.ISO8583_DATA_FORMAT__ALLOW_AUTO_WIRED_MESSAGE_FORMAT:
				return getAllowAutoWiredMessageFormat();
			case CamelSpringPackage.ISO8583_DATA_FORMAT__CONFIG_FILE:
				return getConfigFile();
			case CamelSpringPackage.ISO8583_DATA_FORMAT__ISO_TYPE:
				return getIsoType();
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
			case CamelSpringPackage.ISO8583_DATA_FORMAT__ALLOW_AUTO_WIRED_MESSAGE_FORMAT:
				setAllowAutoWiredMessageFormat((String)newValue);
				return;
			case CamelSpringPackage.ISO8583_DATA_FORMAT__CONFIG_FILE:
				setConfigFile((String)newValue);
				return;
			case CamelSpringPackage.ISO8583_DATA_FORMAT__ISO_TYPE:
				setIsoType((String)newValue);
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
			case CamelSpringPackage.ISO8583_DATA_FORMAT__ALLOW_AUTO_WIRED_MESSAGE_FORMAT:
				setAllowAutoWiredMessageFormat(ALLOW_AUTO_WIRED_MESSAGE_FORMAT_EDEFAULT);
				return;
			case CamelSpringPackage.ISO8583_DATA_FORMAT__CONFIG_FILE:
				setConfigFile(CONFIG_FILE_EDEFAULT);
				return;
			case CamelSpringPackage.ISO8583_DATA_FORMAT__ISO_TYPE:
				setIsoType(ISO_TYPE_EDEFAULT);
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
			case CamelSpringPackage.ISO8583_DATA_FORMAT__ALLOW_AUTO_WIRED_MESSAGE_FORMAT:
				return ALLOW_AUTO_WIRED_MESSAGE_FORMAT_EDEFAULT == null ? allowAutoWiredMessageFormat != null : !ALLOW_AUTO_WIRED_MESSAGE_FORMAT_EDEFAULT.equals(allowAutoWiredMessageFormat);
			case CamelSpringPackage.ISO8583_DATA_FORMAT__CONFIG_FILE:
				return CONFIG_FILE_EDEFAULT == null ? configFile != null : !CONFIG_FILE_EDEFAULT.equals(configFile);
			case CamelSpringPackage.ISO8583_DATA_FORMAT__ISO_TYPE:
				return ISO_TYPE_EDEFAULT == null ? isoType != null : !ISO_TYPE_EDEFAULT.equals(isoType);
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
		result.append(" (allowAutoWiredMessageFormat: ");
		result.append(allowAutoWiredMessageFormat);
		result.append(", configFile: ");
		result.append(configFile);
		result.append(", isoType: ");
		result.append(isoType);
		result.append(')');
		return result.toString();
	}

} //Iso8583DataFormatImpl

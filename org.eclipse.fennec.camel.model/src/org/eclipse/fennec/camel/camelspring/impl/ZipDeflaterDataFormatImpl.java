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
import org.eclipse.fennec.camel.camelspring.ZipDeflaterDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip Deflater Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZipDeflaterDataFormatImpl#getCompressionLevel <em>Compression Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZipDeflaterDataFormatImpl extends DataFormatImpl implements ZipDeflaterDataFormat {
	/**
	 * The default value of the '{@link #getCompressionLevel() <em>Compression Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionLevel() <em>Compression Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionLevel()
	 * @generated
	 * @ordered
	 */
	protected String compressionLevel = COMPRESSION_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZipDeflaterDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getZipDeflaterDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompressionLevel() {
		return compressionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionLevel(String newCompressionLevel) {
		String oldCompressionLevel = compressionLevel;
		compressionLevel = newCompressionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZIP_DEFLATER_DATA_FORMAT__COMPRESSION_LEVEL, oldCompressionLevel, compressionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.ZIP_DEFLATER_DATA_FORMAT__COMPRESSION_LEVEL:
				return getCompressionLevel();
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
			case CamelSpringPackage.ZIP_DEFLATER_DATA_FORMAT__COMPRESSION_LEVEL:
				setCompressionLevel((String)newValue);
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
			case CamelSpringPackage.ZIP_DEFLATER_DATA_FORMAT__COMPRESSION_LEVEL:
				setCompressionLevel(COMPRESSION_LEVEL_EDEFAULT);
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
			case CamelSpringPackage.ZIP_DEFLATER_DATA_FORMAT__COMPRESSION_LEVEL:
				return COMPRESSION_LEVEL_EDEFAULT == null ? compressionLevel != null : !COMPRESSION_LEVEL_EDEFAULT.equals(compressionLevel);
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
		result.append(" (compressionLevel: ");
		result.append(compressionLevel);
		result.append(')');
		return result.toString();
	}

} //ZipDeflaterDataFormatImpl

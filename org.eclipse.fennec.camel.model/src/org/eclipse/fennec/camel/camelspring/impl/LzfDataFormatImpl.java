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
import org.eclipse.fennec.camel.camelspring.LzfDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lzf Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.LzfDataFormatImpl#getUsingParallelCompression <em>Using Parallel Compression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LzfDataFormatImpl extends DataFormatImpl implements LzfDataFormat {
	/**
	 * The default value of the '{@link #getUsingParallelCompression() <em>Using Parallel Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingParallelCompression()
	 * @generated
	 * @ordered
	 */
	protected static final String USING_PARALLEL_COMPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsingParallelCompression() <em>Using Parallel Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingParallelCompression()
	 * @generated
	 * @ordered
	 */
	protected String usingParallelCompression = USING_PARALLEL_COMPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LzfDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getLzfDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsingParallelCompression() {
		return usingParallelCompression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsingParallelCompression(String newUsingParallelCompression) {
		String oldUsingParallelCompression = usingParallelCompression;
		usingParallelCompression = newUsingParallelCompression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.LZF_DATA_FORMAT__USING_PARALLEL_COMPRESSION, oldUsingParallelCompression, usingParallelCompression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.LZF_DATA_FORMAT__USING_PARALLEL_COMPRESSION:
				return getUsingParallelCompression();
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
			case CamelSpringPackage.LZF_DATA_FORMAT__USING_PARALLEL_COMPRESSION:
				setUsingParallelCompression((String)newValue);
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
			case CamelSpringPackage.LZF_DATA_FORMAT__USING_PARALLEL_COMPRESSION:
				setUsingParallelCompression(USING_PARALLEL_COMPRESSION_EDEFAULT);
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
			case CamelSpringPackage.LZF_DATA_FORMAT__USING_PARALLEL_COMPRESSION:
				return USING_PARALLEL_COMPRESSION_EDEFAULT == null ? usingParallelCompression != null : !USING_PARALLEL_COMPRESSION_EDEFAULT.equals(usingParallelCompression);
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
		result.append(" (usingParallelCompression: ");
		result.append(usingParallelCompression);
		result.append(')');
		return result.toString();
	}

} //LzfDataFormatImpl

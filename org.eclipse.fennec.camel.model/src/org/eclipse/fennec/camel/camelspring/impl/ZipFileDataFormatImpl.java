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
import org.eclipse.fennec.camel.camelspring.ZipFileDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip File Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZipFileDataFormatImpl#getAllowEmptyDirectory <em>Allow Empty Directory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZipFileDataFormatImpl#getMaxDecompressedSize <em>Max Decompressed Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZipFileDataFormatImpl#getPreservePathElements <em>Preserve Path Elements</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ZipFileDataFormatImpl#getUsingIterator <em>Using Iterator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZipFileDataFormatImpl extends DataFormatImpl implements ZipFileDataFormat {
	/**
	 * The default value of the '{@link #getAllowEmptyDirectory() <em>Allow Empty Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_EMPTY_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowEmptyDirectory() <em>Allow Empty Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyDirectory()
	 * @generated
	 * @ordered
	 */
	protected String allowEmptyDirectory = ALLOW_EMPTY_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDecompressedSize() <em>Max Decompressed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDecompressedSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_DECOMPRESSED_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDecompressedSize() <em>Max Decompressed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDecompressedSize()
	 * @generated
	 * @ordered
	 */
	protected String maxDecompressedSize = MAX_DECOMPRESSED_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreservePathElements() <em>Preserve Path Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreservePathElements()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESERVE_PATH_ELEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreservePathElements() <em>Preserve Path Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreservePathElements()
	 * @generated
	 * @ordered
	 */
	protected String preservePathElements = PRESERVE_PATH_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsingIterator() <em>Using Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingIterator()
	 * @generated
	 * @ordered
	 */
	protected static final String USING_ITERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsingIterator() <em>Using Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingIterator()
	 * @generated
	 * @ordered
	 */
	protected String usingIterator = USING_ITERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZipFileDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getZipFileDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowEmptyDirectory() {
		return allowEmptyDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowEmptyDirectory(String newAllowEmptyDirectory) {
		String oldAllowEmptyDirectory = allowEmptyDirectory;
		allowEmptyDirectory = newAllowEmptyDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZIP_FILE_DATA_FORMAT__ALLOW_EMPTY_DIRECTORY, oldAllowEmptyDirectory, allowEmptyDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxDecompressedSize() {
		return maxDecompressedSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDecompressedSize(String newMaxDecompressedSize) {
		String oldMaxDecompressedSize = maxDecompressedSize;
		maxDecompressedSize = newMaxDecompressedSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZIP_FILE_DATA_FORMAT__MAX_DECOMPRESSED_SIZE, oldMaxDecompressedSize, maxDecompressedSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreservePathElements() {
		return preservePathElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreservePathElements(String newPreservePathElements) {
		String oldPreservePathElements = preservePathElements;
		preservePathElements = newPreservePathElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZIP_FILE_DATA_FORMAT__PRESERVE_PATH_ELEMENTS, oldPreservePathElements, preservePathElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsingIterator() {
		return usingIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsingIterator(String newUsingIterator) {
		String oldUsingIterator = usingIterator;
		usingIterator = newUsingIterator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.ZIP_FILE_DATA_FORMAT__USING_ITERATOR, oldUsingIterator, usingIterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__ALLOW_EMPTY_DIRECTORY:
				return getAllowEmptyDirectory();
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__MAX_DECOMPRESSED_SIZE:
				return getMaxDecompressedSize();
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__PRESERVE_PATH_ELEMENTS:
				return getPreservePathElements();
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__USING_ITERATOR:
				return getUsingIterator();
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
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__ALLOW_EMPTY_DIRECTORY:
				setAllowEmptyDirectory((String)newValue);
				return;
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__MAX_DECOMPRESSED_SIZE:
				setMaxDecompressedSize((String)newValue);
				return;
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__PRESERVE_PATH_ELEMENTS:
				setPreservePathElements((String)newValue);
				return;
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__USING_ITERATOR:
				setUsingIterator((String)newValue);
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
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__ALLOW_EMPTY_DIRECTORY:
				setAllowEmptyDirectory(ALLOW_EMPTY_DIRECTORY_EDEFAULT);
				return;
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__MAX_DECOMPRESSED_SIZE:
				setMaxDecompressedSize(MAX_DECOMPRESSED_SIZE_EDEFAULT);
				return;
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__PRESERVE_PATH_ELEMENTS:
				setPreservePathElements(PRESERVE_PATH_ELEMENTS_EDEFAULT);
				return;
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__USING_ITERATOR:
				setUsingIterator(USING_ITERATOR_EDEFAULT);
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
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__ALLOW_EMPTY_DIRECTORY:
				return ALLOW_EMPTY_DIRECTORY_EDEFAULT == null ? allowEmptyDirectory != null : !ALLOW_EMPTY_DIRECTORY_EDEFAULT.equals(allowEmptyDirectory);
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__MAX_DECOMPRESSED_SIZE:
				return MAX_DECOMPRESSED_SIZE_EDEFAULT == null ? maxDecompressedSize != null : !MAX_DECOMPRESSED_SIZE_EDEFAULT.equals(maxDecompressedSize);
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__PRESERVE_PATH_ELEMENTS:
				return PRESERVE_PATH_ELEMENTS_EDEFAULT == null ? preservePathElements != null : !PRESERVE_PATH_ELEMENTS_EDEFAULT.equals(preservePathElements);
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT__USING_ITERATOR:
				return USING_ITERATOR_EDEFAULT == null ? usingIterator != null : !USING_ITERATOR_EDEFAULT.equals(usingIterator);
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
		result.append(" (allowEmptyDirectory: ");
		result.append(allowEmptyDirectory);
		result.append(", maxDecompressedSize: ");
		result.append(maxDecompressedSize);
		result.append(", preservePathElements: ");
		result.append(preservePathElements);
		result.append(", usingIterator: ");
		result.append(usingIterator);
		result.append(')');
		return result.toString();
	}

} //ZipFileDataFormatImpl

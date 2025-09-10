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

import org.eclipse.fennec.camel.camelspring.BarcodeDataFormat;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Barcode Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BarcodeDataFormatImpl#getBarcodeFormat <em>Barcode Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BarcodeDataFormatImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BarcodeDataFormatImpl#getImageType <em>Image Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BarcodeDataFormatImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BarcodeDataFormatImpl extends DataFormatImpl implements BarcodeDataFormat {
	/**
	 * The default value of the '{@link #getBarcodeFormat() <em>Barcode Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcodeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String BARCODE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarcodeFormat() <em>Barcode Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcodeFormat()
	 * @generated
	 * @ordered
	 */
	protected String barcodeFormat = BARCODE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageType() <em>Image Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageType()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageType() <em>Image Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageType()
	 * @generated
	 * @ordered
	 */
	protected String imageType = IMAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarcodeDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getBarcodeDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBarcodeFormat() {
		return barcodeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBarcodeFormat(String newBarcodeFormat) {
		String oldBarcodeFormat = barcodeFormat;
		barcodeFormat = newBarcodeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BARCODE_DATA_FORMAT__BARCODE_FORMAT, oldBarcodeFormat, barcodeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BARCODE_DATA_FORMAT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageType() {
		return imageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageType(String newImageType) {
		String oldImageType = imageType;
		imageType = newImageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BARCODE_DATA_FORMAT__IMAGE_TYPE, oldImageType, imageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BARCODE_DATA_FORMAT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.BARCODE_DATA_FORMAT__BARCODE_FORMAT:
				return getBarcodeFormat();
			case CamelSpringPackage.BARCODE_DATA_FORMAT__HEIGHT:
				return getHeight();
			case CamelSpringPackage.BARCODE_DATA_FORMAT__IMAGE_TYPE:
				return getImageType();
			case CamelSpringPackage.BARCODE_DATA_FORMAT__WIDTH:
				return getWidth();
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
			case CamelSpringPackage.BARCODE_DATA_FORMAT__BARCODE_FORMAT:
				setBarcodeFormat((String)newValue);
				return;
			case CamelSpringPackage.BARCODE_DATA_FORMAT__HEIGHT:
				setHeight((String)newValue);
				return;
			case CamelSpringPackage.BARCODE_DATA_FORMAT__IMAGE_TYPE:
				setImageType((String)newValue);
				return;
			case CamelSpringPackage.BARCODE_DATA_FORMAT__WIDTH:
				setWidth((String)newValue);
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
			case CamelSpringPackage.BARCODE_DATA_FORMAT__BARCODE_FORMAT:
				setBarcodeFormat(BARCODE_FORMAT_EDEFAULT);
				return;
			case CamelSpringPackage.BARCODE_DATA_FORMAT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case CamelSpringPackage.BARCODE_DATA_FORMAT__IMAGE_TYPE:
				setImageType(IMAGE_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.BARCODE_DATA_FORMAT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case CamelSpringPackage.BARCODE_DATA_FORMAT__BARCODE_FORMAT:
				return BARCODE_FORMAT_EDEFAULT == null ? barcodeFormat != null : !BARCODE_FORMAT_EDEFAULT.equals(barcodeFormat);
			case CamelSpringPackage.BARCODE_DATA_FORMAT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case CamelSpringPackage.BARCODE_DATA_FORMAT__IMAGE_TYPE:
				return IMAGE_TYPE_EDEFAULT == null ? imageType != null : !IMAGE_TYPE_EDEFAULT.equals(imageType);
			case CamelSpringPackage.BARCODE_DATA_FORMAT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (barcodeFormat: ");
		result.append(barcodeFormat);
		result.append(", height: ");
		result.append(height);
		result.append(", imageType: ");
		result.append(imageType);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //BarcodeDataFormatImpl

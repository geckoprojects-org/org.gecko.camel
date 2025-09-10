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
package org.eclipse.fennec.camel.camelspring;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Barcode Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BarcodeDataFormat#getBarcodeFormat <em>Barcode Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BarcodeDataFormat#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BarcodeDataFormat#getImageType <em>Image Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BarcodeDataFormat#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBarcodeDataFormat()
 * @model extendedMetaData="name='barcodeDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface BarcodeDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Barcode Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Barcode format such as QR-Code.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Barcode Format</em>' attribute.
	 * @see #setBarcodeFormat(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBarcodeDataFormat_BarcodeFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='barcodeFormat'"
	 * @generated
	 */
	String getBarcodeFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BarcodeDataFormat#getBarcodeFormat <em>Barcode Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barcode Format</em>' attribute.
	 * @see #getBarcodeFormat()
	 * @generated
	 */
	void setBarcodeFormat(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Height of the barcode.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBarcodeDataFormat_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BarcodeDataFormat#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Image Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Image type of the barcode such as png.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Type</em>' attribute.
	 * @see #setImageType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBarcodeDataFormat_ImageType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='imageType'"
	 * @generated
	 */
	String getImageType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BarcodeDataFormat#getImageType <em>Image Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Type</em>' attribute.
	 * @see #getImageType()
	 * @generated
	 */
	void setImageType(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Width of the barcode.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBarcodeDataFormat_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BarcodeDataFormat#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // BarcodeDataFormat

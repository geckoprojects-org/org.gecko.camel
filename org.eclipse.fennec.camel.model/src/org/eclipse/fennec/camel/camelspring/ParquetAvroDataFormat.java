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
 * A representation of the model object '<em><b>Parquet Avro Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat#getCompressionCodecName <em>Compression Codec Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat#getLazyLoad <em>Lazy Load</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat#getUnmarshalType <em>Unmarshal Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParquetAvroDataFormat()
 * @model extendedMetaData="name='parquetAvroDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface ParquetAvroDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Compression Codec Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Compression codec to use when marshalling. Default value: GZIP
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Codec Name</em>' attribute.
	 * @see #setCompressionCodecName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParquetAvroDataFormat_CompressionCodecName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='compressionCodecName'"
	 * @generated
	 */
	String getCompressionCodecName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat#getCompressionCodecName <em>Compression Codec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Codec Name</em>' attribute.
	 * @see #getCompressionCodecName()
	 * @generated
	 */
	void setCompressionCodecName(String value);

	/**
	 * Returns the value of the '<em><b>Lazy Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the unmarshalling should produce an iterator of records or read all the records at once. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lazy Load</em>' attribute.
	 * @see #setLazyLoad(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParquetAvroDataFormat_LazyLoad()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lazyLoad'"
	 * @generated
	 */
	String getLazyLoad();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat#getLazyLoad <em>Lazy Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy Load</em>' attribute.
	 * @see #getLazyLoad()
	 * @generated
	 */
	void setLazyLoad(String value);

	/**
	 * Returns the value of the '<em><b>Unmarshal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Class to use when (un)marshalling. If omitted, parquet files are converted into Avro's GenericRecords for unmarshalling
	 * and input objects are assumed as GenericRecords for marshalling.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unmarshal Type</em>' attribute.
	 * @see #setUnmarshalType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParquetAvroDataFormat_UnmarshalType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unmarshalType'"
	 * @generated
	 */
	String getUnmarshalType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat#getUnmarshalType <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmarshal Type</em>' attribute.
	 * @see #getUnmarshalType()
	 * @generated
	 */
	void setUnmarshalType(String value);

} // ParquetAvroDataFormat

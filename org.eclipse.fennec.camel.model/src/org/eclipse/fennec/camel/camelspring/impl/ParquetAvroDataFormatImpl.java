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
import org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parquet Avro Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParquetAvroDataFormatImpl#getCompressionCodecName <em>Compression Codec Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParquetAvroDataFormatImpl#getLazyLoad <em>Lazy Load</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParquetAvroDataFormatImpl#getUnmarshalType <em>Unmarshal Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParquetAvroDataFormatImpl extends DataFormatImpl implements ParquetAvroDataFormat {
	/**
	 * The default value of the '{@link #getCompressionCodecName() <em>Compression Codec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionCodecName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_CODEC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionCodecName() <em>Compression Codec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionCodecName()
	 * @generated
	 * @ordered
	 */
	protected String compressionCodecName = COMPRESSION_CODEC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLazyLoad() <em>Lazy Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazyLoad()
	 * @generated
	 * @ordered
	 */
	protected static final String LAZY_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLazyLoad() <em>Lazy Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazyLoad()
	 * @generated
	 * @ordered
	 */
	protected String lazyLoad = LAZY_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnmarshalType() <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshalType()
	 * @generated
	 * @ordered
	 */
	protected static final String UNMARSHAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnmarshalType() <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshalType()
	 * @generated
	 * @ordered
	 */
	protected String unmarshalType = UNMARSHAL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParquetAvroDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getParquetAvroDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompressionCodecName() {
		return compressionCodecName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionCodecName(String newCompressionCodecName) {
		String oldCompressionCodecName = compressionCodecName;
		compressionCodecName = newCompressionCodecName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__COMPRESSION_CODEC_NAME, oldCompressionCodecName, compressionCodecName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLazyLoad() {
		return lazyLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLazyLoad(String newLazyLoad) {
		String oldLazyLoad = lazyLoad;
		lazyLoad = newLazyLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__LAZY_LOAD, oldLazyLoad, lazyLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnmarshalType() {
		return unmarshalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnmarshalType(String newUnmarshalType) {
		String oldUnmarshalType = unmarshalType;
		unmarshalType = newUnmarshalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__UNMARSHAL_TYPE, oldUnmarshalType, unmarshalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__COMPRESSION_CODEC_NAME:
				return getCompressionCodecName();
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__LAZY_LOAD:
				return getLazyLoad();
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__UNMARSHAL_TYPE:
				return getUnmarshalType();
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
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__COMPRESSION_CODEC_NAME:
				setCompressionCodecName((String)newValue);
				return;
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__LAZY_LOAD:
				setLazyLoad((String)newValue);
				return;
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType((String)newValue);
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
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__COMPRESSION_CODEC_NAME:
				setCompressionCodecName(COMPRESSION_CODEC_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__LAZY_LOAD:
				setLazyLoad(LAZY_LOAD_EDEFAULT);
				return;
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType(UNMARSHAL_TYPE_EDEFAULT);
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
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__COMPRESSION_CODEC_NAME:
				return COMPRESSION_CODEC_NAME_EDEFAULT == null ? compressionCodecName != null : !COMPRESSION_CODEC_NAME_EDEFAULT.equals(compressionCodecName);
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__LAZY_LOAD:
				return LAZY_LOAD_EDEFAULT == null ? lazyLoad != null : !LAZY_LOAD_EDEFAULT.equals(lazyLoad);
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT__UNMARSHAL_TYPE:
				return UNMARSHAL_TYPE_EDEFAULT == null ? unmarshalType != null : !UNMARSHAL_TYPE_EDEFAULT.equals(unmarshalType);
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
		result.append(" (compressionCodecName: ");
		result.append(compressionCodecName);
		result.append(", lazyLoad: ");
		result.append(lazyLoad);
		result.append(", unmarshalType: ");
		result.append(unmarshalType);
		result.append(')');
		return result.toString();
	}

} //ParquetAvroDataFormatImpl

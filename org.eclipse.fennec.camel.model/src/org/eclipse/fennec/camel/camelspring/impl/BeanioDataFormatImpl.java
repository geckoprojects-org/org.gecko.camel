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

import org.eclipse.fennec.camel.camelspring.BeanioDataFormat;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beanio Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanioDataFormatImpl#getBeanReaderErrorHandlerType <em>Bean Reader Error Handler Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanioDataFormatImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanioDataFormatImpl#getIgnoreInvalidRecords <em>Ignore Invalid Records</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanioDataFormatImpl#getIgnoreUnexpectedRecords <em>Ignore Unexpected Records</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanioDataFormatImpl#getIgnoreUnidentifiedRecords <em>Ignore Unidentified Records</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanioDataFormatImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanioDataFormatImpl#getStreamName <em>Stream Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.BeanioDataFormatImpl#getUnmarshalSingleObject <em>Unmarshal Single Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeanioDataFormatImpl extends DataFormatImpl implements BeanioDataFormat {
	/**
	 * The default value of the '{@link #getBeanReaderErrorHandlerType() <em>Bean Reader Error Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanReaderErrorHandlerType()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAN_READER_ERROR_HANDLER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeanReaderErrorHandlerType() <em>Bean Reader Error Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanReaderErrorHandlerType()
	 * @generated
	 * @ordered
	 */
	protected String beanReaderErrorHandlerType = BEAN_READER_ERROR_HANDLER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreInvalidRecords() <em>Ignore Invalid Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreInvalidRecords()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_INVALID_RECORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreInvalidRecords() <em>Ignore Invalid Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreInvalidRecords()
	 * @generated
	 * @ordered
	 */
	protected String ignoreInvalidRecords = IGNORE_INVALID_RECORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreUnexpectedRecords() <em>Ignore Unexpected Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreUnexpectedRecords()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_UNEXPECTED_RECORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreUnexpectedRecords() <em>Ignore Unexpected Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreUnexpectedRecords()
	 * @generated
	 * @ordered
	 */
	protected String ignoreUnexpectedRecords = IGNORE_UNEXPECTED_RECORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreUnidentifiedRecords() <em>Ignore Unidentified Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreUnidentifiedRecords()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_UNIDENTIFIED_RECORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreUnidentifiedRecords() <em>Ignore Unidentified Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreUnidentifiedRecords()
	 * @generated
	 * @ordered
	 */
	protected String ignoreUnidentifiedRecords = IGNORE_UNIDENTIFIED_RECORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected String mapping = MAPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreamName() <em>Stream Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamName()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreamName() <em>Stream Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamName()
	 * @generated
	 * @ordered
	 */
	protected String streamName = STREAM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnmarshalSingleObject() <em>Unmarshal Single Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshalSingleObject()
	 * @generated
	 * @ordered
	 */
	protected static final String UNMARSHAL_SINGLE_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnmarshalSingleObject() <em>Unmarshal Single Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshalSingleObject()
	 * @generated
	 * @ordered
	 */
	protected String unmarshalSingleObject = UNMARSHAL_SINGLE_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeanioDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getBeanioDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeanReaderErrorHandlerType() {
		return beanReaderErrorHandlerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeanReaderErrorHandlerType(String newBeanReaderErrorHandlerType) {
		String oldBeanReaderErrorHandlerType = beanReaderErrorHandlerType;
		beanReaderErrorHandlerType = newBeanReaderErrorHandlerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEANIO_DATA_FORMAT__BEAN_READER_ERROR_HANDLER_TYPE, oldBeanReaderErrorHandlerType, beanReaderErrorHandlerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEANIO_DATA_FORMAT__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreInvalidRecords() {
		return ignoreInvalidRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreInvalidRecords(String newIgnoreInvalidRecords) {
		String oldIgnoreInvalidRecords = ignoreInvalidRecords;
		ignoreInvalidRecords = newIgnoreInvalidRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_INVALID_RECORDS, oldIgnoreInvalidRecords, ignoreInvalidRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreUnexpectedRecords() {
		return ignoreUnexpectedRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreUnexpectedRecords(String newIgnoreUnexpectedRecords) {
		String oldIgnoreUnexpectedRecords = ignoreUnexpectedRecords;
		ignoreUnexpectedRecords = newIgnoreUnexpectedRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_UNEXPECTED_RECORDS, oldIgnoreUnexpectedRecords, ignoreUnexpectedRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreUnidentifiedRecords() {
		return ignoreUnidentifiedRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreUnidentifiedRecords(String newIgnoreUnidentifiedRecords) {
		String oldIgnoreUnidentifiedRecords = ignoreUnidentifiedRecords;
		ignoreUnidentifiedRecords = newIgnoreUnidentifiedRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_UNIDENTIFIED_RECORDS, oldIgnoreUnidentifiedRecords, ignoreUnidentifiedRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapping(String newMapping) {
		String oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEANIO_DATA_FORMAT__MAPPING, oldMapping, mapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreamName() {
		return streamName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreamName(String newStreamName) {
		String oldStreamName = streamName;
		streamName = newStreamName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEANIO_DATA_FORMAT__STREAM_NAME, oldStreamName, streamName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnmarshalSingleObject() {
		return unmarshalSingleObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnmarshalSingleObject(String newUnmarshalSingleObject) {
		String oldUnmarshalSingleObject = unmarshalSingleObject;
		unmarshalSingleObject = newUnmarshalSingleObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.BEANIO_DATA_FORMAT__UNMARSHAL_SINGLE_OBJECT, oldUnmarshalSingleObject, unmarshalSingleObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.BEANIO_DATA_FORMAT__BEAN_READER_ERROR_HANDLER_TYPE:
				return getBeanReaderErrorHandlerType();
			case CamelSpringPackage.BEANIO_DATA_FORMAT__ENCODING:
				return getEncoding();
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_INVALID_RECORDS:
				return getIgnoreInvalidRecords();
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_UNEXPECTED_RECORDS:
				return getIgnoreUnexpectedRecords();
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_UNIDENTIFIED_RECORDS:
				return getIgnoreUnidentifiedRecords();
			case CamelSpringPackage.BEANIO_DATA_FORMAT__MAPPING:
				return getMapping();
			case CamelSpringPackage.BEANIO_DATA_FORMAT__STREAM_NAME:
				return getStreamName();
			case CamelSpringPackage.BEANIO_DATA_FORMAT__UNMARSHAL_SINGLE_OBJECT:
				return getUnmarshalSingleObject();
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
			case CamelSpringPackage.BEANIO_DATA_FORMAT__BEAN_READER_ERROR_HANDLER_TYPE:
				setBeanReaderErrorHandlerType((String)newValue);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__ENCODING:
				setEncoding((String)newValue);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_INVALID_RECORDS:
				setIgnoreInvalidRecords((String)newValue);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_UNEXPECTED_RECORDS:
				setIgnoreUnexpectedRecords((String)newValue);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_UNIDENTIFIED_RECORDS:
				setIgnoreUnidentifiedRecords((String)newValue);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__MAPPING:
				setMapping((String)newValue);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__STREAM_NAME:
				setStreamName((String)newValue);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__UNMARSHAL_SINGLE_OBJECT:
				setUnmarshalSingleObject((String)newValue);
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
			case CamelSpringPackage.BEANIO_DATA_FORMAT__BEAN_READER_ERROR_HANDLER_TYPE:
				setBeanReaderErrorHandlerType(BEAN_READER_ERROR_HANDLER_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_INVALID_RECORDS:
				setIgnoreInvalidRecords(IGNORE_INVALID_RECORDS_EDEFAULT);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_UNEXPECTED_RECORDS:
				setIgnoreUnexpectedRecords(IGNORE_UNEXPECTED_RECORDS_EDEFAULT);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_UNIDENTIFIED_RECORDS:
				setIgnoreUnidentifiedRecords(IGNORE_UNIDENTIFIED_RECORDS_EDEFAULT);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__MAPPING:
				setMapping(MAPPING_EDEFAULT);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__STREAM_NAME:
				setStreamName(STREAM_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.BEANIO_DATA_FORMAT__UNMARSHAL_SINGLE_OBJECT:
				setUnmarshalSingleObject(UNMARSHAL_SINGLE_OBJECT_EDEFAULT);
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
			case CamelSpringPackage.BEANIO_DATA_FORMAT__BEAN_READER_ERROR_HANDLER_TYPE:
				return BEAN_READER_ERROR_HANDLER_TYPE_EDEFAULT == null ? beanReaderErrorHandlerType != null : !BEAN_READER_ERROR_HANDLER_TYPE_EDEFAULT.equals(beanReaderErrorHandlerType);
			case CamelSpringPackage.BEANIO_DATA_FORMAT__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_INVALID_RECORDS:
				return IGNORE_INVALID_RECORDS_EDEFAULT == null ? ignoreInvalidRecords != null : !IGNORE_INVALID_RECORDS_EDEFAULT.equals(ignoreInvalidRecords);
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_UNEXPECTED_RECORDS:
				return IGNORE_UNEXPECTED_RECORDS_EDEFAULT == null ? ignoreUnexpectedRecords != null : !IGNORE_UNEXPECTED_RECORDS_EDEFAULT.equals(ignoreUnexpectedRecords);
			case CamelSpringPackage.BEANIO_DATA_FORMAT__IGNORE_UNIDENTIFIED_RECORDS:
				return IGNORE_UNIDENTIFIED_RECORDS_EDEFAULT == null ? ignoreUnidentifiedRecords != null : !IGNORE_UNIDENTIFIED_RECORDS_EDEFAULT.equals(ignoreUnidentifiedRecords);
			case CamelSpringPackage.BEANIO_DATA_FORMAT__MAPPING:
				return MAPPING_EDEFAULT == null ? mapping != null : !MAPPING_EDEFAULT.equals(mapping);
			case CamelSpringPackage.BEANIO_DATA_FORMAT__STREAM_NAME:
				return STREAM_NAME_EDEFAULT == null ? streamName != null : !STREAM_NAME_EDEFAULT.equals(streamName);
			case CamelSpringPackage.BEANIO_DATA_FORMAT__UNMARSHAL_SINGLE_OBJECT:
				return UNMARSHAL_SINGLE_OBJECT_EDEFAULT == null ? unmarshalSingleObject != null : !UNMARSHAL_SINGLE_OBJECT_EDEFAULT.equals(unmarshalSingleObject);
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
		result.append(" (beanReaderErrorHandlerType: ");
		result.append(beanReaderErrorHandlerType);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", ignoreInvalidRecords: ");
		result.append(ignoreInvalidRecords);
		result.append(", ignoreUnexpectedRecords: ");
		result.append(ignoreUnexpectedRecords);
		result.append(", ignoreUnidentifiedRecords: ");
		result.append(ignoreUnidentifiedRecords);
		result.append(", mapping: ");
		result.append(mapping);
		result.append(", streamName: ");
		result.append(streamName);
		result.append(", unmarshalSingleObject: ");
		result.append(unmarshalSingleObject);
		result.append(')');
		return result.toString();
	}

} //BeanioDataFormatImpl

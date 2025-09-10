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
import org.eclipse.fennec.camel.camelspring.CborDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cbor Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CborDataFormatImpl#getAllowJmsType <em>Allow Jms Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CborDataFormatImpl#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CborDataFormatImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CborDataFormatImpl#getDisableFeatures <em>Disable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CborDataFormatImpl#getEnableFeatures <em>Enable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CborDataFormatImpl#getObjectMapper <em>Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CborDataFormatImpl#getPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CborDataFormatImpl#getUnmarshalType <em>Unmarshal Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CborDataFormatImpl#getUseDefaultObjectMapper <em>Use Default Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CborDataFormatImpl#getUseList <em>Use List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CborDataFormatImpl extends DataFormatImpl implements CborDataFormat {
	/**
	 * The default value of the '{@link #getAllowJmsType() <em>Allow Jms Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowJmsType()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_JMS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowJmsType() <em>Allow Jms Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowJmsType()
	 * @generated
	 * @ordered
	 */
	protected String allowJmsType = ALLOW_JMS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowUnmarshallType() <em>Allow Unmarshall Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowUnmarshallType()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_UNMARSHALL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowUnmarshallType() <em>Allow Unmarshall Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowUnmarshallType()
	 * @generated
	 * @ordered
	 */
	protected String allowUnmarshallType = ALLOW_UNMARSHALL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected String collectionType = COLLECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisableFeatures() <em>Disable Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final String DISABLE_FEATURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisableFeatures() <em>Disable Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableFeatures()
	 * @generated
	 * @ordered
	 */
	protected String disableFeatures = DISABLE_FEATURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableFeatures() <em>Enable Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_FEATURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableFeatures() <em>Enable Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableFeatures()
	 * @generated
	 * @ordered
	 */
	protected String enableFeatures = ENABLE_FEATURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectMapper() <em>Object Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectMapper()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_MAPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectMapper() <em>Object Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectMapper()
	 * @generated
	 * @ordered
	 */
	protected String objectMapper = OBJECT_MAPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrettyPrint() <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrettyPrint()
	 * @generated
	 * @ordered
	 */
	protected static final String PRETTY_PRINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrettyPrint() <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrettyPrint()
	 * @generated
	 * @ordered
	 */
	protected String prettyPrint = PRETTY_PRINT_EDEFAULT;

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
	 * The default value of the '{@link #getUseDefaultObjectMapper() <em>Use Default Object Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDefaultObjectMapper()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_DEFAULT_OBJECT_MAPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseDefaultObjectMapper() <em>Use Default Object Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDefaultObjectMapper()
	 * @generated
	 * @ordered
	 */
	protected String useDefaultObjectMapper = USE_DEFAULT_OBJECT_MAPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseList() <em>Use List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseList()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseList() <em>Use List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseList()
	 * @generated
	 * @ordered
	 */
	protected String useList = USE_LIST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CborDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCborDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowJmsType() {
		return allowJmsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowJmsType(String newAllowJmsType) {
		String oldAllowJmsType = allowJmsType;
		allowJmsType = newAllowJmsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CBOR_DATA_FORMAT__ALLOW_JMS_TYPE, oldAllowJmsType, allowJmsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowUnmarshallType() {
		return allowUnmarshallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowUnmarshallType(String newAllowUnmarshallType) {
		String oldAllowUnmarshallType = allowUnmarshallType;
		allowUnmarshallType = newAllowUnmarshallType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CBOR_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE, oldAllowUnmarshallType, allowUnmarshallType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCollectionType() {
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionType(String newCollectionType) {
		String oldCollectionType = collectionType;
		collectionType = newCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CBOR_DATA_FORMAT__COLLECTION_TYPE, oldCollectionType, collectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisableFeatures() {
		return disableFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisableFeatures(String newDisableFeatures) {
		String oldDisableFeatures = disableFeatures;
		disableFeatures = newDisableFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CBOR_DATA_FORMAT__DISABLE_FEATURES, oldDisableFeatures, disableFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableFeatures() {
		return enableFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableFeatures(String newEnableFeatures) {
		String oldEnableFeatures = enableFeatures;
		enableFeatures = newEnableFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CBOR_DATA_FORMAT__ENABLE_FEATURES, oldEnableFeatures, enableFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjectMapper() {
		return objectMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectMapper(String newObjectMapper) {
		String oldObjectMapper = objectMapper;
		objectMapper = newObjectMapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CBOR_DATA_FORMAT__OBJECT_MAPPER, oldObjectMapper, objectMapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrettyPrint() {
		return prettyPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrettyPrint(String newPrettyPrint) {
		String oldPrettyPrint = prettyPrint;
		prettyPrint = newPrettyPrint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CBOR_DATA_FORMAT__PRETTY_PRINT, oldPrettyPrint, prettyPrint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CBOR_DATA_FORMAT__UNMARSHAL_TYPE, oldUnmarshalType, unmarshalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseDefaultObjectMapper() {
		return useDefaultObjectMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseDefaultObjectMapper(String newUseDefaultObjectMapper) {
		String oldUseDefaultObjectMapper = useDefaultObjectMapper;
		useDefaultObjectMapper = newUseDefaultObjectMapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CBOR_DATA_FORMAT__USE_DEFAULT_OBJECT_MAPPER, oldUseDefaultObjectMapper, useDefaultObjectMapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseList() {
		return useList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseList(String newUseList) {
		String oldUseList = useList;
		useList = newUseList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CBOR_DATA_FORMAT__USE_LIST, oldUseList, useList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CBOR_DATA_FORMAT__ALLOW_JMS_TYPE:
				return getAllowJmsType();
			case CamelSpringPackage.CBOR_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				return getAllowUnmarshallType();
			case CamelSpringPackage.CBOR_DATA_FORMAT__COLLECTION_TYPE:
				return getCollectionType();
			case CamelSpringPackage.CBOR_DATA_FORMAT__DISABLE_FEATURES:
				return getDisableFeatures();
			case CamelSpringPackage.CBOR_DATA_FORMAT__ENABLE_FEATURES:
				return getEnableFeatures();
			case CamelSpringPackage.CBOR_DATA_FORMAT__OBJECT_MAPPER:
				return getObjectMapper();
			case CamelSpringPackage.CBOR_DATA_FORMAT__PRETTY_PRINT:
				return getPrettyPrint();
			case CamelSpringPackage.CBOR_DATA_FORMAT__UNMARSHAL_TYPE:
				return getUnmarshalType();
			case CamelSpringPackage.CBOR_DATA_FORMAT__USE_DEFAULT_OBJECT_MAPPER:
				return getUseDefaultObjectMapper();
			case CamelSpringPackage.CBOR_DATA_FORMAT__USE_LIST:
				return getUseList();
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
			case CamelSpringPackage.CBOR_DATA_FORMAT__ALLOW_JMS_TYPE:
				setAllowJmsType((String)newValue);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				setAllowUnmarshallType((String)newValue);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__COLLECTION_TYPE:
				setCollectionType((String)newValue);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__DISABLE_FEATURES:
				setDisableFeatures((String)newValue);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__ENABLE_FEATURES:
				setEnableFeatures((String)newValue);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__OBJECT_MAPPER:
				setObjectMapper((String)newValue);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__PRETTY_PRINT:
				setPrettyPrint((String)newValue);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType((String)newValue);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__USE_DEFAULT_OBJECT_MAPPER:
				setUseDefaultObjectMapper((String)newValue);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__USE_LIST:
				setUseList((String)newValue);
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
			case CamelSpringPackage.CBOR_DATA_FORMAT__ALLOW_JMS_TYPE:
				setAllowJmsType(ALLOW_JMS_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				setAllowUnmarshallType(ALLOW_UNMARSHALL_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__COLLECTION_TYPE:
				setCollectionType(COLLECTION_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__DISABLE_FEATURES:
				setDisableFeatures(DISABLE_FEATURES_EDEFAULT);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__ENABLE_FEATURES:
				setEnableFeatures(ENABLE_FEATURES_EDEFAULT);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__OBJECT_MAPPER:
				setObjectMapper(OBJECT_MAPPER_EDEFAULT);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__PRETTY_PRINT:
				setPrettyPrint(PRETTY_PRINT_EDEFAULT);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType(UNMARSHAL_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__USE_DEFAULT_OBJECT_MAPPER:
				setUseDefaultObjectMapper(USE_DEFAULT_OBJECT_MAPPER_EDEFAULT);
				return;
			case CamelSpringPackage.CBOR_DATA_FORMAT__USE_LIST:
				setUseList(USE_LIST_EDEFAULT);
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
			case CamelSpringPackage.CBOR_DATA_FORMAT__ALLOW_JMS_TYPE:
				return ALLOW_JMS_TYPE_EDEFAULT == null ? allowJmsType != null : !ALLOW_JMS_TYPE_EDEFAULT.equals(allowJmsType);
			case CamelSpringPackage.CBOR_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				return ALLOW_UNMARSHALL_TYPE_EDEFAULT == null ? allowUnmarshallType != null : !ALLOW_UNMARSHALL_TYPE_EDEFAULT.equals(allowUnmarshallType);
			case CamelSpringPackage.CBOR_DATA_FORMAT__COLLECTION_TYPE:
				return COLLECTION_TYPE_EDEFAULT == null ? collectionType != null : !COLLECTION_TYPE_EDEFAULT.equals(collectionType);
			case CamelSpringPackage.CBOR_DATA_FORMAT__DISABLE_FEATURES:
				return DISABLE_FEATURES_EDEFAULT == null ? disableFeatures != null : !DISABLE_FEATURES_EDEFAULT.equals(disableFeatures);
			case CamelSpringPackage.CBOR_DATA_FORMAT__ENABLE_FEATURES:
				return ENABLE_FEATURES_EDEFAULT == null ? enableFeatures != null : !ENABLE_FEATURES_EDEFAULT.equals(enableFeatures);
			case CamelSpringPackage.CBOR_DATA_FORMAT__OBJECT_MAPPER:
				return OBJECT_MAPPER_EDEFAULT == null ? objectMapper != null : !OBJECT_MAPPER_EDEFAULT.equals(objectMapper);
			case CamelSpringPackage.CBOR_DATA_FORMAT__PRETTY_PRINT:
				return PRETTY_PRINT_EDEFAULT == null ? prettyPrint != null : !PRETTY_PRINT_EDEFAULT.equals(prettyPrint);
			case CamelSpringPackage.CBOR_DATA_FORMAT__UNMARSHAL_TYPE:
				return UNMARSHAL_TYPE_EDEFAULT == null ? unmarshalType != null : !UNMARSHAL_TYPE_EDEFAULT.equals(unmarshalType);
			case CamelSpringPackage.CBOR_DATA_FORMAT__USE_DEFAULT_OBJECT_MAPPER:
				return USE_DEFAULT_OBJECT_MAPPER_EDEFAULT == null ? useDefaultObjectMapper != null : !USE_DEFAULT_OBJECT_MAPPER_EDEFAULT.equals(useDefaultObjectMapper);
			case CamelSpringPackage.CBOR_DATA_FORMAT__USE_LIST:
				return USE_LIST_EDEFAULT == null ? useList != null : !USE_LIST_EDEFAULT.equals(useList);
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
		result.append(" (allowJmsType: ");
		result.append(allowJmsType);
		result.append(", allowUnmarshallType: ");
		result.append(allowUnmarshallType);
		result.append(", collectionType: ");
		result.append(collectionType);
		result.append(", disableFeatures: ");
		result.append(disableFeatures);
		result.append(", enableFeatures: ");
		result.append(enableFeatures);
		result.append(", objectMapper: ");
		result.append(objectMapper);
		result.append(", prettyPrint: ");
		result.append(prettyPrint);
		result.append(", unmarshalType: ");
		result.append(unmarshalType);
		result.append(", useDefaultObjectMapper: ");
		result.append(useDefaultObjectMapper);
		result.append(", useList: ");
		result.append(useList);
		result.append(')');
		return result.toString();
	}

} //CborDataFormatImpl

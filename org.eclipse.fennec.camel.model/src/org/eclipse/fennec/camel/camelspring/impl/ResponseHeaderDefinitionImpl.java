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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.camel.camelspring.AllowableValuesType;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CollectionFormat;
import org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Header Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseHeaderDefinitionImpl#getAllowableValues <em>Allowable Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseHeaderDefinitionImpl#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseHeaderDefinitionImpl#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseHeaderDefinitionImpl#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseHeaderDefinitionImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseHeaderDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseHeaderDefinitionImpl#getExample <em>Example</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseHeaderDefinitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseHeaderDefinitionImpl extends MinimalEObjectImpl.Container implements ResponseHeaderDefinition {
	/**
	 * The cached value of the '{@link #getAllowableValues() <em>Allowable Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowableValues()
	 * @generated
	 * @ordered
	 */
	protected AllowableValuesType allowableValues;

	/**
	 * The default value of the '{@link #getArrayType() <em>Array Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayType()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRAY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrayType() <em>Array Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayType()
	 * @generated
	 * @ordered
	 */
	protected String arrayType = ARRAY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionFormat() <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionFormat()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionFormat COLLECTION_FORMAT_EDEFAULT = CollectionFormat.CSV;

	/**
	 * The cached value of the '{@link #getCollectionFormat() <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionFormat()
	 * @generated
	 * @ordered
	 */
	protected CollectionFormat collectionFormat = COLLECTION_FORMAT_EDEFAULT;

	/**
	 * This is true if the Collection Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean collectionFormatESet;

	/**
	 * The default value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected String dataFormat = DATA_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected String example = EXAMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseHeaderDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getResponseHeaderDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowableValuesType getAllowableValues() {
		return allowableValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowableValues(AllowableValuesType newAllowableValues, NotificationChain msgs) {
		AllowableValuesType oldAllowableValues = allowableValues;
		allowableValues = newAllowableValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ALLOWABLE_VALUES, oldAllowableValues, newAllowableValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowableValues(AllowableValuesType newAllowableValues) {
		if (newAllowableValues != allowableValues) {
			NotificationChain msgs = null;
			if (allowableValues != null)
				msgs = ((InternalEObject)allowableValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ALLOWABLE_VALUES, null, msgs);
			if (newAllowableValues != null)
				msgs = ((InternalEObject)newAllowableValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ALLOWABLE_VALUES, null, msgs);
			msgs = basicSetAllowableValues(newAllowableValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ALLOWABLE_VALUES, newAllowableValues, newAllowableValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArrayType() {
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrayType(String newArrayType) {
		String oldArrayType = arrayType;
		arrayType = newArrayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ARRAY_TYPE, oldArrayType, arrayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionFormat getCollectionFormat() {
		return collectionFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionFormat(CollectionFormat newCollectionFormat) {
		CollectionFormat oldCollectionFormat = collectionFormat;
		collectionFormat = newCollectionFormat == null ? COLLECTION_FORMAT_EDEFAULT : newCollectionFormat;
		boolean oldCollectionFormatESet = collectionFormatESet;
		collectionFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_HEADER_DEFINITION__COLLECTION_FORMAT, oldCollectionFormat, collectionFormat, !oldCollectionFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCollectionFormat() {
		CollectionFormat oldCollectionFormat = collectionFormat;
		boolean oldCollectionFormatESet = collectionFormatESet;
		collectionFormat = COLLECTION_FORMAT_EDEFAULT;
		collectionFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.RESPONSE_HEADER_DEFINITION__COLLECTION_FORMAT, oldCollectionFormat, COLLECTION_FORMAT_EDEFAULT, oldCollectionFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCollectionFormat() {
		return collectionFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataFormat() {
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFormat(String newDataFormat) {
		String oldDataFormat = dataFormat;
		dataFormat = newDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DATA_FORMAT, oldDataFormat, dataFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_HEADER_DEFINITION__EXAMPLE, oldExample, example));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_HEADER_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ALLOWABLE_VALUES:
				return basicSetAllowableValues(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ALLOWABLE_VALUES:
				return getAllowableValues();
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ARRAY_TYPE:
				return getArrayType();
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__COLLECTION_FORMAT:
				return getCollectionFormat();
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DATA_FORMAT:
				return getDataFormat();
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DATA_TYPE:
				return getDataType();
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DESCRIPTION:
				return getDescription();
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__EXAMPLE:
				return getExample();
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__NAME:
				return getName();
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
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ALLOWABLE_VALUES:
				setAllowableValues((AllowableValuesType)newValue);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ARRAY_TYPE:
				setArrayType((String)newValue);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__COLLECTION_FORMAT:
				setCollectionFormat((CollectionFormat)newValue);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DATA_FORMAT:
				setDataFormat((String)newValue);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__EXAMPLE:
				setExample((String)newValue);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__NAME:
				setName((String)newValue);
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
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ALLOWABLE_VALUES:
				setAllowableValues((AllowableValuesType)null);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ARRAY_TYPE:
				setArrayType(ARRAY_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__COLLECTION_FORMAT:
				unsetCollectionFormat();
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DATA_FORMAT:
				setDataFormat(DATA_FORMAT_EDEFAULT);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
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
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ALLOWABLE_VALUES:
				return allowableValues != null;
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__ARRAY_TYPE:
				return ARRAY_TYPE_EDEFAULT == null ? arrayType != null : !ARRAY_TYPE_EDEFAULT.equals(arrayType);
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__COLLECTION_FORMAT:
				return isSetCollectionFormat();
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DATA_FORMAT:
				return DATA_FORMAT_EDEFAULT == null ? dataFormat != null : !DATA_FORMAT_EDEFAULT.equals(dataFormat);
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (arrayType: ");
		result.append(arrayType);
		result.append(", collectionFormat: ");
		if (collectionFormatESet) result.append(collectionFormat); else result.append("<unset>");
		result.append(", dataFormat: ");
		result.append(dataFormat);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", description: ");
		result.append(description);
		result.append(", example: ");
		result.append(example);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResponseHeaderDefinitionImpl

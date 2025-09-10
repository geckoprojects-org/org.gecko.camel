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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.AllowableValuesType1;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CollectionFormat;
import org.eclipse.fennec.camel.camelspring.ParamDefinition;
import org.eclipse.fennec.camel.camelspring.RestParamType;
import org.eclipse.fennec.camel.camelspring.RestPropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#getAllowableValues <em>Allowable Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ParamDefinitionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamDefinitionImpl extends MinimalEObjectImpl.Container implements ParamDefinition {
	/**
	 * The cached value of the '{@link #getAllowableValues() <em>Allowable Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowableValues()
	 * @generated
	 * @ordered
	 */
	protected AllowableValuesType1 allowableValues;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected EList<RestPropertyDefinition> examples;

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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * This is true if the Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requiredESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RestParamType TYPE_EDEFAULT = RestParamType.BODY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RestParamType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getParamDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowableValuesType1 getAllowableValues() {
		return allowableValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowableValues(AllowableValuesType1 newAllowableValues, NotificationChain msgs) {
		AllowableValuesType1 oldAllowableValues = allowableValues;
		allowableValues = newAllowableValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__ALLOWABLE_VALUES, oldAllowableValues, newAllowableValues);
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
	public void setAllowableValues(AllowableValuesType1 newAllowableValues) {
		if (newAllowableValues != allowableValues) {
			NotificationChain msgs = null;
			if (allowableValues != null)
				msgs = ((InternalEObject)allowableValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.PARAM_DEFINITION__ALLOWABLE_VALUES, null, msgs);
			if (newAllowableValues != null)
				msgs = ((InternalEObject)newAllowableValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.PARAM_DEFINITION__ALLOWABLE_VALUES, null, msgs);
			msgs = basicSetAllowableValues(newAllowableValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__ALLOWABLE_VALUES, newAllowableValues, newAllowableValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestPropertyDefinition> getExamples() {
		if (examples == null) {
			examples = new EObjectContainmentEList<RestPropertyDefinition>(RestPropertyDefinition.class, this, CamelSpringPackage.PARAM_DEFINITION__EXAMPLES);
		}
		return examples;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__ARRAY_TYPE, oldArrayType, arrayType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__COLLECTION_FORMAT, oldCollectionFormat, collectionFormat, !oldCollectionFormatESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.PARAM_DEFINITION__COLLECTION_FORMAT, oldCollectionFormat, COLLECTION_FORMAT_EDEFAULT, oldCollectionFormatESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__DATA_FORMAT, oldDataFormat, dataFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		boolean oldRequiredESet = requiredESet;
		requiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__REQUIRED, oldRequired, required, !oldRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRequired() {
		boolean oldRequired = required;
		boolean oldRequiredESet = requiredESet;
		required = REQUIRED_EDEFAULT;
		requiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.PARAM_DEFINITION__REQUIRED, oldRequired, REQUIRED_EDEFAULT, oldRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRequired() {
		return requiredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestParamType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(RestParamType newType) {
		RestParamType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PARAM_DEFINITION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		RestParamType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.PARAM_DEFINITION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.PARAM_DEFINITION__ALLOWABLE_VALUES:
				return basicSetAllowableValues(null, msgs);
			case CamelSpringPackage.PARAM_DEFINITION__EXAMPLES:
				return ((InternalEList<?>)getExamples()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.PARAM_DEFINITION__ALLOWABLE_VALUES:
				return getAllowableValues();
			case CamelSpringPackage.PARAM_DEFINITION__EXAMPLES:
				return getExamples();
			case CamelSpringPackage.PARAM_DEFINITION__ARRAY_TYPE:
				return getArrayType();
			case CamelSpringPackage.PARAM_DEFINITION__COLLECTION_FORMAT:
				return getCollectionFormat();
			case CamelSpringPackage.PARAM_DEFINITION__DATA_FORMAT:
				return getDataFormat();
			case CamelSpringPackage.PARAM_DEFINITION__DATA_TYPE:
				return getDataType();
			case CamelSpringPackage.PARAM_DEFINITION__DEFAULT_VALUE:
				return getDefaultValue();
			case CamelSpringPackage.PARAM_DEFINITION__DESCRIPTION:
				return getDescription();
			case CamelSpringPackage.PARAM_DEFINITION__NAME:
				return getName();
			case CamelSpringPackage.PARAM_DEFINITION__REQUIRED:
				return isRequired();
			case CamelSpringPackage.PARAM_DEFINITION__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.PARAM_DEFINITION__ALLOWABLE_VALUES:
				setAllowableValues((AllowableValuesType1)newValue);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__EXAMPLES:
				getExamples().clear();
				getExamples().addAll((Collection<? extends RestPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__ARRAY_TYPE:
				setArrayType((String)newValue);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__COLLECTION_FORMAT:
				setCollectionFormat((CollectionFormat)newValue);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__DATA_FORMAT:
				setDataFormat((String)newValue);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__TYPE:
				setType((RestParamType)newValue);
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
			case CamelSpringPackage.PARAM_DEFINITION__ALLOWABLE_VALUES:
				setAllowableValues((AllowableValuesType1)null);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__EXAMPLES:
				getExamples().clear();
				return;
			case CamelSpringPackage.PARAM_DEFINITION__ARRAY_TYPE:
				setArrayType(ARRAY_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__COLLECTION_FORMAT:
				unsetCollectionFormat();
				return;
			case CamelSpringPackage.PARAM_DEFINITION__DATA_FORMAT:
				setDataFormat(DATA_FORMAT_EDEFAULT);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CamelSpringPackage.PARAM_DEFINITION__REQUIRED:
				unsetRequired();
				return;
			case CamelSpringPackage.PARAM_DEFINITION__TYPE:
				unsetType();
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
			case CamelSpringPackage.PARAM_DEFINITION__ALLOWABLE_VALUES:
				return allowableValues != null;
			case CamelSpringPackage.PARAM_DEFINITION__EXAMPLES:
				return examples != null && !examples.isEmpty();
			case CamelSpringPackage.PARAM_DEFINITION__ARRAY_TYPE:
				return ARRAY_TYPE_EDEFAULT == null ? arrayType != null : !ARRAY_TYPE_EDEFAULT.equals(arrayType);
			case CamelSpringPackage.PARAM_DEFINITION__COLLECTION_FORMAT:
				return isSetCollectionFormat();
			case CamelSpringPackage.PARAM_DEFINITION__DATA_FORMAT:
				return DATA_FORMAT_EDEFAULT == null ? dataFormat != null : !DATA_FORMAT_EDEFAULT.equals(dataFormat);
			case CamelSpringPackage.PARAM_DEFINITION__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case CamelSpringPackage.PARAM_DEFINITION__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case CamelSpringPackage.PARAM_DEFINITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CamelSpringPackage.PARAM_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CamelSpringPackage.PARAM_DEFINITION__REQUIRED:
				return isSetRequired();
			case CamelSpringPackage.PARAM_DEFINITION__TYPE:
				return isSetType();
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
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", required: ");
		if (requiredESet) result.append(required); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParamDefinitionImpl

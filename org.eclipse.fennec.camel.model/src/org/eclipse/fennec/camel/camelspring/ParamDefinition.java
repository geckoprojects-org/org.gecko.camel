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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getAllowableValues <em>Allowable Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition()
 * @model extendedMetaData="name='paramDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ParamDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowable Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter list of allowable values (enum).
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowable Values</em>' containment reference.
	 * @see #setAllowableValues(AllowableValuesType1)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_AllowableValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowableValues' namespace='##targetNamespace'"
	 * @generated
	 */
	AllowableValuesType1 getAllowableValues();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getAllowableValues <em>Allowable Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowable Values</em>' containment reference.
	 * @see #getAllowableValues()
	 * @generated
	 */
	void setAllowableValues(AllowableValuesType1 value);

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter examples.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_Examples()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='examples' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestPropertyDefinition> getExamples();

	/**
	 * Returns the value of the '<em><b>Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter array type. Required if data type is array. Describes the type of items in the array. Default value:
	 * string
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array Type</em>' attribute.
	 * @see #setArrayType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_ArrayType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='arrayType'"
	 * @generated
	 */
	String getArrayType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getArrayType <em>Array Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Type</em>' attribute.
	 * @see #getArrayType()
	 * @generated
	 */
	void setArrayType(String value);

	/**
	 * Returns the value of the '<em><b>Collection Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.CollectionFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter collection format. Default value: csv
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection Format</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.CollectionFormat
	 * @see #isSetCollectionFormat()
	 * @see #unsetCollectionFormat()
	 * @see #setCollectionFormat(CollectionFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_CollectionFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='collectionFormat'"
	 * @generated
	 */
	CollectionFormat getCollectionFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getCollectionFormat <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Format</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.CollectionFormat
	 * @see #isSetCollectionFormat()
	 * @see #unsetCollectionFormat()
	 * @see #getCollectionFormat()
	 * @generated
	 */
	void setCollectionFormat(CollectionFormat value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getCollectionFormat <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCollectionFormat()
	 * @see #getCollectionFormat()
	 * @see #setCollectionFormat(CollectionFormat)
	 * @generated
	 */
	void unsetCollectionFormat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getCollectionFormat <em>Collection Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Collection Format</em>' attribute is set.
	 * @see #unsetCollectionFormat()
	 * @see #getCollectionFormat()
	 * @see #setCollectionFormat(CollectionFormat)
	 * @generated
	 */
	boolean isSetCollectionFormat();

	/**
	 * Returns the value of the '<em><b>Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter data format.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Format</em>' attribute.
	 * @see #setDataFormat(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_DataFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dataFormat'"
	 * @generated
	 */
	String getDataFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getDataFormat <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format</em>' attribute.
	 * @see #getDataFormat()
	 * @generated
	 */
	void setDataFormat(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter data type. Default value: string
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_DataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dataType'"
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter default value.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultValue'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter description.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter name.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter required flag. Default value: true
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #isSetRequired()
	 * @see #unsetRequired()
	 * @see #setRequired(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_Required()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='required'"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isSetRequired()
	 * @see #unsetRequired()
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequired()
	 * @see #isRequired()
	 * @see #setRequired(boolean)
	 * @generated
	 */
	void unsetRequired();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#isRequired <em>Required</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Required</em>' attribute is set.
	 * @see #unsetRequired()
	 * @see #isRequired()
	 * @see #setRequired(boolean)
	 * @generated
	 */
	boolean isSetRequired();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.RestParamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter type. Default value: path
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.RestParamType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(RestParamType)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getParamDefinition_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	RestParamType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.RestParamType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(RestParamType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(RestParamType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(RestParamType)
	 * @generated
	 */
	boolean isSetType();

} // ParamDefinition

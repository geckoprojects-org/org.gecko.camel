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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Header Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getAllowableValues <em>Allowable Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getExample <em>Example</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseHeaderDefinition()
 * @model extendedMetaData="name='responseHeaderDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ResponseHeaderDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowable Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parameter list of allowable values.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowable Values</em>' containment reference.
	 * @see #setAllowableValues(AllowableValuesType)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseHeaderDefinition_AllowableValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowableValues' namespace='##targetNamespace'"
	 * @generated
	 */
	AllowableValuesType getAllowableValues();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getAllowableValues <em>Allowable Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowable Values</em>' containment reference.
	 * @see #getAllowableValues()
	 * @generated
	 */
	void setAllowableValues(AllowableValuesType value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseHeaderDefinition_ArrayType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='arrayType'"
	 * @generated
	 */
	String getArrayType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getArrayType <em>Array Type</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseHeaderDefinition_CollectionFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='collectionFormat'"
	 * @generated
	 */
	CollectionFormat getCollectionFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getCollectionFormat <em>Collection Format</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getCollectionFormat <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCollectionFormat()
	 * @see #getCollectionFormat()
	 * @see #setCollectionFormat(CollectionFormat)
	 * @generated
	 */
	void unsetCollectionFormat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getCollectionFormat <em>Collection Format</em>}' attribute is set.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseHeaderDefinition_DataFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dataFormat'"
	 * @generated
	 */
	String getDataFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getDataFormat <em>Data Format</em>}' attribute.
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
	 * Sets the header data type. Default value: string
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseHeaderDefinition_DataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dataType'"
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Description of the parameter.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseHeaderDefinition_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the example.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseHeaderDefinition_Example()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='example'"
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of the parameter. This option is mandatory.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseHeaderDefinition_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ResponseHeaderDefinition

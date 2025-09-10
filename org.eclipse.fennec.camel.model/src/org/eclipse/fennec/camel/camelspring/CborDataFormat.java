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
 * A representation of the model object '<em><b>Cbor Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getAllowJmsType <em>Allow Jms Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getDisableFeatures <em>Disable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getEnableFeatures <em>Enable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getObjectMapper <em>Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getUnmarshalType <em>Unmarshal Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getUseDefaultObjectMapper <em>Use Default Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getUseList <em>Use List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat()
 * @model extendedMetaData="name='cborDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface CborDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Allow Jms Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Used for JMS users to allow the JMSType header from the JMS spec to specify a FQN classname to use to unmarshal to.
	 * Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Jms Type</em>' attribute.
	 * @see #setAllowJmsType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat_AllowJmsType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowJmsType'"
	 * @generated
	 */
	String getAllowJmsType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getAllowJmsType <em>Allow Jms Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Jms Type</em>' attribute.
	 * @see #getAllowJmsType()
	 * @generated
	 */
	void setAllowJmsType(String value);

	/**
	 * Returns the value of the '<em><b>Allow Unmarshall Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If enabled then Jackson CBOR is allowed to attempt to use the CamelCBORUnmarshalType header during the unmarshalling.
	 * This should only be enabled when desired to be used. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Unmarshall Type</em>' attribute.
	 * @see #setAllowUnmarshallType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat_AllowUnmarshallType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowUnmarshallType'"
	 * @generated
	 */
	String getAllowUnmarshallType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Unmarshall Type</em>' attribute.
	 * @see #getAllowUnmarshallType()
	 * @generated
	 */
	void setAllowUnmarshallType(String value);

	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to a custom collection type to lookup in the registry to use. This option should rarely be used, but allows to
	 * use different collection types than java.util.Collection based as default.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see #setCollectionType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat_CollectionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='collectionType'"
	 * @generated
	 */
	String getCollectionType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(String value);

	/**
	 * Returns the value of the '<em><b>Disable Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set of features to disable on the Jackson com.fasterxml.jackson.databind.ObjectMapper. The features should be a name
	 * that matches a enum from com.fasterxml.jackson.databind.SerializationFeature,
	 * com.fasterxml.jackson.databind.DeserializationFeature, or com.fasterxml.jackson.databind.MapperFeature Multiple features
	 * can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disable Features</em>' attribute.
	 * @see #setDisableFeatures(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat_DisableFeatures()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='disableFeatures'"
	 * @generated
	 */
	String getDisableFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getDisableFeatures <em>Disable Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Features</em>' attribute.
	 * @see #getDisableFeatures()
	 * @generated
	 */
	void setDisableFeatures(String value);

	/**
	 * Returns the value of the '<em><b>Enable Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set of features to enable on the Jackson com.fasterxml.jackson.databind.ObjectMapper. The features should be a name that
	 * matches a enum from com.fasterxml.jackson.databind.SerializationFeature,
	 * com.fasterxml.jackson.databind.DeserializationFeature, or com.fasterxml.jackson.databind.MapperFeature Multiple features
	 * can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Features</em>' attribute.
	 * @see #setEnableFeatures(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat_EnableFeatures()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableFeatures'"
	 * @generated
	 */
	String getEnableFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getEnableFeatures <em>Enable Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Features</em>' attribute.
	 * @see #getEnableFeatures()
	 * @generated
	 */
	void setEnableFeatures(String value);

	/**
	 * Returns the value of the '<em><b>Object Mapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Lookup and use the existing CBOR ObjectMapper with the given id when using Jackson.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Mapper</em>' attribute.
	 * @see #setObjectMapper(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat_ObjectMapper()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='objectMapper'"
	 * @generated
	 */
	String getObjectMapper();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getObjectMapper <em>Object Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Mapper</em>' attribute.
	 * @see #getObjectMapper()
	 * @generated
	 */
	void setObjectMapper(String value);

	/**
	 * Returns the value of the '<em><b>Pretty Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To enable pretty printing output nicely formatted. Is by default false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pretty Print</em>' attribute.
	 * @see #setPrettyPrint(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat_PrettyPrint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='prettyPrint'"
	 * @generated
	 */
	String getPrettyPrint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getPrettyPrint <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pretty Print</em>' attribute.
	 * @see #getPrettyPrint()
	 * @generated
	 */
	void setPrettyPrint(String value);

	/**
	 * Returns the value of the '<em><b>Unmarshal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Class name of the java type to use when unmarshalling.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unmarshal Type</em>' attribute.
	 * @see #setUnmarshalType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat_UnmarshalType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unmarshalType'"
	 * @generated
	 */
	String getUnmarshalType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getUnmarshalType <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmarshal Type</em>' attribute.
	 * @see #getUnmarshalType()
	 * @generated
	 */
	void setUnmarshalType(String value);

	/**
	 * Returns the value of the '<em><b>Use Default Object Mapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to lookup and use default Jackson CBOR ObjectMapper from the registry. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Default Object Mapper</em>' attribute.
	 * @see #setUseDefaultObjectMapper(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat_UseDefaultObjectMapper()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useDefaultObjectMapper'"
	 * @generated
	 */
	String getUseDefaultObjectMapper();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getUseDefaultObjectMapper <em>Use Default Object Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Default Object Mapper</em>' attribute.
	 * @see #getUseDefaultObjectMapper()
	 * @generated
	 */
	void setUseDefaultObjectMapper(String value);

	/**
	 * Returns the value of the '<em><b>Use List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To unmarshal to a List of Map or a List of Pojo. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use List</em>' attribute.
	 * @see #setUseList(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCborDataFormat_UseList()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useList'"
	 * @generated
	 */
	String getUseList();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat#getUseList <em>Use List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use List</em>' attribute.
	 * @see #getUseList()
	 * @generated
	 */
	void setUseList(String value);

} // CborDataFormat

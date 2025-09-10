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
 * A representation of the model object '<em><b>Jackson XML Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getAllowJmsType <em>Allow Jms Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getDisableFeatures <em>Disable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getEnableFeatures <em>Enable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getEnableJaxbAnnotationModule <em>Enable Jaxb Annotation Module</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getJsonView <em>Json View</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getMaxStringLength <em>Max String Length</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getModuleClassNames <em>Module Class Names</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getModuleRefs <em>Module Refs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getUnmarshalType <em>Unmarshal Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getUseList <em>Use List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getXmlMapper <em>Xml Mapper</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat()
 * @model extendedMetaData="name='jacksonXMLDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface JacksonXMLDataFormat extends DataFormat {
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_AllowJmsType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowJmsType'"
	 * @generated
	 */
	String getAllowJmsType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getAllowJmsType <em>Allow Jms Type</em>}' attribute.
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
	 * If enabled then Jackson is allowed to attempt to use the CamelJacksonUnmarshalType header during the unmarshalling. This
	 * should only be enabled when desired to be used. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Unmarshall Type</em>' attribute.
	 * @see #setAllowUnmarshallType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_AllowUnmarshallType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowUnmarshallType'"
	 * @generated
	 */
	String getAllowUnmarshallType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_CollectionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='collectionType'"
	 * @generated
	 */
	String getCollectionType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(String value);

	/**
	 * Returns the value of the '<em><b>Content Type Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the data format should set the Content-Type header with the type from the data format. For example
	 * application/xml for data formats marshalling to XML, or application/json for data formats marshalling to JSON. Default
	 * value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type Header</em>' attribute.
	 * @see #setContentTypeHeader(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_ContentTypeHeader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contentTypeHeader'"
	 * @generated
	 */
	String getContentTypeHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getContentTypeHeader <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type Header</em>' attribute.
	 * @see #getContentTypeHeader()
	 * @generated
	 */
	void setContentTypeHeader(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_DisableFeatures()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='disableFeatures'"
	 * @generated
	 */
	String getDisableFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getDisableFeatures <em>Disable Features</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_EnableFeatures()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableFeatures'"
	 * @generated
	 */
	String getEnableFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getEnableFeatures <em>Enable Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Features</em>' attribute.
	 * @see #getEnableFeatures()
	 * @generated
	 */
	void setEnableFeatures(String value);

	/**
	 * Returns the value of the '<em><b>Enable Jaxb Annotation Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to enable the JAXB annotations module when using jackson. When enabled then JAXB annotations can be used by
	 * Jackson. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Jaxb Annotation Module</em>' attribute.
	 * @see #setEnableJaxbAnnotationModule(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_EnableJaxbAnnotationModule()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableJaxbAnnotationModule'"
	 * @generated
	 */
	String getEnableJaxbAnnotationModule();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getEnableJaxbAnnotationModule <em>Enable Jaxb Annotation Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Jaxb Annotation Module</em>' attribute.
	 * @see #getEnableJaxbAnnotationModule()
	 * @generated
	 */
	void setEnableJaxbAnnotationModule(String value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If you want to marshal a pojo to JSON, and the pojo has some fields with null values. And you want to skip these null
	 * values, you can set this option to NON_NULL.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' attribute.
	 * @see #setInclude(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_Include()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='include'"
	 * @generated
	 */
	String getInclude();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getInclude <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' attribute.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(String value);

	/**
	 * Returns the value of the '<em><b>Json View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * When marshalling a POJO to JSON you might want to exclude certain fields from the JSON output. With Jackson you can use
	 * JSON views to accomplish this. This option is to refer to the class which has JsonView annotations.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Json View</em>' attribute.
	 * @see #setJsonView(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_JsonView()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='jsonView'"
	 * @generated
	 */
	String getJsonView();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getJsonView <em>Json View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json View</em>' attribute.
	 * @see #getJsonView()
	 * @generated
	 */
	void setJsonView(String value);

	/**
	 * Returns the value of the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum string length (in chars or bytes, depending on input context). The default is 20,000,000. This limit is
	 * not exact, the limit is applied when we increase internal buffer sizes and an exception will happen at sizes greater
	 * than this limit. Some text values that are a little bigger than the limit may be treated as valid but no text values
	 * with sizes less than or equal to this limit will be treated as invalid.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max String Length</em>' attribute.
	 * @see #setMaxStringLength(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_MaxStringLength()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxStringLength'"
	 * @generated
	 */
	String getMaxStringLength();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getMaxStringLength <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max String Length</em>' attribute.
	 * @see #getMaxStringLength()
	 * @generated
	 */
	void setMaxStringLength(String value);

	/**
	 * Returns the value of the '<em><b>Module Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use custom Jackson modules com.fasterxml.jackson.databind.Module specified as a String with FQN class names. Multiple
	 * classes can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Class Names</em>' attribute.
	 * @see #setModuleClassNames(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_ModuleClassNames()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='moduleClassNames'"
	 * @generated
	 */
	String getModuleClassNames();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getModuleClassNames <em>Module Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Class Names</em>' attribute.
	 * @see #getModuleClassNames()
	 * @generated
	 */
	void setModuleClassNames(String value);

	/**
	 * Returns the value of the '<em><b>Module Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use custom Jackson modules referred from the Camel registry. Multiple modules can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Refs</em>' attribute.
	 * @see #setModuleRefs(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_ModuleRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='moduleRefs'"
	 * @generated
	 */
	String getModuleRefs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getModuleRefs <em>Module Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Refs</em>' attribute.
	 * @see #getModuleRefs()
	 * @generated
	 */
	void setModuleRefs(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_PrettyPrint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='prettyPrint'"
	 * @generated
	 */
	String getPrettyPrint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getPrettyPrint <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pretty Print</em>' attribute.
	 * @see #getPrettyPrint()
	 * @generated
	 */
	void setPrettyPrint(String value);

	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set then Jackson will use the Timezone when marshalling/unmarshalling.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timezone</em>' attribute.
	 * @see #setTimezone(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_Timezone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timezone'"
	 * @generated
	 */
	String getTimezone();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getTimezone <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone</em>' attribute.
	 * @see #getTimezone()
	 * @generated
	 */
	void setTimezone(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_UnmarshalType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unmarshalType'"
	 * @generated
	 */
	String getUnmarshalType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getUnmarshalType <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmarshal Type</em>' attribute.
	 * @see #getUnmarshalType()
	 * @generated
	 */
	void setUnmarshalType(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_UseList()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useList'"
	 * @generated
	 */
	String getUseList();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getUseList <em>Use List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use List</em>' attribute.
	 * @see #getUseList()
	 * @generated
	 */
	void setUseList(String value);

	/**
	 * Returns the value of the '<em><b>Xml Mapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Lookup and use the existing XmlMapper with the given id.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml Mapper</em>' attribute.
	 * @see #setXmlMapper(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJacksonXMLDataFormat_XmlMapper()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xmlMapper'"
	 * @generated
	 */
	String getXmlMapper();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat#getXmlMapper <em>Xml Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Mapper</em>' attribute.
	 * @see #getXmlMapper()
	 * @generated
	 */
	void setXmlMapper(String value);

} // JacksonXMLDataFormat

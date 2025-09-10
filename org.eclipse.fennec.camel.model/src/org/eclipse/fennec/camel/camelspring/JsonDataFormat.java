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
 * A representation of the model object '<em><b>Json Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getAllowJmsType <em>Allow Jms Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getAutoDiscoverObjectMapper <em>Auto Discover Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getAutoDiscoverSchemaResolver <em>Auto Discover Schema Resolver</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getCombineUnicodeSurrogates <em>Combine Unicode Surrogates</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getDateFormatPattern <em>Date Format Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getDisableFeatures <em>Disable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getEnableFeatures <em>Enable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getJsonView <em>Json View</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getMaxStringLength <em>Max String Length</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getModuleClassNames <em>Module Class Names</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getModuleRefs <em>Module Refs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getNamingStrategy <em>Naming Strategy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getObjectMapper <em>Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getSchemaResolver <em>Schema Resolver</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getUnmarshalType <em>Unmarshal Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getUseDefaultObjectMapper <em>Use Default Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getUseList <em>Use List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat()
 * @model extendedMetaData="name='jsonDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface JsonDataFormat extends DataFormat {
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_AllowJmsType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowJmsType'"
	 * @generated
	 */
	String getAllowJmsType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getAllowJmsType <em>Allow Jms Type</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_AllowUnmarshallType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowUnmarshallType'"
	 * @generated
	 */
	String getAllowUnmarshallType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Unmarshall Type</em>' attribute.
	 * @see #getAllowUnmarshallType()
	 * @generated
	 */
	void setAllowUnmarshallType(String value);

	/**
	 * Returns the value of the '<em><b>Auto Discover Object Mapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set to true then Jackson will look for an objectMapper to use from the registry. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Discover Object Mapper</em>' attribute.
	 * @see #setAutoDiscoverObjectMapper(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_AutoDiscoverObjectMapper()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autoDiscoverObjectMapper'"
	 * @generated
	 */
	String getAutoDiscoverObjectMapper();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getAutoDiscoverObjectMapper <em>Auto Discover Object Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Discover Object Mapper</em>' attribute.
	 * @see #getAutoDiscoverObjectMapper()
	 * @generated
	 */
	void setAutoDiscoverObjectMapper(String value);

	/**
	 * Returns the value of the '<em><b>Auto Discover Schema Resolver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * When not disabled, the SchemaResolver will be looked up into the registry. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Discover Schema Resolver</em>' attribute.
	 * @see #setAutoDiscoverSchemaResolver(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_AutoDiscoverSchemaResolver()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autoDiscoverSchemaResolver'"
	 * @generated
	 */
	String getAutoDiscoverSchemaResolver();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getAutoDiscoverSchemaResolver <em>Auto Discover Schema Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Discover Schema Resolver</em>' attribute.
	 * @see #getAutoDiscoverSchemaResolver()
	 * @generated
	 */
	void setAutoDiscoverSchemaResolver(String value);

	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to a custom collection type to lookup in the registry to use. This option should rarely be used, but allows using
	 * different collection types than java.util.Collection based as default.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see #setCollectionType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_CollectionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='collectionType'"
	 * @generated
	 */
	String getCollectionType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(String value);

	/**
	 * Returns the value of the '<em><b>Combine Unicode Surrogates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Force generator that outputs JSON content to combine surrogate pairs (if any) into 4-byte characters. This should be
	 * preferred when using 4-byte characters such as Japanese. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combine Unicode Surrogates</em>' attribute.
	 * @see #setCombineUnicodeSurrogates(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_CombineUnicodeSurrogates()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='combineUnicodeSurrogates'"
	 * @generated
	 */
	String getCombineUnicodeSurrogates();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getCombineUnicodeSurrogates <em>Combine Unicode Surrogates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combine Unicode Surrogates</em>' attribute.
	 * @see #getCombineUnicodeSurrogates()
	 * @generated
	 */
	void setCombineUnicodeSurrogates(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_ContentTypeHeader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contentTypeHeader'"
	 * @generated
	 */
	String getContentTypeHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getContentTypeHeader <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type Header</em>' attribute.
	 * @see #getContentTypeHeader()
	 * @generated
	 */
	void setContentTypeHeader(String value);

	/**
	 * Returns the value of the '<em><b>Date Format Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure the date format while marshall or unmarshall Date fields in JSON using Gson.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Format Pattern</em>' attribute.
	 * @see #setDateFormatPattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_DateFormatPattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dateFormatPattern'"
	 * @generated
	 */
	String getDateFormatPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getDateFormatPattern <em>Date Format Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format Pattern</em>' attribute.
	 * @see #getDateFormatPattern()
	 * @generated
	 */
	void setDateFormatPattern(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_DisableFeatures()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='disableFeatures'"
	 * @generated
	 */
	String getDisableFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getDisableFeatures <em>Disable Features</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_EnableFeatures()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableFeatures'"
	 * @generated
	 */
	String getEnableFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getEnableFeatures <em>Enable Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Features</em>' attribute.
	 * @see #getEnableFeatures()
	 * @generated
	 */
	void setEnableFeatures(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_Include()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='include'"
	 * @generated
	 */
	String getInclude();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getInclude <em>Include</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_JsonView()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='jsonView'"
	 * @generated
	 */
	String getJsonView();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getJsonView <em>Json View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json View</em>' attribute.
	 * @see #getJsonView()
	 * @generated
	 */
	void setJsonView(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.JsonLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Which json library to use. Default value: Jackson
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.JsonLibrary
	 * @see #isSetLibrary()
	 * @see #unsetLibrary()
	 * @see #setLibrary(JsonLibrary)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_Library()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='library'"
	 * @generated
	 */
	JsonLibrary getLibrary();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.JsonLibrary
	 * @see #isSetLibrary()
	 * @see #unsetLibrary()
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(JsonLibrary value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLibrary()
	 * @see #getLibrary()
	 * @see #setLibrary(JsonLibrary)
	 * @generated
	 */
	void unsetLibrary();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getLibrary <em>Library</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Library</em>' attribute is set.
	 * @see #unsetLibrary()
	 * @see #getLibrary()
	 * @see #setLibrary(JsonLibrary)
	 * @generated
	 */
	boolean isSetLibrary();

	/**
	 * Returns the value of the '<em><b>Max String Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Jackson. Sets the maximum string length (in chars or bytes, depending on input context). The default is 20,000,000. This
	 * limit is not exact, the limit is applied when we increase internal buffer sizes and an exception will happen at sizes
	 * greater than this limit. Some text values that are a little bigger than the limit may be treated as valid but no text
	 * values with sizes less than or equal to this limit will be treated as invalid.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max String Length</em>' attribute.
	 * @see #setMaxStringLength(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_MaxStringLength()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxStringLength'"
	 * @generated
	 */
	String getMaxStringLength();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getMaxStringLength <em>Max String Length</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_ModuleClassNames()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='moduleClassNames'"
	 * @generated
	 */
	String getModuleClassNames();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getModuleClassNames <em>Module Class Names</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_ModuleRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='moduleRefs'"
	 * @generated
	 */
	String getModuleRefs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getModuleRefs <em>Module Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Refs</em>' attribute.
	 * @see #getModuleRefs()
	 * @generated
	 */
	void setModuleRefs(String value);

	/**
	 * Returns the value of the '<em><b>Naming Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set then Jackson will use the the defined Property Naming Strategy.Possible values are: LOWER_CAMEL_CASE,
	 * LOWER_DOT_CASE, LOWER_CASE, KEBAB_CASE, SNAKE_CASE and UPPER_CAMEL_CASE.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Naming Strategy</em>' attribute.
	 * @see #setNamingStrategy(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_NamingStrategy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='namingStrategy'"
	 * @generated
	 */
	String getNamingStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getNamingStrategy <em>Naming Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming Strategy</em>' attribute.
	 * @see #getNamingStrategy()
	 * @generated
	 */
	void setNamingStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Object Mapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Lookup and use the existing ObjectMapper with the given id when using Jackson.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Mapper</em>' attribute.
	 * @see #setObjectMapper(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_ObjectMapper()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='objectMapper'"
	 * @generated
	 */
	String getObjectMapper();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getObjectMapper <em>Object Mapper</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_PrettyPrint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='prettyPrint'"
	 * @generated
	 */
	String getPrettyPrint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getPrettyPrint <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pretty Print</em>' attribute.
	 * @see #getPrettyPrint()
	 * @generated
	 */
	void setPrettyPrint(String value);

	/**
	 * Returns the value of the '<em><b>Schema Resolver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Optional schema resolver used to lookup schemas for the data in transit.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Resolver</em>' attribute.
	 * @see #setSchemaResolver(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_SchemaResolver()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaResolver'"
	 * @generated
	 */
	String getSchemaResolver();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getSchemaResolver <em>Schema Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Resolver</em>' attribute.
	 * @see #getSchemaResolver()
	 * @generated
	 */
	void setSchemaResolver(String value);

	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set then Jackson will use the Timezone when marshalling/unmarshalling. This option will have no effect on the others
	 * Json DataFormat, like gson and fastjson.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timezone</em>' attribute.
	 * @see #setTimezone(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_Timezone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timezone'"
	 * @generated
	 */
	String getTimezone();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getTimezone <em>Timezone</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_UnmarshalType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unmarshalType'"
	 * @generated
	 */
	String getUnmarshalType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getUnmarshalType <em>Unmarshal Type</em>}' attribute.
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
	 * Whether to lookup and use default Jackson ObjectMapper from the registry. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Default Object Mapper</em>' attribute.
	 * @see #setUseDefaultObjectMapper(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_UseDefaultObjectMapper()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useDefaultObjectMapper'"
	 * @generated
	 */
	String getUseDefaultObjectMapper();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getUseDefaultObjectMapper <em>Use Default Object Mapper</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonDataFormat_UseList()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useList'"
	 * @generated
	 */
	String getUseList();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat#getUseList <em>Use List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use List</em>' attribute.
	 * @see #getUseList()
	 * @generated
	 */
	void setUseList(String value);

} // JsonDataFormat

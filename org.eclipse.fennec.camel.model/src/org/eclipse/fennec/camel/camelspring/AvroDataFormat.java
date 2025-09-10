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
 * A representation of the model object '<em><b>Avro Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getAllowJmsType <em>Allow Jms Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getAutoDiscoverObjectMapper <em>Auto Discover Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getAutoDiscoverSchemaResolver <em>Auto Discover Schema Resolver</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getDisableFeatures <em>Disable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getEnableFeatures <em>Enable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getJsonView <em>Json View</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getModuleClassNames <em>Module Class Names</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getModuleRefs <em>Module Refs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getObjectMapper <em>Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getSchemaResolver <em>Schema Resolver</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getUnmarshalType <em>Unmarshal Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getUseDefaultObjectMapper <em>Use Default Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getUseList <em>Use List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat()
 * @model extendedMetaData="name='avroDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface AvroDataFormat extends DataFormat {
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_AllowJmsType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowJmsType'"
	 * @generated
	 */
	String getAllowJmsType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getAllowJmsType <em>Allow Jms Type</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_AllowUnmarshallType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowUnmarshallType'"
	 * @generated
	 */
	String getAllowUnmarshallType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}' attribute.
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
	 * If set to true then Jackson will lookup for an objectMapper into the registry. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Discover Object Mapper</em>' attribute.
	 * @see #setAutoDiscoverObjectMapper(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_AutoDiscoverObjectMapper()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autoDiscoverObjectMapper'"
	 * @generated
	 */
	String getAutoDiscoverObjectMapper();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getAutoDiscoverObjectMapper <em>Auto Discover Object Mapper</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_AutoDiscoverSchemaResolver()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autoDiscoverSchemaResolver'"
	 * @generated
	 */
	String getAutoDiscoverSchemaResolver();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getAutoDiscoverSchemaResolver <em>Auto Discover Schema Resolver</em>}' attribute.
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
	 * Refers to a custom collection type to lookup in the registry to use. This option should rarely be used, but allows to
	 * use different collection types than java.util.Collection based as default.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see #setCollectionType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_CollectionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='collectionType'"
	 * @generated
	 */
	String getCollectionType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getCollectionType <em>Collection Type</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_ContentTypeHeader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contentTypeHeader'"
	 * @generated
	 */
	String getContentTypeHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getContentTypeHeader <em>Content Type Header</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_DisableFeatures()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='disableFeatures'"
	 * @generated
	 */
	String getDisableFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getDisableFeatures <em>Disable Features</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_EnableFeatures()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableFeatures'"
	 * @generated
	 */
	String getEnableFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getEnableFeatures <em>Enable Features</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_Include()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='include'"
	 * @generated
	 */
	String getInclude();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getInclude <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' attribute.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(String value);

	/**
	 * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Class name to use for marshal and unmarshalling.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Class Name</em>' attribute.
	 * @see #setInstanceClassName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_InstanceClassName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='instanceClassName'"
	 * @generated
	 */
	String getInstanceClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getInstanceClassName <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class Name</em>' attribute.
	 * @see #getInstanceClassName()
	 * @generated
	 */
	void setInstanceClassName(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_JsonView()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='jsonView'"
	 * @generated
	 */
	String getJsonView();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getJsonView <em>Json View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json View</em>' attribute.
	 * @see #getJsonView()
	 * @generated
	 */
	void setJsonView(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.AvroLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Which Avro library to use. Default value: avroJackson
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.AvroLibrary
	 * @see #isSetLibrary()
	 * @see #unsetLibrary()
	 * @see #setLibrary(AvroLibrary)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_Library()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='library'"
	 * @generated
	 */
	AvroLibrary getLibrary();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.AvroLibrary
	 * @see #isSetLibrary()
	 * @see #unsetLibrary()
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(AvroLibrary value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLibrary()
	 * @see #getLibrary()
	 * @see #setLibrary(AvroLibrary)
	 * @generated
	 */
	void unsetLibrary();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getLibrary <em>Library</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Library</em>' attribute is set.
	 * @see #unsetLibrary()
	 * @see #getLibrary()
	 * @see #setLibrary(AvroLibrary)
	 * @generated
	 */
	boolean isSetLibrary();

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_ModuleClassNames()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='moduleClassNames'"
	 * @generated
	 */
	String getModuleClassNames();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getModuleClassNames <em>Module Class Names</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_ModuleRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='moduleRefs'"
	 * @generated
	 */
	String getModuleRefs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getModuleRefs <em>Module Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Refs</em>' attribute.
	 * @see #getModuleRefs()
	 * @generated
	 */
	void setModuleRefs(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_ObjectMapper()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='objectMapper'"
	 * @generated
	 */
	String getObjectMapper();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getObjectMapper <em>Object Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Mapper</em>' attribute.
	 * @see #getObjectMapper()
	 * @generated
	 */
	void setObjectMapper(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_SchemaResolver()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaResolver'"
	 * @generated
	 */
	String getSchemaResolver();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getSchemaResolver <em>Schema Resolver</em>}' attribute.
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
	 * If set then Jackson will use the Timezone when marshalling/unmarshalling.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timezone</em>' attribute.
	 * @see #setTimezone(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_Timezone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timezone'"
	 * @generated
	 */
	String getTimezone();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getTimezone <em>Timezone</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_UnmarshalType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unmarshalType'"
	 * @generated
	 */
	String getUnmarshalType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getUnmarshalType <em>Unmarshal Type</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_UseDefaultObjectMapper()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useDefaultObjectMapper'"
	 * @generated
	 */
	String getUseDefaultObjectMapper();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getUseDefaultObjectMapper <em>Use Default Object Mapper</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAvroDataFormat_UseList()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useList'"
	 * @generated
	 */
	String getUseList();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat#getUseList <em>Use List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use List</em>' attribute.
	 * @see #getUseList()
	 * @generated
	 */
	void setUseList(String value);

} // AvroDataFormat

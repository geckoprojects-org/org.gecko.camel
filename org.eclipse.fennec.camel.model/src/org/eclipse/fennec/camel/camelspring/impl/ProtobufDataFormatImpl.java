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
import org.eclipse.fennec.camel.camelspring.ProtobufDataFormat;
import org.eclipse.fennec.camel.camelspring.ProtobufLibrary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protobuf Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getAllowJmsType <em>Allow Jms Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getAutoDiscoverObjectMapper <em>Auto Discover Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getAutoDiscoverSchemaResolver <em>Auto Discover Schema Resolver</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getContentTypeFormat <em>Content Type Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getDisableFeatures <em>Disable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getEnableFeatures <em>Enable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getJsonView <em>Json View</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getModuleClassNames <em>Module Class Names</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getModuleRefs <em>Module Refs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getObjectMapper <em>Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getSchemaResolver <em>Schema Resolver</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getUnmarshalType <em>Unmarshal Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getUseDefaultObjectMapper <em>Use Default Object Mapper</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ProtobufDataFormatImpl#getUseList <em>Use List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtobufDataFormatImpl extends DataFormatImpl implements ProtobufDataFormat {
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
	 * The default value of the '{@link #getAutoDiscoverObjectMapper() <em>Auto Discover Object Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoDiscoverObjectMapper()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_DISCOVER_OBJECT_MAPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoDiscoverObjectMapper() <em>Auto Discover Object Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoDiscoverObjectMapper()
	 * @generated
	 * @ordered
	 */
	protected String autoDiscoverObjectMapper = AUTO_DISCOVER_OBJECT_MAPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoDiscoverSchemaResolver() <em>Auto Discover Schema Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoDiscoverSchemaResolver()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_DISCOVER_SCHEMA_RESOLVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoDiscoverSchemaResolver() <em>Auto Discover Schema Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoDiscoverSchemaResolver()
	 * @generated
	 * @ordered
	 */
	protected String autoDiscoverSchemaResolver = AUTO_DISCOVER_SCHEMA_RESOLVER_EDEFAULT;

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
	 * The default value of the '{@link #getContentTypeFormat() <em>Content Type Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentTypeFormat() <em>Content Type Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeFormat()
	 * @generated
	 * @ordered
	 */
	protected String contentTypeFormat = CONTENT_TYPE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentTypeHeader() <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentTypeHeader() <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected String contentTypeHeader = CONTENT_TYPE_HEADER_EDEFAULT;

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
	 * The default value of the '{@link #getInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected String include = INCLUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceClass() <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceClass() <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected String instanceClass = INSTANCE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJsonView() <em>Json View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonView()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_VIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJsonView() <em>Json View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonView()
	 * @generated
	 * @ordered
	 */
	protected String jsonView = JSON_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final ProtobufLibrary LIBRARY_EDEFAULT = ProtobufLibrary.GOOGLE_PROTOBUF;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected ProtobufLibrary library = LIBRARY_EDEFAULT;

	/**
	 * This is true if the Library attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean libraryESet;

	/**
	 * The default value of the '{@link #getModuleClassNames() <em>Module Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleClassNames()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_CLASS_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleClassNames() <em>Module Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleClassNames()
	 * @generated
	 * @ordered
	 */
	protected String moduleClassNames = MODULE_CLASS_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleRefs() <em>Module Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleRefs()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_REFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleRefs() <em>Module Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleRefs()
	 * @generated
	 * @ordered
	 */
	protected String moduleRefs = MODULE_REFS_EDEFAULT;

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
	 * The default value of the '{@link #getSchemaResolver() <em>Schema Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaResolver()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_RESOLVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaResolver() <em>Schema Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaResolver()
	 * @generated
	 * @ordered
	 */
	protected String schemaResolver = SCHEMA_RESOLVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected String timezone = TIMEZONE_EDEFAULT;

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
	protected ProtobufDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getProtobufDataFormat();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__ALLOW_JMS_TYPE, oldAllowJmsType, allowJmsType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE, oldAllowUnmarshallType, allowUnmarshallType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutoDiscoverObjectMapper() {
		return autoDiscoverObjectMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoDiscoverObjectMapper(String newAutoDiscoverObjectMapper) {
		String oldAutoDiscoverObjectMapper = autoDiscoverObjectMapper;
		autoDiscoverObjectMapper = newAutoDiscoverObjectMapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__AUTO_DISCOVER_OBJECT_MAPPER, oldAutoDiscoverObjectMapper, autoDiscoverObjectMapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutoDiscoverSchemaResolver() {
		return autoDiscoverSchemaResolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoDiscoverSchemaResolver(String newAutoDiscoverSchemaResolver) {
		String oldAutoDiscoverSchemaResolver = autoDiscoverSchemaResolver;
		autoDiscoverSchemaResolver = newAutoDiscoverSchemaResolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__AUTO_DISCOVER_SCHEMA_RESOLVER, oldAutoDiscoverSchemaResolver, autoDiscoverSchemaResolver));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__COLLECTION_TYPE, oldCollectionType, collectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentTypeFormat() {
		return contentTypeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentTypeFormat(String newContentTypeFormat) {
		String oldContentTypeFormat = contentTypeFormat;
		contentTypeFormat = newContentTypeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__CONTENT_TYPE_FORMAT, oldContentTypeFormat, contentTypeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentTypeHeader() {
		return contentTypeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentTypeHeader(String newContentTypeHeader) {
		String oldContentTypeHeader = contentTypeHeader;
		contentTypeHeader = newContentTypeHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__CONTENT_TYPE_HEADER, oldContentTypeHeader, contentTypeHeader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__DISABLE_FEATURES, oldDisableFeatures, disableFeatures));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__ENABLE_FEATURES, oldEnableFeatures, enableFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclude(String newInclude) {
		String oldInclude = include;
		include = newInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__INCLUDE, oldInclude, include));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceClass() {
		return instanceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceClass(String newInstanceClass) {
		String oldInstanceClass = instanceClass;
		instanceClass = newInstanceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__INSTANCE_CLASS, oldInstanceClass, instanceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJsonView() {
		return jsonView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonView(String newJsonView) {
		String oldJsonView = jsonView;
		jsonView = newJsonView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__JSON_VIEW, oldJsonView, jsonView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtobufLibrary getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibrary(ProtobufLibrary newLibrary) {
		ProtobufLibrary oldLibrary = library;
		library = newLibrary == null ? LIBRARY_EDEFAULT : newLibrary;
		boolean oldLibraryESet = libraryESet;
		libraryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__LIBRARY, oldLibrary, library, !oldLibraryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLibrary() {
		ProtobufLibrary oldLibrary = library;
		boolean oldLibraryESet = libraryESet;
		library = LIBRARY_EDEFAULT;
		libraryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__LIBRARY, oldLibrary, LIBRARY_EDEFAULT, oldLibraryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLibrary() {
		return libraryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModuleClassNames() {
		return moduleClassNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleClassNames(String newModuleClassNames) {
		String oldModuleClassNames = moduleClassNames;
		moduleClassNames = newModuleClassNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__MODULE_CLASS_NAMES, oldModuleClassNames, moduleClassNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModuleRefs() {
		return moduleRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleRefs(String newModuleRefs) {
		String oldModuleRefs = moduleRefs;
		moduleRefs = newModuleRefs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__MODULE_REFS, oldModuleRefs, moduleRefs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__OBJECT_MAPPER, oldObjectMapper, objectMapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaResolver() {
		return schemaResolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaResolver(String newSchemaResolver) {
		String oldSchemaResolver = schemaResolver;
		schemaResolver = newSchemaResolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__SCHEMA_RESOLVER, oldSchemaResolver, schemaResolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimezone() {
		return timezone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimezone(String newTimezone) {
		String oldTimezone = timezone;
		timezone = newTimezone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__TIMEZONE, oldTimezone, timezone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__UNMARSHAL_TYPE, oldUnmarshalType, unmarshalType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__USE_DEFAULT_OBJECT_MAPPER, oldUseDefaultObjectMapper, useDefaultObjectMapper));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.PROTOBUF_DATA_FORMAT__USE_LIST, oldUseList, useList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ALLOW_JMS_TYPE:
				return getAllowJmsType();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				return getAllowUnmarshallType();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__AUTO_DISCOVER_OBJECT_MAPPER:
				return getAutoDiscoverObjectMapper();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__AUTO_DISCOVER_SCHEMA_RESOLVER:
				return getAutoDiscoverSchemaResolver();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__COLLECTION_TYPE:
				return getCollectionType();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__CONTENT_TYPE_FORMAT:
				return getContentTypeFormat();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__CONTENT_TYPE_HEADER:
				return getContentTypeHeader();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__DISABLE_FEATURES:
				return getDisableFeatures();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ENABLE_FEATURES:
				return getEnableFeatures();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__INCLUDE:
				return getInclude();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__INSTANCE_CLASS:
				return getInstanceClass();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__JSON_VIEW:
				return getJsonView();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__LIBRARY:
				return getLibrary();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__MODULE_CLASS_NAMES:
				return getModuleClassNames();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__MODULE_REFS:
				return getModuleRefs();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__OBJECT_MAPPER:
				return getObjectMapper();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__SCHEMA_RESOLVER:
				return getSchemaResolver();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__TIMEZONE:
				return getTimezone();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__UNMARSHAL_TYPE:
				return getUnmarshalType();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__USE_DEFAULT_OBJECT_MAPPER:
				return getUseDefaultObjectMapper();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__USE_LIST:
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
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ALLOW_JMS_TYPE:
				setAllowJmsType((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				setAllowUnmarshallType((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__AUTO_DISCOVER_OBJECT_MAPPER:
				setAutoDiscoverObjectMapper((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__AUTO_DISCOVER_SCHEMA_RESOLVER:
				setAutoDiscoverSchemaResolver((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__COLLECTION_TYPE:
				setCollectionType((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__CONTENT_TYPE_FORMAT:
				setContentTypeFormat((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__CONTENT_TYPE_HEADER:
				setContentTypeHeader((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__DISABLE_FEATURES:
				setDisableFeatures((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ENABLE_FEATURES:
				setEnableFeatures((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__INCLUDE:
				setInclude((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__INSTANCE_CLASS:
				setInstanceClass((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__JSON_VIEW:
				setJsonView((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__LIBRARY:
				setLibrary((ProtobufLibrary)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__MODULE_CLASS_NAMES:
				setModuleClassNames((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__MODULE_REFS:
				setModuleRefs((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__OBJECT_MAPPER:
				setObjectMapper((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__SCHEMA_RESOLVER:
				setSchemaResolver((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__TIMEZONE:
				setTimezone((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__USE_DEFAULT_OBJECT_MAPPER:
				setUseDefaultObjectMapper((String)newValue);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__USE_LIST:
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
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ALLOW_JMS_TYPE:
				setAllowJmsType(ALLOW_JMS_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				setAllowUnmarshallType(ALLOW_UNMARSHALL_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__AUTO_DISCOVER_OBJECT_MAPPER:
				setAutoDiscoverObjectMapper(AUTO_DISCOVER_OBJECT_MAPPER_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__AUTO_DISCOVER_SCHEMA_RESOLVER:
				setAutoDiscoverSchemaResolver(AUTO_DISCOVER_SCHEMA_RESOLVER_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__COLLECTION_TYPE:
				setCollectionType(COLLECTION_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__CONTENT_TYPE_FORMAT:
				setContentTypeFormat(CONTENT_TYPE_FORMAT_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__CONTENT_TYPE_HEADER:
				setContentTypeHeader(CONTENT_TYPE_HEADER_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__DISABLE_FEATURES:
				setDisableFeatures(DISABLE_FEATURES_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ENABLE_FEATURES:
				setEnableFeatures(ENABLE_FEATURES_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__INCLUDE:
				setInclude(INCLUDE_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__INSTANCE_CLASS:
				setInstanceClass(INSTANCE_CLASS_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__JSON_VIEW:
				setJsonView(JSON_VIEW_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__LIBRARY:
				unsetLibrary();
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__MODULE_CLASS_NAMES:
				setModuleClassNames(MODULE_CLASS_NAMES_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__MODULE_REFS:
				setModuleRefs(MODULE_REFS_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__OBJECT_MAPPER:
				setObjectMapper(OBJECT_MAPPER_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__SCHEMA_RESOLVER:
				setSchemaResolver(SCHEMA_RESOLVER_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__TIMEZONE:
				setTimezone(TIMEZONE_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType(UNMARSHAL_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__USE_DEFAULT_OBJECT_MAPPER:
				setUseDefaultObjectMapper(USE_DEFAULT_OBJECT_MAPPER_EDEFAULT);
				return;
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__USE_LIST:
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
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ALLOW_JMS_TYPE:
				return ALLOW_JMS_TYPE_EDEFAULT == null ? allowJmsType != null : !ALLOW_JMS_TYPE_EDEFAULT.equals(allowJmsType);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				return ALLOW_UNMARSHALL_TYPE_EDEFAULT == null ? allowUnmarshallType != null : !ALLOW_UNMARSHALL_TYPE_EDEFAULT.equals(allowUnmarshallType);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__AUTO_DISCOVER_OBJECT_MAPPER:
				return AUTO_DISCOVER_OBJECT_MAPPER_EDEFAULT == null ? autoDiscoverObjectMapper != null : !AUTO_DISCOVER_OBJECT_MAPPER_EDEFAULT.equals(autoDiscoverObjectMapper);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__AUTO_DISCOVER_SCHEMA_RESOLVER:
				return AUTO_DISCOVER_SCHEMA_RESOLVER_EDEFAULT == null ? autoDiscoverSchemaResolver != null : !AUTO_DISCOVER_SCHEMA_RESOLVER_EDEFAULT.equals(autoDiscoverSchemaResolver);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__COLLECTION_TYPE:
				return COLLECTION_TYPE_EDEFAULT == null ? collectionType != null : !COLLECTION_TYPE_EDEFAULT.equals(collectionType);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__CONTENT_TYPE_FORMAT:
				return CONTENT_TYPE_FORMAT_EDEFAULT == null ? contentTypeFormat != null : !CONTENT_TYPE_FORMAT_EDEFAULT.equals(contentTypeFormat);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__CONTENT_TYPE_HEADER:
				return CONTENT_TYPE_HEADER_EDEFAULT == null ? contentTypeHeader != null : !CONTENT_TYPE_HEADER_EDEFAULT.equals(contentTypeHeader);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__DISABLE_FEATURES:
				return DISABLE_FEATURES_EDEFAULT == null ? disableFeatures != null : !DISABLE_FEATURES_EDEFAULT.equals(disableFeatures);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__ENABLE_FEATURES:
				return ENABLE_FEATURES_EDEFAULT == null ? enableFeatures != null : !ENABLE_FEATURES_EDEFAULT.equals(enableFeatures);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__INCLUDE:
				return INCLUDE_EDEFAULT == null ? include != null : !INCLUDE_EDEFAULT.equals(include);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__INSTANCE_CLASS:
				return INSTANCE_CLASS_EDEFAULT == null ? instanceClass != null : !INSTANCE_CLASS_EDEFAULT.equals(instanceClass);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__JSON_VIEW:
				return JSON_VIEW_EDEFAULT == null ? jsonView != null : !JSON_VIEW_EDEFAULT.equals(jsonView);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__LIBRARY:
				return isSetLibrary();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__MODULE_CLASS_NAMES:
				return MODULE_CLASS_NAMES_EDEFAULT == null ? moduleClassNames != null : !MODULE_CLASS_NAMES_EDEFAULT.equals(moduleClassNames);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__MODULE_REFS:
				return MODULE_REFS_EDEFAULT == null ? moduleRefs != null : !MODULE_REFS_EDEFAULT.equals(moduleRefs);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__OBJECT_MAPPER:
				return OBJECT_MAPPER_EDEFAULT == null ? objectMapper != null : !OBJECT_MAPPER_EDEFAULT.equals(objectMapper);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__SCHEMA_RESOLVER:
				return SCHEMA_RESOLVER_EDEFAULT == null ? schemaResolver != null : !SCHEMA_RESOLVER_EDEFAULT.equals(schemaResolver);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__TIMEZONE:
				return TIMEZONE_EDEFAULT == null ? timezone != null : !TIMEZONE_EDEFAULT.equals(timezone);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__UNMARSHAL_TYPE:
				return UNMARSHAL_TYPE_EDEFAULT == null ? unmarshalType != null : !UNMARSHAL_TYPE_EDEFAULT.equals(unmarshalType);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__USE_DEFAULT_OBJECT_MAPPER:
				return USE_DEFAULT_OBJECT_MAPPER_EDEFAULT == null ? useDefaultObjectMapper != null : !USE_DEFAULT_OBJECT_MAPPER_EDEFAULT.equals(useDefaultObjectMapper);
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT__USE_LIST:
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
		result.append(", autoDiscoverObjectMapper: ");
		result.append(autoDiscoverObjectMapper);
		result.append(", autoDiscoverSchemaResolver: ");
		result.append(autoDiscoverSchemaResolver);
		result.append(", collectionType: ");
		result.append(collectionType);
		result.append(", contentTypeFormat: ");
		result.append(contentTypeFormat);
		result.append(", contentTypeHeader: ");
		result.append(contentTypeHeader);
		result.append(", disableFeatures: ");
		result.append(disableFeatures);
		result.append(", enableFeatures: ");
		result.append(enableFeatures);
		result.append(", include: ");
		result.append(include);
		result.append(", instanceClass: ");
		result.append(instanceClass);
		result.append(", jsonView: ");
		result.append(jsonView);
		result.append(", library: ");
		if (libraryESet) result.append(library); else result.append("<unset>");
		result.append(", moduleClassNames: ");
		result.append(moduleClassNames);
		result.append(", moduleRefs: ");
		result.append(moduleRefs);
		result.append(", objectMapper: ");
		result.append(objectMapper);
		result.append(", schemaResolver: ");
		result.append(schemaResolver);
		result.append(", timezone: ");
		result.append(timezone);
		result.append(", unmarshalType: ");
		result.append(unmarshalType);
		result.append(", useDefaultObjectMapper: ");
		result.append(useDefaultObjectMapper);
		result.append(", useList: ");
		result.append(useList);
		result.append(')');
		return result.toString();
	}

} //ProtobufDataFormatImpl

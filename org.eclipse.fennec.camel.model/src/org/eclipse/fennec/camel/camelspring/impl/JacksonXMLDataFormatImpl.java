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
import org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jackson XML Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getAllowJmsType <em>Allow Jms Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getAllowUnmarshallType <em>Allow Unmarshall Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getDisableFeatures <em>Disable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getEnableFeatures <em>Enable Features</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getEnableJaxbAnnotationModule <em>Enable Jaxb Annotation Module</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getJsonView <em>Json View</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getMaxStringLength <em>Max String Length</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getModuleClassNames <em>Module Class Names</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getModuleRefs <em>Module Refs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getUnmarshalType <em>Unmarshal Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getUseList <em>Use List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JacksonXMLDataFormatImpl#getXmlMapper <em>Xml Mapper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JacksonXMLDataFormatImpl extends DataFormatImpl implements JacksonXMLDataFormat {
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
	 * The default value of the '{@link #getEnableJaxbAnnotationModule() <em>Enable Jaxb Annotation Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableJaxbAnnotationModule()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_JAXB_ANNOTATION_MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableJaxbAnnotationModule() <em>Enable Jaxb Annotation Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableJaxbAnnotationModule()
	 * @generated
	 * @ordered
	 */
	protected String enableJaxbAnnotationModule = ENABLE_JAXB_ANNOTATION_MODULE_EDEFAULT;

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
	 * The default value of the '{@link #getMaxStringLength() <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStringLength()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_STRING_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxStringLength() <em>Max String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStringLength()
	 * @generated
	 * @ordered
	 */
	protected String maxStringLength = MAX_STRING_LENGTH_EDEFAULT;

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
	 * The default value of the '{@link #getXmlMapper() <em>Xml Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlMapper()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_MAPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlMapper() <em>Xml Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlMapper()
	 * @generated
	 * @ordered
	 */
	protected String xmlMapper = XML_MAPPER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JacksonXMLDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getJacksonXMLDataFormat();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ALLOW_JMS_TYPE, oldAllowJmsType, allowJmsType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE, oldAllowUnmarshallType, allowUnmarshallType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__COLLECTION_TYPE, oldCollectionType, collectionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__CONTENT_TYPE_HEADER, oldContentTypeHeader, contentTypeHeader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__DISABLE_FEATURES, oldDisableFeatures, disableFeatures));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ENABLE_FEATURES, oldEnableFeatures, enableFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableJaxbAnnotationModule() {
		return enableJaxbAnnotationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableJaxbAnnotationModule(String newEnableJaxbAnnotationModule) {
		String oldEnableJaxbAnnotationModule = enableJaxbAnnotationModule;
		enableJaxbAnnotationModule = newEnableJaxbAnnotationModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ENABLE_JAXB_ANNOTATION_MODULE, oldEnableJaxbAnnotationModule, enableJaxbAnnotationModule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__INCLUDE, oldInclude, include));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__JSON_VIEW, oldJsonView, jsonView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxStringLength() {
		return maxStringLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxStringLength(String newMaxStringLength) {
		String oldMaxStringLength = maxStringLength;
		maxStringLength = newMaxStringLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MAX_STRING_LENGTH, oldMaxStringLength, maxStringLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MODULE_CLASS_NAMES, oldModuleClassNames, moduleClassNames));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MODULE_REFS, oldModuleRefs, moduleRefs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__PRETTY_PRINT, oldPrettyPrint, prettyPrint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__TIMEZONE, oldTimezone, timezone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__UNMARSHAL_TYPE, oldUnmarshalType, unmarshalType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__USE_LIST, oldUseList, useList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmlMapper() {
		return xmlMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlMapper(String newXmlMapper) {
		String oldXmlMapper = xmlMapper;
		xmlMapper = newXmlMapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JACKSON_XML_DATA_FORMAT__XML_MAPPER, oldXmlMapper, xmlMapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ALLOW_JMS_TYPE:
				return getAllowJmsType();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				return getAllowUnmarshallType();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__COLLECTION_TYPE:
				return getCollectionType();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__CONTENT_TYPE_HEADER:
				return getContentTypeHeader();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__DISABLE_FEATURES:
				return getDisableFeatures();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ENABLE_FEATURES:
				return getEnableFeatures();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ENABLE_JAXB_ANNOTATION_MODULE:
				return getEnableJaxbAnnotationModule();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__INCLUDE:
				return getInclude();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__JSON_VIEW:
				return getJsonView();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MAX_STRING_LENGTH:
				return getMaxStringLength();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MODULE_CLASS_NAMES:
				return getModuleClassNames();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MODULE_REFS:
				return getModuleRefs();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__PRETTY_PRINT:
				return getPrettyPrint();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__TIMEZONE:
				return getTimezone();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__UNMARSHAL_TYPE:
				return getUnmarshalType();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__USE_LIST:
				return getUseList();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__XML_MAPPER:
				return getXmlMapper();
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
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ALLOW_JMS_TYPE:
				setAllowJmsType((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				setAllowUnmarshallType((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__COLLECTION_TYPE:
				setCollectionType((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__CONTENT_TYPE_HEADER:
				setContentTypeHeader((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__DISABLE_FEATURES:
				setDisableFeatures((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ENABLE_FEATURES:
				setEnableFeatures((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ENABLE_JAXB_ANNOTATION_MODULE:
				setEnableJaxbAnnotationModule((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__INCLUDE:
				setInclude((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__JSON_VIEW:
				setJsonView((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MAX_STRING_LENGTH:
				setMaxStringLength((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MODULE_CLASS_NAMES:
				setModuleClassNames((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MODULE_REFS:
				setModuleRefs((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__PRETTY_PRINT:
				setPrettyPrint((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__TIMEZONE:
				setTimezone((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__USE_LIST:
				setUseList((String)newValue);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__XML_MAPPER:
				setXmlMapper((String)newValue);
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
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ALLOW_JMS_TYPE:
				setAllowJmsType(ALLOW_JMS_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				setAllowUnmarshallType(ALLOW_UNMARSHALL_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__COLLECTION_TYPE:
				setCollectionType(COLLECTION_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__CONTENT_TYPE_HEADER:
				setContentTypeHeader(CONTENT_TYPE_HEADER_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__DISABLE_FEATURES:
				setDisableFeatures(DISABLE_FEATURES_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ENABLE_FEATURES:
				setEnableFeatures(ENABLE_FEATURES_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ENABLE_JAXB_ANNOTATION_MODULE:
				setEnableJaxbAnnotationModule(ENABLE_JAXB_ANNOTATION_MODULE_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__INCLUDE:
				setInclude(INCLUDE_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__JSON_VIEW:
				setJsonView(JSON_VIEW_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MAX_STRING_LENGTH:
				setMaxStringLength(MAX_STRING_LENGTH_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MODULE_CLASS_NAMES:
				setModuleClassNames(MODULE_CLASS_NAMES_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MODULE_REFS:
				setModuleRefs(MODULE_REFS_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__PRETTY_PRINT:
				setPrettyPrint(PRETTY_PRINT_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__TIMEZONE:
				setTimezone(TIMEZONE_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__UNMARSHAL_TYPE:
				setUnmarshalType(UNMARSHAL_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__USE_LIST:
				setUseList(USE_LIST_EDEFAULT);
				return;
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__XML_MAPPER:
				setXmlMapper(XML_MAPPER_EDEFAULT);
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
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ALLOW_JMS_TYPE:
				return ALLOW_JMS_TYPE_EDEFAULT == null ? allowJmsType != null : !ALLOW_JMS_TYPE_EDEFAULT.equals(allowJmsType);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ALLOW_UNMARSHALL_TYPE:
				return ALLOW_UNMARSHALL_TYPE_EDEFAULT == null ? allowUnmarshallType != null : !ALLOW_UNMARSHALL_TYPE_EDEFAULT.equals(allowUnmarshallType);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__COLLECTION_TYPE:
				return COLLECTION_TYPE_EDEFAULT == null ? collectionType != null : !COLLECTION_TYPE_EDEFAULT.equals(collectionType);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__CONTENT_TYPE_HEADER:
				return CONTENT_TYPE_HEADER_EDEFAULT == null ? contentTypeHeader != null : !CONTENT_TYPE_HEADER_EDEFAULT.equals(contentTypeHeader);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__DISABLE_FEATURES:
				return DISABLE_FEATURES_EDEFAULT == null ? disableFeatures != null : !DISABLE_FEATURES_EDEFAULT.equals(disableFeatures);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ENABLE_FEATURES:
				return ENABLE_FEATURES_EDEFAULT == null ? enableFeatures != null : !ENABLE_FEATURES_EDEFAULT.equals(enableFeatures);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__ENABLE_JAXB_ANNOTATION_MODULE:
				return ENABLE_JAXB_ANNOTATION_MODULE_EDEFAULT == null ? enableJaxbAnnotationModule != null : !ENABLE_JAXB_ANNOTATION_MODULE_EDEFAULT.equals(enableJaxbAnnotationModule);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__INCLUDE:
				return INCLUDE_EDEFAULT == null ? include != null : !INCLUDE_EDEFAULT.equals(include);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__JSON_VIEW:
				return JSON_VIEW_EDEFAULT == null ? jsonView != null : !JSON_VIEW_EDEFAULT.equals(jsonView);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MAX_STRING_LENGTH:
				return MAX_STRING_LENGTH_EDEFAULT == null ? maxStringLength != null : !MAX_STRING_LENGTH_EDEFAULT.equals(maxStringLength);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MODULE_CLASS_NAMES:
				return MODULE_CLASS_NAMES_EDEFAULT == null ? moduleClassNames != null : !MODULE_CLASS_NAMES_EDEFAULT.equals(moduleClassNames);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__MODULE_REFS:
				return MODULE_REFS_EDEFAULT == null ? moduleRefs != null : !MODULE_REFS_EDEFAULT.equals(moduleRefs);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__PRETTY_PRINT:
				return PRETTY_PRINT_EDEFAULT == null ? prettyPrint != null : !PRETTY_PRINT_EDEFAULT.equals(prettyPrint);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__TIMEZONE:
				return TIMEZONE_EDEFAULT == null ? timezone != null : !TIMEZONE_EDEFAULT.equals(timezone);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__UNMARSHAL_TYPE:
				return UNMARSHAL_TYPE_EDEFAULT == null ? unmarshalType != null : !UNMARSHAL_TYPE_EDEFAULT.equals(unmarshalType);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__USE_LIST:
				return USE_LIST_EDEFAULT == null ? useList != null : !USE_LIST_EDEFAULT.equals(useList);
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT__XML_MAPPER:
				return XML_MAPPER_EDEFAULT == null ? xmlMapper != null : !XML_MAPPER_EDEFAULT.equals(xmlMapper);
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
		result.append(", contentTypeHeader: ");
		result.append(contentTypeHeader);
		result.append(", disableFeatures: ");
		result.append(disableFeatures);
		result.append(", enableFeatures: ");
		result.append(enableFeatures);
		result.append(", enableJaxbAnnotationModule: ");
		result.append(enableJaxbAnnotationModule);
		result.append(", include: ");
		result.append(include);
		result.append(", jsonView: ");
		result.append(jsonView);
		result.append(", maxStringLength: ");
		result.append(maxStringLength);
		result.append(", moduleClassNames: ");
		result.append(moduleClassNames);
		result.append(", moduleRefs: ");
		result.append(moduleRefs);
		result.append(", prettyPrint: ");
		result.append(prettyPrint);
		result.append(", timezone: ");
		result.append(timezone);
		result.append(", unmarshalType: ");
		result.append(unmarshalType);
		result.append(", useList: ");
		result.append(useList);
		result.append(", xmlMapper: ");
		result.append(xmlMapper);
		result.append(')');
		return result.toString();
	}

} //JacksonXMLDataFormatImpl

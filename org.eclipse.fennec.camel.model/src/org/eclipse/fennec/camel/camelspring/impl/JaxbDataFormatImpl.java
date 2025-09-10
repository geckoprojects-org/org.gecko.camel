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
import org.eclipse.fennec.camel.camelspring.JaxbDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jaxb Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getAccessExternalSchemaProtocols <em>Access External Schema Protocols</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getContextPathIsClassName <em>Context Path Is Class Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getFilterNonXmlChars <em>Filter Non Xml Chars</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getIgnoreJAXBElement <em>Ignore JAXB Element</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getJaxbProviderProperties <em>Jaxb Provider Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getMustBeJAXBElement <em>Must Be JAXB Element</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getNamespacePrefixRef <em>Namespace Prefix Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getNoNamespaceSchemaLocation <em>No Namespace Schema Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getObjectFactory <em>Object Factory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getPartClass <em>Part Class</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getPartNamespace <em>Part Namespace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getSchemaSeverityLevel <em>Schema Severity Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.JaxbDataFormatImpl#getXmlStreamWriterWrapper <em>Xml Stream Writer Wrapper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JaxbDataFormatImpl extends DataFormatImpl implements JaxbDataFormat {
	/**
	 * The default value of the '{@link #getAccessExternalSchemaProtocols() <em>Access External Schema Protocols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessExternalSchemaProtocols()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EXTERNAL_SCHEMA_PROTOCOLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessExternalSchemaProtocols() <em>Access External Schema Protocols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessExternalSchemaProtocols()
	 * @generated
	 * @ordered
	 */
	protected String accessExternalSchemaProtocols = ACCESS_EXTERNAL_SCHEMA_PROTOCOLS_EDEFAULT;

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
	 * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPath()
	 * @generated
	 * @ordered
	 */
	protected String contextPath = CONTEXT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextPathIsClassName() <em>Context Path Is Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPathIsClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_PATH_IS_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextPathIsClassName() <em>Context Path Is Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPathIsClassName()
	 * @generated
	 * @ordered
	 */
	protected String contextPathIsClassName = CONTEXT_PATH_IS_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterNonXmlChars() <em>Filter Non Xml Chars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterNonXmlChars()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_NON_XML_CHARS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterNonXmlChars() <em>Filter Non Xml Chars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterNonXmlChars()
	 * @generated
	 * @ordered
	 */
	protected String filterNonXmlChars = FILTER_NON_XML_CHARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFragment() <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragment()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAGMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFragment() <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragment()
	 * @generated
	 * @ordered
	 */
	protected String fragment = FRAGMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreJAXBElement() <em>Ignore JAXB Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreJAXBElement()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_JAXB_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreJAXBElement() <em>Ignore JAXB Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreJAXBElement()
	 * @generated
	 * @ordered
	 */
	protected String ignoreJAXBElement = IGNORE_JAXB_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getJaxbProviderProperties() <em>Jaxb Provider Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJaxbProviderProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String JAXB_PROVIDER_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJaxbProviderProperties() <em>Jaxb Provider Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJaxbProviderProperties()
	 * @generated
	 * @ordered
	 */
	protected String jaxbProviderProperties = JAXB_PROVIDER_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMustBeJAXBElement() <em>Must Be JAXB Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustBeJAXBElement()
	 * @generated
	 * @ordered
	 */
	protected static final String MUST_BE_JAXB_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMustBeJAXBElement() <em>Must Be JAXB Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustBeJAXBElement()
	 * @generated
	 * @ordered
	 */
	protected String mustBeJAXBElement = MUST_BE_JAXB_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespacePrefixRef() <em>Namespace Prefix Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefixRef()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_PREFIX_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespacePrefixRef() <em>Namespace Prefix Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefixRef()
	 * @generated
	 * @ordered
	 */
	protected String namespacePrefixRef = NAMESPACE_PREFIX_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoNamespaceSchemaLocation() <em>No Namespace Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoNamespaceSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String NO_NAMESPACE_SCHEMA_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoNamespaceSchemaLocation() <em>No Namespace Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoNamespaceSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected String noNamespaceSchemaLocation = NO_NAMESPACE_SCHEMA_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectFactory() <em>Object Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectFactory() <em>Object Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectFactory()
	 * @generated
	 * @ordered
	 */
	protected String objectFactory = OBJECT_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartClass() <em>Part Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartClass() <em>Part Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartClass()
	 * @generated
	 * @ordered
	 */
	protected String partClass = PART_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartNamespace() <em>Part Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNamespace() <em>Part Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNamespace()
	 * @generated
	 * @ordered
	 */
	protected String partNamespace = PART_NAMESPACE_EDEFAULT;

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
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected String schemaLocation = SCHEMA_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaSeverityLevel() <em>Schema Severity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaSeverityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_SEVERITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaSeverityLevel() <em>Schema Severity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaSeverityLevel()
	 * @generated
	 * @ordered
	 */
	protected String schemaSeverityLevel = SCHEMA_SEVERITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlStreamWriterWrapper() <em>Xml Stream Writer Wrapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlStreamWriterWrapper()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_STREAM_WRITER_WRAPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlStreamWriterWrapper() <em>Xml Stream Writer Wrapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlStreamWriterWrapper()
	 * @generated
	 * @ordered
	 */
	protected String xmlStreamWriterWrapper = XML_STREAM_WRITER_WRAPPER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JaxbDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getJaxbDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessExternalSchemaProtocols() {
		return accessExternalSchemaProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessExternalSchemaProtocols(String newAccessExternalSchemaProtocols) {
		String oldAccessExternalSchemaProtocols = accessExternalSchemaProtocols;
		accessExternalSchemaProtocols = newAccessExternalSchemaProtocols;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__ACCESS_EXTERNAL_SCHEMA_PROTOCOLS, oldAccessExternalSchemaProtocols, accessExternalSchemaProtocols));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__CONTENT_TYPE_HEADER, oldContentTypeHeader, contentTypeHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextPath() {
		return contextPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextPath(String newContextPath) {
		String oldContextPath = contextPath;
		contextPath = newContextPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH, oldContextPath, contextPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextPathIsClassName() {
		return contextPathIsClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextPathIsClassName(String newContextPathIsClassName) {
		String oldContextPathIsClassName = contextPathIsClassName;
		contextPathIsClassName = newContextPathIsClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH_IS_CLASS_NAME, oldContextPathIsClassName, contextPathIsClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilterNonXmlChars() {
		return filterNonXmlChars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterNonXmlChars(String newFilterNonXmlChars) {
		String oldFilterNonXmlChars = filterNonXmlChars;
		filterNonXmlChars = newFilterNonXmlChars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS, oldFilterNonXmlChars, filterNonXmlChars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFragment() {
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFragment(String newFragment) {
		String oldFragment = fragment;
		fragment = newFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__FRAGMENT, oldFragment, fragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreJAXBElement() {
		return ignoreJAXBElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreJAXBElement(String newIgnoreJAXBElement) {
		String oldIgnoreJAXBElement = ignoreJAXBElement;
		ignoreJAXBElement = newIgnoreJAXBElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT, oldIgnoreJAXBElement, ignoreJAXBElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJaxbProviderProperties() {
		return jaxbProviderProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJaxbProviderProperties(String newJaxbProviderProperties) {
		String oldJaxbProviderProperties = jaxbProviderProperties;
		jaxbProviderProperties = newJaxbProviderProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__JAXB_PROVIDER_PROPERTIES, oldJaxbProviderProperties, jaxbProviderProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMustBeJAXBElement() {
		return mustBeJAXBElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMustBeJAXBElement(String newMustBeJAXBElement) {
		String oldMustBeJAXBElement = mustBeJAXBElement;
		mustBeJAXBElement = newMustBeJAXBElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__MUST_BE_JAXB_ELEMENT, oldMustBeJAXBElement, mustBeJAXBElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespacePrefixRef() {
		return namespacePrefixRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespacePrefixRef(String newNamespacePrefixRef) {
		String oldNamespacePrefixRef = namespacePrefixRef;
		namespacePrefixRef = newNamespacePrefixRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__NAMESPACE_PREFIX_REF, oldNamespacePrefixRef, namespacePrefixRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoNamespaceSchemaLocation() {
		return noNamespaceSchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoNamespaceSchemaLocation(String newNoNamespaceSchemaLocation) {
		String oldNoNamespaceSchemaLocation = noNamespaceSchemaLocation;
		noNamespaceSchemaLocation = newNoNamespaceSchemaLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__NO_NAMESPACE_SCHEMA_LOCATION, oldNoNamespaceSchemaLocation, noNamespaceSchemaLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjectFactory() {
		return objectFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectFactory(String newObjectFactory) {
		String oldObjectFactory = objectFactory;
		objectFactory = newObjectFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__OBJECT_FACTORY, oldObjectFactory, objectFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartClass() {
		return partClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartClass(String newPartClass) {
		String oldPartClass = partClass;
		partClass = newPartClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__PART_CLASS, oldPartClass, partClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartNamespace() {
		return partNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartNamespace(String newPartNamespace) {
		String oldPartNamespace = partNamespace;
		partNamespace = newPartNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE, oldPartNamespace, partNamespace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT, oldPrettyPrint, prettyPrint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaLocation() {
		return schemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaLocation(String newSchemaLocation) {
		String oldSchemaLocation = schemaLocation;
		schemaLocation = newSchemaLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA_LOCATION, oldSchemaLocation, schemaLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaSeverityLevel() {
		return schemaSeverityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaSeverityLevel(String newSchemaSeverityLevel) {
		String oldSchemaSeverityLevel = schemaSeverityLevel;
		schemaSeverityLevel = newSchemaSeverityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA_SEVERITY_LEVEL, oldSchemaSeverityLevel, schemaSeverityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmlStreamWriterWrapper() {
		return xmlStreamWriterWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlStreamWriterWrapper(String newXmlStreamWriterWrapper) {
		String oldXmlStreamWriterWrapper = xmlStreamWriterWrapper;
		xmlStreamWriterWrapper = newXmlStreamWriterWrapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.JAXB_DATA_FORMAT__XML_STREAM_WRITER_WRAPPER, oldXmlStreamWriterWrapper, xmlStreamWriterWrapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.JAXB_DATA_FORMAT__ACCESS_EXTERNAL_SCHEMA_PROTOCOLS:
				return getAccessExternalSchemaProtocols();
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTENT_TYPE_HEADER:
				return getContentTypeHeader();
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH:
				return getContextPath();
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH_IS_CLASS_NAME:
				return getContextPathIsClassName();
			case CamelSpringPackage.JAXB_DATA_FORMAT__ENCODING:
				return getEncoding();
			case CamelSpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS:
				return getFilterNonXmlChars();
			case CamelSpringPackage.JAXB_DATA_FORMAT__FRAGMENT:
				return getFragment();
			case CamelSpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT:
				return getIgnoreJAXBElement();
			case CamelSpringPackage.JAXB_DATA_FORMAT__JAXB_PROVIDER_PROPERTIES:
				return getJaxbProviderProperties();
			case CamelSpringPackage.JAXB_DATA_FORMAT__MUST_BE_JAXB_ELEMENT:
				return getMustBeJAXBElement();
			case CamelSpringPackage.JAXB_DATA_FORMAT__NAMESPACE_PREFIX_REF:
				return getNamespacePrefixRef();
			case CamelSpringPackage.JAXB_DATA_FORMAT__NO_NAMESPACE_SCHEMA_LOCATION:
				return getNoNamespaceSchemaLocation();
			case CamelSpringPackage.JAXB_DATA_FORMAT__OBJECT_FACTORY:
				return getObjectFactory();
			case CamelSpringPackage.JAXB_DATA_FORMAT__PART_CLASS:
				return getPartClass();
			case CamelSpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE:
				return getPartNamespace();
			case CamelSpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT:
				return getPrettyPrint();
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA:
				return getSchema();
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA_LOCATION:
				return getSchemaLocation();
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA_SEVERITY_LEVEL:
				return getSchemaSeverityLevel();
			case CamelSpringPackage.JAXB_DATA_FORMAT__XML_STREAM_WRITER_WRAPPER:
				return getXmlStreamWriterWrapper();
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
			case CamelSpringPackage.JAXB_DATA_FORMAT__ACCESS_EXTERNAL_SCHEMA_PROTOCOLS:
				setAccessExternalSchemaProtocols((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTENT_TYPE_HEADER:
				setContentTypeHeader((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH:
				setContextPath((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH_IS_CLASS_NAME:
				setContextPathIsClassName((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__ENCODING:
				setEncoding((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS:
				setFilterNonXmlChars((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__FRAGMENT:
				setFragment((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT:
				setIgnoreJAXBElement((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__JAXB_PROVIDER_PROPERTIES:
				setJaxbProviderProperties((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__MUST_BE_JAXB_ELEMENT:
				setMustBeJAXBElement((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__NAMESPACE_PREFIX_REF:
				setNamespacePrefixRef((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__NO_NAMESPACE_SCHEMA_LOCATION:
				setNoNamespaceSchemaLocation((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__OBJECT_FACTORY:
				setObjectFactory((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__PART_CLASS:
				setPartClass((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE:
				setPartNamespace((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT:
				setPrettyPrint((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA:
				setSchema((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA_LOCATION:
				setSchemaLocation((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA_SEVERITY_LEVEL:
				setSchemaSeverityLevel((String)newValue);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__XML_STREAM_WRITER_WRAPPER:
				setXmlStreamWriterWrapper((String)newValue);
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
			case CamelSpringPackage.JAXB_DATA_FORMAT__ACCESS_EXTERNAL_SCHEMA_PROTOCOLS:
				setAccessExternalSchemaProtocols(ACCESS_EXTERNAL_SCHEMA_PROTOCOLS_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTENT_TYPE_HEADER:
				setContentTypeHeader(CONTENT_TYPE_HEADER_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH:
				setContextPath(CONTEXT_PATH_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH_IS_CLASS_NAME:
				setContextPathIsClassName(CONTEXT_PATH_IS_CLASS_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS:
				setFilterNonXmlChars(FILTER_NON_XML_CHARS_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__FRAGMENT:
				setFragment(FRAGMENT_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT:
				setIgnoreJAXBElement(IGNORE_JAXB_ELEMENT_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__JAXB_PROVIDER_PROPERTIES:
				setJaxbProviderProperties(JAXB_PROVIDER_PROPERTIES_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__MUST_BE_JAXB_ELEMENT:
				setMustBeJAXBElement(MUST_BE_JAXB_ELEMENT_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__NAMESPACE_PREFIX_REF:
				setNamespacePrefixRef(NAMESPACE_PREFIX_REF_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__NO_NAMESPACE_SCHEMA_LOCATION:
				setNoNamespaceSchemaLocation(NO_NAMESPACE_SCHEMA_LOCATION_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__OBJECT_FACTORY:
				setObjectFactory(OBJECT_FACTORY_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__PART_CLASS:
				setPartClass(PART_CLASS_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE:
				setPartNamespace(PART_NAMESPACE_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT:
				setPrettyPrint(PRETTY_PRINT_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA_LOCATION:
				setSchemaLocation(SCHEMA_LOCATION_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA_SEVERITY_LEVEL:
				setSchemaSeverityLevel(SCHEMA_SEVERITY_LEVEL_EDEFAULT);
				return;
			case CamelSpringPackage.JAXB_DATA_FORMAT__XML_STREAM_WRITER_WRAPPER:
				setXmlStreamWriterWrapper(XML_STREAM_WRITER_WRAPPER_EDEFAULT);
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
			case CamelSpringPackage.JAXB_DATA_FORMAT__ACCESS_EXTERNAL_SCHEMA_PROTOCOLS:
				return ACCESS_EXTERNAL_SCHEMA_PROTOCOLS_EDEFAULT == null ? accessExternalSchemaProtocols != null : !ACCESS_EXTERNAL_SCHEMA_PROTOCOLS_EDEFAULT.equals(accessExternalSchemaProtocols);
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTENT_TYPE_HEADER:
				return CONTENT_TYPE_HEADER_EDEFAULT == null ? contentTypeHeader != null : !CONTENT_TYPE_HEADER_EDEFAULT.equals(contentTypeHeader);
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH:
				return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
			case CamelSpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH_IS_CLASS_NAME:
				return CONTEXT_PATH_IS_CLASS_NAME_EDEFAULT == null ? contextPathIsClassName != null : !CONTEXT_PATH_IS_CLASS_NAME_EDEFAULT.equals(contextPathIsClassName);
			case CamelSpringPackage.JAXB_DATA_FORMAT__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case CamelSpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS:
				return FILTER_NON_XML_CHARS_EDEFAULT == null ? filterNonXmlChars != null : !FILTER_NON_XML_CHARS_EDEFAULT.equals(filterNonXmlChars);
			case CamelSpringPackage.JAXB_DATA_FORMAT__FRAGMENT:
				return FRAGMENT_EDEFAULT == null ? fragment != null : !FRAGMENT_EDEFAULT.equals(fragment);
			case CamelSpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT:
				return IGNORE_JAXB_ELEMENT_EDEFAULT == null ? ignoreJAXBElement != null : !IGNORE_JAXB_ELEMENT_EDEFAULT.equals(ignoreJAXBElement);
			case CamelSpringPackage.JAXB_DATA_FORMAT__JAXB_PROVIDER_PROPERTIES:
				return JAXB_PROVIDER_PROPERTIES_EDEFAULT == null ? jaxbProviderProperties != null : !JAXB_PROVIDER_PROPERTIES_EDEFAULT.equals(jaxbProviderProperties);
			case CamelSpringPackage.JAXB_DATA_FORMAT__MUST_BE_JAXB_ELEMENT:
				return MUST_BE_JAXB_ELEMENT_EDEFAULT == null ? mustBeJAXBElement != null : !MUST_BE_JAXB_ELEMENT_EDEFAULT.equals(mustBeJAXBElement);
			case CamelSpringPackage.JAXB_DATA_FORMAT__NAMESPACE_PREFIX_REF:
				return NAMESPACE_PREFIX_REF_EDEFAULT == null ? namespacePrefixRef != null : !NAMESPACE_PREFIX_REF_EDEFAULT.equals(namespacePrefixRef);
			case CamelSpringPackage.JAXB_DATA_FORMAT__NO_NAMESPACE_SCHEMA_LOCATION:
				return NO_NAMESPACE_SCHEMA_LOCATION_EDEFAULT == null ? noNamespaceSchemaLocation != null : !NO_NAMESPACE_SCHEMA_LOCATION_EDEFAULT.equals(noNamespaceSchemaLocation);
			case CamelSpringPackage.JAXB_DATA_FORMAT__OBJECT_FACTORY:
				return OBJECT_FACTORY_EDEFAULT == null ? objectFactory != null : !OBJECT_FACTORY_EDEFAULT.equals(objectFactory);
			case CamelSpringPackage.JAXB_DATA_FORMAT__PART_CLASS:
				return PART_CLASS_EDEFAULT == null ? partClass != null : !PART_CLASS_EDEFAULT.equals(partClass);
			case CamelSpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE:
				return PART_NAMESPACE_EDEFAULT == null ? partNamespace != null : !PART_NAMESPACE_EDEFAULT.equals(partNamespace);
			case CamelSpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT:
				return PRETTY_PRINT_EDEFAULT == null ? prettyPrint != null : !PRETTY_PRINT_EDEFAULT.equals(prettyPrint);
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA_LOCATION:
				return SCHEMA_LOCATION_EDEFAULT == null ? schemaLocation != null : !SCHEMA_LOCATION_EDEFAULT.equals(schemaLocation);
			case CamelSpringPackage.JAXB_DATA_FORMAT__SCHEMA_SEVERITY_LEVEL:
				return SCHEMA_SEVERITY_LEVEL_EDEFAULT == null ? schemaSeverityLevel != null : !SCHEMA_SEVERITY_LEVEL_EDEFAULT.equals(schemaSeverityLevel);
			case CamelSpringPackage.JAXB_DATA_FORMAT__XML_STREAM_WRITER_WRAPPER:
				return XML_STREAM_WRITER_WRAPPER_EDEFAULT == null ? xmlStreamWriterWrapper != null : !XML_STREAM_WRITER_WRAPPER_EDEFAULT.equals(xmlStreamWriterWrapper);
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
		result.append(" (accessExternalSchemaProtocols: ");
		result.append(accessExternalSchemaProtocols);
		result.append(", contentTypeHeader: ");
		result.append(contentTypeHeader);
		result.append(", contextPath: ");
		result.append(contextPath);
		result.append(", contextPathIsClassName: ");
		result.append(contextPathIsClassName);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", filterNonXmlChars: ");
		result.append(filterNonXmlChars);
		result.append(", fragment: ");
		result.append(fragment);
		result.append(", ignoreJAXBElement: ");
		result.append(ignoreJAXBElement);
		result.append(", jaxbProviderProperties: ");
		result.append(jaxbProviderProperties);
		result.append(", mustBeJAXBElement: ");
		result.append(mustBeJAXBElement);
		result.append(", namespacePrefixRef: ");
		result.append(namespacePrefixRef);
		result.append(", noNamespaceSchemaLocation: ");
		result.append(noNamespaceSchemaLocation);
		result.append(", objectFactory: ");
		result.append(objectFactory);
		result.append(", partClass: ");
		result.append(partClass);
		result.append(", partNamespace: ");
		result.append(partNamespace);
		result.append(", prettyPrint: ");
		result.append(prettyPrint);
		result.append(", schema: ");
		result.append(schema);
		result.append(", schemaLocation: ");
		result.append(schemaLocation);
		result.append(", schemaSeverityLevel: ");
		result.append(schemaSeverityLevel);
		result.append(", xmlStreamWriterWrapper: ");
		result.append(xmlStreamWriterWrapper);
		result.append(')');
		return result.toString();
	}

} //JaxbDataFormatImpl

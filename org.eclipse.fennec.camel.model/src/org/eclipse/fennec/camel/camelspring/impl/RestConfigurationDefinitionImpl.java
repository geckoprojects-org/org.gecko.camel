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

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.RestBindingMode;
import org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.RestHostNameResolver;
import org.eclipse.fennec.camel.camelspring.RestPropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Configuration Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getComponentProperty <em>Component Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getEndpointProperty <em>Endpoint Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getConsumerProperty <em>Consumer Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getDataFormatProperty <em>Data Format Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getApiProperty <em>Api Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getCorsHeaders <em>Cors Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getValidationLevels <em>Validation Levels</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getApiComponent <em>Api Component</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getApiContextPath <em>Api Context Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getApiContextRouteId <em>Api Context Route Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getApiHost <em>Api Host</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getApiVendorExtension <em>Api Vendor Extension</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getBindingMode <em>Binding Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getBindingPackageScan <em>Binding Package Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getClientRequestValidation <em>Client Request Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getClientResponseValidation <em>Client Response Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getEnableCORS <em>Enable CORS</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getEnableNoContentResponse <em>Enable No Content Response</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getHostNameResolver <em>Host Name Resolver</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getInlineRoutes <em>Inline Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getJsonDataFormat <em>Json Data Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getProducerApiDoc <em>Producer Api Doc</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getProducerComponent <em>Producer Component</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getUseXForwardHeaders <em>Use XForward Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestConfigurationDefinitionImpl#getXmlDataFormat <em>Xml Data Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestConfigurationDefinitionImpl extends MinimalEObjectImpl.Container implements RestConfigurationDefinition {
	/**
	 * The cached value of the '{@link #getComponentProperty() <em>Component Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<RestPropertyDefinition> componentProperty;

	/**
	 * The cached value of the '{@link #getEndpointProperty() <em>Endpoint Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<RestPropertyDefinition> endpointProperty;

	/**
	 * The cached value of the '{@link #getConsumerProperty() <em>Consumer Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<RestPropertyDefinition> consumerProperty;

	/**
	 * The cached value of the '{@link #getDataFormatProperty() <em>Data Format Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormatProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<RestPropertyDefinition> dataFormatProperty;

	/**
	 * The cached value of the '{@link #getApiProperty() <em>Api Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<RestPropertyDefinition> apiProperty;

	/**
	 * The cached value of the '{@link #getCorsHeaders() <em>Cors Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorsHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<RestPropertyDefinition> corsHeaders;

	/**
	 * The cached value of the '{@link #getValidationLevels() <em>Validation Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<RestPropertyDefinition> validationLevels;

	/**
	 * The default value of the '{@link #getApiComponent() <em>Api Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String API_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiComponent() <em>Api Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiComponent()
	 * @generated
	 * @ordered
	 */
	protected String apiComponent = API_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiContextPath() <em>Api Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiContextPath()
	 * @generated
	 * @ordered
	 */
	protected static final String API_CONTEXT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiContextPath() <em>Api Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiContextPath()
	 * @generated
	 * @ordered
	 */
	protected String apiContextPath = API_CONTEXT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiContextRouteId() <em>Api Context Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiContextRouteId()
	 * @generated
	 * @ordered
	 */
	protected static final String API_CONTEXT_ROUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiContextRouteId() <em>Api Context Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiContextRouteId()
	 * @generated
	 * @ordered
	 */
	protected String apiContextRouteId = API_CONTEXT_ROUTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiHost() <em>Api Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiHost()
	 * @generated
	 * @ordered
	 */
	protected static final String API_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiHost() <em>Api Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiHost()
	 * @generated
	 * @ordered
	 */
	protected String apiHost = API_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiVendorExtension() <em>Api Vendor Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVendorExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String API_VENDOR_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiVendorExtension() <em>Api Vendor Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVendorExtension()
	 * @generated
	 * @ordered
	 */
	protected String apiVendorExtension = API_VENDOR_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindingMode() <em>Binding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingMode()
	 * @generated
	 * @ordered
	 */
	protected static final RestBindingMode BINDING_MODE_EDEFAULT = RestBindingMode.AUTO;

	/**
	 * The cached value of the '{@link #getBindingMode() <em>Binding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingMode()
	 * @generated
	 * @ordered
	 */
	protected RestBindingMode bindingMode = BINDING_MODE_EDEFAULT;

	/**
	 * This is true if the Binding Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bindingModeESet;

	/**
	 * The default value of the '{@link #getBindingPackageScan() <em>Binding Package Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingPackageScan()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_PACKAGE_SCAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingPackageScan() <em>Binding Package Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingPackageScan()
	 * @generated
	 * @ordered
	 */
	protected String bindingPackageScan = BINDING_PACKAGE_SCAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientRequestValidation() <em>Client Request Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientRequestValidation()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_REQUEST_VALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientRequestValidation() <em>Client Request Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientRequestValidation()
	 * @generated
	 * @ordered
	 */
	protected String clientRequestValidation = CLIENT_REQUEST_VALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientResponseValidation() <em>Client Response Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientResponseValidation()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_RESPONSE_VALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientResponseValidation() <em>Client Response Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientResponseValidation()
	 * @generated
	 * @ordered
	 */
	protected String clientResponseValidation = CLIENT_RESPONSE_VALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected String component = COMPONENT_EDEFAULT;

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
	 * The default value of the '{@link #getEnableCORS() <em>Enable CORS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCORS()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_CORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableCORS() <em>Enable CORS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCORS()
	 * @generated
	 * @ordered
	 */
	protected String enableCORS = ENABLE_CORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableNoContentResponse() <em>Enable No Content Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableNoContentResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_NO_CONTENT_RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableNoContentResponse() <em>Enable No Content Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableNoContentResponse()
	 * @generated
	 * @ordered
	 */
	protected String enableNoContentResponse = ENABLE_NO_CONTENT_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostNameResolver() <em>Host Name Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostNameResolver()
	 * @generated
	 * @ordered
	 */
	protected static final RestHostNameResolver HOST_NAME_RESOLVER_EDEFAULT = RestHostNameResolver.ALL_LOCAL_IP;

	/**
	 * The cached value of the '{@link #getHostNameResolver() <em>Host Name Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostNameResolver()
	 * @generated
	 * @ordered
	 */
	protected RestHostNameResolver hostNameResolver = HOST_NAME_RESOLVER_EDEFAULT;

	/**
	 * This is true if the Host Name Resolver attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hostNameResolverESet;

	/**
	 * The default value of the '{@link #getInlineRoutes() <em>Inline Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineRoutes()
	 * @generated
	 * @ordered
	 */
	protected static final String INLINE_ROUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInlineRoutes() <em>Inline Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineRoutes()
	 * @generated
	 * @ordered
	 */
	protected String inlineRoutes = INLINE_ROUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getJsonDataFormat() <em>Json Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonDataFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_DATA_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJsonDataFormat() <em>Json Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonDataFormat()
	 * @generated
	 * @ordered
	 */
	protected String jsonDataFormat = JSON_DATA_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProducerApiDoc() <em>Producer Api Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducerApiDoc()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCER_API_DOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProducerApiDoc() <em>Producer Api Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducerApiDoc()
	 * @generated
	 * @ordered
	 */
	protected String producerApiDoc = PRODUCER_API_DOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getProducerComponent() <em>Producer Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducerComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCER_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProducerComponent() <em>Producer Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducerComponent()
	 * @generated
	 * @ordered
	 */
	protected String producerComponent = PRODUCER_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkipBindingOnErrorCode() <em>Skip Binding On Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipBindingOnErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SKIP_BINDING_ON_ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipBindingOnErrorCode() <em>Skip Binding On Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipBindingOnErrorCode()
	 * @generated
	 * @ordered
	 */
	protected String skipBindingOnErrorCode = SKIP_BINDING_ON_ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseXForwardHeaders() <em>Use XForward Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseXForwardHeaders()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_XFORWARD_HEADERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseXForwardHeaders() <em>Use XForward Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseXForwardHeaders()
	 * @generated
	 * @ordered
	 */
	protected String useXForwardHeaders = USE_XFORWARD_HEADERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlDataFormat() <em>Xml Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlDataFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_DATA_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlDataFormat() <em>Xml Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlDataFormat()
	 * @generated
	 * @ordered
	 */
	protected String xmlDataFormat = XML_DATA_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestConfigurationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getRestConfigurationDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestPropertyDefinition> getComponentProperty() {
		if (componentProperty == null) {
			componentProperty = new EObjectContainmentEList<RestPropertyDefinition>(RestPropertyDefinition.class, this, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT_PROPERTY);
		}
		return componentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestPropertyDefinition> getEndpointProperty() {
		if (endpointProperty == null) {
			endpointProperty = new EObjectContainmentEList<RestPropertyDefinition>(RestPropertyDefinition.class, this, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENDPOINT_PROPERTY);
		}
		return endpointProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestPropertyDefinition> getConsumerProperty() {
		if (consumerProperty == null) {
			consumerProperty = new EObjectContainmentEList<RestPropertyDefinition>(RestPropertyDefinition.class, this, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONSUMER_PROPERTY);
		}
		return consumerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestPropertyDefinition> getDataFormatProperty() {
		if (dataFormatProperty == null) {
			dataFormatProperty = new EObjectContainmentEList<RestPropertyDefinition>(RestPropertyDefinition.class, this, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__DATA_FORMAT_PROPERTY);
		}
		return dataFormatProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestPropertyDefinition> getApiProperty() {
		if (apiProperty == null) {
			apiProperty = new EObjectContainmentEList<RestPropertyDefinition>(RestPropertyDefinition.class, this, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_PROPERTY);
		}
		return apiProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestPropertyDefinition> getCorsHeaders() {
		if (corsHeaders == null) {
			corsHeaders = new EObjectContainmentEList<RestPropertyDefinition>(RestPropertyDefinition.class, this, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CORS_HEADERS);
		}
		return corsHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestPropertyDefinition> getValidationLevels() {
		if (validationLevels == null) {
			validationLevels = new EObjectContainmentEList<RestPropertyDefinition>(RestPropertyDefinition.class, this, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__VALIDATION_LEVELS);
		}
		return validationLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiComponent() {
		return apiComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiComponent(String newApiComponent) {
		String oldApiComponent = apiComponent;
		apiComponent = newApiComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_COMPONENT, oldApiComponent, apiComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiContextPath() {
		return apiContextPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiContextPath(String newApiContextPath) {
		String oldApiContextPath = apiContextPath;
		apiContextPath = newApiContextPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_CONTEXT_PATH, oldApiContextPath, apiContextPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiContextRouteId() {
		return apiContextRouteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiContextRouteId(String newApiContextRouteId) {
		String oldApiContextRouteId = apiContextRouteId;
		apiContextRouteId = newApiContextRouteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_CONTEXT_ROUTE_ID, oldApiContextRouteId, apiContextRouteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiHost() {
		return apiHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiHost(String newApiHost) {
		String oldApiHost = apiHost;
		apiHost = newApiHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_HOST, oldApiHost, apiHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiVendorExtension() {
		return apiVendorExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiVendorExtension(String newApiVendorExtension) {
		String oldApiVendorExtension = apiVendorExtension;
		apiVendorExtension = newApiVendorExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_VENDOR_EXTENSION, oldApiVendorExtension, apiVendorExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestBindingMode getBindingMode() {
		return bindingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindingMode(RestBindingMode newBindingMode) {
		RestBindingMode oldBindingMode = bindingMode;
		bindingMode = newBindingMode == null ? BINDING_MODE_EDEFAULT : newBindingMode;
		boolean oldBindingModeESet = bindingModeESet;
		bindingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_MODE, oldBindingMode, bindingMode, !oldBindingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBindingMode() {
		RestBindingMode oldBindingMode = bindingMode;
		boolean oldBindingModeESet = bindingModeESet;
		bindingMode = BINDING_MODE_EDEFAULT;
		bindingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_MODE, oldBindingMode, BINDING_MODE_EDEFAULT, oldBindingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBindingMode() {
		return bindingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBindingPackageScan() {
		return bindingPackageScan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindingPackageScan(String newBindingPackageScan) {
		String oldBindingPackageScan = bindingPackageScan;
		bindingPackageScan = newBindingPackageScan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_PACKAGE_SCAN, oldBindingPackageScan, bindingPackageScan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientRequestValidation() {
		return clientRequestValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientRequestValidation(String newClientRequestValidation) {
		String oldClientRequestValidation = clientRequestValidation;
		clientRequestValidation = newClientRequestValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CLIENT_REQUEST_VALIDATION, oldClientRequestValidation, clientRequestValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientResponseValidation() {
		return clientResponseValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientResponseValidation(String newClientResponseValidation) {
		String oldClientResponseValidation = clientResponseValidation;
		clientResponseValidation = newClientResponseValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CLIENT_RESPONSE_VALIDATION, oldClientResponseValidation, clientResponseValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(String newComponent) {
		String oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT, oldComponent, component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONTEXT_PATH, oldContextPath, contextPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableCORS() {
		return enableCORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableCORS(String newEnableCORS) {
		String oldEnableCORS = enableCORS;
		enableCORS = newEnableCORS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENABLE_CORS, oldEnableCORS, enableCORS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableNoContentResponse() {
		return enableNoContentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableNoContentResponse(String newEnableNoContentResponse) {
		String oldEnableNoContentResponse = enableNoContentResponse;
		enableNoContentResponse = newEnableNoContentResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENABLE_NO_CONTENT_RESPONSE, oldEnableNoContentResponse, enableNoContentResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestHostNameResolver getHostNameResolver() {
		return hostNameResolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostNameResolver(RestHostNameResolver newHostNameResolver) {
		RestHostNameResolver oldHostNameResolver = hostNameResolver;
		hostNameResolver = newHostNameResolver == null ? HOST_NAME_RESOLVER_EDEFAULT : newHostNameResolver;
		boolean oldHostNameResolverESet = hostNameResolverESet;
		hostNameResolverESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST_NAME_RESOLVER, oldHostNameResolver, hostNameResolver, !oldHostNameResolverESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHostNameResolver() {
		RestHostNameResolver oldHostNameResolver = hostNameResolver;
		boolean oldHostNameResolverESet = hostNameResolverESet;
		hostNameResolver = HOST_NAME_RESOLVER_EDEFAULT;
		hostNameResolverESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST_NAME_RESOLVER, oldHostNameResolver, HOST_NAME_RESOLVER_EDEFAULT, oldHostNameResolverESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHostNameResolver() {
		return hostNameResolverESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInlineRoutes() {
		return inlineRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInlineRoutes(String newInlineRoutes) {
		String oldInlineRoutes = inlineRoutes;
		inlineRoutes = newInlineRoutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__INLINE_ROUTES, oldInlineRoutes, inlineRoutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJsonDataFormat() {
		return jsonDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonDataFormat(String newJsonDataFormat) {
		String oldJsonDataFormat = jsonDataFormat;
		jsonDataFormat = newJsonDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__JSON_DATA_FORMAT, oldJsonDataFormat, jsonDataFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProducerApiDoc() {
		return producerApiDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProducerApiDoc(String newProducerApiDoc) {
		String oldProducerApiDoc = producerApiDoc;
		producerApiDoc = newProducerApiDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PRODUCER_API_DOC, oldProducerApiDoc, producerApiDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProducerComponent() {
		return producerComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProducerComponent(String newProducerComponent) {
		String oldProducerComponent = producerComponent;
		producerComponent = newProducerComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PRODUCER_COMPONENT, oldProducerComponent, producerComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSkipBindingOnErrorCode() {
		return skipBindingOnErrorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkipBindingOnErrorCode(String newSkipBindingOnErrorCode) {
		String oldSkipBindingOnErrorCode = skipBindingOnErrorCode;
		skipBindingOnErrorCode = newSkipBindingOnErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__SKIP_BINDING_ON_ERROR_CODE, oldSkipBindingOnErrorCode, skipBindingOnErrorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseXForwardHeaders() {
		return useXForwardHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseXForwardHeaders(String newUseXForwardHeaders) {
		String oldUseXForwardHeaders = useXForwardHeaders;
		useXForwardHeaders = newUseXForwardHeaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__USE_XFORWARD_HEADERS, oldUseXForwardHeaders, useXForwardHeaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmlDataFormat() {
		return xmlDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlDataFormat(String newXmlDataFormat) {
		String oldXmlDataFormat = xmlDataFormat;
		xmlDataFormat = newXmlDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_CONFIGURATION_DEFINITION__XML_DATA_FORMAT, oldXmlDataFormat, xmlDataFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT_PROPERTY:
				return ((InternalEList<?>)getComponentProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENDPOINT_PROPERTY:
				return ((InternalEList<?>)getEndpointProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONSUMER_PROPERTY:
				return ((InternalEList<?>)getConsumerProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__DATA_FORMAT_PROPERTY:
				return ((InternalEList<?>)getDataFormatProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_PROPERTY:
				return ((InternalEList<?>)getApiProperty()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CORS_HEADERS:
				return ((InternalEList<?>)getCorsHeaders()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__VALIDATION_LEVELS:
				return ((InternalEList<?>)getValidationLevels()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT_PROPERTY:
				return getComponentProperty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENDPOINT_PROPERTY:
				return getEndpointProperty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONSUMER_PROPERTY:
				return getConsumerProperty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__DATA_FORMAT_PROPERTY:
				return getDataFormatProperty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_PROPERTY:
				return getApiProperty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CORS_HEADERS:
				return getCorsHeaders();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__VALIDATION_LEVELS:
				return getValidationLevels();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_COMPONENT:
				return getApiComponent();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_CONTEXT_PATH:
				return getApiContextPath();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_CONTEXT_ROUTE_ID:
				return getApiContextRouteId();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_HOST:
				return getApiHost();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_VENDOR_EXTENSION:
				return getApiVendorExtension();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_MODE:
				return getBindingMode();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_PACKAGE_SCAN:
				return getBindingPackageScan();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CLIENT_REQUEST_VALIDATION:
				return getClientRequestValidation();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				return getClientResponseValidation();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT:
				return getComponent();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONTEXT_PATH:
				return getContextPath();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENABLE_CORS:
				return getEnableCORS();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				return getEnableNoContentResponse();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST:
				return getHost();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST_NAME_RESOLVER:
				return getHostNameResolver();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__INLINE_ROUTES:
				return getInlineRoutes();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__JSON_DATA_FORMAT:
				return getJsonDataFormat();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PORT:
				return getPort();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PRODUCER_API_DOC:
				return getProducerApiDoc();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PRODUCER_COMPONENT:
				return getProducerComponent();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__SCHEME:
				return getScheme();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				return getSkipBindingOnErrorCode();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__USE_XFORWARD_HEADERS:
				return getUseXForwardHeaders();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__XML_DATA_FORMAT:
				return getXmlDataFormat();
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
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT_PROPERTY:
				getComponentProperty().clear();
				getComponentProperty().addAll((Collection<? extends RestPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENDPOINT_PROPERTY:
				getEndpointProperty().clear();
				getEndpointProperty().addAll((Collection<? extends RestPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONSUMER_PROPERTY:
				getConsumerProperty().clear();
				getConsumerProperty().addAll((Collection<? extends RestPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__DATA_FORMAT_PROPERTY:
				getDataFormatProperty().clear();
				getDataFormatProperty().addAll((Collection<? extends RestPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_PROPERTY:
				getApiProperty().clear();
				getApiProperty().addAll((Collection<? extends RestPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CORS_HEADERS:
				getCorsHeaders().clear();
				getCorsHeaders().addAll((Collection<? extends RestPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__VALIDATION_LEVELS:
				getValidationLevels().clear();
				getValidationLevels().addAll((Collection<? extends RestPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_COMPONENT:
				setApiComponent((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_CONTEXT_PATH:
				setApiContextPath((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_CONTEXT_ROUTE_ID:
				setApiContextRouteId((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_HOST:
				setApiHost((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_VENDOR_EXTENSION:
				setApiVendorExtension((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_MODE:
				setBindingMode((RestBindingMode)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_PACKAGE_SCAN:
				setBindingPackageScan((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CLIENT_REQUEST_VALIDATION:
				setClientRequestValidation((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				setClientResponseValidation((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT:
				setComponent((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONTEXT_PATH:
				setContextPath((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENABLE_CORS:
				setEnableCORS((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				setEnableNoContentResponse((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST:
				setHost((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST_NAME_RESOLVER:
				setHostNameResolver((RestHostNameResolver)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__INLINE_ROUTES:
				setInlineRoutes((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__JSON_DATA_FORMAT:
				setJsonDataFormat((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PORT:
				setPort((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PRODUCER_API_DOC:
				setProducerApiDoc((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PRODUCER_COMPONENT:
				setProducerComponent((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__SCHEME:
				setScheme((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				setSkipBindingOnErrorCode((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__USE_XFORWARD_HEADERS:
				setUseXForwardHeaders((String)newValue);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__XML_DATA_FORMAT:
				setXmlDataFormat((String)newValue);
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
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT_PROPERTY:
				getComponentProperty().clear();
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENDPOINT_PROPERTY:
				getEndpointProperty().clear();
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONSUMER_PROPERTY:
				getConsumerProperty().clear();
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__DATA_FORMAT_PROPERTY:
				getDataFormatProperty().clear();
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_PROPERTY:
				getApiProperty().clear();
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CORS_HEADERS:
				getCorsHeaders().clear();
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__VALIDATION_LEVELS:
				getValidationLevels().clear();
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_COMPONENT:
				setApiComponent(API_COMPONENT_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_CONTEXT_PATH:
				setApiContextPath(API_CONTEXT_PATH_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_CONTEXT_ROUTE_ID:
				setApiContextRouteId(API_CONTEXT_ROUTE_ID_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_HOST:
				setApiHost(API_HOST_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_VENDOR_EXTENSION:
				setApiVendorExtension(API_VENDOR_EXTENSION_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_MODE:
				unsetBindingMode();
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_PACKAGE_SCAN:
				setBindingPackageScan(BINDING_PACKAGE_SCAN_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CLIENT_REQUEST_VALIDATION:
				setClientRequestValidation(CLIENT_REQUEST_VALIDATION_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				setClientResponseValidation(CLIENT_RESPONSE_VALIDATION_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT:
				setComponent(COMPONENT_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONTEXT_PATH:
				setContextPath(CONTEXT_PATH_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENABLE_CORS:
				setEnableCORS(ENABLE_CORS_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				setEnableNoContentResponse(ENABLE_NO_CONTENT_RESPONSE_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST_NAME_RESOLVER:
				unsetHostNameResolver();
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__INLINE_ROUTES:
				setInlineRoutes(INLINE_ROUTES_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__JSON_DATA_FORMAT:
				setJsonDataFormat(JSON_DATA_FORMAT_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PRODUCER_API_DOC:
				setProducerApiDoc(PRODUCER_API_DOC_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PRODUCER_COMPONENT:
				setProducerComponent(PRODUCER_COMPONENT_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				setSkipBindingOnErrorCode(SKIP_BINDING_ON_ERROR_CODE_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__USE_XFORWARD_HEADERS:
				setUseXForwardHeaders(USE_XFORWARD_HEADERS_EDEFAULT);
				return;
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__XML_DATA_FORMAT:
				setXmlDataFormat(XML_DATA_FORMAT_EDEFAULT);
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
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT_PROPERTY:
				return componentProperty != null && !componentProperty.isEmpty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENDPOINT_PROPERTY:
				return endpointProperty != null && !endpointProperty.isEmpty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONSUMER_PROPERTY:
				return consumerProperty != null && !consumerProperty.isEmpty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__DATA_FORMAT_PROPERTY:
				return dataFormatProperty != null && !dataFormatProperty.isEmpty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_PROPERTY:
				return apiProperty != null && !apiProperty.isEmpty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CORS_HEADERS:
				return corsHeaders != null && !corsHeaders.isEmpty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__VALIDATION_LEVELS:
				return validationLevels != null && !validationLevels.isEmpty();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_COMPONENT:
				return API_COMPONENT_EDEFAULT == null ? apiComponent != null : !API_COMPONENT_EDEFAULT.equals(apiComponent);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_CONTEXT_PATH:
				return API_CONTEXT_PATH_EDEFAULT == null ? apiContextPath != null : !API_CONTEXT_PATH_EDEFAULT.equals(apiContextPath);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_CONTEXT_ROUTE_ID:
				return API_CONTEXT_ROUTE_ID_EDEFAULT == null ? apiContextRouteId != null : !API_CONTEXT_ROUTE_ID_EDEFAULT.equals(apiContextRouteId);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_HOST:
				return API_HOST_EDEFAULT == null ? apiHost != null : !API_HOST_EDEFAULT.equals(apiHost);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__API_VENDOR_EXTENSION:
				return API_VENDOR_EXTENSION_EDEFAULT == null ? apiVendorExtension != null : !API_VENDOR_EXTENSION_EDEFAULT.equals(apiVendorExtension);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_MODE:
				return isSetBindingMode();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__BINDING_PACKAGE_SCAN:
				return BINDING_PACKAGE_SCAN_EDEFAULT == null ? bindingPackageScan != null : !BINDING_PACKAGE_SCAN_EDEFAULT.equals(bindingPackageScan);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CLIENT_REQUEST_VALIDATION:
				return CLIENT_REQUEST_VALIDATION_EDEFAULT == null ? clientRequestValidation != null : !CLIENT_REQUEST_VALIDATION_EDEFAULT.equals(clientRequestValidation);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				return CLIENT_RESPONSE_VALIDATION_EDEFAULT == null ? clientResponseValidation != null : !CLIENT_RESPONSE_VALIDATION_EDEFAULT.equals(clientResponseValidation);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__COMPONENT:
				return COMPONENT_EDEFAULT == null ? component != null : !COMPONENT_EDEFAULT.equals(component);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__CONTEXT_PATH:
				return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENABLE_CORS:
				return ENABLE_CORS_EDEFAULT == null ? enableCORS != null : !ENABLE_CORS_EDEFAULT.equals(enableCORS);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				return ENABLE_NO_CONTENT_RESPONSE_EDEFAULT == null ? enableNoContentResponse != null : !ENABLE_NO_CONTENT_RESPONSE_EDEFAULT.equals(enableNoContentResponse);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__HOST_NAME_RESOLVER:
				return isSetHostNameResolver();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__INLINE_ROUTES:
				return INLINE_ROUTES_EDEFAULT == null ? inlineRoutes != null : !INLINE_ROUTES_EDEFAULT.equals(inlineRoutes);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__JSON_DATA_FORMAT:
				return JSON_DATA_FORMAT_EDEFAULT == null ? jsonDataFormat != null : !JSON_DATA_FORMAT_EDEFAULT.equals(jsonDataFormat);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PRODUCER_API_DOC:
				return PRODUCER_API_DOC_EDEFAULT == null ? producerApiDoc != null : !PRODUCER_API_DOC_EDEFAULT.equals(producerApiDoc);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__PRODUCER_COMPONENT:
				return PRODUCER_COMPONENT_EDEFAULT == null ? producerComponent != null : !PRODUCER_COMPONENT_EDEFAULT.equals(producerComponent);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				return SKIP_BINDING_ON_ERROR_CODE_EDEFAULT == null ? skipBindingOnErrorCode != null : !SKIP_BINDING_ON_ERROR_CODE_EDEFAULT.equals(skipBindingOnErrorCode);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__USE_XFORWARD_HEADERS:
				return USE_XFORWARD_HEADERS_EDEFAULT == null ? useXForwardHeaders != null : !USE_XFORWARD_HEADERS_EDEFAULT.equals(useXForwardHeaders);
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION__XML_DATA_FORMAT:
				return XML_DATA_FORMAT_EDEFAULT == null ? xmlDataFormat != null : !XML_DATA_FORMAT_EDEFAULT.equals(xmlDataFormat);
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
		result.append(" (apiComponent: ");
		result.append(apiComponent);
		result.append(", apiContextPath: ");
		result.append(apiContextPath);
		result.append(", apiContextRouteId: ");
		result.append(apiContextRouteId);
		result.append(", apiHost: ");
		result.append(apiHost);
		result.append(", apiVendorExtension: ");
		result.append(apiVendorExtension);
		result.append(", bindingMode: ");
		if (bindingModeESet) result.append(bindingMode); else result.append("<unset>");
		result.append(", bindingPackageScan: ");
		result.append(bindingPackageScan);
		result.append(", clientRequestValidation: ");
		result.append(clientRequestValidation);
		result.append(", clientResponseValidation: ");
		result.append(clientResponseValidation);
		result.append(", component: ");
		result.append(component);
		result.append(", contextPath: ");
		result.append(contextPath);
		result.append(", enableCORS: ");
		result.append(enableCORS);
		result.append(", enableNoContentResponse: ");
		result.append(enableNoContentResponse);
		result.append(", host: ");
		result.append(host);
		result.append(", hostNameResolver: ");
		if (hostNameResolverESet) result.append(hostNameResolver); else result.append("<unset>");
		result.append(", inlineRoutes: ");
		result.append(inlineRoutes);
		result.append(", jsonDataFormat: ");
		result.append(jsonDataFormat);
		result.append(", port: ");
		result.append(port);
		result.append(", producerApiDoc: ");
		result.append(producerApiDoc);
		result.append(", producerComponent: ");
		result.append(producerComponent);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(", skipBindingOnErrorCode: ");
		result.append(skipBindingOnErrorCode);
		result.append(", useXForwardHeaders: ");
		result.append(useXForwardHeaders);
		result.append(", xmlDataFormat: ");
		result.append(xmlDataFormat);
		result.append(')');
		return result.toString();
	}

} //RestConfigurationDefinitionImpl

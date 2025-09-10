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
 * A representation of the model object '<em><b>Rest Configuration Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getComponentProperty <em>Component Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getEndpointProperty <em>Endpoint Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getConsumerProperty <em>Consumer Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getDataFormatProperty <em>Data Format Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiProperty <em>Api Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getCorsHeaders <em>Cors Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getValidationLevels <em>Validation Levels</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiComponent <em>Api Component</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiContextPath <em>Api Context Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiContextRouteId <em>Api Context Route Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiHost <em>Api Host</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiVendorExtension <em>Api Vendor Extension</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getBindingMode <em>Binding Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getBindingPackageScan <em>Binding Package Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getClientRequestValidation <em>Client Request Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getClientResponseValidation <em>Client Response Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getEnableCORS <em>Enable CORS</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getEnableNoContentResponse <em>Enable No Content Response</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getHost <em>Host</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getHostNameResolver <em>Host Name Resolver</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getInlineRoutes <em>Inline Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getJsonDataFormat <em>Json Data Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getProducerApiDoc <em>Producer Api Doc</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getProducerComponent <em>Producer Component</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getUseXForwardHeaders <em>Use XForward Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getXmlDataFormat <em>Xml Data Format</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition()
 * @model extendedMetaData="name='restConfigurationDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RestConfigurationDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows to configure as many additional properties for the rest component in use.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Property</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ComponentProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestPropertyDefinition> getComponentProperty();

	/**
	 * Returns the value of the '<em><b>Endpoint Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows to configure as many additional properties for the rest endpoint in use.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint Property</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_EndpointProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpointProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestPropertyDefinition> getEndpointProperty();

	/**
	 * Returns the value of the '<em><b>Consumer Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows to configure as many additional properties for the rest consumer in use.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer Property</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ConsumerProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consumerProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestPropertyDefinition> getConsumerProperty();

	/**
	 * Returns the value of the '<em><b>Data Format Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows to configure as many additional properties for the data formats in use. For example set property prettyPrint to
	 * true to have json outputted in pretty mode. The properties can be prefixed to denote the option is only for either JSON
	 * or XML and for either the IN or the OUT. The prefixes are: json.in. json.out. xml.in. xml.out. For example a key with
	 * value xml.out.mustBeJAXBElement is only for the XML data format for the outgoing. A key without a prefix is a common key
	 * for all situations.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Format Property</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_DataFormatProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataFormatProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestPropertyDefinition> getDataFormatProperty();

	/**
	 * Returns the value of the '<em><b>Api Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows to configure as many additional properties for the api documentation. For example set property api.title to my
	 * cool stuff.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Property</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ApiProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='apiProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestPropertyDefinition> getApiProperty();

	/**
	 * Returns the value of the '<em><b>Cors Headers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows to configure custom CORS headers.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cors Headers</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_CorsHeaders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='corsHeaders' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestPropertyDefinition> getCorsHeaders();

	/**
	 * Returns the value of the '<em><b>Validation Levels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows to configure custom validation levels when using camel-openapi-validator with client request/response validator.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Levels</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ValidationLevels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validationLevels' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestPropertyDefinition> getValidationLevels();

	/**
	 * Returns the value of the '<em><b>Api Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The name of the Camel component to use as the REST API. If no API Component has been explicit configured, then Camel
	 * will lookup if there is a Camel component responsible for servicing and generating the REST API documentation, or if a
	 * org.apache.camel.spi.RestApiProcessorFactory is registered in the registry. If either one is found, then that is being
	 * used.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Component</em>' attribute.
	 * @see #setApiComponent(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ApiComponent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='apiComponent'"
	 * @generated
	 */
	String getApiComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiComponent <em>Api Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Component</em>' attribute.
	 * @see #getApiComponent()
	 * @generated
	 */
	void setApiComponent(String value);

	/**
	 * Returns the value of the '<em><b>Api Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a leading context-path the REST API will be using. This can be used when using components such as camel-servlet
	 * where the deployed web application is deployed using a context-path.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Context Path</em>' attribute.
	 * @see #setApiContextPath(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ApiContextPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='apiContextPath'"
	 * @generated
	 */
	String getApiContextPath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiContextPath <em>Api Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Context Path</em>' attribute.
	 * @see #getApiContextPath()
	 * @generated
	 */
	void setApiContextPath(String value);

	/**
	 * Returns the value of the '<em><b>Api Context Route Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the route id to use for the route that services the REST API. The route will by default use an auto assigned route
	 * id.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Context Route Id</em>' attribute.
	 * @see #setApiContextRouteId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ApiContextRouteId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='apiContextRouteId'"
	 * @generated
	 */
	String getApiContextRouteId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiContextRouteId <em>Api Context Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Context Route Id</em>' attribute.
	 * @see #getApiContextRouteId()
	 * @generated
	 */
	void setApiContextRouteId(String value);

	/**
	 * Returns the value of the '<em><b>Api Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a specific hostname for the API documentation (such as swagger or openapi) This can be used to override the
	 * generated host with this configured hostname.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Host</em>' attribute.
	 * @see #setApiHost(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ApiHost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='apiHost'"
	 * @generated
	 */
	String getApiHost();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiHost <em>Api Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Host</em>' attribute.
	 * @see #getApiHost()
	 * @generated
	 */
	void setApiHost(String value);

	/**
	 * Returns the value of the '<em><b>Api Vendor Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether vendor extension is enabled in the Rest APIs. If enabled then Camel will include additional information as
	 * vendor extension (eg keys starting with x-) such as route ids, class names etc. Not all 3rd party API gateways and tools
	 * supports vendor-extensions when importing your API docs. Default value: false
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Vendor Extension</em>' attribute.
	 * @see #setApiVendorExtension(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ApiVendorExtension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='apiVendorExtension'"
	 * @generated
	 */
	String getApiVendorExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getApiVendorExtension <em>Api Vendor Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Vendor Extension</em>' attribute.
	 * @see #getApiVendorExtension()
	 * @generated
	 */
	void setApiVendorExtension(String value);

	/**
	 * Returns the value of the '<em><b>Binding Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.RestBindingMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the binding mode to use. The default value is off. Default value: off
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Mode</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.RestBindingMode
	 * @see #isSetBindingMode()
	 * @see #unsetBindingMode()
	 * @see #setBindingMode(RestBindingMode)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_BindingMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='bindingMode'"
	 * @generated
	 */
	RestBindingMode getBindingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getBindingMode <em>Binding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Mode</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.RestBindingMode
	 * @see #isSetBindingMode()
	 * @see #unsetBindingMode()
	 * @see #getBindingMode()
	 * @generated
	 */
	void setBindingMode(RestBindingMode value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getBindingMode <em>Binding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBindingMode()
	 * @see #getBindingMode()
	 * @see #setBindingMode(RestBindingMode)
	 * @generated
	 */
	void unsetBindingMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getBindingMode <em>Binding Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Binding Mode</em>' attribute is set.
	 * @see #unsetBindingMode()
	 * @see #getBindingMode()
	 * @see #setBindingMode(RestBindingMode)
	 * @generated
	 */
	boolean isSetBindingMode();

	/**
	 * Returns the value of the '<em><b>Binding Package Scan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Package name to use as base (offset) for classpath scanning of POJO classes are located when using binding mode is
	 * enabled for JSon or XML. Multiple package names can be separated by comma.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Package Scan</em>' attribute.
	 * @see #setBindingPackageScan(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_BindingPackageScan()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bindingPackageScan'"
	 * @generated
	 */
	String getBindingPackageScan();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getBindingPackageScan <em>Binding Package Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Package Scan</em>' attribute.
	 * @see #getBindingPackageScan()
	 * @generated
	 */
	void setBindingPackageScan(String value);

	/**
	 * Returns the value of the '<em><b>Client Request Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to enable validation of the client request to check: 1) Content-Type header matches what the Rest DSL consumes;
	 * returns HTTP Status 415 if validation error. 2) Accept header matches what the Rest DSL produces; returns HTTP Status
	 * 406 if validation error. 3) Missing required data (query parameters, HTTP headers, body); returns HTTP Status 400 if
	 * validation error. 4) Parsing error of the message body (JSon, XML or Auto binding mode must be enabled); returns HTTP
	 * Status 400 if validation error. Default value: false
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Request Validation</em>' attribute.
	 * @see #setClientRequestValidation(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ClientRequestValidation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientRequestValidation'"
	 * @generated
	 */
	String getClientRequestValidation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getClientRequestValidation <em>Client Request Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Request Validation</em>' attribute.
	 * @see #getClientRequestValidation()
	 * @generated
	 */
	void setClientRequestValidation(String value);

	/**
	 * Returns the value of the '<em><b>Client Response Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to check what Camel is returning as response to the client: 1) Status-code and Content-Type matches Rest DSL
	 * response messages. 2) Check whether expected headers is included according to the Rest DSL repose message headers. 3) If
	 * the response body is JSon then check whether its valid JSon. Returns 500 if validation error detected. Default value:
	 * false
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Response Validation</em>' attribute.
	 * @see #setClientResponseValidation(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ClientResponseValidation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientResponseValidation'"
	 * @generated
	 */
	String getClientResponseValidation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getClientResponseValidation <em>Client Response Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Response Validation</em>' attribute.
	 * @see #getClientResponseValidation()
	 * @generated
	 */
	void setClientResponseValidation(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The Camel Rest component to use for the REST transport (consumer), such as netty-http, jetty, servlet, undertow. If no
	 * component has been explicit configured, then Camel will lookup if there is a Camel component that integrates with the
	 * Rest DSL, or if a org.apache.camel.spi.RestConsumerFactory is registered in the registry. If either one is found, then
	 * that is being used.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' attribute.
	 * @see #setComponent(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_Component()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='component'"
	 * @generated
	 */
	String getComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getComponent <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' attribute.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(String value);

	/**
	 * Returns the value of the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a leading context-path the REST services will be using. This can be used when using components such as
	 * camel-servlet where the deployed web application is deployed using a context-path. Or for components such as camel-jetty
	 * or camel-netty-http that includes a HTTP server.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Path</em>' attribute.
	 * @see #setContextPath(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ContextPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contextPath'"
	 * @generated
	 */
	String getContextPath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getContextPath <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Path</em>' attribute.
	 * @see #getContextPath()
	 * @generated
	 */
	void setContextPath(String value);

	/**
	 * Returns the value of the '<em><b>Enable CORS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to enable CORS headers in the HTTP response. The default value is false. Default value: false
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable CORS</em>' attribute.
	 * @see #setEnableCORS(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_EnableCORS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableCORS'"
	 * @generated
	 */
	String getEnableCORS();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getEnableCORS <em>Enable CORS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable CORS</em>' attribute.
	 * @see #getEnableCORS()
	 * @generated
	 */
	void setEnableCORS(String value);

	/**
	 * Returns the value of the '<em><b>Enable No Content Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to return HTTP 204 with an empty body when a response contains an empty JSON object or XML root object. The
	 * default value is false. Default value: false
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable No Content Response</em>' attribute.
	 * @see #setEnableNoContentResponse(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_EnableNoContentResponse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableNoContentResponse'"
	 * @generated
	 */
	String getEnableNoContentResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getEnableNoContentResponse <em>Enable No Content Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable No Content Response</em>' attribute.
	 * @see #getEnableNoContentResponse()
	 * @generated
	 */
	void setEnableNoContentResponse(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The hostname to use for exposing the REST service.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_Host()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='host'"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Host Name Resolver</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.RestHostNameResolver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If no hostname has been explicit configured, then this resolver is used to compute the hostname the REST service will be
	 * using. Default value: allLocalIp
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Name Resolver</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.RestHostNameResolver
	 * @see #isSetHostNameResolver()
	 * @see #unsetHostNameResolver()
	 * @see #setHostNameResolver(RestHostNameResolver)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_HostNameResolver()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='hostNameResolver'"
	 * @generated
	 */
	RestHostNameResolver getHostNameResolver();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getHostNameResolver <em>Host Name Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Name Resolver</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.RestHostNameResolver
	 * @see #isSetHostNameResolver()
	 * @see #unsetHostNameResolver()
	 * @see #getHostNameResolver()
	 * @generated
	 */
	void setHostNameResolver(RestHostNameResolver value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getHostNameResolver <em>Host Name Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHostNameResolver()
	 * @see #getHostNameResolver()
	 * @see #setHostNameResolver(RestHostNameResolver)
	 * @generated
	 */
	void unsetHostNameResolver();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getHostNameResolver <em>Host Name Resolver</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Host Name Resolver</em>' attribute is set.
	 * @see #unsetHostNameResolver()
	 * @see #getHostNameResolver()
	 * @see #setHostNameResolver(RestHostNameResolver)
	 * @generated
	 */
	boolean isSetHostNameResolver();

	/**
	 * Returns the value of the '<em><b>Inline Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Inline routes in rest-dsl which are linked using direct endpoints. Each service in Rest DSL is an individual route,
	 * meaning that you would have at least two routes per service (rest-dsl, and the route linked from rest-dsl). By inlining
	 * (default) allows Camel to optimize and inline this as a single route, however this requires to use direct endpoints,
	 * which must be unique per service. If a route is not using direct endpoint then the rest-dsl is not inlined, and will
	 * become an individual route. This option is default true. Default value: true
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline Routes</em>' attribute.
	 * @see #setInlineRoutes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_InlineRoutes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inlineRoutes'"
	 * @generated
	 */
	String getInlineRoutes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getInlineRoutes <em>Inline Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline Routes</em>' attribute.
	 * @see #getInlineRoutes()
	 * @generated
	 */
	void setInlineRoutes(String value);

	/**
	 * Returns the value of the '<em><b>Json Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of specific json data format to use. By default jackson will be used. Important: This option is only for setting a
	 * custom name of the data format, not to refer to an existing data format instance.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Json Data Format</em>' attribute.
	 * @see #setJsonDataFormat(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_JsonDataFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='jsonDataFormat'"
	 * @generated
	 */
	String getJsonDataFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getJsonDataFormat <em>Json Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Data Format</em>' attribute.
	 * @see #getJsonDataFormat()
	 * @generated
	 */
	void setJsonDataFormat(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The port number to use for exposing the REST service. Notice if you use servlet component then the port number
	 * configured here does not apply, as the port number in use is the actual port number the servlet component is using. eg
	 * if using Apache Tomcat its the tomcat http port, if using Apache Karaf its the HTTP service in Karaf that uses port 8181
	 * by default etc. Though in those situations setting the port number here, allows tooling and JMX to know the port number,
	 * so its recommended to set the port number to the number that the servlet engine uses.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_Port()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='port'"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Producer Api Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the location of the api document the REST producer will use to validate the REST uri and query parameters are valid
	 * accordingly to the api document. The location of the api document is loaded from classpath by default, but you can use
	 * file: or http: to refer to resources to load from file or http url.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Producer Api Doc</em>' attribute.
	 * @see #setProducerApiDoc(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ProducerApiDoc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='producerApiDoc'"
	 * @generated
	 */
	String getProducerApiDoc();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getProducerApiDoc <em>Producer Api Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producer Api Doc</em>' attribute.
	 * @see #getProducerApiDoc()
	 * @generated
	 */
	void setProducerApiDoc(String value);

	/**
	 * Returns the value of the '<em><b>Producer Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the name of the Camel component to use as the REST producer.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Producer Component</em>' attribute.
	 * @see #setProducerComponent(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_ProducerComponent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='producerComponent'"
	 * @generated
	 */
	String getProducerComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getProducerComponent <em>Producer Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producer Component</em>' attribute.
	 * @see #getProducerComponent()
	 * @generated
	 */
	void setProducerComponent(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The scheme to use for exposing the REST service. Usually http or https is supported. The default value is http.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_Scheme()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scheme'"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

	/**
	 * Returns the value of the '<em><b>Skip Binding On Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to skip binding on output if there is a custom HTTP error code header. This allows to build custom error
	 * messages that do not bind to json / xml etc, as success messages otherwise will do. Default value: false
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skip Binding On Error Code</em>' attribute.
	 * @see #setSkipBindingOnErrorCode(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_SkipBindingOnErrorCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='skipBindingOnErrorCode'"
	 * @generated
	 */
	String getSkipBindingOnErrorCode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Binding On Error Code</em>' attribute.
	 * @see #getSkipBindingOnErrorCode()
	 * @generated
	 */
	void setSkipBindingOnErrorCode(String value);

	/**
	 * Returns the value of the '<em><b>Use XForward Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to use X-Forward headers to set host etc. for OpenApi. This may be needed in special cases involving
	 * reverse-proxy and networking going from HTTP to HTTPS etc. Then the proxy can send X-Forward headers (X-Forwarded-Proto)
	 * that influences the host names in the OpenAPI schema that camel-openapi-java generates from Rest DSL routes. Default
	 * value: false
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use XForward Headers</em>' attribute.
	 * @see #setUseXForwardHeaders(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_UseXForwardHeaders()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useXForwardHeaders'"
	 * @generated
	 */
	String getUseXForwardHeaders();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getUseXForwardHeaders <em>Use XForward Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use XForward Headers</em>' attribute.
	 * @see #getUseXForwardHeaders()
	 * @generated
	 */
	void setUseXForwardHeaders(String value);

	/**
	 * Returns the value of the '<em><b>Xml Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of specific XML data format to use. By default jaxb will be used. Important: This option is only for setting a
	 * custom name of the data format, not to refer to an existing data format instance.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml Data Format</em>' attribute.
	 * @see #setXmlDataFormat(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestConfigurationDefinition_XmlDataFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xmlDataFormat'"
	 * @generated
	 */
	String getXmlDataFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition#getXmlDataFormat <em>Xml Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Data Format</em>' attribute.
	 * @see #getXmlDataFormat()
	 * @generated
	 */
	void setXmlDataFormat(String value);

} // RestConfigurationDefinition

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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verb Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getParam <em>Param</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getResponseMessage <em>Response Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getApiDocs <em>Api Docs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getBindingMode <em>Binding Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getClientRequestValidation <em>Client Request Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getClientResponseValidation <em>Client Response Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getEnableCORS <em>Enable CORS</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getEnableNoContentResponse <em>Enable No Content Response</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getOutType <em>Out Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getProduces <em>Produces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getRouteId <em>Route Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getStreamCache <em>Stream Cache</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition()
 * @model abstract="true"
 *        extendedMetaData="name='verbDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VerbDefinition extends OptionalIdentifiedDefinition {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ParamDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To specify the rest operation parameters.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParamDefinition> getParam();

	/**
	 * Returns the value of the '<em><b>Response Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To specify the rest operation response messages.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Message</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_ResponseMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResponseMessageDefinition> getResponseMessage();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SecurityDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_Security()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SecurityDefinition> getSecurity();

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sends the message to a static endpoint
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(ToDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_To()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
	 * @generated
	 */
	ToDefinition getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ToDefinition value);

	/**
	 * Returns the value of the '<em><b>Api Docs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to include or exclude this rest operation in API documentation. The default value is true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Docs</em>' attribute.
	 * @see #setApiDocs(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_ApiDocs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='apiDocs'"
	 * @generated
	 */
	String getApiDocs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getApiDocs <em>Api Docs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Docs</em>' attribute.
	 * @see #getApiDocs()
	 * @generated
	 */
	void setApiDocs(String value);

	/**
	 * Returns the value of the '<em><b>Binding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the binding mode to use. This option will override what may be configured on a parent level The default value is
	 * off. Default value: off
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Mode</em>' attribute.
	 * @see #setBindingMode(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_BindingMode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bindingMode'"
	 * @generated
	 */
	String getBindingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getBindingMode <em>Binding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Mode</em>' attribute.
	 * @see #getBindingMode()
	 * @generated
	 */
	void setBindingMode(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_ClientRequestValidation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientRequestValidation'"
	 * @generated
	 */
	String getClientRequestValidation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getClientRequestValidation <em>Client Request Validation</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_ClientResponseValidation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientResponseValidation'"
	 * @generated
	 */
	String getClientResponseValidation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getClientResponseValidation <em>Client Response Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Response Validation</em>' attribute.
	 * @see #getClientResponseValidation()
	 * @generated
	 */
	void setClientResponseValidation(String value);

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To define the content type what the REST service consumes (accept as input), such as application/xml or
	 * application/json. This option will override what may be configured on a parent level.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumes</em>' attribute.
	 * @see #setConsumes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_Consumes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='consumes'"
	 * @generated
	 */
	String getConsumes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getConsumes <em>Consumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumes</em>' attribute.
	 * @see #getConsumes()
	 * @generated
	 */
	void setConsumes(String value);

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marks this rest operation as deprecated in OpenApi documentation. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_Deprecated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deprecated'"
	 * @generated
	 */
	String getDeprecated();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #getDeprecated()
	 * @generated
	 */
	void setDeprecated(String value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to disable this REST service from the route during build time. Once an REST service has been disabled then it
	 * cannot be enabled later at runtime. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_Disabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='disabled'"
	 * @generated
	 */
	String getDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(String value);

	/**
	 * Returns the value of the '<em><b>Enable CORS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to enable CORS headers in the HTTP response. This option will override what may be configured on a parent level
	 * The default value is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable CORS</em>' attribute.
	 * @see #setEnableCORS(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_EnableCORS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableCORS'"
	 * @generated
	 */
	String getEnableCORS();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getEnableCORS <em>Enable CORS</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_EnableNoContentResponse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableNoContentResponse'"
	 * @generated
	 */
	String getEnableNoContentResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getEnableNoContentResponse <em>Enable No Content Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable No Content Response</em>' attribute.
	 * @see #getEnableNoContentResponse()
	 * @generated
	 */
	void setEnableNoContentResponse(String value);

	/**
	 * Returns the value of the '<em><b>Out Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the class name to use for binding from POJO to output for the outgoing data This option will override what may be
	 * configured on a parent level The name of the class of the input data. Append a to the end of the name if you want the
	 * input to be an array type.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Type</em>' attribute.
	 * @see #setOutType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_OutType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outType'"
	 * @generated
	 */
	String getOutType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getOutType <em>Out Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Type</em>' attribute.
	 * @see #getOutType()
	 * @generated
	 */
	void setOutType(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The path mapping URIs of this REST operation such as /{id}.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To define the content type what the REST service produces (uses for output), such as application/xml or application/json
	 * This option will override what may be configured on a parent level.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produces</em>' attribute.
	 * @see #setProduces(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_Produces()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='produces'"
	 * @generated
	 */
	String getProduces();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getProduces <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produces</em>' attribute.
	 * @see #getProduces()
	 * @generated
	 */
	void setProduces(String value);

	/**
	 * Returns the value of the '<em><b>Route Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the id of the route.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Id</em>' attribute.
	 * @see #setRouteId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_RouteId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='routeId'"
	 * @generated
	 */
	String getRouteId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getRouteId <em>Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Id</em>' attribute.
	 * @see #getRouteId()
	 * @generated
	 */
	void setRouteId(String value);

	/**
	 * Returns the value of the '<em><b>Skip Binding On Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to skip binding on output if there is a custom HTTP error code header. This allows to build custom error
	 * messages that do not bind to json / xml etc, as success messages otherwise will do. This option will override what may
	 * be configured on a parent level. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skip Binding On Error Code</em>' attribute.
	 * @see #setSkipBindingOnErrorCode(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_SkipBindingOnErrorCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='skipBindingOnErrorCode'"
	 * @generated
	 */
	String getSkipBindingOnErrorCode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Binding On Error Code</em>' attribute.
	 * @see #getSkipBindingOnErrorCode()
	 * @generated
	 */
	void setSkipBindingOnErrorCode(String value);

	/**
	 * Returns the value of the '<em><b>Stream Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether stream caching is enabled on this rest operation. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stream Cache</em>' attribute.
	 * @see #setStreamCache(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_StreamCache()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='streamCache'"
	 * @generated
	 */
	String getStreamCache();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getStreamCache <em>Stream Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Cache</em>' attribute.
	 * @see #getStreamCache()
	 * @generated
	 */
	void setStreamCache(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the class name to use for binding from input to POJO for the incoming data This option will override what may be
	 * configured on a parent level. The name of the class of the input data. Append a to the end of the name if you want the
	 * input to be an array type.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getVerbDefinition_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // VerbDefinition

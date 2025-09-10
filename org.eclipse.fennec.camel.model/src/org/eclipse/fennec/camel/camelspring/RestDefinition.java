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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getOpenApi <em>Open Api</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getSecurityRequirements <em>Security Requirements</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getGet <em>Get</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getHead <em>Head</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getPatch <em>Patch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getPost <em>Post</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getPut <em>Put</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getApiDocs <em>Api Docs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getBindingMode <em>Binding Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getClientRequestValidation <em>Client Request Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getClientResponseValidation <em>Client Response Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getEnableCORS <em>Enable CORS</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getEnableNoContentResponse <em>Enable No Content Response</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getProduces <em>Produces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition()
 * @model extendedMetaData="name='restDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RestDefinition extends OptionalIdentifiedDefinition {
	/**
	 * Returns the value of the '<em><b>Open Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use OpenApi as contract-first with Camel Rest DSL.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Api</em>' containment reference.
	 * @see #setOpenApi(OpenApiDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_OpenApi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='openApi' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenApiDefinition getOpenApi();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getOpenApi <em>Open Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Api</em>' containment reference.
	 * @see #getOpenApi()
	 * @generated
	 */
	void setOpenApi(OpenApiDefinition value);

	/**
	 * Returns the value of the '<em><b>Security Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure rest security definitions.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Definitions</em>' containment reference.
	 * @see #setSecurityDefinitions(RestSecuritiesDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_SecurityDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	RestSecuritiesDefinition getSecurityDefinitions();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getSecurityDefinitions <em>Security Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Definitions</em>' containment reference.
	 * @see #getSecurityDefinitions()
	 * @generated
	 */
	void setSecurityDefinitions(RestSecuritiesDefinition value);

	/**
	 * Returns the value of the '<em><b>Security Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SecurityDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the security requirement(s) for all endpoints.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Requirements</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_SecurityRequirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityRequirements' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SecurityDefinition> getSecurityRequirements();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:6'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.DeleteDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest DELETE command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Delete()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<DeleteDefinition> getDelete();

	/**
	 * Returns the value of the '<em><b>Get</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.GetDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest GET command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Get</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Get()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='get' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<GetDefinition> getGet();

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.HeadDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest HEAD command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Head</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Head()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='head' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<HeadDefinition> getHead();

	/**
	 * Returns the value of the '<em><b>Patch</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PatchDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest PATCH command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patch</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Patch()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='patch' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<PatchDefinition> getPatch();

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PostDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest POST command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Post()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='post' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<PostDefinition> getPost();

	/**
	 * Returns the value of the '<em><b>Put</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PutDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest PUT command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Put</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Put()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='put' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<PutDefinition> getPut();

	/**
	 * Returns the value of the '<em><b>Api Docs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to include or exclude this rest operation in API documentation. This option will override what may be configured
	 * on a parent level. The default value is true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Docs</em>' attribute.
	 * @see #setApiDocs(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_ApiDocs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='apiDocs'"
	 * @generated
	 */
	String getApiDocs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getApiDocs <em>Api Docs</em>}' attribute.
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
	 * auto. Default value: off
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Mode</em>' attribute.
	 * @see #setBindingMode(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_BindingMode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bindingMode'"
	 * @generated
	 */
	String getBindingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getBindingMode <em>Binding Mode</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_ClientRequestValidation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientRequestValidation'"
	 * @generated
	 */
	String getClientRequestValidation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getClientRequestValidation <em>Client Request Validation</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_ClientResponseValidation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientResponseValidation'"
	 * @generated
	 */
	String getClientResponseValidation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getClientResponseValidation <em>Client Response Validation</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Consumes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='consumes'"
	 * @generated
	 */
	String getConsumes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getConsumes <em>Consumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumes</em>' attribute.
	 * @see #getConsumes()
	 * @generated
	 */
	void setConsumes(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Disabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='disabled'"
	 * @generated
	 */
	String getDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getDisabled <em>Disabled</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_EnableCORS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableCORS'"
	 * @generated
	 */
	String getEnableCORS();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getEnableCORS <em>Enable CORS</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_EnableNoContentResponse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableNoContentResponse'"
	 * @generated
	 */
	String getEnableNoContentResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getEnableNoContentResponse <em>Enable No Content Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable No Content Response</em>' attribute.
	 * @see #getEnableNoContentResponse()
	 * @generated
	 */
	void setEnableNoContentResponse(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Path of the rest service, such as /foo.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getPath <em>Path</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Produces()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='produces'"
	 * @generated
	 */
	String getProduces();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getProduces <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produces</em>' attribute.
	 * @see #getProduces()
	 * @generated
	 */
	void setProduces(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_SkipBindingOnErrorCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='skipBindingOnErrorCode'"
	 * @generated
	 */
	String getSkipBindingOnErrorCode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Binding On Error Code</em>' attribute.
	 * @see #getSkipBindingOnErrorCode()
	 * @generated
	 */
	void setSkipBindingOnErrorCode(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure a special tag for the operations within this rest definition.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestDefinition_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestDefinition#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

} // RestDefinition

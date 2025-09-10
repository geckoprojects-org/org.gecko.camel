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
 * A representation of the model object '<em><b>Rest Binding Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getBindingMode <em>Binding Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getClientRequestValidation <em>Client Request Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getClientResponseValidation <em>Client Response Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getEnableCORS <em>Enable CORS</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getEnableNoContentResponse <em>Enable No Content Response</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getOutType <em>Out Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getProduces <em>Produces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition()
 * @model extendedMetaData="name='restBindingDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface RestBindingDefinition extends OptionalIdentifiedDefinition {
	/**
	 * Returns the value of the '<em><b>Binding Mode</b></em>' attribute.
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
	 * @see #setBindingMode(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_BindingMode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bindingMode'"
	 * @generated
	 */
	String getBindingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getBindingMode <em>Binding Mode</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_ClientRequestValidation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientRequestValidation'"
	 * @generated
	 */
	String getClientRequestValidation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getClientRequestValidation <em>Client Request Validation</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_ClientResponseValidation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientResponseValidation'"
	 * @generated
	 */
	String getClientResponseValidation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getClientResponseValidation <em>Client Response Validation</em>}' attribute.
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
	 * Sets the component name that this definition will apply to.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' attribute.
	 * @see #setComponent(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_Component()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='component'"
	 * @generated
	 */
	String getComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getComponent <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' attribute.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(String value);

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To define the content type what the REST service consumes (accept as input), such as application/xml or
	 * application/json.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumes</em>' attribute.
	 * @see #setConsumes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_Consumes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='consumes'"
	 * @generated
	 */
	String getConsumes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getConsumes <em>Consumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumes</em>' attribute.
	 * @see #getConsumes()
	 * @generated
	 */
	void setConsumes(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_EnableCORS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableCORS'"
	 * @generated
	 */
	String getEnableCORS();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getEnableCORS <em>Enable CORS</em>}' attribute.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_EnableNoContentResponse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='enableNoContentResponse'"
	 * @generated
	 */
	String getEnableNoContentResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getEnableNoContentResponse <em>Enable No Content Response</em>}' attribute.
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
	 * Sets the class name to use for binding from POJO to output for the outgoing data The name of the class of the input
	 * data. Append a to the end of the name if you want the input to be an array type.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Type</em>' attribute.
	 * @see #setOutType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_OutType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outType'"
	 * @generated
	 */
	String getOutType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getOutType <em>Out Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Type</em>' attribute.
	 * @see #getOutType()
	 * @generated
	 */
	void setOutType(String value);

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To define the content type what the REST service produces (uses for output), such as application/xml or
	 * application/json.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produces</em>' attribute.
	 * @see #setProduces(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_Produces()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='produces'"
	 * @generated
	 */
	String getProduces();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getProduces <em>Produces</em>}' attribute.
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
	 * messages that do not bind to json / xml etc, as success messages otherwise will do. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skip Binding On Error Code</em>' attribute.
	 * @see #setSkipBindingOnErrorCode(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_SkipBindingOnErrorCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='skipBindingOnErrorCode'"
	 * @generated
	 */
	String getSkipBindingOnErrorCode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Binding On Error Code</em>' attribute.
	 * @see #getSkipBindingOnErrorCode()
	 * @generated
	 */
	void setSkipBindingOnErrorCode(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the class name to use for binding from input to POJO for the incoming data The name of the class of the input data.
	 * Append a to the end of the name if you want the input to be an array type.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestBindingDefinition_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // RestBindingDefinition

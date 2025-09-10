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
 * A representation of the model object '<em><b>Response Message Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition#getResponseModel <em>Response Model</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseMessageDefinition()
 * @model extendedMetaData="name='responseMessageDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ResponseMessageDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Adds a response header.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseMessageDefinition_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResponseHeaderDefinition> getHeader();

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Examples of response messages.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseMessageDefinition_Examples()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='examples' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestPropertyDefinition> getExamples();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The response code such as a HTTP status code. Default value: 200
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseMessageDefinition_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The response content-type such as application/json.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseMessageDefinition_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contentType'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The response message (description).
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseMessageDefinition_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Response Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The response model.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Model</em>' attribute.
	 * @see #setResponseModel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getResponseMessageDefinition_ResponseModel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='responseModel'"
	 * @generated
	 */
	String getResponseModel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition#getResponseModel <em>Response Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Model</em>' attribute.
	 * @see #getResponseModel()
	 * @generated
	 */
	void setResponseModel(String value);

} // ResponseMessageDefinition

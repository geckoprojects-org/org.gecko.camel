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
 * A representation of the model object '<em><b>Open Api Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getApiContextPath <em>Api Context Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getMissingOperation <em>Missing Operation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getMockIncludePattern <em>Mock Include Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getRouteId <em>Route Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOpenApiDefinition()
 * @model extendedMetaData="name='openApiDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface OpenApiDefinition extends OptionalIdentifiedDefinition {
	/**
	 * Returns the value of the '<em><b>Api Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to enable api-doc that exposes the OpenAPI specification file as a REST endpoint. This allows clients to obtain
	 * the specification from the running Camel application.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Context Path</em>' attribute.
	 * @see #setApiContextPath(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOpenApiDefinition_ApiContextPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='apiContextPath'"
	 * @generated
	 */
	String getApiContextPath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getApiContextPath <em>Api Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Context Path</em>' attribute.
	 * @see #getApiContextPath()
	 * @generated
	 */
	void setApiContextPath(String value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to disable all the REST services from the OpenAPI contract from the route during build time. Once an REST
	 * service has been disabled then it cannot be enabled later at runtime. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOpenApiDefinition_Disabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='disabled'"
	 * @generated
	 */
	String getDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(String value);

	/**
	 * Returns the value of the '<em><b>Missing Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to fail, ignore or return a mock response for OpenAPI operations that are not mapped to a corresponding route.
	 * Default value: fail
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Missing Operation</em>' attribute.
	 * @see #setMissingOperation(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOpenApiDefinition_MissingOperation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='missingOperation'"
	 * @generated
	 */
	String getMissingOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getMissingOperation <em>Missing Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Operation</em>' attribute.
	 * @see #getMissingOperation()
	 * @generated
	 */
	void setMissingOperation(String value);

	/**
	 * Returns the value of the '<em><b>Mock Include Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Used for inclusive filtering of mock data from directories. The pattern is using Ant-path style pattern. Multiple
	 * patterns can be specified separated by comma. Default value: classpath:camel-mock/**
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mock Include Pattern</em>' attribute.
	 * @see #setMockIncludePattern(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOpenApiDefinition_MockIncludePattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mockIncludePattern'"
	 * @generated
	 */
	String getMockIncludePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getMockIncludePattern <em>Mock Include Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mock Include Pattern</em>' attribute.
	 * @see #getMockIncludePattern()
	 * @generated
	 */
	void setMockIncludePattern(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOpenApiDefinition_RouteId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='routeId'"
	 * @generated
	 */
	String getRouteId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getRouteId <em>Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Id</em>' attribute.
	 * @see #getRouteId()
	 * @generated
	 */
	void setRouteId(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Path to the OpenApi specification file.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOpenApiDefinition_Specification()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='specification'"
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

} // OpenApiDefinition

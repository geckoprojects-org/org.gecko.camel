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
 * A representation of the model object '<em><b>Route Configuration Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteConfigurationDefinition()
 * @model extendedMetaData="name='routeConfigurationDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RouteConfigurationDefinition extends OptionalIdentifiedDefinition {
	/**
	 * Returns the value of the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel error handling.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Handler</em>' containment reference.
	 * @see #isSetErrorHandler()
	 * @see #unsetErrorHandler()
	 * @see #setErrorHandler(EObject)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteConfigurationDefinition_ErrorHandler()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='errorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getErrorHandler <em>Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler</em>' containment reference.
	 * @see #isSetErrorHandler()
	 * @see #unsetErrorHandler()
	 * @see #getErrorHandler()
	 * @generated
	 */
	void setErrorHandler(EObject value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getErrorHandler <em>Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorHandler()
	 * @see #getErrorHandler()
	 * @see #setErrorHandler(EObject)
	 * @generated
	 */
	void unsetErrorHandler();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getErrorHandler <em>Error Handler</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Handler</em>' containment reference is set.
	 * @see #unsetErrorHandler()
	 * @see #getErrorHandler()
	 * @see #setErrorHandler(EObject)
	 * @generated
	 */
	boolean isSetErrorHandler();

	/**
	 * Returns the value of the '<em><b>Intercept</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.InterceptDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Intercepts a message at each step in the route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intercept</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteConfigurationDefinition_Intercept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterceptDefinition> getIntercept();

	/**
	 * Returns the value of the '<em><b>Intercept From</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.InterceptFromDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Intercepts incoming messages
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intercept From</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteConfigurationDefinition_InterceptFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterceptFromDefinition> getInterceptFrom();

	/**
	 * Returns the value of the '<em><b>Intercept Send To Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.InterceptSendToEndpointDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Intercepts messages being sent to an endpoint
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intercept Send To Endpoint</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteConfigurationDefinition_InterceptSendToEndpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interceptSendToEndpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterceptSendToEndpointDefinition> getInterceptSendToEndpoint();

	/**
	 * Returns the value of the '<em><b>On Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.OnExceptionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route to be executed when an exception is thrown
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Exception</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteConfigurationDefinition_OnException()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnExceptionDefinition> getOnException();

	/**
	 * Returns the value of the '<em><b>On Completion</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.OnCompletionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route to be executed when normal route processing completes
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Completion</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteConfigurationDefinition_OnCompletion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnCompletionDefinition> getOnCompletion();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The predicate of the precondition in simple language to evaluate in order to determine if this route configuration
	 * should be included or not.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' attribute.
	 * @see #setPrecondition(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteConfigurationDefinition_Precondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='precondition'"
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

} // RouteConfigurationDefinition

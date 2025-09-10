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
 * A representation of the model object '<em><b>Route Template Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition#getTemplateBean <em>Template Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteTemplateDefinition()
 * @model extendedMetaData="name='routeTemplateDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RouteTemplateDefinition extends OptionalIdentifiedDefinition {
	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteTemplateParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A route template parameter
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Parameter</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteTemplateDefinition_TemplateParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templateParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteTemplateParameterDefinition> getTemplateParameter();

	/**
	 * Returns the value of the '<em><b>Template Bean</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Adds a local bean the route template uses.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Bean</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteTemplateDefinition_TemplateBean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templateBean' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BeanFactoryDefinition> getTemplateBean();

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A Camel route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(RouteDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteTemplateDefinition_Route()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteDefinition getRoute();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(RouteDefinition value);

} // RouteTemplateDefinition

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
 * A representation of the model object '<em><b>Route Configurations Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationsDefinition#getRouteConfiguration <em>Route Configuration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteConfigurationsDefinition()
 * @model extendedMetaData="name='routeConfigurationsDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RouteConfigurationsDefinition extends OptionalIdentifiedDefinition {
	/**
	 * Returns the value of the '<em><b>Route Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reusable configuration for Camel route(s).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Configuration</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRouteConfigurationsDefinition_RouteConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='routeConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteConfigurationDefinition> getRouteConfiguration();

} // RouteConfigurationsDefinition

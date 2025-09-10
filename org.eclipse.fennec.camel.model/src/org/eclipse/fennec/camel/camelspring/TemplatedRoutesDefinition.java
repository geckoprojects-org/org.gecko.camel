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
 * A representation of the model object '<em><b>Templated Routes Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TemplatedRoutesDefinition#getTemplatedRoute <em>Templated Route</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTemplatedRoutesDefinition()
 * @model extendedMetaData="name='templatedRoutesDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TemplatedRoutesDefinition extends OptionalIdentifiedDefinition {
	/**
	 * Returns the value of the '<em><b>Templated Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a templated route (a route built from a route template)
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Templated Route</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTemplatedRoutesDefinition_TemplatedRoute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templatedRoute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TemplatedRouteDefinition> getTemplatedRoute();

} // TemplatedRoutesDefinition

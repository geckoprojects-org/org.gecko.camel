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
package org.eclipse.fennec.camel.whiteboard.pipeline;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for different route definition formats
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinition#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getRouteDefinition()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface RouteDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinitionFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Format of this route definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinitionFormat
	 * @see #setFormat(RouteDefinitionFormat)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getRouteDefinition_Format()
	 * @model required="true"
	 * @generated
	 */
	RouteDefinitionFormat getFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinition#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.RouteDefinitionFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(RouteDefinitionFormat value);

} // RouteDefinition

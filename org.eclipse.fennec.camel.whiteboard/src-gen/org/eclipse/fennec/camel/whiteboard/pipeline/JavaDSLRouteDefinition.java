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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java DSL Route Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Route definition using Java DSL pattern
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.JavaDSLRouteDefinition#getBuilderClassName <em>Builder Class Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getJavaDSLRouteDefinition()
 * @model
 * @generated
 */
@ProviderType
public interface JavaDSLRouteDefinition extends RouteDefinition {
	/**
	 * Returns the value of the '<em><b>Builder Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fully qualified class name of the RouteBuilder implementation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Builder Class Name</em>' attribute.
	 * @see #setBuilderClassName(String)
	 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getJavaDSLRouteDefinition_BuilderClassName()
	 * @model required="true"
	 * @generated
	 */
	String getBuilderClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.whiteboard.pipeline.JavaDSLRouteDefinition#getBuilderClassName <em>Builder Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder Class Name</em>' attribute.
	 * @see #getBuilderClassName()
	 * @generated
	 */
	void setBuilderClassName(String value);

} // JavaDSLRouteDefinition

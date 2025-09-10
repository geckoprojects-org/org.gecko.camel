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
 * A representation of the model object '<em><b>Wasm Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.WasmExpression#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWasmExpression()
 * @model extendedMetaData="name='wasmExpression' kind='simple'"
 * @generated
 */
@ProviderType
public interface WasmExpression extends TypedExpressionDefinition {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the module (the distributable, loadable, and executable unit of code in WebAssembly) resource that provides the
	 * expression function.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getWasmExpression_Module()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='module'"
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.WasmExpression#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

} // WasmExpression

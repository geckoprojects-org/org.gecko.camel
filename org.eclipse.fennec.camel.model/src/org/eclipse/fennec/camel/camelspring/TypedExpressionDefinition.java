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
 * A representation of the model object '<em><b>Typed Expression Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TypedExpressionDefinition#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTypedExpressionDefinition()
 * @model abstract="true"
 *        extendedMetaData="name='typedExpressionDefinition' kind='simple'"
 * @generated
 */
@ProviderType
public interface TypedExpressionDefinition extends Expression {
	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the class of the result type (type from output).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Type</em>' attribute.
	 * @see #setResultType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTypedExpressionDefinition_ResultType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resultType'"
	 * @generated
	 */
	String getResultType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TypedExpressionDefinition#getResultType <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' attribute.
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(String value);

} // TypedExpressionDefinition

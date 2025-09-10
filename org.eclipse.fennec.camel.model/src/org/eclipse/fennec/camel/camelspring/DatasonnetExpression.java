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
 * A representation of the model object '<em><b>Datasonnet Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DatasonnetExpression#getBodyMediaType <em>Body Media Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DatasonnetExpression#getOutputMediaType <em>Output Media Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDatasonnetExpression()
 * @model extendedMetaData="name='datasonnetExpression' kind='simple'"
 * @generated
 */
@ProviderType
public interface DatasonnetExpression extends SingleInputTypedExpressionDefinition {
	/**
	 * Returns the value of the '<em><b>Body Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The String representation of the message's body MediaType.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Media Type</em>' attribute.
	 * @see #setBodyMediaType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDatasonnetExpression_BodyMediaType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bodyMediaType'"
	 * @generated
	 */
	String getBodyMediaType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DatasonnetExpression#getBodyMediaType <em>Body Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Media Type</em>' attribute.
	 * @see #getBodyMediaType()
	 * @generated
	 */
	void setBodyMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Output Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The String representation of the MediaType to output.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Media Type</em>' attribute.
	 * @see #setOutputMediaType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDatasonnetExpression_OutputMediaType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outputMediaType'"
	 * @generated
	 */
	String getOutputMediaType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DatasonnetExpression#getOutputMediaType <em>Output Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Media Type</em>' attribute.
	 * @see #getOutputMediaType()
	 * @generated
	 */
	void setOutputMediaType(String value);

} // DatasonnetExpression

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
 * A representation of the model object '<em><b>Dfdl Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DfdlDataFormat#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DfdlDataFormat#getRootNamespace <em>Root Namespace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DfdlDataFormat#getSchemaUri <em>Schema Uri</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDfdlDataFormat()
 * @model extendedMetaData="name='dfdlDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface DfdlDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The root element name of the schema to use. If not specified, the first root element in the schema will be used.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Element</em>' attribute.
	 * @see #setRootElement(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDfdlDataFormat_RootElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rootElement'"
	 * @generated
	 */
	String getRootElement();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DfdlDataFormat#getRootElement <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' attribute.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(String value);

	/**
	 * Returns the value of the '<em><b>Root Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The root namespace of the schema to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Namespace</em>' attribute.
	 * @see #setRootNamespace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDfdlDataFormat_RootNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rootNamespace'"
	 * @generated
	 */
	String getRootNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DfdlDataFormat#getRootNamespace <em>Root Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Namespace</em>' attribute.
	 * @see #getRootNamespace()
	 * @generated
	 */
	void setRootNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Schema Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The path to the DFDL schema file.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Uri</em>' attribute.
	 * @see #setSchemaUri(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDfdlDataFormat_SchemaUri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaUri'"
	 * @generated
	 */
	String getSchemaUri();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DfdlDataFormat#getSchemaUri <em>Schema Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Uri</em>' attribute.
	 * @see #getSchemaUri()
	 * @generated
	 */
	void setSchemaUri(String value);

} // DfdlDataFormat

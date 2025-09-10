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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Transformer#getFromType <em>From Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Transformer#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Transformer#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.Transformer#getToType <em>To Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformer()
 * @model abstract="true"
 *        extendedMetaData="name='transformer' kind='empty'"
 * @generated
 */
@ProviderType
public interface Transformer extends EObject {
	/**
	 * Returns the value of the '<em><b>From Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the 'from' data type name. If you specify 'xml:XYZ', the transformer will be picked up if source type is 'xml:XYZ'.
	 * If you specify just 'xml', the transformer matches with all of 'xml' source type like 'xml:ABC' or 'xml:DEF'.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Type</em>' attribute.
	 * @see #setFromType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformer_FromType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='fromType'"
	 * @generated
	 */
	String getFromType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Transformer#getFromType <em>From Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Type</em>' attribute.
	 * @see #getFromType()
	 * @generated
	 */
	void setFromType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the transformer name under which the transformer gets referenced when specifying the input/output data type on
	 * routes. If you specify a transformer name that matches a data type scheme like 'csv' the transformer will be picked up
	 * for all of 'csv:' from/to Java transformation. Note that the scheme matching is performed only when no exactly matched
	 * transformer exists.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformer_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Transformer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set a scheme name supported by the transformer. If you specify 'csv', the transformer will be picked up for all of 'csv'
	 * from/to Java transformation. Note that the scheme matching is performed only when no exactly matched transformer exists.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformer_Scheme()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scheme'"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Transformer#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

	/**
	 * Returns the value of the '<em><b>To Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the 'to' data type name. If you specify 'json:XYZ', the transformer will be picked up if destination type is
	 * 'json:XYZ'. If you specify just 'json', the transformer matches with all of 'json' destination type like 'json:ABC' or
	 * 'json:DEF'.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Type</em>' attribute.
	 * @see #setToType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTransformer_ToType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='toType'"
	 * @generated
	 */
	String getToType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.Transformer#getToType <em>To Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Type</em>' attribute.
	 * @see #getToType()
	 * @generated
	 */
	void setToType(String value);

} // Transformer

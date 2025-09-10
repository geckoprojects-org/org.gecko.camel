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
 * A representation of the model object '<em><b>Bindy Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat#getAllowEmptyStream <em>Allow Empty Stream</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat#getClassType <em>Class Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat#getUnwrapSingleInstance <em>Unwrap Single Instance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBindyDataFormat()
 * @model extendedMetaData="name='bindyDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface BindyDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Allow Empty Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to allow empty streams in the unmarshal process. If true, no exception will be thrown when a body without
	 * records is provided. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Empty Stream</em>' attribute.
	 * @see #setAllowEmptyStream(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBindyDataFormat_AllowEmptyStream()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowEmptyStream'"
	 * @generated
	 */
	String getAllowEmptyStream();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat#getAllowEmptyStream <em>Allow Empty Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Empty Stream</em>' attribute.
	 * @see #getAllowEmptyStream()
	 * @generated
	 */
	void setAllowEmptyStream(String value);

	/**
	 * Returns the value of the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of model class to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Type</em>' attribute.
	 * @see #setClassType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBindyDataFormat_ClassType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='classType'"
	 * @generated
	 */
	String getClassType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat#getClassType <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type</em>' attribute.
	 * @see #getClassType()
	 * @generated
	 */
	void setClassType(String value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure a default locale to use, such as us for united states. To use the JVM platform default locale then use the
	 * name default.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBindyDataFormat_Locale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='locale'"
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to use Csv, Fixed, or KeyValue.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBindyDataFormat_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Unwrap Single Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * When unmarshalling should a single instance be unwrapped and returned instead of wrapped in a java.util.List. Default
	 * value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unwrap Single Instance</em>' attribute.
	 * @see #setUnwrapSingleInstance(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBindyDataFormat_UnwrapSingleInstance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unwrapSingleInstance'"
	 * @generated
	 */
	String getUnwrapSingleInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat#getUnwrapSingleInstance <em>Unwrap Single Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unwrap Single Instance</em>' attribute.
	 * @see #getUnwrapSingleInstance()
	 * @generated
	 */
	void setUnwrapSingleInstance(String value);

} // BindyDataFormat

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
 * A representation of the model object '<em><b>Json Api Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonApiDataFormat#getDataFormatTypes <em>Data Format Types</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JsonApiDataFormat#getMainFormatType <em>Main Format Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonApiDataFormat()
 * @model extendedMetaData="name='jsonApiDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface JsonApiDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Data Format Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The classes to take into account for the marshalling. Multiple classes can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Format Types</em>' attribute.
	 * @see #setDataFormatTypes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonApiDataFormat_DataFormatTypes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dataFormatTypes'"
	 * @generated
	 */
	String getDataFormatTypes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonApiDataFormat#getDataFormatTypes <em>Data Format Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format Types</em>' attribute.
	 * @see #getDataFormatTypes()
	 * @generated
	 */
	void setDataFormatTypes(String value);

	/**
	 * Returns the value of the '<em><b>Main Format Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The class to take into account while unmarshalling.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main Format Type</em>' attribute.
	 * @see #setMainFormatType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonApiDataFormat_MainFormatType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mainFormatType'"
	 * @generated
	 */
	String getMainFormatType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JsonApiDataFormat#getMainFormatType <em>Main Format Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Format Type</em>' attribute.
	 * @see #getMainFormatType()
	 * @generated
	 */
	void setMainFormatType(String value);

} // JsonApiDataFormat

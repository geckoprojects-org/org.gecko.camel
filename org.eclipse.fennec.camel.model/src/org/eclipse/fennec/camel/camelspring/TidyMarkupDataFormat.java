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
 * A representation of the model object '<em><b>Tidy Markup Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TidyMarkupDataFormat#getDataObjectType <em>Data Object Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.TidyMarkupDataFormat#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTidyMarkupDataFormat()
 * @model extendedMetaData="name='tidyMarkupDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface TidyMarkupDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Data Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * What data type to unmarshal as, can either be org.w3c.dom.Node or java.lang.String. Is by default org.w3c.dom.Node.
	 * Default value: org.w3c.dom.Node
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Object Type</em>' attribute.
	 * @see #setDataObjectType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTidyMarkupDataFormat_DataObjectType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dataObjectType'"
	 * @generated
	 */
	String getDataObjectType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TidyMarkupDataFormat#getDataObjectType <em>Data Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Object Type</em>' attribute.
	 * @see #getDataObjectType()
	 * @generated
	 */
	void setDataObjectType(String value);

	/**
	 * Returns the value of the '<em><b>Omit Xml Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * When returning a String, do we omit the XML declaration in the top. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Omit Xml Declaration</em>' attribute.
	 * @see #setOmitXmlDeclaration(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTidyMarkupDataFormat_OmitXmlDeclaration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='omitXmlDeclaration'"
	 * @generated
	 */
	String getOmitXmlDeclaration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.TidyMarkupDataFormat#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Xml Declaration</em>' attribute.
	 * @see #getOmitXmlDeclaration()
	 * @generated
	 */
	void setOmitXmlDeclaration(String value);

} // TidyMarkupDataFormat

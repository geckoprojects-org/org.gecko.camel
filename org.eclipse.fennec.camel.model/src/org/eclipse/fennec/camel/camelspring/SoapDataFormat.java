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
 * A representation of the model object '<em><b>Soap Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getElementNameStrategyRef <em>Element Name Strategy Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getNamespacePrefixRef <em>Namespace Prefix Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSoapDataFormat()
 * @model extendedMetaData="name='soapDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface SoapDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Package name where your JAXB classes are located.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Path</em>' attribute.
	 * @see #setContextPath(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSoapDataFormat_ContextPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='contextPath'"
	 * @generated
	 */
	String getContextPath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getContextPath <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Path</em>' attribute.
	 * @see #getContextPath()
	 * @generated
	 */
	void setContextPath(String value);

	/**
	 * Returns the value of the '<em><b>Element Name Strategy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to an element strategy to lookup from the registry. An element name strategy is used for two purposes. The first
	 * is to find a xml element name for a given object and soap action when marshaling the object into a SOAP message. The
	 * second is to find an Exception class for a given soap fault name. The following three element strategy class name is
	 * provided out of the box. QNameStrategy - Uses a fixed qName that is configured on instantiation. Exception lookup is not
	 * supported TypeNameStrategy - Uses the name and namespace from the XMLType annotation of the given type. If no namespace
	 * is set then package-info is used. Exception lookup is not supported ServiceInterfaceStrategy - Uses information from a
	 * webservice interface to determine the type name and to find the exception class for a SOAP fault All three classes is
	 * located in the package name org.apache.camel.dataformat.soap.name If you have generated the web service stub code with
	 * cxf-codegen or a similar tool then you probably will want to use the ServiceInterfaceStrategy. In the case you have no
	 * annotated service interface you should use QNameStrategy or TypeNameStrategy.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Name Strategy Ref</em>' attribute.
	 * @see #setElementNameStrategyRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSoapDataFormat_ElementNameStrategyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='elementNameStrategyRef'"
	 * @generated
	 */
	String getElementNameStrategyRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getElementNameStrategyRef <em>Element Name Strategy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name Strategy Ref</em>' attribute.
	 * @see #getElementNameStrategyRef()
	 * @generated
	 */
	void setElementNameStrategyRef(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To overrule and use a specific encoding.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSoapDataFormat_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Namespace Prefix Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * When marshalling using JAXB or SOAP then the JAXB implementation will automatic assign namespace prefixes, such as ns2,
	 * ns3, ns4 etc. To control this mapping, Camel allows you to refer to a map which contains the desired mapping.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace Prefix Ref</em>' attribute.
	 * @see #setNamespacePrefixRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSoapDataFormat_NamespacePrefixRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='namespacePrefixRef'"
	 * @generated
	 */
	String getNamespacePrefixRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getNamespacePrefixRef <em>Namespace Prefix Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Prefix Ref</em>' attribute.
	 * @see #getNamespacePrefixRef()
	 * @generated
	 */
	void setNamespacePrefixRef(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To validate against an existing schema. Your can use the prefix classpath:, file: or http: to specify how the resource
	 * should be resolved. You can separate multiple schema files by using the ',' character.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSoapDataFormat_Schema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schema'"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * SOAP version should either be 1.1 or 1.2. Is by default 1.1. Default value: 1.1
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSoapDataFormat_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // SoapDataFormat

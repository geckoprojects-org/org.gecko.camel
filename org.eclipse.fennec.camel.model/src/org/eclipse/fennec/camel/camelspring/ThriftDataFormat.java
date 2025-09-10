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
 * A representation of the model object '<em><b>Thrift Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThriftDataFormat#getContentTypeFormat <em>Content Type Format</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThriftDataFormat#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ThriftDataFormat#getInstanceClass <em>Instance Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThriftDataFormat()
 * @model extendedMetaData="name='thriftDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface ThriftDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Content Type Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a content type format in which thrift message will be serialized/deserialized from(to) the Java been. The format
	 * can either be native or json for either native binary thrift, json or simple json fields representation. The default
	 * value is binary. Default value: binary
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type Format</em>' attribute.
	 * @see #setContentTypeFormat(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThriftDataFormat_ContentTypeFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contentTypeFormat'"
	 * @generated
	 */
	String getContentTypeFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThriftDataFormat#getContentTypeFormat <em>Content Type Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type Format</em>' attribute.
	 * @see #getContentTypeFormat()
	 * @generated
	 */
	void setContentTypeFormat(String value);

	/**
	 * Returns the value of the '<em><b>Content Type Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the data format should set the Content-Type header with the type from the data format. For example
	 * application/xml for data formats marshalling to XML, or application/json for data formats marshalling to JSON. Default
	 * value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type Header</em>' attribute.
	 * @see #setContentTypeHeader(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThriftDataFormat_ContentTypeHeader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contentTypeHeader'"
	 * @generated
	 */
	String getContentTypeHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThriftDataFormat#getContentTypeHeader <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type Header</em>' attribute.
	 * @see #getContentTypeHeader()
	 * @generated
	 */
	void setContentTypeHeader(String value);

	/**
	 * Returns the value of the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of class to use when unmarshalling.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Class</em>' attribute.
	 * @see #setInstanceClass(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThriftDataFormat_InstanceClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='instanceClass'"
	 * @generated
	 */
	String getInstanceClass();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ThriftDataFormat#getInstanceClass <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class</em>' attribute.
	 * @see #getInstanceClass()
	 * @generated
	 */
	void setInstanceClass(String value);

} // ThriftDataFormat

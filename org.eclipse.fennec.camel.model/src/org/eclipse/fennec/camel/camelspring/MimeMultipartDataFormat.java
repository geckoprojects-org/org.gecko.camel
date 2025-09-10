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
 * A representation of the model object '<em><b>Mime Multipart Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat#getBinaryContent <em>Binary Content</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat#getHeadersInline <em>Headers Inline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat#getIncludeHeaders <em>Include Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat#getMultipartSubType <em>Multipart Sub Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat#getMultipartWithoutAttachment <em>Multipart Without Attachment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMimeMultipartDataFormat()
 * @model extendedMetaData="name='mimeMultipartDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface MimeMultipartDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Binary Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines whether the content of binary parts in the MIME multipart is binary (true) or Base-64 encoded (false) Default is
	 * false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Content</em>' attribute.
	 * @see #setBinaryContent(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMimeMultipartDataFormat_BinaryContent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='binaryContent'"
	 * @generated
	 */
	String getBinaryContent();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat#getBinaryContent <em>Binary Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Content</em>' attribute.
	 * @see #getBinaryContent()
	 * @generated
	 */
	void setBinaryContent(String value);

	/**
	 * Returns the value of the '<em><b>Headers Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines whether the MIME-Multipart headers are part of the message body (true) or are set as Camel headers (false).
	 * Default is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Headers Inline</em>' attribute.
	 * @see #setHeadersInline(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMimeMultipartDataFormat_HeadersInline()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='headersInline'"
	 * @generated
	 */
	String getHeadersInline();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat#getHeadersInline <em>Headers Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers Inline</em>' attribute.
	 * @see #getHeadersInline()
	 * @generated
	 */
	void setHeadersInline(String value);

	/**
	 * Returns the value of the '<em><b>Include Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A regex that defines which Camel headers are also included as MIME headers into the MIME multipart. This will only work
	 * if headersInline is set to true. Default is to include no headers.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Headers</em>' attribute.
	 * @see #setIncludeHeaders(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMimeMultipartDataFormat_IncludeHeaders()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='includeHeaders'"
	 * @generated
	 */
	String getIncludeHeaders();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat#getIncludeHeaders <em>Include Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Headers</em>' attribute.
	 * @see #getIncludeHeaders()
	 * @generated
	 */
	void setIncludeHeaders(String value);

	/**
	 * Returns the value of the '<em><b>Multipart Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Specify the subtype of the MIME Multipart. Default is mixed. Default value: mixed
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multipart Sub Type</em>' attribute.
	 * @see #setMultipartSubType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMimeMultipartDataFormat_MultipartSubType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='multipartSubType'"
	 * @generated
	 */
	String getMultipartSubType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat#getMultipartSubType <em>Multipart Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multipart Sub Type</em>' attribute.
	 * @see #getMultipartSubType()
	 * @generated
	 */
	void setMultipartSubType(String value);

	/**
	 * Returns the value of the '<em><b>Multipart Without Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines whether a message without attachment is also marshaled into a MIME Multipart (with only one body part). Default
	 * is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multipart Without Attachment</em>' attribute.
	 * @see #setMultipartWithoutAttachment(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMimeMultipartDataFormat_MultipartWithoutAttachment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='multipartWithoutAttachment'"
	 * @generated
	 */
	String getMultipartWithoutAttachment();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat#getMultipartWithoutAttachment <em>Multipart Without Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multipart Without Attachment</em>' attribute.
	 * @see #getMultipartWithoutAttachment()
	 * @generated
	 */
	void setMultipartWithoutAttachment(String value);

} // MimeMultipartDataFormat

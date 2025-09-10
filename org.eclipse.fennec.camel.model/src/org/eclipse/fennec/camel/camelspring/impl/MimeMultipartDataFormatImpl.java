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
package org.eclipse.fennec.camel.camelspring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mime Multipart Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MimeMultipartDataFormatImpl#getBinaryContent <em>Binary Content</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MimeMultipartDataFormatImpl#getHeadersInline <em>Headers Inline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MimeMultipartDataFormatImpl#getIncludeHeaders <em>Include Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MimeMultipartDataFormatImpl#getMultipartSubType <em>Multipart Sub Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.MimeMultipartDataFormatImpl#getMultipartWithoutAttachment <em>Multipart Without Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MimeMultipartDataFormatImpl extends DataFormatImpl implements MimeMultipartDataFormat {
	/**
	 * The default value of the '{@link #getBinaryContent() <em>Binary Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryContent()
	 * @generated
	 * @ordered
	 */
	protected static final String BINARY_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinaryContent() <em>Binary Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryContent()
	 * @generated
	 * @ordered
	 */
	protected String binaryContent = BINARY_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeadersInline() <em>Headers Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadersInline()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADERS_INLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeadersInline() <em>Headers Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadersInline()
	 * @generated
	 * @ordered
	 */
	protected String headersInline = HEADERS_INLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeHeaders() <em>Include Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeHeaders()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_HEADERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeHeaders() <em>Include Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeHeaders()
	 * @generated
	 * @ordered
	 */
	protected String includeHeaders = INCLUDE_HEADERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipartSubType() <em>Multipart Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipartSubType()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPART_SUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipartSubType() <em>Multipart Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipartSubType()
	 * @generated
	 * @ordered
	 */
	protected String multipartSubType = MULTIPART_SUB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipartWithoutAttachment() <em>Multipart Without Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipartWithoutAttachment()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPART_WITHOUT_ATTACHMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipartWithoutAttachment() <em>Multipart Without Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipartWithoutAttachment()
	 * @generated
	 * @ordered
	 */
	protected String multipartWithoutAttachment = MULTIPART_WITHOUT_ATTACHMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MimeMultipartDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getMimeMultipartDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBinaryContent() {
		return binaryContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinaryContent(String newBinaryContent) {
		String oldBinaryContent = binaryContent;
		binaryContent = newBinaryContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__BINARY_CONTENT, oldBinaryContent, binaryContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeadersInline() {
		return headersInline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadersInline(String newHeadersInline) {
		String oldHeadersInline = headersInline;
		headersInline = newHeadersInline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__HEADERS_INLINE, oldHeadersInline, headersInline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncludeHeaders() {
		return includeHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeHeaders(String newIncludeHeaders) {
		String oldIncludeHeaders = includeHeaders;
		includeHeaders = newIncludeHeaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__INCLUDE_HEADERS, oldIncludeHeaders, includeHeaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultipartSubType() {
		return multipartSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipartSubType(String newMultipartSubType) {
		String oldMultipartSubType = multipartSubType;
		multipartSubType = newMultipartSubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__MULTIPART_SUB_TYPE, oldMultipartSubType, multipartSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultipartWithoutAttachment() {
		return multipartWithoutAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipartWithoutAttachment(String newMultipartWithoutAttachment) {
		String oldMultipartWithoutAttachment = multipartWithoutAttachment;
		multipartWithoutAttachment = newMultipartWithoutAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__MULTIPART_WITHOUT_ATTACHMENT, oldMultipartWithoutAttachment, multipartWithoutAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__BINARY_CONTENT:
				return getBinaryContent();
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__HEADERS_INLINE:
				return getHeadersInline();
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__INCLUDE_HEADERS:
				return getIncludeHeaders();
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__MULTIPART_SUB_TYPE:
				return getMultipartSubType();
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__MULTIPART_WITHOUT_ATTACHMENT:
				return getMultipartWithoutAttachment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__BINARY_CONTENT:
				setBinaryContent((String)newValue);
				return;
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__HEADERS_INLINE:
				setHeadersInline((String)newValue);
				return;
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__INCLUDE_HEADERS:
				setIncludeHeaders((String)newValue);
				return;
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__MULTIPART_SUB_TYPE:
				setMultipartSubType((String)newValue);
				return;
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__MULTIPART_WITHOUT_ATTACHMENT:
				setMultipartWithoutAttachment((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__BINARY_CONTENT:
				setBinaryContent(BINARY_CONTENT_EDEFAULT);
				return;
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__HEADERS_INLINE:
				setHeadersInline(HEADERS_INLINE_EDEFAULT);
				return;
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__INCLUDE_HEADERS:
				setIncludeHeaders(INCLUDE_HEADERS_EDEFAULT);
				return;
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__MULTIPART_SUB_TYPE:
				setMultipartSubType(MULTIPART_SUB_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__MULTIPART_WITHOUT_ATTACHMENT:
				setMultipartWithoutAttachment(MULTIPART_WITHOUT_ATTACHMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__BINARY_CONTENT:
				return BINARY_CONTENT_EDEFAULT == null ? binaryContent != null : !BINARY_CONTENT_EDEFAULT.equals(binaryContent);
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__HEADERS_INLINE:
				return HEADERS_INLINE_EDEFAULT == null ? headersInline != null : !HEADERS_INLINE_EDEFAULT.equals(headersInline);
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__INCLUDE_HEADERS:
				return INCLUDE_HEADERS_EDEFAULT == null ? includeHeaders != null : !INCLUDE_HEADERS_EDEFAULT.equals(includeHeaders);
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__MULTIPART_SUB_TYPE:
				return MULTIPART_SUB_TYPE_EDEFAULT == null ? multipartSubType != null : !MULTIPART_SUB_TYPE_EDEFAULT.equals(multipartSubType);
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT__MULTIPART_WITHOUT_ATTACHMENT:
				return MULTIPART_WITHOUT_ATTACHMENT_EDEFAULT == null ? multipartWithoutAttachment != null : !MULTIPART_WITHOUT_ATTACHMENT_EDEFAULT.equals(multipartWithoutAttachment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (binaryContent: ");
		result.append(binaryContent);
		result.append(", headersInline: ");
		result.append(headersInline);
		result.append(", includeHeaders: ");
		result.append(includeHeaders);
		result.append(", multipartSubType: ");
		result.append(multipartSubType);
		result.append(", multipartWithoutAttachment: ");
		result.append(multipartWithoutAttachment);
		result.append(')');
		return result.toString();
	}

} //MimeMultipartDataFormatImpl

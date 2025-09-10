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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat;
import org.eclipse.fennec.camel.camelspring.UniVocityHeader;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uni Vocity Abstract Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getUnivocityHeader <em>Univocity Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getAsMap <em>As Map</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getEmptyValue <em>Empty Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getHeaderExtractionEnabled <em>Header Extraction Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getHeadersDisabled <em>Headers Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getIgnoreLeadingWhitespaces <em>Ignore Leading Whitespaces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getIgnoreTrailingWhitespaces <em>Ignore Trailing Whitespaces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getLazyLoad <em>Lazy Load</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getLineSeparator <em>Line Separator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getNormalizedLineSeparator <em>Normalized Line Separator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getNumberOfRecordsToRead <em>Number Of Records To Read</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UniVocityAbstractDataFormatImpl#getSkipEmptyLines <em>Skip Empty Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UniVocityAbstractDataFormatImpl extends DataFormatImpl implements UniVocityAbstractDataFormat {
	/**
	 * The cached value of the '{@link #getUnivocityHeader() <em>Univocity Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnivocityHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<UniVocityHeader> univocityHeader;

	/**
	 * The default value of the '{@link #getAsMap() <em>As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsMap() <em>As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsMap()
	 * @generated
	 * @ordered
	 */
	protected String asMap = AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmptyValue() <em>Empty Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyValue()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPTY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmptyValue() <em>Empty Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyValue()
	 * @generated
	 * @ordered
	 */
	protected String emptyValue = EMPTY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderExtractionEnabled() <em>Header Extraction Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderExtractionEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EXTRACTION_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderExtractionEnabled() <em>Header Extraction Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderExtractionEnabled()
	 * @generated
	 * @ordered
	 */
	protected String headerExtractionEnabled = HEADER_EXTRACTION_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeadersDisabled() <em>Headers Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadersDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADERS_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeadersDisabled() <em>Headers Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadersDisabled()
	 * @generated
	 * @ordered
	 */
	protected String headersDisabled = HEADERS_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreLeadingWhitespaces() <em>Ignore Leading Whitespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreLeadingWhitespaces()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_LEADING_WHITESPACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreLeadingWhitespaces() <em>Ignore Leading Whitespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreLeadingWhitespaces()
	 * @generated
	 * @ordered
	 */
	protected String ignoreLeadingWhitespaces = IGNORE_LEADING_WHITESPACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreTrailingWhitespaces() <em>Ignore Trailing Whitespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreTrailingWhitespaces()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_TRAILING_WHITESPACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreTrailingWhitespaces() <em>Ignore Trailing Whitespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreTrailingWhitespaces()
	 * @generated
	 * @ordered
	 */
	protected String ignoreTrailingWhitespaces = IGNORE_TRAILING_WHITESPACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLazyLoad() <em>Lazy Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazyLoad()
	 * @generated
	 * @ordered
	 */
	protected static final String LAZY_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLazyLoad() <em>Lazy Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazyLoad()
	 * @generated
	 * @ordered
	 */
	protected String lazyLoad = LAZY_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineSeparator() <em>Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineSeparator() <em>Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSeparator()
	 * @generated
	 * @ordered
	 */
	protected String lineSeparator = LINE_SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalizedLineSeparator() <em>Normalized Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizedLineSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String NORMALIZED_LINE_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormalizedLineSeparator() <em>Normalized Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizedLineSeparator()
	 * @generated
	 * @ordered
	 */
	protected String normalizedLineSeparator = NORMALIZED_LINE_SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullValue() <em>Null Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValue()
	 * @generated
	 * @ordered
	 */
	protected static final String NULL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullValue() <em>Null Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValue()
	 * @generated
	 * @ordered
	 */
	protected String nullValue = NULL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfRecordsToRead() <em>Number Of Records To Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRecordsToRead()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_OF_RECORDS_TO_READ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfRecordsToRead() <em>Number Of Records To Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRecordsToRead()
	 * @generated
	 * @ordered
	 */
	protected String numberOfRecordsToRead = NUMBER_OF_RECORDS_TO_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkipEmptyLines() <em>Skip Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipEmptyLines()
	 * @generated
	 * @ordered
	 */
	protected static final String SKIP_EMPTY_LINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipEmptyLines() <em>Skip Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipEmptyLines()
	 * @generated
	 * @ordered
	 */
	protected String skipEmptyLines = SKIP_EMPTY_LINES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniVocityAbstractDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getUniVocityAbstractDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UniVocityHeader> getUnivocityHeader() {
		if (univocityHeader == null) {
			univocityHeader = new EObjectContainmentEList<UniVocityHeader>(UniVocityHeader.class, this, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__UNIVOCITY_HEADER);
		}
		return univocityHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAsMap() {
		return asMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsMap(String newAsMap) {
		String oldAsMap = asMap;
		asMap = newAsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__AS_MAP, oldAsMap, asMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmptyValue() {
		return emptyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmptyValue(String newEmptyValue) {
		String oldEmptyValue = emptyValue;
		emptyValue = newEmptyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__EMPTY_VALUE, oldEmptyValue, emptyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderExtractionEnabled() {
		return headerExtractionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderExtractionEnabled(String newHeaderExtractionEnabled) {
		String oldHeaderExtractionEnabled = headerExtractionEnabled;
		headerExtractionEnabled = newHeaderExtractionEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__HEADER_EXTRACTION_ENABLED, oldHeaderExtractionEnabled, headerExtractionEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeadersDisabled() {
		return headersDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadersDisabled(String newHeadersDisabled) {
		String oldHeadersDisabled = headersDisabled;
		headersDisabled = newHeadersDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__HEADERS_DISABLED, oldHeadersDisabled, headersDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreLeadingWhitespaces() {
		return ignoreLeadingWhitespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreLeadingWhitespaces(String newIgnoreLeadingWhitespaces) {
		String oldIgnoreLeadingWhitespaces = ignoreLeadingWhitespaces;
		ignoreLeadingWhitespaces = newIgnoreLeadingWhitespaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__IGNORE_LEADING_WHITESPACES, oldIgnoreLeadingWhitespaces, ignoreLeadingWhitespaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreTrailingWhitespaces() {
		return ignoreTrailingWhitespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreTrailingWhitespaces(String newIgnoreTrailingWhitespaces) {
		String oldIgnoreTrailingWhitespaces = ignoreTrailingWhitespaces;
		ignoreTrailingWhitespaces = newIgnoreTrailingWhitespaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__IGNORE_TRAILING_WHITESPACES, oldIgnoreTrailingWhitespaces, ignoreTrailingWhitespaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLazyLoad() {
		return lazyLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLazyLoad(String newLazyLoad) {
		String oldLazyLoad = lazyLoad;
		lazyLoad = newLazyLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__LAZY_LOAD, oldLazyLoad, lazyLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineSeparator() {
		return lineSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineSeparator(String newLineSeparator) {
		String oldLineSeparator = lineSeparator;
		lineSeparator = newLineSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__LINE_SEPARATOR, oldLineSeparator, lineSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNormalizedLineSeparator() {
		return normalizedLineSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNormalizedLineSeparator(String newNormalizedLineSeparator) {
		String oldNormalizedLineSeparator = normalizedLineSeparator;
		normalizedLineSeparator = newNormalizedLineSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NORMALIZED_LINE_SEPARATOR, oldNormalizedLineSeparator, normalizedLineSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNullValue() {
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullValue(String newNullValue) {
		String oldNullValue = nullValue;
		nullValue = newNullValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NULL_VALUE, oldNullValue, nullValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumberOfRecordsToRead() {
		return numberOfRecordsToRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfRecordsToRead(String newNumberOfRecordsToRead) {
		String oldNumberOfRecordsToRead = numberOfRecordsToRead;
		numberOfRecordsToRead = newNumberOfRecordsToRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NUMBER_OF_RECORDS_TO_READ, oldNumberOfRecordsToRead, numberOfRecordsToRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSkipEmptyLines() {
		return skipEmptyLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkipEmptyLines(String newSkipEmptyLines) {
		String oldSkipEmptyLines = skipEmptyLines;
		skipEmptyLines = newSkipEmptyLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__SKIP_EMPTY_LINES, oldSkipEmptyLines, skipEmptyLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__UNIVOCITY_HEADER:
				return ((InternalEList<?>)getUnivocityHeader()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__UNIVOCITY_HEADER:
				return getUnivocityHeader();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__AS_MAP:
				return getAsMap();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__COMMENT:
				return getComment();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__EMPTY_VALUE:
				return getEmptyValue();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__HEADER_EXTRACTION_ENABLED:
				return getHeaderExtractionEnabled();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__HEADERS_DISABLED:
				return getHeadersDisabled();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__IGNORE_LEADING_WHITESPACES:
				return getIgnoreLeadingWhitespaces();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__IGNORE_TRAILING_WHITESPACES:
				return getIgnoreTrailingWhitespaces();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__LAZY_LOAD:
				return getLazyLoad();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__LINE_SEPARATOR:
				return getLineSeparator();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NORMALIZED_LINE_SEPARATOR:
				return getNormalizedLineSeparator();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NULL_VALUE:
				return getNullValue();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NUMBER_OF_RECORDS_TO_READ:
				return getNumberOfRecordsToRead();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__SKIP_EMPTY_LINES:
				return getSkipEmptyLines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__UNIVOCITY_HEADER:
				getUnivocityHeader().clear();
				getUnivocityHeader().addAll((Collection<? extends UniVocityHeader>)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__AS_MAP:
				setAsMap((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__COMMENT:
				setComment((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__EMPTY_VALUE:
				setEmptyValue((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__HEADER_EXTRACTION_ENABLED:
				setHeaderExtractionEnabled((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__HEADERS_DISABLED:
				setHeadersDisabled((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__IGNORE_LEADING_WHITESPACES:
				setIgnoreLeadingWhitespaces((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__IGNORE_TRAILING_WHITESPACES:
				setIgnoreTrailingWhitespaces((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__LAZY_LOAD:
				setLazyLoad((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__LINE_SEPARATOR:
				setLineSeparator((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NORMALIZED_LINE_SEPARATOR:
				setNormalizedLineSeparator((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NULL_VALUE:
				setNullValue((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NUMBER_OF_RECORDS_TO_READ:
				setNumberOfRecordsToRead((String)newValue);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__SKIP_EMPTY_LINES:
				setSkipEmptyLines((String)newValue);
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
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__UNIVOCITY_HEADER:
				getUnivocityHeader().clear();
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__AS_MAP:
				setAsMap(AS_MAP_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__EMPTY_VALUE:
				setEmptyValue(EMPTY_VALUE_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__HEADER_EXTRACTION_ENABLED:
				setHeaderExtractionEnabled(HEADER_EXTRACTION_ENABLED_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__HEADERS_DISABLED:
				setHeadersDisabled(HEADERS_DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__IGNORE_LEADING_WHITESPACES:
				setIgnoreLeadingWhitespaces(IGNORE_LEADING_WHITESPACES_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__IGNORE_TRAILING_WHITESPACES:
				setIgnoreTrailingWhitespaces(IGNORE_TRAILING_WHITESPACES_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__LAZY_LOAD:
				setLazyLoad(LAZY_LOAD_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__LINE_SEPARATOR:
				setLineSeparator(LINE_SEPARATOR_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NORMALIZED_LINE_SEPARATOR:
				setNormalizedLineSeparator(NORMALIZED_LINE_SEPARATOR_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NULL_VALUE:
				setNullValue(NULL_VALUE_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NUMBER_OF_RECORDS_TO_READ:
				setNumberOfRecordsToRead(NUMBER_OF_RECORDS_TO_READ_EDEFAULT);
				return;
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__SKIP_EMPTY_LINES:
				setSkipEmptyLines(SKIP_EMPTY_LINES_EDEFAULT);
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
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__UNIVOCITY_HEADER:
				return univocityHeader != null && !univocityHeader.isEmpty();
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__AS_MAP:
				return AS_MAP_EDEFAULT == null ? asMap != null : !AS_MAP_EDEFAULT.equals(asMap);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__EMPTY_VALUE:
				return EMPTY_VALUE_EDEFAULT == null ? emptyValue != null : !EMPTY_VALUE_EDEFAULT.equals(emptyValue);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__HEADER_EXTRACTION_ENABLED:
				return HEADER_EXTRACTION_ENABLED_EDEFAULT == null ? headerExtractionEnabled != null : !HEADER_EXTRACTION_ENABLED_EDEFAULT.equals(headerExtractionEnabled);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__HEADERS_DISABLED:
				return HEADERS_DISABLED_EDEFAULT == null ? headersDisabled != null : !HEADERS_DISABLED_EDEFAULT.equals(headersDisabled);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__IGNORE_LEADING_WHITESPACES:
				return IGNORE_LEADING_WHITESPACES_EDEFAULT == null ? ignoreLeadingWhitespaces != null : !IGNORE_LEADING_WHITESPACES_EDEFAULT.equals(ignoreLeadingWhitespaces);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__IGNORE_TRAILING_WHITESPACES:
				return IGNORE_TRAILING_WHITESPACES_EDEFAULT == null ? ignoreTrailingWhitespaces != null : !IGNORE_TRAILING_WHITESPACES_EDEFAULT.equals(ignoreTrailingWhitespaces);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__LAZY_LOAD:
				return LAZY_LOAD_EDEFAULT == null ? lazyLoad != null : !LAZY_LOAD_EDEFAULT.equals(lazyLoad);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__LINE_SEPARATOR:
				return LINE_SEPARATOR_EDEFAULT == null ? lineSeparator != null : !LINE_SEPARATOR_EDEFAULT.equals(lineSeparator);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NORMALIZED_LINE_SEPARATOR:
				return NORMALIZED_LINE_SEPARATOR_EDEFAULT == null ? normalizedLineSeparator != null : !NORMALIZED_LINE_SEPARATOR_EDEFAULT.equals(normalizedLineSeparator);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NULL_VALUE:
				return NULL_VALUE_EDEFAULT == null ? nullValue != null : !NULL_VALUE_EDEFAULT.equals(nullValue);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__NUMBER_OF_RECORDS_TO_READ:
				return NUMBER_OF_RECORDS_TO_READ_EDEFAULT == null ? numberOfRecordsToRead != null : !NUMBER_OF_RECORDS_TO_READ_EDEFAULT.equals(numberOfRecordsToRead);
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT__SKIP_EMPTY_LINES:
				return SKIP_EMPTY_LINES_EDEFAULT == null ? skipEmptyLines != null : !SKIP_EMPTY_LINES_EDEFAULT.equals(skipEmptyLines);
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
		result.append(" (asMap: ");
		result.append(asMap);
		result.append(", comment: ");
		result.append(comment);
		result.append(", emptyValue: ");
		result.append(emptyValue);
		result.append(", headerExtractionEnabled: ");
		result.append(headerExtractionEnabled);
		result.append(", headersDisabled: ");
		result.append(headersDisabled);
		result.append(", ignoreLeadingWhitespaces: ");
		result.append(ignoreLeadingWhitespaces);
		result.append(", ignoreTrailingWhitespaces: ");
		result.append(ignoreTrailingWhitespaces);
		result.append(", lazyLoad: ");
		result.append(lazyLoad);
		result.append(", lineSeparator: ");
		result.append(lineSeparator);
		result.append(", normalizedLineSeparator: ");
		result.append(normalizedLineSeparator);
		result.append(", nullValue: ");
		result.append(nullValue);
		result.append(", numberOfRecordsToRead: ");
		result.append(numberOfRecordsToRead);
		result.append(", skipEmptyLines: ");
		result.append(skipEmptyLines);
		result.append(')');
		return result.toString();
	}

} //UniVocityAbstractDataFormatImpl

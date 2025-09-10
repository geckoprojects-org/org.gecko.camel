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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CsvDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Csv Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getAllowMissingColumnNames <em>Allow Missing Column Names</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getCaptureHeaderRecord <em>Capture Header Record</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getCommentMarker <em>Comment Marker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getCommentMarkerDisabled <em>Comment Marker Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getEscape <em>Escape</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getEscapeDisabled <em>Escape Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getFormatName <em>Format Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getFormatRef <em>Format Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getHeaderDisabled <em>Header Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getIgnoreEmptyLines <em>Ignore Empty Lines</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getIgnoreHeaderCase <em>Ignore Header Case</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getIgnoreSurroundingSpaces <em>Ignore Surrounding Spaces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getLazyLoad <em>Lazy Load</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getMarshallerFactoryRef <em>Marshaller Factory Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getNullString <em>Null String</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getNullStringDisabled <em>Null String Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getQuoteDisabled <em>Quote Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getQuoteMode <em>Quote Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getRecordConverterRef <em>Record Converter Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getRecordSeparator <em>Record Separator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getRecordSeparatorDisabled <em>Record Separator Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getSkipHeaderRecord <em>Skip Header Record</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getTrailingDelimiter <em>Trailing Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getTrim <em>Trim</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getUseMaps <em>Use Maps</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.CsvDataFormatImpl#getUseOrderedMaps <em>Use Ordered Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CsvDataFormatImpl extends DataFormatImpl implements CsvDataFormat {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<String> header;

	/**
	 * The default value of the '{@link #getAllowMissingColumnNames() <em>Allow Missing Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMissingColumnNames()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_MISSING_COLUMN_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowMissingColumnNames() <em>Allow Missing Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMissingColumnNames()
	 * @generated
	 * @ordered
	 */
	protected String allowMissingColumnNames = ALLOW_MISSING_COLUMN_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptureHeaderRecord() <em>Capture Header Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptureHeaderRecord()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTURE_HEADER_RECORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptureHeaderRecord() <em>Capture Header Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptureHeaderRecord()
	 * @generated
	 * @ordered
	 */
	protected String captureHeaderRecord = CAPTURE_HEADER_RECORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentMarker() <em>Comment Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentMarker()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_MARKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentMarker() <em>Comment Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentMarker()
	 * @generated
	 * @ordered
	 */
	protected String commentMarker = COMMENT_MARKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentMarkerDisabled() <em>Comment Marker Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentMarkerDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_MARKER_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentMarkerDisabled() <em>Comment Marker Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentMarkerDisabled()
	 * @generated
	 * @ordered
	 */
	protected String commentMarkerDisabled = COMMENT_MARKER_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String delimiter = DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEscape() <em>Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscape()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscape() <em>Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscape()
	 * @generated
	 * @ordered
	 */
	protected String escape = ESCAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEscapeDisabled() <em>Escape Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPE_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscapeDisabled() <em>Escape Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeDisabled()
	 * @generated
	 * @ordered
	 */
	protected String escapeDisabled = ESCAPE_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormatName() <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatName() <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatName()
	 * @generated
	 * @ordered
	 */
	protected String formatName = FORMAT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormatRef() <em>Format Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatRef() <em>Format Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatRef()
	 * @generated
	 * @ordered
	 */
	protected String formatRef = FORMAT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderDisabled() <em>Header Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderDisabled() <em>Header Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderDisabled()
	 * @generated
	 * @ordered
	 */
	protected String headerDisabled = HEADER_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreEmptyLines() <em>Ignore Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreEmptyLines()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_EMPTY_LINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreEmptyLines() <em>Ignore Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreEmptyLines()
	 * @generated
	 * @ordered
	 */
	protected String ignoreEmptyLines = IGNORE_EMPTY_LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreHeaderCase() <em>Ignore Header Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreHeaderCase()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_HEADER_CASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreHeaderCase() <em>Ignore Header Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreHeaderCase()
	 * @generated
	 * @ordered
	 */
	protected String ignoreHeaderCase = IGNORE_HEADER_CASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreSurroundingSpaces() <em>Ignore Surrounding Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreSurroundingSpaces()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_SURROUNDING_SPACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreSurroundingSpaces() <em>Ignore Surrounding Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreSurroundingSpaces()
	 * @generated
	 * @ordered
	 */
	protected String ignoreSurroundingSpaces = IGNORE_SURROUNDING_SPACES_EDEFAULT;

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
	 * The default value of the '{@link #getMarshallerFactoryRef() <em>Marshaller Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarshallerFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String MARSHALLER_FACTORY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarshallerFactoryRef() <em>Marshaller Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarshallerFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected String marshallerFactoryRef = MARSHALLER_FACTORY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullString() <em>Null String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullString()
	 * @generated
	 * @ordered
	 */
	protected static final String NULL_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullString() <em>Null String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullString()
	 * @generated
	 * @ordered
	 */
	protected String nullString = NULL_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullStringDisabled() <em>Null String Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullStringDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final String NULL_STRING_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullStringDisabled() <em>Null String Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullStringDisabled()
	 * @generated
	 * @ordered
	 */
	protected String nullStringDisabled = NULL_STRING_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuote() <em>Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuote()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuote() <em>Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuote()
	 * @generated
	 * @ordered
	 */
	protected String quote = QUOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuoteDisabled() <em>Quote Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteDisabled() <em>Quote Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteDisabled()
	 * @generated
	 * @ordered
	 */
	protected String quoteDisabled = QUOTE_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuoteMode() <em>Quote Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteMode()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteMode() <em>Quote Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteMode()
	 * @generated
	 * @ordered
	 */
	protected String quoteMode = QUOTE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordConverterRef() <em>Record Converter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordConverterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_CONVERTER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordConverterRef() <em>Record Converter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordConverterRef()
	 * @generated
	 * @ordered
	 */
	protected String recordConverterRef = RECORD_CONVERTER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordSeparator() <em>Record Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordSeparator() <em>Record Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordSeparator()
	 * @generated
	 * @ordered
	 */
	protected String recordSeparator = RECORD_SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordSeparatorDisabled() <em>Record Separator Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordSeparatorDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_SEPARATOR_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordSeparatorDisabled() <em>Record Separator Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordSeparatorDisabled()
	 * @generated
	 * @ordered
	 */
	protected String recordSeparatorDisabled = RECORD_SEPARATOR_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkipHeaderRecord() <em>Skip Header Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipHeaderRecord()
	 * @generated
	 * @ordered
	 */
	protected static final String SKIP_HEADER_RECORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipHeaderRecord() <em>Skip Header Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipHeaderRecord()
	 * @generated
	 * @ordered
	 */
	protected String skipHeaderRecord = SKIP_HEADER_RECORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrailingDelimiter() <em>Trailing Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrailingDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAILING_DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrailingDelimiter() <em>Trailing Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrailingDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String trailingDelimiter = TRAILING_DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrim() <em>Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrim()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrim() <em>Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrim()
	 * @generated
	 * @ordered
	 */
	protected String trim = TRIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseMaps() <em>Use Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseMaps()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_MAPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseMaps() <em>Use Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseMaps()
	 * @generated
	 * @ordered
	 */
	protected String useMaps = USE_MAPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseOrderedMaps() <em>Use Ordered Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOrderedMaps()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_ORDERED_MAPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseOrderedMaps() <em>Use Ordered Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOrderedMaps()
	 * @generated
	 * @ordered
	 */
	protected String useOrderedMaps = USE_ORDERED_MAPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsvDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getCsvDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getHeader() {
		if (header == null) {
			header = new EDataTypeEList<String>(String.class, this, CamelSpringPackage.CSV_DATA_FORMAT__HEADER);
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowMissingColumnNames() {
		return allowMissingColumnNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowMissingColumnNames(String newAllowMissingColumnNames) {
		String oldAllowMissingColumnNames = allowMissingColumnNames;
		allowMissingColumnNames = newAllowMissingColumnNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__ALLOW_MISSING_COLUMN_NAMES, oldAllowMissingColumnNames, allowMissingColumnNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaptureHeaderRecord() {
		return captureHeaderRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaptureHeaderRecord(String newCaptureHeaderRecord) {
		String oldCaptureHeaderRecord = captureHeaderRecord;
		captureHeaderRecord = newCaptureHeaderRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__CAPTURE_HEADER_RECORD, oldCaptureHeaderRecord, captureHeaderRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommentMarker() {
		return commentMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentMarker(String newCommentMarker) {
		String oldCommentMarker = commentMarker;
		commentMarker = newCommentMarker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__COMMENT_MARKER, oldCommentMarker, commentMarker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommentMarkerDisabled() {
		return commentMarkerDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentMarkerDisabled(String newCommentMarkerDisabled) {
		String oldCommentMarkerDisabled = commentMarkerDisabled;
		commentMarkerDisabled = newCommentMarkerDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__COMMENT_MARKER_DISABLED, oldCommentMarkerDisabled, commentMarkerDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelimiter() {
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimiter(String newDelimiter) {
		String oldDelimiter = delimiter;
		delimiter = newDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__DELIMITER, oldDelimiter, delimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEscape() {
		return escape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscape(String newEscape) {
		String oldEscape = escape;
		escape = newEscape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__ESCAPE, oldEscape, escape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEscapeDisabled() {
		return escapeDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscapeDisabled(String newEscapeDisabled) {
		String oldEscapeDisabled = escapeDisabled;
		escapeDisabled = newEscapeDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__ESCAPE_DISABLED, oldEscapeDisabled, escapeDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormatName() {
		return formatName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormatName(String newFormatName) {
		String oldFormatName = formatName;
		formatName = newFormatName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__FORMAT_NAME, oldFormatName, formatName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormatRef() {
		return formatRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormatRef(String newFormatRef) {
		String oldFormatRef = formatRef;
		formatRef = newFormatRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__FORMAT_REF, oldFormatRef, formatRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderDisabled() {
		return headerDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderDisabled(String newHeaderDisabled) {
		String oldHeaderDisabled = headerDisabled;
		headerDisabled = newHeaderDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__HEADER_DISABLED, oldHeaderDisabled, headerDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreEmptyLines() {
		return ignoreEmptyLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreEmptyLines(String newIgnoreEmptyLines) {
		String oldIgnoreEmptyLines = ignoreEmptyLines;
		ignoreEmptyLines = newIgnoreEmptyLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_EMPTY_LINES, oldIgnoreEmptyLines, ignoreEmptyLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreHeaderCase() {
		return ignoreHeaderCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreHeaderCase(String newIgnoreHeaderCase) {
		String oldIgnoreHeaderCase = ignoreHeaderCase;
		ignoreHeaderCase = newIgnoreHeaderCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_HEADER_CASE, oldIgnoreHeaderCase, ignoreHeaderCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreSurroundingSpaces() {
		return ignoreSurroundingSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreSurroundingSpaces(String newIgnoreSurroundingSpaces) {
		String oldIgnoreSurroundingSpaces = ignoreSurroundingSpaces;
		ignoreSurroundingSpaces = newIgnoreSurroundingSpaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_SURROUNDING_SPACES, oldIgnoreSurroundingSpaces, ignoreSurroundingSpaces));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__LAZY_LOAD, oldLazyLoad, lazyLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarshallerFactoryRef() {
		return marshallerFactoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarshallerFactoryRef(String newMarshallerFactoryRef) {
		String oldMarshallerFactoryRef = marshallerFactoryRef;
		marshallerFactoryRef = newMarshallerFactoryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__MARSHALLER_FACTORY_REF, oldMarshallerFactoryRef, marshallerFactoryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNullString() {
		return nullString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullString(String newNullString) {
		String oldNullString = nullString;
		nullString = newNullString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__NULL_STRING, oldNullString, nullString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNullStringDisabled() {
		return nullStringDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullStringDisabled(String newNullStringDisabled) {
		String oldNullStringDisabled = nullStringDisabled;
		nullStringDisabled = newNullStringDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__NULL_STRING_DISABLED, oldNullStringDisabled, nullStringDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuote() {
		return quote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuote(String newQuote) {
		String oldQuote = quote;
		quote = newQuote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__QUOTE, oldQuote, quote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteDisabled() {
		return quoteDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteDisabled(String newQuoteDisabled) {
		String oldQuoteDisabled = quoteDisabled;
		quoteDisabled = newQuoteDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__QUOTE_DISABLED, oldQuoteDisabled, quoteDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteMode() {
		return quoteMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteMode(String newQuoteMode) {
		String oldQuoteMode = quoteMode;
		quoteMode = newQuoteMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__QUOTE_MODE, oldQuoteMode, quoteMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecordConverterRef() {
		return recordConverterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordConverterRef(String newRecordConverterRef) {
		String oldRecordConverterRef = recordConverterRef;
		recordConverterRef = newRecordConverterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__RECORD_CONVERTER_REF, oldRecordConverterRef, recordConverterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecordSeparator() {
		return recordSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordSeparator(String newRecordSeparator) {
		String oldRecordSeparator = recordSeparator;
		recordSeparator = newRecordSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__RECORD_SEPARATOR, oldRecordSeparator, recordSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecordSeparatorDisabled() {
		return recordSeparatorDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordSeparatorDisabled(String newRecordSeparatorDisabled) {
		String oldRecordSeparatorDisabled = recordSeparatorDisabled;
		recordSeparatorDisabled = newRecordSeparatorDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__RECORD_SEPARATOR_DISABLED, oldRecordSeparatorDisabled, recordSeparatorDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSkipHeaderRecord() {
		return skipHeaderRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkipHeaderRecord(String newSkipHeaderRecord) {
		String oldSkipHeaderRecord = skipHeaderRecord;
		skipHeaderRecord = newSkipHeaderRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__SKIP_HEADER_RECORD, oldSkipHeaderRecord, skipHeaderRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrailingDelimiter() {
		return trailingDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrailingDelimiter(String newTrailingDelimiter) {
		String oldTrailingDelimiter = trailingDelimiter;
		trailingDelimiter = newTrailingDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__TRAILING_DELIMITER, oldTrailingDelimiter, trailingDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrim() {
		return trim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrim(String newTrim) {
		String oldTrim = trim;
		trim = newTrim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__TRIM, oldTrim, trim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseMaps() {
		return useMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseMaps(String newUseMaps) {
		String oldUseMaps = useMaps;
		useMaps = newUseMaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__USE_MAPS, oldUseMaps, useMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseOrderedMaps() {
		return useOrderedMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseOrderedMaps(String newUseOrderedMaps) {
		String oldUseOrderedMaps = useOrderedMaps;
		useOrderedMaps = newUseOrderedMaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CSV_DATA_FORMAT__USE_ORDERED_MAPS, oldUseOrderedMaps, useOrderedMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.CSV_DATA_FORMAT__HEADER:
				return getHeader();
			case CamelSpringPackage.CSV_DATA_FORMAT__ALLOW_MISSING_COLUMN_NAMES:
				return getAllowMissingColumnNames();
			case CamelSpringPackage.CSV_DATA_FORMAT__CAPTURE_HEADER_RECORD:
				return getCaptureHeaderRecord();
			case CamelSpringPackage.CSV_DATA_FORMAT__COMMENT_MARKER:
				return getCommentMarker();
			case CamelSpringPackage.CSV_DATA_FORMAT__COMMENT_MARKER_DISABLED:
				return getCommentMarkerDisabled();
			case CamelSpringPackage.CSV_DATA_FORMAT__DELIMITER:
				return getDelimiter();
			case CamelSpringPackage.CSV_DATA_FORMAT__ESCAPE:
				return getEscape();
			case CamelSpringPackage.CSV_DATA_FORMAT__ESCAPE_DISABLED:
				return getEscapeDisabled();
			case CamelSpringPackage.CSV_DATA_FORMAT__FORMAT_NAME:
				return getFormatName();
			case CamelSpringPackage.CSV_DATA_FORMAT__FORMAT_REF:
				return getFormatRef();
			case CamelSpringPackage.CSV_DATA_FORMAT__HEADER_DISABLED:
				return getHeaderDisabled();
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_EMPTY_LINES:
				return getIgnoreEmptyLines();
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_HEADER_CASE:
				return getIgnoreHeaderCase();
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_SURROUNDING_SPACES:
				return getIgnoreSurroundingSpaces();
			case CamelSpringPackage.CSV_DATA_FORMAT__LAZY_LOAD:
				return getLazyLoad();
			case CamelSpringPackage.CSV_DATA_FORMAT__MARSHALLER_FACTORY_REF:
				return getMarshallerFactoryRef();
			case CamelSpringPackage.CSV_DATA_FORMAT__NULL_STRING:
				return getNullString();
			case CamelSpringPackage.CSV_DATA_FORMAT__NULL_STRING_DISABLED:
				return getNullStringDisabled();
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE:
				return getQuote();
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE_DISABLED:
				return getQuoteDisabled();
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE_MODE:
				return getQuoteMode();
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_CONVERTER_REF:
				return getRecordConverterRef();
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_SEPARATOR:
				return getRecordSeparator();
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_SEPARATOR_DISABLED:
				return getRecordSeparatorDisabled();
			case CamelSpringPackage.CSV_DATA_FORMAT__SKIP_HEADER_RECORD:
				return getSkipHeaderRecord();
			case CamelSpringPackage.CSV_DATA_FORMAT__TRAILING_DELIMITER:
				return getTrailingDelimiter();
			case CamelSpringPackage.CSV_DATA_FORMAT__TRIM:
				return getTrim();
			case CamelSpringPackage.CSV_DATA_FORMAT__USE_MAPS:
				return getUseMaps();
			case CamelSpringPackage.CSV_DATA_FORMAT__USE_ORDERED_MAPS:
				return getUseOrderedMaps();
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
			case CamelSpringPackage.CSV_DATA_FORMAT__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends String>)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__ALLOW_MISSING_COLUMN_NAMES:
				setAllowMissingColumnNames((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__CAPTURE_HEADER_RECORD:
				setCaptureHeaderRecord((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__COMMENT_MARKER:
				setCommentMarker((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__COMMENT_MARKER_DISABLED:
				setCommentMarkerDisabled((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__DELIMITER:
				setDelimiter((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__ESCAPE:
				setEscape((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__ESCAPE_DISABLED:
				setEscapeDisabled((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__FORMAT_NAME:
				setFormatName((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__FORMAT_REF:
				setFormatRef((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__HEADER_DISABLED:
				setHeaderDisabled((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_EMPTY_LINES:
				setIgnoreEmptyLines((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_HEADER_CASE:
				setIgnoreHeaderCase((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_SURROUNDING_SPACES:
				setIgnoreSurroundingSpaces((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__LAZY_LOAD:
				setLazyLoad((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__MARSHALLER_FACTORY_REF:
				setMarshallerFactoryRef((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__NULL_STRING:
				setNullString((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__NULL_STRING_DISABLED:
				setNullStringDisabled((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE:
				setQuote((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE_DISABLED:
				setQuoteDisabled((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE_MODE:
				setQuoteMode((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_CONVERTER_REF:
				setRecordConverterRef((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_SEPARATOR:
				setRecordSeparator((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_SEPARATOR_DISABLED:
				setRecordSeparatorDisabled((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__SKIP_HEADER_RECORD:
				setSkipHeaderRecord((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__TRAILING_DELIMITER:
				setTrailingDelimiter((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__TRIM:
				setTrim((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__USE_MAPS:
				setUseMaps((String)newValue);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__USE_ORDERED_MAPS:
				setUseOrderedMaps((String)newValue);
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
			case CamelSpringPackage.CSV_DATA_FORMAT__HEADER:
				getHeader().clear();
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__ALLOW_MISSING_COLUMN_NAMES:
				setAllowMissingColumnNames(ALLOW_MISSING_COLUMN_NAMES_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__CAPTURE_HEADER_RECORD:
				setCaptureHeaderRecord(CAPTURE_HEADER_RECORD_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__COMMENT_MARKER:
				setCommentMarker(COMMENT_MARKER_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__COMMENT_MARKER_DISABLED:
				setCommentMarkerDisabled(COMMENT_MARKER_DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__DELIMITER:
				setDelimiter(DELIMITER_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__ESCAPE:
				setEscape(ESCAPE_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__ESCAPE_DISABLED:
				setEscapeDisabled(ESCAPE_DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__FORMAT_NAME:
				setFormatName(FORMAT_NAME_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__FORMAT_REF:
				setFormatRef(FORMAT_REF_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__HEADER_DISABLED:
				setHeaderDisabled(HEADER_DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_EMPTY_LINES:
				setIgnoreEmptyLines(IGNORE_EMPTY_LINES_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_HEADER_CASE:
				setIgnoreHeaderCase(IGNORE_HEADER_CASE_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_SURROUNDING_SPACES:
				setIgnoreSurroundingSpaces(IGNORE_SURROUNDING_SPACES_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__LAZY_LOAD:
				setLazyLoad(LAZY_LOAD_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__MARSHALLER_FACTORY_REF:
				setMarshallerFactoryRef(MARSHALLER_FACTORY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__NULL_STRING:
				setNullString(NULL_STRING_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__NULL_STRING_DISABLED:
				setNullStringDisabled(NULL_STRING_DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE:
				setQuote(QUOTE_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE_DISABLED:
				setQuoteDisabled(QUOTE_DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE_MODE:
				setQuoteMode(QUOTE_MODE_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_CONVERTER_REF:
				setRecordConverterRef(RECORD_CONVERTER_REF_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_SEPARATOR:
				setRecordSeparator(RECORD_SEPARATOR_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_SEPARATOR_DISABLED:
				setRecordSeparatorDisabled(RECORD_SEPARATOR_DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__SKIP_HEADER_RECORD:
				setSkipHeaderRecord(SKIP_HEADER_RECORD_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__TRAILING_DELIMITER:
				setTrailingDelimiter(TRAILING_DELIMITER_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__TRIM:
				setTrim(TRIM_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__USE_MAPS:
				setUseMaps(USE_MAPS_EDEFAULT);
				return;
			case CamelSpringPackage.CSV_DATA_FORMAT__USE_ORDERED_MAPS:
				setUseOrderedMaps(USE_ORDERED_MAPS_EDEFAULT);
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
			case CamelSpringPackage.CSV_DATA_FORMAT__HEADER:
				return header != null && !header.isEmpty();
			case CamelSpringPackage.CSV_DATA_FORMAT__ALLOW_MISSING_COLUMN_NAMES:
				return ALLOW_MISSING_COLUMN_NAMES_EDEFAULT == null ? allowMissingColumnNames != null : !ALLOW_MISSING_COLUMN_NAMES_EDEFAULT.equals(allowMissingColumnNames);
			case CamelSpringPackage.CSV_DATA_FORMAT__CAPTURE_HEADER_RECORD:
				return CAPTURE_HEADER_RECORD_EDEFAULT == null ? captureHeaderRecord != null : !CAPTURE_HEADER_RECORD_EDEFAULT.equals(captureHeaderRecord);
			case CamelSpringPackage.CSV_DATA_FORMAT__COMMENT_MARKER:
				return COMMENT_MARKER_EDEFAULT == null ? commentMarker != null : !COMMENT_MARKER_EDEFAULT.equals(commentMarker);
			case CamelSpringPackage.CSV_DATA_FORMAT__COMMENT_MARKER_DISABLED:
				return COMMENT_MARKER_DISABLED_EDEFAULT == null ? commentMarkerDisabled != null : !COMMENT_MARKER_DISABLED_EDEFAULT.equals(commentMarkerDisabled);
			case CamelSpringPackage.CSV_DATA_FORMAT__DELIMITER:
				return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
			case CamelSpringPackage.CSV_DATA_FORMAT__ESCAPE:
				return ESCAPE_EDEFAULT == null ? escape != null : !ESCAPE_EDEFAULT.equals(escape);
			case CamelSpringPackage.CSV_DATA_FORMAT__ESCAPE_DISABLED:
				return ESCAPE_DISABLED_EDEFAULT == null ? escapeDisabled != null : !ESCAPE_DISABLED_EDEFAULT.equals(escapeDisabled);
			case CamelSpringPackage.CSV_DATA_FORMAT__FORMAT_NAME:
				return FORMAT_NAME_EDEFAULT == null ? formatName != null : !FORMAT_NAME_EDEFAULT.equals(formatName);
			case CamelSpringPackage.CSV_DATA_FORMAT__FORMAT_REF:
				return FORMAT_REF_EDEFAULT == null ? formatRef != null : !FORMAT_REF_EDEFAULT.equals(formatRef);
			case CamelSpringPackage.CSV_DATA_FORMAT__HEADER_DISABLED:
				return HEADER_DISABLED_EDEFAULT == null ? headerDisabled != null : !HEADER_DISABLED_EDEFAULT.equals(headerDisabled);
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_EMPTY_LINES:
				return IGNORE_EMPTY_LINES_EDEFAULT == null ? ignoreEmptyLines != null : !IGNORE_EMPTY_LINES_EDEFAULT.equals(ignoreEmptyLines);
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_HEADER_CASE:
				return IGNORE_HEADER_CASE_EDEFAULT == null ? ignoreHeaderCase != null : !IGNORE_HEADER_CASE_EDEFAULT.equals(ignoreHeaderCase);
			case CamelSpringPackage.CSV_DATA_FORMAT__IGNORE_SURROUNDING_SPACES:
				return IGNORE_SURROUNDING_SPACES_EDEFAULT == null ? ignoreSurroundingSpaces != null : !IGNORE_SURROUNDING_SPACES_EDEFAULT.equals(ignoreSurroundingSpaces);
			case CamelSpringPackage.CSV_DATA_FORMAT__LAZY_LOAD:
				return LAZY_LOAD_EDEFAULT == null ? lazyLoad != null : !LAZY_LOAD_EDEFAULT.equals(lazyLoad);
			case CamelSpringPackage.CSV_DATA_FORMAT__MARSHALLER_FACTORY_REF:
				return MARSHALLER_FACTORY_REF_EDEFAULT == null ? marshallerFactoryRef != null : !MARSHALLER_FACTORY_REF_EDEFAULT.equals(marshallerFactoryRef);
			case CamelSpringPackage.CSV_DATA_FORMAT__NULL_STRING:
				return NULL_STRING_EDEFAULT == null ? nullString != null : !NULL_STRING_EDEFAULT.equals(nullString);
			case CamelSpringPackage.CSV_DATA_FORMAT__NULL_STRING_DISABLED:
				return NULL_STRING_DISABLED_EDEFAULT == null ? nullStringDisabled != null : !NULL_STRING_DISABLED_EDEFAULT.equals(nullStringDisabled);
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE:
				return QUOTE_EDEFAULT == null ? quote != null : !QUOTE_EDEFAULT.equals(quote);
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE_DISABLED:
				return QUOTE_DISABLED_EDEFAULT == null ? quoteDisabled != null : !QUOTE_DISABLED_EDEFAULT.equals(quoteDisabled);
			case CamelSpringPackage.CSV_DATA_FORMAT__QUOTE_MODE:
				return QUOTE_MODE_EDEFAULT == null ? quoteMode != null : !QUOTE_MODE_EDEFAULT.equals(quoteMode);
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_CONVERTER_REF:
				return RECORD_CONVERTER_REF_EDEFAULT == null ? recordConverterRef != null : !RECORD_CONVERTER_REF_EDEFAULT.equals(recordConverterRef);
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_SEPARATOR:
				return RECORD_SEPARATOR_EDEFAULT == null ? recordSeparator != null : !RECORD_SEPARATOR_EDEFAULT.equals(recordSeparator);
			case CamelSpringPackage.CSV_DATA_FORMAT__RECORD_SEPARATOR_DISABLED:
				return RECORD_SEPARATOR_DISABLED_EDEFAULT == null ? recordSeparatorDisabled != null : !RECORD_SEPARATOR_DISABLED_EDEFAULT.equals(recordSeparatorDisabled);
			case CamelSpringPackage.CSV_DATA_FORMAT__SKIP_HEADER_RECORD:
				return SKIP_HEADER_RECORD_EDEFAULT == null ? skipHeaderRecord != null : !SKIP_HEADER_RECORD_EDEFAULT.equals(skipHeaderRecord);
			case CamelSpringPackage.CSV_DATA_FORMAT__TRAILING_DELIMITER:
				return TRAILING_DELIMITER_EDEFAULT == null ? trailingDelimiter != null : !TRAILING_DELIMITER_EDEFAULT.equals(trailingDelimiter);
			case CamelSpringPackage.CSV_DATA_FORMAT__TRIM:
				return TRIM_EDEFAULT == null ? trim != null : !TRIM_EDEFAULT.equals(trim);
			case CamelSpringPackage.CSV_DATA_FORMAT__USE_MAPS:
				return USE_MAPS_EDEFAULT == null ? useMaps != null : !USE_MAPS_EDEFAULT.equals(useMaps);
			case CamelSpringPackage.CSV_DATA_FORMAT__USE_ORDERED_MAPS:
				return USE_ORDERED_MAPS_EDEFAULT == null ? useOrderedMaps != null : !USE_ORDERED_MAPS_EDEFAULT.equals(useOrderedMaps);
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
		result.append(" (header: ");
		result.append(header);
		result.append(", allowMissingColumnNames: ");
		result.append(allowMissingColumnNames);
		result.append(", captureHeaderRecord: ");
		result.append(captureHeaderRecord);
		result.append(", commentMarker: ");
		result.append(commentMarker);
		result.append(", commentMarkerDisabled: ");
		result.append(commentMarkerDisabled);
		result.append(", delimiter: ");
		result.append(delimiter);
		result.append(", escape: ");
		result.append(escape);
		result.append(", escapeDisabled: ");
		result.append(escapeDisabled);
		result.append(", formatName: ");
		result.append(formatName);
		result.append(", formatRef: ");
		result.append(formatRef);
		result.append(", headerDisabled: ");
		result.append(headerDisabled);
		result.append(", ignoreEmptyLines: ");
		result.append(ignoreEmptyLines);
		result.append(", ignoreHeaderCase: ");
		result.append(ignoreHeaderCase);
		result.append(", ignoreSurroundingSpaces: ");
		result.append(ignoreSurroundingSpaces);
		result.append(", lazyLoad: ");
		result.append(lazyLoad);
		result.append(", marshallerFactoryRef: ");
		result.append(marshallerFactoryRef);
		result.append(", nullString: ");
		result.append(nullString);
		result.append(", nullStringDisabled: ");
		result.append(nullStringDisabled);
		result.append(", quote: ");
		result.append(quote);
		result.append(", quoteDisabled: ");
		result.append(quoteDisabled);
		result.append(", quoteMode: ");
		result.append(quoteMode);
		result.append(", recordConverterRef: ");
		result.append(recordConverterRef);
		result.append(", recordSeparator: ");
		result.append(recordSeparator);
		result.append(", recordSeparatorDisabled: ");
		result.append(recordSeparatorDisabled);
		result.append(", skipHeaderRecord: ");
		result.append(skipHeaderRecord);
		result.append(", trailingDelimiter: ");
		result.append(trailingDelimiter);
		result.append(", trim: ");
		result.append(trim);
		result.append(", useMaps: ");
		result.append(useMaps);
		result.append(", useOrderedMaps: ");
		result.append(useOrderedMaps);
		result.append(')');
		return result.toString();
	}

} //CsvDataFormatImpl

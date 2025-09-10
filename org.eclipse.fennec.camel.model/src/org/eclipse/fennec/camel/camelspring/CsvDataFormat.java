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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getAllowMissingColumnNames <em>Allow Missing Column Names</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getCaptureHeaderRecord <em>Capture Header Record</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getCommentMarker <em>Comment Marker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getCommentMarkerDisabled <em>Comment Marker Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getEscape <em>Escape</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getEscapeDisabled <em>Escape Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getFormatName <em>Format Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getFormatRef <em>Format Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getHeaderDisabled <em>Header Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getIgnoreEmptyLines <em>Ignore Empty Lines</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getIgnoreHeaderCase <em>Ignore Header Case</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getIgnoreSurroundingSpaces <em>Ignore Surrounding Spaces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getLazyLoad <em>Lazy Load</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getMarshallerFactoryRef <em>Marshaller Factory Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getNullString <em>Null String</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getNullStringDisabled <em>Null String Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getQuoteDisabled <em>Quote Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getQuoteMode <em>Quote Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getRecordConverterRef <em>Record Converter Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getRecordSeparator <em>Record Separator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getRecordSeparatorDisabled <em>Record Separator Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getSkipHeaderRecord <em>Skip Header Record</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getTrailingDelimiter <em>Trailing Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getTrim <em>Trim</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getUseMaps <em>Use Maps</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getUseOrderedMaps <em>Use Ordered Maps</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat()
 * @model extendedMetaData="name='csvDataFormat' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CsvDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure the CSV headers.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_Header()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getHeader();

	/**
	 * Returns the value of the '<em><b>Allow Missing Column Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to allow missing column names. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Missing Column Names</em>' attribute.
	 * @see #setAllowMissingColumnNames(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_AllowMissingColumnNames()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowMissingColumnNames'"
	 * @generated
	 */
	String getAllowMissingColumnNames();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getAllowMissingColumnNames <em>Allow Missing Column Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Missing Column Names</em>' attribute.
	 * @see #getAllowMissingColumnNames()
	 * @generated
	 */
	void setAllowMissingColumnNames(String value);

	/**
	 * Returns the value of the '<em><b>Capture Header Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the unmarshalling should capture the header record and store it in the message header. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capture Header Record</em>' attribute.
	 * @see #setCaptureHeaderRecord(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_CaptureHeaderRecord()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='captureHeaderRecord'"
	 * @generated
	 */
	String getCaptureHeaderRecord();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getCaptureHeaderRecord <em>Capture Header Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capture Header Record</em>' attribute.
	 * @see #getCaptureHeaderRecord()
	 * @generated
	 */
	void setCaptureHeaderRecord(String value);

	/**
	 * Returns the value of the '<em><b>Comment Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the comment marker of the reference format.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Marker</em>' attribute.
	 * @see #setCommentMarker(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_CommentMarker()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='commentMarker'"
	 * @generated
	 */
	String getCommentMarker();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getCommentMarker <em>Comment Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Marker</em>' attribute.
	 * @see #getCommentMarker()
	 * @generated
	 */
	void setCommentMarker(String value);

	/**
	 * Returns the value of the '<em><b>Comment Marker Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Disables the comment marker of the reference format. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Marker Disabled</em>' attribute.
	 * @see #setCommentMarkerDisabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_CommentMarkerDisabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='commentMarkerDisabled'"
	 * @generated
	 */
	String getCommentMarkerDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getCommentMarkerDisabled <em>Comment Marker Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Marker Disabled</em>' attribute.
	 * @see #getCommentMarkerDisabled()
	 * @generated
	 */
	void setCommentMarkerDisabled(String value);

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the delimiter to use. The default value is , (comma).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delimiter</em>' attribute.
	 * @see #setDelimiter(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_Delimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delimiter'"
	 * @generated
	 */
	String getDelimiter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getDelimiter <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' attribute.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Escape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the escape character to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Escape</em>' attribute.
	 * @see #setEscape(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_Escape()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='escape'"
	 * @generated
	 */
	String getEscape();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getEscape <em>Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape</em>' attribute.
	 * @see #getEscape()
	 * @generated
	 */
	void setEscape(String value);

	/**
	 * Returns the value of the '<em><b>Escape Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Use for disabling using escape character. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Escape Disabled</em>' attribute.
	 * @see #setEscapeDisabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_EscapeDisabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='escapeDisabled'"
	 * @generated
	 */
	String getEscapeDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getEscapeDisabled <em>Escape Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape Disabled</em>' attribute.
	 * @see #getEscapeDisabled()
	 * @generated
	 */
	void setEscapeDisabled(String value);

	/**
	 * Returns the value of the '<em><b>Format Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The name of the format to use, the default value is CSVFormat.DEFAULT. Default value: DEFAULT
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format Name</em>' attribute.
	 * @see #setFormatName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_FormatName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='formatName'"
	 * @generated
	 */
	String getFormatName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getFormatName <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Name</em>' attribute.
	 * @see #getFormatName()
	 * @generated
	 */
	void setFormatName(String value);

	/**
	 * Returns the value of the '<em><b>Format Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The reference format to use, it will be updated with the other format options, the default value is CSVFormat.DEFAULT.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format Ref</em>' attribute.
	 * @see #setFormatRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_FormatRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='formatRef'"
	 * @generated
	 */
	String getFormatRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getFormatRef <em>Format Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Ref</em>' attribute.
	 * @see #getFormatRef()
	 * @generated
	 */
	void setFormatRef(String value);

	/**
	 * Returns the value of the '<em><b>Header Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Use for disabling headers. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Disabled</em>' attribute.
	 * @see #setHeaderDisabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_HeaderDisabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='headerDisabled'"
	 * @generated
	 */
	String getHeaderDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getHeaderDisabled <em>Header Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Disabled</em>' attribute.
	 * @see #getHeaderDisabled()
	 * @generated
	 */
	void setHeaderDisabled(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Empty Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to ignore empty lines. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Empty Lines</em>' attribute.
	 * @see #setIgnoreEmptyLines(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_IgnoreEmptyLines()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreEmptyLines'"
	 * @generated
	 */
	String getIgnoreEmptyLines();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getIgnoreEmptyLines <em>Ignore Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Empty Lines</em>' attribute.
	 * @see #getIgnoreEmptyLines()
	 * @generated
	 */
	void setIgnoreEmptyLines(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Header Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether or not to ignore case when accessing header names. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Header Case</em>' attribute.
	 * @see #setIgnoreHeaderCase(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_IgnoreHeaderCase()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreHeaderCase'"
	 * @generated
	 */
	String getIgnoreHeaderCase();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getIgnoreHeaderCase <em>Ignore Header Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Header Case</em>' attribute.
	 * @see #getIgnoreHeaderCase()
	 * @generated
	 */
	void setIgnoreHeaderCase(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Surrounding Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to ignore surrounding spaces. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Surrounding Spaces</em>' attribute.
	 * @see #setIgnoreSurroundingSpaces(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_IgnoreSurroundingSpaces()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreSurroundingSpaces'"
	 * @generated
	 */
	String getIgnoreSurroundingSpaces();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getIgnoreSurroundingSpaces <em>Ignore Surrounding Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Surrounding Spaces</em>' attribute.
	 * @see #getIgnoreSurroundingSpaces()
	 * @generated
	 */
	void setIgnoreSurroundingSpaces(String value);

	/**
	 * Returns the value of the '<em><b>Lazy Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the unmarshalling should produce an iterator that reads the lines on the fly or if all the lines must be read at
	 * one. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lazy Load</em>' attribute.
	 * @see #setLazyLoad(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_LazyLoad()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lazyLoad'"
	 * @generated
	 */
	String getLazyLoad();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getLazyLoad <em>Lazy Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy Load</em>' attribute.
	 * @see #getLazyLoad()
	 * @generated
	 */
	void setLazyLoad(String value);

	/**
	 * Returns the value of the '<em><b>Marshaller Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the implementation of the CsvMarshallerFactory interface which is able to customize marshalling/unmarshalling
	 * behavior by extending CsvMarshaller or creating it from scratch.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marshaller Factory Ref</em>' attribute.
	 * @see #setMarshallerFactoryRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_MarshallerFactoryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='marshallerFactoryRef'"
	 * @generated
	 */
	String getMarshallerFactoryRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getMarshallerFactoryRef <em>Marshaller Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marshaller Factory Ref</em>' attribute.
	 * @see #getMarshallerFactoryRef()
	 * @generated
	 */
	void setMarshallerFactoryRef(String value);

	/**
	 * Returns the value of the '<em><b>Null String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the null string.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null String</em>' attribute.
	 * @see #setNullString(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_NullString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nullString'"
	 * @generated
	 */
	String getNullString();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getNullString <em>Null String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null String</em>' attribute.
	 * @see #getNullString()
	 * @generated
	 */
	void setNullString(String value);

	/**
	 * Returns the value of the '<em><b>Null String Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Used to disable null strings. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null String Disabled</em>' attribute.
	 * @see #setNullStringDisabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_NullStringDisabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nullStringDisabled'"
	 * @generated
	 */
	String getNullStringDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getNullStringDisabled <em>Null String Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null String Disabled</em>' attribute.
	 * @see #getNullStringDisabled()
	 * @generated
	 */
	void setNullStringDisabled(String value);

	/**
	 * Returns the value of the '<em><b>Quote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the quote to use which by default is double-quote character.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quote</em>' attribute.
	 * @see #setQuote(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_Quote()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='quote'"
	 * @generated
	 */
	String getQuote();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getQuote <em>Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote</em>' attribute.
	 * @see #getQuote()
	 * @generated
	 */
	void setQuote(String value);

	/**
	 * Returns the value of the '<em><b>Quote Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Used to disable quotes. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quote Disabled</em>' attribute.
	 * @see #setQuoteDisabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_QuoteDisabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='quoteDisabled'"
	 * @generated
	 */
	String getQuoteDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getQuoteDisabled <em>Quote Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Disabled</em>' attribute.
	 * @see #getQuoteDisabled()
	 * @generated
	 */
	void setQuoteDisabled(String value);

	/**
	 * Returns the value of the '<em><b>Quote Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the quote mode.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quote Mode</em>' attribute.
	 * @see #setQuoteMode(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_QuoteMode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='quoteMode'"
	 * @generated
	 */
	String getQuoteMode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getQuoteMode <em>Quote Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Mode</em>' attribute.
	 * @see #getQuoteMode()
	 * @generated
	 */
	void setQuoteMode(String value);

	/**
	 * Returns the value of the '<em><b>Record Converter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to a custom CsvRecordConverter to lookup from the registry to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Converter Ref</em>' attribute.
	 * @see #setRecordConverterRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_RecordConverterRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='recordConverterRef'"
	 * @generated
	 */
	String getRecordConverterRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getRecordConverterRef <em>Record Converter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Converter Ref</em>' attribute.
	 * @see #getRecordConverterRef()
	 * @generated
	 */
	void setRecordConverterRef(String value);

	/**
	 * Returns the value of the '<em><b>Record Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the record separator (aka new line) which by default is new line characters (CRLF).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Separator</em>' attribute.
	 * @see #setRecordSeparator(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_RecordSeparator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='recordSeparator'"
	 * @generated
	 */
	String getRecordSeparator();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getRecordSeparator <em>Record Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Separator</em>' attribute.
	 * @see #getRecordSeparator()
	 * @generated
	 */
	void setRecordSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Record Separator Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Used for disabling record separator.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Separator Disabled</em>' attribute.
	 * @see #setRecordSeparatorDisabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_RecordSeparatorDisabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='recordSeparatorDisabled'"
	 * @generated
	 */
	String getRecordSeparatorDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getRecordSeparatorDisabled <em>Record Separator Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Separator Disabled</em>' attribute.
	 * @see #getRecordSeparatorDisabled()
	 * @generated
	 */
	void setRecordSeparatorDisabled(String value);

	/**
	 * Returns the value of the '<em><b>Skip Header Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to skip the header record in the output. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skip Header Record</em>' attribute.
	 * @see #setSkipHeaderRecord(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_SkipHeaderRecord()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='skipHeaderRecord'"
	 * @generated
	 */
	String getSkipHeaderRecord();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getSkipHeaderRecord <em>Skip Header Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Header Record</em>' attribute.
	 * @see #getSkipHeaderRecord()
	 * @generated
	 */
	void setSkipHeaderRecord(String value);

	/**
	 * Returns the value of the '<em><b>Trailing Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether or not to add a trailing delimiter. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trailing Delimiter</em>' attribute.
	 * @see #setTrailingDelimiter(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_TrailingDelimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trailingDelimiter'"
	 * @generated
	 */
	String getTrailingDelimiter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getTrailingDelimiter <em>Trailing Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trailing Delimiter</em>' attribute.
	 * @see #getTrailingDelimiter()
	 * @generated
	 */
	void setTrailingDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets whether or not to trim leading and trailing blanks. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trim</em>' attribute.
	 * @see #setTrim(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_Trim()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trim'"
	 * @generated
	 */
	String getTrim();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getTrim <em>Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim</em>' attribute.
	 * @see #getTrim()
	 * @generated
	 */
	void setTrim(String value);

	/**
	 * Returns the value of the '<em><b>Use Maps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the unmarshalling should produce maps (HashMap)for the lines values instead of lists. It requires to have header
	 * (either defined or collected). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Maps</em>' attribute.
	 * @see #setUseMaps(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_UseMaps()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useMaps'"
	 * @generated
	 */
	String getUseMaps();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getUseMaps <em>Use Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Maps</em>' attribute.
	 * @see #getUseMaps()
	 * @generated
	 */
	void setUseMaps(String value);

	/**
	 * Returns the value of the '<em><b>Use Ordered Maps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the unmarshalling should produce ordered maps (LinkedHashMap) for the lines values instead of lists. It requires
	 * to have header (either defined or collected). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Ordered Maps</em>' attribute.
	 * @see #setUseOrderedMaps(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCsvDataFormat_UseOrderedMaps()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useOrderedMaps'"
	 * @generated
	 */
	String getUseOrderedMaps();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat#getUseOrderedMaps <em>Use Ordered Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Ordered Maps</em>' attribute.
	 * @see #getUseOrderedMaps()
	 * @generated
	 */
	void setUseOrderedMaps(String value);

} // CsvDataFormat

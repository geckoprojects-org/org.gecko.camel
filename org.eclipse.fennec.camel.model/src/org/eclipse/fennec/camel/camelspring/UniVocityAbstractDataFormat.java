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
 * A representation of the model object '<em><b>Uni Vocity Abstract Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getUnivocityHeader <em>Univocity Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getAsMap <em>As Map</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getEmptyValue <em>Empty Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getHeaderExtractionEnabled <em>Header Extraction Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getHeadersDisabled <em>Headers Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getIgnoreLeadingWhitespaces <em>Ignore Leading Whitespaces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getIgnoreTrailingWhitespaces <em>Ignore Trailing Whitespaces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getLazyLoad <em>Lazy Load</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getLineSeparator <em>Line Separator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getNormalizedLineSeparator <em>Normalized Line Separator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getNumberOfRecordsToRead <em>Number Of Records To Read</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getSkipEmptyLines <em>Skip Empty Lines</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat()
 * @model abstract="true"
 *        extendedMetaData="name='uniVocityAbstractDataFormat' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UniVocityAbstractDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Univocity Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.UniVocityHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure headers for UniVocity data formats.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Univocity Header</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_UnivocityHeader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='univocityHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UniVocityHeader> getUnivocityHeader();

	/**
	 * Returns the value of the '<em><b>As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the unmarshalling should produce maps for the lines values instead of lists. It requires to have header (either
	 * defined or collected). The default value is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Map</em>' attribute.
	 * @see #setAsMap(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_AsMap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='asMap'"
	 * @generated
	 */
	String getAsMap();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getAsMap <em>As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Map</em>' attribute.
	 * @see #getAsMap()
	 * @generated
	 */
	void setAsMap(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The comment symbol. The default value is #. Default value: #
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Empty Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The String representation of an empty value.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Empty Value</em>' attribute.
	 * @see #setEmptyValue(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_EmptyValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='emptyValue'"
	 * @generated
	 */
	String getEmptyValue();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getEmptyValue <em>Empty Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Value</em>' attribute.
	 * @see #getEmptyValue()
	 * @generated
	 */
	void setEmptyValue(String value);

	/**
	 * Returns the value of the '<em><b>Header Extraction Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not the header must be read in the first line of the test document. The default value is false. Default
	 * value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Extraction Enabled</em>' attribute.
	 * @see #setHeaderExtractionEnabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_HeaderExtractionEnabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='headerExtractionEnabled'"
	 * @generated
	 */
	String getHeaderExtractionEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getHeaderExtractionEnabled <em>Header Extraction Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Extraction Enabled</em>' attribute.
	 * @see #getHeaderExtractionEnabled()
	 * @generated
	 */
	void setHeaderExtractionEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Headers Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not the headers are disabled. When defined, this option explicitly sets the headers as null which indicates
	 * that there is no header. The default value is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Headers Disabled</em>' attribute.
	 * @see #setHeadersDisabled(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_HeadersDisabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='headersDisabled'"
	 * @generated
	 */
	String getHeadersDisabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getHeadersDisabled <em>Headers Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers Disabled</em>' attribute.
	 * @see #getHeadersDisabled()
	 * @generated
	 */
	void setHeadersDisabled(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Leading Whitespaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not the leading white spaces must be ignored. The default value is true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Leading Whitespaces</em>' attribute.
	 * @see #setIgnoreLeadingWhitespaces(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_IgnoreLeadingWhitespaces()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreLeadingWhitespaces'"
	 * @generated
	 */
	String getIgnoreLeadingWhitespaces();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getIgnoreLeadingWhitespaces <em>Ignore Leading Whitespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Leading Whitespaces</em>' attribute.
	 * @see #getIgnoreLeadingWhitespaces()
	 * @generated
	 */
	void setIgnoreLeadingWhitespaces(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Trailing Whitespaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not the trailing white spaces must be ignored. The default value is true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Trailing Whitespaces</em>' attribute.
	 * @see #setIgnoreTrailingWhitespaces(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_IgnoreTrailingWhitespaces()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreTrailingWhitespaces'"
	 * @generated
	 */
	String getIgnoreTrailingWhitespaces();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getIgnoreTrailingWhitespaces <em>Ignore Trailing Whitespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Trailing Whitespaces</em>' attribute.
	 * @see #getIgnoreTrailingWhitespaces()
	 * @generated
	 */
	void setIgnoreTrailingWhitespaces(String value);

	/**
	 * Returns the value of the '<em><b>Lazy Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the unmarshalling should produce an iterator that reads the lines on the fly or if all the lines must be read at
	 * once. The default value is false. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lazy Load</em>' attribute.
	 * @see #setLazyLoad(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_LazyLoad()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lazyLoad'"
	 * @generated
	 */
	String getLazyLoad();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getLazyLoad <em>Lazy Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy Load</em>' attribute.
	 * @see #getLazyLoad()
	 * @generated
	 */
	void setLazyLoad(String value);

	/**
	 * Returns the value of the '<em><b>Line Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The line separator of the files. The default value is to use the JVM platform line separator.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Separator</em>' attribute.
	 * @see #setLineSeparator(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_LineSeparator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lineSeparator'"
	 * @generated
	 */
	String getLineSeparator();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getLineSeparator <em>Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Separator</em>' attribute.
	 * @see #getLineSeparator()
	 * @generated
	 */
	void setLineSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Normalized Line Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The normalized line separator of the files. The default value is a new line character.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normalized Line Separator</em>' attribute.
	 * @see #setNormalizedLineSeparator(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_NormalizedLineSeparator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='normalizedLineSeparator'"
	 * @generated
	 */
	String getNormalizedLineSeparator();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getNormalizedLineSeparator <em>Normalized Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalized Line Separator</em>' attribute.
	 * @see #getNormalizedLineSeparator()
	 * @generated
	 */
	void setNormalizedLineSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Null Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The string representation of a null value. The default value is null.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Value</em>' attribute.
	 * @see #setNullValue(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_NullValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nullValue'"
	 * @generated
	 */
	String getNullValue();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getNullValue <em>Null Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Value</em>' attribute.
	 * @see #getNullValue()
	 * @generated
	 */
	void setNullValue(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Records To Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The maximum number of record to read.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Records To Read</em>' attribute.
	 * @see #setNumberOfRecordsToRead(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_NumberOfRecordsToRead()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='numberOfRecordsToRead'"
	 * @generated
	 */
	String getNumberOfRecordsToRead();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getNumberOfRecordsToRead <em>Number Of Records To Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Records To Read</em>' attribute.
	 * @see #getNumberOfRecordsToRead()
	 * @generated
	 */
	void setNumberOfRecordsToRead(String value);

	/**
	 * Returns the value of the '<em><b>Skip Empty Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not the empty lines must be ignored. The default value is true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skip Empty Lines</em>' attribute.
	 * @see #setSkipEmptyLines(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getUniVocityAbstractDataFormat_SkipEmptyLines()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='skipEmptyLines'"
	 * @generated
	 */
	String getSkipEmptyLines();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat#getSkipEmptyLines <em>Skip Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Empty Lines</em>' attribute.
	 * @see #getSkipEmptyLines()
	 * @generated
	 */
	void setSkipEmptyLines(String value);

} // UniVocityAbstractDataFormat

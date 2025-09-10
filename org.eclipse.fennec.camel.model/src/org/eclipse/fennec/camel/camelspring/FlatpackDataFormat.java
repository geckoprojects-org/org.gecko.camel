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
 * A representation of the model object '<em><b>Flatpack Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getAllowShortLines <em>Allow Short Lines</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getIgnoreExtraColumns <em>Ignore Extra Columns</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getIgnoreFirstRecord <em>Ignore First Record</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getParserFactoryRef <em>Parser Factory Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getTextQualifier <em>Text Qualifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFlatpackDataFormat()
 * @model extendedMetaData="name='flatpackDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface FlatpackDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Allow Short Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows for lines to be shorter than expected and ignores the extra characters. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Short Lines</em>' attribute.
	 * @see #setAllowShortLines(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFlatpackDataFormat_AllowShortLines()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowShortLines'"
	 * @generated
	 */
	String getAllowShortLines();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getAllowShortLines <em>Allow Short Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Short Lines</em>' attribute.
	 * @see #getAllowShortLines()
	 * @generated
	 */
	void setAllowShortLines(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The flatpack pzmap configuration file. Can be omitted in simpler situations, but its preferred to use the pzmap.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFlatpackDataFormat_Definition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='definition'"
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The delimiter char (could be ; , or similar). Default value: ,
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delimiter</em>' attribute.
	 * @see #setDelimiter(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFlatpackDataFormat_Delimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delimiter'"
	 * @generated
	 */
	String getDelimiter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getDelimiter <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' attribute.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Delimited or fixed. Is by default false = delimited. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed</em>' attribute.
	 * @see #setFixed(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFlatpackDataFormat_Fixed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='fixed'"
	 * @generated
	 */
	String getFixed();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' attribute.
	 * @see #getFixed()
	 * @generated
	 */
	void setFixed(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Extra Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows for lines to be longer than expected and ignores the extra characters. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Extra Columns</em>' attribute.
	 * @see #setIgnoreExtraColumns(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFlatpackDataFormat_IgnoreExtraColumns()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreExtraColumns'"
	 * @generated
	 */
	String getIgnoreExtraColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getIgnoreExtraColumns <em>Ignore Extra Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Extra Columns</em>' attribute.
	 * @see #getIgnoreExtraColumns()
	 * @generated
	 */
	void setIgnoreExtraColumns(String value);

	/**
	 * Returns the value of the '<em><b>Ignore First Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the first line is ignored for delimited files (for the column headers). Is by default true. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore First Record</em>' attribute.
	 * @see #setIgnoreFirstRecord(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFlatpackDataFormat_IgnoreFirstRecord()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreFirstRecord'"
	 * @generated
	 */
	String getIgnoreFirstRecord();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getIgnoreFirstRecord <em>Ignore First Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore First Record</em>' attribute.
	 * @see #getIgnoreFirstRecord()
	 * @generated
	 */
	void setIgnoreFirstRecord(String value);

	/**
	 * Returns the value of the '<em><b>Parser Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * References to a custom parser factory to lookup in the registry.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parser Factory Ref</em>' attribute.
	 * @see #setParserFactoryRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFlatpackDataFormat_ParserFactoryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parserFactoryRef'"
	 * @generated
	 */
	String getParserFactoryRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getParserFactoryRef <em>Parser Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser Factory Ref</em>' attribute.
	 * @see #getParserFactoryRef()
	 * @generated
	 */
	void setParserFactoryRef(String value);

	/**
	 * Returns the value of the '<em><b>Text Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If the text is qualified with a character. Uses quote character by default.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Qualifier</em>' attribute.
	 * @see #setTextQualifier(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFlatpackDataFormat_TextQualifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='textQualifier'"
	 * @generated
	 */
	String getTextQualifier();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat#getTextQualifier <em>Text Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Qualifier</em>' attribute.
	 * @see #getTextQualifier()
	 * @generated
	 */
	void setTextQualifier(String value);

} // FlatpackDataFormat

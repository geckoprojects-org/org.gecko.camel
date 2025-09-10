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
import org.eclipse.fennec.camel.camelspring.FlatpackDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flatpack Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FlatpackDataFormatImpl#getAllowShortLines <em>Allow Short Lines</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FlatpackDataFormatImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FlatpackDataFormatImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FlatpackDataFormatImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FlatpackDataFormatImpl#getIgnoreExtraColumns <em>Ignore Extra Columns</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FlatpackDataFormatImpl#getIgnoreFirstRecord <em>Ignore First Record</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FlatpackDataFormatImpl#getParserFactoryRef <em>Parser Factory Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FlatpackDataFormatImpl#getTextQualifier <em>Text Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlatpackDataFormatImpl extends DataFormatImpl implements FlatpackDataFormat {
	/**
	 * The default value of the '{@link #getAllowShortLines() <em>Allow Short Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowShortLines()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_SHORT_LINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowShortLines() <em>Allow Short Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowShortLines()
	 * @generated
	 * @ordered
	 */
	protected String allowShortLines = ALLOW_SHORT_LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

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
	 * The default value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected String fixed = FIXED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreExtraColumns() <em>Ignore Extra Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreExtraColumns()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_EXTRA_COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreExtraColumns() <em>Ignore Extra Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreExtraColumns()
	 * @generated
	 * @ordered
	 */
	protected String ignoreExtraColumns = IGNORE_EXTRA_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreFirstRecord() <em>Ignore First Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreFirstRecord()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_FIRST_RECORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreFirstRecord() <em>Ignore First Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreFirstRecord()
	 * @generated
	 * @ordered
	 */
	protected String ignoreFirstRecord = IGNORE_FIRST_RECORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getParserFactoryRef() <em>Parser Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PARSER_FACTORY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParserFactoryRef() <em>Parser Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected String parserFactoryRef = PARSER_FACTORY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextQualifier() <em>Text Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextQualifier() <em>Text Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextQualifier()
	 * @generated
	 * @ordered
	 */
	protected String textQualifier = TEXT_QUALIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlatpackDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getFlatpackDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowShortLines() {
		return allowShortLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowShortLines(String newAllowShortLines) {
		String oldAllowShortLines = allowShortLines;
		allowShortLines = newAllowShortLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FLATPACK_DATA_FORMAT__ALLOW_SHORT_LINES, oldAllowShortLines, allowShortLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FLATPACK_DATA_FORMAT__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FLATPACK_DATA_FORMAT__DELIMITER, oldDelimiter, delimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixed(String newFixed) {
		String oldFixed = fixed;
		fixed = newFixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FLATPACK_DATA_FORMAT__FIXED, oldFixed, fixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreExtraColumns() {
		return ignoreExtraColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreExtraColumns(String newIgnoreExtraColumns) {
		String oldIgnoreExtraColumns = ignoreExtraColumns;
		ignoreExtraColumns = newIgnoreExtraColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FLATPACK_DATA_FORMAT__IGNORE_EXTRA_COLUMNS, oldIgnoreExtraColumns, ignoreExtraColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreFirstRecord() {
		return ignoreFirstRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreFirstRecord(String newIgnoreFirstRecord) {
		String oldIgnoreFirstRecord = ignoreFirstRecord;
		ignoreFirstRecord = newIgnoreFirstRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FLATPACK_DATA_FORMAT__IGNORE_FIRST_RECORD, oldIgnoreFirstRecord, ignoreFirstRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParserFactoryRef() {
		return parserFactoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParserFactoryRef(String newParserFactoryRef) {
		String oldParserFactoryRef = parserFactoryRef;
		parserFactoryRef = newParserFactoryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FLATPACK_DATA_FORMAT__PARSER_FACTORY_REF, oldParserFactoryRef, parserFactoryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextQualifier() {
		return textQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextQualifier(String newTextQualifier) {
		String oldTextQualifier = textQualifier;
		textQualifier = newTextQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FLATPACK_DATA_FORMAT__TEXT_QUALIFIER, oldTextQualifier, textQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__ALLOW_SHORT_LINES:
				return getAllowShortLines();
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__DEFINITION:
				return getDefinition();
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__DELIMITER:
				return getDelimiter();
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__FIXED:
				return getFixed();
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__IGNORE_EXTRA_COLUMNS:
				return getIgnoreExtraColumns();
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__IGNORE_FIRST_RECORD:
				return getIgnoreFirstRecord();
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__PARSER_FACTORY_REF:
				return getParserFactoryRef();
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__TEXT_QUALIFIER:
				return getTextQualifier();
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
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__ALLOW_SHORT_LINES:
				setAllowShortLines((String)newValue);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__DEFINITION:
				setDefinition((String)newValue);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__DELIMITER:
				setDelimiter((String)newValue);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__FIXED:
				setFixed((String)newValue);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__IGNORE_EXTRA_COLUMNS:
				setIgnoreExtraColumns((String)newValue);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__IGNORE_FIRST_RECORD:
				setIgnoreFirstRecord((String)newValue);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__PARSER_FACTORY_REF:
				setParserFactoryRef((String)newValue);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__TEXT_QUALIFIER:
				setTextQualifier((String)newValue);
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
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__ALLOW_SHORT_LINES:
				setAllowShortLines(ALLOW_SHORT_LINES_EDEFAULT);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__DELIMITER:
				setDelimiter(DELIMITER_EDEFAULT);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__FIXED:
				setFixed(FIXED_EDEFAULT);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__IGNORE_EXTRA_COLUMNS:
				setIgnoreExtraColumns(IGNORE_EXTRA_COLUMNS_EDEFAULT);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__IGNORE_FIRST_RECORD:
				setIgnoreFirstRecord(IGNORE_FIRST_RECORD_EDEFAULT);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__PARSER_FACTORY_REF:
				setParserFactoryRef(PARSER_FACTORY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__TEXT_QUALIFIER:
				setTextQualifier(TEXT_QUALIFIER_EDEFAULT);
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
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__ALLOW_SHORT_LINES:
				return ALLOW_SHORT_LINES_EDEFAULT == null ? allowShortLines != null : !ALLOW_SHORT_LINES_EDEFAULT.equals(allowShortLines);
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__DELIMITER:
				return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__FIXED:
				return FIXED_EDEFAULT == null ? fixed != null : !FIXED_EDEFAULT.equals(fixed);
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__IGNORE_EXTRA_COLUMNS:
				return IGNORE_EXTRA_COLUMNS_EDEFAULT == null ? ignoreExtraColumns != null : !IGNORE_EXTRA_COLUMNS_EDEFAULT.equals(ignoreExtraColumns);
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__IGNORE_FIRST_RECORD:
				return IGNORE_FIRST_RECORD_EDEFAULT == null ? ignoreFirstRecord != null : !IGNORE_FIRST_RECORD_EDEFAULT.equals(ignoreFirstRecord);
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__PARSER_FACTORY_REF:
				return PARSER_FACTORY_REF_EDEFAULT == null ? parserFactoryRef != null : !PARSER_FACTORY_REF_EDEFAULT.equals(parserFactoryRef);
			case CamelSpringPackage.FLATPACK_DATA_FORMAT__TEXT_QUALIFIER:
				return TEXT_QUALIFIER_EDEFAULT == null ? textQualifier != null : !TEXT_QUALIFIER_EDEFAULT.equals(textQualifier);
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
		result.append(" (allowShortLines: ");
		result.append(allowShortLines);
		result.append(", definition: ");
		result.append(definition);
		result.append(", delimiter: ");
		result.append(delimiter);
		result.append(", fixed: ");
		result.append(fixed);
		result.append(", ignoreExtraColumns: ");
		result.append(ignoreExtraColumns);
		result.append(", ignoreFirstRecord: ");
		result.append(ignoreFirstRecord);
		result.append(", parserFactoryRef: ");
		result.append(parserFactoryRef);
		result.append(", textQualifier: ");
		result.append(textQualifier);
		result.append(')');
		return result.toString();
	}

} //FlatpackDataFormatImpl

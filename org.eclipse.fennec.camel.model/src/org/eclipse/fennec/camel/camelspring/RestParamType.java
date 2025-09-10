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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rest Param Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestParamType()
 * @model extendedMetaData="name='restParamType'"
 * @generated
 */
@ProviderType
public enum RestParamType implements Enumerator {
	/**
	 * The '<em><b>Body</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY_VALUE
	 * @generated
	 * @ordered
	 */
	BODY(0, "body", "body"),

	/**
	 * The '<em><b>Form Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORM_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	FORM_DATA(1, "formData", "formData"),

	/**
	 * The '<em><b>Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	HEADER(2, "header", "header"),

	/**
	 * The '<em><b>Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_VALUE
	 * @generated
	 * @ordered
	 */
	PATH(3, "path", "path"),

	/**
	 * The '<em><b>Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY(4, "query", "query");

	/**
	 * The '<em><b>Body</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY
	 * @model name="body"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_VALUE = 0;

	/**
	 * The '<em><b>Form Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORM_DATA
	 * @model name="formData"
	 * @generated
	 * @ordered
	 */
	public static final int FORM_DATA_VALUE = 1;

	/**
	 * The '<em><b>Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER
	 * @model name="header"
	 * @generated
	 * @ordered
	 */
	public static final int HEADER_VALUE = 2;

	/**
	 * The '<em><b>Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH
	 * @model name="path"
	 * @generated
	 * @ordered
	 */
	public static final int PATH_VALUE = 3;

	/**
	 * The '<em><b>Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY
	 * @model name="query"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Rest Param Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RestParamType[] VALUES_ARRAY =
		new RestParamType[] {
			BODY,
			FORM_DATA,
			HEADER,
			PATH,
			QUERY,
		};

	/**
	 * A public read-only list of all the '<em><b>Rest Param Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RestParamType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rest Param Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RestParamType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RestParamType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rest Param Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RestParamType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RestParamType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rest Param Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RestParamType get(int value) {
		switch (value) {
			case BODY_VALUE: return BODY;
			case FORM_DATA_VALUE: return FORM_DATA;
			case HEADER_VALUE: return HEADER;
			case PATH_VALUE: return PATH;
			case QUERY_VALUE: return QUERY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RestParamType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RestParamType

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
 * A representation of the literals of the enumeration '<em><b>Json Library</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJsonLibrary()
 * @model extendedMetaData="name='jsonLibrary'"
 * @generated
 */
@ProviderType
public enum JsonLibrary implements Enumerator {
	/**
	 * The '<em><b>Fastjson</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FASTJSON_VALUE
	 * @generated
	 * @ordered
	 */
	FASTJSON(0, "Fastjson", "Fastjson"),

	/**
	 * The '<em><b>Gson</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GSON_VALUE
	 * @generated
	 * @ordered
	 */
	GSON(1, "Gson", "Gson"),

	/**
	 * The '<em><b>Jackson</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JACKSON_VALUE
	 * @generated
	 * @ordered
	 */
	JACKSON(2, "Jackson", "Jackson"),

	/**
	 * The '<em><b>Jsonb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSONB_VALUE
	 * @generated
	 * @ordered
	 */
	JSONB(3, "Jsonb", "Jsonb");

	/**
	 * The '<em><b>Fastjson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FASTJSON
	 * @model name="Fastjson"
	 * @generated
	 * @ordered
	 */
	public static final int FASTJSON_VALUE = 0;

	/**
	 * The '<em><b>Gson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GSON
	 * @model name="Gson"
	 * @generated
	 * @ordered
	 */
	public static final int GSON_VALUE = 1;

	/**
	 * The '<em><b>Jackson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JACKSON
	 * @model name="Jackson"
	 * @generated
	 * @ordered
	 */
	public static final int JACKSON_VALUE = 2;

	/**
	 * The '<em><b>Jsonb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSONB
	 * @model name="Jsonb"
	 * @generated
	 * @ordered
	 */
	public static final int JSONB_VALUE = 3;

	/**
	 * An array of all the '<em><b>Json Library</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JsonLibrary[] VALUES_ARRAY =
		new JsonLibrary[] {
			FASTJSON,
			GSON,
			JACKSON,
			JSONB,
		};

	/**
	 * A public read-only list of all the '<em><b>Json Library</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JsonLibrary> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Json Library</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JsonLibrary get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JsonLibrary result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Json Library</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JsonLibrary getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JsonLibrary result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Json Library</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JsonLibrary get(int value) {
		switch (value) {
			case FASTJSON_VALUE: return FASTJSON;
			case GSON_VALUE: return GSON;
			case JACKSON_VALUE: return JACKSON;
			case JSONB_VALUE: return JSONB;
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
	private JsonLibrary(int value, String name, String literal) {
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
	
} //JsonLibrary

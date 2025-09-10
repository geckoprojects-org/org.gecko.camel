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
 * A representation of the literals of the enumeration '<em><b>Type Converter Exists</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getTypeConverterExists()
 * @model extendedMetaData="name='typeConverterExists'"
 * @generated
 */
@ProviderType
public enum TypeConverterExists implements Enumerator {
	/**
	 * The '<em><b>Override</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERRIDE_VALUE
	 * @generated
	 * @ordered
	 */
	OVERRIDE(0, "Override", "Override"),

	/**
	 * The '<em><b>Ignore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE(1, "Ignore", "Ignore"),

	/**
	 * The '<em><b>Fail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIL_VALUE
	 * @generated
	 * @ordered
	 */
	FAIL(2, "Fail", "Fail");

	/**
	 * The '<em><b>Override</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERRIDE
	 * @model name="Override"
	 * @generated
	 * @ordered
	 */
	public static final int OVERRIDE_VALUE = 0;

	/**
	 * The '<em><b>Ignore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE
	 * @model name="Ignore"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_VALUE = 1;

	/**
	 * The '<em><b>Fail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIL
	 * @model name="Fail"
	 * @generated
	 * @ordered
	 */
	public static final int FAIL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Converter Exists</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeConverterExists[] VALUES_ARRAY =
		new TypeConverterExists[] {
			OVERRIDE,
			IGNORE,
			FAIL,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Converter Exists</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeConverterExists> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Converter Exists</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeConverterExists get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeConverterExists result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Converter Exists</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeConverterExists getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeConverterExists result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Converter Exists</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeConverterExists get(int value) {
		switch (value) {
			case OVERRIDE_VALUE: return OVERRIDE;
			case IGNORE_VALUE: return IGNORE;
			case FAIL_VALUE: return FAIL;
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
	private TypeConverterExists(int value, String name, String literal) {
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
	
} //TypeConverterExists

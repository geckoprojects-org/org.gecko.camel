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
 * A representation of the literals of the enumeration '<em><b>Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOption()
 * @model extendedMetaData="name='option'"
 * @generated
 */
@ProviderType
public enum Option implements Enumerator {
	/**
	 * The '<em><b>DEFAULTPATHLEAFTONULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULTPATHLEAFTONULL_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULTPATHLEAFTONULL(0, "DEFAULTPATHLEAFTONULL", "DEFAULT_PATH_LEAF_TO_NULL"),

	/**
	 * The '<em><b>ALWAYSRETURNLIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYSRETURNLIST_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYSRETURNLIST(1, "ALWAYSRETURNLIST", "ALWAYS_RETURN_LIST"),

	/**
	 * The '<em><b>ASPATHLIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASPATHLIST_VALUE
	 * @generated
	 * @ordered
	 */
	ASPATHLIST(2, "ASPATHLIST", "AS_PATH_LIST"),

	/**
	 * The '<em><b>SUPPRESSEXCEPTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPRESSEXCEPTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPRESSEXCEPTIONS(3, "SUPPRESSEXCEPTIONS", "SUPPRESS_EXCEPTIONS"),

	/**
	 * The '<em><b>REQUIREPROPERTIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREPROPERTIES_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREPROPERTIES(4, "REQUIREPROPERTIES", "REQUIRE_PROPERTIES");

	/**
	 * The '<em><b>DEFAULTPATHLEAFTONULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULTPATHLEAFTONULL
	 * @model literal="DEFAULT_PATH_LEAF_TO_NULL"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULTPATHLEAFTONULL_VALUE = 0;

	/**
	 * The '<em><b>ALWAYSRETURNLIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYSRETURNLIST
	 * @model literal="ALWAYS_RETURN_LIST"
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYSRETURNLIST_VALUE = 1;

	/**
	 * The '<em><b>ASPATHLIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASPATHLIST
	 * @model literal="AS_PATH_LIST"
	 * @generated
	 * @ordered
	 */
	public static final int ASPATHLIST_VALUE = 2;

	/**
	 * The '<em><b>SUPPRESSEXCEPTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPRESSEXCEPTIONS
	 * @model literal="SUPPRESS_EXCEPTIONS"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPRESSEXCEPTIONS_VALUE = 3;

	/**
	 * The '<em><b>REQUIREPROPERTIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREPROPERTIES
	 * @model literal="REQUIRE_PROPERTIES"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREPROPERTIES_VALUE = 4;

	/**
	 * An array of all the '<em><b>Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Option[] VALUES_ARRAY =
		new Option[] {
			DEFAULTPATHLEAFTONULL,
			ALWAYSRETURNLIST,
			ASPATHLIST,
			SUPPRESSEXCEPTIONS,
			REQUIREPROPERTIES,
		};

	/**
	 * A public read-only list of all the '<em><b>Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Option> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Option get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Option result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Option getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Option result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Option get(int value) {
		switch (value) {
			case DEFAULTPATHLEAFTONULL_VALUE: return DEFAULTPATHLEAFTONULL;
			case ALWAYSRETURNLIST_VALUE: return ALWAYSRETURNLIST;
			case ASPATHLIST_VALUE: return ASPATHLIST;
			case SUPPRESSEXCEPTIONS_VALUE: return SUPPRESSEXCEPTIONS;
			case REQUIREPROPERTIES_VALUE: return REQUIREPROPERTIES;
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
	private Option(int value, String name, String literal) {
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
	
} //Option

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
 * A representation of the literals of the enumeration '<em><b>Saga Propagation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getSagaPropagation()
 * @model extendedMetaData="name='sagaPropagation'"
 * @generated
 */
@ProviderType
public enum SagaPropagation implements Enumerator {
	/**
	 * The '<em><b>REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRED(0, "REQUIRED", "REQUIRED"),

	/**
	 * The '<em><b>REQUIRESNEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRESNEW_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRESNEW(1, "REQUIRESNEW", "REQUIRES_NEW"),

	/**
	 * The '<em><b>MANDATORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY_VALUE
	 * @generated
	 * @ordered
	 */
	MANDATORY(2, "MANDATORY", "MANDATORY"),

	/**
	 * The '<em><b>SUPPORTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORTS_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORTS(3, "SUPPORTS", "SUPPORTS"),

	/**
	 * The '<em><b>NOTSUPPORTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTSUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTSUPPORTED(4, "NOTSUPPORTED", "NOT_SUPPORTED"),

	/**
	 * The '<em><b>NEVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(5, "NEVER", "NEVER");

	/**
	 * The '<em><b>REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED_VALUE = 0;

	/**
	 * The '<em><b>REQUIRESNEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRESNEW
	 * @model literal="REQUIRES_NEW"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRESNEW_VALUE = 1;

	/**
	 * The '<em><b>MANDATORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANDATORY_VALUE = 2;

	/**
	 * The '<em><b>SUPPORTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORTS_VALUE = 3;

	/**
	 * The '<em><b>NOTSUPPORTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTSUPPORTED
	 * @model literal="NOT_SUPPORTED"
	 * @generated
	 * @ordered
	 */
	public static final int NOTSUPPORTED_VALUE = 4;

	/**
	 * The '<em><b>NEVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Saga Propagation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SagaPropagation[] VALUES_ARRAY =
		new SagaPropagation[] {
			REQUIRED,
			REQUIRESNEW,
			MANDATORY,
			SUPPORTS,
			NOTSUPPORTED,
			NEVER,
		};

	/**
	 * A public read-only list of all the '<em><b>Saga Propagation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SagaPropagation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Saga Propagation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SagaPropagation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SagaPropagation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Saga Propagation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SagaPropagation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SagaPropagation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Saga Propagation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SagaPropagation get(int value) {
		switch (value) {
			case REQUIRED_VALUE: return REQUIRED;
			case REQUIRESNEW_VALUE: return REQUIRESNEW;
			case MANDATORY_VALUE: return MANDATORY;
			case SUPPORTS_VALUE: return SUPPORTS;
			case NOTSUPPORTED_VALUE: return NOTSUPPORTED;
			case NEVER_VALUE: return NEVER;
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
	private SagaPropagation(int value, String name, String literal) {
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
	
} //SagaPropagation

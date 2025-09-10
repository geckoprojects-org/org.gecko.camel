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
 * A representation of the literals of the enumeration '<em><b>Claim Check Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getClaimCheckOperation()
 * @model extendedMetaData="name='claimCheckOperation'"
 * @generated
 */
@ProviderType
public enum ClaimCheckOperation implements Enumerator {
	/**
	 * The '<em><b>Get</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_VALUE
	 * @generated
	 * @ordered
	 */
	GET(0, "Get", "Get"),

	/**
	 * The '<em><b>Get And Remove</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_AND_REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	GET_AND_REMOVE(1, "GetAndRemove", "GetAndRemove"),

	/**
	 * The '<em><b>Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(2, "Set", "Set"),

	/**
	 * The '<em><b>Push</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH(3, "Push", "Push"),

	/**
	 * The '<em><b>Pop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POP_VALUE
	 * @generated
	 * @ordered
	 */
	POP(4, "Pop", "Pop");

	/**
	 * The '<em><b>Get</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET
	 * @model name="Get"
	 * @generated
	 * @ordered
	 */
	public static final int GET_VALUE = 0;

	/**
	 * The '<em><b>Get And Remove</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_AND_REMOVE
	 * @model name="GetAndRemove"
	 * @generated
	 * @ordered
	 */
	public static final int GET_AND_REMOVE_VALUE = 1;

	/**
	 * The '<em><b>Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model name="Set"
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 2;

	/**
	 * The '<em><b>Push</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH
	 * @model name="Push"
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_VALUE = 3;

	/**
	 * The '<em><b>Pop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POP
	 * @model name="Pop"
	 * @generated
	 * @ordered
	 */
	public static final int POP_VALUE = 4;

	/**
	 * An array of all the '<em><b>Claim Check Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClaimCheckOperation[] VALUES_ARRAY =
		new ClaimCheckOperation[] {
			GET,
			GET_AND_REMOVE,
			SET,
			PUSH,
			POP,
		};

	/**
	 * A public read-only list of all the '<em><b>Claim Check Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClaimCheckOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Claim Check Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClaimCheckOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClaimCheckOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Claim Check Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClaimCheckOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClaimCheckOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Claim Check Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClaimCheckOperation get(int value) {
		switch (value) {
			case GET_VALUE: return GET;
			case GET_AND_REMOVE_VALUE: return GET_AND_REMOVE;
			case SET_VALUE: return SET;
			case PUSH_VALUE: return PUSH;
			case POP_VALUE: return POP;
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
	private ClaimCheckOperation(int value, String name, String literal) {
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
	
} //ClaimCheckOperation

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
 * A representation of the literals of the enumeration '<em><b>Throttling Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getThrottlingMode()
 * @model extendedMetaData="name='throttlingMode'"
 * @generated
 */
@ProviderType
public enum ThrottlingMode implements Enumerator {
	/**
	 * The '<em><b>Total Requests</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTAL_REQUESTS_VALUE
	 * @generated
	 * @ordered
	 */
	TOTAL_REQUESTS(0, "TotalRequests", "TotalRequests"),

	/**
	 * The '<em><b>Concurrent Requests</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT_REQUESTS_VALUE
	 * @generated
	 * @ordered
	 */
	CONCURRENT_REQUESTS(1, "ConcurrentRequests", "ConcurrentRequests");

	/**
	 * The '<em><b>Total Requests</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTAL_REQUESTS
	 * @model name="TotalRequests"
	 * @generated
	 * @ordered
	 */
	public static final int TOTAL_REQUESTS_VALUE = 0;

	/**
	 * The '<em><b>Concurrent Requests</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT_REQUESTS
	 * @model name="ConcurrentRequests"
	 * @generated
	 * @ordered
	 */
	public static final int CONCURRENT_REQUESTS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Throttling Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ThrottlingMode[] VALUES_ARRAY =
		new ThrottlingMode[] {
			TOTAL_REQUESTS,
			CONCURRENT_REQUESTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Throttling Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ThrottlingMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Throttling Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThrottlingMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThrottlingMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Throttling Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThrottlingMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThrottlingMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Throttling Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThrottlingMode get(int value) {
		switch (value) {
			case TOTAL_REQUESTS_VALUE: return TOTAL_REQUESTS;
			case CONCURRENT_REQUESTS_VALUE: return CONCURRENT_REQUESTS;
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
	private ThrottlingMode(int value, String name, String literal) {
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
	
} //ThrottlingMode

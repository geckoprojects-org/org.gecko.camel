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
 * A representation of the literals of the enumeration '<em><b>Rest Host Name Resolver</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getRestHostNameResolver()
 * @model extendedMetaData="name='restHostNameResolver'"
 * @generated
 */
@ProviderType
public enum RestHostNameResolver implements Enumerator {
	/**
	 * The '<em><b>All Local Ip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_LOCAL_IP_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_LOCAL_IP(0, "allLocalIp", "allLocalIp"),

	/**
	 * The '<em><b>Local Ip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_IP_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_IP(1, "localIp", "localIp"),

	/**
	 * The '<em><b>Local Host Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_HOST_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_HOST_NAME(2, "localHostName", "localHostName"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(3, "none", "none");

	/**
	 * The '<em><b>All Local Ip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_LOCAL_IP
	 * @model name="allLocalIp"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_LOCAL_IP_VALUE = 0;

	/**
	 * The '<em><b>Local Ip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_IP
	 * @model name="localIp"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_IP_VALUE = 1;

	/**
	 * The '<em><b>Local Host Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_HOST_NAME
	 * @model name="localHostName"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_HOST_NAME_VALUE = 2;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Rest Host Name Resolver</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RestHostNameResolver[] VALUES_ARRAY =
		new RestHostNameResolver[] {
			ALL_LOCAL_IP,
			LOCAL_IP,
			LOCAL_HOST_NAME,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Rest Host Name Resolver</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RestHostNameResolver> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rest Host Name Resolver</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RestHostNameResolver get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RestHostNameResolver result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rest Host Name Resolver</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RestHostNameResolver getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RestHostNameResolver result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rest Host Name Resolver</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RestHostNameResolver get(int value) {
		switch (value) {
			case ALL_LOCAL_IP_VALUE: return ALL_LOCAL_IP;
			case LOCAL_IP_VALUE: return LOCAL_IP;
			case LOCAL_HOST_NAME_VALUE: return LOCAL_HOST_NAME;
			case NONE_VALUE: return NONE;
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
	private RestHostNameResolver(int value, String name, String literal) {
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
	
} //RestHostNameResolver

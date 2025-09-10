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
 * A representation of the literals of the enumeration '<em><b>Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMode()
 * @model extendedMetaData="name='mode'"
 * @generated
 */
@ProviderType
public enum Mode implements Enumerator {
	/**
	 * The '<em><b>INJECTINGCONTEXTUALNAMESPACEBINDINGS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INJECTINGCONTEXTUALNAMESPACEBINDINGS_VALUE
	 * @generated
	 * @ordered
	 */
	INJECTINGCONTEXTUALNAMESPACEBINDINGS(0, "INJECTINGCONTEXTUALNAMESPACEBINDINGS", "INJECTING_CONTEXTUAL_NAMESPACE_BINDINGS"),

	/**
	 * The '<em><b>WRAPPINGEXTRACTEDTOKEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRAPPINGEXTRACTEDTOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	WRAPPINGEXTRACTEDTOKEN(1, "WRAPPINGEXTRACTEDTOKEN", "WRAPPING_EXTRACTED_TOKEN"),

	/**
	 * The '<em><b>UNWRAPPINGEXTRACTEDTOKEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNWRAPPINGEXTRACTEDTOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	UNWRAPPINGEXTRACTEDTOKEN(2, "UNWRAPPINGEXTRACTEDTOKEN", "UNWRAPPING_EXTRACTED_TOKEN"),

	/**
	 * The '<em><b>EXTRACTINGTEXTCONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRACTINGTEXTCONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	EXTRACTINGTEXTCONTENT(3, "EXTRACTINGTEXTCONTENT", "EXTRACTING_TEXT_CONTENT");

	/**
	 * The '<em><b>INJECTINGCONTEXTUALNAMESPACEBINDINGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INJECTINGCONTEXTUALNAMESPACEBINDINGS
	 * @model literal="INJECTING_CONTEXTUAL_NAMESPACE_BINDINGS"
	 * @generated
	 * @ordered
	 */
	public static final int INJECTINGCONTEXTUALNAMESPACEBINDINGS_VALUE = 0;

	/**
	 * The '<em><b>WRAPPINGEXTRACTEDTOKEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRAPPINGEXTRACTEDTOKEN
	 * @model literal="WRAPPING_EXTRACTED_TOKEN"
	 * @generated
	 * @ordered
	 */
	public static final int WRAPPINGEXTRACTEDTOKEN_VALUE = 1;

	/**
	 * The '<em><b>UNWRAPPINGEXTRACTEDTOKEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNWRAPPINGEXTRACTEDTOKEN
	 * @model literal="UNWRAPPING_EXTRACTED_TOKEN"
	 * @generated
	 * @ordered
	 */
	public static final int UNWRAPPINGEXTRACTEDTOKEN_VALUE = 2;

	/**
	 * The '<em><b>EXTRACTINGTEXTCONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRACTINGTEXTCONTENT
	 * @model literal="EXTRACTING_TEXT_CONTENT"
	 * @generated
	 * @ordered
	 */
	public static final int EXTRACTINGTEXTCONTENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Mode[] VALUES_ARRAY =
		new Mode[] {
			INJECTINGCONTEXTUALNAMESPACEBINDINGS,
			WRAPPINGEXTRACTEDTOKEN,
			UNWRAPPINGEXTRACTEDTOKEN,
			EXTRACTINGTEXTCONTENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Mode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Mode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Mode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Mode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Mode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Mode get(int value) {
		switch (value) {
			case INJECTINGCONTEXTUALNAMESPACEBINDINGS_VALUE: return INJECTINGCONTEXTUALNAMESPACEBINDINGS;
			case WRAPPINGEXTRACTEDTOKEN_VALUE: return WRAPPINGEXTRACTEDTOKEN;
			case UNWRAPPINGEXTRACTEDTOKEN_VALUE: return UNWRAPPINGEXTRACTEDTOKEN;
			case EXTRACTINGTEXTCONTENT_VALUE: return EXTRACTINGTEXTCONTENT;
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
	private Mode(int value, String name, String literal) {
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
	
} //Mode

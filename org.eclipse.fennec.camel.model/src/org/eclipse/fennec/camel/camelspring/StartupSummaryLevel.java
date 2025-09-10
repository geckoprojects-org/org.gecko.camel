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
 * A representation of the literals of the enumeration '<em><b>Startup Summary Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStartupSummaryLevel()
 * @model extendedMetaData="name='startupSummaryLevel'"
 * @generated
 */
@ProviderType
public enum StartupSummaryLevel implements Enumerator {
	/**
	 * The '<em><b>Verbose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERBOSE_VALUE
	 * @generated
	 * @ordered
	 */
	VERBOSE(0, "Verbose", "Verbose"),

	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(1, "Default", "Default"),

	/**
	 * The '<em><b>Brief</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIEF_VALUE
	 * @generated
	 * @ordered
	 */
	BRIEF(2, "Brief", "Brief"),

	/**
	 * The '<em><b>Oneline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONELINE_VALUE
	 * @generated
	 * @ordered
	 */
	ONELINE(3, "Oneline", "Oneline"),

	/**
	 * The '<em><b>Off</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_VALUE
	 * @generated
	 * @ordered
	 */
	OFF(4, "Off", "Off");

	/**
	 * The '<em><b>Verbose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERBOSE
	 * @model name="Verbose"
	 * @generated
	 * @ordered
	 */
	public static final int VERBOSE_VALUE = 0;

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="Default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 1;

	/**
	 * The '<em><b>Brief</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIEF
	 * @model name="Brief"
	 * @generated
	 * @ordered
	 */
	public static final int BRIEF_VALUE = 2;

	/**
	 * The '<em><b>Oneline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONELINE
	 * @model name="Oneline"
	 * @generated
	 * @ordered
	 */
	public static final int ONELINE_VALUE = 3;

	/**
	 * The '<em><b>Off</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF
	 * @model name="Off"
	 * @generated
	 * @ordered
	 */
	public static final int OFF_VALUE = 4;

	/**
	 * An array of all the '<em><b>Startup Summary Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StartupSummaryLevel[] VALUES_ARRAY =
		new StartupSummaryLevel[] {
			VERBOSE,
			DEFAULT,
			BRIEF,
			ONELINE,
			OFF,
		};

	/**
	 * A public read-only list of all the '<em><b>Startup Summary Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StartupSummaryLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Startup Summary Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StartupSummaryLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StartupSummaryLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Startup Summary Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StartupSummaryLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StartupSummaryLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Startup Summary Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StartupSummaryLevel get(int value) {
		switch (value) {
			case VERBOSE_VALUE: return VERBOSE;
			case DEFAULT_VALUE: return DEFAULT;
			case BRIEF_VALUE: return BRIEF;
			case ONELINE_VALUE: return ONELINE;
			case OFF_VALUE: return OFF;
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
	private StartupSummaryLevel(int value, String name, String literal) {
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
	
} //StartupSummaryLevel

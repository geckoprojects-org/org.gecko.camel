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
package org.eclipse.fennec.camel.whiteboard.pipeline;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Route Definition Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage#getRouteDefinitionFormat()
 * @model
 * @generated
 */
@ProviderType
public enum RouteDefinitionFormat implements Enumerator {
	/**
	 * The '<em><b>JAVA DSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_DSL_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_DSL(0, "JAVA_DSL", "java-dsl"),

	/**
	 * The '<em><b>YAML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YAML_VALUE
	 * @generated
	 * @ordered
	 */
	YAML(1, "YAML", "yaml"),

	/**
	 * The '<em><b>JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(2, "JSON", "json"),

	/**
	 * The '<em><b>XML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_VALUE
	 * @generated
	 * @ordered
	 */
	XML(3, "XML", "xml");

	/**
	 * The '<em><b>JAVA DSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_DSL
	 * @model literal="java-dsl"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_DSL_VALUE = 0;

	/**
	 * The '<em><b>YAML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YAML
	 * @model literal="yaml"
	 * @generated
	 * @ordered
	 */
	public static final int YAML_VALUE = 1;

	/**
	 * The '<em><b>JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON
	 * @model literal="json"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 2;

	/**
	 * The '<em><b>XML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML
	 * @model literal="xml"
	 * @generated
	 * @ordered
	 */
	public static final int XML_VALUE = 3;

	/**
	 * An array of all the '<em><b>Route Definition Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RouteDefinitionFormat[] VALUES_ARRAY =
		new RouteDefinitionFormat[] {
			JAVA_DSL,
			YAML,
			JSON,
			XML,
		};

	/**
	 * A public read-only list of all the '<em><b>Route Definition Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RouteDefinitionFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Route Definition Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RouteDefinitionFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RouteDefinitionFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Route Definition Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RouteDefinitionFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RouteDefinitionFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Route Definition Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RouteDefinitionFormat get(int value) {
		switch (value) {
			case JAVA_DSL_VALUE: return JAVA_DSL;
			case YAML_VALUE: return YAML;
			case JSON_VALUE: return JSON;
			case XML_VALUE: return XML;
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
	private RouteDefinitionFormat(int value, String name, String literal) {
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
	
} //RouteDefinitionFormat

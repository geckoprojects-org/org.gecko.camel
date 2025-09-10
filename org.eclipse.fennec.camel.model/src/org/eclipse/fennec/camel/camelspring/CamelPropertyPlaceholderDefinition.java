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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Property Placeholder Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#getPropertiesFunction <em>Properties Function</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#getPropertiesLocation <em>Properties Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isDefaultFallbackEnabled <em>Default Fallback Enabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isIgnoreMissingLocation <em>Ignore Missing Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isNestedPlaceholder <em>Nested Placeholder</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#getPropertiesParserRef <em>Properties Parser Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderDefinition()
 * @model extendedMetaData="name='camelPropertyPlaceholderDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CamelPropertyPlaceholderDefinition extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Properties Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderFunctionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Function to use with properties placeholder
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties Function</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderDefinition_PropertiesFunction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertiesFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CamelPropertyPlaceholderFunctionDefinition> getPropertiesFunction();

	/**
	 * Returns the value of the '<em><b>Properties Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Properties to use with properties placeholder
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties Location</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderDefinition_PropertiesLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertiesLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CamelPropertyPlaceholderLocationDefinition> getPropertiesLocation();

	/**
	 * Returns the value of the '<em><b>Default Fallback Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If false, the component does not attempt to find a default for the key by looking after the colon separator. Default
	 * value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Fallback Enabled</em>' attribute.
	 * @see #isSetDefaultFallbackEnabled()
	 * @see #unsetDefaultFallbackEnabled()
	 * @see #setDefaultFallbackEnabled(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderDefinition_DefaultFallbackEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='defaultFallbackEnabled'"
	 * @generated
	 */
	boolean isDefaultFallbackEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isDefaultFallbackEnabled <em>Default Fallback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Fallback Enabled</em>' attribute.
	 * @see #isSetDefaultFallbackEnabled()
	 * @see #unsetDefaultFallbackEnabled()
	 * @see #isDefaultFallbackEnabled()
	 * @generated
	 */
	void setDefaultFallbackEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isDefaultFallbackEnabled <em>Default Fallback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultFallbackEnabled()
	 * @see #isDefaultFallbackEnabled()
	 * @see #setDefaultFallbackEnabled(boolean)
	 * @generated
	 */
	void unsetDefaultFallbackEnabled();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isDefaultFallbackEnabled <em>Default Fallback Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Fallback Enabled</em>' attribute is set.
	 * @see #unsetDefaultFallbackEnabled()
	 * @see #isDefaultFallbackEnabled()
	 * @see #setDefaultFallbackEnabled(boolean)
	 * @generated
	 */
	boolean isSetDefaultFallbackEnabled();

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encoding to use when loading properties file from the file system or classpath. If no encoding has been set, then the
	 * properties files is loaded using ISO-8859-1 encoding (latin-1) as documented by
	 * java.util.Properties#load(java.io.InputStream).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderDefinition_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Missing Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to silently ignore if a location cannot be located, such as a properties file not found. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Missing Location</em>' attribute.
	 * @see #isSetIgnoreMissingLocation()
	 * @see #unsetIgnoreMissingLocation()
	 * @see #setIgnoreMissingLocation(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderDefinition_IgnoreMissingLocation()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ignoreMissingLocation'"
	 * @generated
	 */
	boolean isIgnoreMissingLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isIgnoreMissingLocation <em>Ignore Missing Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Missing Location</em>' attribute.
	 * @see #isSetIgnoreMissingLocation()
	 * @see #unsetIgnoreMissingLocation()
	 * @see #isIgnoreMissingLocation()
	 * @generated
	 */
	void setIgnoreMissingLocation(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isIgnoreMissingLocation <em>Ignore Missing Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreMissingLocation()
	 * @see #isIgnoreMissingLocation()
	 * @see #setIgnoreMissingLocation(boolean)
	 * @generated
	 */
	void unsetIgnoreMissingLocation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isIgnoreMissingLocation <em>Ignore Missing Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Missing Location</em>' attribute is set.
	 * @see #unsetIgnoreMissingLocation()
	 * @see #isIgnoreMissingLocation()
	 * @see #setIgnoreMissingLocation(boolean)
	 * @generated
	 */
	boolean isSetIgnoreMissingLocation();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A list of locations to load properties. You can use comma to separate multiple locations. This option will override any
	 * default locations and only use the locations from this option.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderDefinition_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='location'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Nested Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to support nested property placeholders. A nested placeholder, means that a placeholder, has also a placeholder,
	 * that should be resolved (recursively). Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Placeholder</em>' attribute.
	 * @see #isSetNestedPlaceholder()
	 * @see #unsetNestedPlaceholder()
	 * @see #setNestedPlaceholder(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderDefinition_NestedPlaceholder()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='nestedPlaceholder'"
	 * @generated
	 */
	boolean isNestedPlaceholder();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isNestedPlaceholder <em>Nested Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Placeholder</em>' attribute.
	 * @see #isSetNestedPlaceholder()
	 * @see #unsetNestedPlaceholder()
	 * @see #isNestedPlaceholder()
	 * @generated
	 */
	void setNestedPlaceholder(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isNestedPlaceholder <em>Nested Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNestedPlaceholder()
	 * @see #isNestedPlaceholder()
	 * @see #setNestedPlaceholder(boolean)
	 * @generated
	 */
	void unsetNestedPlaceholder();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#isNestedPlaceholder <em>Nested Placeholder</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nested Placeholder</em>' attribute is set.
	 * @see #unsetNestedPlaceholder()
	 * @see #isNestedPlaceholder()
	 * @see #setNestedPlaceholder(boolean)
	 * @generated
	 */
	boolean isSetNestedPlaceholder();

	/**
	 * Returns the value of the '<em><b>Properties Parser Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reference to a custom PropertiesParser to be used.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties Parser Ref</em>' attribute.
	 * @see #setPropertiesParserRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getCamelPropertyPlaceholderDefinition_PropertiesParserRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='propertiesParserRef'"
	 * @generated
	 */
	String getPropertiesParserRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition#getPropertiesParserRef <em>Properties Parser Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Parser Ref</em>' attribute.
	 * @see #getPropertiesParserRef()
	 * @generated
	 */
	void setPropertiesParserRef(String value);

} // CamelPropertyPlaceholderDefinition

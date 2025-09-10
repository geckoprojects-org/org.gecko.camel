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
 * A representation of the model object '<em><b>Yaml Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getTypeFilter <em>Type Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getAllowAnyType <em>Allow Any Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getAllowRecursiveKeys <em>Allow Recursive Keys</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getDumperOptions <em>Dumper Options</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getMaxAliasesForCollections <em>Max Aliases For Collections</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getPrettyFlow <em>Pretty Flow</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getRepresenter <em>Representer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getResolver <em>Resolver</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getUnmarshalType <em>Unmarshal Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getUseApplicationContextClassLoader <em>Use Application Context Class Loader</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat()
 * @model extendedMetaData="name='yamlDataFormat' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface YamlDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Type Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.YamlTypeFilterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Filter</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_TypeFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<YamlTypeFilterDefinition> getTypeFilter();

	/**
	 * Returns the value of the '<em><b>Allow Any Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allow any class to be un-marshaled. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Any Type</em>' attribute.
	 * @see #setAllowAnyType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_AllowAnyType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowAnyType'"
	 * @generated
	 */
	String getAllowAnyType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getAllowAnyType <em>Allow Any Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Any Type</em>' attribute.
	 * @see #getAllowAnyType()
	 * @generated
	 */
	void setAllowAnyType(String value);

	/**
	 * Returns the value of the '<em><b>Allow Recursive Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set whether recursive keys are allowed. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Recursive Keys</em>' attribute.
	 * @see #setAllowRecursiveKeys(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_AllowRecursiveKeys()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowRecursiveKeys'"
	 * @generated
	 */
	String getAllowRecursiveKeys();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getAllowRecursiveKeys <em>Allow Recursive Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Recursive Keys</em>' attribute.
	 * @see #getAllowRecursiveKeys()
	 * @generated
	 */
	void setAllowRecursiveKeys(String value);

	/**
	 * Returns the value of the '<em><b>Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * BaseConstructor to construct incoming documents.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constructor</em>' attribute.
	 * @see #setConstructor(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_Constructor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='constructor'"
	 * @generated
	 */
	String getConstructor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getConstructor <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor</em>' attribute.
	 * @see #getConstructor()
	 * @generated
	 */
	void setConstructor(String value);

	/**
	 * Returns the value of the '<em><b>Dumper Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * DumperOptions to configure outgoing objects.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dumper Options</em>' attribute.
	 * @see #setDumperOptions(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_DumperOptions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dumperOptions'"
	 * @generated
	 */
	String getDumperOptions();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getDumperOptions <em>Dumper Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dumper Options</em>' attribute.
	 * @see #getDumperOptions()
	 * @generated
	 */
	void setDumperOptions(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.camel.camelspring.YamlLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Which yaml library to use. By default it is SnakeYAML. Default value: SnakeYAML
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.YamlLibrary
	 * @see #isSetLibrary()
	 * @see #unsetLibrary()
	 * @see #setLibrary(YamlLibrary)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_Library()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='library'"
	 * @generated
	 */
	YamlLibrary getLibrary();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see org.eclipse.fennec.camel.camelspring.YamlLibrary
	 * @see #isSetLibrary()
	 * @see #unsetLibrary()
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(YamlLibrary value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLibrary()
	 * @see #getLibrary()
	 * @see #setLibrary(YamlLibrary)
	 * @generated
	 */
	void unsetLibrary();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getLibrary <em>Library</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Library</em>' attribute is set.
	 * @see #unsetLibrary()
	 * @see #getLibrary()
	 * @see #setLibrary(YamlLibrary)
	 * @generated
	 */
	boolean isSetLibrary();

	/**
	 * Returns the value of the '<em><b>Max Aliases For Collections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the maximum amount of aliases allowed for collections. Default value: 50
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Aliases For Collections</em>' attribute.
	 * @see #setMaxAliasesForCollections(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_MaxAliasesForCollections()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxAliasesForCollections'"
	 * @generated
	 */
	String getMaxAliasesForCollections();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getMaxAliasesForCollections <em>Max Aliases For Collections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Aliases For Collections</em>' attribute.
	 * @see #getMaxAliasesForCollections()
	 * @generated
	 */
	void setMaxAliasesForCollections(String value);

	/**
	 * Returns the value of the '<em><b>Pretty Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Force the emitter to produce a pretty YAML document when using the flow style. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pretty Flow</em>' attribute.
	 * @see #setPrettyFlow(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_PrettyFlow()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='prettyFlow'"
	 * @generated
	 */
	String getPrettyFlow();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getPrettyFlow <em>Pretty Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pretty Flow</em>' attribute.
	 * @see #getPrettyFlow()
	 * @generated
	 */
	void setPrettyFlow(String value);

	/**
	 * Returns the value of the '<em><b>Representer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Representer to emit outgoing objects.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representer</em>' attribute.
	 * @see #setRepresenter(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_Representer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='representer'"
	 * @generated
	 */
	String getRepresenter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getRepresenter <em>Representer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representer</em>' attribute.
	 * @see #getRepresenter()
	 * @generated
	 */
	void setRepresenter(String value);

	/**
	 * Returns the value of the '<em><b>Resolver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Resolver to detect implicit type.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolver</em>' attribute.
	 * @see #setResolver(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_Resolver()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resolver'"
	 * @generated
	 */
	String getResolver();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getResolver <em>Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver</em>' attribute.
	 * @see #getResolver()
	 * @generated
	 */
	void setResolver(String value);

	/**
	 * Returns the value of the '<em><b>Unmarshal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Class name of the java type to use when unmarshalling.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unmarshal Type</em>' attribute.
	 * @see #setUnmarshalType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_UnmarshalType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unmarshalType'"
	 * @generated
	 */
	String getUnmarshalType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getUnmarshalType <em>Unmarshal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmarshal Type</em>' attribute.
	 * @see #getUnmarshalType()
	 * @generated
	 */
	void setUnmarshalType(String value);

	/**
	 * Returns the value of the '<em><b>Use Application Context Class Loader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Use ApplicationContextClassLoader as custom ClassLoader. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Application Context Class Loader</em>' attribute.
	 * @see #setUseApplicationContextClassLoader(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getYamlDataFormat_UseApplicationContextClassLoader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useApplicationContextClassLoader'"
	 * @generated
	 */
	String getUseApplicationContextClassLoader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat#getUseApplicationContextClassLoader <em>Use Application Context Class Loader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Application Context Class Loader</em>' attribute.
	 * @see #getUseApplicationContextClassLoader()
	 * @generated
	 */
	void setUseApplicationContextClassLoader(String value);

} // YamlDataFormat

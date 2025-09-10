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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Factory Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getBuilderClass <em>Builder Class</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getBuilderMethod <em>Builder Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getDestroyMethod <em>Destroy Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getFactoryMethod <em>Factory Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getInitMethod <em>Init Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getScriptLanguage <em>Script Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getScriptPropertyPlaceholders <em>Script Property Placeholders</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition()
 * @model extendedMetaData="name='beanFactoryDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BeanFactoryDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Constructors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Optional constructor arguments for creating the bean. Arguments correspond to specific index of the constructor argument
	 * list, starting from zero.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constructors</em>' containment reference.
	 * @see #setConstructors(BeanConstructorsDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_Constructors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constructors' namespace='##targetNamespace'"
	 * @generated
	 */
	BeanConstructorsDefinition getConstructors();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getConstructors <em>Constructors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructors</em>' containment reference.
	 * @see #getConstructors()
	 * @generated
	 */
	void setConstructors(BeanConstructorsDefinition value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Optional properties to set on the created bean.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(BeanPropertiesDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	BeanPropertiesDefinition getProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(BeanPropertiesDefinition value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The script to execute that creates the bean when using scripting languages. If the script use the prefix resource: such
	 * as resource:classpath:com/foo/myscript.groovy, resource:file:/var/myscript.groovy, then its loaded from the external
	 * resource.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_Script()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

	/**
	 * Returns the value of the '<em><b>Builder Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Fully qualified class name of builder class to use for creating and configuring the bean. The builder will use the
	 * properties values to configure the bean.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Builder Class</em>' attribute.
	 * @see #setBuilderClass(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_BuilderClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='builderClass'"
	 * @generated
	 */
	String getBuilderClass();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getBuilderClass <em>Builder Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder Class</em>' attribute.
	 * @see #getBuilderClass()
	 * @generated
	 */
	void setBuilderClass(String value);

	/**
	 * Returns the value of the '<em><b>Builder Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of method when using builder class. This method is invoked after configuring to create the actual bean. This method
	 * is often named build (used by default). Default value: build
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Builder Method</em>' attribute.
	 * @see #setBuilderMethod(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_BuilderMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='builderMethod'"
	 * @generated
	 */
	String getBuilderMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getBuilderMethod <em>Builder Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder Method</em>' attribute.
	 * @see #getBuilderMethod()
	 * @generated
	 */
	void setBuilderMethod(String value);

	/**
	 * Returns the value of the '<em><b>Destroy Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The name of the custom destroy method to invoke on bean shutdown, such as when Camel is shutting down. The method must
	 * have no arguments, but may throw any exception.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destroy Method</em>' attribute.
	 * @see #setDestroyMethod(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_DestroyMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='destroyMethod'"
	 * @generated
	 */
	String getDestroyMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getDestroyMethod <em>Destroy Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy Method</em>' attribute.
	 * @see #getDestroyMethod()
	 * @generated
	 */
	void setDestroyMethod(String value);

	/**
	 * Returns the value of the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of factory bean (bean id) to use for creating the bean.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factory Bean</em>' attribute.
	 * @see #setFactoryBean(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_FactoryBean()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='factoryBean'"
	 * @generated
	 */
	String getFactoryBean();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getFactoryBean <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Bean</em>' attribute.
	 * @see #getFactoryBean()
	 * @generated
	 */
	void setFactoryBean(String value);

	/**
	 * Returns the value of the '<em><b>Factory Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of method to invoke when creating the bean via a factory bean.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factory Method</em>' attribute.
	 * @see #setFactoryMethod(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_FactoryMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='factoryMethod'"
	 * @generated
	 */
	String getFactoryMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getFactoryMethod <em>Factory Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Method</em>' attribute.
	 * @see #getFactoryMethod()
	 * @generated
	 */
	void setFactoryMethod(String value);

	/**
	 * Returns the value of the '<em><b>Init Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The name of the custom initialization method to invoke after setting bean properties. The method must have no arguments,
	 * but may throw any exception.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Method</em>' attribute.
	 * @see #setInitMethod(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_InitMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='initMethod'"
	 * @generated
	 */
	String getInitMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getInitMethod <em>Init Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Method</em>' attribute.
	 * @see #getInitMethod()
	 * @generated
	 */
	void setInitMethod(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The name of the bean (bean id).
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Script Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The script language to use when using inlined script for creating the bean, such as groovy, java, javascript etc.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script Language</em>' attribute.
	 * @see #setScriptLanguage(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_ScriptLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scriptLanguage'"
	 * @generated
	 */
	String getScriptLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getScriptLanguage <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Language</em>' attribute.
	 * @see #getScriptLanguage()
	 * @generated
	 */
	void setScriptLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Script Property Placeholders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the script should support using Camel property placeholder syntax {{ }}. Default value: true
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script Property Placeholders</em>' attribute.
	 * @see #setScriptPropertyPlaceholders(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_ScriptPropertyPlaceholders()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scriptPropertyPlaceholders'"
	 * @generated
	 */
	String getScriptPropertyPlaceholders();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getScriptPropertyPlaceholders <em>Script Property Placeholders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Property Placeholders</em>' attribute.
	 * @see #getScriptPropertyPlaceholders()
	 * @generated
	 */
	void setScriptPropertyPlaceholders(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The class name (fully qualified) of the bean.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBeanFactoryDefinition_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // BeanFactoryDefinition

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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPath Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getFactoryRef <em>Factory Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getLogNamespaces <em>Log Namespaces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getObjectModel <em>Object Model</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getPreCompile <em>Pre Compile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getResultQName <em>Result QName</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getSaxon <em>Saxon</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getThreadSafety <em>Thread Safety</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXPathExpression()
 * @model extendedMetaData="name='xPathExpression' kind='simple'"
 * @generated
 */
@ProviderType
public interface XPathExpression extends NamespaceAwareExpression {
	/**
	 * Returns the value of the '<em><b>Document Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of class for document type The default value is org.w3c.dom.Document.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Type</em>' attribute.
	 * @see #setDocumentType(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXPathExpression_DocumentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='documentType'"
	 * @generated
	 */
	String getDocumentType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getDocumentType <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' attribute.
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(String value);

	/**
	 * Returns the value of the '<em><b>Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * References to a custom XPathFactory to lookup in the registry.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factory Ref</em>' attribute.
	 * @see #setFactoryRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXPathExpression_FactoryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='factoryRef'"
	 * @generated
	 */
	String getFactoryRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getFactoryRef <em>Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Ref</em>' attribute.
	 * @see #getFactoryRef()
	 * @generated
	 */
	void setFactoryRef(String value);

	/**
	 * Returns the value of the '<em><b>Log Namespaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to log namespaces which can assist during troubleshooting. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Namespaces</em>' attribute.
	 * @see #setLogNamespaces(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXPathExpression_LogNamespaces()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logNamespaces'"
	 * @generated
	 */
	String getLogNamespaces();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getLogNamespaces <em>Log Namespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Namespaces</em>' attribute.
	 * @see #getLogNamespaces()
	 * @generated
	 */
	void setLogNamespaces(String value);

	/**
	 * Returns the value of the '<em><b>Object Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The XPath object model to use.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Model</em>' attribute.
	 * @see #setObjectModel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXPathExpression_ObjectModel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='objectModel'"
	 * @generated
	 */
	String getObjectModel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getObjectModel <em>Object Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Model</em>' attribute.
	 * @see #getObjectModel()
	 * @generated
	 */
	void setObjectModel(String value);

	/**
	 * Returns the value of the '<em><b>Pre Compile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to enable pre-compiling the xpath expression during initialization phase. pre-compile is enabled by default.
	 * This can be used to turn off, for example in cases the compilation phase is desired at the starting phase, such as if
	 * the application is ahead of time compiled (for example with camel-quarkus) which would then load the xpath factory of
	 * the built operating system, and not a JVM runtime. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Compile</em>' attribute.
	 * @see #setPreCompile(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXPathExpression_PreCompile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='preCompile'"
	 * @generated
	 */
	String getPreCompile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getPreCompile <em>Pre Compile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Compile</em>' attribute.
	 * @see #getPreCompile()
	 * @generated
	 */
	void setPreCompile(String value);

	/**
	 * Returns the value of the '<em><b>Result QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the output type supported by XPath. Default value: NODESET
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result QName</em>' attribute.
	 * @see #setResultQName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXPathExpression_ResultQName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resultQName'"
	 * @generated
	 */
	String getResultQName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getResultQName <em>Result QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result QName</em>' attribute.
	 * @see #getResultQName()
	 * @generated
	 */
	void setResultQName(String value);

	/**
	 * Returns the value of the '<em><b>Saxon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to use Saxon. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Saxon</em>' attribute.
	 * @see #setSaxon(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXPathExpression_Saxon()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='saxon'"
	 * @generated
	 */
	String getSaxon();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getSaxon <em>Saxon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saxon</em>' attribute.
	 * @see #getSaxon()
	 * @generated
	 */
	void setSaxon(String value);

	/**
	 * Returns the value of the '<em><b>Thread Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to enable thread-safety for the returned result of the xpath expression. This applies to when using NODESET as
	 * the result type, and the returned set has multiple elements. In this situation there can be thread-safety issues if you
	 * process the NODESET concurrently such as from a Camel Splitter EIP in parallel processing mode. This option prevents
	 * concurrency issues by doing defensive copies of the nodes. It is recommended to turn this option on if you are using
	 * camel-saxon or Saxon in your application. Saxon has thread-safety issues which can be prevented by turning this option
	 * on. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Safety</em>' attribute.
	 * @see #setThreadSafety(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getXPathExpression_ThreadSafety()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='threadSafety'"
	 * @generated
	 */
	String getThreadSafety();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.XPathExpression#getThreadSafety <em>Thread Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Safety</em>' attribute.
	 * @see #getThreadSafety()
	 * @generated
	 */
	void setThreadSafety(String value);

} // XPathExpression

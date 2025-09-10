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
 * A representation of the model object '<em><b>Jaxb Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getAccessExternalSchemaProtocols <em>Access External Schema Protocols</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getContextPathIsClassName <em>Context Path Is Class Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getFilterNonXmlChars <em>Filter Non Xml Chars</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getFragment <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getIgnoreJAXBElement <em>Ignore JAXB Element</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getJaxbProviderProperties <em>Jaxb Provider Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getMustBeJAXBElement <em>Must Be JAXB Element</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getNamespacePrefixRef <em>Namespace Prefix Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getNoNamespaceSchemaLocation <em>No Namespace Schema Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getObjectFactory <em>Object Factory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getPartClass <em>Part Class</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getPartNamespace <em>Part Namespace</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getSchemaSeverityLevel <em>Schema Severity Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getXmlStreamWriterWrapper <em>Xml Stream Writer Wrapper</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat()
 * @model extendedMetaData="name='jaxbDataFormat' kind='empty'"
 * @generated
 */
@ProviderType
public interface JaxbDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Access External Schema Protocols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Only in use if schema validation has been enabled. Restrict access to the protocols specified for external reference set
	 * by the schemaLocation attribute, Import and Include element. Examples of protocols are file, http, jar:file. false or
	 * none to deny all access to external references; a specific protocol, such as file, to give permission to only the
	 * protocol; the keyword all to grant permission to all protocols. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access External Schema Protocols</em>' attribute.
	 * @see #setAccessExternalSchemaProtocols(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_AccessExternalSchemaProtocols()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='accessExternalSchemaProtocols'"
	 * @generated
	 */
	String getAccessExternalSchemaProtocols();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getAccessExternalSchemaProtocols <em>Access External Schema Protocols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access External Schema Protocols</em>' attribute.
	 * @see #getAccessExternalSchemaProtocols()
	 * @generated
	 */
	void setAccessExternalSchemaProtocols(String value);

	/**
	 * Returns the value of the '<em><b>Content Type Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether the data format should set the Content-Type header with the type from the data format. For example
	 * application/xml for data formats marshalling to XML, or application/json for data formats marshalling to JSON. Default
	 * value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type Header</em>' attribute.
	 * @see #setContentTypeHeader(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_ContentTypeHeader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contentTypeHeader'"
	 * @generated
	 */
	String getContentTypeHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getContentTypeHeader <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type Header</em>' attribute.
	 * @see #getContentTypeHeader()
	 * @generated
	 */
	void setContentTypeHeader(String value);

	/**
	 * Returns the value of the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Package name where your JAXB classes are located.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Path</em>' attribute.
	 * @see #setContextPath(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_ContextPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='contextPath'"
	 * @generated
	 */
	String getContextPath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getContextPath <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Path</em>' attribute.
	 * @see #getContextPath()
	 * @generated
	 */
	void setContextPath(String value);

	/**
	 * Returns the value of the '<em><b>Context Path Is Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * This can be set to true to mark that the contextPath is referring to a classname and not a package name. Default value:
	 * false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Path Is Class Name</em>' attribute.
	 * @see #setContextPathIsClassName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_ContextPathIsClassName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contextPathIsClassName'"
	 * @generated
	 */
	String getContextPathIsClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getContextPathIsClassName <em>Context Path Is Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Path Is Class Name</em>' attribute.
	 * @see #getContextPathIsClassName()
	 * @generated
	 */
	void setContextPathIsClassName(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To overrule and use a specific encoding.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Filter Non Xml Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To ignore non xml characheters and replace them with an empty space. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Non Xml Chars</em>' attribute.
	 * @see #setFilterNonXmlChars(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_FilterNonXmlChars()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='filterNonXmlChars'"
	 * @generated
	 */
	String getFilterNonXmlChars();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getFilterNonXmlChars <em>Filter Non Xml Chars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Non Xml Chars</em>' attribute.
	 * @see #getFilterNonXmlChars()
	 * @generated
	 */
	void setFilterNonXmlChars(String value);

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To turn on marshalling XML fragment trees. By default JAXB looks for XmlRootElement annotation on given class to operate
	 * on whole XML tree. This is useful but not always - sometimes generated code does not have XmlRootElement annotation,
	 * sometimes you need unmarshall only part of tree. In that case you can use partial unmarshalling. To enable this
	 * behaviours you need set property partClass. Camel will pass this class to JAXB's unmarshaler. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment</em>' attribute.
	 * @see #setFragment(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_Fragment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='fragment'"
	 * @generated
	 */
	String getFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getFragment <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' attribute.
	 * @see #getFragment()
	 * @generated
	 */
	void setFragment(String value);

	/**
	 * Returns the value of the '<em><b>Ignore JAXB Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to ignore JAXBElement elements - only needed to be set to false in very special use-cases. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore JAXB Element</em>' attribute.
	 * @see #setIgnoreJAXBElement(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_IgnoreJAXBElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreJAXBElement'"
	 * @generated
	 */
	String getIgnoreJAXBElement();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getIgnoreJAXBElement <em>Ignore JAXB Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore JAXB Element</em>' attribute.
	 * @see #getIgnoreJAXBElement()
	 * @generated
	 */
	void setIgnoreJAXBElement(String value);

	/**
	 * Returns the value of the '<em><b>Jaxb Provider Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Refers to a custom java.util.Map to lookup in the registry containing custom JAXB provider properties to be used with
	 * the JAXB marshaller.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jaxb Provider Properties</em>' attribute.
	 * @see #setJaxbProviderProperties(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_JaxbProviderProperties()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='jaxbProviderProperties'"
	 * @generated
	 */
	String getJaxbProviderProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getJaxbProviderProperties <em>Jaxb Provider Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jaxb Provider Properties</em>' attribute.
	 * @see #getJaxbProviderProperties()
	 * @generated
	 */
	void setJaxbProviderProperties(String value);

	/**
	 * Returns the value of the '<em><b>Must Be JAXB Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether marhsalling must be java objects with JAXB annotations. And if not then it fails. This option can be set to
	 * false to relax that, such as when the data is already in XML format. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Be JAXB Element</em>' attribute.
	 * @see #setMustBeJAXBElement(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_MustBeJAXBElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mustBeJAXBElement'"
	 * @generated
	 */
	String getMustBeJAXBElement();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getMustBeJAXBElement <em>Must Be JAXB Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Be JAXB Element</em>' attribute.
	 * @see #getMustBeJAXBElement()
	 * @generated
	 */
	void setMustBeJAXBElement(String value);

	/**
	 * Returns the value of the '<em><b>Namespace Prefix Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * When marshalling using JAXB or SOAP then the JAXB implementation will automatic assign namespace prefixes, such as ns2,
	 * ns3, ns4 etc. To control this mapping, Camel allows you to refer to a map which contains the desired mapping.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace Prefix Ref</em>' attribute.
	 * @see #setNamespacePrefixRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_NamespacePrefixRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='namespacePrefixRef'"
	 * @generated
	 */
	String getNamespacePrefixRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getNamespacePrefixRef <em>Namespace Prefix Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Prefix Ref</em>' attribute.
	 * @see #getNamespacePrefixRef()
	 * @generated
	 */
	void setNamespacePrefixRef(String value);

	/**
	 * Returns the value of the '<em><b>No Namespace Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To define the location of the namespaceless schema.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Namespace Schema Location</em>' attribute.
	 * @see #setNoNamespaceSchemaLocation(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_NoNamespaceSchemaLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='noNamespaceSchemaLocation'"
	 * @generated
	 */
	String getNoNamespaceSchemaLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getNoNamespaceSchemaLocation <em>No Namespace Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Namespace Schema Location</em>' attribute.
	 * @see #getNoNamespaceSchemaLocation()
	 * @generated
	 */
	void setNoNamespaceSchemaLocation(String value);

	/**
	 * Returns the value of the '<em><b>Object Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to allow using ObjectFactory classes to create the POJO classes during marshalling. This only applies to POJO
	 * classes that has not been annotated with JAXB and providing jaxb.index descriptor files. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Factory</em>' attribute.
	 * @see #setObjectFactory(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_ObjectFactory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='objectFactory'"
	 * @generated
	 */
	String getObjectFactory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getObjectFactory <em>Object Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Factory</em>' attribute.
	 * @see #getObjectFactory()
	 * @generated
	 */
	void setObjectFactory(String value);

	/**
	 * Returns the value of the '<em><b>Part Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of class used for fragment parsing. See more details at the fragment option.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Class</em>' attribute.
	 * @see #setPartClass(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_PartClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='partClass'"
	 * @generated
	 */
	String getPartClass();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getPartClass <em>Part Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Class</em>' attribute.
	 * @see #getPartClass()
	 * @generated
	 */
	void setPartClass(String value);

	/**
	 * Returns the value of the '<em><b>Part Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * XML namespace to use for fragment parsing. See more details at the fragment option.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Namespace</em>' attribute.
	 * @see #setPartNamespace(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_PartNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='partNamespace'"
	 * @generated
	 */
	String getPartNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getPartNamespace <em>Part Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Namespace</em>' attribute.
	 * @see #getPartNamespace()
	 * @generated
	 */
	void setPartNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Pretty Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To enable pretty printing output nicely formatted. Is by default false. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pretty Print</em>' attribute.
	 * @see #setPrettyPrint(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_PrettyPrint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='prettyPrint'"
	 * @generated
	 */
	String getPrettyPrint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getPrettyPrint <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pretty Print</em>' attribute.
	 * @see #getPrettyPrint()
	 * @generated
	 */
	void setPrettyPrint(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To validate against an existing schema. Your can use the prefix classpath:, file: or http: to specify how the resource
	 * should be resolved. You can separate multiple schema files by using the ',' character.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_Schema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schema'"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To define the location of the schema.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #setSchemaLocation(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_SchemaLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaLocation'"
	 * @generated
	 */
	String getSchemaLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(String value);

	/**
	 * Returns the value of the '<em><b>Schema Severity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the schema severity level to use when validating against a schema. This level determines the minimum severity error
	 * that triggers JAXB to stop continue parsing. The default value of 0 (warning) means that any error (warning, error or
	 * fatal error) will trigger JAXB to stop. There are the following three levels: 0=warning, 1=error, 2=fatal error. Default
	 * value: 0
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Severity Level</em>' attribute.
	 * @see #setSchemaSeverityLevel(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_SchemaSeverityLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaSeverityLevel'"
	 * @generated
	 */
	String getSchemaSeverityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getSchemaSeverityLevel <em>Schema Severity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Severity Level</em>' attribute.
	 * @see #getSchemaSeverityLevel()
	 * @generated
	 */
	void setSchemaSeverityLevel(String value);

	/**
	 * Returns the value of the '<em><b>Xml Stream Writer Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom xml stream writer.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml Stream Writer Wrapper</em>' attribute.
	 * @see #setXmlStreamWriterWrapper(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getJaxbDataFormat_XmlStreamWriterWrapper()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xmlStreamWriterWrapper'"
	 * @generated
	 */
	String getXmlStreamWriterWrapper();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat#getXmlStreamWriterWrapper <em>Xml Stream Writer Wrapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Stream Writer Wrapper</em>' attribute.
	 * @see #getXmlStreamWriterWrapper()
	 * @generated
	 */
	void setXmlStreamWriterWrapper(String value);

} // JaxbDataFormat

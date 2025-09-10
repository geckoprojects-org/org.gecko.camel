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
 * A representation of the model object '<em><b>Fhir Dataformat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getDontEncodeElements <em>Dont Encode Elements</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getDontStripVersionsFromReferencesAtPaths <em>Dont Strip Versions From References At Paths</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getEncodeElements <em>Encode Elements</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getEncodeElementsAppliesToChildResourcesOnly <em>Encode Elements Applies To Child Resources Only</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getFhirContext <em>Fhir Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getForceResourceId <em>Force Resource Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getOmitResourceId <em>Omit Resource Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getOverrideResourceIdWithBundleEntryFullUrl <em>Override Resource Id With Bundle Entry Full Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getParserErrorHandler <em>Parser Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getParserOptions <em>Parser Options</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getPreferTypes <em>Prefer Types</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getServerBaseUrl <em>Server Base Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getStripVersionsFromReferences <em>Strip Versions From References</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getSummaryMode <em>Summary Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getSuppressNarratives <em>Suppress Narratives</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat()
 * @model abstract="true"
 *        extendedMetaData="name='fhirDataformat' kind='empty'"
 * @generated
 */
@ProviderType
public interface FhirDataformat extends DataFormat {
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_ContentTypeHeader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contentTypeHeader'"
	 * @generated
	 */
	String getContentTypeHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getContentTypeHeader <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type Header</em>' attribute.
	 * @see #getContentTypeHeader()
	 * @generated
	 */
	void setContentTypeHeader(String value);

	/**
	 * Returns the value of the '<em><b>Dont Encode Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If provided, specifies the elements which should NOT be encoded. Multiple elements can be separated by comma when using
	 * String parameter. Valid values for this field would include: Patient - Don't encode patient and all its children
	 * Patient.name - Don't encode the patient's name Patient.name.family - Don't encode the patient's family name .text -
	 * Don't encode the text element on any resource (only the very first position may contain a wildcard) DSTU2 note: Note
	 * that values including meta, such as Patient.meta will work for DSTU2 parsers, but values with subelements on meta such
	 * as Patient.meta.lastUpdated will only work in DSTU3 mode.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dont Encode Elements</em>' attribute.
	 * @see #setDontEncodeElements(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_DontEncodeElements()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dontEncodeElements'"
	 * @generated
	 */
	String getDontEncodeElements();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getDontEncodeElements <em>Dont Encode Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dont Encode Elements</em>' attribute.
	 * @see #getDontEncodeElements()
	 * @generated
	 */
	void setDontEncodeElements(String value);

	/**
	 * Returns the value of the '<em><b>Dont Strip Versions From References At Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If supplied value(s), any resource references at the specified paths will have their resource versions encoded instead
	 * of being automatically stripped during the encoding process. This setting has no effect on the parsing process. Multiple
	 * elements can be separated by comma when using String parameter. This method provides a finer-grained level of control
	 * than setStripVersionsFromReferences(String) and any paths specified by this method will be encoded even if
	 * setStripVersionsFromReferences(String) has been set to true (which is the default).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dont Strip Versions From References At Paths</em>' attribute.
	 * @see #setDontStripVersionsFromReferencesAtPaths(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_DontStripVersionsFromReferencesAtPaths()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dontStripVersionsFromReferencesAtPaths'"
	 * @generated
	 */
	String getDontStripVersionsFromReferencesAtPaths();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getDontStripVersionsFromReferencesAtPaths <em>Dont Strip Versions From References At Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dont Strip Versions From References At Paths</em>' attribute.
	 * @see #getDontStripVersionsFromReferencesAtPaths()
	 * @generated
	 */
	void setDontStripVersionsFromReferencesAtPaths(String value);

	/**
	 * Returns the value of the '<em><b>Encode Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If provided, specifies the elements which should be encoded, to the exclusion of all others. Multiple elements can be
	 * separated by comma when using String parameter. Valid values for this field would include: Patient - Encode patient and
	 * all its children Patient.name - Encode only the patient's name Patient.name.family - Encode only the patient's family
	 * name .text - Encode the text element on any resource (only the very first position may contain a wildcard) .(mandatory)
	 * - This is a special case which causes any mandatory fields (min 0) to be encoded.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encode Elements</em>' attribute.
	 * @see #setEncodeElements(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_EncodeElements()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encodeElements'"
	 * @generated
	 */
	String getEncodeElements();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getEncodeElements <em>Encode Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encode Elements</em>' attribute.
	 * @see #getEncodeElements()
	 * @generated
	 */
	void setEncodeElements(String value);

	/**
	 * Returns the value of the '<em><b>Encode Elements Applies To Child Resources Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set to true (default is false), the values supplied to setEncodeElements(Set) will not be applied to the root
	 * resource (typically a Bundle), but will be applied to any sub-resources contained within it (i.e. search result
	 * resources in that bundle). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encode Elements Applies To Child Resources Only</em>' attribute.
	 * @see #setEncodeElementsAppliesToChildResourcesOnly(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_EncodeElementsAppliesToChildResourcesOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encodeElementsAppliesToChildResourcesOnly'"
	 * @generated
	 */
	String getEncodeElementsAppliesToChildResourcesOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getEncodeElementsAppliesToChildResourcesOnly <em>Encode Elements Applies To Child Resources Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encode Elements Applies To Child Resources Only</em>' attribute.
	 * @see #getEncodeElementsAppliesToChildResourcesOnly()
	 * @generated
	 */
	void setEncodeElementsAppliesToChildResourcesOnly(String value);

	/**
	 * Returns the value of the '<em><b>Fhir Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom fhir context. Reference to object of type ca.uhn.fhir.context.FhirContext.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Context</em>' attribute.
	 * @see #setFhirContext(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_FhirContext()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='fhirContext'"
	 * @generated
	 */
	String getFhirContext();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getFhirContext <em>Fhir Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir Context</em>' attribute.
	 * @see #getFhirContext()
	 * @generated
	 */
	void setFhirContext(String value);

	/**
	 * Returns the value of the '<em><b>Fhir Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The version of FHIR to use. Possible values are: DSTU2,DSTU2_HL7ORG,DSTU2_1,DSTU3,R4,R5. Default value: R4
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Version</em>' attribute.
	 * @see #setFhirVersion(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_FhirVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='fhirVersion'"
	 * @generated
	 */
	String getFhirVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getFhirVersion <em>Fhir Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir Version</em>' attribute.
	 * @see #getFhirVersion()
	 * @generated
	 */
	void setFhirVersion(String value);

	/**
	 * Returns the value of the '<em><b>Force Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * When encoding, force this resource ID to be encoded as the resource ID. Reference to object of type
	 * org.hl7.fhir.instance.model.api.IIdType.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Force Resource Id</em>' attribute.
	 * @see #setForceResourceId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_ForceResourceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='forceResourceId'"
	 * @generated
	 */
	String getForceResourceId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getForceResourceId <em>Force Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Resource Id</em>' attribute.
	 * @see #getForceResourceId()
	 * @generated
	 */
	void setForceResourceId(String value);

	/**
	 * Returns the value of the '<em><b>Omit Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set to true (default is false) the ID of any resources being encoded will not be included in the output. Note that
	 * this does not apply to contained resources, only to root resources. In other words, if this is set to true, contained
	 * resources will still have local IDs but the outer/containing ID will not have an ID. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Omit Resource Id</em>' attribute.
	 * @see #setOmitResourceId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_OmitResourceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='omitResourceId'"
	 * @generated
	 */
	String getOmitResourceId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getOmitResourceId <em>Omit Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Resource Id</em>' attribute.
	 * @see #getOmitResourceId()
	 * @generated
	 */
	void setOmitResourceId(String value);

	/**
	 * Returns the value of the '<em><b>Override Resource Id With Bundle Entry Full Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set to true (which is the default), the Bundle.entry.fullUrl will override the Bundle.entry.resource's resource id if
	 * the fullUrl is defined. This behavior happens when parsing the source data into a Bundle object. Set this to false if
	 * this is not the desired behavior (e.g. the client code wishes to perform additional validation checks between the
	 * fullUrl and the resource id). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Override Resource Id With Bundle Entry Full Url</em>' attribute.
	 * @see #setOverrideResourceIdWithBundleEntryFullUrl(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_OverrideResourceIdWithBundleEntryFullUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='overrideResourceIdWithBundleEntryFullUrl'"
	 * @generated
	 */
	String getOverrideResourceIdWithBundleEntryFullUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getOverrideResourceIdWithBundleEntryFullUrl <em>Override Resource Id With Bundle Entry Full Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Resource Id With Bundle Entry Full Url</em>' attribute.
	 * @see #getOverrideResourceIdWithBundleEntryFullUrl()
	 * @generated
	 */
	void setOverrideResourceIdWithBundleEntryFullUrl(String value);

	/**
	 * Returns the value of the '<em><b>Parser Error Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Registers an error handler which will be invoked when any parse errors are found. Reference to object of type
	 * ca.uhn.fhir.parser.IParserErrorHandler.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parser Error Handler</em>' attribute.
	 * @see #setParserErrorHandler(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_ParserErrorHandler()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parserErrorHandler'"
	 * @generated
	 */
	String getParserErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getParserErrorHandler <em>Parser Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser Error Handler</em>' attribute.
	 * @see #getParserErrorHandler()
	 * @generated
	 */
	void setParserErrorHandler(String value);

	/**
	 * Returns the value of the '<em><b>Parser Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the parser options object which will be used to supply default options to newly created parsers. Reference to
	 * object of type ca.uhn.fhir.context.ParserOptions.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parser Options</em>' attribute.
	 * @see #setParserOptions(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_ParserOptions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parserOptions'"
	 * @generated
	 */
	String getParserOptions();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getParserOptions <em>Parser Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser Options</em>' attribute.
	 * @see #getParserOptions()
	 * @generated
	 */
	void setParserOptions(String value);

	/**
	 * Returns the value of the '<em><b>Prefer Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set (FQN class names), when parsing resources the parser will try to use the given types when possible, in the order
	 * that they are provided (from highest to lowest priority). For example, if a custom type which declares to implement the
	 * Patient resource is passed in here, and the parser is parsing a Bundle containing a Patient resource, the parser will
	 * use the given custom type. Multiple class names can be separated by comma.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefer Types</em>' attribute.
	 * @see #setPreferTypes(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_PreferTypes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='preferTypes'"
	 * @generated
	 */
	String getPreferTypes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getPreferTypes <em>Prefer Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefer Types</em>' attribute.
	 * @see #getPreferTypes()
	 * @generated
	 */
	void setPreferTypes(String value);

	/**
	 * Returns the value of the '<em><b>Pretty Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the pretty print flag, meaning that the parser will encode resources with human-readable spacing and newlines
	 * between elements instead of condensing output as much as possible. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pretty Print</em>' attribute.
	 * @see #setPrettyPrint(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_PrettyPrint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='prettyPrint'"
	 * @generated
	 */
	String getPrettyPrint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getPrettyPrint <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pretty Print</em>' attribute.
	 * @see #getPrettyPrint()
	 * @generated
	 */
	void setPrettyPrint(String value);

	/**
	 * Returns the value of the '<em><b>Server Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the server's base URL used by this parser. If a value is set, resource references will be turned into relative
	 * references if they are provided as absolute URLs but have a base matching the given base.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Server Base Url</em>' attribute.
	 * @see #setServerBaseUrl(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_ServerBaseUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='serverBaseUrl'"
	 * @generated
	 */
	String getServerBaseUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getServerBaseUrl <em>Server Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Base Url</em>' attribute.
	 * @see #getServerBaseUrl()
	 * @generated
	 */
	void setServerBaseUrl(String value);

	/**
	 * Returns the value of the '<em><b>Strip Versions From References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set to true (which is the default), resource references containing a version will have the version removed when the
	 * resource is encoded. This is generally good behaviour because in most situations, references from one resource to
	 * another should be to the resource by ID, not by ID and version. In some cases though, it may be desirable to preserve
	 * the version in resource links. In that case, this value should be set to false. This method provides the ability to
	 * globally disable reference encoding. If finer-grained control is needed, use
	 * setDontStripVersionsFromReferencesAtPaths(List). Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strip Versions From References</em>' attribute.
	 * @see #setStripVersionsFromReferences(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_StripVersionsFromReferences()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='stripVersionsFromReferences'"
	 * @generated
	 */
	String getStripVersionsFromReferences();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getStripVersionsFromReferences <em>Strip Versions From References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strip Versions From References</em>' attribute.
	 * @see #getStripVersionsFromReferences()
	 * @generated
	 */
	void setStripVersionsFromReferences(String value);

	/**
	 * Returns the value of the '<em><b>Summary Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set to true (default is false) only elements marked by the FHIR specification as being summary elements will be
	 * included. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary Mode</em>' attribute.
	 * @see #setSummaryMode(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_SummaryMode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='summaryMode'"
	 * @generated
	 */
	String getSummaryMode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getSummaryMode <em>Summary Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary Mode</em>' attribute.
	 * @see #getSummaryMode()
	 * @generated
	 */
	void setSummaryMode(String value);

	/**
	 * Returns the value of the '<em><b>Suppress Narratives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If set to true (default is false), narratives will not be included in the encoded values. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suppress Narratives</em>' attribute.
	 * @see #setSuppressNarratives(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFhirDataformat_SuppressNarratives()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='suppressNarratives'"
	 * @generated
	 */
	String getSuppressNarratives();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat#getSuppressNarratives <em>Suppress Narratives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Narratives</em>' attribute.
	 * @see #getSuppressNarratives()
	 * @generated
	 */
	void setSuppressNarratives(String value);

} // FhirDataformat

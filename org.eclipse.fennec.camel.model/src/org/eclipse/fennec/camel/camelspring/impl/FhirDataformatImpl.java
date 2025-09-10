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
package org.eclipse.fennec.camel.camelspring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.FhirDataformat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fhir Dataformat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getDontEncodeElements <em>Dont Encode Elements</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getDontStripVersionsFromReferencesAtPaths <em>Dont Strip Versions From References At Paths</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getEncodeElements <em>Encode Elements</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getEncodeElementsAppliesToChildResourcesOnly <em>Encode Elements Applies To Child Resources Only</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getFhirContext <em>Fhir Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getForceResourceId <em>Force Resource Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getOmitResourceId <em>Omit Resource Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getOverrideResourceIdWithBundleEntryFullUrl <em>Override Resource Id With Bundle Entry Full Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getParserErrorHandler <em>Parser Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getParserOptions <em>Parser Options</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getPreferTypes <em>Prefer Types</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getPrettyPrint <em>Pretty Print</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getServerBaseUrl <em>Server Base Url</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getStripVersionsFromReferences <em>Strip Versions From References</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getSummaryMode <em>Summary Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.FhirDataformatImpl#getSuppressNarratives <em>Suppress Narratives</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FhirDataformatImpl extends DataFormatImpl implements FhirDataformat {
	/**
	 * The default value of the '{@link #getContentTypeHeader() <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentTypeHeader() <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected String contentTypeHeader = CONTENT_TYPE_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDontEncodeElements() <em>Dont Encode Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontEncodeElements()
	 * @generated
	 * @ordered
	 */
	protected static final String DONT_ENCODE_ELEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDontEncodeElements() <em>Dont Encode Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontEncodeElements()
	 * @generated
	 * @ordered
	 */
	protected String dontEncodeElements = DONT_ENCODE_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDontStripVersionsFromReferencesAtPaths() <em>Dont Strip Versions From References At Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontStripVersionsFromReferencesAtPaths()
	 * @generated
	 * @ordered
	 */
	protected static final String DONT_STRIP_VERSIONS_FROM_REFERENCES_AT_PATHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDontStripVersionsFromReferencesAtPaths() <em>Dont Strip Versions From References At Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontStripVersionsFromReferencesAtPaths()
	 * @generated
	 * @ordered
	 */
	protected String dontStripVersionsFromReferencesAtPaths = DONT_STRIP_VERSIONS_FROM_REFERENCES_AT_PATHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncodeElements() <em>Encode Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodeElements()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODE_ELEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodeElements() <em>Encode Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodeElements()
	 * @generated
	 * @ordered
	 */
	protected String encodeElements = ENCODE_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncodeElementsAppliesToChildResourcesOnly() <em>Encode Elements Applies To Child Resources Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodeElementsAppliesToChildResourcesOnly()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODE_ELEMENTS_APPLIES_TO_CHILD_RESOURCES_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodeElementsAppliesToChildResourcesOnly() <em>Encode Elements Applies To Child Resources Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodeElementsAppliesToChildResourcesOnly()
	 * @generated
	 * @ordered
	 */
	protected String encodeElementsAppliesToChildResourcesOnly = ENCODE_ELEMENTS_APPLIES_TO_CHILD_RESOURCES_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFhirContext() <em>Fhir Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirContext()
	 * @generated
	 * @ordered
	 */
	protected static final String FHIR_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFhirContext() <em>Fhir Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirContext()
	 * @generated
	 * @ordered
	 */
	protected String fhirContext = FHIR_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String FHIR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected String fhirVersion = FHIR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getForceResourceId() <em>Force Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceResourceId() <em>Force Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceResourceId()
	 * @generated
	 * @ordered
	 */
	protected String forceResourceId = FORCE_RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOmitResourceId() <em>Omit Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String OMIT_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOmitResourceId() <em>Omit Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitResourceId()
	 * @generated
	 * @ordered
	 */
	protected String omitResourceId = OMIT_RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverrideResourceIdWithBundleEntryFullUrl() <em>Override Resource Id With Bundle Entry Full Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideResourceIdWithBundleEntryFullUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_RESOURCE_ID_WITH_BUNDLE_ENTRY_FULL_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverrideResourceIdWithBundleEntryFullUrl() <em>Override Resource Id With Bundle Entry Full Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideResourceIdWithBundleEntryFullUrl()
	 * @generated
	 * @ordered
	 */
	protected String overrideResourceIdWithBundleEntryFullUrl = OVERRIDE_RESOURCE_ID_WITH_BUNDLE_ENTRY_FULL_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getParserErrorHandler() <em>Parser Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected static final String PARSER_ERROR_HANDLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParserErrorHandler() <em>Parser Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected String parserErrorHandler = PARSER_ERROR_HANDLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getParserOptions() <em>Parser Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserOptions()
	 * @generated
	 * @ordered
	 */
	protected static final String PARSER_OPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParserOptions() <em>Parser Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserOptions()
	 * @generated
	 * @ordered
	 */
	protected String parserOptions = PARSER_OPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferTypes() <em>Prefer Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferTypes()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFER_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferTypes() <em>Prefer Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferTypes()
	 * @generated
	 * @ordered
	 */
	protected String preferTypes = PREFER_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrettyPrint() <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrettyPrint()
	 * @generated
	 * @ordered
	 */
	protected static final String PRETTY_PRINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrettyPrint() <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrettyPrint()
	 * @generated
	 * @ordered
	 */
	protected String prettyPrint = PRETTY_PRINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerBaseUrl() <em>Server Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerBaseUrl() <em>Server Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected String serverBaseUrl = SERVER_BASE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStripVersionsFromReferences() <em>Strip Versions From References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStripVersionsFromReferences()
	 * @generated
	 * @ordered
	 */
	protected static final String STRIP_VERSIONS_FROM_REFERENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStripVersionsFromReferences() <em>Strip Versions From References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStripVersionsFromReferences()
	 * @generated
	 * @ordered
	 */
	protected String stripVersionsFromReferences = STRIP_VERSIONS_FROM_REFERENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummaryMode() <em>Summary Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummaryMode()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummaryMode() <em>Summary Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummaryMode()
	 * @generated
	 * @ordered
	 */
	protected String summaryMode = SUMMARY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuppressNarratives() <em>Suppress Narratives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressNarratives()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPRESS_NARRATIVES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuppressNarratives() <em>Suppress Narratives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressNarratives()
	 * @generated
	 * @ordered
	 */
	protected String suppressNarratives = SUPPRESS_NARRATIVES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FhirDataformatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getFhirDataformat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentTypeHeader() {
		return contentTypeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentTypeHeader(String newContentTypeHeader) {
		String oldContentTypeHeader = contentTypeHeader;
		contentTypeHeader = newContentTypeHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__CONTENT_TYPE_HEADER, oldContentTypeHeader, contentTypeHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDontEncodeElements() {
		return dontEncodeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDontEncodeElements(String newDontEncodeElements) {
		String oldDontEncodeElements = dontEncodeElements;
		dontEncodeElements = newDontEncodeElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__DONT_ENCODE_ELEMENTS, oldDontEncodeElements, dontEncodeElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDontStripVersionsFromReferencesAtPaths() {
		return dontStripVersionsFromReferencesAtPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDontStripVersionsFromReferencesAtPaths(String newDontStripVersionsFromReferencesAtPaths) {
		String oldDontStripVersionsFromReferencesAtPaths = dontStripVersionsFromReferencesAtPaths;
		dontStripVersionsFromReferencesAtPaths = newDontStripVersionsFromReferencesAtPaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__DONT_STRIP_VERSIONS_FROM_REFERENCES_AT_PATHS, oldDontStripVersionsFromReferencesAtPaths, dontStripVersionsFromReferencesAtPaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncodeElements() {
		return encodeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncodeElements(String newEncodeElements) {
		String oldEncodeElements = encodeElements;
		encodeElements = newEncodeElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__ENCODE_ELEMENTS, oldEncodeElements, encodeElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncodeElementsAppliesToChildResourcesOnly() {
		return encodeElementsAppliesToChildResourcesOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncodeElementsAppliesToChildResourcesOnly(String newEncodeElementsAppliesToChildResourcesOnly) {
		String oldEncodeElementsAppliesToChildResourcesOnly = encodeElementsAppliesToChildResourcesOnly;
		encodeElementsAppliesToChildResourcesOnly = newEncodeElementsAppliesToChildResourcesOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__ENCODE_ELEMENTS_APPLIES_TO_CHILD_RESOURCES_ONLY, oldEncodeElementsAppliesToChildResourcesOnly, encodeElementsAppliesToChildResourcesOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFhirContext() {
		return fhirContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFhirContext(String newFhirContext) {
		String oldFhirContext = fhirContext;
		fhirContext = newFhirContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__FHIR_CONTEXT, oldFhirContext, fhirContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFhirVersion() {
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFhirVersion(String newFhirVersion) {
		String oldFhirVersion = fhirVersion;
		fhirVersion = newFhirVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__FHIR_VERSION, oldFhirVersion, fhirVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForceResourceId() {
		return forceResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForceResourceId(String newForceResourceId) {
		String oldForceResourceId = forceResourceId;
		forceResourceId = newForceResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__FORCE_RESOURCE_ID, oldForceResourceId, forceResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOmitResourceId() {
		return omitResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOmitResourceId(String newOmitResourceId) {
		String oldOmitResourceId = omitResourceId;
		omitResourceId = newOmitResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__OMIT_RESOURCE_ID, oldOmitResourceId, omitResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOverrideResourceIdWithBundleEntryFullUrl() {
		return overrideResourceIdWithBundleEntryFullUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideResourceIdWithBundleEntryFullUrl(String newOverrideResourceIdWithBundleEntryFullUrl) {
		String oldOverrideResourceIdWithBundleEntryFullUrl = overrideResourceIdWithBundleEntryFullUrl;
		overrideResourceIdWithBundleEntryFullUrl = newOverrideResourceIdWithBundleEntryFullUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__OVERRIDE_RESOURCE_ID_WITH_BUNDLE_ENTRY_FULL_URL, oldOverrideResourceIdWithBundleEntryFullUrl, overrideResourceIdWithBundleEntryFullUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParserErrorHandler() {
		return parserErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParserErrorHandler(String newParserErrorHandler) {
		String oldParserErrorHandler = parserErrorHandler;
		parserErrorHandler = newParserErrorHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__PARSER_ERROR_HANDLER, oldParserErrorHandler, parserErrorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParserOptions() {
		return parserOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParserOptions(String newParserOptions) {
		String oldParserOptions = parserOptions;
		parserOptions = newParserOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__PARSER_OPTIONS, oldParserOptions, parserOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreferTypes() {
		return preferTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferTypes(String newPreferTypes) {
		String oldPreferTypes = preferTypes;
		preferTypes = newPreferTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__PREFER_TYPES, oldPreferTypes, preferTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrettyPrint() {
		return prettyPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrettyPrint(String newPrettyPrint) {
		String oldPrettyPrint = prettyPrint;
		prettyPrint = newPrettyPrint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__PRETTY_PRINT, oldPrettyPrint, prettyPrint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerBaseUrl() {
		return serverBaseUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerBaseUrl(String newServerBaseUrl) {
		String oldServerBaseUrl = serverBaseUrl;
		serverBaseUrl = newServerBaseUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__SERVER_BASE_URL, oldServerBaseUrl, serverBaseUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStripVersionsFromReferences() {
		return stripVersionsFromReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStripVersionsFromReferences(String newStripVersionsFromReferences) {
		String oldStripVersionsFromReferences = stripVersionsFromReferences;
		stripVersionsFromReferences = newStripVersionsFromReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__STRIP_VERSIONS_FROM_REFERENCES, oldStripVersionsFromReferences, stripVersionsFromReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummaryMode() {
		return summaryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummaryMode(String newSummaryMode) {
		String oldSummaryMode = summaryMode;
		summaryMode = newSummaryMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__SUMMARY_MODE, oldSummaryMode, summaryMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuppressNarratives() {
		return suppressNarratives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuppressNarratives(String newSuppressNarratives) {
		String oldSuppressNarratives = suppressNarratives;
		suppressNarratives = newSuppressNarratives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.FHIR_DATAFORMAT__SUPPRESS_NARRATIVES, oldSuppressNarratives, suppressNarratives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.FHIR_DATAFORMAT__CONTENT_TYPE_HEADER:
				return getContentTypeHeader();
			case CamelSpringPackage.FHIR_DATAFORMAT__DONT_ENCODE_ELEMENTS:
				return getDontEncodeElements();
			case CamelSpringPackage.FHIR_DATAFORMAT__DONT_STRIP_VERSIONS_FROM_REFERENCES_AT_PATHS:
				return getDontStripVersionsFromReferencesAtPaths();
			case CamelSpringPackage.FHIR_DATAFORMAT__ENCODE_ELEMENTS:
				return getEncodeElements();
			case CamelSpringPackage.FHIR_DATAFORMAT__ENCODE_ELEMENTS_APPLIES_TO_CHILD_RESOURCES_ONLY:
				return getEncodeElementsAppliesToChildResourcesOnly();
			case CamelSpringPackage.FHIR_DATAFORMAT__FHIR_CONTEXT:
				return getFhirContext();
			case CamelSpringPackage.FHIR_DATAFORMAT__FHIR_VERSION:
				return getFhirVersion();
			case CamelSpringPackage.FHIR_DATAFORMAT__FORCE_RESOURCE_ID:
				return getForceResourceId();
			case CamelSpringPackage.FHIR_DATAFORMAT__OMIT_RESOURCE_ID:
				return getOmitResourceId();
			case CamelSpringPackage.FHIR_DATAFORMAT__OVERRIDE_RESOURCE_ID_WITH_BUNDLE_ENTRY_FULL_URL:
				return getOverrideResourceIdWithBundleEntryFullUrl();
			case CamelSpringPackage.FHIR_DATAFORMAT__PARSER_ERROR_HANDLER:
				return getParserErrorHandler();
			case CamelSpringPackage.FHIR_DATAFORMAT__PARSER_OPTIONS:
				return getParserOptions();
			case CamelSpringPackage.FHIR_DATAFORMAT__PREFER_TYPES:
				return getPreferTypes();
			case CamelSpringPackage.FHIR_DATAFORMAT__PRETTY_PRINT:
				return getPrettyPrint();
			case CamelSpringPackage.FHIR_DATAFORMAT__SERVER_BASE_URL:
				return getServerBaseUrl();
			case CamelSpringPackage.FHIR_DATAFORMAT__STRIP_VERSIONS_FROM_REFERENCES:
				return getStripVersionsFromReferences();
			case CamelSpringPackage.FHIR_DATAFORMAT__SUMMARY_MODE:
				return getSummaryMode();
			case CamelSpringPackage.FHIR_DATAFORMAT__SUPPRESS_NARRATIVES:
				return getSuppressNarratives();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.FHIR_DATAFORMAT__CONTENT_TYPE_HEADER:
				setContentTypeHeader((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__DONT_ENCODE_ELEMENTS:
				setDontEncodeElements((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__DONT_STRIP_VERSIONS_FROM_REFERENCES_AT_PATHS:
				setDontStripVersionsFromReferencesAtPaths((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__ENCODE_ELEMENTS:
				setEncodeElements((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__ENCODE_ELEMENTS_APPLIES_TO_CHILD_RESOURCES_ONLY:
				setEncodeElementsAppliesToChildResourcesOnly((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__FHIR_CONTEXT:
				setFhirContext((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__FHIR_VERSION:
				setFhirVersion((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__FORCE_RESOURCE_ID:
				setForceResourceId((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__OMIT_RESOURCE_ID:
				setOmitResourceId((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__OVERRIDE_RESOURCE_ID_WITH_BUNDLE_ENTRY_FULL_URL:
				setOverrideResourceIdWithBundleEntryFullUrl((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__PARSER_ERROR_HANDLER:
				setParserErrorHandler((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__PARSER_OPTIONS:
				setParserOptions((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__PREFER_TYPES:
				setPreferTypes((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__PRETTY_PRINT:
				setPrettyPrint((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__SERVER_BASE_URL:
				setServerBaseUrl((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__STRIP_VERSIONS_FROM_REFERENCES:
				setStripVersionsFromReferences((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__SUMMARY_MODE:
				setSummaryMode((String)newValue);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__SUPPRESS_NARRATIVES:
				setSuppressNarratives((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.FHIR_DATAFORMAT__CONTENT_TYPE_HEADER:
				setContentTypeHeader(CONTENT_TYPE_HEADER_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__DONT_ENCODE_ELEMENTS:
				setDontEncodeElements(DONT_ENCODE_ELEMENTS_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__DONT_STRIP_VERSIONS_FROM_REFERENCES_AT_PATHS:
				setDontStripVersionsFromReferencesAtPaths(DONT_STRIP_VERSIONS_FROM_REFERENCES_AT_PATHS_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__ENCODE_ELEMENTS:
				setEncodeElements(ENCODE_ELEMENTS_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__ENCODE_ELEMENTS_APPLIES_TO_CHILD_RESOURCES_ONLY:
				setEncodeElementsAppliesToChildResourcesOnly(ENCODE_ELEMENTS_APPLIES_TO_CHILD_RESOURCES_ONLY_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__FHIR_CONTEXT:
				setFhirContext(FHIR_CONTEXT_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__FHIR_VERSION:
				setFhirVersion(FHIR_VERSION_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__FORCE_RESOURCE_ID:
				setForceResourceId(FORCE_RESOURCE_ID_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__OMIT_RESOURCE_ID:
				setOmitResourceId(OMIT_RESOURCE_ID_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__OVERRIDE_RESOURCE_ID_WITH_BUNDLE_ENTRY_FULL_URL:
				setOverrideResourceIdWithBundleEntryFullUrl(OVERRIDE_RESOURCE_ID_WITH_BUNDLE_ENTRY_FULL_URL_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__PARSER_ERROR_HANDLER:
				setParserErrorHandler(PARSER_ERROR_HANDLER_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__PARSER_OPTIONS:
				setParserOptions(PARSER_OPTIONS_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__PREFER_TYPES:
				setPreferTypes(PREFER_TYPES_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__PRETTY_PRINT:
				setPrettyPrint(PRETTY_PRINT_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__SERVER_BASE_URL:
				setServerBaseUrl(SERVER_BASE_URL_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__STRIP_VERSIONS_FROM_REFERENCES:
				setStripVersionsFromReferences(STRIP_VERSIONS_FROM_REFERENCES_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__SUMMARY_MODE:
				setSummaryMode(SUMMARY_MODE_EDEFAULT);
				return;
			case CamelSpringPackage.FHIR_DATAFORMAT__SUPPRESS_NARRATIVES:
				setSuppressNarratives(SUPPRESS_NARRATIVES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.FHIR_DATAFORMAT__CONTENT_TYPE_HEADER:
				return CONTENT_TYPE_HEADER_EDEFAULT == null ? contentTypeHeader != null : !CONTENT_TYPE_HEADER_EDEFAULT.equals(contentTypeHeader);
			case CamelSpringPackage.FHIR_DATAFORMAT__DONT_ENCODE_ELEMENTS:
				return DONT_ENCODE_ELEMENTS_EDEFAULT == null ? dontEncodeElements != null : !DONT_ENCODE_ELEMENTS_EDEFAULT.equals(dontEncodeElements);
			case CamelSpringPackage.FHIR_DATAFORMAT__DONT_STRIP_VERSIONS_FROM_REFERENCES_AT_PATHS:
				return DONT_STRIP_VERSIONS_FROM_REFERENCES_AT_PATHS_EDEFAULT == null ? dontStripVersionsFromReferencesAtPaths != null : !DONT_STRIP_VERSIONS_FROM_REFERENCES_AT_PATHS_EDEFAULT.equals(dontStripVersionsFromReferencesAtPaths);
			case CamelSpringPackage.FHIR_DATAFORMAT__ENCODE_ELEMENTS:
				return ENCODE_ELEMENTS_EDEFAULT == null ? encodeElements != null : !ENCODE_ELEMENTS_EDEFAULT.equals(encodeElements);
			case CamelSpringPackage.FHIR_DATAFORMAT__ENCODE_ELEMENTS_APPLIES_TO_CHILD_RESOURCES_ONLY:
				return ENCODE_ELEMENTS_APPLIES_TO_CHILD_RESOURCES_ONLY_EDEFAULT == null ? encodeElementsAppliesToChildResourcesOnly != null : !ENCODE_ELEMENTS_APPLIES_TO_CHILD_RESOURCES_ONLY_EDEFAULT.equals(encodeElementsAppliesToChildResourcesOnly);
			case CamelSpringPackage.FHIR_DATAFORMAT__FHIR_CONTEXT:
				return FHIR_CONTEXT_EDEFAULT == null ? fhirContext != null : !FHIR_CONTEXT_EDEFAULT.equals(fhirContext);
			case CamelSpringPackage.FHIR_DATAFORMAT__FHIR_VERSION:
				return FHIR_VERSION_EDEFAULT == null ? fhirVersion != null : !FHIR_VERSION_EDEFAULT.equals(fhirVersion);
			case CamelSpringPackage.FHIR_DATAFORMAT__FORCE_RESOURCE_ID:
				return FORCE_RESOURCE_ID_EDEFAULT == null ? forceResourceId != null : !FORCE_RESOURCE_ID_EDEFAULT.equals(forceResourceId);
			case CamelSpringPackage.FHIR_DATAFORMAT__OMIT_RESOURCE_ID:
				return OMIT_RESOURCE_ID_EDEFAULT == null ? omitResourceId != null : !OMIT_RESOURCE_ID_EDEFAULT.equals(omitResourceId);
			case CamelSpringPackage.FHIR_DATAFORMAT__OVERRIDE_RESOURCE_ID_WITH_BUNDLE_ENTRY_FULL_URL:
				return OVERRIDE_RESOURCE_ID_WITH_BUNDLE_ENTRY_FULL_URL_EDEFAULT == null ? overrideResourceIdWithBundleEntryFullUrl != null : !OVERRIDE_RESOURCE_ID_WITH_BUNDLE_ENTRY_FULL_URL_EDEFAULT.equals(overrideResourceIdWithBundleEntryFullUrl);
			case CamelSpringPackage.FHIR_DATAFORMAT__PARSER_ERROR_HANDLER:
				return PARSER_ERROR_HANDLER_EDEFAULT == null ? parserErrorHandler != null : !PARSER_ERROR_HANDLER_EDEFAULT.equals(parserErrorHandler);
			case CamelSpringPackage.FHIR_DATAFORMAT__PARSER_OPTIONS:
				return PARSER_OPTIONS_EDEFAULT == null ? parserOptions != null : !PARSER_OPTIONS_EDEFAULT.equals(parserOptions);
			case CamelSpringPackage.FHIR_DATAFORMAT__PREFER_TYPES:
				return PREFER_TYPES_EDEFAULT == null ? preferTypes != null : !PREFER_TYPES_EDEFAULT.equals(preferTypes);
			case CamelSpringPackage.FHIR_DATAFORMAT__PRETTY_PRINT:
				return PRETTY_PRINT_EDEFAULT == null ? prettyPrint != null : !PRETTY_PRINT_EDEFAULT.equals(prettyPrint);
			case CamelSpringPackage.FHIR_DATAFORMAT__SERVER_BASE_URL:
				return SERVER_BASE_URL_EDEFAULT == null ? serverBaseUrl != null : !SERVER_BASE_URL_EDEFAULT.equals(serverBaseUrl);
			case CamelSpringPackage.FHIR_DATAFORMAT__STRIP_VERSIONS_FROM_REFERENCES:
				return STRIP_VERSIONS_FROM_REFERENCES_EDEFAULT == null ? stripVersionsFromReferences != null : !STRIP_VERSIONS_FROM_REFERENCES_EDEFAULT.equals(stripVersionsFromReferences);
			case CamelSpringPackage.FHIR_DATAFORMAT__SUMMARY_MODE:
				return SUMMARY_MODE_EDEFAULT == null ? summaryMode != null : !SUMMARY_MODE_EDEFAULT.equals(summaryMode);
			case CamelSpringPackage.FHIR_DATAFORMAT__SUPPRESS_NARRATIVES:
				return SUPPRESS_NARRATIVES_EDEFAULT == null ? suppressNarratives != null : !SUPPRESS_NARRATIVES_EDEFAULT.equals(suppressNarratives);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (contentTypeHeader: ");
		result.append(contentTypeHeader);
		result.append(", dontEncodeElements: ");
		result.append(dontEncodeElements);
		result.append(", dontStripVersionsFromReferencesAtPaths: ");
		result.append(dontStripVersionsFromReferencesAtPaths);
		result.append(", encodeElements: ");
		result.append(encodeElements);
		result.append(", encodeElementsAppliesToChildResourcesOnly: ");
		result.append(encodeElementsAppliesToChildResourcesOnly);
		result.append(", fhirContext: ");
		result.append(fhirContext);
		result.append(", fhirVersion: ");
		result.append(fhirVersion);
		result.append(", forceResourceId: ");
		result.append(forceResourceId);
		result.append(", omitResourceId: ");
		result.append(omitResourceId);
		result.append(", overrideResourceIdWithBundleEntryFullUrl: ");
		result.append(overrideResourceIdWithBundleEntryFullUrl);
		result.append(", parserErrorHandler: ");
		result.append(parserErrorHandler);
		result.append(", parserOptions: ");
		result.append(parserOptions);
		result.append(", preferTypes: ");
		result.append(preferTypes);
		result.append(", prettyPrint: ");
		result.append(prettyPrint);
		result.append(", serverBaseUrl: ");
		result.append(serverBaseUrl);
		result.append(", stripVersionsFromReferences: ");
		result.append(stripVersionsFromReferences);
		result.append(", summaryMode: ");
		result.append(summaryMode);
		result.append(", suppressNarratives: ");
		result.append(suppressNarratives);
		result.append(')');
		return result.toString();
	}

} //FhirDataformatImpl

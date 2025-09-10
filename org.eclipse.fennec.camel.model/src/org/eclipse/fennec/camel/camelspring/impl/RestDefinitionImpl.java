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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.DeleteDefinition;
import org.eclipse.fennec.camel.camelspring.GetDefinition;
import org.eclipse.fennec.camel.camelspring.HeadDefinition;
import org.eclipse.fennec.camel.camelspring.OpenApiDefinition;
import org.eclipse.fennec.camel.camelspring.PatchDefinition;
import org.eclipse.fennec.camel.camelspring.PostDefinition;
import org.eclipse.fennec.camel.camelspring.PutDefinition;
import org.eclipse.fennec.camel.camelspring.RestDefinition;
import org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition;
import org.eclipse.fennec.camel.camelspring.SecurityDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getOpenApi <em>Open Api</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getSecurityRequirements <em>Security Requirements</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getPatch <em>Patch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getPost <em>Post</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getPut <em>Put</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getApiDocs <em>Api Docs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getBindingMode <em>Binding Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getClientRequestValidation <em>Client Request Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getClientResponseValidation <em>Client Response Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getEnableCORS <em>Enable CORS</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getEnableNoContentResponse <em>Enable No Content Response</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestDefinitionImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestDefinitionImpl extends OptionalIdentifiedDefinitionImpl implements RestDefinition {
	/**
	 * The cached value of the '{@link #getOpenApi() <em>Open Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenApi()
	 * @generated
	 * @ordered
	 */
	protected OpenApiDefinition openApi;

	/**
	 * The cached value of the '{@link #getSecurityDefinitions() <em>Security Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected RestSecuritiesDefinition securityDefinitions;

	/**
	 * The cached value of the '{@link #getSecurityRequirements() <em>Security Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityDefinition> securityRequirements;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getApiDocs() <em>Api Docs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiDocs()
	 * @generated
	 * @ordered
	 */
	protected static final String API_DOCS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiDocs() <em>Api Docs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiDocs()
	 * @generated
	 * @ordered
	 */
	protected String apiDocs = API_DOCS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindingMode() <em>Binding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingMode()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingMode() <em>Binding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingMode()
	 * @generated
	 * @ordered
	 */
	protected String bindingMode = BINDING_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientRequestValidation() <em>Client Request Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientRequestValidation()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_REQUEST_VALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientRequestValidation() <em>Client Request Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientRequestValidation()
	 * @generated
	 * @ordered
	 */
	protected String clientRequestValidation = CLIENT_REQUEST_VALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientResponseValidation() <em>Client Response Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientResponseValidation()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_RESPONSE_VALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientResponseValidation() <em>Client Response Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientResponseValidation()
	 * @generated
	 * @ordered
	 */
	protected String clientResponseValidation = CLIENT_RESPONSE_VALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsumes() <em>Consumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected String consumes = CONSUMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final String DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected String disabled = DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableCORS() <em>Enable CORS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCORS()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_CORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableCORS() <em>Enable CORS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCORS()
	 * @generated
	 * @ordered
	 */
	protected String enableCORS = ENABLE_CORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableNoContentResponse() <em>Enable No Content Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableNoContentResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_NO_CONTENT_RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableNoContentResponse() <em>Enable No Content Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableNoContentResponse()
	 * @generated
	 * @ordered
	 */
	protected String enableNoContentResponse = ENABLE_NO_CONTENT_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduces() <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected String produces = PRODUCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkipBindingOnErrorCode() <em>Skip Binding On Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipBindingOnErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SKIP_BINDING_ON_ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipBindingOnErrorCode() <em>Skip Binding On Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipBindingOnErrorCode()
	 * @generated
	 * @ordered
	 */
	protected String skipBindingOnErrorCode = SKIP_BINDING_ON_ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getRestDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenApiDefinition getOpenApi() {
		return openApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenApi(OpenApiDefinition newOpenApi, NotificationChain msgs) {
		OpenApiDefinition oldOpenApi = openApi;
		openApi = newOpenApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__OPEN_API, oldOpenApi, newOpenApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenApi(OpenApiDefinition newOpenApi) {
		if (newOpenApi != openApi) {
			NotificationChain msgs = null;
			if (openApi != null)
				msgs = ((InternalEObject)openApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.REST_DEFINITION__OPEN_API, null, msgs);
			if (newOpenApi != null)
				msgs = ((InternalEObject)newOpenApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.REST_DEFINITION__OPEN_API, null, msgs);
			msgs = basicSetOpenApi(newOpenApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__OPEN_API, newOpenApi, newOpenApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestSecuritiesDefinition getSecurityDefinitions() {
		return securityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityDefinitions(RestSecuritiesDefinition newSecurityDefinitions, NotificationChain msgs) {
		RestSecuritiesDefinition oldSecurityDefinitions = securityDefinitions;
		securityDefinitions = newSecurityDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__SECURITY_DEFINITIONS, oldSecurityDefinitions, newSecurityDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityDefinitions(RestSecuritiesDefinition newSecurityDefinitions) {
		if (newSecurityDefinitions != securityDefinitions) {
			NotificationChain msgs = null;
			if (securityDefinitions != null)
				msgs = ((InternalEObject)securityDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.REST_DEFINITION__SECURITY_DEFINITIONS, null, msgs);
			if (newSecurityDefinitions != null)
				msgs = ((InternalEObject)newSecurityDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.REST_DEFINITION__SECURITY_DEFINITIONS, null, msgs);
			msgs = basicSetSecurityDefinitions(newSecurityDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__SECURITY_DEFINITIONS, newSecurityDefinitions, newSecurityDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityDefinition> getSecurityRequirements() {
		if (securityRequirements == null) {
			securityRequirements = new EObjectContainmentEList<SecurityDefinition>(SecurityDefinition.class, this, CamelSpringPackage.REST_DEFINITION__SECURITY_REQUIREMENTS);
		}
		return securityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.REST_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeleteDefinition> getDelete() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestDefinition_Delete());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GetDefinition> getGet() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestDefinition_Get());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HeadDefinition> getHead() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestDefinition_Head());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatchDefinition> getPatch() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestDefinition_Patch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PostDefinition> getPost() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestDefinition_Post());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PutDefinition> getPut() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getRestDefinition_Put());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiDocs() {
		return apiDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiDocs(String newApiDocs) {
		String oldApiDocs = apiDocs;
		apiDocs = newApiDocs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__API_DOCS, oldApiDocs, apiDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBindingMode() {
		return bindingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindingMode(String newBindingMode) {
		String oldBindingMode = bindingMode;
		bindingMode = newBindingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__BINDING_MODE, oldBindingMode, bindingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientRequestValidation() {
		return clientRequestValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientRequestValidation(String newClientRequestValidation) {
		String oldClientRequestValidation = clientRequestValidation;
		clientRequestValidation = newClientRequestValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__CLIENT_REQUEST_VALIDATION, oldClientRequestValidation, clientRequestValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientResponseValidation() {
		return clientResponseValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientResponseValidation(String newClientResponseValidation) {
		String oldClientResponseValidation = clientResponseValidation;
		clientResponseValidation = newClientResponseValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__CLIENT_RESPONSE_VALIDATION, oldClientResponseValidation, clientResponseValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsumes() {
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumes(String newConsumes) {
		String oldConsumes = consumes;
		consumes = newConsumes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__CONSUMES, oldConsumes, consumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabled(String newDisabled) {
		String oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__DISABLED, oldDisabled, disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableCORS() {
		return enableCORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableCORS(String newEnableCORS) {
		String oldEnableCORS = enableCORS;
		enableCORS = newEnableCORS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__ENABLE_CORS, oldEnableCORS, enableCORS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableNoContentResponse() {
		return enableNoContentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableNoContentResponse(String newEnableNoContentResponse) {
		String oldEnableNoContentResponse = enableNoContentResponse;
		enableNoContentResponse = newEnableNoContentResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__ENABLE_NO_CONTENT_RESPONSE, oldEnableNoContentResponse, enableNoContentResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduces() {
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduces(String newProduces) {
		String oldProduces = produces;
		produces = newProduces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__PRODUCES, oldProduces, produces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSkipBindingOnErrorCode() {
		return skipBindingOnErrorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkipBindingOnErrorCode(String newSkipBindingOnErrorCode) {
		String oldSkipBindingOnErrorCode = skipBindingOnErrorCode;
		skipBindingOnErrorCode = newSkipBindingOnErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__SKIP_BINDING_ON_ERROR_CODE, oldSkipBindingOnErrorCode, skipBindingOnErrorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_DEFINITION__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.REST_DEFINITION__OPEN_API:
				return basicSetOpenApi(null, msgs);
			case CamelSpringPackage.REST_DEFINITION__SECURITY_DEFINITIONS:
				return basicSetSecurityDefinitions(null, msgs);
			case CamelSpringPackage.REST_DEFINITION__SECURITY_REQUIREMENTS:
				return ((InternalEList<?>)getSecurityRequirements()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_DEFINITION__DELETE:
				return ((InternalEList<?>)getDelete()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_DEFINITION__GET:
				return ((InternalEList<?>)getGet()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_DEFINITION__HEAD:
				return ((InternalEList<?>)getHead()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_DEFINITION__PATCH:
				return ((InternalEList<?>)getPatch()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_DEFINITION__POST:
				return ((InternalEList<?>)getPost()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.REST_DEFINITION__PUT:
				return ((InternalEList<?>)getPut()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.REST_DEFINITION__OPEN_API:
				return getOpenApi();
			case CamelSpringPackage.REST_DEFINITION__SECURITY_DEFINITIONS:
				return getSecurityDefinitions();
			case CamelSpringPackage.REST_DEFINITION__SECURITY_REQUIREMENTS:
				return getSecurityRequirements();
			case CamelSpringPackage.REST_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.REST_DEFINITION__DELETE:
				return getDelete();
			case CamelSpringPackage.REST_DEFINITION__GET:
				return getGet();
			case CamelSpringPackage.REST_DEFINITION__HEAD:
				return getHead();
			case CamelSpringPackage.REST_DEFINITION__PATCH:
				return getPatch();
			case CamelSpringPackage.REST_DEFINITION__POST:
				return getPost();
			case CamelSpringPackage.REST_DEFINITION__PUT:
				return getPut();
			case CamelSpringPackage.REST_DEFINITION__API_DOCS:
				return getApiDocs();
			case CamelSpringPackage.REST_DEFINITION__BINDING_MODE:
				return getBindingMode();
			case CamelSpringPackage.REST_DEFINITION__CLIENT_REQUEST_VALIDATION:
				return getClientRequestValidation();
			case CamelSpringPackage.REST_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				return getClientResponseValidation();
			case CamelSpringPackage.REST_DEFINITION__CONSUMES:
				return getConsumes();
			case CamelSpringPackage.REST_DEFINITION__DISABLED:
				return getDisabled();
			case CamelSpringPackage.REST_DEFINITION__ENABLE_CORS:
				return getEnableCORS();
			case CamelSpringPackage.REST_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				return getEnableNoContentResponse();
			case CamelSpringPackage.REST_DEFINITION__PATH:
				return getPath();
			case CamelSpringPackage.REST_DEFINITION__PRODUCES:
				return getProduces();
			case CamelSpringPackage.REST_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				return getSkipBindingOnErrorCode();
			case CamelSpringPackage.REST_DEFINITION__TAG:
				return getTag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.REST_DEFINITION__OPEN_API:
				setOpenApi((OpenApiDefinition)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__SECURITY_DEFINITIONS:
				setSecurityDefinitions((RestSecuritiesDefinition)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__SECURITY_REQUIREMENTS:
				getSecurityRequirements().clear();
				getSecurityRequirements().addAll((Collection<? extends SecurityDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__DELETE:
				getDelete().clear();
				getDelete().addAll((Collection<? extends DeleteDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__GET:
				getGet().clear();
				getGet().addAll((Collection<? extends GetDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__HEAD:
				getHead().clear();
				getHead().addAll((Collection<? extends HeadDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__PATCH:
				getPatch().clear();
				getPatch().addAll((Collection<? extends PatchDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__POST:
				getPost().clear();
				getPost().addAll((Collection<? extends PostDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__PUT:
				getPut().clear();
				getPut().addAll((Collection<? extends PutDefinition>)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__API_DOCS:
				setApiDocs((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__BINDING_MODE:
				setBindingMode((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__CLIENT_REQUEST_VALIDATION:
				setClientRequestValidation((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				setClientResponseValidation((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__CONSUMES:
				setConsumes((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__DISABLED:
				setDisabled((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__ENABLE_CORS:
				setEnableCORS((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				setEnableNoContentResponse((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__PATH:
				setPath((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__PRODUCES:
				setProduces((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				setSkipBindingOnErrorCode((String)newValue);
				return;
			case CamelSpringPackage.REST_DEFINITION__TAG:
				setTag((String)newValue);
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
			case CamelSpringPackage.REST_DEFINITION__OPEN_API:
				setOpenApi((OpenApiDefinition)null);
				return;
			case CamelSpringPackage.REST_DEFINITION__SECURITY_DEFINITIONS:
				setSecurityDefinitions((RestSecuritiesDefinition)null);
				return;
			case CamelSpringPackage.REST_DEFINITION__SECURITY_REQUIREMENTS:
				getSecurityRequirements().clear();
				return;
			case CamelSpringPackage.REST_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.REST_DEFINITION__DELETE:
				getDelete().clear();
				return;
			case CamelSpringPackage.REST_DEFINITION__GET:
				getGet().clear();
				return;
			case CamelSpringPackage.REST_DEFINITION__HEAD:
				getHead().clear();
				return;
			case CamelSpringPackage.REST_DEFINITION__PATCH:
				getPatch().clear();
				return;
			case CamelSpringPackage.REST_DEFINITION__POST:
				getPost().clear();
				return;
			case CamelSpringPackage.REST_DEFINITION__PUT:
				getPut().clear();
				return;
			case CamelSpringPackage.REST_DEFINITION__API_DOCS:
				setApiDocs(API_DOCS_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__BINDING_MODE:
				setBindingMode(BINDING_MODE_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__CLIENT_REQUEST_VALIDATION:
				setClientRequestValidation(CLIENT_REQUEST_VALIDATION_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				setClientResponseValidation(CLIENT_RESPONSE_VALIDATION_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__CONSUMES:
				setConsumes(CONSUMES_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__ENABLE_CORS:
				setEnableCORS(ENABLE_CORS_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				setEnableNoContentResponse(ENABLE_NO_CONTENT_RESPONSE_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__PRODUCES:
				setProduces(PRODUCES_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				setSkipBindingOnErrorCode(SKIP_BINDING_ON_ERROR_CODE_EDEFAULT);
				return;
			case CamelSpringPackage.REST_DEFINITION__TAG:
				setTag(TAG_EDEFAULT);
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
			case CamelSpringPackage.REST_DEFINITION__OPEN_API:
				return openApi != null;
			case CamelSpringPackage.REST_DEFINITION__SECURITY_DEFINITIONS:
				return securityDefinitions != null;
			case CamelSpringPackage.REST_DEFINITION__SECURITY_REQUIREMENTS:
				return securityRequirements != null && !securityRequirements.isEmpty();
			case CamelSpringPackage.REST_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.REST_DEFINITION__DELETE:
				return !getDelete().isEmpty();
			case CamelSpringPackage.REST_DEFINITION__GET:
				return !getGet().isEmpty();
			case CamelSpringPackage.REST_DEFINITION__HEAD:
				return !getHead().isEmpty();
			case CamelSpringPackage.REST_DEFINITION__PATCH:
				return !getPatch().isEmpty();
			case CamelSpringPackage.REST_DEFINITION__POST:
				return !getPost().isEmpty();
			case CamelSpringPackage.REST_DEFINITION__PUT:
				return !getPut().isEmpty();
			case CamelSpringPackage.REST_DEFINITION__API_DOCS:
				return API_DOCS_EDEFAULT == null ? apiDocs != null : !API_DOCS_EDEFAULT.equals(apiDocs);
			case CamelSpringPackage.REST_DEFINITION__BINDING_MODE:
				return BINDING_MODE_EDEFAULT == null ? bindingMode != null : !BINDING_MODE_EDEFAULT.equals(bindingMode);
			case CamelSpringPackage.REST_DEFINITION__CLIENT_REQUEST_VALIDATION:
				return CLIENT_REQUEST_VALIDATION_EDEFAULT == null ? clientRequestValidation != null : !CLIENT_REQUEST_VALIDATION_EDEFAULT.equals(clientRequestValidation);
			case CamelSpringPackage.REST_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				return CLIENT_RESPONSE_VALIDATION_EDEFAULT == null ? clientResponseValidation != null : !CLIENT_RESPONSE_VALIDATION_EDEFAULT.equals(clientResponseValidation);
			case CamelSpringPackage.REST_DEFINITION__CONSUMES:
				return CONSUMES_EDEFAULT == null ? consumes != null : !CONSUMES_EDEFAULT.equals(consumes);
			case CamelSpringPackage.REST_DEFINITION__DISABLED:
				return DISABLED_EDEFAULT == null ? disabled != null : !DISABLED_EDEFAULT.equals(disabled);
			case CamelSpringPackage.REST_DEFINITION__ENABLE_CORS:
				return ENABLE_CORS_EDEFAULT == null ? enableCORS != null : !ENABLE_CORS_EDEFAULT.equals(enableCORS);
			case CamelSpringPackage.REST_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				return ENABLE_NO_CONTENT_RESPONSE_EDEFAULT == null ? enableNoContentResponse != null : !ENABLE_NO_CONTENT_RESPONSE_EDEFAULT.equals(enableNoContentResponse);
			case CamelSpringPackage.REST_DEFINITION__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case CamelSpringPackage.REST_DEFINITION__PRODUCES:
				return PRODUCES_EDEFAULT == null ? produces != null : !PRODUCES_EDEFAULT.equals(produces);
			case CamelSpringPackage.REST_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				return SKIP_BINDING_ON_ERROR_CODE_EDEFAULT == null ? skipBindingOnErrorCode != null : !SKIP_BINDING_ON_ERROR_CODE_EDEFAULT.equals(skipBindingOnErrorCode);
			case CamelSpringPackage.REST_DEFINITION__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", apiDocs: ");
		result.append(apiDocs);
		result.append(", bindingMode: ");
		result.append(bindingMode);
		result.append(", clientRequestValidation: ");
		result.append(clientRequestValidation);
		result.append(", clientResponseValidation: ");
		result.append(clientResponseValidation);
		result.append(", consumes: ");
		result.append(consumes);
		result.append(", disabled: ");
		result.append(disabled);
		result.append(", enableCORS: ");
		result.append(enableCORS);
		result.append(", enableNoContentResponse: ");
		result.append(enableNoContentResponse);
		result.append(", path: ");
		result.append(path);
		result.append(", produces: ");
		result.append(produces);
		result.append(", skipBindingOnErrorCode: ");
		result.append(skipBindingOnErrorCode);
		result.append(", tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

} //RestDefinitionImpl

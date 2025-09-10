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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.ParamDefinition;
import org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition;
import org.eclipse.fennec.camel.camelspring.SecurityDefinition;
import org.eclipse.fennec.camel.camelspring.ToDefinition;
import org.eclipse.fennec.camel.camelspring.VerbDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verb Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getResponseMessage <em>Response Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getApiDocs <em>Api Docs</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getBindingMode <em>Binding Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getClientRequestValidation <em>Client Request Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getClientResponseValidation <em>Client Response Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getEnableCORS <em>Enable CORS</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getEnableNoContentResponse <em>Enable No Content Response</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getOutType <em>Out Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getRouteId <em>Route Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getStreamCache <em>Stream Cache</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.VerbDefinitionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VerbDefinitionImpl extends OptionalIdentifiedDefinitionImpl implements VerbDefinition {
	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamDefinition> param;

	/**
	 * The cached value of the '{@link #getResponseMessage() <em>Response Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseMessageDefinition> responseMessage;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityDefinition> security;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ToDefinition to;

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
	 * The default value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPRECATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected String deprecated = DEPRECATED_EDEFAULT;

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
	 * The default value of the '{@link #getOutType() <em>Out Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutType()
	 * @generated
	 * @ordered
	 */
	protected static final String OUT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutType() <em>Out Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutType()
	 * @generated
	 * @ordered
	 */
	protected String outType = OUT_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getRouteId() <em>Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteId() <em>Route Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteId()
	 * @generated
	 * @ordered
	 */
	protected String routeId = ROUTE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getStreamCache() <em>Stream Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamCache()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAM_CACHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreamCache() <em>Stream Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamCache()
	 * @generated
	 * @ordered
	 */
	protected String streamCache = STREAM_CACHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerbDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getVerbDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParamDefinition> getParam() {
		if (param == null) {
			param = new EObjectContainmentEList<ParamDefinition>(ParamDefinition.class, this, CamelSpringPackage.VERB_DEFINITION__PARAM);
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponseMessageDefinition> getResponseMessage() {
		if (responseMessage == null) {
			responseMessage = new EObjectContainmentEList<ResponseMessageDefinition>(ResponseMessageDefinition.class, this, CamelSpringPackage.VERB_DEFINITION__RESPONSE_MESSAGE);
		}
		return responseMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityDefinition> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<SecurityDefinition>(SecurityDefinition.class, this, CamelSpringPackage.VERB_DEFINITION__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToDefinition getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(ToDefinition newTo, NotificationChain msgs) {
		ToDefinition oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__TO, oldTo, newTo);
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
	public void setTo(ToDefinition newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.VERB_DEFINITION__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.VERB_DEFINITION__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__TO, newTo, newTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__API_DOCS, oldApiDocs, apiDocs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__BINDING_MODE, oldBindingMode, bindingMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__CLIENT_REQUEST_VALIDATION, oldClientRequestValidation, clientRequestValidation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__CLIENT_RESPONSE_VALIDATION, oldClientResponseValidation, clientResponseValidation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__CONSUMES, oldConsumes, consumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeprecated() {
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeprecated(String newDeprecated) {
		String oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__DEPRECATED, oldDeprecated, deprecated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__DISABLED, oldDisabled, disabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__ENABLE_CORS, oldEnableCORS, enableCORS));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__ENABLE_NO_CONTENT_RESPONSE, oldEnableNoContentResponse, enableNoContentResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutType() {
		return outType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutType(String newOutType) {
		String oldOutType = outType;
		outType = newOutType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__OUT_TYPE, oldOutType, outType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__PRODUCES, oldProduces, produces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteId() {
		return routeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteId(String newRouteId) {
		String oldRouteId = routeId;
		routeId = newRouteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__ROUTE_ID, oldRouteId, routeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__SKIP_BINDING_ON_ERROR_CODE, oldSkipBindingOnErrorCode, skipBindingOnErrorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreamCache() {
		return streamCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreamCache(String newStreamCache) {
		String oldStreamCache = streamCache;
		streamCache = newStreamCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__STREAM_CACHE, oldStreamCache, streamCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.VERB_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.VERB_DEFINITION__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.VERB_DEFINITION__RESPONSE_MESSAGE:
				return ((InternalEList<?>)getResponseMessage()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.VERB_DEFINITION__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.VERB_DEFINITION__TO:
				return basicSetTo(null, msgs);
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
			case CamelSpringPackage.VERB_DEFINITION__PARAM:
				return getParam();
			case CamelSpringPackage.VERB_DEFINITION__RESPONSE_MESSAGE:
				return getResponseMessage();
			case CamelSpringPackage.VERB_DEFINITION__SECURITY:
				return getSecurity();
			case CamelSpringPackage.VERB_DEFINITION__TO:
				return getTo();
			case CamelSpringPackage.VERB_DEFINITION__API_DOCS:
				return getApiDocs();
			case CamelSpringPackage.VERB_DEFINITION__BINDING_MODE:
				return getBindingMode();
			case CamelSpringPackage.VERB_DEFINITION__CLIENT_REQUEST_VALIDATION:
				return getClientRequestValidation();
			case CamelSpringPackage.VERB_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				return getClientResponseValidation();
			case CamelSpringPackage.VERB_DEFINITION__CONSUMES:
				return getConsumes();
			case CamelSpringPackage.VERB_DEFINITION__DEPRECATED:
				return getDeprecated();
			case CamelSpringPackage.VERB_DEFINITION__DISABLED:
				return getDisabled();
			case CamelSpringPackage.VERB_DEFINITION__ENABLE_CORS:
				return getEnableCORS();
			case CamelSpringPackage.VERB_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				return getEnableNoContentResponse();
			case CamelSpringPackage.VERB_DEFINITION__OUT_TYPE:
				return getOutType();
			case CamelSpringPackage.VERB_DEFINITION__PATH:
				return getPath();
			case CamelSpringPackage.VERB_DEFINITION__PRODUCES:
				return getProduces();
			case CamelSpringPackage.VERB_DEFINITION__ROUTE_ID:
				return getRouteId();
			case CamelSpringPackage.VERB_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				return getSkipBindingOnErrorCode();
			case CamelSpringPackage.VERB_DEFINITION__STREAM_CACHE:
				return getStreamCache();
			case CamelSpringPackage.VERB_DEFINITION__TYPE:
				return getType();
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
			case CamelSpringPackage.VERB_DEFINITION__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends ParamDefinition>)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__RESPONSE_MESSAGE:
				getResponseMessage().clear();
				getResponseMessage().addAll((Collection<? extends ResponseMessageDefinition>)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends SecurityDefinition>)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__TO:
				setTo((ToDefinition)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__API_DOCS:
				setApiDocs((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__BINDING_MODE:
				setBindingMode((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__CLIENT_REQUEST_VALIDATION:
				setClientRequestValidation((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				setClientResponseValidation((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__CONSUMES:
				setConsumes((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__DEPRECATED:
				setDeprecated((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__DISABLED:
				setDisabled((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__ENABLE_CORS:
				setEnableCORS((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				setEnableNoContentResponse((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__OUT_TYPE:
				setOutType((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__PATH:
				setPath((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__PRODUCES:
				setProduces((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__ROUTE_ID:
				setRouteId((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				setSkipBindingOnErrorCode((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__STREAM_CACHE:
				setStreamCache((String)newValue);
				return;
			case CamelSpringPackage.VERB_DEFINITION__TYPE:
				setType((String)newValue);
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
			case CamelSpringPackage.VERB_DEFINITION__PARAM:
				getParam().clear();
				return;
			case CamelSpringPackage.VERB_DEFINITION__RESPONSE_MESSAGE:
				getResponseMessage().clear();
				return;
			case CamelSpringPackage.VERB_DEFINITION__SECURITY:
				getSecurity().clear();
				return;
			case CamelSpringPackage.VERB_DEFINITION__TO:
				setTo((ToDefinition)null);
				return;
			case CamelSpringPackage.VERB_DEFINITION__API_DOCS:
				setApiDocs(API_DOCS_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__BINDING_MODE:
				setBindingMode(BINDING_MODE_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__CLIENT_REQUEST_VALIDATION:
				setClientRequestValidation(CLIENT_REQUEST_VALIDATION_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				setClientResponseValidation(CLIENT_RESPONSE_VALIDATION_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__CONSUMES:
				setConsumes(CONSUMES_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__ENABLE_CORS:
				setEnableCORS(ENABLE_CORS_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				setEnableNoContentResponse(ENABLE_NO_CONTENT_RESPONSE_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__OUT_TYPE:
				setOutType(OUT_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__PRODUCES:
				setProduces(PRODUCES_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__ROUTE_ID:
				setRouteId(ROUTE_ID_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				setSkipBindingOnErrorCode(SKIP_BINDING_ON_ERROR_CODE_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__STREAM_CACHE:
				setStreamCache(STREAM_CACHE_EDEFAULT);
				return;
			case CamelSpringPackage.VERB_DEFINITION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CamelSpringPackage.VERB_DEFINITION__PARAM:
				return param != null && !param.isEmpty();
			case CamelSpringPackage.VERB_DEFINITION__RESPONSE_MESSAGE:
				return responseMessage != null && !responseMessage.isEmpty();
			case CamelSpringPackage.VERB_DEFINITION__SECURITY:
				return security != null && !security.isEmpty();
			case CamelSpringPackage.VERB_DEFINITION__TO:
				return to != null;
			case CamelSpringPackage.VERB_DEFINITION__API_DOCS:
				return API_DOCS_EDEFAULT == null ? apiDocs != null : !API_DOCS_EDEFAULT.equals(apiDocs);
			case CamelSpringPackage.VERB_DEFINITION__BINDING_MODE:
				return BINDING_MODE_EDEFAULT == null ? bindingMode != null : !BINDING_MODE_EDEFAULT.equals(bindingMode);
			case CamelSpringPackage.VERB_DEFINITION__CLIENT_REQUEST_VALIDATION:
				return CLIENT_REQUEST_VALIDATION_EDEFAULT == null ? clientRequestValidation != null : !CLIENT_REQUEST_VALIDATION_EDEFAULT.equals(clientRequestValidation);
			case CamelSpringPackage.VERB_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				return CLIENT_RESPONSE_VALIDATION_EDEFAULT == null ? clientResponseValidation != null : !CLIENT_RESPONSE_VALIDATION_EDEFAULT.equals(clientResponseValidation);
			case CamelSpringPackage.VERB_DEFINITION__CONSUMES:
				return CONSUMES_EDEFAULT == null ? consumes != null : !CONSUMES_EDEFAULT.equals(consumes);
			case CamelSpringPackage.VERB_DEFINITION__DEPRECATED:
				return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
			case CamelSpringPackage.VERB_DEFINITION__DISABLED:
				return DISABLED_EDEFAULT == null ? disabled != null : !DISABLED_EDEFAULT.equals(disabled);
			case CamelSpringPackage.VERB_DEFINITION__ENABLE_CORS:
				return ENABLE_CORS_EDEFAULT == null ? enableCORS != null : !ENABLE_CORS_EDEFAULT.equals(enableCORS);
			case CamelSpringPackage.VERB_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				return ENABLE_NO_CONTENT_RESPONSE_EDEFAULT == null ? enableNoContentResponse != null : !ENABLE_NO_CONTENT_RESPONSE_EDEFAULT.equals(enableNoContentResponse);
			case CamelSpringPackage.VERB_DEFINITION__OUT_TYPE:
				return OUT_TYPE_EDEFAULT == null ? outType != null : !OUT_TYPE_EDEFAULT.equals(outType);
			case CamelSpringPackage.VERB_DEFINITION__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case CamelSpringPackage.VERB_DEFINITION__PRODUCES:
				return PRODUCES_EDEFAULT == null ? produces != null : !PRODUCES_EDEFAULT.equals(produces);
			case CamelSpringPackage.VERB_DEFINITION__ROUTE_ID:
				return ROUTE_ID_EDEFAULT == null ? routeId != null : !ROUTE_ID_EDEFAULT.equals(routeId);
			case CamelSpringPackage.VERB_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				return SKIP_BINDING_ON_ERROR_CODE_EDEFAULT == null ? skipBindingOnErrorCode != null : !SKIP_BINDING_ON_ERROR_CODE_EDEFAULT.equals(skipBindingOnErrorCode);
			case CamelSpringPackage.VERB_DEFINITION__STREAM_CACHE:
				return STREAM_CACHE_EDEFAULT == null ? streamCache != null : !STREAM_CACHE_EDEFAULT.equals(streamCache);
			case CamelSpringPackage.VERB_DEFINITION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (apiDocs: ");
		result.append(apiDocs);
		result.append(", bindingMode: ");
		result.append(bindingMode);
		result.append(", clientRequestValidation: ");
		result.append(clientRequestValidation);
		result.append(", clientResponseValidation: ");
		result.append(clientResponseValidation);
		result.append(", consumes: ");
		result.append(consumes);
		result.append(", deprecated: ");
		result.append(deprecated);
		result.append(", disabled: ");
		result.append(disabled);
		result.append(", enableCORS: ");
		result.append(enableCORS);
		result.append(", enableNoContentResponse: ");
		result.append(enableNoContentResponse);
		result.append(", outType: ");
		result.append(outType);
		result.append(", path: ");
		result.append(path);
		result.append(", produces: ");
		result.append(produces);
		result.append(", routeId: ");
		result.append(routeId);
		result.append(", skipBindingOnErrorCode: ");
		result.append(skipBindingOnErrorCode);
		result.append(", streamCache: ");
		result.append(streamCache);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VerbDefinitionImpl

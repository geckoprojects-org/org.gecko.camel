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
import org.eclipse.fennec.camel.camelspring.RestBindingDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Binding Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getBindingMode <em>Binding Mode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getClientRequestValidation <em>Client Request Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getClientResponseValidation <em>Client Response Validation</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getEnableCORS <em>Enable CORS</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getEnableNoContentResponse <em>Enable No Content Response</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getOutType <em>Out Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getSkipBindingOnErrorCode <em>Skip Binding On Error Code</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.RestBindingDefinitionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestBindingDefinitionImpl extends OptionalIdentifiedDefinitionImpl implements RestBindingDefinition {
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
	 * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected String component = COMPONENT_EDEFAULT;

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
	protected RestBindingDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getRestBindingDefinition();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__BINDING_MODE, oldBindingMode, bindingMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__CLIENT_REQUEST_VALIDATION, oldClientRequestValidation, clientRequestValidation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__CLIENT_RESPONSE_VALIDATION, oldClientResponseValidation, clientResponseValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(String newComponent) {
		String oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__COMPONENT, oldComponent, component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__CONSUMES, oldConsumes, consumes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__ENABLE_CORS, oldEnableCORS, enableCORS));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__ENABLE_NO_CONTENT_RESPONSE, oldEnableNoContentResponse, enableNoContentResponse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__OUT_TYPE, oldOutType, outType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__PRODUCES, oldProduces, produces));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__SKIP_BINDING_ON_ERROR_CODE, oldSkipBindingOnErrorCode, skipBindingOnErrorCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.REST_BINDING_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.REST_BINDING_DEFINITION__BINDING_MODE:
				return getBindingMode();
			case CamelSpringPackage.REST_BINDING_DEFINITION__CLIENT_REQUEST_VALIDATION:
				return getClientRequestValidation();
			case CamelSpringPackage.REST_BINDING_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				return getClientResponseValidation();
			case CamelSpringPackage.REST_BINDING_DEFINITION__COMPONENT:
				return getComponent();
			case CamelSpringPackage.REST_BINDING_DEFINITION__CONSUMES:
				return getConsumes();
			case CamelSpringPackage.REST_BINDING_DEFINITION__ENABLE_CORS:
				return getEnableCORS();
			case CamelSpringPackage.REST_BINDING_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				return getEnableNoContentResponse();
			case CamelSpringPackage.REST_BINDING_DEFINITION__OUT_TYPE:
				return getOutType();
			case CamelSpringPackage.REST_BINDING_DEFINITION__PRODUCES:
				return getProduces();
			case CamelSpringPackage.REST_BINDING_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				return getSkipBindingOnErrorCode();
			case CamelSpringPackage.REST_BINDING_DEFINITION__TYPE:
				return getType();
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
			case CamelSpringPackage.REST_BINDING_DEFINITION__BINDING_MODE:
				setBindingMode((String)newValue);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__CLIENT_REQUEST_VALIDATION:
				setClientRequestValidation((String)newValue);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				setClientResponseValidation((String)newValue);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__COMPONENT:
				setComponent((String)newValue);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__CONSUMES:
				setConsumes((String)newValue);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__ENABLE_CORS:
				setEnableCORS((String)newValue);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				setEnableNoContentResponse((String)newValue);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__OUT_TYPE:
				setOutType((String)newValue);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__PRODUCES:
				setProduces((String)newValue);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				setSkipBindingOnErrorCode((String)newValue);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__TYPE:
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
			case CamelSpringPackage.REST_BINDING_DEFINITION__BINDING_MODE:
				setBindingMode(BINDING_MODE_EDEFAULT);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__CLIENT_REQUEST_VALIDATION:
				setClientRequestValidation(CLIENT_REQUEST_VALIDATION_EDEFAULT);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				setClientResponseValidation(CLIENT_RESPONSE_VALIDATION_EDEFAULT);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__COMPONENT:
				setComponent(COMPONENT_EDEFAULT);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__CONSUMES:
				setConsumes(CONSUMES_EDEFAULT);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__ENABLE_CORS:
				setEnableCORS(ENABLE_CORS_EDEFAULT);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				setEnableNoContentResponse(ENABLE_NO_CONTENT_RESPONSE_EDEFAULT);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__OUT_TYPE:
				setOutType(OUT_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__PRODUCES:
				setProduces(PRODUCES_EDEFAULT);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				setSkipBindingOnErrorCode(SKIP_BINDING_ON_ERROR_CODE_EDEFAULT);
				return;
			case CamelSpringPackage.REST_BINDING_DEFINITION__TYPE:
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
			case CamelSpringPackage.REST_BINDING_DEFINITION__BINDING_MODE:
				return BINDING_MODE_EDEFAULT == null ? bindingMode != null : !BINDING_MODE_EDEFAULT.equals(bindingMode);
			case CamelSpringPackage.REST_BINDING_DEFINITION__CLIENT_REQUEST_VALIDATION:
				return CLIENT_REQUEST_VALIDATION_EDEFAULT == null ? clientRequestValidation != null : !CLIENT_REQUEST_VALIDATION_EDEFAULT.equals(clientRequestValidation);
			case CamelSpringPackage.REST_BINDING_DEFINITION__CLIENT_RESPONSE_VALIDATION:
				return CLIENT_RESPONSE_VALIDATION_EDEFAULT == null ? clientResponseValidation != null : !CLIENT_RESPONSE_VALIDATION_EDEFAULT.equals(clientResponseValidation);
			case CamelSpringPackage.REST_BINDING_DEFINITION__COMPONENT:
				return COMPONENT_EDEFAULT == null ? component != null : !COMPONENT_EDEFAULT.equals(component);
			case CamelSpringPackage.REST_BINDING_DEFINITION__CONSUMES:
				return CONSUMES_EDEFAULT == null ? consumes != null : !CONSUMES_EDEFAULT.equals(consumes);
			case CamelSpringPackage.REST_BINDING_DEFINITION__ENABLE_CORS:
				return ENABLE_CORS_EDEFAULT == null ? enableCORS != null : !ENABLE_CORS_EDEFAULT.equals(enableCORS);
			case CamelSpringPackage.REST_BINDING_DEFINITION__ENABLE_NO_CONTENT_RESPONSE:
				return ENABLE_NO_CONTENT_RESPONSE_EDEFAULT == null ? enableNoContentResponse != null : !ENABLE_NO_CONTENT_RESPONSE_EDEFAULT.equals(enableNoContentResponse);
			case CamelSpringPackage.REST_BINDING_DEFINITION__OUT_TYPE:
				return OUT_TYPE_EDEFAULT == null ? outType != null : !OUT_TYPE_EDEFAULT.equals(outType);
			case CamelSpringPackage.REST_BINDING_DEFINITION__PRODUCES:
				return PRODUCES_EDEFAULT == null ? produces != null : !PRODUCES_EDEFAULT.equals(produces);
			case CamelSpringPackage.REST_BINDING_DEFINITION__SKIP_BINDING_ON_ERROR_CODE:
				return SKIP_BINDING_ON_ERROR_CODE_EDEFAULT == null ? skipBindingOnErrorCode != null : !SKIP_BINDING_ON_ERROR_CODE_EDEFAULT.equals(skipBindingOnErrorCode);
			case CamelSpringPackage.REST_BINDING_DEFINITION__TYPE:
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
		result.append(" (bindingMode: ");
		result.append(bindingMode);
		result.append(", clientRequestValidation: ");
		result.append(clientRequestValidation);
		result.append(", clientResponseValidation: ");
		result.append(clientResponseValidation);
		result.append(", component: ");
		result.append(component);
		result.append(", consumes: ");
		result.append(consumes);
		result.append(", enableCORS: ");
		result.append(enableCORS);
		result.append(", enableNoContentResponse: ");
		result.append(enableNoContentResponse);
		result.append(", outType: ");
		result.append(outType);
		result.append(", produces: ");
		result.append(produces);
		result.append(", skipBindingOnErrorCode: ");
		result.append(skipBindingOnErrorCode);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RestBindingDefinitionImpl

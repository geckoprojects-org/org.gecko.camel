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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition;
import org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition;
import org.eclipse.fennec.camel.camelspring.RestPropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Message Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseMessageDefinitionImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseMessageDefinitionImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseMessageDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseMessageDefinitionImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseMessageDefinitionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ResponseMessageDefinitionImpl#getResponseModel <em>Response Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseMessageDefinitionImpl extends MinimalEObjectImpl.Container implements ResponseMessageDefinition {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseHeaderDefinition> header;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected EList<RestPropertyDefinition> examples;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseModel() <em>Response Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModel()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseModel() <em>Response Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModel()
	 * @generated
	 * @ordered
	 */
	protected String responseModel = RESPONSE_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseMessageDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getResponseMessageDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponseHeaderDefinition> getHeader() {
		if (header == null) {
			header = new EObjectContainmentEList<ResponseHeaderDefinition>(ResponseHeaderDefinition.class, this, CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__HEADER);
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestPropertyDefinition> getExamples() {
		if (examples == null) {
			examples = new EObjectContainmentEList<RestPropertyDefinition>(RestPropertyDefinition.class, this, CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__EXAMPLES);
		}
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseModel() {
		return responseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseModel(String newResponseModel) {
		String oldResponseModel = responseModel;
		responseModel = newResponseModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__RESPONSE_MODEL, oldResponseModel, responseModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__EXAMPLES:
				return ((InternalEList<?>)getExamples()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__HEADER:
				return getHeader();
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__EXAMPLES:
				return getExamples();
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__CODE:
				return getCode();
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__CONTENT_TYPE:
				return getContentType();
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__MESSAGE:
				return getMessage();
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__RESPONSE_MODEL:
				return getResponseModel();
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
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends ResponseHeaderDefinition>)newValue);
				return;
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__EXAMPLES:
				getExamples().clear();
				getExamples().addAll((Collection<? extends RestPropertyDefinition>)newValue);
				return;
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__CODE:
				setCode((String)newValue);
				return;
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__MESSAGE:
				setMessage((String)newValue);
				return;
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__RESPONSE_MODEL:
				setResponseModel((String)newValue);
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
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__HEADER:
				getHeader().clear();
				return;
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__EXAMPLES:
				getExamples().clear();
				return;
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__RESPONSE_MODEL:
				setResponseModel(RESPONSE_MODEL_EDEFAULT);
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
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__HEADER:
				return header != null && !header.isEmpty();
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__EXAMPLES:
				return examples != null && !examples.isEmpty();
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION__RESPONSE_MODEL:
				return RESPONSE_MODEL_EDEFAULT == null ? responseModel != null : !RESPONSE_MODEL_EDEFAULT.equals(responseModel);
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
		result.append(" (code: ");
		result.append(code);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", message: ");
		result.append(message);
		result.append(", responseModel: ");
		result.append(responseModel);
		result.append(')');
		return result.toString();
	}

} //ResponseMessageDefinitionImpl

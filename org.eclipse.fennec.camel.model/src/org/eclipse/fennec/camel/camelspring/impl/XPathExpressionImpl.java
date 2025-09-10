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
import org.eclipse.fennec.camel.camelspring.XPathExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPath Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XPathExpressionImpl#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XPathExpressionImpl#getFactoryRef <em>Factory Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XPathExpressionImpl#getLogNamespaces <em>Log Namespaces</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XPathExpressionImpl#getObjectModel <em>Object Model</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XPathExpressionImpl#getPreCompile <em>Pre Compile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XPathExpressionImpl#getResultQName <em>Result QName</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XPathExpressionImpl#getSaxon <em>Saxon</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.XPathExpressionImpl#getThreadSafety <em>Thread Safety</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XPathExpressionImpl extends NamespaceAwareExpressionImpl implements XPathExpression {
	/**
	 * The default value of the '{@link #getDocumentType() <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentType() <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected String documentType = DOCUMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactoryRef() <em>Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactoryRef() <em>Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryRef()
	 * @generated
	 * @ordered
	 */
	protected String factoryRef = FACTORY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogNamespaces() <em>Log Namespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogNamespaces()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_NAMESPACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogNamespaces() <em>Log Namespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogNamespaces()
	 * @generated
	 * @ordered
	 */
	protected String logNamespaces = LOG_NAMESPACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectModel() <em>Object Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectModel()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectModel() <em>Object Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectModel()
	 * @generated
	 * @ordered
	 */
	protected String objectModel = OBJECT_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreCompile() <em>Pre Compile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCompile()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_COMPILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreCompile() <em>Pre Compile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCompile()
	 * @generated
	 * @ordered
	 */
	protected String preCompile = PRE_COMPILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultQName() <em>Result QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultQName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_QNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultQName() <em>Result QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultQName()
	 * @generated
	 * @ordered
	 */
	protected String resultQName = RESULT_QNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaxon() <em>Saxon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaxon()
	 * @generated
	 * @ordered
	 */
	protected static final String SAXON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSaxon() <em>Saxon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaxon()
	 * @generated
	 * @ordered
	 */
	protected String saxon = SAXON_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadSafety() <em>Thread Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadSafety()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_SAFETY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadSafety() <em>Thread Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadSafety()
	 * @generated
	 * @ordered
	 */
	protected String threadSafety = THREAD_SAFETY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPathExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getXPathExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentType() {
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentType(String newDocumentType) {
		String oldDocumentType = documentType;
		documentType = newDocumentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XPATH_EXPRESSION__DOCUMENT_TYPE, oldDocumentType, documentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFactoryRef() {
		return factoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactoryRef(String newFactoryRef) {
		String oldFactoryRef = factoryRef;
		factoryRef = newFactoryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XPATH_EXPRESSION__FACTORY_REF, oldFactoryRef, factoryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogNamespaces() {
		return logNamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogNamespaces(String newLogNamespaces) {
		String oldLogNamespaces = logNamespaces;
		logNamespaces = newLogNamespaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XPATH_EXPRESSION__LOG_NAMESPACES, oldLogNamespaces, logNamespaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjectModel() {
		return objectModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectModel(String newObjectModel) {
		String oldObjectModel = objectModel;
		objectModel = newObjectModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XPATH_EXPRESSION__OBJECT_MODEL, oldObjectModel, objectModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreCompile() {
		return preCompile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreCompile(String newPreCompile) {
		String oldPreCompile = preCompile;
		preCompile = newPreCompile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XPATH_EXPRESSION__PRE_COMPILE, oldPreCompile, preCompile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultQName() {
		return resultQName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultQName(String newResultQName) {
		String oldResultQName = resultQName;
		resultQName = newResultQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XPATH_EXPRESSION__RESULT_QNAME, oldResultQName, resultQName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSaxon() {
		return saxon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaxon(String newSaxon) {
		String oldSaxon = saxon;
		saxon = newSaxon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XPATH_EXPRESSION__SAXON, oldSaxon, saxon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThreadSafety() {
		return threadSafety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadSafety(String newThreadSafety) {
		String oldThreadSafety = threadSafety;
		threadSafety = newThreadSafety;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.XPATH_EXPRESSION__THREAD_SAFETY, oldThreadSafety, threadSafety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.XPATH_EXPRESSION__DOCUMENT_TYPE:
				return getDocumentType();
			case CamelSpringPackage.XPATH_EXPRESSION__FACTORY_REF:
				return getFactoryRef();
			case CamelSpringPackage.XPATH_EXPRESSION__LOG_NAMESPACES:
				return getLogNamespaces();
			case CamelSpringPackage.XPATH_EXPRESSION__OBJECT_MODEL:
				return getObjectModel();
			case CamelSpringPackage.XPATH_EXPRESSION__PRE_COMPILE:
				return getPreCompile();
			case CamelSpringPackage.XPATH_EXPRESSION__RESULT_QNAME:
				return getResultQName();
			case CamelSpringPackage.XPATH_EXPRESSION__SAXON:
				return getSaxon();
			case CamelSpringPackage.XPATH_EXPRESSION__THREAD_SAFETY:
				return getThreadSafety();
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
			case CamelSpringPackage.XPATH_EXPRESSION__DOCUMENT_TYPE:
				setDocumentType((String)newValue);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__FACTORY_REF:
				setFactoryRef((String)newValue);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__LOG_NAMESPACES:
				setLogNamespaces((String)newValue);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__OBJECT_MODEL:
				setObjectModel((String)newValue);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__PRE_COMPILE:
				setPreCompile((String)newValue);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__RESULT_QNAME:
				setResultQName((String)newValue);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__SAXON:
				setSaxon((String)newValue);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__THREAD_SAFETY:
				setThreadSafety((String)newValue);
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
			case CamelSpringPackage.XPATH_EXPRESSION__DOCUMENT_TYPE:
				setDocumentType(DOCUMENT_TYPE_EDEFAULT);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__FACTORY_REF:
				setFactoryRef(FACTORY_REF_EDEFAULT);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__LOG_NAMESPACES:
				setLogNamespaces(LOG_NAMESPACES_EDEFAULT);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__OBJECT_MODEL:
				setObjectModel(OBJECT_MODEL_EDEFAULT);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__PRE_COMPILE:
				setPreCompile(PRE_COMPILE_EDEFAULT);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__RESULT_QNAME:
				setResultQName(RESULT_QNAME_EDEFAULT);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__SAXON:
				setSaxon(SAXON_EDEFAULT);
				return;
			case CamelSpringPackage.XPATH_EXPRESSION__THREAD_SAFETY:
				setThreadSafety(THREAD_SAFETY_EDEFAULT);
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
			case CamelSpringPackage.XPATH_EXPRESSION__DOCUMENT_TYPE:
				return DOCUMENT_TYPE_EDEFAULT == null ? documentType != null : !DOCUMENT_TYPE_EDEFAULT.equals(documentType);
			case CamelSpringPackage.XPATH_EXPRESSION__FACTORY_REF:
				return FACTORY_REF_EDEFAULT == null ? factoryRef != null : !FACTORY_REF_EDEFAULT.equals(factoryRef);
			case CamelSpringPackage.XPATH_EXPRESSION__LOG_NAMESPACES:
				return LOG_NAMESPACES_EDEFAULT == null ? logNamespaces != null : !LOG_NAMESPACES_EDEFAULT.equals(logNamespaces);
			case CamelSpringPackage.XPATH_EXPRESSION__OBJECT_MODEL:
				return OBJECT_MODEL_EDEFAULT == null ? objectModel != null : !OBJECT_MODEL_EDEFAULT.equals(objectModel);
			case CamelSpringPackage.XPATH_EXPRESSION__PRE_COMPILE:
				return PRE_COMPILE_EDEFAULT == null ? preCompile != null : !PRE_COMPILE_EDEFAULT.equals(preCompile);
			case CamelSpringPackage.XPATH_EXPRESSION__RESULT_QNAME:
				return RESULT_QNAME_EDEFAULT == null ? resultQName != null : !RESULT_QNAME_EDEFAULT.equals(resultQName);
			case CamelSpringPackage.XPATH_EXPRESSION__SAXON:
				return SAXON_EDEFAULT == null ? saxon != null : !SAXON_EDEFAULT.equals(saxon);
			case CamelSpringPackage.XPATH_EXPRESSION__THREAD_SAFETY:
				return THREAD_SAFETY_EDEFAULT == null ? threadSafety != null : !THREAD_SAFETY_EDEFAULT.equals(threadSafety);
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
		result.append(" (documentType: ");
		result.append(documentType);
		result.append(", factoryRef: ");
		result.append(factoryRef);
		result.append(", logNamespaces: ");
		result.append(logNamespaces);
		result.append(", objectModel: ");
		result.append(objectModel);
		result.append(", preCompile: ");
		result.append(preCompile);
		result.append(", resultQName: ");
		result.append(resultQName);
		result.append(", saxon: ");
		result.append(saxon);
		result.append(", threadSafety: ");
		result.append(threadSafety);
		result.append(')');
		return result.toString();
	}

} //XPathExpressionImpl

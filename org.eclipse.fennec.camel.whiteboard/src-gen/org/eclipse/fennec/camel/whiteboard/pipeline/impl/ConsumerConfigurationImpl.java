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
package org.eclipse.fennec.camel.whiteboard.pipeline.impl;

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

import org.eclipse.fennec.camel.whiteboard.pipeline.ConsumerConfiguration;
import org.eclipse.fennec.camel.whiteboard.pipeline.ParameterValue;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelineDefinition;
import org.eclipse.fennec.camel.whiteboard.pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ConsumerConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ConsumerConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ConsumerConfigurationImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ConsumerConfigurationImpl#getInlinePipeline <em>Inline Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ConsumerConfigurationImpl#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.whiteboard.pipeline.impl.ConsumerConfigurationImpl#isAutoStart <em>Auto Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumerConfigurationImpl extends MinimalEObjectImpl.Container implements ConsumerConfiguration {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPipeline() <em>Pipeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipeline()
	 * @generated
	 * @ordered
	 */
	protected PipelineDefinition pipeline;

	/**
	 * The cached value of the '{@link #getInlinePipeline() <em>Inline Pipeline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlinePipeline()
	 * @generated
	 * @ordered
	 */
	protected PipelineDefinition inlinePipeline;

	/**
	 * The cached value of the '{@link #getParameterValues() <em>Parameter Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> parameterValues;

	/**
	 * The default value of the '{@link #isAutoStart() <em>Auto Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_START_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoStart() <em>Auto Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoStart()
	 * @generated
	 * @ordered
	 */
	protected boolean autoStart = AUTO_START_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumerConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.CONSUMER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.CONSUMER_CONFIGURATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.CONSUMER_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelineDefinition getPipeline() {
		if (pipeline != null && pipeline.eIsProxy()) {
			InternalEObject oldPipeline = (InternalEObject)pipeline;
			pipeline = (PipelineDefinition)eResolveProxy(oldPipeline);
			if (pipeline != oldPipeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.CONSUMER_CONFIGURATION__PIPELINE, oldPipeline, pipeline));
			}
		}
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineDefinition basicGetPipeline() {
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPipeline(PipelineDefinition newPipeline) {
		PipelineDefinition oldPipeline = pipeline;
		pipeline = newPipeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.CONSUMER_CONFIGURATION__PIPELINE, oldPipeline, pipeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelineDefinition getInlinePipeline() {
		return inlinePipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInlinePipeline(PipelineDefinition newInlinePipeline, NotificationChain msgs) {
		PipelineDefinition oldInlinePipeline = inlinePipeline;
		inlinePipeline = newInlinePipeline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelinePackage.CONSUMER_CONFIGURATION__INLINE_PIPELINE, oldInlinePipeline, newInlinePipeline);
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
	public void setInlinePipeline(PipelineDefinition newInlinePipeline) {
		if (newInlinePipeline != inlinePipeline) {
			NotificationChain msgs = null;
			if (inlinePipeline != null)
				msgs = ((InternalEObject)inlinePipeline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipelinePackage.CONSUMER_CONFIGURATION__INLINE_PIPELINE, null, msgs);
			if (newInlinePipeline != null)
				msgs = ((InternalEObject)newInlinePipeline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipelinePackage.CONSUMER_CONFIGURATION__INLINE_PIPELINE, null, msgs);
			msgs = basicSetInlinePipeline(newInlinePipeline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.CONSUMER_CONFIGURATION__INLINE_PIPELINE, newInlinePipeline, newInlinePipeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterValue> getParameterValues() {
		if (parameterValues == null) {
			parameterValues = new EObjectContainmentEList<ParameterValue>(ParameterValue.class, this, PipelinePackage.CONSUMER_CONFIGURATION__PARAMETER_VALUES);
		}
		return parameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoStart() {
		return autoStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoStart(boolean newAutoStart) {
		boolean oldAutoStart = autoStart;
		autoStart = newAutoStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.CONSUMER_CONFIGURATION__AUTO_START, oldAutoStart, autoStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.CONSUMER_CONFIGURATION__INLINE_PIPELINE:
				return basicSetInlinePipeline(null, msgs);
			case PipelinePackage.CONSUMER_CONFIGURATION__PARAMETER_VALUES:
				return ((InternalEList<?>)getParameterValues()).basicRemove(otherEnd, msgs);
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
			case PipelinePackage.CONSUMER_CONFIGURATION__ID:
				return getId();
			case PipelinePackage.CONSUMER_CONFIGURATION__NAME:
				return getName();
			case PipelinePackage.CONSUMER_CONFIGURATION__PIPELINE:
				if (resolve) return getPipeline();
				return basicGetPipeline();
			case PipelinePackage.CONSUMER_CONFIGURATION__INLINE_PIPELINE:
				return getInlinePipeline();
			case PipelinePackage.CONSUMER_CONFIGURATION__PARAMETER_VALUES:
				return getParameterValues();
			case PipelinePackage.CONSUMER_CONFIGURATION__AUTO_START:
				return isAutoStart();
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
			case PipelinePackage.CONSUMER_CONFIGURATION__ID:
				setId((String)newValue);
				return;
			case PipelinePackage.CONSUMER_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case PipelinePackage.CONSUMER_CONFIGURATION__PIPELINE:
				setPipeline((PipelineDefinition)newValue);
				return;
			case PipelinePackage.CONSUMER_CONFIGURATION__INLINE_PIPELINE:
				setInlinePipeline((PipelineDefinition)newValue);
				return;
			case PipelinePackage.CONSUMER_CONFIGURATION__PARAMETER_VALUES:
				getParameterValues().clear();
				getParameterValues().addAll((Collection<? extends ParameterValue>)newValue);
				return;
			case PipelinePackage.CONSUMER_CONFIGURATION__AUTO_START:
				setAutoStart((Boolean)newValue);
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
			case PipelinePackage.CONSUMER_CONFIGURATION__ID:
				setId(ID_EDEFAULT);
				return;
			case PipelinePackage.CONSUMER_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PipelinePackage.CONSUMER_CONFIGURATION__PIPELINE:
				setPipeline((PipelineDefinition)null);
				return;
			case PipelinePackage.CONSUMER_CONFIGURATION__INLINE_PIPELINE:
				setInlinePipeline((PipelineDefinition)null);
				return;
			case PipelinePackage.CONSUMER_CONFIGURATION__PARAMETER_VALUES:
				getParameterValues().clear();
				return;
			case PipelinePackage.CONSUMER_CONFIGURATION__AUTO_START:
				setAutoStart(AUTO_START_EDEFAULT);
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
			case PipelinePackage.CONSUMER_CONFIGURATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PipelinePackage.CONSUMER_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PipelinePackage.CONSUMER_CONFIGURATION__PIPELINE:
				return pipeline != null;
			case PipelinePackage.CONSUMER_CONFIGURATION__INLINE_PIPELINE:
				return inlinePipeline != null;
			case PipelinePackage.CONSUMER_CONFIGURATION__PARAMETER_VALUES:
				return parameterValues != null && !parameterValues.isEmpty();
			case PipelinePackage.CONSUMER_CONFIGURATION__AUTO_START:
				return autoStart != AUTO_START_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", autoStart: ");
		result.append(autoStart);
		result.append(')');
		return result.toString();
	}

} //ConsumerConfigurationImpl

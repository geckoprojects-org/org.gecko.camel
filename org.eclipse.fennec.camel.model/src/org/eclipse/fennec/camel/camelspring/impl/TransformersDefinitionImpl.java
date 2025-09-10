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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CustomTransformerDefinition;
import org.eclipse.fennec.camel.camelspring.DataFormatTransformerDefinition;
import org.eclipse.fennec.camel.camelspring.EndpointTransformerDefinition;
import org.eclipse.fennec.camel.camelspring.LoadTransformerDefinition;
import org.eclipse.fennec.camel.camelspring.TransformersDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformers Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransformersDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransformersDefinitionImpl#getDataFormatTransformer <em>Data Format Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransformersDefinitionImpl#getEndpointTransformer <em>Endpoint Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransformersDefinitionImpl#getLoadTransformer <em>Load Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.TransformersDefinitionImpl#getCustomTransformer <em>Custom Transformer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformersDefinitionImpl extends MinimalEObjectImpl.Container implements TransformersDefinition {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformersDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getTransformersDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.TRANSFORMERS_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataFormatTransformerDefinition> getDataFormatTransformer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getTransformersDefinition_DataFormatTransformer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EndpointTransformerDefinition> getEndpointTransformer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getTransformersDefinition_EndpointTransformer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadTransformerDefinition> getLoadTransformer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getTransformersDefinition_LoadTransformer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CustomTransformerDefinition> getCustomTransformer() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getTransformersDefinition_CustomTransformer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__DATA_FORMAT_TRANSFORMER:
				return ((InternalEList<?>)getDataFormatTransformer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__ENDPOINT_TRANSFORMER:
				return ((InternalEList<?>)getEndpointTransformer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__LOAD_TRANSFORMER:
				return ((InternalEList<?>)getLoadTransformer()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__CUSTOM_TRANSFORMER:
				return ((InternalEList<?>)getCustomTransformer()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__DATA_FORMAT_TRANSFORMER:
				return getDataFormatTransformer();
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__ENDPOINT_TRANSFORMER:
				return getEndpointTransformer();
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__LOAD_TRANSFORMER:
				return getLoadTransformer();
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__CUSTOM_TRANSFORMER:
				return getCustomTransformer();
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
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__DATA_FORMAT_TRANSFORMER:
				getDataFormatTransformer().clear();
				getDataFormatTransformer().addAll((Collection<? extends DataFormatTransformerDefinition>)newValue);
				return;
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__ENDPOINT_TRANSFORMER:
				getEndpointTransformer().clear();
				getEndpointTransformer().addAll((Collection<? extends EndpointTransformerDefinition>)newValue);
				return;
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__LOAD_TRANSFORMER:
				getLoadTransformer().clear();
				getLoadTransformer().addAll((Collection<? extends LoadTransformerDefinition>)newValue);
				return;
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__CUSTOM_TRANSFORMER:
				getCustomTransformer().clear();
				getCustomTransformer().addAll((Collection<? extends CustomTransformerDefinition>)newValue);
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
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__DATA_FORMAT_TRANSFORMER:
				getDataFormatTransformer().clear();
				return;
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__ENDPOINT_TRANSFORMER:
				getEndpointTransformer().clear();
				return;
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__LOAD_TRANSFORMER:
				getLoadTransformer().clear();
				return;
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__CUSTOM_TRANSFORMER:
				getCustomTransformer().clear();
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
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__DATA_FORMAT_TRANSFORMER:
				return !getDataFormatTransformer().isEmpty();
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__ENDPOINT_TRANSFORMER:
				return !getEndpointTransformer().isEmpty();
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__LOAD_TRANSFORMER:
				return !getLoadTransformer().isEmpty();
			case CamelSpringPackage.TRANSFORMERS_DEFINITION__CUSTOM_TRANSFORMER:
				return !getCustomTransformer().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TransformersDefinitionImpl

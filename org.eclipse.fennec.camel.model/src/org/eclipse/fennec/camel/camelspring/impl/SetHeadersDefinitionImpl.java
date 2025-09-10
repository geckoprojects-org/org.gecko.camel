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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.SetHeaderDefinition;
import org.eclipse.fennec.camel.camelspring.SetHeadersDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Headers Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.SetHeadersDefinitionImpl#getSetHeader <em>Set Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetHeadersDefinitionImpl extends ProcessorDefinitionImpl implements SetHeadersDefinition {
	/**
	 * The cached value of the '{@link #getSetHeader() <em>Set Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<SetHeaderDefinition> setHeader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetHeadersDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getSetHeadersDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetHeaderDefinition> getSetHeader() {
		if (setHeader == null) {
			setHeader = new EObjectContainmentEList<SetHeaderDefinition>(SetHeaderDefinition.class, this, CamelSpringPackage.SET_HEADERS_DEFINITION__SET_HEADER);
		}
		return setHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.SET_HEADERS_DEFINITION__SET_HEADER:
				return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.SET_HEADERS_DEFINITION__SET_HEADER:
				return getSetHeader();
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
			case CamelSpringPackage.SET_HEADERS_DEFINITION__SET_HEADER:
				getSetHeader().clear();
				getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
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
			case CamelSpringPackage.SET_HEADERS_DEFINITION__SET_HEADER:
				getSetHeader().clear();
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
			case CamelSpringPackage.SET_HEADERS_DEFINITION__SET_HEADER:
				return setHeader != null && !setHeader.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SetHeadersDefinitionImpl

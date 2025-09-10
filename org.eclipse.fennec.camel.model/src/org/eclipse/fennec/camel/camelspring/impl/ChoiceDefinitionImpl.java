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
import org.eclipse.fennec.camel.camelspring.ChoiceDefinition;
import org.eclipse.fennec.camel.camelspring.OtherwiseDefinition;
import org.eclipse.fennec.camel.camelspring.WhenDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ChoiceDefinitionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ChoiceDefinitionImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.ChoiceDefinitionImpl#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoiceDefinitionImpl extends NoOutputDefinitionImpl implements ChoiceDefinition {
	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected EList<WhenDefinition> when;

	/**
	 * The cached value of the '{@link #getOtherwise() <em>Otherwise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherwise()
	 * @generated
	 * @ordered
	 */
	protected OtherwiseDefinition otherwise;

	/**
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getChoiceDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WhenDefinition> getWhen() {
		if (when == null) {
			when = new EObjectContainmentEList<WhenDefinition>(WhenDefinition.class, this, CamelSpringPackage.CHOICE_DEFINITION__WHEN);
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherwiseDefinition getOtherwise() {
		return otherwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwise(OtherwiseDefinition newOtherwise, NotificationChain msgs) {
		OtherwiseDefinition oldOtherwise = otherwise;
		otherwise = newOtherwise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CHOICE_DEFINITION__OTHERWISE, oldOtherwise, newOtherwise);
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
	public void setOtherwise(OtherwiseDefinition newOtherwise) {
		if (newOtherwise != otherwise) {
			NotificationChain msgs = null;
			if (otherwise != null)
				msgs = ((InternalEObject)otherwise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CHOICE_DEFINITION__OTHERWISE, null, msgs);
			if (newOtherwise != null)
				msgs = ((InternalEObject)newOtherwise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.CHOICE_DEFINITION__OTHERWISE, null, msgs);
			msgs = basicSetOtherwise(newOtherwise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CHOICE_DEFINITION__OTHERWISE, newOtherwise, newOtherwise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecondition(String newPrecondition) {
		String oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.CHOICE_DEFINITION__PRECONDITION, oldPrecondition, precondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.CHOICE_DEFINITION__WHEN:
				return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.CHOICE_DEFINITION__OTHERWISE:
				return basicSetOtherwise(null, msgs);
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
			case CamelSpringPackage.CHOICE_DEFINITION__WHEN:
				return getWhen();
			case CamelSpringPackage.CHOICE_DEFINITION__OTHERWISE:
				return getOtherwise();
			case CamelSpringPackage.CHOICE_DEFINITION__PRECONDITION:
				return getPrecondition();
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
			case CamelSpringPackage.CHOICE_DEFINITION__WHEN:
				getWhen().clear();
				getWhen().addAll((Collection<? extends WhenDefinition>)newValue);
				return;
			case CamelSpringPackage.CHOICE_DEFINITION__OTHERWISE:
				setOtherwise((OtherwiseDefinition)newValue);
				return;
			case CamelSpringPackage.CHOICE_DEFINITION__PRECONDITION:
				setPrecondition((String)newValue);
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
			case CamelSpringPackage.CHOICE_DEFINITION__WHEN:
				getWhen().clear();
				return;
			case CamelSpringPackage.CHOICE_DEFINITION__OTHERWISE:
				setOtherwise((OtherwiseDefinition)null);
				return;
			case CamelSpringPackage.CHOICE_DEFINITION__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
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
			case CamelSpringPackage.CHOICE_DEFINITION__WHEN:
				return when != null && !when.isEmpty();
			case CamelSpringPackage.CHOICE_DEFINITION__OTHERWISE:
				return otherwise != null;
			case CamelSpringPackage.CHOICE_DEFINITION__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
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
		result.append(" (precondition: ");
		result.append(precondition);
		result.append(')');
		return result.toString();
	}

} //ChoiceDefinitionImpl

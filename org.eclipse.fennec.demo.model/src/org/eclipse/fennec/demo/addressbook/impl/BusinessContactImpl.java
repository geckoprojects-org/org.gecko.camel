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
package org.eclipse.fennec.demo.addressbook.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.fennec.demo.addressbook.AddressBookPackage;
import org.eclipse.fennec.demo.addressbook.BusinessContact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BusinessContactImpl extends ContactImpl implements BusinessContact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressBookPackage.Literals.BUSINESS_CONTACT;
	}

} //BusinessContactImpl

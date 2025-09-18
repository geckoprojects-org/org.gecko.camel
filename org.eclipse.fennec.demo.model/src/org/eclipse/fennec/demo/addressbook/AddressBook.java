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
package org.eclipse.fennec.demo.addressbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.AddressBook#getAddressBookId <em>Address Book Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.AddressBook#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.AddressBook#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.demo.addressbook.AddressBookPackage#getAddressBook()
 * @model
 * @generated
 */
@ProviderType
public interface AddressBook extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Book Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Book Id</em>' attribute.
	 * @see #setAddressBookId(String)
	 * @see org.eclipse.fennec.demo.addressbook.AddressBookPackage#getAddressBook_AddressBookId()
	 * @model id="true"
	 * @generated
	 */
	String getAddressBookId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.demo.addressbook.AddressBook#getAddressBookId <em>Address Book Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Book Id</em>' attribute.
	 * @see #getAddressBookId()
	 * @generated
	 */
	void setAddressBookId(String value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.demo.addressbook.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see org.eclipse.fennec.demo.addressbook.AddressBookPackage#getAddressBook_Addresses()
	 * @model containment="true" keys="street city zip"
	 * @generated
	 */
	EList<Address> getAddresses();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.demo.addressbook.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see org.eclipse.fennec.demo.addressbook.AddressBookPackage#getAddressBook_Persons()
	 * @model containment="true" keys="firstName lastName birthDate"
	 * @generated
	 */
	EList<Person> getPersons();

} // AddressBook

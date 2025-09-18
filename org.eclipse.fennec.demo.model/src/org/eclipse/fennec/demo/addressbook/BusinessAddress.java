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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.BusinessAddress#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.BusinessAddress#getBuilding <em>Building</em>}</li>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.BusinessAddress#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.BusinessAddress#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.demo.addressbook.AddressBookPackage#getBusinessAddress()
 * @model
 * @generated
 */
@ProviderType
public interface BusinessAddress extends Address {
	/**
	 * Returns the value of the '<em><b>Responsible Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Person</em>' attribute.
	 * @see #setResponsiblePerson(String)
	 * @see org.eclipse.fennec.demo.addressbook.AddressBookPackage#getBusinessAddress_ResponsiblePerson()
	 * @model
	 * @generated
	 */
	String getResponsiblePerson();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.demo.addressbook.BusinessAddress#getResponsiblePerson <em>Responsible Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Person</em>' attribute.
	 * @see #getResponsiblePerson()
	 * @generated
	 */
	void setResponsiblePerson(String value);

	/**
	 * Returns the value of the '<em><b>Building</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building</em>' attribute.
	 * @see #setBuilding(String)
	 * @see org.eclipse.fennec.demo.addressbook.AddressBookPackage#getBusinessAddress_Building()
	 * @model
	 * @generated
	 */
	String getBuilding();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.demo.addressbook.BusinessAddress#getBuilding <em>Building</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building</em>' attribute.
	 * @see #getBuilding()
	 * @generated
	 */
	void setBuilding(String value);

	/**
	 * Returns the value of the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name</em>' attribute.
	 * @see #setCompanyName(String)
	 * @see org.eclipse.fennec.demo.addressbook.AddressBookPackage#getBusinessAddress_CompanyName()
	 * @model required="true"
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.demo.addressbook.BusinessAddress#getCompanyName <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name</em>' attribute.
	 * @see #getCompanyName()
	 * @generated
	 */
	void setCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.demo.addressbook.Person}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.fennec.demo.addressbook.Person#getBusinessAddress <em>Business Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' reference list.
	 * @see org.eclipse.fennec.demo.addressbook.AddressBookPackage#getBusinessAddress_Employees()
	 * @see org.eclipse.fennec.demo.addressbook.Person#getBusinessAddress
	 * @model opposite="businessAddress" keys="firstName lastName birthDate"
	 * @generated
	 */
	EList<Person> getEmployees();

} // BusinessAddress

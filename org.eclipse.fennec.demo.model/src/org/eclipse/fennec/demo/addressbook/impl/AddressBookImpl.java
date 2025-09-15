/*
 */
package org.eclipse.fennec.demo.addressbook.impl;

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

import org.eclipse.fennec.demo.addressbook.Address;
import org.eclipse.fennec.demo.addressbook.AddressBook;
import org.eclipse.fennec.demo.addressbook.AddressbookPackage;
import org.eclipse.fennec.demo.addressbook.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.impl.AddressBookImpl#getAddressBookId <em>Address Book Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.impl.AddressBookImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.impl.AddressBookImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressBookImpl extends MinimalEObjectImpl.Container implements AddressBook {
	/**
	 * The default value of the '{@link #getAddressBookId() <em>Address Book Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressBookId()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_BOOK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressBookId() <em>Address Book Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressBookId()
	 * @generated
	 * @ordered
	 */
	protected String addressBookId = ADDRESS_BOOK_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressBookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressbookPackage.Literals.ADDRESS_BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddressBookId() {
		return addressBookId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressBookId(String newAddressBookId) {
		String oldAddressBookId = addressBookId;
		addressBookId = newAddressBookId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressbookPackage.ADDRESS_BOOK__ADDRESS_BOOK_ID, oldAddressBookId, addressBookId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Address>(Address.class, this, AddressbookPackage.ADDRESS_BOOK__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, AddressbookPackage.ADDRESS_BOOK__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddressbookPackage.ADDRESS_BOOK__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
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
			case AddressbookPackage.ADDRESS_BOOK__ADDRESS_BOOK_ID:
				return getAddressBookId();
			case AddressbookPackage.ADDRESS_BOOK__ADDRESSES:
				return getAddresses();
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				return getPersons();
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
			case AddressbookPackage.ADDRESS_BOOK__ADDRESS_BOOK_ID:
				setAddressBookId((String)newValue);
				return;
			case AddressbookPackage.ADDRESS_BOOK__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
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
			case AddressbookPackage.ADDRESS_BOOK__ADDRESS_BOOK_ID:
				setAddressBookId(ADDRESS_BOOK_ID_EDEFAULT);
				return;
			case AddressbookPackage.ADDRESS_BOOK__ADDRESSES:
				getAddresses().clear();
				return;
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				getPersons().clear();
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
			case AddressbookPackage.ADDRESS_BOOK__ADDRESS_BOOK_ID:
				return ADDRESS_BOOK_ID_EDEFAULT == null ? addressBookId != null : !ADDRESS_BOOK_ID_EDEFAULT.equals(addressBookId);
			case AddressbookPackage.ADDRESS_BOOK__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case AddressbookPackage.ADDRESS_BOOK__PERSONS:
				return persons != null && !persons.isEmpty();
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
		result.append(" (addressBookId: ");
		result.append(addressBookId);
		result.append(')');
		return result.toString();
	}

} //AddressBookImpl

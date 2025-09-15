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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.demo.addressbook.AddressbookPackage;
import org.eclipse.fennec.demo.addressbook.BusinessAddress;
import org.eclipse.fennec.demo.addressbook.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.impl.BusinessAddressImpl#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.impl.BusinessAddressImpl#getBuilding <em>Building</em>}</li>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.impl.BusinessAddressImpl#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.demo.addressbook.impl.BusinessAddressImpl#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessAddressImpl extends AddressImpl implements BusinessAddress {
	/**
	 * The default value of the '{@link #getResponsiblePerson() <em>Responsible Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePerson()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBLE_PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsiblePerson() <em>Responsible Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePerson()
	 * @generated
	 * @ordered
	 */
	protected String responsiblePerson = RESPONSIBLE_PERSON_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuilding() <em>Building</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilding()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuilding() <em>Building</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilding()
	 * @generated
	 * @ordered
	 */
	protected String building = BUILDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String companyName = COMPANY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> employees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressbookPackage.Literals.BUSINESS_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponsiblePerson() {
		return responsiblePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsiblePerson(String newResponsiblePerson) {
		String oldResponsiblePerson = responsiblePerson;
		responsiblePerson = newResponsiblePerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressbookPackage.BUSINESS_ADDRESS__RESPONSIBLE_PERSON, oldResponsiblePerson, responsiblePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuilding() {
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuilding(String newBuilding) {
		String oldBuilding = building;
		building = newBuilding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressbookPackage.BUSINESS_ADDRESS__BUILDING, oldBuilding, building));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompanyName(String newCompanyName) {
		String oldCompanyName = companyName;
		companyName = newCompanyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressbookPackage.BUSINESS_ADDRESS__COMPANY_NAME, oldCompanyName, companyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getEmployees() {
		if (employees == null) {
			employees = new EObjectWithInverseResolvingEList<Person>(Person.class, this, AddressbookPackage.BUSINESS_ADDRESS__EMPLOYEES, AddressbookPackage.PERSON__BUSINESS_ADDRESS);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddressbookPackage.BUSINESS_ADDRESS__EMPLOYEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmployees()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddressbookPackage.BUSINESS_ADDRESS__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
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
			case AddressbookPackage.BUSINESS_ADDRESS__RESPONSIBLE_PERSON:
				return getResponsiblePerson();
			case AddressbookPackage.BUSINESS_ADDRESS__BUILDING:
				return getBuilding();
			case AddressbookPackage.BUSINESS_ADDRESS__COMPANY_NAME:
				return getCompanyName();
			case AddressbookPackage.BUSINESS_ADDRESS__EMPLOYEES:
				return getEmployees();
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
			case AddressbookPackage.BUSINESS_ADDRESS__RESPONSIBLE_PERSON:
				setResponsiblePerson((String)newValue);
				return;
			case AddressbookPackage.BUSINESS_ADDRESS__BUILDING:
				setBuilding((String)newValue);
				return;
			case AddressbookPackage.BUSINESS_ADDRESS__COMPANY_NAME:
				setCompanyName((String)newValue);
				return;
			case AddressbookPackage.BUSINESS_ADDRESS__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Person>)newValue);
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
			case AddressbookPackage.BUSINESS_ADDRESS__RESPONSIBLE_PERSON:
				setResponsiblePerson(RESPONSIBLE_PERSON_EDEFAULT);
				return;
			case AddressbookPackage.BUSINESS_ADDRESS__BUILDING:
				setBuilding(BUILDING_EDEFAULT);
				return;
			case AddressbookPackage.BUSINESS_ADDRESS__COMPANY_NAME:
				setCompanyName(COMPANY_NAME_EDEFAULT);
				return;
			case AddressbookPackage.BUSINESS_ADDRESS__EMPLOYEES:
				getEmployees().clear();
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
			case AddressbookPackage.BUSINESS_ADDRESS__RESPONSIBLE_PERSON:
				return RESPONSIBLE_PERSON_EDEFAULT == null ? responsiblePerson != null : !RESPONSIBLE_PERSON_EDEFAULT.equals(responsiblePerson);
			case AddressbookPackage.BUSINESS_ADDRESS__BUILDING:
				return BUILDING_EDEFAULT == null ? building != null : !BUILDING_EDEFAULT.equals(building);
			case AddressbookPackage.BUSINESS_ADDRESS__COMPANY_NAME:
				return COMPANY_NAME_EDEFAULT == null ? companyName != null : !COMPANY_NAME_EDEFAULT.equals(companyName);
			case AddressbookPackage.BUSINESS_ADDRESS__EMPLOYEES:
				return employees != null && !employees.isEmpty();
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
		result.append(" (responsiblePerson: ");
		result.append(responsiblePerson);
		result.append(", building: ");
		result.append(building);
		result.append(", companyName: ");
		result.append(companyName);
		result.append(')');
		return result.toString();
	}

} //BusinessAddressImpl

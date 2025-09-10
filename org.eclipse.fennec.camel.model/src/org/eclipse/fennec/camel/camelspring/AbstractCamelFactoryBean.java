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
package org.eclipse.fennec.camel.camelspring;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Camel Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelFactoryBean#getCamelContextId <em>Camel Context Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractCamelFactoryBean' kind='empty'"
 * @generated
 */
@ProviderType
public interface AbstractCamelFactoryBean extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Camel Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Id of CamelContext to use if there are multiple CamelContexts in the same JVM.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camel Context Id</em>' attribute.
	 * @see #setCamelContextId(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelFactoryBean_CamelContextId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='camelContextId'"
	 * @generated
	 */
	String getCamelContextId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelFactoryBean#getCamelContextId <em>Camel Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camel Context Id</em>' attribute.
	 * @see #getCamelContextId()
	 * @generated
	 */
	void setCamelContextId(String value);

} // AbstractCamelFactoryBean

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
 * A representation of the model object '<em><b>Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ProcessDefinition#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getProcessDefinition()
 * @model extendedMetaData="name='processDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface ProcessDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reference to the Processor to lookup in the registry to use. A Processor is a class of type org.apache.camel.Processor,
	 * which can are to be called by this EIP. In this processor you have custom Java code, that can work with the message,
	 * such as to do custom business logic, special message manipulations and so on. By default, the ref, will lookup the bean
	 * in the Camel registry. The ref can use prefix that controls how the processor is obtained. You can use #bean:myBean
	 * where myBean is the id of the Camel processor (lookup). Can also be used for creating new beans by their class name by
	 * prefixing with #class, eg #class:com.foo.MyClassType. And it is also possible to refer to singleton beans by their type
	 * in the registry by prefixing with #type: syntax, eg #type:com.foo.MyClassType.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getProcessDefinition_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ProcessDefinition#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // ProcessDefinition

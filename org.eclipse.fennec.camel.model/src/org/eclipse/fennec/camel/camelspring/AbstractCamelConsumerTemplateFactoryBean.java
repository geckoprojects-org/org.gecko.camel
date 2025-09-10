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
 * A representation of the model object '<em><b>Abstract Camel Consumer Template Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.AbstractCamelConsumerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelConsumerTemplateFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractCamelConsumerTemplateFactoryBean' kind='empty'"
 * @generated
 */
@ProviderType
public interface AbstractCamelConsumerTemplateFactoryBean extends AbstractCamelFactoryBean {
	/**
	 * Returns the value of the '<em><b>Maximum Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a custom maximum cache size to use in the backing cache pools.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Cache Size</em>' attribute.
	 * @see #isSetMaximumCacheSize()
	 * @see #unsetMaximumCacheSize()
	 * @see #setMaximumCacheSize(int)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getAbstractCamelConsumerTemplateFactoryBean_MaximumCacheSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='maximumCacheSize'"
	 * @generated
	 */
	int getMaximumCacheSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelConsumerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Cache Size</em>' attribute.
	 * @see #isSetMaximumCacheSize()
	 * @see #unsetMaximumCacheSize()
	 * @see #getMaximumCacheSize()
	 * @generated
	 */
	void setMaximumCacheSize(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelConsumerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumCacheSize()
	 * @see #getMaximumCacheSize()
	 * @see #setMaximumCacheSize(int)
	 * @generated
	 */
	void unsetMaximumCacheSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelConsumerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Cache Size</em>' attribute is set.
	 * @see #unsetMaximumCacheSize()
	 * @see #getMaximumCacheSize()
	 * @see #setMaximumCacheSize(int)
	 * @generated
	 */
	boolean isSetMaximumCacheSize();

} // AbstractCamelConsumerTemplateFactoryBean

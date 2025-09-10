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
 * A representation of the model object '<em><b>Batch Resequencer Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig#getAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig#getBatchTimeout <em>Batch Timeout</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig#getIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig#getReverse <em>Reverse</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBatchResequencerConfig()
 * @model extendedMetaData="name='batchResequencerConfig' kind='empty'"
 * @generated
 */
@ProviderType
public interface BatchResequencerConfig extends ResequencerConfig {
	/**
	 * Returns the value of the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to allow duplicates. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #setAllowDuplicates(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBatchResequencerConfig_AllowDuplicates()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allowDuplicates'"
	 * @generated
	 */
	String getAllowDuplicates();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig#getAllowDuplicates <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #getAllowDuplicates()
	 * @generated
	 */
	void setAllowDuplicates(String value);

	/**
	 * Returns the value of the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the size of the batch to be re-ordered. The default size is 100. Default value: 100
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch Size</em>' attribute.
	 * @see #setBatchSize(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBatchResequencerConfig_BatchSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='batchSize'"
	 * @generated
	 */
	String getBatchSize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig#getBatchSize <em>Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Size</em>' attribute.
	 * @see #getBatchSize()
	 * @generated
	 */
	void setBatchSize(String value);

	/**
	 * Returns the value of the '<em><b>Batch Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the timeout for collecting elements to be re-ordered. The default timeout is 1000 msec. Default value: 1000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch Timeout</em>' attribute.
	 * @see #setBatchTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBatchResequencerConfig_BatchTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='batchTimeout'"
	 * @generated
	 */
	String getBatchTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig#getBatchTimeout <em>Batch Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Timeout</em>' attribute.
	 * @see #getBatchTimeout()
	 * @generated
	 */
	void setBatchTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Invalid Exchanges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to ignore invalid exchanges. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Invalid Exchanges</em>' attribute.
	 * @see #setIgnoreInvalidExchanges(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBatchResequencerConfig_IgnoreInvalidExchanges()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreInvalidExchanges'"
	 * @generated
	 */
	String getIgnoreInvalidExchanges();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig#getIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Invalid Exchanges</em>' attribute.
	 * @see #getIgnoreInvalidExchanges()
	 * @generated
	 */
	void setIgnoreInvalidExchanges(String value);

	/**
	 * Returns the value of the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether to reverse the ordering. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reverse</em>' attribute.
	 * @see #setReverse(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getBatchResequencerConfig_Reverse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='reverse'"
	 * @generated
	 */
	String getReverse();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig#getReverse <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse</em>' attribute.
	 * @see #getReverse()
	 * @generated
	 */
	void setReverse(String value);

} // BatchResequencerConfig

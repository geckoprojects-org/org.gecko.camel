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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimistic Lock Retry Policy Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition#getExponentialBackOff <em>Exponential Back Off</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition#getMaximumRetries <em>Maximum Retries</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition#getMaximumRetryDelay <em>Maximum Retry Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition#getRandomBackOff <em>Random Back Off</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition#getRetryDelay <em>Retry Delay</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOptimisticLockRetryPolicyDefinition()
 * @model extendedMetaData="name='optimisticLockRetryPolicyDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface OptimisticLockRetryPolicyDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Exponential Back Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enable exponential backoff. Default value: true
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exponential Back Off</em>' attribute.
	 * @see #setExponentialBackOff(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOptimisticLockRetryPolicyDefinition_ExponentialBackOff()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exponentialBackOff'"
	 * @generated
	 */
	String getExponentialBackOff();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition#getExponentialBackOff <em>Exponential Back Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponential Back Off</em>' attribute.
	 * @see #getExponentialBackOff()
	 * @generated
	 */
	void setExponentialBackOff(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the maximum number of retries.
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Retries</em>' attribute.
	 * @see #setMaximumRetries(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOptimisticLockRetryPolicyDefinition_MaximumRetries()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maximumRetries'"
	 * @generated
	 */
	String getMaximumRetries();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition#getMaximumRetries <em>Maximum Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Retries</em>' attribute.
	 * @see #getMaximumRetries()
	 * @generated
	 */
	void setMaximumRetries(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the upper value of retry in millis between retries, when using exponential or random backoff. Default value: 1000
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Retry Delay</em>' attribute.
	 * @see #setMaximumRetryDelay(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOptimisticLockRetryPolicyDefinition_MaximumRetryDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maximumRetryDelay'"
	 * @generated
	 */
	String getMaximumRetryDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition#getMaximumRetryDelay <em>Maximum Retry Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Retry Delay</em>' attribute.
	 * @see #getMaximumRetryDelay()
	 * @generated
	 */
	void setMaximumRetryDelay(String value);

	/**
	 * Returns the value of the '<em><b>Random Back Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enables random backoff. Default value: false
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Random Back Off</em>' attribute.
	 * @see #setRandomBackOff(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOptimisticLockRetryPolicyDefinition_RandomBackOff()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='randomBackOff'"
	 * @generated
	 */
	String getRandomBackOff();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition#getRandomBackOff <em>Random Back Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random Back Off</em>' attribute.
	 * @see #getRandomBackOff()
	 * @generated
	 */
	void setRandomBackOff(String value);

	/**
	 * Returns the value of the '<em><b>Retry Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the delay in millis between retries. Default value: 50
	 * 
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Delay</em>' attribute.
	 * @see #setRetryDelay(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getOptimisticLockRetryPolicyDefinition_RetryDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='retryDelay'"
	 * @generated
	 */
	String getRetryDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition#getRetryDelay <em>Retry Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Delay</em>' attribute.
	 * @see #getRetryDelay()
	 * @generated
	 */
	void setRetryDelay(String value);

} // OptimisticLockRetryPolicyDefinition

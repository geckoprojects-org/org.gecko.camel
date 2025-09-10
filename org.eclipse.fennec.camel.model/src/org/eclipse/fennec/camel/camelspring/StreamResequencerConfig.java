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
 * A representation of the model object '<em><b>Stream Resequencer Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getDeliveryAttemptInterval <em>Delivery Attempt Interval</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getRejectOld <em>Reject Old</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStreamResequencerConfig()
 * @model extendedMetaData="name='streamResequencerConfig' kind='empty'"
 * @generated
 */
@ProviderType
public interface StreamResequencerConfig extends ResequencerConfig {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the capacity of the resequencer inbound queue. Default value: 1000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStreamResequencerConfig_Capacity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='capacity'"
	 * @generated
	 */
	String getCapacity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(String value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom comparator as a org.apache.camel.processor.resequencer.ExpressionResultComparator type.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see #setComparator(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStreamResequencerConfig_Comparator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comparator'"
	 * @generated
	 */
	String getComparator();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(String value);

	/**
	 * Returns the value of the '<em><b>Delivery Attempt Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the interval in milliseconds the stream resequencer will at most wait while waiting for condition of being able to
	 * deliver. Default value: 1000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Attempt Interval</em>' attribute.
	 * @see #setDeliveryAttemptInterval(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStreamResequencerConfig_DeliveryAttemptInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deliveryAttemptInterval'"
	 * @generated
	 */
	String getDeliveryAttemptInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getDeliveryAttemptInterval <em>Delivery Attempt Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Attempt Interval</em>' attribute.
	 * @see #getDeliveryAttemptInterval()
	 * @generated
	 */
	void setDeliveryAttemptInterval(String value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStreamResequencerConfig_IgnoreInvalidExchanges()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ignoreInvalidExchanges'"
	 * @generated
	 */
	String getIgnoreInvalidExchanges();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getIgnoreInvalidExchanges <em>Ignore Invalid Exchanges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Invalid Exchanges</em>' attribute.
	 * @see #getIgnoreInvalidExchanges()
	 * @generated
	 */
	void setIgnoreInvalidExchanges(String value);

	/**
	 * Returns the value of the '<em><b>Reject Old</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * If true, throws an exception when messages older than the last delivered message are processed. Default value: false
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reject Old</em>' attribute.
	 * @see #setRejectOld(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStreamResequencerConfig_RejectOld()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rejectOld'"
	 * @generated
	 */
	String getRejectOld();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getRejectOld <em>Reject Old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reject Old</em>' attribute.
	 * @see #getRejectOld()
	 * @generated
	 */
	void setRejectOld(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets minimum time (milliseconds) to wait for missing elements (messages). Default value: 1000
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getStreamResequencerConfig_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

} // StreamResequencerConfig

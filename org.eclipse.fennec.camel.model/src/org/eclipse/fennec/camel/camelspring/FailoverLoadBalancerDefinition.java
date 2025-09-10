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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failover Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#getException <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#isInheritErrorHandler <em>Inherit Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#getMaximumFailoverAttempts <em>Maximum Failover Attempts</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#getRoundRobin <em>Round Robin</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#getSticky <em>Sticky</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFailoverLoadBalancerDefinition()
 * @model extendedMetaData="name='failoverLoadBalancerDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FailoverLoadBalancerDefinition extends LoadBalancerDefinition {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A list of class names for specific exceptions to monitor. If no exceptions are configured then all exceptions are
	 * monitored.
	 * 
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFailoverLoadBalancerDefinition_Exception()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='exception' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getException();

	/**
	 * Returns the value of the '<em><b>Inherit Error Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To turn off Camel error handling during load balancing. By default, Camel error handler will attempt calling a service,
	 * which means you can specify retires and other fine-grained settings. And only when Camel error handler have failed all
	 * attempts, then this load balancer will fail over to the next endpoint and try again. You can turn this off, and then
	 * this load balancer will fail over immediately on an error. Default value: true
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherit Error Handler</em>' attribute.
	 * @see #isSetInheritErrorHandler()
	 * @see #unsetInheritErrorHandler()
	 * @see #setInheritErrorHandler(boolean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFailoverLoadBalancerDefinition_InheritErrorHandler()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='inheritErrorHandler'"
	 * @generated
	 */
	boolean isInheritErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#isInheritErrorHandler <em>Inherit Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit Error Handler</em>' attribute.
	 * @see #isSetInheritErrorHandler()
	 * @see #unsetInheritErrorHandler()
	 * @see #isInheritErrorHandler()
	 * @generated
	 */
	void setInheritErrorHandler(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#isInheritErrorHandler <em>Inherit Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInheritErrorHandler()
	 * @see #isInheritErrorHandler()
	 * @see #setInheritErrorHandler(boolean)
	 * @generated
	 */
	void unsetInheritErrorHandler();

	/**
	 * Returns whether the value of the '{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#isInheritErrorHandler <em>Inherit Error Handler</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inherit Error Handler</em>' attribute is set.
	 * @see #unsetInheritErrorHandler()
	 * @see #isInheritErrorHandler()
	 * @see #setInheritErrorHandler(boolean)
	 * @generated
	 */
	boolean isSetInheritErrorHandler();

	/**
	 * Returns the value of the '<em><b>Maximum Failover Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A value to indicate after X failover attempts we should exhaust (give up). Use -1 to indicate never give up and
	 * continuously try to failover. Use 0 to never failover. And use e.g. 3 to failover at most 3 times before giving up. This
	 * option can be used whether roundRobin is enabled or not. Default value: -1
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Failover Attempts</em>' attribute.
	 * @see #setMaximumFailoverAttempts(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFailoverLoadBalancerDefinition_MaximumFailoverAttempts()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maximumFailoverAttempts'"
	 * @generated
	 */
	String getMaximumFailoverAttempts();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#getMaximumFailoverAttempts <em>Maximum Failover Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Failover Attempts</em>' attribute.
	 * @see #getMaximumFailoverAttempts()
	 * @generated
	 */
	void setMaximumFailoverAttempts(String value);

	/**
	 * Returns the value of the '<em><b>Round Robin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not the failover load balancer should operate in round robin mode or not. If not, then it will always start
	 * from the first endpoint when a new message is to be processed. In other words it restart from the top for every message.
	 * If round robin is enabled, then it keeps state and will continue with the next endpoint in a round robin fashion. You
	 * can also enable sticky mode together with round robin, if so then it will pick the last known good endpoint to use when
	 * starting the load balancing (instead of using the next when starting).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Round Robin</em>' attribute.
	 * @see #setRoundRobin(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFailoverLoadBalancerDefinition_RoundRobin()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='roundRobin'"
	 * @generated
	 */
	String getRoundRobin();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#getRoundRobin <em>Round Robin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Robin</em>' attribute.
	 * @see #getRoundRobin()
	 * @generated
	 */
	void setRoundRobin(String value);

	/**
	 * Returns the value of the '<em><b>Sticky</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Whether or not the failover load balancer should operate in sticky mode or not. If not, then it will always start from
	 * the first endpoint when a new message is to be processed. In other words it restart from the top for every message. If
	 * sticky is enabled, then it keeps state and will continue with the last known good endpoint. You can also enable sticky
	 * mode together with round robin, if so then it will pick the last known good endpoint to use when starting the load
	 * balancing (instead of using the next when starting).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sticky</em>' attribute.
	 * @see #setSticky(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getFailoverLoadBalancerDefinition_Sticky()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sticky'"
	 * @generated
	 */
	String getSticky();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition#getSticky <em>Sticky</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sticky</em>' attribute.
	 * @see #getSticky()
	 * @generated
	 */
	void setSticky(String value);

} // FailoverLoadBalancerDefinition

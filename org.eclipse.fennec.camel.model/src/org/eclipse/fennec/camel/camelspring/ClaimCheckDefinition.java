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
 * A representation of the model object '<em><b>Claim Check Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition#getAggregationStrategy <em>Aggregation Strategy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getClaimCheckDefinition()
 * @model extendedMetaData="name='claimCheckDefinition' kind='empty'"
 * @generated
 */
@ProviderType
public interface ClaimCheckDefinition extends NoOutputDefinition {
	/**
	 * Returns the value of the '<em><b>Aggregation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom AggregationStrategy instead of the default implementation. Notice you cannot use both custom aggregation
	 * strategy and configure data at the same time.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Strategy</em>' attribute.
	 * @see #setAggregationStrategy(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getClaimCheckDefinition_AggregationStrategy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategy'"
	 * @generated
	 */
	String getAggregationStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition#getAggregationStrategy <em>Aggregation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Strategy</em>' attribute.
	 * @see #getAggregationStrategy()
	 * @generated
	 */
	void setAggregationStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Strategy Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * This option can be used to explicit declare the method name to use, when using POJOs as the AggregationStrategy.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Strategy Method Name</em>' attribute.
	 * @see #setAggregationStrategyMethodName(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getClaimCheckDefinition_AggregationStrategyMethodName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aggregationStrategyMethodName'"
	 * @generated
	 */
	String getAggregationStrategyMethodName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition#getAggregationStrategyMethodName <em>Aggregation Strategy Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Strategy Method Name</em>' attribute.
	 * @see #getAggregationStrategyMethodName()
	 * @generated
	 */
	void setAggregationStrategyMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Specify a filter to control what data gets merged data back from the claim check repository. The following syntax is
	 * supported: body - to aggregate the message body attachments - to aggregate all the message attachments headers - to
	 * aggregate all the message headers header:pattern - to aggregate all the message headers that matches the pattern. The
	 * following pattern rules are applied in this order: exact match, returns true wildcard match (pattern ends with a and the
	 * name starts with the pattern), returns true regular expression match, returns true otherwise returns false You can
	 * specify multiple rules separated by comma. For example, the following includes the message body and all headers starting
	 * with foo: body,header:foo. The syntax supports the following prefixes which can be used to specify include,exclude, or
	 * remove - to include (which is the default mode) - - to exclude (exclude takes precedence over include) -- - to remove
	 * (remove takes precedence) For example to exclude a header name foo, and remove all headers starting with bar,
	 * -header:foo,--headers:bar Note you cannot have both include and exclude header:pattern at the same time.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getClaimCheckDefinition_Filter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='filter'"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a specific key for claim check id (for dynamic keys use simple language syntax as the key).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getClaimCheckDefinition_Key()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='key'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The claim check operation to use. The following operations are supported: Get - Gets (does not remove) the claim check
	 * by the given key. GetAndRemove - Gets and removes the claim check by the given key. Set - Sets a new (will override if
	 * key already exists) claim check with the given key. Push - Sets a new claim check on the stack (does not use key). Pop -
	 * Gets the latest claim check from the stack (does not use key).
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getClaimCheckDefinition_Operation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='operation'"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

} // ClaimCheckDefinition

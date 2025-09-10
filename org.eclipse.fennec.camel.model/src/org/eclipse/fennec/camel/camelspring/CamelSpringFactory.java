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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage
 * @generated
 */
@ProviderType
public interface CamelSpringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CamelSpringFactory eINSTANCE = org.eclipse.fennec.camel.camelspring.impl.CamelSpringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aggregate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Definition</em>'.
	 * @generated
	 */
	AggregateDefinition createAggregateDefinition();

	/**
	 * Returns a new object of class '<em>Allowable Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allowable Values Type</em>'.
	 * @generated
	 */
	AllowableValuesType createAllowableValuesType();

	/**
	 * Returns a new object of class '<em>Allowable Values Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allowable Values Type1</em>'.
	 * @generated
	 */
	AllowableValuesType1 createAllowableValuesType1();

	/**
	 * Returns a new object of class '<em>Api Key Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Api Key Definition</em>'.
	 * @generated
	 */
	ApiKeyDefinition createApiKeyDefinition();

	/**
	 * Returns a new object of class '<em>Application Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Definition</em>'.
	 * @generated
	 */
	ApplicationDefinition createApplicationDefinition();

	/**
	 * Returns a new object of class '<em>Asn1 Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asn1 Data Format</em>'.
	 * @generated
	 */
	Asn1DataFormat createAsn1DataFormat();

	/**
	 * Returns a new object of class '<em>Avro Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avro Data Format</em>'.
	 * @generated
	 */
	AvroDataFormat createAvroDataFormat();

	/**
	 * Returns a new object of class '<em>Barcode Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Barcode Data Format</em>'.
	 * @generated
	 */
	BarcodeDataFormat createBarcodeDataFormat();

	/**
	 * Returns a new object of class '<em>Base64 Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base64 Data Format</em>'.
	 * @generated
	 */
	Base64DataFormat createBase64DataFormat();

	/**
	 * Returns a new object of class '<em>Basic Auth Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Auth Definition</em>'.
	 * @generated
	 */
	BasicAuthDefinition createBasicAuthDefinition();

	/**
	 * Returns a new object of class '<em>Batch Resequencer Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Batch Resequencer Config</em>'.
	 * @generated
	 */
	BatchResequencerConfig createBatchResequencerConfig();

	/**
	 * Returns a new object of class '<em>Bean Constructor Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean Constructor Definition</em>'.
	 * @generated
	 */
	BeanConstructorDefinition createBeanConstructorDefinition();

	/**
	 * Returns a new object of class '<em>Bean Constructors Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean Constructors Definition</em>'.
	 * @generated
	 */
	BeanConstructorsDefinition createBeanConstructorsDefinition();

	/**
	 * Returns a new object of class '<em>Bean Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean Definition</em>'.
	 * @generated
	 */
	BeanDefinition createBeanDefinition();

	/**
	 * Returns a new object of class '<em>Bean Factory Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean Factory Definition</em>'.
	 * @generated
	 */
	BeanFactoryDefinition createBeanFactoryDefinition();

	/**
	 * Returns a new object of class '<em>Beanio Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Beanio Data Format</em>'.
	 * @generated
	 */
	BeanioDataFormat createBeanioDataFormat();

	/**
	 * Returns a new object of class '<em>Bean Properties Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean Properties Definition</em>'.
	 * @generated
	 */
	BeanPropertiesDefinition createBeanPropertiesDefinition();

	/**
	 * Returns a new object of class '<em>Bean Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean Property Definition</em>'.
	 * @generated
	 */
	BeanPropertyDefinition createBeanPropertyDefinition();

	/**
	 * Returns a new object of class '<em>Beans Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Beans Definition</em>'.
	 * @generated
	 */
	BeansDefinition createBeansDefinition();

	/**
	 * Returns a new object of class '<em>Bearer Token Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bearer Token Definition</em>'.
	 * @generated
	 */
	BearerTokenDefinition createBearerTokenDefinition();

	/**
	 * Returns a new object of class '<em>Bindy Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bindy Data Format</em>'.
	 * @generated
	 */
	BindyDataFormat createBindyDataFormat();

	/**
	 * Returns a new object of class '<em>Blacklist Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blacklist Service Call Service Filter Configuration</em>'.
	 * @generated
	 */
	BlacklistServiceCallServiceFilterConfiguration createBlacklistServiceCallServiceFilterConfiguration();

	/**
	 * Returns a new object of class '<em>Caching Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caching Service Call Service Discovery Configuration</em>'.
	 * @generated
	 */
	CachingServiceCallServiceDiscoveryConfiguration createCachingServiceCallServiceDiscoveryConfiguration();

	/**
	 * Returns a new object of class '<em>Camel Bean Post Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Bean Post Processor</em>'.
	 * @generated
	 */
	CamelBeanPostProcessor createCamelBeanPostProcessor();

	/**
	 * Returns a new object of class '<em>Camel Consumer Template Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Consumer Template Factory Bean</em>'.
	 * @generated
	 */
	CamelConsumerTemplateFactoryBean createCamelConsumerTemplateFactoryBean();

	/**
	 * Returns a new object of class '<em>Camel Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Context Factory Bean</em>'.
	 * @generated
	 */
	CamelContextFactoryBean createCamelContextFactoryBean();

	/**
	 * Returns a new object of class '<em>Camel Endpoint Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Endpoint Factory Bean</em>'.
	 * @generated
	 */
	CamelEndpointFactoryBean createCamelEndpointFactoryBean();

	/**
	 * Returns a new object of class '<em>Camel Fluent Producer Template Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Fluent Producer Template Factory Bean</em>'.
	 * @generated
	 */
	CamelFluentProducerTemplateFactoryBean createCamelFluentProducerTemplateFactoryBean();

	/**
	 * Returns a new object of class '<em>Camel JMX Agent Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel JMX Agent Definition</em>'.
	 * @generated
	 */
	CamelJMXAgentDefinition createCamelJMXAgentDefinition();

	/**
	 * Returns a new object of class '<em>Camel Producer Template Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Producer Template Factory Bean</em>'.
	 * @generated
	 */
	CamelProducerTemplateFactoryBean createCamelProducerTemplateFactoryBean();

	/**
	 * Returns a new object of class '<em>Camel Property Placeholder Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Property Placeholder Definition</em>'.
	 * @generated
	 */
	CamelPropertyPlaceholderDefinition createCamelPropertyPlaceholderDefinition();

	/**
	 * Returns a new object of class '<em>Camel Property Placeholder Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Property Placeholder Function Definition</em>'.
	 * @generated
	 */
	CamelPropertyPlaceholderFunctionDefinition createCamelPropertyPlaceholderFunctionDefinition();

	/**
	 * Returns a new object of class '<em>Camel Property Placeholder Location Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Property Placeholder Location Definition</em>'.
	 * @generated
	 */
	CamelPropertyPlaceholderLocationDefinition createCamelPropertyPlaceholderLocationDefinition();

	/**
	 * Returns a new object of class '<em>Camel Redelivery Policy Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Redelivery Policy Factory Bean</em>'.
	 * @generated
	 */
	CamelRedeliveryPolicyFactoryBean createCamelRedeliveryPolicyFactoryBean();

	/**
	 * Returns a new object of class '<em>Camel Rest Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Rest Context Factory Bean</em>'.
	 * @generated
	 */
	CamelRestContextFactoryBean createCamelRestContextFactoryBean();

	/**
	 * Returns a new object of class '<em>Camel Route Configuration Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Route Configuration Context Factory Bean</em>'.
	 * @generated
	 */
	CamelRouteConfigurationContextFactoryBean createCamelRouteConfigurationContextFactoryBean();

	/**
	 * Returns a new object of class '<em>Camel Route Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Route Context Factory Bean</em>'.
	 * @generated
	 */
	CamelRouteContextFactoryBean createCamelRouteContextFactoryBean();

	/**
	 * Returns a new object of class '<em>Camel Route Controller Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Route Controller Definition</em>'.
	 * @generated
	 */
	CamelRouteControllerDefinition createCamelRouteControllerDefinition();

	/**
	 * Returns a new object of class '<em>Camel Route Template Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Route Template Context Factory Bean</em>'.
	 * @generated
	 */
	CamelRouteTemplateContextFactoryBean createCamelRouteTemplateContextFactoryBean();

	/**
	 * Returns a new object of class '<em>Camel Stream Caching Strategy Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Stream Caching Strategy Definition</em>'.
	 * @generated
	 */
	CamelStreamCachingStrategyDefinition createCamelStreamCachingStrategyDefinition();

	/**
	 * Returns a new object of class '<em>Camel Thread Pool Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camel Thread Pool Factory Bean</em>'.
	 * @generated
	 */
	CamelThreadPoolFactoryBean createCamelThreadPoolFactoryBean();

	/**
	 * Returns a new object of class '<em>Catch Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catch Definition</em>'.
	 * @generated
	 */
	CatchDefinition createCatchDefinition();

	/**
	 * Returns a new object of class '<em>Cbor Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cbor Data Format</em>'.
	 * @generated
	 */
	CborDataFormat createCborDataFormat();

	/**
	 * Returns a new object of class '<em>Choice Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Definition</em>'.
	 * @generated
	 */
	ChoiceDefinition createChoiceDefinition();

	/**
	 * Returns a new object of class '<em>Cipher Suites Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cipher Suites Parameters</em>'.
	 * @generated
	 */
	CipherSuitesParameters createCipherSuitesParameters();

	/**
	 * Returns a new object of class '<em>Circuit Breaker Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit Breaker Definition</em>'.
	 * @generated
	 */
	CircuitBreakerDefinition createCircuitBreakerDefinition();

	/**
	 * Returns a new object of class '<em>Claim Check Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Check Definition</em>'.
	 * @generated
	 */
	ClaimCheckDefinition createClaimCheckDefinition();

	/**
	 * Returns a new object of class '<em>Combined Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Service Call Service Discovery Configuration</em>'.
	 * @generated
	 */
	CombinedServiceCallServiceDiscoveryConfiguration createCombinedServiceCallServiceDiscoveryConfiguration();

	/**
	 * Returns a new object of class '<em>Combined Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Service Call Service Filter Configuration</em>'.
	 * @generated
	 */
	CombinedServiceCallServiceFilterConfiguration createCombinedServiceCallServiceFilterConfiguration();

	/**
	 * Returns a new object of class '<em>Component Scan Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Scan Definition</em>'.
	 * @generated
	 */
	ComponentScanDefinition createComponentScanDefinition();

	/**
	 * Returns a new object of class '<em>Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Expression</em>'.
	 * @generated
	 */
	ConstantExpression createConstantExpression();

	/**
	 * Returns a new object of class '<em>Constants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constants</em>'.
	 * @generated
	 */
	Constants createConstants();

	/**
	 * Returns a new object of class '<em>Consul Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consul Service Call Service Discovery Configuration</em>'.
	 * @generated
	 */
	ConsulServiceCallServiceDiscoveryConfiguration createConsulServiceCallServiceDiscoveryConfiguration();

	/**
	 * Returns a new object of class '<em>Context Scan Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Scan Definition</em>'.
	 * @generated
	 */
	ContextScanDefinition createContextScanDefinition();

	/**
	 * Returns a new object of class '<em>Convert Body Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert Body Definition</em>'.
	 * @generated
	 */
	ConvertBodyDefinition createConvertBodyDefinition();

	/**
	 * Returns a new object of class '<em>Convert Header Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert Header Definition</em>'.
	 * @generated
	 */
	ConvertHeaderDefinition createConvertHeaderDefinition();

	/**
	 * Returns a new object of class '<em>Convert Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert Variable Definition</em>'.
	 * @generated
	 */
	ConvertVariableDefinition createConvertVariableDefinition();

	/**
	 * Returns a new object of class '<em>Crypto Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crypto Data Format</em>'.
	 * @generated
	 */
	CryptoDataFormat createCryptoDataFormat();

	/**
	 * Returns a new object of class '<em>CSimple Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSimple Expression</em>'.
	 * @generated
	 */
	CSimpleExpression createCSimpleExpression();

	/**
	 * Returns a new object of class '<em>Csv Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csv Data Format</em>'.
	 * @generated
	 */
	CsvDataFormat createCsvDataFormat();

	/**
	 * Returns a new object of class '<em>Custom Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Data Format</em>'.
	 * @generated
	 */
	CustomDataFormat createCustomDataFormat();

	/**
	 * Returns a new object of class '<em>Custom Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Load Balancer Definition</em>'.
	 * @generated
	 */
	CustomLoadBalancerDefinition createCustomLoadBalancerDefinition();

	/**
	 * Returns a new object of class '<em>Custom Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Service Call Service Filter Configuration</em>'.
	 * @generated
	 */
	CustomServiceCallServiceFilterConfiguration createCustomServiceCallServiceFilterConfiguration();

	/**
	 * Returns a new object of class '<em>Custom Transformer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Transformer Definition</em>'.
	 * @generated
	 */
	CustomTransformerDefinition createCustomTransformerDefinition();

	/**
	 * Returns a new object of class '<em>Custom Validator Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Validator Definition</em>'.
	 * @generated
	 */
	CustomValidatorDefinition createCustomValidatorDefinition();

	/**
	 * Returns a new object of class '<em>Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Format</em>'.
	 * @generated
	 */
	DataFormat createDataFormat();

	/**
	 * Returns a new object of class '<em>Data Formats Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Formats Definition</em>'.
	 * @generated
	 */
	DataFormatsDefinition createDataFormatsDefinition();

	/**
	 * Returns a new object of class '<em>Data Formats Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Formats Type</em>'.
	 * @generated
	 */
	DataFormatsType createDataFormatsType();

	/**
	 * Returns a new object of class '<em>Data Format Transformer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Format Transformer Definition</em>'.
	 * @generated
	 */
	DataFormatTransformerDefinition createDataFormatTransformerDefinition();

	/**
	 * Returns a new object of class '<em>Datasonnet Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datasonnet Expression</em>'.
	 * @generated
	 */
	DatasonnetExpression createDatasonnetExpression();

	/**
	 * Returns a new object of class '<em>Dead Letter Channel Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dead Letter Channel Definition</em>'.
	 * @generated
	 */
	DeadLetterChannelDefinition createDeadLetterChannelDefinition();

	/**
	 * Returns a new object of class '<em>Default Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Error Handler Definition</em>'.
	 * @generated
	 */
	DefaultErrorHandlerDefinition createDefaultErrorHandlerDefinition();

	/**
	 * Returns a new object of class '<em>Default Service Call Service Load Balancer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Service Call Service Load Balancer Configuration</em>'.
	 * @generated
	 */
	DefaultServiceCallServiceLoadBalancerConfiguration createDefaultServiceCallServiceLoadBalancerConfiguration();

	/**
	 * Returns a new object of class '<em>Delay Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Definition</em>'.
	 * @generated
	 */
	DelayDefinition createDelayDefinition();

	/**
	 * Returns a new object of class '<em>Delete Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Definition</em>'.
	 * @generated
	 */
	DeleteDefinition createDeleteDefinition();

	/**
	 * Returns a new object of class '<em>Dfdl Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dfdl Data Format</em>'.
	 * @generated
	 */
	DfdlDataFormat createDfdlDataFormat();

	/**
	 * Returns a new object of class '<em>Dns Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dns Service Call Service Discovery Configuration</em>'.
	 * @generated
	 */
	DnsServiceCallServiceDiscoveryConfiguration createDnsServiceCallServiceDiscoveryConfiguration();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Dynamic Router Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Router Definition</em>'.
	 * @generated
	 */
	DynamicRouterDefinition createDynamicRouterDefinition();

	/**
	 * Returns a new object of class '<em>Endpoint Transformer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint Transformer Definition</em>'.
	 * @generated
	 */
	EndpointTransformerDefinition createEndpointTransformerDefinition();

	/**
	 * Returns a new object of class '<em>Endpoint Validator Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint Validator Definition</em>'.
	 * @generated
	 */
	EndpointValidatorDefinition createEndpointValidatorDefinition();

	/**
	 * Returns a new object of class '<em>Enrich Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enrich Definition</em>'.
	 * @generated
	 */
	EnrichDefinition createEnrichDefinition();

	/**
	 * Returns a new object of class '<em>Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Handler Definition</em>'.
	 * @generated
	 */
	ErrorHandlerDefinition createErrorHandlerDefinition();

	/**
	 * Returns a new object of class '<em>Exchange Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Property Expression</em>'.
	 * @generated
	 */
	ExchangePropertyExpression createExchangePropertyExpression();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Expression Sub Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Sub Element Definition</em>'.
	 * @generated
	 */
	ExpressionSubElementDefinition createExpressionSubElementDefinition();

	/**
	 * Returns a new object of class '<em>Failover Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failover Load Balancer Definition</em>'.
	 * @generated
	 */
	FailoverLoadBalancerDefinition createFailoverLoadBalancerDefinition();

	/**
	 * Returns a new object of class '<em>Fault Tolerance Configuration Common</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Tolerance Configuration Common</em>'.
	 * @generated
	 */
	FaultToleranceConfigurationCommon createFaultToleranceConfigurationCommon();

	/**
	 * Returns a new object of class '<em>Fault Tolerance Configuration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Tolerance Configuration Definition</em>'.
	 * @generated
	 */
	FaultToleranceConfigurationDefinition createFaultToleranceConfigurationDefinition();

	/**
	 * Returns a new object of class '<em>Fhir Json Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fhir Json Data Format</em>'.
	 * @generated
	 */
	FhirJsonDataFormat createFhirJsonDataFormat();

	/**
	 * Returns a new object of class '<em>Fhir Xml Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fhir Xml Data Format</em>'.
	 * @generated
	 */
	FhirXmlDataFormat createFhirXmlDataFormat();

	/**
	 * Returns a new object of class '<em>Filter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Definition</em>'.
	 * @generated
	 */
	FilterDefinition createFilterDefinition();

	/**
	 * Returns a new object of class '<em>Filter Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Parameters</em>'.
	 * @generated
	 */
	FilterParameters createFilterParameters();

	/**
	 * Returns a new object of class '<em>Finally Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finally Definition</em>'.
	 * @generated
	 */
	FinallyDefinition createFinallyDefinition();

	/**
	 * Returns a new object of class '<em>Flatpack Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flatpack Data Format</em>'.
	 * @generated
	 */
	FlatpackDataFormat createFlatpackDataFormat();

	/**
	 * Returns a new object of class '<em>Fory Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fory Data Format</em>'.
	 * @generated
	 */
	ForyDataFormat createForyDataFormat();

	/**
	 * Returns a new object of class '<em>From Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Definition</em>'.
	 * @generated
	 */
	FromDefinition createFromDefinition();

	/**
	 * Returns a new object of class '<em>Get Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Definition</em>'.
	 * @generated
	 */
	GetDefinition createGetDefinition();

	/**
	 * Returns a new object of class '<em>Global Option Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Option Definition</em>'.
	 * @generated
	 */
	GlobalOptionDefinition createGlobalOptionDefinition();

	/**
	 * Returns a new object of class '<em>Global Options Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Options Definition</em>'.
	 * @generated
	 */
	GlobalOptionsDefinition createGlobalOptionsDefinition();

	/**
	 * Returns a new object of class '<em>Grok Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grok Data Format</em>'.
	 * @generated
	 */
	GrokDataFormat createGrokDataFormat();

	/**
	 * Returns a new object of class '<em>Groovy Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Groovy Expression</em>'.
	 * @generated
	 */
	GroovyExpression createGroovyExpression();

	/**
	 * Returns a new object of class '<em>Gzip Deflater Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gzip Deflater Data Format</em>'.
	 * @generated
	 */
	GzipDeflaterDataFormat createGzipDeflaterDataFormat();

	/**
	 * Returns a new object of class '<em>Head Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Head Definition</em>'.
	 * @generated
	 */
	HeadDefinition createHeadDefinition();

	/**
	 * Returns a new object of class '<em>Header Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Expression</em>'.
	 * @generated
	 */
	HeaderExpression createHeaderExpression();

	/**
	 * Returns a new object of class '<em>Healthy Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthy Service Call Service Filter Configuration</em>'.
	 * @generated
	 */
	HealthyServiceCallServiceFilterConfiguration createHealthyServiceCallServiceFilterConfiguration();

	/**
	 * Returns a new object of class '<em>Hl7 Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hl7 Data Format</em>'.
	 * @generated
	 */
	Hl7DataFormat createHl7DataFormat();

	/**
	 * Returns a new object of class '<em>Hl7 Terser Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hl7 Terser Expression</em>'.
	 * @generated
	 */
	Hl7TerserExpression createHl7TerserExpression();

	/**
	 * Returns a new object of class '<em>Ical Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ical Data Format</em>'.
	 * @generated
	 */
	IcalDataFormat createIcalDataFormat();

	/**
	 * Returns a new object of class '<em>Idempotent Consumer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Idempotent Consumer Definition</em>'.
	 * @generated
	 */
	IdempotentConsumerDefinition createIdempotentConsumerDefinition();

	/**
	 * Returns a new object of class '<em>Input Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Type Definition</em>'.
	 * @generated
	 */
	InputTypeDefinition createInputTypeDefinition();

	/**
	 * Returns a new object of class '<em>Intercept Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intercept Definition</em>'.
	 * @generated
	 */
	InterceptDefinition createInterceptDefinition();

	/**
	 * Returns a new object of class '<em>Intercept From Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intercept From Definition</em>'.
	 * @generated
	 */
	InterceptFromDefinition createInterceptFromDefinition();

	/**
	 * Returns a new object of class '<em>Intercept Send To Endpoint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intercept Send To Endpoint Definition</em>'.
	 * @generated
	 */
	InterceptSendToEndpointDefinition createInterceptSendToEndpointDefinition();

	/**
	 * Returns a new object of class '<em>Iso8583 Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iso8583 Data Format</em>'.
	 * @generated
	 */
	Iso8583DataFormat createIso8583DataFormat();

	/**
	 * Returns a new object of class '<em>Jackson XML Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jackson XML Data Format</em>'.
	 * @generated
	 */
	JacksonXMLDataFormat createJacksonXMLDataFormat();

	/**
	 * Returns a new object of class '<em>Java Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Expression</em>'.
	 * @generated
	 */
	JavaExpression createJavaExpression();

	/**
	 * Returns a new object of class '<em>Java Script Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Script Expression</em>'.
	 * @generated
	 */
	JavaScriptExpression createJavaScriptExpression();

	/**
	 * Returns a new object of class '<em>Jaxb Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jaxb Data Format</em>'.
	 * @generated
	 */
	JaxbDataFormat createJaxbDataFormat();

	/**
	 * Returns a new object of class '<em>Joor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joor Expression</em>'.
	 * @generated
	 */
	JoorExpression createJoorExpression();

	/**
	 * Returns a new object of class '<em>Jq Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jq Expression</em>'.
	 * @generated
	 */
	JqExpression createJqExpression();

	/**
	 * Returns a new object of class '<em>Json Api Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Api Data Format</em>'.
	 * @generated
	 */
	JsonApiDataFormat createJsonApiDataFormat();

	/**
	 * Returns a new object of class '<em>Json Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Data Format</em>'.
	 * @generated
	 */
	JsonDataFormat createJsonDataFormat();

	/**
	 * Returns a new object of class '<em>Json Path Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Path Expression</em>'.
	 * @generated
	 */
	JsonPathExpression createJsonPathExpression();

	/**
	 * Returns a new object of class '<em>Jta Transaction Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jta Transaction Error Handler Definition</em>'.
	 * @generated
	 */
	JtaTransactionErrorHandlerDefinition createJtaTransactionErrorHandlerDefinition();

	/**
	 * Returns a new object of class '<em>Kamelet Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kamelet Definition</em>'.
	 * @generated
	 */
	KameletDefinition createKameletDefinition();

	/**
	 * Returns a new object of class '<em>Key Managers Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Managers Parameters Factory Bean</em>'.
	 * @generated
	 */
	KeyManagersParametersFactoryBean createKeyManagersParametersFactoryBean();

	/**
	 * Returns a new object of class '<em>Key Store Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Store Parameters Factory Bean</em>'.
	 * @generated
	 */
	KeyStoreParametersFactoryBean createKeyStoreParametersFactoryBean();

	/**
	 * Returns a new object of class '<em>Kubernetes Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kubernetes Service Call Service Discovery Configuration</em>'.
	 * @generated
	 */
	KubernetesServiceCallServiceDiscoveryConfiguration createKubernetesServiceCallServiceDiscoveryConfiguration();

	/**
	 * Returns a new object of class '<em>Lang Chain4 JCharacter Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lang Chain4 JCharacter Tokenizer Definition</em>'.
	 * @generated
	 */
	LangChain4JCharacterTokenizerDefinition createLangChain4JCharacterTokenizerDefinition();

	/**
	 * Returns a new object of class '<em>Lang Chain4 JLine Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lang Chain4 JLine Tokenizer Definition</em>'.
	 * @generated
	 */
	LangChain4JLineTokenizerDefinition createLangChain4JLineTokenizerDefinition();

	/**
	 * Returns a new object of class '<em>Lang Chain4 JParagraph Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lang Chain4 JParagraph Tokenizer Definition</em>'.
	 * @generated
	 */
	LangChain4JParagraphTokenizerDefinition createLangChain4JParagraphTokenizerDefinition();

	/**
	 * Returns a new object of class '<em>Lang Chain4 JSentence Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lang Chain4 JSentence Tokenizer Definition</em>'.
	 * @generated
	 */
	LangChain4JSentenceTokenizerDefinition createLangChain4JSentenceTokenizerDefinition();

	/**
	 * Returns a new object of class '<em>Lang Chain4j Tokenizer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lang Chain4j Tokenizer Implementation</em>'.
	 * @generated
	 */
	LangChain4jTokenizerImplementation createLangChain4jTokenizerImplementation();

	/**
	 * Returns a new object of class '<em>Lang Chain4 JWord Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lang Chain4 JWord Tokenizer Definition</em>'.
	 * @generated
	 */
	LangChain4JWordTokenizerDefinition createLangChain4JWordTokenizerDefinition();

	/**
	 * Returns a new object of class '<em>Language Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Expression</em>'.
	 * @generated
	 */
	LanguageExpression createLanguageExpression();

	/**
	 * Returns a new object of class '<em>Load Balance Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balance Definition</em>'.
	 * @generated
	 */
	LoadBalanceDefinition createLoadBalanceDefinition();

	/**
	 * Returns a new object of class '<em>Load Transformer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Transformer Definition</em>'.
	 * @generated
	 */
	LoadTransformerDefinition createLoadTransformerDefinition();

	/**
	 * Returns a new object of class '<em>Log Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Definition</em>'.
	 * @generated
	 */
	LogDefinition createLogDefinition();

	/**
	 * Returns a new object of class '<em>Loop Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Definition</em>'.
	 * @generated
	 */
	LoopDefinition createLoopDefinition();

	/**
	 * Returns a new object of class '<em>Lzf Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lzf Data Format</em>'.
	 * @generated
	 */
	LzfDataFormat createLzfDataFormat();

	/**
	 * Returns a new object of class '<em>Marshal Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marshal Definition</em>'.
	 * @generated
	 */
	MarshalDefinition createMarshalDefinition();

	/**
	 * Returns a new object of class '<em>Method Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Call Expression</em>'.
	 * @generated
	 */
	MethodCallExpression createMethodCallExpression();

	/**
	 * Returns a new object of class '<em>Mime Multipart Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mime Multipart Data Format</em>'.
	 * @generated
	 */
	MimeMultipartDataFormat createMimeMultipartDataFormat();

	/**
	 * Returns a new object of class '<em>Model Lifecycle Strategy Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Lifecycle Strategy Support</em>'.
	 * @generated
	 */
	ModelLifecycleStrategySupport createModelLifecycleStrategySupport();

	/**
	 * Returns a new object of class '<em>Multicast Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multicast Definition</em>'.
	 * @generated
	 */
	MulticastDefinition createMulticastDefinition();

	/**
	 * Returns a new object of class '<em>Mutual TLS Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutual TLS Definition</em>'.
	 * @generated
	 */
	MutualTLSDefinition createMutualTLSDefinition();

	/**
	 * Returns a new object of class '<em>Mvel Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mvel Expression</em>'.
	 * @generated
	 */
	MvelExpression createMvelExpression();

	/**
	 * Returns a new object of class '<em>No Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Error Handler Definition</em>'.
	 * @generated
	 */
	NoErrorHandlerDefinition createNoErrorHandlerDefinition();

	/**
	 * Returns a new object of class '<em>OAuth2 Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth2 Definition</em>'.
	 * @generated
	 */
	OAuth2Definition createOAuth2Definition();

	/**
	 * Returns a new object of class '<em>Ognl Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ognl Expression</em>'.
	 * @generated
	 */
	OgnlExpression createOgnlExpression();

	/**
	 * Returns a new object of class '<em>On Completion Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Completion Definition</em>'.
	 * @generated
	 */
	OnCompletionDefinition createOnCompletionDefinition();

	/**
	 * Returns a new object of class '<em>On Exception Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Exception Definition</em>'.
	 * @generated
	 */
	OnExceptionDefinition createOnExceptionDefinition();

	/**
	 * Returns a new object of class '<em>On Fallback Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Fallback Definition</em>'.
	 * @generated
	 */
	OnFallbackDefinition createOnFallbackDefinition();

	/**
	 * Returns a new object of class '<em>On When Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On When Definition</em>'.
	 * @generated
	 */
	OnWhenDefinition createOnWhenDefinition();

	/**
	 * Returns a new object of class '<em>Open Api Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Api Definition</em>'.
	 * @generated
	 */
	OpenApiDefinition createOpenApiDefinition();

	/**
	 * Returns a new object of class '<em>Open Id Connect Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Id Connect Definition</em>'.
	 * @generated
	 */
	OpenIdConnectDefinition createOpenIdConnectDefinition();

	/**
	 * Returns a new object of class '<em>Optimistic Lock Retry Policy Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optimistic Lock Retry Policy Definition</em>'.
	 * @generated
	 */
	OptimisticLockRetryPolicyDefinition createOptimisticLockRetryPolicyDefinition();

	/**
	 * Returns a new object of class '<em>Otherwise Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Otherwise Definition</em>'.
	 * @generated
	 */
	OtherwiseDefinition createOtherwiseDefinition();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Output Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Type Definition</em>'.
	 * @generated
	 */
	OutputTypeDefinition createOutputTypeDefinition();

	/**
	 * Returns a new object of class '<em>Package Scan Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Scan Definition</em>'.
	 * @generated
	 */
	PackageScanDefinition createPackageScanDefinition();

	/**
	 * Returns a new object of class '<em>Param Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Definition</em>'.
	 * @generated
	 */
	ParamDefinition createParamDefinition();

	/**
	 * Returns a new object of class '<em>Parquet Avro Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parquet Avro Data Format</em>'.
	 * @generated
	 */
	ParquetAvroDataFormat createParquetAvroDataFormat();

	/**
	 * Returns a new object of class '<em>Pass Through Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pass Through Service Call Service Filter Configuration</em>'.
	 * @generated
	 */
	PassThroughServiceCallServiceFilterConfiguration createPassThroughServiceCallServiceFilterConfiguration();

	/**
	 * Returns a new object of class '<em>Patch Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patch Definition</em>'.
	 * @generated
	 */
	PatchDefinition createPatchDefinition();

	/**
	 * Returns a new object of class '<em>Pattern Based Package Scan Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Based Package Scan Filter</em>'.
	 * @generated
	 */
	PatternBasedPackageScanFilter createPatternBasedPackageScanFilter();

	/**
	 * Returns a new object of class '<em>Pausable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pausable Definition</em>'.
	 * @generated
	 */
	PausableDefinition createPausableDefinition();

	/**
	 * Returns a new object of class '<em>Pgp Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pgp Data Format</em>'.
	 * @generated
	 */
	PgpDataFormat createPgpDataFormat();

	/**
	 * Returns a new object of class '<em>Pipeline Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipeline Definition</em>'.
	 * @generated
	 */
	PipelineDefinition createPipelineDefinition();

	/**
	 * Returns a new object of class '<em>Policy Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Definition</em>'.
	 * @generated
	 */
	PolicyDefinition createPolicyDefinition();

	/**
	 * Returns a new object of class '<em>Poll Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll Definition</em>'.
	 * @generated
	 */
	PollDefinition createPollDefinition();

	/**
	 * Returns a new object of class '<em>Poll Enrich Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll Enrich Definition</em>'.
	 * @generated
	 */
	PollEnrichDefinition createPollEnrichDefinition();

	/**
	 * Returns a new object of class '<em>Post Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Definition</em>'.
	 * @generated
	 */
	PostDefinition createPostDefinition();

	/**
	 * Returns a new object of class '<em>Predicate Validator Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Validator Definition</em>'.
	 * @generated
	 */
	PredicateValidatorDefinition createPredicateValidatorDefinition();

	/**
	 * Returns a new object of class '<em>Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Definition</em>'.
	 * @generated
	 */
	ProcessDefinition createProcessDefinition();

	/**
	 * Returns a new object of class '<em>Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Definition</em>'.
	 * @generated
	 */
	PropertyDefinition createPropertyDefinition();

	/**
	 * Returns a new object of class '<em>Property Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Definitions</em>'.
	 * @generated
	 */
	PropertyDefinitions createPropertyDefinitions();

	/**
	 * Returns a new object of class '<em>Property Expression Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Expression Definition</em>'.
	 * @generated
	 */
	PropertyExpressionDefinition createPropertyExpressionDefinition();

	/**
	 * Returns a new object of class '<em>Protobuf Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protobuf Data Format</em>'.
	 * @generated
	 */
	ProtobufDataFormat createProtobufDataFormat();

	/**
	 * Returns a new object of class '<em>Put Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Put Definition</em>'.
	 * @generated
	 */
	PutDefinition createPutDefinition();

	/**
	 * Returns a new object of class '<em>Python Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Python Expression</em>'.
	 * @generated
	 */
	PythonExpression createPythonExpression();

	/**
	 * Returns a new object of class '<em>Random Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Load Balancer Definition</em>'.
	 * @generated
	 */
	RandomLoadBalancerDefinition createRandomLoadBalancerDefinition();

	/**
	 * Returns a new object of class '<em>Recipient List Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipient List Definition</em>'.
	 * @generated
	 */
	RecipientListDefinition createRecipientListDefinition();

	/**
	 * Returns a new object of class '<em>Redelivery Policy Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redelivery Policy Definition</em>'.
	 * @generated
	 */
	RedeliveryPolicyDefinition createRedeliveryPolicyDefinition();

	/**
	 * Returns a new object of class '<em>Ref Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Error Handler Definition</em>'.
	 * @generated
	 */
	RefErrorHandlerDefinition createRefErrorHandlerDefinition();

	/**
	 * Returns a new object of class '<em>Ref Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Expression</em>'.
	 * @generated
	 */
	RefExpression createRefExpression();

	/**
	 * Returns a new object of class '<em>Remove Header Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Header Definition</em>'.
	 * @generated
	 */
	RemoveHeaderDefinition createRemoveHeaderDefinition();

	/**
	 * Returns a new object of class '<em>Remove Headers Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Headers Definition</em>'.
	 * @generated
	 */
	RemoveHeadersDefinition createRemoveHeadersDefinition();

	/**
	 * Returns a new object of class '<em>Remove Properties Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Properties Definition</em>'.
	 * @generated
	 */
	RemovePropertiesDefinition createRemovePropertiesDefinition();

	/**
	 * Returns a new object of class '<em>Remove Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Property Definition</em>'.
	 * @generated
	 */
	RemovePropertyDefinition createRemovePropertyDefinition();

	/**
	 * Returns a new object of class '<em>Remove Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Variable Definition</em>'.
	 * @generated
	 */
	RemoveVariableDefinition createRemoveVariableDefinition();

	/**
	 * Returns a new object of class '<em>Resequence Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resequence Definition</em>'.
	 * @generated
	 */
	ResequenceDefinition createResequenceDefinition();

	/**
	 * Returns a new object of class '<em>Resilience4 JConfiguration Common</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resilience4 JConfiguration Common</em>'.
	 * @generated
	 */
	Resilience4JConfigurationCommon createResilience4JConfigurationCommon();

	/**
	 * Returns a new object of class '<em>Resilience4 JConfiguration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resilience4 JConfiguration Definition</em>'.
	 * @generated
	 */
	Resilience4JConfigurationDefinition createResilience4JConfigurationDefinition();

	/**
	 * Returns a new object of class '<em>Response Header Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Header Definition</em>'.
	 * @generated
	 */
	ResponseHeaderDefinition createResponseHeaderDefinition();

	/**
	 * Returns a new object of class '<em>Response Message Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Message Definition</em>'.
	 * @generated
	 */
	ResponseMessageDefinition createResponseMessageDefinition();

	/**
	 * Returns a new object of class '<em>Rest Binding Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Binding Definition</em>'.
	 * @generated
	 */
	RestBindingDefinition createRestBindingDefinition();

	/**
	 * Returns a new object of class '<em>Rest Configuration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Configuration Definition</em>'.
	 * @generated
	 */
	RestConfigurationDefinition createRestConfigurationDefinition();

	/**
	 * Returns a new object of class '<em>Rest Context Ref Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Context Ref Definition</em>'.
	 * @generated
	 */
	RestContextRefDefinition createRestContextRefDefinition();

	/**
	 * Returns a new object of class '<em>Rest Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Definition</em>'.
	 * @generated
	 */
	RestDefinition createRestDefinition();

	/**
	 * Returns a new object of class '<em>Rest Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Property Definition</em>'.
	 * @generated
	 */
	RestPropertyDefinition createRestPropertyDefinition();

	/**
	 * Returns a new object of class '<em>Rests Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rests Definition</em>'.
	 * @generated
	 */
	RestsDefinition createRestsDefinition();

	/**
	 * Returns a new object of class '<em>Rest Securities Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Securities Definition</em>'.
	 * @generated
	 */
	RestSecuritiesDefinition createRestSecuritiesDefinition();

	/**
	 * Returns a new object of class '<em>Resumable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resumable Definition</em>'.
	 * @generated
	 */
	ResumableDefinition createResumableDefinition();

	/**
	 * Returns a new object of class '<em>Rollback Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rollback Definition</em>'.
	 * @generated
	 */
	RollbackDefinition createRollbackDefinition();

	/**
	 * Returns a new object of class '<em>Round Robin Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round Robin Load Balancer Definition</em>'.
	 * @generated
	 */
	RoundRobinLoadBalancerDefinition createRoundRobinLoadBalancerDefinition();

	/**
	 * Returns a new object of class '<em>Route Builder Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Builder Definition</em>'.
	 * @generated
	 */
	RouteBuilderDefinition createRouteBuilderDefinition();

	/**
	 * Returns a new object of class '<em>Route Configuration Context Ref Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Configuration Context Ref Definition</em>'.
	 * @generated
	 */
	RouteConfigurationContextRefDefinition createRouteConfigurationContextRefDefinition();

	/**
	 * Returns a new object of class '<em>Route Configuration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Configuration Definition</em>'.
	 * @generated
	 */
	RouteConfigurationDefinition createRouteConfigurationDefinition();

	/**
	 * Returns a new object of class '<em>Route Configurations Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Configurations Definition</em>'.
	 * @generated
	 */
	RouteConfigurationsDefinition createRouteConfigurationsDefinition();

	/**
	 * Returns a new object of class '<em>Route Context Ref Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Context Ref Definition</em>'.
	 * @generated
	 */
	RouteContextRefDefinition createRouteContextRefDefinition();

	/**
	 * Returns a new object of class '<em>Route Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Definition</em>'.
	 * @generated
	 */
	RouteDefinition createRouteDefinition();

	/**
	 * Returns a new object of class '<em>Routes Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routes Definition</em>'.
	 * @generated
	 */
	RoutesDefinition createRoutesDefinition();

	/**
	 * Returns a new object of class '<em>Route Template Context Ref Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Template Context Ref Definition</em>'.
	 * @generated
	 */
	RouteTemplateContextRefDefinition createRouteTemplateContextRefDefinition();

	/**
	 * Returns a new object of class '<em>Route Template Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Template Definition</em>'.
	 * @generated
	 */
	RouteTemplateDefinition createRouteTemplateDefinition();

	/**
	 * Returns a new object of class '<em>Route Template Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Template Parameter Definition</em>'.
	 * @generated
	 */
	RouteTemplateParameterDefinition createRouteTemplateParameterDefinition();

	/**
	 * Returns a new object of class '<em>Route Templates Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Templates Definition</em>'.
	 * @generated
	 */
	RouteTemplatesDefinition createRouteTemplatesDefinition();

	/**
	 * Returns a new object of class '<em>Routing Slip Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routing Slip Definition</em>'.
	 * @generated
	 */
	RoutingSlipDefinition createRoutingSlipDefinition();

	/**
	 * Returns a new object of class '<em>Rss Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rss Data Format</em>'.
	 * @generated
	 */
	RssDataFormat createRssDataFormat();

	/**
	 * Returns a new object of class '<em>Saga Action Uri Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Saga Action Uri Definition</em>'.
	 * @generated
	 */
	SagaActionUriDefinition createSagaActionUriDefinition();

	/**
	 * Returns a new object of class '<em>Saga Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Saga Definition</em>'.
	 * @generated
	 */
	SagaDefinition createSagaDefinition();

	/**
	 * Returns a new object of class '<em>Sampling Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sampling Definition</em>'.
	 * @generated
	 */
	SamplingDefinition createSamplingDefinition();

	/**
	 * Returns a new object of class '<em>Script Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Definition</em>'.
	 * @generated
	 */
	ScriptDefinition createScriptDefinition();

	/**
	 * Returns a new object of class '<em>Secure Random Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secure Random Parameters Factory Bean</em>'.
	 * @generated
	 */
	SecureRandomParametersFactoryBean createSecureRandomParametersFactoryBean();

	/**
	 * Returns a new object of class '<em>Secure Socket Protocols Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secure Socket Protocols Parameters</em>'.
	 * @generated
	 */
	SecureSocketProtocolsParameters createSecureSocketProtocolsParameters();

	/**
	 * Returns a new object of class '<em>Security Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Definition</em>'.
	 * @generated
	 */
	SecurityDefinition createSecurityDefinition();

	/**
	 * Returns a new object of class '<em>Service Call Configuration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Call Configuration Definition</em>'.
	 * @generated
	 */
	ServiceCallConfigurationDefinition createServiceCallConfigurationDefinition();

	/**
	 * Returns a new object of class '<em>Service Call Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Call Definition</em>'.
	 * @generated
	 */
	ServiceCallDefinition createServiceCallDefinition();

	/**
	 * Returns a new object of class '<em>Service Call Definition Constants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Call Definition Constants</em>'.
	 * @generated
	 */
	ServiceCallDefinitionConstants createServiceCallDefinitionConstants();

	/**
	 * Returns a new object of class '<em>Service Call Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Call Expression Configuration</em>'.
	 * @generated
	 */
	ServiceCallExpressionConfiguration createServiceCallExpressionConfiguration();

	/**
	 * Returns a new object of class '<em>Service Call Service Chooser Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Call Service Chooser Configuration</em>'.
	 * @generated
	 */
	ServiceCallServiceChooserConfiguration createServiceCallServiceChooserConfiguration();

	/**
	 * Returns a new object of class '<em>Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Call Service Discovery Configuration</em>'.
	 * @generated
	 */
	ServiceCallServiceDiscoveryConfiguration createServiceCallServiceDiscoveryConfiguration();

	/**
	 * Returns a new object of class '<em>Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Call Service Filter Configuration</em>'.
	 * @generated
	 */
	ServiceCallServiceFilterConfiguration createServiceCallServiceFilterConfiguration();

	/**
	 * Returns a new object of class '<em>Service Call Service Load Balancer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Call Service Load Balancer Configuration</em>'.
	 * @generated
	 */
	ServiceCallServiceLoadBalancerConfiguration createServiceCallServiceLoadBalancerConfiguration();

	/**
	 * Returns a new object of class '<em>Set Body Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Body Definition</em>'.
	 * @generated
	 */
	SetBodyDefinition createSetBodyDefinition();

	/**
	 * Returns a new object of class '<em>Set Exchange Pattern Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Exchange Pattern Definition</em>'.
	 * @generated
	 */
	SetExchangePatternDefinition createSetExchangePatternDefinition();

	/**
	 * Returns a new object of class '<em>Set Header Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Header Definition</em>'.
	 * @generated
	 */
	SetHeaderDefinition createSetHeaderDefinition();

	/**
	 * Returns a new object of class '<em>Set Headers Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Headers Definition</em>'.
	 * @generated
	 */
	SetHeadersDefinition createSetHeadersDefinition();

	/**
	 * Returns a new object of class '<em>Set Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Property Definition</em>'.
	 * @generated
	 */
	SetPropertyDefinition createSetPropertyDefinition();

	/**
	 * Returns a new object of class '<em>Set Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Variable Definition</em>'.
	 * @generated
	 */
	SetVariableDefinition createSetVariableDefinition();

	/**
	 * Returns a new object of class '<em>Set Variables Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Variables Definition</em>'.
	 * @generated
	 */
	SetVariablesDefinition createSetVariablesDefinition();

	/**
	 * Returns a new object of class '<em>Simple Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Expression</em>'.
	 * @generated
	 */
	SimpleExpression createSimpleExpression();

	/**
	 * Returns a new object of class '<em>Smooks Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smooks Data Format</em>'.
	 * @generated
	 */
	SmooksDataFormat createSmooksDataFormat();

	/**
	 * Returns a new object of class '<em>Sni Host Names</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sni Host Names</em>'.
	 * @generated
	 */
	SniHostNames createSniHostNames();

	/**
	 * Returns a new object of class '<em>Soap Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soap Data Format</em>'.
	 * @generated
	 */
	SoapDataFormat createSoapDataFormat();

	/**
	 * Returns a new object of class '<em>Sort Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort Definition</em>'.
	 * @generated
	 */
	SortDefinition createSortDefinition();

	/**
	 * Returns a new object of class '<em>Sp EL Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sp EL Expression</em>'.
	 * @generated
	 */
	SpELExpression createSpELExpression();

	/**
	 * Returns a new object of class '<em>Split Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Definition</em>'.
	 * @generated
	 */
	SplitDefinition createSplitDefinition();

	/**
	 * Returns a new object of class '<em>Spring Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spring Error Handler Definition</em>'.
	 * @generated
	 */
	SpringErrorHandlerDefinition createSpringErrorHandlerDefinition();

	/**
	 * Returns a new object of class '<em>Spring Transaction Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spring Transaction Error Handler Definition</em>'.
	 * @generated
	 */
	SpringTransactionErrorHandlerDefinition createSpringTransactionErrorHandlerDefinition();

	/**
	 * Returns a new object of class '<em>Ssl Context Client Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssl Context Client Parameters Factory Bean</em>'.
	 * @generated
	 */
	SslContextClientParametersFactoryBean createSslContextClientParametersFactoryBean();

	/**
	 * Returns a new object of class '<em>Ssl Context Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssl Context Parameters Factory Bean</em>'.
	 * @generated
	 */
	SslContextParametersFactoryBean createSslContextParametersFactoryBean();

	/**
	 * Returns a new object of class '<em>Ssl Context Server Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssl Context Server Parameters Factory Bean</em>'.
	 * @generated
	 */
	SslContextServerParametersFactoryBean createSslContextServerParametersFactoryBean();

	/**
	 * Returns a new object of class '<em>Static Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Service Call Service Discovery Configuration</em>'.
	 * @generated
	 */
	StaticServiceCallServiceDiscoveryConfiguration createStaticServiceCallServiceDiscoveryConfiguration();

	/**
	 * Returns a new object of class '<em>Step Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Definition</em>'.
	 * @generated
	 */
	StepDefinition createStepDefinition();

	/**
	 * Returns a new object of class '<em>Sticky Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sticky Load Balancer Definition</em>'.
	 * @generated
	 */
	StickyLoadBalancerDefinition createStickyLoadBalancerDefinition();

	/**
	 * Returns a new object of class '<em>Stop Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Definition</em>'.
	 * @generated
	 */
	StopDefinition createStopDefinition();

	/**
	 * Returns a new object of class '<em>Stream Resequencer Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Resequencer Config</em>'.
	 * @generated
	 */
	StreamResequencerConfig createStreamResequencerConfig();

	/**
	 * Returns a new object of class '<em>Swift Mt Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swift Mt Data Format</em>'.
	 * @generated
	 */
	SwiftMtDataFormat createSwiftMtDataFormat();

	/**
	 * Returns a new object of class '<em>Swift Mx Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swift Mx Data Format</em>'.
	 * @generated
	 */
	SwiftMxDataFormat createSwiftMxDataFormat();

	/**
	 * Returns a new object of class '<em>Syslog Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syslog Data Format</em>'.
	 * @generated
	 */
	SyslogDataFormat createSyslogDataFormat();

	/**
	 * Returns a new object of class '<em>Tar File Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tar File Data Format</em>'.
	 * @generated
	 */
	TarFileDataFormat createTarFileDataFormat();

	/**
	 * Returns a new object of class '<em>Templated Route Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Templated Route Definition</em>'.
	 * @generated
	 */
	TemplatedRouteDefinition createTemplatedRouteDefinition();

	/**
	 * Returns a new object of class '<em>Templated Route Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Templated Route Parameter Definition</em>'.
	 * @generated
	 */
	TemplatedRouteParameterDefinition createTemplatedRouteParameterDefinition();

	/**
	 * Returns a new object of class '<em>Templated Routes Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Templated Routes Definition</em>'.
	 * @generated
	 */
	TemplatedRoutesDefinition createTemplatedRoutesDefinition();

	/**
	 * Returns a new object of class '<em>Thread Pool Profile Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread Pool Profile Definition</em>'.
	 * @generated
	 */
	ThreadPoolProfileDefinition createThreadPoolProfileDefinition();

	/**
	 * Returns a new object of class '<em>Threads Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threads Definition</em>'.
	 * @generated
	 */
	ThreadsDefinition createThreadsDefinition();

	/**
	 * Returns a new object of class '<em>Thrift Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thrift Data Format</em>'.
	 * @generated
	 */
	ThriftDataFormat createThriftDataFormat();

	/**
	 * Returns a new object of class '<em>Throttle Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throttle Definition</em>'.
	 * @generated
	 */
	ThrottleDefinition createThrottleDefinition();

	/**
	 * Returns a new object of class '<em>Throw Exception Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throw Exception Definition</em>'.
	 * @generated
	 */
	ThrowExceptionDefinition createThrowExceptionDefinition();

	/**
	 * Returns a new object of class '<em>Tidy Markup Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tidy Markup Data Format</em>'.
	 * @generated
	 */
	TidyMarkupDataFormat createTidyMarkupDataFormat();

	/**
	 * Returns a new object of class '<em>To Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Definition</em>'.
	 * @generated
	 */
	ToDefinition createToDefinition();

	/**
	 * Returns a new object of class '<em>To Dynamic Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Dynamic Definition</em>'.
	 * @generated
	 */
	ToDynamicDefinition createToDynamicDefinition();

	/**
	 * Returns a new object of class '<em>Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tokenizer Definition</em>'.
	 * @generated
	 */
	TokenizerDefinition createTokenizerDefinition();

	/**
	 * Returns a new object of class '<em>Tokenizer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tokenizer Expression</em>'.
	 * @generated
	 */
	TokenizerExpression createTokenizerExpression();

	/**
	 * Returns a new object of class '<em>Tokenizer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tokenizer Implementation</em>'.
	 * @generated
	 */
	TokenizerImplementation createTokenizerImplementation();

	/**
	 * Returns a new object of class '<em>Topic Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Load Balancer Definition</em>'.
	 * @generated
	 */
	TopicLoadBalancerDefinition createTopicLoadBalancerDefinition();

	/**
	 * Returns a new object of class '<em>Transacted Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transacted Definition</em>'.
	 * @generated
	 */
	TransactedDefinition createTransactedDefinition();

	/**
	 * Returns a new object of class '<em>Transform Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform Definition</em>'.
	 * @generated
	 */
	TransformDefinition createTransformDefinition();

	/**
	 * Returns a new object of class '<em>Transformers Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformers Definition</em>'.
	 * @generated
	 */
	TransformersDefinition createTransformersDefinition();

	/**
	 * Returns a new object of class '<em>Trust Managers Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trust Managers Parameters Factory Bean</em>'.
	 * @generated
	 */
	TrustManagersParametersFactoryBean createTrustManagersParametersFactoryBean();

	/**
	 * Returns a new object of class '<em>Try Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Try Definition</em>'.
	 * @generated
	 */
	TryDefinition createTryDefinition();

	/**
	 * Returns a new object of class '<em>Uni Vocity Csv Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uni Vocity Csv Data Format</em>'.
	 * @generated
	 */
	UniVocityCsvDataFormat createUniVocityCsvDataFormat();

	/**
	 * Returns a new object of class '<em>Uni Vocity Fixed Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uni Vocity Fixed Data Format</em>'.
	 * @generated
	 */
	UniVocityFixedDataFormat createUniVocityFixedDataFormat();

	/**
	 * Returns a new object of class '<em>Uni Vocity Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uni Vocity Header</em>'.
	 * @generated
	 */
	UniVocityHeader createUniVocityHeader();

	/**
	 * Returns a new object of class '<em>Uni Vocity Tsv Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uni Vocity Tsv Data Format</em>'.
	 * @generated
	 */
	UniVocityTsvDataFormat createUniVocityTsvDataFormat();

	/**
	 * Returns a new object of class '<em>Unmarshal Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unmarshal Definition</em>'.
	 * @generated
	 */
	UnmarshalDefinition createUnmarshalDefinition();

	/**
	 * Returns a new object of class '<em>Validate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate Definition</em>'.
	 * @generated
	 */
	ValidateDefinition createValidateDefinition();

	/**
	 * Returns a new object of class '<em>Validators Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validators Definition</em>'.
	 * @generated
	 */
	ValidatorsDefinition createValidatorsDefinition();

	/**
	 * Returns a new object of class '<em>Variable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Expression</em>'.
	 * @generated
	 */
	VariableExpression createVariableExpression();

	/**
	 * Returns a new object of class '<em>Wasm Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wasm Expression</em>'.
	 * @generated
	 */
	WasmExpression createWasmExpression();

	/**
	 * Returns a new object of class '<em>Weighted Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weighted Load Balancer Definition</em>'.
	 * @generated
	 */
	WeightedLoadBalancerDefinition createWeightedLoadBalancerDefinition();

	/**
	 * Returns a new object of class '<em>When Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Definition</em>'.
	 * @generated
	 */
	WhenDefinition createWhenDefinition();

	/**
	 * Returns a new object of class '<em>Wire Tap Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire Tap Definition</em>'.
	 * @generated
	 */
	WireTapDefinition createWireTapDefinition();

	/**
	 * Returns a new object of class '<em>Xml Security Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Security Data Format</em>'.
	 * @generated
	 */
	XmlSecurityDataFormat createXmlSecurityDataFormat();

	/**
	 * Returns a new object of class '<em>Xml Tokenizer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Tokenizer Expression</em>'.
	 * @generated
	 */
	XmlTokenizerExpression createXmlTokenizerExpression();

	/**
	 * Returns a new object of class '<em>XPath Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XPath Expression</em>'.
	 * @generated
	 */
	XPathExpression createXPathExpression();

	/**
	 * Returns a new object of class '<em>XQuery Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XQuery Expression</em>'.
	 * @generated
	 */
	XQueryExpression createXQueryExpression();

	/**
	 * Returns a new object of class '<em>Yaml Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yaml Data Format</em>'.
	 * @generated
	 */
	YamlDataFormat createYamlDataFormat();

	/**
	 * Returns a new object of class '<em>Yaml Type Filter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yaml Type Filter Definition</em>'.
	 * @generated
	 */
	YamlTypeFilterDefinition createYamlTypeFilterDefinition();

	/**
	 * Returns a new object of class '<em>Zip Deflater Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zip Deflater Data Format</em>'.
	 * @generated
	 */
	ZipDeflaterDataFormat createZipDeflaterDataFormat();

	/**
	 * Returns a new object of class '<em>Zip File Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zip File Data Format</em>'.
	 * @generated
	 */
	ZipFileDataFormat createZipFileDataFormat();

	/**
	 * Returns a new object of class '<em>Zoo Keeper Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zoo Keeper Service Call Service Discovery Configuration</em>'.
	 * @generated
	 */
	ZooKeeperServiceCallServiceDiscoveryConfiguration createZooKeeperServiceCallServiceDiscoveryConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CamelSpringPackage getCamelSpringPackage();

} //CamelSpringFactory

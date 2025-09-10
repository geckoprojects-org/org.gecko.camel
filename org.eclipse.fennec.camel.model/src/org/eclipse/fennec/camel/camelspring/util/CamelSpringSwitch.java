/**
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
package org.eclipse.fennec.camel.camelspring.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.fennec.camel.camelspring.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage
 * @generated
 */
public class CamelSpringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CamelSpringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelSpringSwitch() {
		if (modelPackage == null) {
			modelPackage = CamelSpringPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CamelSpringPackage.ABSTRACT_CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN: {
				AbstractCamelConsumerTemplateFactoryBean abstractCamelConsumerTemplateFactoryBean = (AbstractCamelConsumerTemplateFactoryBean)theEObject;
				T result = caseAbstractCamelConsumerTemplateFactoryBean(abstractCamelConsumerTemplateFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelConsumerTemplateFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractCamelConsumerTemplateFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_CAMEL_CONTEXT_FACTORY_BEAN: {
				AbstractCamelContextFactoryBean abstractCamelContextFactoryBean = (AbstractCamelContextFactoryBean)theEObject;
				T result = caseAbstractCamelContextFactoryBean(abstractCamelContextFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractCamelContextFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN: {
				AbstractCamelEndpointFactoryBean abstractCamelEndpointFactoryBean = (AbstractCamelEndpointFactoryBean)theEObject;
				T result = caseAbstractCamelEndpointFactoryBean(abstractCamelEndpointFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelEndpointFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractCamelEndpointFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN: {
				AbstractCamelFactoryBean abstractCamelFactoryBean = (AbstractCamelFactoryBean)theEObject;
				T result = caseAbstractCamelFactoryBean(abstractCamelFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractCamelFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_CAMEL_FLUENT_PRODUCER_TEMPLATE_FACTORY_BEAN: {
				AbstractCamelFluentProducerTemplateFactoryBean abstractCamelFluentProducerTemplateFactoryBean = (AbstractCamelFluentProducerTemplateFactoryBean)theEObject;
				T result = caseAbstractCamelFluentProducerTemplateFactoryBean(abstractCamelFluentProducerTemplateFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelFluentProducerTemplateFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractCamelFluentProducerTemplateFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN: {
				AbstractCamelProducerTemplateFactoryBean abstractCamelProducerTemplateFactoryBean = (AbstractCamelProducerTemplateFactoryBean)theEObject;
				T result = caseAbstractCamelProducerTemplateFactoryBean(abstractCamelProducerTemplateFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelProducerTemplateFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractCamelProducerTemplateFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN: {
				AbstractCamelRedeliveryPolicyFactoryBean abstractCamelRedeliveryPolicyFactoryBean = (AbstractCamelRedeliveryPolicyFactoryBean)theEObject;
				T result = caseAbstractCamelRedeliveryPolicyFactoryBean(abstractCamelRedeliveryPolicyFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelRedeliveryPolicyFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractCamelRedeliveryPolicyFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_CAMEL_THREAD_POOL_FACTORY_BEAN: {
				AbstractCamelThreadPoolFactoryBean abstractCamelThreadPoolFactoryBean = (AbstractCamelThreadPoolFactoryBean)theEObject;
				T result = caseAbstractCamelThreadPoolFactoryBean(abstractCamelThreadPoolFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelThreadPoolFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractCamelThreadPoolFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_JSSE_UTIL_FACTORY_BEAN: {
				AbstractJsseUtilFactoryBean abstractJsseUtilFactoryBean = (AbstractJsseUtilFactoryBean)theEObject;
				T result = caseAbstractJsseUtilFactoryBean(abstractJsseUtilFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractJsseUtilFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractJsseUtilFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN: {
				AbstractKeyManagersParametersFactoryBean abstractKeyManagersParametersFactoryBean = (AbstractKeyManagersParametersFactoryBean)theEObject;
				T result = caseAbstractKeyManagersParametersFactoryBean(abstractKeyManagersParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(abstractKeyManagersParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractKeyManagersParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractKeyManagersParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN: {
				AbstractKeyStoreParametersFactoryBean abstractKeyStoreParametersFactoryBean = (AbstractKeyStoreParametersFactoryBean)theEObject;
				T result = caseAbstractKeyStoreParametersFactoryBean(abstractKeyStoreParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(abstractKeyStoreParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractKeyStoreParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractKeyStoreParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_SECURE_RANDOM_PARAMETERS_FACTORY_BEAN: {
				AbstractSecureRandomParametersFactoryBean abstractSecureRandomParametersFactoryBean = (AbstractSecureRandomParametersFactoryBean)theEObject;
				T result = caseAbstractSecureRandomParametersFactoryBean(abstractSecureRandomParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(abstractSecureRandomParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractSecureRandomParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractSecureRandomParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN: {
				AbstractTrustManagersParametersFactoryBean abstractTrustManagersParametersFactoryBean = (AbstractTrustManagersParametersFactoryBean)theEObject;
				T result = caseAbstractTrustManagersParametersFactoryBean(abstractTrustManagersParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(abstractTrustManagersParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(abstractTrustManagersParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(abstractTrustManagersParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.AGGREGATE_DEFINITION: {
				AggregateDefinition aggregateDefinition = (AggregateDefinition)theEObject;
				T result = caseAggregateDefinition(aggregateDefinition);
				if (result == null) result = caseOutput(aggregateDefinition);
				if (result == null) result = caseProcessorDefinition(aggregateDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(aggregateDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ALLOWABLE_VALUES_TYPE: {
				AllowableValuesType allowableValuesType = (AllowableValuesType)theEObject;
				T result = caseAllowableValuesType(allowableValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ALLOWABLE_VALUES_TYPE1: {
				AllowableValuesType1 allowableValuesType1 = (AllowableValuesType1)theEObject;
				T result = caseAllowableValuesType1(allowableValuesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.API_KEY_DEFINITION: {
				ApiKeyDefinition apiKeyDefinition = (ApiKeyDefinition)theEObject;
				T result = caseApiKeyDefinition(apiKeyDefinition);
				if (result == null) result = caseRestSecurityDefinition(apiKeyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.APPLICATION_DEFINITION: {
				ApplicationDefinition applicationDefinition = (ApplicationDefinition)theEObject;
				T result = caseApplicationDefinition(applicationDefinition);
				if (result == null) result = caseBeansDefinition(applicationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ASN1_DATA_FORMAT: {
				Asn1DataFormat asn1DataFormat = (Asn1DataFormat)theEObject;
				T result = caseAsn1DataFormat(asn1DataFormat);
				if (result == null) result = caseDataFormat(asn1DataFormat);
				if (result == null) result = caseIdentifiedType(asn1DataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.AVRO_DATA_FORMAT: {
				AvroDataFormat avroDataFormat = (AvroDataFormat)theEObject;
				T result = caseAvroDataFormat(avroDataFormat);
				if (result == null) result = caseDataFormat(avroDataFormat);
				if (result == null) result = caseIdentifiedType(avroDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BARCODE_DATA_FORMAT: {
				BarcodeDataFormat barcodeDataFormat = (BarcodeDataFormat)theEObject;
				T result = caseBarcodeDataFormat(barcodeDataFormat);
				if (result == null) result = caseDataFormat(barcodeDataFormat);
				if (result == null) result = caseIdentifiedType(barcodeDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BASE64_DATA_FORMAT: {
				Base64DataFormat base64DataFormat = (Base64DataFormat)theEObject;
				T result = caseBase64DataFormat(base64DataFormat);
				if (result == null) result = caseDataFormat(base64DataFormat);
				if (result == null) result = caseIdentifiedType(base64DataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BASE_ERROR_HANDLER_DEFINITION: {
				BaseErrorHandlerDefinition baseErrorHandlerDefinition = (BaseErrorHandlerDefinition)theEObject;
				T result = caseBaseErrorHandlerDefinition(baseErrorHandlerDefinition);
				if (result == null) result = caseIdentifiedType(baseErrorHandlerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BASIC_AUTH_DEFINITION: {
				BasicAuthDefinition basicAuthDefinition = (BasicAuthDefinition)theEObject;
				T result = caseBasicAuthDefinition(basicAuthDefinition);
				if (result == null) result = caseRestSecurityDefinition(basicAuthDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG: {
				BatchResequencerConfig batchResequencerConfig = (BatchResequencerConfig)theEObject;
				T result = caseBatchResequencerConfig(batchResequencerConfig);
				if (result == null) result = caseResequencerConfig(batchResequencerConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BEAN_CONSTRUCTOR_DEFINITION: {
				BeanConstructorDefinition beanConstructorDefinition = (BeanConstructorDefinition)theEObject;
				T result = caseBeanConstructorDefinition(beanConstructorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BEAN_CONSTRUCTORS_DEFINITION: {
				BeanConstructorsDefinition beanConstructorsDefinition = (BeanConstructorsDefinition)theEObject;
				T result = caseBeanConstructorsDefinition(beanConstructorsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BEAN_DEFINITION: {
				BeanDefinition beanDefinition = (BeanDefinition)theEObject;
				T result = caseBeanDefinition(beanDefinition);
				if (result == null) result = caseNoOutputDefinition(beanDefinition);
				if (result == null) result = caseProcessorDefinition(beanDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(beanDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION: {
				BeanFactoryDefinition beanFactoryDefinition = (BeanFactoryDefinition)theEObject;
				T result = caseBeanFactoryDefinition(beanFactoryDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BEANIO_DATA_FORMAT: {
				BeanioDataFormat beanioDataFormat = (BeanioDataFormat)theEObject;
				T result = caseBeanioDataFormat(beanioDataFormat);
				if (result == null) result = caseDataFormat(beanioDataFormat);
				if (result == null) result = caseIdentifiedType(beanioDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BEAN_PROPERTIES_DEFINITION: {
				BeanPropertiesDefinition beanPropertiesDefinition = (BeanPropertiesDefinition)theEObject;
				T result = caseBeanPropertiesDefinition(beanPropertiesDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BEAN_PROPERTY_DEFINITION: {
				BeanPropertyDefinition beanPropertyDefinition = (BeanPropertyDefinition)theEObject;
				T result = caseBeanPropertyDefinition(beanPropertyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BEANS_DEFINITION: {
				BeansDefinition beansDefinition = (BeansDefinition)theEObject;
				T result = caseBeansDefinition(beansDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BEARER_TOKEN_DEFINITION: {
				BearerTokenDefinition bearerTokenDefinition = (BearerTokenDefinition)theEObject;
				T result = caseBearerTokenDefinition(bearerTokenDefinition);
				if (result == null) result = caseRestSecurityDefinition(bearerTokenDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BINDY_DATA_FORMAT: {
				BindyDataFormat bindyDataFormat = (BindyDataFormat)theEObject;
				T result = caseBindyDataFormat(bindyDataFormat);
				if (result == null) result = caseDataFormat(bindyDataFormat);
				if (result == null) result = caseIdentifiedType(bindyDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.BLACKLIST_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: {
				BlacklistServiceCallServiceFilterConfiguration blacklistServiceCallServiceFilterConfiguration = (BlacklistServiceCallServiceFilterConfiguration)theEObject;
				T result = caseBlacklistServiceCallServiceFilterConfiguration(blacklistServiceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallServiceFilterConfiguration(blacklistServiceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallConfiguration(blacklistServiceCallServiceFilterConfiguration);
				if (result == null) result = caseIdentifiedType(blacklistServiceCallServiceFilterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: {
				CachingServiceCallServiceDiscoveryConfiguration cachingServiceCallServiceDiscoveryConfiguration = (CachingServiceCallServiceDiscoveryConfiguration)theEObject;
				T result = caseCachingServiceCallServiceDiscoveryConfiguration(cachingServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallServiceDiscoveryConfiguration(cachingServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallConfiguration(cachingServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseIdentifiedType(cachingServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_BEAN_POST_PROCESSOR: {
				CamelBeanPostProcessor camelBeanPostProcessor = (CamelBeanPostProcessor)theEObject;
				T result = caseCamelBeanPostProcessor(camelBeanPostProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN: {
				CamelConsumerTemplateFactoryBean camelConsumerTemplateFactoryBean = (CamelConsumerTemplateFactoryBean)theEObject;
				T result = caseCamelConsumerTemplateFactoryBean(camelConsumerTemplateFactoryBean);
				if (result == null) result = caseAbstractCamelConsumerTemplateFactoryBean(camelConsumerTemplateFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(camelConsumerTemplateFactoryBean);
				if (result == null) result = caseIdentifiedType(camelConsumerTemplateFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN: {
				CamelContextFactoryBean camelContextFactoryBean = (CamelContextFactoryBean)theEObject;
				T result = caseCamelContextFactoryBean(camelContextFactoryBean);
				if (result == null) result = caseAbstractCamelContextFactoryBean(camelContextFactoryBean);
				if (result == null) result = caseIdentifiedType(camelContextFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_ENDPOINT_FACTORY_BEAN: {
				CamelEndpointFactoryBean camelEndpointFactoryBean = (CamelEndpointFactoryBean)theEObject;
				T result = caseCamelEndpointFactoryBean(camelEndpointFactoryBean);
				if (result == null) result = caseAbstractCamelEndpointFactoryBean(camelEndpointFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(camelEndpointFactoryBean);
				if (result == null) result = caseIdentifiedType(camelEndpointFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_FLUENT_PRODUCER_TEMPLATE_FACTORY_BEAN: {
				CamelFluentProducerTemplateFactoryBean camelFluentProducerTemplateFactoryBean = (CamelFluentProducerTemplateFactoryBean)theEObject;
				T result = caseCamelFluentProducerTemplateFactoryBean(camelFluentProducerTemplateFactoryBean);
				if (result == null) result = caseAbstractCamelFluentProducerTemplateFactoryBean(camelFluentProducerTemplateFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(camelFluentProducerTemplateFactoryBean);
				if (result == null) result = caseIdentifiedType(camelFluentProducerTemplateFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION: {
				CamelJMXAgentDefinition camelJMXAgentDefinition = (CamelJMXAgentDefinition)theEObject;
				T result = caseCamelJMXAgentDefinition(camelJMXAgentDefinition);
				if (result == null) result = caseIdentifiedType(camelJMXAgentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN: {
				CamelProducerTemplateFactoryBean camelProducerTemplateFactoryBean = (CamelProducerTemplateFactoryBean)theEObject;
				T result = caseCamelProducerTemplateFactoryBean(camelProducerTemplateFactoryBean);
				if (result == null) result = caseAbstractCamelProducerTemplateFactoryBean(camelProducerTemplateFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(camelProducerTemplateFactoryBean);
				if (result == null) result = caseIdentifiedType(camelProducerTemplateFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION: {
				CamelPropertyPlaceholderDefinition camelPropertyPlaceholderDefinition = (CamelPropertyPlaceholderDefinition)theEObject;
				T result = caseCamelPropertyPlaceholderDefinition(camelPropertyPlaceholderDefinition);
				if (result == null) result = caseIdentifiedType(camelPropertyPlaceholderDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_FUNCTION_DEFINITION: {
				CamelPropertyPlaceholderFunctionDefinition camelPropertyPlaceholderFunctionDefinition = (CamelPropertyPlaceholderFunctionDefinition)theEObject;
				T result = caseCamelPropertyPlaceholderFunctionDefinition(camelPropertyPlaceholderFunctionDefinition);
				if (result == null) result = caseIdentifiedType(camelPropertyPlaceholderFunctionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION: {
				CamelPropertyPlaceholderLocationDefinition camelPropertyPlaceholderLocationDefinition = (CamelPropertyPlaceholderLocationDefinition)theEObject;
				T result = caseCamelPropertyPlaceholderLocationDefinition(camelPropertyPlaceholderLocationDefinition);
				if (result == null) result = caseIdentifiedType(camelPropertyPlaceholderLocationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_REDELIVERY_POLICY_FACTORY_BEAN: {
				CamelRedeliveryPolicyFactoryBean camelRedeliveryPolicyFactoryBean = (CamelRedeliveryPolicyFactoryBean)theEObject;
				T result = caseCamelRedeliveryPolicyFactoryBean(camelRedeliveryPolicyFactoryBean);
				if (result == null) result = caseAbstractCamelRedeliveryPolicyFactoryBean(camelRedeliveryPolicyFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(camelRedeliveryPolicyFactoryBean);
				if (result == null) result = caseIdentifiedType(camelRedeliveryPolicyFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_REST_CONTEXT_FACTORY_BEAN: {
				CamelRestContextFactoryBean camelRestContextFactoryBean = (CamelRestContextFactoryBean)theEObject;
				T result = caseCamelRestContextFactoryBean(camelRestContextFactoryBean);
				if (result == null) result = caseIdentifiedType(camelRestContextFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_ROUTE_CONFIGURATION_CONTEXT_FACTORY_BEAN: {
				CamelRouteConfigurationContextFactoryBean camelRouteConfigurationContextFactoryBean = (CamelRouteConfigurationContextFactoryBean)theEObject;
				T result = caseCamelRouteConfigurationContextFactoryBean(camelRouteConfigurationContextFactoryBean);
				if (result == null) result = caseIdentifiedType(camelRouteConfigurationContextFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_ROUTE_CONTEXT_FACTORY_BEAN: {
				CamelRouteContextFactoryBean camelRouteContextFactoryBean = (CamelRouteContextFactoryBean)theEObject;
				T result = caseCamelRouteContextFactoryBean(camelRouteContextFactoryBean);
				if (result == null) result = caseIdentifiedType(camelRouteContextFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION: {
				CamelRouteControllerDefinition camelRouteControllerDefinition = (CamelRouteControllerDefinition)theEObject;
				T result = caseCamelRouteControllerDefinition(camelRouteControllerDefinition);
				if (result == null) result = caseIdentifiedType(camelRouteControllerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_ROUTE_TEMPLATE_CONTEXT_FACTORY_BEAN: {
				CamelRouteTemplateContextFactoryBean camelRouteTemplateContextFactoryBean = (CamelRouteTemplateContextFactoryBean)theEObject;
				T result = caseCamelRouteTemplateContextFactoryBean(camelRouteTemplateContextFactoryBean);
				if (result == null) result = caseIdentifiedType(camelRouteTemplateContextFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION: {
				CamelStreamCachingStrategyDefinition camelStreamCachingStrategyDefinition = (CamelStreamCachingStrategyDefinition)theEObject;
				T result = caseCamelStreamCachingStrategyDefinition(camelStreamCachingStrategyDefinition);
				if (result == null) result = caseIdentifiedType(camelStreamCachingStrategyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CAMEL_THREAD_POOL_FACTORY_BEAN: {
				CamelThreadPoolFactoryBean camelThreadPoolFactoryBean = (CamelThreadPoolFactoryBean)theEObject;
				T result = caseCamelThreadPoolFactoryBean(camelThreadPoolFactoryBean);
				if (result == null) result = caseAbstractCamelThreadPoolFactoryBean(camelThreadPoolFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(camelThreadPoolFactoryBean);
				if (result == null) result = caseIdentifiedType(camelThreadPoolFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CATCH_DEFINITION: {
				CatchDefinition catchDefinition = (CatchDefinition)theEObject;
				T result = caseCatchDefinition(catchDefinition);
				if (result == null) result = caseOutput(catchDefinition);
				if (result == null) result = caseProcessorDefinition(catchDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(catchDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CBOR_DATA_FORMAT: {
				CborDataFormat cborDataFormat = (CborDataFormat)theEObject;
				T result = caseCborDataFormat(cborDataFormat);
				if (result == null) result = caseDataFormat(cborDataFormat);
				if (result == null) result = caseIdentifiedType(cborDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CHOICE_DEFINITION: {
				ChoiceDefinition choiceDefinition = (ChoiceDefinition)theEObject;
				T result = caseChoiceDefinition(choiceDefinition);
				if (result == null) result = caseNoOutputDefinition(choiceDefinition);
				if (result == null) result = caseProcessorDefinition(choiceDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(choiceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CIPHER_SUITES_PARAMETERS: {
				CipherSuitesParameters cipherSuitesParameters = (CipherSuitesParameters)theEObject;
				T result = caseCipherSuitesParameters(cipherSuitesParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION: {
				CircuitBreakerDefinition circuitBreakerDefinition = (CircuitBreakerDefinition)theEObject;
				T result = caseCircuitBreakerDefinition(circuitBreakerDefinition);
				if (result == null) result = caseOutput(circuitBreakerDefinition);
				if (result == null) result = caseProcessorDefinition(circuitBreakerDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(circuitBreakerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION: {
				ClaimCheckDefinition claimCheckDefinition = (ClaimCheckDefinition)theEObject;
				T result = caseClaimCheckDefinition(claimCheckDefinition);
				if (result == null) result = caseNoOutputDefinition(claimCheckDefinition);
				if (result == null) result = caseProcessorDefinition(claimCheckDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(claimCheckDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: {
				CombinedServiceCallServiceDiscoveryConfiguration combinedServiceCallServiceDiscoveryConfiguration = (CombinedServiceCallServiceDiscoveryConfiguration)theEObject;
				T result = caseCombinedServiceCallServiceDiscoveryConfiguration(combinedServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallServiceDiscoveryConfiguration(combinedServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallConfiguration(combinedServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseIdentifiedType(combinedServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: {
				CombinedServiceCallServiceFilterConfiguration combinedServiceCallServiceFilterConfiguration = (CombinedServiceCallServiceFilterConfiguration)theEObject;
				T result = caseCombinedServiceCallServiceFilterConfiguration(combinedServiceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallServiceFilterConfiguration(combinedServiceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallConfiguration(combinedServiceCallServiceFilterConfiguration);
				if (result == null) result = caseIdentifiedType(combinedServiceCallServiceFilterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.COMPONENT_SCAN_DEFINITION: {
				ComponentScanDefinition componentScanDefinition = (ComponentScanDefinition)theEObject;
				T result = caseComponentScanDefinition(componentScanDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CONSTANT_EXPRESSION: {
				ConstantExpression constantExpression = (ConstantExpression)theEObject;
				T result = caseConstantExpression(constantExpression);
				if (result == null) result = caseTypedExpressionDefinition(constantExpression);
				if (result == null) result = caseExpression(constantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CONSTANTS: {
				Constants constants = (Constants)theEObject;
				T result = caseConstants(constants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: {
				ConsulServiceCallServiceDiscoveryConfiguration consulServiceCallServiceDiscoveryConfiguration = (ConsulServiceCallServiceDiscoveryConfiguration)theEObject;
				T result = caseConsulServiceCallServiceDiscoveryConfiguration(consulServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallServiceDiscoveryConfiguration(consulServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallConfiguration(consulServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseIdentifiedType(consulServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION: {
				ContextScanDefinition contextScanDefinition = (ContextScanDefinition)theEObject;
				T result = caseContextScanDefinition(contextScanDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CONVERT_BODY_DEFINITION: {
				ConvertBodyDefinition convertBodyDefinition = (ConvertBodyDefinition)theEObject;
				T result = caseConvertBodyDefinition(convertBodyDefinition);
				if (result == null) result = caseNoOutputDefinition(convertBodyDefinition);
				if (result == null) result = caseProcessorDefinition(convertBodyDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(convertBodyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CONVERT_HEADER_DEFINITION: {
				ConvertHeaderDefinition convertHeaderDefinition = (ConvertHeaderDefinition)theEObject;
				T result = caseConvertHeaderDefinition(convertHeaderDefinition);
				if (result == null) result = caseNoOutputDefinition(convertHeaderDefinition);
				if (result == null) result = caseProcessorDefinition(convertHeaderDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(convertHeaderDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION: {
				ConvertVariableDefinition convertVariableDefinition = (ConvertVariableDefinition)theEObject;
				T result = caseConvertVariableDefinition(convertVariableDefinition);
				if (result == null) result = caseNoOutputDefinition(convertVariableDefinition);
				if (result == null) result = caseProcessorDefinition(convertVariableDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(convertVariableDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CRYPTO_DATA_FORMAT: {
				CryptoDataFormat cryptoDataFormat = (CryptoDataFormat)theEObject;
				T result = caseCryptoDataFormat(cryptoDataFormat);
				if (result == null) result = caseDataFormat(cryptoDataFormat);
				if (result == null) result = caseIdentifiedType(cryptoDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CSIMPLE_EXPRESSION: {
				CSimpleExpression cSimpleExpression = (CSimpleExpression)theEObject;
				T result = caseCSimpleExpression(cSimpleExpression);
				if (result == null) result = caseTypedExpressionDefinition(cSimpleExpression);
				if (result == null) result = caseExpression(cSimpleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CSV_DATA_FORMAT: {
				CsvDataFormat csvDataFormat = (CsvDataFormat)theEObject;
				T result = caseCsvDataFormat(csvDataFormat);
				if (result == null) result = caseDataFormat(csvDataFormat);
				if (result == null) result = caseIdentifiedType(csvDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CUSTOM_DATA_FORMAT: {
				CustomDataFormat customDataFormat = (CustomDataFormat)theEObject;
				T result = caseCustomDataFormat(customDataFormat);
				if (result == null) result = caseDataFormat(customDataFormat);
				if (result == null) result = caseIdentifiedType(customDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CUSTOM_LOAD_BALANCER_DEFINITION: {
				CustomLoadBalancerDefinition customLoadBalancerDefinition = (CustomLoadBalancerDefinition)theEObject;
				T result = caseCustomLoadBalancerDefinition(customLoadBalancerDefinition);
				if (result == null) result = caseLoadBalancerDefinition(customLoadBalancerDefinition);
				if (result == null) result = caseIdentifiedType(customLoadBalancerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CUSTOM_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: {
				CustomServiceCallServiceFilterConfiguration customServiceCallServiceFilterConfiguration = (CustomServiceCallServiceFilterConfiguration)theEObject;
				T result = caseCustomServiceCallServiceFilterConfiguration(customServiceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallServiceFilterConfiguration(customServiceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallConfiguration(customServiceCallServiceFilterConfiguration);
				if (result == null) result = caseIdentifiedType(customServiceCallServiceFilterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CUSTOM_TRANSFORMER_DEFINITION: {
				CustomTransformerDefinition customTransformerDefinition = (CustomTransformerDefinition)theEObject;
				T result = caseCustomTransformerDefinition(customTransformerDefinition);
				if (result == null) result = caseTransformer(customTransformerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.CUSTOM_VALIDATOR_DEFINITION: {
				CustomValidatorDefinition customValidatorDefinition = (CustomValidatorDefinition)theEObject;
				T result = caseCustomValidatorDefinition(customValidatorDefinition);
				if (result == null) result = caseValidator(customValidatorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DATA_FORMAT: {
				DataFormat dataFormat = (DataFormat)theEObject;
				T result = caseDataFormat(dataFormat);
				if (result == null) result = caseIdentifiedType(dataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DATA_FORMATS_DEFINITION: {
				DataFormatsDefinition dataFormatsDefinition = (DataFormatsDefinition)theEObject;
				T result = caseDataFormatsDefinition(dataFormatsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DATA_FORMATS_TYPE: {
				DataFormatsType dataFormatsType = (DataFormatsType)theEObject;
				T result = caseDataFormatsType(dataFormatsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DATA_FORMAT_TRANSFORMER_DEFINITION: {
				DataFormatTransformerDefinition dataFormatTransformerDefinition = (DataFormatTransformerDefinition)theEObject;
				T result = caseDataFormatTransformerDefinition(dataFormatTransformerDefinition);
				if (result == null) result = caseTransformer(dataFormatTransformerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DATASONNET_EXPRESSION: {
				DatasonnetExpression datasonnetExpression = (DatasonnetExpression)theEObject;
				T result = caseDatasonnetExpression(datasonnetExpression);
				if (result == null) result = caseSingleInputTypedExpressionDefinition(datasonnetExpression);
				if (result == null) result = caseTypedExpressionDefinition(datasonnetExpression);
				if (result == null) result = caseExpression(datasonnetExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION: {
				DeadLetterChannelDefinition deadLetterChannelDefinition = (DeadLetterChannelDefinition)theEObject;
				T result = caseDeadLetterChannelDefinition(deadLetterChannelDefinition);
				if (result == null) result = caseDefaultErrorHandlerDefinition(deadLetterChannelDefinition);
				if (result == null) result = caseBaseErrorHandlerDefinition(deadLetterChannelDefinition);
				if (result == null) result = caseIdentifiedType(deadLetterChannelDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION: {
				DefaultErrorHandlerDefinition defaultErrorHandlerDefinition = (DefaultErrorHandlerDefinition)theEObject;
				T result = caseDefaultErrorHandlerDefinition(defaultErrorHandlerDefinition);
				if (result == null) result = caseBaseErrorHandlerDefinition(defaultErrorHandlerDefinition);
				if (result == null) result = caseIdentifiedType(defaultErrorHandlerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DEFAULT_SERVICE_CALL_SERVICE_LOAD_BALANCER_CONFIGURATION: {
				DefaultServiceCallServiceLoadBalancerConfiguration defaultServiceCallServiceLoadBalancerConfiguration = (DefaultServiceCallServiceLoadBalancerConfiguration)theEObject;
				T result = caseDefaultServiceCallServiceLoadBalancerConfiguration(defaultServiceCallServiceLoadBalancerConfiguration);
				if (result == null) result = caseServiceCallServiceLoadBalancerConfiguration(defaultServiceCallServiceLoadBalancerConfiguration);
				if (result == null) result = caseServiceCallConfiguration(defaultServiceCallServiceLoadBalancerConfiguration);
				if (result == null) result = caseIdentifiedType(defaultServiceCallServiceLoadBalancerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DELAY_DEFINITION: {
				DelayDefinition delayDefinition = (DelayDefinition)theEObject;
				T result = caseDelayDefinition(delayDefinition);
				if (result == null) result = caseProcessorDefinition(delayDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(delayDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DELETE_DEFINITION: {
				DeleteDefinition deleteDefinition = (DeleteDefinition)theEObject;
				T result = caseDeleteDefinition(deleteDefinition);
				if (result == null) result = caseVerbDefinition(deleteDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(deleteDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DFDL_DATA_FORMAT: {
				DfdlDataFormat dfdlDataFormat = (DfdlDataFormat)theEObject;
				T result = caseDfdlDataFormat(dfdlDataFormat);
				if (result == null) result = caseDataFormat(dfdlDataFormat);
				if (result == null) result = caseIdentifiedType(dfdlDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: {
				DnsServiceCallServiceDiscoveryConfiguration dnsServiceCallServiceDiscoveryConfiguration = (DnsServiceCallServiceDiscoveryConfiguration)theEObject;
				T result = caseDnsServiceCallServiceDiscoveryConfiguration(dnsServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallServiceDiscoveryConfiguration(dnsServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallConfiguration(dnsServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseIdentifiedType(dnsServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.DYNAMIC_ROUTER_DEFINITION: {
				DynamicRouterDefinition dynamicRouterDefinition = (DynamicRouterDefinition)theEObject;
				T result = caseDynamicRouterDefinition(dynamicRouterDefinition);
				if (result == null) result = caseProcessorDefinition(dynamicRouterDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(dynamicRouterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ENDPOINT_TRANSFORMER_DEFINITION: {
				EndpointTransformerDefinition endpointTransformerDefinition = (EndpointTransformerDefinition)theEObject;
				T result = caseEndpointTransformerDefinition(endpointTransformerDefinition);
				if (result == null) result = caseTransformer(endpointTransformerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ENDPOINT_VALIDATOR_DEFINITION: {
				EndpointValidatorDefinition endpointValidatorDefinition = (EndpointValidatorDefinition)theEObject;
				T result = caseEndpointValidatorDefinition(endpointValidatorDefinition);
				if (result == null) result = caseValidator(endpointValidatorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ENRICH_DEFINITION: {
				EnrichDefinition enrichDefinition = (EnrichDefinition)theEObject;
				T result = caseEnrichDefinition(enrichDefinition);
				if (result == null) result = caseProcessorDefinition(enrichDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(enrichDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION: {
				ErrorHandlerDefinition errorHandlerDefinition = (ErrorHandlerDefinition)theEObject;
				T result = caseErrorHandlerDefinition(errorHandlerDefinition);
				if (result == null) result = caseIdentifiedType(errorHandlerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.EXCHANGE_PROPERTY_EXPRESSION: {
				ExchangePropertyExpression exchangePropertyExpression = (ExchangePropertyExpression)theEObject;
				T result = caseExchangePropertyExpression(exchangePropertyExpression);
				if (result == null) result = caseExpression(exchangePropertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION: {
				ExpressionSubElementDefinition expressionSubElementDefinition = (ExpressionSubElementDefinition)theEObject;
				T result = caseExpressionSubElementDefinition(expressionSubElementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION: {
				FailoverLoadBalancerDefinition failoverLoadBalancerDefinition = (FailoverLoadBalancerDefinition)theEObject;
				T result = caseFailoverLoadBalancerDefinition(failoverLoadBalancerDefinition);
				if (result == null) result = caseLoadBalancerDefinition(failoverLoadBalancerDefinition);
				if (result == null) result = caseIdentifiedType(failoverLoadBalancerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON: {
				FaultToleranceConfigurationCommon faultToleranceConfigurationCommon = (FaultToleranceConfigurationCommon)theEObject;
				T result = caseFaultToleranceConfigurationCommon(faultToleranceConfigurationCommon);
				if (result == null) result = caseIdentifiedType(faultToleranceConfigurationCommon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_DEFINITION: {
				FaultToleranceConfigurationDefinition faultToleranceConfigurationDefinition = (FaultToleranceConfigurationDefinition)theEObject;
				T result = caseFaultToleranceConfigurationDefinition(faultToleranceConfigurationDefinition);
				if (result == null) result = caseFaultToleranceConfigurationCommon(faultToleranceConfigurationDefinition);
				if (result == null) result = caseIdentifiedType(faultToleranceConfigurationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FHIR_DATAFORMAT: {
				FhirDataformat fhirDataformat = (FhirDataformat)theEObject;
				T result = caseFhirDataformat(fhirDataformat);
				if (result == null) result = caseDataFormat(fhirDataformat);
				if (result == null) result = caseIdentifiedType(fhirDataformat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FHIR_JSON_DATA_FORMAT: {
				FhirJsonDataFormat fhirJsonDataFormat = (FhirJsonDataFormat)theEObject;
				T result = caseFhirJsonDataFormat(fhirJsonDataFormat);
				if (result == null) result = caseFhirDataformat(fhirJsonDataFormat);
				if (result == null) result = caseDataFormat(fhirJsonDataFormat);
				if (result == null) result = caseIdentifiedType(fhirJsonDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FHIR_XML_DATA_FORMAT: {
				FhirXmlDataFormat fhirXmlDataFormat = (FhirXmlDataFormat)theEObject;
				T result = caseFhirXmlDataFormat(fhirXmlDataFormat);
				if (result == null) result = caseFhirDataformat(fhirXmlDataFormat);
				if (result == null) result = caseDataFormat(fhirXmlDataFormat);
				if (result == null) result = caseIdentifiedType(fhirXmlDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FILTER_DEFINITION: {
				FilterDefinition filterDefinition = (FilterDefinition)theEObject;
				T result = caseFilterDefinition(filterDefinition);
				if (result == null) result = caseProcessorDefinition(filterDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(filterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FILTER_PARAMETERS: {
				FilterParameters filterParameters = (FilterParameters)theEObject;
				T result = caseFilterParameters(filterParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FINALLY_DEFINITION: {
				FinallyDefinition finallyDefinition = (FinallyDefinition)theEObject;
				T result = caseFinallyDefinition(finallyDefinition);
				if (result == null) result = caseOutput(finallyDefinition);
				if (result == null) result = caseProcessorDefinition(finallyDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(finallyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FLATPACK_DATA_FORMAT: {
				FlatpackDataFormat flatpackDataFormat = (FlatpackDataFormat)theEObject;
				T result = caseFlatpackDataFormat(flatpackDataFormat);
				if (result == null) result = caseDataFormat(flatpackDataFormat);
				if (result == null) result = caseIdentifiedType(flatpackDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FORY_DATA_FORMAT: {
				ForyDataFormat foryDataFormat = (ForyDataFormat)theEObject;
				T result = caseForyDataFormat(foryDataFormat);
				if (result == null) result = caseDataFormat(foryDataFormat);
				if (result == null) result = caseIdentifiedType(foryDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.FROM_DEFINITION: {
				FromDefinition fromDefinition = (FromDefinition)theEObject;
				T result = caseFromDefinition(fromDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(fromDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.GET_DEFINITION: {
				GetDefinition getDefinition = (GetDefinition)theEObject;
				T result = caseGetDefinition(getDefinition);
				if (result == null) result = caseVerbDefinition(getDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(getDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.GLOBAL_OPTION_DEFINITION: {
				GlobalOptionDefinition globalOptionDefinition = (GlobalOptionDefinition)theEObject;
				T result = caseGlobalOptionDefinition(globalOptionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.GLOBAL_OPTIONS_DEFINITION: {
				GlobalOptionsDefinition globalOptionsDefinition = (GlobalOptionsDefinition)theEObject;
				T result = caseGlobalOptionsDefinition(globalOptionsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.GROK_DATA_FORMAT: {
				GrokDataFormat grokDataFormat = (GrokDataFormat)theEObject;
				T result = caseGrokDataFormat(grokDataFormat);
				if (result == null) result = caseDataFormat(grokDataFormat);
				if (result == null) result = caseIdentifiedType(grokDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.GROOVY_EXPRESSION: {
				GroovyExpression groovyExpression = (GroovyExpression)theEObject;
				T result = caseGroovyExpression(groovyExpression);
				if (result == null) result = caseTypedExpressionDefinition(groovyExpression);
				if (result == null) result = caseExpression(groovyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.GZIP_DEFLATER_DATA_FORMAT: {
				GzipDeflaterDataFormat gzipDeflaterDataFormat = (GzipDeflaterDataFormat)theEObject;
				T result = caseGzipDeflaterDataFormat(gzipDeflaterDataFormat);
				if (result == null) result = caseDataFormat(gzipDeflaterDataFormat);
				if (result == null) result = caseIdentifiedType(gzipDeflaterDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.HEAD_DEFINITION: {
				HeadDefinition headDefinition = (HeadDefinition)theEObject;
				T result = caseHeadDefinition(headDefinition);
				if (result == null) result = caseVerbDefinition(headDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(headDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.HEADER_EXPRESSION: {
				HeaderExpression headerExpression = (HeaderExpression)theEObject;
				T result = caseHeaderExpression(headerExpression);
				if (result == null) result = caseExpression(headerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.HEALTHY_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: {
				HealthyServiceCallServiceFilterConfiguration healthyServiceCallServiceFilterConfiguration = (HealthyServiceCallServiceFilterConfiguration)theEObject;
				T result = caseHealthyServiceCallServiceFilterConfiguration(healthyServiceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallServiceFilterConfiguration(healthyServiceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallConfiguration(healthyServiceCallServiceFilterConfiguration);
				if (result == null) result = caseIdentifiedType(healthyServiceCallServiceFilterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.HL7_DATA_FORMAT: {
				Hl7DataFormat hl7DataFormat = (Hl7DataFormat)theEObject;
				T result = caseHl7DataFormat(hl7DataFormat);
				if (result == null) result = caseDataFormat(hl7DataFormat);
				if (result == null) result = caseIdentifiedType(hl7DataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.HL7_TERSER_EXPRESSION: {
				Hl7TerserExpression hl7TerserExpression = (Hl7TerserExpression)theEObject;
				T result = caseHl7TerserExpression(hl7TerserExpression);
				if (result == null) result = caseSingleInputTypedExpressionDefinition(hl7TerserExpression);
				if (result == null) result = caseTypedExpressionDefinition(hl7TerserExpression);
				if (result == null) result = caseExpression(hl7TerserExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ICAL_DATA_FORMAT: {
				IcalDataFormat icalDataFormat = (IcalDataFormat)theEObject;
				T result = caseIcalDataFormat(icalDataFormat);
				if (result == null) result = caseDataFormat(icalDataFormat);
				if (result == null) result = caseIdentifiedType(icalDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.IDEMPOTENT_CONSUMER_DEFINITION: {
				IdempotentConsumerDefinition idempotentConsumerDefinition = (IdempotentConsumerDefinition)theEObject;
				T result = caseIdempotentConsumerDefinition(idempotentConsumerDefinition);
				if (result == null) result = caseProcessorDefinition(idempotentConsumerDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(idempotentConsumerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.IDENTIFIED_TYPE: {
				IdentifiedType identifiedType = (IdentifiedType)theEObject;
				T result = caseIdentifiedType(identifiedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.INPUT_TYPE_DEFINITION: {
				InputTypeDefinition inputTypeDefinition = (InputTypeDefinition)theEObject;
				T result = caseInputTypeDefinition(inputTypeDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(inputTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.INTERCEPT_DEFINITION: {
				InterceptDefinition interceptDefinition = (InterceptDefinition)theEObject;
				T result = caseInterceptDefinition(interceptDefinition);
				if (result == null) result = caseOutput(interceptDefinition);
				if (result == null) result = caseProcessorDefinition(interceptDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(interceptDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.INTERCEPT_FROM_DEFINITION: {
				InterceptFromDefinition interceptFromDefinition = (InterceptFromDefinition)theEObject;
				T result = caseInterceptFromDefinition(interceptFromDefinition);
				if (result == null) result = caseInterceptDefinition(interceptFromDefinition);
				if (result == null) result = caseOutput(interceptFromDefinition);
				if (result == null) result = caseProcessorDefinition(interceptFromDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(interceptFromDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION: {
				InterceptSendToEndpointDefinition interceptSendToEndpointDefinition = (InterceptSendToEndpointDefinition)theEObject;
				T result = caseInterceptSendToEndpointDefinition(interceptSendToEndpointDefinition);
				if (result == null) result = caseOutput(interceptSendToEndpointDefinition);
				if (result == null) result = caseProcessorDefinition(interceptSendToEndpointDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(interceptSendToEndpointDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ISO8583_DATA_FORMAT: {
				Iso8583DataFormat iso8583DataFormat = (Iso8583DataFormat)theEObject;
				T result = caseIso8583DataFormat(iso8583DataFormat);
				if (result == null) result = caseDataFormat(iso8583DataFormat);
				if (result == null) result = caseIdentifiedType(iso8583DataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT: {
				JacksonXMLDataFormat jacksonXMLDataFormat = (JacksonXMLDataFormat)theEObject;
				T result = caseJacksonXMLDataFormat(jacksonXMLDataFormat);
				if (result == null) result = caseDataFormat(jacksonXMLDataFormat);
				if (result == null) result = caseIdentifiedType(jacksonXMLDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.JAVA_EXPRESSION: {
				JavaExpression javaExpression = (JavaExpression)theEObject;
				T result = caseJavaExpression(javaExpression);
				if (result == null) result = caseTypedExpressionDefinition(javaExpression);
				if (result == null) result = caseExpression(javaExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.JAVA_SCRIPT_EXPRESSION: {
				JavaScriptExpression javaScriptExpression = (JavaScriptExpression)theEObject;
				T result = caseJavaScriptExpression(javaScriptExpression);
				if (result == null) result = caseTypedExpressionDefinition(javaScriptExpression);
				if (result == null) result = caseExpression(javaScriptExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.JAXB_DATA_FORMAT: {
				JaxbDataFormat jaxbDataFormat = (JaxbDataFormat)theEObject;
				T result = caseJaxbDataFormat(jaxbDataFormat);
				if (result == null) result = caseDataFormat(jaxbDataFormat);
				if (result == null) result = caseIdentifiedType(jaxbDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.JOOR_EXPRESSION: {
				JoorExpression joorExpression = (JoorExpression)theEObject;
				T result = caseJoorExpression(joorExpression);
				if (result == null) result = caseTypedExpressionDefinition(joorExpression);
				if (result == null) result = caseExpression(joorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.JQ_EXPRESSION: {
				JqExpression jqExpression = (JqExpression)theEObject;
				T result = caseJqExpression(jqExpression);
				if (result == null) result = caseSingleInputTypedExpressionDefinition(jqExpression);
				if (result == null) result = caseTypedExpressionDefinition(jqExpression);
				if (result == null) result = caseExpression(jqExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.JSON_API_DATA_FORMAT: {
				JsonApiDataFormat jsonApiDataFormat = (JsonApiDataFormat)theEObject;
				T result = caseJsonApiDataFormat(jsonApiDataFormat);
				if (result == null) result = caseDataFormat(jsonApiDataFormat);
				if (result == null) result = caseIdentifiedType(jsonApiDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.JSON_DATA_FORMAT: {
				JsonDataFormat jsonDataFormat = (JsonDataFormat)theEObject;
				T result = caseJsonDataFormat(jsonDataFormat);
				if (result == null) result = caseDataFormat(jsonDataFormat);
				if (result == null) result = caseIdentifiedType(jsonDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.JSON_PATH_EXPRESSION: {
				JsonPathExpression jsonPathExpression = (JsonPathExpression)theEObject;
				T result = caseJsonPathExpression(jsonPathExpression);
				if (result == null) result = caseSingleInputTypedExpressionDefinition(jsonPathExpression);
				if (result == null) result = caseTypedExpressionDefinition(jsonPathExpression);
				if (result == null) result = caseExpression(jsonPathExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.JTA_TRANSACTION_ERROR_HANDLER_DEFINITION: {
				JtaTransactionErrorHandlerDefinition jtaTransactionErrorHandlerDefinition = (JtaTransactionErrorHandlerDefinition)theEObject;
				T result = caseJtaTransactionErrorHandlerDefinition(jtaTransactionErrorHandlerDefinition);
				if (result == null) result = caseTransactionErrorHandlerDefinition(jtaTransactionErrorHandlerDefinition);
				if (result == null) result = caseDefaultErrorHandlerDefinition(jtaTransactionErrorHandlerDefinition);
				if (result == null) result = caseBaseErrorHandlerDefinition(jtaTransactionErrorHandlerDefinition);
				if (result == null) result = caseIdentifiedType(jtaTransactionErrorHandlerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.KAMELET_DEFINITION: {
				KameletDefinition kameletDefinition = (KameletDefinition)theEObject;
				T result = caseKameletDefinition(kameletDefinition);
				if (result == null) result = caseOutput(kameletDefinition);
				if (result == null) result = caseProcessorDefinition(kameletDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(kameletDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN: {
				KeyManagersParametersFactoryBean keyManagersParametersFactoryBean = (KeyManagersParametersFactoryBean)theEObject;
				T result = caseKeyManagersParametersFactoryBean(keyManagersParametersFactoryBean);
				if (result == null) result = caseAbstractKeyManagersParametersFactoryBean(keyManagersParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(keyManagersParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(keyManagersParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(keyManagersParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.KEY_STORE_PARAMETERS_FACTORY_BEAN: {
				KeyStoreParametersFactoryBean keyStoreParametersFactoryBean = (KeyStoreParametersFactoryBean)theEObject;
				T result = caseKeyStoreParametersFactoryBean(keyStoreParametersFactoryBean);
				if (result == null) result = caseAbstractKeyStoreParametersFactoryBean(keyStoreParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(keyStoreParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(keyStoreParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(keyStoreParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: {
				KubernetesServiceCallServiceDiscoveryConfiguration kubernetesServiceCallServiceDiscoveryConfiguration = (KubernetesServiceCallServiceDiscoveryConfiguration)theEObject;
				T result = caseKubernetesServiceCallServiceDiscoveryConfiguration(kubernetesServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallServiceDiscoveryConfiguration(kubernetesServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallConfiguration(kubernetesServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseIdentifiedType(kubernetesServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LANG_CHAIN4_JCHARACTER_TOKENIZER_DEFINITION: {
				LangChain4JCharacterTokenizerDefinition langChain4JCharacterTokenizerDefinition = (LangChain4JCharacterTokenizerDefinition)theEObject;
				T result = caseLangChain4JCharacterTokenizerDefinition(langChain4JCharacterTokenizerDefinition);
				if (result == null) result = caseLangChain4jTokenizerImplementation(langChain4JCharacterTokenizerDefinition);
				if (result == null) result = caseTokenizerImplementation(langChain4JCharacterTokenizerDefinition);
				if (result == null) result = caseIdentifiedType(langChain4JCharacterTokenizerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LANG_CHAIN4_JLINE_TOKENIZER_DEFINITION: {
				LangChain4JLineTokenizerDefinition langChain4JLineTokenizerDefinition = (LangChain4JLineTokenizerDefinition)theEObject;
				T result = caseLangChain4JLineTokenizerDefinition(langChain4JLineTokenizerDefinition);
				if (result == null) result = caseLangChain4jTokenizerImplementation(langChain4JLineTokenizerDefinition);
				if (result == null) result = caseTokenizerImplementation(langChain4JLineTokenizerDefinition);
				if (result == null) result = caseIdentifiedType(langChain4JLineTokenizerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LANG_CHAIN4_JPARAGRAPH_TOKENIZER_DEFINITION: {
				LangChain4JParagraphTokenizerDefinition langChain4JParagraphTokenizerDefinition = (LangChain4JParagraphTokenizerDefinition)theEObject;
				T result = caseLangChain4JParagraphTokenizerDefinition(langChain4JParagraphTokenizerDefinition);
				if (result == null) result = caseLangChain4jTokenizerImplementation(langChain4JParagraphTokenizerDefinition);
				if (result == null) result = caseTokenizerImplementation(langChain4JParagraphTokenizerDefinition);
				if (result == null) result = caseIdentifiedType(langChain4JParagraphTokenizerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LANG_CHAIN4_JSENTENCE_TOKENIZER_DEFINITION: {
				LangChain4JSentenceTokenizerDefinition langChain4JSentenceTokenizerDefinition = (LangChain4JSentenceTokenizerDefinition)theEObject;
				T result = caseLangChain4JSentenceTokenizerDefinition(langChain4JSentenceTokenizerDefinition);
				if (result == null) result = caseLangChain4jTokenizerImplementation(langChain4JSentenceTokenizerDefinition);
				if (result == null) result = caseTokenizerImplementation(langChain4JSentenceTokenizerDefinition);
				if (result == null) result = caseIdentifiedType(langChain4JSentenceTokenizerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION: {
				LangChain4jTokenizerImplementation langChain4jTokenizerImplementation = (LangChain4jTokenizerImplementation)theEObject;
				T result = caseLangChain4jTokenizerImplementation(langChain4jTokenizerImplementation);
				if (result == null) result = caseTokenizerImplementation(langChain4jTokenizerImplementation);
				if (result == null) result = caseIdentifiedType(langChain4jTokenizerImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LANG_CHAIN4_JWORD_TOKENIZER_DEFINITION: {
				LangChain4JWordTokenizerDefinition langChain4JWordTokenizerDefinition = (LangChain4JWordTokenizerDefinition)theEObject;
				T result = caseLangChain4JWordTokenizerDefinition(langChain4JWordTokenizerDefinition);
				if (result == null) result = caseLangChain4jTokenizerImplementation(langChain4JWordTokenizerDefinition);
				if (result == null) result = caseTokenizerImplementation(langChain4JWordTokenizerDefinition);
				if (result == null) result = caseIdentifiedType(langChain4JWordTokenizerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LANGUAGE_EXPRESSION: {
				LanguageExpression languageExpression = (LanguageExpression)theEObject;
				T result = caseLanguageExpression(languageExpression);
				if (result == null) result = caseExpression(languageExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LOAD_BALANCE_DEFINITION: {
				LoadBalanceDefinition loadBalanceDefinition = (LoadBalanceDefinition)theEObject;
				T result = caseLoadBalanceDefinition(loadBalanceDefinition);
				if (result == null) result = caseOutput(loadBalanceDefinition);
				if (result == null) result = caseProcessorDefinition(loadBalanceDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(loadBalanceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LOAD_BALANCER_DEFINITION: {
				LoadBalancerDefinition loadBalancerDefinition = (LoadBalancerDefinition)theEObject;
				T result = caseLoadBalancerDefinition(loadBalancerDefinition);
				if (result == null) result = caseIdentifiedType(loadBalancerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION: {
				LoadTransformerDefinition loadTransformerDefinition = (LoadTransformerDefinition)theEObject;
				T result = caseLoadTransformerDefinition(loadTransformerDefinition);
				if (result == null) result = caseTransformer(loadTransformerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LOG_DEFINITION: {
				LogDefinition logDefinition = (LogDefinition)theEObject;
				T result = caseLogDefinition(logDefinition);
				if (result == null) result = caseNoOutputDefinition(logDefinition);
				if (result == null) result = caseProcessorDefinition(logDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(logDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LOOP_DEFINITION: {
				LoopDefinition loopDefinition = (LoopDefinition)theEObject;
				T result = caseLoopDefinition(loopDefinition);
				if (result == null) result = caseProcessorDefinition(loopDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(loopDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.LZF_DATA_FORMAT: {
				LzfDataFormat lzfDataFormat = (LzfDataFormat)theEObject;
				T result = caseLzfDataFormat(lzfDataFormat);
				if (result == null) result = caseDataFormat(lzfDataFormat);
				if (result == null) result = caseIdentifiedType(lzfDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.MARSHAL_DEFINITION: {
				MarshalDefinition marshalDefinition = (MarshalDefinition)theEObject;
				T result = caseMarshalDefinition(marshalDefinition);
				if (result == null) result = caseNoOutputDefinition(marshalDefinition);
				if (result == null) result = caseProcessorDefinition(marshalDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(marshalDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.METHOD_CALL_EXPRESSION: {
				MethodCallExpression methodCallExpression = (MethodCallExpression)theEObject;
				T result = caseMethodCallExpression(methodCallExpression);
				if (result == null) result = caseTypedExpressionDefinition(methodCallExpression);
				if (result == null) result = caseExpression(methodCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT: {
				MimeMultipartDataFormat mimeMultipartDataFormat = (MimeMultipartDataFormat)theEObject;
				T result = caseMimeMultipartDataFormat(mimeMultipartDataFormat);
				if (result == null) result = caseDataFormat(mimeMultipartDataFormat);
				if (result == null) result = caseIdentifiedType(mimeMultipartDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.MODEL_LIFECYCLE_STRATEGY_SUPPORT: {
				ModelLifecycleStrategySupport modelLifecycleStrategySupport = (ModelLifecycleStrategySupport)theEObject;
				T result = caseModelLifecycleStrategySupport(modelLifecycleStrategySupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.MULTICAST_DEFINITION: {
				MulticastDefinition multicastDefinition = (MulticastDefinition)theEObject;
				T result = caseMulticastDefinition(multicastDefinition);
				if (result == null) result = caseOutput(multicastDefinition);
				if (result == null) result = caseProcessorDefinition(multicastDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(multicastDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.MUTUAL_TLS_DEFINITION: {
				MutualTLSDefinition mutualTLSDefinition = (MutualTLSDefinition)theEObject;
				T result = caseMutualTLSDefinition(mutualTLSDefinition);
				if (result == null) result = caseRestSecurityDefinition(mutualTLSDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.MVEL_EXPRESSION: {
				MvelExpression mvelExpression = (MvelExpression)theEObject;
				T result = caseMvelExpression(mvelExpression);
				if (result == null) result = caseTypedExpressionDefinition(mvelExpression);
				if (result == null) result = caseExpression(mvelExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.NAMESPACE_AWARE_EXPRESSION: {
				NamespaceAwareExpression namespaceAwareExpression = (NamespaceAwareExpression)theEObject;
				T result = caseNamespaceAwareExpression(namespaceAwareExpression);
				if (result == null) result = caseSingleInputTypedExpressionDefinition(namespaceAwareExpression);
				if (result == null) result = caseTypedExpressionDefinition(namespaceAwareExpression);
				if (result == null) result = caseExpression(namespaceAwareExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.NO_ERROR_HANDLER_DEFINITION: {
				NoErrorHandlerDefinition noErrorHandlerDefinition = (NoErrorHandlerDefinition)theEObject;
				T result = caseNoErrorHandlerDefinition(noErrorHandlerDefinition);
				if (result == null) result = caseBaseErrorHandlerDefinition(noErrorHandlerDefinition);
				if (result == null) result = caseIdentifiedType(noErrorHandlerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.NO_OUTPUT_DEFINITION: {
				NoOutputDefinition noOutputDefinition = (NoOutputDefinition)theEObject;
				T result = caseNoOutputDefinition(noOutputDefinition);
				if (result == null) result = caseProcessorDefinition(noOutputDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(noOutputDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.OAUTH2_DEFINITION: {
				OAuth2Definition oAuth2Definition = (OAuth2Definition)theEObject;
				T result = caseOAuth2Definition(oAuth2Definition);
				if (result == null) result = caseRestSecurityDefinition(oAuth2Definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.OGNL_EXPRESSION: {
				OgnlExpression ognlExpression = (OgnlExpression)theEObject;
				T result = caseOgnlExpression(ognlExpression);
				if (result == null) result = caseTypedExpressionDefinition(ognlExpression);
				if (result == null) result = caseExpression(ognlExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ON_COMPLETION_DEFINITION: {
				OnCompletionDefinition onCompletionDefinition = (OnCompletionDefinition)theEObject;
				T result = caseOnCompletionDefinition(onCompletionDefinition);
				if (result == null) result = caseOutput(onCompletionDefinition);
				if (result == null) result = caseProcessorDefinition(onCompletionDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(onCompletionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ON_EXCEPTION_DEFINITION: {
				OnExceptionDefinition onExceptionDefinition = (OnExceptionDefinition)theEObject;
				T result = caseOnExceptionDefinition(onExceptionDefinition);
				if (result == null) result = caseOutput(onExceptionDefinition);
				if (result == null) result = caseProcessorDefinition(onExceptionDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(onExceptionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ON_FALLBACK_DEFINITION: {
				OnFallbackDefinition onFallbackDefinition = (OnFallbackDefinition)theEObject;
				T result = caseOnFallbackDefinition(onFallbackDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(onFallbackDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ON_WHEN_DEFINITION: {
				OnWhenDefinition onWhenDefinition = (OnWhenDefinition)theEObject;
				T result = caseOnWhenDefinition(onWhenDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(onWhenDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.OPEN_API_DEFINITION: {
				OpenApiDefinition openApiDefinition = (OpenApiDefinition)theEObject;
				T result = caseOpenApiDefinition(openApiDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(openApiDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.OPEN_ID_CONNECT_DEFINITION: {
				OpenIdConnectDefinition openIdConnectDefinition = (OpenIdConnectDefinition)theEObject;
				T result = caseOpenIdConnectDefinition(openIdConnectDefinition);
				if (result == null) result = caseRestSecurityDefinition(openIdConnectDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION: {
				OptimisticLockRetryPolicyDefinition optimisticLockRetryPolicyDefinition = (OptimisticLockRetryPolicyDefinition)theEObject;
				T result = caseOptimisticLockRetryPolicyDefinition(optimisticLockRetryPolicyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.OPTIONAL_IDENTIFIED_DEFINITION: {
				OptionalIdentifiedDefinition optionalIdentifiedDefinition = (OptionalIdentifiedDefinition)theEObject;
				T result = caseOptionalIdentifiedDefinition(optionalIdentifiedDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.OTHERWISE_DEFINITION: {
				OtherwiseDefinition otherwiseDefinition = (OtherwiseDefinition)theEObject;
				T result = caseOtherwiseDefinition(otherwiseDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(otherwiseDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseProcessorDefinition(output);
				if (result == null) result = caseOptionalIdentifiedDefinition(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.OUTPUT_TYPE_DEFINITION: {
				OutputTypeDefinition outputTypeDefinition = (OutputTypeDefinition)theEObject;
				T result = caseOutputTypeDefinition(outputTypeDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(outputTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION: {
				PackageScanDefinition packageScanDefinition = (PackageScanDefinition)theEObject;
				T result = casePackageScanDefinition(packageScanDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PARAM_DEFINITION: {
				ParamDefinition paramDefinition = (ParamDefinition)theEObject;
				T result = caseParamDefinition(paramDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT: {
				ParquetAvroDataFormat parquetAvroDataFormat = (ParquetAvroDataFormat)theEObject;
				T result = caseParquetAvroDataFormat(parquetAvroDataFormat);
				if (result == null) result = caseDataFormat(parquetAvroDataFormat);
				if (result == null) result = caseIdentifiedType(parquetAvroDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PASS_THROUGH_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: {
				PassThroughServiceCallServiceFilterConfiguration passThroughServiceCallServiceFilterConfiguration = (PassThroughServiceCallServiceFilterConfiguration)theEObject;
				T result = casePassThroughServiceCallServiceFilterConfiguration(passThroughServiceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallServiceFilterConfiguration(passThroughServiceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallConfiguration(passThroughServiceCallServiceFilterConfiguration);
				if (result == null) result = caseIdentifiedType(passThroughServiceCallServiceFilterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PATCH_DEFINITION: {
				PatchDefinition patchDefinition = (PatchDefinition)theEObject;
				T result = casePatchDefinition(patchDefinition);
				if (result == null) result = caseVerbDefinition(patchDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(patchDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PATTERN_BASED_PACKAGE_SCAN_FILTER: {
				PatternBasedPackageScanFilter patternBasedPackageScanFilter = (PatternBasedPackageScanFilter)theEObject;
				T result = casePatternBasedPackageScanFilter(patternBasedPackageScanFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PAUSABLE_DEFINITION: {
				PausableDefinition pausableDefinition = (PausableDefinition)theEObject;
				T result = casePausableDefinition(pausableDefinition);
				if (result == null) result = caseNoOutputDefinition(pausableDefinition);
				if (result == null) result = caseProcessorDefinition(pausableDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(pausableDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PGP_DATA_FORMAT: {
				PgpDataFormat pgpDataFormat = (PgpDataFormat)theEObject;
				T result = casePgpDataFormat(pgpDataFormat);
				if (result == null) result = caseDataFormat(pgpDataFormat);
				if (result == null) result = caseIdentifiedType(pgpDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PIPELINE_DEFINITION: {
				PipelineDefinition pipelineDefinition = (PipelineDefinition)theEObject;
				T result = casePipelineDefinition(pipelineDefinition);
				if (result == null) result = caseOutput(pipelineDefinition);
				if (result == null) result = caseProcessorDefinition(pipelineDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(pipelineDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.POLICY_DEFINITION: {
				PolicyDefinition policyDefinition = (PolicyDefinition)theEObject;
				T result = casePolicyDefinition(policyDefinition);
				if (result == null) result = caseOutput(policyDefinition);
				if (result == null) result = caseProcessorDefinition(policyDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(policyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.POLL_DEFINITION: {
				PollDefinition pollDefinition = (PollDefinition)theEObject;
				T result = casePollDefinition(pollDefinition);
				if (result == null) result = caseNoOutputDefinition(pollDefinition);
				if (result == null) result = caseProcessorDefinition(pollDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(pollDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.POLL_ENRICH_DEFINITION: {
				PollEnrichDefinition pollEnrichDefinition = (PollEnrichDefinition)theEObject;
				T result = casePollEnrichDefinition(pollEnrichDefinition);
				if (result == null) result = caseProcessorDefinition(pollEnrichDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(pollEnrichDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.POST_DEFINITION: {
				PostDefinition postDefinition = (PostDefinition)theEObject;
				T result = casePostDefinition(postDefinition);
				if (result == null) result = caseVerbDefinition(postDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(postDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PREDICATE_VALIDATOR_DEFINITION: {
				PredicateValidatorDefinition predicateValidatorDefinition = (PredicateValidatorDefinition)theEObject;
				T result = casePredicateValidatorDefinition(predicateValidatorDefinition);
				if (result == null) result = caseValidator(predicateValidatorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PROCESS_DEFINITION: {
				ProcessDefinition processDefinition = (ProcessDefinition)theEObject;
				T result = caseProcessDefinition(processDefinition);
				if (result == null) result = caseNoOutputDefinition(processDefinition);
				if (result == null) result = caseProcessorDefinition(processDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(processDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PROCESSOR_DEFINITION: {
				ProcessorDefinition processorDefinition = (ProcessorDefinition)theEObject;
				T result = caseProcessorDefinition(processorDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(processorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PROPERTY_DEFINITION: {
				PropertyDefinition propertyDefinition = (PropertyDefinition)theEObject;
				T result = casePropertyDefinition(propertyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PROPERTY_DEFINITIONS: {
				PropertyDefinitions propertyDefinitions = (PropertyDefinitions)theEObject;
				T result = casePropertyDefinitions(propertyDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PROPERTY_EXPRESSION_DEFINITION: {
				PropertyExpressionDefinition propertyExpressionDefinition = (PropertyExpressionDefinition)theEObject;
				T result = casePropertyExpressionDefinition(propertyExpressionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT: {
				ProtobufDataFormat protobufDataFormat = (ProtobufDataFormat)theEObject;
				T result = caseProtobufDataFormat(protobufDataFormat);
				if (result == null) result = caseDataFormat(protobufDataFormat);
				if (result == null) result = caseIdentifiedType(protobufDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PUT_DEFINITION: {
				PutDefinition putDefinition = (PutDefinition)theEObject;
				T result = casePutDefinition(putDefinition);
				if (result == null) result = caseVerbDefinition(putDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(putDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.PYTHON_EXPRESSION: {
				PythonExpression pythonExpression = (PythonExpression)theEObject;
				T result = casePythonExpression(pythonExpression);
				if (result == null) result = caseTypedExpressionDefinition(pythonExpression);
				if (result == null) result = caseExpression(pythonExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RANDOM_LOAD_BALANCER_DEFINITION: {
				RandomLoadBalancerDefinition randomLoadBalancerDefinition = (RandomLoadBalancerDefinition)theEObject;
				T result = caseRandomLoadBalancerDefinition(randomLoadBalancerDefinition);
				if (result == null) result = caseLoadBalancerDefinition(randomLoadBalancerDefinition);
				if (result == null) result = caseIdentifiedType(randomLoadBalancerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RECIPIENT_LIST_DEFINITION: {
				RecipientListDefinition recipientListDefinition = (RecipientListDefinition)theEObject;
				T result = caseRecipientListDefinition(recipientListDefinition);
				if (result == null) result = caseProcessorDefinition(recipientListDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(recipientListDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION: {
				RedeliveryPolicyDefinition redeliveryPolicyDefinition = (RedeliveryPolicyDefinition)theEObject;
				T result = caseRedeliveryPolicyDefinition(redeliveryPolicyDefinition);
				if (result == null) result = caseIdentifiedType(redeliveryPolicyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REF_ERROR_HANDLER_DEFINITION: {
				RefErrorHandlerDefinition refErrorHandlerDefinition = (RefErrorHandlerDefinition)theEObject;
				T result = caseRefErrorHandlerDefinition(refErrorHandlerDefinition);
				if (result == null) result = caseBaseErrorHandlerDefinition(refErrorHandlerDefinition);
				if (result == null) result = caseIdentifiedType(refErrorHandlerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REF_EXPRESSION: {
				RefExpression refExpression = (RefExpression)theEObject;
				T result = caseRefExpression(refExpression);
				if (result == null) result = caseTypedExpressionDefinition(refExpression);
				if (result == null) result = caseExpression(refExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REMOVE_HEADER_DEFINITION: {
				RemoveHeaderDefinition removeHeaderDefinition = (RemoveHeaderDefinition)theEObject;
				T result = caseRemoveHeaderDefinition(removeHeaderDefinition);
				if (result == null) result = caseNoOutputDefinition(removeHeaderDefinition);
				if (result == null) result = caseProcessorDefinition(removeHeaderDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(removeHeaderDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REMOVE_HEADERS_DEFINITION: {
				RemoveHeadersDefinition removeHeadersDefinition = (RemoveHeadersDefinition)theEObject;
				T result = caseRemoveHeadersDefinition(removeHeadersDefinition);
				if (result == null) result = caseNoOutputDefinition(removeHeadersDefinition);
				if (result == null) result = caseProcessorDefinition(removeHeadersDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(removeHeadersDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION: {
				RemovePropertiesDefinition removePropertiesDefinition = (RemovePropertiesDefinition)theEObject;
				T result = caseRemovePropertiesDefinition(removePropertiesDefinition);
				if (result == null) result = caseNoOutputDefinition(removePropertiesDefinition);
				if (result == null) result = caseProcessorDefinition(removePropertiesDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(removePropertiesDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REMOVE_PROPERTY_DEFINITION: {
				RemovePropertyDefinition removePropertyDefinition = (RemovePropertyDefinition)theEObject;
				T result = caseRemovePropertyDefinition(removePropertyDefinition);
				if (result == null) result = caseNoOutputDefinition(removePropertyDefinition);
				if (result == null) result = caseProcessorDefinition(removePropertyDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(removePropertyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REMOVE_VARIABLE_DEFINITION: {
				RemoveVariableDefinition removeVariableDefinition = (RemoveVariableDefinition)theEObject;
				T result = caseRemoveVariableDefinition(removeVariableDefinition);
				if (result == null) result = caseNoOutputDefinition(removeVariableDefinition);
				if (result == null) result = caseProcessorDefinition(removeVariableDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(removeVariableDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RESEQUENCE_DEFINITION: {
				ResequenceDefinition resequenceDefinition = (ResequenceDefinition)theEObject;
				T result = caseResequenceDefinition(resequenceDefinition);
				if (result == null) result = caseOutput(resequenceDefinition);
				if (result == null) result = caseProcessorDefinition(resequenceDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(resequenceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RESEQUENCER_CONFIG: {
				ResequencerConfig resequencerConfig = (ResequencerConfig)theEObject;
				T result = caseResequencerConfig(resequencerConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON: {
				Resilience4JConfigurationCommon resilience4JConfigurationCommon = (Resilience4JConfigurationCommon)theEObject;
				T result = caseResilience4JConfigurationCommon(resilience4JConfigurationCommon);
				if (result == null) result = caseIdentifiedType(resilience4JConfigurationCommon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_DEFINITION: {
				Resilience4JConfigurationDefinition resilience4JConfigurationDefinition = (Resilience4JConfigurationDefinition)theEObject;
				T result = caseResilience4JConfigurationDefinition(resilience4JConfigurationDefinition);
				if (result == null) result = caseResilience4JConfigurationCommon(resilience4JConfigurationDefinition);
				if (result == null) result = caseIdentifiedType(resilience4JConfigurationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION: {
				ResponseHeaderDefinition responseHeaderDefinition = (ResponseHeaderDefinition)theEObject;
				T result = caseResponseHeaderDefinition(responseHeaderDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION: {
				ResponseMessageDefinition responseMessageDefinition = (ResponseMessageDefinition)theEObject;
				T result = caseResponseMessageDefinition(responseMessageDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REST_BINDING_DEFINITION: {
				RestBindingDefinition restBindingDefinition = (RestBindingDefinition)theEObject;
				T result = caseRestBindingDefinition(restBindingDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(restBindingDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION: {
				RestConfigurationDefinition restConfigurationDefinition = (RestConfigurationDefinition)theEObject;
				T result = caseRestConfigurationDefinition(restConfigurationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REST_CONTEXT_REF_DEFINITION: {
				RestContextRefDefinition restContextRefDefinition = (RestContextRefDefinition)theEObject;
				T result = caseRestContextRefDefinition(restContextRefDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REST_DEFINITION: {
				RestDefinition restDefinition = (RestDefinition)theEObject;
				T result = caseRestDefinition(restDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(restDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REST_PROPERTY_DEFINITION: {
				RestPropertyDefinition restPropertyDefinition = (RestPropertyDefinition)theEObject;
				T result = caseRestPropertyDefinition(restPropertyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RESTS_DEFINITION: {
				RestsDefinition restsDefinition = (RestsDefinition)theEObject;
				T result = caseRestsDefinition(restsDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(restsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REST_SECURITIES_DEFINITION: {
				RestSecuritiesDefinition restSecuritiesDefinition = (RestSecuritiesDefinition)theEObject;
				T result = caseRestSecuritiesDefinition(restSecuritiesDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.REST_SECURITY_DEFINITION: {
				RestSecurityDefinition restSecurityDefinition = (RestSecurityDefinition)theEObject;
				T result = caseRestSecurityDefinition(restSecurityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RESUMABLE_DEFINITION: {
				ResumableDefinition resumableDefinition = (ResumableDefinition)theEObject;
				T result = caseResumableDefinition(resumableDefinition);
				if (result == null) result = caseNoOutputDefinition(resumableDefinition);
				if (result == null) result = caseProcessorDefinition(resumableDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(resumableDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROLLBACK_DEFINITION: {
				RollbackDefinition rollbackDefinition = (RollbackDefinition)theEObject;
				T result = caseRollbackDefinition(rollbackDefinition);
				if (result == null) result = caseNoOutputDefinition(rollbackDefinition);
				if (result == null) result = caseProcessorDefinition(rollbackDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(rollbackDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUND_ROBIN_LOAD_BALANCER_DEFINITION: {
				RoundRobinLoadBalancerDefinition roundRobinLoadBalancerDefinition = (RoundRobinLoadBalancerDefinition)theEObject;
				T result = caseRoundRobinLoadBalancerDefinition(roundRobinLoadBalancerDefinition);
				if (result == null) result = caseLoadBalancerDefinition(roundRobinLoadBalancerDefinition);
				if (result == null) result = caseIdentifiedType(roundRobinLoadBalancerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTE_BUILDER_DEFINITION: {
				RouteBuilderDefinition routeBuilderDefinition = (RouteBuilderDefinition)theEObject;
				T result = caseRouteBuilderDefinition(routeBuilderDefinition);
				if (result == null) result = caseIdentifiedType(routeBuilderDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTE_CONFIGURATION_CONTEXT_REF_DEFINITION: {
				RouteConfigurationContextRefDefinition routeConfigurationContextRefDefinition = (RouteConfigurationContextRefDefinition)theEObject;
				T result = caseRouteConfigurationContextRefDefinition(routeConfigurationContextRefDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION: {
				RouteConfigurationDefinition routeConfigurationDefinition = (RouteConfigurationDefinition)theEObject;
				T result = caseRouteConfigurationDefinition(routeConfigurationDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(routeConfigurationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTE_CONFIGURATIONS_DEFINITION: {
				RouteConfigurationsDefinition routeConfigurationsDefinition = (RouteConfigurationsDefinition)theEObject;
				T result = caseRouteConfigurationsDefinition(routeConfigurationsDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(routeConfigurationsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTE_CONTEXT_REF_DEFINITION: {
				RouteContextRefDefinition routeContextRefDefinition = (RouteContextRefDefinition)theEObject;
				T result = caseRouteContextRefDefinition(routeContextRefDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTE_DEFINITION: {
				RouteDefinition routeDefinition = (RouteDefinition)theEObject;
				T result = caseRouteDefinition(routeDefinition);
				if (result == null) result = caseOutput(routeDefinition);
				if (result == null) result = caseProcessorDefinition(routeDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(routeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTES_DEFINITION: {
				RoutesDefinition routesDefinition = (RoutesDefinition)theEObject;
				T result = caseRoutesDefinition(routesDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(routesDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTE_TEMPLATE_CONTEXT_REF_DEFINITION: {
				RouteTemplateContextRefDefinition routeTemplateContextRefDefinition = (RouteTemplateContextRefDefinition)theEObject;
				T result = caseRouteTemplateContextRefDefinition(routeTemplateContextRefDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION: {
				RouteTemplateDefinition routeTemplateDefinition = (RouteTemplateDefinition)theEObject;
				T result = caseRouteTemplateDefinition(routeTemplateDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(routeTemplateDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTE_TEMPLATE_PARAMETER_DEFINITION: {
				RouteTemplateParameterDefinition routeTemplateParameterDefinition = (RouteTemplateParameterDefinition)theEObject;
				T result = caseRouteTemplateParameterDefinition(routeTemplateParameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTE_TEMPLATES_DEFINITION: {
				RouteTemplatesDefinition routeTemplatesDefinition = (RouteTemplatesDefinition)theEObject;
				T result = caseRouteTemplatesDefinition(routeTemplatesDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(routeTemplatesDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ROUTING_SLIP_DEFINITION: {
				RoutingSlipDefinition routingSlipDefinition = (RoutingSlipDefinition)theEObject;
				T result = caseRoutingSlipDefinition(routingSlipDefinition);
				if (result == null) result = caseProcessorDefinition(routingSlipDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(routingSlipDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.RSS_DATA_FORMAT: {
				RssDataFormat rssDataFormat = (RssDataFormat)theEObject;
				T result = caseRssDataFormat(rssDataFormat);
				if (result == null) result = caseDataFormat(rssDataFormat);
				if (result == null) result = caseIdentifiedType(rssDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SAGA_ACTION_URI_DEFINITION: {
				SagaActionUriDefinition sagaActionUriDefinition = (SagaActionUriDefinition)theEObject;
				T result = caseSagaActionUriDefinition(sagaActionUriDefinition);
				if (result == null) result = caseSendDefinition(sagaActionUriDefinition);
				if (result == null) result = caseNoOutputDefinition(sagaActionUriDefinition);
				if (result == null) result = caseProcessorDefinition(sagaActionUriDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(sagaActionUriDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SAGA_DEFINITION: {
				SagaDefinition sagaDefinition = (SagaDefinition)theEObject;
				T result = caseSagaDefinition(sagaDefinition);
				if (result == null) result = caseOutput(sagaDefinition);
				if (result == null) result = caseProcessorDefinition(sagaDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(sagaDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SAMPLING_DEFINITION: {
				SamplingDefinition samplingDefinition = (SamplingDefinition)theEObject;
				T result = caseSamplingDefinition(samplingDefinition);
				if (result == null) result = caseNoOutputDefinition(samplingDefinition);
				if (result == null) result = caseProcessorDefinition(samplingDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(samplingDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SCRIPT_DEFINITION: {
				ScriptDefinition scriptDefinition = (ScriptDefinition)theEObject;
				T result = caseScriptDefinition(scriptDefinition);
				if (result == null) result = caseProcessorDefinition(scriptDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(scriptDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SECURE_RANDOM_PARAMETERS_FACTORY_BEAN: {
				SecureRandomParametersFactoryBean secureRandomParametersFactoryBean = (SecureRandomParametersFactoryBean)theEObject;
				T result = caseSecureRandomParametersFactoryBean(secureRandomParametersFactoryBean);
				if (result == null) result = caseAbstractSecureRandomParametersFactoryBean(secureRandomParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(secureRandomParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(secureRandomParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(secureRandomParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS: {
				SecureSocketProtocolsParameters secureSocketProtocolsParameters = (SecureSocketProtocolsParameters)theEObject;
				T result = caseSecureSocketProtocolsParameters(secureSocketProtocolsParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SECURITY_DEFINITION: {
				SecurityDefinition securityDefinition = (SecurityDefinition)theEObject;
				T result = caseSecurityDefinition(securityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SEND_DEFINITION: {
				SendDefinition sendDefinition = (SendDefinition)theEObject;
				T result = caseSendDefinition(sendDefinition);
				if (result == null) result = caseNoOutputDefinition(sendDefinition);
				if (result == null) result = caseProcessorDefinition(sendDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(sendDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SERVICE_CALL_CONFIGURATION: {
				ServiceCallConfiguration serviceCallConfiguration = (ServiceCallConfiguration)theEObject;
				T result = caseServiceCallConfiguration(serviceCallConfiguration);
				if (result == null) result = caseIdentifiedType(serviceCallConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SERVICE_CALL_CONFIGURATION_DEFINITION: {
				ServiceCallConfigurationDefinition serviceCallConfigurationDefinition = (ServiceCallConfigurationDefinition)theEObject;
				T result = caseServiceCallConfigurationDefinition(serviceCallConfigurationDefinition);
				if (result == null) result = caseIdentifiedType(serviceCallConfigurationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SERVICE_CALL_DEFINITION: {
				ServiceCallDefinition serviceCallDefinition = (ServiceCallDefinition)theEObject;
				T result = caseServiceCallDefinition(serviceCallDefinition);
				if (result == null) result = caseNoOutputDefinition(serviceCallDefinition);
				if (result == null) result = caseProcessorDefinition(serviceCallDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(serviceCallDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SERVICE_CALL_DEFINITION_CONSTANTS: {
				ServiceCallDefinitionConstants serviceCallDefinitionConstants = (ServiceCallDefinitionConstants)theEObject;
				T result = caseServiceCallDefinitionConstants(serviceCallDefinitionConstants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SERVICE_CALL_EXPRESSION_CONFIGURATION: {
				ServiceCallExpressionConfiguration serviceCallExpressionConfiguration = (ServiceCallExpressionConfiguration)theEObject;
				T result = caseServiceCallExpressionConfiguration(serviceCallExpressionConfiguration);
				if (result == null) result = caseServiceCallConfiguration(serviceCallExpressionConfiguration);
				if (result == null) result = caseIdentifiedType(serviceCallExpressionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SERVICE_CALL_SERVICE_CHOOSER_CONFIGURATION: {
				ServiceCallServiceChooserConfiguration serviceCallServiceChooserConfiguration = (ServiceCallServiceChooserConfiguration)theEObject;
				T result = caseServiceCallServiceChooserConfiguration(serviceCallServiceChooserConfiguration);
				if (result == null) result = caseServiceCallConfiguration(serviceCallServiceChooserConfiguration);
				if (result == null) result = caseIdentifiedType(serviceCallServiceChooserConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: {
				ServiceCallServiceDiscoveryConfiguration serviceCallServiceDiscoveryConfiguration = (ServiceCallServiceDiscoveryConfiguration)theEObject;
				T result = caseServiceCallServiceDiscoveryConfiguration(serviceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallConfiguration(serviceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseIdentifiedType(serviceCallServiceDiscoveryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: {
				ServiceCallServiceFilterConfiguration serviceCallServiceFilterConfiguration = (ServiceCallServiceFilterConfiguration)theEObject;
				T result = caseServiceCallServiceFilterConfiguration(serviceCallServiceFilterConfiguration);
				if (result == null) result = caseServiceCallConfiguration(serviceCallServiceFilterConfiguration);
				if (result == null) result = caseIdentifiedType(serviceCallServiceFilterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SERVICE_CALL_SERVICE_LOAD_BALANCER_CONFIGURATION: {
				ServiceCallServiceLoadBalancerConfiguration serviceCallServiceLoadBalancerConfiguration = (ServiceCallServiceLoadBalancerConfiguration)theEObject;
				T result = caseServiceCallServiceLoadBalancerConfiguration(serviceCallServiceLoadBalancerConfiguration);
				if (result == null) result = caseServiceCallConfiguration(serviceCallServiceLoadBalancerConfiguration);
				if (result == null) result = caseIdentifiedType(serviceCallServiceLoadBalancerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SET_BODY_DEFINITION: {
				SetBodyDefinition setBodyDefinition = (SetBodyDefinition)theEObject;
				T result = caseSetBodyDefinition(setBodyDefinition);
				if (result == null) result = caseProcessorDefinition(setBodyDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(setBodyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SET_EXCHANGE_PATTERN_DEFINITION: {
				SetExchangePatternDefinition setExchangePatternDefinition = (SetExchangePatternDefinition)theEObject;
				T result = caseSetExchangePatternDefinition(setExchangePatternDefinition);
				if (result == null) result = caseNoOutputDefinition(setExchangePatternDefinition);
				if (result == null) result = caseProcessorDefinition(setExchangePatternDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(setExchangePatternDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SET_HEADER_DEFINITION: {
				SetHeaderDefinition setHeaderDefinition = (SetHeaderDefinition)theEObject;
				T result = caseSetHeaderDefinition(setHeaderDefinition);
				if (result == null) result = caseProcessorDefinition(setHeaderDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(setHeaderDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SET_HEADERS_DEFINITION: {
				SetHeadersDefinition setHeadersDefinition = (SetHeadersDefinition)theEObject;
				T result = caseSetHeadersDefinition(setHeadersDefinition);
				if (result == null) result = caseProcessorDefinition(setHeadersDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(setHeadersDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SET_PROPERTY_DEFINITION: {
				SetPropertyDefinition setPropertyDefinition = (SetPropertyDefinition)theEObject;
				T result = caseSetPropertyDefinition(setPropertyDefinition);
				if (result == null) result = caseProcessorDefinition(setPropertyDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(setPropertyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SET_VARIABLE_DEFINITION: {
				SetVariableDefinition setVariableDefinition = (SetVariableDefinition)theEObject;
				T result = caseSetVariableDefinition(setVariableDefinition);
				if (result == null) result = caseProcessorDefinition(setVariableDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(setVariableDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SET_VARIABLES_DEFINITION: {
				SetVariablesDefinition setVariablesDefinition = (SetVariablesDefinition)theEObject;
				T result = caseSetVariablesDefinition(setVariablesDefinition);
				if (result == null) result = caseProcessorDefinition(setVariablesDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(setVariablesDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SIMPLE_EXPRESSION: {
				SimpleExpression simpleExpression = (SimpleExpression)theEObject;
				T result = caseSimpleExpression(simpleExpression);
				if (result == null) result = caseTypedExpressionDefinition(simpleExpression);
				if (result == null) result = caseExpression(simpleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SINGLE_INPUT_TYPED_EXPRESSION_DEFINITION: {
				SingleInputTypedExpressionDefinition singleInputTypedExpressionDefinition = (SingleInputTypedExpressionDefinition)theEObject;
				T result = caseSingleInputTypedExpressionDefinition(singleInputTypedExpressionDefinition);
				if (result == null) result = caseTypedExpressionDefinition(singleInputTypedExpressionDefinition);
				if (result == null) result = caseExpression(singleInputTypedExpressionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SMOOKS_DATA_FORMAT: {
				SmooksDataFormat smooksDataFormat = (SmooksDataFormat)theEObject;
				T result = caseSmooksDataFormat(smooksDataFormat);
				if (result == null) result = caseDataFormat(smooksDataFormat);
				if (result == null) result = caseIdentifiedType(smooksDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SNI_HOST_NAMES: {
				SniHostNames sniHostNames = (SniHostNames)theEObject;
				T result = caseSniHostNames(sniHostNames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SOAP_DATA_FORMAT: {
				SoapDataFormat soapDataFormat = (SoapDataFormat)theEObject;
				T result = caseSoapDataFormat(soapDataFormat);
				if (result == null) result = caseDataFormat(soapDataFormat);
				if (result == null) result = caseIdentifiedType(soapDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SORT_DEFINITION: {
				SortDefinition sortDefinition = (SortDefinition)theEObject;
				T result = caseSortDefinition(sortDefinition);
				if (result == null) result = caseProcessorDefinition(sortDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(sortDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SP_EL_EXPRESSION: {
				SpELExpression spELExpression = (SpELExpression)theEObject;
				T result = caseSpELExpression(spELExpression);
				if (result == null) result = caseTypedExpressionDefinition(spELExpression);
				if (result == null) result = caseExpression(spELExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SPLIT_DEFINITION: {
				SplitDefinition splitDefinition = (SplitDefinition)theEObject;
				T result = caseSplitDefinition(splitDefinition);
				if (result == null) result = caseProcessorDefinition(splitDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(splitDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION: {
				SpringErrorHandlerDefinition springErrorHandlerDefinition = (SpringErrorHandlerDefinition)theEObject;
				T result = caseSpringErrorHandlerDefinition(springErrorHandlerDefinition);
				if (result == null) result = caseIdentifiedType(springErrorHandlerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SPRING_TRANSACTION_ERROR_HANDLER_DEFINITION: {
				SpringTransactionErrorHandlerDefinition springTransactionErrorHandlerDefinition = (SpringTransactionErrorHandlerDefinition)theEObject;
				T result = caseSpringTransactionErrorHandlerDefinition(springTransactionErrorHandlerDefinition);
				if (result == null) result = caseTransactionErrorHandlerDefinition(springTransactionErrorHandlerDefinition);
				if (result == null) result = caseDefaultErrorHandlerDefinition(springTransactionErrorHandlerDefinition);
				if (result == null) result = caseBaseErrorHandlerDefinition(springTransactionErrorHandlerDefinition);
				if (result == null) result = caseIdentifiedType(springTransactionErrorHandlerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SSL_CONTEXT_CLIENT_PARAMETERS_FACTORY_BEAN: {
				SslContextClientParametersFactoryBean sslContextClientParametersFactoryBean = (SslContextClientParametersFactoryBean)theEObject;
				T result = caseSslContextClientParametersFactoryBean(sslContextClientParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(sslContextClientParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(sslContextClientParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(sslContextClientParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN: {
				SslContextParametersFactoryBean sslContextParametersFactoryBean = (SslContextParametersFactoryBean)theEObject;
				T result = caseSslContextParametersFactoryBean(sslContextParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(sslContextParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(sslContextParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(sslContextParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN: {
				SslContextServerParametersFactoryBean sslContextServerParametersFactoryBean = (SslContextServerParametersFactoryBean)theEObject;
				T result = caseSslContextServerParametersFactoryBean(sslContextServerParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(sslContextServerParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(sslContextServerParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(sslContextServerParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.STATIC_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: {
				StaticServiceCallServiceDiscoveryConfiguration staticServiceCallServiceDiscoveryConfiguration = (StaticServiceCallServiceDiscoveryConfiguration)theEObject;
				T result = caseStaticServiceCallServiceDiscoveryConfiguration(staticServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallServiceDiscoveryConfiguration(staticServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallConfiguration(staticServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseIdentifiedType(staticServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.STEP_DEFINITION: {
				StepDefinition stepDefinition = (StepDefinition)theEObject;
				T result = caseStepDefinition(stepDefinition);
				if (result == null) result = caseOutput(stepDefinition);
				if (result == null) result = caseProcessorDefinition(stepDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(stepDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION: {
				StickyLoadBalancerDefinition stickyLoadBalancerDefinition = (StickyLoadBalancerDefinition)theEObject;
				T result = caseStickyLoadBalancerDefinition(stickyLoadBalancerDefinition);
				if (result == null) result = caseLoadBalancerDefinition(stickyLoadBalancerDefinition);
				if (result == null) result = caseIdentifiedType(stickyLoadBalancerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.STOP_DEFINITION: {
				StopDefinition stopDefinition = (StopDefinition)theEObject;
				T result = caseStopDefinition(stopDefinition);
				if (result == null) result = caseNoOutputDefinition(stopDefinition);
				if (result == null) result = caseProcessorDefinition(stopDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(stopDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG: {
				StreamResequencerConfig streamResequencerConfig = (StreamResequencerConfig)theEObject;
				T result = caseStreamResequencerConfig(streamResequencerConfig);
				if (result == null) result = caseResequencerConfig(streamResequencerConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SWIFT_MT_DATA_FORMAT: {
				SwiftMtDataFormat swiftMtDataFormat = (SwiftMtDataFormat)theEObject;
				T result = caseSwiftMtDataFormat(swiftMtDataFormat);
				if (result == null) result = caseDataFormat(swiftMtDataFormat);
				if (result == null) result = caseIdentifiedType(swiftMtDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT: {
				SwiftMxDataFormat swiftMxDataFormat = (SwiftMxDataFormat)theEObject;
				T result = caseSwiftMxDataFormat(swiftMxDataFormat);
				if (result == null) result = caseDataFormat(swiftMxDataFormat);
				if (result == null) result = caseIdentifiedType(swiftMxDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.SYSLOG_DATA_FORMAT: {
				SyslogDataFormat syslogDataFormat = (SyslogDataFormat)theEObject;
				T result = caseSyslogDataFormat(syslogDataFormat);
				if (result == null) result = caseDataFormat(syslogDataFormat);
				if (result == null) result = caseIdentifiedType(syslogDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TAR_FILE_DATA_FORMAT: {
				TarFileDataFormat tarFileDataFormat = (TarFileDataFormat)theEObject;
				T result = caseTarFileDataFormat(tarFileDataFormat);
				if (result == null) result = caseDataFormat(tarFileDataFormat);
				if (result == null) result = caseIdentifiedType(tarFileDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION: {
				TemplatedRouteDefinition templatedRouteDefinition = (TemplatedRouteDefinition)theEObject;
				T result = caseTemplatedRouteDefinition(templatedRouteDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TEMPLATED_ROUTE_PARAMETER_DEFINITION: {
				TemplatedRouteParameterDefinition templatedRouteParameterDefinition = (TemplatedRouteParameterDefinition)theEObject;
				T result = caseTemplatedRouteParameterDefinition(templatedRouteParameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TEMPLATED_ROUTES_DEFINITION: {
				TemplatedRoutesDefinition templatedRoutesDefinition = (TemplatedRoutesDefinition)theEObject;
				T result = caseTemplatedRoutesDefinition(templatedRoutesDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(templatedRoutesDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION: {
				ThreadPoolProfileDefinition threadPoolProfileDefinition = (ThreadPoolProfileDefinition)theEObject;
				T result = caseThreadPoolProfileDefinition(threadPoolProfileDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(threadPoolProfileDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.THREADS_DEFINITION: {
				ThreadsDefinition threadsDefinition = (ThreadsDefinition)theEObject;
				T result = caseThreadsDefinition(threadsDefinition);
				if (result == null) result = caseNoOutputDefinition(threadsDefinition);
				if (result == null) result = caseProcessorDefinition(threadsDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(threadsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.THRIFT_DATA_FORMAT: {
				ThriftDataFormat thriftDataFormat = (ThriftDataFormat)theEObject;
				T result = caseThriftDataFormat(thriftDataFormat);
				if (result == null) result = caseDataFormat(thriftDataFormat);
				if (result == null) result = caseIdentifiedType(thriftDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.THROTTLE_DEFINITION: {
				ThrottleDefinition throttleDefinition = (ThrottleDefinition)theEObject;
				T result = caseThrottleDefinition(throttleDefinition);
				if (result == null) result = caseProcessorDefinition(throttleDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(throttleDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.THROW_EXCEPTION_DEFINITION: {
				ThrowExceptionDefinition throwExceptionDefinition = (ThrowExceptionDefinition)theEObject;
				T result = caseThrowExceptionDefinition(throwExceptionDefinition);
				if (result == null) result = caseNoOutputDefinition(throwExceptionDefinition);
				if (result == null) result = caseProcessorDefinition(throwExceptionDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(throwExceptionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT: {
				TidyMarkupDataFormat tidyMarkupDataFormat = (TidyMarkupDataFormat)theEObject;
				T result = caseTidyMarkupDataFormat(tidyMarkupDataFormat);
				if (result == null) result = caseDataFormat(tidyMarkupDataFormat);
				if (result == null) result = caseIdentifiedType(tidyMarkupDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TO_DEFINITION: {
				ToDefinition toDefinition = (ToDefinition)theEObject;
				T result = caseToDefinition(toDefinition);
				if (result == null) result = caseSendDefinition(toDefinition);
				if (result == null) result = caseNoOutputDefinition(toDefinition);
				if (result == null) result = caseProcessorDefinition(toDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(toDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION: {
				ToDynamicDefinition toDynamicDefinition = (ToDynamicDefinition)theEObject;
				T result = caseToDynamicDefinition(toDynamicDefinition);
				if (result == null) result = caseNoOutputDefinition(toDynamicDefinition);
				if (result == null) result = caseProcessorDefinition(toDynamicDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(toDynamicDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TOKENIZER_DEFINITION: {
				TokenizerDefinition tokenizerDefinition = (TokenizerDefinition)theEObject;
				T result = caseTokenizerDefinition(tokenizerDefinition);
				if (result == null) result = caseNoOutputDefinition(tokenizerDefinition);
				if (result == null) result = caseProcessorDefinition(tokenizerDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(tokenizerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TOKENIZER_EXPRESSION: {
				TokenizerExpression tokenizerExpression = (TokenizerExpression)theEObject;
				T result = caseTokenizerExpression(tokenizerExpression);
				if (result == null) result = caseSingleInputTypedExpressionDefinition(tokenizerExpression);
				if (result == null) result = caseTypedExpressionDefinition(tokenizerExpression);
				if (result == null) result = caseExpression(tokenizerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TOKENIZER_IMPLEMENTATION: {
				TokenizerImplementation tokenizerImplementation = (TokenizerImplementation)theEObject;
				T result = caseTokenizerImplementation(tokenizerImplementation);
				if (result == null) result = caseIdentifiedType(tokenizerImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TOPIC_LOAD_BALANCER_DEFINITION: {
				TopicLoadBalancerDefinition topicLoadBalancerDefinition = (TopicLoadBalancerDefinition)theEObject;
				T result = caseTopicLoadBalancerDefinition(topicLoadBalancerDefinition);
				if (result == null) result = caseLoadBalancerDefinition(topicLoadBalancerDefinition);
				if (result == null) result = caseIdentifiedType(topicLoadBalancerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TRANSACTED_DEFINITION: {
				TransactedDefinition transactedDefinition = (TransactedDefinition)theEObject;
				T result = caseTransactedDefinition(transactedDefinition);
				if (result == null) result = caseOutput(transactedDefinition);
				if (result == null) result = caseProcessorDefinition(transactedDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(transactedDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TRANSACTION_ERROR_HANDLER_DEFINITION: {
				TransactionErrorHandlerDefinition transactionErrorHandlerDefinition = (TransactionErrorHandlerDefinition)theEObject;
				T result = caseTransactionErrorHandlerDefinition(transactionErrorHandlerDefinition);
				if (result == null) result = caseDefaultErrorHandlerDefinition(transactionErrorHandlerDefinition);
				if (result == null) result = caseBaseErrorHandlerDefinition(transactionErrorHandlerDefinition);
				if (result == null) result = caseIdentifiedType(transactionErrorHandlerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TRANSFORM_DEFINITION: {
				TransformDefinition transformDefinition = (TransformDefinition)theEObject;
				T result = caseTransformDefinition(transformDefinition);
				if (result == null) result = caseProcessorDefinition(transformDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(transformDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TRANSFORMER: {
				Transformer transformer = (Transformer)theEObject;
				T result = caseTransformer(transformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TRANSFORMERS_DEFINITION: {
				TransformersDefinition transformersDefinition = (TransformersDefinition)theEObject;
				T result = caseTransformersDefinition(transformersDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN: {
				TrustManagersParametersFactoryBean trustManagersParametersFactoryBean = (TrustManagersParametersFactoryBean)theEObject;
				T result = caseTrustManagersParametersFactoryBean(trustManagersParametersFactoryBean);
				if (result == null) result = caseAbstractTrustManagersParametersFactoryBean(trustManagersParametersFactoryBean);
				if (result == null) result = caseAbstractJsseUtilFactoryBean(trustManagersParametersFactoryBean);
				if (result == null) result = caseAbstractCamelFactoryBean(trustManagersParametersFactoryBean);
				if (result == null) result = caseIdentifiedType(trustManagersParametersFactoryBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TRY_DEFINITION: {
				TryDefinition tryDefinition = (TryDefinition)theEObject;
				T result = caseTryDefinition(tryDefinition);
				if (result == null) result = caseOutput(tryDefinition);
				if (result == null) result = caseProcessorDefinition(tryDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(tryDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.TYPED_EXPRESSION_DEFINITION: {
				TypedExpressionDefinition typedExpressionDefinition = (TypedExpressionDefinition)theEObject;
				T result = caseTypedExpressionDefinition(typedExpressionDefinition);
				if (result == null) result = caseExpression(typedExpressionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.UNI_VOCITY_ABSTRACT_DATA_FORMAT: {
				UniVocityAbstractDataFormat uniVocityAbstractDataFormat = (UniVocityAbstractDataFormat)theEObject;
				T result = caseUniVocityAbstractDataFormat(uniVocityAbstractDataFormat);
				if (result == null) result = caseDataFormat(uniVocityAbstractDataFormat);
				if (result == null) result = caseIdentifiedType(uniVocityAbstractDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT: {
				UniVocityCsvDataFormat uniVocityCsvDataFormat = (UniVocityCsvDataFormat)theEObject;
				T result = caseUniVocityCsvDataFormat(uniVocityCsvDataFormat);
				if (result == null) result = caseUniVocityAbstractDataFormat(uniVocityCsvDataFormat);
				if (result == null) result = caseDataFormat(uniVocityCsvDataFormat);
				if (result == null) result = caseIdentifiedType(uniVocityCsvDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT: {
				UniVocityFixedDataFormat uniVocityFixedDataFormat = (UniVocityFixedDataFormat)theEObject;
				T result = caseUniVocityFixedDataFormat(uniVocityFixedDataFormat);
				if (result == null) result = caseUniVocityAbstractDataFormat(uniVocityFixedDataFormat);
				if (result == null) result = caseDataFormat(uniVocityFixedDataFormat);
				if (result == null) result = caseIdentifiedType(uniVocityFixedDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.UNI_VOCITY_HEADER: {
				UniVocityHeader uniVocityHeader = (UniVocityHeader)theEObject;
				T result = caseUniVocityHeader(uniVocityHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.UNI_VOCITY_TSV_DATA_FORMAT: {
				UniVocityTsvDataFormat uniVocityTsvDataFormat = (UniVocityTsvDataFormat)theEObject;
				T result = caseUniVocityTsvDataFormat(uniVocityTsvDataFormat);
				if (result == null) result = caseUniVocityAbstractDataFormat(uniVocityTsvDataFormat);
				if (result == null) result = caseDataFormat(uniVocityTsvDataFormat);
				if (result == null) result = caseIdentifiedType(uniVocityTsvDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.UNMARSHAL_DEFINITION: {
				UnmarshalDefinition unmarshalDefinition = (UnmarshalDefinition)theEObject;
				T result = caseUnmarshalDefinition(unmarshalDefinition);
				if (result == null) result = caseNoOutputDefinition(unmarshalDefinition);
				if (result == null) result = caseProcessorDefinition(unmarshalDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(unmarshalDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.VALIDATE_DEFINITION: {
				ValidateDefinition validateDefinition = (ValidateDefinition)theEObject;
				T result = caseValidateDefinition(validateDefinition);
				if (result == null) result = caseProcessorDefinition(validateDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(validateDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.VALIDATOR: {
				Validator validator = (Validator)theEObject;
				T result = caseValidator(validator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.VALIDATORS_DEFINITION: {
				ValidatorsDefinition validatorsDefinition = (ValidatorsDefinition)theEObject;
				T result = caseValidatorsDefinition(validatorsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.VARIABLE_EXPRESSION: {
				VariableExpression variableExpression = (VariableExpression)theEObject;
				T result = caseVariableExpression(variableExpression);
				if (result == null) result = caseExpression(variableExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.VERB_DEFINITION: {
				VerbDefinition verbDefinition = (VerbDefinition)theEObject;
				T result = caseVerbDefinition(verbDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(verbDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.WASM_EXPRESSION: {
				WasmExpression wasmExpression = (WasmExpression)theEObject;
				T result = caseWasmExpression(wasmExpression);
				if (result == null) result = caseTypedExpressionDefinition(wasmExpression);
				if (result == null) result = caseExpression(wasmExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION: {
				WeightedLoadBalancerDefinition weightedLoadBalancerDefinition = (WeightedLoadBalancerDefinition)theEObject;
				T result = caseWeightedLoadBalancerDefinition(weightedLoadBalancerDefinition);
				if (result == null) result = caseLoadBalancerDefinition(weightedLoadBalancerDefinition);
				if (result == null) result = caseIdentifiedType(weightedLoadBalancerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.WHEN_DEFINITION: {
				WhenDefinition whenDefinition = (WhenDefinition)theEObject;
				T result = caseWhenDefinition(whenDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(whenDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.WIRE_TAP_DEFINITION: {
				WireTapDefinition wireTapDefinition = (WireTapDefinition)theEObject;
				T result = caseWireTapDefinition(wireTapDefinition);
				if (result == null) result = caseToDynamicDefinition(wireTapDefinition);
				if (result == null) result = caseNoOutputDefinition(wireTapDefinition);
				if (result == null) result = caseProcessorDefinition(wireTapDefinition);
				if (result == null) result = caseOptionalIdentifiedDefinition(wireTapDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT: {
				XmlSecurityDataFormat xmlSecurityDataFormat = (XmlSecurityDataFormat)theEObject;
				T result = caseXmlSecurityDataFormat(xmlSecurityDataFormat);
				if (result == null) result = caseDataFormat(xmlSecurityDataFormat);
				if (result == null) result = caseIdentifiedType(xmlSecurityDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.XML_TOKENIZER_EXPRESSION: {
				XmlTokenizerExpression xmlTokenizerExpression = (XmlTokenizerExpression)theEObject;
				T result = caseXmlTokenizerExpression(xmlTokenizerExpression);
				if (result == null) result = caseNamespaceAwareExpression(xmlTokenizerExpression);
				if (result == null) result = caseSingleInputTypedExpressionDefinition(xmlTokenizerExpression);
				if (result == null) result = caseTypedExpressionDefinition(xmlTokenizerExpression);
				if (result == null) result = caseExpression(xmlTokenizerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.XPATH_EXPRESSION: {
				XPathExpression xPathExpression = (XPathExpression)theEObject;
				T result = caseXPathExpression(xPathExpression);
				if (result == null) result = caseNamespaceAwareExpression(xPathExpression);
				if (result == null) result = caseSingleInputTypedExpressionDefinition(xPathExpression);
				if (result == null) result = caseTypedExpressionDefinition(xPathExpression);
				if (result == null) result = caseExpression(xPathExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.XQUERY_EXPRESSION: {
				XQueryExpression xQueryExpression = (XQueryExpression)theEObject;
				T result = caseXQueryExpression(xQueryExpression);
				if (result == null) result = caseNamespaceAwareExpression(xQueryExpression);
				if (result == null) result = caseSingleInputTypedExpressionDefinition(xQueryExpression);
				if (result == null) result = caseTypedExpressionDefinition(xQueryExpression);
				if (result == null) result = caseExpression(xQueryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.YAML_DATA_FORMAT: {
				YamlDataFormat yamlDataFormat = (YamlDataFormat)theEObject;
				T result = caseYamlDataFormat(yamlDataFormat);
				if (result == null) result = caseDataFormat(yamlDataFormat);
				if (result == null) result = caseIdentifiedType(yamlDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.YAML_TYPE_FILTER_DEFINITION: {
				YamlTypeFilterDefinition yamlTypeFilterDefinition = (YamlTypeFilterDefinition)theEObject;
				T result = caseYamlTypeFilterDefinition(yamlTypeFilterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ZIP_DEFLATER_DATA_FORMAT: {
				ZipDeflaterDataFormat zipDeflaterDataFormat = (ZipDeflaterDataFormat)theEObject;
				T result = caseZipDeflaterDataFormat(zipDeflaterDataFormat);
				if (result == null) result = caseDataFormat(zipDeflaterDataFormat);
				if (result == null) result = caseIdentifiedType(zipDeflaterDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT: {
				ZipFileDataFormat zipFileDataFormat = (ZipFileDataFormat)theEObject;
				T result = caseZipFileDataFormat(zipFileDataFormat);
				if (result == null) result = caseDataFormat(zipFileDataFormat);
				if (result == null) result = caseIdentifiedType(zipFileDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: {
				ZooKeeperServiceCallServiceDiscoveryConfiguration zooKeeperServiceCallServiceDiscoveryConfiguration = (ZooKeeperServiceCallServiceDiscoveryConfiguration)theEObject;
				T result = caseZooKeeperServiceCallServiceDiscoveryConfiguration(zooKeeperServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallServiceDiscoveryConfiguration(zooKeeperServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseServiceCallConfiguration(zooKeeperServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = caseIdentifiedType(zooKeeperServiceCallServiceDiscoveryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Consumer Template Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Camel Consumer Template Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCamelConsumerTemplateFactoryBean(AbstractCamelConsumerTemplateFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Camel Context Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCamelContextFactoryBean(AbstractCamelContextFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Endpoint Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Camel Endpoint Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCamelEndpointFactoryBean(AbstractCamelEndpointFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Camel Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCamelFactoryBean(AbstractCamelFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Fluent Producer Template Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Camel Fluent Producer Template Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCamelFluentProducerTemplateFactoryBean(AbstractCamelFluentProducerTemplateFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Producer Template Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Camel Producer Template Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCamelProducerTemplateFactoryBean(AbstractCamelProducerTemplateFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Redelivery Policy Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Camel Redelivery Policy Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCamelRedeliveryPolicyFactoryBean(AbstractCamelRedeliveryPolicyFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Thread Pool Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Camel Thread Pool Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCamelThreadPoolFactoryBean(AbstractCamelThreadPoolFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Jsse Util Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Jsse Util Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractJsseUtilFactoryBean(AbstractJsseUtilFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Key Managers Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Key Managers Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractKeyManagersParametersFactoryBean(AbstractKeyManagersParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Key Store Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Key Store Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractKeyStoreParametersFactoryBean(AbstractKeyStoreParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Secure Random Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Secure Random Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSecureRandomParametersFactoryBean(AbstractSecureRandomParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Trust Managers Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Trust Managers Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTrustManagersParametersFactoryBean(AbstractTrustManagersParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateDefinition(AggregateDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allowable Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowable Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowableValuesType(AllowableValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allowable Values Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowable Values Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowableValuesType1(AllowableValuesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Key Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Key Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiKeyDefinition(ApiKeyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationDefinition(ApplicationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asn1 Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asn1 Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsn1DataFormat(Asn1DataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avro Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avro Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvroDataFormat(AvroDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Barcode Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Barcode Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarcodeDataFormat(BarcodeDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64DataFormat(Base64DataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Error Handler Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseErrorHandlerDefinition(BaseErrorHandlerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Auth Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Auth Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicAuthDefinition(BasicAuthDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Batch Resequencer Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batch Resequencer Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatchResequencerConfig(BatchResequencerConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Constructor Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Constructor Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanConstructorDefinition(BeanConstructorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Constructors Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Constructors Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanConstructorsDefinition(BeanConstructorsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanDefinition(BeanDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Factory Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Factory Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanFactoryDefinition(BeanFactoryDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beanio Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beanio Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanioDataFormat(BeanioDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Properties Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Properties Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanPropertiesDefinition(BeanPropertiesDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanPropertyDefinition(BeanPropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beans Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beans Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeansDefinition(BeansDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bearer Token Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bearer Token Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBearerTokenDefinition(BearerTokenDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bindy Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bindy Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindyDataFormat(BindyDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blacklist Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blacklist Service Call Service Filter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlacklistServiceCallServiceFilterConfiguration(BlacklistServiceCallServiceFilterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caching Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caching Service Call Service Discovery Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachingServiceCallServiceDiscoveryConfiguration(CachingServiceCallServiceDiscoveryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Bean Post Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Bean Post Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelBeanPostProcessor(CamelBeanPostProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Consumer Template Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Consumer Template Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelConsumerTemplateFactoryBean(CamelConsumerTemplateFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Context Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelContextFactoryBean(CamelContextFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Endpoint Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Endpoint Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelEndpointFactoryBean(CamelEndpointFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Fluent Producer Template Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Fluent Producer Template Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelFluentProducerTemplateFactoryBean(CamelFluentProducerTemplateFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel JMX Agent Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel JMX Agent Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelJMXAgentDefinition(CamelJMXAgentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Producer Template Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Producer Template Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelProducerTemplateFactoryBean(CamelProducerTemplateFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Property Placeholder Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Property Placeholder Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelPropertyPlaceholderDefinition(CamelPropertyPlaceholderDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Property Placeholder Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Property Placeholder Function Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelPropertyPlaceholderFunctionDefinition(CamelPropertyPlaceholderFunctionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Property Placeholder Location Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Property Placeholder Location Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelPropertyPlaceholderLocationDefinition(CamelPropertyPlaceholderLocationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Redelivery Policy Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Redelivery Policy Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelRedeliveryPolicyFactoryBean(CamelRedeliveryPolicyFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Rest Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Rest Context Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelRestContextFactoryBean(CamelRestContextFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Route Configuration Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Route Configuration Context Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelRouteConfigurationContextFactoryBean(CamelRouteConfigurationContextFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Route Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Route Context Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelRouteContextFactoryBean(CamelRouteContextFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Route Controller Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Route Controller Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelRouteControllerDefinition(CamelRouteControllerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Route Template Context Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Route Template Context Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelRouteTemplateContextFactoryBean(CamelRouteTemplateContextFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Stream Caching Strategy Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Stream Caching Strategy Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelStreamCachingStrategyDefinition(CamelStreamCachingStrategyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camel Thread Pool Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camel Thread Pool Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamelThreadPoolFactoryBean(CamelThreadPoolFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchDefinition(CatchDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cbor Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cbor Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCborDataFormat(CborDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceDefinition(ChoiceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cipher Suites Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cipher Suites Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCipherSuitesParameters(CipherSuitesParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit Breaker Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit Breaker Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuitBreakerDefinition(CircuitBreakerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Check Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Check Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimCheckDefinition(ClaimCheckDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Service Call Service Discovery Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedServiceCallServiceDiscoveryConfiguration(CombinedServiceCallServiceDiscoveryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Service Call Service Filter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedServiceCallServiceFilterConfiguration(CombinedServiceCallServiceFilterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Scan Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Scan Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentScanDefinition(ComponentScanDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantExpression(ConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstants(Constants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consul Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consul Service Call Service Discovery Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsulServiceCallServiceDiscoveryConfiguration(ConsulServiceCallServiceDiscoveryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Scan Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Scan Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextScanDefinition(ContextScanDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert Body Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert Body Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvertBodyDefinition(ConvertBodyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert Header Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert Header Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvertHeaderDefinition(ConvertHeaderDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert Variable Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvertVariableDefinition(ConvertVariableDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crypto Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crypto Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCryptoDataFormat(CryptoDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSimple Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSimple Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSimpleExpression(CSimpleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Csv Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Csv Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsvDataFormat(CsvDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDataFormat(CustomDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Load Balancer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomLoadBalancerDefinition(CustomLoadBalancerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Service Call Service Filter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomServiceCallServiceFilterConfiguration(CustomServiceCallServiceFilterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Transformer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Transformer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTransformerDefinition(CustomTransformerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Validator Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Validator Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomValidatorDefinition(CustomValidatorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFormat(DataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Formats Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Formats Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFormatsDefinition(DataFormatsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Formats Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Formats Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFormatsType(DataFormatsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Format Transformer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Format Transformer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFormatTransformerDefinition(DataFormatTransformerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datasonnet Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datasonnet Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasonnetExpression(DatasonnetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dead Letter Channel Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dead Letter Channel Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadLetterChannelDefinition(DeadLetterChannelDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Error Handler Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultErrorHandlerDefinition(DefaultErrorHandlerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Service Call Service Load Balancer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Service Call Service Load Balancer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultServiceCallServiceLoadBalancerConfiguration(DefaultServiceCallServiceLoadBalancerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayDefinition(DelayDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteDefinition(DeleteDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dfdl Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dfdl Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDfdlDataFormat(DfdlDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dns Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dns Service Call Service Discovery Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDnsServiceCallServiceDiscoveryConfiguration(DnsServiceCallServiceDiscoveryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Router Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Router Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicRouterDefinition(DynamicRouterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Transformer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Transformer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointTransformerDefinition(EndpointTransformerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Validator Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Validator Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointValidatorDefinition(EndpointValidatorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enrich Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enrich Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnrichDefinition(EnrichDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Handler Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorHandlerDefinition(ErrorHandlerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangePropertyExpression(ExchangePropertyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Sub Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Sub Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionSubElementDefinition(ExpressionSubElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failover Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failover Load Balancer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailoverLoadBalancerDefinition(FailoverLoadBalancerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Tolerance Configuration Common</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Tolerance Configuration Common</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultToleranceConfigurationCommon(FaultToleranceConfigurationCommon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Tolerance Configuration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Tolerance Configuration Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultToleranceConfigurationDefinition(FaultToleranceConfigurationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fhir Dataformat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fhir Dataformat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFhirDataformat(FhirDataformat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fhir Json Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fhir Json Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFhirJsonDataFormat(FhirJsonDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fhir Xml Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fhir Xml Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFhirXmlDataFormat(FhirXmlDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterDefinition(FilterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterParameters(FilterParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finally Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finally Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinallyDefinition(FinallyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flatpack Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flatpack Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatpackDataFormat(FlatpackDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fory Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fory Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForyDataFormat(ForyDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromDefinition(FromDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDefinition(GetDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Option Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Option Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalOptionDefinition(GlobalOptionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Options Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Options Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalOptionsDefinition(GlobalOptionsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grok Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grok Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrokDataFormat(GrokDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Groovy Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Groovy Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroovyExpression(GroovyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gzip Deflater Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gzip Deflater Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGzipDeflaterDataFormat(GzipDeflaterDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadDefinition(HeadDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderExpression(HeaderExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthy Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthy Service Call Service Filter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthyServiceCallServiceFilterConfiguration(HealthyServiceCallServiceFilterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl7 Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl7 Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl7DataFormat(Hl7DataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl7 Terser Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl7 Terser Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl7TerserExpression(Hl7TerserExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ical Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ical Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIcalDataFormat(IcalDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idempotent Consumer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idempotent Consumer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdempotentConsumerDefinition(IdempotentConsumerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedType(IdentifiedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputTypeDefinition(InputTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercept Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercept Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterceptDefinition(InterceptDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercept From Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercept From Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterceptFromDefinition(InterceptFromDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercept Send To Endpoint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercept Send To Endpoint Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterceptSendToEndpointDefinition(InterceptSendToEndpointDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iso8583 Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iso8583 Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIso8583DataFormat(Iso8583DataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jackson XML Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jackson XML Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJacksonXMLDataFormat(JacksonXMLDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaExpression(JavaExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Script Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Script Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaScriptExpression(JavaScriptExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jaxb Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jaxb Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJaxbDataFormat(JaxbDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joor Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoorExpression(JoorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jq Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jq Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJqExpression(JqExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Api Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Api Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonApiDataFormat(JsonApiDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonDataFormat(JsonDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Path Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Path Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonPathExpression(JsonPathExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jta Transaction Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jta Transaction Error Handler Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJtaTransactionErrorHandlerDefinition(JtaTransactionErrorHandlerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kamelet Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kamelet Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKameletDefinition(KameletDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Managers Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Managers Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyManagersParametersFactoryBean(KeyManagersParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Store Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Store Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyStoreParametersFactoryBean(KeyStoreParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kubernetes Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kubernetes Service Call Service Discovery Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKubernetesServiceCallServiceDiscoveryConfiguration(KubernetesServiceCallServiceDiscoveryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang Chain4 JCharacter Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang Chain4 JCharacter Tokenizer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangChain4JCharacterTokenizerDefinition(LangChain4JCharacterTokenizerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang Chain4 JLine Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang Chain4 JLine Tokenizer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangChain4JLineTokenizerDefinition(LangChain4JLineTokenizerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang Chain4 JParagraph Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang Chain4 JParagraph Tokenizer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangChain4JParagraphTokenizerDefinition(LangChain4JParagraphTokenizerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang Chain4 JSentence Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang Chain4 JSentence Tokenizer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangChain4JSentenceTokenizerDefinition(LangChain4JSentenceTokenizerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang Chain4j Tokenizer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang Chain4j Tokenizer Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangChain4jTokenizerImplementation(LangChain4jTokenizerImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang Chain4 JWord Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang Chain4 JWord Tokenizer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangChain4JWordTokenizerDefinition(LangChain4JWordTokenizerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageExpression(LanguageExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Balance Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Balance Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBalanceDefinition(LoadBalanceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Balancer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBalancerDefinition(LoadBalancerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Transformer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Transformer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadTransformerDefinition(LoadTransformerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogDefinition(LogDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopDefinition(LoopDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lzf Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lzf Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLzfDataFormat(LzfDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marshal Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marshal Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarshalDefinition(MarshalDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCallExpression(MethodCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mime Multipart Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mime Multipart Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMimeMultipartDataFormat(MimeMultipartDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Lifecycle Strategy Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Lifecycle Strategy Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLifecycleStrategySupport(ModelLifecycleStrategySupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multicast Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multicast Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulticastDefinition(MulticastDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutual TLS Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutual TLS Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMutualTLSDefinition(MutualTLSDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mvel Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mvel Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMvelExpression(MvelExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Aware Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Aware Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceAwareExpression(NamespaceAwareExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Error Handler Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoErrorHandlerDefinition(NoErrorHandlerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Output Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Output Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoOutputDefinition(NoOutputDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OAuth2 Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OAuth2 Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOAuth2Definition(OAuth2Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ognl Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ognl Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOgnlExpression(OgnlExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Completion Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Completion Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnCompletionDefinition(OnCompletionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Exception Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Exception Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnExceptionDefinition(OnExceptionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Fallback Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Fallback Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnFallbackDefinition(OnFallbackDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On When Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On When Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnWhenDefinition(OnWhenDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Api Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Api Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenApiDefinition(OpenApiDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Id Connect Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Id Connect Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenIdConnectDefinition(OpenIdConnectDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimistic Lock Retry Policy Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimistic Lock Retry Policy Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimisticLockRetryPolicyDefinition(OptimisticLockRetryPolicyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Identified Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Identified Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalIdentifiedDefinition(OptionalIdentifiedDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Otherwise Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Otherwise Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherwiseDefinition(OtherwiseDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputTypeDefinition(OutputTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Scan Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Scan Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageScanDefinition(PackageScanDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamDefinition(ParamDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parquet Avro Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parquet Avro Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParquetAvroDataFormat(ParquetAvroDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pass Through Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pass Through Service Call Service Filter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassThroughServiceCallServiceFilterConfiguration(PassThroughServiceCallServiceFilterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patch Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patch Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatchDefinition(PatchDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Based Package Scan Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Based Package Scan Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternBasedPackageScanFilter(PatternBasedPackageScanFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pausable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pausable Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePausableDefinition(PausableDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pgp Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pgp Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePgpDataFormat(PgpDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipeline Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipeline Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipelineDefinition(PipelineDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyDefinition(PolicyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poll Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poll Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollDefinition(PollDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poll Enrich Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poll Enrich Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollEnrichDefinition(PollEnrichDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostDefinition(PostDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Validator Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Validator Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateValidatorDefinition(PredicateValidatorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessDefinition(ProcessDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorDefinition(ProcessorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyDefinition(PropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyDefinitions(PropertyDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Expression Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Expression Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyExpressionDefinition(PropertyExpressionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protobuf Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protobuf Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtobufDataFormat(ProtobufDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Put Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Put Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePutDefinition(PutDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Python Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Python Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePythonExpression(PythonExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Load Balancer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomLoadBalancerDefinition(RandomLoadBalancerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recipient List Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recipient List Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecipientListDefinition(RecipientListDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redelivery Policy Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redelivery Policy Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedeliveryPolicyDefinition(RedeliveryPolicyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Error Handler Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefErrorHandlerDefinition(RefErrorHandlerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefExpression(RefExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Header Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Header Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveHeaderDefinition(RemoveHeaderDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Headers Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Headers Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveHeadersDefinition(RemoveHeadersDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Properties Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Properties Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemovePropertiesDefinition(RemovePropertiesDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemovePropertyDefinition(RemovePropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Variable Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveVariableDefinition(RemoveVariableDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resequence Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resequence Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResequenceDefinition(ResequenceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resequencer Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resequencer Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResequencerConfig(ResequencerConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resilience4 JConfiguration Common</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resilience4 JConfiguration Common</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResilience4JConfigurationCommon(Resilience4JConfigurationCommon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resilience4 JConfiguration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resilience4 JConfiguration Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResilience4JConfigurationDefinition(Resilience4JConfigurationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Header Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Header Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseHeaderDefinition(ResponseHeaderDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Message Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Message Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseMessageDefinition(ResponseMessageDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Binding Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Binding Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestBindingDefinition(RestBindingDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Configuration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Configuration Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestConfigurationDefinition(RestConfigurationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Context Ref Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Context Ref Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestContextRefDefinition(RestContextRefDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestDefinition(RestDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestPropertyDefinition(RestPropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rests Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rests Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestsDefinition(RestsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Securities Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Securities Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestSecuritiesDefinition(RestSecuritiesDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Security Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Security Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestSecurityDefinition(RestSecurityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resumable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resumable Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResumableDefinition(ResumableDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rollback Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rollback Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollbackDefinition(RollbackDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round Robin Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round Robin Load Balancer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundRobinLoadBalancerDefinition(RoundRobinLoadBalancerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Builder Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Builder Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteBuilderDefinition(RouteBuilderDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Configuration Context Ref Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Configuration Context Ref Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteConfigurationContextRefDefinition(RouteConfigurationContextRefDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Configuration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Configuration Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteConfigurationDefinition(RouteConfigurationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Configurations Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Configurations Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteConfigurationsDefinition(RouteConfigurationsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Context Ref Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Context Ref Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteContextRefDefinition(RouteContextRefDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteDefinition(RouteDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routes Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routes Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutesDefinition(RoutesDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Template Context Ref Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Template Context Ref Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteTemplateContextRefDefinition(RouteTemplateContextRefDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Template Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Template Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteTemplateDefinition(RouteTemplateDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Template Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Template Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteTemplateParameterDefinition(RouteTemplateParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Templates Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Templates Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteTemplatesDefinition(RouteTemplatesDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routing Slip Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routing Slip Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutingSlipDefinition(RoutingSlipDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rss Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rss Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRssDataFormat(RssDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Saga Action Uri Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Saga Action Uri Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSagaActionUriDefinition(SagaActionUriDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Saga Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Saga Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSagaDefinition(SagaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSamplingDefinition(SamplingDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptDefinition(ScriptDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secure Random Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secure Random Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecureRandomParametersFactoryBean(SecureRandomParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secure Socket Protocols Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secure Socket Protocols Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecureSocketProtocolsParameters(SecureSocketProtocolsParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityDefinition(SecurityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendDefinition(SendDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Call Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Call Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCallConfiguration(ServiceCallConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Call Configuration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Call Configuration Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCallConfigurationDefinition(ServiceCallConfigurationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Call Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Call Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCallDefinition(ServiceCallDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Call Definition Constants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Call Definition Constants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCallDefinitionConstants(ServiceCallDefinitionConstants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Call Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Call Expression Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCallExpressionConfiguration(ServiceCallExpressionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Call Service Chooser Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Call Service Chooser Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCallServiceChooserConfiguration(ServiceCallServiceChooserConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Call Service Discovery Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCallServiceDiscoveryConfiguration(ServiceCallServiceDiscoveryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Call Service Filter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Call Service Filter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCallServiceFilterConfiguration(ServiceCallServiceFilterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Call Service Load Balancer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Call Service Load Balancer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCallServiceLoadBalancerConfiguration(ServiceCallServiceLoadBalancerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Body Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Body Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetBodyDefinition(SetBodyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Exchange Pattern Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Exchange Pattern Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetExchangePatternDefinition(SetExchangePatternDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Header Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Header Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetHeaderDefinition(SetHeaderDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Headers Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Headers Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetHeadersDefinition(SetHeadersDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetPropertyDefinition(SetPropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Variable Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetVariableDefinition(SetVariableDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Variables Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Variables Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetVariablesDefinition(SetVariablesDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleExpression(SimpleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Input Typed Expression Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Input Typed Expression Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleInputTypedExpressionDefinition(SingleInputTypedExpressionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smooks Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smooks Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmooksDataFormat(SmooksDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sni Host Names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sni Host Names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSniHostNames(SniHostNames object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soap Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soap Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoapDataFormat(SoapDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortDefinition(SortDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sp EL Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sp EL Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpELExpression(SpELExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitDefinition(SplitDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spring Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spring Error Handler Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpringErrorHandlerDefinition(SpringErrorHandlerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spring Transaction Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spring Transaction Error Handler Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpringTransactionErrorHandlerDefinition(SpringTransactionErrorHandlerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssl Context Client Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssl Context Client Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSslContextClientParametersFactoryBean(SslContextClientParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssl Context Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssl Context Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSslContextParametersFactoryBean(SslContextParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssl Context Server Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssl Context Server Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSslContextServerParametersFactoryBean(SslContextServerParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Service Call Service Discovery Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticServiceCallServiceDiscoveryConfiguration(StaticServiceCallServiceDiscoveryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepDefinition(StepDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sticky Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sticky Load Balancer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStickyLoadBalancerDefinition(StickyLoadBalancerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopDefinition(StopDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Resequencer Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Resequencer Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamResequencerConfig(StreamResequencerConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swift Mt Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swift Mt Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwiftMtDataFormat(SwiftMtDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swift Mx Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swift Mx Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwiftMxDataFormat(SwiftMxDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syslog Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syslog Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyslogDataFormat(SyslogDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tar File Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tar File Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarFileDataFormat(TarFileDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templated Route Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templated Route Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplatedRouteDefinition(TemplatedRouteDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templated Route Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templated Route Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplatedRouteParameterDefinition(TemplatedRouteParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templated Routes Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templated Routes Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplatedRoutesDefinition(TemplatedRoutesDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Pool Profile Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Pool Profile Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadPoolProfileDefinition(ThreadPoolProfileDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threads Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threads Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadsDefinition(ThreadsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thrift Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thrift Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThriftDataFormat(ThriftDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throttle Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throttle Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrottleDefinition(ThrottleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Exception Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Exception Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowExceptionDefinition(ThrowExceptionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tidy Markup Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tidy Markup Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTidyMarkupDataFormat(TidyMarkupDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToDefinition(ToDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Dynamic Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Dynamic Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToDynamicDefinition(ToDynamicDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tokenizer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tokenizer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenizerDefinition(TokenizerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tokenizer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tokenizer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenizerExpression(TokenizerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tokenizer Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tokenizer Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenizerImplementation(TokenizerImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic Load Balancer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopicLoadBalancerDefinition(TopicLoadBalancerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transacted Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transacted Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactedDefinition(TransactedDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Error Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Error Handler Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionErrorHandlerDefinition(TransactionErrorHandlerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformDefinition(TransformDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformer(Transformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformers Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformers Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformersDefinition(TransformersDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trust Managers Parameters Factory Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trust Managers Parameters Factory Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustManagersParametersFactoryBean(TrustManagersParametersFactoryBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryDefinition(TryDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Expression Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Expression Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedExpressionDefinition(TypedExpressionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uni Vocity Abstract Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uni Vocity Abstract Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniVocityAbstractDataFormat(UniVocityAbstractDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uni Vocity Csv Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uni Vocity Csv Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniVocityCsvDataFormat(UniVocityCsvDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uni Vocity Fixed Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uni Vocity Fixed Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniVocityFixedDataFormat(UniVocityFixedDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uni Vocity Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uni Vocity Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniVocityHeader(UniVocityHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uni Vocity Tsv Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uni Vocity Tsv Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniVocityTsvDataFormat(UniVocityTsvDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unmarshal Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unmarshal Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnmarshalDefinition(UnmarshalDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidateDefinition(ValidateDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidator(Validator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validators Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validators Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidatorsDefinition(ValidatorsDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableExpression(VariableExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verb Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verb Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerbDefinition(VerbDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wasm Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wasm Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWasmExpression(WasmExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weighted Load Balancer Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weighted Load Balancer Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightedLoadBalancerDefinition(WeightedLoadBalancerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenDefinition(WhenDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Tap Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Tap Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireTapDefinition(WireTapDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Security Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Security Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlSecurityDataFormat(XmlSecurityDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Tokenizer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Tokenizer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlTokenizerExpression(XmlTokenizerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPath Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPath Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXPathExpression(XPathExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XQuery Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XQuery Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXQueryExpression(XQueryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yaml Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yaml Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYamlDataFormat(YamlDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yaml Type Filter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yaml Type Filter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYamlTypeFilterDefinition(YamlTypeFilterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zip Deflater Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zip Deflater Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZipDeflaterDataFormat(ZipDeflaterDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zip File Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zip File Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZipFileDataFormat(ZipFileDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zoo Keeper Service Call Service Discovery Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zoo Keeper Service Call Service Discovery Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZooKeeperServiceCallServiceDiscoveryConfiguration(ZooKeeperServiceCallServiceDiscoveryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CamelSpringSwitch

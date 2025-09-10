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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fennec.camel.camelspring.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage
 * @generated
 */
public class CamelSpringAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CamelSpringPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelSpringAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CamelSpringPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelSpringSwitch<Adapter> modelSwitch =
		new CamelSpringSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractCamelConsumerTemplateFactoryBean(AbstractCamelConsumerTemplateFactoryBean object) {
				return createAbstractCamelConsumerTemplateFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelContextFactoryBean(AbstractCamelContextFactoryBean object) {
				return createAbstractCamelContextFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelEndpointFactoryBean(AbstractCamelEndpointFactoryBean object) {
				return createAbstractCamelEndpointFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelFactoryBean(AbstractCamelFactoryBean object) {
				return createAbstractCamelFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelFluentProducerTemplateFactoryBean(AbstractCamelFluentProducerTemplateFactoryBean object) {
				return createAbstractCamelFluentProducerTemplateFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelProducerTemplateFactoryBean(AbstractCamelProducerTemplateFactoryBean object) {
				return createAbstractCamelProducerTemplateFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelRedeliveryPolicyFactoryBean(AbstractCamelRedeliveryPolicyFactoryBean object) {
				return createAbstractCamelRedeliveryPolicyFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelThreadPoolFactoryBean(AbstractCamelThreadPoolFactoryBean object) {
				return createAbstractCamelThreadPoolFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractJsseUtilFactoryBean(AbstractJsseUtilFactoryBean object) {
				return createAbstractJsseUtilFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractKeyManagersParametersFactoryBean(AbstractKeyManagersParametersFactoryBean object) {
				return createAbstractKeyManagersParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractKeyStoreParametersFactoryBean(AbstractKeyStoreParametersFactoryBean object) {
				return createAbstractKeyStoreParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractSecureRandomParametersFactoryBean(AbstractSecureRandomParametersFactoryBean object) {
				return createAbstractSecureRandomParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractTrustManagersParametersFactoryBean(AbstractTrustManagersParametersFactoryBean object) {
				return createAbstractTrustManagersParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAggregateDefinition(AggregateDefinition object) {
				return createAggregateDefinitionAdapter();
			}
			@Override
			public Adapter caseAllowableValuesType(AllowableValuesType object) {
				return createAllowableValuesTypeAdapter();
			}
			@Override
			public Adapter caseAllowableValuesType1(AllowableValuesType1 object) {
				return createAllowableValuesType1Adapter();
			}
			@Override
			public Adapter caseApiKeyDefinition(ApiKeyDefinition object) {
				return createApiKeyDefinitionAdapter();
			}
			@Override
			public Adapter caseApplicationDefinition(ApplicationDefinition object) {
				return createApplicationDefinitionAdapter();
			}
			@Override
			public Adapter caseAsn1DataFormat(Asn1DataFormat object) {
				return createAsn1DataFormatAdapter();
			}
			@Override
			public Adapter caseAvroDataFormat(AvroDataFormat object) {
				return createAvroDataFormatAdapter();
			}
			@Override
			public Adapter caseBarcodeDataFormat(BarcodeDataFormat object) {
				return createBarcodeDataFormatAdapter();
			}
			@Override
			public Adapter caseBase64DataFormat(Base64DataFormat object) {
				return createBase64DataFormatAdapter();
			}
			@Override
			public Adapter caseBaseErrorHandlerDefinition(BaseErrorHandlerDefinition object) {
				return createBaseErrorHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseBasicAuthDefinition(BasicAuthDefinition object) {
				return createBasicAuthDefinitionAdapter();
			}
			@Override
			public Adapter caseBatchResequencerConfig(BatchResequencerConfig object) {
				return createBatchResequencerConfigAdapter();
			}
			@Override
			public Adapter caseBeanConstructorDefinition(BeanConstructorDefinition object) {
				return createBeanConstructorDefinitionAdapter();
			}
			@Override
			public Adapter caseBeanConstructorsDefinition(BeanConstructorsDefinition object) {
				return createBeanConstructorsDefinitionAdapter();
			}
			@Override
			public Adapter caseBeanDefinition(BeanDefinition object) {
				return createBeanDefinitionAdapter();
			}
			@Override
			public Adapter caseBeanFactoryDefinition(BeanFactoryDefinition object) {
				return createBeanFactoryDefinitionAdapter();
			}
			@Override
			public Adapter caseBeanioDataFormat(BeanioDataFormat object) {
				return createBeanioDataFormatAdapter();
			}
			@Override
			public Adapter caseBeanPropertiesDefinition(BeanPropertiesDefinition object) {
				return createBeanPropertiesDefinitionAdapter();
			}
			@Override
			public Adapter caseBeanPropertyDefinition(BeanPropertyDefinition object) {
				return createBeanPropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseBeansDefinition(BeansDefinition object) {
				return createBeansDefinitionAdapter();
			}
			@Override
			public Adapter caseBearerTokenDefinition(BearerTokenDefinition object) {
				return createBearerTokenDefinitionAdapter();
			}
			@Override
			public Adapter caseBindyDataFormat(BindyDataFormat object) {
				return createBindyDataFormatAdapter();
			}
			@Override
			public Adapter caseBlacklistServiceCallServiceFilterConfiguration(BlacklistServiceCallServiceFilterConfiguration object) {
				return createBlacklistServiceCallServiceFilterConfigurationAdapter();
			}
			@Override
			public Adapter caseCachingServiceCallServiceDiscoveryConfiguration(CachingServiceCallServiceDiscoveryConfiguration object) {
				return createCachingServiceCallServiceDiscoveryConfigurationAdapter();
			}
			@Override
			public Adapter caseCamelBeanPostProcessor(CamelBeanPostProcessor object) {
				return createCamelBeanPostProcessorAdapter();
			}
			@Override
			public Adapter caseCamelConsumerTemplateFactoryBean(CamelConsumerTemplateFactoryBean object) {
				return createCamelConsumerTemplateFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelContextFactoryBean(CamelContextFactoryBean object) {
				return createCamelContextFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelEndpointFactoryBean(CamelEndpointFactoryBean object) {
				return createCamelEndpointFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelFluentProducerTemplateFactoryBean(CamelFluentProducerTemplateFactoryBean object) {
				return createCamelFluentProducerTemplateFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelJMXAgentDefinition(CamelJMXAgentDefinition object) {
				return createCamelJMXAgentDefinitionAdapter();
			}
			@Override
			public Adapter caseCamelProducerTemplateFactoryBean(CamelProducerTemplateFactoryBean object) {
				return createCamelProducerTemplateFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelPropertyPlaceholderDefinition(CamelPropertyPlaceholderDefinition object) {
				return createCamelPropertyPlaceholderDefinitionAdapter();
			}
			@Override
			public Adapter caseCamelPropertyPlaceholderFunctionDefinition(CamelPropertyPlaceholderFunctionDefinition object) {
				return createCamelPropertyPlaceholderFunctionDefinitionAdapter();
			}
			@Override
			public Adapter caseCamelPropertyPlaceholderLocationDefinition(CamelPropertyPlaceholderLocationDefinition object) {
				return createCamelPropertyPlaceholderLocationDefinitionAdapter();
			}
			@Override
			public Adapter caseCamelRedeliveryPolicyFactoryBean(CamelRedeliveryPolicyFactoryBean object) {
				return createCamelRedeliveryPolicyFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelRestContextFactoryBean(CamelRestContextFactoryBean object) {
				return createCamelRestContextFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelRouteConfigurationContextFactoryBean(CamelRouteConfigurationContextFactoryBean object) {
				return createCamelRouteConfigurationContextFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelRouteContextFactoryBean(CamelRouteContextFactoryBean object) {
				return createCamelRouteContextFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelRouteControllerDefinition(CamelRouteControllerDefinition object) {
				return createCamelRouteControllerDefinitionAdapter();
			}
			@Override
			public Adapter caseCamelRouteTemplateContextFactoryBean(CamelRouteTemplateContextFactoryBean object) {
				return createCamelRouteTemplateContextFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelStreamCachingStrategyDefinition(CamelStreamCachingStrategyDefinition object) {
				return createCamelStreamCachingStrategyDefinitionAdapter();
			}
			@Override
			public Adapter caseCamelThreadPoolFactoryBean(CamelThreadPoolFactoryBean object) {
				return createCamelThreadPoolFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCatchDefinition(CatchDefinition object) {
				return createCatchDefinitionAdapter();
			}
			@Override
			public Adapter caseCborDataFormat(CborDataFormat object) {
				return createCborDataFormatAdapter();
			}
			@Override
			public Adapter caseChoiceDefinition(ChoiceDefinition object) {
				return createChoiceDefinitionAdapter();
			}
			@Override
			public Adapter caseCipherSuitesParameters(CipherSuitesParameters object) {
				return createCipherSuitesParametersAdapter();
			}
			@Override
			public Adapter caseCircuitBreakerDefinition(CircuitBreakerDefinition object) {
				return createCircuitBreakerDefinitionAdapter();
			}
			@Override
			public Adapter caseClaimCheckDefinition(ClaimCheckDefinition object) {
				return createClaimCheckDefinitionAdapter();
			}
			@Override
			public Adapter caseCombinedServiceCallServiceDiscoveryConfiguration(CombinedServiceCallServiceDiscoveryConfiguration object) {
				return createCombinedServiceCallServiceDiscoveryConfigurationAdapter();
			}
			@Override
			public Adapter caseCombinedServiceCallServiceFilterConfiguration(CombinedServiceCallServiceFilterConfiguration object) {
				return createCombinedServiceCallServiceFilterConfigurationAdapter();
			}
			@Override
			public Adapter caseComponentScanDefinition(ComponentScanDefinition object) {
				return createComponentScanDefinitionAdapter();
			}
			@Override
			public Adapter caseConstantExpression(ConstantExpression object) {
				return createConstantExpressionAdapter();
			}
			@Override
			public Adapter caseConstants(Constants object) {
				return createConstantsAdapter();
			}
			@Override
			public Adapter caseConsulServiceCallServiceDiscoveryConfiguration(ConsulServiceCallServiceDiscoveryConfiguration object) {
				return createConsulServiceCallServiceDiscoveryConfigurationAdapter();
			}
			@Override
			public Adapter caseContextScanDefinition(ContextScanDefinition object) {
				return createContextScanDefinitionAdapter();
			}
			@Override
			public Adapter caseConvertBodyDefinition(ConvertBodyDefinition object) {
				return createConvertBodyDefinitionAdapter();
			}
			@Override
			public Adapter caseConvertHeaderDefinition(ConvertHeaderDefinition object) {
				return createConvertHeaderDefinitionAdapter();
			}
			@Override
			public Adapter caseConvertVariableDefinition(ConvertVariableDefinition object) {
				return createConvertVariableDefinitionAdapter();
			}
			@Override
			public Adapter caseCryptoDataFormat(CryptoDataFormat object) {
				return createCryptoDataFormatAdapter();
			}
			@Override
			public Adapter caseCSimpleExpression(CSimpleExpression object) {
				return createCSimpleExpressionAdapter();
			}
			@Override
			public Adapter caseCsvDataFormat(CsvDataFormat object) {
				return createCsvDataFormatAdapter();
			}
			@Override
			public Adapter caseCustomDataFormat(CustomDataFormat object) {
				return createCustomDataFormatAdapter();
			}
			@Override
			public Adapter caseCustomLoadBalancerDefinition(CustomLoadBalancerDefinition object) {
				return createCustomLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseCustomServiceCallServiceFilterConfiguration(CustomServiceCallServiceFilterConfiguration object) {
				return createCustomServiceCallServiceFilterConfigurationAdapter();
			}
			@Override
			public Adapter caseCustomTransformerDefinition(CustomTransformerDefinition object) {
				return createCustomTransformerDefinitionAdapter();
			}
			@Override
			public Adapter caseCustomValidatorDefinition(CustomValidatorDefinition object) {
				return createCustomValidatorDefinitionAdapter();
			}
			@Override
			public Adapter caseDataFormat(DataFormat object) {
				return createDataFormatAdapter();
			}
			@Override
			public Adapter caseDataFormatsDefinition(DataFormatsDefinition object) {
				return createDataFormatsDefinitionAdapter();
			}
			@Override
			public Adapter caseDataFormatsType(DataFormatsType object) {
				return createDataFormatsTypeAdapter();
			}
			@Override
			public Adapter caseDataFormatTransformerDefinition(DataFormatTransformerDefinition object) {
				return createDataFormatTransformerDefinitionAdapter();
			}
			@Override
			public Adapter caseDatasonnetExpression(DatasonnetExpression object) {
				return createDatasonnetExpressionAdapter();
			}
			@Override
			public Adapter caseDeadLetterChannelDefinition(DeadLetterChannelDefinition object) {
				return createDeadLetterChannelDefinitionAdapter();
			}
			@Override
			public Adapter caseDefaultErrorHandlerDefinition(DefaultErrorHandlerDefinition object) {
				return createDefaultErrorHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseDefaultServiceCallServiceLoadBalancerConfiguration(DefaultServiceCallServiceLoadBalancerConfiguration object) {
				return createDefaultServiceCallServiceLoadBalancerConfigurationAdapter();
			}
			@Override
			public Adapter caseDelayDefinition(DelayDefinition object) {
				return createDelayDefinitionAdapter();
			}
			@Override
			public Adapter caseDeleteDefinition(DeleteDefinition object) {
				return createDeleteDefinitionAdapter();
			}
			@Override
			public Adapter caseDfdlDataFormat(DfdlDataFormat object) {
				return createDfdlDataFormatAdapter();
			}
			@Override
			public Adapter caseDnsServiceCallServiceDiscoveryConfiguration(DnsServiceCallServiceDiscoveryConfiguration object) {
				return createDnsServiceCallServiceDiscoveryConfigurationAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDynamicRouterDefinition(DynamicRouterDefinition object) {
				return createDynamicRouterDefinitionAdapter();
			}
			@Override
			public Adapter caseEndpointTransformerDefinition(EndpointTransformerDefinition object) {
				return createEndpointTransformerDefinitionAdapter();
			}
			@Override
			public Adapter caseEndpointValidatorDefinition(EndpointValidatorDefinition object) {
				return createEndpointValidatorDefinitionAdapter();
			}
			@Override
			public Adapter caseEnrichDefinition(EnrichDefinition object) {
				return createEnrichDefinitionAdapter();
			}
			@Override
			public Adapter caseErrorHandlerDefinition(ErrorHandlerDefinition object) {
				return createErrorHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseExchangePropertyExpression(ExchangePropertyExpression object) {
				return createExchangePropertyExpressionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionSubElementDefinition(ExpressionSubElementDefinition object) {
				return createExpressionSubElementDefinitionAdapter();
			}
			@Override
			public Adapter caseFailoverLoadBalancerDefinition(FailoverLoadBalancerDefinition object) {
				return createFailoverLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseFaultToleranceConfigurationCommon(FaultToleranceConfigurationCommon object) {
				return createFaultToleranceConfigurationCommonAdapter();
			}
			@Override
			public Adapter caseFaultToleranceConfigurationDefinition(FaultToleranceConfigurationDefinition object) {
				return createFaultToleranceConfigurationDefinitionAdapter();
			}
			@Override
			public Adapter caseFhirDataformat(FhirDataformat object) {
				return createFhirDataformatAdapter();
			}
			@Override
			public Adapter caseFhirJsonDataFormat(FhirJsonDataFormat object) {
				return createFhirJsonDataFormatAdapter();
			}
			@Override
			public Adapter caseFhirXmlDataFormat(FhirXmlDataFormat object) {
				return createFhirXmlDataFormatAdapter();
			}
			@Override
			public Adapter caseFilterDefinition(FilterDefinition object) {
				return createFilterDefinitionAdapter();
			}
			@Override
			public Adapter caseFilterParameters(FilterParameters object) {
				return createFilterParametersAdapter();
			}
			@Override
			public Adapter caseFinallyDefinition(FinallyDefinition object) {
				return createFinallyDefinitionAdapter();
			}
			@Override
			public Adapter caseFlatpackDataFormat(FlatpackDataFormat object) {
				return createFlatpackDataFormatAdapter();
			}
			@Override
			public Adapter caseForyDataFormat(ForyDataFormat object) {
				return createForyDataFormatAdapter();
			}
			@Override
			public Adapter caseFromDefinition(FromDefinition object) {
				return createFromDefinitionAdapter();
			}
			@Override
			public Adapter caseGetDefinition(GetDefinition object) {
				return createGetDefinitionAdapter();
			}
			@Override
			public Adapter caseGlobalOptionDefinition(GlobalOptionDefinition object) {
				return createGlobalOptionDefinitionAdapter();
			}
			@Override
			public Adapter caseGlobalOptionsDefinition(GlobalOptionsDefinition object) {
				return createGlobalOptionsDefinitionAdapter();
			}
			@Override
			public Adapter caseGrokDataFormat(GrokDataFormat object) {
				return createGrokDataFormatAdapter();
			}
			@Override
			public Adapter caseGroovyExpression(GroovyExpression object) {
				return createGroovyExpressionAdapter();
			}
			@Override
			public Adapter caseGzipDeflaterDataFormat(GzipDeflaterDataFormat object) {
				return createGzipDeflaterDataFormatAdapter();
			}
			@Override
			public Adapter caseHeadDefinition(HeadDefinition object) {
				return createHeadDefinitionAdapter();
			}
			@Override
			public Adapter caseHeaderExpression(HeaderExpression object) {
				return createHeaderExpressionAdapter();
			}
			@Override
			public Adapter caseHealthyServiceCallServiceFilterConfiguration(HealthyServiceCallServiceFilterConfiguration object) {
				return createHealthyServiceCallServiceFilterConfigurationAdapter();
			}
			@Override
			public Adapter caseHl7DataFormat(Hl7DataFormat object) {
				return createHl7DataFormatAdapter();
			}
			@Override
			public Adapter caseHl7TerserExpression(Hl7TerserExpression object) {
				return createHl7TerserExpressionAdapter();
			}
			@Override
			public Adapter caseIcalDataFormat(IcalDataFormat object) {
				return createIcalDataFormatAdapter();
			}
			@Override
			public Adapter caseIdempotentConsumerDefinition(IdempotentConsumerDefinition object) {
				return createIdempotentConsumerDefinitionAdapter();
			}
			@Override
			public Adapter caseIdentifiedType(IdentifiedType object) {
				return createIdentifiedTypeAdapter();
			}
			@Override
			public Adapter caseInputTypeDefinition(InputTypeDefinition object) {
				return createInputTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseInterceptDefinition(InterceptDefinition object) {
				return createInterceptDefinitionAdapter();
			}
			@Override
			public Adapter caseInterceptFromDefinition(InterceptFromDefinition object) {
				return createInterceptFromDefinitionAdapter();
			}
			@Override
			public Adapter caseInterceptSendToEndpointDefinition(InterceptSendToEndpointDefinition object) {
				return createInterceptSendToEndpointDefinitionAdapter();
			}
			@Override
			public Adapter caseIso8583DataFormat(Iso8583DataFormat object) {
				return createIso8583DataFormatAdapter();
			}
			@Override
			public Adapter caseJacksonXMLDataFormat(JacksonXMLDataFormat object) {
				return createJacksonXMLDataFormatAdapter();
			}
			@Override
			public Adapter caseJavaExpression(JavaExpression object) {
				return createJavaExpressionAdapter();
			}
			@Override
			public Adapter caseJavaScriptExpression(JavaScriptExpression object) {
				return createJavaScriptExpressionAdapter();
			}
			@Override
			public Adapter caseJaxbDataFormat(JaxbDataFormat object) {
				return createJaxbDataFormatAdapter();
			}
			@Override
			public Adapter caseJoorExpression(JoorExpression object) {
				return createJoorExpressionAdapter();
			}
			@Override
			public Adapter caseJqExpression(JqExpression object) {
				return createJqExpressionAdapter();
			}
			@Override
			public Adapter caseJsonApiDataFormat(JsonApiDataFormat object) {
				return createJsonApiDataFormatAdapter();
			}
			@Override
			public Adapter caseJsonDataFormat(JsonDataFormat object) {
				return createJsonDataFormatAdapter();
			}
			@Override
			public Adapter caseJsonPathExpression(JsonPathExpression object) {
				return createJsonPathExpressionAdapter();
			}
			@Override
			public Adapter caseJtaTransactionErrorHandlerDefinition(JtaTransactionErrorHandlerDefinition object) {
				return createJtaTransactionErrorHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseKameletDefinition(KameletDefinition object) {
				return createKameletDefinitionAdapter();
			}
			@Override
			public Adapter caseKeyManagersParametersFactoryBean(KeyManagersParametersFactoryBean object) {
				return createKeyManagersParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseKeyStoreParametersFactoryBean(KeyStoreParametersFactoryBean object) {
				return createKeyStoreParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseKubernetesServiceCallServiceDiscoveryConfiguration(KubernetesServiceCallServiceDiscoveryConfiguration object) {
				return createKubernetesServiceCallServiceDiscoveryConfigurationAdapter();
			}
			@Override
			public Adapter caseLangChain4JCharacterTokenizerDefinition(LangChain4JCharacterTokenizerDefinition object) {
				return createLangChain4JCharacterTokenizerDefinitionAdapter();
			}
			@Override
			public Adapter caseLangChain4JLineTokenizerDefinition(LangChain4JLineTokenizerDefinition object) {
				return createLangChain4JLineTokenizerDefinitionAdapter();
			}
			@Override
			public Adapter caseLangChain4JParagraphTokenizerDefinition(LangChain4JParagraphTokenizerDefinition object) {
				return createLangChain4JParagraphTokenizerDefinitionAdapter();
			}
			@Override
			public Adapter caseLangChain4JSentenceTokenizerDefinition(LangChain4JSentenceTokenizerDefinition object) {
				return createLangChain4JSentenceTokenizerDefinitionAdapter();
			}
			@Override
			public Adapter caseLangChain4jTokenizerImplementation(LangChain4jTokenizerImplementation object) {
				return createLangChain4jTokenizerImplementationAdapter();
			}
			@Override
			public Adapter caseLangChain4JWordTokenizerDefinition(LangChain4JWordTokenizerDefinition object) {
				return createLangChain4JWordTokenizerDefinitionAdapter();
			}
			@Override
			public Adapter caseLanguageExpression(LanguageExpression object) {
				return createLanguageExpressionAdapter();
			}
			@Override
			public Adapter caseLoadBalanceDefinition(LoadBalanceDefinition object) {
				return createLoadBalanceDefinitionAdapter();
			}
			@Override
			public Adapter caseLoadBalancerDefinition(LoadBalancerDefinition object) {
				return createLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseLoadTransformerDefinition(LoadTransformerDefinition object) {
				return createLoadTransformerDefinitionAdapter();
			}
			@Override
			public Adapter caseLogDefinition(LogDefinition object) {
				return createLogDefinitionAdapter();
			}
			@Override
			public Adapter caseLoopDefinition(LoopDefinition object) {
				return createLoopDefinitionAdapter();
			}
			@Override
			public Adapter caseLzfDataFormat(LzfDataFormat object) {
				return createLzfDataFormatAdapter();
			}
			@Override
			public Adapter caseMarshalDefinition(MarshalDefinition object) {
				return createMarshalDefinitionAdapter();
			}
			@Override
			public Adapter caseMethodCallExpression(MethodCallExpression object) {
				return createMethodCallExpressionAdapter();
			}
			@Override
			public Adapter caseMimeMultipartDataFormat(MimeMultipartDataFormat object) {
				return createMimeMultipartDataFormatAdapter();
			}
			@Override
			public Adapter caseModelLifecycleStrategySupport(ModelLifecycleStrategySupport object) {
				return createModelLifecycleStrategySupportAdapter();
			}
			@Override
			public Adapter caseMulticastDefinition(MulticastDefinition object) {
				return createMulticastDefinitionAdapter();
			}
			@Override
			public Adapter caseMutualTLSDefinition(MutualTLSDefinition object) {
				return createMutualTLSDefinitionAdapter();
			}
			@Override
			public Adapter caseMvelExpression(MvelExpression object) {
				return createMvelExpressionAdapter();
			}
			@Override
			public Adapter caseNamespaceAwareExpression(NamespaceAwareExpression object) {
				return createNamespaceAwareExpressionAdapter();
			}
			@Override
			public Adapter caseNoErrorHandlerDefinition(NoErrorHandlerDefinition object) {
				return createNoErrorHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseNoOutputDefinition(NoOutputDefinition object) {
				return createNoOutputDefinitionAdapter();
			}
			@Override
			public Adapter caseOAuth2Definition(OAuth2Definition object) {
				return createOAuth2DefinitionAdapter();
			}
			@Override
			public Adapter caseOgnlExpression(OgnlExpression object) {
				return createOgnlExpressionAdapter();
			}
			@Override
			public Adapter caseOnCompletionDefinition(OnCompletionDefinition object) {
				return createOnCompletionDefinitionAdapter();
			}
			@Override
			public Adapter caseOnExceptionDefinition(OnExceptionDefinition object) {
				return createOnExceptionDefinitionAdapter();
			}
			@Override
			public Adapter caseOnFallbackDefinition(OnFallbackDefinition object) {
				return createOnFallbackDefinitionAdapter();
			}
			@Override
			public Adapter caseOnWhenDefinition(OnWhenDefinition object) {
				return createOnWhenDefinitionAdapter();
			}
			@Override
			public Adapter caseOpenApiDefinition(OpenApiDefinition object) {
				return createOpenApiDefinitionAdapter();
			}
			@Override
			public Adapter caseOpenIdConnectDefinition(OpenIdConnectDefinition object) {
				return createOpenIdConnectDefinitionAdapter();
			}
			@Override
			public Adapter caseOptimisticLockRetryPolicyDefinition(OptimisticLockRetryPolicyDefinition object) {
				return createOptimisticLockRetryPolicyDefinitionAdapter();
			}
			@Override
			public Adapter caseOptionalIdentifiedDefinition(OptionalIdentifiedDefinition object) {
				return createOptionalIdentifiedDefinitionAdapter();
			}
			@Override
			public Adapter caseOtherwiseDefinition(OtherwiseDefinition object) {
				return createOtherwiseDefinitionAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseOutputTypeDefinition(OutputTypeDefinition object) {
				return createOutputTypeDefinitionAdapter();
			}
			@Override
			public Adapter casePackageScanDefinition(PackageScanDefinition object) {
				return createPackageScanDefinitionAdapter();
			}
			@Override
			public Adapter caseParamDefinition(ParamDefinition object) {
				return createParamDefinitionAdapter();
			}
			@Override
			public Adapter caseParquetAvroDataFormat(ParquetAvroDataFormat object) {
				return createParquetAvroDataFormatAdapter();
			}
			@Override
			public Adapter casePassThroughServiceCallServiceFilterConfiguration(PassThroughServiceCallServiceFilterConfiguration object) {
				return createPassThroughServiceCallServiceFilterConfigurationAdapter();
			}
			@Override
			public Adapter casePatchDefinition(PatchDefinition object) {
				return createPatchDefinitionAdapter();
			}
			@Override
			public Adapter casePatternBasedPackageScanFilter(PatternBasedPackageScanFilter object) {
				return createPatternBasedPackageScanFilterAdapter();
			}
			@Override
			public Adapter casePausableDefinition(PausableDefinition object) {
				return createPausableDefinitionAdapter();
			}
			@Override
			public Adapter casePgpDataFormat(PgpDataFormat object) {
				return createPgpDataFormatAdapter();
			}
			@Override
			public Adapter casePipelineDefinition(PipelineDefinition object) {
				return createPipelineDefinitionAdapter();
			}
			@Override
			public Adapter casePolicyDefinition(PolicyDefinition object) {
				return createPolicyDefinitionAdapter();
			}
			@Override
			public Adapter casePollDefinition(PollDefinition object) {
				return createPollDefinitionAdapter();
			}
			@Override
			public Adapter casePollEnrichDefinition(PollEnrichDefinition object) {
				return createPollEnrichDefinitionAdapter();
			}
			@Override
			public Adapter casePostDefinition(PostDefinition object) {
				return createPostDefinitionAdapter();
			}
			@Override
			public Adapter casePredicateValidatorDefinition(PredicateValidatorDefinition object) {
				return createPredicateValidatorDefinitionAdapter();
			}
			@Override
			public Adapter caseProcessDefinition(ProcessDefinition object) {
				return createProcessDefinitionAdapter();
			}
			@Override
			public Adapter caseProcessorDefinition(ProcessorDefinition object) {
				return createProcessorDefinitionAdapter();
			}
			@Override
			public Adapter casePropertyDefinition(PropertyDefinition object) {
				return createPropertyDefinitionAdapter();
			}
			@Override
			public Adapter casePropertyDefinitions(PropertyDefinitions object) {
				return createPropertyDefinitionsAdapter();
			}
			@Override
			public Adapter casePropertyExpressionDefinition(PropertyExpressionDefinition object) {
				return createPropertyExpressionDefinitionAdapter();
			}
			@Override
			public Adapter caseProtobufDataFormat(ProtobufDataFormat object) {
				return createProtobufDataFormatAdapter();
			}
			@Override
			public Adapter casePutDefinition(PutDefinition object) {
				return createPutDefinitionAdapter();
			}
			@Override
			public Adapter casePythonExpression(PythonExpression object) {
				return createPythonExpressionAdapter();
			}
			@Override
			public Adapter caseRandomLoadBalancerDefinition(RandomLoadBalancerDefinition object) {
				return createRandomLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseRecipientListDefinition(RecipientListDefinition object) {
				return createRecipientListDefinitionAdapter();
			}
			@Override
			public Adapter caseRedeliveryPolicyDefinition(RedeliveryPolicyDefinition object) {
				return createRedeliveryPolicyDefinitionAdapter();
			}
			@Override
			public Adapter caseRefErrorHandlerDefinition(RefErrorHandlerDefinition object) {
				return createRefErrorHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseRefExpression(RefExpression object) {
				return createRefExpressionAdapter();
			}
			@Override
			public Adapter caseRemoveHeaderDefinition(RemoveHeaderDefinition object) {
				return createRemoveHeaderDefinitionAdapter();
			}
			@Override
			public Adapter caseRemoveHeadersDefinition(RemoveHeadersDefinition object) {
				return createRemoveHeadersDefinitionAdapter();
			}
			@Override
			public Adapter caseRemovePropertiesDefinition(RemovePropertiesDefinition object) {
				return createRemovePropertiesDefinitionAdapter();
			}
			@Override
			public Adapter caseRemovePropertyDefinition(RemovePropertyDefinition object) {
				return createRemovePropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseRemoveVariableDefinition(RemoveVariableDefinition object) {
				return createRemoveVariableDefinitionAdapter();
			}
			@Override
			public Adapter caseResequenceDefinition(ResequenceDefinition object) {
				return createResequenceDefinitionAdapter();
			}
			@Override
			public Adapter caseResequencerConfig(ResequencerConfig object) {
				return createResequencerConfigAdapter();
			}
			@Override
			public Adapter caseResilience4JConfigurationCommon(Resilience4JConfigurationCommon object) {
				return createResilience4JConfigurationCommonAdapter();
			}
			@Override
			public Adapter caseResilience4JConfigurationDefinition(Resilience4JConfigurationDefinition object) {
				return createResilience4JConfigurationDefinitionAdapter();
			}
			@Override
			public Adapter caseResponseHeaderDefinition(ResponseHeaderDefinition object) {
				return createResponseHeaderDefinitionAdapter();
			}
			@Override
			public Adapter caseResponseMessageDefinition(ResponseMessageDefinition object) {
				return createResponseMessageDefinitionAdapter();
			}
			@Override
			public Adapter caseRestBindingDefinition(RestBindingDefinition object) {
				return createRestBindingDefinitionAdapter();
			}
			@Override
			public Adapter caseRestConfigurationDefinition(RestConfigurationDefinition object) {
				return createRestConfigurationDefinitionAdapter();
			}
			@Override
			public Adapter caseRestContextRefDefinition(RestContextRefDefinition object) {
				return createRestContextRefDefinitionAdapter();
			}
			@Override
			public Adapter caseRestDefinition(RestDefinition object) {
				return createRestDefinitionAdapter();
			}
			@Override
			public Adapter caseRestPropertyDefinition(RestPropertyDefinition object) {
				return createRestPropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseRestsDefinition(RestsDefinition object) {
				return createRestsDefinitionAdapter();
			}
			@Override
			public Adapter caseRestSecuritiesDefinition(RestSecuritiesDefinition object) {
				return createRestSecuritiesDefinitionAdapter();
			}
			@Override
			public Adapter caseRestSecurityDefinition(RestSecurityDefinition object) {
				return createRestSecurityDefinitionAdapter();
			}
			@Override
			public Adapter caseResumableDefinition(ResumableDefinition object) {
				return createResumableDefinitionAdapter();
			}
			@Override
			public Adapter caseRollbackDefinition(RollbackDefinition object) {
				return createRollbackDefinitionAdapter();
			}
			@Override
			public Adapter caseRoundRobinLoadBalancerDefinition(RoundRobinLoadBalancerDefinition object) {
				return createRoundRobinLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteBuilderDefinition(RouteBuilderDefinition object) {
				return createRouteBuilderDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteConfigurationContextRefDefinition(RouteConfigurationContextRefDefinition object) {
				return createRouteConfigurationContextRefDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteConfigurationDefinition(RouteConfigurationDefinition object) {
				return createRouteConfigurationDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteConfigurationsDefinition(RouteConfigurationsDefinition object) {
				return createRouteConfigurationsDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteContextRefDefinition(RouteContextRefDefinition object) {
				return createRouteContextRefDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteDefinition(RouteDefinition object) {
				return createRouteDefinitionAdapter();
			}
			@Override
			public Adapter caseRoutesDefinition(RoutesDefinition object) {
				return createRoutesDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteTemplateContextRefDefinition(RouteTemplateContextRefDefinition object) {
				return createRouteTemplateContextRefDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteTemplateDefinition(RouteTemplateDefinition object) {
				return createRouteTemplateDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteTemplateParameterDefinition(RouteTemplateParameterDefinition object) {
				return createRouteTemplateParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteTemplatesDefinition(RouteTemplatesDefinition object) {
				return createRouteTemplatesDefinitionAdapter();
			}
			@Override
			public Adapter caseRoutingSlipDefinition(RoutingSlipDefinition object) {
				return createRoutingSlipDefinitionAdapter();
			}
			@Override
			public Adapter caseRssDataFormat(RssDataFormat object) {
				return createRssDataFormatAdapter();
			}
			@Override
			public Adapter caseSagaActionUriDefinition(SagaActionUriDefinition object) {
				return createSagaActionUriDefinitionAdapter();
			}
			@Override
			public Adapter caseSagaDefinition(SagaDefinition object) {
				return createSagaDefinitionAdapter();
			}
			@Override
			public Adapter caseSamplingDefinition(SamplingDefinition object) {
				return createSamplingDefinitionAdapter();
			}
			@Override
			public Adapter caseScriptDefinition(ScriptDefinition object) {
				return createScriptDefinitionAdapter();
			}
			@Override
			public Adapter caseSecureRandomParametersFactoryBean(SecureRandomParametersFactoryBean object) {
				return createSecureRandomParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseSecureSocketProtocolsParameters(SecureSocketProtocolsParameters object) {
				return createSecureSocketProtocolsParametersAdapter();
			}
			@Override
			public Adapter caseSecurityDefinition(SecurityDefinition object) {
				return createSecurityDefinitionAdapter();
			}
			@Override
			public Adapter caseSendDefinition(SendDefinition object) {
				return createSendDefinitionAdapter();
			}
			@Override
			public Adapter caseServiceCallConfiguration(ServiceCallConfiguration object) {
				return createServiceCallConfigurationAdapter();
			}
			@Override
			public Adapter caseServiceCallConfigurationDefinition(ServiceCallConfigurationDefinition object) {
				return createServiceCallConfigurationDefinitionAdapter();
			}
			@Override
			public Adapter caseServiceCallDefinition(ServiceCallDefinition object) {
				return createServiceCallDefinitionAdapter();
			}
			@Override
			public Adapter caseServiceCallDefinitionConstants(ServiceCallDefinitionConstants object) {
				return createServiceCallDefinitionConstantsAdapter();
			}
			@Override
			public Adapter caseServiceCallExpressionConfiguration(ServiceCallExpressionConfiguration object) {
				return createServiceCallExpressionConfigurationAdapter();
			}
			@Override
			public Adapter caseServiceCallServiceChooserConfiguration(ServiceCallServiceChooserConfiguration object) {
				return createServiceCallServiceChooserConfigurationAdapter();
			}
			@Override
			public Adapter caseServiceCallServiceDiscoveryConfiguration(ServiceCallServiceDiscoveryConfiguration object) {
				return createServiceCallServiceDiscoveryConfigurationAdapter();
			}
			@Override
			public Adapter caseServiceCallServiceFilterConfiguration(ServiceCallServiceFilterConfiguration object) {
				return createServiceCallServiceFilterConfigurationAdapter();
			}
			@Override
			public Adapter caseServiceCallServiceLoadBalancerConfiguration(ServiceCallServiceLoadBalancerConfiguration object) {
				return createServiceCallServiceLoadBalancerConfigurationAdapter();
			}
			@Override
			public Adapter caseSetBodyDefinition(SetBodyDefinition object) {
				return createSetBodyDefinitionAdapter();
			}
			@Override
			public Adapter caseSetExchangePatternDefinition(SetExchangePatternDefinition object) {
				return createSetExchangePatternDefinitionAdapter();
			}
			@Override
			public Adapter caseSetHeaderDefinition(SetHeaderDefinition object) {
				return createSetHeaderDefinitionAdapter();
			}
			@Override
			public Adapter caseSetHeadersDefinition(SetHeadersDefinition object) {
				return createSetHeadersDefinitionAdapter();
			}
			@Override
			public Adapter caseSetPropertyDefinition(SetPropertyDefinition object) {
				return createSetPropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseSetVariableDefinition(SetVariableDefinition object) {
				return createSetVariableDefinitionAdapter();
			}
			@Override
			public Adapter caseSetVariablesDefinition(SetVariablesDefinition object) {
				return createSetVariablesDefinitionAdapter();
			}
			@Override
			public Adapter caseSimpleExpression(SimpleExpression object) {
				return createSimpleExpressionAdapter();
			}
			@Override
			public Adapter caseSingleInputTypedExpressionDefinition(SingleInputTypedExpressionDefinition object) {
				return createSingleInputTypedExpressionDefinitionAdapter();
			}
			@Override
			public Adapter caseSmooksDataFormat(SmooksDataFormat object) {
				return createSmooksDataFormatAdapter();
			}
			@Override
			public Adapter caseSniHostNames(SniHostNames object) {
				return createSniHostNamesAdapter();
			}
			@Override
			public Adapter caseSoapDataFormat(SoapDataFormat object) {
				return createSoapDataFormatAdapter();
			}
			@Override
			public Adapter caseSortDefinition(SortDefinition object) {
				return createSortDefinitionAdapter();
			}
			@Override
			public Adapter caseSpELExpression(SpELExpression object) {
				return createSpELExpressionAdapter();
			}
			@Override
			public Adapter caseSplitDefinition(SplitDefinition object) {
				return createSplitDefinitionAdapter();
			}
			@Override
			public Adapter caseSpringErrorHandlerDefinition(SpringErrorHandlerDefinition object) {
				return createSpringErrorHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseSpringTransactionErrorHandlerDefinition(SpringTransactionErrorHandlerDefinition object) {
				return createSpringTransactionErrorHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseSslContextClientParametersFactoryBean(SslContextClientParametersFactoryBean object) {
				return createSslContextClientParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseSslContextParametersFactoryBean(SslContextParametersFactoryBean object) {
				return createSslContextParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseSslContextServerParametersFactoryBean(SslContextServerParametersFactoryBean object) {
				return createSslContextServerParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseStaticServiceCallServiceDiscoveryConfiguration(StaticServiceCallServiceDiscoveryConfiguration object) {
				return createStaticServiceCallServiceDiscoveryConfigurationAdapter();
			}
			@Override
			public Adapter caseStepDefinition(StepDefinition object) {
				return createStepDefinitionAdapter();
			}
			@Override
			public Adapter caseStickyLoadBalancerDefinition(StickyLoadBalancerDefinition object) {
				return createStickyLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseStopDefinition(StopDefinition object) {
				return createStopDefinitionAdapter();
			}
			@Override
			public Adapter caseStreamResequencerConfig(StreamResequencerConfig object) {
				return createStreamResequencerConfigAdapter();
			}
			@Override
			public Adapter caseSwiftMtDataFormat(SwiftMtDataFormat object) {
				return createSwiftMtDataFormatAdapter();
			}
			@Override
			public Adapter caseSwiftMxDataFormat(SwiftMxDataFormat object) {
				return createSwiftMxDataFormatAdapter();
			}
			@Override
			public Adapter caseSyslogDataFormat(SyslogDataFormat object) {
				return createSyslogDataFormatAdapter();
			}
			@Override
			public Adapter caseTarFileDataFormat(TarFileDataFormat object) {
				return createTarFileDataFormatAdapter();
			}
			@Override
			public Adapter caseTemplatedRouteDefinition(TemplatedRouteDefinition object) {
				return createTemplatedRouteDefinitionAdapter();
			}
			@Override
			public Adapter caseTemplatedRouteParameterDefinition(TemplatedRouteParameterDefinition object) {
				return createTemplatedRouteParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseTemplatedRoutesDefinition(TemplatedRoutesDefinition object) {
				return createTemplatedRoutesDefinitionAdapter();
			}
			@Override
			public Adapter caseThreadPoolProfileDefinition(ThreadPoolProfileDefinition object) {
				return createThreadPoolProfileDefinitionAdapter();
			}
			@Override
			public Adapter caseThreadsDefinition(ThreadsDefinition object) {
				return createThreadsDefinitionAdapter();
			}
			@Override
			public Adapter caseThriftDataFormat(ThriftDataFormat object) {
				return createThriftDataFormatAdapter();
			}
			@Override
			public Adapter caseThrottleDefinition(ThrottleDefinition object) {
				return createThrottleDefinitionAdapter();
			}
			@Override
			public Adapter caseThrowExceptionDefinition(ThrowExceptionDefinition object) {
				return createThrowExceptionDefinitionAdapter();
			}
			@Override
			public Adapter caseTidyMarkupDataFormat(TidyMarkupDataFormat object) {
				return createTidyMarkupDataFormatAdapter();
			}
			@Override
			public Adapter caseToDefinition(ToDefinition object) {
				return createToDefinitionAdapter();
			}
			@Override
			public Adapter caseToDynamicDefinition(ToDynamicDefinition object) {
				return createToDynamicDefinitionAdapter();
			}
			@Override
			public Adapter caseTokenizerDefinition(TokenizerDefinition object) {
				return createTokenizerDefinitionAdapter();
			}
			@Override
			public Adapter caseTokenizerExpression(TokenizerExpression object) {
				return createTokenizerExpressionAdapter();
			}
			@Override
			public Adapter caseTokenizerImplementation(TokenizerImplementation object) {
				return createTokenizerImplementationAdapter();
			}
			@Override
			public Adapter caseTopicLoadBalancerDefinition(TopicLoadBalancerDefinition object) {
				return createTopicLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseTransactedDefinition(TransactedDefinition object) {
				return createTransactedDefinitionAdapter();
			}
			@Override
			public Adapter caseTransactionErrorHandlerDefinition(TransactionErrorHandlerDefinition object) {
				return createTransactionErrorHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseTransformDefinition(TransformDefinition object) {
				return createTransformDefinitionAdapter();
			}
			@Override
			public Adapter caseTransformer(Transformer object) {
				return createTransformerAdapter();
			}
			@Override
			public Adapter caseTransformersDefinition(TransformersDefinition object) {
				return createTransformersDefinitionAdapter();
			}
			@Override
			public Adapter caseTrustManagersParametersFactoryBean(TrustManagersParametersFactoryBean object) {
				return createTrustManagersParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseTryDefinition(TryDefinition object) {
				return createTryDefinitionAdapter();
			}
			@Override
			public Adapter caseTypedExpressionDefinition(TypedExpressionDefinition object) {
				return createTypedExpressionDefinitionAdapter();
			}
			@Override
			public Adapter caseUniVocityAbstractDataFormat(UniVocityAbstractDataFormat object) {
				return createUniVocityAbstractDataFormatAdapter();
			}
			@Override
			public Adapter caseUniVocityCsvDataFormat(UniVocityCsvDataFormat object) {
				return createUniVocityCsvDataFormatAdapter();
			}
			@Override
			public Adapter caseUniVocityFixedDataFormat(UniVocityFixedDataFormat object) {
				return createUniVocityFixedDataFormatAdapter();
			}
			@Override
			public Adapter caseUniVocityHeader(UniVocityHeader object) {
				return createUniVocityHeaderAdapter();
			}
			@Override
			public Adapter caseUniVocityTsvDataFormat(UniVocityTsvDataFormat object) {
				return createUniVocityTsvDataFormatAdapter();
			}
			@Override
			public Adapter caseUnmarshalDefinition(UnmarshalDefinition object) {
				return createUnmarshalDefinitionAdapter();
			}
			@Override
			public Adapter caseValidateDefinition(ValidateDefinition object) {
				return createValidateDefinitionAdapter();
			}
			@Override
			public Adapter caseValidator(Validator object) {
				return createValidatorAdapter();
			}
			@Override
			public Adapter caseValidatorsDefinition(ValidatorsDefinition object) {
				return createValidatorsDefinitionAdapter();
			}
			@Override
			public Adapter caseVariableExpression(VariableExpression object) {
				return createVariableExpressionAdapter();
			}
			@Override
			public Adapter caseVerbDefinition(VerbDefinition object) {
				return createVerbDefinitionAdapter();
			}
			@Override
			public Adapter caseWasmExpression(WasmExpression object) {
				return createWasmExpressionAdapter();
			}
			@Override
			public Adapter caseWeightedLoadBalancerDefinition(WeightedLoadBalancerDefinition object) {
				return createWeightedLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseWhenDefinition(WhenDefinition object) {
				return createWhenDefinitionAdapter();
			}
			@Override
			public Adapter caseWireTapDefinition(WireTapDefinition object) {
				return createWireTapDefinitionAdapter();
			}
			@Override
			public Adapter caseXmlSecurityDataFormat(XmlSecurityDataFormat object) {
				return createXmlSecurityDataFormatAdapter();
			}
			@Override
			public Adapter caseXmlTokenizerExpression(XmlTokenizerExpression object) {
				return createXmlTokenizerExpressionAdapter();
			}
			@Override
			public Adapter caseXPathExpression(XPathExpression object) {
				return createXPathExpressionAdapter();
			}
			@Override
			public Adapter caseXQueryExpression(XQueryExpression object) {
				return createXQueryExpressionAdapter();
			}
			@Override
			public Adapter caseYamlDataFormat(YamlDataFormat object) {
				return createYamlDataFormatAdapter();
			}
			@Override
			public Adapter caseYamlTypeFilterDefinition(YamlTypeFilterDefinition object) {
				return createYamlTypeFilterDefinitionAdapter();
			}
			@Override
			public Adapter caseZipDeflaterDataFormat(ZipDeflaterDataFormat object) {
				return createZipDeflaterDataFormatAdapter();
			}
			@Override
			public Adapter caseZipFileDataFormat(ZipFileDataFormat object) {
				return createZipFileDataFormatAdapter();
			}
			@Override
			public Adapter caseZooKeeperServiceCallServiceDiscoveryConfiguration(ZooKeeperServiceCallServiceDiscoveryConfiguration object) {
				return createZooKeeperServiceCallServiceDiscoveryConfigurationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelConsumerTemplateFactoryBean <em>Abstract Camel Consumer Template Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractCamelConsumerTemplateFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelConsumerTemplateFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelContextFactoryBean <em>Abstract Camel Context Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractCamelContextFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelContextFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelEndpointFactoryBean <em>Abstract Camel Endpoint Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractCamelEndpointFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelEndpointFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelFactoryBean <em>Abstract Camel Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractCamelFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelFluentProducerTemplateFactoryBean <em>Abstract Camel Fluent Producer Template Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractCamelFluentProducerTemplateFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelFluentProducerTemplateFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelProducerTemplateFactoryBean <em>Abstract Camel Producer Template Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractCamelProducerTemplateFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelProducerTemplateFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean <em>Abstract Camel Redelivery Policy Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractCamelRedeliveryPolicyFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelRedeliveryPolicyFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractCamelThreadPoolFactoryBean <em>Abstract Camel Thread Pool Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractCamelThreadPoolFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelThreadPoolFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractJsseUtilFactoryBean <em>Abstract Jsse Util Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractJsseUtilFactoryBean
	 * @generated
	 */
	public Adapter createAbstractJsseUtilFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractKeyManagersParametersFactoryBean <em>Abstract Key Managers Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractKeyManagersParametersFactoryBean
	 * @generated
	 */
	public Adapter createAbstractKeyManagersParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean <em>Abstract Key Store Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractKeyStoreParametersFactoryBean
	 * @generated
	 */
	public Adapter createAbstractKeyStoreParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractSecureRandomParametersFactoryBean <em>Abstract Secure Random Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractSecureRandomParametersFactoryBean
	 * @generated
	 */
	public Adapter createAbstractSecureRandomParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AbstractTrustManagersParametersFactoryBean <em>Abstract Trust Managers Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AbstractTrustManagersParametersFactoryBean
	 * @generated
	 */
	public Adapter createAbstractTrustManagersParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AggregateDefinition <em>Aggregate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AggregateDefinition
	 * @generated
	 */
	public Adapter createAggregateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AllowableValuesType <em>Allowable Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AllowableValuesType
	 * @generated
	 */
	public Adapter createAllowableValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AllowableValuesType1 <em>Allowable Values Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AllowableValuesType1
	 * @generated
	 */
	public Adapter createAllowableValuesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ApiKeyDefinition <em>Api Key Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ApiKeyDefinition
	 * @generated
	 */
	public Adapter createApiKeyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ApplicationDefinition <em>Application Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ApplicationDefinition
	 * @generated
	 */
	public Adapter createApplicationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Asn1DataFormat <em>Asn1 Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Asn1DataFormat
	 * @generated
	 */
	public Adapter createAsn1DataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.AvroDataFormat <em>Avro Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.AvroDataFormat
	 * @generated
	 */
	public Adapter createAvroDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BarcodeDataFormat <em>Barcode Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BarcodeDataFormat
	 * @generated
	 */
	public Adapter createBarcodeDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Base64DataFormat <em>Base64 Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Base64DataFormat
	 * @generated
	 */
	public Adapter createBase64DataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BaseErrorHandlerDefinition <em>Base Error Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BaseErrorHandlerDefinition
	 * @generated
	 */
	public Adapter createBaseErrorHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BasicAuthDefinition <em>Basic Auth Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BasicAuthDefinition
	 * @generated
	 */
	public Adapter createBasicAuthDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BatchResequencerConfig <em>Batch Resequencer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BatchResequencerConfig
	 * @generated
	 */
	public Adapter createBatchResequencerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BeanConstructorDefinition <em>Bean Constructor Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BeanConstructorDefinition
	 * @generated
	 */
	public Adapter createBeanConstructorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BeanConstructorsDefinition <em>Bean Constructors Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BeanConstructorsDefinition
	 * @generated
	 */
	public Adapter createBeanConstructorsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BeanDefinition <em>Bean Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BeanDefinition
	 * @generated
	 */
	public Adapter createBeanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition <em>Bean Factory Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition
	 * @generated
	 */
	public Adapter createBeanFactoryDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat <em>Beanio Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BeanioDataFormat
	 * @generated
	 */
	public Adapter createBeanioDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BeanPropertiesDefinition <em>Bean Properties Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BeanPropertiesDefinition
	 * @generated
	 */
	public Adapter createBeanPropertiesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BeanPropertyDefinition <em>Bean Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BeanPropertyDefinition
	 * @generated
	 */
	public Adapter createBeanPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BeansDefinition <em>Beans Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BeansDefinition
	 * @generated
	 */
	public Adapter createBeansDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BearerTokenDefinition <em>Bearer Token Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BearerTokenDefinition
	 * @generated
	 */
	public Adapter createBearerTokenDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BindyDataFormat <em>Bindy Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BindyDataFormat
	 * @generated
	 */
	public Adapter createBindyDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.BlacklistServiceCallServiceFilterConfiguration <em>Blacklist Service Call Service Filter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.BlacklistServiceCallServiceFilterConfiguration
	 * @generated
	 */
	public Adapter createBlacklistServiceCallServiceFilterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration <em>Caching Service Call Service Discovery Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration
	 * @generated
	 */
	public Adapter createCachingServiceCallServiceDiscoveryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelBeanPostProcessor <em>Camel Bean Post Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelBeanPostProcessor
	 * @generated
	 */
	public Adapter createCamelBeanPostProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelConsumerTemplateFactoryBean <em>Camel Consumer Template Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelConsumerTemplateFactoryBean
	 * @generated
	 */
	public Adapter createCamelConsumerTemplateFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean <em>Camel Context Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean
	 * @generated
	 */
	public Adapter createCamelContextFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelEndpointFactoryBean <em>Camel Endpoint Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelEndpointFactoryBean
	 * @generated
	 */
	public Adapter createCamelEndpointFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelFluentProducerTemplateFactoryBean <em>Camel Fluent Producer Template Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelFluentProducerTemplateFactoryBean
	 * @generated
	 */
	public Adapter createCamelFluentProducerTemplateFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition <em>Camel JMX Agent Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition
	 * @generated
	 */
	public Adapter createCamelJMXAgentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelProducerTemplateFactoryBean <em>Camel Producer Template Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelProducerTemplateFactoryBean
	 * @generated
	 */
	public Adapter createCamelProducerTemplateFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition <em>Camel Property Placeholder Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition
	 * @generated
	 */
	public Adapter createCamelPropertyPlaceholderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderFunctionDefinition <em>Camel Property Placeholder Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderFunctionDefinition
	 * @generated
	 */
	public Adapter createCamelPropertyPlaceholderFunctionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition <em>Camel Property Placeholder Location Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition
	 * @generated
	 */
	public Adapter createCamelPropertyPlaceholderLocationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelRedeliveryPolicyFactoryBean <em>Camel Redelivery Policy Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelRedeliveryPolicyFactoryBean
	 * @generated
	 */
	public Adapter createCamelRedeliveryPolicyFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelRestContextFactoryBean <em>Camel Rest Context Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelRestContextFactoryBean
	 * @generated
	 */
	public Adapter createCamelRestContextFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelRouteConfigurationContextFactoryBean <em>Camel Route Configuration Context Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelRouteConfigurationContextFactoryBean
	 * @generated
	 */
	public Adapter createCamelRouteConfigurationContextFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelRouteContextFactoryBean <em>Camel Route Context Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelRouteContextFactoryBean
	 * @generated
	 */
	public Adapter createCamelRouteContextFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition <em>Camel Route Controller Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition
	 * @generated
	 */
	public Adapter createCamelRouteControllerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelRouteTemplateContextFactoryBean <em>Camel Route Template Context Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelRouteTemplateContextFactoryBean
	 * @generated
	 */
	public Adapter createCamelRouteTemplateContextFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition <em>Camel Stream Caching Strategy Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition
	 * @generated
	 */
	public Adapter createCamelStreamCachingStrategyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CamelThreadPoolFactoryBean <em>Camel Thread Pool Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CamelThreadPoolFactoryBean
	 * @generated
	 */
	public Adapter createCamelThreadPoolFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CatchDefinition <em>Catch Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CatchDefinition
	 * @generated
	 */
	public Adapter createCatchDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CborDataFormat <em>Cbor Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CborDataFormat
	 * @generated
	 */
	public Adapter createCborDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ChoiceDefinition <em>Choice Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ChoiceDefinition
	 * @generated
	 */
	public Adapter createChoiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CipherSuitesParameters <em>Cipher Suites Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CipherSuitesParameters
	 * @generated
	 */
	public Adapter createCipherSuitesParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CircuitBreakerDefinition <em>Circuit Breaker Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CircuitBreakerDefinition
	 * @generated
	 */
	public Adapter createCircuitBreakerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition <em>Claim Check Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition
	 * @generated
	 */
	public Adapter createClaimCheckDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration <em>Combined Service Call Service Discovery Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration
	 * @generated
	 */
	public Adapter createCombinedServiceCallServiceDiscoveryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceFilterConfiguration <em>Combined Service Call Service Filter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceFilterConfiguration
	 * @generated
	 */
	public Adapter createCombinedServiceCallServiceFilterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ComponentScanDefinition <em>Component Scan Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ComponentScanDefinition
	 * @generated
	 */
	public Adapter createComponentScanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ConstantExpression <em>Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ConstantExpression
	 * @generated
	 */
	public Adapter createConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Constants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Constants
	 * @generated
	 */
	public Adapter createConstantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration <em>Consul Service Call Service Discovery Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration
	 * @generated
	 */
	public Adapter createConsulServiceCallServiceDiscoveryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ContextScanDefinition <em>Context Scan Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ContextScanDefinition
	 * @generated
	 */
	public Adapter createContextScanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ConvertBodyDefinition <em>Convert Body Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ConvertBodyDefinition
	 * @generated
	 */
	public Adapter createConvertBodyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ConvertHeaderDefinition <em>Convert Header Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ConvertHeaderDefinition
	 * @generated
	 */
	public Adapter createConvertHeaderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition <em>Convert Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition
	 * @generated
	 */
	public Adapter createConvertVariableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat <em>Crypto Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CryptoDataFormat
	 * @generated
	 */
	public Adapter createCryptoDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CSimpleExpression <em>CSimple Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CSimpleExpression
	 * @generated
	 */
	public Adapter createCSimpleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CsvDataFormat <em>Csv Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CsvDataFormat
	 * @generated
	 */
	public Adapter createCsvDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CustomDataFormat <em>Custom Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CustomDataFormat
	 * @generated
	 */
	public Adapter createCustomDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CustomLoadBalancerDefinition <em>Custom Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CustomLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createCustomLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CustomServiceCallServiceFilterConfiguration <em>Custom Service Call Service Filter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CustomServiceCallServiceFilterConfiguration
	 * @generated
	 */
	public Adapter createCustomServiceCallServiceFilterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CustomTransformerDefinition <em>Custom Transformer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CustomTransformerDefinition
	 * @generated
	 */
	public Adapter createCustomTransformerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.CustomValidatorDefinition <em>Custom Validator Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.CustomValidatorDefinition
	 * @generated
	 */
	public Adapter createCustomValidatorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DataFormat
	 * @generated
	 */
	public Adapter createDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition <em>Data Formats Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DataFormatsDefinition
	 * @generated
	 */
	public Adapter createDataFormatsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DataFormatsType <em>Data Formats Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DataFormatsType
	 * @generated
	 */
	public Adapter createDataFormatsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DataFormatTransformerDefinition <em>Data Format Transformer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DataFormatTransformerDefinition
	 * @generated
	 */
	public Adapter createDataFormatTransformerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DatasonnetExpression <em>Datasonnet Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DatasonnetExpression
	 * @generated
	 */
	public Adapter createDatasonnetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DeadLetterChannelDefinition <em>Dead Letter Channel Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DeadLetterChannelDefinition
	 * @generated
	 */
	public Adapter createDeadLetterChannelDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition <em>Default Error Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition
	 * @generated
	 */
	public Adapter createDefaultErrorHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DefaultServiceCallServiceLoadBalancerConfiguration <em>Default Service Call Service Load Balancer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DefaultServiceCallServiceLoadBalancerConfiguration
	 * @generated
	 */
	public Adapter createDefaultServiceCallServiceLoadBalancerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DelayDefinition <em>Delay Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DelayDefinition
	 * @generated
	 */
	public Adapter createDelayDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DeleteDefinition <em>Delete Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DeleteDefinition
	 * @generated
	 */
	public Adapter createDeleteDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DfdlDataFormat <em>Dfdl Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DfdlDataFormat
	 * @generated
	 */
	public Adapter createDfdlDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration <em>Dns Service Call Service Discovery Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration
	 * @generated
	 */
	public Adapter createDnsServiceCallServiceDiscoveryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.DynamicRouterDefinition <em>Dynamic Router Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.DynamicRouterDefinition
	 * @generated
	 */
	public Adapter createDynamicRouterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.EndpointTransformerDefinition <em>Endpoint Transformer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.EndpointTransformerDefinition
	 * @generated
	 */
	public Adapter createEndpointTransformerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.EndpointValidatorDefinition <em>Endpoint Validator Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.EndpointValidatorDefinition
	 * @generated
	 */
	public Adapter createEndpointValidatorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.EnrichDefinition <em>Enrich Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.EnrichDefinition
	 * @generated
	 */
	public Adapter createEnrichDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition <em>Error Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ErrorHandlerDefinition
	 * @generated
	 */
	public Adapter createErrorHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ExchangePropertyExpression <em>Exchange Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ExchangePropertyExpression
	 * @generated
	 */
	public Adapter createExchangePropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ExpressionSubElementDefinition <em>Expression Sub Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ExpressionSubElementDefinition
	 * @generated
	 */
	public Adapter createExpressionSubElementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition <em>Failover Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createFailoverLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon <em>Fault Tolerance Configuration Common</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationCommon
	 * @generated
	 */
	public Adapter createFaultToleranceConfigurationCommonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationDefinition <em>Fault Tolerance Configuration Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationDefinition
	 * @generated
	 */
	public Adapter createFaultToleranceConfigurationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FhirDataformat <em>Fhir Dataformat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FhirDataformat
	 * @generated
	 */
	public Adapter createFhirDataformatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FhirJsonDataFormat <em>Fhir Json Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FhirJsonDataFormat
	 * @generated
	 */
	public Adapter createFhirJsonDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FhirXmlDataFormat <em>Fhir Xml Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FhirXmlDataFormat
	 * @generated
	 */
	public Adapter createFhirXmlDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FilterDefinition <em>Filter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FilterDefinition
	 * @generated
	 */
	public Adapter createFilterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FilterParameters <em>Filter Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FilterParameters
	 * @generated
	 */
	public Adapter createFilterParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FinallyDefinition <em>Finally Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FinallyDefinition
	 * @generated
	 */
	public Adapter createFinallyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat <em>Flatpack Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FlatpackDataFormat
	 * @generated
	 */
	public Adapter createFlatpackDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ForyDataFormat <em>Fory Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ForyDataFormat
	 * @generated
	 */
	public Adapter createForyDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.FromDefinition <em>From Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.FromDefinition
	 * @generated
	 */
	public Adapter createFromDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.GetDefinition <em>Get Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.GetDefinition
	 * @generated
	 */
	public Adapter createGetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.GlobalOptionDefinition <em>Global Option Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.GlobalOptionDefinition
	 * @generated
	 */
	public Adapter createGlobalOptionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.GlobalOptionsDefinition <em>Global Options Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.GlobalOptionsDefinition
	 * @generated
	 */
	public Adapter createGlobalOptionsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.GrokDataFormat <em>Grok Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.GrokDataFormat
	 * @generated
	 */
	public Adapter createGrokDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.GroovyExpression <em>Groovy Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.GroovyExpression
	 * @generated
	 */
	public Adapter createGroovyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.GzipDeflaterDataFormat <em>Gzip Deflater Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.GzipDeflaterDataFormat
	 * @generated
	 */
	public Adapter createGzipDeflaterDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.HeadDefinition <em>Head Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.HeadDefinition
	 * @generated
	 */
	public Adapter createHeadDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.HeaderExpression <em>Header Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.HeaderExpression
	 * @generated
	 */
	public Adapter createHeaderExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.HealthyServiceCallServiceFilterConfiguration <em>Healthy Service Call Service Filter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.HealthyServiceCallServiceFilterConfiguration
	 * @generated
	 */
	public Adapter createHealthyServiceCallServiceFilterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Hl7DataFormat <em>Hl7 Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Hl7DataFormat
	 * @generated
	 */
	public Adapter createHl7DataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Hl7TerserExpression <em>Hl7 Terser Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Hl7TerserExpression
	 * @generated
	 */
	public Adapter createHl7TerserExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.IcalDataFormat <em>Ical Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.IcalDataFormat
	 * @generated
	 */
	public Adapter createIcalDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.IdempotentConsumerDefinition <em>Idempotent Consumer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.IdempotentConsumerDefinition
	 * @generated
	 */
	public Adapter createIdempotentConsumerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.IdentifiedType <em>Identified Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.IdentifiedType
	 * @generated
	 */
	public Adapter createIdentifiedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.InputTypeDefinition <em>Input Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.InputTypeDefinition
	 * @generated
	 */
	public Adapter createInputTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.InterceptDefinition <em>Intercept Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.InterceptDefinition
	 * @generated
	 */
	public Adapter createInterceptDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.InterceptFromDefinition <em>Intercept From Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.InterceptFromDefinition
	 * @generated
	 */
	public Adapter createInterceptFromDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.InterceptSendToEndpointDefinition <em>Intercept Send To Endpoint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.InterceptSendToEndpointDefinition
	 * @generated
	 */
	public Adapter createInterceptSendToEndpointDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Iso8583DataFormat <em>Iso8583 Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Iso8583DataFormat
	 * @generated
	 */
	public Adapter createIso8583DataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat <em>Jackson XML Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat
	 * @generated
	 */
	public Adapter createJacksonXMLDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.JavaExpression <em>Java Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.JavaExpression
	 * @generated
	 */
	public Adapter createJavaExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.JavaScriptExpression <em>Java Script Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.JavaScriptExpression
	 * @generated
	 */
	public Adapter createJavaScriptExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat <em>Jaxb Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.JaxbDataFormat
	 * @generated
	 */
	public Adapter createJaxbDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.JoorExpression <em>Joor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.JoorExpression
	 * @generated
	 */
	public Adapter createJoorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.JqExpression <em>Jq Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.JqExpression
	 * @generated
	 */
	public Adapter createJqExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.JsonApiDataFormat <em>Json Api Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.JsonApiDataFormat
	 * @generated
	 */
	public Adapter createJsonApiDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.JsonDataFormat <em>Json Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.JsonDataFormat
	 * @generated
	 */
	public Adapter createJsonDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.JsonPathExpression <em>Json Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.JsonPathExpression
	 * @generated
	 */
	public Adapter createJsonPathExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.JtaTransactionErrorHandlerDefinition <em>Jta Transaction Error Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.JtaTransactionErrorHandlerDefinition
	 * @generated
	 */
	public Adapter createJtaTransactionErrorHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.KameletDefinition <em>Kamelet Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.KameletDefinition
	 * @generated
	 */
	public Adapter createKameletDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.KeyManagersParametersFactoryBean <em>Key Managers Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.KeyManagersParametersFactoryBean
	 * @generated
	 */
	public Adapter createKeyManagersParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.KeyStoreParametersFactoryBean <em>Key Store Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.KeyStoreParametersFactoryBean
	 * @generated
	 */
	public Adapter createKeyStoreParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration <em>Kubernetes Service Call Service Discovery Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration
	 * @generated
	 */
	public Adapter createKubernetesServiceCallServiceDiscoveryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LangChain4JCharacterTokenizerDefinition <em>Lang Chain4 JCharacter Tokenizer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LangChain4JCharacterTokenizerDefinition
	 * @generated
	 */
	public Adapter createLangChain4JCharacterTokenizerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LangChain4JLineTokenizerDefinition <em>Lang Chain4 JLine Tokenizer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LangChain4JLineTokenizerDefinition
	 * @generated
	 */
	public Adapter createLangChain4JLineTokenizerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LangChain4JParagraphTokenizerDefinition <em>Lang Chain4 JParagraph Tokenizer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LangChain4JParagraphTokenizerDefinition
	 * @generated
	 */
	public Adapter createLangChain4JParagraphTokenizerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LangChain4JSentenceTokenizerDefinition <em>Lang Chain4 JSentence Tokenizer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LangChain4JSentenceTokenizerDefinition
	 * @generated
	 */
	public Adapter createLangChain4JSentenceTokenizerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation <em>Lang Chain4j Tokenizer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LangChain4jTokenizerImplementation
	 * @generated
	 */
	public Adapter createLangChain4jTokenizerImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LangChain4JWordTokenizerDefinition <em>Lang Chain4 JWord Tokenizer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LangChain4JWordTokenizerDefinition
	 * @generated
	 */
	public Adapter createLangChain4JWordTokenizerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LanguageExpression <em>Language Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LanguageExpression
	 * @generated
	 */
	public Adapter createLanguageExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LoadBalanceDefinition <em>Load Balance Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LoadBalanceDefinition
	 * @generated
	 */
	public Adapter createLoadBalanceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LoadBalancerDefinition <em>Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LoadBalancerDefinition
	 * @generated
	 */
	public Adapter createLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LoadTransformerDefinition <em>Load Transformer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LoadTransformerDefinition
	 * @generated
	 */
	public Adapter createLoadTransformerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LogDefinition <em>Log Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LogDefinition
	 * @generated
	 */
	public Adapter createLogDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LoopDefinition <em>Loop Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LoopDefinition
	 * @generated
	 */
	public Adapter createLoopDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.LzfDataFormat <em>Lzf Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.LzfDataFormat
	 * @generated
	 */
	public Adapter createLzfDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition <em>Marshal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.MarshalDefinition
	 * @generated
	 */
	public Adapter createMarshalDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.MethodCallExpression <em>Method Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.MethodCallExpression
	 * @generated
	 */
	public Adapter createMethodCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat <em>Mime Multipart Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat
	 * @generated
	 */
	public Adapter createMimeMultipartDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ModelLifecycleStrategySupport <em>Model Lifecycle Strategy Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ModelLifecycleStrategySupport
	 * @generated
	 */
	public Adapter createModelLifecycleStrategySupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.MulticastDefinition <em>Multicast Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.MulticastDefinition
	 * @generated
	 */
	public Adapter createMulticastDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.MutualTLSDefinition <em>Mutual TLS Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.MutualTLSDefinition
	 * @generated
	 */
	public Adapter createMutualTLSDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.MvelExpression <em>Mvel Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.MvelExpression
	 * @generated
	 */
	public Adapter createMvelExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.NamespaceAwareExpression <em>Namespace Aware Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.NamespaceAwareExpression
	 * @generated
	 */
	public Adapter createNamespaceAwareExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.NoErrorHandlerDefinition <em>No Error Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.NoErrorHandlerDefinition
	 * @generated
	 */
	public Adapter createNoErrorHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.NoOutputDefinition <em>No Output Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.NoOutputDefinition
	 * @generated
	 */
	public Adapter createNoOutputDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OAuth2Definition <em>OAuth2 Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OAuth2Definition
	 * @generated
	 */
	public Adapter createOAuth2DefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OgnlExpression <em>Ognl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OgnlExpression
	 * @generated
	 */
	public Adapter createOgnlExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OnCompletionDefinition <em>On Completion Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OnCompletionDefinition
	 * @generated
	 */
	public Adapter createOnCompletionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OnExceptionDefinition <em>On Exception Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OnExceptionDefinition
	 * @generated
	 */
	public Adapter createOnExceptionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OnFallbackDefinition <em>On Fallback Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OnFallbackDefinition
	 * @generated
	 */
	public Adapter createOnFallbackDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OnWhenDefinition <em>On When Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OnWhenDefinition
	 * @generated
	 */
	public Adapter createOnWhenDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OpenApiDefinition <em>Open Api Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OpenApiDefinition
	 * @generated
	 */
	public Adapter createOpenApiDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OpenIdConnectDefinition <em>Open Id Connect Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OpenIdConnectDefinition
	 * @generated
	 */
	public Adapter createOpenIdConnectDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition <em>Optimistic Lock Retry Policy Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition
	 * @generated
	 */
	public Adapter createOptimisticLockRetryPolicyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition <em>Optional Identified Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OptionalIdentifiedDefinition
	 * @generated
	 */
	public Adapter createOptionalIdentifiedDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OtherwiseDefinition <em>Otherwise Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OtherwiseDefinition
	 * @generated
	 */
	public Adapter createOtherwiseDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.OutputTypeDefinition <em>Output Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.OutputTypeDefinition
	 * @generated
	 */
	public Adapter createOutputTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PackageScanDefinition <em>Package Scan Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PackageScanDefinition
	 * @generated
	 */
	public Adapter createPackageScanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ParamDefinition <em>Param Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ParamDefinition
	 * @generated
	 */
	public Adapter createParamDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat <em>Parquet Avro Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat
	 * @generated
	 */
	public Adapter createParquetAvroDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PassThroughServiceCallServiceFilterConfiguration <em>Pass Through Service Call Service Filter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PassThroughServiceCallServiceFilterConfiguration
	 * @generated
	 */
	public Adapter createPassThroughServiceCallServiceFilterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PatchDefinition <em>Patch Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PatchDefinition
	 * @generated
	 */
	public Adapter createPatchDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PatternBasedPackageScanFilter <em>Pattern Based Package Scan Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PatternBasedPackageScanFilter
	 * @generated
	 */
	public Adapter createPatternBasedPackageScanFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PausableDefinition <em>Pausable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PausableDefinition
	 * @generated
	 */
	public Adapter createPausableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PgpDataFormat <em>Pgp Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PgpDataFormat
	 * @generated
	 */
	public Adapter createPgpDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PipelineDefinition <em>Pipeline Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PipelineDefinition
	 * @generated
	 */
	public Adapter createPipelineDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PolicyDefinition <em>Policy Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PolicyDefinition
	 * @generated
	 */
	public Adapter createPolicyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PollDefinition <em>Poll Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PollDefinition
	 * @generated
	 */
	public Adapter createPollDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PollEnrichDefinition <em>Poll Enrich Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PollEnrichDefinition
	 * @generated
	 */
	public Adapter createPollEnrichDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PostDefinition <em>Post Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PostDefinition
	 * @generated
	 */
	public Adapter createPostDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PredicateValidatorDefinition <em>Predicate Validator Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PredicateValidatorDefinition
	 * @generated
	 */
	public Adapter createPredicateValidatorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ProcessDefinition
	 * @generated
	 */
	public Adapter createProcessDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ProcessorDefinition <em>Processor Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ProcessorDefinition
	 * @generated
	 */
	public Adapter createProcessorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PropertyDefinition
	 * @generated
	 */
	public Adapter createPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PropertyDefinitions <em>Property Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PropertyDefinitions
	 * @generated
	 */
	public Adapter createPropertyDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PropertyExpressionDefinition <em>Property Expression Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PropertyExpressionDefinition
	 * @generated
	 */
	public Adapter createPropertyExpressionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ProtobufDataFormat <em>Protobuf Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ProtobufDataFormat
	 * @generated
	 */
	public Adapter createProtobufDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PutDefinition <em>Put Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PutDefinition
	 * @generated
	 */
	public Adapter createPutDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.PythonExpression <em>Python Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.PythonExpression
	 * @generated
	 */
	public Adapter createPythonExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RandomLoadBalancerDefinition <em>Random Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RandomLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createRandomLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RecipientListDefinition <em>Recipient List Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RecipientListDefinition
	 * @generated
	 */
	public Adapter createRecipientListDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition <em>Redelivery Policy Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition
	 * @generated
	 */
	public Adapter createRedeliveryPolicyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RefErrorHandlerDefinition <em>Ref Error Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RefErrorHandlerDefinition
	 * @generated
	 */
	public Adapter createRefErrorHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RefExpression <em>Ref Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RefExpression
	 * @generated
	 */
	public Adapter createRefExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RemoveHeaderDefinition <em>Remove Header Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RemoveHeaderDefinition
	 * @generated
	 */
	public Adapter createRemoveHeaderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RemoveHeadersDefinition <em>Remove Headers Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RemoveHeadersDefinition
	 * @generated
	 */
	public Adapter createRemoveHeadersDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RemovePropertiesDefinition <em>Remove Properties Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RemovePropertiesDefinition
	 * @generated
	 */
	public Adapter createRemovePropertiesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RemovePropertyDefinition <em>Remove Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RemovePropertyDefinition
	 * @generated
	 */
	public Adapter createRemovePropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RemoveVariableDefinition <em>Remove Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RemoveVariableDefinition
	 * @generated
	 */
	public Adapter createRemoveVariableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ResequenceDefinition <em>Resequence Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ResequenceDefinition
	 * @generated
	 */
	public Adapter createResequenceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ResequencerConfig <em>Resequencer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ResequencerConfig
	 * @generated
	 */
	public Adapter createResequencerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon <em>Resilience4 JConfiguration Common</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationCommon
	 * @generated
	 */
	public Adapter createResilience4JConfigurationCommonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationDefinition <em>Resilience4 JConfiguration Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationDefinition
	 * @generated
	 */
	public Adapter createResilience4JConfigurationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition <em>Response Header Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition
	 * @generated
	 */
	public Adapter createResponseHeaderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition <em>Response Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition
	 * @generated
	 */
	public Adapter createResponseMessageDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RestBindingDefinition <em>Rest Binding Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RestBindingDefinition
	 * @generated
	 */
	public Adapter createRestBindingDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition <em>Rest Configuration Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition
	 * @generated
	 */
	public Adapter createRestConfigurationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RestContextRefDefinition <em>Rest Context Ref Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RestContextRefDefinition
	 * @generated
	 */
	public Adapter createRestContextRefDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RestDefinition <em>Rest Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RestDefinition
	 * @generated
	 */
	public Adapter createRestDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RestPropertyDefinition <em>Rest Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RestPropertyDefinition
	 * @generated
	 */
	public Adapter createRestPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RestsDefinition <em>Rests Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RestsDefinition
	 * @generated
	 */
	public Adapter createRestsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition <em>Rest Securities Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition
	 * @generated
	 */
	public Adapter createRestSecuritiesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RestSecurityDefinition <em>Rest Security Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RestSecurityDefinition
	 * @generated
	 */
	public Adapter createRestSecurityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ResumableDefinition <em>Resumable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ResumableDefinition
	 * @generated
	 */
	public Adapter createResumableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RollbackDefinition <em>Rollback Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RollbackDefinition
	 * @generated
	 */
	public Adapter createRollbackDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RoundRobinLoadBalancerDefinition <em>Round Robin Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RoundRobinLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createRoundRobinLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RouteBuilderDefinition <em>Route Builder Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RouteBuilderDefinition
	 * @generated
	 */
	public Adapter createRouteBuilderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationContextRefDefinition <em>Route Configuration Context Ref Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RouteConfigurationContextRefDefinition
	 * @generated
	 */
	public Adapter createRouteConfigurationContextRefDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition <em>Route Configuration Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition
	 * @generated
	 */
	public Adapter createRouteConfigurationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RouteConfigurationsDefinition <em>Route Configurations Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RouteConfigurationsDefinition
	 * @generated
	 */
	public Adapter createRouteConfigurationsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RouteContextRefDefinition <em>Route Context Ref Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RouteContextRefDefinition
	 * @generated
	 */
	public Adapter createRouteContextRefDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RouteDefinition <em>Route Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RouteDefinition
	 * @generated
	 */
	public Adapter createRouteDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RoutesDefinition <em>Routes Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RoutesDefinition
	 * @generated
	 */
	public Adapter createRoutesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RouteTemplateContextRefDefinition <em>Route Template Context Ref Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RouteTemplateContextRefDefinition
	 * @generated
	 */
	public Adapter createRouteTemplateContextRefDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition <em>Route Template Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition
	 * @generated
	 */
	public Adapter createRouteTemplateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RouteTemplateParameterDefinition <em>Route Template Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RouteTemplateParameterDefinition
	 * @generated
	 */
	public Adapter createRouteTemplateParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RouteTemplatesDefinition <em>Route Templates Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RouteTemplatesDefinition
	 * @generated
	 */
	public Adapter createRouteTemplatesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RoutingSlipDefinition <em>Routing Slip Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RoutingSlipDefinition
	 * @generated
	 */
	public Adapter createRoutingSlipDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.RssDataFormat <em>Rss Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.RssDataFormat
	 * @generated
	 */
	public Adapter createRssDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SagaActionUriDefinition <em>Saga Action Uri Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SagaActionUriDefinition
	 * @generated
	 */
	public Adapter createSagaActionUriDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SagaDefinition <em>Saga Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SagaDefinition
	 * @generated
	 */
	public Adapter createSagaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SamplingDefinition <em>Sampling Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SamplingDefinition
	 * @generated
	 */
	public Adapter createSamplingDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ScriptDefinition <em>Script Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ScriptDefinition
	 * @generated
	 */
	public Adapter createScriptDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SecureRandomParametersFactoryBean <em>Secure Random Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SecureRandomParametersFactoryBean
	 * @generated
	 */
	public Adapter createSecureRandomParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SecureSocketProtocolsParameters <em>Secure Socket Protocols Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SecureSocketProtocolsParameters
	 * @generated
	 */
	public Adapter createSecureSocketProtocolsParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SecurityDefinition <em>Security Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SecurityDefinition
	 * @generated
	 */
	public Adapter createSecurityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SendDefinition <em>Send Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SendDefinition
	 * @generated
	 */
	public Adapter createSendDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfiguration <em>Service Call Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ServiceCallConfiguration
	 * @generated
	 */
	public Adapter createServiceCallConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition <em>Service Call Configuration Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition
	 * @generated
	 */
	public Adapter createServiceCallConfigurationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ServiceCallDefinition <em>Service Call Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ServiceCallDefinition
	 * @generated
	 */
	public Adapter createServiceCallDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ServiceCallDefinitionConstants <em>Service Call Definition Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ServiceCallDefinitionConstants
	 * @generated
	 */
	public Adapter createServiceCallDefinitionConstantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ServiceCallExpressionConfiguration <em>Service Call Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ServiceCallExpressionConfiguration
	 * @generated
	 */
	public Adapter createServiceCallExpressionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ServiceCallServiceChooserConfiguration <em>Service Call Service Chooser Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ServiceCallServiceChooserConfiguration
	 * @generated
	 */
	public Adapter createServiceCallServiceChooserConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ServiceCallServiceDiscoveryConfiguration <em>Service Call Service Discovery Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ServiceCallServiceDiscoveryConfiguration
	 * @generated
	 */
	public Adapter createServiceCallServiceDiscoveryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ServiceCallServiceFilterConfiguration <em>Service Call Service Filter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ServiceCallServiceFilterConfiguration
	 * @generated
	 */
	public Adapter createServiceCallServiceFilterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ServiceCallServiceLoadBalancerConfiguration <em>Service Call Service Load Balancer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ServiceCallServiceLoadBalancerConfiguration
	 * @generated
	 */
	public Adapter createServiceCallServiceLoadBalancerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SetBodyDefinition <em>Set Body Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SetBodyDefinition
	 * @generated
	 */
	public Adapter createSetBodyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SetExchangePatternDefinition <em>Set Exchange Pattern Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SetExchangePatternDefinition
	 * @generated
	 */
	public Adapter createSetExchangePatternDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SetHeaderDefinition <em>Set Header Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SetHeaderDefinition
	 * @generated
	 */
	public Adapter createSetHeaderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SetHeadersDefinition <em>Set Headers Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SetHeadersDefinition
	 * @generated
	 */
	public Adapter createSetHeadersDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SetPropertyDefinition <em>Set Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SetPropertyDefinition
	 * @generated
	 */
	public Adapter createSetPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SetVariableDefinition <em>Set Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SetVariableDefinition
	 * @generated
	 */
	public Adapter createSetVariableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SetVariablesDefinition <em>Set Variables Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SetVariablesDefinition
	 * @generated
	 */
	public Adapter createSetVariablesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SimpleExpression <em>Simple Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SimpleExpression
	 * @generated
	 */
	public Adapter createSimpleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SingleInputTypedExpressionDefinition <em>Single Input Typed Expression Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SingleInputTypedExpressionDefinition
	 * @generated
	 */
	public Adapter createSingleInputTypedExpressionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SmooksDataFormat <em>Smooks Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SmooksDataFormat
	 * @generated
	 */
	public Adapter createSmooksDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SniHostNames <em>Sni Host Names</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SniHostNames
	 * @generated
	 */
	public Adapter createSniHostNamesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SoapDataFormat <em>Soap Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SoapDataFormat
	 * @generated
	 */
	public Adapter createSoapDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SortDefinition <em>Sort Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SortDefinition
	 * @generated
	 */
	public Adapter createSortDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SpELExpression <em>Sp EL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SpELExpression
	 * @generated
	 */
	public Adapter createSpELExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SplitDefinition <em>Split Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SplitDefinition
	 * @generated
	 */
	public Adapter createSplitDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition <em>Spring Error Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SpringErrorHandlerDefinition
	 * @generated
	 */
	public Adapter createSpringErrorHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SpringTransactionErrorHandlerDefinition <em>Spring Transaction Error Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SpringTransactionErrorHandlerDefinition
	 * @generated
	 */
	public Adapter createSpringTransactionErrorHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SslContextClientParametersFactoryBean <em>Ssl Context Client Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SslContextClientParametersFactoryBean
	 * @generated
	 */
	public Adapter createSslContextClientParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean <em>Ssl Context Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean
	 * @generated
	 */
	public Adapter createSslContextParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean <em>Ssl Context Server Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SslContextServerParametersFactoryBean
	 * @generated
	 */
	public Adapter createSslContextServerParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.StaticServiceCallServiceDiscoveryConfiguration <em>Static Service Call Service Discovery Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.StaticServiceCallServiceDiscoveryConfiguration
	 * @generated
	 */
	public Adapter createStaticServiceCallServiceDiscoveryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.StepDefinition <em>Step Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.StepDefinition
	 * @generated
	 */
	public Adapter createStepDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.StickyLoadBalancerDefinition <em>Sticky Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.StickyLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createStickyLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.StopDefinition <em>Stop Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.StopDefinition
	 * @generated
	 */
	public Adapter createStopDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.StreamResequencerConfig <em>Stream Resequencer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.StreamResequencerConfig
	 * @generated
	 */
	public Adapter createStreamResequencerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SwiftMtDataFormat <em>Swift Mt Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SwiftMtDataFormat
	 * @generated
	 */
	public Adapter createSwiftMtDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat <em>Swift Mx Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat
	 * @generated
	 */
	public Adapter createSwiftMxDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.SyslogDataFormat <em>Syslog Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.SyslogDataFormat
	 * @generated
	 */
	public Adapter createSyslogDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TarFileDataFormat <em>Tar File Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TarFileDataFormat
	 * @generated
	 */
	public Adapter createTarFileDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition <em>Templated Route Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition
	 * @generated
	 */
	public Adapter createTemplatedRouteDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TemplatedRouteParameterDefinition <em>Templated Route Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TemplatedRouteParameterDefinition
	 * @generated
	 */
	public Adapter createTemplatedRouteParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TemplatedRoutesDefinition <em>Templated Routes Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TemplatedRoutesDefinition
	 * @generated
	 */
	public Adapter createTemplatedRoutesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ThreadPoolProfileDefinition <em>Thread Pool Profile Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ThreadPoolProfileDefinition
	 * @generated
	 */
	public Adapter createThreadPoolProfileDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ThreadsDefinition <em>Threads Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ThreadsDefinition
	 * @generated
	 */
	public Adapter createThreadsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ThriftDataFormat <em>Thrift Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ThriftDataFormat
	 * @generated
	 */
	public Adapter createThriftDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ThrottleDefinition <em>Throttle Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ThrottleDefinition
	 * @generated
	 */
	public Adapter createThrottleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition <em>Throw Exception Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition
	 * @generated
	 */
	public Adapter createThrowExceptionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TidyMarkupDataFormat <em>Tidy Markup Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TidyMarkupDataFormat
	 * @generated
	 */
	public Adapter createTidyMarkupDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ToDefinition <em>To Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ToDefinition
	 * @generated
	 */
	public Adapter createToDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ToDynamicDefinition <em>To Dynamic Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ToDynamicDefinition
	 * @generated
	 */
	public Adapter createToDynamicDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TokenizerDefinition <em>Tokenizer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TokenizerDefinition
	 * @generated
	 */
	public Adapter createTokenizerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TokenizerExpression <em>Tokenizer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TokenizerExpression
	 * @generated
	 */
	public Adapter createTokenizerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TokenizerImplementation <em>Tokenizer Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TokenizerImplementation
	 * @generated
	 */
	public Adapter createTokenizerImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TopicLoadBalancerDefinition <em>Topic Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TopicLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createTopicLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TransactedDefinition <em>Transacted Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TransactedDefinition
	 * @generated
	 */
	public Adapter createTransactedDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TransactionErrorHandlerDefinition <em>Transaction Error Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TransactionErrorHandlerDefinition
	 * @generated
	 */
	public Adapter createTransactionErrorHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TransformDefinition <em>Transform Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TransformDefinition
	 * @generated
	 */
	public Adapter createTransformDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Transformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Transformer
	 * @generated
	 */
	public Adapter createTransformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TransformersDefinition <em>Transformers Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TransformersDefinition
	 * @generated
	 */
	public Adapter createTransformersDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TrustManagersParametersFactoryBean <em>Trust Managers Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TrustManagersParametersFactoryBean
	 * @generated
	 */
	public Adapter createTrustManagersParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TryDefinition <em>Try Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TryDefinition
	 * @generated
	 */
	public Adapter createTryDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.TypedExpressionDefinition <em>Typed Expression Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.TypedExpressionDefinition
	 * @generated
	 */
	public Adapter createTypedExpressionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat <em>Uni Vocity Abstract Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.UniVocityAbstractDataFormat
	 * @generated
	 */
	public Adapter createUniVocityAbstractDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat <em>Uni Vocity Csv Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat
	 * @generated
	 */
	public Adapter createUniVocityCsvDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat <em>Uni Vocity Fixed Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat
	 * @generated
	 */
	public Adapter createUniVocityFixedDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.UniVocityHeader <em>Uni Vocity Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.UniVocityHeader
	 * @generated
	 */
	public Adapter createUniVocityHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.UniVocityTsvDataFormat <em>Uni Vocity Tsv Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.UniVocityTsvDataFormat
	 * @generated
	 */
	public Adapter createUniVocityTsvDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.UnmarshalDefinition <em>Unmarshal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.UnmarshalDefinition
	 * @generated
	 */
	public Adapter createUnmarshalDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ValidateDefinition <em>Validate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ValidateDefinition
	 * @generated
	 */
	public Adapter createValidateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.Validator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.Validator
	 * @generated
	 */
	public Adapter createValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ValidatorsDefinition <em>Validators Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ValidatorsDefinition
	 * @generated
	 */
	public Adapter createValidatorsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.VariableExpression <em>Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.VariableExpression
	 * @generated
	 */
	public Adapter createVariableExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.VerbDefinition <em>Verb Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.VerbDefinition
	 * @generated
	 */
	public Adapter createVerbDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.WasmExpression <em>Wasm Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.WasmExpression
	 * @generated
	 */
	public Adapter createWasmExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.WeightedLoadBalancerDefinition <em>Weighted Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.WeightedLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createWeightedLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.WhenDefinition <em>When Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.WhenDefinition
	 * @generated
	 */
	public Adapter createWhenDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.WireTapDefinition <em>Wire Tap Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.WireTapDefinition
	 * @generated
	 */
	public Adapter createWireTapDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat <em>Xml Security Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat
	 * @generated
	 */
	public Adapter createXmlSecurityDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.XmlTokenizerExpression <em>Xml Tokenizer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.XmlTokenizerExpression
	 * @generated
	 */
	public Adapter createXmlTokenizerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.XPathExpression <em>XPath Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.XPathExpression
	 * @generated
	 */
	public Adapter createXPathExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.XQueryExpression <em>XQuery Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.XQueryExpression
	 * @generated
	 */
	public Adapter createXQueryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.YamlDataFormat <em>Yaml Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.YamlDataFormat
	 * @generated
	 */
	public Adapter createYamlDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.YamlTypeFilterDefinition <em>Yaml Type Filter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.YamlTypeFilterDefinition
	 * @generated
	 */
	public Adapter createYamlTypeFilterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ZipDeflaterDataFormat <em>Zip Deflater Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ZipDeflaterDataFormat
	 * @generated
	 */
	public Adapter createZipDeflaterDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ZipFileDataFormat <em>Zip File Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ZipFileDataFormat
	 * @generated
	 */
	public Adapter createZipFileDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration <em>Zoo Keeper Service Call Service Discovery Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration
	 * @generated
	 */
	public Adapter createZooKeeperServiceCallServiceDiscoveryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CamelSpringAdapterFactory

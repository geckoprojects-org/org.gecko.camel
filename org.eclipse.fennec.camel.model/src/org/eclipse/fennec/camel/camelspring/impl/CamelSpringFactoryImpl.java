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
package org.eclipse.fennec.camel.camelspring.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.fennec.camel.camelspring.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelSpringFactoryImpl extends EFactoryImpl implements CamelSpringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CamelSpringFactory init() {
		try {
			CamelSpringFactory theCamelSpringFactory = (CamelSpringFactory)EPackage.Registry.INSTANCE.getEFactory(CamelSpringPackage.eNS_URI);
			if (theCamelSpringFactory != null) {
				return theCamelSpringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CamelSpringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelSpringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CamelSpringPackage.AGGREGATE_DEFINITION: return createAggregateDefinition();
			case CamelSpringPackage.ALLOWABLE_VALUES_TYPE: return createAllowableValuesType();
			case CamelSpringPackage.ALLOWABLE_VALUES_TYPE1: return createAllowableValuesType1();
			case CamelSpringPackage.API_KEY_DEFINITION: return createApiKeyDefinition();
			case CamelSpringPackage.APPLICATION_DEFINITION: return createApplicationDefinition();
			case CamelSpringPackage.ASN1_DATA_FORMAT: return createAsn1DataFormat();
			case CamelSpringPackage.AVRO_DATA_FORMAT: return createAvroDataFormat();
			case CamelSpringPackage.BARCODE_DATA_FORMAT: return createBarcodeDataFormat();
			case CamelSpringPackage.BASE64_DATA_FORMAT: return createBase64DataFormat();
			case CamelSpringPackage.BASIC_AUTH_DEFINITION: return createBasicAuthDefinition();
			case CamelSpringPackage.BATCH_RESEQUENCER_CONFIG: return createBatchResequencerConfig();
			case CamelSpringPackage.BEAN_CONSTRUCTOR_DEFINITION: return createBeanConstructorDefinition();
			case CamelSpringPackage.BEAN_CONSTRUCTORS_DEFINITION: return createBeanConstructorsDefinition();
			case CamelSpringPackage.BEAN_DEFINITION: return createBeanDefinition();
			case CamelSpringPackage.BEAN_FACTORY_DEFINITION: return createBeanFactoryDefinition();
			case CamelSpringPackage.BEANIO_DATA_FORMAT: return createBeanioDataFormat();
			case CamelSpringPackage.BEAN_PROPERTIES_DEFINITION: return createBeanPropertiesDefinition();
			case CamelSpringPackage.BEAN_PROPERTY_DEFINITION: return createBeanPropertyDefinition();
			case CamelSpringPackage.BEANS_DEFINITION: return createBeansDefinition();
			case CamelSpringPackage.BEARER_TOKEN_DEFINITION: return createBearerTokenDefinition();
			case CamelSpringPackage.BINDY_DATA_FORMAT: return createBindyDataFormat();
			case CamelSpringPackage.BLACKLIST_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: return createBlacklistServiceCallServiceFilterConfiguration();
			case CamelSpringPackage.CACHING_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: return createCachingServiceCallServiceDiscoveryConfiguration();
			case CamelSpringPackage.CAMEL_BEAN_POST_PROCESSOR: return createCamelBeanPostProcessor();
			case CamelSpringPackage.CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN: return createCamelConsumerTemplateFactoryBean();
			case CamelSpringPackage.CAMEL_CONTEXT_FACTORY_BEAN: return createCamelContextFactoryBean();
			case CamelSpringPackage.CAMEL_ENDPOINT_FACTORY_BEAN: return createCamelEndpointFactoryBean();
			case CamelSpringPackage.CAMEL_FLUENT_PRODUCER_TEMPLATE_FACTORY_BEAN: return createCamelFluentProducerTemplateFactoryBean();
			case CamelSpringPackage.CAMEL_JMX_AGENT_DEFINITION: return createCamelJMXAgentDefinition();
			case CamelSpringPackage.CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN: return createCamelProducerTemplateFactoryBean();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION: return createCamelPropertyPlaceholderDefinition();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_FUNCTION_DEFINITION: return createCamelPropertyPlaceholderFunctionDefinition();
			case CamelSpringPackage.CAMEL_PROPERTY_PLACEHOLDER_LOCATION_DEFINITION: return createCamelPropertyPlaceholderLocationDefinition();
			case CamelSpringPackage.CAMEL_REDELIVERY_POLICY_FACTORY_BEAN: return createCamelRedeliveryPolicyFactoryBean();
			case CamelSpringPackage.CAMEL_REST_CONTEXT_FACTORY_BEAN: return createCamelRestContextFactoryBean();
			case CamelSpringPackage.CAMEL_ROUTE_CONFIGURATION_CONTEXT_FACTORY_BEAN: return createCamelRouteConfigurationContextFactoryBean();
			case CamelSpringPackage.CAMEL_ROUTE_CONTEXT_FACTORY_BEAN: return createCamelRouteContextFactoryBean();
			case CamelSpringPackage.CAMEL_ROUTE_CONTROLLER_DEFINITION: return createCamelRouteControllerDefinition();
			case CamelSpringPackage.CAMEL_ROUTE_TEMPLATE_CONTEXT_FACTORY_BEAN: return createCamelRouteTemplateContextFactoryBean();
			case CamelSpringPackage.CAMEL_STREAM_CACHING_STRATEGY_DEFINITION: return createCamelStreamCachingStrategyDefinition();
			case CamelSpringPackage.CAMEL_THREAD_POOL_FACTORY_BEAN: return createCamelThreadPoolFactoryBean();
			case CamelSpringPackage.CATCH_DEFINITION: return createCatchDefinition();
			case CamelSpringPackage.CBOR_DATA_FORMAT: return createCborDataFormat();
			case CamelSpringPackage.CHOICE_DEFINITION: return createChoiceDefinition();
			case CamelSpringPackage.CIPHER_SUITES_PARAMETERS: return createCipherSuitesParameters();
			case CamelSpringPackage.CIRCUIT_BREAKER_DEFINITION: return createCircuitBreakerDefinition();
			case CamelSpringPackage.CLAIM_CHECK_DEFINITION: return createClaimCheckDefinition();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: return createCombinedServiceCallServiceDiscoveryConfiguration();
			case CamelSpringPackage.COMBINED_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: return createCombinedServiceCallServiceFilterConfiguration();
			case CamelSpringPackage.COMPONENT_SCAN_DEFINITION: return createComponentScanDefinition();
			case CamelSpringPackage.CONSTANT_EXPRESSION: return createConstantExpression();
			case CamelSpringPackage.CONSTANTS: return createConstants();
			case CamelSpringPackage.CONSUL_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: return createConsulServiceCallServiceDiscoveryConfiguration();
			case CamelSpringPackage.CONTEXT_SCAN_DEFINITION: return createContextScanDefinition();
			case CamelSpringPackage.CONVERT_BODY_DEFINITION: return createConvertBodyDefinition();
			case CamelSpringPackage.CONVERT_HEADER_DEFINITION: return createConvertHeaderDefinition();
			case CamelSpringPackage.CONVERT_VARIABLE_DEFINITION: return createConvertVariableDefinition();
			case CamelSpringPackage.CRYPTO_DATA_FORMAT: return createCryptoDataFormat();
			case CamelSpringPackage.CSIMPLE_EXPRESSION: return createCSimpleExpression();
			case CamelSpringPackage.CSV_DATA_FORMAT: return createCsvDataFormat();
			case CamelSpringPackage.CUSTOM_DATA_FORMAT: return createCustomDataFormat();
			case CamelSpringPackage.CUSTOM_LOAD_BALANCER_DEFINITION: return createCustomLoadBalancerDefinition();
			case CamelSpringPackage.CUSTOM_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: return createCustomServiceCallServiceFilterConfiguration();
			case CamelSpringPackage.CUSTOM_TRANSFORMER_DEFINITION: return createCustomTransformerDefinition();
			case CamelSpringPackage.CUSTOM_VALIDATOR_DEFINITION: return createCustomValidatorDefinition();
			case CamelSpringPackage.DATA_FORMAT: return createDataFormat();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION: return createDataFormatsDefinition();
			case CamelSpringPackage.DATA_FORMATS_TYPE: return createDataFormatsType();
			case CamelSpringPackage.DATA_FORMAT_TRANSFORMER_DEFINITION: return createDataFormatTransformerDefinition();
			case CamelSpringPackage.DATASONNET_EXPRESSION: return createDatasonnetExpression();
			case CamelSpringPackage.DEAD_LETTER_CHANNEL_DEFINITION: return createDeadLetterChannelDefinition();
			case CamelSpringPackage.DEFAULT_ERROR_HANDLER_DEFINITION: return createDefaultErrorHandlerDefinition();
			case CamelSpringPackage.DEFAULT_SERVICE_CALL_SERVICE_LOAD_BALANCER_CONFIGURATION: return createDefaultServiceCallServiceLoadBalancerConfiguration();
			case CamelSpringPackage.DELAY_DEFINITION: return createDelayDefinition();
			case CamelSpringPackage.DELETE_DEFINITION: return createDeleteDefinition();
			case CamelSpringPackage.DFDL_DATA_FORMAT: return createDfdlDataFormat();
			case CamelSpringPackage.DNS_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: return createDnsServiceCallServiceDiscoveryConfiguration();
			case CamelSpringPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CamelSpringPackage.DYNAMIC_ROUTER_DEFINITION: return createDynamicRouterDefinition();
			case CamelSpringPackage.ENDPOINT_TRANSFORMER_DEFINITION: return createEndpointTransformerDefinition();
			case CamelSpringPackage.ENDPOINT_VALIDATOR_DEFINITION: return createEndpointValidatorDefinition();
			case CamelSpringPackage.ENRICH_DEFINITION: return createEnrichDefinition();
			case CamelSpringPackage.ERROR_HANDLER_DEFINITION: return createErrorHandlerDefinition();
			case CamelSpringPackage.EXCHANGE_PROPERTY_EXPRESSION: return createExchangePropertyExpression();
			case CamelSpringPackage.EXPRESSION: return createExpression();
			case CamelSpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION: return createExpressionSubElementDefinition();
			case CamelSpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION: return createFailoverLoadBalancerDefinition();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_COMMON: return createFaultToleranceConfigurationCommon();
			case CamelSpringPackage.FAULT_TOLERANCE_CONFIGURATION_DEFINITION: return createFaultToleranceConfigurationDefinition();
			case CamelSpringPackage.FHIR_JSON_DATA_FORMAT: return createFhirJsonDataFormat();
			case CamelSpringPackage.FHIR_XML_DATA_FORMAT: return createFhirXmlDataFormat();
			case CamelSpringPackage.FILTER_DEFINITION: return createFilterDefinition();
			case CamelSpringPackage.FILTER_PARAMETERS: return createFilterParameters();
			case CamelSpringPackage.FINALLY_DEFINITION: return createFinallyDefinition();
			case CamelSpringPackage.FLATPACK_DATA_FORMAT: return createFlatpackDataFormat();
			case CamelSpringPackage.FORY_DATA_FORMAT: return createForyDataFormat();
			case CamelSpringPackage.FROM_DEFINITION: return createFromDefinition();
			case CamelSpringPackage.GET_DEFINITION: return createGetDefinition();
			case CamelSpringPackage.GLOBAL_OPTION_DEFINITION: return createGlobalOptionDefinition();
			case CamelSpringPackage.GLOBAL_OPTIONS_DEFINITION: return createGlobalOptionsDefinition();
			case CamelSpringPackage.GROK_DATA_FORMAT: return createGrokDataFormat();
			case CamelSpringPackage.GROOVY_EXPRESSION: return createGroovyExpression();
			case CamelSpringPackage.GZIP_DEFLATER_DATA_FORMAT: return createGzipDeflaterDataFormat();
			case CamelSpringPackage.HEAD_DEFINITION: return createHeadDefinition();
			case CamelSpringPackage.HEADER_EXPRESSION: return createHeaderExpression();
			case CamelSpringPackage.HEALTHY_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: return createHealthyServiceCallServiceFilterConfiguration();
			case CamelSpringPackage.HL7_DATA_FORMAT: return createHl7DataFormat();
			case CamelSpringPackage.HL7_TERSER_EXPRESSION: return createHl7TerserExpression();
			case CamelSpringPackage.ICAL_DATA_FORMAT: return createIcalDataFormat();
			case CamelSpringPackage.IDEMPOTENT_CONSUMER_DEFINITION: return createIdempotentConsumerDefinition();
			case CamelSpringPackage.INPUT_TYPE_DEFINITION: return createInputTypeDefinition();
			case CamelSpringPackage.INTERCEPT_DEFINITION: return createInterceptDefinition();
			case CamelSpringPackage.INTERCEPT_FROM_DEFINITION: return createInterceptFromDefinition();
			case CamelSpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION: return createInterceptSendToEndpointDefinition();
			case CamelSpringPackage.ISO8583_DATA_FORMAT: return createIso8583DataFormat();
			case CamelSpringPackage.JACKSON_XML_DATA_FORMAT: return createJacksonXMLDataFormat();
			case CamelSpringPackage.JAVA_EXPRESSION: return createJavaExpression();
			case CamelSpringPackage.JAVA_SCRIPT_EXPRESSION: return createJavaScriptExpression();
			case CamelSpringPackage.JAXB_DATA_FORMAT: return createJaxbDataFormat();
			case CamelSpringPackage.JOOR_EXPRESSION: return createJoorExpression();
			case CamelSpringPackage.JQ_EXPRESSION: return createJqExpression();
			case CamelSpringPackage.JSON_API_DATA_FORMAT: return createJsonApiDataFormat();
			case CamelSpringPackage.JSON_DATA_FORMAT: return createJsonDataFormat();
			case CamelSpringPackage.JSON_PATH_EXPRESSION: return createJsonPathExpression();
			case CamelSpringPackage.JTA_TRANSACTION_ERROR_HANDLER_DEFINITION: return createJtaTransactionErrorHandlerDefinition();
			case CamelSpringPackage.KAMELET_DEFINITION: return createKameletDefinition();
			case CamelSpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN: return createKeyManagersParametersFactoryBean();
			case CamelSpringPackage.KEY_STORE_PARAMETERS_FACTORY_BEAN: return createKeyStoreParametersFactoryBean();
			case CamelSpringPackage.KUBERNETES_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: return createKubernetesServiceCallServiceDiscoveryConfiguration();
			case CamelSpringPackage.LANG_CHAIN4_JCHARACTER_TOKENIZER_DEFINITION: return createLangChain4JCharacterTokenizerDefinition();
			case CamelSpringPackage.LANG_CHAIN4_JLINE_TOKENIZER_DEFINITION: return createLangChain4JLineTokenizerDefinition();
			case CamelSpringPackage.LANG_CHAIN4_JPARAGRAPH_TOKENIZER_DEFINITION: return createLangChain4JParagraphTokenizerDefinition();
			case CamelSpringPackage.LANG_CHAIN4_JSENTENCE_TOKENIZER_DEFINITION: return createLangChain4JSentenceTokenizerDefinition();
			case CamelSpringPackage.LANG_CHAIN4J_TOKENIZER_IMPLEMENTATION: return createLangChain4jTokenizerImplementation();
			case CamelSpringPackage.LANG_CHAIN4_JWORD_TOKENIZER_DEFINITION: return createLangChain4JWordTokenizerDefinition();
			case CamelSpringPackage.LANGUAGE_EXPRESSION: return createLanguageExpression();
			case CamelSpringPackage.LOAD_BALANCE_DEFINITION: return createLoadBalanceDefinition();
			case CamelSpringPackage.LOAD_TRANSFORMER_DEFINITION: return createLoadTransformerDefinition();
			case CamelSpringPackage.LOG_DEFINITION: return createLogDefinition();
			case CamelSpringPackage.LOOP_DEFINITION: return createLoopDefinition();
			case CamelSpringPackage.LZF_DATA_FORMAT: return createLzfDataFormat();
			case CamelSpringPackage.MARSHAL_DEFINITION: return createMarshalDefinition();
			case CamelSpringPackage.METHOD_CALL_EXPRESSION: return createMethodCallExpression();
			case CamelSpringPackage.MIME_MULTIPART_DATA_FORMAT: return createMimeMultipartDataFormat();
			case CamelSpringPackage.MODEL_LIFECYCLE_STRATEGY_SUPPORT: return createModelLifecycleStrategySupport();
			case CamelSpringPackage.MULTICAST_DEFINITION: return createMulticastDefinition();
			case CamelSpringPackage.MUTUAL_TLS_DEFINITION: return createMutualTLSDefinition();
			case CamelSpringPackage.MVEL_EXPRESSION: return createMvelExpression();
			case CamelSpringPackage.NO_ERROR_HANDLER_DEFINITION: return createNoErrorHandlerDefinition();
			case CamelSpringPackage.OAUTH2_DEFINITION: return createOAuth2Definition();
			case CamelSpringPackage.OGNL_EXPRESSION: return createOgnlExpression();
			case CamelSpringPackage.ON_COMPLETION_DEFINITION: return createOnCompletionDefinition();
			case CamelSpringPackage.ON_EXCEPTION_DEFINITION: return createOnExceptionDefinition();
			case CamelSpringPackage.ON_FALLBACK_DEFINITION: return createOnFallbackDefinition();
			case CamelSpringPackage.ON_WHEN_DEFINITION: return createOnWhenDefinition();
			case CamelSpringPackage.OPEN_API_DEFINITION: return createOpenApiDefinition();
			case CamelSpringPackage.OPEN_ID_CONNECT_DEFINITION: return createOpenIdConnectDefinition();
			case CamelSpringPackage.OPTIMISTIC_LOCK_RETRY_POLICY_DEFINITION: return createOptimisticLockRetryPolicyDefinition();
			case CamelSpringPackage.OTHERWISE_DEFINITION: return createOtherwiseDefinition();
			case CamelSpringPackage.OUTPUT: return createOutput();
			case CamelSpringPackage.OUTPUT_TYPE_DEFINITION: return createOutputTypeDefinition();
			case CamelSpringPackage.PACKAGE_SCAN_DEFINITION: return createPackageScanDefinition();
			case CamelSpringPackage.PARAM_DEFINITION: return createParamDefinition();
			case CamelSpringPackage.PARQUET_AVRO_DATA_FORMAT: return createParquetAvroDataFormat();
			case CamelSpringPackage.PASS_THROUGH_SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: return createPassThroughServiceCallServiceFilterConfiguration();
			case CamelSpringPackage.PATCH_DEFINITION: return createPatchDefinition();
			case CamelSpringPackage.PATTERN_BASED_PACKAGE_SCAN_FILTER: return createPatternBasedPackageScanFilter();
			case CamelSpringPackage.PAUSABLE_DEFINITION: return createPausableDefinition();
			case CamelSpringPackage.PGP_DATA_FORMAT: return createPgpDataFormat();
			case CamelSpringPackage.PIPELINE_DEFINITION: return createPipelineDefinition();
			case CamelSpringPackage.POLICY_DEFINITION: return createPolicyDefinition();
			case CamelSpringPackage.POLL_DEFINITION: return createPollDefinition();
			case CamelSpringPackage.POLL_ENRICH_DEFINITION: return createPollEnrichDefinition();
			case CamelSpringPackage.POST_DEFINITION: return createPostDefinition();
			case CamelSpringPackage.PREDICATE_VALIDATOR_DEFINITION: return createPredicateValidatorDefinition();
			case CamelSpringPackage.PROCESS_DEFINITION: return createProcessDefinition();
			case CamelSpringPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
			case CamelSpringPackage.PROPERTY_DEFINITIONS: return createPropertyDefinitions();
			case CamelSpringPackage.PROPERTY_EXPRESSION_DEFINITION: return createPropertyExpressionDefinition();
			case CamelSpringPackage.PROTOBUF_DATA_FORMAT: return createProtobufDataFormat();
			case CamelSpringPackage.PUT_DEFINITION: return createPutDefinition();
			case CamelSpringPackage.PYTHON_EXPRESSION: return createPythonExpression();
			case CamelSpringPackage.RANDOM_LOAD_BALANCER_DEFINITION: return createRandomLoadBalancerDefinition();
			case CamelSpringPackage.RECIPIENT_LIST_DEFINITION: return createRecipientListDefinition();
			case CamelSpringPackage.REDELIVERY_POLICY_DEFINITION: return createRedeliveryPolicyDefinition();
			case CamelSpringPackage.REF_ERROR_HANDLER_DEFINITION: return createRefErrorHandlerDefinition();
			case CamelSpringPackage.REF_EXPRESSION: return createRefExpression();
			case CamelSpringPackage.REMOVE_HEADER_DEFINITION: return createRemoveHeaderDefinition();
			case CamelSpringPackage.REMOVE_HEADERS_DEFINITION: return createRemoveHeadersDefinition();
			case CamelSpringPackage.REMOVE_PROPERTIES_DEFINITION: return createRemovePropertiesDefinition();
			case CamelSpringPackage.REMOVE_PROPERTY_DEFINITION: return createRemovePropertyDefinition();
			case CamelSpringPackage.REMOVE_VARIABLE_DEFINITION: return createRemoveVariableDefinition();
			case CamelSpringPackage.RESEQUENCE_DEFINITION: return createResequenceDefinition();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_COMMON: return createResilience4JConfigurationCommon();
			case CamelSpringPackage.RESILIENCE4_JCONFIGURATION_DEFINITION: return createResilience4JConfigurationDefinition();
			case CamelSpringPackage.RESPONSE_HEADER_DEFINITION: return createResponseHeaderDefinition();
			case CamelSpringPackage.RESPONSE_MESSAGE_DEFINITION: return createResponseMessageDefinition();
			case CamelSpringPackage.REST_BINDING_DEFINITION: return createRestBindingDefinition();
			case CamelSpringPackage.REST_CONFIGURATION_DEFINITION: return createRestConfigurationDefinition();
			case CamelSpringPackage.REST_CONTEXT_REF_DEFINITION: return createRestContextRefDefinition();
			case CamelSpringPackage.REST_DEFINITION: return createRestDefinition();
			case CamelSpringPackage.REST_PROPERTY_DEFINITION: return createRestPropertyDefinition();
			case CamelSpringPackage.RESTS_DEFINITION: return createRestsDefinition();
			case CamelSpringPackage.REST_SECURITIES_DEFINITION: return createRestSecuritiesDefinition();
			case CamelSpringPackage.RESUMABLE_DEFINITION: return createResumableDefinition();
			case CamelSpringPackage.ROLLBACK_DEFINITION: return createRollbackDefinition();
			case CamelSpringPackage.ROUND_ROBIN_LOAD_BALANCER_DEFINITION: return createRoundRobinLoadBalancerDefinition();
			case CamelSpringPackage.ROUTE_BUILDER_DEFINITION: return createRouteBuilderDefinition();
			case CamelSpringPackage.ROUTE_CONFIGURATION_CONTEXT_REF_DEFINITION: return createRouteConfigurationContextRefDefinition();
			case CamelSpringPackage.ROUTE_CONFIGURATION_DEFINITION: return createRouteConfigurationDefinition();
			case CamelSpringPackage.ROUTE_CONFIGURATIONS_DEFINITION: return createRouteConfigurationsDefinition();
			case CamelSpringPackage.ROUTE_CONTEXT_REF_DEFINITION: return createRouteContextRefDefinition();
			case CamelSpringPackage.ROUTE_DEFINITION: return createRouteDefinition();
			case CamelSpringPackage.ROUTES_DEFINITION: return createRoutesDefinition();
			case CamelSpringPackage.ROUTE_TEMPLATE_CONTEXT_REF_DEFINITION: return createRouteTemplateContextRefDefinition();
			case CamelSpringPackage.ROUTE_TEMPLATE_DEFINITION: return createRouteTemplateDefinition();
			case CamelSpringPackage.ROUTE_TEMPLATE_PARAMETER_DEFINITION: return createRouteTemplateParameterDefinition();
			case CamelSpringPackage.ROUTE_TEMPLATES_DEFINITION: return createRouteTemplatesDefinition();
			case CamelSpringPackage.ROUTING_SLIP_DEFINITION: return createRoutingSlipDefinition();
			case CamelSpringPackage.RSS_DATA_FORMAT: return createRssDataFormat();
			case CamelSpringPackage.SAGA_ACTION_URI_DEFINITION: return createSagaActionUriDefinition();
			case CamelSpringPackage.SAGA_DEFINITION: return createSagaDefinition();
			case CamelSpringPackage.SAMPLING_DEFINITION: return createSamplingDefinition();
			case CamelSpringPackage.SCRIPT_DEFINITION: return createScriptDefinition();
			case CamelSpringPackage.SECURE_RANDOM_PARAMETERS_FACTORY_BEAN: return createSecureRandomParametersFactoryBean();
			case CamelSpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS: return createSecureSocketProtocolsParameters();
			case CamelSpringPackage.SECURITY_DEFINITION: return createSecurityDefinition();
			case CamelSpringPackage.SERVICE_CALL_CONFIGURATION_DEFINITION: return createServiceCallConfigurationDefinition();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION: return createServiceCallDefinition();
			case CamelSpringPackage.SERVICE_CALL_DEFINITION_CONSTANTS: return createServiceCallDefinitionConstants();
			case CamelSpringPackage.SERVICE_CALL_EXPRESSION_CONFIGURATION: return createServiceCallExpressionConfiguration();
			case CamelSpringPackage.SERVICE_CALL_SERVICE_CHOOSER_CONFIGURATION: return createServiceCallServiceChooserConfiguration();
			case CamelSpringPackage.SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: return createServiceCallServiceDiscoveryConfiguration();
			case CamelSpringPackage.SERVICE_CALL_SERVICE_FILTER_CONFIGURATION: return createServiceCallServiceFilterConfiguration();
			case CamelSpringPackage.SERVICE_CALL_SERVICE_LOAD_BALANCER_CONFIGURATION: return createServiceCallServiceLoadBalancerConfiguration();
			case CamelSpringPackage.SET_BODY_DEFINITION: return createSetBodyDefinition();
			case CamelSpringPackage.SET_EXCHANGE_PATTERN_DEFINITION: return createSetExchangePatternDefinition();
			case CamelSpringPackage.SET_HEADER_DEFINITION: return createSetHeaderDefinition();
			case CamelSpringPackage.SET_HEADERS_DEFINITION: return createSetHeadersDefinition();
			case CamelSpringPackage.SET_PROPERTY_DEFINITION: return createSetPropertyDefinition();
			case CamelSpringPackage.SET_VARIABLE_DEFINITION: return createSetVariableDefinition();
			case CamelSpringPackage.SET_VARIABLES_DEFINITION: return createSetVariablesDefinition();
			case CamelSpringPackage.SIMPLE_EXPRESSION: return createSimpleExpression();
			case CamelSpringPackage.SMOOKS_DATA_FORMAT: return createSmooksDataFormat();
			case CamelSpringPackage.SNI_HOST_NAMES: return createSniHostNames();
			case CamelSpringPackage.SOAP_DATA_FORMAT: return createSoapDataFormat();
			case CamelSpringPackage.SORT_DEFINITION: return createSortDefinition();
			case CamelSpringPackage.SP_EL_EXPRESSION: return createSpELExpression();
			case CamelSpringPackage.SPLIT_DEFINITION: return createSplitDefinition();
			case CamelSpringPackage.SPRING_ERROR_HANDLER_DEFINITION: return createSpringErrorHandlerDefinition();
			case CamelSpringPackage.SPRING_TRANSACTION_ERROR_HANDLER_DEFINITION: return createSpringTransactionErrorHandlerDefinition();
			case CamelSpringPackage.SSL_CONTEXT_CLIENT_PARAMETERS_FACTORY_BEAN: return createSslContextClientParametersFactoryBean();
			case CamelSpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN: return createSslContextParametersFactoryBean();
			case CamelSpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN: return createSslContextServerParametersFactoryBean();
			case CamelSpringPackage.STATIC_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: return createStaticServiceCallServiceDiscoveryConfiguration();
			case CamelSpringPackage.STEP_DEFINITION: return createStepDefinition();
			case CamelSpringPackage.STICKY_LOAD_BALANCER_DEFINITION: return createStickyLoadBalancerDefinition();
			case CamelSpringPackage.STOP_DEFINITION: return createStopDefinition();
			case CamelSpringPackage.STREAM_RESEQUENCER_CONFIG: return createStreamResequencerConfig();
			case CamelSpringPackage.SWIFT_MT_DATA_FORMAT: return createSwiftMtDataFormat();
			case CamelSpringPackage.SWIFT_MX_DATA_FORMAT: return createSwiftMxDataFormat();
			case CamelSpringPackage.SYSLOG_DATA_FORMAT: return createSyslogDataFormat();
			case CamelSpringPackage.TAR_FILE_DATA_FORMAT: return createTarFileDataFormat();
			case CamelSpringPackage.TEMPLATED_ROUTE_DEFINITION: return createTemplatedRouteDefinition();
			case CamelSpringPackage.TEMPLATED_ROUTE_PARAMETER_DEFINITION: return createTemplatedRouteParameterDefinition();
			case CamelSpringPackage.TEMPLATED_ROUTES_DEFINITION: return createTemplatedRoutesDefinition();
			case CamelSpringPackage.THREAD_POOL_PROFILE_DEFINITION: return createThreadPoolProfileDefinition();
			case CamelSpringPackage.THREADS_DEFINITION: return createThreadsDefinition();
			case CamelSpringPackage.THRIFT_DATA_FORMAT: return createThriftDataFormat();
			case CamelSpringPackage.THROTTLE_DEFINITION: return createThrottleDefinition();
			case CamelSpringPackage.THROW_EXCEPTION_DEFINITION: return createThrowExceptionDefinition();
			case CamelSpringPackage.TIDY_MARKUP_DATA_FORMAT: return createTidyMarkupDataFormat();
			case CamelSpringPackage.TO_DEFINITION: return createToDefinition();
			case CamelSpringPackage.TO_DYNAMIC_DEFINITION: return createToDynamicDefinition();
			case CamelSpringPackage.TOKENIZER_DEFINITION: return createTokenizerDefinition();
			case CamelSpringPackage.TOKENIZER_EXPRESSION: return createTokenizerExpression();
			case CamelSpringPackage.TOKENIZER_IMPLEMENTATION: return createTokenizerImplementation();
			case CamelSpringPackage.TOPIC_LOAD_BALANCER_DEFINITION: return createTopicLoadBalancerDefinition();
			case CamelSpringPackage.TRANSACTED_DEFINITION: return createTransactedDefinition();
			case CamelSpringPackage.TRANSFORM_DEFINITION: return createTransformDefinition();
			case CamelSpringPackage.TRANSFORMERS_DEFINITION: return createTransformersDefinition();
			case CamelSpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN: return createTrustManagersParametersFactoryBean();
			case CamelSpringPackage.TRY_DEFINITION: return createTryDefinition();
			case CamelSpringPackage.UNI_VOCITY_CSV_DATA_FORMAT: return createUniVocityCsvDataFormat();
			case CamelSpringPackage.UNI_VOCITY_FIXED_DATA_FORMAT: return createUniVocityFixedDataFormat();
			case CamelSpringPackage.UNI_VOCITY_HEADER: return createUniVocityHeader();
			case CamelSpringPackage.UNI_VOCITY_TSV_DATA_FORMAT: return createUniVocityTsvDataFormat();
			case CamelSpringPackage.UNMARSHAL_DEFINITION: return createUnmarshalDefinition();
			case CamelSpringPackage.VALIDATE_DEFINITION: return createValidateDefinition();
			case CamelSpringPackage.VALIDATORS_DEFINITION: return createValidatorsDefinition();
			case CamelSpringPackage.VARIABLE_EXPRESSION: return createVariableExpression();
			case CamelSpringPackage.WASM_EXPRESSION: return createWasmExpression();
			case CamelSpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION: return createWeightedLoadBalancerDefinition();
			case CamelSpringPackage.WHEN_DEFINITION: return createWhenDefinition();
			case CamelSpringPackage.WIRE_TAP_DEFINITION: return createWireTapDefinition();
			case CamelSpringPackage.XML_SECURITY_DATA_FORMAT: return createXmlSecurityDataFormat();
			case CamelSpringPackage.XML_TOKENIZER_EXPRESSION: return createXmlTokenizerExpression();
			case CamelSpringPackage.XPATH_EXPRESSION: return createXPathExpression();
			case CamelSpringPackage.XQUERY_EXPRESSION: return createXQueryExpression();
			case CamelSpringPackage.YAML_DATA_FORMAT: return createYamlDataFormat();
			case CamelSpringPackage.YAML_TYPE_FILTER_DEFINITION: return createYamlTypeFilterDefinition();
			case CamelSpringPackage.ZIP_DEFLATER_DATA_FORMAT: return createZipDeflaterDataFormat();
			case CamelSpringPackage.ZIP_FILE_DATA_FORMAT: return createZipFileDataFormat();
			case CamelSpringPackage.ZOO_KEEPER_SERVICE_CALL_SERVICE_DISCOVERY_CONFIGURATION: return createZooKeeperServiceCallServiceDiscoveryConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CamelSpringPackage.AVRO_LIBRARY:
				return createAvroLibraryFromString(eDataType, initialValue);
			case CamelSpringPackage.BEAN_SCOPE:
				return createBeanScopeFromString(eDataType, initialValue);
			case CamelSpringPackage.BINDY_TYPE:
				return createBindyTypeFromString(eDataType, initialValue);
			case CamelSpringPackage.CLAIM_CHECK_OPERATION:
				return createClaimCheckOperationFromString(eDataType, initialValue);
			case CamelSpringPackage.COLLECTION_FORMAT:
				return createCollectionFormatFromString(eDataType, initialValue);
			case CamelSpringPackage.EXCHANGE_PATTERN:
				return createExchangePatternFromString(eDataType, initialValue);
			case CamelSpringPackage.JSON_LIBRARY:
				return createJsonLibraryFromString(eDataType, initialValue);
			case CamelSpringPackage.LOGGING_LEVEL:
				return createLoggingLevelFromString(eDataType, initialValue);
			case CamelSpringPackage.MANAGEMENT_STATISTICS_LEVEL:
				return createManagementStatisticsLevelFromString(eDataType, initialValue);
			case CamelSpringPackage.MODE:
				return createModeFromString(eDataType, initialValue);
			case CamelSpringPackage.ON_COMPLETION_MODE:
				return createOnCompletionModeFromString(eDataType, initialValue);
			case CamelSpringPackage.OPTION:
				return createOptionFromString(eDataType, initialValue);
			case CamelSpringPackage.PROTOBUF_LIBRARY:
				return createProtobufLibraryFromString(eDataType, initialValue);
			case CamelSpringPackage.REST_BINDING_MODE:
				return createRestBindingModeFromString(eDataType, initialValue);
			case CamelSpringPackage.REST_HOST_NAME_RESOLVER:
				return createRestHostNameResolverFromString(eDataType, initialValue);
			case CamelSpringPackage.REST_PARAM_TYPE:
				return createRestParamTypeFromString(eDataType, initialValue);
			case CamelSpringPackage.RESULT_QNAME:
				return createResultQNameFromString(eDataType, initialValue);
			case CamelSpringPackage.SAGA_COMPLETION_MODE:
				return createSagaCompletionModeFromString(eDataType, initialValue);
			case CamelSpringPackage.SAGA_PROPAGATION:
				return createSagaPropagationFromString(eDataType, initialValue);
			case CamelSpringPackage.SCOPE:
				return createScopeFromString(eDataType, initialValue);
			case CamelSpringPackage.SHUTDOWN_ROUTE:
				return createShutdownRouteFromString(eDataType, initialValue);
			case CamelSpringPackage.SHUTDOWN_RUNNING_TASK:
				return createShutdownRunningTaskFromString(eDataType, initialValue);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_TYPE:
				return createSpringErrorHandlerTypeFromString(eDataType, initialValue);
			case CamelSpringPackage.STARTUP_SUMMARY_LEVEL:
				return createStartupSummaryLevelFromString(eDataType, initialValue);
			case CamelSpringPackage.THROTTLING_MODE:
				return createThrottlingModeFromString(eDataType, initialValue);
			case CamelSpringPackage.TOKENIZER_TYPE:
				return createTokenizerTypeFromString(eDataType, initialValue);
			case CamelSpringPackage.TYPE_CONVERTER_EXISTS:
				return createTypeConverterExistsFromString(eDataType, initialValue);
			case CamelSpringPackage.WAIT_FOR_TASK_TO_COMPLETE:
				return createWaitForTaskToCompleteFromString(eDataType, initialValue);
			case CamelSpringPackage.YAML_LIBRARY:
				return createYamlLibraryFromString(eDataType, initialValue);
			case CamelSpringPackage.YAML_TYPE_FILTER_TYPE:
				return createYamlTypeFilterTypeFromString(eDataType, initialValue);
			case CamelSpringPackage.AVRO_LIBRARY_OBJECT:
				return createAvroLibraryObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.BEAN_SCOPE_OBJECT:
				return createBeanScopeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.BINDY_TYPE_OBJECT:
				return createBindyTypeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.CLAIM_CHECK_OPERATION_OBJECT:
				return createClaimCheckOperationObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.COLLECTION_FORMAT_OBJECT:
				return createCollectionFormatObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.EXCHANGE_PATTERN_OBJECT:
				return createExchangePatternObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.JSON_LIBRARY_OBJECT:
				return createJsonLibraryObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.LOGGING_LEVEL_OBJECT:
				return createLoggingLevelObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.MANAGEMENT_STATISTICS_LEVEL_OBJECT:
				return createManagementStatisticsLevelObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.MODE_OBJECT:
				return createModeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.ON_COMPLETION_MODE_OBJECT:
				return createOnCompletionModeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.OPTION_OBJECT:
				return createOptionObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.PROTOBUF_LIBRARY_OBJECT:
				return createProtobufLibraryObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.REST_BINDING_MODE_OBJECT:
				return createRestBindingModeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.REST_HOST_NAME_RESOLVER_OBJECT:
				return createRestHostNameResolverObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.REST_PARAM_TYPE_OBJECT:
				return createRestParamTypeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.RESULT_QNAME_OBJECT:
				return createResultQNameObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.SAGA_COMPLETION_MODE_OBJECT:
				return createSagaCompletionModeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.SAGA_PROPAGATION_OBJECT:
				return createSagaPropagationObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.SCOPE_OBJECT:
				return createScopeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.SHUTDOWN_ROUTE_OBJECT:
				return createShutdownRouteObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.SHUTDOWN_RUNNING_TASK_OBJECT:
				return createShutdownRunningTaskObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_TYPE_OBJECT:
				return createSpringErrorHandlerTypeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.STARTUP_SUMMARY_LEVEL_OBJECT:
				return createStartupSummaryLevelObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.THROTTLING_MODE_OBJECT:
				return createThrottlingModeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.TOKENIZER_TYPE_OBJECT:
				return createTokenizerTypeObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.TYPE_CONVERTER_EXISTS_OBJECT:
				return createTypeConverterExistsObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.VALUE_DEFINITION:
				return createValueDefinitionFromString(eDataType, initialValue);
			case CamelSpringPackage.WAIT_FOR_TASK_TO_COMPLETE_OBJECT:
				return createWaitForTaskToCompleteObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.YAML_LIBRARY_OBJECT:
				return createYamlLibraryObjectFromString(eDataType, initialValue);
			case CamelSpringPackage.YAML_TYPE_FILTER_TYPE_OBJECT:
				return createYamlTypeFilterTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CamelSpringPackage.AVRO_LIBRARY:
				return convertAvroLibraryToString(eDataType, instanceValue);
			case CamelSpringPackage.BEAN_SCOPE:
				return convertBeanScopeToString(eDataType, instanceValue);
			case CamelSpringPackage.BINDY_TYPE:
				return convertBindyTypeToString(eDataType, instanceValue);
			case CamelSpringPackage.CLAIM_CHECK_OPERATION:
				return convertClaimCheckOperationToString(eDataType, instanceValue);
			case CamelSpringPackage.COLLECTION_FORMAT:
				return convertCollectionFormatToString(eDataType, instanceValue);
			case CamelSpringPackage.EXCHANGE_PATTERN:
				return convertExchangePatternToString(eDataType, instanceValue);
			case CamelSpringPackage.JSON_LIBRARY:
				return convertJsonLibraryToString(eDataType, instanceValue);
			case CamelSpringPackage.LOGGING_LEVEL:
				return convertLoggingLevelToString(eDataType, instanceValue);
			case CamelSpringPackage.MANAGEMENT_STATISTICS_LEVEL:
				return convertManagementStatisticsLevelToString(eDataType, instanceValue);
			case CamelSpringPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			case CamelSpringPackage.ON_COMPLETION_MODE:
				return convertOnCompletionModeToString(eDataType, instanceValue);
			case CamelSpringPackage.OPTION:
				return convertOptionToString(eDataType, instanceValue);
			case CamelSpringPackage.PROTOBUF_LIBRARY:
				return convertProtobufLibraryToString(eDataType, instanceValue);
			case CamelSpringPackage.REST_BINDING_MODE:
				return convertRestBindingModeToString(eDataType, instanceValue);
			case CamelSpringPackage.REST_HOST_NAME_RESOLVER:
				return convertRestHostNameResolverToString(eDataType, instanceValue);
			case CamelSpringPackage.REST_PARAM_TYPE:
				return convertRestParamTypeToString(eDataType, instanceValue);
			case CamelSpringPackage.RESULT_QNAME:
				return convertResultQNameToString(eDataType, instanceValue);
			case CamelSpringPackage.SAGA_COMPLETION_MODE:
				return convertSagaCompletionModeToString(eDataType, instanceValue);
			case CamelSpringPackage.SAGA_PROPAGATION:
				return convertSagaPropagationToString(eDataType, instanceValue);
			case CamelSpringPackage.SCOPE:
				return convertScopeToString(eDataType, instanceValue);
			case CamelSpringPackage.SHUTDOWN_ROUTE:
				return convertShutdownRouteToString(eDataType, instanceValue);
			case CamelSpringPackage.SHUTDOWN_RUNNING_TASK:
				return convertShutdownRunningTaskToString(eDataType, instanceValue);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_TYPE:
				return convertSpringErrorHandlerTypeToString(eDataType, instanceValue);
			case CamelSpringPackage.STARTUP_SUMMARY_LEVEL:
				return convertStartupSummaryLevelToString(eDataType, instanceValue);
			case CamelSpringPackage.THROTTLING_MODE:
				return convertThrottlingModeToString(eDataType, instanceValue);
			case CamelSpringPackage.TOKENIZER_TYPE:
				return convertTokenizerTypeToString(eDataType, instanceValue);
			case CamelSpringPackage.TYPE_CONVERTER_EXISTS:
				return convertTypeConverterExistsToString(eDataType, instanceValue);
			case CamelSpringPackage.WAIT_FOR_TASK_TO_COMPLETE:
				return convertWaitForTaskToCompleteToString(eDataType, instanceValue);
			case CamelSpringPackage.YAML_LIBRARY:
				return convertYamlLibraryToString(eDataType, instanceValue);
			case CamelSpringPackage.YAML_TYPE_FILTER_TYPE:
				return convertYamlTypeFilterTypeToString(eDataType, instanceValue);
			case CamelSpringPackage.AVRO_LIBRARY_OBJECT:
				return convertAvroLibraryObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.BEAN_SCOPE_OBJECT:
				return convertBeanScopeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.BINDY_TYPE_OBJECT:
				return convertBindyTypeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.CLAIM_CHECK_OPERATION_OBJECT:
				return convertClaimCheckOperationObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.COLLECTION_FORMAT_OBJECT:
				return convertCollectionFormatObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.EXCHANGE_PATTERN_OBJECT:
				return convertExchangePatternObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.JSON_LIBRARY_OBJECT:
				return convertJsonLibraryObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.LOGGING_LEVEL_OBJECT:
				return convertLoggingLevelObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.MANAGEMENT_STATISTICS_LEVEL_OBJECT:
				return convertManagementStatisticsLevelObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.MODE_OBJECT:
				return convertModeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.ON_COMPLETION_MODE_OBJECT:
				return convertOnCompletionModeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.OPTION_OBJECT:
				return convertOptionObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.PROTOBUF_LIBRARY_OBJECT:
				return convertProtobufLibraryObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.REST_BINDING_MODE_OBJECT:
				return convertRestBindingModeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.REST_HOST_NAME_RESOLVER_OBJECT:
				return convertRestHostNameResolverObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.REST_PARAM_TYPE_OBJECT:
				return convertRestParamTypeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.RESULT_QNAME_OBJECT:
				return convertResultQNameObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.SAGA_COMPLETION_MODE_OBJECT:
				return convertSagaCompletionModeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.SAGA_PROPAGATION_OBJECT:
				return convertSagaPropagationObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.SCOPE_OBJECT:
				return convertScopeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.SHUTDOWN_ROUTE_OBJECT:
				return convertShutdownRouteObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.SHUTDOWN_RUNNING_TASK_OBJECT:
				return convertShutdownRunningTaskObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.SPRING_ERROR_HANDLER_TYPE_OBJECT:
				return convertSpringErrorHandlerTypeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.STARTUP_SUMMARY_LEVEL_OBJECT:
				return convertStartupSummaryLevelObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.THROTTLING_MODE_OBJECT:
				return convertThrottlingModeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.TOKENIZER_TYPE_OBJECT:
				return convertTokenizerTypeObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.TYPE_CONVERTER_EXISTS_OBJECT:
				return convertTypeConverterExistsObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.VALUE_DEFINITION:
				return convertValueDefinitionToString(eDataType, instanceValue);
			case CamelSpringPackage.WAIT_FOR_TASK_TO_COMPLETE_OBJECT:
				return convertWaitForTaskToCompleteObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.YAML_LIBRARY_OBJECT:
				return convertYamlLibraryObjectToString(eDataType, instanceValue);
			case CamelSpringPackage.YAML_TYPE_FILTER_TYPE_OBJECT:
				return convertYamlTypeFilterTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregateDefinition createAggregateDefinition() {
		AggregateDefinitionImpl aggregateDefinition = new AggregateDefinitionImpl();
		return aggregateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowableValuesType createAllowableValuesType() {
		AllowableValuesTypeImpl allowableValuesType = new AllowableValuesTypeImpl();
		return allowableValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowableValuesType1 createAllowableValuesType1() {
		AllowableValuesType1Impl allowableValuesType1 = new AllowableValuesType1Impl();
		return allowableValuesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApiKeyDefinition createApiKeyDefinition() {
		ApiKeyDefinitionImpl apiKeyDefinition = new ApiKeyDefinitionImpl();
		return apiKeyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationDefinition createApplicationDefinition() {
		ApplicationDefinitionImpl applicationDefinition = new ApplicationDefinitionImpl();
		return applicationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asn1DataFormat createAsn1DataFormat() {
		Asn1DataFormatImpl asn1DataFormat = new Asn1DataFormatImpl();
		return asn1DataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AvroDataFormat createAvroDataFormat() {
		AvroDataFormatImpl avroDataFormat = new AvroDataFormatImpl();
		return avroDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarcodeDataFormat createBarcodeDataFormat() {
		BarcodeDataFormatImpl barcodeDataFormat = new BarcodeDataFormatImpl();
		return barcodeDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64DataFormat createBase64DataFormat() {
		Base64DataFormatImpl base64DataFormat = new Base64DataFormatImpl();
		return base64DataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicAuthDefinition createBasicAuthDefinition() {
		BasicAuthDefinitionImpl basicAuthDefinition = new BasicAuthDefinitionImpl();
		return basicAuthDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BatchResequencerConfig createBatchResequencerConfig() {
		BatchResequencerConfigImpl batchResequencerConfig = new BatchResequencerConfigImpl();
		return batchResequencerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanConstructorDefinition createBeanConstructorDefinition() {
		BeanConstructorDefinitionImpl beanConstructorDefinition = new BeanConstructorDefinitionImpl();
		return beanConstructorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanConstructorsDefinition createBeanConstructorsDefinition() {
		BeanConstructorsDefinitionImpl beanConstructorsDefinition = new BeanConstructorsDefinitionImpl();
		return beanConstructorsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanDefinition createBeanDefinition() {
		BeanDefinitionImpl beanDefinition = new BeanDefinitionImpl();
		return beanDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanFactoryDefinition createBeanFactoryDefinition() {
		BeanFactoryDefinitionImpl beanFactoryDefinition = new BeanFactoryDefinitionImpl();
		return beanFactoryDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanioDataFormat createBeanioDataFormat() {
		BeanioDataFormatImpl beanioDataFormat = new BeanioDataFormatImpl();
		return beanioDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanPropertiesDefinition createBeanPropertiesDefinition() {
		BeanPropertiesDefinitionImpl beanPropertiesDefinition = new BeanPropertiesDefinitionImpl();
		return beanPropertiesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanPropertyDefinition createBeanPropertyDefinition() {
		BeanPropertyDefinitionImpl beanPropertyDefinition = new BeanPropertyDefinitionImpl();
		return beanPropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeansDefinition createBeansDefinition() {
		BeansDefinitionImpl beansDefinition = new BeansDefinitionImpl();
		return beansDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BearerTokenDefinition createBearerTokenDefinition() {
		BearerTokenDefinitionImpl bearerTokenDefinition = new BearerTokenDefinitionImpl();
		return bearerTokenDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindyDataFormat createBindyDataFormat() {
		BindyDataFormatImpl bindyDataFormat = new BindyDataFormatImpl();
		return bindyDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlacklistServiceCallServiceFilterConfiguration createBlacklistServiceCallServiceFilterConfiguration() {
		BlacklistServiceCallServiceFilterConfigurationImpl blacklistServiceCallServiceFilterConfiguration = new BlacklistServiceCallServiceFilterConfigurationImpl();
		return blacklistServiceCallServiceFilterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachingServiceCallServiceDiscoveryConfiguration createCachingServiceCallServiceDiscoveryConfiguration() {
		CachingServiceCallServiceDiscoveryConfigurationImpl cachingServiceCallServiceDiscoveryConfiguration = new CachingServiceCallServiceDiscoveryConfigurationImpl();
		return cachingServiceCallServiceDiscoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelBeanPostProcessor createCamelBeanPostProcessor() {
		CamelBeanPostProcessorImpl camelBeanPostProcessor = new CamelBeanPostProcessorImpl();
		return camelBeanPostProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelConsumerTemplateFactoryBean createCamelConsumerTemplateFactoryBean() {
		CamelConsumerTemplateFactoryBeanImpl camelConsumerTemplateFactoryBean = new CamelConsumerTemplateFactoryBeanImpl();
		return camelConsumerTemplateFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelContextFactoryBean createCamelContextFactoryBean() {
		CamelContextFactoryBeanImpl camelContextFactoryBean = new CamelContextFactoryBeanImpl();
		return camelContextFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelEndpointFactoryBean createCamelEndpointFactoryBean() {
		CamelEndpointFactoryBeanImpl camelEndpointFactoryBean = new CamelEndpointFactoryBeanImpl();
		return camelEndpointFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelFluentProducerTemplateFactoryBean createCamelFluentProducerTemplateFactoryBean() {
		CamelFluentProducerTemplateFactoryBeanImpl camelFluentProducerTemplateFactoryBean = new CamelFluentProducerTemplateFactoryBeanImpl();
		return camelFluentProducerTemplateFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelJMXAgentDefinition createCamelJMXAgentDefinition() {
		CamelJMXAgentDefinitionImpl camelJMXAgentDefinition = new CamelJMXAgentDefinitionImpl();
		return camelJMXAgentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelProducerTemplateFactoryBean createCamelProducerTemplateFactoryBean() {
		CamelProducerTemplateFactoryBeanImpl camelProducerTemplateFactoryBean = new CamelProducerTemplateFactoryBeanImpl();
		return camelProducerTemplateFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelPropertyPlaceholderDefinition createCamelPropertyPlaceholderDefinition() {
		CamelPropertyPlaceholderDefinitionImpl camelPropertyPlaceholderDefinition = new CamelPropertyPlaceholderDefinitionImpl();
		return camelPropertyPlaceholderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelPropertyPlaceholderFunctionDefinition createCamelPropertyPlaceholderFunctionDefinition() {
		CamelPropertyPlaceholderFunctionDefinitionImpl camelPropertyPlaceholderFunctionDefinition = new CamelPropertyPlaceholderFunctionDefinitionImpl();
		return camelPropertyPlaceholderFunctionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelPropertyPlaceholderLocationDefinition createCamelPropertyPlaceholderLocationDefinition() {
		CamelPropertyPlaceholderLocationDefinitionImpl camelPropertyPlaceholderLocationDefinition = new CamelPropertyPlaceholderLocationDefinitionImpl();
		return camelPropertyPlaceholderLocationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRedeliveryPolicyFactoryBean createCamelRedeliveryPolicyFactoryBean() {
		CamelRedeliveryPolicyFactoryBeanImpl camelRedeliveryPolicyFactoryBean = new CamelRedeliveryPolicyFactoryBeanImpl();
		return camelRedeliveryPolicyFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRestContextFactoryBean createCamelRestContextFactoryBean() {
		CamelRestContextFactoryBeanImpl camelRestContextFactoryBean = new CamelRestContextFactoryBeanImpl();
		return camelRestContextFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRouteConfigurationContextFactoryBean createCamelRouteConfigurationContextFactoryBean() {
		CamelRouteConfigurationContextFactoryBeanImpl camelRouteConfigurationContextFactoryBean = new CamelRouteConfigurationContextFactoryBeanImpl();
		return camelRouteConfigurationContextFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRouteContextFactoryBean createCamelRouteContextFactoryBean() {
		CamelRouteContextFactoryBeanImpl camelRouteContextFactoryBean = new CamelRouteContextFactoryBeanImpl();
		return camelRouteContextFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRouteControllerDefinition createCamelRouteControllerDefinition() {
		CamelRouteControllerDefinitionImpl camelRouteControllerDefinition = new CamelRouteControllerDefinitionImpl();
		return camelRouteControllerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRouteTemplateContextFactoryBean createCamelRouteTemplateContextFactoryBean() {
		CamelRouteTemplateContextFactoryBeanImpl camelRouteTemplateContextFactoryBean = new CamelRouteTemplateContextFactoryBeanImpl();
		return camelRouteTemplateContextFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelStreamCachingStrategyDefinition createCamelStreamCachingStrategyDefinition() {
		CamelStreamCachingStrategyDefinitionImpl camelStreamCachingStrategyDefinition = new CamelStreamCachingStrategyDefinitionImpl();
		return camelStreamCachingStrategyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelThreadPoolFactoryBean createCamelThreadPoolFactoryBean() {
		CamelThreadPoolFactoryBeanImpl camelThreadPoolFactoryBean = new CamelThreadPoolFactoryBeanImpl();
		return camelThreadPoolFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatchDefinition createCatchDefinition() {
		CatchDefinitionImpl catchDefinition = new CatchDefinitionImpl();
		return catchDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CborDataFormat createCborDataFormat() {
		CborDataFormatImpl cborDataFormat = new CborDataFormatImpl();
		return cborDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoiceDefinition createChoiceDefinition() {
		ChoiceDefinitionImpl choiceDefinition = new ChoiceDefinitionImpl();
		return choiceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherSuitesParameters createCipherSuitesParameters() {
		CipherSuitesParametersImpl cipherSuitesParameters = new CipherSuitesParametersImpl();
		return cipherSuitesParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitBreakerDefinition createCircuitBreakerDefinition() {
		CircuitBreakerDefinitionImpl circuitBreakerDefinition = new CircuitBreakerDefinitionImpl();
		return circuitBreakerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimCheckDefinition createClaimCheckDefinition() {
		ClaimCheckDefinitionImpl claimCheckDefinition = new ClaimCheckDefinitionImpl();
		return claimCheckDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombinedServiceCallServiceDiscoveryConfiguration createCombinedServiceCallServiceDiscoveryConfiguration() {
		CombinedServiceCallServiceDiscoveryConfigurationImpl combinedServiceCallServiceDiscoveryConfiguration = new CombinedServiceCallServiceDiscoveryConfigurationImpl();
		return combinedServiceCallServiceDiscoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombinedServiceCallServiceFilterConfiguration createCombinedServiceCallServiceFilterConfiguration() {
		CombinedServiceCallServiceFilterConfigurationImpl combinedServiceCallServiceFilterConfiguration = new CombinedServiceCallServiceFilterConfigurationImpl();
		return combinedServiceCallServiceFilterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentScanDefinition createComponentScanDefinition() {
		ComponentScanDefinitionImpl componentScanDefinition = new ComponentScanDefinitionImpl();
		return componentScanDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantExpression createConstantExpression() {
		ConstantExpressionImpl constantExpression = new ConstantExpressionImpl();
		return constantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constants createConstants() {
		ConstantsImpl constants = new ConstantsImpl();
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsulServiceCallServiceDiscoveryConfiguration createConsulServiceCallServiceDiscoveryConfiguration() {
		ConsulServiceCallServiceDiscoveryConfigurationImpl consulServiceCallServiceDiscoveryConfiguration = new ConsulServiceCallServiceDiscoveryConfigurationImpl();
		return consulServiceCallServiceDiscoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextScanDefinition createContextScanDefinition() {
		ContextScanDefinitionImpl contextScanDefinition = new ContextScanDefinitionImpl();
		return contextScanDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConvertBodyDefinition createConvertBodyDefinition() {
		ConvertBodyDefinitionImpl convertBodyDefinition = new ConvertBodyDefinitionImpl();
		return convertBodyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConvertHeaderDefinition createConvertHeaderDefinition() {
		ConvertHeaderDefinitionImpl convertHeaderDefinition = new ConvertHeaderDefinitionImpl();
		return convertHeaderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConvertVariableDefinition createConvertVariableDefinition() {
		ConvertVariableDefinitionImpl convertVariableDefinition = new ConvertVariableDefinitionImpl();
		return convertVariableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CryptoDataFormat createCryptoDataFormat() {
		CryptoDataFormatImpl cryptoDataFormat = new CryptoDataFormatImpl();
		return cryptoDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSimpleExpression createCSimpleExpression() {
		CSimpleExpressionImpl cSimpleExpression = new CSimpleExpressionImpl();
		return cSimpleExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsvDataFormat createCsvDataFormat() {
		CsvDataFormatImpl csvDataFormat = new CsvDataFormatImpl();
		return csvDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomDataFormat createCustomDataFormat() {
		CustomDataFormatImpl customDataFormat = new CustomDataFormatImpl();
		return customDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomLoadBalancerDefinition createCustomLoadBalancerDefinition() {
		CustomLoadBalancerDefinitionImpl customLoadBalancerDefinition = new CustomLoadBalancerDefinitionImpl();
		return customLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomServiceCallServiceFilterConfiguration createCustomServiceCallServiceFilterConfiguration() {
		CustomServiceCallServiceFilterConfigurationImpl customServiceCallServiceFilterConfiguration = new CustomServiceCallServiceFilterConfigurationImpl();
		return customServiceCallServiceFilterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomTransformerDefinition createCustomTransformerDefinition() {
		CustomTransformerDefinitionImpl customTransformerDefinition = new CustomTransformerDefinitionImpl();
		return customTransformerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomValidatorDefinition createCustomValidatorDefinition() {
		CustomValidatorDefinitionImpl customValidatorDefinition = new CustomValidatorDefinitionImpl();
		return customValidatorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFormat createDataFormat() {
		DataFormatImpl dataFormat = new DataFormatImpl();
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFormatsDefinition createDataFormatsDefinition() {
		DataFormatsDefinitionImpl dataFormatsDefinition = new DataFormatsDefinitionImpl();
		return dataFormatsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFormatsType createDataFormatsType() {
		DataFormatsTypeImpl dataFormatsType = new DataFormatsTypeImpl();
		return dataFormatsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFormatTransformerDefinition createDataFormatTransformerDefinition() {
		DataFormatTransformerDefinitionImpl dataFormatTransformerDefinition = new DataFormatTransformerDefinitionImpl();
		return dataFormatTransformerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasonnetExpression createDatasonnetExpression() {
		DatasonnetExpressionImpl datasonnetExpression = new DatasonnetExpressionImpl();
		return datasonnetExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeadLetterChannelDefinition createDeadLetterChannelDefinition() {
		DeadLetterChannelDefinitionImpl deadLetterChannelDefinition = new DeadLetterChannelDefinitionImpl();
		return deadLetterChannelDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultErrorHandlerDefinition createDefaultErrorHandlerDefinition() {
		DefaultErrorHandlerDefinitionImpl defaultErrorHandlerDefinition = new DefaultErrorHandlerDefinitionImpl();
		return defaultErrorHandlerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultServiceCallServiceLoadBalancerConfiguration createDefaultServiceCallServiceLoadBalancerConfiguration() {
		DefaultServiceCallServiceLoadBalancerConfigurationImpl defaultServiceCallServiceLoadBalancerConfiguration = new DefaultServiceCallServiceLoadBalancerConfigurationImpl();
		return defaultServiceCallServiceLoadBalancerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DelayDefinition createDelayDefinition() {
		DelayDefinitionImpl delayDefinition = new DelayDefinitionImpl();
		return delayDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteDefinition createDeleteDefinition() {
		DeleteDefinitionImpl deleteDefinition = new DeleteDefinitionImpl();
		return deleteDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DfdlDataFormat createDfdlDataFormat() {
		DfdlDataFormatImpl dfdlDataFormat = new DfdlDataFormatImpl();
		return dfdlDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DnsServiceCallServiceDiscoveryConfiguration createDnsServiceCallServiceDiscoveryConfiguration() {
		DnsServiceCallServiceDiscoveryConfigurationImpl dnsServiceCallServiceDiscoveryConfiguration = new DnsServiceCallServiceDiscoveryConfigurationImpl();
		return dnsServiceCallServiceDiscoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicRouterDefinition createDynamicRouterDefinition() {
		DynamicRouterDefinitionImpl dynamicRouterDefinition = new DynamicRouterDefinitionImpl();
		return dynamicRouterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointTransformerDefinition createEndpointTransformerDefinition() {
		EndpointTransformerDefinitionImpl endpointTransformerDefinition = new EndpointTransformerDefinitionImpl();
		return endpointTransformerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointValidatorDefinition createEndpointValidatorDefinition() {
		EndpointValidatorDefinitionImpl endpointValidatorDefinition = new EndpointValidatorDefinitionImpl();
		return endpointValidatorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnrichDefinition createEnrichDefinition() {
		EnrichDefinitionImpl enrichDefinition = new EnrichDefinitionImpl();
		return enrichDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorHandlerDefinition createErrorHandlerDefinition() {
		ErrorHandlerDefinitionImpl errorHandlerDefinition = new ErrorHandlerDefinitionImpl();
		return errorHandlerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExchangePropertyExpression createExchangePropertyExpression() {
		ExchangePropertyExpressionImpl exchangePropertyExpression = new ExchangePropertyExpressionImpl();
		return exchangePropertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionSubElementDefinition createExpressionSubElementDefinition() {
		ExpressionSubElementDefinitionImpl expressionSubElementDefinition = new ExpressionSubElementDefinitionImpl();
		return expressionSubElementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FailoverLoadBalancerDefinition createFailoverLoadBalancerDefinition() {
		FailoverLoadBalancerDefinitionImpl failoverLoadBalancerDefinition = new FailoverLoadBalancerDefinitionImpl();
		return failoverLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaultToleranceConfigurationCommon createFaultToleranceConfigurationCommon() {
		FaultToleranceConfigurationCommonImpl faultToleranceConfigurationCommon = new FaultToleranceConfigurationCommonImpl();
		return faultToleranceConfigurationCommon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaultToleranceConfigurationDefinition createFaultToleranceConfigurationDefinition() {
		FaultToleranceConfigurationDefinitionImpl faultToleranceConfigurationDefinition = new FaultToleranceConfigurationDefinitionImpl();
		return faultToleranceConfigurationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FhirJsonDataFormat createFhirJsonDataFormat() {
		FhirJsonDataFormatImpl fhirJsonDataFormat = new FhirJsonDataFormatImpl();
		return fhirJsonDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FhirXmlDataFormat createFhirXmlDataFormat() {
		FhirXmlDataFormatImpl fhirXmlDataFormat = new FhirXmlDataFormatImpl();
		return fhirXmlDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterDefinition createFilterDefinition() {
		FilterDefinitionImpl filterDefinition = new FilterDefinitionImpl();
		return filterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterParameters createFilterParameters() {
		FilterParametersImpl filterParameters = new FilterParametersImpl();
		return filterParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinallyDefinition createFinallyDefinition() {
		FinallyDefinitionImpl finallyDefinition = new FinallyDefinitionImpl();
		return finallyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlatpackDataFormat createFlatpackDataFormat() {
		FlatpackDataFormatImpl flatpackDataFormat = new FlatpackDataFormatImpl();
		return flatpackDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForyDataFormat createForyDataFormat() {
		ForyDataFormatImpl foryDataFormat = new ForyDataFormatImpl();
		return foryDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromDefinition createFromDefinition() {
		FromDefinitionImpl fromDefinition = new FromDefinitionImpl();
		return fromDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetDefinition createGetDefinition() {
		GetDefinitionImpl getDefinition = new GetDefinitionImpl();
		return getDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalOptionDefinition createGlobalOptionDefinition() {
		GlobalOptionDefinitionImpl globalOptionDefinition = new GlobalOptionDefinitionImpl();
		return globalOptionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalOptionsDefinition createGlobalOptionsDefinition() {
		GlobalOptionsDefinitionImpl globalOptionsDefinition = new GlobalOptionsDefinitionImpl();
		return globalOptionsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrokDataFormat createGrokDataFormat() {
		GrokDataFormatImpl grokDataFormat = new GrokDataFormatImpl();
		return grokDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroovyExpression createGroovyExpression() {
		GroovyExpressionImpl groovyExpression = new GroovyExpressionImpl();
		return groovyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GzipDeflaterDataFormat createGzipDeflaterDataFormat() {
		GzipDeflaterDataFormatImpl gzipDeflaterDataFormat = new GzipDeflaterDataFormatImpl();
		return gzipDeflaterDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadDefinition createHeadDefinition() {
		HeadDefinitionImpl headDefinition = new HeadDefinitionImpl();
		return headDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeaderExpression createHeaderExpression() {
		HeaderExpressionImpl headerExpression = new HeaderExpressionImpl();
		return headerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthyServiceCallServiceFilterConfiguration createHealthyServiceCallServiceFilterConfiguration() {
		HealthyServiceCallServiceFilterConfigurationImpl healthyServiceCallServiceFilterConfiguration = new HealthyServiceCallServiceFilterConfigurationImpl();
		return healthyServiceCallServiceFilterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl7DataFormat createHl7DataFormat() {
		Hl7DataFormatImpl hl7DataFormat = new Hl7DataFormatImpl();
		return hl7DataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl7TerserExpression createHl7TerserExpression() {
		Hl7TerserExpressionImpl hl7TerserExpression = new Hl7TerserExpressionImpl();
		return hl7TerserExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IcalDataFormat createIcalDataFormat() {
		IcalDataFormatImpl icalDataFormat = new IcalDataFormatImpl();
		return icalDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdempotentConsumerDefinition createIdempotentConsumerDefinition() {
		IdempotentConsumerDefinitionImpl idempotentConsumerDefinition = new IdempotentConsumerDefinitionImpl();
		return idempotentConsumerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputTypeDefinition createInputTypeDefinition() {
		InputTypeDefinitionImpl inputTypeDefinition = new InputTypeDefinitionImpl();
		return inputTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterceptDefinition createInterceptDefinition() {
		InterceptDefinitionImpl interceptDefinition = new InterceptDefinitionImpl();
		return interceptDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterceptFromDefinition createInterceptFromDefinition() {
		InterceptFromDefinitionImpl interceptFromDefinition = new InterceptFromDefinitionImpl();
		return interceptFromDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterceptSendToEndpointDefinition createInterceptSendToEndpointDefinition() {
		InterceptSendToEndpointDefinitionImpl interceptSendToEndpointDefinition = new InterceptSendToEndpointDefinitionImpl();
		return interceptSendToEndpointDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iso8583DataFormat createIso8583DataFormat() {
		Iso8583DataFormatImpl iso8583DataFormat = new Iso8583DataFormatImpl();
		return iso8583DataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JacksonXMLDataFormat createJacksonXMLDataFormat() {
		JacksonXMLDataFormatImpl jacksonXMLDataFormat = new JacksonXMLDataFormatImpl();
		return jacksonXMLDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaExpression createJavaExpression() {
		JavaExpressionImpl javaExpression = new JavaExpressionImpl();
		return javaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaScriptExpression createJavaScriptExpression() {
		JavaScriptExpressionImpl javaScriptExpression = new JavaScriptExpressionImpl();
		return javaScriptExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JaxbDataFormat createJaxbDataFormat() {
		JaxbDataFormatImpl jaxbDataFormat = new JaxbDataFormatImpl();
		return jaxbDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JoorExpression createJoorExpression() {
		JoorExpressionImpl joorExpression = new JoorExpressionImpl();
		return joorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JqExpression createJqExpression() {
		JqExpressionImpl jqExpression = new JqExpressionImpl();
		return jqExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonApiDataFormat createJsonApiDataFormat() {
		JsonApiDataFormatImpl jsonApiDataFormat = new JsonApiDataFormatImpl();
		return jsonApiDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonDataFormat createJsonDataFormat() {
		JsonDataFormatImpl jsonDataFormat = new JsonDataFormatImpl();
		return jsonDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonPathExpression createJsonPathExpression() {
		JsonPathExpressionImpl jsonPathExpression = new JsonPathExpressionImpl();
		return jsonPathExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JtaTransactionErrorHandlerDefinition createJtaTransactionErrorHandlerDefinition() {
		JtaTransactionErrorHandlerDefinitionImpl jtaTransactionErrorHandlerDefinition = new JtaTransactionErrorHandlerDefinitionImpl();
		return jtaTransactionErrorHandlerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KameletDefinition createKameletDefinition() {
		KameletDefinitionImpl kameletDefinition = new KameletDefinitionImpl();
		return kameletDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyManagersParametersFactoryBean createKeyManagersParametersFactoryBean() {
		KeyManagersParametersFactoryBeanImpl keyManagersParametersFactoryBean = new KeyManagersParametersFactoryBeanImpl();
		return keyManagersParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyStoreParametersFactoryBean createKeyStoreParametersFactoryBean() {
		KeyStoreParametersFactoryBeanImpl keyStoreParametersFactoryBean = new KeyStoreParametersFactoryBeanImpl();
		return keyStoreParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesServiceCallServiceDiscoveryConfiguration createKubernetesServiceCallServiceDiscoveryConfiguration() {
		KubernetesServiceCallServiceDiscoveryConfigurationImpl kubernetesServiceCallServiceDiscoveryConfiguration = new KubernetesServiceCallServiceDiscoveryConfigurationImpl();
		return kubernetesServiceCallServiceDiscoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JCharacterTokenizerDefinition createLangChain4JCharacterTokenizerDefinition() {
		LangChain4JCharacterTokenizerDefinitionImpl langChain4JCharacterTokenizerDefinition = new LangChain4JCharacterTokenizerDefinitionImpl();
		return langChain4JCharacterTokenizerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JLineTokenizerDefinition createLangChain4JLineTokenizerDefinition() {
		LangChain4JLineTokenizerDefinitionImpl langChain4JLineTokenizerDefinition = new LangChain4JLineTokenizerDefinitionImpl();
		return langChain4JLineTokenizerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JParagraphTokenizerDefinition createLangChain4JParagraphTokenizerDefinition() {
		LangChain4JParagraphTokenizerDefinitionImpl langChain4JParagraphTokenizerDefinition = new LangChain4JParagraphTokenizerDefinitionImpl();
		return langChain4JParagraphTokenizerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JSentenceTokenizerDefinition createLangChain4JSentenceTokenizerDefinition() {
		LangChain4JSentenceTokenizerDefinitionImpl langChain4JSentenceTokenizerDefinition = new LangChain4JSentenceTokenizerDefinitionImpl();
		return langChain4JSentenceTokenizerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4jTokenizerImplementation createLangChain4jTokenizerImplementation() {
		LangChain4jTokenizerImplementationImpl langChain4jTokenizerImplementation = new LangChain4jTokenizerImplementationImpl();
		return langChain4jTokenizerImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JWordTokenizerDefinition createLangChain4JWordTokenizerDefinition() {
		LangChain4JWordTokenizerDefinitionImpl langChain4JWordTokenizerDefinition = new LangChain4JWordTokenizerDefinitionImpl();
		return langChain4JWordTokenizerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageExpression createLanguageExpression() {
		LanguageExpressionImpl languageExpression = new LanguageExpressionImpl();
		return languageExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalanceDefinition createLoadBalanceDefinition() {
		LoadBalanceDefinitionImpl loadBalanceDefinition = new LoadBalanceDefinitionImpl();
		return loadBalanceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadTransformerDefinition createLoadTransformerDefinition() {
		LoadTransformerDefinitionImpl loadTransformerDefinition = new LoadTransformerDefinitionImpl();
		return loadTransformerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogDefinition createLogDefinition() {
		LogDefinitionImpl logDefinition = new LogDefinitionImpl();
		return logDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoopDefinition createLoopDefinition() {
		LoopDefinitionImpl loopDefinition = new LoopDefinitionImpl();
		return loopDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LzfDataFormat createLzfDataFormat() {
		LzfDataFormatImpl lzfDataFormat = new LzfDataFormatImpl();
		return lzfDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarshalDefinition createMarshalDefinition() {
		MarshalDefinitionImpl marshalDefinition = new MarshalDefinitionImpl();
		return marshalDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodCallExpression createMethodCallExpression() {
		MethodCallExpressionImpl methodCallExpression = new MethodCallExpressionImpl();
		return methodCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeMultipartDataFormat createMimeMultipartDataFormat() {
		MimeMultipartDataFormatImpl mimeMultipartDataFormat = new MimeMultipartDataFormatImpl();
		return mimeMultipartDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelLifecycleStrategySupport createModelLifecycleStrategySupport() {
		ModelLifecycleStrategySupportImpl modelLifecycleStrategySupport = new ModelLifecycleStrategySupportImpl();
		return modelLifecycleStrategySupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MulticastDefinition createMulticastDefinition() {
		MulticastDefinitionImpl multicastDefinition = new MulticastDefinitionImpl();
		return multicastDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MutualTLSDefinition createMutualTLSDefinition() {
		MutualTLSDefinitionImpl mutualTLSDefinition = new MutualTLSDefinitionImpl();
		return mutualTLSDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MvelExpression createMvelExpression() {
		MvelExpressionImpl mvelExpression = new MvelExpressionImpl();
		return mvelExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoErrorHandlerDefinition createNoErrorHandlerDefinition() {
		NoErrorHandlerDefinitionImpl noErrorHandlerDefinition = new NoErrorHandlerDefinitionImpl();
		return noErrorHandlerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OAuth2Definition createOAuth2Definition() {
		OAuth2DefinitionImpl oAuth2Definition = new OAuth2DefinitionImpl();
		return oAuth2Definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OgnlExpression createOgnlExpression() {
		OgnlExpressionImpl ognlExpression = new OgnlExpressionImpl();
		return ognlExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnCompletionDefinition createOnCompletionDefinition() {
		OnCompletionDefinitionImpl onCompletionDefinition = new OnCompletionDefinitionImpl();
		return onCompletionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnExceptionDefinition createOnExceptionDefinition() {
		OnExceptionDefinitionImpl onExceptionDefinition = new OnExceptionDefinitionImpl();
		return onExceptionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnFallbackDefinition createOnFallbackDefinition() {
		OnFallbackDefinitionImpl onFallbackDefinition = new OnFallbackDefinitionImpl();
		return onFallbackDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnWhenDefinition createOnWhenDefinition() {
		OnWhenDefinitionImpl onWhenDefinition = new OnWhenDefinitionImpl();
		return onWhenDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenApiDefinition createOpenApiDefinition() {
		OpenApiDefinitionImpl openApiDefinition = new OpenApiDefinitionImpl();
		return openApiDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenIdConnectDefinition createOpenIdConnectDefinition() {
		OpenIdConnectDefinitionImpl openIdConnectDefinition = new OpenIdConnectDefinitionImpl();
		return openIdConnectDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptimisticLockRetryPolicyDefinition createOptimisticLockRetryPolicyDefinition() {
		OptimisticLockRetryPolicyDefinitionImpl optimisticLockRetryPolicyDefinition = new OptimisticLockRetryPolicyDefinitionImpl();
		return optimisticLockRetryPolicyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherwiseDefinition createOtherwiseDefinition() {
		OtherwiseDefinitionImpl otherwiseDefinition = new OtherwiseDefinitionImpl();
		return otherwiseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputTypeDefinition createOutputTypeDefinition() {
		OutputTypeDefinitionImpl outputTypeDefinition = new OutputTypeDefinitionImpl();
		return outputTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageScanDefinition createPackageScanDefinition() {
		PackageScanDefinitionImpl packageScanDefinition = new PackageScanDefinitionImpl();
		return packageScanDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParamDefinition createParamDefinition() {
		ParamDefinitionImpl paramDefinition = new ParamDefinitionImpl();
		return paramDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParquetAvroDataFormat createParquetAvroDataFormat() {
		ParquetAvroDataFormatImpl parquetAvroDataFormat = new ParquetAvroDataFormatImpl();
		return parquetAvroDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassThroughServiceCallServiceFilterConfiguration createPassThroughServiceCallServiceFilterConfiguration() {
		PassThroughServiceCallServiceFilterConfigurationImpl passThroughServiceCallServiceFilterConfiguration = new PassThroughServiceCallServiceFilterConfigurationImpl();
		return passThroughServiceCallServiceFilterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatchDefinition createPatchDefinition() {
		PatchDefinitionImpl patchDefinition = new PatchDefinitionImpl();
		return patchDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternBasedPackageScanFilter createPatternBasedPackageScanFilter() {
		PatternBasedPackageScanFilterImpl patternBasedPackageScanFilter = new PatternBasedPackageScanFilterImpl();
		return patternBasedPackageScanFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PausableDefinition createPausableDefinition() {
		PausableDefinitionImpl pausableDefinition = new PausableDefinitionImpl();
		return pausableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PgpDataFormat createPgpDataFormat() {
		PgpDataFormatImpl pgpDataFormat = new PgpDataFormatImpl();
		return pgpDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelineDefinition createPipelineDefinition() {
		PipelineDefinitionImpl pipelineDefinition = new PipelineDefinitionImpl();
		return pipelineDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyDefinition createPolicyDefinition() {
		PolicyDefinitionImpl policyDefinition = new PolicyDefinitionImpl();
		return policyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PollDefinition createPollDefinition() {
		PollDefinitionImpl pollDefinition = new PollDefinitionImpl();
		return pollDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PollEnrichDefinition createPollEnrichDefinition() {
		PollEnrichDefinitionImpl pollEnrichDefinition = new PollEnrichDefinitionImpl();
		return pollEnrichDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostDefinition createPostDefinition() {
		PostDefinitionImpl postDefinition = new PostDefinitionImpl();
		return postDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateValidatorDefinition createPredicateValidatorDefinition() {
		PredicateValidatorDefinitionImpl predicateValidatorDefinition = new PredicateValidatorDefinitionImpl();
		return predicateValidatorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessDefinition createProcessDefinition() {
		ProcessDefinitionImpl processDefinition = new ProcessDefinitionImpl();
		return processDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinition createPropertyDefinition() {
		PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinitions createPropertyDefinitions() {
		PropertyDefinitionsImpl propertyDefinitions = new PropertyDefinitionsImpl();
		return propertyDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyExpressionDefinition createPropertyExpressionDefinition() {
		PropertyExpressionDefinitionImpl propertyExpressionDefinition = new PropertyExpressionDefinitionImpl();
		return propertyExpressionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtobufDataFormat createProtobufDataFormat() {
		ProtobufDataFormatImpl protobufDataFormat = new ProtobufDataFormatImpl();
		return protobufDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PutDefinition createPutDefinition() {
		PutDefinitionImpl putDefinition = new PutDefinitionImpl();
		return putDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PythonExpression createPythonExpression() {
		PythonExpressionImpl pythonExpression = new PythonExpressionImpl();
		return pythonExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RandomLoadBalancerDefinition createRandomLoadBalancerDefinition() {
		RandomLoadBalancerDefinitionImpl randomLoadBalancerDefinition = new RandomLoadBalancerDefinitionImpl();
		return randomLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecipientListDefinition createRecipientListDefinition() {
		RecipientListDefinitionImpl recipientListDefinition = new RecipientListDefinitionImpl();
		return recipientListDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedeliveryPolicyDefinition createRedeliveryPolicyDefinition() {
		RedeliveryPolicyDefinitionImpl redeliveryPolicyDefinition = new RedeliveryPolicyDefinitionImpl();
		return redeliveryPolicyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefErrorHandlerDefinition createRefErrorHandlerDefinition() {
		RefErrorHandlerDefinitionImpl refErrorHandlerDefinition = new RefErrorHandlerDefinitionImpl();
		return refErrorHandlerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefExpression createRefExpression() {
		RefExpressionImpl refExpression = new RefExpressionImpl();
		return refExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveHeaderDefinition createRemoveHeaderDefinition() {
		RemoveHeaderDefinitionImpl removeHeaderDefinition = new RemoveHeaderDefinitionImpl();
		return removeHeaderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveHeadersDefinition createRemoveHeadersDefinition() {
		RemoveHeadersDefinitionImpl removeHeadersDefinition = new RemoveHeadersDefinitionImpl();
		return removeHeadersDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemovePropertiesDefinition createRemovePropertiesDefinition() {
		RemovePropertiesDefinitionImpl removePropertiesDefinition = new RemovePropertiesDefinitionImpl();
		return removePropertiesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemovePropertyDefinition createRemovePropertyDefinition() {
		RemovePropertyDefinitionImpl removePropertyDefinition = new RemovePropertyDefinitionImpl();
		return removePropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveVariableDefinition createRemoveVariableDefinition() {
		RemoveVariableDefinitionImpl removeVariableDefinition = new RemoveVariableDefinitionImpl();
		return removeVariableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResequenceDefinition createResequenceDefinition() {
		ResequenceDefinitionImpl resequenceDefinition = new ResequenceDefinitionImpl();
		return resequenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resilience4JConfigurationCommon createResilience4JConfigurationCommon() {
		Resilience4JConfigurationCommonImpl resilience4JConfigurationCommon = new Resilience4JConfigurationCommonImpl();
		return resilience4JConfigurationCommon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resilience4JConfigurationDefinition createResilience4JConfigurationDefinition() {
		Resilience4JConfigurationDefinitionImpl resilience4JConfigurationDefinition = new Resilience4JConfigurationDefinitionImpl();
		return resilience4JConfigurationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseHeaderDefinition createResponseHeaderDefinition() {
		ResponseHeaderDefinitionImpl responseHeaderDefinition = new ResponseHeaderDefinitionImpl();
		return responseHeaderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseMessageDefinition createResponseMessageDefinition() {
		ResponseMessageDefinitionImpl responseMessageDefinition = new ResponseMessageDefinitionImpl();
		return responseMessageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestBindingDefinition createRestBindingDefinition() {
		RestBindingDefinitionImpl restBindingDefinition = new RestBindingDefinitionImpl();
		return restBindingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestConfigurationDefinition createRestConfigurationDefinition() {
		RestConfigurationDefinitionImpl restConfigurationDefinition = new RestConfigurationDefinitionImpl();
		return restConfigurationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestContextRefDefinition createRestContextRefDefinition() {
		RestContextRefDefinitionImpl restContextRefDefinition = new RestContextRefDefinitionImpl();
		return restContextRefDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestDefinition createRestDefinition() {
		RestDefinitionImpl restDefinition = new RestDefinitionImpl();
		return restDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestPropertyDefinition createRestPropertyDefinition() {
		RestPropertyDefinitionImpl restPropertyDefinition = new RestPropertyDefinitionImpl();
		return restPropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestsDefinition createRestsDefinition() {
		RestsDefinitionImpl restsDefinition = new RestsDefinitionImpl();
		return restsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestSecuritiesDefinition createRestSecuritiesDefinition() {
		RestSecuritiesDefinitionImpl restSecuritiesDefinition = new RestSecuritiesDefinitionImpl();
		return restSecuritiesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResumableDefinition createResumableDefinition() {
		ResumableDefinitionImpl resumableDefinition = new ResumableDefinitionImpl();
		return resumableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RollbackDefinition createRollbackDefinition() {
		RollbackDefinitionImpl rollbackDefinition = new RollbackDefinitionImpl();
		return rollbackDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoundRobinLoadBalancerDefinition createRoundRobinLoadBalancerDefinition() {
		RoundRobinLoadBalancerDefinitionImpl roundRobinLoadBalancerDefinition = new RoundRobinLoadBalancerDefinitionImpl();
		return roundRobinLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteBuilderDefinition createRouteBuilderDefinition() {
		RouteBuilderDefinitionImpl routeBuilderDefinition = new RouteBuilderDefinitionImpl();
		return routeBuilderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteConfigurationContextRefDefinition createRouteConfigurationContextRefDefinition() {
		RouteConfigurationContextRefDefinitionImpl routeConfigurationContextRefDefinition = new RouteConfigurationContextRefDefinitionImpl();
		return routeConfigurationContextRefDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteConfigurationDefinition createRouteConfigurationDefinition() {
		RouteConfigurationDefinitionImpl routeConfigurationDefinition = new RouteConfigurationDefinitionImpl();
		return routeConfigurationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteConfigurationsDefinition createRouteConfigurationsDefinition() {
		RouteConfigurationsDefinitionImpl routeConfigurationsDefinition = new RouteConfigurationsDefinitionImpl();
		return routeConfigurationsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteContextRefDefinition createRouteContextRefDefinition() {
		RouteContextRefDefinitionImpl routeContextRefDefinition = new RouteContextRefDefinitionImpl();
		return routeContextRefDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteDefinition createRouteDefinition() {
		RouteDefinitionImpl routeDefinition = new RouteDefinitionImpl();
		return routeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoutesDefinition createRoutesDefinition() {
		RoutesDefinitionImpl routesDefinition = new RoutesDefinitionImpl();
		return routesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteTemplateContextRefDefinition createRouteTemplateContextRefDefinition() {
		RouteTemplateContextRefDefinitionImpl routeTemplateContextRefDefinition = new RouteTemplateContextRefDefinitionImpl();
		return routeTemplateContextRefDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteTemplateDefinition createRouteTemplateDefinition() {
		RouteTemplateDefinitionImpl routeTemplateDefinition = new RouteTemplateDefinitionImpl();
		return routeTemplateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteTemplateParameterDefinition createRouteTemplateParameterDefinition() {
		RouteTemplateParameterDefinitionImpl routeTemplateParameterDefinition = new RouteTemplateParameterDefinitionImpl();
		return routeTemplateParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteTemplatesDefinition createRouteTemplatesDefinition() {
		RouteTemplatesDefinitionImpl routeTemplatesDefinition = new RouteTemplatesDefinitionImpl();
		return routeTemplatesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoutingSlipDefinition createRoutingSlipDefinition() {
		RoutingSlipDefinitionImpl routingSlipDefinition = new RoutingSlipDefinitionImpl();
		return routingSlipDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RssDataFormat createRssDataFormat() {
		RssDataFormatImpl rssDataFormat = new RssDataFormatImpl();
		return rssDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SagaActionUriDefinition createSagaActionUriDefinition() {
		SagaActionUriDefinitionImpl sagaActionUriDefinition = new SagaActionUriDefinitionImpl();
		return sagaActionUriDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SagaDefinition createSagaDefinition() {
		SagaDefinitionImpl sagaDefinition = new SagaDefinitionImpl();
		return sagaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SamplingDefinition createSamplingDefinition() {
		SamplingDefinitionImpl samplingDefinition = new SamplingDefinitionImpl();
		return samplingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptDefinition createScriptDefinition() {
		ScriptDefinitionImpl scriptDefinition = new ScriptDefinitionImpl();
		return scriptDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecureRandomParametersFactoryBean createSecureRandomParametersFactoryBean() {
		SecureRandomParametersFactoryBeanImpl secureRandomParametersFactoryBean = new SecureRandomParametersFactoryBeanImpl();
		return secureRandomParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecureSocketProtocolsParameters createSecureSocketProtocolsParameters() {
		SecureSocketProtocolsParametersImpl secureSocketProtocolsParameters = new SecureSocketProtocolsParametersImpl();
		return secureSocketProtocolsParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityDefinition createSecurityDefinition() {
		SecurityDefinitionImpl securityDefinition = new SecurityDefinitionImpl();
		return securityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallConfigurationDefinition createServiceCallConfigurationDefinition() {
		ServiceCallConfigurationDefinitionImpl serviceCallConfigurationDefinition = new ServiceCallConfigurationDefinitionImpl();
		return serviceCallConfigurationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallDefinition createServiceCallDefinition() {
		ServiceCallDefinitionImpl serviceCallDefinition = new ServiceCallDefinitionImpl();
		return serviceCallDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallDefinitionConstants createServiceCallDefinitionConstants() {
		ServiceCallDefinitionConstantsImpl serviceCallDefinitionConstants = new ServiceCallDefinitionConstantsImpl();
		return serviceCallDefinitionConstants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallExpressionConfiguration createServiceCallExpressionConfiguration() {
		ServiceCallExpressionConfigurationImpl serviceCallExpressionConfiguration = new ServiceCallExpressionConfigurationImpl();
		return serviceCallExpressionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallServiceChooserConfiguration createServiceCallServiceChooserConfiguration() {
		ServiceCallServiceChooserConfigurationImpl serviceCallServiceChooserConfiguration = new ServiceCallServiceChooserConfigurationImpl();
		return serviceCallServiceChooserConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallServiceDiscoveryConfiguration createServiceCallServiceDiscoveryConfiguration() {
		ServiceCallServiceDiscoveryConfigurationImpl serviceCallServiceDiscoveryConfiguration = new ServiceCallServiceDiscoveryConfigurationImpl();
		return serviceCallServiceDiscoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallServiceFilterConfiguration createServiceCallServiceFilterConfiguration() {
		ServiceCallServiceFilterConfigurationImpl serviceCallServiceFilterConfiguration = new ServiceCallServiceFilterConfigurationImpl();
		return serviceCallServiceFilterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallServiceLoadBalancerConfiguration createServiceCallServiceLoadBalancerConfiguration() {
		ServiceCallServiceLoadBalancerConfigurationImpl serviceCallServiceLoadBalancerConfiguration = new ServiceCallServiceLoadBalancerConfigurationImpl();
		return serviceCallServiceLoadBalancerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetBodyDefinition createSetBodyDefinition() {
		SetBodyDefinitionImpl setBodyDefinition = new SetBodyDefinitionImpl();
		return setBodyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetExchangePatternDefinition createSetExchangePatternDefinition() {
		SetExchangePatternDefinitionImpl setExchangePatternDefinition = new SetExchangePatternDefinitionImpl();
		return setExchangePatternDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetHeaderDefinition createSetHeaderDefinition() {
		SetHeaderDefinitionImpl setHeaderDefinition = new SetHeaderDefinitionImpl();
		return setHeaderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetHeadersDefinition createSetHeadersDefinition() {
		SetHeadersDefinitionImpl setHeadersDefinition = new SetHeadersDefinitionImpl();
		return setHeadersDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetPropertyDefinition createSetPropertyDefinition() {
		SetPropertyDefinitionImpl setPropertyDefinition = new SetPropertyDefinitionImpl();
		return setPropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetVariableDefinition createSetVariableDefinition() {
		SetVariableDefinitionImpl setVariableDefinition = new SetVariableDefinitionImpl();
		return setVariableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetVariablesDefinition createSetVariablesDefinition() {
		SetVariablesDefinitionImpl setVariablesDefinition = new SetVariablesDefinitionImpl();
		return setVariablesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleExpression createSimpleExpression() {
		SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
		return simpleExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmooksDataFormat createSmooksDataFormat() {
		SmooksDataFormatImpl smooksDataFormat = new SmooksDataFormatImpl();
		return smooksDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SniHostNames createSniHostNames() {
		SniHostNamesImpl sniHostNames = new SniHostNamesImpl();
		return sniHostNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoapDataFormat createSoapDataFormat() {
		SoapDataFormatImpl soapDataFormat = new SoapDataFormatImpl();
		return soapDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortDefinition createSortDefinition() {
		SortDefinitionImpl sortDefinition = new SortDefinitionImpl();
		return sortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpELExpression createSpELExpression() {
		SpELExpressionImpl spELExpression = new SpELExpressionImpl();
		return spELExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SplitDefinition createSplitDefinition() {
		SplitDefinitionImpl splitDefinition = new SplitDefinitionImpl();
		return splitDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpringErrorHandlerDefinition createSpringErrorHandlerDefinition() {
		SpringErrorHandlerDefinitionImpl springErrorHandlerDefinition = new SpringErrorHandlerDefinitionImpl();
		return springErrorHandlerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpringTransactionErrorHandlerDefinition createSpringTransactionErrorHandlerDefinition() {
		SpringTransactionErrorHandlerDefinitionImpl springTransactionErrorHandlerDefinition = new SpringTransactionErrorHandlerDefinitionImpl();
		return springTransactionErrorHandlerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SslContextClientParametersFactoryBean createSslContextClientParametersFactoryBean() {
		SslContextClientParametersFactoryBeanImpl sslContextClientParametersFactoryBean = new SslContextClientParametersFactoryBeanImpl();
		return sslContextClientParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SslContextParametersFactoryBean createSslContextParametersFactoryBean() {
		SslContextParametersFactoryBeanImpl sslContextParametersFactoryBean = new SslContextParametersFactoryBeanImpl();
		return sslContextParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SslContextServerParametersFactoryBean createSslContextServerParametersFactoryBean() {
		SslContextServerParametersFactoryBeanImpl sslContextServerParametersFactoryBean = new SslContextServerParametersFactoryBeanImpl();
		return sslContextServerParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticServiceCallServiceDiscoveryConfiguration createStaticServiceCallServiceDiscoveryConfiguration() {
		StaticServiceCallServiceDiscoveryConfigurationImpl staticServiceCallServiceDiscoveryConfiguration = new StaticServiceCallServiceDiscoveryConfigurationImpl();
		return staticServiceCallServiceDiscoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepDefinition createStepDefinition() {
		StepDefinitionImpl stepDefinition = new StepDefinitionImpl();
		return stepDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StickyLoadBalancerDefinition createStickyLoadBalancerDefinition() {
		StickyLoadBalancerDefinitionImpl stickyLoadBalancerDefinition = new StickyLoadBalancerDefinitionImpl();
		return stickyLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopDefinition createStopDefinition() {
		StopDefinitionImpl stopDefinition = new StopDefinitionImpl();
		return stopDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamResequencerConfig createStreamResequencerConfig() {
		StreamResequencerConfigImpl streamResequencerConfig = new StreamResequencerConfigImpl();
		return streamResequencerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwiftMtDataFormat createSwiftMtDataFormat() {
		SwiftMtDataFormatImpl swiftMtDataFormat = new SwiftMtDataFormatImpl();
		return swiftMtDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwiftMxDataFormat createSwiftMxDataFormat() {
		SwiftMxDataFormatImpl swiftMxDataFormat = new SwiftMxDataFormatImpl();
		return swiftMxDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyslogDataFormat createSyslogDataFormat() {
		SyslogDataFormatImpl syslogDataFormat = new SyslogDataFormatImpl();
		return syslogDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TarFileDataFormat createTarFileDataFormat() {
		TarFileDataFormatImpl tarFileDataFormat = new TarFileDataFormatImpl();
		return tarFileDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplatedRouteDefinition createTemplatedRouteDefinition() {
		TemplatedRouteDefinitionImpl templatedRouteDefinition = new TemplatedRouteDefinitionImpl();
		return templatedRouteDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplatedRouteParameterDefinition createTemplatedRouteParameterDefinition() {
		TemplatedRouteParameterDefinitionImpl templatedRouteParameterDefinition = new TemplatedRouteParameterDefinitionImpl();
		return templatedRouteParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplatedRoutesDefinition createTemplatedRoutesDefinition() {
		TemplatedRoutesDefinitionImpl templatedRoutesDefinition = new TemplatedRoutesDefinitionImpl();
		return templatedRoutesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadPoolProfileDefinition createThreadPoolProfileDefinition() {
		ThreadPoolProfileDefinitionImpl threadPoolProfileDefinition = new ThreadPoolProfileDefinitionImpl();
		return threadPoolProfileDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadsDefinition createThreadsDefinition() {
		ThreadsDefinitionImpl threadsDefinition = new ThreadsDefinitionImpl();
		return threadsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThriftDataFormat createThriftDataFormat() {
		ThriftDataFormatImpl thriftDataFormat = new ThriftDataFormatImpl();
		return thriftDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrottleDefinition createThrottleDefinition() {
		ThrottleDefinitionImpl throttleDefinition = new ThrottleDefinitionImpl();
		return throttleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrowExceptionDefinition createThrowExceptionDefinition() {
		ThrowExceptionDefinitionImpl throwExceptionDefinition = new ThrowExceptionDefinitionImpl();
		return throwExceptionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TidyMarkupDataFormat createTidyMarkupDataFormat() {
		TidyMarkupDataFormatImpl tidyMarkupDataFormat = new TidyMarkupDataFormatImpl();
		return tidyMarkupDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToDefinition createToDefinition() {
		ToDefinitionImpl toDefinition = new ToDefinitionImpl();
		return toDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToDynamicDefinition createToDynamicDefinition() {
		ToDynamicDefinitionImpl toDynamicDefinition = new ToDynamicDefinitionImpl();
		return toDynamicDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenizerDefinition createTokenizerDefinition() {
		TokenizerDefinitionImpl tokenizerDefinition = new TokenizerDefinitionImpl();
		return tokenizerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenizerExpression createTokenizerExpression() {
		TokenizerExpressionImpl tokenizerExpression = new TokenizerExpressionImpl();
		return tokenizerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenizerImplementation createTokenizerImplementation() {
		TokenizerImplementationImpl tokenizerImplementation = new TokenizerImplementationImpl();
		return tokenizerImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopicLoadBalancerDefinition createTopicLoadBalancerDefinition() {
		TopicLoadBalancerDefinitionImpl topicLoadBalancerDefinition = new TopicLoadBalancerDefinitionImpl();
		return topicLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactedDefinition createTransactedDefinition() {
		TransactedDefinitionImpl transactedDefinition = new TransactedDefinitionImpl();
		return transactedDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformDefinition createTransformDefinition() {
		TransformDefinitionImpl transformDefinition = new TransformDefinitionImpl();
		return transformDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformersDefinition createTransformersDefinition() {
		TransformersDefinitionImpl transformersDefinition = new TransformersDefinitionImpl();
		return transformersDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrustManagersParametersFactoryBean createTrustManagersParametersFactoryBean() {
		TrustManagersParametersFactoryBeanImpl trustManagersParametersFactoryBean = new TrustManagersParametersFactoryBeanImpl();
		return trustManagersParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TryDefinition createTryDefinition() {
		TryDefinitionImpl tryDefinition = new TryDefinitionImpl();
		return tryDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityCsvDataFormat createUniVocityCsvDataFormat() {
		UniVocityCsvDataFormatImpl uniVocityCsvDataFormat = new UniVocityCsvDataFormatImpl();
		return uniVocityCsvDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityFixedDataFormat createUniVocityFixedDataFormat() {
		UniVocityFixedDataFormatImpl uniVocityFixedDataFormat = new UniVocityFixedDataFormatImpl();
		return uniVocityFixedDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityHeader createUniVocityHeader() {
		UniVocityHeaderImpl uniVocityHeader = new UniVocityHeaderImpl();
		return uniVocityHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityTsvDataFormat createUniVocityTsvDataFormat() {
		UniVocityTsvDataFormatImpl uniVocityTsvDataFormat = new UniVocityTsvDataFormatImpl();
		return uniVocityTsvDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnmarshalDefinition createUnmarshalDefinition() {
		UnmarshalDefinitionImpl unmarshalDefinition = new UnmarshalDefinitionImpl();
		return unmarshalDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidateDefinition createValidateDefinition() {
		ValidateDefinitionImpl validateDefinition = new ValidateDefinitionImpl();
		return validateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidatorsDefinition createValidatorsDefinition() {
		ValidatorsDefinitionImpl validatorsDefinition = new ValidatorsDefinitionImpl();
		return validatorsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExpression createVariableExpression() {
		VariableExpressionImpl variableExpression = new VariableExpressionImpl();
		return variableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WasmExpression createWasmExpression() {
		WasmExpressionImpl wasmExpression = new WasmExpressionImpl();
		return wasmExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightedLoadBalancerDefinition createWeightedLoadBalancerDefinition() {
		WeightedLoadBalancerDefinitionImpl weightedLoadBalancerDefinition = new WeightedLoadBalancerDefinitionImpl();
		return weightedLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenDefinition createWhenDefinition() {
		WhenDefinitionImpl whenDefinition = new WhenDefinitionImpl();
		return whenDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WireTapDefinition createWireTapDefinition() {
		WireTapDefinitionImpl wireTapDefinition = new WireTapDefinitionImpl();
		return wireTapDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlSecurityDataFormat createXmlSecurityDataFormat() {
		XmlSecurityDataFormatImpl xmlSecurityDataFormat = new XmlSecurityDataFormatImpl();
		return xmlSecurityDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlTokenizerExpression createXmlTokenizerExpression() {
		XmlTokenizerExpressionImpl xmlTokenizerExpression = new XmlTokenizerExpressionImpl();
		return xmlTokenizerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XPathExpression createXPathExpression() {
		XPathExpressionImpl xPathExpression = new XPathExpressionImpl();
		return xPathExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XQueryExpression createXQueryExpression() {
		XQueryExpressionImpl xQueryExpression = new XQueryExpressionImpl();
		return xQueryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YamlDataFormat createYamlDataFormat() {
		YamlDataFormatImpl yamlDataFormat = new YamlDataFormatImpl();
		return yamlDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YamlTypeFilterDefinition createYamlTypeFilterDefinition() {
		YamlTypeFilterDefinitionImpl yamlTypeFilterDefinition = new YamlTypeFilterDefinitionImpl();
		return yamlTypeFilterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZipDeflaterDataFormat createZipDeflaterDataFormat() {
		ZipDeflaterDataFormatImpl zipDeflaterDataFormat = new ZipDeflaterDataFormatImpl();
		return zipDeflaterDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZipFileDataFormat createZipFileDataFormat() {
		ZipFileDataFormatImpl zipFileDataFormat = new ZipFileDataFormatImpl();
		return zipFileDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZooKeeperServiceCallServiceDiscoveryConfiguration createZooKeeperServiceCallServiceDiscoveryConfiguration() {
		ZooKeeperServiceCallServiceDiscoveryConfigurationImpl zooKeeperServiceCallServiceDiscoveryConfiguration = new ZooKeeperServiceCallServiceDiscoveryConfigurationImpl();
		return zooKeeperServiceCallServiceDiscoveryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvroLibrary createAvroLibraryFromString(EDataType eDataType, String initialValue) {
		AvroLibrary result = AvroLibrary.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvroLibraryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanScope createBeanScopeFromString(EDataType eDataType, String initialValue) {
		BeanScope result = BeanScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBeanScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindyType createBindyTypeFromString(EDataType eDataType, String initialValue) {
		BindyType result = BindyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCheckOperation createClaimCheckOperationFromString(EDataType eDataType, String initialValue) {
		ClaimCheckOperation result = ClaimCheckOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimCheckOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFormat createCollectionFormatFromString(EDataType eDataType, String initialValue) {
		CollectionFormat result = CollectionFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePattern createExchangePatternFromString(EDataType eDataType, String initialValue) {
		ExchangePattern result = ExchangePattern.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExchangePatternToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonLibrary createJsonLibraryFromString(EDataType eDataType, String initialValue) {
		JsonLibrary result = JsonLibrary.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonLibraryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingLevel createLoggingLevelFromString(EDataType eDataType, String initialValue) {
		LoggingLevel result = LoggingLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoggingLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementStatisticsLevel createManagementStatisticsLevelFromString(EDataType eDataType, String initialValue) {
		ManagementStatisticsLevel result = ManagementStatisticsLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManagementStatisticsLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnCompletionMode createOnCompletionModeFromString(EDataType eDataType, String initialValue) {
		OnCompletionMode result = OnCompletionMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnCompletionModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOptionFromString(EDataType eDataType, String initialValue) {
		Option result = Option.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtobufLibrary createProtobufLibraryFromString(EDataType eDataType, String initialValue) {
		ProtobufLibrary result = ProtobufLibrary.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtobufLibraryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBindingMode createRestBindingModeFromString(EDataType eDataType, String initialValue) {
		RestBindingMode result = RestBindingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestBindingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestHostNameResolver createRestHostNameResolverFromString(EDataType eDataType, String initialValue) {
		RestHostNameResolver result = RestHostNameResolver.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestHostNameResolverToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestParamType createRestParamTypeFromString(EDataType eDataType, String initialValue) {
		RestParamType result = RestParamType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestParamTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultQName createResultQNameFromString(EDataType eDataType, String initialValue) {
		ResultQName result = ResultQName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultQNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaCompletionMode createSagaCompletionModeFromString(EDataType eDataType, String initialValue) {
		SagaCompletionMode result = SagaCompletionMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSagaCompletionModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaPropagation createSagaPropagationFromString(EDataType eDataType, String initialValue) {
		SagaPropagation result = SagaPropagation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSagaPropagationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownRoute createShutdownRouteFromString(EDataType eDataType, String initialValue) {
		ShutdownRoute result = ShutdownRoute.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShutdownRouteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownRunningTask createShutdownRunningTaskFromString(EDataType eDataType, String initialValue) {
		ShutdownRunningTask result = ShutdownRunningTask.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShutdownRunningTaskToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringErrorHandlerType createSpringErrorHandlerTypeFromString(EDataType eDataType, String initialValue) {
		SpringErrorHandlerType result = SpringErrorHandlerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpringErrorHandlerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartupSummaryLevel createStartupSummaryLevelFromString(EDataType eDataType, String initialValue) {
		StartupSummaryLevel result = StartupSummaryLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartupSummaryLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottlingMode createThrottlingModeFromString(EDataType eDataType, String initialValue) {
		ThrottlingMode result = ThrottlingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThrottlingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenizerType createTokenizerTypeFromString(EDataType eDataType, String initialValue) {
		TokenizerType result = TokenizerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTokenizerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConverterExists createTypeConverterExistsFromString(EDataType eDataType, String initialValue) {
		TypeConverterExists result = TypeConverterExists.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeConverterExistsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitForTaskToComplete createWaitForTaskToCompleteFromString(EDataType eDataType, String initialValue) {
		WaitForTaskToComplete result = WaitForTaskToComplete.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaitForTaskToCompleteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YamlLibrary createYamlLibraryFromString(EDataType eDataType, String initialValue) {
		YamlLibrary result = YamlLibrary.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYamlLibraryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YamlTypeFilterType createYamlTypeFilterTypeFromString(EDataType eDataType, String initialValue) {
		YamlTypeFilterType result = YamlTypeFilterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYamlTypeFilterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvroLibrary createAvroLibraryObjectFromString(EDataType eDataType, String initialValue) {
		return createAvroLibraryFromString(CamelSpringPackage.eINSTANCE.getAvroLibrary(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvroLibraryObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAvroLibraryToString(CamelSpringPackage.eINSTANCE.getAvroLibrary(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanScope createBeanScopeObjectFromString(EDataType eDataType, String initialValue) {
		return createBeanScopeFromString(CamelSpringPackage.eINSTANCE.getBeanScope(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBeanScopeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBeanScopeToString(CamelSpringPackage.eINSTANCE.getBeanScope(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindyType createBindyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBindyTypeFromString(CamelSpringPackage.eINSTANCE.getBindyType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBindyTypeToString(CamelSpringPackage.eINSTANCE.getBindyType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCheckOperation createClaimCheckOperationObjectFromString(EDataType eDataType, String initialValue) {
		return createClaimCheckOperationFromString(CamelSpringPackage.eINSTANCE.getClaimCheckOperation(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimCheckOperationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClaimCheckOperationToString(CamelSpringPackage.eINSTANCE.getClaimCheckOperation(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFormat createCollectionFormatObjectFromString(EDataType eDataType, String initialValue) {
		return createCollectionFormatFromString(CamelSpringPackage.eINSTANCE.getCollectionFormat(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionFormatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCollectionFormatToString(CamelSpringPackage.eINSTANCE.getCollectionFormat(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePattern createExchangePatternObjectFromString(EDataType eDataType, String initialValue) {
		return createExchangePatternFromString(CamelSpringPackage.eINSTANCE.getExchangePattern(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExchangePatternObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExchangePatternToString(CamelSpringPackage.eINSTANCE.getExchangePattern(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonLibrary createJsonLibraryObjectFromString(EDataType eDataType, String initialValue) {
		return createJsonLibraryFromString(CamelSpringPackage.eINSTANCE.getJsonLibrary(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonLibraryObjectToString(EDataType eDataType, Object instanceValue) {
		return convertJsonLibraryToString(CamelSpringPackage.eINSTANCE.getJsonLibrary(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingLevel createLoggingLevelObjectFromString(EDataType eDataType, String initialValue) {
		return createLoggingLevelFromString(CamelSpringPackage.eINSTANCE.getLoggingLevel(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoggingLevelObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLoggingLevelToString(CamelSpringPackage.eINSTANCE.getLoggingLevel(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementStatisticsLevel createManagementStatisticsLevelObjectFromString(EDataType eDataType, String initialValue) {
		return createManagementStatisticsLevelFromString(CamelSpringPackage.eINSTANCE.getManagementStatisticsLevel(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManagementStatisticsLevelObjectToString(EDataType eDataType, Object instanceValue) {
		return convertManagementStatisticsLevelToString(CamelSpringPackage.eINSTANCE.getManagementStatisticsLevel(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeObjectFromString(EDataType eDataType, String initialValue) {
		return createModeFromString(CamelSpringPackage.eINSTANCE.getMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModeToString(CamelSpringPackage.eINSTANCE.getMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnCompletionMode createOnCompletionModeObjectFromString(EDataType eDataType, String initialValue) {
		return createOnCompletionModeFromString(CamelSpringPackage.eINSTANCE.getOnCompletionMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnCompletionModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOnCompletionModeToString(CamelSpringPackage.eINSTANCE.getOnCompletionMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOptionObjectFromString(EDataType eDataType, String initialValue) {
		return createOptionFromString(CamelSpringPackage.eINSTANCE.getOption(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOptionToString(CamelSpringPackage.eINSTANCE.getOption(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtobufLibrary createProtobufLibraryObjectFromString(EDataType eDataType, String initialValue) {
		return createProtobufLibraryFromString(CamelSpringPackage.eINSTANCE.getProtobufLibrary(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtobufLibraryObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProtobufLibraryToString(CamelSpringPackage.eINSTANCE.getProtobufLibrary(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBindingMode createRestBindingModeObjectFromString(EDataType eDataType, String initialValue) {
		return createRestBindingModeFromString(CamelSpringPackage.eINSTANCE.getRestBindingMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestBindingModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestBindingModeToString(CamelSpringPackage.eINSTANCE.getRestBindingMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestHostNameResolver createRestHostNameResolverObjectFromString(EDataType eDataType, String initialValue) {
		return createRestHostNameResolverFromString(CamelSpringPackage.eINSTANCE.getRestHostNameResolver(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestHostNameResolverObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestHostNameResolverToString(CamelSpringPackage.eINSTANCE.getRestHostNameResolver(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestParamType createRestParamTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRestParamTypeFromString(CamelSpringPackage.eINSTANCE.getRestParamType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestParamTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestParamTypeToString(CamelSpringPackage.eINSTANCE.getRestParamType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultQName createResultQNameObjectFromString(EDataType eDataType, String initialValue) {
		return createResultQNameFromString(CamelSpringPackage.eINSTANCE.getResultQName(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultQNameObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResultQNameToString(CamelSpringPackage.eINSTANCE.getResultQName(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaCompletionMode createSagaCompletionModeObjectFromString(EDataType eDataType, String initialValue) {
		return createSagaCompletionModeFromString(CamelSpringPackage.eINSTANCE.getSagaCompletionMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSagaCompletionModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSagaCompletionModeToString(CamelSpringPackage.eINSTANCE.getSagaCompletionMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaPropagation createSagaPropagationObjectFromString(EDataType eDataType, String initialValue) {
		return createSagaPropagationFromString(CamelSpringPackage.eINSTANCE.getSagaPropagation(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSagaPropagationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSagaPropagationToString(CamelSpringPackage.eINSTANCE.getSagaPropagation(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeFromString(CamelSpringPackage.eINSTANCE.getScope(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeToString(CamelSpringPackage.eINSTANCE.getScope(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownRoute createShutdownRouteObjectFromString(EDataType eDataType, String initialValue) {
		return createShutdownRouteFromString(CamelSpringPackage.eINSTANCE.getShutdownRoute(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShutdownRouteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShutdownRouteToString(CamelSpringPackage.eINSTANCE.getShutdownRoute(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownRunningTask createShutdownRunningTaskObjectFromString(EDataType eDataType, String initialValue) {
		return createShutdownRunningTaskFromString(CamelSpringPackage.eINSTANCE.getShutdownRunningTask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShutdownRunningTaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShutdownRunningTaskToString(CamelSpringPackage.eINSTANCE.getShutdownRunningTask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringErrorHandlerType createSpringErrorHandlerTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpringErrorHandlerTypeFromString(CamelSpringPackage.eINSTANCE.getSpringErrorHandlerType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpringErrorHandlerTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpringErrorHandlerTypeToString(CamelSpringPackage.eINSTANCE.getSpringErrorHandlerType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartupSummaryLevel createStartupSummaryLevelObjectFromString(EDataType eDataType, String initialValue) {
		return createStartupSummaryLevelFromString(CamelSpringPackage.eINSTANCE.getStartupSummaryLevel(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartupSummaryLevelObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStartupSummaryLevelToString(CamelSpringPackage.eINSTANCE.getStartupSummaryLevel(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottlingMode createThrottlingModeObjectFromString(EDataType eDataType, String initialValue) {
		return createThrottlingModeFromString(CamelSpringPackage.eINSTANCE.getThrottlingMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThrottlingModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertThrottlingModeToString(CamelSpringPackage.eINSTANCE.getThrottlingMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenizerType createTokenizerTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTokenizerTypeFromString(CamelSpringPackage.eINSTANCE.getTokenizerType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTokenizerTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTokenizerTypeToString(CamelSpringPackage.eINSTANCE.getTokenizerType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConverterExists createTypeConverterExistsObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeConverterExistsFromString(CamelSpringPackage.eINSTANCE.getTypeConverterExists(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeConverterExistsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeConverterExistsToString(CamelSpringPackage.eINSTANCE.getTypeConverterExists(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createValueDefinitionFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueDefinitionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitForTaskToComplete createWaitForTaskToCompleteObjectFromString(EDataType eDataType, String initialValue) {
		return createWaitForTaskToCompleteFromString(CamelSpringPackage.eINSTANCE.getWaitForTaskToComplete(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaitForTaskToCompleteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWaitForTaskToCompleteToString(CamelSpringPackage.eINSTANCE.getWaitForTaskToComplete(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YamlLibrary createYamlLibraryObjectFromString(EDataType eDataType, String initialValue) {
		return createYamlLibraryFromString(CamelSpringPackage.eINSTANCE.getYamlLibrary(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYamlLibraryObjectToString(EDataType eDataType, Object instanceValue) {
		return convertYamlLibraryToString(CamelSpringPackage.eINSTANCE.getYamlLibrary(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YamlTypeFilterType createYamlTypeFilterTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createYamlTypeFilterTypeFromString(CamelSpringPackage.eINSTANCE.getYamlTypeFilterType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYamlTypeFilterTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertYamlTypeFilterTypeToString(CamelSpringPackage.eINSTANCE.getYamlTypeFilterType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelSpringPackage getCamelSpringPackage() {
		return (CamelSpringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CamelSpringPackage getPackage() {
		return CamelSpringPackage.eINSTANCE;
	}

} //CamelSpringFactoryImpl

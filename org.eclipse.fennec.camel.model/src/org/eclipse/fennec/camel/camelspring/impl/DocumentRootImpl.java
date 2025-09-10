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
package org.eclipse.fennec.camel.camelspring.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.camel.camelspring.AggregateDefinition;
import org.eclipse.fennec.camel.camelspring.ApiKeyDefinition;
import org.eclipse.fennec.camel.camelspring.ApplicationDefinition;
import org.eclipse.fennec.camel.camelspring.Asn1DataFormat;
import org.eclipse.fennec.camel.camelspring.AvroDataFormat;
import org.eclipse.fennec.camel.camelspring.BarcodeDataFormat;
import org.eclipse.fennec.camel.camelspring.Base64DataFormat;
import org.eclipse.fennec.camel.camelspring.BasicAuthDefinition;
import org.eclipse.fennec.camel.camelspring.BatchResequencerConfig;
import org.eclipse.fennec.camel.camelspring.BeanDefinition;
import org.eclipse.fennec.camel.camelspring.BeanFactoryDefinition;
import org.eclipse.fennec.camel.camelspring.BeanioDataFormat;
import org.eclipse.fennec.camel.camelspring.BeansDefinition;
import org.eclipse.fennec.camel.camelspring.BearerTokenDefinition;
import org.eclipse.fennec.camel.camelspring.BindyDataFormat;
import org.eclipse.fennec.camel.camelspring.BlacklistServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.CSimpleExpression;
import org.eclipse.fennec.camel.camelspring.CachingServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.CamelBeanPostProcessor;
import org.eclipse.fennec.camel.camelspring.CamelConsumerTemplateFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelContextFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelEndpointFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelFluentProducerTemplateFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelJMXAgentDefinition;
import org.eclipse.fennec.camel.camelspring.CamelProducerTemplateFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderDefinition;
import org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderFunctionDefinition;
import org.eclipse.fennec.camel.camelspring.CamelPropertyPlaceholderLocationDefinition;
import org.eclipse.fennec.camel.camelspring.CamelRedeliveryPolicyFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelRestContextFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelRouteConfigurationContextFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelRouteContextFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelRouteControllerDefinition;
import org.eclipse.fennec.camel.camelspring.CamelRouteTemplateContextFactoryBean;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CamelStreamCachingStrategyDefinition;
import org.eclipse.fennec.camel.camelspring.CamelThreadPoolFactoryBean;
import org.eclipse.fennec.camel.camelspring.CatchDefinition;
import org.eclipse.fennec.camel.camelspring.CborDataFormat;
import org.eclipse.fennec.camel.camelspring.ChoiceDefinition;
import org.eclipse.fennec.camel.camelspring.CircuitBreakerDefinition;
import org.eclipse.fennec.camel.camelspring.ClaimCheckDefinition;
import org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.CombinedServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.ConstantExpression;
import org.eclipse.fennec.camel.camelspring.ConsulServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.ContextScanDefinition;
import org.eclipse.fennec.camel.camelspring.ConvertBodyDefinition;
import org.eclipse.fennec.camel.camelspring.ConvertHeaderDefinition;
import org.eclipse.fennec.camel.camelspring.ConvertVariableDefinition;
import org.eclipse.fennec.camel.camelspring.CryptoDataFormat;
import org.eclipse.fennec.camel.camelspring.CsvDataFormat;
import org.eclipse.fennec.camel.camelspring.CustomDataFormat;
import org.eclipse.fennec.camel.camelspring.CustomLoadBalancerDefinition;
import org.eclipse.fennec.camel.camelspring.CustomServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.CustomTransformerDefinition;
import org.eclipse.fennec.camel.camelspring.CustomValidatorDefinition;
import org.eclipse.fennec.camel.camelspring.DataFormatTransformerDefinition;
import org.eclipse.fennec.camel.camelspring.DataFormatsDefinition;
import org.eclipse.fennec.camel.camelspring.DatasonnetExpression;
import org.eclipse.fennec.camel.camelspring.DeadLetterChannelDefinition;
import org.eclipse.fennec.camel.camelspring.DefaultErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.DefaultServiceCallServiceLoadBalancerConfiguration;
import org.eclipse.fennec.camel.camelspring.DelayDefinition;
import org.eclipse.fennec.camel.camelspring.DeleteDefinition;
import org.eclipse.fennec.camel.camelspring.DfdlDataFormat;
import org.eclipse.fennec.camel.camelspring.DnsServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.DocumentRoot;
import org.eclipse.fennec.camel.camelspring.DynamicRouterDefinition;
import org.eclipse.fennec.camel.camelspring.EndpointTransformerDefinition;
import org.eclipse.fennec.camel.camelspring.EndpointValidatorDefinition;
import org.eclipse.fennec.camel.camelspring.EnrichDefinition;
import org.eclipse.fennec.camel.camelspring.ExchangePropertyExpression;
import org.eclipse.fennec.camel.camelspring.Expression;
import org.eclipse.fennec.camel.camelspring.ExpressionSubElementDefinition;
import org.eclipse.fennec.camel.camelspring.FailoverLoadBalancerDefinition;
import org.eclipse.fennec.camel.camelspring.FaultToleranceConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.FhirJsonDataFormat;
import org.eclipse.fennec.camel.camelspring.FhirXmlDataFormat;
import org.eclipse.fennec.camel.camelspring.FilterDefinition;
import org.eclipse.fennec.camel.camelspring.FinallyDefinition;
import org.eclipse.fennec.camel.camelspring.FlatpackDataFormat;
import org.eclipse.fennec.camel.camelspring.ForyDataFormat;
import org.eclipse.fennec.camel.camelspring.FromDefinition;
import org.eclipse.fennec.camel.camelspring.GetDefinition;
import org.eclipse.fennec.camel.camelspring.GlobalOptionDefinition;
import org.eclipse.fennec.camel.camelspring.GlobalOptionsDefinition;
import org.eclipse.fennec.camel.camelspring.GrokDataFormat;
import org.eclipse.fennec.camel.camelspring.GroovyExpression;
import org.eclipse.fennec.camel.camelspring.GzipDeflaterDataFormat;
import org.eclipse.fennec.camel.camelspring.HeadDefinition;
import org.eclipse.fennec.camel.camelspring.HeaderExpression;
import org.eclipse.fennec.camel.camelspring.HealthyServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.Hl7DataFormat;
import org.eclipse.fennec.camel.camelspring.Hl7TerserExpression;
import org.eclipse.fennec.camel.camelspring.IcalDataFormat;
import org.eclipse.fennec.camel.camelspring.IdempotentConsumerDefinition;
import org.eclipse.fennec.camel.camelspring.InputTypeDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptFromDefinition;
import org.eclipse.fennec.camel.camelspring.InterceptSendToEndpointDefinition;
import org.eclipse.fennec.camel.camelspring.Iso8583DataFormat;
import org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat;
import org.eclipse.fennec.camel.camelspring.JavaExpression;
import org.eclipse.fennec.camel.camelspring.JavaScriptExpression;
import org.eclipse.fennec.camel.camelspring.JaxbDataFormat;
import org.eclipse.fennec.camel.camelspring.JoorExpression;
import org.eclipse.fennec.camel.camelspring.JqExpression;
import org.eclipse.fennec.camel.camelspring.JsonApiDataFormat;
import org.eclipse.fennec.camel.camelspring.JsonDataFormat;
import org.eclipse.fennec.camel.camelspring.JsonPathExpression;
import org.eclipse.fennec.camel.camelspring.JtaTransactionErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.KameletDefinition;
import org.eclipse.fennec.camel.camelspring.KeyStoreParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.KubernetesServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.LangChain4JCharacterTokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.LangChain4JLineTokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.LangChain4JParagraphTokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.LangChain4JSentenceTokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.LangChain4JWordTokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.LanguageExpression;
import org.eclipse.fennec.camel.camelspring.LoadBalanceDefinition;
import org.eclipse.fennec.camel.camelspring.LoadTransformerDefinition;
import org.eclipse.fennec.camel.camelspring.LogDefinition;
import org.eclipse.fennec.camel.camelspring.LoopDefinition;
import org.eclipse.fennec.camel.camelspring.LzfDataFormat;
import org.eclipse.fennec.camel.camelspring.MarshalDefinition;
import org.eclipse.fennec.camel.camelspring.MethodCallExpression;
import org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat;
import org.eclipse.fennec.camel.camelspring.MulticastDefinition;
import org.eclipse.fennec.camel.camelspring.MutualTLSDefinition;
import org.eclipse.fennec.camel.camelspring.MvelExpression;
import org.eclipse.fennec.camel.camelspring.NoErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.OAuth2Definition;
import org.eclipse.fennec.camel.camelspring.OgnlExpression;
import org.eclipse.fennec.camel.camelspring.OnCompletionDefinition;
import org.eclipse.fennec.camel.camelspring.OnExceptionDefinition;
import org.eclipse.fennec.camel.camelspring.OnFallbackDefinition;
import org.eclipse.fennec.camel.camelspring.OnWhenDefinition;
import org.eclipse.fennec.camel.camelspring.OpenApiDefinition;
import org.eclipse.fennec.camel.camelspring.OpenIdConnectDefinition;
import org.eclipse.fennec.camel.camelspring.OptimisticLockRetryPolicyDefinition;
import org.eclipse.fennec.camel.camelspring.OtherwiseDefinition;
import org.eclipse.fennec.camel.camelspring.OutputTypeDefinition;
import org.eclipse.fennec.camel.camelspring.PackageScanDefinition;
import org.eclipse.fennec.camel.camelspring.ParamDefinition;
import org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat;
import org.eclipse.fennec.camel.camelspring.PassThroughServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.PatchDefinition;
import org.eclipse.fennec.camel.camelspring.PausableDefinition;
import org.eclipse.fennec.camel.camelspring.PgpDataFormat;
import org.eclipse.fennec.camel.camelspring.PipelineDefinition;
import org.eclipse.fennec.camel.camelspring.PolicyDefinition;
import org.eclipse.fennec.camel.camelspring.PollDefinition;
import org.eclipse.fennec.camel.camelspring.PollEnrichDefinition;
import org.eclipse.fennec.camel.camelspring.PostDefinition;
import org.eclipse.fennec.camel.camelspring.PredicateValidatorDefinition;
import org.eclipse.fennec.camel.camelspring.ProcessDefinition;
import org.eclipse.fennec.camel.camelspring.PropertyDefinition;
import org.eclipse.fennec.camel.camelspring.PropertyExpressionDefinition;
import org.eclipse.fennec.camel.camelspring.ProtobufDataFormat;
import org.eclipse.fennec.camel.camelspring.PutDefinition;
import org.eclipse.fennec.camel.camelspring.PythonExpression;
import org.eclipse.fennec.camel.camelspring.RandomLoadBalancerDefinition;
import org.eclipse.fennec.camel.camelspring.RecipientListDefinition;
import org.eclipse.fennec.camel.camelspring.RedeliveryPolicyDefinition;
import org.eclipse.fennec.camel.camelspring.RefErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.RefExpression;
import org.eclipse.fennec.camel.camelspring.RemoveHeaderDefinition;
import org.eclipse.fennec.camel.camelspring.RemoveHeadersDefinition;
import org.eclipse.fennec.camel.camelspring.RemovePropertiesDefinition;
import org.eclipse.fennec.camel.camelspring.RemovePropertyDefinition;
import org.eclipse.fennec.camel.camelspring.RemoveVariableDefinition;
import org.eclipse.fennec.camel.camelspring.ResequenceDefinition;
import org.eclipse.fennec.camel.camelspring.Resilience4JConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.ResponseHeaderDefinition;
import org.eclipse.fennec.camel.camelspring.ResponseMessageDefinition;
import org.eclipse.fennec.camel.camelspring.RestBindingDefinition;
import org.eclipse.fennec.camel.camelspring.RestConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.RestContextRefDefinition;
import org.eclipse.fennec.camel.camelspring.RestDefinition;
import org.eclipse.fennec.camel.camelspring.RestPropertyDefinition;
import org.eclipse.fennec.camel.camelspring.RestSecuritiesDefinition;
import org.eclipse.fennec.camel.camelspring.RestsDefinition;
import org.eclipse.fennec.camel.camelspring.ResumableDefinition;
import org.eclipse.fennec.camel.camelspring.RollbackDefinition;
import org.eclipse.fennec.camel.camelspring.RoundRobinLoadBalancerDefinition;
import org.eclipse.fennec.camel.camelspring.RouteBuilderDefinition;
import org.eclipse.fennec.camel.camelspring.RouteConfigurationContextRefDefinition;
import org.eclipse.fennec.camel.camelspring.RouteConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.RouteConfigurationsDefinition;
import org.eclipse.fennec.camel.camelspring.RouteContextRefDefinition;
import org.eclipse.fennec.camel.camelspring.RouteDefinition;
import org.eclipse.fennec.camel.camelspring.RouteTemplateContextRefDefinition;
import org.eclipse.fennec.camel.camelspring.RouteTemplateDefinition;
import org.eclipse.fennec.camel.camelspring.RouteTemplateParameterDefinition;
import org.eclipse.fennec.camel.camelspring.RouteTemplatesDefinition;
import org.eclipse.fennec.camel.camelspring.RoutesDefinition;
import org.eclipse.fennec.camel.camelspring.RoutingSlipDefinition;
import org.eclipse.fennec.camel.camelspring.RssDataFormat;
import org.eclipse.fennec.camel.camelspring.SagaDefinition;
import org.eclipse.fennec.camel.camelspring.SamplingDefinition;
import org.eclipse.fennec.camel.camelspring.ScriptDefinition;
import org.eclipse.fennec.camel.camelspring.SecureRandomParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.SecurityDefinition;
import org.eclipse.fennec.camel.camelspring.ServiceCallConfigurationDefinition;
import org.eclipse.fennec.camel.camelspring.ServiceCallDefinition;
import org.eclipse.fennec.camel.camelspring.ServiceCallExpressionConfiguration;
import org.eclipse.fennec.camel.camelspring.ServiceCallServiceChooserConfiguration;
import org.eclipse.fennec.camel.camelspring.ServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.ServiceCallServiceFilterConfiguration;
import org.eclipse.fennec.camel.camelspring.ServiceCallServiceLoadBalancerConfiguration;
import org.eclipse.fennec.camel.camelspring.SetBodyDefinition;
import org.eclipse.fennec.camel.camelspring.SetExchangePatternDefinition;
import org.eclipse.fennec.camel.camelspring.SetHeaderDefinition;
import org.eclipse.fennec.camel.camelspring.SetHeadersDefinition;
import org.eclipse.fennec.camel.camelspring.SetPropertyDefinition;
import org.eclipse.fennec.camel.camelspring.SetVariableDefinition;
import org.eclipse.fennec.camel.camelspring.SetVariablesDefinition;
import org.eclipse.fennec.camel.camelspring.SimpleExpression;
import org.eclipse.fennec.camel.camelspring.SmooksDataFormat;
import org.eclipse.fennec.camel.camelspring.SoapDataFormat;
import org.eclipse.fennec.camel.camelspring.SortDefinition;
import org.eclipse.fennec.camel.camelspring.SpELExpression;
import org.eclipse.fennec.camel.camelspring.SplitDefinition;
import org.eclipse.fennec.camel.camelspring.SpringTransactionErrorHandlerDefinition;
import org.eclipse.fennec.camel.camelspring.SslContextParametersFactoryBean;
import org.eclipse.fennec.camel.camelspring.StaticServiceCallServiceDiscoveryConfiguration;
import org.eclipse.fennec.camel.camelspring.StepDefinition;
import org.eclipse.fennec.camel.camelspring.StickyLoadBalancerDefinition;
import org.eclipse.fennec.camel.camelspring.StopDefinition;
import org.eclipse.fennec.camel.camelspring.StreamResequencerConfig;
import org.eclipse.fennec.camel.camelspring.SwiftMtDataFormat;
import org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat;
import org.eclipse.fennec.camel.camelspring.SyslogDataFormat;
import org.eclipse.fennec.camel.camelspring.TarFileDataFormat;
import org.eclipse.fennec.camel.camelspring.TemplatedRouteDefinition;
import org.eclipse.fennec.camel.camelspring.TemplatedRouteParameterDefinition;
import org.eclipse.fennec.camel.camelspring.TemplatedRoutesDefinition;
import org.eclipse.fennec.camel.camelspring.ThreadPoolProfileDefinition;
import org.eclipse.fennec.camel.camelspring.ThreadsDefinition;
import org.eclipse.fennec.camel.camelspring.ThriftDataFormat;
import org.eclipse.fennec.camel.camelspring.ThrottleDefinition;
import org.eclipse.fennec.camel.camelspring.ThrowExceptionDefinition;
import org.eclipse.fennec.camel.camelspring.TidyMarkupDataFormat;
import org.eclipse.fennec.camel.camelspring.ToDefinition;
import org.eclipse.fennec.camel.camelspring.ToDynamicDefinition;
import org.eclipse.fennec.camel.camelspring.TokenizerDefinition;
import org.eclipse.fennec.camel.camelspring.TokenizerExpression;
import org.eclipse.fennec.camel.camelspring.TopicLoadBalancerDefinition;
import org.eclipse.fennec.camel.camelspring.TransactedDefinition;
import org.eclipse.fennec.camel.camelspring.TransformDefinition;
import org.eclipse.fennec.camel.camelspring.TransformersDefinition;
import org.eclipse.fennec.camel.camelspring.TryDefinition;
import org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat;
import org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat;
import org.eclipse.fennec.camel.camelspring.UniVocityHeader;
import org.eclipse.fennec.camel.camelspring.UniVocityTsvDataFormat;
import org.eclipse.fennec.camel.camelspring.UnmarshalDefinition;
import org.eclipse.fennec.camel.camelspring.ValidateDefinition;
import org.eclipse.fennec.camel.camelspring.ValidatorsDefinition;
import org.eclipse.fennec.camel.camelspring.VariableExpression;
import org.eclipse.fennec.camel.camelspring.WasmExpression;
import org.eclipse.fennec.camel.camelspring.WeightedLoadBalancerDefinition;
import org.eclipse.fennec.camel.camelspring.WhenDefinition;
import org.eclipse.fennec.camel.camelspring.WireTapDefinition;
import org.eclipse.fennec.camel.camelspring.XPathExpression;
import org.eclipse.fennec.camel.camelspring.XQueryExpression;
import org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat;
import org.eclipse.fennec.camel.camelspring.XmlTokenizerExpression;
import org.eclipse.fennec.camel.camelspring.YamlDataFormat;
import org.eclipse.fennec.camel.camelspring.YamlTypeFilterDefinition;
import org.eclipse.fennec.camel.camelspring.ZipDeflaterDataFormat;
import org.eclipse.fennec.camel.camelspring.ZipFileDataFormat;
import org.eclipse.fennec.camel.camelspring.ZooKeeperServiceCallServiceDiscoveryConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getAsn1 <em>Asn1</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getAvro <em>Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBarcode <em>Barcode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBase64 <em>Base64</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBasicAuth <em>Basic Auth</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBatchConfig <em>Batch Config</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBeanFactory <em>Bean Factory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBeanio <em>Beanio</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBeanPostProcessor <em>Bean Post Processor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBeans <em>Beans</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBearerToken <em>Bearer Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getBlacklistServiceFilter <em>Blacklist Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCachingServiceDiscovery <em>Caching Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCamel <em>Camel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCamelContext <em>Camel Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCbor <em>Cbor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCombinedServiceDiscovery <em>Combined Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCombinedServiceFilter <em>Combined Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getConsulServiceDiscovery <em>Consul Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getConsumerTemplate <em>Consumer Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getContextScan <em>Context Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCsimple <em>Csimple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCustomLoadBalancer <em>Custom Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCustomServiceFilter <em>Custom Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCustomTransformer <em>Custom Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getCustomValidator <em>Custom Validator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDataFormatTransformer <em>Data Format Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDatasonnet <em>Datasonnet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDeadLetterChannel <em>Dead Letter Channel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDefaultErrorHandler <em>Default Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDefaultLoadBalancer <em>Default Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDfdl <em>Dfdl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDnsServiceDiscovery <em>Dns Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getEndpointTransformer <em>Endpoint Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getEndpointValidator <em>Endpoint Validator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getExchangeProperty <em>Exchange Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getFailoverLoadBalancer <em>Failover Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getFaultToleranceConfiguration <em>Fault Tolerance Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getFhirJson <em>Fhir Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getFhirXml <em>Fhir Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getFluentTemplate <em>Fluent Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getFory <em>Fory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getGlobalOption <em>Global Option</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getGlobalOptions <em>Global Options</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getGrok <em>Grok</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getGzipDeflater <em>Gzip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getHealthyServiceFilter <em>Healthy Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getHl7terser <em>Hl7terser</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getIcal <em>Ical</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getIso8583 <em>Iso8583</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJacksonXml <em>Jackson Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJava <em>Java</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJmxAgent <em>Jmx Agent</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJoor <em>Joor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJq <em>Jq</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJs <em>Js</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJson <em>Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJsonApi <em>Json Api</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJsonpath <em>Jsonpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getJtaTransactionErrorHandler <em>Jta Transaction Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getKeyStoreParameters <em>Key Store Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLangChain4jCharacterTokenizer <em>Lang Chain4j Character Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLangChain4jLineTokenizer <em>Lang Chain4j Line Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLangChain4jParagraphTokenizer <em>Lang Chain4j Paragraph Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLangChain4jSentenceTokenizer <em>Lang Chain4j Sentence Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLangChain4jWordTokenizer <em>Lang Chain4j Word Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLoadBalancerConfiguration <em>Load Balancer Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLoadTransformer <em>Load Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getLzf <em>Lzf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getMimeMultipart <em>Mime Multipart</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getMutualTLS <em>Mutual TLS</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getNoErrorHandler <em>No Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOauth2 <em>Oauth2</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOnFallback <em>On Fallback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOnWhen <em>On When</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOpenApi <em>Open Api</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOpenIdConnect <em>Open Id Connect</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOptimisticLockRetryPolicy <em>Optimistic Lock Retry Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPackageScan <em>Package Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getParquetAvro <em>Parquet Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPassThroughServiceFilter <em>Pass Through Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPatch <em>Patch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPgp <em>Pgp</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPost <em>Post</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPredicateValidator <em>Predicate Validator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPropertiesFunction <em>Properties Function</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPropertiesLocation <em>Properties Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPropertyExpression <em>Property Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPropertyPlaceholder <em>Property Placeholder</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPut <em>Put</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getPython <em>Python</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRandomLoadBalancer <em>Random Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRedeliveryPolicyProfile <em>Redelivery Policy Profile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRefErrorHandler <em>Ref Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getResilience4jConfiguration <em>Resilience4j Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getResponseMessage <em>Response Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRestBinding <em>Rest Binding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRestConfiguration <em>Rest Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRestContext <em>Rest Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRestContextRef <em>Rest Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRestProperty <em>Rest Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRests <em>Rests</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRoundRobinLoadBalancer <em>Round Robin Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteBuilder <em>Route Builder</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteConfiguration <em>Route Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteConfigurationContext <em>Route Configuration Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteConfigurationContextRef <em>Route Configuration Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteConfigurations <em>Route Configurations</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteContext <em>Route Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteContextRef <em>Route Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteController <em>Route Controller</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteTemplate <em>Route Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteTemplateContext <em>Route Template Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteTemplateContextRef <em>Route Template Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRouteTemplates <em>Route Templates</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getRss <em>Rss</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSecureRandomParameters <em>Secure Random Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getServiceCallConfiguration <em>Service Call Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getServiceChooserConfiguration <em>Service Chooser Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getServiceDiscoveryConfiguration <em>Service Discovery Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getServiceExpression <em>Service Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getServiceFilterConfiguration <em>Service Filter Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSmooks <em>Smooks</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSoap <em>Soap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSpringTransactionErrorHandler <em>Spring Transaction Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSslContextParameters <em>Ssl Context Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getStaticServiceDiscovery <em>Static Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getStickyLoadBalancer <em>Sticky Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getStreamCaching <em>Stream Caching</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getStreamConfig <em>Stream Config</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSwiftMt <em>Swift Mt</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSwiftMx <em>Swift Mx</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTarFile <em>Tar File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTemplatedRoute <em>Templated Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTemplatedRouteParameter <em>Templated Route Parameter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTemplatedRoutes <em>Templated Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getThreadPoolProfile <em>Thread Pool Profile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getThrift <em>Thrift</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTopicLoadBalancer <em>Topic Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getTypeFilter <em>Type Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getUnivocityCsv <em>Univocity Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getUnivocityFixed <em>Univocity Fixed</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getUnivocityHeader <em>Univocity Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getUnivocityTsv <em>Univocity Tsv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getWasm <em>Wasm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getWeightedLoadBalancer <em>Weighted Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getXmlSecurity <em>Xml Security</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getXtokenize <em>Xtokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getYaml <em>Yaml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getZipDeflater <em>Zip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getZipFile <em>Zip File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DocumentRootImpl#getZookeeperServiceDiscovery <em>Zookeeper Service Discovery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CamelSpringPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CamelSpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CamelSpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregateDefinition getAggregate() {
		return (AggregateDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Aggregate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(AggregateDefinition newAggregate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Aggregate(), newAggregate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregate(AggregateDefinition newAggregate) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Aggregate(), newAggregate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApiKeyDefinition getApiKey() {
		return (ApiKeyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ApiKey(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiKey(ApiKeyDefinition newApiKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ApiKey(), newApiKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiKey(ApiKeyDefinition newApiKey) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ApiKey(), newApiKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asn1DataFormat getAsn1() {
		return (Asn1DataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Asn1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsn1(Asn1DataFormat newAsn1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Asn1(), newAsn1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsn1(Asn1DataFormat newAsn1) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Asn1(), newAsn1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AvroDataFormat getAvro() {
		return (AvroDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Avro(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvro(AvroDataFormat newAvro, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Avro(), newAvro, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvro(AvroDataFormat newAvro) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Avro(), newAvro);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarcodeDataFormat getBarcode() {
		return (BarcodeDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Barcode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBarcode(BarcodeDataFormat newBarcode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Barcode(), newBarcode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBarcode(BarcodeDataFormat newBarcode) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Barcode(), newBarcode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64DataFormat getBase64() {
		return (Base64DataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Base64(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase64(Base64DataFormat newBase64, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Base64(), newBase64, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase64(Base64DataFormat newBase64) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Base64(), newBase64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicAuthDefinition getBasicAuth() {
		return (BasicAuthDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_BasicAuth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicAuth(BasicAuthDefinition newBasicAuth, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_BasicAuth(), newBasicAuth, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasicAuth(BasicAuthDefinition newBasicAuth) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_BasicAuth(), newBasicAuth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BatchResequencerConfig getBatchConfig() {
		return (BatchResequencerConfig)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_BatchConfig(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBatchConfig(BatchResequencerConfig newBatchConfig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_BatchConfig(), newBatchConfig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatchConfig(BatchResequencerConfig newBatchConfig) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_BatchConfig(), newBatchConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanDefinition getBean() {
		return (BeanDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Bean(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBean(BeanDefinition newBean, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Bean(), newBean, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBean(BeanDefinition newBean) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Bean(), newBean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanFactoryDefinition getBeanFactory() {
		return (BeanFactoryDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_BeanFactory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeanFactory(BeanFactoryDefinition newBeanFactory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_BeanFactory(), newBeanFactory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeanFactory(BeanFactoryDefinition newBeanFactory) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_BeanFactory(), newBeanFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanioDataFormat getBeanio() {
		return (BeanioDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Beanio(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeanio(BeanioDataFormat newBeanio, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Beanio(), newBeanio, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeanio(BeanioDataFormat newBeanio) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Beanio(), newBeanio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelBeanPostProcessor getBeanPostProcessor() {
		return (CamelBeanPostProcessor)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_BeanPostProcessor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeanPostProcessor(CamelBeanPostProcessor newBeanPostProcessor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_BeanPostProcessor(), newBeanPostProcessor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeanPostProcessor(CamelBeanPostProcessor newBeanPostProcessor) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_BeanPostProcessor(), newBeanPostProcessor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeansDefinition getBeans() {
		return (BeansDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Beans(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeans(BeansDefinition newBeans, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Beans(), newBeans, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeans(BeansDefinition newBeans) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Beans(), newBeans);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BearerTokenDefinition getBearerToken() {
		return (BearerTokenDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_BearerToken(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBearerToken(BearerTokenDefinition newBearerToken, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_BearerToken(), newBearerToken, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBearerToken(BearerTokenDefinition newBearerToken) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_BearerToken(), newBearerToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindyDataFormat getBindy() {
		return (BindyDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Bindy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindy(BindyDataFormat newBindy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Bindy(), newBindy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindy(BindyDataFormat newBindy) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Bindy(), newBindy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlacklistServiceCallServiceFilterConfiguration getBlacklistServiceFilter() {
		return (BlacklistServiceCallServiceFilterConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_BlacklistServiceFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlacklistServiceFilter(BlacklistServiceCallServiceFilterConfiguration newBlacklistServiceFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_BlacklistServiceFilter(), newBlacklistServiceFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlacklistServiceFilter(BlacklistServiceCallServiceFilterConfiguration newBlacklistServiceFilter) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_BlacklistServiceFilter(), newBlacklistServiceFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CachingServiceCallServiceDiscoveryConfiguration getCachingServiceDiscovery() {
		return (CachingServiceCallServiceDiscoveryConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_CachingServiceDiscovery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCachingServiceDiscovery(CachingServiceCallServiceDiscoveryConfiguration newCachingServiceDiscovery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_CachingServiceDiscovery(), newCachingServiceDiscovery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCachingServiceDiscovery(CachingServiceCallServiceDiscoveryConfiguration newCachingServiceDiscovery) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_CachingServiceDiscovery(), newCachingServiceDiscovery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationDefinition getCamel() {
		return (ApplicationDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Camel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCamel(ApplicationDefinition newCamel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Camel(), newCamel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCamel(ApplicationDefinition newCamel) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Camel(), newCamel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelContextFactoryBean getCamelContext() {
		return (CamelContextFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_CamelContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCamelContext(CamelContextFactoryBean newCamelContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_CamelContext(), newCamelContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCamelContext(CamelContextFactoryBean newCamelContext) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_CamelContext(), newCamelContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CborDataFormat getCbor() {
		return (CborDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Cbor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCbor(CborDataFormat newCbor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Cbor(), newCbor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCbor(CborDataFormat newCbor) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Cbor(), newCbor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoiceDefinition getChoice() {
		return (ChoiceDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Choice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoice(ChoiceDefinition newChoice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Choice(), newChoice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChoice(ChoiceDefinition newChoice) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Choice(), newChoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitBreakerDefinition getCircuitBreaker() {
		return (CircuitBreakerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_CircuitBreaker(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuitBreaker(CircuitBreakerDefinition newCircuitBreaker, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_CircuitBreaker(), newCircuitBreaker, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCircuitBreaker(CircuitBreakerDefinition newCircuitBreaker) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_CircuitBreaker(), newCircuitBreaker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimCheckDefinition getClaimCheck() {
		return (ClaimCheckDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ClaimCheck(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimCheck(ClaimCheckDefinition newClaimCheck, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ClaimCheck(), newClaimCheck, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClaimCheck(ClaimCheckDefinition newClaimCheck) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ClaimCheck(), newClaimCheck);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombinedServiceCallServiceDiscoveryConfiguration getCombinedServiceDiscovery() {
		return (CombinedServiceCallServiceDiscoveryConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_CombinedServiceDiscovery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration newCombinedServiceDiscovery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_CombinedServiceDiscovery(), newCombinedServiceDiscovery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration newCombinedServiceDiscovery) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_CombinedServiceDiscovery(), newCombinedServiceDiscovery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombinedServiceCallServiceFilterConfiguration getCombinedServiceFilter() {
		return (CombinedServiceCallServiceFilterConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_CombinedServiceFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedServiceFilter(CombinedServiceCallServiceFilterConfiguration newCombinedServiceFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_CombinedServiceFilter(), newCombinedServiceFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCombinedServiceFilter(CombinedServiceCallServiceFilterConfiguration newCombinedServiceFilter) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_CombinedServiceFilter(), newCombinedServiceFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantExpression getConstant() {
		return (ConstantExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Constant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstant(ConstantExpression newConstant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Constant(), newConstant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstant(ConstantExpression newConstant) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Constant(), newConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsulServiceCallServiceDiscoveryConfiguration getConsulServiceDiscovery() {
		return (ConsulServiceCallServiceDiscoveryConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConsulServiceDiscovery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsulServiceDiscovery(ConsulServiceCallServiceDiscoveryConfiguration newConsulServiceDiscovery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConsulServiceDiscovery(), newConsulServiceDiscovery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsulServiceDiscovery(ConsulServiceCallServiceDiscoveryConfiguration newConsulServiceDiscovery) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConsulServiceDiscovery(), newConsulServiceDiscovery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelConsumerTemplateFactoryBean getConsumerTemplate() {
		return (CamelConsumerTemplateFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConsumerTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsumerTemplate(CamelConsumerTemplateFactoryBean newConsumerTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConsumerTemplate(), newConsumerTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumerTemplate(CamelConsumerTemplateFactoryBean newConsumerTemplate) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConsumerTemplate(), newConsumerTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextScanDefinition getContextScan() {
		return (ContextScanDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ContextScan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextScan(ContextScanDefinition newContextScan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ContextScan(), newContextScan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextScan(ContextScanDefinition newContextScan) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ContextScan(), newContextScan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConvertBodyDefinition getConvertBodyTo() {
		return (ConvertBodyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConvertBodyTo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConvertBodyTo(ConvertBodyDefinition newConvertBodyTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConvertBodyTo(), newConvertBodyTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConvertBodyTo(ConvertBodyDefinition newConvertBodyTo) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConvertBodyTo(), newConvertBodyTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConvertHeaderDefinition getConvertHeaderTo() {
		return (ConvertHeaderDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConvertHeaderTo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConvertHeaderTo(ConvertHeaderDefinition newConvertHeaderTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConvertHeaderTo(), newConvertHeaderTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConvertHeaderTo(ConvertHeaderDefinition newConvertHeaderTo) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConvertHeaderTo(), newConvertHeaderTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConvertVariableDefinition getConvertVariableTo() {
		return (ConvertVariableDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConvertVariableTo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConvertVariableTo(ConvertVariableDefinition newConvertVariableTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConvertVariableTo(), newConvertVariableTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConvertVariableTo(ConvertVariableDefinition newConvertVariableTo) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ConvertVariableTo(), newConvertVariableTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CryptoDataFormat getCrypto() {
		return (CryptoDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Crypto(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrypto(CryptoDataFormat newCrypto, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Crypto(), newCrypto, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrypto(CryptoDataFormat newCrypto) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Crypto(), newCrypto);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSimpleExpression getCsimple() {
		return (CSimpleExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Csimple(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsimple(CSimpleExpression newCsimple, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Csimple(), newCsimple, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsimple(CSimpleExpression newCsimple) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Csimple(), newCsimple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsvDataFormat getCsv() {
		return (CsvDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Csv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsv(CsvDataFormat newCsv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Csv(), newCsv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsv(CsvDataFormat newCsv) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Csv(), newCsv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomDataFormat getCustom() {
		return (CustomDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Custom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustom(CustomDataFormat newCustom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Custom(), newCustom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustom(CustomDataFormat newCustom) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Custom(), newCustom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomLoadBalancerDefinition getCustomLoadBalancer() {
		return (CustomLoadBalancerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomLoadBalancer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomLoadBalancer(CustomLoadBalancerDefinition newCustomLoadBalancer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomLoadBalancer(), newCustomLoadBalancer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomLoadBalancer(CustomLoadBalancerDefinition newCustomLoadBalancer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomLoadBalancer(), newCustomLoadBalancer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomServiceCallServiceFilterConfiguration getCustomServiceFilter() {
		return (CustomServiceCallServiceFilterConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomServiceFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomServiceFilter(CustomServiceCallServiceFilterConfiguration newCustomServiceFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomServiceFilter(), newCustomServiceFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomServiceFilter(CustomServiceCallServiceFilterConfiguration newCustomServiceFilter) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomServiceFilter(), newCustomServiceFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomTransformerDefinition getCustomTransformer() {
		return (CustomTransformerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomTransformer(CustomTransformerDefinition newCustomTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomTransformer(), newCustomTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTransformer(CustomTransformerDefinition newCustomTransformer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomTransformer(), newCustomTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomValidatorDefinition getCustomValidator() {
		return (CustomValidatorDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomValidator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomValidator(CustomValidatorDefinition newCustomValidator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomValidator(), newCustomValidator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomValidator(CustomValidatorDefinition newCustomValidator) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_CustomValidator(), newCustomValidator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFormatsDefinition getDataFormats() {
		return (DataFormatsDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_DataFormats(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataFormats(DataFormatsDefinition newDataFormats, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_DataFormats(), newDataFormats, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFormats(DataFormatsDefinition newDataFormats) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_DataFormats(), newDataFormats);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFormatTransformerDefinition getDataFormatTransformer() {
		return (DataFormatTransformerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_DataFormatTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataFormatTransformer(DataFormatTransformerDefinition newDataFormatTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_DataFormatTransformer(), newDataFormatTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFormatTransformer(DataFormatTransformerDefinition newDataFormatTransformer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_DataFormatTransformer(), newDataFormatTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasonnetExpression getDatasonnet() {
		return (DatasonnetExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Datasonnet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatasonnet(DatasonnetExpression newDatasonnet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Datasonnet(), newDatasonnet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatasonnet(DatasonnetExpression newDatasonnet) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Datasonnet(), newDatasonnet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeadLetterChannelDefinition getDeadLetterChannel() {
		return (DeadLetterChannelDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_DeadLetterChannel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeadLetterChannel(DeadLetterChannelDefinition newDeadLetterChannel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_DeadLetterChannel(), newDeadLetterChannel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadLetterChannel(DeadLetterChannelDefinition newDeadLetterChannel) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_DeadLetterChannel(), newDeadLetterChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultErrorHandlerDefinition getDefaultErrorHandler() {
		return (DefaultErrorHandlerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_DefaultErrorHandler(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultErrorHandler(DefaultErrorHandlerDefinition newDefaultErrorHandler, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_DefaultErrorHandler(), newDefaultErrorHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultErrorHandler(DefaultErrorHandlerDefinition newDefaultErrorHandler) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_DefaultErrorHandler(), newDefaultErrorHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultServiceCallServiceLoadBalancerConfiguration getDefaultLoadBalancer() {
		return (DefaultServiceCallServiceLoadBalancerConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_DefaultLoadBalancer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultLoadBalancer(DefaultServiceCallServiceLoadBalancerConfiguration newDefaultLoadBalancer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_DefaultLoadBalancer(), newDefaultLoadBalancer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultLoadBalancer(DefaultServiceCallServiceLoadBalancerConfiguration newDefaultLoadBalancer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_DefaultLoadBalancer(), newDefaultLoadBalancer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DelayDefinition getDelay() {
		return (DelayDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Delay(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelay(DelayDefinition newDelay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Delay(), newDelay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelay(DelayDefinition newDelay) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Delay(), newDelay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteDefinition getDelete() {
		return (DeleteDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Delete(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(DeleteDefinition newDelete, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Delete(), newDelete, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelete(DeleteDefinition newDelete) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Delete(), newDelete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DfdlDataFormat getDfdl() {
		return (DfdlDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Dfdl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDfdl(DfdlDataFormat newDfdl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Dfdl(), newDfdl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDfdl(DfdlDataFormat newDfdl) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Dfdl(), newDfdl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DnsServiceCallServiceDiscoveryConfiguration getDnsServiceDiscovery() {
		return (DnsServiceCallServiceDiscoveryConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_DnsServiceDiscovery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDnsServiceDiscovery(DnsServiceCallServiceDiscoveryConfiguration newDnsServiceDiscovery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_DnsServiceDiscovery(), newDnsServiceDiscovery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDnsServiceDiscovery(DnsServiceCallServiceDiscoveryConfiguration newDnsServiceDiscovery) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_DnsServiceDiscovery(), newDnsServiceDiscovery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatchDefinition getDoCatch() {
		return (CatchDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_DoCatch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoCatch(CatchDefinition newDoCatch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_DoCatch(), newDoCatch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoCatch(CatchDefinition newDoCatch) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_DoCatch(), newDoCatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinallyDefinition getDoFinally() {
		return (FinallyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_DoFinally(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoFinally(FinallyDefinition newDoFinally, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_DoFinally(), newDoFinally, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoFinally(FinallyDefinition newDoFinally) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_DoFinally(), newDoFinally);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TryDefinition getDoTry() {
		return (TryDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_DoTry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoTry(TryDefinition newDoTry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_DoTry(), newDoTry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoTry(TryDefinition newDoTry) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_DoTry(), newDoTry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicRouterDefinition getDynamicRouter() {
		return (DynamicRouterDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_DynamicRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicRouter(DynamicRouterDefinition newDynamicRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_DynamicRouter(), newDynamicRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamicRouter(DynamicRouterDefinition newDynamicRouter) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_DynamicRouter(), newDynamicRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelEndpointFactoryBean getEndpoint() {
		return (CamelEndpointFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Endpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(CamelEndpointFactoryBean newEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Endpoint(), newEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpoint(CamelEndpointFactoryBean newEndpoint) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Endpoint(), newEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointTransformerDefinition getEndpointTransformer() {
		return (EndpointTransformerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_EndpointTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointTransformer(EndpointTransformerDefinition newEndpointTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_EndpointTransformer(), newEndpointTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointTransformer(EndpointTransformerDefinition newEndpointTransformer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_EndpointTransformer(), newEndpointTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointValidatorDefinition getEndpointValidator() {
		return (EndpointValidatorDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_EndpointValidator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointValidator(EndpointValidatorDefinition newEndpointValidator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_EndpointValidator(), newEndpointValidator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointValidator(EndpointValidatorDefinition newEndpointValidator) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_EndpointValidator(), newEndpointValidator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnrichDefinition getEnrich() {
		return (EnrichDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Enrich(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrich(EnrichDefinition newEnrich, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Enrich(), newEnrich, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnrich(EnrichDefinition newEnrich) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Enrich(), newEnrich);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getErrorHandler() {
		return (EObject)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ErrorHandler(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorHandler(EObject newErrorHandler, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ErrorHandler(), newErrorHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorHandler(EObject newErrorHandler) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ErrorHandler(), newErrorHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExchangePropertyExpression getExchangeProperty() {
		return (ExchangePropertyExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ExchangeProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExchangeProperty(ExchangePropertyExpression newExchangeProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ExchangeProperty(), newExchangeProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExchangeProperty(ExchangePropertyExpression newExchangeProperty) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ExchangeProperty(), newExchangeProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionSubElementDefinition getExpression() {
		return (ExpressionSubElementDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ExpressionSubElementDefinition newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(ExpressionSubElementDefinition newExpression) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpressionDefinition() {
		return (Expression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionDefinition(Expression newExpressionDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(), newExpressionDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionDefinition(Expression newExpressionDefinition) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(), newExpressionDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FailoverLoadBalancerDefinition getFailoverLoadBalancer() {
		return (FailoverLoadBalancerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_FailoverLoadBalancer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailoverLoadBalancer(FailoverLoadBalancerDefinition newFailoverLoadBalancer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_FailoverLoadBalancer(), newFailoverLoadBalancer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailoverLoadBalancer(FailoverLoadBalancerDefinition newFailoverLoadBalancer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_FailoverLoadBalancer(), newFailoverLoadBalancer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaultToleranceConfigurationDefinition getFaultToleranceConfiguration() {
		return (FaultToleranceConfigurationDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_FaultToleranceConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultToleranceConfiguration(FaultToleranceConfigurationDefinition newFaultToleranceConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_FaultToleranceConfiguration(), newFaultToleranceConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFaultToleranceConfiguration(FaultToleranceConfigurationDefinition newFaultToleranceConfiguration) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_FaultToleranceConfiguration(), newFaultToleranceConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FhirJsonDataFormat getFhirJson() {
		return (FhirJsonDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_FhirJson(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFhirJson(FhirJsonDataFormat newFhirJson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_FhirJson(), newFhirJson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFhirJson(FhirJsonDataFormat newFhirJson) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_FhirJson(), newFhirJson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FhirXmlDataFormat getFhirXml() {
		return (FhirXmlDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_FhirXml(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFhirXml(FhirXmlDataFormat newFhirXml, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_FhirXml(), newFhirXml, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFhirXml(FhirXmlDataFormat newFhirXml) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_FhirXml(), newFhirXml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterDefinition getFilter() {
		return (FilterDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Filter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterDefinition newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Filter(), newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(FilterDefinition newFilter) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Filter(), newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlatpackDataFormat getFlatpack() {
		return (FlatpackDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Flatpack(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlatpack(FlatpackDataFormat newFlatpack, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Flatpack(), newFlatpack, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlatpack(FlatpackDataFormat newFlatpack) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Flatpack(), newFlatpack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelFluentProducerTemplateFactoryBean getFluentTemplate() {
		return (CamelFluentProducerTemplateFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_FluentTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFluentTemplate(CamelFluentProducerTemplateFactoryBean newFluentTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_FluentTemplate(), newFluentTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFluentTemplate(CamelFluentProducerTemplateFactoryBean newFluentTemplate) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_FluentTemplate(), newFluentTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForyDataFormat getFory() {
		return (ForyDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Fory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFory(ForyDataFormat newFory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Fory(), newFory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFory(ForyDataFormat newFory) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Fory(), newFory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromDefinition getFrom() {
		return (FromDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_From(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(FromDefinition newFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_From(), newFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(FromDefinition newFrom) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_From(), newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetDefinition getGet() {
		return (GetDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Get(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGet(GetDefinition newGet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Get(), newGet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGet(GetDefinition newGet) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Get(), newGet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalOptionDefinition getGlobalOption() {
		return (GlobalOptionDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_GlobalOption(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalOption(GlobalOptionDefinition newGlobalOption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_GlobalOption(), newGlobalOption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalOption(GlobalOptionDefinition newGlobalOption) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_GlobalOption(), newGlobalOption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalOptionsDefinition getGlobalOptions() {
		return (GlobalOptionsDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_GlobalOptions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalOptions(GlobalOptionsDefinition newGlobalOptions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_GlobalOptions(), newGlobalOptions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalOptions(GlobalOptionsDefinition newGlobalOptions) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_GlobalOptions(), newGlobalOptions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrokDataFormat getGrok() {
		return (GrokDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Grok(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrok(GrokDataFormat newGrok, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Grok(), newGrok, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrok(GrokDataFormat newGrok) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Grok(), newGrok);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroovyExpression getGroovy() {
		return (GroovyExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Groovy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroovy(GroovyExpression newGroovy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Groovy(), newGroovy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroovy(GroovyExpression newGroovy) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Groovy(), newGroovy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GzipDeflaterDataFormat getGzipDeflater() {
		return (GzipDeflaterDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_GzipDeflater(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGzipDeflater(GzipDeflaterDataFormat newGzipDeflater, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_GzipDeflater(), newGzipDeflater, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGzipDeflater(GzipDeflaterDataFormat newGzipDeflater) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_GzipDeflater(), newGzipDeflater);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadDefinition getHead() {
		return (HeadDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Head(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(HeadDefinition newHead, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Head(), newHead, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHead(HeadDefinition newHead) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Head(), newHead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeaderExpression getHeader() {
		return (HeaderExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Header(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderExpression newHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Header(), newHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(HeaderExpression newHeader) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Header(), newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthyServiceCallServiceFilterConfiguration getHealthyServiceFilter() {
		return (HealthyServiceCallServiceFilterConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_HealthyServiceFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthyServiceFilter(HealthyServiceCallServiceFilterConfiguration newHealthyServiceFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_HealthyServiceFilter(), newHealthyServiceFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthyServiceFilter(HealthyServiceCallServiceFilterConfiguration newHealthyServiceFilter) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_HealthyServiceFilter(), newHealthyServiceFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl7DataFormat getHl7() {
		return (Hl7DataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Hl7(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHl7(Hl7DataFormat newHl7, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Hl7(), newHl7, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHl7(Hl7DataFormat newHl7) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Hl7(), newHl7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl7TerserExpression getHl7terser() {
		return (Hl7TerserExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Hl7terser(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHl7terser(Hl7TerserExpression newHl7terser, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Hl7terser(), newHl7terser, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHl7terser(Hl7TerserExpression newHl7terser) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Hl7terser(), newHl7terser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IcalDataFormat getIcal() {
		return (IcalDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Ical(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcal(IcalDataFormat newIcal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Ical(), newIcal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcal(IcalDataFormat newIcal) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Ical(), newIcal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdempotentConsumerDefinition getIdempotentConsumer() {
		return (IdempotentConsumerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_IdempotentConsumer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdempotentConsumer(IdempotentConsumerDefinition newIdempotentConsumer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_IdempotentConsumer(), newIdempotentConsumer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdempotentConsumer(IdempotentConsumerDefinition newIdempotentConsumer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_IdempotentConsumer(), newIdempotentConsumer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputTypeDefinition getInputType() {
		return (InputTypeDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_InputType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputType(InputTypeDefinition newInputType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_InputType(), newInputType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputType(InputTypeDefinition newInputType) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_InputType(), newInputType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterceptDefinition getIntercept() {
		return (InterceptDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Intercept(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntercept(InterceptDefinition newIntercept, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Intercept(), newIntercept, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntercept(InterceptDefinition newIntercept) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Intercept(), newIntercept);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterceptFromDefinition getInterceptFrom() {
		return (InterceptFromDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_InterceptFrom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterceptFrom(InterceptFromDefinition newInterceptFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_InterceptFrom(), newInterceptFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterceptFrom(InterceptFromDefinition newInterceptFrom) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_InterceptFrom(), newInterceptFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterceptSendToEndpointDefinition getInterceptSendToEndpoint() {
		return (InterceptSendToEndpointDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_InterceptSendToEndpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterceptSendToEndpoint(InterceptSendToEndpointDefinition newInterceptSendToEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_InterceptSendToEndpoint(), newInterceptSendToEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterceptSendToEndpoint(InterceptSendToEndpointDefinition newInterceptSendToEndpoint) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_InterceptSendToEndpoint(), newInterceptSendToEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iso8583DataFormat getIso8583() {
		return (Iso8583DataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Iso8583(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIso8583(Iso8583DataFormat newIso8583, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Iso8583(), newIso8583, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIso8583(Iso8583DataFormat newIso8583) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Iso8583(), newIso8583);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JacksonXMLDataFormat getJacksonXml() {
		return (JacksonXMLDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_JacksonXml(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJacksonXml(JacksonXMLDataFormat newJacksonXml, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_JacksonXml(), newJacksonXml, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJacksonXml(JacksonXMLDataFormat newJacksonXml) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_JacksonXml(), newJacksonXml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaExpression getJava() {
		return (JavaExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Java(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJava(JavaExpression newJava, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Java(), newJava, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJava(JavaExpression newJava) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Java(), newJava);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JaxbDataFormat getJaxb() {
		return (JaxbDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Jaxb(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJaxb(JaxbDataFormat newJaxb, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Jaxb(), newJaxb, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJaxb(JaxbDataFormat newJaxb) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Jaxb(), newJaxb);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelJMXAgentDefinition getJmxAgent() {
		return (CamelJMXAgentDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_JmxAgent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJmxAgent(CamelJMXAgentDefinition newJmxAgent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_JmxAgent(), newJmxAgent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJmxAgent(CamelJMXAgentDefinition newJmxAgent) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_JmxAgent(), newJmxAgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JoorExpression getJoor() {
		return (JoorExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Joor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoor(JoorExpression newJoor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Joor(), newJoor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoor(JoorExpression newJoor) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Joor(), newJoor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JqExpression getJq() {
		return (JqExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Jq(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJq(JqExpression newJq, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Jq(), newJq, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJq(JqExpression newJq) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Jq(), newJq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaScriptExpression getJs() {
		return (JavaScriptExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Js(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJs(JavaScriptExpression newJs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Js(), newJs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJs(JavaScriptExpression newJs) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Js(), newJs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonDataFormat getJson() {
		return (JsonDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Json(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJson(JsonDataFormat newJson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Json(), newJson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJson(JsonDataFormat newJson) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Json(), newJson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonApiDataFormat getJsonApi() {
		return (JsonApiDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_JsonApi(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJsonApi(JsonApiDataFormat newJsonApi, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_JsonApi(), newJsonApi, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonApi(JsonApiDataFormat newJsonApi) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_JsonApi(), newJsonApi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonPathExpression getJsonpath() {
		return (JsonPathExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Jsonpath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJsonpath(JsonPathExpression newJsonpath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Jsonpath(), newJsonpath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonpath(JsonPathExpression newJsonpath) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Jsonpath(), newJsonpath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JtaTransactionErrorHandlerDefinition getJtaTransactionErrorHandler() {
		return (JtaTransactionErrorHandlerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_JtaTransactionErrorHandler(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJtaTransactionErrorHandler(JtaTransactionErrorHandlerDefinition newJtaTransactionErrorHandler, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_JtaTransactionErrorHandler(), newJtaTransactionErrorHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJtaTransactionErrorHandler(JtaTransactionErrorHandlerDefinition newJtaTransactionErrorHandler) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_JtaTransactionErrorHandler(), newJtaTransactionErrorHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KameletDefinition getKamelet() {
		return (KameletDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Kamelet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKamelet(KameletDefinition newKamelet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Kamelet(), newKamelet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKamelet(KameletDefinition newKamelet) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Kamelet(), newKamelet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyStoreParametersFactoryBean getKeyStoreParameters() {
		return (KeyStoreParametersFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_KeyStoreParameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyStoreParameters(KeyStoreParametersFactoryBean newKeyStoreParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_KeyStoreParameters(), newKeyStoreParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyStoreParameters(KeyStoreParametersFactoryBean newKeyStoreParameters) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_KeyStoreParameters(), newKeyStoreParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesServiceCallServiceDiscoveryConfiguration getKubernetesServiceDiscovery() {
		return (KubernetesServiceCallServiceDiscoveryConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_KubernetesServiceDiscovery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration newKubernetesServiceDiscovery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_KubernetesServiceDiscovery(), newKubernetesServiceDiscovery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration newKubernetesServiceDiscovery) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_KubernetesServiceDiscovery(), newKubernetesServiceDiscovery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JCharacterTokenizerDefinition getLangChain4jCharacterTokenizer() {
		return (LangChain4JCharacterTokenizerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jCharacterTokenizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangChain4jCharacterTokenizer(LangChain4JCharacterTokenizerDefinition newLangChain4jCharacterTokenizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jCharacterTokenizer(), newLangChain4jCharacterTokenizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangChain4jCharacterTokenizer(LangChain4JCharacterTokenizerDefinition newLangChain4jCharacterTokenizer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jCharacterTokenizer(), newLangChain4jCharacterTokenizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JLineTokenizerDefinition getLangChain4jLineTokenizer() {
		return (LangChain4JLineTokenizerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jLineTokenizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangChain4jLineTokenizer(LangChain4JLineTokenizerDefinition newLangChain4jLineTokenizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jLineTokenizer(), newLangChain4jLineTokenizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangChain4jLineTokenizer(LangChain4JLineTokenizerDefinition newLangChain4jLineTokenizer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jLineTokenizer(), newLangChain4jLineTokenizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JParagraphTokenizerDefinition getLangChain4jParagraphTokenizer() {
		return (LangChain4JParagraphTokenizerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jParagraphTokenizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangChain4jParagraphTokenizer(LangChain4JParagraphTokenizerDefinition newLangChain4jParagraphTokenizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jParagraphTokenizer(), newLangChain4jParagraphTokenizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangChain4jParagraphTokenizer(LangChain4JParagraphTokenizerDefinition newLangChain4jParagraphTokenizer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jParagraphTokenizer(), newLangChain4jParagraphTokenizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JSentenceTokenizerDefinition getLangChain4jSentenceTokenizer() {
		return (LangChain4JSentenceTokenizerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jSentenceTokenizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangChain4jSentenceTokenizer(LangChain4JSentenceTokenizerDefinition newLangChain4jSentenceTokenizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jSentenceTokenizer(), newLangChain4jSentenceTokenizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangChain4jSentenceTokenizer(LangChain4JSentenceTokenizerDefinition newLangChain4jSentenceTokenizer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jSentenceTokenizer(), newLangChain4jSentenceTokenizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LangChain4JWordTokenizerDefinition getLangChain4jWordTokenizer() {
		return (LangChain4JWordTokenizerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jWordTokenizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangChain4jWordTokenizer(LangChain4JWordTokenizerDefinition newLangChain4jWordTokenizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jWordTokenizer(), newLangChain4jWordTokenizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangChain4jWordTokenizer(LangChain4JWordTokenizerDefinition newLangChain4jWordTokenizer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_LangChain4jWordTokenizer(), newLangChain4jWordTokenizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageExpression getLanguage() {
		return (LanguageExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Language(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(LanguageExpression newLanguage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Language(), newLanguage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(LanguageExpression newLanguage) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Language(), newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalanceDefinition getLoadBalance() {
		return (LoadBalanceDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_LoadBalance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadBalance(LoadBalanceDefinition newLoadBalance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_LoadBalance(), newLoadBalance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalance(LoadBalanceDefinition newLoadBalance) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_LoadBalance(), newLoadBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallServiceLoadBalancerConfiguration getLoadBalancerConfiguration() {
		return (ServiceCallServiceLoadBalancerConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_LoadBalancerConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadBalancerConfiguration(ServiceCallServiceLoadBalancerConfiguration newLoadBalancerConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_LoadBalancerConfiguration(), newLoadBalancerConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalancerConfiguration(ServiceCallServiceLoadBalancerConfiguration newLoadBalancerConfiguration) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_LoadBalancerConfiguration(), newLoadBalancerConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadTransformerDefinition getLoadTransformer() {
		return (LoadTransformerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_LoadTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadTransformer(LoadTransformerDefinition newLoadTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_LoadTransformer(), newLoadTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadTransformer(LoadTransformerDefinition newLoadTransformer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_LoadTransformer(), newLoadTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogDefinition getLog() {
		return (LogDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Log(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLog(LogDefinition newLog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Log(), newLog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLog(LogDefinition newLog) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Log(), newLog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoopDefinition getLoop() {
		return (LoopDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Loop(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoop(LoopDefinition newLoop, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Loop(), newLoop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoop(LoopDefinition newLoop) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Loop(), newLoop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LzfDataFormat getLzf() {
		return (LzfDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Lzf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLzf(LzfDataFormat newLzf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Lzf(), newLzf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLzf(LzfDataFormat newLzf) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Lzf(), newLzf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarshalDefinition getMarshal() {
		return (MarshalDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Marshal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarshal(MarshalDefinition newMarshal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Marshal(), newMarshal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarshal(MarshalDefinition newMarshal) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Marshal(), newMarshal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodCallExpression getMethod() {
		return (MethodCallExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Method(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(MethodCallExpression newMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Method(), newMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(MethodCallExpression newMethod) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Method(), newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeMultipartDataFormat getMimeMultipart() {
		return (MimeMultipartDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_MimeMultipart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMimeMultipart(MimeMultipartDataFormat newMimeMultipart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_MimeMultipart(), newMimeMultipart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeMultipart(MimeMultipartDataFormat newMimeMultipart) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_MimeMultipart(), newMimeMultipart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MulticastDefinition getMulticast() {
		return (MulticastDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Multicast(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMulticast(MulticastDefinition newMulticast, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Multicast(), newMulticast, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMulticast(MulticastDefinition newMulticast) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Multicast(), newMulticast);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MutualTLSDefinition getMutualTLS() {
		return (MutualTLSDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_MutualTLS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMutualTLS(MutualTLSDefinition newMutualTLS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_MutualTLS(), newMutualTLS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutualTLS(MutualTLSDefinition newMutualTLS) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_MutualTLS(), newMutualTLS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MvelExpression getMvel() {
		return (MvelExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Mvel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMvel(MvelExpression newMvel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Mvel(), newMvel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMvel(MvelExpression newMvel) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Mvel(), newMvel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoErrorHandlerDefinition getNoErrorHandler() {
		return (NoErrorHandlerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_NoErrorHandler(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoErrorHandler(NoErrorHandlerDefinition newNoErrorHandler, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_NoErrorHandler(), newNoErrorHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoErrorHandler(NoErrorHandlerDefinition newNoErrorHandler) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_NoErrorHandler(), newNoErrorHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OAuth2Definition getOauth2() {
		return (OAuth2Definition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Oauth2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOauth2(OAuth2Definition newOauth2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Oauth2(), newOauth2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOauth2(OAuth2Definition newOauth2) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Oauth2(), newOauth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OgnlExpression getOgnl() {
		return (OgnlExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Ognl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOgnl(OgnlExpression newOgnl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Ognl(), newOgnl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOgnl(OgnlExpression newOgnl) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Ognl(), newOgnl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnCompletionDefinition getOnCompletion() {
		return (OnCompletionDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnCompletion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnCompletion(OnCompletionDefinition newOnCompletion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnCompletion(), newOnCompletion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnCompletion(OnCompletionDefinition newOnCompletion) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnCompletion(), newOnCompletion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnExceptionDefinition getOnException() {
		return (OnExceptionDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnException(OnExceptionDefinition newOnException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnException(), newOnException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnException(OnExceptionDefinition newOnException) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnException(), newOnException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnFallbackDefinition getOnFallback() {
		return (OnFallbackDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnFallback(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnFallback(OnFallbackDefinition newOnFallback, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnFallback(), newOnFallback, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnFallback(OnFallbackDefinition newOnFallback) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnFallback(), newOnFallback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnWhenDefinition getOnWhen() {
		return (OnWhenDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnWhen(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnWhen(OnWhenDefinition newOnWhen, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnWhen(), newOnWhen, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnWhen(OnWhenDefinition newOnWhen) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_OnWhen(), newOnWhen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenApiDefinition getOpenApi() {
		return (OpenApiDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_OpenApi(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenApi(OpenApiDefinition newOpenApi, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_OpenApi(), newOpenApi, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenApi(OpenApiDefinition newOpenApi) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_OpenApi(), newOpenApi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenIdConnectDefinition getOpenIdConnect() {
		return (OpenIdConnectDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_OpenIdConnect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenIdConnect(OpenIdConnectDefinition newOpenIdConnect, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_OpenIdConnect(), newOpenIdConnect, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenIdConnect(OpenIdConnectDefinition newOpenIdConnect) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_OpenIdConnect(), newOpenIdConnect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptimisticLockRetryPolicyDefinition getOptimisticLockRetryPolicy() {
		return (OptimisticLockRetryPolicyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_OptimisticLockRetryPolicy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptimisticLockRetryPolicy(OptimisticLockRetryPolicyDefinition newOptimisticLockRetryPolicy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_OptimisticLockRetryPolicy(), newOptimisticLockRetryPolicy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptimisticLockRetryPolicy(OptimisticLockRetryPolicyDefinition newOptimisticLockRetryPolicy) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_OptimisticLockRetryPolicy(), newOptimisticLockRetryPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherwiseDefinition getOtherwise() {
		return (OtherwiseDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Otherwise(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwise(OtherwiseDefinition newOtherwise, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Otherwise(), newOtherwise, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherwise(OtherwiseDefinition newOtherwise) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Otherwise(), newOtherwise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputTypeDefinition getOutputType() {
		return (OutputTypeDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_OutputType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputType(OutputTypeDefinition newOutputType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_OutputType(), newOutputType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputType(OutputTypeDefinition newOutputType) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_OutputType(), newOutputType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageScanDefinition getPackageScan() {
		return (PackageScanDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_PackageScan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageScan(PackageScanDefinition newPackageScan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_PackageScan(), newPackageScan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageScan(PackageScanDefinition newPackageScan) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_PackageScan(), newPackageScan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParamDefinition getParam() {
		return (ParamDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Param(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParam(ParamDefinition newParam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Param(), newParam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParam(ParamDefinition newParam) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Param(), newParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParquetAvroDataFormat getParquetAvro() {
		return (ParquetAvroDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ParquetAvro(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParquetAvro(ParquetAvroDataFormat newParquetAvro, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ParquetAvro(), newParquetAvro, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParquetAvro(ParquetAvroDataFormat newParquetAvro) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ParquetAvro(), newParquetAvro);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassThroughServiceCallServiceFilterConfiguration getPassThroughServiceFilter() {
		return (PassThroughServiceCallServiceFilterConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_PassThroughServiceFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassThroughServiceFilter(PassThroughServiceCallServiceFilterConfiguration newPassThroughServiceFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_PassThroughServiceFilter(), newPassThroughServiceFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassThroughServiceFilter(PassThroughServiceCallServiceFilterConfiguration newPassThroughServiceFilter) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_PassThroughServiceFilter(), newPassThroughServiceFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatchDefinition getPatch() {
		return (PatchDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Patch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatch(PatchDefinition newPatch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Patch(), newPatch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatch(PatchDefinition newPatch) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Patch(), newPatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PausableDefinition getPausable() {
		return (PausableDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Pausable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPausable(PausableDefinition newPausable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Pausable(), newPausable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPausable(PausableDefinition newPausable) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Pausable(), newPausable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PgpDataFormat getPgp() {
		return (PgpDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Pgp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPgp(PgpDataFormat newPgp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Pgp(), newPgp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPgp(PgpDataFormat newPgp) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Pgp(), newPgp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelineDefinition getPipeline() {
		return (PipelineDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Pipeline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPipeline(PipelineDefinition newPipeline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Pipeline(), newPipeline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPipeline(PipelineDefinition newPipeline) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Pipeline(), newPipeline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyDefinition getPolicy() {
		return (PolicyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Policy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicy(PolicyDefinition newPolicy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Policy(), newPolicy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicy(PolicyDefinition newPolicy) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Policy(), newPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PollDefinition getPoll() {
		return (PollDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Poll(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoll(PollDefinition newPoll, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Poll(), newPoll, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoll(PollDefinition newPoll) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Poll(), newPoll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PollEnrichDefinition getPollEnrich() {
		return (PollEnrichDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_PollEnrich(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPollEnrich(PollEnrichDefinition newPollEnrich, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_PollEnrich(), newPollEnrich, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPollEnrich(PollEnrichDefinition newPollEnrich) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_PollEnrich(), newPollEnrich);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostDefinition getPost() {
		return (PostDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Post(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(PostDefinition newPost, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Post(), newPost, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPost(PostDefinition newPost) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Post(), newPost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateValidatorDefinition getPredicateValidator() {
		return (PredicateValidatorDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_PredicateValidator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicateValidator(PredicateValidatorDefinition newPredicateValidator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_PredicateValidator(), newPredicateValidator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredicateValidator(PredicateValidatorDefinition newPredicateValidator) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_PredicateValidator(), newPredicateValidator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessDefinition getProcess() {
		return (ProcessDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Process(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(ProcessDefinition newProcess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Process(), newProcess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcess(ProcessDefinition newProcess) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Process(), newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelPropertyPlaceholderFunctionDefinition getPropertiesFunction() {
		return (CamelPropertyPlaceholderFunctionDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertiesFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertiesFunction(CamelPropertyPlaceholderFunctionDefinition newPropertiesFunction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertiesFunction(), newPropertiesFunction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertiesFunction(CamelPropertyPlaceholderFunctionDefinition newPropertiesFunction) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertiesFunction(), newPropertiesFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelPropertyPlaceholderLocationDefinition getPropertiesLocation() {
		return (CamelPropertyPlaceholderLocationDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertiesLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertiesLocation(CamelPropertyPlaceholderLocationDefinition newPropertiesLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertiesLocation(), newPropertiesLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertiesLocation(CamelPropertyPlaceholderLocationDefinition newPropertiesLocation) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertiesLocation(), newPropertiesLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinition getProperty() {
		return (PropertyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Property(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyDefinition newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Property(), newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(PropertyDefinition newProperty) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Property(), newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyExpressionDefinition getPropertyExpression() {
		return (PropertyExpressionDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertyExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyExpression(PropertyExpressionDefinition newPropertyExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertyExpression(), newPropertyExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyExpression(PropertyExpressionDefinition newPropertyExpression) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertyExpression(), newPropertyExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelPropertyPlaceholderDefinition getPropertyPlaceholder() {
		return (CamelPropertyPlaceholderDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertyPlaceholder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyPlaceholder(CamelPropertyPlaceholderDefinition newPropertyPlaceholder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertyPlaceholder(), newPropertyPlaceholder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyPlaceholder(CamelPropertyPlaceholderDefinition newPropertyPlaceholder) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_PropertyPlaceholder(), newPropertyPlaceholder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtobufDataFormat getProtobuf() {
		return (ProtobufDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Protobuf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtobuf(ProtobufDataFormat newProtobuf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Protobuf(), newProtobuf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtobuf(ProtobufDataFormat newProtobuf) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Protobuf(), newProtobuf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PutDefinition getPut() {
		return (PutDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Put(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPut(PutDefinition newPut, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Put(), newPut, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPut(PutDefinition newPut) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Put(), newPut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PythonExpression getPython() {
		return (PythonExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Python(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPython(PythonExpression newPython, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Python(), newPython, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPython(PythonExpression newPython) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Python(), newPython);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RandomLoadBalancerDefinition getRandomLoadBalancer() {
		return (RandomLoadBalancerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RandomLoadBalancer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRandomLoadBalancer(RandomLoadBalancerDefinition newRandomLoadBalancer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RandomLoadBalancer(), newRandomLoadBalancer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRandomLoadBalancer(RandomLoadBalancerDefinition newRandomLoadBalancer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RandomLoadBalancer(), newRandomLoadBalancer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecipientListDefinition getRecipientList() {
		return (RecipientListDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RecipientList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipientList(RecipientListDefinition newRecipientList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RecipientList(), newRecipientList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecipientList(RecipientListDefinition newRecipientList) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RecipientList(), newRecipientList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedeliveryPolicyDefinition getRedeliveryPolicy() {
		return (RedeliveryPolicyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedeliveryPolicy(RedeliveryPolicyDefinition newRedeliveryPolicy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicy(), newRedeliveryPolicy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedeliveryPolicy(RedeliveryPolicyDefinition newRedeliveryPolicy) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicy(), newRedeliveryPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRedeliveryPolicyFactoryBean getRedeliveryPolicyProfile() {
		return (CamelRedeliveryPolicyFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicyProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedeliveryPolicyProfile(CamelRedeliveryPolicyFactoryBean newRedeliveryPolicyProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicyProfile(), newRedeliveryPolicyProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedeliveryPolicyProfile(CamelRedeliveryPolicyFactoryBean newRedeliveryPolicyProfile) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicyProfile(), newRedeliveryPolicyProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefExpression getRef() {
		return (RefExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Ref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRef(RefExpression newRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Ref(), newRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(RefExpression newRef) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Ref(), newRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefErrorHandlerDefinition getRefErrorHandler() {
		return (RefErrorHandlerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RefErrorHandler(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefErrorHandler(RefErrorHandlerDefinition newRefErrorHandler, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RefErrorHandler(), newRefErrorHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefErrorHandler(RefErrorHandlerDefinition newRefErrorHandler) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RefErrorHandler(), newRefErrorHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveHeaderDefinition getRemoveHeader() {
		return (RemoveHeaderDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveHeader(RemoveHeaderDefinition newRemoveHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveHeader(), newRemoveHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveHeader(RemoveHeaderDefinition newRemoveHeader) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveHeader(), newRemoveHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveHeadersDefinition getRemoveHeaders() {
		return (RemoveHeadersDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveHeaders(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveHeaders(RemoveHeadersDefinition newRemoveHeaders, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveHeaders(), newRemoveHeaders, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveHeaders(RemoveHeadersDefinition newRemoveHeaders) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveHeaders(), newRemoveHeaders);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemovePropertiesDefinition getRemoveProperties() {
		return (RemovePropertiesDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveProperties(RemovePropertiesDefinition newRemoveProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveProperties(), newRemoveProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveProperties(RemovePropertiesDefinition newRemoveProperties) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveProperties(), newRemoveProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemovePropertyDefinition getRemoveProperty() {
		return (RemovePropertyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveProperty(RemovePropertyDefinition newRemoveProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveProperty(), newRemoveProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveProperty(RemovePropertyDefinition newRemoveProperty) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveProperty(), newRemoveProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveVariableDefinition getRemoveVariable() {
		return (RemoveVariableDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveVariable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveVariable(RemoveVariableDefinition newRemoveVariable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveVariable(), newRemoveVariable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveVariable(RemoveVariableDefinition newRemoveVariable) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RemoveVariable(), newRemoveVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResequenceDefinition getResequence() {
		return (ResequenceDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Resequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResequence(ResequenceDefinition newResequence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Resequence(), newResequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResequence(ResequenceDefinition newResequence) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Resequence(), newResequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resilience4JConfigurationDefinition getResilience4jConfiguration() {
		return (Resilience4JConfigurationDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Resilience4jConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResilience4jConfiguration(Resilience4JConfigurationDefinition newResilience4jConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Resilience4jConfiguration(), newResilience4jConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResilience4jConfiguration(Resilience4JConfigurationDefinition newResilience4jConfiguration) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Resilience4jConfiguration(), newResilience4jConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseHeaderDefinition getResponseHeader() {
		return (ResponseHeaderDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ResponseHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseHeader(ResponseHeaderDefinition newResponseHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ResponseHeader(), newResponseHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseHeader(ResponseHeaderDefinition newResponseHeader) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ResponseHeader(), newResponseHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseMessageDefinition getResponseMessage() {
		return (ResponseMessageDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ResponseMessage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseMessage(ResponseMessageDefinition newResponseMessage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ResponseMessage(), newResponseMessage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseMessage(ResponseMessageDefinition newResponseMessage) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ResponseMessage(), newResponseMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestDefinition getRest() {
		return (RestDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRest(RestDefinition newRest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rest(), newRest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRest(RestDefinition newRest) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rest(), newRest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestBindingDefinition getRestBinding() {
		return (RestBindingDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestBinding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestBinding(RestBindingDefinition newRestBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestBinding(), newRestBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestBinding(RestBindingDefinition newRestBinding) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestBinding(), newRestBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestConfigurationDefinition getRestConfiguration() {
		return (RestConfigurationDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestConfiguration(RestConfigurationDefinition newRestConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestConfiguration(), newRestConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestConfiguration(RestConfigurationDefinition newRestConfiguration) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestConfiguration(), newRestConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRestContextFactoryBean getRestContext() {
		return (CamelRestContextFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestContext(CamelRestContextFactoryBean newRestContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestContext(), newRestContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestContext(CamelRestContextFactoryBean newRestContext) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestContext(), newRestContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestContextRefDefinition getRestContextRef() {
		return (RestContextRefDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestContextRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestContextRef(RestContextRefDefinition newRestContextRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestContextRef(), newRestContextRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestContextRef(RestContextRefDefinition newRestContextRef) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestContextRef(), newRestContextRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestPropertyDefinition getRestProperty() {
		return (RestPropertyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestProperty(RestPropertyDefinition newRestProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestProperty(), newRestProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestProperty(RestPropertyDefinition newRestProperty) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RestProperty(), newRestProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestsDefinition getRests() {
		return (RestsDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rests(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRests(RestsDefinition newRests, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rests(), newRests, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRests(RestsDefinition newRests) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rests(), newRests);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResumableDefinition getResumable() {
		return (ResumableDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Resumable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResumable(ResumableDefinition newResumable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Resumable(), newResumable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResumable(ResumableDefinition newResumable) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Resumable(), newResumable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RollbackDefinition getRollback() {
		return (RollbackDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rollback(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollback(RollbackDefinition newRollback, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rollback(), newRollback, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRollback(RollbackDefinition newRollback) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rollback(), newRollback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoundRobinLoadBalancerDefinition getRoundRobinLoadBalancer() {
		return (RoundRobinLoadBalancerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RoundRobinLoadBalancer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoundRobinLoadBalancer(RoundRobinLoadBalancerDefinition newRoundRobinLoadBalancer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RoundRobinLoadBalancer(), newRoundRobinLoadBalancer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoundRobinLoadBalancer(RoundRobinLoadBalancerDefinition newRoundRobinLoadBalancer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RoundRobinLoadBalancer(), newRoundRobinLoadBalancer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteDefinition getRoute() {
		return (RouteDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Route(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(RouteDefinition newRoute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Route(), newRoute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoute(RouteDefinition newRoute) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Route(), newRoute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteBuilderDefinition getRouteBuilder() {
		return (RouteBuilderDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteBuilder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteBuilder(RouteBuilderDefinition newRouteBuilder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteBuilder(), newRouteBuilder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteBuilder(RouteBuilderDefinition newRouteBuilder) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteBuilder(), newRouteBuilder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteConfigurationDefinition getRouteConfiguration() {
		return (RouteConfigurationDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteConfiguration(RouteConfigurationDefinition newRouteConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfiguration(), newRouteConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteConfiguration(RouteConfigurationDefinition newRouteConfiguration) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfiguration(), newRouteConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRouteConfigurationContextFactoryBean getRouteConfigurationContext() {
		return (CamelRouteConfigurationContextFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfigurationContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteConfigurationContext(CamelRouteConfigurationContextFactoryBean newRouteConfigurationContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfigurationContext(), newRouteConfigurationContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteConfigurationContext(CamelRouteConfigurationContextFactoryBean newRouteConfigurationContext) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfigurationContext(), newRouteConfigurationContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteConfigurationContextRefDefinition getRouteConfigurationContextRef() {
		return (RouteConfigurationContextRefDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfigurationContextRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteConfigurationContextRef(RouteConfigurationContextRefDefinition newRouteConfigurationContextRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfigurationContextRef(), newRouteConfigurationContextRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteConfigurationContextRef(RouteConfigurationContextRefDefinition newRouteConfigurationContextRef) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfigurationContextRef(), newRouteConfigurationContextRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteConfigurationsDefinition getRouteConfigurations() {
		return (RouteConfigurationsDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfigurations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteConfigurations(RouteConfigurationsDefinition newRouteConfigurations, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfigurations(), newRouteConfigurations, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteConfigurations(RouteConfigurationsDefinition newRouteConfigurations) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteConfigurations(), newRouteConfigurations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRouteContextFactoryBean getRouteContext() {
		return (CamelRouteContextFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteContext(CamelRouteContextFactoryBean newRouteContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteContext(), newRouteContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteContext(CamelRouteContextFactoryBean newRouteContext) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteContext(), newRouteContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteContextRefDefinition getRouteContextRef() {
		return (RouteContextRefDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteContextRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteContextRef(RouteContextRefDefinition newRouteContextRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteContextRef(), newRouteContextRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteContextRef(RouteContextRefDefinition newRouteContextRef) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteContextRef(), newRouteContextRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRouteControllerDefinition getRouteController() {
		return (CamelRouteControllerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteController(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteController(CamelRouteControllerDefinition newRouteController, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteController(), newRouteController, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteController(CamelRouteControllerDefinition newRouteController) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteController(), newRouteController);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoutesDefinition getRoutes() {
		return (RoutesDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Routes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutes(RoutesDefinition newRoutes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Routes(), newRoutes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutes(RoutesDefinition newRoutes) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Routes(), newRoutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteTemplateDefinition getRouteTemplate() {
		return (RouteTemplateDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteTemplate(RouteTemplateDefinition newRouteTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplate(), newRouteTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteTemplate(RouteTemplateDefinition newRouteTemplate) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplate(), newRouteTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelRouteTemplateContextFactoryBean getRouteTemplateContext() {
		return (CamelRouteTemplateContextFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplateContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteTemplateContext(CamelRouteTemplateContextFactoryBean newRouteTemplateContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplateContext(), newRouteTemplateContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteTemplateContext(CamelRouteTemplateContextFactoryBean newRouteTemplateContext) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplateContext(), newRouteTemplateContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteTemplateContextRefDefinition getRouteTemplateContextRef() {
		return (RouteTemplateContextRefDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplateContextRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteTemplateContextRef(RouteTemplateContextRefDefinition newRouteTemplateContextRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplateContextRef(), newRouteTemplateContextRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteTemplateContextRef(RouteTemplateContextRefDefinition newRouteTemplateContextRef) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplateContextRef(), newRouteTemplateContextRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteTemplatesDefinition getRouteTemplates() {
		return (RouteTemplatesDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteTemplates(RouteTemplatesDefinition newRouteTemplates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplates(), newRouteTemplates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteTemplates(RouteTemplatesDefinition newRouteTemplates) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RouteTemplates(), newRouteTemplates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoutingSlipDefinition getRoutingSlip() {
		return (RoutingSlipDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_RoutingSlip(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutingSlip(RoutingSlipDefinition newRoutingSlip, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_RoutingSlip(), newRoutingSlip, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutingSlip(RoutingSlipDefinition newRoutingSlip) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_RoutingSlip(), newRoutingSlip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RssDataFormat getRss() {
		return (RssDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rss(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRss(RssDataFormat newRss, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rss(), newRss, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRss(RssDataFormat newRss) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Rss(), newRss);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SagaDefinition getSaga() {
		return (SagaDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Saga(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSaga(SagaDefinition newSaga, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Saga(), newSaga, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaga(SagaDefinition newSaga) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Saga(), newSaga);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SamplingDefinition getSample() {
		return (SamplingDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Sample(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSample(SamplingDefinition newSample, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Sample(), newSample, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSample(SamplingDefinition newSample) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Sample(), newSample);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptDefinition getScript() {
		return (ScriptDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Script(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(ScriptDefinition newScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Script(), newScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(ScriptDefinition newScript) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Script(), newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecureRandomParametersFactoryBean getSecureRandomParameters() {
		return (SecureRandomParametersFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SecureRandomParameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecureRandomParameters(SecureRandomParametersFactoryBean newSecureRandomParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SecureRandomParameters(), newSecureRandomParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecureRandomParameters(SecureRandomParametersFactoryBean newSecureRandomParameters) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SecureRandomParameters(), newSecureRandomParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityDefinition getSecurity() {
		return (SecurityDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Security(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(SecurityDefinition newSecurity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Security(), newSecurity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(SecurityDefinition newSecurity) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Security(), newSecurity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestSecuritiesDefinition getSecurityDefinitions() {
		return (RestSecuritiesDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SecurityDefinitions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityDefinitions(RestSecuritiesDefinition newSecurityDefinitions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SecurityDefinitions(), newSecurityDefinitions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityDefinitions(RestSecuritiesDefinition newSecurityDefinitions) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SecurityDefinitions(), newSecurityDefinitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallDefinition getServiceCall() {
		return (ServiceCallDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceCall(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCall(ServiceCallDefinition newServiceCall, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceCall(), newServiceCall, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceCall(ServiceCallDefinition newServiceCall) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceCall(), newServiceCall);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallConfigurationDefinition getServiceCallConfiguration() {
		return (ServiceCallConfigurationDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceCallConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCallConfiguration(ServiceCallConfigurationDefinition newServiceCallConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceCallConfiguration(), newServiceCallConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceCallConfiguration(ServiceCallConfigurationDefinition newServiceCallConfiguration) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceCallConfiguration(), newServiceCallConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallServiceChooserConfiguration getServiceChooserConfiguration() {
		return (ServiceCallServiceChooserConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceChooserConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceChooserConfiguration(ServiceCallServiceChooserConfiguration newServiceChooserConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceChooserConfiguration(), newServiceChooserConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceChooserConfiguration(ServiceCallServiceChooserConfiguration newServiceChooserConfiguration) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceChooserConfiguration(), newServiceChooserConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallServiceDiscoveryConfiguration getServiceDiscoveryConfiguration() {
		return (ServiceCallServiceDiscoveryConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceDiscoveryConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDiscoveryConfiguration(ServiceCallServiceDiscoveryConfiguration newServiceDiscoveryConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceDiscoveryConfiguration(), newServiceDiscoveryConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceDiscoveryConfiguration(ServiceCallServiceDiscoveryConfiguration newServiceDiscoveryConfiguration) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceDiscoveryConfiguration(), newServiceDiscoveryConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallExpressionConfiguration getServiceExpression() {
		return (ServiceCallExpressionConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceExpression(ServiceCallExpressionConfiguration newServiceExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceExpression(), newServiceExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceExpression(ServiceCallExpressionConfiguration newServiceExpression) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceExpression(), newServiceExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceCallServiceFilterConfiguration getServiceFilterConfiguration() {
		return (ServiceCallServiceFilterConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceFilterConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceFilterConfiguration(ServiceCallServiceFilterConfiguration newServiceFilterConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceFilterConfiguration(), newServiceFilterConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceFilterConfiguration(ServiceCallServiceFilterConfiguration newServiceFilterConfiguration) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ServiceFilterConfiguration(), newServiceFilterConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetBodyDefinition getSetBody() {
		return (SetBodyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetBody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetBody(SetBodyDefinition newSetBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetBody(), newSetBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetBody(SetBodyDefinition newSetBody) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetBody(), newSetBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetExchangePatternDefinition getSetExchangePattern() {
		return (SetExchangePatternDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetExchangePattern(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetExchangePattern(SetExchangePatternDefinition newSetExchangePattern, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetExchangePattern(), newSetExchangePattern, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetExchangePattern(SetExchangePatternDefinition newSetExchangePattern) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetExchangePattern(), newSetExchangePattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetHeaderDefinition getSetHeader() {
		return (SetHeaderDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetHeader(SetHeaderDefinition newSetHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetHeader(), newSetHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetHeader(SetHeaderDefinition newSetHeader) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetHeader(), newSetHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetHeadersDefinition getSetHeaders() {
		return (SetHeadersDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetHeaders(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetHeaders(SetHeadersDefinition newSetHeaders, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetHeaders(), newSetHeaders, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetHeaders(SetHeadersDefinition newSetHeaders) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetHeaders(), newSetHeaders);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetPropertyDefinition getSetProperty() {
		return (SetPropertyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetProperty(SetPropertyDefinition newSetProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetProperty(), newSetProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetProperty(SetPropertyDefinition newSetProperty) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetProperty(), newSetProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetVariableDefinition getSetVariable() {
		return (SetVariableDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetVariable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetVariable(SetVariableDefinition newSetVariable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetVariable(), newSetVariable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetVariable(SetVariableDefinition newSetVariable) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetVariable(), newSetVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetVariablesDefinition getSetVariables() {
		return (SetVariablesDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetVariables(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetVariables(SetVariablesDefinition newSetVariables, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetVariables(), newSetVariables, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetVariables(SetVariablesDefinition newSetVariables) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SetVariables(), newSetVariables);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleExpression getSimple() {
		return (SimpleExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Simple(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimple(SimpleExpression newSimple, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Simple(), newSimple, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimple(SimpleExpression newSimple) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Simple(), newSimple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmooksDataFormat getSmooks() {
		return (SmooksDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Smooks(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmooks(SmooksDataFormat newSmooks, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Smooks(), newSmooks, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmooks(SmooksDataFormat newSmooks) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Smooks(), newSmooks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoapDataFormat getSoap() {
		return (SoapDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Soap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoap(SoapDataFormat newSoap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Soap(), newSoap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoap(SoapDataFormat newSoap) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Soap(), newSoap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortDefinition getSort() {
		return (SortDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Sort(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSort(SortDefinition newSort, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Sort(), newSort, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSort(SortDefinition newSort) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Sort(), newSort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpELExpression getSpel() {
		return (SpELExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Spel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpel(SpELExpression newSpel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Spel(), newSpel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpel(SpELExpression newSpel) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Spel(), newSpel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SplitDefinition getSplit() {
		return (SplitDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Split(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSplit(SplitDefinition newSplit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Split(), newSplit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSplit(SplitDefinition newSplit) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Split(), newSplit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpringTransactionErrorHandlerDefinition getSpringTransactionErrorHandler() {
		return (SpringTransactionErrorHandlerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SpringTransactionErrorHandler(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpringTransactionErrorHandler(SpringTransactionErrorHandlerDefinition newSpringTransactionErrorHandler, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SpringTransactionErrorHandler(), newSpringTransactionErrorHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpringTransactionErrorHandler(SpringTransactionErrorHandlerDefinition newSpringTransactionErrorHandler) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SpringTransactionErrorHandler(), newSpringTransactionErrorHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SslContextParametersFactoryBean getSslContextParameters() {
		return (SslContextParametersFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SslContextParameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSslContextParameters(SslContextParametersFactoryBean newSslContextParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SslContextParameters(), newSslContextParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSslContextParameters(SslContextParametersFactoryBean newSslContextParameters) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SslContextParameters(), newSslContextParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticServiceCallServiceDiscoveryConfiguration getStaticServiceDiscovery() {
		return (StaticServiceCallServiceDiscoveryConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_StaticServiceDiscovery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration newStaticServiceDiscovery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_StaticServiceDiscovery(), newStaticServiceDiscovery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration newStaticServiceDiscovery) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_StaticServiceDiscovery(), newStaticServiceDiscovery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepDefinition getStep() {
		return (StepDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Step(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(StepDefinition newStep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Step(), newStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStep(StepDefinition newStep) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Step(), newStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StickyLoadBalancerDefinition getStickyLoadBalancer() {
		return (StickyLoadBalancerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_StickyLoadBalancer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStickyLoadBalancer(StickyLoadBalancerDefinition newStickyLoadBalancer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_StickyLoadBalancer(), newStickyLoadBalancer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStickyLoadBalancer(StickyLoadBalancerDefinition newStickyLoadBalancer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_StickyLoadBalancer(), newStickyLoadBalancer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopDefinition getStop() {
		return (StopDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Stop(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStop(StopDefinition newStop, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Stop(), newStop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStop(StopDefinition newStop) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Stop(), newStop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelStreamCachingStrategyDefinition getStreamCaching() {
		return (CamelStreamCachingStrategyDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_StreamCaching(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreamCaching(CamelStreamCachingStrategyDefinition newStreamCaching, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_StreamCaching(), newStreamCaching, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreamCaching(CamelStreamCachingStrategyDefinition newStreamCaching) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_StreamCaching(), newStreamCaching);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamResequencerConfig getStreamConfig() {
		return (StreamResequencerConfig)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_StreamConfig(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreamConfig(StreamResequencerConfig newStreamConfig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_StreamConfig(), newStreamConfig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreamConfig(StreamResequencerConfig newStreamConfig) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_StreamConfig(), newStreamConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwiftMtDataFormat getSwiftMt() {
		return (SwiftMtDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SwiftMt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwiftMt(SwiftMtDataFormat newSwiftMt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SwiftMt(), newSwiftMt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwiftMt(SwiftMtDataFormat newSwiftMt) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SwiftMt(), newSwiftMt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwiftMxDataFormat getSwiftMx() {
		return (SwiftMxDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_SwiftMx(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwiftMx(SwiftMxDataFormat newSwiftMx, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_SwiftMx(), newSwiftMx, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwiftMx(SwiftMxDataFormat newSwiftMx) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_SwiftMx(), newSwiftMx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyslogDataFormat getSyslog() {
		return (SyslogDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Syslog(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyslog(SyslogDataFormat newSyslog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Syslog(), newSyslog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyslog(SyslogDataFormat newSyslog) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Syslog(), newSyslog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TarFileDataFormat getTarFile() {
		return (TarFileDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_TarFile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarFile(TarFileDataFormat newTarFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_TarFile(), newTarFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarFile(TarFileDataFormat newTarFile) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_TarFile(), newTarFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelProducerTemplateFactoryBean getTemplate() {
		return (CamelProducerTemplateFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Template(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(CamelProducerTemplateFactoryBean newTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Template(), newTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(CamelProducerTemplateFactoryBean newTemplate) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Template(), newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplatedRouteDefinition getTemplatedRoute() {
		return (TemplatedRouteDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplatedRoute(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplatedRoute(TemplatedRouteDefinition newTemplatedRoute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplatedRoute(), newTemplatedRoute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplatedRoute(TemplatedRouteDefinition newTemplatedRoute) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplatedRoute(), newTemplatedRoute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplatedRouteParameterDefinition getTemplatedRouteParameter() {
		return (TemplatedRouteParameterDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplatedRouteParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplatedRouteParameter(TemplatedRouteParameterDefinition newTemplatedRouteParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplatedRouteParameter(), newTemplatedRouteParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplatedRouteParameter(TemplatedRouteParameterDefinition newTemplatedRouteParameter) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplatedRouteParameter(), newTemplatedRouteParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplatedRoutesDefinition getTemplatedRoutes() {
		return (TemplatedRoutesDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplatedRoutes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplatedRoutes(TemplatedRoutesDefinition newTemplatedRoutes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplatedRoutes(), newTemplatedRoutes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplatedRoutes(TemplatedRoutesDefinition newTemplatedRoutes) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplatedRoutes(), newTemplatedRoutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteTemplateParameterDefinition getTemplateParameter() {
		return (RouteTemplateParameterDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplateParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(RouteTemplateParameterDefinition newTemplateParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplateParameter(), newTemplateParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateParameter(RouteTemplateParameterDefinition newTemplateParameter) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_TemplateParameter(), newTemplateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CamelThreadPoolFactoryBean getThreadPool() {
		return (CamelThreadPoolFactoryBean)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ThreadPool(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreadPool(CamelThreadPoolFactoryBean newThreadPool, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ThreadPool(), newThreadPool, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadPool(CamelThreadPoolFactoryBean newThreadPool) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ThreadPool(), newThreadPool);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadPoolProfileDefinition getThreadPoolProfile() {
		return (ThreadPoolProfileDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ThreadPoolProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreadPoolProfile(ThreadPoolProfileDefinition newThreadPoolProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ThreadPoolProfile(), newThreadPoolProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadPoolProfile(ThreadPoolProfileDefinition newThreadPoolProfile) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ThreadPoolProfile(), newThreadPoolProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadsDefinition getThreads() {
		return (ThreadsDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Threads(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreads(ThreadsDefinition newThreads, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Threads(), newThreads, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreads(ThreadsDefinition newThreads) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Threads(), newThreads);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThriftDataFormat getThrift() {
		return (ThriftDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Thrift(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrift(ThriftDataFormat newThrift, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Thrift(), newThrift, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrift(ThriftDataFormat newThrift) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Thrift(), newThrift);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrottleDefinition getThrottle() {
		return (ThrottleDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Throttle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrottle(ThrottleDefinition newThrottle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Throttle(), newThrottle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrottle(ThrottleDefinition newThrottle) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Throttle(), newThrottle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrowExceptionDefinition getThrowException() {
		return (ThrowExceptionDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ThrowException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrowException(ThrowExceptionDefinition newThrowException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ThrowException(), newThrowException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrowException(ThrowExceptionDefinition newThrowException) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ThrowException(), newThrowException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TidyMarkupDataFormat getTidyMarkup() {
		return (TidyMarkupDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_TidyMarkup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTidyMarkup(TidyMarkupDataFormat newTidyMarkup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_TidyMarkup(), newTidyMarkup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTidyMarkup(TidyMarkupDataFormat newTidyMarkup) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_TidyMarkup(), newTidyMarkup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToDefinition getTo() {
		return (ToDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_To(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(ToDefinition newTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_To(), newTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(ToDefinition newTo) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_To(), newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToDynamicDefinition getToD() {
		return (ToDynamicDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ToD(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToD(ToDynamicDefinition newToD, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ToD(), newToD, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToD(ToDynamicDefinition newToD) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ToD(), newToD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenizerExpression getTokenize() {
		return (TokenizerExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Tokenize(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTokenize(TokenizerExpression newTokenize, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Tokenize(), newTokenize, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenize(TokenizerExpression newTokenize) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Tokenize(), newTokenize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenizerDefinition getTokenizer() {
		return (TokenizerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Tokenizer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTokenizer(TokenizerDefinition newTokenizer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Tokenizer(), newTokenizer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenizer(TokenizerDefinition newTokenizer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Tokenizer(), newTokenizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopicLoadBalancerDefinition getTopicLoadBalancer() {
		return (TopicLoadBalancerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_TopicLoadBalancer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopicLoadBalancer(TopicLoadBalancerDefinition newTopicLoadBalancer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_TopicLoadBalancer(), newTopicLoadBalancer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopicLoadBalancer(TopicLoadBalancerDefinition newTopicLoadBalancer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_TopicLoadBalancer(), newTopicLoadBalancer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactedDefinition getTransacted() {
		return (TransactedDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Transacted(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransacted(TransactedDefinition newTransacted, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Transacted(), newTransacted, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransacted(TransactedDefinition newTransacted) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Transacted(), newTransacted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformDefinition getTransform() {
		return (TransformDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Transform(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(TransformDefinition newTransform, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Transform(), newTransform, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransform(TransformDefinition newTransform) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Transform(), newTransform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformersDefinition getTransformers() {
		return (TransformersDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Transformers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformers(TransformersDefinition newTransformers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Transformers(), newTransformers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformers(TransformersDefinition newTransformers) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Transformers(), newTransformers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YamlTypeFilterDefinition getTypeFilter() {
		return (YamlTypeFilterDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_TypeFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeFilter(YamlTypeFilterDefinition newTypeFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_TypeFilter(), newTypeFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeFilter(YamlTypeFilterDefinition newTypeFilter) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_TypeFilter(), newTypeFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityCsvDataFormat getUnivocityCsv() {
		return (UniVocityCsvDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityCsv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnivocityCsv(UniVocityCsvDataFormat newUnivocityCsv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityCsv(), newUnivocityCsv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnivocityCsv(UniVocityCsvDataFormat newUnivocityCsv) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityCsv(), newUnivocityCsv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityFixedDataFormat getUnivocityFixed() {
		return (UniVocityFixedDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityFixed(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnivocityFixed(UniVocityFixedDataFormat newUnivocityFixed, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityFixed(), newUnivocityFixed, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnivocityFixed(UniVocityFixedDataFormat newUnivocityFixed) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityFixed(), newUnivocityFixed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityHeader getUnivocityHeader() {
		return (UniVocityHeader)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnivocityHeader(UniVocityHeader newUnivocityHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityHeader(), newUnivocityHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnivocityHeader(UniVocityHeader newUnivocityHeader) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityHeader(), newUnivocityHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityTsvDataFormat getUnivocityTsv() {
		return (UniVocityTsvDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityTsv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnivocityTsv(UniVocityTsvDataFormat newUnivocityTsv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityTsv(), newUnivocityTsv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnivocityTsv(UniVocityTsvDataFormat newUnivocityTsv) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_UnivocityTsv(), newUnivocityTsv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnmarshalDefinition getUnmarshal() {
		return (UnmarshalDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Unmarshal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnmarshal(UnmarshalDefinition newUnmarshal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Unmarshal(), newUnmarshal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnmarshal(UnmarshalDefinition newUnmarshal) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Unmarshal(), newUnmarshal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidateDefinition getValidate() {
		return (ValidateDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Validate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidate(ValidateDefinition newValidate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Validate(), newValidate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidate(ValidateDefinition newValidate) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Validate(), newValidate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidatorsDefinition getValidators() {
		return (ValidatorsDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Validators(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidators(ValidatorsDefinition newValidators, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Validators(), newValidators, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidators(ValidatorsDefinition newValidators) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Validators(), newValidators);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Value(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Value(), newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExpression getVariable() {
		return (VariableExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Variable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(VariableExpression newVariable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Variable(), newVariable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(VariableExpression newVariable) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Variable(), newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WasmExpression getWasm() {
		return (WasmExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Wasm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasm(WasmExpression newWasm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Wasm(), newWasm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWasm(WasmExpression newWasm) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Wasm(), newWasm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightedLoadBalancerDefinition getWeightedLoadBalancer() {
		return (WeightedLoadBalancerDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_WeightedLoadBalancer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeightedLoadBalancer(WeightedLoadBalancerDefinition newWeightedLoadBalancer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_WeightedLoadBalancer(), newWeightedLoadBalancer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightedLoadBalancer(WeightedLoadBalancerDefinition newWeightedLoadBalancer) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_WeightedLoadBalancer(), newWeightedLoadBalancer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenDefinition getWhen() {
		return (WhenDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_When(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(WhenDefinition newWhen, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_When(), newWhen, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen(WhenDefinition newWhen) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_When(), newWhen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WireTapDefinition getWireTap() {
		return (WireTapDefinition)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_WireTap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireTap(WireTapDefinition newWireTap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_WireTap(), newWireTap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWireTap(WireTapDefinition newWireTap) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_WireTap(), newWireTap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlSecurityDataFormat getXmlSecurity() {
		return (XmlSecurityDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_XmlSecurity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlSecurity(XmlSecurityDataFormat newXmlSecurity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_XmlSecurity(), newXmlSecurity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlSecurity(XmlSecurityDataFormat newXmlSecurity) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_XmlSecurity(), newXmlSecurity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XPathExpression getXpath() {
		return (XPathExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Xpath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXpath(XPathExpression newXpath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Xpath(), newXpath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXpath(XPathExpression newXpath) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Xpath(), newXpath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XQueryExpression getXquery() {
		return (XQueryExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Xquery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXquery(XQueryExpression newXquery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Xquery(), newXquery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXquery(XQueryExpression newXquery) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Xquery(), newXquery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlTokenizerExpression getXtokenize() {
		return (XmlTokenizerExpression)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Xtokenize(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXtokenize(XmlTokenizerExpression newXtokenize, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Xtokenize(), newXtokenize, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXtokenize(XmlTokenizerExpression newXtokenize) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Xtokenize(), newXtokenize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YamlDataFormat getYaml() {
		return (YamlDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_Yaml(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYaml(YamlDataFormat newYaml, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_Yaml(), newYaml, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYaml(YamlDataFormat newYaml) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_Yaml(), newYaml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZipDeflaterDataFormat getZipDeflater() {
		return (ZipDeflaterDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ZipDeflater(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZipDeflater(ZipDeflaterDataFormat newZipDeflater, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ZipDeflater(), newZipDeflater, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZipDeflater(ZipDeflaterDataFormat newZipDeflater) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ZipDeflater(), newZipDeflater);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZipFileDataFormat getZipFile() {
		return (ZipFileDataFormat)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ZipFile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZipFile(ZipFileDataFormat newZipFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ZipFile(), newZipFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZipFile(ZipFileDataFormat newZipFile) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ZipFile(), newZipFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZooKeeperServiceCallServiceDiscoveryConfiguration getZookeeperServiceDiscovery() {
		return (ZooKeeperServiceCallServiceDiscoveryConfiguration)getMixed().get(CamelSpringPackage.eINSTANCE.getDocumentRoot_ZookeeperServiceDiscovery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZookeeperServiceDiscovery(ZooKeeperServiceCallServiceDiscoveryConfiguration newZookeeperServiceDiscovery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamelSpringPackage.eINSTANCE.getDocumentRoot_ZookeeperServiceDiscovery(), newZookeeperServiceDiscovery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZookeeperServiceDiscovery(ZooKeeperServiceCallServiceDiscoveryConfiguration newZookeeperServiceDiscovery) {
		((FeatureMap.Internal)getMixed()).set(CamelSpringPackage.eINSTANCE.getDocumentRoot_ZookeeperServiceDiscovery(), newZookeeperServiceDiscovery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__AGGREGATE:
				return basicSetAggregate(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__API_KEY:
				return basicSetApiKey(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ASN1:
				return basicSetAsn1(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__AVRO:
				return basicSetAvro(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BARCODE:
				return basicSetBarcode(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BASE64:
				return basicSetBase64(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BASIC_AUTH:
				return basicSetBasicAuth(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BATCH_CONFIG:
				return basicSetBatchConfig(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN:
				return basicSetBean(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN_FACTORY:
				return basicSetBeanFactory(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BEANIO:
				return basicSetBeanio(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
				return basicSetBeanPostProcessor(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BEANS:
				return basicSetBeans(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BEARER_TOKEN:
				return basicSetBearerToken(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BINDY:
				return basicSetBindy(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__BLACKLIST_SERVICE_FILTER:
				return basicSetBlacklistServiceFilter(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CACHING_SERVICE_DISCOVERY:
				return basicSetCachingServiceDiscovery(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CAMEL:
				return basicSetCamel(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
				return basicSetCamelContext(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CBOR:
				return basicSetCbor(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CHOICE:
				return basicSetChoice(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CIRCUIT_BREAKER:
				return basicSetCircuitBreaker(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CLAIM_CHECK:
				return basicSetClaimCheck(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__COMBINED_SERVICE_DISCOVERY:
				return basicSetCombinedServiceDiscovery(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__COMBINED_SERVICE_FILTER:
				return basicSetCombinedServiceFilter(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CONSTANT:
				return basicSetConstant(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CONSUL_SERVICE_DISCOVERY:
				return basicSetConsulServiceDiscovery(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
				return basicSetConsumerTemplate(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
				return basicSetContextScan(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
				return basicSetConvertBodyTo(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_HEADER_TO:
				return basicSetConvertHeaderTo(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_VARIABLE_TO:
				return basicSetConvertVariableTo(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CRYPTO:
				return basicSetCrypto(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CSIMPLE:
				return basicSetCsimple(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CSV:
				return basicSetCsv(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM:
				return basicSetCustom(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
				return basicSetCustomLoadBalancer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_SERVICE_FILTER:
				return basicSetCustomServiceFilter(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				return basicSetCustomTransformer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_VALIDATOR:
				return basicSetCustomValidator(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
				return basicSetDataFormats(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DATA_FORMAT_TRANSFORMER:
				return basicSetDataFormatTransformer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DATASONNET:
				return basicSetDatasonnet(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DEAD_LETTER_CHANNEL:
				return basicSetDeadLetterChannel(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DEFAULT_ERROR_HANDLER:
				return basicSetDefaultErrorHandler(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DEFAULT_LOAD_BALANCER:
				return basicSetDefaultLoadBalancer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DELAY:
				return basicSetDelay(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DELETE:
				return basicSetDelete(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DFDL:
				return basicSetDfdl(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DNS_SERVICE_DISCOVERY:
				return basicSetDnsServiceDiscovery(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DO_CATCH:
				return basicSetDoCatch(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DO_FINALLY:
				return basicSetDoFinally(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DO_TRY:
				return basicSetDoTry(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
				return basicSetDynamicRouter(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT_TRANSFORMER:
				return basicSetEndpointTransformer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT_VALIDATOR:
				return basicSetEndpointValidator(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ENRICH:
				return basicSetEnrich(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
				return basicSetErrorHandler(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__EXCHANGE_PROPERTY:
				return basicSetExchangeProperty(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
				return basicSetExpressionDefinition(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__FAILOVER_LOAD_BALANCER:
				return basicSetFailoverLoadBalancer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__FAULT_TOLERANCE_CONFIGURATION:
				return basicSetFaultToleranceConfiguration(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__FHIR_JSON:
				return basicSetFhirJson(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__FHIR_XML:
				return basicSetFhirXml(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__FILTER:
				return basicSetFilter(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__FLATPACK:
				return basicSetFlatpack(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__FLUENT_TEMPLATE:
				return basicSetFluentTemplate(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__FORY:
				return basicSetFory(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__FROM:
				return basicSetFrom(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__GET:
				return basicSetGet(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__GLOBAL_OPTION:
				return basicSetGlobalOption(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__GLOBAL_OPTIONS:
				return basicSetGlobalOptions(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__GROK:
				return basicSetGrok(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__GROOVY:
				return basicSetGroovy(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__GZIP_DEFLATER:
				return basicSetGzipDeflater(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__HEAD:
				return basicSetHead(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__HEADER:
				return basicSetHeader(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__HEALTHY_SERVICE_FILTER:
				return basicSetHealthyServiceFilter(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__HL7:
				return basicSetHl7(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__HL7TERSER:
				return basicSetHl7terser(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ICAL:
				return basicSetIcal(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
				return basicSetIdempotentConsumer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__INPUT_TYPE:
				return basicSetInputType(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT:
				return basicSetIntercept(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
				return basicSetInterceptFrom(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT_SEND_TO_ENDPOINT:
				return basicSetInterceptSendToEndpoint(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ISO8583:
				return basicSetIso8583(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JACKSON_XML:
				return basicSetJacksonXml(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JAVA:
				return basicSetJava(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JAXB:
				return basicSetJaxb(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JMX_AGENT:
				return basicSetJmxAgent(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JOOR:
				return basicSetJoor(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JQ:
				return basicSetJq(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JS:
				return basicSetJs(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JSON:
				return basicSetJson(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JSON_API:
				return basicSetJsonApi(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JSONPATH:
				return basicSetJsonpath(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__JTA_TRANSACTION_ERROR_HANDLER:
				return basicSetJtaTransactionErrorHandler(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__KAMELET:
				return basicSetKamelet(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
				return basicSetKeyStoreParameters(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__KUBERNETES_SERVICE_DISCOVERY:
				return basicSetKubernetesServiceDiscovery(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_CHARACTER_TOKENIZER:
				return basicSetLangChain4jCharacterTokenizer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_LINE_TOKENIZER:
				return basicSetLangChain4jLineTokenizer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_PARAGRAPH_TOKENIZER:
				return basicSetLangChain4jParagraphTokenizer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_SENTENCE_TOKENIZER:
				return basicSetLangChain4jSentenceTokenizer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_WORD_TOKENIZER:
				return basicSetLangChain4jWordTokenizer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
				return basicSetLoadBalance(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_BALANCER_CONFIGURATION:
				return basicSetLoadBalancerConfiguration(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_TRANSFORMER:
				return basicSetLoadTransformer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LOG:
				return basicSetLog(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LOOP:
				return basicSetLoop(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__LZF:
				return basicSetLzf(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__MARSHAL:
				return basicSetMarshal(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__METHOD:
				return basicSetMethod(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__MIME_MULTIPART:
				return basicSetMimeMultipart(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__MULTICAST:
				return basicSetMulticast(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__MUTUAL_TLS:
				return basicSetMutualTLS(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__MVEL:
				return basicSetMvel(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__NO_ERROR_HANDLER:
				return basicSetNoErrorHandler(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__OAUTH2:
				return basicSetOauth2(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__OGNL:
				return basicSetOgnl(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
				return basicSetOnCompletion(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
				return basicSetOnException(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ON_FALLBACK:
				return basicSetOnFallback(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ON_WHEN:
				return basicSetOnWhen(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__OPEN_API:
				return basicSetOpenApi(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__OPEN_ID_CONNECT:
				return basicSetOpenIdConnect(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__OPTIMISTIC_LOCK_RETRY_POLICY:
				return basicSetOptimisticLockRetryPolicy(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__OTHERWISE:
				return basicSetOtherwise(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__OUTPUT_TYPE:
				return basicSetOutputType(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
				return basicSetPackageScan(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PARAM:
				return basicSetParam(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PARQUET_AVRO:
				return basicSetParquetAvro(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PASS_THROUGH_SERVICE_FILTER:
				return basicSetPassThroughServiceFilter(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PATCH:
				return basicSetPatch(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PAUSABLE:
				return basicSetPausable(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PGP:
				return basicSetPgp(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PIPELINE:
				return basicSetPipeline(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__POLICY:
				return basicSetPolicy(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__POLL:
				return basicSetPoll(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
				return basicSetPollEnrich(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__POST:
				return basicSetPost(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PREDICATE_VALIDATOR:
				return basicSetPredicateValidator(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PROCESS:
				return basicSetProcess(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTIES_FUNCTION:
				return basicSetPropertiesFunction(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTIES_LOCATION:
				return basicSetPropertiesLocation(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY_EXPRESSION:
				return basicSetPropertyExpression(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
				return basicSetPropertyPlaceholder(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PROTOBUF:
				return basicSetProtobuf(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PUT:
				return basicSetPut(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__PYTHON:
				return basicSetPython(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__RANDOM_LOAD_BALANCER:
				return basicSetRandomLoadBalancer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
				return basicSetRecipientList(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
				return basicSetRedeliveryPolicy(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
				return basicSetRedeliveryPolicyProfile(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REF:
				return basicSetRef(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REF_ERROR_HANDLER:
				return basicSetRefErrorHandler(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
				return basicSetRemoveHeader(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
				return basicSetRemoveHeaders(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTIES:
				return basicSetRemoveProperties(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
				return basicSetRemoveProperty(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_VARIABLE:
				return basicSetRemoveVariable(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__RESEQUENCE:
				return basicSetResequence(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__RESILIENCE4J_CONFIGURATION:
				return basicSetResilience4jConfiguration(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
				return basicSetResponseHeader(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__RESPONSE_MESSAGE:
				return basicSetResponseMessage(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REST:
				return basicSetRest(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REST_BINDING:
				return basicSetRestBinding(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONFIGURATION:
				return basicSetRestConfiguration(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONTEXT:
				return basicSetRestContext(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONTEXT_REF:
				return basicSetRestContextRef(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__REST_PROPERTY:
				return basicSetRestProperty(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__RESTS:
				return basicSetRests(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__RESUMABLE:
				return basicSetResumable(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROLLBACK:
				return basicSetRollback(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUND_ROBIN_LOAD_BALANCER:
				return basicSetRoundRobinLoadBalancer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE:
				return basicSetRoute(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
				return basicSetRouteBuilder(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION:
				return basicSetRouteConfiguration(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION_CONTEXT:
				return basicSetRouteConfigurationContext(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION_CONTEXT_REF:
				return basicSetRouteConfigurationContextRef(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATIONS:
				return basicSetRouteConfigurations(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
				return basicSetRouteContext(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
				return basicSetRouteContextRef(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTROLLER:
				return basicSetRouteController(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTES:
				return basicSetRoutes(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE:
				return basicSetRouteTemplate(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE_CONTEXT:
				return basicSetRouteTemplateContext(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE_CONTEXT_REF:
				return basicSetRouteTemplateContextRef(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATES:
				return basicSetRouteTemplates(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
				return basicSetRoutingSlip(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__RSS:
				return basicSetRss(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SAGA:
				return basicSetSaga(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SAMPLE:
				return basicSetSample(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SCRIPT:
				return basicSetScript(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
				return basicSetSecureRandomParameters(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SECURITY:
				return basicSetSecurity(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SECURITY_DEFINITIONS:
				return basicSetSecurityDefinitions(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CALL:
				return basicSetServiceCall(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CALL_CONFIGURATION:
				return basicSetServiceCallConfiguration(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CHOOSER_CONFIGURATION:
				return basicSetServiceChooserConfiguration(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_DISCOVERY_CONFIGURATION:
				return basicSetServiceDiscoveryConfiguration(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_EXPRESSION:
				return basicSetServiceExpression(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_FILTER_CONFIGURATION:
				return basicSetServiceFilterConfiguration(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SET_BODY:
				return basicSetSetBody(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
				return basicSetSetExchangePattern(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SET_HEADER:
				return basicSetSetHeader(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SET_HEADERS:
				return basicSetSetHeaders(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
				return basicSetSetProperty(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SET_VARIABLE:
				return basicSetSetVariable(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SET_VARIABLES:
				return basicSetSetVariables(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SIMPLE:
				return basicSetSimple(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SMOOKS:
				return basicSetSmooks(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SOAP:
				return basicSetSoap(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SORT:
				return basicSetSort(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SPEL:
				return basicSetSpel(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SPLIT:
				return basicSetSplit(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SPRING_TRANSACTION_ERROR_HANDLER:
				return basicSetSpringTransactionErrorHandler(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
				return basicSetSslContextParameters(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__STATIC_SERVICE_DISCOVERY:
				return basicSetStaticServiceDiscovery(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__STEP:
				return basicSetStep(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__STICKY_LOAD_BALANCER:
				return basicSetStickyLoadBalancer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__STOP:
				return basicSetStop(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__STREAM_CACHING:
				return basicSetStreamCaching(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__STREAM_CONFIG:
				return basicSetStreamConfig(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SWIFT_MT:
				return basicSetSwiftMt(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SWIFT_MX:
				return basicSetSwiftMx(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__SYSLOG:
				return basicSetSyslog(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TAR_FILE:
				return basicSetTarFile(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTE:
				return basicSetTemplatedRoute(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTE_PARAMETER:
				return basicSetTemplatedRouteParameter(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTES:
				return basicSetTemplatedRoutes(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__THREAD_POOL:
				return basicSetThreadPool(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
				return basicSetThreadPoolProfile(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__THREADS:
				return basicSetThreads(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__THRIFT:
				return basicSetThrift(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__THROTTLE:
				return basicSetThrottle(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
				return basicSetThrowException(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
				return basicSetTidyMarkup(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TO:
				return basicSetTo(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TO_D:
				return basicSetToD(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TOKENIZE:
				return basicSetTokenize(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TOKENIZER:
				return basicSetTokenizer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TOPIC_LOAD_BALANCER:
				return basicSetTopicLoadBalancer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSACTED:
				return basicSetTransacted(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSFORM:
				return basicSetTransform(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSFORMERS:
				return basicSetTransformers(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__TYPE_FILTER:
				return basicSetTypeFilter(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_CSV:
				return basicSetUnivocityCsv(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_FIXED:
				return basicSetUnivocityFixed(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_HEADER:
				return basicSetUnivocityHeader(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_TSV:
				return basicSetUnivocityTsv(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__UNMARSHAL:
				return basicSetUnmarshal(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__VALIDATE:
				return basicSetValidate(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__VALIDATORS:
				return basicSetValidators(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__VARIABLE:
				return basicSetVariable(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__WASM:
				return basicSetWasm(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__WEIGHTED_LOAD_BALANCER:
				return basicSetWeightedLoadBalancer(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__WHEN:
				return basicSetWhen(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__WIRE_TAP:
				return basicSetWireTap(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__XML_SECURITY:
				return basicSetXmlSecurity(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__XPATH:
				return basicSetXpath(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__XQUERY:
				return basicSetXquery(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__XTOKENIZE:
				return basicSetXtokenize(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__YAML:
				return basicSetYaml(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ZIP_DEFLATER:
				return basicSetZipDeflater(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ZIP_FILE:
				return basicSetZipFile(null, msgs);
			case CamelSpringPackage.DOCUMENT_ROOT__ZOOKEEPER_SERVICE_DISCOVERY:
				return basicSetZookeeperServiceDiscovery(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelSpringPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CamelSpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CamelSpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CamelSpringPackage.DOCUMENT_ROOT__AGGREGATE:
				return getAggregate();
			case CamelSpringPackage.DOCUMENT_ROOT__API_KEY:
				return getApiKey();
			case CamelSpringPackage.DOCUMENT_ROOT__ASN1:
				return getAsn1();
			case CamelSpringPackage.DOCUMENT_ROOT__AVRO:
				return getAvro();
			case CamelSpringPackage.DOCUMENT_ROOT__BARCODE:
				return getBarcode();
			case CamelSpringPackage.DOCUMENT_ROOT__BASE64:
				return getBase64();
			case CamelSpringPackage.DOCUMENT_ROOT__BASIC_AUTH:
				return getBasicAuth();
			case CamelSpringPackage.DOCUMENT_ROOT__BATCH_CONFIG:
				return getBatchConfig();
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN:
				return getBean();
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN_FACTORY:
				return getBeanFactory();
			case CamelSpringPackage.DOCUMENT_ROOT__BEANIO:
				return getBeanio();
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
				return getBeanPostProcessor();
			case CamelSpringPackage.DOCUMENT_ROOT__BEANS:
				return getBeans();
			case CamelSpringPackage.DOCUMENT_ROOT__BEARER_TOKEN:
				return getBearerToken();
			case CamelSpringPackage.DOCUMENT_ROOT__BINDY:
				return getBindy();
			case CamelSpringPackage.DOCUMENT_ROOT__BLACKLIST_SERVICE_FILTER:
				return getBlacklistServiceFilter();
			case CamelSpringPackage.DOCUMENT_ROOT__CACHING_SERVICE_DISCOVERY:
				return getCachingServiceDiscovery();
			case CamelSpringPackage.DOCUMENT_ROOT__CAMEL:
				return getCamel();
			case CamelSpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
				return getCamelContext();
			case CamelSpringPackage.DOCUMENT_ROOT__CBOR:
				return getCbor();
			case CamelSpringPackage.DOCUMENT_ROOT__CHOICE:
				return getChoice();
			case CamelSpringPackage.DOCUMENT_ROOT__CIRCUIT_BREAKER:
				return getCircuitBreaker();
			case CamelSpringPackage.DOCUMENT_ROOT__CLAIM_CHECK:
				return getClaimCheck();
			case CamelSpringPackage.DOCUMENT_ROOT__COMBINED_SERVICE_DISCOVERY:
				return getCombinedServiceDiscovery();
			case CamelSpringPackage.DOCUMENT_ROOT__COMBINED_SERVICE_FILTER:
				return getCombinedServiceFilter();
			case CamelSpringPackage.DOCUMENT_ROOT__CONSTANT:
				return getConstant();
			case CamelSpringPackage.DOCUMENT_ROOT__CONSUL_SERVICE_DISCOVERY:
				return getConsulServiceDiscovery();
			case CamelSpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
				return getConsumerTemplate();
			case CamelSpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
				return getContextScan();
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_HEADER_TO:
				return getConvertHeaderTo();
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_VARIABLE_TO:
				return getConvertVariableTo();
			case CamelSpringPackage.DOCUMENT_ROOT__CRYPTO:
				return getCrypto();
			case CamelSpringPackage.DOCUMENT_ROOT__CSIMPLE:
				return getCsimple();
			case CamelSpringPackage.DOCUMENT_ROOT__CSV:
				return getCsv();
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM:
				return getCustom();
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
				return getCustomLoadBalancer();
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_SERVICE_FILTER:
				return getCustomServiceFilter();
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				return getCustomTransformer();
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_VALIDATOR:
				return getCustomValidator();
			case CamelSpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
				return getDataFormats();
			case CamelSpringPackage.DOCUMENT_ROOT__DATA_FORMAT_TRANSFORMER:
				return getDataFormatTransformer();
			case CamelSpringPackage.DOCUMENT_ROOT__DATASONNET:
				return getDatasonnet();
			case CamelSpringPackage.DOCUMENT_ROOT__DEAD_LETTER_CHANNEL:
				return getDeadLetterChannel();
			case CamelSpringPackage.DOCUMENT_ROOT__DEFAULT_ERROR_HANDLER:
				return getDefaultErrorHandler();
			case CamelSpringPackage.DOCUMENT_ROOT__DEFAULT_LOAD_BALANCER:
				return getDefaultLoadBalancer();
			case CamelSpringPackage.DOCUMENT_ROOT__DELAY:
				return getDelay();
			case CamelSpringPackage.DOCUMENT_ROOT__DELETE:
				return getDelete();
			case CamelSpringPackage.DOCUMENT_ROOT__DFDL:
				return getDfdl();
			case CamelSpringPackage.DOCUMENT_ROOT__DNS_SERVICE_DISCOVERY:
				return getDnsServiceDiscovery();
			case CamelSpringPackage.DOCUMENT_ROOT__DO_CATCH:
				return getDoCatch();
			case CamelSpringPackage.DOCUMENT_ROOT__DO_FINALLY:
				return getDoFinally();
			case CamelSpringPackage.DOCUMENT_ROOT__DO_TRY:
				return getDoTry();
			case CamelSpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint();
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT_TRANSFORMER:
				return getEndpointTransformer();
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT_VALIDATOR:
				return getEndpointValidator();
			case CamelSpringPackage.DOCUMENT_ROOT__ENRICH:
				return getEnrich();
			case CamelSpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
				return getErrorHandler();
			case CamelSpringPackage.DOCUMENT_ROOT__EXCHANGE_PROPERTY:
				return getExchangeProperty();
			case CamelSpringPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression();
			case CamelSpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
				return getExpressionDefinition();
			case CamelSpringPackage.DOCUMENT_ROOT__FAILOVER_LOAD_BALANCER:
				return getFailoverLoadBalancer();
			case CamelSpringPackage.DOCUMENT_ROOT__FAULT_TOLERANCE_CONFIGURATION:
				return getFaultToleranceConfiguration();
			case CamelSpringPackage.DOCUMENT_ROOT__FHIR_JSON:
				return getFhirJson();
			case CamelSpringPackage.DOCUMENT_ROOT__FHIR_XML:
				return getFhirXml();
			case CamelSpringPackage.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case CamelSpringPackage.DOCUMENT_ROOT__FLATPACK:
				return getFlatpack();
			case CamelSpringPackage.DOCUMENT_ROOT__FLUENT_TEMPLATE:
				return getFluentTemplate();
			case CamelSpringPackage.DOCUMENT_ROOT__FORY:
				return getFory();
			case CamelSpringPackage.DOCUMENT_ROOT__FROM:
				return getFrom();
			case CamelSpringPackage.DOCUMENT_ROOT__GET:
				return getGet();
			case CamelSpringPackage.DOCUMENT_ROOT__GLOBAL_OPTION:
				return getGlobalOption();
			case CamelSpringPackage.DOCUMENT_ROOT__GLOBAL_OPTIONS:
				return getGlobalOptions();
			case CamelSpringPackage.DOCUMENT_ROOT__GROK:
				return getGrok();
			case CamelSpringPackage.DOCUMENT_ROOT__GROOVY:
				return getGroovy();
			case CamelSpringPackage.DOCUMENT_ROOT__GZIP_DEFLATER:
				return getGzipDeflater();
			case CamelSpringPackage.DOCUMENT_ROOT__HEAD:
				return getHead();
			case CamelSpringPackage.DOCUMENT_ROOT__HEADER:
				return getHeader();
			case CamelSpringPackage.DOCUMENT_ROOT__HEALTHY_SERVICE_FILTER:
				return getHealthyServiceFilter();
			case CamelSpringPackage.DOCUMENT_ROOT__HL7:
				return getHl7();
			case CamelSpringPackage.DOCUMENT_ROOT__HL7TERSER:
				return getHl7terser();
			case CamelSpringPackage.DOCUMENT_ROOT__ICAL:
				return getIcal();
			case CamelSpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case CamelSpringPackage.DOCUMENT_ROOT__INPUT_TYPE:
				return getInputType();
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT:
				return getIntercept();
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
				return getInterceptFrom();
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT_SEND_TO_ENDPOINT:
				return getInterceptSendToEndpoint();
			case CamelSpringPackage.DOCUMENT_ROOT__ISO8583:
				return getIso8583();
			case CamelSpringPackage.DOCUMENT_ROOT__JACKSON_XML:
				return getJacksonXml();
			case CamelSpringPackage.DOCUMENT_ROOT__JAVA:
				return getJava();
			case CamelSpringPackage.DOCUMENT_ROOT__JAXB:
				return getJaxb();
			case CamelSpringPackage.DOCUMENT_ROOT__JMX_AGENT:
				return getJmxAgent();
			case CamelSpringPackage.DOCUMENT_ROOT__JOOR:
				return getJoor();
			case CamelSpringPackage.DOCUMENT_ROOT__JQ:
				return getJq();
			case CamelSpringPackage.DOCUMENT_ROOT__JS:
				return getJs();
			case CamelSpringPackage.DOCUMENT_ROOT__JSON:
				return getJson();
			case CamelSpringPackage.DOCUMENT_ROOT__JSON_API:
				return getJsonApi();
			case CamelSpringPackage.DOCUMENT_ROOT__JSONPATH:
				return getJsonpath();
			case CamelSpringPackage.DOCUMENT_ROOT__JTA_TRANSACTION_ERROR_HANDLER:
				return getJtaTransactionErrorHandler();
			case CamelSpringPackage.DOCUMENT_ROOT__KAMELET:
				return getKamelet();
			case CamelSpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
				return getKeyStoreParameters();
			case CamelSpringPackage.DOCUMENT_ROOT__KUBERNETES_SERVICE_DISCOVERY:
				return getKubernetesServiceDiscovery();
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_CHARACTER_TOKENIZER:
				return getLangChain4jCharacterTokenizer();
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_LINE_TOKENIZER:
				return getLangChain4jLineTokenizer();
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_PARAGRAPH_TOKENIZER:
				return getLangChain4jParagraphTokenizer();
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_SENTENCE_TOKENIZER:
				return getLangChain4jSentenceTokenizer();
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_WORD_TOKENIZER:
				return getLangChain4jWordTokenizer();
			case CamelSpringPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage();
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
				return getLoadBalance();
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_BALANCER_CONFIGURATION:
				return getLoadBalancerConfiguration();
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_TRANSFORMER:
				return getLoadTransformer();
			case CamelSpringPackage.DOCUMENT_ROOT__LOG:
				return getLog();
			case CamelSpringPackage.DOCUMENT_ROOT__LOOP:
				return getLoop();
			case CamelSpringPackage.DOCUMENT_ROOT__LZF:
				return getLzf();
			case CamelSpringPackage.DOCUMENT_ROOT__MARSHAL:
				return getMarshal();
			case CamelSpringPackage.DOCUMENT_ROOT__METHOD:
				return getMethod();
			case CamelSpringPackage.DOCUMENT_ROOT__MIME_MULTIPART:
				return getMimeMultipart();
			case CamelSpringPackage.DOCUMENT_ROOT__MULTICAST:
				return getMulticast();
			case CamelSpringPackage.DOCUMENT_ROOT__MUTUAL_TLS:
				return getMutualTLS();
			case CamelSpringPackage.DOCUMENT_ROOT__MVEL:
				return getMvel();
			case CamelSpringPackage.DOCUMENT_ROOT__NO_ERROR_HANDLER:
				return getNoErrorHandler();
			case CamelSpringPackage.DOCUMENT_ROOT__OAUTH2:
				return getOauth2();
			case CamelSpringPackage.DOCUMENT_ROOT__OGNL:
				return getOgnl();
			case CamelSpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
				return getOnCompletion();
			case CamelSpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
				return getOnException();
			case CamelSpringPackage.DOCUMENT_ROOT__ON_FALLBACK:
				return getOnFallback();
			case CamelSpringPackage.DOCUMENT_ROOT__ON_WHEN:
				return getOnWhen();
			case CamelSpringPackage.DOCUMENT_ROOT__OPEN_API:
				return getOpenApi();
			case CamelSpringPackage.DOCUMENT_ROOT__OPEN_ID_CONNECT:
				return getOpenIdConnect();
			case CamelSpringPackage.DOCUMENT_ROOT__OPTIMISTIC_LOCK_RETRY_POLICY:
				return getOptimisticLockRetryPolicy();
			case CamelSpringPackage.DOCUMENT_ROOT__OTHERWISE:
				return getOtherwise();
			case CamelSpringPackage.DOCUMENT_ROOT__OUTPUT_TYPE:
				return getOutputType();
			case CamelSpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
				return getPackageScan();
			case CamelSpringPackage.DOCUMENT_ROOT__PARAM:
				return getParam();
			case CamelSpringPackage.DOCUMENT_ROOT__PARQUET_AVRO:
				return getParquetAvro();
			case CamelSpringPackage.DOCUMENT_ROOT__PASS_THROUGH_SERVICE_FILTER:
				return getPassThroughServiceFilter();
			case CamelSpringPackage.DOCUMENT_ROOT__PATCH:
				return getPatch();
			case CamelSpringPackage.DOCUMENT_ROOT__PAUSABLE:
				return getPausable();
			case CamelSpringPackage.DOCUMENT_ROOT__PGP:
				return getPgp();
			case CamelSpringPackage.DOCUMENT_ROOT__PIPELINE:
				return getPipeline();
			case CamelSpringPackage.DOCUMENT_ROOT__POLICY:
				return getPolicy();
			case CamelSpringPackage.DOCUMENT_ROOT__POLL:
				return getPoll();
			case CamelSpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
				return getPollEnrich();
			case CamelSpringPackage.DOCUMENT_ROOT__POST:
				return getPost();
			case CamelSpringPackage.DOCUMENT_ROOT__PREDICATE_VALIDATOR:
				return getPredicateValidator();
			case CamelSpringPackage.DOCUMENT_ROOT__PROCESS:
				return getProcess();
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTIES_FUNCTION:
				return getPropertiesFunction();
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTIES_LOCATION:
				return getPropertiesLocation();
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY_EXPRESSION:
				return getPropertyExpression();
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
				return getPropertyPlaceholder();
			case CamelSpringPackage.DOCUMENT_ROOT__PROTOBUF:
				return getProtobuf();
			case CamelSpringPackage.DOCUMENT_ROOT__PUT:
				return getPut();
			case CamelSpringPackage.DOCUMENT_ROOT__PYTHON:
				return getPython();
			case CamelSpringPackage.DOCUMENT_ROOT__RANDOM_LOAD_BALANCER:
				return getRandomLoadBalancer();
			case CamelSpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
				return getRecipientList();
			case CamelSpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
				return getRedeliveryPolicy();
			case CamelSpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
				return getRedeliveryPolicyProfile();
			case CamelSpringPackage.DOCUMENT_ROOT__REF:
				return getRef();
			case CamelSpringPackage.DOCUMENT_ROOT__REF_ERROR_HANDLER:
				return getRefErrorHandler();
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
				return getRemoveHeader();
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
				return getRemoveHeaders();
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTIES:
				return getRemoveProperties();
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
				return getRemoveProperty();
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_VARIABLE:
				return getRemoveVariable();
			case CamelSpringPackage.DOCUMENT_ROOT__RESEQUENCE:
				return getResequence();
			case CamelSpringPackage.DOCUMENT_ROOT__RESILIENCE4J_CONFIGURATION:
				return getResilience4jConfiguration();
			case CamelSpringPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
				return getResponseHeader();
			case CamelSpringPackage.DOCUMENT_ROOT__RESPONSE_MESSAGE:
				return getResponseMessage();
			case CamelSpringPackage.DOCUMENT_ROOT__REST:
				return getRest();
			case CamelSpringPackage.DOCUMENT_ROOT__REST_BINDING:
				return getRestBinding();
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONFIGURATION:
				return getRestConfiguration();
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONTEXT:
				return getRestContext();
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONTEXT_REF:
				return getRestContextRef();
			case CamelSpringPackage.DOCUMENT_ROOT__REST_PROPERTY:
				return getRestProperty();
			case CamelSpringPackage.DOCUMENT_ROOT__RESTS:
				return getRests();
			case CamelSpringPackage.DOCUMENT_ROOT__RESUMABLE:
				return getResumable();
			case CamelSpringPackage.DOCUMENT_ROOT__ROLLBACK:
				return getRollback();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUND_ROBIN_LOAD_BALANCER:
				return getRoundRobinLoadBalancer();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE:
				return getRoute();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
				return getRouteBuilder();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION:
				return getRouteConfiguration();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION_CONTEXT:
				return getRouteConfigurationContext();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION_CONTEXT_REF:
				return getRouteConfigurationContextRef();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATIONS:
				return getRouteConfigurations();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
				return getRouteContext();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
				return getRouteContextRef();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTROLLER:
				return getRouteController();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTES:
				return getRoutes();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE:
				return getRouteTemplate();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE_CONTEXT:
				return getRouteTemplateContext();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE_CONTEXT_REF:
				return getRouteTemplateContextRef();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATES:
				return getRouteTemplates();
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
				return getRoutingSlip();
			case CamelSpringPackage.DOCUMENT_ROOT__RSS:
				return getRss();
			case CamelSpringPackage.DOCUMENT_ROOT__SAGA:
				return getSaga();
			case CamelSpringPackage.DOCUMENT_ROOT__SAMPLE:
				return getSample();
			case CamelSpringPackage.DOCUMENT_ROOT__SCRIPT:
				return getScript();
			case CamelSpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
				return getSecureRandomParameters();
			case CamelSpringPackage.DOCUMENT_ROOT__SECURITY:
				return getSecurity();
			case CamelSpringPackage.DOCUMENT_ROOT__SECURITY_DEFINITIONS:
				return getSecurityDefinitions();
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CALL:
				return getServiceCall();
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CALL_CONFIGURATION:
				return getServiceCallConfiguration();
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CHOOSER_CONFIGURATION:
				return getServiceChooserConfiguration();
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_DISCOVERY_CONFIGURATION:
				return getServiceDiscoveryConfiguration();
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_EXPRESSION:
				return getServiceExpression();
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_FILTER_CONFIGURATION:
				return getServiceFilterConfiguration();
			case CamelSpringPackage.DOCUMENT_ROOT__SET_BODY:
				return getSetBody();
			case CamelSpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case CamelSpringPackage.DOCUMENT_ROOT__SET_HEADER:
				return getSetHeader();
			case CamelSpringPackage.DOCUMENT_ROOT__SET_HEADERS:
				return getSetHeaders();
			case CamelSpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
				return getSetProperty();
			case CamelSpringPackage.DOCUMENT_ROOT__SET_VARIABLE:
				return getSetVariable();
			case CamelSpringPackage.DOCUMENT_ROOT__SET_VARIABLES:
				return getSetVariables();
			case CamelSpringPackage.DOCUMENT_ROOT__SIMPLE:
				return getSimple();
			case CamelSpringPackage.DOCUMENT_ROOT__SMOOKS:
				return getSmooks();
			case CamelSpringPackage.DOCUMENT_ROOT__SOAP:
				return getSoap();
			case CamelSpringPackage.DOCUMENT_ROOT__SORT:
				return getSort();
			case CamelSpringPackage.DOCUMENT_ROOT__SPEL:
				return getSpel();
			case CamelSpringPackage.DOCUMENT_ROOT__SPLIT:
				return getSplit();
			case CamelSpringPackage.DOCUMENT_ROOT__SPRING_TRANSACTION_ERROR_HANDLER:
				return getSpringTransactionErrorHandler();
			case CamelSpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
				return getSslContextParameters();
			case CamelSpringPackage.DOCUMENT_ROOT__STATIC_SERVICE_DISCOVERY:
				return getStaticServiceDiscovery();
			case CamelSpringPackage.DOCUMENT_ROOT__STEP:
				return getStep();
			case CamelSpringPackage.DOCUMENT_ROOT__STICKY_LOAD_BALANCER:
				return getStickyLoadBalancer();
			case CamelSpringPackage.DOCUMENT_ROOT__STOP:
				return getStop();
			case CamelSpringPackage.DOCUMENT_ROOT__STREAM_CACHING:
				return getStreamCaching();
			case CamelSpringPackage.DOCUMENT_ROOT__STREAM_CONFIG:
				return getStreamConfig();
			case CamelSpringPackage.DOCUMENT_ROOT__SWIFT_MT:
				return getSwiftMt();
			case CamelSpringPackage.DOCUMENT_ROOT__SWIFT_MX:
				return getSwiftMx();
			case CamelSpringPackage.DOCUMENT_ROOT__SYSLOG:
				return getSyslog();
			case CamelSpringPackage.DOCUMENT_ROOT__TAR_FILE:
				return getTarFile();
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATE:
				return getTemplate();
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTE:
				return getTemplatedRoute();
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTE_PARAMETER:
				return getTemplatedRouteParameter();
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTES:
				return getTemplatedRoutes();
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case CamelSpringPackage.DOCUMENT_ROOT__THREAD_POOL:
				return getThreadPool();
			case CamelSpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
				return getThreadPoolProfile();
			case CamelSpringPackage.DOCUMENT_ROOT__THREADS:
				return getThreads();
			case CamelSpringPackage.DOCUMENT_ROOT__THRIFT:
				return getThrift();
			case CamelSpringPackage.DOCUMENT_ROOT__THROTTLE:
				return getThrottle();
			case CamelSpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
				return getThrowException();
			case CamelSpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
				return getTidyMarkup();
			case CamelSpringPackage.DOCUMENT_ROOT__TO:
				return getTo();
			case CamelSpringPackage.DOCUMENT_ROOT__TO_D:
				return getToD();
			case CamelSpringPackage.DOCUMENT_ROOT__TOKENIZE:
				return getTokenize();
			case CamelSpringPackage.DOCUMENT_ROOT__TOKENIZER:
				return getTokenizer();
			case CamelSpringPackage.DOCUMENT_ROOT__TOPIC_LOAD_BALANCER:
				return getTopicLoadBalancer();
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSACTED:
				return getTransacted();
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform();
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSFORMERS:
				return getTransformers();
			case CamelSpringPackage.DOCUMENT_ROOT__TYPE_FILTER:
				return getTypeFilter();
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_CSV:
				return getUnivocityCsv();
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_FIXED:
				return getUnivocityFixed();
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_HEADER:
				return getUnivocityHeader();
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_TSV:
				return getUnivocityTsv();
			case CamelSpringPackage.DOCUMENT_ROOT__UNMARSHAL:
				return getUnmarshal();
			case CamelSpringPackage.DOCUMENT_ROOT__VALIDATE:
				return getValidate();
			case CamelSpringPackage.DOCUMENT_ROOT__VALIDATORS:
				return getValidators();
			case CamelSpringPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case CamelSpringPackage.DOCUMENT_ROOT__VARIABLE:
				return getVariable();
			case CamelSpringPackage.DOCUMENT_ROOT__WASM:
				return getWasm();
			case CamelSpringPackage.DOCUMENT_ROOT__WEIGHTED_LOAD_BALANCER:
				return getWeightedLoadBalancer();
			case CamelSpringPackage.DOCUMENT_ROOT__WHEN:
				return getWhen();
			case CamelSpringPackage.DOCUMENT_ROOT__WIRE_TAP:
				return getWireTap();
			case CamelSpringPackage.DOCUMENT_ROOT__XML_SECURITY:
				return getXmlSecurity();
			case CamelSpringPackage.DOCUMENT_ROOT__XPATH:
				return getXpath();
			case CamelSpringPackage.DOCUMENT_ROOT__XQUERY:
				return getXquery();
			case CamelSpringPackage.DOCUMENT_ROOT__XTOKENIZE:
				return getXtokenize();
			case CamelSpringPackage.DOCUMENT_ROOT__YAML:
				return getYaml();
			case CamelSpringPackage.DOCUMENT_ROOT__ZIP_DEFLATER:
				return getZipDeflater();
			case CamelSpringPackage.DOCUMENT_ROOT__ZIP_FILE:
				return getZipFile();
			case CamelSpringPackage.DOCUMENT_ROOT__ZOOKEEPER_SERVICE_DISCOVERY:
				return getZookeeperServiceDiscovery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__AGGREGATE:
				setAggregate((AggregateDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__API_KEY:
				setApiKey((ApiKeyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ASN1:
				setAsn1((Asn1DataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__AVRO:
				setAvro((AvroDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BARCODE:
				setBarcode((BarcodeDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BASE64:
				setBase64((Base64DataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BASIC_AUTH:
				setBasicAuth((BasicAuthDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BATCH_CONFIG:
				setBatchConfig((BatchResequencerConfig)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN:
				setBean((BeanDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN_FACTORY:
				setBeanFactory((BeanFactoryDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEANIO:
				setBeanio((BeanioDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
				setBeanPostProcessor((CamelBeanPostProcessor)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEANS:
				setBeans((BeansDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEARER_TOKEN:
				setBearerToken((BearerTokenDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BINDY:
				setBindy((BindyDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BLACKLIST_SERVICE_FILTER:
				setBlacklistServiceFilter((BlacklistServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CACHING_SERVICE_DISCOVERY:
				setCachingServiceDiscovery((CachingServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CAMEL:
				setCamel((ApplicationDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
				setCamelContext((CamelContextFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CBOR:
				setCbor((CborDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CHOICE:
				setChoice((ChoiceDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CIRCUIT_BREAKER:
				setCircuitBreaker((CircuitBreakerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CLAIM_CHECK:
				setClaimCheck((ClaimCheckDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__COMBINED_SERVICE_DISCOVERY:
				setCombinedServiceDiscovery((CombinedServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__COMBINED_SERVICE_FILTER:
				setCombinedServiceFilter((CombinedServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONSTANT:
				setConstant((ConstantExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONSUL_SERVICE_DISCOVERY:
				setConsulServiceDiscovery((ConsulServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
				setConsumerTemplate((CamelConsumerTemplateFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
				setContextScan((ContextScanDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
				setConvertBodyTo((ConvertBodyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_HEADER_TO:
				setConvertHeaderTo((ConvertHeaderDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_VARIABLE_TO:
				setConvertVariableTo((ConvertVariableDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CRYPTO:
				setCrypto((CryptoDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CSIMPLE:
				setCsimple((CSimpleExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CSV:
				setCsv((CsvDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM:
				setCustom((CustomDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
				setCustomLoadBalancer((CustomLoadBalancerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_SERVICE_FILTER:
				setCustomServiceFilter((CustomServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				setCustomTransformer((CustomTransformerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_VALIDATOR:
				setCustomValidator((CustomValidatorDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
				setDataFormats((DataFormatsDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DATA_FORMAT_TRANSFORMER:
				setDataFormatTransformer((DataFormatTransformerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DATASONNET:
				setDatasonnet((DatasonnetExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DEAD_LETTER_CHANNEL:
				setDeadLetterChannel((DeadLetterChannelDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DEFAULT_ERROR_HANDLER:
				setDefaultErrorHandler((DefaultErrorHandlerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DEFAULT_LOAD_BALANCER:
				setDefaultLoadBalancer((DefaultServiceCallServiceLoadBalancerConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DELAY:
				setDelay((DelayDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DELETE:
				setDelete((DeleteDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DFDL:
				setDfdl((DfdlDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DNS_SERVICE_DISCOVERY:
				setDnsServiceDiscovery((DnsServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DO_CATCH:
				setDoCatch((CatchDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DO_FINALLY:
				setDoFinally((FinallyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DO_TRY:
				setDoTry((TryDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
				setDynamicRouter((DynamicRouterDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((CamelEndpointFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT_TRANSFORMER:
				setEndpointTransformer((EndpointTransformerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT_VALIDATOR:
				setEndpointValidator((EndpointValidatorDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ENRICH:
				setEnrich((EnrichDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
				setErrorHandler((EObject)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__EXCHANGE_PROPERTY:
				setExchangeProperty((ExchangePropertyExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((ExpressionSubElementDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
				setExpressionDefinition((Expression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FAILOVER_LOAD_BALANCER:
				setFailoverLoadBalancer((FailoverLoadBalancerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FAULT_TOLERANCE_CONFIGURATION:
				setFaultToleranceConfiguration((FaultToleranceConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FHIR_JSON:
				setFhirJson((FhirJsonDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FHIR_XML:
				setFhirXml((FhirXmlDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FLATPACK:
				setFlatpack((FlatpackDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FLUENT_TEMPLATE:
				setFluentTemplate((CamelFluentProducerTemplateFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FORY:
				setFory((ForyDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FROM:
				setFrom((FromDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GET:
				setGet((GetDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GLOBAL_OPTION:
				setGlobalOption((GlobalOptionDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GLOBAL_OPTIONS:
				setGlobalOptions((GlobalOptionsDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GROK:
				setGrok((GrokDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GROOVY:
				setGroovy((GroovyExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GZIP_DEFLATER:
				setGzipDeflater((GzipDeflaterDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__HEAD:
				setHead((HeadDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__HEALTHY_SERVICE_FILTER:
				setHealthyServiceFilter((HealthyServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__HL7:
				setHl7((Hl7DataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__HL7TERSER:
				setHl7terser((Hl7TerserExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ICAL:
				setIcal((IcalDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
				setIdempotentConsumer((IdempotentConsumerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__INPUT_TYPE:
				setInputType((InputTypeDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT:
				setIntercept((InterceptDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
				setInterceptFrom((InterceptFromDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT_SEND_TO_ENDPOINT:
				setInterceptSendToEndpoint((InterceptSendToEndpointDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ISO8583:
				setIso8583((Iso8583DataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JACKSON_XML:
				setJacksonXml((JacksonXMLDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JAVA:
				setJava((JavaExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JAXB:
				setJaxb((JaxbDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JMX_AGENT:
				setJmxAgent((CamelJMXAgentDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JOOR:
				setJoor((JoorExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JQ:
				setJq((JqExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JS:
				setJs((JavaScriptExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JSON:
				setJson((JsonDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JSON_API:
				setJsonApi((JsonApiDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JSONPATH:
				setJsonpath((JsonPathExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JTA_TRANSACTION_ERROR_HANDLER:
				setJtaTransactionErrorHandler((JtaTransactionErrorHandlerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__KAMELET:
				setKamelet((KameletDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
				setKeyStoreParameters((KeyStoreParametersFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__KUBERNETES_SERVICE_DISCOVERY:
				setKubernetesServiceDiscovery((KubernetesServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_CHARACTER_TOKENIZER:
				setLangChain4jCharacterTokenizer((LangChain4JCharacterTokenizerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_LINE_TOKENIZER:
				setLangChain4jLineTokenizer((LangChain4JLineTokenizerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_PARAGRAPH_TOKENIZER:
				setLangChain4jParagraphTokenizer((LangChain4JParagraphTokenizerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_SENTENCE_TOKENIZER:
				setLangChain4jSentenceTokenizer((LangChain4JSentenceTokenizerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_WORD_TOKENIZER:
				setLangChain4jWordTokenizer((LangChain4JWordTokenizerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((LanguageExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
				setLoadBalance((LoadBalanceDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_BALANCER_CONFIGURATION:
				setLoadBalancerConfiguration((ServiceCallServiceLoadBalancerConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_TRANSFORMER:
				setLoadTransformer((LoadTransformerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LOG:
				setLog((LogDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LOOP:
				setLoop((LoopDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LZF:
				setLzf((LzfDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__MARSHAL:
				setMarshal((MarshalDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__METHOD:
				setMethod((MethodCallExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__MIME_MULTIPART:
				setMimeMultipart((MimeMultipartDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__MULTICAST:
				setMulticast((MulticastDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__MUTUAL_TLS:
				setMutualTLS((MutualTLSDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__MVEL:
				setMvel((MvelExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__NO_ERROR_HANDLER:
				setNoErrorHandler((NoErrorHandlerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OAUTH2:
				setOauth2((OAuth2Definition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OGNL:
				setOgnl((OgnlExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
				setOnCompletion((OnCompletionDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
				setOnException((OnExceptionDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_FALLBACK:
				setOnFallback((OnFallbackDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_WHEN:
				setOnWhen((OnWhenDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OPEN_API:
				setOpenApi((OpenApiDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OPEN_ID_CONNECT:
				setOpenIdConnect((OpenIdConnectDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OPTIMISTIC_LOCK_RETRY_POLICY:
				setOptimisticLockRetryPolicy((OptimisticLockRetryPolicyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OTHERWISE:
				setOtherwise((OtherwiseDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OUTPUT_TYPE:
				setOutputType((OutputTypeDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
				setPackageScan((PackageScanDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PARAM:
				setParam((ParamDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PARQUET_AVRO:
				setParquetAvro((ParquetAvroDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PASS_THROUGH_SERVICE_FILTER:
				setPassThroughServiceFilter((PassThroughServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PATCH:
				setPatch((PatchDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PAUSABLE:
				setPausable((PausableDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PGP:
				setPgp((PgpDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PIPELINE:
				setPipeline((PipelineDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__POLICY:
				setPolicy((PolicyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__POLL:
				setPoll((PollDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
				setPollEnrich((PollEnrichDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__POST:
				setPost((PostDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PREDICATE_VALIDATOR:
				setPredicateValidator((PredicateValidatorDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROCESS:
				setProcess((ProcessDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTIES_FUNCTION:
				setPropertiesFunction((CamelPropertyPlaceholderFunctionDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTIES_LOCATION:
				setPropertiesLocation((CamelPropertyPlaceholderLocationDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY_EXPRESSION:
				setPropertyExpression((PropertyExpressionDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
				setPropertyPlaceholder((CamelPropertyPlaceholderDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROTOBUF:
				setProtobuf((ProtobufDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PUT:
				setPut((PutDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PYTHON:
				setPython((PythonExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RANDOM_LOAD_BALANCER:
				setRandomLoadBalancer((RandomLoadBalancerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
				setRecipientList((RecipientListDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
				setRedeliveryPolicy((RedeliveryPolicyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
				setRedeliveryPolicyProfile((CamelRedeliveryPolicyFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REF:
				setRef((RefExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REF_ERROR_HANDLER:
				setRefErrorHandler((RefErrorHandlerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
				setRemoveHeader((RemoveHeaderDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
				setRemoveHeaders((RemoveHeadersDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTIES:
				setRemoveProperties((RemovePropertiesDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
				setRemoveProperty((RemovePropertyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_VARIABLE:
				setRemoveVariable((RemoveVariableDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESEQUENCE:
				setResequence((ResequenceDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESILIENCE4J_CONFIGURATION:
				setResilience4jConfiguration((Resilience4JConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
				setResponseHeader((ResponseHeaderDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESPONSE_MESSAGE:
				setResponseMessage((ResponseMessageDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST:
				setRest((RestDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_BINDING:
				setRestBinding((RestBindingDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONFIGURATION:
				setRestConfiguration((RestConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONTEXT:
				setRestContext((CamelRestContextFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONTEXT_REF:
				setRestContextRef((RestContextRefDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_PROPERTY:
				setRestProperty((RestPropertyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESTS:
				setRests((RestsDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESUMABLE:
				setResumable((ResumableDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROLLBACK:
				setRollback((RollbackDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUND_ROBIN_LOAD_BALANCER:
				setRoundRobinLoadBalancer((RoundRobinLoadBalancerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE:
				setRoute((RouteDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
				setRouteBuilder((RouteBuilderDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION:
				setRouteConfiguration((RouteConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION_CONTEXT:
				setRouteConfigurationContext((CamelRouteConfigurationContextFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION_CONTEXT_REF:
				setRouteConfigurationContextRef((RouteConfigurationContextRefDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATIONS:
				setRouteConfigurations((RouteConfigurationsDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
				setRouteContext((CamelRouteContextFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
				setRouteContextRef((RouteContextRefDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTROLLER:
				setRouteController((CamelRouteControllerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTES:
				setRoutes((RoutesDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE:
				setRouteTemplate((RouteTemplateDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE_CONTEXT:
				setRouteTemplateContext((CamelRouteTemplateContextFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE_CONTEXT_REF:
				setRouteTemplateContextRef((RouteTemplateContextRefDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATES:
				setRouteTemplates((RouteTemplatesDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
				setRoutingSlip((RoutingSlipDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RSS:
				setRss((RssDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SAGA:
				setSaga((SagaDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SAMPLE:
				setSample((SamplingDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SCRIPT:
				setScript((ScriptDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
				setSecureRandomParameters((SecureRandomParametersFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SECURITY:
				setSecurity((SecurityDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SECURITY_DEFINITIONS:
				setSecurityDefinitions((RestSecuritiesDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CALL:
				setServiceCall((ServiceCallDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CALL_CONFIGURATION:
				setServiceCallConfiguration((ServiceCallConfigurationDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CHOOSER_CONFIGURATION:
				setServiceChooserConfiguration((ServiceCallServiceChooserConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_DISCOVERY_CONFIGURATION:
				setServiceDiscoveryConfiguration((ServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_EXPRESSION:
				setServiceExpression((ServiceCallExpressionConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_FILTER_CONFIGURATION:
				setServiceFilterConfiguration((ServiceCallServiceFilterConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_BODY:
				setSetBody((SetBodyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
				setSetExchangePattern((SetExchangePatternDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_HEADER:
				setSetHeader((SetHeaderDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_HEADERS:
				setSetHeaders((SetHeadersDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
				setSetProperty((SetPropertyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_VARIABLE:
				setSetVariable((SetVariableDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_VARIABLES:
				setSetVariables((SetVariablesDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SIMPLE:
				setSimple((SimpleExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SMOOKS:
				setSmooks((SmooksDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SOAP:
				setSoap((SoapDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SORT:
				setSort((SortDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SPEL:
				setSpel((SpELExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SPLIT:
				setSplit((SplitDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SPRING_TRANSACTION_ERROR_HANDLER:
				setSpringTransactionErrorHandler((SpringTransactionErrorHandlerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
				setSslContextParameters((SslContextParametersFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STATIC_SERVICE_DISCOVERY:
				setStaticServiceDiscovery((StaticServiceCallServiceDiscoveryConfiguration)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STEP:
				setStep((StepDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STICKY_LOAD_BALANCER:
				setStickyLoadBalancer((StickyLoadBalancerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STOP:
				setStop((StopDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STREAM_CACHING:
				setStreamCaching((CamelStreamCachingStrategyDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STREAM_CONFIG:
				setStreamConfig((StreamResequencerConfig)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SWIFT_MT:
				setSwiftMt((SwiftMtDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SWIFT_MX:
				setSwiftMx((SwiftMxDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SYSLOG:
				setSyslog((SyslogDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TAR_FILE:
				setTarFile((TarFileDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATE:
				setTemplate((CamelProducerTemplateFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTE:
				setTemplatedRoute((TemplatedRouteDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTE_PARAMETER:
				setTemplatedRouteParameter((TemplatedRouteParameterDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTES:
				setTemplatedRoutes((TemplatedRoutesDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER:
				setTemplateParameter((RouteTemplateParameterDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THREAD_POOL:
				setThreadPool((CamelThreadPoolFactoryBean)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
				setThreadPoolProfile((ThreadPoolProfileDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THREADS:
				setThreads((ThreadsDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THRIFT:
				setThrift((ThriftDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THROTTLE:
				setThrottle((ThrottleDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
				setThrowException((ThrowExceptionDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
				setTidyMarkup((TidyMarkupDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TO:
				setTo((ToDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TO_D:
				setToD((ToDynamicDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TOKENIZE:
				setTokenize((TokenizerExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TOKENIZER:
				setTokenizer((TokenizerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TOPIC_LOAD_BALANCER:
				setTopicLoadBalancer((TopicLoadBalancerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSACTED:
				setTransacted((TransactedDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform((TransformDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSFORMERS:
				setTransformers((TransformersDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TYPE_FILTER:
				setTypeFilter((YamlTypeFilterDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_CSV:
				setUnivocityCsv((UniVocityCsvDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_FIXED:
				setUnivocityFixed((UniVocityFixedDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_HEADER:
				setUnivocityHeader((UniVocityHeader)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_TSV:
				setUnivocityTsv((UniVocityTsvDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__UNMARSHAL:
				setUnmarshal((UnmarshalDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__VALIDATE:
				setValidate((ValidateDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__VALIDATORS:
				setValidators((ValidatorsDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__VALUE:
				setValue((String)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__VARIABLE:
				setVariable((VariableExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__WASM:
				setWasm((WasmExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__WEIGHTED_LOAD_BALANCER:
				setWeightedLoadBalancer((WeightedLoadBalancerDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__WHEN:
				setWhen((WhenDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__WIRE_TAP:
				setWireTap((WireTapDefinition)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XML_SECURITY:
				setXmlSecurity((XmlSecurityDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XPATH:
				setXpath((XPathExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XQUERY:
				setXquery((XQueryExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XTOKENIZE:
				setXtokenize((XmlTokenizerExpression)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__YAML:
				setYaml((YamlDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ZIP_DEFLATER:
				setZipDeflater((ZipDeflaterDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ZIP_FILE:
				setZipFile((ZipFileDataFormat)newValue);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ZOOKEEPER_SERVICE_DISCOVERY:
				setZookeeperServiceDiscovery((ZooKeeperServiceCallServiceDiscoveryConfiguration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__AGGREGATE:
				setAggregate((AggregateDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__API_KEY:
				setApiKey((ApiKeyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ASN1:
				setAsn1((Asn1DataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__AVRO:
				setAvro((AvroDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BARCODE:
				setBarcode((BarcodeDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BASE64:
				setBase64((Base64DataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BASIC_AUTH:
				setBasicAuth((BasicAuthDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BATCH_CONFIG:
				setBatchConfig((BatchResequencerConfig)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN:
				setBean((BeanDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN_FACTORY:
				setBeanFactory((BeanFactoryDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEANIO:
				setBeanio((BeanioDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
				setBeanPostProcessor((CamelBeanPostProcessor)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEANS:
				setBeans((BeansDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BEARER_TOKEN:
				setBearerToken((BearerTokenDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BINDY:
				setBindy((BindyDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__BLACKLIST_SERVICE_FILTER:
				setBlacklistServiceFilter((BlacklistServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CACHING_SERVICE_DISCOVERY:
				setCachingServiceDiscovery((CachingServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CAMEL:
				setCamel((ApplicationDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
				setCamelContext((CamelContextFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CBOR:
				setCbor((CborDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CHOICE:
				setChoice((ChoiceDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CIRCUIT_BREAKER:
				setCircuitBreaker((CircuitBreakerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CLAIM_CHECK:
				setClaimCheck((ClaimCheckDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__COMBINED_SERVICE_DISCOVERY:
				setCombinedServiceDiscovery((CombinedServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__COMBINED_SERVICE_FILTER:
				setCombinedServiceFilter((CombinedServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONSTANT:
				setConstant((ConstantExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONSUL_SERVICE_DISCOVERY:
				setConsulServiceDiscovery((ConsulServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
				setConsumerTemplate((CamelConsumerTemplateFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
				setContextScan((ContextScanDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
				setConvertBodyTo((ConvertBodyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_HEADER_TO:
				setConvertHeaderTo((ConvertHeaderDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_VARIABLE_TO:
				setConvertVariableTo((ConvertVariableDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CRYPTO:
				setCrypto((CryptoDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CSIMPLE:
				setCsimple((CSimpleExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CSV:
				setCsv((CsvDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM:
				setCustom((CustomDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
				setCustomLoadBalancer((CustomLoadBalancerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_SERVICE_FILTER:
				setCustomServiceFilter((CustomServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				setCustomTransformer((CustomTransformerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_VALIDATOR:
				setCustomValidator((CustomValidatorDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
				setDataFormats((DataFormatsDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DATA_FORMAT_TRANSFORMER:
				setDataFormatTransformer((DataFormatTransformerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DATASONNET:
				setDatasonnet((DatasonnetExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DEAD_LETTER_CHANNEL:
				setDeadLetterChannel((DeadLetterChannelDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DEFAULT_ERROR_HANDLER:
				setDefaultErrorHandler((DefaultErrorHandlerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DEFAULT_LOAD_BALANCER:
				setDefaultLoadBalancer((DefaultServiceCallServiceLoadBalancerConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DELAY:
				setDelay((DelayDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DELETE:
				setDelete((DeleteDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DFDL:
				setDfdl((DfdlDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DNS_SERVICE_DISCOVERY:
				setDnsServiceDiscovery((DnsServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DO_CATCH:
				setDoCatch((CatchDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DO_FINALLY:
				setDoFinally((FinallyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DO_TRY:
				setDoTry((TryDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
				setDynamicRouter((DynamicRouterDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((CamelEndpointFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT_TRANSFORMER:
				setEndpointTransformer((EndpointTransformerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT_VALIDATOR:
				setEndpointValidator((EndpointValidatorDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ENRICH:
				setEnrich((EnrichDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
				setErrorHandler((EObject)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__EXCHANGE_PROPERTY:
				setExchangeProperty((ExchangePropertyExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((ExpressionSubElementDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
				setExpressionDefinition((Expression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FAILOVER_LOAD_BALANCER:
				setFailoverLoadBalancer((FailoverLoadBalancerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FAULT_TOLERANCE_CONFIGURATION:
				setFaultToleranceConfiguration((FaultToleranceConfigurationDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FHIR_JSON:
				setFhirJson((FhirJsonDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FHIR_XML:
				setFhirXml((FhirXmlDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FLATPACK:
				setFlatpack((FlatpackDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FLUENT_TEMPLATE:
				setFluentTemplate((CamelFluentProducerTemplateFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FORY:
				setFory((ForyDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__FROM:
				setFrom((FromDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GET:
				setGet((GetDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GLOBAL_OPTION:
				setGlobalOption((GlobalOptionDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GLOBAL_OPTIONS:
				setGlobalOptions((GlobalOptionsDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GROK:
				setGrok((GrokDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GROOVY:
				setGroovy((GroovyExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__GZIP_DEFLATER:
				setGzipDeflater((GzipDeflaterDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__HEAD:
				setHead((HeadDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__HEALTHY_SERVICE_FILTER:
				setHealthyServiceFilter((HealthyServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__HL7:
				setHl7((Hl7DataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__HL7TERSER:
				setHl7terser((Hl7TerserExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ICAL:
				setIcal((IcalDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
				setIdempotentConsumer((IdempotentConsumerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__INPUT_TYPE:
				setInputType((InputTypeDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT:
				setIntercept((InterceptDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
				setInterceptFrom((InterceptFromDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT_SEND_TO_ENDPOINT:
				setInterceptSendToEndpoint((InterceptSendToEndpointDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ISO8583:
				setIso8583((Iso8583DataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JACKSON_XML:
				setJacksonXml((JacksonXMLDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JAVA:
				setJava((JavaExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JAXB:
				setJaxb((JaxbDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JMX_AGENT:
				setJmxAgent((CamelJMXAgentDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JOOR:
				setJoor((JoorExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JQ:
				setJq((JqExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JS:
				setJs((JavaScriptExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JSON:
				setJson((JsonDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JSON_API:
				setJsonApi((JsonApiDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JSONPATH:
				setJsonpath((JsonPathExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__JTA_TRANSACTION_ERROR_HANDLER:
				setJtaTransactionErrorHandler((JtaTransactionErrorHandlerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__KAMELET:
				setKamelet((KameletDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
				setKeyStoreParameters((KeyStoreParametersFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__KUBERNETES_SERVICE_DISCOVERY:
				setKubernetesServiceDiscovery((KubernetesServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_CHARACTER_TOKENIZER:
				setLangChain4jCharacterTokenizer((LangChain4JCharacterTokenizerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_LINE_TOKENIZER:
				setLangChain4jLineTokenizer((LangChain4JLineTokenizerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_PARAGRAPH_TOKENIZER:
				setLangChain4jParagraphTokenizer((LangChain4JParagraphTokenizerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_SENTENCE_TOKENIZER:
				setLangChain4jSentenceTokenizer((LangChain4JSentenceTokenizerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_WORD_TOKENIZER:
				setLangChain4jWordTokenizer((LangChain4JWordTokenizerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((LanguageExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
				setLoadBalance((LoadBalanceDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_BALANCER_CONFIGURATION:
				setLoadBalancerConfiguration((ServiceCallServiceLoadBalancerConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_TRANSFORMER:
				setLoadTransformer((LoadTransformerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LOG:
				setLog((LogDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LOOP:
				setLoop((LoopDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__LZF:
				setLzf((LzfDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__MARSHAL:
				setMarshal((MarshalDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__METHOD:
				setMethod((MethodCallExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__MIME_MULTIPART:
				setMimeMultipart((MimeMultipartDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__MULTICAST:
				setMulticast((MulticastDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__MUTUAL_TLS:
				setMutualTLS((MutualTLSDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__MVEL:
				setMvel((MvelExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__NO_ERROR_HANDLER:
				setNoErrorHandler((NoErrorHandlerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OAUTH2:
				setOauth2((OAuth2Definition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OGNL:
				setOgnl((OgnlExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
				setOnCompletion((OnCompletionDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
				setOnException((OnExceptionDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_FALLBACK:
				setOnFallback((OnFallbackDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_WHEN:
				setOnWhen((OnWhenDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OPEN_API:
				setOpenApi((OpenApiDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OPEN_ID_CONNECT:
				setOpenIdConnect((OpenIdConnectDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OPTIMISTIC_LOCK_RETRY_POLICY:
				setOptimisticLockRetryPolicy((OptimisticLockRetryPolicyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OTHERWISE:
				setOtherwise((OtherwiseDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__OUTPUT_TYPE:
				setOutputType((OutputTypeDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
				setPackageScan((PackageScanDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PARAM:
				setParam((ParamDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PARQUET_AVRO:
				setParquetAvro((ParquetAvroDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PASS_THROUGH_SERVICE_FILTER:
				setPassThroughServiceFilter((PassThroughServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PATCH:
				setPatch((PatchDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PAUSABLE:
				setPausable((PausableDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PGP:
				setPgp((PgpDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PIPELINE:
				setPipeline((PipelineDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__POLICY:
				setPolicy((PolicyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__POLL:
				setPoll((PollDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
				setPollEnrich((PollEnrichDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__POST:
				setPost((PostDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PREDICATE_VALIDATOR:
				setPredicateValidator((PredicateValidatorDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROCESS:
				setProcess((ProcessDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTIES_FUNCTION:
				setPropertiesFunction((CamelPropertyPlaceholderFunctionDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTIES_LOCATION:
				setPropertiesLocation((CamelPropertyPlaceholderLocationDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY_EXPRESSION:
				setPropertyExpression((PropertyExpressionDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
				setPropertyPlaceholder((CamelPropertyPlaceholderDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PROTOBUF:
				setProtobuf((ProtobufDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PUT:
				setPut((PutDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__PYTHON:
				setPython((PythonExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RANDOM_LOAD_BALANCER:
				setRandomLoadBalancer((RandomLoadBalancerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
				setRecipientList((RecipientListDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
				setRedeliveryPolicy((RedeliveryPolicyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
				setRedeliveryPolicyProfile((CamelRedeliveryPolicyFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REF:
				setRef((RefExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REF_ERROR_HANDLER:
				setRefErrorHandler((RefErrorHandlerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
				setRemoveHeader((RemoveHeaderDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
				setRemoveHeaders((RemoveHeadersDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTIES:
				setRemoveProperties((RemovePropertiesDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
				setRemoveProperty((RemovePropertyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_VARIABLE:
				setRemoveVariable((RemoveVariableDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESEQUENCE:
				setResequence((ResequenceDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESILIENCE4J_CONFIGURATION:
				setResilience4jConfiguration((Resilience4JConfigurationDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
				setResponseHeader((ResponseHeaderDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESPONSE_MESSAGE:
				setResponseMessage((ResponseMessageDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST:
				setRest((RestDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_BINDING:
				setRestBinding((RestBindingDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONFIGURATION:
				setRestConfiguration((RestConfigurationDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONTEXT:
				setRestContext((CamelRestContextFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONTEXT_REF:
				setRestContextRef((RestContextRefDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_PROPERTY:
				setRestProperty((RestPropertyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESTS:
				setRests((RestsDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RESUMABLE:
				setResumable((ResumableDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROLLBACK:
				setRollback((RollbackDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUND_ROBIN_LOAD_BALANCER:
				setRoundRobinLoadBalancer((RoundRobinLoadBalancerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE:
				setRoute((RouteDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
				setRouteBuilder((RouteBuilderDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION:
				setRouteConfiguration((RouteConfigurationDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION_CONTEXT:
				setRouteConfigurationContext((CamelRouteConfigurationContextFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION_CONTEXT_REF:
				setRouteConfigurationContextRef((RouteConfigurationContextRefDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATIONS:
				setRouteConfigurations((RouteConfigurationsDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
				setRouteContext((CamelRouteContextFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
				setRouteContextRef((RouteContextRefDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTROLLER:
				setRouteController((CamelRouteControllerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTES:
				setRoutes((RoutesDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE:
				setRouteTemplate((RouteTemplateDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE_CONTEXT:
				setRouteTemplateContext((CamelRouteTemplateContextFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE_CONTEXT_REF:
				setRouteTemplateContextRef((RouteTemplateContextRefDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATES:
				setRouteTemplates((RouteTemplatesDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
				setRoutingSlip((RoutingSlipDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__RSS:
				setRss((RssDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SAGA:
				setSaga((SagaDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SAMPLE:
				setSample((SamplingDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SCRIPT:
				setScript((ScriptDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
				setSecureRandomParameters((SecureRandomParametersFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SECURITY:
				setSecurity((SecurityDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SECURITY_DEFINITIONS:
				setSecurityDefinitions((RestSecuritiesDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CALL:
				setServiceCall((ServiceCallDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CALL_CONFIGURATION:
				setServiceCallConfiguration((ServiceCallConfigurationDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CHOOSER_CONFIGURATION:
				setServiceChooserConfiguration((ServiceCallServiceChooserConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_DISCOVERY_CONFIGURATION:
				setServiceDiscoveryConfiguration((ServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_EXPRESSION:
				setServiceExpression((ServiceCallExpressionConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_FILTER_CONFIGURATION:
				setServiceFilterConfiguration((ServiceCallServiceFilterConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_BODY:
				setSetBody((SetBodyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
				setSetExchangePattern((SetExchangePatternDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_HEADER:
				setSetHeader((SetHeaderDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_HEADERS:
				setSetHeaders((SetHeadersDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
				setSetProperty((SetPropertyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_VARIABLE:
				setSetVariable((SetVariableDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_VARIABLES:
				setSetVariables((SetVariablesDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SIMPLE:
				setSimple((SimpleExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SMOOKS:
				setSmooks((SmooksDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SOAP:
				setSoap((SoapDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SORT:
				setSort((SortDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SPEL:
				setSpel((SpELExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SPLIT:
				setSplit((SplitDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SPRING_TRANSACTION_ERROR_HANDLER:
				setSpringTransactionErrorHandler((SpringTransactionErrorHandlerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
				setSslContextParameters((SslContextParametersFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STATIC_SERVICE_DISCOVERY:
				setStaticServiceDiscovery((StaticServiceCallServiceDiscoveryConfiguration)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STEP:
				setStep((StepDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STICKY_LOAD_BALANCER:
				setStickyLoadBalancer((StickyLoadBalancerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STOP:
				setStop((StopDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STREAM_CACHING:
				setStreamCaching((CamelStreamCachingStrategyDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__STREAM_CONFIG:
				setStreamConfig((StreamResequencerConfig)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SWIFT_MT:
				setSwiftMt((SwiftMtDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SWIFT_MX:
				setSwiftMx((SwiftMxDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__SYSLOG:
				setSyslog((SyslogDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TAR_FILE:
				setTarFile((TarFileDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATE:
				setTemplate((CamelProducerTemplateFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTE:
				setTemplatedRoute((TemplatedRouteDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTE_PARAMETER:
				setTemplatedRouteParameter((TemplatedRouteParameterDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTES:
				setTemplatedRoutes((TemplatedRoutesDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER:
				setTemplateParameter((RouteTemplateParameterDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THREAD_POOL:
				setThreadPool((CamelThreadPoolFactoryBean)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
				setThreadPoolProfile((ThreadPoolProfileDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THREADS:
				setThreads((ThreadsDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THRIFT:
				setThrift((ThriftDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THROTTLE:
				setThrottle((ThrottleDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
				setThrowException((ThrowExceptionDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
				setTidyMarkup((TidyMarkupDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TO:
				setTo((ToDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TO_D:
				setToD((ToDynamicDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TOKENIZE:
				setTokenize((TokenizerExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TOKENIZER:
				setTokenizer((TokenizerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TOPIC_LOAD_BALANCER:
				setTopicLoadBalancer((TopicLoadBalancerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSACTED:
				setTransacted((TransactedDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform((TransformDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSFORMERS:
				setTransformers((TransformersDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__TYPE_FILTER:
				setTypeFilter((YamlTypeFilterDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_CSV:
				setUnivocityCsv((UniVocityCsvDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_FIXED:
				setUnivocityFixed((UniVocityFixedDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_HEADER:
				setUnivocityHeader((UniVocityHeader)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_TSV:
				setUnivocityTsv((UniVocityTsvDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__UNMARSHAL:
				setUnmarshal((UnmarshalDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__VALIDATE:
				setValidate((ValidateDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__VALIDATORS:
				setValidators((ValidatorsDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__VARIABLE:
				setVariable((VariableExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__WASM:
				setWasm((WasmExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__WEIGHTED_LOAD_BALANCER:
				setWeightedLoadBalancer((WeightedLoadBalancerDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__WHEN:
				setWhen((WhenDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__WIRE_TAP:
				setWireTap((WireTapDefinition)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XML_SECURITY:
				setXmlSecurity((XmlSecurityDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XPATH:
				setXpath((XPathExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XQUERY:
				setXquery((XQueryExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__XTOKENIZE:
				setXtokenize((XmlTokenizerExpression)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__YAML:
				setYaml((YamlDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ZIP_DEFLATER:
				setZipDeflater((ZipDeflaterDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ZIP_FILE:
				setZipFile((ZipFileDataFormat)null);
				return;
			case CamelSpringPackage.DOCUMENT_ROOT__ZOOKEEPER_SERVICE_DISCOVERY:
				setZookeeperServiceDiscovery((ZooKeeperServiceCallServiceDiscoveryConfiguration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CamelSpringPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CamelSpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CamelSpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CamelSpringPackage.DOCUMENT_ROOT__AGGREGATE:
				return getAggregate() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__API_KEY:
				return getApiKey() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ASN1:
				return getAsn1() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__AVRO:
				return getAvro() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BARCODE:
				return getBarcode() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BASE64:
				return getBase64() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BASIC_AUTH:
				return getBasicAuth() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BATCH_CONFIG:
				return getBatchConfig() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN:
				return getBean() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN_FACTORY:
				return getBeanFactory() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BEANIO:
				return getBeanio() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
				return getBeanPostProcessor() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BEANS:
				return getBeans() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BEARER_TOKEN:
				return getBearerToken() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BINDY:
				return getBindy() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__BLACKLIST_SERVICE_FILTER:
				return getBlacklistServiceFilter() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CACHING_SERVICE_DISCOVERY:
				return getCachingServiceDiscovery() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CAMEL:
				return getCamel() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
				return getCamelContext() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CBOR:
				return getCbor() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CHOICE:
				return getChoice() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CIRCUIT_BREAKER:
				return getCircuitBreaker() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CLAIM_CHECK:
				return getClaimCheck() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__COMBINED_SERVICE_DISCOVERY:
				return getCombinedServiceDiscovery() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__COMBINED_SERVICE_FILTER:
				return getCombinedServiceFilter() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CONSTANT:
				return getConstant() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CONSUL_SERVICE_DISCOVERY:
				return getConsulServiceDiscovery() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
				return getConsumerTemplate() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
				return getContextScan() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
				return getConvertBodyTo() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_HEADER_TO:
				return getConvertHeaderTo() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CONVERT_VARIABLE_TO:
				return getConvertVariableTo() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CRYPTO:
				return getCrypto() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CSIMPLE:
				return getCsimple() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CSV:
				return getCsv() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM:
				return getCustom() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
				return getCustomLoadBalancer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_SERVICE_FILTER:
				return getCustomServiceFilter() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				return getCustomTransformer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__CUSTOM_VALIDATOR:
				return getCustomValidator() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
				return getDataFormats() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DATA_FORMAT_TRANSFORMER:
				return getDataFormatTransformer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DATASONNET:
				return getDatasonnet() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DEAD_LETTER_CHANNEL:
				return getDeadLetterChannel() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DEFAULT_ERROR_HANDLER:
				return getDefaultErrorHandler() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DEFAULT_LOAD_BALANCER:
				return getDefaultLoadBalancer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DELAY:
				return getDelay() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DELETE:
				return getDelete() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DFDL:
				return getDfdl() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DNS_SERVICE_DISCOVERY:
				return getDnsServiceDiscovery() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DO_CATCH:
				return getDoCatch() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DO_FINALLY:
				return getDoFinally() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DO_TRY:
				return getDoTry() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
				return getDynamicRouter() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT_TRANSFORMER:
				return getEndpointTransformer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ENDPOINT_VALIDATOR:
				return getEndpointValidator() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ENRICH:
				return getEnrich() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
				return getErrorHandler() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__EXCHANGE_PROPERTY:
				return getExchangeProperty() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
				return getExpressionDefinition() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__FAILOVER_LOAD_BALANCER:
				return getFailoverLoadBalancer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__FAULT_TOLERANCE_CONFIGURATION:
				return getFaultToleranceConfiguration() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__FHIR_JSON:
				return getFhirJson() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__FHIR_XML:
				return getFhirXml() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__FILTER:
				return getFilter() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__FLATPACK:
				return getFlatpack() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__FLUENT_TEMPLATE:
				return getFluentTemplate() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__FORY:
				return getFory() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__FROM:
				return getFrom() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__GET:
				return getGet() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__GLOBAL_OPTION:
				return getGlobalOption() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__GLOBAL_OPTIONS:
				return getGlobalOptions() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__GROK:
				return getGrok() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__GROOVY:
				return getGroovy() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__GZIP_DEFLATER:
				return getGzipDeflater() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__HEAD:
				return getHead() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__HEADER:
				return getHeader() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__HEALTHY_SERVICE_FILTER:
				return getHealthyServiceFilter() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__HL7:
				return getHl7() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__HL7TERSER:
				return getHl7terser() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ICAL:
				return getIcal() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__INPUT_TYPE:
				return getInputType() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT:
				return getIntercept() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
				return getInterceptFrom() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__INTERCEPT_SEND_TO_ENDPOINT:
				return getInterceptSendToEndpoint() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ISO8583:
				return getIso8583() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JACKSON_XML:
				return getJacksonXml() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JAVA:
				return getJava() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JAXB:
				return getJaxb() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JMX_AGENT:
				return getJmxAgent() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JOOR:
				return getJoor() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JQ:
				return getJq() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JS:
				return getJs() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JSON:
				return getJson() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JSON_API:
				return getJsonApi() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JSONPATH:
				return getJsonpath() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__JTA_TRANSACTION_ERROR_HANDLER:
				return getJtaTransactionErrorHandler() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__KAMELET:
				return getKamelet() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
				return getKeyStoreParameters() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__KUBERNETES_SERVICE_DISCOVERY:
				return getKubernetesServiceDiscovery() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_CHARACTER_TOKENIZER:
				return getLangChain4jCharacterTokenizer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_LINE_TOKENIZER:
				return getLangChain4jLineTokenizer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_PARAGRAPH_TOKENIZER:
				return getLangChain4jParagraphTokenizer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_SENTENCE_TOKENIZER:
				return getLangChain4jSentenceTokenizer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LANG_CHAIN4J_WORD_TOKENIZER:
				return getLangChain4jWordTokenizer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
				return getLoadBalance() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_BALANCER_CONFIGURATION:
				return getLoadBalancerConfiguration() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LOAD_TRANSFORMER:
				return getLoadTransformer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LOG:
				return getLog() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LOOP:
				return getLoop() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__LZF:
				return getLzf() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__MARSHAL:
				return getMarshal() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__METHOD:
				return getMethod() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__MIME_MULTIPART:
				return getMimeMultipart() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__MULTICAST:
				return getMulticast() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__MUTUAL_TLS:
				return getMutualTLS() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__MVEL:
				return getMvel() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__NO_ERROR_HANDLER:
				return getNoErrorHandler() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__OAUTH2:
				return getOauth2() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__OGNL:
				return getOgnl() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
				return getOnCompletion() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
				return getOnException() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_FALLBACK:
				return getOnFallback() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ON_WHEN:
				return getOnWhen() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__OPEN_API:
				return getOpenApi() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__OPEN_ID_CONNECT:
				return getOpenIdConnect() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__OPTIMISTIC_LOCK_RETRY_POLICY:
				return getOptimisticLockRetryPolicy() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__OTHERWISE:
				return getOtherwise() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__OUTPUT_TYPE:
				return getOutputType() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
				return getPackageScan() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PARAM:
				return getParam() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PARQUET_AVRO:
				return getParquetAvro() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PASS_THROUGH_SERVICE_FILTER:
				return getPassThroughServiceFilter() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PATCH:
				return getPatch() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PAUSABLE:
				return getPausable() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PGP:
				return getPgp() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PIPELINE:
				return getPipeline() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__POLICY:
				return getPolicy() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__POLL:
				return getPoll() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
				return getPollEnrich() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__POST:
				return getPost() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PREDICATE_VALIDATOR:
				return getPredicateValidator() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PROCESS:
				return getProcess() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTIES_FUNCTION:
				return getPropertiesFunction() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTIES_LOCATION:
				return getPropertiesLocation() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY_EXPRESSION:
				return getPropertyExpression() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
				return getPropertyPlaceholder() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PROTOBUF:
				return getProtobuf() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PUT:
				return getPut() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__PYTHON:
				return getPython() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__RANDOM_LOAD_BALANCER:
				return getRandomLoadBalancer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
				return getRecipientList() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
				return getRedeliveryPolicy() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
				return getRedeliveryPolicyProfile() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REF:
				return getRef() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REF_ERROR_HANDLER:
				return getRefErrorHandler() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
				return getRemoveHeader() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
				return getRemoveHeaders() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTIES:
				return getRemoveProperties() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
				return getRemoveProperty() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REMOVE_VARIABLE:
				return getRemoveVariable() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__RESEQUENCE:
				return getResequence() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__RESILIENCE4J_CONFIGURATION:
				return getResilience4jConfiguration() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__RESPONSE_HEADER:
				return getResponseHeader() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__RESPONSE_MESSAGE:
				return getResponseMessage() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REST:
				return getRest() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_BINDING:
				return getRestBinding() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONFIGURATION:
				return getRestConfiguration() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONTEXT:
				return getRestContext() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_CONTEXT_REF:
				return getRestContextRef() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__REST_PROPERTY:
				return getRestProperty() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__RESTS:
				return getRests() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__RESUMABLE:
				return getResumable() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROLLBACK:
				return getRollback() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUND_ROBIN_LOAD_BALANCER:
				return getRoundRobinLoadBalancer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE:
				return getRoute() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
				return getRouteBuilder() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION:
				return getRouteConfiguration() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION_CONTEXT:
				return getRouteConfigurationContext() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATION_CONTEXT_REF:
				return getRouteConfigurationContextRef() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONFIGURATIONS:
				return getRouteConfigurations() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
				return getRouteContext() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
				return getRouteContextRef() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_CONTROLLER:
				return getRouteController() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTES:
				return getRoutes() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE:
				return getRouteTemplate() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE_CONTEXT:
				return getRouteTemplateContext() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATE_CONTEXT_REF:
				return getRouteTemplateContextRef() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTE_TEMPLATES:
				return getRouteTemplates() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
				return getRoutingSlip() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__RSS:
				return getRss() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SAGA:
				return getSaga() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SAMPLE:
				return getSample() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SCRIPT:
				return getScript() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
				return getSecureRandomParameters() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SECURITY:
				return getSecurity() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SECURITY_DEFINITIONS:
				return getSecurityDefinitions() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CALL:
				return getServiceCall() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CALL_CONFIGURATION:
				return getServiceCallConfiguration() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_CHOOSER_CONFIGURATION:
				return getServiceChooserConfiguration() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_DISCOVERY_CONFIGURATION:
				return getServiceDiscoveryConfiguration() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_EXPRESSION:
				return getServiceExpression() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SERVICE_FILTER_CONFIGURATION:
				return getServiceFilterConfiguration() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_BODY:
				return getSetBody() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_HEADER:
				return getSetHeader() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_HEADERS:
				return getSetHeaders() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
				return getSetProperty() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_VARIABLE:
				return getSetVariable() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SET_VARIABLES:
				return getSetVariables() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SIMPLE:
				return getSimple() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SMOOKS:
				return getSmooks() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SOAP:
				return getSoap() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SORT:
				return getSort() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SPEL:
				return getSpel() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SPLIT:
				return getSplit() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SPRING_TRANSACTION_ERROR_HANDLER:
				return getSpringTransactionErrorHandler() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
				return getSslContextParameters() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__STATIC_SERVICE_DISCOVERY:
				return getStaticServiceDiscovery() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__STEP:
				return getStep() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__STICKY_LOAD_BALANCER:
				return getStickyLoadBalancer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__STOP:
				return getStop() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__STREAM_CACHING:
				return getStreamCaching() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__STREAM_CONFIG:
				return getStreamConfig() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SWIFT_MT:
				return getSwiftMt() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SWIFT_MX:
				return getSwiftMx() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__SYSLOG:
				return getSyslog() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TAR_FILE:
				return getTarFile() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATE:
				return getTemplate() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTE:
				return getTemplatedRoute() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTE_PARAMETER:
				return getTemplatedRouteParameter() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATED_ROUTES:
				return getTemplatedRoutes() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TEMPLATE_PARAMETER:
				return getTemplateParameter() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__THREAD_POOL:
				return getThreadPool() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
				return getThreadPoolProfile() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__THREADS:
				return getThreads() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__THRIFT:
				return getThrift() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__THROTTLE:
				return getThrottle() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
				return getThrowException() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
				return getTidyMarkup() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TO:
				return getTo() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TO_D:
				return getToD() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TOKENIZE:
				return getTokenize() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TOKENIZER:
				return getTokenizer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TOPIC_LOAD_BALANCER:
				return getTopicLoadBalancer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSACTED:
				return getTransacted() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TRANSFORMERS:
				return getTransformers() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__TYPE_FILTER:
				return getTypeFilter() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_CSV:
				return getUnivocityCsv() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_FIXED:
				return getUnivocityFixed() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_HEADER:
				return getUnivocityHeader() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__UNIVOCITY_TSV:
				return getUnivocityTsv() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__UNMARSHAL:
				return getUnmarshal() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__VALIDATE:
				return getValidate() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__VALIDATORS:
				return getValidators() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case CamelSpringPackage.DOCUMENT_ROOT__VARIABLE:
				return getVariable() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__WASM:
				return getWasm() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__WEIGHTED_LOAD_BALANCER:
				return getWeightedLoadBalancer() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__WHEN:
				return getWhen() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__WIRE_TAP:
				return getWireTap() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__XML_SECURITY:
				return getXmlSecurity() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__XPATH:
				return getXpath() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__XQUERY:
				return getXquery() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__XTOKENIZE:
				return getXtokenize() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__YAML:
				return getYaml() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ZIP_DEFLATER:
				return getZipDeflater() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ZIP_FILE:
				return getZipFile() != null;
			case CamelSpringPackage.DOCUMENT_ROOT__ZOOKEEPER_SERVICE_DISCOVERY:
				return getZookeeperServiceDiscovery() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl

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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getAsn1 <em>Asn1</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getAvro <em>Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBarcode <em>Barcode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBase64 <em>Base64</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBasicAuth <em>Basic Auth</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBatchConfig <em>Batch Config</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBeanFactory <em>Bean Factory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBeanio <em>Beanio</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBeanPostProcessor <em>Bean Post Processor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBeans <em>Beans</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBearerToken <em>Bearer Token</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBlacklistServiceFilter <em>Blacklist Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCachingServiceDiscovery <em>Caching Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCamel <em>Camel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCamelContext <em>Camel Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCbor <em>Cbor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getClaimCheck <em>Claim Check</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCombinedServiceDiscovery <em>Combined Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCombinedServiceFilter <em>Combined Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConsulServiceDiscovery <em>Consul Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConsumerTemplate <em>Consumer Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getContextScan <em>Context Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConvertHeaderTo <em>Convert Header To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConvertVariableTo <em>Convert Variable To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCsimple <em>Csimple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCustomLoadBalancer <em>Custom Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCustomServiceFilter <em>Custom Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCustomTransformer <em>Custom Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCustomValidator <em>Custom Validator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDataFormatTransformer <em>Data Format Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDatasonnet <em>Datasonnet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDeadLetterChannel <em>Dead Letter Channel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDefaultErrorHandler <em>Default Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDefaultLoadBalancer <em>Default Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDfdl <em>Dfdl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDnsServiceDiscovery <em>Dns Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getEndpointTransformer <em>Endpoint Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getEndpointValidator <em>Endpoint Validator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getExchangeProperty <em>Exchange Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFailoverLoadBalancer <em>Failover Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFaultToleranceConfiguration <em>Fault Tolerance Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFhirJson <em>Fhir Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFhirXml <em>Fhir Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFluentTemplate <em>Fluent Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFory <em>Fory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGet <em>Get</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGlobalOption <em>Global Option</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGlobalOptions <em>Global Options</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGrok <em>Grok</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGzipDeflater <em>Gzip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getHead <em>Head</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getHealthyServiceFilter <em>Healthy Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getHl7terser <em>Hl7terser</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getIcal <em>Ical</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getIso8583 <em>Iso8583</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJacksonXml <em>Jackson Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJava <em>Java</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJmxAgent <em>Jmx Agent</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJoor <em>Joor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJq <em>Jq</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJs <em>Js</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJson <em>Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJsonApi <em>Json Api</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJsonpath <em>Jsonpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJtaTransactionErrorHandler <em>Jta Transaction Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getKamelet <em>Kamelet</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getKeyStoreParameters <em>Key Store Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLangChain4jCharacterTokenizer <em>Lang Chain4j Character Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLangChain4jLineTokenizer <em>Lang Chain4j Line Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLangChain4jParagraphTokenizer <em>Lang Chain4j Paragraph Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLangChain4jSentenceTokenizer <em>Lang Chain4j Sentence Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLangChain4jWordTokenizer <em>Lang Chain4j Word Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLoadBalancerConfiguration <em>Load Balancer Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLoadTransformer <em>Load Transformer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLzf <em>Lzf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMimeMultipart <em>Mime Multipart</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMutualTLS <em>Mutual TLS</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getNoErrorHandler <em>No Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOauth2 <em>Oauth2</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOnFallback <em>On Fallback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOnWhen <em>On When</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOpenApi <em>Open Api</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOpenIdConnect <em>Open Id Connect</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOptimisticLockRetryPolicy <em>Optimistic Lock Retry Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPackageScan <em>Package Scan</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getParam <em>Param</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getParquetAvro <em>Parquet Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPassThroughServiceFilter <em>Pass Through Service Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPatch <em>Patch</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPausable <em>Pausable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPgp <em>Pgp</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPost <em>Post</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPredicateValidator <em>Predicate Validator</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPropertiesFunction <em>Properties Function</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPropertiesLocation <em>Properties Location</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPropertyExpression <em>Property Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPropertyPlaceholder <em>Property Placeholder</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPut <em>Put</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPython <em>Python</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRandomLoadBalancer <em>Random Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRedeliveryPolicyProfile <em>Redelivery Policy Profile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRefErrorHandler <em>Ref Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRemoveProperties <em>Remove Properties</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRemoveVariable <em>Remove Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getResilience4jConfiguration <em>Resilience4j Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getResponseHeader <em>Response Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getResponseMessage <em>Response Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRest <em>Rest</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRestBinding <em>Rest Binding</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRestConfiguration <em>Rest Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRestContext <em>Rest Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRestContextRef <em>Rest Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRestProperty <em>Rest Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRests <em>Rests</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getResumable <em>Resumable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRoundRobinLoadBalancer <em>Round Robin Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteBuilder <em>Route Builder</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteConfiguration <em>Route Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteConfigurationContext <em>Route Configuration Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteConfigurationContextRef <em>Route Configuration Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteConfigurations <em>Route Configurations</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteContext <em>Route Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteContextRef <em>Route Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteController <em>Route Controller</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRoutes <em>Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteTemplate <em>Route Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteTemplateContext <em>Route Template Context</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteTemplateContextRef <em>Route Template Context Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteTemplates <em>Route Templates</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRss <em>Rss</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSaga <em>Saga</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSample <em>Sample</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSecureRandomParameters <em>Secure Random Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceCall <em>Service Call</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceCallConfiguration <em>Service Call Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceChooserConfiguration <em>Service Chooser Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceDiscoveryConfiguration <em>Service Discovery Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceExpression <em>Service Expression</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceFilterConfiguration <em>Service Filter Configuration</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetHeaders <em>Set Headers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetVariable <em>Set Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetVariables <em>Set Variables</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSmooks <em>Smooks</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSoap <em>Soap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSplit <em>Split</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSpringTransactionErrorHandler <em>Spring Transaction Error Handler</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSslContextParameters <em>Ssl Context Parameters</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStaticServiceDiscovery <em>Static Service Discovery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStickyLoadBalancer <em>Sticky Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStop <em>Stop</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStreamCaching <em>Stream Caching</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStreamConfig <em>Stream Config</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSwiftMt <em>Swift Mt</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSwiftMx <em>Swift Mx</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTarFile <em>Tar File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTemplatedRoute <em>Templated Route</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTemplatedRouteParameter <em>Templated Route Parameter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTemplatedRoutes <em>Templated Routes</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThreadPoolProfile <em>Thread Pool Profile</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThrift <em>Thrift</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getToD <em>To D</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTokenizer <em>Tokenizer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTopicLoadBalancer <em>Topic Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTypeFilter <em>Type Filter</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getUnivocityCsv <em>Univocity Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getUnivocityFixed <em>Univocity Fixed</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getUnivocityHeader <em>Univocity Header</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getUnivocityTsv <em>Univocity Tsv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getWasm <em>Wasm</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getWeightedLoadBalancer <em>Weighted Load Balancer</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getXmlSecurity <em>Xml Security</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getXtokenize <em>Xtokenize</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getYaml <em>Yaml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getZipDeflater <em>Zip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getZipFile <em>Zip File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getZookeeperServiceDiscovery <em>Zookeeper Service Discovery</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Aggregates many messages into a single message
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregate</em>' containment reference.
	 * @see #setAggregate(AggregateDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Aggregate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace'"
	 * @generated
	 */
	AggregateDefinition getAggregate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getAggregate <em>Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' containment reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(AggregateDefinition value);

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security basic auth definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Key</em>' containment reference.
	 * @see #setApiKey(ApiKeyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ApiKey()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='apiKey' namespace='##targetNamespace'"
	 * @generated
	 */
	ApiKeyDefinition getApiKey();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getApiKey <em>Api Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' containment reference.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(ApiKeyDefinition value);

	/**
	 * Returns the value of the '<em><b>Asn1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encode and decode data structures using Abstract Syntax Notation One (ASN.1).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asn1</em>' containment reference.
	 * @see #setAsn1(Asn1DataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Asn1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='asn1' namespace='##targetNamespace'"
	 * @generated
	 */
	Asn1DataFormat getAsn1();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getAsn1 <em>Asn1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asn1</em>' containment reference.
	 * @see #getAsn1()
	 * @generated
	 */
	void setAsn1(Asn1DataFormat value);

	/**
	 * Returns the value of the '<em><b>Avro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Serialize and deserialize messages using Apache Avro binary data format.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Avro</em>' containment reference.
	 * @see #setAvro(AvroDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Avro()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='avro' namespace='##targetNamespace'"
	 * @generated
	 */
	AvroDataFormat getAvro();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getAvro <em>Avro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avro</em>' containment reference.
	 * @see #getAvro()
	 * @generated
	 */
	void setAvro(AvroDataFormat value);

	/**
	 * Returns the value of the '<em><b>Barcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Transform strings to various 1D/2D barcode bitmap formats and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Barcode</em>' containment reference.
	 * @see #setBarcode(BarcodeDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Barcode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='barcode' namespace='##targetNamespace'"
	 * @generated
	 */
	BarcodeDataFormat getBarcode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBarcode <em>Barcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barcode</em>' containment reference.
	 * @see #getBarcode()
	 * @generated
	 */
	void setBarcode(BarcodeDataFormat value);

	/**
	 * Returns the value of the '<em><b>Base64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encode and decode data using Base64.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base64</em>' containment reference.
	 * @see #setBase64(Base64DataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Base64()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='base64' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64DataFormat getBase64();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBase64 <em>Base64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64</em>' containment reference.
	 * @see #getBase64()
	 * @generated
	 */
	void setBase64(Base64DataFormat value);

	/**
	 * Returns the value of the '<em><b>Basic Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security basic auth definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic Auth</em>' containment reference.
	 * @see #setBasicAuth(BasicAuthDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_BasicAuth()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='basicAuth' namespace='##targetNamespace'"
	 * @generated
	 */
	BasicAuthDefinition getBasicAuth();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBasicAuth <em>Basic Auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Auth</em>' containment reference.
	 * @see #getBasicAuth()
	 * @generated
	 */
	void setBasicAuth(BasicAuthDefinition value);

	/**
	 * Returns the value of the '<em><b>Batch Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures batch-processing resequence eip.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch Config</em>' containment reference.
	 * @see #setBatchConfig(BatchResequencerConfig)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_BatchConfig()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='batchConfig' namespace='##targetNamespace'"
	 * @generated
	 */
	BatchResequencerConfig getBatchConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBatchConfig <em>Batch Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Config</em>' containment reference.
	 * @see #getBatchConfig()
	 * @generated
	 */
	void setBatchConfig(BatchResequencerConfig value);

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Calls a Java bean
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean</em>' containment reference.
	 * @see #setBean(BeanDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Bean()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace'"
	 * @generated
	 */
	BeanDefinition getBean();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBean <em>Bean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' containment reference.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(BeanDefinition value);

	/**
	 * Returns the value of the '<em><b>Bean Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Define custom beans that can be used in your Camel routes and in general.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean Factory</em>' containment reference.
	 * @see #setBeanFactory(BeanFactoryDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_BeanFactory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='beanFactory' namespace='##targetNamespace'"
	 * @generated
	 */
	BeanFactoryDefinition getBeanFactory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBeanFactory <em>Bean Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Factory</em>' containment reference.
	 * @see #getBeanFactory()
	 * @generated
	 */
	void setBeanFactory(BeanFactoryDefinition value);

	/**
	 * Returns the value of the '<em><b>Beanio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java beans to and from flat files (such as CSV, delimited, or fixed length formats).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beanio</em>' containment reference.
	 * @see #setBeanio(BeanioDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Beanio()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='beanio' namespace='##targetNamespace'"
	 * @generated
	 */
	BeanioDataFormat getBeanio();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBeanio <em>Beanio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beanio</em>' containment reference.
	 * @see #getBeanio()
	 * @generated
	 */
	void setBeanio(BeanioDataFormat value);

	/**
	 * Returns the value of the '<em><b>Bean Post Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Spring specific DefaultCamelBeanPostProcessor which uses Spring BeanPostProcessor to post process beans.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bean Post Processor</em>' containment reference.
	 * @see #setBeanPostProcessor(CamelBeanPostProcessor)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_BeanPostProcessor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='beanPostProcessor' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelBeanPostProcessor getBeanPostProcessor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBeanPostProcessor <em>Bean Post Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Post Processor</em>' containment reference.
	 * @see #getBeanPostProcessor()
	 * @generated
	 */
	void setBeanPostProcessor(CamelBeanPostProcessor value);

	/**
	 * Returns the value of the '<em><b>Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Container for beans, routes, and more. Important this is only supported when using XML DSL with camel-xml-io-dsl. This
	 * is NOT for the classic old Spring XML DSL used by Camel 1.x/2.x.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beans</em>' containment reference.
	 * @see #setBeans(BeansDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Beans()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='beans' namespace='##targetNamespace'"
	 * @generated
	 */
	BeansDefinition getBeans();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBeans <em>Beans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beans</em>' containment reference.
	 * @see #getBeans()
	 * @generated
	 */
	void setBeans(BeansDefinition value);

	/**
	 * Returns the value of the '<em><b>Bearer Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security bearer token authentication definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearer Token</em>' containment reference.
	 * @see #setBearerToken(BearerTokenDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_BearerToken()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bearerToken' namespace='##targetNamespace'"
	 * @generated
	 */
	BearerTokenDefinition getBearerToken();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBearerToken <em>Bearer Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearer Token</em>' containment reference.
	 * @see #getBearerToken()
	 * @generated
	 */
	void setBearerToken(BearerTokenDefinition value);

	/**
	 * Returns the value of the '<em><b>Bindy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java beans from and to flat payloads (such as CSV, delimited, fixed length formats, or FIX
	 * messages).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bindy</em>' containment reference.
	 * @see #setBindy(BindyDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Bindy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bindy' namespace='##targetNamespace'"
	 * @generated
	 */
	BindyDataFormat getBindy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBindy <em>Bindy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindy</em>' containment reference.
	 * @see #getBindy()
	 * @generated
	 */
	void setBindy(BindyDataFormat value);

	/**
	 * Returns the value of the '<em><b>Blacklist Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blacklist Service Filter</em>' containment reference.
	 * @see #setBlacklistServiceFilter(BlacklistServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_BlacklistServiceFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blacklistServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	BlacklistServiceCallServiceFilterConfiguration getBlacklistServiceFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getBlacklistServiceFilter <em>Blacklist Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blacklist Service Filter</em>' containment reference.
	 * @see #getBlacklistServiceFilter()
	 * @generated
	 */
	void setBlacklistServiceFilter(BlacklistServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Caching Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caching Service Discovery</em>' containment reference.
	 * @see #setCachingServiceDiscovery(CachingServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_CachingServiceDiscovery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cachingServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	CachingServiceCallServiceDiscoveryConfiguration getCachingServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCachingServiceDiscovery <em>Caching Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caching Service Discovery</em>' containment reference.
	 * @see #getCachingServiceDiscovery()
	 * @generated
	 */
	void setCachingServiceDiscovery(CachingServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Camel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Root tag for Camel application, that can contain beans, routes, and more. Important this is only supported when using
	 * XML DSL with camel-xml-io-dsl. This is NOT for the classic old Spring XML DSL used by Camel 1.x/2.x.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camel</em>' containment reference.
	 * @see #setCamel(ApplicationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Camel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='camel' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationDefinition getCamel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCamel <em>Camel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camel</em>' containment reference.
	 * @see #getCamel()
	 * @generated
	 */
	void setCamel(ApplicationDefinition value);

	/**
	 * Returns the value of the '<em><b>Camel Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * CamelContext using XML configuration.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camel Context</em>' containment reference.
	 * @see #setCamelContext(CamelContextFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_CamelContext()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='camelContext' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelContextFactoryBean getCamelContext();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCamelContext <em>Camel Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camel Context</em>' containment reference.
	 * @see #getCamelContext()
	 * @generated
	 */
	void setCamelContext(CamelContextFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Cbor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Unmarshal a CBOR payload to POJO and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cbor</em>' containment reference.
	 * @see #setCbor(CborDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Cbor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cbor' namespace='##targetNamespace'"
	 * @generated
	 */
	CborDataFormat getCbor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCbor <em>Cbor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cbor</em>' containment reference.
	 * @see #getCbor()
	 * @generated
	 */
	void setCbor(CborDataFormat value);

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route messages based on a series of predicates
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference.
	 * @see #setChoice(ChoiceDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Choice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace'"
	 * @generated
	 */
	ChoiceDefinition getChoice();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getChoice <em>Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice</em>' containment reference.
	 * @see #getChoice()
	 * @generated
	 */
	void setChoice(ChoiceDefinition value);

	/**
	 * Returns the value of the '<em><b>Circuit Breaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route messages in a fault tolerance way using Circuit Breaker
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circuit Breaker</em>' containment reference.
	 * @see #setCircuitBreaker(CircuitBreakerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_CircuitBreaker()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circuitBreaker' namespace='##targetNamespace'"
	 * @generated
	 */
	CircuitBreakerDefinition getCircuitBreaker();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCircuitBreaker <em>Circuit Breaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Breaker</em>' containment reference.
	 * @see #getCircuitBreaker()
	 * @generated
	 */
	void setCircuitBreaker(CircuitBreakerDefinition value);

	/**
	 * Returns the value of the '<em><b>Claim Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The Claim Check EIP allows you to replace message content with a claim check (a unique key), which can be used to
	 * retrieve the message content at a later time.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Check</em>' containment reference.
	 * @see #setClaimCheck(ClaimCheckDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ClaimCheck()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='claimCheck' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimCheckDefinition getClaimCheck();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getClaimCheck <em>Claim Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Check</em>' containment reference.
	 * @see #getClaimCheck()
	 * @generated
	 */
	void setClaimCheck(ClaimCheckDefinition value);

	/**
	 * Returns the value of the '<em><b>Combined Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combined Service Discovery</em>' containment reference.
	 * @see #setCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_CombinedServiceDiscovery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='combinedServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	CombinedServiceCallServiceDiscoveryConfiguration getCombinedServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCombinedServiceDiscovery <em>Combined Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Service Discovery</em>' containment reference.
	 * @see #getCombinedServiceDiscovery()
	 * @generated
	 */
	void setCombinedServiceDiscovery(CombinedServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Combined Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combined Service Filter</em>' containment reference.
	 * @see #setCombinedServiceFilter(CombinedServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_CombinedServiceFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='combinedServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	CombinedServiceCallServiceFilterConfiguration getCombinedServiceFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCombinedServiceFilter <em>Combined Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Service Filter</em>' containment reference.
	 * @see #getCombinedServiceFilter()
	 * @generated
	 */
	void setCombinedServiceFilter(CombinedServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A fixed value set only once during the route startup.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(ConstantExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Constant()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantExpression getConstant();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(ConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Consul Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consul Service Discovery</em>' containment reference.
	 * @see #setConsulServiceDiscovery(ConsulServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ConsulServiceDiscovery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='consulServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsulServiceCallServiceDiscoveryConfiguration getConsulServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConsulServiceDiscovery <em>Consul Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consul Service Discovery</em>' containment reference.
	 * @see #getConsulServiceDiscovery()
	 * @generated
	 */
	void setConsulServiceDiscovery(ConsulServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Consumer Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures a ConsumerTemplate
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer Template</em>' containment reference.
	 * @see #setConsumerTemplate(CamelConsumerTemplateFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ConsumerTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='consumerTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelConsumerTemplateFactoryBean getConsumerTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConsumerTemplate <em>Consumer Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Template</em>' containment reference.
	 * @see #getConsumerTemplate()
	 * @generated
	 */
	void setConsumerTemplate(CamelConsumerTemplateFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Context Scan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Scans for Java org.apache.camel.builder.RouteBuilder instances in the context org.apache.camel.spi.Registry .
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Scan</em>' containment reference.
	 * @see #setContextScan(ContextScanDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ContextScan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contextScan' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextScanDefinition getContextScan();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getContextScan <em>Context Scan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Scan</em>' containment reference.
	 * @see #getContextScan()
	 * @generated
	 */
	void setContextScan(ContextScanDefinition value);

	/**
	 * Returns the value of the '<em><b>Convert Body To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Converts the message body to another type
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Convert Body To</em>' containment reference.
	 * @see #setConvertBodyTo(ConvertBodyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ConvertBodyTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertBodyTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ConvertBodyDefinition getConvertBodyTo();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConvertBodyTo <em>Convert Body To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convert Body To</em>' containment reference.
	 * @see #getConvertBodyTo()
	 * @generated
	 */
	void setConvertBodyTo(ConvertBodyDefinition value);

	/**
	 * Returns the value of the '<em><b>Convert Header To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Converts the message header to another type
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Convert Header To</em>' containment reference.
	 * @see #setConvertHeaderTo(ConvertHeaderDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ConvertHeaderTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertHeaderTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ConvertHeaderDefinition getConvertHeaderTo();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConvertHeaderTo <em>Convert Header To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convert Header To</em>' containment reference.
	 * @see #getConvertHeaderTo()
	 * @generated
	 */
	void setConvertHeaderTo(ConvertHeaderDefinition value);

	/**
	 * Returns the value of the '<em><b>Convert Variable To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Converts the variable to another type
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Convert Variable To</em>' containment reference.
	 * @see #setConvertVariableTo(ConvertVariableDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ConvertVariableTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertVariableTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ConvertVariableDefinition getConvertVariableTo();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getConvertVariableTo <em>Convert Variable To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convert Variable To</em>' containment reference.
	 * @see #getConvertVariableTo()
	 * @generated
	 */
	void setConvertVariableTo(ConvertVariableDefinition value);

	/**
	 * Returns the value of the '<em><b>Crypto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encrypt and decrypt messages using Java Cryptography Extension (JCE).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crypto</em>' containment reference.
	 * @see #setCrypto(CryptoDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Crypto()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='crypto' namespace='##targetNamespace'"
	 * @generated
	 */
	CryptoDataFormat getCrypto();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCrypto <em>Crypto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crypto</em>' containment reference.
	 * @see #getCrypto()
	 * @generated
	 */
	void setCrypto(CryptoDataFormat value);

	/**
	 * Returns the value of the '<em><b>Csimple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluate a compiled simple expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Csimple</em>' containment reference.
	 * @see #setCsimple(CSimpleExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Csimple()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='csimple' namespace='##targetNamespace'"
	 * @generated
	 */
	CSimpleExpression getCsimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCsimple <em>Csimple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csimple</em>' containment reference.
	 * @see #getCsimple()
	 * @generated
	 */
	void setCsimple(CSimpleExpression value);

	/**
	 * Returns the value of the '<em><b>Csv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Handle CSV (Comma Separated Values) payloads.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Csv</em>' containment reference.
	 * @see #setCsv(CsvDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Csv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='csv' namespace='##targetNamespace'"
	 * @generated
	 */
	CsvDataFormat getCsv();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCsv <em>Csv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csv</em>' containment reference.
	 * @see #getCsv()
	 * @generated
	 */
	void setCsv(CsvDataFormat value);

	/**
	 * Returns the value of the '<em><b>Custom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Delegate to a custom org.apache.camel.spi.DataFormat implementation via Camel registry.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom</em>' containment reference.
	 * @see #setCustom(CustomDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Custom()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomDataFormat getCustom();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCustom <em>Custom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom</em>' containment reference.
	 * @see #getCustom()
	 * @generated
	 */
	void setCustom(CustomDataFormat value);

	/**
	 * Returns the value of the '<em><b>Custom Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom load balancer implementation.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Load Balancer</em>' containment reference.
	 * @see #setCustomLoadBalancer(CustomLoadBalancerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_CustomLoadBalancer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customLoadBalancer' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomLoadBalancerDefinition getCustomLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCustomLoadBalancer <em>Custom Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Load Balancer</em>' containment reference.
	 * @see #getCustomLoadBalancer()
	 * @generated
	 */
	void setCustomLoadBalancer(CustomLoadBalancerDefinition value);

	/**
	 * Returns the value of the '<em><b>Custom Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Service Filter</em>' containment reference.
	 * @see #setCustomServiceFilter(CustomServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_CustomServiceFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomServiceCallServiceFilterConfiguration getCustomServiceFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCustomServiceFilter <em>Custom Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Service Filter</em>' containment reference.
	 * @see #getCustomServiceFilter()
	 * @generated
	 */
	void setCustomServiceFilter(CustomServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Custom Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom transformer on a route level.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Transformer</em>' containment reference.
	 * @see #setCustomTransformer(CustomTransformerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_CustomTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customTransformer' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomTransformerDefinition getCustomTransformer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCustomTransformer <em>Custom Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Transformer</em>' containment reference.
	 * @see #getCustomTransformer()
	 * @generated
	 */
	void setCustomTransformer(CustomTransformerDefinition value);

	/**
	 * Returns the value of the '<em><b>Custom Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a custom validator on the route level.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Validator</em>' containment reference.
	 * @see #setCustomValidator(CustomValidatorDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_CustomValidator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customValidator' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomValidatorDefinition getCustomValidator();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getCustomValidator <em>Custom Validator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Validator</em>' containment reference.
	 * @see #getCustomValidator()
	 * @generated
	 */
	void setCustomValidator(CustomValidatorDefinition value);

	/**
	 * Returns the value of the '<em><b>Data Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configure data formats.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Formats</em>' containment reference.
	 * @see #setDataFormats(DataFormatsDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_DataFormats()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataFormats' namespace='##targetNamespace'"
	 * @generated
	 */
	DataFormatsDefinition getDataFormats();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDataFormats <em>Data Formats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Formats</em>' containment reference.
	 * @see #getDataFormats()
	 * @generated
	 */
	void setDataFormats(DataFormatsDefinition value);

	/**
	 * Returns the value of the '<em><b>Data Format Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Represents a org.apache.camel.processor.transformer.DataFormatTransformer which leverages
	 * org.apache.camel.spi.DataFormat to perform transformation. One of the DataFormat 'ref' or DataFormat 'type' needs to be
	 * specified.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Format Transformer</em>' containment reference.
	 * @see #setDataFormatTransformer(DataFormatTransformerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_DataFormatTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataFormatTransformer' namespace='##targetNamespace'"
	 * @generated
	 */
	DataFormatTransformerDefinition getDataFormatTransformer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDataFormatTransformer <em>Data Format Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format Transformer</em>' containment reference.
	 * @see #getDataFormatTransformer()
	 * @generated
	 */
	void setDataFormatTransformer(DataFormatTransformerDefinition value);

	/**
	 * Returns the value of the '<em><b>Datasonnet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use DataSonnet scripts for message transformations.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datasonnet</em>' containment reference.
	 * @see #setDatasonnet(DatasonnetExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Datasonnet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='datasonnet' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasonnetExpression getDatasonnet();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDatasonnet <em>Datasonnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasonnet</em>' containment reference.
	 * @see #getDatasonnet()
	 * @generated
	 */
	void setDatasonnet(DatasonnetExpression value);

	/**
	 * Returns the value of the '<em><b>Dead Letter Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Error handler with dead letter queue.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dead Letter Channel</em>' containment reference.
	 * @see #setDeadLetterChannel(DeadLetterChannelDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_DeadLetterChannel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deadLetterChannel' namespace='##targetNamespace'"
	 * @generated
	 */
	DeadLetterChannelDefinition getDeadLetterChannel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDeadLetterChannel <em>Dead Letter Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Channel</em>' containment reference.
	 * @see #getDeadLetterChannel()
	 * @generated
	 */
	void setDeadLetterChannel(DeadLetterChannelDefinition value);

	/**
	 * Returns the value of the '<em><b>Default Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The default error handler.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Error Handler</em>' containment reference.
	 * @see #setDefaultErrorHandler(DefaultErrorHandlerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_DefaultErrorHandler()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='defaultErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultErrorHandlerDefinition getDefaultErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDefaultErrorHandler <em>Default Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Error Handler</em>' containment reference.
	 * @see #getDefaultErrorHandler()
	 * @generated
	 */
	void setDefaultErrorHandler(DefaultErrorHandlerDefinition value);

	/**
	 * Returns the value of the '<em><b>Default Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Load Balancer</em>' containment reference.
	 * @see #setDefaultLoadBalancer(DefaultServiceCallServiceLoadBalancerConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_DefaultLoadBalancer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='defaultLoadBalancer' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultServiceCallServiceLoadBalancerConfiguration getDefaultLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDefaultLoadBalancer <em>Default Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Load Balancer</em>' containment reference.
	 * @see #getDefaultLoadBalancer()
	 * @generated
	 */
	void setDefaultLoadBalancer(DefaultServiceCallServiceLoadBalancerConfiguration value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Delays processing for a specified length of time
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(DelayDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Delay()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace'"
	 * @generated
	 */
	DelayDefinition getDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(DelayDefinition value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest DELETE command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(DeleteDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Delete()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delete' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteDefinition getDelete();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(DeleteDefinition value);

	/**
	 * Returns the value of the '<em><b>Dfdl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Transforms fixed format data such as EDI message from/to XML using a Data Format Description Language (DFDL).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dfdl</em>' containment reference.
	 * @see #setDfdl(DfdlDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Dfdl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfdl' namespace='##targetNamespace'"
	 * @generated
	 */
	DfdlDataFormat getDfdl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDfdl <em>Dfdl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dfdl</em>' containment reference.
	 * @see #getDfdl()
	 * @generated
	 */
	void setDfdl(DfdlDataFormat value);

	/**
	 * Returns the value of the '<em><b>Dns Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dns Service Discovery</em>' containment reference.
	 * @see #setDnsServiceDiscovery(DnsServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_DnsServiceDiscovery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dnsServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	DnsServiceCallServiceDiscoveryConfiguration getDnsServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDnsServiceDiscovery <em>Dns Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns Service Discovery</em>' containment reference.
	 * @see #getDnsServiceDiscovery()
	 * @generated
	 */
	void setDnsServiceDiscovery(DnsServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Do Catch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Catches exceptions as part of a try, catch, finally block
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Catch</em>' containment reference.
	 * @see #setDoCatch(CatchDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_DoCatch()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doCatch' namespace='##targetNamespace'"
	 * @generated
	 */
	CatchDefinition getDoCatch();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDoCatch <em>Do Catch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Catch</em>' containment reference.
	 * @see #getDoCatch()
	 * @generated
	 */
	void setDoCatch(CatchDefinition value);

	/**
	 * Returns the value of the '<em><b>Do Finally</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Path traversed when a try, catch, finally block exits
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Finally</em>' containment reference.
	 * @see #setDoFinally(FinallyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_DoFinally()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doFinally' namespace='##targetNamespace'"
	 * @generated
	 */
	FinallyDefinition getDoFinally();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDoFinally <em>Do Finally</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Finally</em>' containment reference.
	 * @see #getDoFinally()
	 * @generated
	 */
	void setDoFinally(FinallyDefinition value);

	/**
	 * Returns the value of the '<em><b>Do Try</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marks the beginning of a try, catch, finally block
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Try</em>' containment reference.
	 * @see #setDoTry(TryDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_DoTry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doTry' namespace='##targetNamespace'"
	 * @generated
	 */
	TryDefinition getDoTry();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDoTry <em>Do Try</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Try</em>' containment reference.
	 * @see #getDoTry()
	 * @generated
	 */
	void setDoTry(TryDefinition value);

	/**
	 * Returns the value of the '<em><b>Dynamic Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route messages based on dynamic rules
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Router</em>' containment reference.
	 * @see #setDynamicRouter(DynamicRouterDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_DynamicRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dynamicRouter' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicRouterDefinition getDynamicRouter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getDynamicRouter <em>Dynamic Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Router</em>' containment reference.
	 * @see #getDynamicRouter()
	 * @generated
	 */
	void setDynamicRouter(DynamicRouterDefinition value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel endpoint configuration
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(CamelEndpointFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Endpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelEndpointFactoryBean getEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(CamelEndpointFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Endpoint Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a Camel endpoint to perform transformation on the route level.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint Transformer</em>' containment reference.
	 * @see #setEndpointTransformer(EndpointTransformerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_EndpointTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='endpointTransformer' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointTransformerDefinition getEndpointTransformer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getEndpointTransformer <em>Endpoint Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Transformer</em>' containment reference.
	 * @see #getEndpointTransformer()
	 * @generated
	 */
	void setEndpointTransformer(EndpointTransformerDefinition value);

	/**
	 * Returns the value of the '<em><b>Endpoint Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a Camel endpoint to perform validation on the route level.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint Validator</em>' containment reference.
	 * @see #setEndpointValidator(EndpointValidatorDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_EndpointValidator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='endpointValidator' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointValidatorDefinition getEndpointValidator();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getEndpointValidator <em>Endpoint Validator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Validator</em>' containment reference.
	 * @see #getEndpointValidator()
	 * @generated
	 */
	void setEndpointValidator(EndpointValidatorDefinition value);

	/**
	 * Returns the value of the '<em><b>Enrich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enriches a message with data from a secondary resource
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enrich</em>' containment reference.
	 * @see #setEnrich(EnrichDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Enrich()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enrich' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrichDefinition getEnrich();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getEnrich <em>Enrich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrich</em>' containment reference.
	 * @see #getEnrich()
	 * @generated
	 */
	void setEnrich(EnrichDefinition value);

	/**
	 * Returns the value of the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel error handling.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Handler</em>' containment reference.
	 * @see #setErrorHandler(EObject)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ErrorHandler()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='errorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getErrorHandler <em>Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler</em>' containment reference.
	 * @see #getErrorHandler()
	 * @generated
	 */
	void setErrorHandler(EObject value);

	/**
	 * Returns the value of the '<em><b>Exchange Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Gets a property from the Exchange.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Property</em>' containment reference.
	 * @see #setExchangeProperty(ExchangePropertyExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ExchangeProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exchangeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	ExchangePropertyExpression getExchangeProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getExchangeProperty <em>Exchange Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Property</em>' containment reference.
	 * @see #getExchangeProperty()
	 * @generated
	 */
	void setExchangeProperty(ExchangePropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A useful base class for an expression
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ExpressionSubElementDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Expression()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionSubElementDefinition getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ExpressionSubElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Expression Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Definition</em>' containment reference.
	 * @see #setExpressionDefinition(Expression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ExpressionDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expressionDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpressionDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getExpressionDefinition <em>Expression Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Definition</em>' containment reference.
	 * @see #getExpressionDefinition()
	 * @generated
	 */
	void setExpressionDefinition(Expression value);

	/**
	 * Returns the value of the '<em><b>Failover Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * In case of failures the exchange will be tried on the next endpoint.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failover Load Balancer</em>' containment reference.
	 * @see #setFailoverLoadBalancer(FailoverLoadBalancerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_FailoverLoadBalancer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='failoverLoadBalancer' namespace='##targetNamespace'"
	 * @generated
	 */
	FailoverLoadBalancerDefinition getFailoverLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFailoverLoadBalancer <em>Failover Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failover Load Balancer</em>' containment reference.
	 * @see #getFailoverLoadBalancer()
	 * @generated
	 */
	void setFailoverLoadBalancer(FailoverLoadBalancerDefinition value);

	/**
	 * Returns the value of the '<em><b>Fault Tolerance Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * MicroProfile Fault Tolerance Circuit Breaker EIP configuration
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fault Tolerance Configuration</em>' containment reference.
	 * @see #setFaultToleranceConfiguration(FaultToleranceConfigurationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_FaultToleranceConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='faultToleranceConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	FaultToleranceConfigurationDefinition getFaultToleranceConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFaultToleranceConfiguration <em>Fault Tolerance Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Tolerance Configuration</em>' containment reference.
	 * @see #getFaultToleranceConfiguration()
	 * @generated
	 */
	void setFaultToleranceConfiguration(FaultToleranceConfigurationDefinition value);

	/**
	 * Returns the value of the '<em><b>Fhir Json</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshall and unmarshall FHIR objects to/from JSON.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Json</em>' containment reference.
	 * @see #setFhirJson(FhirJsonDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_FhirJson()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fhirJson' namespace='##targetNamespace'"
	 * @generated
	 */
	FhirJsonDataFormat getFhirJson();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFhirJson <em>Fhir Json</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir Json</em>' containment reference.
	 * @see #getFhirJson()
	 * @generated
	 */
	void setFhirJson(FhirJsonDataFormat value);

	/**
	 * Returns the value of the '<em><b>Fhir Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshall and unmarshall FHIR objects to/from XML.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Xml</em>' containment reference.
	 * @see #setFhirXml(FhirXmlDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_FhirXml()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fhirXml' namespace='##targetNamespace'"
	 * @generated
	 */
	FhirXmlDataFormat getFhirXml();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFhirXml <em>Fhir Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir Xml</em>' containment reference.
	 * @see #getFhirXml()
	 * @generated
	 */
	void setFhirXml(FhirXmlDataFormat value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Filter out messages based using a predicate
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Filter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterDefinition getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterDefinition value);

	/**
	 * Returns the value of the '<em><b>Flatpack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java lists and maps to/from flat files (such as CSV, delimited, or fixed length formats) using
	 * Flatpack library.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flatpack</em>' containment reference.
	 * @see #setFlatpack(FlatpackDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Flatpack()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='flatpack' namespace='##targetNamespace'"
	 * @generated
	 */
	FlatpackDataFormat getFlatpack();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFlatpack <em>Flatpack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flatpack</em>' containment reference.
	 * @see #getFlatpack()
	 * @generated
	 */
	void setFlatpack(FlatpackDataFormat value);

	/**
	 * Returns the value of the '<em><b>Fluent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures a org.apache.camel.FluentProducerTemplate
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fluent Template</em>' containment reference.
	 * @see #setFluentTemplate(CamelFluentProducerTemplateFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_FluentTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fluentTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelFluentProducerTemplateFactoryBean getFluentTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFluentTemplate <em>Fluent Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluent Template</em>' containment reference.
	 * @see #getFluentTemplate()
	 * @generated
	 */
	void setFluentTemplate(CamelFluentProducerTemplateFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Fory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Serialize and deserialize messages using Apache Fory
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fory</em>' containment reference.
	 * @see #setFory(ForyDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Fory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fory' namespace='##targetNamespace'"
	 * @generated
	 */
	ForyDataFormat getFory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFory <em>Fory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fory</em>' containment reference.
	 * @see #getFory()
	 * @generated
	 */
	void setFory(ForyDataFormat value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Act as a message source as input to a route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(FromDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_From()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
	FromDefinition getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(FromDefinition value);

	/**
	 * Returns the value of the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest GET command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Get</em>' containment reference.
	 * @see #setGet(GetDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Get()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='get' namespace='##targetNamespace'"
	 * @generated
	 */
	GetDefinition getGet();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGet <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' containment reference.
	 * @see #getGet()
	 * @generated
	 */
	void setGet(GetDefinition value);

	/**
	 * Returns the value of the '<em><b>Global Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Models a string key/value pair for configuring some global options on a Camel context such as max debug log length.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Option</em>' containment reference.
	 * @see #setGlobalOption(GlobalOptionDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_GlobalOption()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='globalOption' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalOptionDefinition getGlobalOption();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGlobalOption <em>Global Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Option</em>' containment reference.
	 * @see #getGlobalOption()
	 * @generated
	 */
	void setGlobalOption(GlobalOptionDefinition value);

	/**
	 * Returns the value of the '<em><b>Global Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Models a series of string key/value pairs for configuring some global options on a Camel context such as max debug log
	 * length.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Options</em>' containment reference.
	 * @see #setGlobalOptions(GlobalOptionsDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_GlobalOptions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='globalOptions' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalOptionsDefinition getGlobalOptions();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGlobalOptions <em>Global Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Options</em>' containment reference.
	 * @see #getGlobalOptions()
	 * @generated
	 */
	void setGlobalOptions(GlobalOptionsDefinition value);

	/**
	 * Returns the value of the '<em><b>Grok</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Unmarshal unstructured data to objects using Logstash based Grok patterns.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grok</em>' containment reference.
	 * @see #setGrok(GrokDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Grok()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='grok' namespace='##targetNamespace'"
	 * @generated
	 */
	GrokDataFormat getGrok();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGrok <em>Grok</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grok</em>' containment reference.
	 * @see #getGrok()
	 * @generated
	 */
	void setGrok(GrokDataFormat value);

	/**
	 * Returns the value of the '<em><b>Groovy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a Groovy script.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groovy</em>' containment reference.
	 * @see #setGroovy(GroovyExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Groovy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='groovy' namespace='##targetNamespace'"
	 * @generated
	 */
	GroovyExpression getGroovy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGroovy <em>Groovy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groovy</em>' containment reference.
	 * @see #getGroovy()
	 * @generated
	 */
	void setGroovy(GroovyExpression value);

	/**
	 * Returns the value of the '<em><b>Gzip Deflater</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Compress and decompress messages using java.util.zip.GZIPStream.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gzip Deflater</em>' containment reference.
	 * @see #setGzipDeflater(GzipDeflaterDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_GzipDeflater()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gzipDeflater' namespace='##targetNamespace'"
	 * @generated
	 */
	GzipDeflaterDataFormat getGzipDeflater();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getGzipDeflater <em>Gzip Deflater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gzip Deflater</em>' containment reference.
	 * @see #getGzipDeflater()
	 * @generated
	 */
	void setGzipDeflater(GzipDeflaterDataFormat value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest HEAD command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(HeadDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Head()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='head' namespace='##targetNamespace'"
	 * @generated
	 */
	HeadDefinition getHead();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(HeadDefinition value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Gets a header from the Exchange.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Header()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderExpression getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderExpression value);

	/**
	 * Returns the value of the '<em><b>Healthy Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Healthy Service Filter</em>' containment reference.
	 * @see #setHealthyServiceFilter(HealthyServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_HealthyServiceFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='healthyServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	HealthyServiceCallServiceFilterConfiguration getHealthyServiceFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getHealthyServiceFilter <em>Healthy Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Healthy Service Filter</em>' containment reference.
	 * @see #getHealthyServiceFilter()
	 * @generated
	 */
	void setHealthyServiceFilter(HealthyServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Hl7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal HL7 (Health Care) model objects using the HL7 MLLP codec.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hl7</em>' containment reference.
	 * @see #setHl7(Hl7DataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Hl7()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hl7' namespace='##targetNamespace'"
	 * @generated
	 */
	Hl7DataFormat getHl7();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getHl7 <em>Hl7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hl7</em>' containment reference.
	 * @see #getHl7()
	 * @generated
	 */
	void setHl7(Hl7DataFormat value);

	/**
	 * Returns the value of the '<em><b>Hl7terser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Get the value of a HL7 message field specified by terse location specification syntax.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hl7terser</em>' containment reference.
	 * @see #setHl7terser(Hl7TerserExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Hl7terser()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hl7terser' namespace='##targetNamespace'"
	 * @generated
	 */
	Hl7TerserExpression getHl7terser();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getHl7terser <em>Hl7terser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hl7terser</em>' containment reference.
	 * @see #getHl7terser()
	 * @generated
	 */
	void setHl7terser(Hl7TerserExpression value);

	/**
	 * Returns the value of the '<em><b>Ical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal iCal (.ics) documents to/from model objects.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ical</em>' containment reference.
	 * @see #setIcal(IcalDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Ical()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ical' namespace='##targetNamespace'"
	 * @generated
	 */
	IcalDataFormat getIcal();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getIcal <em>Ical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ical</em>' containment reference.
	 * @see #getIcal()
	 * @generated
	 */
	void setIcal(IcalDataFormat value);

	/**
	 * Returns the value of the '<em><b>Idempotent Consumer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Filters out duplicate messages
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idempotent Consumer</em>' containment reference.
	 * @see #setIdempotentConsumer(IdempotentConsumerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_IdempotentConsumer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idempotentConsumer' namespace='##targetNamespace'"
	 * @generated
	 */
	IdempotentConsumerDefinition getIdempotentConsumer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getIdempotentConsumer <em>Idempotent Consumer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idempotent Consumer</em>' containment reference.
	 * @see #getIdempotentConsumer()
	 * @generated
	 */
	void setIdempotentConsumer(IdempotentConsumerDefinition value);

	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the expected data type of the input message. If the actual message type is different at runtime, camel look for a
	 * required Transformer and apply if exists. If validate attribute is true then camel applies Validator as well. Type name
	 * consists of two parts, 'scheme' and 'name' connected with ':'. For Java type 'name' is a fully qualified class name. For
	 * example {code java:java.lang.String} , {code json:ABCOrder} . It's also possible to specify only scheme part, so that it
	 * works like a wildcard. If only 'xml' is specified, all the XML message matches. It's handy to add only one
	 * transformer/validator for all the transformation from/to XML.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Type</em>' containment reference.
	 * @see #setInputType(InputTypeDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_InputType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inputType' namespace='##targetNamespace'"
	 * @generated
	 */
	InputTypeDefinition getInputType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getInputType <em>Input Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' containment reference.
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(InputTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Intercept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Intercepts a message at each step in the route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intercept</em>' containment reference.
	 * @see #setIntercept(InterceptDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Intercept()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace'"
	 * @generated
	 */
	InterceptDefinition getIntercept();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getIntercept <em>Intercept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intercept</em>' containment reference.
	 * @see #getIntercept()
	 * @generated
	 */
	void setIntercept(InterceptDefinition value);

	/**
	 * Returns the value of the '<em><b>Intercept From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Intercepts incoming messages
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intercept From</em>' containment reference.
	 * @see #setInterceptFrom(InterceptFromDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_InterceptFrom()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	InterceptFromDefinition getInterceptFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getInterceptFrom <em>Intercept From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intercept From</em>' containment reference.
	 * @see #getInterceptFrom()
	 * @generated
	 */
	void setInterceptFrom(InterceptFromDefinition value);

	/**
	 * Returns the value of the '<em><b>Intercept Send To Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Intercepts messages being sent to an endpoint
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intercept Send To Endpoint</em>' containment reference.
	 * @see #setInterceptSendToEndpoint(InterceptSendToEndpointDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_InterceptSendToEndpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptSendToEndpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	InterceptSendToEndpointDefinition getInterceptSendToEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getInterceptSendToEndpoint <em>Intercept Send To Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intercept Send To Endpoint</em>' containment reference.
	 * @see #getInterceptSendToEndpoint()
	 * @generated
	 */
	void setInterceptSendToEndpoint(InterceptSendToEndpointDefinition value);

	/**
	 * Returns the value of the '<em><b>Iso8583</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Create, edit and read ISO-8583 messages.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iso8583</em>' containment reference.
	 * @see #setIso8583(Iso8583DataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Iso8583()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='iso8583' namespace='##targetNamespace'"
	 * @generated
	 */
	Iso8583DataFormat getIso8583();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getIso8583 <em>Iso8583</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso8583</em>' containment reference.
	 * @see #getIso8583()
	 * @generated
	 */
	void setIso8583(Iso8583DataFormat value);

	/**
	 * Returns the value of the '<em><b>Jackson Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Unmarshal an XML payloads to POJOs and back using XMLMapper extension of Jackson.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jackson Xml</em>' containment reference.
	 * @see #setJacksonXml(JacksonXMLDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_JacksonXml()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jacksonXml' namespace='##targetNamespace'"
	 * @generated
	 */
	JacksonXMLDataFormat getJacksonXml();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJacksonXml <em>Jackson Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jackson Xml</em>' containment reference.
	 * @see #getJacksonXml()
	 * @generated
	 */
	void setJacksonXml(JacksonXMLDataFormat value);

	/**
	 * Returns the value of the '<em><b>Java</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a Java (Java compiled once at runtime) expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Java</em>' containment reference.
	 * @see #setJava(JavaExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Java()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='java' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaExpression getJava();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJava <em>Java</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java</em>' containment reference.
	 * @see #getJava()
	 * @generated
	 */
	void setJava(JavaExpression value);

	/**
	 * Returns the value of the '<em><b>Jaxb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Unmarshal XML payloads to POJOs and back using JAXB2 XML marshalling standard.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jaxb</em>' containment reference.
	 * @see #setJaxb(JaxbDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Jaxb()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jaxb' namespace='##targetNamespace'"
	 * @generated
	 */
	JaxbDataFormat getJaxb();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJaxb <em>Jaxb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jaxb</em>' containment reference.
	 * @see #getJaxb()
	 * @generated
	 */
	void setJaxb(JaxbDataFormat value);

	/**
	 * Returns the value of the '<em><b>Jmx Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * JMX configuration.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jmx Agent</em>' containment reference.
	 * @see #setJmxAgent(CamelJMXAgentDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_JmxAgent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jmxAgent' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelJMXAgentDefinition getJmxAgent();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJmxAgent <em>Jmx Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jmx Agent</em>' containment reference.
	 * @see #getJmxAgent()
	 * @generated
	 */
	void setJmxAgent(CamelJMXAgentDefinition value);

	/**
	 * Returns the value of the '<em><b>Joor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: Evaluates a jOOR (Java compiled once at runtime) expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Joor</em>' containment reference.
	 * @see #setJoor(JoorExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Joor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='joor' namespace='##targetNamespace'"
	 * @generated
	 */
	JoorExpression getJoor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJoor <em>Joor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joor</em>' containment reference.
	 * @see #getJoor()
	 * @generated
	 */
	void setJoor(JoorExpression value);

	/**
	 * Returns the value of the '<em><b>Jq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a JQ expression against a JSON message body.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jq</em>' containment reference.
	 * @see #setJq(JqExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Jq()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jq' namespace='##targetNamespace'"
	 * @generated
	 */
	JqExpression getJq();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJq <em>Jq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jq</em>' containment reference.
	 * @see #getJq()
	 * @generated
	 */
	void setJq(JqExpression value);

	/**
	 * Returns the value of the '<em><b>Js</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a JavaScript expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Js</em>' containment reference.
	 * @see #setJs(JavaScriptExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Js()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='js' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaScriptExpression getJs();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJs <em>Js</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Js</em>' containment reference.
	 * @see #getJs()
	 * @generated
	 */
	void setJs(JavaScriptExpression value);

	/**
	 * Returns the value of the '<em><b>Json</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal POJOs to JSON and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Json</em>' containment reference.
	 * @see #setJson(JsonDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Json()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='json' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonDataFormat getJson();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJson <em>Json</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json</em>' containment reference.
	 * @see #getJson()
	 * @generated
	 */
	void setJson(JsonDataFormat value);

	/**
	 * Returns the value of the '<em><b>Json Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal JSON:API resources using JSONAPI-Converter library.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Json Api</em>' containment reference.
	 * @see #setJsonApi(JsonApiDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_JsonApi()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jsonApi' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonApiDataFormat getJsonApi();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJsonApi <em>Json Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Api</em>' containment reference.
	 * @see #getJsonApi()
	 * @generated
	 */
	void setJsonApi(JsonApiDataFormat value);

	/**
	 * Returns the value of the '<em><b>Jsonpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a JSONPath expression against a JSON message body.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jsonpath</em>' containment reference.
	 * @see #setJsonpath(JsonPathExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Jsonpath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jsonpath' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonPathExpression getJsonpath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJsonpath <em>Jsonpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsonpath</em>' containment reference.
	 * @see #getJsonpath()
	 * @generated
	 */
	void setJsonpath(JsonPathExpression value);

	/**
	 * Returns the value of the '<em><b>Jta Transaction Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * JTA based transactional error handler (requires camel-jta).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jta Transaction Error Handler</em>' containment reference.
	 * @see #setJtaTransactionErrorHandler(JtaTransactionErrorHandlerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_JtaTransactionErrorHandler()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jtaTransactionErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	JtaTransactionErrorHandlerDefinition getJtaTransactionErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getJtaTransactionErrorHandler <em>Jta Transaction Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jta Transaction Error Handler</em>' containment reference.
	 * @see #getJtaTransactionErrorHandler()
	 * @generated
	 */
	void setJtaTransactionErrorHandler(JtaTransactionErrorHandlerDefinition value);

	/**
	 * Returns the value of the '<em><b>Kamelet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To call Kamelets in special situations
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kamelet</em>' containment reference.
	 * @see #setKamelet(KameletDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Kamelet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kamelet' namespace='##targetNamespace'"
	 * @generated
	 */
	KameletDefinition getKamelet();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getKamelet <em>Kamelet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kamelet</em>' containment reference.
	 * @see #getKamelet()
	 * @generated
	 */
	void setKamelet(KameletDefinition value);

	/**
	 * Returns the value of the '<em><b>Key Store Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Key store facility for cryptographic keys and certificates
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Store Parameters</em>' containment reference.
	 * @see #setKeyStoreParameters(KeyStoreParametersFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_KeyStoreParameters()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keyStoreParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyStoreParametersFactoryBean getKeyStoreParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getKeyStoreParameters <em>Key Store Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Store Parameters</em>' containment reference.
	 * @see #getKeyStoreParameters()
	 * @generated
	 */
	void setKeyStoreParameters(KeyStoreParametersFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Kubernetes Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kubernetes Service Discovery</em>' containment reference.
	 * @see #setKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_KubernetesServiceDiscovery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kubernetesServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	KubernetesServiceCallServiceDiscoveryConfiguration getKubernetesServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getKubernetesServiceDiscovery <em>Kubernetes Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kubernetes Service Discovery</em>' containment reference.
	 * @see #getKubernetesServiceDiscovery()
	 * @generated
	 */
	void setKubernetesServiceDiscovery(KubernetesServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Lang Chain4j Character Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel AI: Tokenizer for splitting by character.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Chain4j Character Tokenizer</em>' containment reference.
	 * @see #setLangChain4jCharacterTokenizer(LangChain4JCharacterTokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_LangChain4jCharacterTokenizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='langChain4jCharacterTokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	LangChain4JCharacterTokenizerDefinition getLangChain4jCharacterTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLangChain4jCharacterTokenizer <em>Lang Chain4j Character Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Chain4j Character Tokenizer</em>' containment reference.
	 * @see #getLangChain4jCharacterTokenizer()
	 * @generated
	 */
	void setLangChain4jCharacterTokenizer(LangChain4JCharacterTokenizerDefinition value);

	/**
	 * Returns the value of the '<em><b>Lang Chain4j Line Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel AI: Tokenizer for splitting line by line.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Chain4j Line Tokenizer</em>' containment reference.
	 * @see #setLangChain4jLineTokenizer(LangChain4JLineTokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_LangChain4jLineTokenizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='langChain4jLineTokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	LangChain4JLineTokenizerDefinition getLangChain4jLineTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLangChain4jLineTokenizer <em>Lang Chain4j Line Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Chain4j Line Tokenizer</em>' containment reference.
	 * @see #getLangChain4jLineTokenizer()
	 * @generated
	 */
	void setLangChain4jLineTokenizer(LangChain4JLineTokenizerDefinition value);

	/**
	 * Returns the value of the '<em><b>Lang Chain4j Paragraph Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel AI: Tokenizer for splitting by paragraphs.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Chain4j Paragraph Tokenizer</em>' containment reference.
	 * @see #setLangChain4jParagraphTokenizer(LangChain4JParagraphTokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_LangChain4jParagraphTokenizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='langChain4jParagraphTokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	LangChain4JParagraphTokenizerDefinition getLangChain4jParagraphTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLangChain4jParagraphTokenizer <em>Lang Chain4j Paragraph Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Chain4j Paragraph Tokenizer</em>' containment reference.
	 * @see #getLangChain4jParagraphTokenizer()
	 * @generated
	 */
	void setLangChain4jParagraphTokenizer(LangChain4JParagraphTokenizerDefinition value);

	/**
	 * Returns the value of the '<em><b>Lang Chain4j Sentence Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel AI: Tokenizer for splitting by sentences.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Chain4j Sentence Tokenizer</em>' containment reference.
	 * @see #setLangChain4jSentenceTokenizer(LangChain4JSentenceTokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_LangChain4jSentenceTokenizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='langChain4jSentenceTokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	LangChain4JSentenceTokenizerDefinition getLangChain4jSentenceTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLangChain4jSentenceTokenizer <em>Lang Chain4j Sentence Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Chain4j Sentence Tokenizer</em>' containment reference.
	 * @see #getLangChain4jSentenceTokenizer()
	 * @generated
	 */
	void setLangChain4jSentenceTokenizer(LangChain4JSentenceTokenizerDefinition value);

	/**
	 * Returns the value of the '<em><b>Lang Chain4j Word Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Camel AI: Tokenizer for splitting by word.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Chain4j Word Tokenizer</em>' containment reference.
	 * @see #setLangChain4jWordTokenizer(LangChain4JWordTokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_LangChain4jWordTokenizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='langChain4jWordTokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	LangChain4JWordTokenizerDefinition getLangChain4jWordTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLangChain4jWordTokenizer <em>Lang Chain4j Word Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Chain4j Word Tokenizer</em>' containment reference.
	 * @see #getLangChain4jWordTokenizer()
	 * @generated
	 */
	void setLangChain4jWordTokenizer(LangChain4JWordTokenizerDefinition value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a custom language.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LanguageExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Language()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageExpression getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageExpression value);

	/**
	 * Returns the value of the '<em><b>Load Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Balances message processing among a number of nodes
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Balance</em>' containment reference.
	 * @see #setLoadBalance(LoadBalanceDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_LoadBalance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadBalanceDefinition getLoadBalance();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLoadBalance <em>Load Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balance</em>' containment reference.
	 * @see #getLoadBalance()
	 * @generated
	 */
	void setLoadBalance(LoadBalanceDefinition value);

	/**
	 * Returns the value of the '<em><b>Load Balancer Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Balancer Configuration</em>' containment reference.
	 * @see #setLoadBalancerConfiguration(ServiceCallServiceLoadBalancerConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_LoadBalancerConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadBalancerConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCallServiceLoadBalancerConfiguration getLoadBalancerConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLoadBalancerConfiguration <em>Load Balancer Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer Configuration</em>' containment reference.
	 * @see #getLoadBalancerConfiguration()
	 * @generated
	 */
	void setLoadBalancerConfiguration(ServiceCallServiceLoadBalancerConfiguration value);

	/**
	 * Returns the value of the '<em><b>Load Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To load custom transformers from classpath scanning to be used for route level transformations.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Transformer</em>' containment reference.
	 * @see #setLoadTransformer(LoadTransformerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_LoadTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadTransformer' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadTransformerDefinition getLoadTransformer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLoadTransformer <em>Load Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Transformer</em>' containment reference.
	 * @see #getLoadTransformer()
	 * @generated
	 */
	void setLoadTransformer(LoadTransformerDefinition value);

	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Used for printing custom messages to the logger.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log</em>' containment reference.
	 * @see #setLog(LogDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Log()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='log' namespace='##targetNamespace'"
	 * @generated
	 */
	LogDefinition getLog();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLog <em>Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' containment reference.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(LogDefinition value);

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Processes a message multiple times
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop</em>' containment reference.
	 * @see #setLoop(LoopDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Loop()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace'"
	 * @generated
	 */
	LoopDefinition getLoop();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLoop <em>Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' containment reference.
	 * @see #getLoop()
	 * @generated
	 */
	void setLoop(LoopDefinition value);

	/**
	 * Returns the value of the '<em><b>Lzf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Compress and decompress streams using LZF deflate algorithm.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lzf</em>' containment reference.
	 * @see #setLzf(LzfDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Lzf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lzf' namespace='##targetNamespace'"
	 * @generated
	 */
	LzfDataFormat getLzf();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getLzf <em>Lzf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lzf</em>' containment reference.
	 * @see #getLzf()
	 * @generated
	 */
	void setLzf(LzfDataFormat value);

	/**
	 * Returns the value of the '<em><b>Marshal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshals data into a specified format for transmission over a transport or component
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marshal</em>' containment reference.
	 * @see #setMarshal(MarshalDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Marshal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='marshal' namespace='##targetNamespace'"
	 * @generated
	 */
	MarshalDefinition getMarshal();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMarshal <em>Marshal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marshal</em>' containment reference.
	 * @see #getMarshal()
	 * @generated
	 */
	void setMarshal(MarshalDefinition value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Calls a Java bean method.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(MethodCallExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Method()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodCallExpression getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(MethodCallExpression value);

	/**
	 * Returns the value of the '<em><b>Mime Multipart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal Camel messages with attachments into MIME-Multipart messages and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Multipart</em>' containment reference.
	 * @see #setMimeMultipart(MimeMultipartDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_MimeMultipart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mimeMultipart' namespace='##targetNamespace'"
	 * @generated
	 */
	MimeMultipartDataFormat getMimeMultipart();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMimeMultipart <em>Mime Multipart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Multipart</em>' containment reference.
	 * @see #getMimeMultipart()
	 * @generated
	 */
	void setMimeMultipart(MimeMultipartDataFormat value);

	/**
	 * Returns the value of the '<em><b>Multicast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Routes the same message to multiple paths either sequentially or in parallel.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multicast</em>' containment reference.
	 * @see #setMulticast(MulticastDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Multicast()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multicast' namespace='##targetNamespace'"
	 * @generated
	 */
	MulticastDefinition getMulticast();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMulticast <em>Multicast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicast</em>' containment reference.
	 * @see #getMulticast()
	 * @generated
	 */
	void setMulticast(MulticastDefinition value);

	/**
	 * Returns the value of the '<em><b>Mutual TLS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security mutual TLS authentication definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutual TLS</em>' containment reference.
	 * @see #setMutualTLS(MutualTLSDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_MutualTLS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mutualTLS' namespace='##targetNamespace'"
	 * @generated
	 */
	MutualTLSDefinition getMutualTLS();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMutualTLS <em>Mutual TLS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutual TLS</em>' containment reference.
	 * @see #getMutualTLS()
	 * @generated
	 */
	void setMutualTLS(MutualTLSDefinition value);

	/**
	 * Returns the value of the '<em><b>Mvel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a MVEL template.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mvel</em>' containment reference.
	 * @see #setMvel(MvelExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Mvel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mvel' namespace='##targetNamespace'"
	 * @generated
	 */
	MvelExpression getMvel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getMvel <em>Mvel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mvel</em>' containment reference.
	 * @see #getMvel()
	 * @generated
	 */
	void setMvel(MvelExpression value);

	/**
	 * Returns the value of the '<em><b>No Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To not use an error handler.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Error Handler</em>' containment reference.
	 * @see #setNoErrorHandler(NoErrorHandlerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_NoErrorHandler()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='noErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	NoErrorHandlerDefinition getNoErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getNoErrorHandler <em>No Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Error Handler</em>' containment reference.
	 * @see #getNoErrorHandler()
	 * @generated
	 */
	void setNoErrorHandler(NoErrorHandlerDefinition value);

	/**
	 * Returns the value of the '<em><b>Oauth2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security OAuth2 definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oauth2</em>' containment reference.
	 * @see #setOauth2(OAuth2Definition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Oauth2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oauth2' namespace='##targetNamespace'"
	 * @generated
	 */
	OAuth2Definition getOauth2();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOauth2 <em>Oauth2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oauth2</em>' containment reference.
	 * @see #getOauth2()
	 * @generated
	 */
	void setOauth2(OAuth2Definition value);

	/**
	 * Returns the value of the '<em><b>Ognl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates an OGNL expression (Apache Commons OGNL).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ognl</em>' containment reference.
	 * @see #setOgnl(OgnlExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Ognl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ognl' namespace='##targetNamespace'"
	 * @generated
	 */
	OgnlExpression getOgnl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOgnl <em>Ognl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ognl</em>' containment reference.
	 * @see #getOgnl()
	 * @generated
	 */
	void setOgnl(OgnlExpression value);

	/**
	 * Returns the value of the '<em><b>On Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route to be executed when normal route processing completes
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Completion</em>' containment reference.
	 * @see #setOnCompletion(OnCompletionDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_OnCompletion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace'"
	 * @generated
	 */
	OnCompletionDefinition getOnCompletion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOnCompletion <em>On Completion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Completion</em>' containment reference.
	 * @see #getOnCompletion()
	 * @generated
	 */
	void setOnCompletion(OnCompletionDefinition value);

	/**
	 * Returns the value of the '<em><b>On Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route to be executed when an exception is thrown
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Exception</em>' containment reference.
	 * @see #setOnException(OnExceptionDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_OnException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace'"
	 * @generated
	 */
	OnExceptionDefinition getOnException();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOnException <em>On Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Exception</em>' containment reference.
	 * @see #getOnException()
	 * @generated
	 */
	void setOnException(OnExceptionDefinition value);

	/**
	 * Returns the value of the '<em><b>On Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route to be executed when Circuit Breaker EIP executes fallback
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Fallback</em>' containment reference.
	 * @see #setOnFallback(OnFallbackDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_OnFallback()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onFallback' namespace='##targetNamespace'"
	 * @generated
	 */
	OnFallbackDefinition getOnFallback();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOnFallback <em>On Fallback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Fallback</em>' containment reference.
	 * @see #getOnFallback()
	 * @generated
	 */
	void setOnFallback(OnFallbackDefinition value);

	/**
	 * Returns the value of the '<em><b>On When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a predicate to determine when to trigger this.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On When</em>' containment reference.
	 * @see #setOnWhen(OnWhenDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_OnWhen()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onWhen' namespace='##targetNamespace'"
	 * @generated
	 */
	OnWhenDefinition getOnWhen();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOnWhen <em>On When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On When</em>' containment reference.
	 * @see #getOnWhen()
	 * @generated
	 */
	void setOnWhen(OnWhenDefinition value);

	/**
	 * Returns the value of the '<em><b>Open Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use OpenApi as contract-first with Camel Rest DSL.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Api</em>' containment reference.
	 * @see #setOpenApi(OpenApiDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_OpenApi()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='openApi' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenApiDefinition getOpenApi();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOpenApi <em>Open Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Api</em>' containment reference.
	 * @see #getOpenApi()
	 * @generated
	 */
	void setOpenApi(OpenApiDefinition value);

	/**
	 * Returns the value of the '<em><b>Open Id Connect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security OpenID Connect definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Id Connect</em>' containment reference.
	 * @see #setOpenIdConnect(OpenIdConnectDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_OpenIdConnect()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='openIdConnect' namespace='##targetNamespace'"
	 * @generated
	 */
	OpenIdConnectDefinition getOpenIdConnect();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOpenIdConnect <em>Open Id Connect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Id Connect</em>' containment reference.
	 * @see #getOpenIdConnect()
	 * @generated
	 */
	void setOpenIdConnect(OpenIdConnectDefinition value);

	/**
	 * Returns the value of the '<em><b>Optimistic Lock Retry Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure optimistic locking
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optimistic Lock Retry Policy</em>' containment reference.
	 * @see #setOptimisticLockRetryPolicy(OptimisticLockRetryPolicyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_OptimisticLockRetryPolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='optimisticLockRetryPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	OptimisticLockRetryPolicyDefinition getOptimisticLockRetryPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOptimisticLockRetryPolicy <em>Optimistic Lock Retry Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimistic Lock Retry Policy</em>' containment reference.
	 * @see #getOptimisticLockRetryPolicy()
	 * @generated
	 */
	void setOptimisticLockRetryPolicy(OptimisticLockRetryPolicyDefinition value);

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route to be executed when all other choices evaluate to false
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Otherwise</em>' containment reference.
	 * @see #setOtherwise(OtherwiseDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Otherwise()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='otherwise' namespace='##targetNamespace'"
	 * @generated
	 */
	OtherwiseDefinition getOtherwise();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOtherwise <em>Otherwise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise</em>' containment reference.
	 * @see #getOtherwise()
	 * @generated
	 */
	void setOtherwise(OtherwiseDefinition value);

	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Set the expected data type of the output message. If the actual message type is different at runtime, camel look for a
	 * required Transformer and apply if exists. If validate attribute is true then camel applies Validator as well. Type name
	 * consists of two parts, 'scheme' and 'name' connected with ':'. For Java type 'name' is a fully qualified class name. For
	 * example {code java:java.lang.String} , {code json:ABCOrder} . It's also possible to specify only scheme part, so that it
	 * works like a wildcard. If only 'xml' is specified, all the XML message matches. It's handy to add only one
	 * transformer/validator for all the XML-Java transformation.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Type</em>' containment reference.
	 * @see #setOutputType(OutputTypeDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_OutputType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outputType' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputTypeDefinition getOutputType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getOutputType <em>Output Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' containment reference.
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(OutputTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Package Scan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Scans for Java org.apache.camel.builder.RouteBuilder classes in java packages
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Scan</em>' containment reference.
	 * @see #setPackageScan(PackageScanDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_PackageScan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='packageScan' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageScanDefinition getPackageScan();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPackageScan <em>Package Scan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Scan</em>' containment reference.
	 * @see #getPackageScan()
	 * @generated
	 */
	void setPackageScan(PackageScanDefinition value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To specify the rest operation parameters.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param</em>' containment reference.
	 * @see #setParam(ParamDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Param()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamDefinition getParam();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getParam <em>Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' containment reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(ParamDefinition value);

	/**
	 * Returns the value of the '<em><b>Parquet Avro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Parquet Avro serialization and de-serialization.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parquet Avro</em>' containment reference.
	 * @see #setParquetAvro(ParquetAvroDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ParquetAvro()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parquetAvro' namespace='##targetNamespace'"
	 * @generated
	 */
	ParquetAvroDataFormat getParquetAvro();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getParquetAvro <em>Parquet Avro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parquet Avro</em>' containment reference.
	 * @see #getParquetAvro()
	 * @generated
	 */
	void setParquetAvro(ParquetAvroDataFormat value);

	/**
	 * Returns the value of the '<em><b>Pass Through Service Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pass Through Service Filter</em>' containment reference.
	 * @see #setPassThroughServiceFilter(PassThroughServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_PassThroughServiceFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='passThroughServiceFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	PassThroughServiceCallServiceFilterConfiguration getPassThroughServiceFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPassThroughServiceFilter <em>Pass Through Service Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Through Service Filter</em>' containment reference.
	 * @see #getPassThroughServiceFilter()
	 * @generated
	 */
	void setPassThroughServiceFilter(PassThroughServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest PATCH command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patch</em>' containment reference.
	 * @see #setPatch(PatchDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Patch()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='patch' namespace='##targetNamespace'"
	 * @generated
	 */
	PatchDefinition getPatch();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPatch <em>Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patch</em>' containment reference.
	 * @see #getPatch()
	 * @generated
	 */
	void setPatch(PatchDefinition value);

	/**
	 * Returns the value of the '<em><b>Pausable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Pausable EIP to support resuming processing from last known offset.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pausable</em>' containment reference.
	 * @see #setPausable(PausableDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Pausable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pausable' namespace='##targetNamespace'"
	 * @generated
	 */
	PausableDefinition getPausable();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPausable <em>Pausable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pausable</em>' containment reference.
	 * @see #getPausable()
	 * @generated
	 */
	void setPausable(PausableDefinition value);

	/**
	 * Returns the value of the '<em><b>Pgp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encrypt and decrypt messages using Java Cryptographic Extension (JCE) and PGP.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pgp</em>' containment reference.
	 * @see #setPgp(PgpDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Pgp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pgp' namespace='##targetNamespace'"
	 * @generated
	 */
	PgpDataFormat getPgp();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPgp <em>Pgp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgp</em>' containment reference.
	 * @see #getPgp()
	 * @generated
	 */
	void setPgp(PgpDataFormat value);

	/**
	 * Returns the value of the '<em><b>Pipeline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Routes the message to a sequence of processors.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pipeline</em>' containment reference.
	 * @see #setPipeline(PipelineDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Pipeline()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pipeline' namespace='##targetNamespace'"
	 * @generated
	 */
	PipelineDefinition getPipeline();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPipeline <em>Pipeline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipeline</em>' containment reference.
	 * @see #getPipeline()
	 * @generated
	 */
	void setPipeline(PipelineDefinition value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a policy the route will use
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(PolicyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Policy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace'"
	 * @generated
	 */
	PolicyDefinition getPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(PolicyDefinition value);

	/**
	 * Returns the value of the '<em><b>Poll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Polls a message from a static endpoint
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Poll</em>' containment reference.
	 * @see #setPoll(PollDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Poll()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='poll' namespace='##targetNamespace'"
	 * @generated
	 */
	PollDefinition getPoll();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPoll <em>Poll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poll</em>' containment reference.
	 * @see #getPoll()
	 * @generated
	 */
	void setPoll(PollDefinition value);

	/**
	 * Returns the value of the '<em><b>Poll Enrich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enriches messages with data polled from a secondary resource
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Poll Enrich</em>' containment reference.
	 * @see #setPollEnrich(PollEnrichDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_PollEnrich()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pollEnrich' namespace='##targetNamespace'"
	 * @generated
	 */
	PollEnrichDefinition getPollEnrich();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPollEnrich <em>Poll Enrich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poll Enrich</em>' containment reference.
	 * @see #getPollEnrich()
	 * @generated
	 */
	void setPollEnrich(PollEnrichDefinition value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest POST command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(PostDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Post()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='post' namespace='##targetNamespace'"
	 * @generated
	 */
	PostDefinition getPost();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(PostDefinition value);

	/**
	 * Returns the value of the '<em><b>Predicate Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a predicate to perform validation on the route level.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predicate Validator</em>' containment reference.
	 * @see #setPredicateValidator(PredicateValidatorDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_PredicateValidator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='predicateValidator' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateValidatorDefinition getPredicateValidator();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPredicateValidator <em>Predicate Validator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate Validator</em>' containment reference.
	 * @see #getPredicateValidator()
	 * @generated
	 */
	void setPredicateValidator(PredicateValidatorDefinition value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Calls a Camel processor
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(ProcessDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Process()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessDefinition getProcess();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(ProcessDefinition value);

	/**
	 * Returns the value of the '<em><b>Properties Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Function to use with properties placeholder
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties Function</em>' containment reference.
	 * @see #setPropertiesFunction(CamelPropertyPlaceholderFunctionDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_PropertiesFunction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='propertiesFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelPropertyPlaceholderFunctionDefinition getPropertiesFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPropertiesFunction <em>Properties Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Function</em>' containment reference.
	 * @see #getPropertiesFunction()
	 * @generated
	 */
	void setPropertiesFunction(CamelPropertyPlaceholderFunctionDefinition value);

	/**
	 * Returns the value of the '<em><b>Properties Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Properties to use with properties placeholder
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties Location</em>' containment reference.
	 * @see #setPropertiesLocation(CamelPropertyPlaceholderLocationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_PropertiesLocation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='propertiesLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelPropertyPlaceholderLocationDefinition getPropertiesLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPropertiesLocation <em>Properties Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Location</em>' containment reference.
	 * @see #getPropertiesLocation()
	 * @generated
	 */
	void setPropertiesLocation(CamelPropertyPlaceholderLocationDefinition value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A key value pair where the value is a literal value
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Property()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyDefinition getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyDefinition value);

	/**
	 * Returns the value of the '<em><b>Property Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A key value pair where the value is an expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Expression</em>' containment reference.
	 * @see #setPropertyExpression(PropertyExpressionDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_PropertyExpression()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='propertyExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyExpressionDefinition getPropertyExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPropertyExpression <em>Property Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Expression</em>' containment reference.
	 * @see #getPropertyExpression()
	 * @generated
	 */
	void setPropertyExpression(PropertyExpressionDefinition value);

	/**
	 * Returns the value of the '<em><b>Property Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Properties placeholder
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Placeholder</em>' containment reference.
	 * @see #setPropertyPlaceholder(CamelPropertyPlaceholderDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_PropertyPlaceholder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='propertyPlaceholder' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelPropertyPlaceholderDefinition getPropertyPlaceholder();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPropertyPlaceholder <em>Property Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Placeholder</em>' containment reference.
	 * @see #getPropertyPlaceholder()
	 * @generated
	 */
	void setPropertyPlaceholder(CamelPropertyPlaceholderDefinition value);

	/**
	 * Returns the value of the '<em><b>Protobuf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Serialize and deserialize Java objects using Google's Protocol buffers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protobuf</em>' containment reference.
	 * @see #setProtobuf(ProtobufDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Protobuf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='protobuf' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtobufDataFormat getProtobuf();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getProtobuf <em>Protobuf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protobuf</em>' containment reference.
	 * @see #getProtobuf()
	 * @generated
	 */
	void setProtobuf(ProtobufDataFormat value);

	/**
	 * Returns the value of the '<em><b>Put</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest PUT command
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Put</em>' containment reference.
	 * @see #setPut(PutDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Put()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='put' namespace='##targetNamespace'"
	 * @generated
	 */
	PutDefinition getPut();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPut <em>Put</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put</em>' containment reference.
	 * @see #getPut()
	 * @generated
	 */
	void setPut(PutDefinition value);

	/**
	 * Returns the value of the '<em><b>Python</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a Python expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Python</em>' containment reference.
	 * @see #setPython(PythonExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Python()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='python' namespace='##targetNamespace'"
	 * @generated
	 */
	PythonExpression getPython();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getPython <em>Python</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Python</em>' containment reference.
	 * @see #getPython()
	 * @generated
	 */
	void setPython(PythonExpression value);

	/**
	 * Returns the value of the '<em><b>Random Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The destination endpoints are selected randomly.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Random Load Balancer</em>' containment reference.
	 * @see #setRandomLoadBalancer(RandomLoadBalancerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RandomLoadBalancer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='randomLoadBalancer' namespace='##targetNamespace'"
	 * @generated
	 */
	RandomLoadBalancerDefinition getRandomLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRandomLoadBalancer <em>Random Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random Load Balancer</em>' containment reference.
	 * @see #getRandomLoadBalancer()
	 * @generated
	 */
	void setRandomLoadBalancer(RandomLoadBalancerDefinition value);

	/**
	 * Returns the value of the '<em><b>Recipient List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route messages to a number of dynamically specified recipients
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient List</em>' containment reference.
	 * @see #setRecipientList(RecipientListDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RecipientList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recipientList' namespace='##targetNamespace'"
	 * @generated
	 */
	RecipientListDefinition getRecipientList();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRecipientList <em>Recipient List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient List</em>' containment reference.
	 * @see #getRecipientList()
	 * @generated
	 */
	void setRecipientList(RecipientListDefinition value);

	/**
	 * Returns the value of the '<em><b>Redelivery Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure re-delivery for error handling
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redelivery Policy</em>' containment reference.
	 * @see #setRedeliveryPolicy(RedeliveryPolicyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RedeliveryPolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redeliveryPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	RedeliveryPolicyDefinition getRedeliveryPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRedeliveryPolicy <em>Redelivery Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redelivery Policy</em>' containment reference.
	 * @see #getRedeliveryPolicy()
	 * @generated
	 */
	void setRedeliveryPolicy(RedeliveryPolicyDefinition value);

	/**
	 * Returns the value of the '<em><b>Redelivery Policy Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configuration of redelivery policy.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redelivery Policy Profile</em>' containment reference.
	 * @see #setRedeliveryPolicyProfile(CamelRedeliveryPolicyFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RedeliveryPolicyProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redeliveryPolicyProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelRedeliveryPolicyFactoryBean getRedeliveryPolicyProfile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRedeliveryPolicyProfile <em>Redelivery Policy Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redelivery Policy Profile</em>' containment reference.
	 * @see #getRedeliveryPolicyProfile()
	 * @generated
	 */
	void setRedeliveryPolicyProfile(CamelRedeliveryPolicyFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Uses an existing expression from the registry.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(RefExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Ref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	RefExpression getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(RefExpression value);

	/**
	 * Returns the value of the '<em><b>Ref Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * References to an existing or custom error handler.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Error Handler</em>' containment reference.
	 * @see #setRefErrorHandler(RefErrorHandlerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RefErrorHandler()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	RefErrorHandlerDefinition getRefErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRefErrorHandler <em>Ref Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Error Handler</em>' containment reference.
	 * @see #getRefErrorHandler()
	 * @generated
	 */
	void setRefErrorHandler(RefErrorHandlerDefinition value);

	/**
	 * Returns the value of the '<em><b>Remove Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Removes a named header from the message
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Header</em>' containment reference.
	 * @see #setRemoveHeader(RemoveHeaderDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RemoveHeader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveHeaderDefinition getRemoveHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRemoveHeader <em>Remove Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Header</em>' containment reference.
	 * @see #getRemoveHeader()
	 * @generated
	 */
	void setRemoveHeader(RemoveHeaderDefinition value);

	/**
	 * Returns the value of the '<em><b>Remove Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Removes message headers whose name matches a specified pattern
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Headers</em>' containment reference.
	 * @see #setRemoveHeaders(RemoveHeadersDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RemoveHeaders()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeaders' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveHeadersDefinition getRemoveHeaders();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRemoveHeaders <em>Remove Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Headers</em>' containment reference.
	 * @see #getRemoveHeaders()
	 * @generated
	 */
	void setRemoveHeaders(RemoveHeadersDefinition value);

	/**
	 * Returns the value of the '<em><b>Remove Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Removes message exchange properties whose name matches a specified pattern
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Properties</em>' containment reference.
	 * @see #setRemoveProperties(RemovePropertiesDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RemoveProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	RemovePropertiesDefinition getRemoveProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRemoveProperties <em>Remove Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Properties</em>' containment reference.
	 * @see #getRemoveProperties()
	 * @generated
	 */
	void setRemoveProperties(RemovePropertiesDefinition value);

	/**
	 * Returns the value of the '<em><b>Remove Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Removes a named property from the message exchange
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Property</em>' containment reference.
	 * @see #setRemoveProperty(RemovePropertyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RemoveProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	RemovePropertyDefinition getRemoveProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRemoveProperty <em>Remove Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Property</em>' containment reference.
	 * @see #getRemoveProperty()
	 * @generated
	 */
	void setRemoveProperty(RemovePropertyDefinition value);

	/**
	 * Returns the value of the '<em><b>Remove Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Removes a named variable
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Variable</em>' containment reference.
	 * @see #setRemoveVariable(RemoveVariableDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RemoveVariable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeVariable' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveVariableDefinition getRemoveVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRemoveVariable <em>Remove Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Variable</em>' containment reference.
	 * @see #getRemoveVariable()
	 * @generated
	 */
	void setRemoveVariable(RemoveVariableDefinition value);

	/**
	 * Returns the value of the '<em><b>Resequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Resequences (re-order) messages based on an expression
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resequence</em>' containment reference.
	 * @see #setResequence(ResequenceDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Resequence()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resequence' namespace='##targetNamespace'"
	 * @generated
	 */
	ResequenceDefinition getResequence();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getResequence <em>Resequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resequence</em>' containment reference.
	 * @see #getResequence()
	 * @generated
	 */
	void setResequence(ResequenceDefinition value);

	/**
	 * Returns the value of the '<em><b>Resilience4j Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Resilience4j Circuit Breaker EIP configuration
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resilience4j Configuration</em>' containment reference.
	 * @see #setResilience4jConfiguration(Resilience4JConfigurationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Resilience4jConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resilience4jConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	Resilience4JConfigurationDefinition getResilience4jConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getResilience4jConfiguration <em>Resilience4j Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resilience4j Configuration</em>' containment reference.
	 * @see #getResilience4jConfiguration()
	 * @generated
	 */
	void setResilience4jConfiguration(Resilience4JConfigurationDefinition value);

	/**
	 * Returns the value of the '<em><b>Response Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To specify the rest operation response headers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Header</em>' containment reference.
	 * @see #setResponseHeader(ResponseHeaderDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ResponseHeader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='responseHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeaderDefinition getResponseHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getResponseHeader <em>Response Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Header</em>' containment reference.
	 * @see #getResponseHeader()
	 * @generated
	 */
	void setResponseHeader(ResponseHeaderDefinition value);

	/**
	 * Returns the value of the '<em><b>Response Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To specify the rest operation response messages.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Message</em>' containment reference.
	 * @see #setResponseMessage(ResponseMessageDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ResponseMessage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='responseMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseMessageDefinition getResponseMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getResponseMessage <em>Response Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Message</em>' containment reference.
	 * @see #getResponseMessage()
	 * @generated
	 */
	void setResponseMessage(ResponseMessageDefinition value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a rest service using the rest-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference.
	 * @see #setRest(RestDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Rest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rest' namespace='##targetNamespace'"
	 * @generated
	 */
	RestDefinition getRest();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRest <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' containment reference.
	 * @see #getRest()
	 * @generated
	 */
	void setRest(RestDefinition value);

	/**
	 * Returns the value of the '<em><b>Rest Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure rest binding
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest Binding</em>' containment reference.
	 * @see #setRestBinding(RestBindingDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RestBinding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='restBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	RestBindingDefinition getRestBinding();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRestBinding <em>Rest Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Binding</em>' containment reference.
	 * @see #getRestBinding()
	 * @generated
	 */
	void setRestBinding(RestBindingDefinition value);

	/**
	 * Returns the value of the '<em><b>Rest Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure rest
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest Configuration</em>' containment reference.
	 * @see #setRestConfiguration(RestConfigurationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RestConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='restConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	RestConfigurationDefinition getRestConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRestConfiguration <em>Rest Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Configuration</em>' containment reference.
	 * @see #getRestConfiguration()
	 * @generated
	 */
	void setRestConfiguration(RestConfigurationDefinition value);

	/**
	 * Returns the value of the '<em><b>Rest Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configuration of REST services using rest-dsl using XML
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest Context</em>' containment reference.
	 * @see #setRestContext(CamelRestContextFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RestContext()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='restContext' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelRestContextFactoryBean getRestContext();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRestContext <em>Rest Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Context</em>' containment reference.
	 * @see #getRestContext()
	 * @generated
	 */
	void setRestContext(CamelRestContextFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Rest Context Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to an XML file with rest services defined using the rest-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest Context Ref</em>' containment reference.
	 * @see #setRestContextRef(RestContextRefDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RestContextRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='restContextRef' namespace='##targetNamespace'"
	 * @generated
	 */
	RestContextRefDefinition getRestContextRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRestContextRef <em>Rest Context Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Context Ref</em>' containment reference.
	 * @see #getRestContextRef()
	 * @generated
	 */
	void setRestContextRef(RestContextRefDefinition value);

	/**
	 * Returns the value of the '<em><b>Rest Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A key value pair
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest Property</em>' containment reference.
	 * @see #setRestProperty(RestPropertyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RestProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='restProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	RestPropertyDefinition getRestProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRestProperty <em>Rest Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Property</em>' containment reference.
	 * @see #getRestProperty()
	 * @generated
	 */
	void setRestProperty(RestPropertyDefinition value);

	/**
	 * Returns the value of the '<em><b>Rests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A series of rest services defined using the rest-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rests</em>' containment reference.
	 * @see #setRests(RestsDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Rests()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rests' namespace='##targetNamespace'"
	 * @generated
	 */
	RestsDefinition getRests();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRests <em>Rests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rests</em>' containment reference.
	 * @see #getRests()
	 * @generated
	 */
	void setRests(RestsDefinition value);

	/**
	 * Returns the value of the '<em><b>Resumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Resume EIP to support resuming processing from last known offset.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resumable</em>' containment reference.
	 * @see #setResumable(ResumableDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Resumable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resumable' namespace='##targetNamespace'"
	 * @generated
	 */
	ResumableDefinition getResumable();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getResumable <em>Resumable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resumable</em>' containment reference.
	 * @see #getResumable()
	 * @generated
	 */
	void setResumable(ResumableDefinition value);

	/**
	 * Returns the value of the '<em><b>Rollback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Forces a rollback by stopping routing the message
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rollback</em>' containment reference.
	 * @see #setRollback(RollbackDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Rollback()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace'"
	 * @generated
	 */
	RollbackDefinition getRollback();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRollback <em>Rollback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rollback</em>' containment reference.
	 * @see #getRollback()
	 * @generated
	 */
	void setRollback(RollbackDefinition value);

	/**
	 * Returns the value of the '<em><b>Round Robin Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * The destination endpoints are selected in a round-robin fashion. This is a well-known and classic policy, which spreads
	 * the load evenly.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Round Robin Load Balancer</em>' containment reference.
	 * @see #setRoundRobinLoadBalancer(RoundRobinLoadBalancerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RoundRobinLoadBalancer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='roundRobinLoadBalancer' namespace='##targetNamespace'"
	 * @generated
	 */
	RoundRobinLoadBalancerDefinition getRoundRobinLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRoundRobinLoadBalancer <em>Round Robin Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Robin Load Balancer</em>' containment reference.
	 * @see #getRoundRobinLoadBalancer()
	 * @generated
	 */
	void setRoundRobinLoadBalancer(RoundRobinLoadBalancerDefinition value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A Camel route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(RouteDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Route()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteDefinition getRoute();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(RouteDefinition value);

	/**
	 * Returns the value of the '<em><b>Route Builder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to a Java org.apache.camel.builder.RouteBuilder instance to use.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Builder</em>' containment reference.
	 * @see #setRouteBuilder(RouteBuilderDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteBuilder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeBuilder' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteBuilderDefinition getRouteBuilder();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteBuilder <em>Route Builder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Builder</em>' containment reference.
	 * @see #getRouteBuilder()
	 * @generated
	 */
	void setRouteBuilder(RouteBuilderDefinition value);

	/**
	 * Returns the value of the '<em><b>Route Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Reusable configuration for Camel route(s).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Configuration</em>' containment reference.
	 * @see #setRouteConfiguration(RouteConfigurationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteConfigurationDefinition getRouteConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteConfiguration <em>Route Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Configuration</em>' containment reference.
	 * @see #getRouteConfiguration()
	 * @generated
	 */
	void setRouteConfiguration(RouteConfigurationDefinition value);

	/**
	 * Returns the value of the '<em><b>Route Configuration Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configuration of route configurations using XML
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Configuration Context</em>' containment reference.
	 * @see #setRouteConfigurationContext(CamelRouteConfigurationContextFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteConfigurationContext()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeConfigurationContext' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelRouteConfigurationContextFactoryBean getRouteConfigurationContext();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteConfigurationContext <em>Route Configuration Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Configuration Context</em>' containment reference.
	 * @see #getRouteConfigurationContext()
	 * @generated
	 */
	void setRouteConfigurationContext(CamelRouteConfigurationContextFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Route Configuration Context Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to an XML file with route configuration defined using the xml-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Configuration Context Ref</em>' containment reference.
	 * @see #setRouteConfigurationContextRef(RouteConfigurationContextRefDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteConfigurationContextRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeConfigurationContextRef' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteConfigurationContextRefDefinition getRouteConfigurationContextRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteConfigurationContextRef <em>Route Configuration Context Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Configuration Context Ref</em>' containment reference.
	 * @see #getRouteConfigurationContextRef()
	 * @generated
	 */
	void setRouteConfigurationContextRef(RouteConfigurationContextRefDefinition value);

	/**
	 * Returns the value of the '<em><b>Route Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A series of route configurations
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Configurations</em>' containment reference.
	 * @see #setRouteConfigurations(RouteConfigurationsDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteConfigurations()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeConfigurations' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteConfigurationsDefinition getRouteConfigurations();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteConfigurations <em>Route Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Configurations</em>' containment reference.
	 * @see #getRouteConfigurations()
	 * @generated
	 */
	void setRouteConfigurations(RouteConfigurationsDefinition value);

	/**
	 * Returns the value of the '<em><b>Route Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configuration of routes using XML
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Context</em>' containment reference.
	 * @see #setRouteContext(CamelRouteContextFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteContext()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeContext' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelRouteContextFactoryBean getRouteContext();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteContext <em>Route Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Context</em>' containment reference.
	 * @see #getRouteContext()
	 * @generated
	 */
	void setRouteContext(CamelRouteContextFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Route Context Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to an XML file with routes defined using the xml-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Context Ref</em>' containment reference.
	 * @see #setRouteContextRef(RouteContextRefDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteContextRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeContextRef' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteContextRefDefinition getRouteContextRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteContextRef <em>Route Context Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Context Ref</em>' containment reference.
	 * @see #getRouteContextRef()
	 * @generated
	 */
	void setRouteContextRef(RouteContextRefDefinition value);

	/**
	 * Returns the value of the '<em><b>Route Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Route controller configuration.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Controller</em>' containment reference.
	 * @see #setRouteController(CamelRouteControllerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteController()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeController' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelRouteControllerDefinition getRouteController();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteController <em>Route Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Controller</em>' containment reference.
	 * @see #getRouteController()
	 * @generated
	 */
	void setRouteController(CamelRouteControllerDefinition value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A series of Camel routes
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference.
	 * @see #setRoutes(RoutesDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Routes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routes' namespace='##targetNamespace'"
	 * @generated
	 */
	RoutesDefinition getRoutes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRoutes <em>Routes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routes</em>' containment reference.
	 * @see #getRoutes()
	 * @generated
	 */
	void setRoutes(RoutesDefinition value);

	/**
	 * Returns the value of the '<em><b>Route Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a route template (parameterized routes)
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Template</em>' containment reference.
	 * @see #setRouteTemplate(RouteTemplateDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteTemplateDefinition getRouteTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteTemplate <em>Route Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Template</em>' containment reference.
	 * @see #getRouteTemplate()
	 * @generated
	 */
	void setRouteTemplate(RouteTemplateDefinition value);

	/**
	 * Returns the value of the '<em><b>Route Template Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configuration of route templates using XML
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Template Context</em>' containment reference.
	 * @see #setRouteTemplateContext(CamelRouteTemplateContextFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteTemplateContext()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeTemplateContext' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelRouteTemplateContextFactoryBean getRouteTemplateContext();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteTemplateContext <em>Route Template Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Template Context</em>' containment reference.
	 * @see #getRouteTemplateContext()
	 * @generated
	 */
	void setRouteTemplateContext(CamelRouteTemplateContextFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Route Template Context Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To refer to an XML file with route templates defined using the xml-dsl
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Template Context Ref</em>' containment reference.
	 * @see #setRouteTemplateContextRef(RouteTemplateContextRefDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteTemplateContextRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeTemplateContextRef' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteTemplateContextRefDefinition getRouteTemplateContextRef();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteTemplateContextRef <em>Route Template Context Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Template Context Ref</em>' containment reference.
	 * @see #getRouteTemplateContextRef()
	 * @generated
	 */
	void setRouteTemplateContextRef(RouteTemplateContextRefDefinition value);

	/**
	 * Returns the value of the '<em><b>Route Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A series of route templates
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Templates</em>' containment reference.
	 * @see #setRouteTemplates(RouteTemplatesDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RouteTemplates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routeTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteTemplatesDefinition getRouteTemplates();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRouteTemplates <em>Route Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Templates</em>' containment reference.
	 * @see #getRouteTemplates()
	 * @generated
	 */
	void setRouteTemplates(RouteTemplatesDefinition value);

	/**
	 * Returns the value of the '<em><b>Routing Slip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Routes a message through a series of steps that are pre-determined (the slip)
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Routing Slip</em>' containment reference.
	 * @see #setRoutingSlip(RoutingSlipDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_RoutingSlip()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routingSlip' namespace='##targetNamespace'"
	 * @generated
	 */
	RoutingSlipDefinition getRoutingSlip();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRoutingSlip <em>Routing Slip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Slip</em>' containment reference.
	 * @see #getRoutingSlip()
	 * @generated
	 */
	void setRoutingSlip(RoutingSlipDefinition value);

	/**
	 * Returns the value of the '<em><b>Rss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Transform from ROME SyndFeed Java Objects to XML and vice-versa.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rss</em>' containment reference.
	 * @see #setRss(RssDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Rss()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rss' namespace='##targetNamespace'"
	 * @generated
	 */
	RssDataFormat getRss();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getRss <em>Rss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rss</em>' containment reference.
	 * @see #getRss()
	 * @generated
	 */
	void setRss(RssDataFormat value);

	/**
	 * Returns the value of the '<em><b>Saga</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enables Sagas on the route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Saga</em>' containment reference.
	 * @see #setSaga(SagaDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Saga()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='saga' namespace='##targetNamespace'"
	 * @generated
	 */
	SagaDefinition getSaga();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSaga <em>Saga</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saga</em>' containment reference.
	 * @see #getSaga()
	 * @generated
	 */
	void setSaga(SagaDefinition value);

	/**
	 * Returns the value of the '<em><b>Sample</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Extract a sample of the messages passing through a route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sample</em>' containment reference.
	 * @see #setSample(SamplingDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Sample()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sample' namespace='##targetNamespace'"
	 * @generated
	 */
	SamplingDefinition getSample();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSample <em>Sample</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample</em>' containment reference.
	 * @see #getSample()
	 * @generated
	 */
	void setSample(SamplingDefinition value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Executes a script from a language which does not change the message body.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(ScriptDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Script()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace'"
	 * @generated
	 */
	ScriptDefinition getScript();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(ScriptDefinition value);

	/**
	 * Returns the value of the '<em><b>Secure Random Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Cryptographically strong random number generator
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secure Random Parameters</em>' containment reference.
	 * @see #setSecureRandomParameters(SecureRandomParametersFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SecureRandomParameters()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='secureRandomParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	SecureRandomParametersFactoryBean getSecureRandomParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSecureRandomParameters <em>Secure Random Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Random Parameters</em>' containment reference.
	 * @see #getSecureRandomParameters()
	 * @generated
	 */
	void setSecureRandomParameters(SecureRandomParametersFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Rest security definition
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(SecurityDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Security()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityDefinition getSecurity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(SecurityDefinition value);

	/**
	 * Returns the value of the '<em><b>Security Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure rest security definitions.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Definitions</em>' containment reference.
	 * @see #setSecurityDefinitions(RestSecuritiesDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SecurityDefinitions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='securityDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	RestSecuritiesDefinition getSecurityDefinitions();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSecurityDefinitions <em>Security Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Definitions</em>' containment reference.
	 * @see #getSecurityDefinitions()
	 * @generated
	 */
	void setSecurityDefinitions(RestSecuritiesDefinition value);

	/**
	 * Returns the value of the '<em><b>Service Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: To call remote services
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Call</em>' containment reference.
	 * @see #setServiceCall(ServiceCallDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ServiceCall()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceCall' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCallDefinition getServiceCall();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceCall <em>Service Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Call</em>' containment reference.
	 * @see #getServiceCall()
	 * @generated
	 */
	void setServiceCall(ServiceCallDefinition value);

	/**
	 * Returns the value of the '<em><b>Service Call Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: Remote service call configuration
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Call Configuration</em>' containment reference.
	 * @see #setServiceCallConfiguration(ServiceCallConfigurationDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ServiceCallConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceCallConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCallConfigurationDefinition getServiceCallConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceCallConfiguration <em>Service Call Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Call Configuration</em>' containment reference.
	 * @see #getServiceCallConfiguration()
	 * @generated
	 */
	void setServiceCallConfiguration(ServiceCallConfigurationDefinition value);

	/**
	 * Returns the value of the '<em><b>Service Chooser Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Chooser Configuration</em>' containment reference.
	 * @see #setServiceChooserConfiguration(ServiceCallServiceChooserConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ServiceChooserConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceChooserConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCallServiceChooserConfiguration getServiceChooserConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceChooserConfiguration <em>Service Chooser Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Chooser Configuration</em>' containment reference.
	 * @see #getServiceChooserConfiguration()
	 * @generated
	 */
	void setServiceChooserConfiguration(ServiceCallServiceChooserConfiguration value);

	/**
	 * Returns the value of the '<em><b>Service Discovery Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Discovery Configuration</em>' containment reference.
	 * @see #setServiceDiscoveryConfiguration(ServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ServiceDiscoveryConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceDiscoveryConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCallServiceDiscoveryConfiguration getServiceDiscoveryConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceDiscoveryConfiguration <em>Service Discovery Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Discovery Configuration</em>' containment reference.
	 * @see #getServiceDiscoveryConfiguration()
	 * @generated
	 */
	void setServiceDiscoveryConfiguration(ServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Service Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Expression</em>' containment reference.
	 * @see #setServiceExpression(ServiceCallExpressionConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ServiceExpression()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCallExpressionConfiguration getServiceExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceExpression <em>Service Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Expression</em>' containment reference.
	 * @see #getServiceExpression()
	 * @generated
	 */
	void setServiceExpression(ServiceCallExpressionConfiguration value);

	/**
	 * Returns the value of the '<em><b>Service Filter Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Filter Configuration</em>' containment reference.
	 * @see #setServiceFilterConfiguration(ServiceCallServiceFilterConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ServiceFilterConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceFilterConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceCallServiceFilterConfiguration getServiceFilterConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getServiceFilterConfiguration <em>Service Filter Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Filter Configuration</em>' containment reference.
	 * @see #getServiceFilterConfiguration()
	 * @generated
	 */
	void setServiceFilterConfiguration(ServiceCallServiceFilterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Set Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the contents of the message body
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Body</em>' containment reference.
	 * @see #setSetBody(SetBodyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SetBody()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setBody' namespace='##targetNamespace'"
	 * @generated
	 */
	SetBodyDefinition getSetBody();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetBody <em>Set Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Body</em>' containment reference.
	 * @see #getSetBody()
	 * @generated
	 */
	void setSetBody(SetBodyDefinition value);

	/**
	 * Returns the value of the '<em><b>Set Exchange Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the exchange pattern on the message exchange
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Exchange Pattern</em>' containment reference.
	 * @see #setSetExchangePattern(SetExchangePatternDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SetExchangePattern()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setExchangePattern' namespace='##targetNamespace'"
	 * @generated
	 */
	SetExchangePatternDefinition getSetExchangePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetExchangePattern <em>Set Exchange Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Exchange Pattern</em>' containment reference.
	 * @see #getSetExchangePattern()
	 * @generated
	 */
	void setSetExchangePattern(SetExchangePatternDefinition value);

	/**
	 * Returns the value of the '<em><b>Set Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the value of a message header
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Header</em>' containment reference.
	 * @see #setSetHeader(SetHeaderDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SetHeader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	SetHeaderDefinition getSetHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetHeader <em>Set Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Header</em>' containment reference.
	 * @see #getSetHeader()
	 * @generated
	 */
	void setSetHeader(SetHeaderDefinition value);

	/**
	 * Returns the value of the '<em><b>Set Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows setting multiple headers on the message at the same time.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Headers</em>' containment reference.
	 * @see #setSetHeaders(SetHeadersDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SetHeaders()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setHeaders' namespace='##targetNamespace'"
	 * @generated
	 */
	SetHeadersDefinition getSetHeaders();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetHeaders <em>Set Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Headers</em>' containment reference.
	 * @see #getSetHeaders()
	 * @generated
	 */
	void setSetHeaders(SetHeadersDefinition value);

	/**
	 * Returns the value of the '<em><b>Set Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets a named property on the message exchange
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Property</em>' containment reference.
	 * @see #setSetProperty(SetPropertyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SetProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	SetPropertyDefinition getSetProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetProperty <em>Set Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Property</em>' containment reference.
	 * @see #getSetProperty()
	 * @generated
	 */
	void setSetProperty(SetPropertyDefinition value);

	/**
	 * Returns the value of the '<em><b>Set Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sets the value of a variable
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Variable</em>' containment reference.
	 * @see #setSetVariable(SetVariableDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SetVariable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setVariable' namespace='##targetNamespace'"
	 * @generated
	 */
	SetVariableDefinition getSetVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetVariable <em>Set Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Variable</em>' containment reference.
	 * @see #getSetVariable()
	 * @generated
	 */
	void setSetVariable(SetVariableDefinition value);

	/**
	 * Returns the value of the '<em><b>Set Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Allows setting multiple variables at the same time.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Variables</em>' containment reference.
	 * @see #setSetVariables(SetVariablesDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SetVariables()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setVariables' namespace='##targetNamespace'"
	 * @generated
	 */
	SetVariablesDefinition getSetVariables();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSetVariables <em>Set Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Variables</em>' containment reference.
	 * @see #getSetVariables()
	 * @generated
	 */
	void setSetVariables(SetVariablesDefinition value);

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a Camel simple expression.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple</em>' containment reference.
	 * @see #setSimple(SimpleExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Simple()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleExpression getSimple();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSimple <em>Simple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple</em>' containment reference.
	 * @see #getSimple()
	 * @generated
	 */
	void setSimple(SimpleExpression value);

	/**
	 * Returns the value of the '<em><b>Smooks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Transform and bind XML as well as non-XML data, including EDI, CSV, JSON, and YAML using Smooks.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Smooks</em>' containment reference.
	 * @see #setSmooks(SmooksDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Smooks()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='smooks' namespace='##targetNamespace'"
	 * @generated
	 */
	SmooksDataFormat getSmooks();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSmooks <em>Smooks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smooks</em>' containment reference.
	 * @see #getSmooks()
	 * @generated
	 */
	void setSmooks(SmooksDataFormat value);

	/**
	 * Returns the value of the '<em><b>Soap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal Java objects to SOAP messages and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soap</em>' containment reference.
	 * @see #setSoap(SoapDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Soap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='soap' namespace='##targetNamespace'"
	 * @generated
	 */
	SoapDataFormat getSoap();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSoap <em>Soap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soap</em>' containment reference.
	 * @see #getSoap()
	 * @generated
	 */
	void setSoap(SoapDataFormat value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sorts the contents of the message
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference.
	 * @see #setSort(SortDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Sort()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace'"
	 * @generated
	 */
	SortDefinition getSort();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSort <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' containment reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(SortDefinition value);

	/**
	 * Returns the value of the '<em><b>Spel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates a Spring expression (SpEL).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spel</em>' containment reference.
	 * @see #setSpel(SpELExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Spel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='spel' namespace='##targetNamespace'"
	 * @generated
	 */
	SpELExpression getSpel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSpel <em>Spel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spel</em>' containment reference.
	 * @see #getSpel()
	 * @generated
	 */
	void setSpel(SpELExpression value);

	/**
	 * Returns the value of the '<em><b>Split</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Splits a single message into many sub-messages.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Split</em>' containment reference.
	 * @see #setSplit(SplitDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Split()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='split' namespace='##targetNamespace'"
	 * @generated
	 */
	SplitDefinition getSplit();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSplit <em>Split</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split</em>' containment reference.
	 * @see #getSplit()
	 * @generated
	 */
	void setSplit(SplitDefinition value);

	/**
	 * Returns the value of the '<em><b>Spring Transaction Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Spring based transactional error handler (requires camel-spring).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spring Transaction Error Handler</em>' containment reference.
	 * @see #setSpringTransactionErrorHandler(SpringTransactionErrorHandlerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SpringTransactionErrorHandler()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='springTransactionErrorHandler' namespace='##targetNamespace'"
	 * @generated
	 */
	SpringTransactionErrorHandlerDefinition getSpringTransactionErrorHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSpringTransactionErrorHandler <em>Spring Transaction Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring Transaction Error Handler</em>' containment reference.
	 * @see #getSpringTransactionErrorHandler()
	 * @generated
	 */
	void setSpringTransactionErrorHandler(SpringTransactionErrorHandlerDefinition value);

	/**
	 * Returns the value of the '<em><b>Ssl Context Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Secure socket protocol configuration
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssl Context Parameters</em>' containment reference.
	 * @see #setSslContextParameters(SslContextParametersFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SslContextParameters()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sslContextParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	SslContextParametersFactoryBean getSslContextParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSslContextParameters <em>Ssl Context Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssl Context Parameters</em>' containment reference.
	 * @see #getSslContextParameters()
	 * @generated
	 */
	void setSslContextParameters(SslContextParametersFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Static Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Service Discovery</em>' containment reference.
	 * @see #setStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_StaticServiceDiscovery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='staticServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticServiceCallServiceDiscoveryConfiguration getStaticServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStaticServiceDiscovery <em>Static Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Service Discovery</em>' containment reference.
	 * @see #getStaticServiceDiscovery()
	 * @generated
	 */
	void setStaticServiceDiscovery(StaticServiceCallServiceDiscoveryConfiguration value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Routes the message to a sequence of processors which is grouped together as one logical name
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(StepDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Step()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	StepDefinition getStep();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(StepDefinition value);

	/**
	 * Returns the value of the '<em><b>Sticky Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sticky load balancing using an expression to calculate a correlation key to perform the sticky load balancing.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sticky Load Balancer</em>' containment reference.
	 * @see #setStickyLoadBalancer(StickyLoadBalancerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_StickyLoadBalancer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stickyLoadBalancer' namespace='##targetNamespace'"
	 * @generated
	 */
	StickyLoadBalancerDefinition getStickyLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStickyLoadBalancer <em>Sticky Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sticky Load Balancer</em>' containment reference.
	 * @see #getStickyLoadBalancer()
	 * @generated
	 */
	void setStickyLoadBalancer(StickyLoadBalancerDefinition value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Stops the processing of the current message
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference.
	 * @see #setStop(StopDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Stop()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace'"
	 * @generated
	 */
	StopDefinition getStop();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStop <em>Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' containment reference.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(StopDefinition value);

	/**
	 * Returns the value of the '<em><b>Stream Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Stream caching configuration.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stream Caching</em>' containment reference.
	 * @see #setStreamCaching(CamelStreamCachingStrategyDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_StreamCaching()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='streamCaching' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelStreamCachingStrategyDefinition getStreamCaching();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStreamCaching <em>Stream Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Caching</em>' containment reference.
	 * @see #getStreamCaching()
	 * @generated
	 */
	void setStreamCaching(CamelStreamCachingStrategyDefinition value);

	/**
	 * Returns the value of the '<em><b>Stream Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures stream-processing resequence eip.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stream Config</em>' containment reference.
	 * @see #setStreamConfig(StreamResequencerConfig)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_StreamConfig()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='streamConfig' namespace='##targetNamespace'"
	 * @generated
	 */
	StreamResequencerConfig getStreamConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getStreamConfig <em>Stream Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Config</em>' containment reference.
	 * @see #getStreamConfig()
	 * @generated
	 */
	void setStreamConfig(StreamResequencerConfig value);

	/**
	 * Returns the value of the '<em><b>Swift Mt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encode and decode SWIFT MT messages.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swift Mt</em>' containment reference.
	 * @see #setSwiftMt(SwiftMtDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SwiftMt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='swiftMt' namespace='##targetNamespace'"
	 * @generated
	 */
	SwiftMtDataFormat getSwiftMt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSwiftMt <em>Swift Mt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swift Mt</em>' containment reference.
	 * @see #getSwiftMt()
	 * @generated
	 */
	void setSwiftMt(SwiftMtDataFormat value);

	/**
	 * Returns the value of the '<em><b>Swift Mx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encode and decode SWIFT MX messages.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swift Mx</em>' containment reference.
	 * @see #setSwiftMx(SwiftMxDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_SwiftMx()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='swiftMx' namespace='##targetNamespace'"
	 * @generated
	 */
	SwiftMxDataFormat getSwiftMx();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSwiftMx <em>Swift Mx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swift Mx</em>' containment reference.
	 * @see #getSwiftMx()
	 * @generated
	 */
	void setSwiftMx(SwiftMxDataFormat value);

	/**
	 * Returns the value of the '<em><b>Syslog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshall SyslogMessages to RFC3164 and RFC5424 messages and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Syslog</em>' containment reference.
	 * @see #setSyslog(SyslogDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Syslog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='syslog' namespace='##targetNamespace'"
	 * @generated
	 */
	SyslogDataFormat getSyslog();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getSyslog <em>Syslog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syslog</em>' containment reference.
	 * @see #getSyslog()
	 * @generated
	 */
	void setSyslog(SyslogDataFormat value);

	/**
	 * Returns the value of the '<em><b>Tar File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Archive files into tarballs or extract files from tarballs.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tar File</em>' containment reference.
	 * @see #setTarFile(TarFileDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_TarFile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tarFile' namespace='##targetNamespace'"
	 * @generated
	 */
	TarFileDataFormat getTarFile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTarFile <em>Tar File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tar File</em>' containment reference.
	 * @see #getTarFile()
	 * @generated
	 */
	void setTarFile(TarFileDataFormat value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configures a ProducerTemplate
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(CamelProducerTemplateFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Template()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelProducerTemplateFactoryBean getTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(CamelProducerTemplateFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Templated Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Defines a templated route (a route built from a route template)
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Templated Route</em>' containment reference.
	 * @see #setTemplatedRoute(TemplatedRouteDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_TemplatedRoute()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='templatedRoute' namespace='##targetNamespace'"
	 * @generated
	 */
	TemplatedRouteDefinition getTemplatedRoute();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTemplatedRoute <em>Templated Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Templated Route</em>' containment reference.
	 * @see #getTemplatedRoute()
	 * @generated
	 */
	void setTemplatedRoute(TemplatedRouteDefinition value);

	/**
	 * Returns the value of the '<em><b>Templated Route Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * An input parameter of a route template.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Templated Route Parameter</em>' containment reference.
	 * @see #setTemplatedRouteParameter(TemplatedRouteParameterDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_TemplatedRouteParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='templatedRouteParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	TemplatedRouteParameterDefinition getTemplatedRouteParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTemplatedRouteParameter <em>Templated Route Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Templated Route Parameter</em>' containment reference.
	 * @see #getTemplatedRouteParameter()
	 * @generated
	 */
	void setTemplatedRouteParameter(TemplatedRouteParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Templated Routes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A series of templated routes
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Templated Routes</em>' containment reference.
	 * @see #setTemplatedRoutes(TemplatedRoutesDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_TemplatedRoutes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='templatedRoutes' namespace='##targetNamespace'"
	 * @generated
	 */
	TemplatedRoutesDefinition getTemplatedRoutes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTemplatedRoutes <em>Templated Routes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Templated Routes</em>' containment reference.
	 * @see #getTemplatedRoutes()
	 * @generated
	 */
	void setTemplatedRoutes(TemplatedRoutesDefinition value);

	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A route template parameter
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Parameter</em>' containment reference.
	 * @see #setTemplateParameter(RouteTemplateParameterDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_TemplateParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='templateParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	RouteTemplateParameterDefinition getTemplateParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTemplateParameter <em>Template Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter</em>' containment reference.
	 * @see #getTemplateParameter()
	 * @generated
	 */
	void setTemplateParameter(RouteTemplateParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Thread Pool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Configuration of thread pools
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Pool</em>' containment reference.
	 * @see #setThreadPool(CamelThreadPoolFactoryBean)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ThreadPool()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='threadPool' namespace='##targetNamespace'"
	 * @generated
	 */
	CamelThreadPoolFactoryBean getThreadPool();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThreadPool <em>Thread Pool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Pool</em>' containment reference.
	 * @see #getThreadPool()
	 * @generated
	 */
	void setThreadPool(CamelThreadPoolFactoryBean value);

	/**
	 * Returns the value of the '<em><b>Thread Pool Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure thread pools
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Pool Profile</em>' containment reference.
	 * @see #setThreadPoolProfile(ThreadPoolProfileDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ThreadPoolProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='threadPoolProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadPoolProfileDefinition getThreadPoolProfile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThreadPoolProfile <em>Thread Pool Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Pool Profile</em>' containment reference.
	 * @see #getThreadPoolProfile()
	 * @generated
	 */
	void setThreadPoolProfile(ThreadPoolProfileDefinition value);

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Specifies that all steps after this node are processed asynchronously
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference.
	 * @see #setThreads(ThreadsDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Threads()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='threads' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadsDefinition getThreads();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThreads <em>Threads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threads</em>' containment reference.
	 * @see #getThreads()
	 * @generated
	 */
	void setThreads(ThreadsDefinition value);

	/**
	 * Returns the value of the '<em><b>Thrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Serialize and deserialize messages using Apache Thrift binary data format.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrift</em>' containment reference.
	 * @see #setThrift(ThriftDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Thrift()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='thrift' namespace='##targetNamespace'"
	 * @generated
	 */
	ThriftDataFormat getThrift();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThrift <em>Thrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrift</em>' containment reference.
	 * @see #getThrift()
	 * @generated
	 */
	void setThrift(ThriftDataFormat value);

	/**
	 * Returns the value of the '<em><b>Throttle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Controls the rate at which messages are passed to the next node in the route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throttle</em>' containment reference.
	 * @see #setThrottle(ThrottleDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Throttle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throttle' namespace='##targetNamespace'"
	 * @generated
	 */
	ThrottleDefinition getThrottle();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThrottle <em>Throttle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttle</em>' containment reference.
	 * @see #getThrottle()
	 * @generated
	 */
	void setThrottle(ThrottleDefinition value);

	/**
	 * Returns the value of the '<em><b>Throw Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Throws an exception
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throw Exception</em>' containment reference.
	 * @see #setThrowException(ThrowExceptionDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ThrowException()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throwException' namespace='##targetNamespace'"
	 * @generated
	 */
	ThrowExceptionDefinition getThrowException();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getThrowException <em>Throw Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throw Exception</em>' containment reference.
	 * @see #getThrowException()
	 * @generated
	 */
	void setThrowException(ThrowExceptionDefinition value);

	/**
	 * Returns the value of the '<em><b>Tidy Markup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Parse (potentially invalid) HTML into valid HTML or DOM.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tidy Markup</em>' containment reference.
	 * @see #setTidyMarkup(TidyMarkupDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_TidyMarkup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tidyMarkup' namespace='##targetNamespace'"
	 * @generated
	 */
	TidyMarkupDataFormat getTidyMarkup();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTidyMarkup <em>Tidy Markup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tidy Markup</em>' containment reference.
	 * @see #getTidyMarkup()
	 * @generated
	 */
	void setTidyMarkup(TidyMarkupDataFormat value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sends the message to a static endpoint
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(ToDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_To()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
	 * @generated
	 */
	ToDefinition getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ToDefinition value);

	/**
	 * Returns the value of the '<em><b>To D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Sends the message to a dynamic endpoint
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To D</em>' containment reference.
	 * @see #setToD(ToDynamicDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ToD()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='toD' namespace='##targetNamespace'"
	 * @generated
	 */
	ToDynamicDefinition getToD();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getToD <em>To D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To D</em>' containment reference.
	 * @see #getToD()
	 * @generated
	 */
	void setToD(ToDynamicDefinition value);

	/**
	 * Returns the value of the '<em><b>Tokenize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Tokenize text payloads using delimiter patterns.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tokenize</em>' containment reference.
	 * @see #setTokenize(TokenizerExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Tokenize()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenizerExpression getTokenize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTokenize <em>Tokenize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokenize</em>' containment reference.
	 * @see #getTokenize()
	 * @generated
	 */
	void setTokenize(TokenizerExpression value);

	/**
	 * Returns the value of the '<em><b>Tokenizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Represents a Camel tokenizer for AI.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tokenizer</em>' containment reference.
	 * @see #setTokenizer(TokenizerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Tokenizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tokenizer' namespace='##targetNamespace'"
	 * @generated
	 */
	TokenizerDefinition getTokenizer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTokenizer <em>Tokenizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokenizer</em>' containment reference.
	 * @see #getTokenizer()
	 * @generated
	 */
	void setTokenizer(TokenizerDefinition value);

	/**
	 * Returns the value of the '<em><b>Topic Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Topic which sends to all destinations.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic Load Balancer</em>' containment reference.
	 * @see #setTopicLoadBalancer(TopicLoadBalancerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_TopicLoadBalancer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='topicLoadBalancer' namespace='##targetNamespace'"
	 * @generated
	 */
	TopicLoadBalancerDefinition getTopicLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTopicLoadBalancer <em>Topic Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Load Balancer</em>' containment reference.
	 * @see #getTopicLoadBalancer()
	 * @generated
	 */
	void setTopicLoadBalancer(TopicLoadBalancerDefinition value);

	/**
	 * Returns the value of the '<em><b>Transacted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Enables transaction on the route
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transacted</em>' containment reference.
	 * @see #setTransacted(TransactedDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Transacted()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactedDefinition getTransacted();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTransacted <em>Transacted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transacted</em>' containment reference.
	 * @see #getTransacted()
	 * @generated
	 */
	void setTransacted(TransactedDefinition value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Transforms the message body based on an expression
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(TransformDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Transform()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformDefinition getTransform();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(TransformDefinition value);

	/**
	 * Returns the value of the '<em><b>Transformers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure transformers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformers</em>' containment reference.
	 * @see #setTransformers(TransformersDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Transformers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformers' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformersDefinition getTransformers();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTransformers <em>Transformers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformers</em>' containment reference.
	 * @see #getTransformers()
	 * @generated
	 */
	void setTransformers(TransformersDefinition value);

	/**
	 * Returns the value of the '<em><b>Type Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Filter</em>' containment reference.
	 * @see #setTypeFilter(YamlTypeFilterDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_TypeFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='typeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	YamlTypeFilterDefinition getTypeFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getTypeFilter <em>Type Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Filter</em>' containment reference.
	 * @see #getTypeFilter()
	 * @generated
	 */
	void setTypeFilter(YamlTypeFilterDefinition value);

	/**
	 * Returns the value of the '<em><b>Univocity Csv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java objects from and to CSV (Comma Separated Values) using UniVocity Parsers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Univocity Csv</em>' containment reference.
	 * @see #setUnivocityCsv(UniVocityCsvDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_UnivocityCsv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='univocityCsv' namespace='##targetNamespace'"
	 * @generated
	 */
	UniVocityCsvDataFormat getUnivocityCsv();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getUnivocityCsv <em>Univocity Csv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Univocity Csv</em>' containment reference.
	 * @see #getUnivocityCsv()
	 * @generated
	 */
	void setUnivocityCsv(UniVocityCsvDataFormat value);

	/**
	 * Returns the value of the '<em><b>Univocity Fixed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java objects from and to fixed length records using UniVocity Parsers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Univocity Fixed</em>' containment reference.
	 * @see #setUnivocityFixed(UniVocityFixedDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_UnivocityFixed()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='univocityFixed' namespace='##targetNamespace'"
	 * @generated
	 */
	UniVocityFixedDataFormat getUnivocityFixed();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getUnivocityFixed <em>Univocity Fixed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Univocity Fixed</em>' containment reference.
	 * @see #getUnivocityFixed()
	 * @generated
	 */
	void setUnivocityFixed(UniVocityFixedDataFormat value);

	/**
	 * Returns the value of the '<em><b>Univocity Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure headers for UniVocity data formats.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Univocity Header</em>' containment reference.
	 * @see #setUnivocityHeader(UniVocityHeader)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_UnivocityHeader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='univocityHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	UniVocityHeader getUnivocityHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getUnivocityHeader <em>Univocity Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Univocity Header</em>' containment reference.
	 * @see #getUnivocityHeader()
	 * @generated
	 */
	void setUnivocityHeader(UniVocityHeader value);

	/**
	 * Returns the value of the '<em><b>Univocity Tsv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java objects from and to TSV (Tab-Separated Values) records using UniVocity Parsers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Univocity Tsv</em>' containment reference.
	 * @see #setUnivocityTsv(UniVocityTsvDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_UnivocityTsv()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='univocityTsv' namespace='##targetNamespace'"
	 * @generated
	 */
	UniVocityTsvDataFormat getUnivocityTsv();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getUnivocityTsv <em>Univocity Tsv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Univocity Tsv</em>' containment reference.
	 * @see #getUnivocityTsv()
	 * @generated
	 */
	void setUnivocityTsv(UniVocityTsvDataFormat value);

	/**
	 * Returns the value of the '<em><b>Unmarshal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Converts the message data received from the wire into a format that Apache Camel processors can consume
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unmarshal</em>' containment reference.
	 * @see #setUnmarshal(UnmarshalDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Unmarshal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unmarshal' namespace='##targetNamespace'"
	 * @generated
	 */
	UnmarshalDefinition getUnmarshal();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getUnmarshal <em>Unmarshal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmarshal</em>' containment reference.
	 * @see #getUnmarshal()
	 * @generated
	 */
	void setUnmarshal(UnmarshalDefinition value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Validates a message based on an expression
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validate</em>' containment reference.
	 * @see #setValidate(ValidateDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Validate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidateDefinition getValidate();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getValidate <em>Validate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' containment reference.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(ValidateDefinition value);

	/**
	 * Returns the value of the '<em><b>Validators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To configure validators.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validators</em>' containment reference.
	 * @see #setValidators(ValidatorsDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Validators()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validators' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidatorsDefinition getValidators();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getValidators <em>Validators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validators</em>' containment reference.
	 * @see #getValidators()
	 * @generated
	 */
	void setValidators(ValidatorsDefinition value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * A single value
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Value()
	 * @model unique="false" dataType="org.eclipse.fennec.camel.camelspring.ValueDefinition" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Gets a variable
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(VariableExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Variable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableExpression getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableExpression value);

	/**
	 * Returns the value of the '<em><b>Wasm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Call a wasm (web assembly) function.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wasm</em>' containment reference.
	 * @see #setWasm(WasmExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Wasm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wasm' namespace='##targetNamespace'"
	 * @generated
	 */
	WasmExpression getWasm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getWasm <em>Wasm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wasm</em>' containment reference.
	 * @see #getWasm()
	 * @generated
	 */
	void setWasm(WasmExpression value);

	/**
	 * Returns the value of the '<em><b>Weighted Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Uses a weighted load distribution ratio for each server with respect to others.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weighted Load Balancer</em>' containment reference.
	 * @see #setWeightedLoadBalancer(WeightedLoadBalancerDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_WeightedLoadBalancer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='weightedLoadBalancer' namespace='##targetNamespace'"
	 * @generated
	 */
	WeightedLoadBalancerDefinition getWeightedLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getWeightedLoadBalancer <em>Weighted Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weighted Load Balancer</em>' containment reference.
	 * @see #getWeightedLoadBalancer()
	 * @generated
	 */
	void setWeightedLoadBalancer(WeightedLoadBalancerDefinition value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Triggers a route when the expression evaluates to true
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(WhenDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_When()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	WhenDefinition getWhen();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(WhenDefinition value);

	/**
	 * Returns the value of the '<em><b>Wire Tap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Routes a copy of a message (or creates a new message) to a secondary destination while continue routing the original
	 * message.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wire Tap</em>' containment reference.
	 * @see #setWireTap(WireTapDefinition)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_WireTap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wireTap' namespace='##targetNamespace'"
	 * @generated
	 */
	WireTapDefinition getWireTap();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getWireTap <em>Wire Tap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wire Tap</em>' containment reference.
	 * @see #getWireTap()
	 * @generated
	 */
	void setWireTap(WireTapDefinition value);

	/**
	 * Returns the value of the '<em><b>Xml Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encrypt and decrypt XML payloads using Apache Santuario.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml Security</em>' containment reference.
	 * @see #setXmlSecurity(XmlSecurityDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_XmlSecurity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xmlSecurity' namespace='##targetNamespace'"
	 * @generated
	 */
	XmlSecurityDataFormat getXmlSecurity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getXmlSecurity <em>Xml Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Security</em>' containment reference.
	 * @see #getXmlSecurity()
	 * @generated
	 */
	void setXmlSecurity(XmlSecurityDataFormat value);

	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates an XPath expression against an XML payload.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xpath</em>' containment reference.
	 * @see #setXpath(XPathExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Xpath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xpath' namespace='##targetNamespace'"
	 * @generated
	 */
	XPathExpression getXpath();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getXpath <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' containment reference.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(XPathExpression value);

	/**
	 * Returns the value of the '<em><b>Xquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Evaluates an XQuery expressions against an XML payload.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xquery</em>' containment reference.
	 * @see #setXquery(XQueryExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Xquery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xquery' namespace='##targetNamespace'"
	 * @generated
	 */
	XQueryExpression getXquery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getXquery <em>Xquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xquery</em>' containment reference.
	 * @see #getXquery()
	 * @generated
	 */
	void setXquery(XQueryExpression value);

	/**
	 * Returns the value of the '<em><b>Xtokenize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Tokenize XML payloads.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xtokenize</em>' containment reference.
	 * @see #setXtokenize(XmlTokenizerExpression)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Xtokenize()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xtokenize' namespace='##targetNamespace'"
	 * @generated
	 */
	XmlTokenizerExpression getXtokenize();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getXtokenize <em>Xtokenize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xtokenize</em>' containment reference.
	 * @see #getXtokenize()
	 * @generated
	 */
	void setXtokenize(XmlTokenizerExpression value);

	/**
	 * Returns the value of the '<em><b>Yaml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java objects to and from YAML.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yaml</em>' containment reference.
	 * @see #setYaml(YamlDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_Yaml()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='yaml' namespace='##targetNamespace'"
	 * @generated
	 */
	YamlDataFormat getYaml();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getYaml <em>Yaml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yaml</em>' containment reference.
	 * @see #getYaml()
	 * @generated
	 */
	void setYaml(YamlDataFormat value);

	/**
	 * Returns the value of the '<em><b>Zip Deflater</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Compress and decompress streams using java.util.zip.Deflater and java.util.zip.Inflater.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zip Deflater</em>' containment reference.
	 * @see #setZipDeflater(ZipDeflaterDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ZipDeflater()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='zipDeflater' namespace='##targetNamespace'"
	 * @generated
	 */
	ZipDeflaterDataFormat getZipDeflater();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getZipDeflater <em>Zip Deflater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Deflater</em>' containment reference.
	 * @see #getZipDeflater()
	 * @generated
	 */
	void setZipDeflater(ZipDeflaterDataFormat value);

	/**
	 * Returns the value of the '<em><b>Zip File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Compression and decompress streams using java.util.zip.ZipStream.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zip File</em>' containment reference.
	 * @see #setZipFile(ZipFileDataFormat)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ZipFile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='zipFile' namespace='##targetNamespace'"
	 * @generated
	 */
	ZipFileDataFormat getZipFile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getZipFile <em>Zip File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip File</em>' containment reference.
	 * @see #getZipFile()
	 * @generated
	 */
	void setZipFile(ZipFileDataFormat value);

	/**
	 * Returns the value of the '<em><b>Zookeeper Service Discovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Deprecated: null
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zookeeper Service Discovery</em>' containment reference.
	 * @see #setZookeeperServiceDiscovery(ZooKeeperServiceCallServiceDiscoveryConfiguration)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDocumentRoot_ZookeeperServiceDiscovery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='zookeeperServiceDiscovery' namespace='##targetNamespace'"
	 * @generated
	 */
	ZooKeeperServiceCallServiceDiscoveryConfiguration getZookeeperServiceDiscovery();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.DocumentRoot#getZookeeperServiceDiscovery <em>Zookeeper Service Discovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zookeeper Service Discovery</em>' containment reference.
	 * @see #getZookeeperServiceDiscovery()
	 * @generated
	 */
	void setZookeeperServiceDiscovery(ZooKeeperServiceCallServiceDiscoveryConfiguration value);

} // DocumentRoot

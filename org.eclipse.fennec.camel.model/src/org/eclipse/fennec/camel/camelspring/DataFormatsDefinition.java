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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Formats Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getAsn1 <em>Asn1</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getAvro <em>Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getBarcode <em>Barcode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getBase64 <em>Base64</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getBeanio <em>Beanio</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getCbor <em>Cbor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getFhirJson <em>Fhir Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getFhirXml <em>Fhir Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getFory <em>Fory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getGrok <em>Grok</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getGzipDeflater <em>Gzip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getIcal <em>Ical</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getIso8583 <em>Iso8583</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getJacksonXml <em>Jackson Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getJson <em>Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getJsonApi <em>Json Api</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getLzf <em>Lzf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getMimeMultipart <em>Mime Multipart</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getParquetAvro <em>Parquet Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getPgp <em>Pgp</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getRss <em>Rss</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getSmooks <em>Smooks</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getSoap <em>Soap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getSwiftMt <em>Swift Mt</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getSwiftMx <em>Swift Mx</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getTarFile <em>Tar File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getThrift <em>Thrift</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getUnivocityCsv <em>Univocity Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getUnivocityFixed <em>Univocity Fixed</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getUnivocityTsv <em>Univocity Tsv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getXmlSecurity <em>Xml Security</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getYaml <em>Yaml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getZipDeflater <em>Zip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.DataFormatsDefinition#getZipFile <em>Zip File</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition()
 * @model extendedMetaData="name='dataFormatsDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataFormatsDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Asn1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.Asn1DataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encode and decode data structures using Abstract Syntax Notation One (ASN.1).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asn1</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Asn1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='asn1' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Asn1DataFormat> getAsn1();

	/**
	 * Returns the value of the '<em><b>Avro</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.AvroDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Serialize and deserialize messages using Apache Avro binary data format.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Avro</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Avro()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='avro' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AvroDataFormat> getAvro();

	/**
	 * Returns the value of the '<em><b>Barcode</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.BarcodeDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Transform strings to various 1D/2D barcode bitmap formats and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Barcode</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Barcode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='barcode' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BarcodeDataFormat> getBarcode();

	/**
	 * Returns the value of the '<em><b>Base64</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.Base64DataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encode and decode data using Base64.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base64</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Base64()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='base64' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Base64DataFormat> getBase64();

	/**
	 * Returns the value of the '<em><b>Beanio</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.BeanioDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java beans to and from flat files (such as CSV, delimited, or fixed length formats).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beanio</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Beanio()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='beanio' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BeanioDataFormat> getBeanio();

	/**
	 * Returns the value of the '<em><b>Bindy</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.BindyDataFormat}.
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
	 * @return the value of the '<em>Bindy</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Bindy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bindy' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BindyDataFormat> getBindy();

	/**
	 * Returns the value of the '<em><b>Cbor</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CborDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Unmarshal a CBOR payload to POJO and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cbor</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Cbor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cbor' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CborDataFormat> getCbor();

	/**
	 * Returns the value of the '<em><b>Crypto</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CryptoDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encrypt and decrypt messages using Java Cryptography Extension (JCE).
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crypto</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Crypto()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='crypto' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CryptoDataFormat> getCrypto();

	/**
	 * Returns the value of the '<em><b>Csv</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CsvDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Handle CSV (Comma Separated Values) payloads.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Csv</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Csv()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='csv' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CsvDataFormat> getCsv();

	/**
	 * Returns the value of the '<em><b>Custom</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.CustomDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Delegate to a custom org.apache.camel.spi.DataFormat implementation via Camel registry.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Custom()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CustomDataFormat> getCustom();

	/**
	 * Returns the value of the '<em><b>Fhir Json</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.FhirJsonDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshall and unmarshall FHIR objects to/from JSON.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Json</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_FhirJson()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fhirJson' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FhirJsonDataFormat> getFhirJson();

	/**
	 * Returns the value of the '<em><b>Fhir Xml</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.FhirXmlDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshall and unmarshall FHIR objects to/from XML.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Xml</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_FhirXml()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fhirXml' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FhirXmlDataFormat> getFhirXml();

	/**
	 * Returns the value of the '<em><b>Flatpack</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.FlatpackDataFormat}.
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
	 * @return the value of the '<em>Flatpack</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Flatpack()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='flatpack' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FlatpackDataFormat> getFlatpack();

	/**
	 * Returns the value of the '<em><b>Fory</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ForyDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Serialize and deserialize messages using Apache Fory
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fory</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Fory()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fory' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ForyDataFormat> getFory();

	/**
	 * Returns the value of the '<em><b>Grok</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.GrokDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Unmarshal unstructured data to objects using Logstash based Grok patterns.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grok</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Grok()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='grok' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GrokDataFormat> getGrok();

	/**
	 * Returns the value of the '<em><b>Gzip Deflater</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.GzipDeflaterDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Compress and decompress messages using java.util.zip.GZIPStream.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gzip Deflater</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_GzipDeflater()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gzipDeflater' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GzipDeflaterDataFormat> getGzipDeflater();

	/**
	 * Returns the value of the '<em><b>Hl7</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.Hl7DataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal HL7 (Health Care) model objects using the HL7 MLLP codec.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hl7</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Hl7()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hl7' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Hl7DataFormat> getHl7();

	/**
	 * Returns the value of the '<em><b>Ical</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.IcalDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal iCal (.ics) documents to/from model objects.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ical</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Ical()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ical' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IcalDataFormat> getIcal();

	/**
	 * Returns the value of the '<em><b>Iso8583</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.Iso8583DataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Create, edit and read ISO-8583 messages.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iso8583</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Iso8583()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='iso8583' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Iso8583DataFormat> getIso8583();

	/**
	 * Returns the value of the '<em><b>Jackson Xml</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Unmarshal an XML payloads to POJOs and back using XMLMapper extension of Jackson.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jackson Xml</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_JacksonXml()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jacksonXml' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JacksonXMLDataFormat> getJacksonXml();

	/**
	 * Returns the value of the '<em><b>Jaxb</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.JaxbDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Unmarshal XML payloads to POJOs and back using JAXB2 XML marshalling standard.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jaxb</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Jaxb()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jaxb' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JaxbDataFormat> getJaxb();

	/**
	 * Returns the value of the '<em><b>Json</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.JsonDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal POJOs to JSON and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Json</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Json()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='json' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JsonDataFormat> getJson();

	/**
	 * Returns the value of the '<em><b>Json Api</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.JsonApiDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal JSON:API resources using JSONAPI-Converter library.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Json Api</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_JsonApi()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jsonApi' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JsonApiDataFormat> getJsonApi();

	/**
	 * Returns the value of the '<em><b>Lzf</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.LzfDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Compress and decompress streams using LZF deflate algorithm.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lzf</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Lzf()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lzf' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LzfDataFormat> getLzf();

	/**
	 * Returns the value of the '<em><b>Mime Multipart</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal Camel messages with attachments into MIME-Multipart messages and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Multipart</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_MimeMultipart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mimeMultipart' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MimeMultipartDataFormat> getMimeMultipart();

	/**
	 * Returns the value of the '<em><b>Parquet Avro</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Parquet Avro serialization and de-serialization.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parquet Avro</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_ParquetAvro()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parquetAvro' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ParquetAvroDataFormat> getParquetAvro();

	/**
	 * Returns the value of the '<em><b>Pgp</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.PgpDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encrypt and decrypt messages using Java Cryptographic Extension (JCE) and PGP.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pgp</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Pgp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pgp' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PgpDataFormat> getPgp();

	/**
	 * Returns the value of the '<em><b>Protobuf</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ProtobufDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Serialize and deserialize Java objects using Google's Protocol buffers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protobuf</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Protobuf()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='protobuf' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ProtobufDataFormat> getProtobuf();

	/**
	 * Returns the value of the '<em><b>Rss</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.RssDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Transform from ROME SyndFeed Java Objects to XML and vice-versa.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rss</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Rss()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rss' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RssDataFormat> getRss();

	/**
	 * Returns the value of the '<em><b>Smooks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SmooksDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Transform and bind XML as well as non-XML data, including EDI, CSV, JSON, and YAML using Smooks.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Smooks</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Smooks()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='smooks' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SmooksDataFormat> getSmooks();

	/**
	 * Returns the value of the '<em><b>Soap</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SoapDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal Java objects to SOAP messages and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soap</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Soap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='soap' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SoapDataFormat> getSoap();

	/**
	 * Returns the value of the '<em><b>Swift Mt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SwiftMtDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encode and decode SWIFT MT messages.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swift Mt</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_SwiftMt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='swiftMt' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SwiftMtDataFormat> getSwiftMt();

	/**
	 * Returns the value of the '<em><b>Swift Mx</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encode and decode SWIFT MX messages.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swift Mx</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_SwiftMx()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='swiftMx' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SwiftMxDataFormat> getSwiftMx();

	/**
	 * Returns the value of the '<em><b>Syslog</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.SyslogDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshall SyslogMessages to RFC3164 and RFC5424 messages and back.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Syslog</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Syslog()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='syslog' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SyslogDataFormat> getSyslog();

	/**
	 * Returns the value of the '<em><b>Tar File</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.TarFileDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Archive files into tarballs or extract files from tarballs.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tar File</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_TarFile()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tarFile' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TarFileDataFormat> getTarFile();

	/**
	 * Returns the value of the '<em><b>Thrift</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ThriftDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Serialize and deserialize messages using Apache Thrift binary data format.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrift</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Thrift()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='thrift' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ThriftDataFormat> getThrift();

	/**
	 * Returns the value of the '<em><b>Tidy Markup</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.TidyMarkupDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Parse (potentially invalid) HTML into valid HTML or DOM.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tidy Markup</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_TidyMarkup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tidyMarkup' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TidyMarkupDataFormat> getTidyMarkup();

	/**
	 * Returns the value of the '<em><b>Univocity Csv</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java objects from and to CSV (Comma Separated Values) using UniVocity Parsers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Univocity Csv</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_UnivocityCsv()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='univocityCsv' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UniVocityCsvDataFormat> getUnivocityCsv();

	/**
	 * Returns the value of the '<em><b>Univocity Fixed</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java objects from and to fixed length records using UniVocity Parsers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Univocity Fixed</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_UnivocityFixed()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='univocityFixed' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UniVocityFixedDataFormat> getUnivocityFixed();

	/**
	 * Returns the value of the '<em><b>Univocity Tsv</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.UniVocityTsvDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java objects from and to TSV (Tab-Separated Values) records using UniVocity Parsers.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Univocity Tsv</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_UnivocityTsv()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='univocityTsv' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UniVocityTsvDataFormat> getUnivocityTsv();

	/**
	 * Returns the value of the '<em><b>Xml Security</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Encrypt and decrypt XML payloads using Apache Santuario.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml Security</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_XmlSecurity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xmlSecurity' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XmlSecurityDataFormat> getXmlSecurity();

	/**
	 * Returns the value of the '<em><b>Yaml</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.YamlDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Marshal and unmarshal Java objects to and from YAML.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yaml</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_Yaml()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='yaml' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<YamlDataFormat> getYaml();

	/**
	 * Returns the value of the '<em><b>Zip Deflater</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ZipDeflaterDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Compress and decompress streams using java.util.zip.Deflater and java.util.zip.Inflater.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zip Deflater</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_ZipDeflater()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='zipDeflater' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ZipDeflaterDataFormat> getZipDeflater();

	/**
	 * Returns the value of the '<em><b>Zip File</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.camel.camelspring.ZipFileDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Compression and decompress streams using java.util.zip.ZipStream.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zip File</em>' containment reference list.
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getDataFormatsDefinition_ZipFile()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='zipFile' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ZipFileDataFormat> getZipFile();

} // DataFormatsDefinition

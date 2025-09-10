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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.camel.camelspring.Asn1DataFormat;
import org.eclipse.fennec.camel.camelspring.AvroDataFormat;
import org.eclipse.fennec.camel.camelspring.BarcodeDataFormat;
import org.eclipse.fennec.camel.camelspring.Base64DataFormat;
import org.eclipse.fennec.camel.camelspring.BeanioDataFormat;
import org.eclipse.fennec.camel.camelspring.BindyDataFormat;
import org.eclipse.fennec.camel.camelspring.CamelSpringPackage;
import org.eclipse.fennec.camel.camelspring.CborDataFormat;
import org.eclipse.fennec.camel.camelspring.CryptoDataFormat;
import org.eclipse.fennec.camel.camelspring.CsvDataFormat;
import org.eclipse.fennec.camel.camelspring.CustomDataFormat;
import org.eclipse.fennec.camel.camelspring.DfdlDataFormat;
import org.eclipse.fennec.camel.camelspring.FhirJsonDataFormat;
import org.eclipse.fennec.camel.camelspring.FhirXmlDataFormat;
import org.eclipse.fennec.camel.camelspring.FlatpackDataFormat;
import org.eclipse.fennec.camel.camelspring.ForyDataFormat;
import org.eclipse.fennec.camel.camelspring.GrokDataFormat;
import org.eclipse.fennec.camel.camelspring.GzipDeflaterDataFormat;
import org.eclipse.fennec.camel.camelspring.Hl7DataFormat;
import org.eclipse.fennec.camel.camelspring.IcalDataFormat;
import org.eclipse.fennec.camel.camelspring.Iso8583DataFormat;
import org.eclipse.fennec.camel.camelspring.JacksonXMLDataFormat;
import org.eclipse.fennec.camel.camelspring.JaxbDataFormat;
import org.eclipse.fennec.camel.camelspring.JsonApiDataFormat;
import org.eclipse.fennec.camel.camelspring.JsonDataFormat;
import org.eclipse.fennec.camel.camelspring.LzfDataFormat;
import org.eclipse.fennec.camel.camelspring.MimeMultipartDataFormat;
import org.eclipse.fennec.camel.camelspring.ParquetAvroDataFormat;
import org.eclipse.fennec.camel.camelspring.PgpDataFormat;
import org.eclipse.fennec.camel.camelspring.ProtobufDataFormat;
import org.eclipse.fennec.camel.camelspring.RssDataFormat;
import org.eclipse.fennec.camel.camelspring.SmooksDataFormat;
import org.eclipse.fennec.camel.camelspring.SoapDataFormat;
import org.eclipse.fennec.camel.camelspring.SwiftMtDataFormat;
import org.eclipse.fennec.camel.camelspring.SwiftMxDataFormat;
import org.eclipse.fennec.camel.camelspring.SyslogDataFormat;
import org.eclipse.fennec.camel.camelspring.TarFileDataFormat;
import org.eclipse.fennec.camel.camelspring.ThriftDataFormat;
import org.eclipse.fennec.camel.camelspring.TidyMarkupDataFormat;
import org.eclipse.fennec.camel.camelspring.UniVocityCsvDataFormat;
import org.eclipse.fennec.camel.camelspring.UniVocityFixedDataFormat;
import org.eclipse.fennec.camel.camelspring.UniVocityTsvDataFormat;
import org.eclipse.fennec.camel.camelspring.UnmarshalDefinition;
import org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat;
import org.eclipse.fennec.camel.camelspring.YamlDataFormat;
import org.eclipse.fennec.camel.camelspring.ZipDeflaterDataFormat;
import org.eclipse.fennec.camel.camelspring.ZipFileDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unmarshal Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getAsn1 <em>Asn1</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getAvro <em>Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getBarcode <em>Barcode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getBase64 <em>Base64</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getBeanio <em>Beanio</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getCbor <em>Cbor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getDfdl <em>Dfdl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getFhirJson <em>Fhir Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getFhirXml <em>Fhir Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getFory <em>Fory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getGrok <em>Grok</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getGzipDeflater <em>Gzip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getIcal <em>Ical</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getIso8583 <em>Iso8583</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getJacksonXml <em>Jackson Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getJson <em>Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getJsonApi <em>Json Api</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getLzf <em>Lzf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getMimeMultipart <em>Mime Multipart</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getParquetAvro <em>Parquet Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getRss <em>Rss</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getSmooks <em>Smooks</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getSoap <em>Soap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getSwiftMt <em>Swift Mt</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getSwiftMx <em>Swift Mx</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getTarFile <em>Tar File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getThrift <em>Thrift</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getUnivocityCsv <em>Univocity Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getUnivocityFixed <em>Univocity Fixed</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getUnivocityTsv <em>Univocity Tsv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getXmlSecurity <em>Xml Security</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getPgp <em>Pgp</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getYaml <em>Yaml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getZipDeflater <em>Zip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getZipFile <em>Zip File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getAllowNullBody <em>Allow Null Body</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getVariableReceive <em>Variable Receive</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.UnmarshalDefinitionImpl#getVariableSend <em>Variable Send</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnmarshalDefinitionImpl extends NoOutputDefinitionImpl implements UnmarshalDefinition {
	/**
	 * The cached value of the '{@link #getAsn1() <em>Asn1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsn1()
	 * @generated
	 * @ordered
	 */
	protected Asn1DataFormat asn1;

	/**
	 * The cached value of the '{@link #getAvro() <em>Avro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvro()
	 * @generated
	 * @ordered
	 */
	protected AvroDataFormat avro;

	/**
	 * The cached value of the '{@link #getBarcode() <em>Barcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcode()
	 * @generated
	 * @ordered
	 */
	protected BarcodeDataFormat barcode;

	/**
	 * The cached value of the '{@link #getBase64() <em>Base64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase64()
	 * @generated
	 * @ordered
	 */
	protected Base64DataFormat base64;

	/**
	 * The cached value of the '{@link #getBeanio() <em>Beanio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanio()
	 * @generated
	 * @ordered
	 */
	protected BeanioDataFormat beanio;

	/**
	 * The cached value of the '{@link #getBindy() <em>Bindy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindy()
	 * @generated
	 * @ordered
	 */
	protected BindyDataFormat bindy;

	/**
	 * The cached value of the '{@link #getCbor() <em>Cbor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCbor()
	 * @generated
	 * @ordered
	 */
	protected CborDataFormat cbor;

	/**
	 * The cached value of the '{@link #getCrypto() <em>Crypto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrypto()
	 * @generated
	 * @ordered
	 */
	protected CryptoDataFormat crypto;

	/**
	 * The cached value of the '{@link #getCsv() <em>Csv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsv()
	 * @generated
	 * @ordered
	 */
	protected CsvDataFormat csv;

	/**
	 * The cached value of the '{@link #getCustom() <em>Custom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom()
	 * @generated
	 * @ordered
	 */
	protected CustomDataFormat custom;

	/**
	 * The cached value of the '{@link #getDfdl() <em>Dfdl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDfdl()
	 * @generated
	 * @ordered
	 */
	protected DfdlDataFormat dfdl;

	/**
	 * The cached value of the '{@link #getFhirJson() <em>Fhir Json</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirJson()
	 * @generated
	 * @ordered
	 */
	protected FhirJsonDataFormat fhirJson;

	/**
	 * The cached value of the '{@link #getFhirXml() <em>Fhir Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirXml()
	 * @generated
	 * @ordered
	 */
	protected FhirXmlDataFormat fhirXml;

	/**
	 * The cached value of the '{@link #getFlatpack() <em>Flatpack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatpack()
	 * @generated
	 * @ordered
	 */
	protected FlatpackDataFormat flatpack;

	/**
	 * The cached value of the '{@link #getFory() <em>Fory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFory()
	 * @generated
	 * @ordered
	 */
	protected ForyDataFormat fory;

	/**
	 * The cached value of the '{@link #getGrok() <em>Grok</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrok()
	 * @generated
	 * @ordered
	 */
	protected GrokDataFormat grok;

	/**
	 * The cached value of the '{@link #getGzipDeflater() <em>Gzip Deflater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGzipDeflater()
	 * @generated
	 * @ordered
	 */
	protected GzipDeflaterDataFormat gzipDeflater;

	/**
	 * The cached value of the '{@link #getHl7() <em>Hl7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHl7()
	 * @generated
	 * @ordered
	 */
	protected Hl7DataFormat hl7;

	/**
	 * The cached value of the '{@link #getIcal() <em>Ical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcal()
	 * @generated
	 * @ordered
	 */
	protected IcalDataFormat ical;

	/**
	 * The cached value of the '{@link #getIso8583() <em>Iso8583</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIso8583()
	 * @generated
	 * @ordered
	 */
	protected Iso8583DataFormat iso8583;

	/**
	 * The cached value of the '{@link #getJacksonXml() <em>Jackson Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacksonXml()
	 * @generated
	 * @ordered
	 */
	protected JacksonXMLDataFormat jacksonXml;

	/**
	 * The cached value of the '{@link #getJaxb() <em>Jaxb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJaxb()
	 * @generated
	 * @ordered
	 */
	protected JaxbDataFormat jaxb;

	/**
	 * The cached value of the '{@link #getJson() <em>Json</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJson()
	 * @generated
	 * @ordered
	 */
	protected JsonDataFormat json;

	/**
	 * The cached value of the '{@link #getJsonApi() <em>Json Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonApi()
	 * @generated
	 * @ordered
	 */
	protected JsonApiDataFormat jsonApi;

	/**
	 * The cached value of the '{@link #getLzf() <em>Lzf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLzf()
	 * @generated
	 * @ordered
	 */
	protected LzfDataFormat lzf;

	/**
	 * The cached value of the '{@link #getMimeMultipart() <em>Mime Multipart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeMultipart()
	 * @generated
	 * @ordered
	 */
	protected MimeMultipartDataFormat mimeMultipart;

	/**
	 * The cached value of the '{@link #getParquetAvro() <em>Parquet Avro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParquetAvro()
	 * @generated
	 * @ordered
	 */
	protected ParquetAvroDataFormat parquetAvro;

	/**
	 * The cached value of the '{@link #getProtobuf() <em>Protobuf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtobuf()
	 * @generated
	 * @ordered
	 */
	protected ProtobufDataFormat protobuf;

	/**
	 * The cached value of the '{@link #getRss() <em>Rss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRss()
	 * @generated
	 * @ordered
	 */
	protected RssDataFormat rss;

	/**
	 * The cached value of the '{@link #getSmooks() <em>Smooks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmooks()
	 * @generated
	 * @ordered
	 */
	protected SmooksDataFormat smooks;

	/**
	 * The cached value of the '{@link #getSoap() <em>Soap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoap()
	 * @generated
	 * @ordered
	 */
	protected SoapDataFormat soap;

	/**
	 * The cached value of the '{@link #getSwiftMt() <em>Swift Mt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwiftMt()
	 * @generated
	 * @ordered
	 */
	protected SwiftMtDataFormat swiftMt;

	/**
	 * The cached value of the '{@link #getSwiftMx() <em>Swift Mx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwiftMx()
	 * @generated
	 * @ordered
	 */
	protected SwiftMxDataFormat swiftMx;

	/**
	 * The cached value of the '{@link #getSyslog() <em>Syslog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyslog()
	 * @generated
	 * @ordered
	 */
	protected SyslogDataFormat syslog;

	/**
	 * The cached value of the '{@link #getTarFile() <em>Tar File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarFile()
	 * @generated
	 * @ordered
	 */
	protected TarFileDataFormat tarFile;

	/**
	 * The cached value of the '{@link #getThrift() <em>Thrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrift()
	 * @generated
	 * @ordered
	 */
	protected ThriftDataFormat thrift;

	/**
	 * The cached value of the '{@link #getTidyMarkup() <em>Tidy Markup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTidyMarkup()
	 * @generated
	 * @ordered
	 */
	protected TidyMarkupDataFormat tidyMarkup;

	/**
	 * The cached value of the '{@link #getUnivocityCsv() <em>Univocity Csv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnivocityCsv()
	 * @generated
	 * @ordered
	 */
	protected UniVocityCsvDataFormat univocityCsv;

	/**
	 * The cached value of the '{@link #getUnivocityFixed() <em>Univocity Fixed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnivocityFixed()
	 * @generated
	 * @ordered
	 */
	protected UniVocityFixedDataFormat univocityFixed;

	/**
	 * The cached value of the '{@link #getUnivocityTsv() <em>Univocity Tsv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnivocityTsv()
	 * @generated
	 * @ordered
	 */
	protected UniVocityTsvDataFormat univocityTsv;

	/**
	 * The cached value of the '{@link #getXmlSecurity() <em>Xml Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlSecurity()
	 * @generated
	 * @ordered
	 */
	protected XmlSecurityDataFormat xmlSecurity;

	/**
	 * The cached value of the '{@link #getPgp() <em>Pgp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgp()
	 * @generated
	 * @ordered
	 */
	protected PgpDataFormat pgp;

	/**
	 * The cached value of the '{@link #getYaml() <em>Yaml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYaml()
	 * @generated
	 * @ordered
	 */
	protected YamlDataFormat yaml;

	/**
	 * The cached value of the '{@link #getZipDeflater() <em>Zip Deflater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipDeflater()
	 * @generated
	 * @ordered
	 */
	protected ZipDeflaterDataFormat zipDeflater;

	/**
	 * The cached value of the '{@link #getZipFile() <em>Zip File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipFile()
	 * @generated
	 * @ordered
	 */
	protected ZipFileDataFormat zipFile;

	/**
	 * The default value of the '{@link #getAllowNullBody() <em>Allow Null Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowNullBody()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_NULL_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowNullBody() <em>Allow Null Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowNullBody()
	 * @generated
	 * @ordered
	 */
	protected String allowNullBody = ALLOW_NULL_BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableReceive() <em>Variable Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableReceive()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_RECEIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableReceive() <em>Variable Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableReceive()
	 * @generated
	 * @ordered
	 */
	protected String variableReceive = VARIABLE_RECEIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableSend() <em>Variable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSend()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_SEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableSend() <em>Variable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSend()
	 * @generated
	 * @ordered
	 */
	protected String variableSend = VARIABLE_SEND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnmarshalDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getUnmarshalDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asn1DataFormat getAsn1() {
		return asn1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsn1(Asn1DataFormat newAsn1, NotificationChain msgs) {
		Asn1DataFormat oldAsn1 = asn1;
		asn1 = newAsn1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ASN1, oldAsn1, newAsn1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsn1(Asn1DataFormat newAsn1) {
		if (newAsn1 != asn1) {
			NotificationChain msgs = null;
			if (asn1 != null)
				msgs = ((InternalEObject)asn1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__ASN1, null, msgs);
			if (newAsn1 != null)
				msgs = ((InternalEObject)newAsn1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__ASN1, null, msgs);
			msgs = basicSetAsn1(newAsn1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ASN1, newAsn1, newAsn1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AvroDataFormat getAvro() {
		return avro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvro(AvroDataFormat newAvro, NotificationChain msgs) {
		AvroDataFormat oldAvro = avro;
		avro = newAvro;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__AVRO, oldAvro, newAvro);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvro(AvroDataFormat newAvro) {
		if (newAvro != avro) {
			NotificationChain msgs = null;
			if (avro != null)
				msgs = ((InternalEObject)avro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__AVRO, null, msgs);
			if (newAvro != null)
				msgs = ((InternalEObject)newAvro).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__AVRO, null, msgs);
			msgs = basicSetAvro(newAvro, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__AVRO, newAvro, newAvro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarcodeDataFormat getBarcode() {
		return barcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBarcode(BarcodeDataFormat newBarcode, NotificationChain msgs) {
		BarcodeDataFormat oldBarcode = barcode;
		barcode = newBarcode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__BARCODE, oldBarcode, newBarcode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBarcode(BarcodeDataFormat newBarcode) {
		if (newBarcode != barcode) {
			NotificationChain msgs = null;
			if (barcode != null)
				msgs = ((InternalEObject)barcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__BARCODE, null, msgs);
			if (newBarcode != null)
				msgs = ((InternalEObject)newBarcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__BARCODE, null, msgs);
			msgs = basicSetBarcode(newBarcode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__BARCODE, newBarcode, newBarcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64DataFormat getBase64() {
		return base64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase64(Base64DataFormat newBase64, NotificationChain msgs) {
		Base64DataFormat oldBase64 = base64;
		base64 = newBase64;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__BASE64, oldBase64, newBase64);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase64(Base64DataFormat newBase64) {
		if (newBase64 != base64) {
			NotificationChain msgs = null;
			if (base64 != null)
				msgs = ((InternalEObject)base64).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__BASE64, null, msgs);
			if (newBase64 != null)
				msgs = ((InternalEObject)newBase64).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__BASE64, null, msgs);
			msgs = basicSetBase64(newBase64, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__BASE64, newBase64, newBase64));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeanioDataFormat getBeanio() {
		return beanio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeanio(BeanioDataFormat newBeanio, NotificationChain msgs) {
		BeanioDataFormat oldBeanio = beanio;
		beanio = newBeanio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__BEANIO, oldBeanio, newBeanio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeanio(BeanioDataFormat newBeanio) {
		if (newBeanio != beanio) {
			NotificationChain msgs = null;
			if (beanio != null)
				msgs = ((InternalEObject)beanio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__BEANIO, null, msgs);
			if (newBeanio != null)
				msgs = ((InternalEObject)newBeanio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__BEANIO, null, msgs);
			msgs = basicSetBeanio(newBeanio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__BEANIO, newBeanio, newBeanio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindyDataFormat getBindy() {
		return bindy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindy(BindyDataFormat newBindy, NotificationChain msgs) {
		BindyDataFormat oldBindy = bindy;
		bindy = newBindy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__BINDY, oldBindy, newBindy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindy(BindyDataFormat newBindy) {
		if (newBindy != bindy) {
			NotificationChain msgs = null;
			if (bindy != null)
				msgs = ((InternalEObject)bindy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__BINDY, null, msgs);
			if (newBindy != null)
				msgs = ((InternalEObject)newBindy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__BINDY, null, msgs);
			msgs = basicSetBindy(newBindy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__BINDY, newBindy, newBindy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CborDataFormat getCbor() {
		return cbor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCbor(CborDataFormat newCbor, NotificationChain msgs) {
		CborDataFormat oldCbor = cbor;
		cbor = newCbor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__CBOR, oldCbor, newCbor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCbor(CborDataFormat newCbor) {
		if (newCbor != cbor) {
			NotificationChain msgs = null;
			if (cbor != null)
				msgs = ((InternalEObject)cbor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__CBOR, null, msgs);
			if (newCbor != null)
				msgs = ((InternalEObject)newCbor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__CBOR, null, msgs);
			msgs = basicSetCbor(newCbor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__CBOR, newCbor, newCbor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CryptoDataFormat getCrypto() {
		return crypto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrypto(CryptoDataFormat newCrypto, NotificationChain msgs) {
		CryptoDataFormat oldCrypto = crypto;
		crypto = newCrypto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__CRYPTO, oldCrypto, newCrypto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrypto(CryptoDataFormat newCrypto) {
		if (newCrypto != crypto) {
			NotificationChain msgs = null;
			if (crypto != null)
				msgs = ((InternalEObject)crypto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__CRYPTO, null, msgs);
			if (newCrypto != null)
				msgs = ((InternalEObject)newCrypto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__CRYPTO, null, msgs);
			msgs = basicSetCrypto(newCrypto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__CRYPTO, newCrypto, newCrypto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsvDataFormat getCsv() {
		return csv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsv(CsvDataFormat newCsv, NotificationChain msgs) {
		CsvDataFormat oldCsv = csv;
		csv = newCsv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__CSV, oldCsv, newCsv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsv(CsvDataFormat newCsv) {
		if (newCsv != csv) {
			NotificationChain msgs = null;
			if (csv != null)
				msgs = ((InternalEObject)csv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__CSV, null, msgs);
			if (newCsv != null)
				msgs = ((InternalEObject)newCsv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__CSV, null, msgs);
			msgs = basicSetCsv(newCsv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__CSV, newCsv, newCsv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomDataFormat getCustom() {
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustom(CustomDataFormat newCustom, NotificationChain msgs) {
		CustomDataFormat oldCustom = custom;
		custom = newCustom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__CUSTOM, oldCustom, newCustom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustom(CustomDataFormat newCustom) {
		if (newCustom != custom) {
			NotificationChain msgs = null;
			if (custom != null)
				msgs = ((InternalEObject)custom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__CUSTOM, null, msgs);
			if (newCustom != null)
				msgs = ((InternalEObject)newCustom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__CUSTOM, null, msgs);
			msgs = basicSetCustom(newCustom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__CUSTOM, newCustom, newCustom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DfdlDataFormat getDfdl() {
		return dfdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDfdl(DfdlDataFormat newDfdl, NotificationChain msgs) {
		DfdlDataFormat oldDfdl = dfdl;
		dfdl = newDfdl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__DFDL, oldDfdl, newDfdl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDfdl(DfdlDataFormat newDfdl) {
		if (newDfdl != dfdl) {
			NotificationChain msgs = null;
			if (dfdl != null)
				msgs = ((InternalEObject)dfdl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__DFDL, null, msgs);
			if (newDfdl != null)
				msgs = ((InternalEObject)newDfdl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__DFDL, null, msgs);
			msgs = basicSetDfdl(newDfdl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__DFDL, newDfdl, newDfdl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FhirJsonDataFormat getFhirJson() {
		return fhirJson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFhirJson(FhirJsonDataFormat newFhirJson, NotificationChain msgs) {
		FhirJsonDataFormat oldFhirJson = fhirJson;
		fhirJson = newFhirJson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_JSON, oldFhirJson, newFhirJson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFhirJson(FhirJsonDataFormat newFhirJson) {
		if (newFhirJson != fhirJson) {
			NotificationChain msgs = null;
			if (fhirJson != null)
				msgs = ((InternalEObject)fhirJson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_JSON, null, msgs);
			if (newFhirJson != null)
				msgs = ((InternalEObject)newFhirJson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_JSON, null, msgs);
			msgs = basicSetFhirJson(newFhirJson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_JSON, newFhirJson, newFhirJson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FhirXmlDataFormat getFhirXml() {
		return fhirXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFhirXml(FhirXmlDataFormat newFhirXml, NotificationChain msgs) {
		FhirXmlDataFormat oldFhirXml = fhirXml;
		fhirXml = newFhirXml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_XML, oldFhirXml, newFhirXml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFhirXml(FhirXmlDataFormat newFhirXml) {
		if (newFhirXml != fhirXml) {
			NotificationChain msgs = null;
			if (fhirXml != null)
				msgs = ((InternalEObject)fhirXml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_XML, null, msgs);
			if (newFhirXml != null)
				msgs = ((InternalEObject)newFhirXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_XML, null, msgs);
			msgs = basicSetFhirXml(newFhirXml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_XML, newFhirXml, newFhirXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlatpackDataFormat getFlatpack() {
		return flatpack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlatpack(FlatpackDataFormat newFlatpack, NotificationChain msgs) {
		FlatpackDataFormat oldFlatpack = flatpack;
		flatpack = newFlatpack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__FLATPACK, oldFlatpack, newFlatpack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlatpack(FlatpackDataFormat newFlatpack) {
		if (newFlatpack != flatpack) {
			NotificationChain msgs = null;
			if (flatpack != null)
				msgs = ((InternalEObject)flatpack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__FLATPACK, null, msgs);
			if (newFlatpack != null)
				msgs = ((InternalEObject)newFlatpack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__FLATPACK, null, msgs);
			msgs = basicSetFlatpack(newFlatpack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__FLATPACK, newFlatpack, newFlatpack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForyDataFormat getFory() {
		return fory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFory(ForyDataFormat newFory, NotificationChain msgs) {
		ForyDataFormat oldFory = fory;
		fory = newFory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__FORY, oldFory, newFory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFory(ForyDataFormat newFory) {
		if (newFory != fory) {
			NotificationChain msgs = null;
			if (fory != null)
				msgs = ((InternalEObject)fory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__FORY, null, msgs);
			if (newFory != null)
				msgs = ((InternalEObject)newFory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__FORY, null, msgs);
			msgs = basicSetFory(newFory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__FORY, newFory, newFory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrokDataFormat getGrok() {
		return grok;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrok(GrokDataFormat newGrok, NotificationChain msgs) {
		GrokDataFormat oldGrok = grok;
		grok = newGrok;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__GROK, oldGrok, newGrok);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrok(GrokDataFormat newGrok) {
		if (newGrok != grok) {
			NotificationChain msgs = null;
			if (grok != null)
				msgs = ((InternalEObject)grok).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__GROK, null, msgs);
			if (newGrok != null)
				msgs = ((InternalEObject)newGrok).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__GROK, null, msgs);
			msgs = basicSetGrok(newGrok, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__GROK, newGrok, newGrok));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GzipDeflaterDataFormat getGzipDeflater() {
		return gzipDeflater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGzipDeflater(GzipDeflaterDataFormat newGzipDeflater, NotificationChain msgs) {
		GzipDeflaterDataFormat oldGzipDeflater = gzipDeflater;
		gzipDeflater = newGzipDeflater;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__GZIP_DEFLATER, oldGzipDeflater, newGzipDeflater);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGzipDeflater(GzipDeflaterDataFormat newGzipDeflater) {
		if (newGzipDeflater != gzipDeflater) {
			NotificationChain msgs = null;
			if (gzipDeflater != null)
				msgs = ((InternalEObject)gzipDeflater).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__GZIP_DEFLATER, null, msgs);
			if (newGzipDeflater != null)
				msgs = ((InternalEObject)newGzipDeflater).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__GZIP_DEFLATER, null, msgs);
			msgs = basicSetGzipDeflater(newGzipDeflater, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__GZIP_DEFLATER, newGzipDeflater, newGzipDeflater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl7DataFormat getHl7() {
		return hl7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHl7(Hl7DataFormat newHl7, NotificationChain msgs) {
		Hl7DataFormat oldHl7 = hl7;
		hl7 = newHl7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__HL7, oldHl7, newHl7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHl7(Hl7DataFormat newHl7) {
		if (newHl7 != hl7) {
			NotificationChain msgs = null;
			if (hl7 != null)
				msgs = ((InternalEObject)hl7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__HL7, null, msgs);
			if (newHl7 != null)
				msgs = ((InternalEObject)newHl7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__HL7, null, msgs);
			msgs = basicSetHl7(newHl7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__HL7, newHl7, newHl7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IcalDataFormat getIcal() {
		return ical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcal(IcalDataFormat newIcal, NotificationChain msgs) {
		IcalDataFormat oldIcal = ical;
		ical = newIcal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ICAL, oldIcal, newIcal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcal(IcalDataFormat newIcal) {
		if (newIcal != ical) {
			NotificationChain msgs = null;
			if (ical != null)
				msgs = ((InternalEObject)ical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__ICAL, null, msgs);
			if (newIcal != null)
				msgs = ((InternalEObject)newIcal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__ICAL, null, msgs);
			msgs = basicSetIcal(newIcal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ICAL, newIcal, newIcal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iso8583DataFormat getIso8583() {
		return iso8583;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIso8583(Iso8583DataFormat newIso8583, NotificationChain msgs) {
		Iso8583DataFormat oldIso8583 = iso8583;
		iso8583 = newIso8583;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ISO8583, oldIso8583, newIso8583);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIso8583(Iso8583DataFormat newIso8583) {
		if (newIso8583 != iso8583) {
			NotificationChain msgs = null;
			if (iso8583 != null)
				msgs = ((InternalEObject)iso8583).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__ISO8583, null, msgs);
			if (newIso8583 != null)
				msgs = ((InternalEObject)newIso8583).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__ISO8583, null, msgs);
			msgs = basicSetIso8583(newIso8583, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ISO8583, newIso8583, newIso8583));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JacksonXMLDataFormat getJacksonXml() {
		return jacksonXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJacksonXml(JacksonXMLDataFormat newJacksonXml, NotificationChain msgs) {
		JacksonXMLDataFormat oldJacksonXml = jacksonXml;
		jacksonXml = newJacksonXml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__JACKSON_XML, oldJacksonXml, newJacksonXml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJacksonXml(JacksonXMLDataFormat newJacksonXml) {
		if (newJacksonXml != jacksonXml) {
			NotificationChain msgs = null;
			if (jacksonXml != null)
				msgs = ((InternalEObject)jacksonXml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__JACKSON_XML, null, msgs);
			if (newJacksonXml != null)
				msgs = ((InternalEObject)newJacksonXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__JACKSON_XML, null, msgs);
			msgs = basicSetJacksonXml(newJacksonXml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__JACKSON_XML, newJacksonXml, newJacksonXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JaxbDataFormat getJaxb() {
		return jaxb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJaxb(JaxbDataFormat newJaxb, NotificationChain msgs) {
		JaxbDataFormat oldJaxb = jaxb;
		jaxb = newJaxb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__JAXB, oldJaxb, newJaxb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJaxb(JaxbDataFormat newJaxb) {
		if (newJaxb != jaxb) {
			NotificationChain msgs = null;
			if (jaxb != null)
				msgs = ((InternalEObject)jaxb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__JAXB, null, msgs);
			if (newJaxb != null)
				msgs = ((InternalEObject)newJaxb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__JAXB, null, msgs);
			msgs = basicSetJaxb(newJaxb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__JAXB, newJaxb, newJaxb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonDataFormat getJson() {
		return json;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJson(JsonDataFormat newJson, NotificationChain msgs) {
		JsonDataFormat oldJson = json;
		json = newJson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__JSON, oldJson, newJson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJson(JsonDataFormat newJson) {
		if (newJson != json) {
			NotificationChain msgs = null;
			if (json != null)
				msgs = ((InternalEObject)json).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__JSON, null, msgs);
			if (newJson != null)
				msgs = ((InternalEObject)newJson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__JSON, null, msgs);
			msgs = basicSetJson(newJson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__JSON, newJson, newJson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonApiDataFormat getJsonApi() {
		return jsonApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJsonApi(JsonApiDataFormat newJsonApi, NotificationChain msgs) {
		JsonApiDataFormat oldJsonApi = jsonApi;
		jsonApi = newJsonApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__JSON_API, oldJsonApi, newJsonApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonApi(JsonApiDataFormat newJsonApi) {
		if (newJsonApi != jsonApi) {
			NotificationChain msgs = null;
			if (jsonApi != null)
				msgs = ((InternalEObject)jsonApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__JSON_API, null, msgs);
			if (newJsonApi != null)
				msgs = ((InternalEObject)newJsonApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__JSON_API, null, msgs);
			msgs = basicSetJsonApi(newJsonApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__JSON_API, newJsonApi, newJsonApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LzfDataFormat getLzf() {
		return lzf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLzf(LzfDataFormat newLzf, NotificationChain msgs) {
		LzfDataFormat oldLzf = lzf;
		lzf = newLzf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__LZF, oldLzf, newLzf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLzf(LzfDataFormat newLzf) {
		if (newLzf != lzf) {
			NotificationChain msgs = null;
			if (lzf != null)
				msgs = ((InternalEObject)lzf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__LZF, null, msgs);
			if (newLzf != null)
				msgs = ((InternalEObject)newLzf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__LZF, null, msgs);
			msgs = basicSetLzf(newLzf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__LZF, newLzf, newLzf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeMultipartDataFormat getMimeMultipart() {
		return mimeMultipart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMimeMultipart(MimeMultipartDataFormat newMimeMultipart, NotificationChain msgs) {
		MimeMultipartDataFormat oldMimeMultipart = mimeMultipart;
		mimeMultipart = newMimeMultipart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__MIME_MULTIPART, oldMimeMultipart, newMimeMultipart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeMultipart(MimeMultipartDataFormat newMimeMultipart) {
		if (newMimeMultipart != mimeMultipart) {
			NotificationChain msgs = null;
			if (mimeMultipart != null)
				msgs = ((InternalEObject)mimeMultipart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__MIME_MULTIPART, null, msgs);
			if (newMimeMultipart != null)
				msgs = ((InternalEObject)newMimeMultipart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__MIME_MULTIPART, null, msgs);
			msgs = basicSetMimeMultipart(newMimeMultipart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__MIME_MULTIPART, newMimeMultipart, newMimeMultipart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParquetAvroDataFormat getParquetAvro() {
		return parquetAvro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParquetAvro(ParquetAvroDataFormat newParquetAvro, NotificationChain msgs) {
		ParquetAvroDataFormat oldParquetAvro = parquetAvro;
		parquetAvro = newParquetAvro;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__PARQUET_AVRO, oldParquetAvro, newParquetAvro);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParquetAvro(ParquetAvroDataFormat newParquetAvro) {
		if (newParquetAvro != parquetAvro) {
			NotificationChain msgs = null;
			if (parquetAvro != null)
				msgs = ((InternalEObject)parquetAvro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__PARQUET_AVRO, null, msgs);
			if (newParquetAvro != null)
				msgs = ((InternalEObject)newParquetAvro).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__PARQUET_AVRO, null, msgs);
			msgs = basicSetParquetAvro(newParquetAvro, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__PARQUET_AVRO, newParquetAvro, newParquetAvro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtobufDataFormat getProtobuf() {
		return protobuf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtobuf(ProtobufDataFormat newProtobuf, NotificationChain msgs) {
		ProtobufDataFormat oldProtobuf = protobuf;
		protobuf = newProtobuf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__PROTOBUF, oldProtobuf, newProtobuf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtobuf(ProtobufDataFormat newProtobuf) {
		if (newProtobuf != protobuf) {
			NotificationChain msgs = null;
			if (protobuf != null)
				msgs = ((InternalEObject)protobuf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__PROTOBUF, null, msgs);
			if (newProtobuf != null)
				msgs = ((InternalEObject)newProtobuf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__PROTOBUF, null, msgs);
			msgs = basicSetProtobuf(newProtobuf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__PROTOBUF, newProtobuf, newProtobuf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RssDataFormat getRss() {
		return rss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRss(RssDataFormat newRss, NotificationChain msgs) {
		RssDataFormat oldRss = rss;
		rss = newRss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__RSS, oldRss, newRss);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRss(RssDataFormat newRss) {
		if (newRss != rss) {
			NotificationChain msgs = null;
			if (rss != null)
				msgs = ((InternalEObject)rss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__RSS, null, msgs);
			if (newRss != null)
				msgs = ((InternalEObject)newRss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__RSS, null, msgs);
			msgs = basicSetRss(newRss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__RSS, newRss, newRss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmooksDataFormat getSmooks() {
		return smooks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmooks(SmooksDataFormat newSmooks, NotificationChain msgs) {
		SmooksDataFormat oldSmooks = smooks;
		smooks = newSmooks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__SMOOKS, oldSmooks, newSmooks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmooks(SmooksDataFormat newSmooks) {
		if (newSmooks != smooks) {
			NotificationChain msgs = null;
			if (smooks != null)
				msgs = ((InternalEObject)smooks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__SMOOKS, null, msgs);
			if (newSmooks != null)
				msgs = ((InternalEObject)newSmooks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__SMOOKS, null, msgs);
			msgs = basicSetSmooks(newSmooks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__SMOOKS, newSmooks, newSmooks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoapDataFormat getSoap() {
		return soap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoap(SoapDataFormat newSoap, NotificationChain msgs) {
		SoapDataFormat oldSoap = soap;
		soap = newSoap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__SOAP, oldSoap, newSoap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoap(SoapDataFormat newSoap) {
		if (newSoap != soap) {
			NotificationChain msgs = null;
			if (soap != null)
				msgs = ((InternalEObject)soap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__SOAP, null, msgs);
			if (newSoap != null)
				msgs = ((InternalEObject)newSoap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__SOAP, null, msgs);
			msgs = basicSetSoap(newSoap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__SOAP, newSoap, newSoap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwiftMtDataFormat getSwiftMt() {
		return swiftMt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwiftMt(SwiftMtDataFormat newSwiftMt, NotificationChain msgs) {
		SwiftMtDataFormat oldSwiftMt = swiftMt;
		swiftMt = newSwiftMt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MT, oldSwiftMt, newSwiftMt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwiftMt(SwiftMtDataFormat newSwiftMt) {
		if (newSwiftMt != swiftMt) {
			NotificationChain msgs = null;
			if (swiftMt != null)
				msgs = ((InternalEObject)swiftMt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MT, null, msgs);
			if (newSwiftMt != null)
				msgs = ((InternalEObject)newSwiftMt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MT, null, msgs);
			msgs = basicSetSwiftMt(newSwiftMt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MT, newSwiftMt, newSwiftMt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwiftMxDataFormat getSwiftMx() {
		return swiftMx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwiftMx(SwiftMxDataFormat newSwiftMx, NotificationChain msgs) {
		SwiftMxDataFormat oldSwiftMx = swiftMx;
		swiftMx = newSwiftMx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MX, oldSwiftMx, newSwiftMx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwiftMx(SwiftMxDataFormat newSwiftMx) {
		if (newSwiftMx != swiftMx) {
			NotificationChain msgs = null;
			if (swiftMx != null)
				msgs = ((InternalEObject)swiftMx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MX, null, msgs);
			if (newSwiftMx != null)
				msgs = ((InternalEObject)newSwiftMx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MX, null, msgs);
			msgs = basicSetSwiftMx(newSwiftMx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MX, newSwiftMx, newSwiftMx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyslogDataFormat getSyslog() {
		return syslog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyslog(SyslogDataFormat newSyslog, NotificationChain msgs) {
		SyslogDataFormat oldSyslog = syslog;
		syslog = newSyslog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__SYSLOG, oldSyslog, newSyslog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyslog(SyslogDataFormat newSyslog) {
		if (newSyslog != syslog) {
			NotificationChain msgs = null;
			if (syslog != null)
				msgs = ((InternalEObject)syslog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__SYSLOG, null, msgs);
			if (newSyslog != null)
				msgs = ((InternalEObject)newSyslog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__SYSLOG, null, msgs);
			msgs = basicSetSyslog(newSyslog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__SYSLOG, newSyslog, newSyslog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TarFileDataFormat getTarFile() {
		return tarFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarFile(TarFileDataFormat newTarFile, NotificationChain msgs) {
		TarFileDataFormat oldTarFile = tarFile;
		tarFile = newTarFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__TAR_FILE, oldTarFile, newTarFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarFile(TarFileDataFormat newTarFile) {
		if (newTarFile != tarFile) {
			NotificationChain msgs = null;
			if (tarFile != null)
				msgs = ((InternalEObject)tarFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__TAR_FILE, null, msgs);
			if (newTarFile != null)
				msgs = ((InternalEObject)newTarFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__TAR_FILE, null, msgs);
			msgs = basicSetTarFile(newTarFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__TAR_FILE, newTarFile, newTarFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThriftDataFormat getThrift() {
		return thrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrift(ThriftDataFormat newThrift, NotificationChain msgs) {
		ThriftDataFormat oldThrift = thrift;
		thrift = newThrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__THRIFT, oldThrift, newThrift);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrift(ThriftDataFormat newThrift) {
		if (newThrift != thrift) {
			NotificationChain msgs = null;
			if (thrift != null)
				msgs = ((InternalEObject)thrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__THRIFT, null, msgs);
			if (newThrift != null)
				msgs = ((InternalEObject)newThrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__THRIFT, null, msgs);
			msgs = basicSetThrift(newThrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__THRIFT, newThrift, newThrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TidyMarkupDataFormat getTidyMarkup() {
		return tidyMarkup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTidyMarkup(TidyMarkupDataFormat newTidyMarkup, NotificationChain msgs) {
		TidyMarkupDataFormat oldTidyMarkup = tidyMarkup;
		tidyMarkup = newTidyMarkup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__TIDY_MARKUP, oldTidyMarkup, newTidyMarkup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTidyMarkup(TidyMarkupDataFormat newTidyMarkup) {
		if (newTidyMarkup != tidyMarkup) {
			NotificationChain msgs = null;
			if (tidyMarkup != null)
				msgs = ((InternalEObject)tidyMarkup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__TIDY_MARKUP, null, msgs);
			if (newTidyMarkup != null)
				msgs = ((InternalEObject)newTidyMarkup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__TIDY_MARKUP, null, msgs);
			msgs = basicSetTidyMarkup(newTidyMarkup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__TIDY_MARKUP, newTidyMarkup, newTidyMarkup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityCsvDataFormat getUnivocityCsv() {
		return univocityCsv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnivocityCsv(UniVocityCsvDataFormat newUnivocityCsv, NotificationChain msgs) {
		UniVocityCsvDataFormat oldUnivocityCsv = univocityCsv;
		univocityCsv = newUnivocityCsv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_CSV, oldUnivocityCsv, newUnivocityCsv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnivocityCsv(UniVocityCsvDataFormat newUnivocityCsv) {
		if (newUnivocityCsv != univocityCsv) {
			NotificationChain msgs = null;
			if (univocityCsv != null)
				msgs = ((InternalEObject)univocityCsv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_CSV, null, msgs);
			if (newUnivocityCsv != null)
				msgs = ((InternalEObject)newUnivocityCsv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_CSV, null, msgs);
			msgs = basicSetUnivocityCsv(newUnivocityCsv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_CSV, newUnivocityCsv, newUnivocityCsv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityFixedDataFormat getUnivocityFixed() {
		return univocityFixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnivocityFixed(UniVocityFixedDataFormat newUnivocityFixed, NotificationChain msgs) {
		UniVocityFixedDataFormat oldUnivocityFixed = univocityFixed;
		univocityFixed = newUnivocityFixed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_FIXED, oldUnivocityFixed, newUnivocityFixed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnivocityFixed(UniVocityFixedDataFormat newUnivocityFixed) {
		if (newUnivocityFixed != univocityFixed) {
			NotificationChain msgs = null;
			if (univocityFixed != null)
				msgs = ((InternalEObject)univocityFixed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_FIXED, null, msgs);
			if (newUnivocityFixed != null)
				msgs = ((InternalEObject)newUnivocityFixed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_FIXED, null, msgs);
			msgs = basicSetUnivocityFixed(newUnivocityFixed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_FIXED, newUnivocityFixed, newUnivocityFixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniVocityTsvDataFormat getUnivocityTsv() {
		return univocityTsv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnivocityTsv(UniVocityTsvDataFormat newUnivocityTsv, NotificationChain msgs) {
		UniVocityTsvDataFormat oldUnivocityTsv = univocityTsv;
		univocityTsv = newUnivocityTsv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_TSV, oldUnivocityTsv, newUnivocityTsv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnivocityTsv(UniVocityTsvDataFormat newUnivocityTsv) {
		if (newUnivocityTsv != univocityTsv) {
			NotificationChain msgs = null;
			if (univocityTsv != null)
				msgs = ((InternalEObject)univocityTsv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_TSV, null, msgs);
			if (newUnivocityTsv != null)
				msgs = ((InternalEObject)newUnivocityTsv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_TSV, null, msgs);
			msgs = basicSetUnivocityTsv(newUnivocityTsv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_TSV, newUnivocityTsv, newUnivocityTsv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlSecurityDataFormat getXmlSecurity() {
		return xmlSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlSecurity(XmlSecurityDataFormat newXmlSecurity, NotificationChain msgs) {
		XmlSecurityDataFormat oldXmlSecurity = xmlSecurity;
		xmlSecurity = newXmlSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__XML_SECURITY, oldXmlSecurity, newXmlSecurity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlSecurity(XmlSecurityDataFormat newXmlSecurity) {
		if (newXmlSecurity != xmlSecurity) {
			NotificationChain msgs = null;
			if (xmlSecurity != null)
				msgs = ((InternalEObject)xmlSecurity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__XML_SECURITY, null, msgs);
			if (newXmlSecurity != null)
				msgs = ((InternalEObject)newXmlSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__XML_SECURITY, null, msgs);
			msgs = basicSetXmlSecurity(newXmlSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__XML_SECURITY, newXmlSecurity, newXmlSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PgpDataFormat getPgp() {
		return pgp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPgp(PgpDataFormat newPgp, NotificationChain msgs) {
		PgpDataFormat oldPgp = pgp;
		pgp = newPgp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__PGP, oldPgp, newPgp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPgp(PgpDataFormat newPgp) {
		if (newPgp != pgp) {
			NotificationChain msgs = null;
			if (pgp != null)
				msgs = ((InternalEObject)pgp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__PGP, null, msgs);
			if (newPgp != null)
				msgs = ((InternalEObject)newPgp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__PGP, null, msgs);
			msgs = basicSetPgp(newPgp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__PGP, newPgp, newPgp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YamlDataFormat getYaml() {
		return yaml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYaml(YamlDataFormat newYaml, NotificationChain msgs) {
		YamlDataFormat oldYaml = yaml;
		yaml = newYaml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__YAML, oldYaml, newYaml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYaml(YamlDataFormat newYaml) {
		if (newYaml != yaml) {
			NotificationChain msgs = null;
			if (yaml != null)
				msgs = ((InternalEObject)yaml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__YAML, null, msgs);
			if (newYaml != null)
				msgs = ((InternalEObject)newYaml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__YAML, null, msgs);
			msgs = basicSetYaml(newYaml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__YAML, newYaml, newYaml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZipDeflaterDataFormat getZipDeflater() {
		return zipDeflater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZipDeflater(ZipDeflaterDataFormat newZipDeflater, NotificationChain msgs) {
		ZipDeflaterDataFormat oldZipDeflater = zipDeflater;
		zipDeflater = newZipDeflater;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_DEFLATER, oldZipDeflater, newZipDeflater);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZipDeflater(ZipDeflaterDataFormat newZipDeflater) {
		if (newZipDeflater != zipDeflater) {
			NotificationChain msgs = null;
			if (zipDeflater != null)
				msgs = ((InternalEObject)zipDeflater).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_DEFLATER, null, msgs);
			if (newZipDeflater != null)
				msgs = ((InternalEObject)newZipDeflater).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_DEFLATER, null, msgs);
			msgs = basicSetZipDeflater(newZipDeflater, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_DEFLATER, newZipDeflater, newZipDeflater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZipFileDataFormat getZipFile() {
		return zipFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZipFile(ZipFileDataFormat newZipFile, NotificationChain msgs) {
		ZipFileDataFormat oldZipFile = zipFile;
		zipFile = newZipFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_FILE, oldZipFile, newZipFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZipFile(ZipFileDataFormat newZipFile) {
		if (newZipFile != zipFile) {
			NotificationChain msgs = null;
			if (zipFile != null)
				msgs = ((InternalEObject)zipFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_FILE, null, msgs);
			if (newZipFile != null)
				msgs = ((InternalEObject)newZipFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_FILE, null, msgs);
			msgs = basicSetZipFile(newZipFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_FILE, newZipFile, newZipFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowNullBody() {
		return allowNullBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowNullBody(String newAllowNullBody) {
		String oldAllowNullBody = allowNullBody;
		allowNullBody = newAllowNullBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__ALLOW_NULL_BODY, oldAllowNullBody, allowNullBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariableReceive() {
		return variableReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableReceive(String newVariableReceive) {
		String oldVariableReceive = variableReceive;
		variableReceive = newVariableReceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__VARIABLE_RECEIVE, oldVariableReceive, variableReceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariableSend() {
		return variableSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableSend(String newVariableSend) {
		String oldVariableSend = variableSend;
		variableSend = newVariableSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelSpringPackage.UNMARSHAL_DEFINITION__VARIABLE_SEND, oldVariableSend, variableSend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ASN1:
				return basicSetAsn1(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__AVRO:
				return basicSetAvro(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BARCODE:
				return basicSetBarcode(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BASE64:
				return basicSetBase64(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BEANIO:
				return basicSetBeanio(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BINDY:
				return basicSetBindy(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CBOR:
				return basicSetCbor(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CRYPTO:
				return basicSetCrypto(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CSV:
				return basicSetCsv(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CUSTOM:
				return basicSetCustom(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__DFDL:
				return basicSetDfdl(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_JSON:
				return basicSetFhirJson(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_XML:
				return basicSetFhirXml(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FLATPACK:
				return basicSetFlatpack(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FORY:
				return basicSetFory(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__GROK:
				return basicSetGrok(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__GZIP_DEFLATER:
				return basicSetGzipDeflater(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__HL7:
				return basicSetHl7(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ICAL:
				return basicSetIcal(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ISO8583:
				return basicSetIso8583(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JACKSON_XML:
				return basicSetJacksonXml(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JAXB:
				return basicSetJaxb(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JSON:
				return basicSetJson(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JSON_API:
				return basicSetJsonApi(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__LZF:
				return basicSetLzf(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__MIME_MULTIPART:
				return basicSetMimeMultipart(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PARQUET_AVRO:
				return basicSetParquetAvro(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PROTOBUF:
				return basicSetProtobuf(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__RSS:
				return basicSetRss(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SMOOKS:
				return basicSetSmooks(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SOAP:
				return basicSetSoap(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MT:
				return basicSetSwiftMt(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MX:
				return basicSetSwiftMx(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SYSLOG:
				return basicSetSyslog(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__TAR_FILE:
				return basicSetTarFile(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__THRIFT:
				return basicSetThrift(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__TIDY_MARKUP:
				return basicSetTidyMarkup(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_CSV:
				return basicSetUnivocityCsv(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_FIXED:
				return basicSetUnivocityFixed(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_TSV:
				return basicSetUnivocityTsv(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__XML_SECURITY:
				return basicSetXmlSecurity(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PGP:
				return basicSetPgp(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__YAML:
				return basicSetYaml(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_DEFLATER:
				return basicSetZipDeflater(null, msgs);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_FILE:
				return basicSetZipFile(null, msgs);
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
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ASN1:
				return getAsn1();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__AVRO:
				return getAvro();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BARCODE:
				return getBarcode();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BASE64:
				return getBase64();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BEANIO:
				return getBeanio();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BINDY:
				return getBindy();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CBOR:
				return getCbor();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CRYPTO:
				return getCrypto();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CSV:
				return getCsv();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CUSTOM:
				return getCustom();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__DFDL:
				return getDfdl();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_JSON:
				return getFhirJson();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_XML:
				return getFhirXml();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FLATPACK:
				return getFlatpack();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FORY:
				return getFory();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__GROK:
				return getGrok();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__GZIP_DEFLATER:
				return getGzipDeflater();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__HL7:
				return getHl7();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ICAL:
				return getIcal();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ISO8583:
				return getIso8583();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JACKSON_XML:
				return getJacksonXml();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JAXB:
				return getJaxb();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JSON:
				return getJson();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JSON_API:
				return getJsonApi();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__LZF:
				return getLzf();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__MIME_MULTIPART:
				return getMimeMultipart();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PARQUET_AVRO:
				return getParquetAvro();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PROTOBUF:
				return getProtobuf();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__RSS:
				return getRss();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SMOOKS:
				return getSmooks();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SOAP:
				return getSoap();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MT:
				return getSwiftMt();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MX:
				return getSwiftMx();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SYSLOG:
				return getSyslog();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__TAR_FILE:
				return getTarFile();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__THRIFT:
				return getThrift();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__TIDY_MARKUP:
				return getTidyMarkup();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_CSV:
				return getUnivocityCsv();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_FIXED:
				return getUnivocityFixed();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_TSV:
				return getUnivocityTsv();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__XML_SECURITY:
				return getXmlSecurity();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PGP:
				return getPgp();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__YAML:
				return getYaml();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_DEFLATER:
				return getZipDeflater();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_FILE:
				return getZipFile();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ALLOW_NULL_BODY:
				return getAllowNullBody();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__VARIABLE_RECEIVE:
				return getVariableReceive();
			case CamelSpringPackage.UNMARSHAL_DEFINITION__VARIABLE_SEND:
				return getVariableSend();
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
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ASN1:
				setAsn1((Asn1DataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__AVRO:
				setAvro((AvroDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BARCODE:
				setBarcode((BarcodeDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BASE64:
				setBase64((Base64DataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BEANIO:
				setBeanio((BeanioDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BINDY:
				setBindy((BindyDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CBOR:
				setCbor((CborDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CRYPTO:
				setCrypto((CryptoDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CSV:
				setCsv((CsvDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CUSTOM:
				setCustom((CustomDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__DFDL:
				setDfdl((DfdlDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_JSON:
				setFhirJson((FhirJsonDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_XML:
				setFhirXml((FhirXmlDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FLATPACK:
				setFlatpack((FlatpackDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FORY:
				setFory((ForyDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__GROK:
				setGrok((GrokDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__GZIP_DEFLATER:
				setGzipDeflater((GzipDeflaterDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__HL7:
				setHl7((Hl7DataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ICAL:
				setIcal((IcalDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ISO8583:
				setIso8583((Iso8583DataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JACKSON_XML:
				setJacksonXml((JacksonXMLDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JAXB:
				setJaxb((JaxbDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JSON:
				setJson((JsonDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JSON_API:
				setJsonApi((JsonApiDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__LZF:
				setLzf((LzfDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__MIME_MULTIPART:
				setMimeMultipart((MimeMultipartDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PARQUET_AVRO:
				setParquetAvro((ParquetAvroDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PROTOBUF:
				setProtobuf((ProtobufDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__RSS:
				setRss((RssDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SMOOKS:
				setSmooks((SmooksDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SOAP:
				setSoap((SoapDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MT:
				setSwiftMt((SwiftMtDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MX:
				setSwiftMx((SwiftMxDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SYSLOG:
				setSyslog((SyslogDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__TAR_FILE:
				setTarFile((TarFileDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__THRIFT:
				setThrift((ThriftDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__TIDY_MARKUP:
				setTidyMarkup((TidyMarkupDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_CSV:
				setUnivocityCsv((UniVocityCsvDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_FIXED:
				setUnivocityFixed((UniVocityFixedDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_TSV:
				setUnivocityTsv((UniVocityTsvDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__XML_SECURITY:
				setXmlSecurity((XmlSecurityDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PGP:
				setPgp((PgpDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__YAML:
				setYaml((YamlDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_DEFLATER:
				setZipDeflater((ZipDeflaterDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_FILE:
				setZipFile((ZipFileDataFormat)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ALLOW_NULL_BODY:
				setAllowNullBody((String)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__VARIABLE_RECEIVE:
				setVariableReceive((String)newValue);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__VARIABLE_SEND:
				setVariableSend((String)newValue);
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
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ASN1:
				setAsn1((Asn1DataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__AVRO:
				setAvro((AvroDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BARCODE:
				setBarcode((BarcodeDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BASE64:
				setBase64((Base64DataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BEANIO:
				setBeanio((BeanioDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BINDY:
				setBindy((BindyDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CBOR:
				setCbor((CborDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CRYPTO:
				setCrypto((CryptoDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CSV:
				setCsv((CsvDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CUSTOM:
				setCustom((CustomDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__DFDL:
				setDfdl((DfdlDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_JSON:
				setFhirJson((FhirJsonDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_XML:
				setFhirXml((FhirXmlDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FLATPACK:
				setFlatpack((FlatpackDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FORY:
				setFory((ForyDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__GROK:
				setGrok((GrokDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__GZIP_DEFLATER:
				setGzipDeflater((GzipDeflaterDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__HL7:
				setHl7((Hl7DataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ICAL:
				setIcal((IcalDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ISO8583:
				setIso8583((Iso8583DataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JACKSON_XML:
				setJacksonXml((JacksonXMLDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JAXB:
				setJaxb((JaxbDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JSON:
				setJson((JsonDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JSON_API:
				setJsonApi((JsonApiDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__LZF:
				setLzf((LzfDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__MIME_MULTIPART:
				setMimeMultipart((MimeMultipartDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PARQUET_AVRO:
				setParquetAvro((ParquetAvroDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PROTOBUF:
				setProtobuf((ProtobufDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__RSS:
				setRss((RssDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SMOOKS:
				setSmooks((SmooksDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SOAP:
				setSoap((SoapDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MT:
				setSwiftMt((SwiftMtDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MX:
				setSwiftMx((SwiftMxDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SYSLOG:
				setSyslog((SyslogDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__TAR_FILE:
				setTarFile((TarFileDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__THRIFT:
				setThrift((ThriftDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__TIDY_MARKUP:
				setTidyMarkup((TidyMarkupDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_CSV:
				setUnivocityCsv((UniVocityCsvDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_FIXED:
				setUnivocityFixed((UniVocityFixedDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_TSV:
				setUnivocityTsv((UniVocityTsvDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__XML_SECURITY:
				setXmlSecurity((XmlSecurityDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PGP:
				setPgp((PgpDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__YAML:
				setYaml((YamlDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_DEFLATER:
				setZipDeflater((ZipDeflaterDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_FILE:
				setZipFile((ZipFileDataFormat)null);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ALLOW_NULL_BODY:
				setAllowNullBody(ALLOW_NULL_BODY_EDEFAULT);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__VARIABLE_RECEIVE:
				setVariableReceive(VARIABLE_RECEIVE_EDEFAULT);
				return;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__VARIABLE_SEND:
				setVariableSend(VARIABLE_SEND_EDEFAULT);
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
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ASN1:
				return asn1 != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__AVRO:
				return avro != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BARCODE:
				return barcode != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BASE64:
				return base64 != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BEANIO:
				return beanio != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__BINDY:
				return bindy != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CBOR:
				return cbor != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CRYPTO:
				return crypto != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CSV:
				return csv != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__CUSTOM:
				return custom != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__DFDL:
				return dfdl != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_JSON:
				return fhirJson != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FHIR_XML:
				return fhirXml != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FLATPACK:
				return flatpack != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__FORY:
				return fory != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__GROK:
				return grok != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__GZIP_DEFLATER:
				return gzipDeflater != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__HL7:
				return hl7 != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ICAL:
				return ical != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ISO8583:
				return iso8583 != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JACKSON_XML:
				return jacksonXml != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JAXB:
				return jaxb != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JSON:
				return json != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__JSON_API:
				return jsonApi != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__LZF:
				return lzf != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__MIME_MULTIPART:
				return mimeMultipart != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PARQUET_AVRO:
				return parquetAvro != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PROTOBUF:
				return protobuf != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__RSS:
				return rss != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SMOOKS:
				return smooks != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SOAP:
				return soap != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MT:
				return swiftMt != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SWIFT_MX:
				return swiftMx != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__SYSLOG:
				return syslog != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__TAR_FILE:
				return tarFile != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__THRIFT:
				return thrift != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__TIDY_MARKUP:
				return tidyMarkup != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_CSV:
				return univocityCsv != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_FIXED:
				return univocityFixed != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__UNIVOCITY_TSV:
				return univocityTsv != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__XML_SECURITY:
				return xmlSecurity != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__PGP:
				return pgp != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__YAML:
				return yaml != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_DEFLATER:
				return zipDeflater != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ZIP_FILE:
				return zipFile != null;
			case CamelSpringPackage.UNMARSHAL_DEFINITION__ALLOW_NULL_BODY:
				return ALLOW_NULL_BODY_EDEFAULT == null ? allowNullBody != null : !ALLOW_NULL_BODY_EDEFAULT.equals(allowNullBody);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__VARIABLE_RECEIVE:
				return VARIABLE_RECEIVE_EDEFAULT == null ? variableReceive != null : !VARIABLE_RECEIVE_EDEFAULT.equals(variableReceive);
			case CamelSpringPackage.UNMARSHAL_DEFINITION__VARIABLE_SEND:
				return VARIABLE_SEND_EDEFAULT == null ? variableSend != null : !VARIABLE_SEND_EDEFAULT.equals(variableSend);
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
		result.append(" (allowNullBody: ");
		result.append(allowNullBody);
		result.append(", variableReceive: ");
		result.append(variableReceive);
		result.append(", variableSend: ");
		result.append(variableSend);
		result.append(')');
		return result.toString();
	}

} //UnmarshalDefinitionImpl

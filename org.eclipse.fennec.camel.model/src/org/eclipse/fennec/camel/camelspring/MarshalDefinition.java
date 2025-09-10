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
 * A representation of the model object '<em><b>Marshal Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getAsn1 <em>Asn1</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getAvro <em>Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getBarcode <em>Barcode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getBase64 <em>Base64</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getBeanio <em>Beanio</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getCbor <em>Cbor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getDfdl <em>Dfdl</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getFhirJson <em>Fhir Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getFhirXml <em>Fhir Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getFory <em>Fory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getGrok <em>Grok</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getGzipDeflater <em>Gzip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getIcal <em>Ical</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getIso8583 <em>Iso8583</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getJacksonXml <em>Jackson Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getJson <em>Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getJsonApi <em>Json Api</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getLzf <em>Lzf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getMimeMultipart <em>Mime Multipart</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getParquetAvro <em>Parquet Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getRss <em>Rss</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getSmooks <em>Smooks</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getSoap <em>Soap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getSwiftMt <em>Swift Mt</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getSwiftMx <em>Swift Mx</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getTarFile <em>Tar File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getThrift <em>Thrift</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getUnivocityCsv <em>Univocity Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getUnivocityFixed <em>Univocity Fixed</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getUnivocityTsv <em>Univocity Tsv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getXmlSecurity <em>Xml Security</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getPgp <em>Pgp</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getYaml <em>Yaml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getZipDeflater <em>Zip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getZipFile <em>Zip File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getVariableReceive <em>Variable Receive</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getVariableSend <em>Variable Send</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition()
 * @model extendedMetaData="name='marshalDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MarshalDefinition extends NoOutputDefinition {
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Asn1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asn1' namespace='##targetNamespace'"
	 * @generated
	 */
	Asn1DataFormat getAsn1();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getAsn1 <em>Asn1</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Avro()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='avro' namespace='##targetNamespace'"
	 * @generated
	 */
	AvroDataFormat getAvro();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getAvro <em>Avro</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Barcode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='barcode' namespace='##targetNamespace'"
	 * @generated
	 */
	BarcodeDataFormat getBarcode();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getBarcode <em>Barcode</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Base64()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='base64' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64DataFormat getBase64();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getBase64 <em>Base64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64</em>' containment reference.
	 * @see #getBase64()
	 * @generated
	 */
	void setBase64(Base64DataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Beanio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beanio' namespace='##targetNamespace'"
	 * @generated
	 */
	BeanioDataFormat getBeanio();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getBeanio <em>Beanio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beanio</em>' containment reference.
	 * @see #getBeanio()
	 * @generated
	 */
	void setBeanio(BeanioDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Bindy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bindy' namespace='##targetNamespace'"
	 * @generated
	 */
	BindyDataFormat getBindy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getBindy <em>Bindy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindy</em>' containment reference.
	 * @see #getBindy()
	 * @generated
	 */
	void setBindy(BindyDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Cbor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cbor' namespace='##targetNamespace'"
	 * @generated
	 */
	CborDataFormat getCbor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getCbor <em>Cbor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cbor</em>' containment reference.
	 * @see #getCbor()
	 * @generated
	 */
	void setCbor(CborDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Crypto()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crypto' namespace='##targetNamespace'"
	 * @generated
	 */
	CryptoDataFormat getCrypto();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getCrypto <em>Crypto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crypto</em>' containment reference.
	 * @see #getCrypto()
	 * @generated
	 */
	void setCrypto(CryptoDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Csv()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='csv' namespace='##targetNamespace'"
	 * @generated
	 */
	CsvDataFormat getCsv();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getCsv <em>Csv</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Custom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custom' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomDataFormat getCustom();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getCustom <em>Custom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom</em>' containment reference.
	 * @see #getCustom()
	 * @generated
	 */
	void setCustom(CustomDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Dfdl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dfdl' namespace='##targetNamespace'"
	 * @generated
	 */
	DfdlDataFormat getDfdl();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getDfdl <em>Dfdl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dfdl</em>' containment reference.
	 * @see #getDfdl()
	 * @generated
	 */
	void setDfdl(DfdlDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_FhirJson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fhirJson' namespace='##targetNamespace'"
	 * @generated
	 */
	FhirJsonDataFormat getFhirJson();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getFhirJson <em>Fhir Json</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_FhirXml()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fhirXml' namespace='##targetNamespace'"
	 * @generated
	 */
	FhirXmlDataFormat getFhirXml();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getFhirXml <em>Fhir Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir Xml</em>' containment reference.
	 * @see #getFhirXml()
	 * @generated
	 */
	void setFhirXml(FhirXmlDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Flatpack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flatpack' namespace='##targetNamespace'"
	 * @generated
	 */
	FlatpackDataFormat getFlatpack();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getFlatpack <em>Flatpack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flatpack</em>' containment reference.
	 * @see #getFlatpack()
	 * @generated
	 */
	void setFlatpack(FlatpackDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Fory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fory' namespace='##targetNamespace'"
	 * @generated
	 */
	ForyDataFormat getFory();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getFory <em>Fory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fory</em>' containment reference.
	 * @see #getFory()
	 * @generated
	 */
	void setFory(ForyDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Grok()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='grok' namespace='##targetNamespace'"
	 * @generated
	 */
	GrokDataFormat getGrok();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getGrok <em>Grok</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grok</em>' containment reference.
	 * @see #getGrok()
	 * @generated
	 */
	void setGrok(GrokDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_GzipDeflater()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gzipDeflater' namespace='##targetNamespace'"
	 * @generated
	 */
	GzipDeflaterDataFormat getGzipDeflater();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getGzipDeflater <em>Gzip Deflater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gzip Deflater</em>' containment reference.
	 * @see #getGzipDeflater()
	 * @generated
	 */
	void setGzipDeflater(GzipDeflaterDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Hl7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hl7' namespace='##targetNamespace'"
	 * @generated
	 */
	Hl7DataFormat getHl7();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getHl7 <em>Hl7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hl7</em>' containment reference.
	 * @see #getHl7()
	 * @generated
	 */
	void setHl7(Hl7DataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Ical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ical' namespace='##targetNamespace'"
	 * @generated
	 */
	IcalDataFormat getIcal();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getIcal <em>Ical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ical</em>' containment reference.
	 * @see #getIcal()
	 * @generated
	 */
	void setIcal(IcalDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Iso8583()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='iso8583' namespace='##targetNamespace'"
	 * @generated
	 */
	Iso8583DataFormat getIso8583();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getIso8583 <em>Iso8583</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_JacksonXml()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jacksonXml' namespace='##targetNamespace'"
	 * @generated
	 */
	JacksonXMLDataFormat getJacksonXml();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getJacksonXml <em>Jackson Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jackson Xml</em>' containment reference.
	 * @see #getJacksonXml()
	 * @generated
	 */
	void setJacksonXml(JacksonXMLDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Jaxb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jaxb' namespace='##targetNamespace'"
	 * @generated
	 */
	JaxbDataFormat getJaxb();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getJaxb <em>Jaxb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jaxb</em>' containment reference.
	 * @see #getJaxb()
	 * @generated
	 */
	void setJaxb(JaxbDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Json()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='json' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonDataFormat getJson();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getJson <em>Json</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_JsonApi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jsonApi' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonApiDataFormat getJsonApi();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getJsonApi <em>Json Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Api</em>' containment reference.
	 * @see #getJsonApi()
	 * @generated
	 */
	void setJsonApi(JsonApiDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Lzf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lzf' namespace='##targetNamespace'"
	 * @generated
	 */
	LzfDataFormat getLzf();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getLzf <em>Lzf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lzf</em>' containment reference.
	 * @see #getLzf()
	 * @generated
	 */
	void setLzf(LzfDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_MimeMultipart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mimeMultipart' namespace='##targetNamespace'"
	 * @generated
	 */
	MimeMultipartDataFormat getMimeMultipart();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getMimeMultipart <em>Mime Multipart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Multipart</em>' containment reference.
	 * @see #getMimeMultipart()
	 * @generated
	 */
	void setMimeMultipart(MimeMultipartDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_ParquetAvro()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parquetAvro' namespace='##targetNamespace'"
	 * @generated
	 */
	ParquetAvroDataFormat getParquetAvro();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getParquetAvro <em>Parquet Avro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parquet Avro</em>' containment reference.
	 * @see #getParquetAvro()
	 * @generated
	 */
	void setParquetAvro(ParquetAvroDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Protobuf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protobuf' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtobufDataFormat getProtobuf();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getProtobuf <em>Protobuf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protobuf</em>' containment reference.
	 * @see #getProtobuf()
	 * @generated
	 */
	void setProtobuf(ProtobufDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Rss()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rss' namespace='##targetNamespace'"
	 * @generated
	 */
	RssDataFormat getRss();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getRss <em>Rss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rss</em>' containment reference.
	 * @see #getRss()
	 * @generated
	 */
	void setRss(RssDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Smooks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='smooks' namespace='##targetNamespace'"
	 * @generated
	 */
	SmooksDataFormat getSmooks();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getSmooks <em>Smooks</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Soap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='soap' namespace='##targetNamespace'"
	 * @generated
	 */
	SoapDataFormat getSoap();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getSoap <em>Soap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soap</em>' containment reference.
	 * @see #getSoap()
	 * @generated
	 */
	void setSoap(SoapDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_SwiftMt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='swiftMt' namespace='##targetNamespace'"
	 * @generated
	 */
	SwiftMtDataFormat getSwiftMt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getSwiftMt <em>Swift Mt</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_SwiftMx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='swiftMx' namespace='##targetNamespace'"
	 * @generated
	 */
	SwiftMxDataFormat getSwiftMx();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getSwiftMx <em>Swift Mx</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Syslog()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='syslog' namespace='##targetNamespace'"
	 * @generated
	 */
	SyslogDataFormat getSyslog();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getSyslog <em>Syslog</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_TarFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tarFile' namespace='##targetNamespace'"
	 * @generated
	 */
	TarFileDataFormat getTarFile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getTarFile <em>Tar File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tar File</em>' containment reference.
	 * @see #getTarFile()
	 * @generated
	 */
	void setTarFile(TarFileDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Thrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thrift' namespace='##targetNamespace'"
	 * @generated
	 */
	ThriftDataFormat getThrift();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getThrift <em>Thrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrift</em>' containment reference.
	 * @see #getThrift()
	 * @generated
	 */
	void setThrift(ThriftDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_TidyMarkup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tidyMarkup' namespace='##targetNamespace'"
	 * @generated
	 */
	TidyMarkupDataFormat getTidyMarkup();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getTidyMarkup <em>Tidy Markup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tidy Markup</em>' containment reference.
	 * @see #getTidyMarkup()
	 * @generated
	 */
	void setTidyMarkup(TidyMarkupDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_UnivocityCsv()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='univocityCsv' namespace='##targetNamespace'"
	 * @generated
	 */
	UniVocityCsvDataFormat getUnivocityCsv();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getUnivocityCsv <em>Univocity Csv</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_UnivocityFixed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='univocityFixed' namespace='##targetNamespace'"
	 * @generated
	 */
	UniVocityFixedDataFormat getUnivocityFixed();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getUnivocityFixed <em>Univocity Fixed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Univocity Fixed</em>' containment reference.
	 * @see #getUnivocityFixed()
	 * @generated
	 */
	void setUnivocityFixed(UniVocityFixedDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_UnivocityTsv()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='univocityTsv' namespace='##targetNamespace'"
	 * @generated
	 */
	UniVocityTsvDataFormat getUnivocityTsv();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getUnivocityTsv <em>Univocity Tsv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Univocity Tsv</em>' containment reference.
	 * @see #getUnivocityTsv()
	 * @generated
	 */
	void setUnivocityTsv(UniVocityTsvDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_XmlSecurity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xmlSecurity' namespace='##targetNamespace'"
	 * @generated
	 */
	XmlSecurityDataFormat getXmlSecurity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getXmlSecurity <em>Xml Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Security</em>' containment reference.
	 * @see #getXmlSecurity()
	 * @generated
	 */
	void setXmlSecurity(XmlSecurityDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Pgp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pgp' namespace='##targetNamespace'"
	 * @generated
	 */
	PgpDataFormat getPgp();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getPgp <em>Pgp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgp</em>' containment reference.
	 * @see #getPgp()
	 * @generated
	 */
	void setPgp(PgpDataFormat value);

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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_Yaml()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='yaml' namespace='##targetNamespace'"
	 * @generated
	 */
	YamlDataFormat getYaml();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getYaml <em>Yaml</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_ZipDeflater()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zipDeflater' namespace='##targetNamespace'"
	 * @generated
	 */
	ZipDeflaterDataFormat getZipDeflater();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getZipDeflater <em>Zip Deflater</em>}' containment reference.
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
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_ZipFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zipFile' namespace='##targetNamespace'"
	 * @generated
	 */
	ZipFileDataFormat getZipFile();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getZipFile <em>Zip File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip File</em>' containment reference.
	 * @see #getZipFile()
	 * @generated
	 */
	void setZipFile(ZipFileDataFormat value);

	/**
	 * Returns the value of the '<em><b>Variable Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a variable to store the received message body (only body, not headers). This makes it handy to use variables for
	 * user data and to easily control what data to use for sending and receiving. Important: When using receive variable then
	 * the received body is stored only in this variable and not on the current message.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Receive</em>' attribute.
	 * @see #setVariableReceive(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_VariableReceive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='variableReceive'"
	 * @generated
	 */
	String getVariableReceive();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getVariableReceive <em>Variable Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Receive</em>' attribute.
	 * @see #getVariableReceive()
	 * @generated
	 */
	void setVariableReceive(String value);

	/**
	 * Returns the value of the '<em><b>Variable Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * To use a variable as the source for the message body to send. This makes it handy to use variables for user data and to
	 * easily control what data to use for sending and receiving. Important: When using send variable then the message body is
	 * taken from this variable instead of the current message, however the headers from the message will still be used as
	 * well. In other words, the variable is used instead of the message body, but everything else is as usual.
	 * 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Send</em>' attribute.
	 * @see #setVariableSend(String)
	 * @see org.eclipse.fennec.camel.camelspring.CamelSpringPackage#getMarshalDefinition_VariableSend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='variableSend'"
	 * @generated
	 */
	String getVariableSend();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.camel.camelspring.MarshalDefinition#getVariableSend <em>Variable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Send</em>' attribute.
	 * @see #getVariableSend()
	 * @generated
	 */
	void setVariableSend(String value);

} // MarshalDefinition

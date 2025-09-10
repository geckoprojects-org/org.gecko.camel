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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

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
import org.eclipse.fennec.camel.camelspring.DataFormatsDefinition;
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
import org.eclipse.fennec.camel.camelspring.XmlSecurityDataFormat;
import org.eclipse.fennec.camel.camelspring.YamlDataFormat;
import org.eclipse.fennec.camel.camelspring.ZipDeflaterDataFormat;
import org.eclipse.fennec.camel.camelspring.ZipFileDataFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Formats Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getAsn1 <em>Asn1</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getAvro <em>Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getBarcode <em>Barcode</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getBase64 <em>Base64</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getBeanio <em>Beanio</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getCbor <em>Cbor</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getFhirJson <em>Fhir Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getFhirXml <em>Fhir Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getFory <em>Fory</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getGrok <em>Grok</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getGzipDeflater <em>Gzip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getIcal <em>Ical</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getIso8583 <em>Iso8583</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getJacksonXml <em>Jackson Xml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getJson <em>Json</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getJsonApi <em>Json Api</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getLzf <em>Lzf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getMimeMultipart <em>Mime Multipart</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getParquetAvro <em>Parquet Avro</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getPgp <em>Pgp</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getRss <em>Rss</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getSmooks <em>Smooks</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getSoap <em>Soap</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getSwiftMt <em>Swift Mt</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getSwiftMx <em>Swift Mx</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getTarFile <em>Tar File</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getThrift <em>Thrift</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getUnivocityCsv <em>Univocity Csv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getUnivocityFixed <em>Univocity Fixed</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getUnivocityTsv <em>Univocity Tsv</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getXmlSecurity <em>Xml Security</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getYaml <em>Yaml</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getZipDeflater <em>Zip Deflater</em>}</li>
 *   <li>{@link org.eclipse.fennec.camel.camelspring.impl.DataFormatsDefinitionImpl#getZipFile <em>Zip File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFormatsDefinitionImpl extends MinimalEObjectImpl.Container implements DataFormatsDefinition {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFormatsDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamelSpringPackage.eINSTANCE.getDataFormatsDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CamelSpringPackage.DATA_FORMATS_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asn1DataFormat> getAsn1() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Asn1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AvroDataFormat> getAvro() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Avro());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BarcodeDataFormat> getBarcode() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Barcode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Base64DataFormat> getBase64() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Base64());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BeanioDataFormat> getBeanio() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Beanio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BindyDataFormat> getBindy() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Bindy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CborDataFormat> getCbor() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Cbor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CryptoDataFormat> getCrypto() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Crypto());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CsvDataFormat> getCsv() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Csv());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CustomDataFormat> getCustom() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Custom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FhirJsonDataFormat> getFhirJson() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_FhirJson());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FhirXmlDataFormat> getFhirXml() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_FhirXml());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlatpackDataFormat> getFlatpack() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Flatpack());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForyDataFormat> getFory() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Fory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GrokDataFormat> getGrok() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Grok());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GzipDeflaterDataFormat> getGzipDeflater() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_GzipDeflater());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hl7DataFormat> getHl7() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Hl7());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IcalDataFormat> getIcal() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Ical());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Iso8583DataFormat> getIso8583() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Iso8583());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JacksonXMLDataFormat> getJacksonXml() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_JacksonXml());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JaxbDataFormat> getJaxb() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Jaxb());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JsonDataFormat> getJson() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Json());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JsonApiDataFormat> getJsonApi() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_JsonApi());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LzfDataFormat> getLzf() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Lzf());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MimeMultipartDataFormat> getMimeMultipart() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_MimeMultipart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParquetAvroDataFormat> getParquetAvro() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_ParquetAvro());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PgpDataFormat> getPgp() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Pgp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProtobufDataFormat> getProtobuf() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Protobuf());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RssDataFormat> getRss() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Rss());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SmooksDataFormat> getSmooks() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Smooks());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SoapDataFormat> getSoap() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Soap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwiftMtDataFormat> getSwiftMt() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_SwiftMt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwiftMxDataFormat> getSwiftMx() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_SwiftMx());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SyslogDataFormat> getSyslog() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Syslog());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TarFileDataFormat> getTarFile() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_TarFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThriftDataFormat> getThrift() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Thrift());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TidyMarkupDataFormat> getTidyMarkup() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_TidyMarkup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UniVocityCsvDataFormat> getUnivocityCsv() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_UnivocityCsv());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UniVocityFixedDataFormat> getUnivocityFixed() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_UnivocityFixed());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UniVocityTsvDataFormat> getUnivocityTsv() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_UnivocityTsv());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XmlSecurityDataFormat> getXmlSecurity() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_XmlSecurity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<YamlDataFormat> getYaml() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_Yaml());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZipDeflaterDataFormat> getZipDeflater() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_ZipDeflater());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZipFileDataFormat> getZipFile() {
		return getGroup().list(CamelSpringPackage.eINSTANCE.getDataFormatsDefinition_ZipFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ASN1:
				return ((InternalEList<?>)getAsn1()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__AVRO:
				return ((InternalEList<?>)getAvro()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BARCODE:
				return ((InternalEList<?>)getBarcode()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BASE64:
				return ((InternalEList<?>)getBase64()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BEANIO:
				return ((InternalEList<?>)getBeanio()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BINDY:
				return ((InternalEList<?>)getBindy()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CBOR:
				return ((InternalEList<?>)getCbor()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CRYPTO:
				return ((InternalEList<?>)getCrypto()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CSV:
				return ((InternalEList<?>)getCsv()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CUSTOM:
				return ((InternalEList<?>)getCustom()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FHIR_JSON:
				return ((InternalEList<?>)getFhirJson()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FHIR_XML:
				return ((InternalEList<?>)getFhirXml()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FLATPACK:
				return ((InternalEList<?>)getFlatpack()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FORY:
				return ((InternalEList<?>)getFory()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GROK:
				return ((InternalEList<?>)getGrok()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GZIP_DEFLATER:
				return ((InternalEList<?>)getGzipDeflater()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__HL7:
				return ((InternalEList<?>)getHl7()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ICAL:
				return ((InternalEList<?>)getIcal()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ISO8583:
				return ((InternalEList<?>)getIso8583()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JACKSON_XML:
				return ((InternalEList<?>)getJacksonXml()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JAXB:
				return ((InternalEList<?>)getJaxb()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JSON:
				return ((InternalEList<?>)getJson()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JSON_API:
				return ((InternalEList<?>)getJsonApi()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__LZF:
				return ((InternalEList<?>)getLzf()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__MIME_MULTIPART:
				return ((InternalEList<?>)getMimeMultipart()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PARQUET_AVRO:
				return ((InternalEList<?>)getParquetAvro()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PGP:
				return ((InternalEList<?>)getPgp()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PROTOBUF:
				return ((InternalEList<?>)getProtobuf()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__RSS:
				return ((InternalEList<?>)getRss()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SMOOKS:
				return ((InternalEList<?>)getSmooks()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SOAP:
				return ((InternalEList<?>)getSoap()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SWIFT_MT:
				return ((InternalEList<?>)getSwiftMt()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SWIFT_MX:
				return ((InternalEList<?>)getSwiftMx()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SYSLOG:
				return ((InternalEList<?>)getSyslog()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__TAR_FILE:
				return ((InternalEList<?>)getTarFile()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__THRIFT:
				return ((InternalEList<?>)getThrift()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__TIDY_MARKUP:
				return ((InternalEList<?>)getTidyMarkup()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_CSV:
				return ((InternalEList<?>)getUnivocityCsv()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_FIXED:
				return ((InternalEList<?>)getUnivocityFixed()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_TSV:
				return ((InternalEList<?>)getUnivocityTsv()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__XML_SECURITY:
				return ((InternalEList<?>)getXmlSecurity()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__YAML:
				return ((InternalEList<?>)getYaml()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ZIP_DEFLATER:
				return ((InternalEList<?>)getZipDeflater()).basicRemove(otherEnd, msgs);
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ZIP_FILE:
				return ((InternalEList<?>)getZipFile()).basicRemove(otherEnd, msgs);
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
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ASN1:
				return getAsn1();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__AVRO:
				return getAvro();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BARCODE:
				return getBarcode();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BASE64:
				return getBase64();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BEANIO:
				return getBeanio();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BINDY:
				return getBindy();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CBOR:
				return getCbor();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CRYPTO:
				return getCrypto();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CSV:
				return getCsv();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CUSTOM:
				return getCustom();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FHIR_JSON:
				return getFhirJson();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FHIR_XML:
				return getFhirXml();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FLATPACK:
				return getFlatpack();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FORY:
				return getFory();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GROK:
				return getGrok();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GZIP_DEFLATER:
				return getGzipDeflater();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__HL7:
				return getHl7();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ICAL:
				return getIcal();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ISO8583:
				return getIso8583();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JACKSON_XML:
				return getJacksonXml();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JAXB:
				return getJaxb();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JSON:
				return getJson();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JSON_API:
				return getJsonApi();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__LZF:
				return getLzf();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__MIME_MULTIPART:
				return getMimeMultipart();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PARQUET_AVRO:
				return getParquetAvro();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PGP:
				return getPgp();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PROTOBUF:
				return getProtobuf();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__RSS:
				return getRss();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SMOOKS:
				return getSmooks();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SOAP:
				return getSoap();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SWIFT_MT:
				return getSwiftMt();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SWIFT_MX:
				return getSwiftMx();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SYSLOG:
				return getSyslog();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__TAR_FILE:
				return getTarFile();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__THRIFT:
				return getThrift();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__TIDY_MARKUP:
				return getTidyMarkup();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_CSV:
				return getUnivocityCsv();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_FIXED:
				return getUnivocityFixed();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_TSV:
				return getUnivocityTsv();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__XML_SECURITY:
				return getXmlSecurity();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__YAML:
				return getYaml();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ZIP_DEFLATER:
				return getZipDeflater();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ZIP_FILE:
				return getZipFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ASN1:
				getAsn1().clear();
				getAsn1().addAll((Collection<? extends Asn1DataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__AVRO:
				getAvro().clear();
				getAvro().addAll((Collection<? extends AvroDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BARCODE:
				getBarcode().clear();
				getBarcode().addAll((Collection<? extends BarcodeDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BASE64:
				getBase64().clear();
				getBase64().addAll((Collection<? extends Base64DataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BEANIO:
				getBeanio().clear();
				getBeanio().addAll((Collection<? extends BeanioDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BINDY:
				getBindy().clear();
				getBindy().addAll((Collection<? extends BindyDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CBOR:
				getCbor().clear();
				getCbor().addAll((Collection<? extends CborDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CRYPTO:
				getCrypto().clear();
				getCrypto().addAll((Collection<? extends CryptoDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CSV:
				getCsv().clear();
				getCsv().addAll((Collection<? extends CsvDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CUSTOM:
				getCustom().clear();
				getCustom().addAll((Collection<? extends CustomDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FHIR_JSON:
				getFhirJson().clear();
				getFhirJson().addAll((Collection<? extends FhirJsonDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FHIR_XML:
				getFhirXml().clear();
				getFhirXml().addAll((Collection<? extends FhirXmlDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FLATPACK:
				getFlatpack().clear();
				getFlatpack().addAll((Collection<? extends FlatpackDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FORY:
				getFory().clear();
				getFory().addAll((Collection<? extends ForyDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GROK:
				getGrok().clear();
				getGrok().addAll((Collection<? extends GrokDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GZIP_DEFLATER:
				getGzipDeflater().clear();
				getGzipDeflater().addAll((Collection<? extends GzipDeflaterDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__HL7:
				getHl7().clear();
				getHl7().addAll((Collection<? extends Hl7DataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ICAL:
				getIcal().clear();
				getIcal().addAll((Collection<? extends IcalDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ISO8583:
				getIso8583().clear();
				getIso8583().addAll((Collection<? extends Iso8583DataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JACKSON_XML:
				getJacksonXml().clear();
				getJacksonXml().addAll((Collection<? extends JacksonXMLDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JAXB:
				getJaxb().clear();
				getJaxb().addAll((Collection<? extends JaxbDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JSON:
				getJson().clear();
				getJson().addAll((Collection<? extends JsonDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JSON_API:
				getJsonApi().clear();
				getJsonApi().addAll((Collection<? extends JsonApiDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__LZF:
				getLzf().clear();
				getLzf().addAll((Collection<? extends LzfDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__MIME_MULTIPART:
				getMimeMultipart().clear();
				getMimeMultipart().addAll((Collection<? extends MimeMultipartDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PARQUET_AVRO:
				getParquetAvro().clear();
				getParquetAvro().addAll((Collection<? extends ParquetAvroDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PGP:
				getPgp().clear();
				getPgp().addAll((Collection<? extends PgpDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PROTOBUF:
				getProtobuf().clear();
				getProtobuf().addAll((Collection<? extends ProtobufDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__RSS:
				getRss().clear();
				getRss().addAll((Collection<? extends RssDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SMOOKS:
				getSmooks().clear();
				getSmooks().addAll((Collection<? extends SmooksDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SOAP:
				getSoap().clear();
				getSoap().addAll((Collection<? extends SoapDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SWIFT_MT:
				getSwiftMt().clear();
				getSwiftMt().addAll((Collection<? extends SwiftMtDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SWIFT_MX:
				getSwiftMx().clear();
				getSwiftMx().addAll((Collection<? extends SwiftMxDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SYSLOG:
				getSyslog().clear();
				getSyslog().addAll((Collection<? extends SyslogDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__TAR_FILE:
				getTarFile().clear();
				getTarFile().addAll((Collection<? extends TarFileDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__THRIFT:
				getThrift().clear();
				getThrift().addAll((Collection<? extends ThriftDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__TIDY_MARKUP:
				getTidyMarkup().clear();
				getTidyMarkup().addAll((Collection<? extends TidyMarkupDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_CSV:
				getUnivocityCsv().clear();
				getUnivocityCsv().addAll((Collection<? extends UniVocityCsvDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_FIXED:
				getUnivocityFixed().clear();
				getUnivocityFixed().addAll((Collection<? extends UniVocityFixedDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_TSV:
				getUnivocityTsv().clear();
				getUnivocityTsv().addAll((Collection<? extends UniVocityTsvDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__XML_SECURITY:
				getXmlSecurity().clear();
				getXmlSecurity().addAll((Collection<? extends XmlSecurityDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__YAML:
				getYaml().clear();
				getYaml().addAll((Collection<? extends YamlDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ZIP_DEFLATER:
				getZipDeflater().clear();
				getZipDeflater().addAll((Collection<? extends ZipDeflaterDataFormat>)newValue);
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ZIP_FILE:
				getZipFile().clear();
				getZipFile().addAll((Collection<? extends ZipFileDataFormat>)newValue);
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
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ASN1:
				getAsn1().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__AVRO:
				getAvro().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BARCODE:
				getBarcode().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BASE64:
				getBase64().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BEANIO:
				getBeanio().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BINDY:
				getBindy().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CBOR:
				getCbor().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CRYPTO:
				getCrypto().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CSV:
				getCsv().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CUSTOM:
				getCustom().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FHIR_JSON:
				getFhirJson().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FHIR_XML:
				getFhirXml().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FLATPACK:
				getFlatpack().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FORY:
				getFory().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GROK:
				getGrok().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GZIP_DEFLATER:
				getGzipDeflater().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__HL7:
				getHl7().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ICAL:
				getIcal().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ISO8583:
				getIso8583().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JACKSON_XML:
				getJacksonXml().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JAXB:
				getJaxb().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JSON:
				getJson().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JSON_API:
				getJsonApi().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__LZF:
				getLzf().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__MIME_MULTIPART:
				getMimeMultipart().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PARQUET_AVRO:
				getParquetAvro().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PGP:
				getPgp().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PROTOBUF:
				getProtobuf().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__RSS:
				getRss().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SMOOKS:
				getSmooks().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SOAP:
				getSoap().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SWIFT_MT:
				getSwiftMt().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SWIFT_MX:
				getSwiftMx().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SYSLOG:
				getSyslog().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__TAR_FILE:
				getTarFile().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__THRIFT:
				getThrift().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__TIDY_MARKUP:
				getTidyMarkup().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_CSV:
				getUnivocityCsv().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_FIXED:
				getUnivocityFixed().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_TSV:
				getUnivocityTsv().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__XML_SECURITY:
				getXmlSecurity().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__YAML:
				getYaml().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ZIP_DEFLATER:
				getZipDeflater().clear();
				return;
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ZIP_FILE:
				getZipFile().clear();
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
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ASN1:
				return !getAsn1().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__AVRO:
				return !getAvro().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BARCODE:
				return !getBarcode().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BASE64:
				return !getBase64().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BEANIO:
				return !getBeanio().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__BINDY:
				return !getBindy().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CBOR:
				return !getCbor().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CRYPTO:
				return !getCrypto().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CSV:
				return !getCsv().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__CUSTOM:
				return !getCustom().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FHIR_JSON:
				return !getFhirJson().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FHIR_XML:
				return !getFhirXml().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FLATPACK:
				return !getFlatpack().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__FORY:
				return !getFory().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GROK:
				return !getGrok().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__GZIP_DEFLATER:
				return !getGzipDeflater().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__HL7:
				return !getHl7().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ICAL:
				return !getIcal().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ISO8583:
				return !getIso8583().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JACKSON_XML:
				return !getJacksonXml().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JAXB:
				return !getJaxb().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JSON:
				return !getJson().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__JSON_API:
				return !getJsonApi().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__LZF:
				return !getLzf().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__MIME_MULTIPART:
				return !getMimeMultipart().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PARQUET_AVRO:
				return !getParquetAvro().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PGP:
				return !getPgp().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__PROTOBUF:
				return !getProtobuf().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__RSS:
				return !getRss().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SMOOKS:
				return !getSmooks().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SOAP:
				return !getSoap().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SWIFT_MT:
				return !getSwiftMt().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SWIFT_MX:
				return !getSwiftMx().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__SYSLOG:
				return !getSyslog().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__TAR_FILE:
				return !getTarFile().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__THRIFT:
				return !getThrift().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__TIDY_MARKUP:
				return !getTidyMarkup().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_CSV:
				return !getUnivocityCsv().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_FIXED:
				return !getUnivocityFixed().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__UNIVOCITY_TSV:
				return !getUnivocityTsv().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__XML_SECURITY:
				return !getXmlSecurity().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__YAML:
				return !getYaml().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ZIP_DEFLATER:
				return !getZipDeflater().isEmpty();
			case CamelSpringPackage.DATA_FORMATS_DEFINITION__ZIP_FILE:
				return !getZipFile().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //DataFormatsDefinitionImpl

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
 *     Data In Motion - initial API and implementation
 */
package org.eclipse.fennec.kafka.emf;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * Constants class
 * @author Mark Hoffmann
 * @since 13.09.2025
 */
public interface KafkaEMFConstants {

	public static final String KAFKA_EMF_RESOURCE_SET = "kafka.emf.resourceSet";
	public static final String KAFKA_EMF_FORMAT = "kafka.emf.format";
	
	public static final String KAFKA_EMF_FORMAT_BIN = "binary";
	public static final String KAFKA_EMF_FORMAT_XMI = "xmi";
	public static final String KAFKA_EMF_FORMAT_XML = "xml";
	public static final String KAFKA_EMF_FORMAT_JSON = "json";
	
	static Map<String, Object> createBinarySaveOptions() {
        Map<String, Object> options = new HashMap<>();
        
        options.put(XMLResource.OPTION_BINARY, Boolean.TRUE);
        
        options.put(XMLResource.OPTION_FORMATTED, Boolean.FALSE);
        options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.FALSE);
        options.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);
        
        options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
        options.put(XMLResource.OPTION_SKIP_ESCAPE_URI, Boolean.TRUE);
        options.put(BinaryResourceImpl.OPTION_BUFFER_CAPACITY, 2048);
        
        return options;
    }
    
    static Map<String, Object> createBinaryLoadOptions() {
        Map<String, Object> options = new HashMap<>();
        options.put(XMLResource.OPTION_BINARY, Boolean.TRUE);
        options.put(XMLResource.OPTION_DISABLE_NOTIFY, Boolean.TRUE);
        options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);
        options.put(BinaryResourceImpl.OPTION_BUFFER_CAPACITY, 2048);
        return options;
    }
	
}

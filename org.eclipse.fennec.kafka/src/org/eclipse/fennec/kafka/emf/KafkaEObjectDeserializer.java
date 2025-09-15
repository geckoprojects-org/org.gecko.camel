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

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.kafka.common.serialization.Deserializer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;

/**
 * EObject de-serializer for Kafka. 
 * If no {@link ResourceSet} was given in the constructor, it expects the property {@link KafkaEMFConstants#KAFKA_EMF_RESOURCE_SET} containing an {@link ResourceSet} in the configuration {@link Map}
 *  
 * @author Mark Hoffmann
 * @since 13.09.2025
 */
public class KafkaEObjectDeserializer implements Deserializer<EObject>, KafkaEMFConstants {

	private ResourceSet resourceSet;
	private String format = KAFKA_EMF_FORMAT_XMI;
	private final Map<String, Object> loadOptions;

	public KafkaEObjectDeserializer(ResourceSet resourceSet, Map<String, Object> loadOptions) {
		this();
		if (nonNull(loadOptions)) {
			this.loadOptions.putAll(loadOptions);
		}
		this.resourceSet = resourceSet;
	}

	// Default constructor for Kafka reflection
	public KafkaEObjectDeserializer() {
		loadOptions = new HashMap<>();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.apache.kafka.common.serialization.Deserializer#configure(java.util.Map, boolean)
	 */
	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {

		if (isNull(resourceSet) && 
				configs.containsKey(KAFKA_EMF_RESOURCE_SET)) {
			// TODO check for instance first. if no resource set throw appropriate exception, that type ResourceSet is expected
			resourceSet = (ResourceSet) configs.get(KAFKA_EMF_RESOURCE_SET);
		}
		requireNonNull(resourceSet, "Cannot configure EObjectSerializer without ResourceSet. Please add it to the Configuration using the 'kafka.emf.resourceSet' property");
		
		if (KAFKA_EMF_FORMAT_BIN.equals(configs.get(KAFKA_EMF_FORMAT))) {
			format = KAFKA_EMF_FORMAT_BIN;
			loadOptions.putAll(KafkaEMFConstants.createBinaryLoadOptions());
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.apache.kafka.common.serialization.Deserializer#deserialize(java.lang.String, byte[])
	 */
	@Override
	public EObject deserialize(String topic, byte[] data) {
		if (isNull(data)) {
			return null;
		}
	
		try {
			// Thread-sicheren URI generieren
			String tempUri = String.format("kafka-%s.%s", 
					topic + UUID.randomUUID().toString(), 
					getFileExtension());
			Resource resource = resourceSet.createResource(URI.createURI(tempUri));
			if (!(resource instanceof BinaryResourceImpl)) {
	            throw new IllegalStateException("Resource is not a BinaryResourceImpl " + resource.toString());
	        }
			try {
				ByteArrayInputStream bais = new ByteArrayInputStream(data);
				resource.load(bais, loadOptions);
				if (!resource.getContents().isEmpty()) {
					return resource.getContents().get(0);
				}
				return null;
	
			} finally {
				// Resource cleanup
				resource.getContents().clear();
				synchronized (resourceSet) {
					resourceSet.getResources().remove(resource);
				}
			}
	
		} catch (IOException e) {
			throw new RuntimeException("Failed to de-serialize EObject with ResourceSet", e);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.apache.kafka.common.serialization.Deserializer#close()
	 */
	@Override
	public void close() {
	}

	private String getFileExtension() {
		return "binary".equals(format) ? "bin" : "xmi";
	}
}
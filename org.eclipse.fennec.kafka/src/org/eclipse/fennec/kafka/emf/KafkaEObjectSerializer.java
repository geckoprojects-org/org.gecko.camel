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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.kafka.common.serialization.Serializer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;

/**
 * EObject serializer for Kafka. 
 * If no {@link ResourceSet} was given in the constructor, it expects the property {@link KafkaEMFConstants#KAFKA_EMF_RESOURCE_SET} containing an {@link ResourceSet} in the configuration {@link Map}
 *  
 * @author Mark Hoffmann
 * @since 13.09.2025
 */
public class KafkaEObjectSerializer implements Serializer<EObject>, KafkaEMFConstants {

	private ResourceSet resourceSet;
	private String format = KAFKA_EMF_FORMAT_XMI;
	private final Map<String, Object> saveOptions;

	public KafkaEObjectSerializer(ResourceSet resourceSet, Map<String, Object> saveOptions) {
		this();
		if (nonNull(saveOptions)) {
			this.saveOptions.putAll(saveOptions);
		}
		this.resourceSet = resourceSet;
	}

	// Default constructor for Kafka reflection
	public KafkaEObjectSerializer() {
		saveOptions = new HashMap<>();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.apache.kafka.common.serialization.Serializer#configure(java.util.Map, boolean)
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
			saveOptions.putAll(KafkaEMFConstants.createBinarySaveOptions());
		}
	}

	@Override
	public byte[] serialize(String topic, EObject eObject) {
		if (isNull(eObject)) {
			return null;
		}

		try {
			// Thread-sicheren URI generieren
			String tempUri = String.format("kafka-%s.%s", 
					UUID.randomUUID().toString(), 
					getFileExtension());
			Resource resource = resourceSet.createResource(URI.createURI(tempUri));
			if (!(resource instanceof BinaryResourceImpl)) {
	            throw new IllegalStateException("Resource is not a BinaryResource");
	        }
			try {
				resource.getContents().add(eObject);

				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				resource.save(outputStream, saveOptions);
				return outputStream.toByteArray();

			} finally {
				// Resource cleanup
				resource.getContents().clear();
				synchronized (resourceSet) {
					resourceSet.getResources().remove(resource);
				}
			}

		} catch (IOException e) {
			throw new RuntimeException("Failed to serialize EObject with OSGi ResourceSet", e);
		}
	}

	private String getFileExtension() {
		return "binary".equals(format) ? "bin" : "xmi";
	}

	@Override
	public void close() {
	}
}
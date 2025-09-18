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
package org.eclipse.fennec.kafka;

import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fennec.demo.addressbook.AddressBookFactory;
import org.eclipse.fennec.demo.addressbook.Contact;
import org.eclipse.fennec.demo.addressbook.ContactType;
import org.eclipse.fennec.demo.addressbook.Person;
import org.eclipse.fennec.kafka.emf.KafkaEMFConstants;
import org.eclipse.fennec.kafka.emf.KafkaEObjectSerializer;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@RequireEMF
//@Component
public class KafkaEObjectProducer {
    
    private KafkaProducer<String, EObject> producer;
    @Reference
    private AddressBookFactory factory;
    @Reference
    private ResourceSet resourceSet;
    
    @Activate
    public void activate() {
        Properties props = new Properties();
        props.put(KafkaEMFConstants.KAFKA_EMF_RESOURCE_SET, resourceSet);
        props.put(KafkaEMFConstants.KAFKA_EMF_FORMAT, KafkaEMFConstants.KAFKA_EMF_FORMAT_BIN);
        
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:19092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaEObjectSerializer.class);
        
        // Robustness Einstellungen
        props.put(ProducerConfig.ACKS_CONFIG, "all"); // Warte auf alle Replicas
        props.put(ProducerConfig.RETRIES_CONFIG, Integer.MAX_VALUE);
        props.put(ProducerConfig.MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION, 1);
        props.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, true);
        
        // Timeouts
        props.put(ProducerConfig.REQUEST_TIMEOUT_MS_CONFIG, 30000);
        props.put(ProducerConfig.DELIVERY_TIMEOUT_MS_CONFIG, 120000);
        props.put(ProducerConfig.RETRY_BACKOFF_MS_CONFIG, 1000);
        
        // Performance
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
        props.put(ProducerConfig.LINGER_MS_CONFIG, 5);
        props.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "lz4");
        
        this.producer = new KafkaProducer<>(props);
     // Health Check
        if (isHealthy()) {
            System.out.println("✅ Producer is healthy");
            
            for (int i = 0; i < 10; i++) {
            	sendPerson("person", Integer.toString(i), "Emil", "Tester", i);
            }
        } else {
            System.err.println("❌ Producer health check failed");
        }
        
    }
    
    @Deactivate
    public void deactivate() {
    	System.out.println("DEACTIVATE");
    	Executors.newSingleThreadExecutor().submit(this::shutdown);
    }
    
    public boolean sendPerson(String topic, String key, String firstName, String lastName, int i) {
    	Person p = factory.createPerson();
    	p.setFirstName(firstName + i);
    	p.setLastName(lastName + i);
    	Contact c = factory.createContact();
    	c.setType(ContactType.MOBILE);
    	c.setValue("0175-70122" + i);
    	p.getContacts().add(c);
    	
    	ProducerRecord<String, EObject> record = new ProducerRecord<>(topic, key, p);
    	try {
            Future<RecordMetadata> future = producer.send(record, (metadata, exception) -> {
                if (exception != null) {
                    System.err.printf("Async send failed: %s%n", exception.getMessage());
                } else {
                    System.out.printf("Message sent successfully: %s %s-%d-%d%n",
                            p, metadata.topic(), metadata.partition(), metadata.offset());
                }
            });
            
            // Synchron warten für Fehlerbehandlung
            RecordMetadata metadata = future.get(30, TimeUnit.SECONDS);
            System.out.printf("✅ Message delivered: %s-%d-%d%n",
                    metadata.topic(), metadata.partition(), metadata.offset());
            return true;
            
        } catch (Exception e) {
            System.err.printf("❌ Attempt sending failed: %s%n", e.getMessage());
            // Exponential backoff
            return false;
        }
    }
    
    public void shutdown() {
        System.out.println("Shutting down producer...");
        
        try {
            producer.flush();
            producer.close(Duration.ofSeconds(5l));
            System.out.println("Producer shutdown complete");
        } catch (Exception e) {
            System.err.println("Error during shutdown: " + e.getMessage());
        }
    }
    
    // Health Check
    public boolean isHealthy() {
        try {
            // Test-Nachricht senden um Connectivity zu prüfen
        	Person ping = factory.createPerson();
        	ping.setBirthDate(new Date());
            ProducerRecord<String, EObject> healthCheck = new ProducerRecord<>("health-check", "ping", ping);
            
            Future<RecordMetadata> future = producer.send(healthCheck);
            future.get(5, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            System.err.println("Health check failed: " + e.getMessage());
            return false;
        }
    }
    
}
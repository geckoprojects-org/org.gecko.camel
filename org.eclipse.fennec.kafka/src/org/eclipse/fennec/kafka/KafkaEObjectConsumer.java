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
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fennec.demo.addressbook.AddressBookFactory;
import org.eclipse.fennec.kafka.emf.KafkaEMFConstants;
import org.eclipse.fennec.kafka.emf.KafkaEObjectDeserializer;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component
public class KafkaEObjectConsumer {
    
    private KafkaConsumer<String, EObject> consumer;
    private final CountDownLatch shutdownLatch = new CountDownLatch(1);
    private volatile boolean running = true;
    @Reference
    private AddressBookFactory factory;
    @Reference
    private ResourceSet resourceSet;
    
    @Activate
    public void activate(BundleContext bctx) {
    	System.out.println("ACTIVATE ...");
        Properties props = new Properties();
        props.put(KafkaEMFConstants.KAFKA_EMF_RESOURCE_SET, resourceSet);
        props.put(KafkaEMFConstants.KAFKA_EMF_FORMAT, KafkaEMFConstants.KAFKA_EMF_FORMAT_BIN);
        // Redpanda Docker Compose Setup Configuration
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:19092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "emf-consumer-group");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaEObjectDeserializer.class);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        // manual commit
//        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
        
        // Optimiert für Redpanda Single-Broker Setup
        props.put(ConsumerConfig.FETCH_MIN_BYTES_CONFIG, 1);
        props.put(ConsumerConfig.FETCH_MAX_WAIT_MS_CONFIG, 500);
        props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, 100);
        props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, 300000); // 5 minutes
        
        // Session und Heartbeat für Dev-Container
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, 30000);
        props.put(ConsumerConfig.HEARTBEAT_INTERVAL_MS_CONFIG, 10000);
        
        // Resilience Einstellungen für Docker Setup
        props.put(ConsumerConfig.RETRY_BACKOFF_MS_CONFIG, 1000);
        props.put(ConsumerConfig.RECONNECT_BACKOFF_MS_CONFIG, 1000);
        props.put(ConsumerConfig.REQUEST_TIMEOUT_MS_CONFIG, 30000);
        props.put(ConsumerConfig.CONNECTIONS_MAX_IDLE_MS_CONFIG, 540000);
        
        // Redpanda-optimierte Einstellungen
        props.put(ConsumerConfig.ISOLATION_LEVEL_CONFIG, "read_committed");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, 5000);
        props.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "lz4");
        
        this.consumer = new KafkaConsumer<>(props);
        Executors.newSingleThreadExecutor().submit(this::startConsumer);
        System.out.println("ACTIVATED");
    }
    
    public void startConsumer() {
        consumer.subscribe(Arrays.asList("person"));
        
        try {
            while (running) {
                try {
                    ConsumerRecords<String, EObject> records = consumer.poll(Duration.ofMillis(1000));
                    
                    for (ConsumerRecord<String, EObject> record : records) {
                    	processMessage(record);
//                        processWithRetry(record, 3);
                    }
                    
                } catch (WakeupException e) {
                    // Expected during shutdown
                    break;
                } catch (Exception e) {
                    System.err.println("Unexpected error in consumer loop: " + e.getMessage());
                    e.printStackTrace();
                    
                    // Short pause before retry
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        } finally {
            consumer.close();
            shutdownLatch.countDown();
        }
    }
    
    @Deactivate
    public void deactivate() {
    	System.out.println("DEACTIVATE");
    	Executors.newSingleThreadExecutor().submit(this::shutdown);
    }
    
    private void processMessage(ConsumerRecord<String, EObject> record) throws Exception {
        System.out.printf("Processing: Topic=%s, Offset=%d, Key=%s, Value=%s%n",
                record.topic(), record.offset(), record.key(), record.value());
        
    }
    
    public void shutdown() {
        System.out.println("Shutting down consumer...");
        running = false;
        consumer.wakeup();
        
        try {
            shutdownLatch.await();
            System.out.println("Consumer shutdown complete");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
}
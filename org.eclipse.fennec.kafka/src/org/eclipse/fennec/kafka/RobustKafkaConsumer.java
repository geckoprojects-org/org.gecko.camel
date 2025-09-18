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
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.osgi.framework.BundleContext;

//@Component
public class RobustKafkaConsumer {
    
    private KafkaConsumer<String, String> consumer;
    private final CountDownLatch shutdownLatch = new CountDownLatch(1);
    private volatile boolean running = true;
    
    public RobustKafkaConsumer() {

        
        // Shutdown Hook für graceful shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));
    }
    
    @Activate
    public void activate(BundleContext bctx) {
    	System.out.println("ACTIVATE ...");
        Properties props = new Properties();
        // Redpanda Docker Compose Setup Configuration
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:19092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "robust-consumer-group");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
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
        consumer.subscribe(Arrays.asList("dummy"));
        
        try {
            while (running) {
                try {
                    ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
                    
                    for (ConsumerRecord<String, String> record : records) {
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
    
    private void processWithRetry(ConsumerRecord<String, String> record, int maxRetries) {
        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            try {
                // Nachricht verarbeiten
                processMessage(record);
                // Manueller Commit nach erfolgreicher Verarbeitung
//                Map<TopicPartition, OffsetAndMetadata> commitMap = new HashMap<>();
//                commitMap.put(
//                    new TopicPartition(record.topic(), record.partition()),
//                    new OffsetAndMetadata(record.offset() + 1)
//                );
//                consumer.commitSync(commitMap);
                return; // Erfolgreich verarbeitet
                
            } catch (Exception e) {
                System.err.printf("Attempt %d/%d failed for message at offset %d: %s%n",
                        attempt, maxRetries, record.offset(), e.getMessage());
                
                if (attempt == maxRetries) {
                    // Nach allen Versuchen -> Dead Letter Queue oder Logging
                    handlePoisonMessage(record, e);
                } else {
                    // Exponential Backoff
                    try {
                        Thread.sleep(1000 * attempt);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }
    }
    
    private void processMessage(ConsumerRecord<String, String> record) throws Exception {
        System.out.printf("Processing: Topic=%s, Offset=%d, Key=%s, Value=%s%n",
                record.topic(), record.offset(), record.key(), record.value());
        
        // Simuliere gelegentlichen Fehler
//        if (Math.random() < 0.1) {
//        	System.err.println("ERROR");
//            throw new RuntimeException("Simulated processing error");
//        }
//        
        // Normale Verarbeitung
//        Thread.sleep(100);
    }
    
    private void handlePoisonMessage(ConsumerRecord<String, String> record, Exception e) {
        System.err.printf("POISON MESSAGE: Topic=%s, Offset=%d, Error=%s%n",
                record.topic(), record.offset(), e.getMessage());
        
        // Hier könntest du die Nachricht in eine Dead Letter Queue schreiben
        // oder in einer Datenbank für manuelle Überprüfung speichern
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
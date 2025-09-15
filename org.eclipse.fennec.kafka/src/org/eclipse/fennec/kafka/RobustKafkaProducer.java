package org.eclipse.fennec.kafka;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

//@Component
public class RobustKafkaProducer {
    
    private KafkaProducer<String, String> producer;
    private volatile boolean running = true;
    
    @Activate
    public void activate() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:19092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        
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
            
            for (int i = 0; i < 1100; i++) {
            	sendMessage("dummy", "hello1" + i, "welt2" + i);
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
    
    public boolean sendMessage(String topic, String key, String value) {
        return sendMessage(topic, key, value, 3);
    }
    
    public boolean sendMessage(String topic, String key, String value, int maxRetries) {
        ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, value);
        
        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            try {
                Future<RecordMetadata> future = producer.send(record, (metadata, exception) -> {
                    if (exception != null) {
                        System.err.printf("Async send failed: %s%n", exception.getMessage());
                    } else {
                        System.out.printf("Message sent successfully: %s-%d-%d%n",
                                metadata.topic(), metadata.partition(), metadata.offset());
                    }
                });
                
                // Synchron warten für Fehlerbehandlung
                RecordMetadata metadata = future.get(30, TimeUnit.SECONDS);
                System.out.printf("✅ Message delivered: %s-%d-%d%n",
                        metadata.topic(), metadata.partition(), metadata.offset());
                return true;
                
            } catch (Exception e) {
                System.err.printf("Attempt %d/%d failed: %s%n", attempt, maxRetries, e.getMessage());
                
                if (attempt == maxRetries) {
                    System.err.println("❌ Message failed after all retries: " + value);
                    handlePoisonMessage(topic, key, value, e);
                    return false;
                }
                
                // Exponential backoff
                try {
                    Thread.sleep(1000 * attempt);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
        }
        return false;
    }
    
    public void sendBatchMessages(String topic, int count) {
        System.out.printf("Sending %d messages to topic '%s'...%n", count, topic);
        
        int successCount = 0;
        int failureCount = 0;
        
        for (int i = 1; i <= count; i++) {
            String key = "batch-key-" + i;
            String value = String.format("Batch message %d of %d - timestamp: %d", 
                    i, count, System.currentTimeMillis());
            
            if (sendMessage(topic, key, value)) {
                successCount++;
            } else {
                failureCount++;
            }
            
            // Progress indicator
            if (i % 10 == 0) {
                System.out.printf("Progress: %d/%d (Success: %d, Failed: %d)%n", 
                        i, count, successCount, failureCount);
            }
        }
        
        System.out.printf("Batch complete: %d success, %d failures%n", successCount, failureCount);
    }
    
    private void handlePoisonMessage(String topic, String key, String value, Exception e) {
        // Hier könntest du die fehlgeschlagene Nachricht in eine Dead Letter Queue schreiben
        // oder in einer Datenbank für manuelle Überprüfung speichern
        System.err.printf("POISON MESSAGE: Topic=%s, Key=%s, Value=%s, Error=%s%n",
                topic, key, value, e.getMessage());
    }
    
    public void shutdown() {
        System.out.println("Shutting down producer...");
        running = false;
        
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
            ProducerRecord<String, String> healthCheck = new ProducerRecord<>(
                "health-check", "ping", "health-check-" + System.currentTimeMillis());
            
            Future<RecordMetadata> future = producer.send(healthCheck);
            future.get(5, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            System.err.println("Health check failed: " + e.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        RobustKafkaProducer robustProducer = new RobustKafkaProducer();
        
        // Health Check
        if (robustProducer.isHealthy()) {
            System.out.println("✅ Producer is healthy");
            
            // Batch Messages senden
            robustProducer.sendBatchMessages("dummy", 25);
            
        } else {
            System.err.println("❌ Producer health check failed");
        }
        
        robustProducer.shutdown();
    }
}
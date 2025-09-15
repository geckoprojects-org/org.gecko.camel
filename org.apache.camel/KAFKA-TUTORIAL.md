# Kafka Integration Tutorial

This tutorial demonstrates how to run the Kafka integration example in the org.apache.camel project using Redpanda as the Kafka-compatible streaming platform.

## Overview

The Kafka example shows how to:
- Consume messages from Kafka topics using Apache Camel
- Process messages with custom business logic
- Use OSGi Declarative Services for route configuration
- Integrate with Redpanda for local development

## Prerequisites

- Docker and Docker Compose installed
- Bash shell (for running setup scripts)
- Java 17+ (for building and running the example)

## Architecture

The Kafka integration consists of:

### Core Components

1. **KafkaRouteProvider** (`org.gecko.camel.example.impl.routes.KafkaRouteProvider`)
   - Implements `RouteProvider` interface
   - Defines Kafka consumer route configuration
   - Uses `@Component` annotation with `camel.route=myK` property

2. **SimpleCamelRouteComponent** (`org.gecko.camel.example.impl.consumer.SimpleCamelRouteComponent`)
   - Consumer component that gets injected with CamelContext
   - Uses `@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)` for CamelContext injection
   - Activates automatically when dependencies are available

3. **CamelContextStarter** (`org.gecko.camel.example.impl.CamelContextStarter`)
   - Configures CamelContext with processors and type converters
   - **Important**: Uses `@Reference(target = "(camel.route=myK)")` to match KafkaRouteProvider
   - Binds EMF processors and ResourceSet to Camel registry

## Setup Instructions

### 1. Start Redpanda Cluster

Navigate to the redpanda directory and start the cluster:

```bash
cd /devel/git/fennec-camel/redpanda
./redpanda-setup.sh start
```

Wait for the cluster to be ready:

```bash
./redpanda-setup.sh status
```

### 2. Create Required Kafka Topic

The KafkaRouteProvider expects a topic called "dummy":

```bash
./redpanda-setup.sh rpk topic create dummy --partitions 3 --replicas 1
```

Verify the topic was created:

```bash
./redpanda-setup.sh rpk topic list
```

### 3. Open Redpanda Console (Optional)

For monitoring and debugging:

```bash
./redpanda-setup.sh console
```

This opens http://localhost:8080 in your browser.

### 4. Enable the Route Provider

The KafkaRouteProvider needs to be activated by uncommenting its `@Component` annotation:

**File**: `org.apache.camel/src/org/gecko/camel/example/impl/routes/KafkaRouteProvider.java`

Ensure the `@Component` annotation is active:

```java
@Component(property = {
               "route.description=Kafka processing routes",
               "route.version=1.0",
               "camel.route=myK"                    // This must match CamelContextStarter target
           }, immediate = true)
public class KafkaRouteProvider implements RouteProvider {
    // ... route implementation
}
```

### 5. Verify CamelContextStarter Configuration

**File**: `org.apache.camel/src/org/gecko/camel/example/impl/CamelContextStarter.java`

Ensure the route reference targets the correct property:

```java
//  for kafka:
@Reference(target = "(camel.route=myK)")
//  for simple or emf
//  @Reference(target = "(camel.route=my)")
private RouteProvider route;
```

**Important**: The target filter `(camel.route=myK)` must match the property in KafkaRouteProvider's `@Component` annotation.

### 6. Build and Run

Navigate to the org.apache.camel directory:

```bash
cd /devel/git/fennec-camel/org.apache.camel
```

Resolve dependencies and build:

```bash
../gradlew resolve.camel
```

Run the example:

```bash
java -jar generated/camel.jar
```

## Testing the Integration

### 1. Monitor Application Logs

The application should start and show:
- CamelContext activation logs
- Route registration messages  
- Kafka consumer group connection

### 2. Send Test Messages

In a separate terminal, send messages to the dummy topic:

```bash
cd /devel/git/fennec-camel/redpanda

# Interactive producer (type messages and press Enter)
./redpanda-setup.sh rpk topic produce dummy
```

Type some test messages:
```
Hello from Kafka!
Testing message processing
Another test message
```

### 3. Verify Message Processing

Check the application logs for:
- "Received message from Kafka: [message]" log entries
- "Processing: [message]" system output
- No error messages about missing topics or connection issues

### 4. Consumer Group Monitoring

You can monitor the consumer group in Redpanda Console:
1. Open http://localhost:8080
2. Navigate to "Consumer Groups"
3. Look for "my-consumer-group" 
4. Check lag and consumption metrics

## Route Configuration Details

The KafkaRouteProvider defines a simple message processing route:

```java
builder.from("kafka:dummy?brokers=localhost:19092&groupId=my-consumer-group")
       .routeId("kafka-main-processing")
       .log("Received message from Kafka: ${body}")
       .process(exchange -> {
           String message = exchange.getIn().getBody(String.class);
           System.out.println("Processing: " + message);
       });
```

### Key Configuration:
- **Topic**: `dummy` (must exist in Redpanda)
- **Brokers**: `localhost:19092` (Redpanda's Kafka API endpoint)
- **Consumer Group**: `my-consumer-group`
- **Processing**: Simple string message logging and processing

## Consumer Components

### SimpleCamelRouteComponent

This consumer component demonstrates the **different setup requirements** for each route type:

**For Kafka routes**, use this component:
- Gets injected with a CamelContext instance via `@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)`
- Automatically activated when CamelContext becomes available
- Logs activation with CamelContext name for debugging

**Documentation note in consumer class**:
```java
/**
 * Use for
 * - KafkaRouteProvider
 * - MyRouteProvider
 * @author mark
 * @since 13.09.2025
 */
```

### ExampleBusinessLogic

This is for EMF-specific processing and should NOT be used for Kafka routes:
- Includes EMF-specific processing logic
- References EMF objects and processors
- Documentation indicates "Use for EMFRouteProvider"

## Troubleshooting

### Common Issues

**1. "No consumers in group" Error**
- Ensure the dummy topic exists: `./redpanda-setup.sh rpk topic list`
- Check Redpanda cluster status: `./redpanda-setup.sh status`

**2. CamelContext Not Starting**
- Verify `@Component` annotation is uncommented on KafkaRouteProvider
- Check that target filter matches: `(camel.route=myK)`
- Review application startup logs for dependency issues

**3. Messages Not Being Consumed**
- Verify Kafka broker endpoint: `localhost:19092`
- Check consumer group in Redpanda Console
- Ensure messages are being sent to correct topic

**4. Route Provider Not Found**
- Check CamelContextStarter reference target: `@Reference(target = "(camel.route=myK)")`
- Ensure KafkaRouteProvider property matches: `"camel.route=myK"`
- Verify immediate=true on @Component annotation

### Debug Commands

```bash
# Check Redpanda cluster status
./redpanda-setup.sh status

# List all topics
./redpanda-setup.sh rpk topic list

# Describe topic details
./redpanda-setup.sh rpk topic describe dummy

# Check consumer groups
./redpanda-setup.sh rpk group list

# View consumer group details
./redpanda-setup.sh rpk group describe my-consumer-group

# Monitor logs in real-time
./redpanda-setup.sh logs redpanda-0
```

### Viewing Messages

```bash
# Consume messages from beginning
./redpanda-setup.sh rpk topic consume dummy --from-beginning

# Consume latest messages
./redpanda-setup.sh rpk topic consume dummy
```

## Cleanup

Stop the example application with Ctrl+C, then clean up Redpanda:

```bash
# Stop Redpanda cluster
cd /devel/git/fennec-camel/redpanda
./redpanda-setup.sh stop

# Full cleanup (removes all data)
./redpanda-setup.sh clean
```

## Next Steps

After successfully running the Kafka example:

1. **Extend the Route**: Modify KafkaRouteProvider to add more complex processing logic
2. **Add Producers**: Create Kafka producer routes to send messages
3. **Error Handling**: Add error handling and dead letter queues
4. **Multiple Topics**: Consume from multiple topics with different processing logic
5. **Message Formats**: Work with JSON, Avro, or other message formats

For other examples, see:
- [EMF Tutorial](EMF-TUTORIAL.md) - For EMF object processing
- [Simple Tutorial](SIMPLE-TUTORIAL.md) - For basic timer-based routes
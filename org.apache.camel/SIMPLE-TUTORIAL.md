# Simple Timer Route Tutorial

This tutorial demonstrates how to run the simple timer-based route example in the org.apache.camel project for basic Apache Camel integration with EMF object creation.

## Overview

The Simple example shows how to:
- Create timer-based routes using Apache Camel
- Generate EMF objects programmatically in routes
- Use direct endpoint communication patterns
- Integrate with OSGi Declarative Services for basic routing

## Prerequisites

- Java 17+ (for building and running the example)
- Basic understanding of Apache Camel timer components
- Familiarity with EMF object creation patterns

## Architecture

The Simple integration consists of:

### Core Components

1. **MyRouteProvider** (`org.gecko.camel.example.impl.routes.MyRouteProvider`)
   - Implements `RouteProvider` interface
   - Defines timer-based route with EMF object creation
   - **Currently disabled**: `@Component` annotation is commented out

2. **SimpleCamelRouteComponent** (`org.gecko.camel.example.impl.consumer.SimpleCamelRouteComponent`)
   - Consumer component designed for simple routes
   - Gets injected with CamelContext via `@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)`
   - **Currently active**: `@Component` annotation is enabled
   - Minimal setup for basic route consumption

3. **CamelContextStarter** (`org.gecko.camel.example.impl.CamelContextStarter`)
   - Configures CamelContext with processors and ResourceSet
   - Uses `@Reference(target = "(camel.route=my)")` for simple routes
   - Binds EMF components to Camel registry

## Setup Instructions

### 1. Enable Simple Route Provider

**File**: `org.apache.camel/src/org/gecko/camel/example/impl/routes/MyRouteProvider.java`

Uncomment the `@Component` annotation:

```java
@Component(property = "camel.route=my")
public class MyRouteProvider implements RouteProvider {
    // ... route implementation
}
```

### 2. Verify Consumer Component

**File**: `org.apache.camel/src/org/gecko/camel/example/impl/consumer/SimpleCamelRouteComponent.java`

Ensure the `@Component` annotation is active (it should be by default):

```java
@Component
public class SimpleCamelRouteComponent {
    @Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
    private CamelContext camelContext;
    // ... component implementation
}
```

### 3. Configure CamelContextStarter for Simple Routes

**File**: `org.apache.camel/src/org/gecko/camel/example/impl/CamelContextStarter.java`

Ensure the route reference targets simple routes:

```java
//  for kafka:
//  @Reference(target = "(camel.route=myK)")
//  for simple or emf
@Reference(target = "(camel.route=my)")
private RouteProvider route;
```

**Important**: The target filter `(camel.route=my)` must match the property in MyRouteProvider's `@Component` annotation.

### 4. Build and Run

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

## Simple Route Configuration

The MyRouteProvider defines a timer-based route with EMF object creation:

```java
@Override
public void configureRoutes(RouteBuilder builder) throws Exception {
    builder.from("timer:hello?period=5000")
           .setBody(e -> {
               DraginoLSE01Uplink uplink = DraginoFactory.eINSTANCE.createDraginoLSE01Uplink();
               DeviceInfo di = LorawanFactory.eINSTANCE.createDeviceInfo();
               di.setDeviceName(UUID.randomUUID().toString());
               uplink.setDeviceInfo(di);
               return uplink;
           })
           .routeId(getRouteId())
           .log("Timer message: ${body}")
           .to("log:test");
}
```

### Route Breakdown:

1. **Timer Trigger**: `from("timer:hello?period=5000")`
   - Triggers every 5 seconds
   - No initial delay
   - Generates periodic messages

2. **EMF Object Creation**: `.setBody(e -> { ... })`
   - Creates `DraginoLSE01Uplink` EMF object
   - Creates `DeviceInfo` with random UUID
   - Links device info to uplink object
   - Returns EMF object as message body

3. **Logging**: `.log("Timer message: ${body}")`
   - Logs the EMF object content
   - Uses Camel's built-in logging

4. **Final Destination**: `.to("log:test")`
   - Sends to log endpoint for additional logging
   - Creates separate log category "test"

## Testing the Integration

### 1. Monitor Application Logs

The application should start and show:
- CamelContext activation logs
- Route registration messages
- SimpleCamelRouteComponent activation
- Timer route startup confirmation

### 2. Timer Messages

Every 5 seconds, you should see log entries like:

```
Timer message: DraginoLSE01UplinkImpl@[hashcode] (deviceInfo: DeviceInfoImpl@[hashcode] (deviceName: 11e33513-3cc4-4497-85a1-c9caa5b4bf0b))
```

The UUID will be different for each message, showing that new EMF objects are being created.

### 3. Log Categories

Check for entries in both:
- **Main route log**: "Timer message: ..." entries
- **Test log category**: Additional entries from `to("log:test")`

## Consumer Component Details

### SimpleCamelRouteComponent

This consumer component is designed for **simple and Kafka routes** and has minimal setup requirements:

**Key Features**:
- Gets injected with CamelContext instance via `@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)`
- Simple activation/deactivation logging
- No complex processing logic
- Suitable for basic route consumption patterns

**Documentation in consumer class**:
```java
/**
 * Use for
 * - KafkaRouteProvider
 * - MyRouteProvider
 * @author mark
 * @since 13.09.2025
 */
```

**Activation Behavior**:
```java
@Activate
public void activate() {
    logger.info("SimpleCamelRouteComponent activated with CamelContext: {}", 
                camelContext.getName());
}
```

This component is much simpler than ExampleBusinessLogic because simple routes don't need complex EMF processing capabilities.

## EMF Object Details

The route creates EMF objects using:

### DraginoLSE01Uplink
- Main EMF object representing a LoRaWAN uplink message
- Created using `DraginoFactory.eINSTANCE.createDraginoLSE01Uplink()`
- Contains device information and sensor data

### DeviceInfo
- EMF object containing device metadata
- Created using `LorawanFactory.eINSTANCE.createDeviceInfo()`
- Set with random UUID device name

### Factory Pattern
- Uses EMF factory pattern for object creation
- `DraginoFactory.eINSTANCE` - Singleton factory for Dragino objects
- `LorawanFactory.eINSTANCE` - Singleton factory for LoRaWAN objects

## Troubleshooting

### Common Issues

**1. Timer Not Triggering**
- Check that MyRouteProvider `@Component` annotation is uncommented
- Verify route registration in application logs
- Ensure timer component is available in Camel classpath

**2. EMF Object Creation Errors**
- Check that EMF factories are available
- Verify DraginoPackage and LorawanPackage are registered
- Review EMF model dependencies in OSGi

**3. Route Provider Not Found**
- Check CamelContextStarter reference target: `@Reference(target = "(camel.route=my)")`
- Ensure MyRouteProvider property matches: `property = "camel.route=my"`
- Verify `@Component` annotation is uncommented

**4. No Log Output**
- Check log level configuration
- Verify both SimpleCamelRouteComponent and route logging
- Ensure Camel logging framework is properly configured

### Expected Log Sequence

1. **Component Activation**:
   ```
   SimpleCamelRouteComponent activated with CamelContext: [context-name]
   ```

2. **Route Registration**:
   ```
   Route: my-test-route started and consuming from: timer://hello?period=5000
   ```

3. **Timer Messages** (every 5 seconds):
   ```
   Timer message: DraginoLSE01UplinkImpl@... (deviceInfo: DeviceInfoImpl@... (deviceName: [uuid]))
   ```

## Advanced Customization

### Modify Timer Frequency

Change the timer period in MyRouteProvider:

```java
// Every 10 seconds instead of 5
builder.from("timer:hello?period=10000")

// With initial delay
builder.from("timer:hello?period=5000&delay=2000")

// Fixed rate execution
builder.from("timer:hello?period=5000&fixedRate=true")
```

### Enhance EMF Object Creation

Add more properties to the EMF objects:

```java
.setBody(e -> {
    DraginoLSE01Uplink uplink = DraginoFactory.eINSTANCE.createDraginoLSE01Uplink();
    DeviceInfo di = LorawanFactory.eINSTANCE.createDeviceInfo();
    
    // Add more device info
    di.setDeviceName("Device-" + UUID.randomUUID().toString());
    di.setDeviceProfileName("LSE01-Profile");
    
    // Add timestamp or other fields if available
    uplink.setDeviceInfo(di);
    
    return uplink;
})
```

### Add Message Processing

Insert processing steps between timer and logging:

```java
builder.from("timer:hello?period=5000")
       .setBody(/* EMF object creation */)
       .process(exchange -> {
           DraginoLSE01Uplink uplink = exchange.getIn().getBody(DraginoLSE01Uplink.class);
           // Custom processing logic
           System.out.println("Processing device: " + uplink.getDeviceInfo().getDeviceName());
       })
       .routeId(getRouteId())
       .log("Timer message: ${body}")
       .to("log:test");
```

## Use Cases

The Simple timer route is ideal for:

1. **Testing EMF Integration**: Verify EMF objects can be created and processed
2. **Heartbeat Monitoring**: Generate periodic system heartbeat messages
3. **Data Generation**: Create test data for development and testing
4. **Proof of Concept**: Demonstrate basic Camel + EMF integration
5. **Learning**: Understand route creation and EMF factory patterns

## Next Steps

After successfully running the Simple example:

1. **Complex Routes**: Add more sophisticated route logic with choice, split, aggregate
2. **External Endpoints**: Connect to HTTP, JMS, or file endpoints
3. **EMF Persistence**: Save EMF objects to databases or files
4. **Error Handling**: Add exception handling and retry logic
5. **Dynamic Configuration**: Make timer period and object properties configurable

For other examples, see:
- [Kafka Tutorial](KAFKA-TUTORIAL.md) - For Kafka message processing
- [EMF Tutorial](EMF-TUTORIAL.md) - For complex EMF object processing
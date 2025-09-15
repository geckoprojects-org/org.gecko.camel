# EMF Integration Tutorial

This tutorial demonstrates how to run the EMF (Eclipse Modeling Framework) integration example in the org.apache.camel project for processing EMF objects through Apache Camel routes.

## Overview

The EMF example shows how to:
- Process EMF objects using Apache Camel routes
- Load and save EMF resources with custom processors
- Use direct endpoint communication for in-memory processing
- Integrate EMF with OSGi Declarative Services

## Prerequisites

- Java 17+ (for building and running the example)
- Basic understanding of Eclipse EMF concepts
- Familiarity with Apache Camel routing patterns

## Architecture

The EMF integration consists of:

### Core Components

1. **EMFRouteProvider** (`org.gecko.camel.example.impl.routes.EMFRouteProvider`)
   - Implements `RouteProvider` interface
   - Defines EMF processing route configuration
   - **Currently disabled**: `@Component` annotation is commented out

2. **ExampleBusinessLogic** (`org.gecko.camel.example.impl.consumer.ExampleBusinessLogic`)
   - Consumer component specifically designed for EMF processing
   - Gets injected with CamelContext via `@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)`
   - **Currently disabled**: `@Component` annotation is commented out
   - Contains EMF-specific processing methods

3. **EMF Processors**:
   - **EMFLoadProcessor**: Loads EMF objects from messages
   - **EMFSaveProcessor**: Saves EMF objects to messages
   - Both registered with `camel.processorName` properties

4. **CamelContextStarter** (`org.gecko.camel.example.impl.CamelContextStarter`)
   - Configures CamelContext with EMF processors and ResourceSet
   - Uses `@Reference(target = "(camel.route=my)")` for EMF routes
   - Binds EMF components to Camel registry

## Setup Instructions

### 1. Enable EMF Route Provider

**File**: `org.apache.camel/src/org/gecko/camel/example/impl/routes/EMFRouteProvider.java`

Uncomment the `@Component` annotation:

```java
@Component(property = {
               "route.description=EMF processing routes",
               "route.version=1.0",
               "camel.route=my"                     // This must match CamelContextStarter target
           }, immediate = true)
public class EMFRouteProvider implements RouteProvider {
    // ... route implementation
}
```

### 2. Enable EMF Consumer Component

**File**: `org.apache.camel/src/org/gecko/camel/example/impl/consumer/ExampleBusinessLogic.java`

Uncomment the `@Component` annotation:

```java
@Component(property = {
               "business.component=emf-processor",
               "service.description=Example EMF processing business logic"
           })
public class ExampleBusinessLogic {
    // ... business logic implementation
}
```

### 3. Configure CamelContextStarter for EMF

**File**: `org.apache.camel/src/org/gecko/camel/example/impl/CamelContextStarter.java`

Ensure the route reference targets EMF routes:

```java
//  for kafka:
//  @Reference(target = "(camel.route=myK)")
//  for simple or emf
@Reference(target = "(camel.route=my)")
private RouteProvider route;
```

**Important**: The target filter `(camel.route=my)` must match the property in EMFRouteProvider's `@Component` annotation.

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

## EMF Route Configuration

The EMFRouteProvider defines a sophisticated EMF processing pipeline:

### Main Processing Route

```java
builder.from("direct:emf-process")
       .routeId("emf-main-processing")
       .log("Starting EMF processing for: ${body}")
       .to("direct:load-emf")
       .process("EMFSave")  // Auto-resolved EMFSaveProcessor
       .log("EMF processing completed")
       .to("direct:emf-result");
```

### EMF Loading Sub-route

```java
builder.from("direct:load-emf")
       .routeId("emf-load")
       .log("Loading EMF resource: ${body}")
       .process("EMFLoad")  // Auto-resolved EMFLoadProcessor
       .log("EMF resource loaded successfully");
```

### Result Handling with Choice

```java
builder.from("direct:emf-result")
       .routeId("emf-result-handler")
       .choice()
           .when(header("error").isNotNull())
               .log("EMF processing failed: ${header.error}")
               .to("direct:emf-error")
           .otherwise()
               .log("EMF processing successful: ${body}")
               .to("direct:emf-success");
```

## Testing the Integration

### 1. Monitor Application Logs

The application should start and show:
- CamelContext activation logs
- Route registration messages
- EMF processor binding confirmations
- ExampleBusinessLogic activation

### 2. Automatic EMF Processing

When ExampleBusinessLogic activates, it automatically sends a test EMF object:

```java
private static final String body = "<dragino:DraginoLSE01Uplink xmi:version=\"2.0\" "
    + "xmlns:xmi=\"http://www.omg.org/XMI\" "
    + "xmlns:dragino=\"https://eclipse.org/fennec/lorawan/dragino\">\n"
    + "  <deviceInfo deviceName=\"11e33513-3cc4-4497-85a1-c9caa5b4bf0b\"/>\n"
    + "</dragino:DraginoLSE01Uplink>";
```

This XML will be:
1. Sent to `direct:emf-process`
2. Converted to EMF object via EMFLoadProcessor
3. Processed through the route pipeline
4. Converted back to XML via EMFSaveProcessor

### 3. Expected Log Output

Look for these log entries:
```
EMF business logic component activated successfully
Starting EMF processing for: [XML content]
Loading EMF resource: [XML content]
EMF resource loaded successfully
EMF processing completed
EMF processing successful: [processed content]
```

## Consumer Component Details

### ExampleBusinessLogic

This consumer component is **specifically designed for EMF processing** and should NOT be used for other route types:

**Key Features**:
- Gets injected with CamelContext instance via `@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)`
- Contains EMF-specific processing methods
- Automatically starts processing on activation
- Provides both synchronous and asynchronous processing methods

**Documentation in consumer class**:
```java
/**
 * Use for
 * - EMFRouteProvider
 * @author Mark Hoffmann
 */
```

**Processing Methods**:

1. **Synchronous Processing**:
   ```java
   public String processEMFObject(EObject eObject)
   ```

2. **Asynchronous Processing**:
   ```java
   public void processEMFObjectAsync(EObject eObject)
   ```

3. **Status Information**:
   ```java
   public String getCamelContextStatus()
   public String listAvailableProcessors()
   ```

## EMF Processors

### EMFLoadProcessor
- Registered with `camel.processorName=EMFLoad`
- Converts XML/String messages to EMF EObjects
- Uses ResourceSet for EMF resource management

### EMFSaveProcessor
- Registered with `camel.processorName=EMFSave`
- Converts EMF EObjects to XML/String format
- Handles EMF resource serialization

### ResourceSet Integration

The CamelContextStarter binds the ResourceSet to the Camel registry:

```java
camelContext.getRegistry().bind("resourceSet", ResourceSet.class, resourceSet);
camelContext.getRegistry().bind("EMFLoad", Processor.class, loadProcessor);
camelContext.getRegistry().bind("EMFSave", Processor.class, saveProcessor);
```

## Troubleshooting

### Common Issues

**1. EMF Processors Not Found**
- Check that EMFLoadProcessor and EMFSaveProcessor are registered
- Verify `camel.processorName` properties in processor components
- Ensure CamelContextStarter binds processors to registry

**2. ResourceSet Not Available**
- Verify ResourceSet service is available in OSGi
- Check CamelContextStarter ResourceSet reference
- Review EMF bundle dependencies

**3. Route Provider Not Found**
- Check CamelContextStarter reference target: `@Reference(target = "(camel.route=my)")`
- Ensure EMFRouteProvider property matches: `"camel.route=my"`
- Verify `@Component` annotation is uncommented and immediate=true

**4. XML Parsing Errors**
- Ensure EMF models are registered in OSGi
- Check namespace URIs in test XML
- Verify EMF package dependencies

### Debug Information

The ExampleBusinessLogic provides debug methods:

```java
// Check CamelContext status
String status = exampleBusinessLogic.getCamelContextStatus();

// List available processors
String processors = exampleBusinessLogic.listAvailableProcessors();
```

Expected processor list output:
```
Available processors:
- EMFSave processor: available
- EMFLoad processor: available  
- ResourceSet: available
```

## Advanced Usage

### Custom EMF Processing

You can extend the EMF processing by:

1. **Adding Custom Processors**:
   ```java
   @Component(property = "camel.processorName=MyEMFProcessor")
   public class MyEMFProcessor implements Processor {
       @Override
       public void process(Exchange exchange) throws Exception {
           // Custom EMF processing logic
       }
   }
   ```

2. **Extending Routes**:
   ```java
   // Add custom processing steps
   builder.from("direct:emf-custom")
          .process("MyEMFProcessor")
          .to("direct:emf-result");
   ```

3. **Error Handling**:
   ```java
   // Enhanced error handling
   builder.onException(EMFException.class)
          .handled(true)
          .setHeader("error", simple("${exception.message}"))
          .to("direct:emf-error");
   ```

## Model Dependencies

The example uses Dragino EMF models:
- **DraginoFactory**: Factory for creating Dragino EMF objects
- **DraginoLSE01Uplink**: Sample EMF object type
- **LorawanFactory**: Factory for LoRaWAN-related EMF objects

These are registered as OSGi services and injected into CamelContextStarter.

## Next Steps

After successfully running the EMF example:

1. **Custom EMF Models**: Create and register your own EMF models
2. **Complex Processing**: Add validation, transformation, and enrichment processors
3. **Persistence**: Save EMF objects to databases or files
4. **Integration**: Combine with other endpoints (HTTP, JMS, etc.)
5. **Type Converters**: Add custom EMF ↔ other format converters

For other examples, see:
- [Kafka Tutorial](KAFKA-TUTORIAL.md) - For Kafka message processing
- [Simple Tutorial](SIMPLE-TUTORIAL.md) - For basic timer-based routes
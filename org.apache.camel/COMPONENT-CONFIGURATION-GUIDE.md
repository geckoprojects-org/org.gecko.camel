# Component Configuration Guide

This guide explains the critical `@Component` annotation requirements and the `camelRoute` property targeting mechanism that connects RouteProviders with CamelContextStarter in the org.apache.camel project.

## Overview

The org.apache.camel project uses OSGi Declarative Services to wire RouteProvider implementations with the CamelContextStarter. This requires precise configuration of `@Component` annotations and target property matching.

## Critical Configuration Pattern

### The camelRoute Property System

The system uses a **property-based targeting mechanism** where:

1. **RouteProvider** components declare a `camel.route` property
2. **CamelContextStarter** uses `@Reference(target="...")` to select specific RouteProviders
3. **Consumer components** get injected with configured CamelContext instances

## Component Configurations by Example Type

### 1. Kafka Example Configuration

#### KafkaRouteProvider Setup
**File**: `org.gecko.camel.example.impl.routes.KafkaRouteProvider.java`

```java
@Component(property = {
               "route.description=Kafka processing routes",
               "route.version=1.0",
               "camel.route=myK"           // ← This property is CRITICAL
           }, immediate = true)
public class KafkaRouteProvider implements RouteProvider {
    // Kafka route implementation
}
```

#### CamelContextStarter Configuration
**File**: `org.gecko.camel.example.impl.CamelContextStarter.java`

```java
//  for kafka:
@Reference(target = "(camel.route=myK)")    // ← Must match KafkaRouteProvider property
//  for simple or emf
//  @Reference(target = "(camel.route=my)")
private RouteProvider route;
```

#### Consumer Component
**File**: `org.gecko.camel.example.impl.consumer.SimpleCamelRouteComponent.java`

```java
@Component  // ← Simple annotation, no targeting needed
public class SimpleCamelRouteComponent {
    @Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
    private CamelContext camelContext;
}
```

### 2. EMF Example Configuration

#### EMFRouteProvider Setup
**File**: `org.gecko.camel.example.impl.routes.EMFRouteProvider.java`

```java
@Component(property = {
               "route.description=EMF processing routes",
               "route.version=1.0",
               "camel.route=my"            // ← This property is CRITICAL
           }, immediate = true)
public class EMFRouteProvider implements RouteProvider {
    // EMF route implementation
}
```

#### CamelContextStarter Configuration
```java
//  for kafka:
//  @Reference(target = "(camel.route=myK)")
//  for simple or emf
@Reference(target = "(camel.route=my)")     // ← Must match EMFRouteProvider property
private RouteProvider route;
```

#### Consumer Component
**File**: `org.gecko.camel.example.impl.consumer.ExampleBusinessLogic.java`

```java
@Component(property = {
               "business.component=emf-processor",
               "service.description=Example EMF processing business logic"
           })
public class ExampleBusinessLogic {
    @Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
    private CamelContext camelContext;
}
```

### 3. Simple Example Configuration

#### MyRouteProvider Setup
**File**: `org.gecko.camel.example.impl.routes.MyRouteProvider.java`

```java
@Component(property = "camel.route=my")     // ← Simplified syntax, same effect
public class MyRouteProvider implements RouteProvider {
    // Simple timer route implementation
}
```

#### CamelContextStarter Configuration
```java
//  for kafka:
//  @Reference(target = "(camel.route=myK)")
//  for simple or emf
@Reference(target = "(camel.route=my)")     // ← Must match MyRouteProvider property
private RouteProvider route;
```

## Critical Requirements Checklist

### ✅ RouteProvider Component Requirements

**1. @Component Annotation Must Be Active**
```java
// ❌ WRONG - Commented out
// @Component(property = "camel.route=myK")

// ✅ CORRECT - Active annotation  
@Component(property = "camel.route=myK", immediate = true)
```

**2. camel.route Property Must Be Set**
```java
// ❌ WRONG - No targeting property
@Component

// ✅ CORRECT - With targeting property
@Component(property = "camel.route=myK")
```

**3. immediate=true Recommended**
```java
// ✅ RECOMMENDED - Immediate activation
@Component(property = "camel.route=myK", immediate = true)
```

### ✅ CamelContextStarter Target Requirements

**1. Target Filter Must Match RouteProvider Property**
```java
// RouteProvider declares: "camel.route=myK"
// CamelContextStarter must use:
@Reference(target = "(camel.route=myK)")

// ❌ WRONG - Mismatch
@Reference(target = "(camel.route=my)")  // Won't find myK
```

**2. Only One Target Active at a Time**
```java
// ❌ WRONG - Multiple active targets
@Reference(target = "(camel.route=myK)")
@Reference(target = "(camel.route=my)")

// ✅ CORRECT - Comment unused targets
//  @Reference(target = "(camel.route=myK)")
@Reference(target = "(camel.route=my)")
```

## Property Value Standards

### Established Values

| Route Type | Property Value | Used By |
|------------|----------------|---------|
| **Kafka** | `camel.route=myK` | KafkaRouteProvider |
| **EMF** | `camel.route=my` | EMFRouteProvider |
| **Simple** | `camel.route=my` | MyRouteProvider |

**Note**: EMF and Simple routes both use `my` - only one can be active at a time.

### Custom Property Values

You can create custom targeting values:

```java
// Custom RouteProvider
@Component(property = "camel.route=customRoute")
public class CustomRouteProvider implements RouteProvider {
    // Custom implementation
}

// Matching CamelContextStarter reference
@Reference(target = "(camel.route=customRoute)")
private RouteProvider route;
```

## Consumer Component Patterns

### Different Consumer Types for Different Routes

#### SimpleCamelRouteComponent (Kafka + Simple)
```java
/**
 * Use for
 * - KafkaRouteProvider
 * - MyRouteProvider
 */
@Component
public class SimpleCamelRouteComponent {
    @Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
    private CamelContext camelContext;
}
```

**Characteristics**:
- Minimal setup
- Basic CamelContext injection
- Simple activation logging
- No complex processing logic

#### ExampleBusinessLogic (EMF Only)
```java
/**
 * Use for
 * - EMFRouteProvider
 */
@Component(property = {
    "business.component=emf-processor",
    "service.description=Example EMF processing business logic"
})
public class ExampleBusinessLogic {
    @Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
    private CamelContext camelContext;
}
```

**Characteristics**:
- EMF-specific processing methods
- Complex business logic
- Producer template management
- EMF object processing capabilities

## Activation Sequence

### Successful Activation Order

1. **Prerequisite Services**
   - ResourceSet service available
   - EMF processors registered (EMFLoad, EMFSave)
   - CamelCondition infrastructure ready

2. **RouteProvider Registration**
   - `@Component` annotation processed
   - Service registered with `camel.route` property
   - RouteProvider implementation available

3. **CamelContextStarter Activation**
   - Target filter matches RouteProvider
   - CamelContext configuration begins
   - Processors and ResourceSet bound to registry

4. **Consumer Component Activation**
   - CamelContext injected via PROTOTYPE_REQUIRED scope
   - Component activates with configured context
   - Processing begins (if applicable)

## Troubleshooting Guide

### Common Configuration Errors

#### 1. Route Provider Not Found

**Error Symptoms**:
- CamelContextStarter fails to activate
- "Unsatisfied service reference" for RouteProvider
- No route registration in logs

**Solutions**:
```java
// Check RouteProvider @Component is uncommented
@Component(property = "camel.route=myK", immediate = true)  // ← Must be active

// Verify property value matches CamelContextStarter target
@Reference(target = "(camel.route=myK)")  // ← Must match property
```

#### 2. Wrong Target Filter

**Error Symptoms**:
- Routes don't get registered
- CamelContextStarter activates with wrong routes
- Multiple route conflicts

**Solutions**:
```java
// Ensure exact property match
// RouteProvider:
@Component(property = "camel.route=myK")

// CamelContextStarter:
@Reference(target = "(camel.route=myK)")  // ← Exact match required
```

#### 3. Multiple Active Routes

**Error Symptoms**:
- OSGi dependency resolution errors
- Conflicting route registrations
- Service binding conflicts

**Solutions**:
```java
// Comment out unused routes in CamelContextStarter
//  @Reference(target = "(camel.route=myK)")  // Kafka - commented
@Reference(target = "(camel.route=my)")     // EMF - active

// Or comment out unused RouteProvider @Components
// @Component(property = "camel.route=myK")  // KafkaRouteProvider - disabled
@Component(property = "camel.route=my")      // EMFRouteProvider - active
```

## Best Practices

### 1. Configuration Management

**Use Comments for Switching**:
```java
// Clear indication of which configuration is active
//  for kafka:
//  @Reference(target = "(camel.route=myK)")
//  for simple or emf
@Reference(target = "(camel.route=my)")
```

### 2. Property Naming

**Use Descriptive Values**:
```java
// ✅ GOOD - Clear purpose
@Component(property = "camel.route=kafkaProcessing")

// ❌ AVOID - Cryptic abbreviations  
@Component(property = "camel.route=kp")
```

### 3. Documentation

**Document Consumer Usage**:
```java
/**
 * Use for
 * - KafkaRouteProvider
 * - MyRouteProvider
 * 
 * NOT suitable for EMF processing - use ExampleBusinessLogic instead
 */
@Component
public class SimpleCamelRouteComponent {
    // Implementation
}
```

### 4. immediate=true Usage

**Recommended for RouteProviders**:
```java
// Ensures immediate activation when dependencies are available
@Component(property = "camel.route=myK", immediate = true)
```

## Testing Configuration

### Verify Targeting Works

1. **Enable target RouteProvider**
2. **Set matching CamelContextStarter target**
3. **Check activation logs**:
   ```
   CamelContextStarter activated with RouteProvider: [route-id]
   Route [route-id] started and consuming from: [endpoint]
   ```

### Debug Service Resolution

Use OSGi console commands:
```bash
# List registered RouteProvider services
scr:list | grep RouteProvider

# Check service properties
scr:info [component-id]

# Verify service references
inspect capability service [bundle-id]
```

This configuration system ensures precise control over which routes are active and how they're wired together through the OSGi service registry.
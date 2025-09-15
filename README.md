# Fennec Camel - Dynamic Apache Camel Integration Platform

[![CI Build](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/build.yml/badge.svg)](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/build.yml)[![License](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/license.yml/badge.svg)](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/license.yml )[![Sonar](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/sonar.yml/badge.svg)](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/sonar.yml )[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=bugs)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=code_smells)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=coverage)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=alert_status)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=security_rating)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=sqale_index)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)

A dedicated Apache Camel workspace focused on building dynamic, configuration-driven Camel integration solutions using OSGi whiteboard pattern. The project contains EMF-based models for pipeline definitions and OSGi bundles for dynamic Camel context management.

## Project Structure

### Core OSGi Bundles

#### EMF Pipeline Models & Whiteboard Implementation
- **org.eclipse.fennec.camel.whiteboard**: EMF pipeline models and whiteboard implementation
  - **Active**: EMF generated pipeline models (`src-gen/org/eclipse/fennec/camel/whiteboard/pipeline/`)
  - **CamelCondition Service**: Infrastructure readiness coordination for OsgiCamelContext
  - **Archived**: Complete whiteboard reference implementation (`src/org/eclipse/fennec/camel/old/`)

- **org.eclipse.fennec.camel.model**: EMF model definitions for pipeline configuration
  - Ecore models for camel-spring integration and pipeline definitions

- **org.eclipse.fennec.camel.whiteboard.tests**: OSGi integration tests for whiteboard implementation
  - Integration test patterns and CamelCondition service testing

#### Working Examples & Reference Implementations
- **org.apache.camel**: **Stable Working Example** - Complete Apache Camel OSGi setup with EMF integration
  - Proven whiteboard patterns with dependency tracking
  - EMF type converters and processors
  - **Status: Reference only - no modifications**
  - See [org.apache.camel/README-WORKING-EXAMPLE.md](org.apache.camel/README-WORKING-EXAMPLE.md)
  - **Tutorials**: [Kafka](org.apache.camel/KAFKA-TUTORIAL.md) | [EMF](org.apache.camel/EMF-TUTORIAL.md) | [Simple](org.apache.camel/SIMPLE-TUTORIAL.md) | [Configuration Guide](org.apache.camel/COMPONENT-CONFIGURATION-GUIDE.md)

#### Kafka Integration
- **org.apache.kafka.clients**: Apache Kafka clients bundle for Kafka connectivity
- **org.eclipse.fennec.kafka**: Fennec Kafka integration with EObject support
  - `KafkaEObjectConsumer` and `KafkaEObjectProducer` for EMF object streaming
  - `RobustKafkaConsumer` and `RobustKafkaProducer` for reliable messaging

#### Demo & Testing
- **org.eclipse.fennec.demo.model**: Demo EMF model (addressbook) for testing and examples

### Development Infrastructure

#### Build & Configuration
- **cnf/**: BND workspace configuration
  - `build.bnd`: Workspace build configuration
  - `central.mvn`, `eclipse.mvn`, `apache.mvn`: Maven repository configurations
- **gradle/**: Gradle wrapper and build infrastructure
- **sources/**: Reference source implementations (camel-blueprint, camel-core-osgi, osgi-test)

#### External Services Setup
- **redpanda/**: Kafka-compatible streaming platform setup
  - Docker Compose configuration for local development
  - Management scripts for cluster operations
  - See [redpanda/README.md](redpanda/readme.md) for Redpanda setup and usage

## Key Features

### OSGi-Native Architecture
- **Configuration-Driven Pipelines**: EMF models for type-safe pipeline definitions
- **Dynamic Service Discovery**: OSGi whiteboard pattern for component registration  
- **Dependency Tracking**: Service readiness coordination with CamelCondition
- **Early Activation**: Components activate immediately for monitoring, with deferred Camel context creation

### Apache Camel Integration
- **OsgiDefaultCamelContext**: Full OSGi service registry integration
- **EMF Type Converters**: Automatic XML ↔ EObject conversions
- **Component Whiteboard**: Dynamic component discovery and configuration
- **Route Providers**: Service-based route contribution with ordering

### Message Streaming
- **Kafka Integration**: Native Kafka support with EObject serialization
- **Redpanda Setup**: Local streaming platform for development and testing
- **Robust Producers/Consumers**: Error handling and retry mechanisms

## Quick Start

### Build the Project
```bash
# Build all bundles
./gradlew build

# Run OSGi integration tests  
./gradlew testOSGi

# Generate test coverage
./gradlew codeCoverageReport
```

### Run Camel Examples
```bash
# Start the working Camel example
cd org.apache.camel
./gradlew resolve.camel
java -jar generated/camel.jar
```

### Start Kafka/Redpanda for Messaging
```bash
# Start Redpanda cluster for Kafka messaging
cd redpanda
./redpanda-setup.sh start

# Open Redpanda Console
./redpanda-setup.sh console

# Create test topics
./redpanda-setup.sh topics
```

### Run Integration Tests
```bash
# Run whiteboard integration tests
cd org.eclipse.fennec.camel.whiteboard.tests  
./gradlew testOSGi

# Run Kafka integration tests
cd org.eclipse.fennec.kafka
./gradlew testOSGi
```

## Architecture Overview

### EMF Pipeline Models
- **PipelineDefinition**: Reusable pipeline templates with dependencies and parameters
- **ConsumerConfiguration**: Consumer instances that use pipelines with parameter values  
- **ServiceDependency**: Tracks OSGi service dependencies with filters and cardinality
- **TextualRouteDefinition**: YAML/JSON/XML route definitions

### OSGi Whiteboard Pattern
- **ConfigurationAgent**: Processes EMF consumer configurations
- **PipelineWhiteboardInstance**: Per-pipeline components with dependency tracking
- **CamelCondition**: Infrastructure readiness coordination service
- **Route Providers**: Service-based route contribution with startup ordering

### Development Status
The project has completed a **dynamic, configuration-driven Camel pipeline architecture** using OSGi native capabilities. The implementation leverages battle-tested OSGi infrastructure (ConfigAdmin + ServiceTrackers + Felix SCR) instead of custom solutions, resulting in 90% code reduction with proven reliability.

## Documentation

### Project Documentation
- **[CLAUDE.md](CLAUDE.md)**: Complete development guide and architecture overview
- **[org.eclipse.fennec.camel.whiteboard/docs/](org.eclipse.fennec.camel.whiteboard/docs/)**: Detailed architecture documentation
  - `DEVELOPMENT_DIARY.md`: Implementation progress and decisions
  - `CAMEL_WHITEBOARD_ARCHITECTURE.md`: Whiteboard pattern details
  - `DYNAMIC_PIPELINE_REQUIREMENTS.md`: Pipeline requirements and patterns

### Working Examples Documentation  
- **[org.apache.camel/Apache-Camel-EMF-Integration-Guide.md](org.apache.camel/Apache-Camel-EMF-Integration-Guide.md)**: Complete pipeline configuration examples
- **[org.apache.camel/CAMEL_WHITEBOARD_ARCHITECTURE.md](org.apache.camel/CAMEL_WHITEBOARD_ARCHITECTURE.md)**: Whiteboard pattern architecture
- **[org.apache.camel/CONTEXT_STARTUP_ORDER.md](org.apache.camel/CONTEXT_STARTUP_ORDER.md)**: CamelContext startup sequence

### Integration Tutorials
- **[org.apache.camel/KAFKA-TUTORIAL.md](org.apache.camel/KAFKA-TUTORIAL.md)**: Step-by-step Kafka integration with Redpanda setup
- **[org.apache.camel/EMF-TUTORIAL.md](org.apache.camel/EMF-TUTORIAL.md)**: EMF object processing and route configuration
- **[org.apache.camel/SIMPLE-TUTORIAL.md](org.apache.camel/SIMPLE-TUTORIAL.md)**: Timer-based routes with EMF object creation
- **[org.apache.camel/COMPONENT-CONFIGURATION-GUIDE.md](org.apache.camel/COMPONENT-CONFIGURATION-GUIDE.md)**: Critical @Component annotation and targeting requirements

### External Services Documentation
- **[redpanda/README.md](redpanda/readme.md)**: Redpanda setup and management guide for Kafka development

## Key Libraries and Dependencies

- **Apache Camel 4.10+**: Core integration framework with OSGi support
- **Eclipse EMF**: Core modeling framework for pipeline definitions
- **Gecko EMF OSGi**: OSGi integration for EMF
- **Apache Felix**: OSGi framework implementation
- **BND/Gradle**: OSGi bundle tooling and build system
- **Apache Kafka**: Message streaming platform
- **Redpanda**: Kafka-compatible streaming platform for development
- **JUnit 5**: Testing framework with OSGi support

## License

**Eclipse Public License 2.0**

Copyright (c) 2012 - 2025 Data In Motion and others.

## Contributors

* **Mark Hoffmann** / [m.hoffmann@data-in-motion.biz](mailto:m.hoffmann@data-in-motion.biz) @ [Data In Motion](https://www.datainmotion.de) - *initial API and implementation*
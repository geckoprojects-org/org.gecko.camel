[![CI Build](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/build.yml/badge.svg)](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/build.yml)[![License](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/license.yml/badge.svg)](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/license.yml )[![Sonar](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/sonar.yml/badge.svg)](https://github.com/geckoprojects-org/org.gecko.emf.semantic/actions/workflows/sonar.yml )[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=bugs)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=code_smells)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=coverage)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=alert_status)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=security_rating)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=sqale_index)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_org.gecko.emf.semantic&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=geckoprojects-org_org.gecko.emf.semantic)

# org.gecko.emf.semantic

Eclipse EMF (Modeling Framework) based project that provides semantic mapping capabilities for [SensiNact](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway) IoT gateway. The project contains multiple OSGi bundles for handling EMF model generation, semantic transformations, and NGSI-LD protocol support.

## Features

### ValueMapper Implementation

The `ValueMapper` provides comprehensive mapping capabilities between EMF model instances and [SensiNact providers](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/tree/main/core/api):

#### Core Mapping Features
- **Instance Mapping**: Maps EObject instances to [SensiNact providers](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/twin/SensinactProvider.java) with automatic provider creation
- **Resource Value Extraction**: Extracts values from complex feature paths and converts them to appropriate types
- **Validation**: Validates EObject instances against mapping configurations before processing
- **Multi-value Feature Support**: Handles EMF collections by taking the first element from non-empty lists

#### Admin Service Mapping
- **FriendlyName Mapping**: Maps [admin service](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/docs/source/concepts.md#admin-service) friendlyName resources using feature paths or static values
- **Location Support**: Supports latitude, longitude, and elevation mapping for provider location data
- **Provider Package Integration**: Links admin services to their corresponding EMF packages

#### Advanced Timestamp Handling
- **Timestamp Precedence**: Service-level timestamps take precedence over provider-level timestamps
- **Feature Path Extraction**: Extracts timestamps from complex feature paths (e.g., `UplinkMessage/rxInfo[0]/time`)
- **Format Support**: Supports multiple timestamp formats with custom pattern hints using `DateTimeFormatter`
- **Fallback Logic**: Falls back to `Instant.now()` when no timestamp configuration is available

#### Type Conversion
- **Automatic Type Conversion**: Converts values using EMF's `EDataType` system with `EcoreUtil`
- **String to Instant Conversion**: Supports ISO instant parsing and custom date patterns
- **Primitive Type Handling**: Automatically boxes primitive types for [SensiNact resources](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/twin/SensinactResource.java)

### Testing Coverage

Comprehensive test suite demonstrating all features:

#### ValueMapperTest (`org.gecko.emf.sensinact.tests.ValueMapperTest`)
- **Resource Value Mapping**: `mapResourceValues_withDraginoExample_returnsValues()` - Tests extraction of battery level values
- **Instance Validation**: `validateInstance_withDraginoExample_returnsValidResult()` - Validates Dragino sensor instances
- **Provider Creation**: `mapInstance_withDraginoExample_createsProvider()` - Creates complete [SensiNact providers](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/twin/SensinactProvider.java) with admin services
- **Admin Service Mapping**: Verifies friendlyName extraction from `deviceProfileName` feature path
- **Timestamp Verification**: Tests timestamp extraction from `UplinkMessage/rxInfo[0]/time` with future timestamp handling
- **Error Handling**: Tests null parameter validation and proper exception handling

#### Test Data Examples
- **Dragino LSE01 Sensor**: Battery sensor with complex LoRaWAN message structure
- **Multi-value Navigation**: Demonstrates navigation through `rxInfo` collections
- **Real-world Mapping**: Uses actual sensor data with timestamps and device information

## Mapping Model

The mapping model provides a declarative way to transform EMF model instances into [SensiNact providers](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/twin/SensinactProvider.java). It consists of several key components:

### Core Mapping Components

#### ProviderMapping
The root mapping element that defines how EMF instances are transformed into SensiNact providers:

```xml
<mapping:ProviderMapping mid="dragino-battery-sensor" 
                        xmlns:mapping="https://eclipse.org/sensinact/core/mapping/1.0">
  <!-- Provider-level timestamp configuration -->
  <timestamp>
    <featurePath href="//UplinkMessage/rxInfo"/>
    <featurePath href="//RxInfo/time"/>
  </timestamp>
  
  <!-- Provider naming strategy -->
  <name name="Dragino LSE01 Battery Sensor">
    <featurePath href="//UplinkMessage/deduplicationId"/>
  </name>
  
  <!-- EMF classes this mapping applies to -->
  <providerClasses href="//DraginoLSE01Uplink"/>
  
  <!-- Admin service configuration -->
  <admin mid="admin">
    <friendlyNameFeature href="//UplinkMessage/deviceInfo"/>
    <friendlyNameFeature href="//DeviceInfo/deviceProfileName"/>
  </admin>
  
  <!-- Service mappings -->
  <services mid="battery">
    <!-- Service-level resources -->
  </services>
</mapping:ProviderMapping>
```

#### ServiceMapping
Defines how to map EMF data to SensiNact services:

```xml
<services mid="battery">
  <name name="Battery"/>
  <!-- Service-level timestamp (overrides provider timestamp) -->
  <timestamp hint="yyyy-MM-dd HH:mm:ss">
    <featurePath href="//CustomTimestamp/serviceTime"/>
  </timestamp>
  
  <resources mid="level" name="Battery Level" unit="V">
    <eType href="http://www.eclipse.org/emf/2002/Ecore#//EDouble"/>
    <valueFeature href="//DraginoLSE01Uplink/object"/>
    <valueFeature href="//DecodedObject/batV"/>
    <!-- Resource-specific timestamp reference -->
    <timestamp href="//@timestamp"/>
  </resources>
</services>
```

#### ResourceMapping
Maps EMF feature paths to SensiNact resource values:

```xml
<resources mid="temperature" name="Soil Temperature" unit="°C">
  <eType href="http://www.eclipse.org/emf/2002/Ecore#//EDouble"/>
  <valueFeature href="//DraginoLSE01Uplink/object"/>
  <valueFeature href="//DecodedObject/temp_SOIL"/>
  <defaultValue>0.0</defaultValue>
</resources>
```

### Feature Path Navigation

Feature paths define how to navigate through EMF model structures to extract values:

#### Simple Paths
```xml
<!-- Direct attribute access -->
<featurePath href="//UplinkMessage/deduplicationId"/>
```

#### Complex Paths with References
```xml
<!-- Navigate through references to reach target attribute -->
<featurePath href="//UplinkMessage/deviceInfo"/>
<featurePath href="//DeviceInfo/deviceProfileName"/>
```

#### Multi-value Collections
```xml
<!-- Automatically takes first element from rxInfo collection -->
<featurePath href="//UplinkMessage/rxInfo"/>
<featurePath href="//RxInfo/time"/>
```

### Timestamp Handling

The mapping model supports sophisticated timestamp handling with precedence rules:

#### Timestamp Precedence (highest to lowest)
1. **Resource-level timestamp**: `<timestamp href="//@timestamp"/>`
2. **Service-level timestamp**: Service's own `<timestamp>` element
3. **Provider-level timestamp**: ProviderMapping's `<timestamp>` element
4. **Current time**: `Instant.now()` as fallback

#### Timestamp Configuration Examples

**Static Timestamp:**
```xml
<timestamp>
  <timestamp>2024-06-20T08:48:38.863512Z</timestamp>
</timestamp>
```

**Feature Path Extraction:**
```xml
<timestamp>
  <featurePath href="//UplinkMessage/rxInfo"/>
  <featurePath href="//RxInfo/time"/>
</timestamp>
```

**Custom Format with Hint:**
```xml
<timestamp hint="yyyy-MM-dd HH:mm:ss">
  <featurePath href="//CustomMessage/formattedTime"/>
</timestamp>
```

## Profile Management

Profiles provide reusable mapping templates and validation rules. They enable consistent mapping patterns across different provider implementations.

### Profile Structure

#### MappingProfile
```xml
<mapping:MappingProfile profileId="battery-sensor" version="1.0" 
                       providerStrategy="UNIFIED">
  <provider providerId="battery-sensors"/>
  
  <!-- Required services for this profile -->
  <services mid="battery">
    <name name="Battery"/>
    <resources mid="level" name="Battery Level" unit="V">
      <eType href="http://www.eclipse.org/emf/2002/Ecore#//EDouble"/>
    </resources>
  </services>
  
  <!-- Required admin service -->
  <admin mid="admin">
    <name name="Admin"/>
  </admin>
</mapping:MappingProfile>
```

### Provider Strategies

#### UNIFIED Strategy
Multiple mappings share the same provider model:
```xml
<mapping:ProviderMapping mid="dragino-battery">
  <profile href="data/battery/battery-sensor-profile.xmi#battery-sensor"/>
  <!-- All dragino sensors use "battery-sensors" provider model -->
</mapping:ProviderMapping>

<mapping:ProviderMapping mid="em310udl-battery">
  <profile href="data/battery/battery-sensor-profile.xmi#battery-sensor"/>
  <!-- EM310UDL sensors also use "battery-sensors" provider model -->
</mapping:ProviderMapping>
```

#### SEPARATE Strategy (Default)
Each mapping creates its own provider model:
```xml
<mapping:ProviderMapping mid="weather-station">
  <!-- Creates "weather-station" provider model -->
  <services mid="temperature">...</services>
  <services mid="humidity">...</services>
</mapping:ProviderMapping>
```

### Profile Validation

The `MappingProfileRegistry` validates mappings against their profiles:

#### Validation Rules
- **Required Services**: All profile services must be present in mapping
- **Required Resources**: All profile resources must be mapped
- **Type Compatibility**: Resource types must match profile definitions
- **Admin Service**: Admin service requirements must be satisfied

#### Example Validation
```java
// In ValueMapperTest - automatic validation during mapping registration
mappingRegistry.registerModelMapping(batteryMapping);
// Throws IllegalArgumentException if validation fails
```

### Profile Usage Examples

#### Battery Sensor Profile
```xml
<!-- File: battery-sensor-profile.xmi -->
<mapping:MappingProfile profileId="battery-sensor" version="1.0">
  <provider providerId="battery-sensors"/>
  <services mid="battery">
    <resources mid="level" unit="V"/>
  </services>
  <admin mid="admin"/>
</mapping:MappingProfile>
```

#### Using the Profile
```xml
<!-- File: dragino-battery-mapping.xmi -->
<mapping:ProviderMapping mid="dragino-battery-sensor">
  <profile href="data/battery/battery-sensor-profile.xmi#battery-sensor"/>
  
  <!-- Implementation-specific details -->
  <providerClasses href="//DraginoLSE01Uplink"/>
  <services mid="battery">
    <resources mid="level">
      <valueFeature href="//DraginoLSE01Uplink/object"/>
      <valueFeature href="//DecodedObject/batV"/>
    </resources>
  </services>
</mapping:ProviderMapping>
```

### Configuration Examples

#### Complete Weather Station Mapping
```xml
<mapping:ProviderMapping mid="weather-station">
  <timestamp>
    <featurePath href="//WeatherData/measurementTime"/>
  </timestamp>
  
  <name name="DWD Weather Station">
    <featurePath href="//WeatherData/stationId"/>
  </name>
  
  <admin mid="admin">
    <friendlyName>Weather Station</friendlyName>
    <latitude>50.9497</latitude>
    <longitude>11.6082</longitude>
  </admin>
  
  <services mid="temperature">
    <name name="Temperature"/>
    <resources mid="value" unit="°C">
      <valueFeature href="//WeatherData/temperature"/>
    </resources>
  </services>
  
  <services mid="humidity">
    <name name="Humidity"/>  
    <resources mid="value" unit="%">
      <valueFeature href="//WeatherData/humidity"/>
    </resources>
  </services>
</mapping:ProviderMapping>
```

#### Multi-Sensor Battery Profile
```xml
<mapping:MappingProfile profileId="multi-battery" version="2.0" 
                       providerStrategy="UNIFIED">
  <provider providerId="battery-monitoring"/>
  
  <services mid="battery">
    <resources mid="level" unit="V"/>
    <resources mid="voltage" unit="V"/>
    <resources mid="current" unit="A"/> 
  </services>
  
  <services mid="diagnostics">
    <resources mid="health" unit="%"/>
    <resources mid="cycles" unit="count"/>
  </services>
</mapping:MappingProfile>
```

### Architecture

#### Core Components
- **ValueMapperImpl**: Main implementation handling instance mapping and timestamp logic
- **ProviderModelSensinactMapper**: Maps EMF models to [SensiNact model structures](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/tree/main/core/model)
- **MappingProfileRegistry**: Manages mapping profiles and validation
- **AdminMapping, ServiceMapping, ResourceMapping**: Configuration model classes

#### Feature Path Navigation
- **Complex Paths**: Supports navigation through references and attributes
- **Collection Handling**: Automatically takes first element from `EList` collections
- **Error Recovery**: Graceful handling of missing or invalid paths

#### Integration Points
- **SensiNact Digital Twin**: Direct integration with [SensiNact's Digital Twin API](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/twin/SensinactDigitalTwin.java) for provider management
- **EMF Type System**: Full utilization of EMF's `EDataType` and `EcoreUtil` conversion
- **OSGi Services**: Declarative Services integration for service lifecycle management

## SensiNact Integration

This project integrates deeply with the [Eclipse SensiNact](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway) IoT gateway platform:

### Core SensiNact APIs Used
- **[SensiNact Digital Twin](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/twin/SensinactDigitalTwin.java)**: Main interface for provider management
- **[SensiNact Provider](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/twin/SensinactProvider.java)**: Represents IoT devices/sensors
- **[SensiNact Service](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/twin/SensinactService.java)**: Groups related resources within a provider
- **[SensiNact Resource](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/twin/SensinactResource.java)**: Individual data points with timestamped values
- **[SensiNact Model Manager](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/model/SensinactModelManager.java)**: Manages provider model definitions

### SensiNact Documentation
- **[Concepts](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/docs/source/concepts.md)**: Core SensiNact concepts including providers, services, and resources
- **[Admin Service](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/docs/source/concepts.md#admin-service)**: Standard administrative service for all providers
- **[Gateway Thread](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway/blob/main/core/api/src/main/java/org/eclipse/sensinact/core/command/GatewayThread.java)**: Thread management for SensiNact operations

## Links

* [Documentation](https://github.com/geckoprojects-org/org.gecko.emf.semantic)
* [Source Code](https://github.com/geckoprojects-org/org.gecko.emf.semantic) (clone with `scm:git:git@github.com:geckoprojects-org/org.gecko.emf.semantic.git`)
* [Eclipse SensiNact Gateway](https://github.com/eclipse-sensinact/org.eclipse.sensinact.gateway) - The IoT gateway platform this project integrates with


## Developers

* **Juergen Albert** (jalbert) / [j.albert@data-in-motion.biz](mailto:j.albert@data-in-motion.biz) @ [Data In Motion](https://www.datainmotion.de) - *architect*, *developer*
* **Mark Hoffmann** (mhoffmann) / [m.hoffmann@data-in-motion.biz](mailto:m.hoffmann@data-in-motion.biz) @ [Data In Motion](https://www.datainmotion.de) - *developer*, *architect*

## Licenses

**Eclipse Public License 2.0**

## Copyright

Data In Motion Consuling GmbH - All rights reserved

-+
Data In Motion Consuling GmbH - [info@data-in-motion.biz](mailto:info@data-in-motion.biz)

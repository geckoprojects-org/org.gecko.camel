# Project Overview

This project, `org.gecko.emf.semantic`, is an Eclipse EMF (Modeling Framework) based project that provides semantic mapping capabilities for the SensiNact IoT gateway. The project contains multiple OSGi bundles for handling EMF model generation, semantic transformations, and NGSI-LD protocol support.

The project is built with Gradle and uses bnd to manage the OSGi bundles. The code is written in Java 17.

## Building and Running

To build the project, run the following command:

```bash
./gradlew build
```

This will build all the sub-projects and run the tests.

To run the project, you need to use the bndrun files. For example, to run the tests for the `org.gecko.emf.ngsi.tests` project, you can use the `test.bndrun` file in that project.

## Development Conventions

The project uses the following development conventions:

*   **Code Style:** The code follows the standard Java conventions.
*   **Testing:** The project uses JUnit 5 for testing. Each sub-project has its own test suite.
*   **Code Coverage:** The project uses JaCoCo for code coverage analysis. A code coverage report is generated in the `build/reports/jacoco/codeCoverageReport` directory.
*   **Code Quality:** The project uses SonarQube for code quality analysis.

## Key Files

*   `build.gradle`: The main Gradle build file.
*   `settings.gradle`: The Gradle settings file, which includes the sub-projects.
*   `cnf/build.bnd`: The bnd workspace configuration file.
*   `readme.md`: The project's README file, which provides a detailed overview of the project.

# ExampleWatsonAssistantJavaExtension

`ExampleWatsonAssistantJavaExtension` is a [MicroProfile 5](https://openliberty.io/docs/latest/microprofile.html) and [Jakarta EE 9.1 (Web Profile)](https://openliberty.io/docs/latest/jakarta-ee.html) web application for implementing an example Java extension for Watson Assistant.

## Local Development

### Build WAR

1. Pre-requisities:
    1. Java >= 8 is required on your `PATH`; for example, [IBM Semeru Runtimes](https://developer.ibm.com/languages/java/semeru-runtimes/downloads/)
1. Build and run:
    * macOS or Linux:
      ```
      ./mvnw clean liberty:dev
      ```
    * Windows:
      ```
      mvnw clean liberty:dev
      ```
1. Wait for the message:
   ```
   CWWKF0011I: The defaultServer server is ready to run a smarter planet.
   ```
1. Access at <http://localhost:8080/api/helloworld/execute> or <https://localhost:8443/api/helloworld/execute>

### Build container

1. Build:
   ```
   podman build -t ewaje .
   ```
1. Run:
   ```
   podman run --rm -p 8080:8080 -p 8443:8443 -e WLP_LOGGING_CONSOLE_FORMAT=simple -it ewaje
   ```
1. Wait for the message:
   ```
   CWWKF0011I: The defaultServer server is ready to run a smarter planet.
   ```
1. Access at <http://localhost:8080/api/helloworld/execute> or <https://localhost:8443/api/helloworld/execute>

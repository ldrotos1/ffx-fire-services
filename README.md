# ffx-fire-services
The service layer for the Fairfax Country Fire and Rescue Operations Dashboard application.

## Requirements
Java 17<br/>
Gradle 8<br/>

## Running locally
1. Clone the *ffx-fire-cert* project onto your development machine and run the *create_cert.sh* script
2. Install the *ffx-fire-root-CA.crt* into your web browser as a "Trusted Root Certification Authority" 
3. Set the application property, *server.ssl.key-store*, in the *api* sub-project to the path to the keystore file created in the first step
4. Run the following command to start the application ```gradle bootRun```
5. In your web browser navigate to https://localhost:8443/swagger-ui/index.html

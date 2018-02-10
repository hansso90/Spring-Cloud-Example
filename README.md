# Spring cloud example

Project to discover all ins and outs about de spring-cloud dependecies

## Discovery with Eureka

Modules:
- Discovery Server
- Discovery Service
- Discovery Client

Demo of Eureka:
First of all start de discovery server module. With http://localhost:8761/eureka you can see which services has called in.

Start the discovery service module with the follow environment variable:
-server.port = 8000
-service.instance.name = discovery-service 1
See at euerka if Discovery-service 1 has called in

Start a new discovery service with port 8001 en instance name: discovery-service 2
Look again if the service gives a notice to eureka;

For the last service start the discovery-client; Go to the next url: http://localhost:8080 and check the response;


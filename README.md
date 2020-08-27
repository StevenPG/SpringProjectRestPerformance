# SpringProjectRestPerformance
This repository contains the source code for an article around comparing the setup and execution time of three popular REST implementations with Spring.

## Deployment Environment

Each service will be deployed in an embedded tomcat jar on a t2.micro instance in AWS.

## RESTful implementations

- Spring Integration - Using InboundGateways and passing a message to an OutboundGateway
- Spring Web MVC - Setup using RestControllers and RestTemplate
- Spring Web MVC + Webflux - Setup using RestControllers and blocking WebClient
- Spring Webflux - Reactive Predicates and WebClient

## Measurements and Comparisons

- Lines of code/XML/Annotations (roughly)
- Total Number of Classes
- Total number of threads (limited by JVM args)

- Startup time until ready
- Cold request
- Hot request
- Response time from t2.nano
- 50 requests per second
- 100 requests per second
- N (UPDATE - this with latest values)
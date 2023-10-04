# distributed-tracing-demo
This is a demo project showcasing distributed tracing of multiple Spring Boot services using the Spring Cloud Sleuth library and Zipkin.
Sleuth handles trace data and generates TraceIds and SpanIds for logs.
Zipkin is an open source distributed tracking system, to which Sleuth sends trace data over http. 
To quickly setup zipkin with docker, use the command: 

**docker run -d -p 9411:9411 openzipkin/zipkin**

We are using Spring Boot 2 because, as noted in the [spring docs](https://docs.spring.io/spring-cloud-sleuth/docs/current/reference/html/) "Spring Cloud Sleuth will not work with Spring Boot 3.x onward. 
The last major version of Spring Boot that Sleuth will support is 2.x."

# References

[Spring Sleuth](https://spring.io/projects/spring-cloud-sleuth)

[Zipkin Quickstart](https://zipkin.io/pages/quickstart)



package com.theomyst.distributedtracingdemo.frontend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class FrontendService {

    /* You have to register RestTemplate as a bean so that the interceptors will get injected.
    If you create a RestTemplate instance with a new keyword then the instrumentation WILL NOT work.
    In this example, we register the bean through @Configuration in the config package. */
    private final RestTemplate restTemplate;

    public String getHelloWorld() {
        String hello = restTemplate.getForObject("http://localhost:8080/backend/hello", String.class);
        String world = restTemplate.getForObject("http://localhost:8080/backend/world", String.class);
        return hello + " " + world;
    }

}

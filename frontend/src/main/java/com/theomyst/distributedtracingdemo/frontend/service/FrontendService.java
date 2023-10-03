package com.theomyst.distributedtracingdemo.frontend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FrontendService {

    public String getHelloWorld() {
        RestTemplate restTemplate = new RestTemplate();
        String hello = restTemplate.getForObject("http://localhost:8080/backend/hello", String.class);
        String world = restTemplate.getForObject("http://localhost:8080/backend/world", String.class);
        return hello + " " + world;
    }

}

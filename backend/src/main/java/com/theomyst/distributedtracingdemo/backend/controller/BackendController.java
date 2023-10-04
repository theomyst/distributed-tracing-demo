package com.theomyst.distributedtracingdemo.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Thread.sleep;

@Slf4j
@RestController
@RequestMapping("/backend")
public class BackendController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        log.info("Backend - getHello invoked!");
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/world")
    public ResponseEntity<String> getWorld() throws InterruptedException {
        log.info("Backend - getWorld invoked!");

        /* Simulate an operation with poor performance */
        sleep(2000);

        return ResponseEntity.ok("World");
    }

}

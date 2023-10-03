package com.theomyst.distributedtracingdemo.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backend")
public class BackendController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/world")
    public ResponseEntity<String> getWorld() {
        return ResponseEntity.ok("World");
    }

}

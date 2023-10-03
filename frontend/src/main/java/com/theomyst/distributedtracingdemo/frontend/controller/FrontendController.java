package com.theomyst.distributedtracingdemo.frontend.controller;

import com.theomyst.distributedtracingdemo.frontend.service.FrontendService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/frontend")
public class FrontendController {

    private final FrontendService frontendService;

    @GetMapping("/helloWorld")
    public ResponseEntity<String> getHelloWorld() {
        log.info("Frontend - getHelloWorld invoked!");
        return ResponseEntity.ok(frontendService.getHelloWorld());
    }

}

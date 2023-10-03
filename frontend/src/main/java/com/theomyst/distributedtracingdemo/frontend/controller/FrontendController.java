package com.theomyst.distributedtracingdemo.frontend.controller;

import com.theomyst.distributedtracingdemo.frontend.service.FrontendService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/frontend")
public class FrontendController {

    private final FrontendService frontendService;

    @GetMapping("/helloWorld")
    public ResponseEntity<String> getHelloWorld() {
        return ResponseEntity.ok(frontendService.getHelloWorld());
    }

}

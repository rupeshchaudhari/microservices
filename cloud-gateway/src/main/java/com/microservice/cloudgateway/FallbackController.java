package com.microservice.cloudgateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/user")
    public ResponseEntity<String> userServiceFallback(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("User Service is Down, please contact system administrator");
    }
}

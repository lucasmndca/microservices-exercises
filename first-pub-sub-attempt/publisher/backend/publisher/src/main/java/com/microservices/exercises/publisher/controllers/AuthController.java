package com.microservices.exercises.publisher.controllers;

import com.microservices.exercises.publisher.controllers.request.AuthRequest;
import com.microservices.exercises.publisher.controllers.response.AuthResponse;
import com.microservices.exercises.publisher.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private PublisherService publisherService;


    @GetMapping("/auth/login")
    public ResponseEntity<AuthResponse> firstEndpoint() {

        AuthResponse authResponse = new AuthResponse();
        authResponse.setTimestamp(new Date());
        authResponse.setUserEmail("test@gmail.com");
        authResponse.setValid(true);

        return new ResponseEntity<>(authResponse, HttpStatus.OK);
    }

    @GetMapping("/oi")
    public ResponseEntity<Boolean> test(@RequestBody AuthRequest request) {
        publisherService.getArgsAndRun(request.toString());
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
    }

}

package com.microservices.exercises.publisher.controllers;

import com.microservices.exercises.publisher.controllers.response.AuthResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequestMapping("/auth/login")
    public ResponseEntity<AuthResponse> firstEndpoint(@RequestBody Object obj) {

        AuthResponse authResponse = new AuthResponse();
        authResponse.setUserEmail("test@gmail.com");
        authResponse.setValid(true);

        return new ResponseEntity<>(authResponse, HttpStatus.OK);
    }

}

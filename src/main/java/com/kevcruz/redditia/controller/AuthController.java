package com.kevcruz.redditia.controller;

import com.kevcruz.redditia.dto.RegisterRequest;
import com.kevcruz.redditia.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public void Login(){

    }
    @PostMapping("/register")
    public ResponseEntity<String> Register(@RequestBody RegisterRequest registerRequest){
        authService.Register(registerRequest);
        return new ResponseEntity<>("User Registration Successful", HttpStatus.OK);
    }
}

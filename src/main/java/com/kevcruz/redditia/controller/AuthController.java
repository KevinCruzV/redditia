package com.kevcruz.redditia.controller;

import com.kevcruz.redditia.dto.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/login")
    public void Login(){

    }
    @PostMapping("/register")
    public void Register(@RequestBody RegisterRequest registerRequest){

    }
}

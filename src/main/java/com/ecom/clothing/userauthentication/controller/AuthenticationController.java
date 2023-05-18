package com.ecom.clothing.userauthentication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class AuthenticationController {
    @GetMapping("/helloworld")
    private ResponseEntity<String> getPassword(){
        return new ResponseEntity<>("This is HelloWorld on azure vm ",HttpStatus.OK);
    }

}

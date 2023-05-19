package com.ecom.clothing.userauthentication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class AuthenticationController {
    @GetMapping("/healthCheck")
    private ResponseEntity<String> healthCheck(){
        return new ResponseEntity<>("This is HelloWorld on azure vm from ",HttpStatus.OK);
    }

    @GetMapping("/getProducts")
    private ResponseEntity<String> getProducts(){
        return new ResponseEntity<>("These are the products from azure app service ",HttpStatus.OK);
    }
}

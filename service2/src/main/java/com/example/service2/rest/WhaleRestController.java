package com.example.service2.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/whale")
public class WhaleRestController {
    @GetMapping
    public ResponseEntity<?> getWhale(){
        return new ResponseEntity<>("hello i am whale", HttpStatus.OK);
    }
}

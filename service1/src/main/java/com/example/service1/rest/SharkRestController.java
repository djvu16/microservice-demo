package com.example.service1.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shark")
public class SharkRestController {
    @GetMapping
    public ResponseEntity<?> getShark(){
        return new ResponseEntity<>("I am shark", HttpStatus.OK);
    }
}

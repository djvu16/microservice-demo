package com.example.service3.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/nemo")
public class NemoRestController {
    @GetMapping
    public ResponseEntity<?> getNemo(){
        return new ResponseEntity<>("Hello I am nemo", HttpStatus.OK);
    }
}

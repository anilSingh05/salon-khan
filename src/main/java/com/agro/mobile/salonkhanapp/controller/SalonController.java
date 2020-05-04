package com.agro.mobile.salonkhanapp.controller;

import com.agro.mobile.salonkhanapp.model.Greetings;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalonController {
    @GetMapping(value = "/salonkhan/welcome", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Greetings> greetings(){
        Greetings message = Greetings.builder()
                .message("Welcome To SalonKhan").build();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}

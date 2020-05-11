package com.gfa.groottest.controllers;

import com.gfa.groottest.errors.Error;
import com.gfa.groottest.models.Translator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.ReadPendingException;

@RestController
public class GuardianController {

    @GetMapping("/groot")
    public ResponseEntity getGroot(@RequestParam (required = false) String message) {
        if (message != null) {
            return ResponseEntity.ok().body(new Translator(message));
        } else {
            return ResponseEntity.badRequest().body(new Error("I am Groot!"));
        }
    }

}

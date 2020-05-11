package com.gfa.groottest.controllers;

import com.gfa.groottest.errors.Error;
import com.gfa.groottest.models.Arrow;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YonduController {

    @GetMapping("/yondu")
    public ResponseEntity yondusArrow(@RequestParam (required = false) String distance,
                                      @RequestParam (required = false) String time) {
        if (distance != null && time != null) {
            return ResponseEntity.ok().body(new Arrow(Double.parseDouble(distance), Double.parseDouble(time)));
        } else {
            return ResponseEntity.badRequest().body(new Error("Please provide right Parameters!"));
        }
    }
}

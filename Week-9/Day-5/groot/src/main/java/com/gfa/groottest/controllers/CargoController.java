package com.gfa.groottest.controllers;

import com.gfa.groottest.models.Cargo;
import com.gfa.groottest.models.Receipt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CargoController {

    private Cargo cargo = new Cargo();

    @GetMapping("/rocket")
    public Cargo returnActualCargo() {
        return cargo;
    }


    @GetMapping("/rocket/fill")
    public Receipt fillCargoOnShip(@RequestParam (required = false) String caliber,
                                   @RequestParam (required = false) String amount) {






        return new Receipt(caliber, Integer.parseInt(amount));




    }



}

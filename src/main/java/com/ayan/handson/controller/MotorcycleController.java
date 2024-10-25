package com.ayan.handson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.ayan.handson.entity.Motorcycle;
import com.ayan.handson.service.MotorcycleService;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/motorcycle")
public class MotorcycleController {

    private MotorcycleService motorcycleService;

    public MotorcycleController(MotorcycleService theMotorcycleService) {
        this.motorcycleService = theMotorcycleService;
    }

    @GetMapping("")
    public List<Motorcycle> getAllMotorCycle() {
        return motorcycleService.findAll();
    }
    
    @PostMapping("")
    public Motorcycle createMotorcycle(@RequestBody Motorcycle theMotorcycle) {
        Motorcycle outMotorcycle = motorcycleService.save(theMotorcycle);
        return outMotorcycle;
    }
    
}

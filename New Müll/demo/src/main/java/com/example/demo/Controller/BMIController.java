package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BMIService;

@RestController
public class BMIController {

    private final BMIService bmiService;

    @Autowired
    public BMIController(BMIService bmiService) {
        this.bmiService = bmiService;
    }

    @GetMapping("/calculateBMI")
    public String calculateBMI(
            @RequestParam String gender,
            @RequestParam double weight,
            @RequestParam double height) {
        return bmiService.calculateBMI(gender, weight, height);
    }
}

package com.calc.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "Result : " + (a + b);
    }

    @RequestMapping("/subtract")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        return "Result : " + (a - b);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        return "Result : " + (a * b);
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {
        return "Result : " + (a / b);
    }
}

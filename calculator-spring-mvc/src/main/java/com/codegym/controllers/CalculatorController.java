package com.codegym.controllers;

import com.codegym.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/index")
    public String goIndex() {
        return "index";
    }

    @PostMapping("/result")
    public String calculator(@RequestParam("first") String first, @RequestParam("second") String second, @RequestParam("operator") char operator, Model model) {
        String result = calculatorService.calculator(operator, Double.parseDouble(first), Double.parseDouble(second));
        model.addAttribute("result", result);
        return "index";
    }
}

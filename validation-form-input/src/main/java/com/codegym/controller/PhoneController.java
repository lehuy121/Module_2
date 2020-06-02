package com.codegym.controller;

import com.codegym.model.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller

public class PhoneController {
    @GetMapping("/phonePage")
    public String showForm(Model model){
        model.addAttribute("phoneNumber", new PhoneNumber());
        return "phone_number";
    }
    @PostMapping("/validatePhone")
    public String checkValidation (@Valid @ModelAttribute("phoneNumber")PhoneNumber phoneNumber, BindingResult bindingResult, Model model){
        new PhoneNumber().validate(phoneNumber, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "phone_number";
        }
        else {
            model.addAttribute("phoneNumber", phoneNumber.getNumber());
            return "result_phone_validator";
        }
    }
}

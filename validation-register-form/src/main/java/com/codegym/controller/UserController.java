package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String goIndex(Model model){
        model.addAttribute(new User());
        return "register";
    }

    @PostMapping("/save")
    public String validationForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        if(bindingResult.hasFieldErrors()){
            return ("register");
        }else{
            userService.save(user);
            redirectAttributes.addFlashAttribute("success","Save successfully");
            return "redirect:/list";
        }
    }
    @GetMapping("/list")
    public String displayAll(Model model){
        model.addAttribute("listUser", userService.findAll());
        return "list";
    }
}

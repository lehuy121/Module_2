package com.huy.controllers;

import com.huy.models.Sanwich;
import com.huy.services.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SandwichController {
    @Autowired
    SandwichService sandwichService;

    @GetMapping("/home")
    public String goHome(Model model) {
        model.addAttribute("sandwichCondiments", new Sanwich(1, true, true, false, false));
        return "home";
    }

    @PostMapping("/choose")
    public String showCondiments(@ModelAttribute Sanwich sanwich, Model model) {
        String result = sandwichService.getCondiment(sanwich);
        if(result.equals("")){
            model.addAttribute("no_choose", "No choose");
        }else{
            model.addAttribute("condiment", result.substring(0,result.length()-2));
        }
        return "result";
    }
}

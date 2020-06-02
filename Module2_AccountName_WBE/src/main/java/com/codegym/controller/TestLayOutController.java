package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestLayOutController {
    @GetMapping("/")
    public String goIndex(){
        return "layout";
    }
}

package com.codegym.controller;

import com.codegym.request.Credential;
import com.codegym.response.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("user")
public class LoginController {
    @GetMapping("/login")
    public String login(@ModelAttribute("credential") Credential credential) {
        return "login";
    }

    @PostMapping("/login")
    public String dashboard(@ModelAttribute("credential") Credential credential, RedirectAttributes redirectAttributes) {
        User user = new User();
        user.setUserName(credential.getUsername());
       // model.addAttribute("user", user);
        redirectAttributes.addFlashAttribute("user", user);
        return "redirect:dashboard";
    }

}

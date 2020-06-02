package com.codegym.controller;

import com.codegym.model.customer.CustomerType;
import com.codegym.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerTypeController {
    @Autowired
    CustomerTypeService customerTypeService;
    @GetMapping("customer-type-page")
    public String displayCustomerTypePage(Model model) {
        model.addAttribute("customerType", new CustomerType());
        return "customer_type/create-customer-type";
    }

    @PostMapping("create-customer-type")
    public String createCustomerType(@ModelAttribute("customerType") CustomerType customType, Model model) {
        customerTypeService.save(customType);
        model.addAttribute("success", "Create Customer Type Successfully");
        return "customer_type/create-customer-type";
    }
}

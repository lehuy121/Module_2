package com.codegym.controller;

import com.codegym.model.customer.Customer;
import com.codegym.model.customer.CustomerType;
import com.codegym.service.CustomerService;
import com.codegym.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;

    @ModelAttribute("listCustomerType")
    public List<CustomerType> customerType() {
        return customerTypeService.getAll();
    }

    @GetMapping("displayCustomerList")
    public String showCustomerList(Model model, @PageableDefault(size = 3) Pageable pageable) {
        model.addAttribute("customer_list", customerService.getAll(pageable));
        return "customer/customer";
    }

    @GetMapping("create-customer-page")
    public String showCreateCustomerPage(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("listCustomerType", customerTypeService.getAll());
        return "customer/new-customer";
    }

    @PostMapping("create-customer")
    public String createCustomerAction(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, Model model) {

        if (bindingResult.hasFieldErrors()) {
            return "customer/new-customer";
        } else {
            customerService.create(customer);
            model.addAttribute("success", "Create customer successfully");
            return "customer/new-customer";
        }
    }

    @GetMapping("edit-customer/{id}")
    public String editCustomerPage(@PathVariable String id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "customer/edit-customer";
    }

    @PostMapping("edit-customer")
    public String editCustomer(@Valid @ModelAttribute ("customer") Customer customer, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "customer/edit-customer";
        }else{
            customerService.create(customer);
            return "redirect:/displayCustomerList";
        }
    }
    @GetMapping("delete-customer/{id}")
    public String deleteCustomer(@PathVariable String id){
        customerService.delete(id);
        return "redirect:/displayCustomerList";
    }

}

package com.codegym.controller;

import com.codegym.model.contract.Contract;
import com.codegym.model.customer.Customer;
import com.codegym.model.service.Service;
import com.codegym.service.ContractService;
import com.codegym.service.CustomerService;
import com.codegym.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;


@Controller
public class ContractController {
    @Autowired
    ContractService contractService;
    @Autowired
    CustomerService customerService;

    @Autowired
    ServicesService servicesService;

    @ModelAttribute("customerList")
    public List<Customer> customerList(){
        return customerService.getAll();
    }

    @ModelAttribute("serviceList")
    public List<Service> serviceList(){
        return servicesService.getAll();
    }

    @GetMapping("contractPage")
    public String displayContractPage(Model model){
        model.addAttribute("contract", new Contract());
        return "contract/new-contract";
    }

    @PostMapping("create-contract")
    public String createContract(@Valid @ModelAttribute Contract contract, Model model){
        contract.totalMoney();
        contractService.save(contract);
        model.addAttribute("success", "Create Contract Successfully");
        return "contract/new-contract";
    }
}

package com.codegym.controller;

import com.codegym.model.customer.CustomerType;
import com.codegym.model.service.RentType;
import com.codegym.model.service.ServiceType;
import com.codegym.service.RentTypeService;
import com.codegym.service.ServicesService;
import com.codegym.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ServiceController {
    @Autowired
    ServicesService servicesService;
    @Autowired
    ServiceTypeService serviceTypeService;
    @Autowired
    RentTypeService rentTypeService;

    @ModelAttribute("listServiceType")
    public List<ServiceType> serviceType() {
        return serviceTypeService.getAll();
    }

    @ModelAttribute("listRentType")
    public List<RentType> rentType() {
        return rentTypeService.getAll();
    }

    @GetMapping("serviceTypePage")
    public String displayServiceTypePage(Model model){
        model.addAttribute("serviceType", new ServiceType());
        return "service/service-type";
    }
    @PostMapping("create-service-type")
    public String createServiceType(@ModelAttribute("serviceType") ServiceType serviceType, Model model){
        serviceTypeService.save(serviceType);
        model.addAttribute("success", "Create Service Type Successfully");
        return "service/service-type";
    }

    @GetMapping("rentTypePage")
    public String displayRentTypePage(Model model){
        model.addAttribute("rentType", new RentType());
        return "service/rent-type";
    }

    @PostMapping("create-rent-type")
    public String createRentType(@ModelAttribute("rentType") RentType rentType, Model model){
        rentTypeService.save(rentType);
        model.addAttribute("success", "Create Rent Type Successfully");
        return "service/rent-type";
    }

    @GetMapping("servicePage")
    public String displayServicePage(Model model){
        model.addAttribute("service", new com.codegym.model.service.Service());
        return "service/new-service";
    }
    @PostMapping("create-service")
    public String createService(@Valid @ModelAttribute("service")com.codegym.model.service.Service service, BindingResult bindingResult, Model model){

        if (bindingResult.hasFieldErrors()) {
            return "service/new-service";
        } else {
            servicesService.save(service);
            model.addAttribute("success", "Create service successfully");
            return "service/new-service";
        }
    }
}

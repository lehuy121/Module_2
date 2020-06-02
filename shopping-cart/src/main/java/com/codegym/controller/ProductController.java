package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("createPage")
    public String createPage(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("create")
    public String createProduct(@ModelAttribute Product product, Model model) {
        productService.save(product);
        model.addAttribute("success", "Create Product Successfully");
        return "create";
    }
    @GetMapping("listProductPage")
    public String displayAllProduct(Model model){
        model.addAttribute("products", productService.findAll());
        return "product";
    }
    @GetMapping("detail/{id}")
    public String displayDetail(@PathVariable Integer id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "detail";
    }
}

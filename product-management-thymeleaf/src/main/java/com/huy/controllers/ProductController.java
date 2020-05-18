package com.huy.controllers;

import com.huy.models.Product;
import com.huy.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/index")
    public String goIndex(Model model) {
        model.addAttribute("listProducts", productService.displayAll());
        return "index";
    }

    @GetMapping("addProductPage")
    public String goAdd(Model model) {
        model.addAttribute("product", new Product("Product name", 10.0f, "Product description", "product Provider"));
        return "add";
    }

    @PostMapping("/addProduct")
    public String addNewProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 1000000));
        productService.add(product);
        redirectAttributes.addFlashAttribute("success", "Add product successfully");
        return "redirect:index";
    }

    @GetMapping("editProductPage/{id}")
    public String goEdit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.searchById(id));
        return "edit";
    }

    @PostMapping("/editProduct")
    public String editProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        productService.edit(product.getId(), product);
        redirectAttributes.addFlashAttribute("success", "Edit product successfully");
        return "redirect:index";
    }

    @GetMapping("deleteProductPage/{id}")
    public String goDelete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.searchById(id));
        return "delete";
    }

    @PostMapping("/deleteProduct")
    public String deleteProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        productService.delete(product.getId());
        redirectAttributes.addFlashAttribute("success", "Delete product successfully");
        return "redirect:index";
    }

    @GetMapping("viewProductPage/{id}")
    public String goView(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.searchById(id));
        return "view";
    }

    @GetMapping("/sortByName")
    public String sortByName(Model model){
        model.addAttribute("listProducts", productService.displayByName());
        return("index");
    }
    @GetMapping("/sortByPrice")
    public String sortByPrice(Model model){
        model.addAttribute("listProducts", productService.displayByPrice());
        return("index");
    }

}

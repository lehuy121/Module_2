package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;


@Controller
@SessionAttributes("product")
public class CartController {
    static Map<Integer, Cart> cartMap = new HashMap<>();
    static int count = 0;

//    @PostMapping("addToCart")
//    public String adToCart(@ModelAttribute("product") Product product, Model model) {
//        count++;
//        if (cartMap.containsKey(product.getId())) {
//            cartMap.put(product.getId(), new Cart(product, count));
//        } else {
//            cartMap.put(product.getId(), new Cart(product, 1));
//        }
//
//        model.addAttribute("success", "Add to cart successfully");
//        return "detail";
//    }

    @PostMapping("addToCart")
    public String adToCart(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {

        if (cartMap.containsKey(product.getId())) {
            cartMap.put(product.getId(), new Cart(product, 1));
            redirectAttributes.addFlashAttribute("success", product.getName() + ": Has been order");
        } else {
            cartMap.put(product.getId(), new Cart(product, 1));
            redirectAttributes.addFlashAttribute("success", product.getName() + ": Add to card successfully");
        }

        return "redirect:/listProductPage";
    }

    @GetMapping("viewAddToCart")
    public String displayAddToCart(Model model) {
        int quantity;
        double price;
        double subTotal;
        double total = 0;
        for (Map.Entry<Integer, Cart> entry : cartMap.entrySet()) {
            quantity = entry.getValue().getQuantity();
            price = entry.getValue().getProduct().getPrice();
            subTotal = quantity * price;
            total += subTotal;
        }
        model.addAttribute("total", total);
        model.addAttribute("listCart", cartMap.values());
        model.addAttribute("count", cartMap.values().size());
        // model.addAttribute("count", count);
        return "add-to-cart";
    }

    @PostMapping("changeQuantity/{id}")
    public String changeQuantity(@ModelAttribute Product product, @PathVariable Integer id, @RequestParam(required = false, value = "quantity") String quantity) {
        Integer changeQuantity = Integer.parseInt(quantity);
        if (cartMap.containsKey(id)) {
            cartMap.put(id, new Cart(product, changeQuantity));
        }

        return "redirect:/viewAddToCart";
    }
    @GetMapping("remove/{id}")
    public String removeOder(@PathVariable Integer id){
        cartMap.remove(id);
        return "redirect:/viewAddToCart";
    }
}

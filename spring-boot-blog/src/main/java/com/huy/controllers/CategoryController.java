package com.huy.controllers;

import com.huy.models.Category;
import com.huy.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/createCategoryPage")
    public String createCategoryPage(Model model){
        model.addAttribute("category", new Category());
        return "category/create";
    }
    @PostMapping("/createCategory")
    public String createCategory(@ModelAttribute("category") Category category, Model model){
        categoryService.create(category);
        model.addAttribute("success", "Create Category Successfully");
        return "category/create";
    }
    @GetMapping("/listCategory")
    public String listCategory(Model model){
        model.addAttribute("listCategory", categoryService.getAll());
        return "category/list";
    }
    @GetMapping("/editCategory/{id}")
    public String editCategoryPage(@PathVariable Integer id, Model model){
        model.addAttribute("category", categoryService.getById(id));
        return "category/edit";
    }
    @PostMapping("/editCategory")
    public String editCategory(@ModelAttribute("category") Category category, Model model){
        categoryService.create(category);
        model.addAttribute("success", "Edit Category Successfully");
        return "category/edit";
    }
    @GetMapping("deleteCategory/{id}")
    public String deleteCategory(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        categoryService.delete(id);
        redirectAttributes.addFlashAttribute("success", "Delete Category Successfully");
        return "redirect:/listCategory";
    }

}

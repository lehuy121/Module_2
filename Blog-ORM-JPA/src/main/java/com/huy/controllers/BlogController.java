package com.huy.controllers;

import com.huy.models.Blog;
import com.huy.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping("/")
    public String createBlogPage(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }
    @PostMapping("createBlog")
    public String createBlogAction(@ModelAttribute("blog") Blog blog, Model model){
        blogService.create(blog);
        model.addAttribute("success", "Create Blog Successfully");
        return "create";
    }
    @GetMapping("listBlog")
    public String listBlogPage(Model model){
        model.addAttribute("listBlog", blogService.getAll());
        return "list";
    }
    @GetMapping("detail/{id}")
    public String detailBlog(@PathVariable Integer id, Model model){
        model.addAttribute("blog", blogService.getById(id));
        return "detail";
    }
    @GetMapping("edit/{id}")
    public String editPage(@PathVariable Integer id, Model model){
        model.addAttribute("blog", blogService.getById(id));
        return "edit";
    }
    @PostMapping("edit")
    public String editBlogAction(@ModelAttribute("blog") Blog blog, Model model){
        blogService.create(blog);
        model.addAttribute("success","Edit Blog Successfully");
        return "edit";
    }
    @GetMapping("delete/{id}")
    public String deleteBlog(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        blogService.delete(id);
        redirectAttributes.addFlashAttribute("success", "Delete Blog Successfully");
        return "redirect:/listBlog";
    }
}

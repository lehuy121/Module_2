package com.huy.controllers;

import com.huy.models.Blog;
import com.huy.models.Category;
import com.huy.services.BlogService;
import com.huy.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public List<Category> categories() {
        return categoryService.getAll();
    }

    @GetMapping("/homePage")
    public String homePage(Model model, @PageableDefault(size = 3) Pageable pageable, @RequestParam Optional<String> keyword) {
       // model.addAttribute("listCategory", categoryService.getAll());
        String keywordLast = null;
        if(keyword.isPresent()){
            keywordLast = keyword.get();
            model.addAttribute("listBlogs", blogService.findAllByTitleContainingOrderByCreatedAtDesc(keywordLast,pageable));
        }else{
            model.addAttribute("listBlogs", blogService.findAllByOrderByCreatedAtDesc(pageable));
        }
        model.addAttribute("keyword", keywordLast);
        return "blog/home";
    }

    @GetMapping("blog-by-category/{id}/{name}")
    public String blogByCategoryPage(@PathVariable Integer id, Model model, @PageableDefault(size = 3) Pageable pageable, @PathVariable String name) {
        model.addAttribute("listBlog", blogService.findAllBlogByCategory(id, pageable));
        model.addAttribute("categoryName", name);
        return "blog/blog-by-category";
    }

    @GetMapping("/createBlogPage")
    public String createBlogPage(Model model) {
        model.addAttribute("blog", new Blog());
        // model.addAttribute("listCategory", categoryService.getAll());
        return "blog/create";
    }

    @PostMapping("createBlog")
    public String createBlogAction(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.create(blog);
        redirectAttributes.addFlashAttribute("success", "Create Blog Successfully");
        return "redirect:/createBlogPage";
    }

    @GetMapping("listBlogPage")
    public String listBlogPage(Model model, @PageableDefault(size = 3) Pageable pageable) {
        model.addAttribute("listBlog", blogService.getAll(pageable));
        return "blog/list";
    }

    @GetMapping("detail/{id}")
    public String detailBlog(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", blogService.getById(id));
        return "blog/detail";
    }

    @GetMapping("edit/{id}")
    public String editPage(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", blogService.getById(id));
        return "blog/edit";
    }

    @PostMapping("edit")
    public String editBlogAction(@ModelAttribute("blog") Blog blog, Model model) {
        blogService.create(blog);
        model.addAttribute("success", "Edit Blog Successfully");
        return "blog/edit";
    }

    @GetMapping("delete/{id}")
    public String deleteBlog(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        blogService.delete(id);
        redirectAttributes.addFlashAttribute("success", "Delete Blog Successfully");
        return "redirect:/listBlogPage";
    }


}

package com.huy.controllers;

import com.huy.models.Blog;
import com.huy.models.Category;
import com.huy.services.BlogService;
import com.huy.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("restful")
public class BlogRestfulController {

    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/listCategory")
    public ResponseEntity<List<Category>> listCategory() {
        List<Category> categoryList = categoryService.getAll();
        return new ResponseEntity<List<Category>>(categoryList, HttpStatus.OK);
    }
    @GetMapping("/listBlog")
    public ResponseEntity<List<Blog>> listBlog(){
        List<Blog> blogList = blogService.getAll();
        return new ResponseEntity<List<Blog>>(blogList, HttpStatus.OK);
    }
    @GetMapping("/listBlogByCategory/{id}")
    public ResponseEntity<List<Blog>> listBlogByCategory(@PathVariable Integer id){
        List<Blog> blogListByCategory = blogService.findAllBlogByCategory(id);
        return new ResponseEntity<List<Blog>>(blogListByCategory, HttpStatus.OK);
    }
    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> showBlogDetail(@PathVariable Integer id){
        Blog blog = blogService.getById(id);
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }

}

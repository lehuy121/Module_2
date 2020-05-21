package com.huy.services;

import com.huy.models.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> getAll();
    Blog getById(Integer idBlog);
    void create(Blog blog);
    void delete(Integer idBlog);
}

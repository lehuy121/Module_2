package com.huy.repositorys;

import com.huy.models.Blog;

import java.util.List;

public interface BlogRepository {
    List<Blog> getAll();
    Blog getById(Integer idBlog);
    void create(Blog blog);
    void delete(Integer idBlog);
}

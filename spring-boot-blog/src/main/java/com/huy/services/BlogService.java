package com.huy.services;

import com.huy.models.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> getAll(Pageable pageable);
    List<Blog> getAll();
    List<Blog>findAllBlogByCategory(Integer id);
    Blog getById(Integer idBlog);
    void create(Blog blog);
    void delete(Integer idBlog);
    Page<Blog>findAllBlogByCategory(Integer id, Pageable pageable);
    Page<Blog>findAllByOrderByCreatedAtDesc(Pageable pageable);
    Page<Blog> findAllByTitleContainingOrderByCreatedAtDesc(String title,Pageable pageable);
    Page<Blog> findAllByTitleContaining(String title,Pageable pageable);

}

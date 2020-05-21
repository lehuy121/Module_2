package com.huy.services;

import com.huy.models.Blog;
import com.huy.repositorys.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImp implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> getAll() {
        return blogRepository.getAll();
    }

    @Override
    public Blog getById(Integer idBlog) {
        return blogRepository.getById(idBlog);
    }

    @Override
    public void create(Blog blog) {
        blogRepository.create(blog);
    }

    @Override
    public void delete(Integer idBlog) {
        blogRepository.delete(idBlog);
    }
}

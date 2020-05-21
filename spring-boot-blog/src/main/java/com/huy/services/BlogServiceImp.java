package com.huy.services;

import com.huy.models.Blog;
import com.huy.repositorys.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImp implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public Page<Blog> getAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog getById(Integer idBlog) {
        return blogRepository.findById(idBlog).orElse(null);
    }

    @Override
    public void create(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(Integer idBlog) {
        blogRepository.deleteById(idBlog);
    }

    @Override
    public Page<Blog> findAllBlogByCategory(Integer id, Pageable pageable) {
        return blogRepository.findByCategory_Id(id, pageable);
    }

    @Override
    public Page<Blog> findAllByOrderByCreatedAtDesc(Pageable pageable) {
        return blogRepository.findAllByOrderByCreatedAtDesc(pageable);
    }

    @Override
    public Page<Blog> findAllByTitleContainingOrderByCreatedAtDesc(String title, Pageable pageable) {
        return blogRepository.findAllByTitleContainingOrderByCreatedAtDesc(title, pageable);
    }

}

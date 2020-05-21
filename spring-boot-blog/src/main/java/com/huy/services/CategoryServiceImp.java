package com.huy.services;
import com.huy.models.Category;
import com.huy.repositorys.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(Integer idCategory) {
        return categoryRepository.findById(idCategory).orElse(null);
    }

    @Override
    public void create(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void delete(Integer idCategory) {
        categoryRepository.deleteById(idCategory);

    }
}

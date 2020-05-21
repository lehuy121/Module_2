package com.huy.services;
import com.huy.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category getById(Integer idCategory);
    void create(Category category);
    void delete(Integer idCategory);
}

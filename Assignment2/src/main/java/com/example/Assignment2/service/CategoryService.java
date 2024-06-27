package com.example.Assignment2.service;


import com.example.Assignment2.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    void create(Category category);
    void delete(Long categoryId);
    void update(Long categoryId, Category category);
    Category getCategory(Long categoryId);
}

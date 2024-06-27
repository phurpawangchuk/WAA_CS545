package com.example.Assignment2.controller;

import com.example.Assignment2.entity.Category;
import com.example.Assignment2.entity.User;
import com.example.Assignment2.service.CategoryService;
import com.example.Assignment2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public String create(@RequestBody Category category){
        System.out.println(category.getName());
        categoryService.create(category);
        return "Category created.";
    }

    @GetMapping
    public List<Category> getAll(){
       return categoryService.getAll();
    }

    @GetMapping("/{catId}")
    public Category getCategory(@PathVariable Long catId){

        return categoryService.getCategory(catId);
    }

    @PutMapping("/{catId}")
    public String update(@PathVariable Long catId, @RequestBody Category category){
        categoryService.update(catId, category);
        return "Cateogry updated.";
    }

    @DeleteMapping("/{catId}")
    public String delete(@PathVariable Long catId){
        categoryService.delete(catId);
        return "Category Deleted.";
    }
}

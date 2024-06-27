package com.example.Assignment2.repository;

import com.example.Assignment2.entity.Category;
import com.example.Assignment2.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends ListCrudRepository<Category, Long>{
}

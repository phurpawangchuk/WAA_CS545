package com.example.Assignment2.repository;

import com.example.Assignment2.entity.Category;
import com.example.Assignment2.entity.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ListCrudRepository<Product, Long> {
   List<Product> findProductByPriceGreaterThan(Long minPrice);
   List<Product> findProductsByCategoryAndPriceLessThan(Category cat, Long maxPrice);
   List<Product> findProductByNameContains(String keyword);
}

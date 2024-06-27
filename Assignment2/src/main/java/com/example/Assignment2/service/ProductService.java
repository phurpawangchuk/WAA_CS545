package com.example.Assignment2.service;

import com.example.Assignment2.entity.Category;
import com.example.Assignment2.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAll();
    void create(Product product);
    void delete(Long productId);
    void update(Long productId, Product product);
    Product getProduct(Long productId);
    List<Product> findProductByPriceGreaterThan(Long productId);
    List<Product> findProductByCatAndMaxPrice(Category cat, Long maxPrice);
    List<Product> findProductWithKeyword(String keyword);

}

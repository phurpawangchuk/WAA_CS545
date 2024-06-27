package com.example.Assignment2.service.Imp;

import com.example.Assignment2.entity.Category;
import com.example.Assignment2.entity.Product;
import com.example.Assignment2.repository.ProductRepository;
import com.example.Assignment2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {

        @Autowired
        private final ProductRepository productRepository;

        @Override
        public List<Product> getAll() {
            return productRepository.findAll();
        }

        @Override
        public void create(Product product) {
            productRepository.save(product);
        }

        @Override
        public void delete(Long productId) {
            productRepository.deleteById(productId);
        }

        @Override
        public void update(Long productId, Product product) {
            Optional<Product> optionalProduct = productRepository.findById(productId);
            if (optionalProduct.isPresent()) {
                Product productToUpdate = optionalProduct.get();
                productToUpdate.setName(product.getName());
                productRepository.save(productToUpdate);
            } else {
                throw new RuntimeException("Product not found with id " + productId);
            }
        }

        @Override
        public Product getProduct(Long productId) {
            return productRepository.findById(productId).get();
        }

    @Override
    public List<Product> findProductByPriceGreaterThan(Long minPrice) {
        return productRepository.findProductByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findProductByCatAndMaxPrice(Category category, Long maxPrice) {
        return productRepository.findProductsByCategoryAndPriceLessThan(category, maxPrice);
    }

    @Override
    public List<Product> findProductWithKeyword(String keyword) {
        return productRepository.findProductByNameContains(keyword);
    }
}

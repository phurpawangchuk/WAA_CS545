package com.example.Assignment2.service;

import com.example.Assignment2.entity.Product;
import com.example.Assignment2.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAll();
    void create(Review review);
    void delete(Long reviewId);
    void update(Long reviewId, Review review);
    Review getReview(Long reviewId);
    List<Review> productReview(Long productId);
}

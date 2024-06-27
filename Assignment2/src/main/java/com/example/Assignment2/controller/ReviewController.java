package com.example.Assignment2.controller;

import com.example.Assignment2.entity.Review;
import com.example.Assignment2.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public String create(@RequestBody Review review){
        reviewService.create(review);
        return "Review created.";
    }

    @GetMapping
    public List<Review> getAll(){
        return reviewService.getAll();
    }

    @GetMapping("/{reviewId}")
    public Review getReview(@PathVariable Long reviewId){

        return reviewService.getReview(reviewId);
    }

    @PutMapping("/{reviewId}")
    public String update(@PathVariable Long reviewId, @RequestBody Review review){
        reviewService.update(reviewId, review);
        return "Review updated.";
    }

    @DeleteMapping("/{reviewId}")
    public String delete(@PathVariable Long reviewId){
        reviewService.delete(reviewId);
        return "Review Deleted.";
    }

    @GetMapping("/product/{productId}")
    public List<Review> productReviews(@PathVariable Long productId){
        return reviewService.productReview(productId);
    }
}

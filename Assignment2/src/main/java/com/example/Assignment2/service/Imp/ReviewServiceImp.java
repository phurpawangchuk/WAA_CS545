package com.example.Assignment2.service.Imp;

import com.example.Assignment2.entity.Review;
import com.example.Assignment2.repository.ReviewRepository;
import com.example.Assignment2.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImp implements ReviewService {

    @Autowired
    private final ReviewRepository reviewRepository;

    @Override
    public List<Review> getAll() {
        return reviewRepository.findAll();
    }

    @Override
    public void create(Review review) {
        reviewRepository.save(review);
    }

    @Override
    public void delete(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }

    @Override
    public void update(Long reviewId, Review review) {
        Optional<Review> optionalReview = reviewRepository.findById(reviewId);
        if (optionalReview.isPresent()) {
            Review reviewToUpdate = optionalReview.get();
            reviewToUpdate.setComment(review.getComment());
            reviewRepository.save(reviewToUpdate);
        } else {
            throw new RuntimeException("Review not found with id " + reviewId);
        }
    }

    @Override
    public Review getReview(Long reviewId) {
        return reviewRepository.findById(reviewId).get();
    }


    public List<Review> productReview(Long productId) {
        return reviewRepository.findReviewsByProduct_Id(productId);
    }
}

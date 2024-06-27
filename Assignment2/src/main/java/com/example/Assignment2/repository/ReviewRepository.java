package com.example.Assignment2.repository;

import com.example.Assignment2.entity.Review;
import com.example.Assignment2.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends ListCrudRepository<Review, Long>{
    List<Review> findReviewsByProduct_Id(Long productId);
}

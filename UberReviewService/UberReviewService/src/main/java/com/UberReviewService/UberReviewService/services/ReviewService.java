package com.UberReviewService.UberReviewService.services;

import com.UberReviewService.UberReviewService.models.Review;
import com.UberReviewService.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    private final ReviewRepository repository;

    public ReviewService(ReviewRepository reviewRepository){
        this.repository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("*************");
//        Review r = Review.builder().content("Amazon Ride Quality").
//                createdAt(new Date()).
//                updatedAt(new Date()).
//                rating(4.0).
//                build();
//
//        System.out.println(r);
//        System.out.println(repository == null);
//          repository.save(r);
//
//        List<Review> reviews = repository.findAll();
//
//        for (Review review : reviews){
//            System.out.println(review.getContent());

//        }
        repository.deleteById(3L);

    }
}

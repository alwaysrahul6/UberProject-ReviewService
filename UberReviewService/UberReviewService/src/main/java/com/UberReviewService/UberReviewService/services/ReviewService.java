package com.UberReviewService.UberReviewService.services;

import com.UberReviewService.UberReviewService.models.Booking;
import com.UberReviewService.UberReviewService.models.Review;
import com.UberReviewService.UberReviewService.repositories.BookingRepository;
import com.UberReviewService.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private final ReviewRepository repository;

    private final BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository){
        this.repository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("*************");
//        Review r = Review.builder().content("Uber Ride Service").rating(4.0).build();
//        Booking booking = Booking.builder().review(r).enddate(new Date()).build();
//        bookingRepository.save(booking);
//
//
//        System.out.println(r.getId());
//        System.out.println(repository == null);
//        assert repository != null;
////        repository.save(r);
//
//        List<Review> reviews = repository.findAll();
//
//        for (Review review : reviews){
//            System.out.println(review.getContent());
//        }
        Optional<Booking> b = bookingRepository.findById(1L);
        if (b.isPresent()){
            bookingRepository.delete(b.get());
        }

    }
}

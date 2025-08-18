package com.UberReviewService.UberReviewService.repositories;
import com.UberReviewService.UberReviewService.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review ,Long> {
}

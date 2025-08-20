package com.UberReviewService.UberReviewService.repositories;

import com.UberReviewService.UberReviewService.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}

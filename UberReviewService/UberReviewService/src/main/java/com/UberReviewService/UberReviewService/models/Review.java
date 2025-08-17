package com.UberReviewService.UberReviewService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Review {
    @Id /// this annotion make the id propert is a primrey key of our table
    Long id;


}

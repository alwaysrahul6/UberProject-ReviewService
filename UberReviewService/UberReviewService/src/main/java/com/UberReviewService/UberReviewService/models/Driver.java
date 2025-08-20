package com.UberReviewService.UberReviewService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Driver extends BaseModel{

    private String name;

    @Column(nullable = false , unique = true)
    private String licenceNumber;

    @OneToMany(mappedBy = "driver")
    List<Booking> bookings = new ArrayList<>();
}

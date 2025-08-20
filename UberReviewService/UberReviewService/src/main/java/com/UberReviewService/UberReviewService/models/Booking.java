package com.UberReviewService.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder

public class Booking extends BaseModel {
    @OneToOne(cascade = CascadeType.PERSIST)
    private Review review;

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(TemporalType.DATE)
    private Date startdate;

    private Date enddate;

    private Long totalDistance;
}

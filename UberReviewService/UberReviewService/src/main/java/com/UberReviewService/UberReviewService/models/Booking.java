package com.UberReviewService.UberReviewService.models;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Booking extends BaseModel {
    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;
    @Temporal(TemporalType.DATE)
    private Date startdate;

    private Date enddate;
}

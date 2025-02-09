package com.shrsyc.HeyAUTO.HeyAUTOapp.dto;

import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.enums.PaymentMethod;
import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.enums.RideRequestStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideRequestDto {
    private Long id;

    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto rider;

    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;
}

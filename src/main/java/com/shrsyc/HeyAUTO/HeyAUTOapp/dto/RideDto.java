package com.shrsyc.HeyAUTO.HeyAUTOapp.dto;

import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.enums.PaymentMethod;
import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.enums.RideStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {
    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;

    private LocalDateTime createdTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}

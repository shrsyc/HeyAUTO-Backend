package com.shrsyc.HeyAUTO.HeyAUTOapp.services;

import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.DriverDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RideDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RiderDto;

import java.util.List;

public interface DriverService {
    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}

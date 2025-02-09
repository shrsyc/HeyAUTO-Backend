package com.shrsyc.HeyAUTO.HeyAUTOapp.services.impl;

import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.DriverDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RideDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RiderDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.services.DriverService;

import java.util.List;

public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}

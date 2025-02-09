package com.shrsyc.HeyAUTO.HeyAUTOapp.services.impl;

import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.DriverDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RideDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RideRequestDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RiderDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.services.RiderService;

import java.util.List;

public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}

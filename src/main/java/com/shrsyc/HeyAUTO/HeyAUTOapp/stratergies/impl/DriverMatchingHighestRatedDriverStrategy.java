package com.shrsyc.HeyAUTO.HeyAUTOapp.stratergies.impl;

import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RideRequestDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.Driver;
import com.shrsyc.HeyAUTO.HeyAUTOapp.stratergies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}

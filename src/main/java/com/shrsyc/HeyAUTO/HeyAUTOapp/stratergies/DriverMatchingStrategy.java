package com.shrsyc.HeyAUTO.HeyAUTOapp.stratergies;

import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RideRequestDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}

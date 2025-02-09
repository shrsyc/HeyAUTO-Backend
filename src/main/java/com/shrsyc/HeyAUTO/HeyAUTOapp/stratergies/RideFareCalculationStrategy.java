package com.shrsyc.HeyAUTO.HeyAUTOapp.stratergies;

import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}

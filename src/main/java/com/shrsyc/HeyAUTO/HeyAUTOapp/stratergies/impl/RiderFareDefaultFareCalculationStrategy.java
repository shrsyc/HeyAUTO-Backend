package com.shrsyc.HeyAUTO.HeyAUTOapp.stratergies.impl;

import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RideRequestDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.stratergies.RideFareCalculationStrategy;

public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}

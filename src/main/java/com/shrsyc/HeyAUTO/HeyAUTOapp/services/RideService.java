package com.shrsyc.HeyAUTO.HeyAUTOapp.services;

import com.shrsyc.HeyAUTO.HeyAUTOapp.dto.RideRequestDto;
import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.Driver;
import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.Ride;
import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {
    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}

package com.shrsyc.HeyAUTO.HeyAUTOapp.repositories;

import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest,Long> {
}

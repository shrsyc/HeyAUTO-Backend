package com.shrsyc.HeyAUTO.HeyAUTOapp.repositories;

import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride,Long> {
}

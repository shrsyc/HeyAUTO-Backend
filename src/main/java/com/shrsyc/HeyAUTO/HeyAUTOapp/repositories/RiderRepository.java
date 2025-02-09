package com.shrsyc.HeyAUTO.HeyAUTOapp.repositories;

import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider,Long> {
}

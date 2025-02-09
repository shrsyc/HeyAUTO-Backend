package com.shrsyc.HeyAUTO.HeyAUTOapp.repositories;

import com.shrsyc.HeyAUTO.HeyAUTOapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

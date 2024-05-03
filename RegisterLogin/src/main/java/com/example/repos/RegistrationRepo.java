package com.example.repos;

import com.example.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration,Integer> {
}

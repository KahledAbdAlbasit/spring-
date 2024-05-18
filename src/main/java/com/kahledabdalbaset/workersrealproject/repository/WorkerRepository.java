package com.kahledabdalbaset.workersrealproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kahledabdalbaset.workersrealproject.models.Workers;

@Repository
public interface WorkerRepository extends JpaRepository<Workers, Integer> {
    //Optional<Workers> findByUsername(String username);
}

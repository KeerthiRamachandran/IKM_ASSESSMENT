package com.ikm.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ikm.assessment.model.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen,Integer> {
    
}

package com.ayan.handson.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayan.handson.entity.Motorcycle;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Integer> {
    
}

package com.ayan.service;

import java.util.List;

import com.ayan.entity.Motorcycle;

public interface MotorcycleService {
    
    List<Motorcycle> findAll();

    Motorcycle findById(int id);

    Motorcycle save(Motorcycle theMotorcycle);

    void deleteById(int id);
}

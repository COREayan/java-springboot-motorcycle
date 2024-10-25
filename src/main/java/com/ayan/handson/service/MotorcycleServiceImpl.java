package com.ayan.handson.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ayan.handson.dao.MotorcycleRepository;
import com.ayan.handson.entity.Motorcycle;

@Service
public class MotorcycleServiceImpl implements MotorcycleService {

    MotorcycleRepository motorcycleRepository;

    public MotorcycleServiceImpl(MotorcycleRepository theMotorcycleRepository) {
        this.motorcycleRepository = theMotorcycleRepository;
    }

    @Override
    public List<Motorcycle> findAll() {
        return motorcycleRepository.findAll();
    }

    @Override
    public Motorcycle findById(int theId) {
        Optional<Motorcycle> result = motorcycleRepository.findById(theId);
        Motorcycle theMotorcycle = null;

        if (result.isPresent()) {
            theMotorcycle = result.get();
        } else {
            throw new RuntimeException("Did not find motorcycle id - " + theId);
        }

        return theMotorcycle;
    }

    @Override
    public Motorcycle save(Motorcycle theMotorcycle) {
        return motorcycleRepository.save(theMotorcycle);
    }

    @Override
    public void deleteById(int id) {
        motorcycleRepository.deleteById(id);
    }
    
}

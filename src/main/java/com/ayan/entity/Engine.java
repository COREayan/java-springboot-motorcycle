package com.ayan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENGINE")
public class Engine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "engine_type")
    private String engineType;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "max_torque")
    private int maxTorque;

    public Engine() {
    }

    public Engine(int id, String engineType, int capacity, int maxTorque) {
        this.id = id;
        this.engineType = engineType;
        this.capacity = capacity;
        this.maxTorque = maxTorque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(int maxTorque) {
        this.maxTorque = maxTorque;
    }

    @Override
    public String toString() {
        return "Engine [id=" + id + ", engineType=" + engineType + ", capacity=" + capacity + ", maxTorque=" + maxTorque
                + "]";
    }    
}

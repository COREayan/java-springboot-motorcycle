package com.ayan.handson.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MOTORCYCLE")
public class Motorcycle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "motorcycle_id")
    private int id;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "gear_box")
    private String gearBox;

    @Column(name = "wheel")
    private int wheel;

    @Column(name = "length")
    private int length;

    @Column(name = "height")
    private int height;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "engine_id")
    private Engine engine;

    public Motorcycle() {
    }

    public Motorcycle(int id, String modelName, String manufacturerName, String gearBox, int wheel, int length,
            int height, Engine engine) {
        this.id = id;
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.gearBox = gearBox;
        this.wheel = wheel;
        this.length = length;
        this.height = height;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Motorcycle [id=" + id + ", modelName=" + modelName + ", manufacturerName=" + manufacturerName
                + ", gearBox=" + gearBox + ", wheel=" + wheel + ", length=" + length + ", height=" + height
                + ", engine=" + engine + "]";
    }
}

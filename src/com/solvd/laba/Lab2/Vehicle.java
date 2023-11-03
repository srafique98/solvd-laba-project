package com.solvd.laba.Lab2;

import java.time.LocalDate;

public class Vehicle {
    private LocalDate modelYear;
    private String model;
    private String make;
    private LocalDate manufactureDate;
    private boolean salvage;

    public Vehicle(LocalDate modelYear, String model, String make, LocalDate manufactureDate, boolean salvage) {
        this.modelYear = modelYear;
        this.model = model;
        this.make = make;
        this.manufactureDate = manufactureDate;
        this.salvage = salvage;
    }

    public LocalDate getModelYear() {
        return modelYear;
    }

    public void setModelYear(LocalDate modelYear) {
        this.modelYear = modelYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public boolean isSalvage() {
        return salvage;
    }

    public void setSalvage(boolean salvage) {
        this.salvage = salvage;
    }

    public boolean isOlderThan(int years) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - manufactureDate.getYear() > years;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - manufactureDate.getYear();
    }
}

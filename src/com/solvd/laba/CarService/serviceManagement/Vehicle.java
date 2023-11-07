package com.solvd.laba.CarService.serviceManagement;

import com.solvd.laba.CarService.people.Person;

import java.time.LocalDate;
import java.util.Objects;

public class Vehicle {

    protected Person owner;
    private LocalDate modelYear;
    private String model;
    private String make;
    private LocalDate manufactureDate;
    private boolean salvage;

    public Vehicle(LocalDate modelYear, String model, String make, Person owner) {
        this.modelYear = modelYear;
        this.model = model;
        this.make = make;
        this.owner = owner;
    }

    public Vehicle(LocalDate modelYear, String model, String make, LocalDate manufactureDate, boolean salvage, Person owner) {
        this.modelYear = modelYear;
        this.model = model;
        this.make = make;
        this.manufactureDate = manufactureDate;
        this.salvage = salvage;
        this.owner = owner;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "owner=" + owner +
                ", modelYear=" + modelYear +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", salvage=" + salvage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return Objects.equals(owner, vehicle.owner) && Objects.equals(getModel(), vehicle.getModel()) && Objects.equals(getMake(), vehicle.getMake());
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, getModel(), getMake());
    }
}

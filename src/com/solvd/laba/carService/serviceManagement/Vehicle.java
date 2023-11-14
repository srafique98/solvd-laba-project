package com.solvd.laba.carService.serviceManagement;

import com.solvd.laba.carService.interfaces.Repairable;
import com.solvd.laba.carService.people.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Vehicle implements Repairable {

    protected Person owner;
    private LocalDate modelYear;
    private String model;
    private String make;
    private LocalDate manufactureDate;
    private Part[] damagedParts;
    private boolean isDamaged;

    public Vehicle(LocalDate modelYear, String model, String make, Person owner) {
        this.modelYear = modelYear;
        this.model = model;
        this.make = make;
        this.owner = owner;
    }

    public Vehicle(LocalDate modelYear, String model, String make, LocalDate manufactureDate, boolean isDamaged, Person owner) {
        this.modelYear = modelYear;
        this.model = model;
        this.make = make;
        this.manufactureDate = manufactureDate;
        this.isDamaged = isDamaged;
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
                ", damagedParts=" + Arrays.toString(damagedParts) +
                ", isDamaged=" + isDamaged +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return isDamaged() == vehicle.isDamaged() && Objects.equals(owner, vehicle.owner) && Objects.equals(getModelYear(), vehicle.getModelYear()) && Objects.equals(getModel(), vehicle.getModel()) && Objects.equals(getMake(), vehicle.getMake()) && Objects.equals(getManufactureDate(), vehicle.getManufactureDate()) && Arrays.equals(damagedParts, vehicle.damagedParts);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(owner, getModelYear(), getModel(), getMake(), getManufactureDate(), isDamaged());
        result = 31 * result + Arrays.hashCode(damagedParts);
        return result;
    }

    @Override
    public void repair() {
        System.out.println("The following parts are getting reparied: " + Arrays.toString(damagedParts));
    }

    @Override
    public boolean isDamaged() {
        return this.isDamaged;
    }
}

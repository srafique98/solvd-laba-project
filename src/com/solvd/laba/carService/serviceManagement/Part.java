package com.solvd.laba.carService.serviceManagement;

import com.solvd.laba.carService.billing.Cost;
import com.solvd.laba.carService.interfaces.Repairable;

import java.util.Objects;

public class Part implements Repairable {
    private String serialNumber; // Aka part Number
    private Cost cost;
    private String description;
    private String manufacturer;
    private String condition; // New, Used, Good, Fair, Poor

    public Part(String serialNumber, Cost cost) {

        this.serialNumber = serialNumber;
        this.cost = cost;
    }

    public Part(String serialNumber, Cost cost, String description, String manufacturer) {
        this.serialNumber = serialNumber;
        this.cost = cost;
        this.description = description;
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Part{" +
                "serialNumber='" + serialNumber + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public void repair() {
        if (this.isDamaged()){
            System.out.println(this.serialNumber + " is getting repaired");
        }
    }

    @Override
    public boolean isDamaged() {
        if (this.condition.equals("Poor")){
            return true;
        }
        return false;
    }
}

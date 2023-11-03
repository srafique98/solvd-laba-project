package com.solvd.laba.Lab2;

public class Part {
    private String serialNumber; // Aka part Number
    private Cost cost;
    private String description;
    private String manufacturer;

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
}

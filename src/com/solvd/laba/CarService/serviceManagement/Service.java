package com.solvd.laba.CarService.serviceManagement;

import com.solvd.laba.CarService.billing.Cost;

public class Service {
    private String name;
    private Part partsNeeded;
    private Cost[] costs;
    private static int totalServicesPerformed = 0;

    public Service(String name) { //Maybe free consultation
        this.name = name;
        totalServicesPerformed++;
    }

    public Service(String name, Part partsNeeded, Cost[] costs) {
        this.name = name;
        this.partsNeeded = partsNeeded;
        this.costs = costs;
        totalServicesPerformed++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Part getPartsNeeded() {
        return partsNeeded;
    }

    public void setPartsNeeded(Part partsNeeded) {
        this.partsNeeded = partsNeeded;
    }

    public Cost[] getCosts() {
        return costs;
    }

    public void setCosts(Cost[] costs) {
        this.costs = costs;
    }

    public static int getTotalServicesPerformed() {
        return totalServicesPerformed;
    }

}

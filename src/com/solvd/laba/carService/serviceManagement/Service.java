package com.solvd.laba.carService.serviceManagement;

import com.solvd.laba.carService.billing.Cost;
import com.solvd.laba.carService.interfaces.Chargeable;
import com.solvd.laba.carService.interfaces.Scheduleable;

public class Service implements Chargeable {
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

//    @Override
    public String getServiceInfo() { return "Service: " + name; }

//    @Override
    public int getTotalServicesPerformed() { return totalServicesPerformed; }

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


    @Override
    public double calculateCharge() {
        double totalCost = 0.0;
        for (Cost cost : costs) {
            totalCost += cost.getCost();
        }
        return totalCost;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        double discountAmount = this.calculateCharge() * discountPercentage;
        this.setTotalCost(this.calculateCharge() - discountAmount);
    }

    public void setTotalCost(double totalCost) {
        this.costs = new Cost[1];
        this.costs[0] = new Cost(totalCost, "USD");
    }


}

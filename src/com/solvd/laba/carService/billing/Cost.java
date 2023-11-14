package com.solvd.laba.carService.billing;

import com.solvd.laba.carService.interfaces.Chargeable;

public class Cost implements Chargeable {
    private double cost;
    private String currencyType; // Could be Enum

    public Cost(double cost, String currencyType) {
        this.cost = cost;
        this.currencyType = currencyType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double value) {
        this.cost = value;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public void addToCost(double value){ this.cost += value; }

    @Override
    public double calculateCharge() {
        return cost;
    }

    @Override
    public void applyDiscount(double discountPercentage) { // 0.10 --  10% discount
        this.cost *= (1 - discountPercentage);
    }
}

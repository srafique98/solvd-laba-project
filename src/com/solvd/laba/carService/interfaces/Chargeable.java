package com.solvd.laba.carService.interfaces;

public interface Chargeable {
    double calculateCharge();
    void applyDiscount(double discountPercentage);
}

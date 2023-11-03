package com.solvd.laba.Lab3;

public class Cost {
    private double value;
    public String currencyType; // Could be Enum

    public Cost(double value, String currencyType) {
        this.value = value;
        this.currencyType = currencyType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
}

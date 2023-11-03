package com.solvd.laba.Lab3;

import java.time.LocalDate;

public class Invoice {
    private Customer customer;
    private Vehicle vehicle;
    private Service service;
    private LocalDate dateCreated;
    private double totalCost;

    public Invoice(Customer customer, Vehicle vehicle, Service service, LocalDate dateCreated, double totalCost) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.service = service;
        this.dateCreated = dateCreated;
        this.totalCost = totalCost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

}

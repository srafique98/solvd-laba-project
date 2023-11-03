package com.solvd.laba.Lab2;

import java.time.LocalDate;

public class Appointment {
    private Customer customer;
    private Vehicle vehicle;
    private Service service;
    private LocalDate scheduleDate;
    private String status; // Make Enum.. Scheduled, in progress, completed, cancelled

    public Appointment(Customer customer, Vehicle vehicle, Service service, LocalDate scheduleDate, String status) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.service = service;
        this.scheduleDate = scheduleDate;
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
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

    public LocalDate getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(LocalDate scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

package com.solvd.laba.CarService.serviceManagement;

import com.solvd.laba.CarService.people.Customer;
import com.solvd.laba.CarService.billing.Invoice;

import java.time.LocalDate;

public class Appointment {
    private Customer customer;
    private Vehicle vehicle;
    private Invoice invoice;
    private LocalDate scheduleDate;
    private String status; // Make Enum.. Scheduled, in progress, completed, cancelled

    public Appointment(Customer customer, LocalDate scheduleDate, String status) {
        this.customer = customer;
        this.scheduleDate = scheduleDate;
        this.status = status;
    }


    public Appointment(Customer customer, Vehicle vehicle, Invoice invoice, LocalDate scheduleDate, String status) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.invoice = invoice;
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

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
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

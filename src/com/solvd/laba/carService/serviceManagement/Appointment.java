package com.solvd.laba.carService.serviceManagement;

import com.solvd.laba.carService.interfaces.Scheduleable;
import com.solvd.laba.carService.people.Customer;
import com.solvd.laba.carService.billing.Invoice;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment implements Scheduleable {
    private Customer customer;
    private Vehicle vehicle;
    private Invoice invoice;
    private LocalDate scheduleDate;
    private LocalTime appointmentTime;
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

    public Appointment(Customer customer, LocalDate appointmentDate, LocalTime appointmentTime) {
        this.customer = customer;
        this.scheduleDate = appointmentDate;
        this.appointmentTime = appointmentTime;
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

    @Override
    public void scheduleAppointment(String userDate, String userTime) throws IllegalArgumentException {
        LocalDate appointmentDate = LocalDate.parse(userDate);
        LocalTime appointmentTime = LocalTime.parse(userTime);
        if (appointmentDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Appointment date cannot be in the past");
        }
        this.scheduleDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = "Scheduled";

    }

    @Override
    public void cancelAppointment() throws IllegalStateException {
        if (this.scheduleDate.isEqual(LocalDate.now()) || this.appointmentTime.isBefore(LocalTime.now())) {
            throw new IllegalStateException("Appointment has already started");
        }
        if (this.status.equals("Completed")) {
            throw new IllegalStateException("Appointment has already been completed");
        }
        this.scheduleDate = null;
        this.appointmentTime = null;
        this.status = "Cancelled";
    }
}

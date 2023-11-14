package com.solvd.laba.carService.people;

import com.solvd.laba.carService.interfaces.Displayable;
import com.solvd.laba.carService.interfaces.Scheduleable;
import com.solvd.laba.carService.serviceManagement.Appointment;
import com.solvd.laba.carService.billing.Invoice;
import com.solvd.laba.carService.serviceManagement.Vehicle;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Customer extends Person implements Displayable, Scheduleable {

    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private List<Invoice> invoices = new ArrayList<>();

    public Customer(String firstName, String lastName, List<Vehicle> vehicles) {
        super(firstName, lastName);
        this.vehicles = vehicles;
    }

    public Customer(String firstName, String lastName, List<Vehicle> vehicles, List<Appointment> appointments, List<Invoice> invoices) {
        super(firstName, lastName);
        this.vehicles = vehicles;
        this.appointments = appointments;
        this.invoices = invoices;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String getInfo() {
        return "Customer Details: " + this.toString();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "vehicles=" + vehicles +
                ", appointments=" + appointments +
                ", invoices=" + invoices +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getVehicles(), customer.getVehicles()) && Objects.equals(getAppointments(), customer.getAppointments()) && Objects.equals(getInvoices(), customer.getInvoices());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getVehicles(), getAppointments(), getInvoices());
    }

    @Override
    public void scheduleAppointment(String userDate,String userTime) {
        this.cancelAppointment();
        LocalDate appointmentDate = LocalDate.parse(userDate); // "2023-11-14"
        LocalTime appointmentTime = LocalTime.parse(userTime); // "10:00"
        Appointment appointment = new Appointment(this, appointmentDate, appointmentTime);
        this.appointments.add(appointment);

    }

    @Override
    public void cancelAppointment() {
        this.appointments.clear();
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}

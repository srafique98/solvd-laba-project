package com.solvd.laba.CarService.people;

import com.solvd.laba.CarService.serviceManagement.Appointment;
import com.solvd.laba.CarService.billing.Invoice;
import com.solvd.laba.CarService.serviceManagement.Vehicle;

import java.util.Arrays;

public class Customer extends Person {
    private Vehicle[] vehicles;
    private Appointment[] appointments;
    private Invoice[] invoices;

    public Customer(String fName, String lName, Vehicle[] vehicles) {
        super(fName,lName);
        this.vehicles = vehicles;
        this.appointments = new Appointment[0];
        this.invoices = new Invoice[0];
    }

    public Customer(String fName, String lName, Vehicle[] vehicles, Appointment[] appointments, Invoice[] invoices) {
        super(fName,lName);
        this.vehicles = vehicles;
        this.appointments = appointments;
        this.invoices = invoices;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public Appointment[] getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointment[] appointments) {
        this.appointments = appointments;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String getInfo() {
        return "Customer Details: " + getFullName();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "vehicles=" + Arrays.toString(vehicles) +
                ", appointments=" + Arrays.toString(appointments) +
                ", invoices=" + Arrays.toString(invoices) +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Arrays.equals(getVehicles(), customer.getVehicles()) && Arrays.equals(getAppointments(), customer.getAppointments()) && Arrays.equals(getInvoices(), customer.getInvoices());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(getVehicles());
        result = 31 * result + Arrays.hashCode(getAppointments());
        result = 31 * result + Arrays.hashCode(getInvoices());
        return result;
    }
}

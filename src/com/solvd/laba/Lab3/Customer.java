package com.solvd.laba.Lab3;

import java.util.Arrays;
import java.util.Objects;

public class Customer extends Person{
    private Vehicle[] vehicles;
    private Appointment[] appointments;
    private Invoice[] invoices;
    private Service[] services;

    public Customer(String fName, String lName, Vehicle[] vehicles, Appointment[] appointments, Invoice[] invoices, Service[] services) {
        super(fName,lName);
        this.vehicles = vehicles;
        this.appointments = appointments;
        this.invoices = invoices;
        this.services = services;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
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
                ", services=" + Arrays.toString(services) +
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
        return Arrays.equals(getVehicles(), customer.getVehicles()) && Arrays.equals(getAppointments(), customer.getAppointments()) && Arrays.equals(getInvoices(), customer.getInvoices()) && Arrays.equals(getServices(), customer.getServices());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(getVehicles());
        result = 31 * result + Arrays.hashCode(getAppointments());
        result = 31 * result + Arrays.hashCode(getInvoices());
        result = 31 * result + Arrays.hashCode(getServices());
        return result;
    }
}

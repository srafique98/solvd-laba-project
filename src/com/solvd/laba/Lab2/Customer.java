package com.solvd.laba.Lab2;

public class Customer {
    private String name;
    private Vehicle[] vehicles;
    private Appointment[] appointments;
    private Invoice[] invoices;
    private Service[] services;

    public Customer(String name, Vehicle[] vehicles, Appointment[] appointments, Invoice[] invoices, Service[] services) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}

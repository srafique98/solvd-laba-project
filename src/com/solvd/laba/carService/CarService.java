package com.solvd.laba.carService;

import com.solvd.laba.carService.location.Location;
import com.solvd.laba.carService.people.Employee;
import com.solvd.laba.carService.people.Customer;
import com.solvd.laba.carService.serviceManagement.Service;

public class CarService {
    private Customer[] customers;
    private Employee[] employees;
    private Service[] services;
    private Location[] locations;

    public CarService(Customer[] customers, Employee[] employees, Service[] services, Location[] locations) {
        this.customers = customers;
        this.employees = employees;
        this.services = services;
        this.locations = locations;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }
}

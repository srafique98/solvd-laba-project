package com.solvd.laba.Lab2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Smith", new Vehicle[0], new Appointment[0], new Invoice[0], new Service[0]);
        Customer customer2 = new Customer("Alice Johnson", new Vehicle[0], new Appointment[0], new Invoice[0], new Service[0]);

        Location employeeLocation1 = new Location("City1", "Country1", "Branch1", LocalDate.of(2010, 1, 1), 4.5);
        Employee employee1 = new Employee("Mechanic1", employeeLocation1, "Mechanic", 45000.0);
        Location employeeLocation2 = new Location("City2", "Country2", "Branch2", LocalDate.of(2015, 1, 1), 4.0);
        Employee employee2 = new Employee("Mechanic2", employeeLocation2, "Mechanic", 50000.0);

        Part part1 = new Part("123456", new Cost(50.0, "USD"), "Spark Plug", "ACME");
        Service service1 = new Service("Oil Change", part1, new Cost[] { new Cost(30.0, "USD"), new Cost(20.0, "USD") });
        Part part2 = new Part("789012", new Cost(70.0, "USD"), "Air Filter", "Parts Co.");
        Service service2 = new Service("Brake Repair", part2, new Cost[] { new Cost(80.0, "USD"), new Cost(50.0, "USD") });

        Location location1 = new Location("City1", "Country1", "Branch1", LocalDate.of(2000, 1, 1), 4.0);
        Location location2 = new Location("City2", "Country2", "Branch2", LocalDate.of(2005, 1, 1), 4.2);

        Vehicle vehicle1 = new Vehicle(LocalDate.of(2022, 1, 1), "SUV", "BrandX", LocalDate.of(2022, 1, 1), false);
        Vehicle vehicle2 = new Vehicle(LocalDate.of(2019, 1, 1), "Sedan", "BrandY", LocalDate.of(2019, 1, 1), false);

        Appointment appointment1 = new Appointment(customer1, vehicle1, service1, LocalDate.of(2023, 1, 10), "Scheduled");
        Appointment appointment2 = new Appointment(customer2, vehicle2, service2, LocalDate.of(2023, 1, 15), "In Progress");

        Invoice invoice1 = new Invoice(customer1, vehicle1, service1, LocalDate.of(2023, 1, 15), 100.0);
        Invoice invoice2 = new Invoice(customer2, vehicle2, service2, LocalDate.of(2023, 1, 20), 150.0);

        System.out.println("Customer 1: " + customer1.getName());
        System.out.println("Customer 2: " + customer2.getName());
        System.out.println("Employee 1: " + employee1.getName() + " - " + employee1.getJobTittle());
        System.out.println("Employee 2: " + employee2.getName() + " - " + employee2.getJobTittle());
        System.out.println("Service 1: " + service1.getName());
        System.out.println("Service 2: " + service2.getName());
        System.out.println("Location 1: " + location1.getBranchName() + " (" + location1.getCity() + ")");
        System.out.println("Location 2: " + location2.getBranchName() + " (" + location2.getCity() + ")");
        System.out.println("Vehicle 1: " + vehicle1.getMake() + " " + vehicle1.getModel());
        System.out.println("Vehicle 2: " + vehicle2.getMake() + " " + vehicle2.getModel());
        System.out.println("Appointment 1: " + appointment1.getStatus());
        System.out.println("Appointment 2: " + appointment2.getStatus());
        System.out.println("Invoice 1 Total Cost: " + invoice1.getTotalCost() + " " + invoice1.getService().getCosts()[0].getCurrencyType());
        System.out.println("Invoice 2 Total Cost: " + invoice2.getTotalCost() + " " + invoice2.getService().getCosts()[0].getCurrencyType());
    }
}

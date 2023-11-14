package com.solvd.laba.carService;

import com.solvd.laba.carService.billing.Cost;
import com.solvd.laba.carService.location.Location;
import com.solvd.laba.carService.people.Customer;
import com.solvd.laba.carService.people.Employee;
import com.solvd.laba.carService.serviceManagement.Part;
import com.solvd.laba.carService.serviceManagement.Service;
import com.solvd.laba.carService.serviceManagement.Vehicle;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("John","Doe", null);
        Customer customer2 = new Customer("Jane","Doe", null);

        Employee employee1 = new Employee("Michael","Scott", null, "Regional Manager", 100000);
        Employee employee2 = new Employee("Dwight","Schrute", null, "Assistant to the Regional Manager", 50000);

        Service service1 = new Service("Oil change", null, new Cost[]{new Cost(50.00, "USD")});
        Service service2 = new Service("Brake repair", null, new Cost[]{new Cost(100.00, "USD")});

        Location location1 = new Location("Lodi", "CA", "Lodi Car Service", LocalDate.of(2020, 1, 1), 4.5);
        Location location2 = new Location("Sacramento", "CA", "Sacramento Car Service", LocalDate.of(2015, 1, 1), 4.0);

        Vehicle vehicle1 = new Vehicle(LocalDate.of(2023, 11, 14), "Toyota Camry", "Toyota", customer1);
        Vehicle vehicle2 = new Vehicle(LocalDate.of(2022, 12, 31), "Honda Accord", "Honda", customer2);

        customer1.scheduleAppointment("2023-11-21", "10:00");
        double cost = service1.calculateCharge();
        service1.applyDiscount(0.10);
        cost = service1.calculateCharge();

        System.out.println("Customer 1: " + customer1.getInfo());
        System.out.println("Customer 2: " + customer2.getInfo());
        System.out.println("Employee 1: " + employee1.getInfo());
        System.out.println("Employee 2: " + employee2.getInfo());
        System.out.println("Service 1: " + service1.getServiceInfo());
        System.out.println("Service 2: " + service2.getServiceInfo());
        System.out.println("Location 1: " + location1.getInfo());
        System.out.println("Location 2: " + location2.getInfo());
        System.out.println("Vehicle 1: " + vehicle1.toString());
        System.out.println("Vehicle 2: " + vehicle2.toString());
        System.out.println("Cost of appointment: " + cost);



    }
}

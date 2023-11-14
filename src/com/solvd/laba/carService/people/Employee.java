package com.solvd.laba.carService.people;

import com.solvd.laba.carService.interfaces.Displayable;
import com.solvd.laba.carService.interfaces.Ratable;
import com.solvd.laba.carService.location.Location;

import java.util.Objects;

public class Employee extends Person implements Displayable, Ratable {
    private Location location;
    private String jobTittle;
    private double salary;
    private double ratings;

    public Employee(String fName, String lName, Location location, String jobTittle, double salary) {
        super(fName,lName);
        this.location = location;
        this.jobTittle = jobTittle;
        this.salary = salary;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getJobTittle() {
        return jobTittle;
    }

    public void setJobTittle(String jobTittle) {
        this.jobTittle = jobTittle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String getInfo() {
        return "Employee Details:: " + getFullName();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "location=" + location +
                ", jobTittle='" + jobTittle + '\'' +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getSalary(), employee.getSalary()) == 0 && Objects.equals(getLocation(), employee.getLocation()) && Objects.equals(getJobTittle(), employee.getJobTittle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLocation(), getJobTittle(), getSalary());
    }

    @Override
    public double getRating() {
        return this.ratings;
    }

    @Override
    public void rate(double newRating) {
        System.out.println("Rating the employee with a new rating of " + newRating);
        this.ratings = newRating;
    }
}

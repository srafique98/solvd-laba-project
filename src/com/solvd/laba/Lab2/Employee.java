package com.solvd.laba.Lab2;

public class Employee {
    private String name;
    private Location location;
    private String jobTittle;
    private double salary;

    public Employee(String name, Location location, String jobTittle, double salary) {
        this.name = name;
        this.location = location;
        this.jobTittle = jobTittle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}

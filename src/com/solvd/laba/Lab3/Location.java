package com.solvd.laba.Lab3;

import java.time.LocalDate;

public class Location {
    private String city;
    private String country;
    private String branchName;
    private LocalDate establishedDate;
    private double ratings;
    private static int locationCount = 0;

    public Location(String city, String country, String branchName, LocalDate establishedDate, double ratings) {
        this.city = city;
        this.country = country;
        this.branchName = branchName;
        this.establishedDate = establishedDate;
        this.ratings = ratings;
        locationCount++;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public LocalDate getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(LocalDate establishedDate) {
        this.establishedDate = establishedDate;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public static int getLocationCount() {
        return locationCount;
    }

    public static void setLocationCount(int locationCount) {
        Location.locationCount = locationCount;
    }

    public int yearsOfService() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - establishedDate.getYear();
    }
}

package com.solvd.laba.carService.interfaces;

public interface Scheduleable {
    void scheduleAppointment(String userDate,String userTime);
    void cancelAppointment();
}

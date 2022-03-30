package com.company.violation;

public class ViolatedDriver {

    private ViolatedVehicle vehicle;

    public ViolatedDriver(final ViolatedVehicle vehicle){
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}

package com.company.solution;

public class Driver {

    private Ivehicle vehicle;

    public Driver(final Ivehicle vehicle){
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}

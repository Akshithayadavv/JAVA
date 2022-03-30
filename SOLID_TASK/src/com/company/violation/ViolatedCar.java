package com.company.violation;

import com.company.common.Gear;

public class ViolatedCar extends ViolatedVehicle implements Switches{

    @Override
    public void changeGear(Gear gear) {
        if(Gear.R.equals(gear) && getGear().equals(Gear.D)){
            throw new RuntimeException("Can't change to REVERSE gear when " + getGear().toString() + " gear is engaged!");
        }
    }

    private boolean radioOn;
    private boolean engineRunning;

    public boolean isRadioOn() {
        return radioOn;
    }

    @Override
    public void turnRadioOn() {
        radioOn = true;
    }

    @Override
    public void turnRadioOff() {
        radioOn = false;
    }

    @Override
    public void turnCameraOn() {
        // nothing to do here
        System.out.println("Nothing to do here");
    }

    @Override
    public void turnCameraOff() {
        // nothing to do here
        System.out.println("Nothing to do here");
    }

    @Override
    public void startEngine() {
        engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        engineRunning = false;
    }
}

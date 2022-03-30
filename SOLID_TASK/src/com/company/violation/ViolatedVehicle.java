package com.company.violation;

import com.company.common.Gear;

public class ViolatedVehicle {

    private final int maxFuel;
    private int remainingFuel;
    private int power;
    private int suspensionHeight;
    private Gear gear;

    public ViolatedVehicle() {
        this.maxFuel = 0;
        gear = Gear.D;
    }

    public ViolatedVehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    // this is not a car's responsibility.
    public void reFuel(){
        remainingFuel = maxFuel;
    }


    public int getRemainingFuel() {
        return remainingFuel;
    }



    public void accelerate() {
        remainingFuel--;
    }

    public int getPower() {
        return power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public void setPower(final int power) {
        this.power = power;
    }

    public void setSuspensionHeight(final int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }
}

package com.company.solution;

import com.company.common.Gear;

public class Vehicle implements Ivehicle{

    private final int maxFuel;
    private int remainingFuel;
    private int power;
    private int suspensionHeight;
    private boolean isMoving;
    private Gear gear;

    public Vehicle() {
        this.maxFuel = 0;
        gear = Gear.D;
        isMoving = true;
    }

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    // this is not a car's responsibility.

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    @Override
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

    public void stop(){
        isMoving = false;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }
}

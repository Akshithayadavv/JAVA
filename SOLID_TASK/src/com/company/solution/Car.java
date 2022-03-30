package com.company.solution;

import com.company.common.Gear;

public class Car extends Vehicle implements RadioSwitch{
    private boolean radioOn;

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
    public void changeGear(Gear gear) {
        Gear actualGear = getGear();
        if (isMovingForwards(gear, actualGear)
                || isMovingBackwards(gear, actualGear)) {
            stop();
        }
        super.changeGear(gear);
    }

    private boolean isMovingBackwards(Gear gear, Gear actualGear) {
        return isMoving() && Gear.R.equals(actualGear) && Gear.D.equals(gear);
    }

    private boolean isMovingForwards(Gear gear, Gear actualGear) {
        return isMoving() && Gear.D.equals(actualGear) && Gear.R.equals(gear);
    }
}

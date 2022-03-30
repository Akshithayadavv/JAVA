package com.company.violation;

public class ViolatedDrone implements Switches{


    private boolean cameraOn;
    private boolean engineRunning;

    public boolean isCameraOn() {
        return cameraOn;
    }

    @Override
    public void turnCameraOn() {
        cameraOn = true;
    }

    @Override
    public void turnCameraOff() {
        cameraOn = false;
    }

    @Override
    public void turnRadioOn() {
        // nothing to do here
        System.out.println("Nothing to do here");
    }

    @Override
    public void turnRadioOff() {
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

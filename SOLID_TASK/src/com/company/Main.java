package com.company;

import com.company.common.Gear;
import com.company.solution.*;
import com.company.violation.*;
import com.company.violation.DrivingMode;

public class Main {

    public static void main(String[] args) {
        System.out.println("Single Responsibility Principle example");
        ViolatedVehicle violatedVehicle = new ViolatedVehicle(100);
        System.out.println("Current car fuel is " + violatedVehicle.getRemainingFuel());
        violatedVehicle.accelerate();
        System.out.println("Current car fuel after accelaration is " + violatedVehicle.getRemainingFuel());
        System.out.println("Refuelling Car");
        violatedVehicle.reFuel();
        System.out.println("Car fuel after refuelling is " + violatedVehicle.getRemainingFuel());
        System.out.println("Refuelling is not Car's responsibility. It violated SRP.\n\nSolution to SRP");

        Vehicle vehicle = new Vehicle(100);
        System.out.println("Current car fuel is " + vehicle.getRemainingFuel());
        vehicle.accelerate();
        System.out.println("Current car fuel after accelaration is " + vehicle.getRemainingFuel());
        System.out.println("Refuelling Car");
        FuelPump fuelPump = new FuelPump();
        fuelPump.reFuel(vehicle);
        System.out.println("Car fuel after refuelling is " + vehicle.getRemainingFuel());
        System.out.println("Car is refuelled using fuel pump");

        System.out.println("******************************************************************************************");


        System.out.println("\n\nOpen Closed Principle example");
        ViolatedVehicleMode violatedEventHandler = new ViolatedVehicleMode(violatedVehicle);
        System.out.println("Current Car driving mode is in COMFORT");
        violatedVehicle.setPower(400);
        violatedVehicle.setSuspensionHeight(20);
        System.out.println("Car power is " + violatedVehicle.getPower());
        System.out.println("Car suspension height is " + violatedVehicle.getSuspensionHeight());
        System.out.println("Changing driving mode into sport");
        violatedEventHandler.changeDrivingMode(DrivingMode.SPORT);
        System.out.println("Car power after changing to SPORT mode is " + violatedVehicle.getPower());
        System.out.println("Car suspension height after changing to SPORT mode is " + violatedVehicle.getSuspensionHeight());

        System.out.println("It violated OCP.\n\nSolution to OCP");
        System.out.println("Current Car driving mode is in ECONOMY");
        vehicle.setPower(300);
        vehicle.setSuspensionHeight(20);
        System.out.println("Car power is " + vehicle.getPower());
        System.out.println("Car suspension height is " + vehicle.getSuspensionHeight());
        System.out.println("Changing driving mode into sport");
        VehicleMode eventHandler = new VehicleMode(vehicle);
        Sport sport = new Sport();
        eventHandler.changeDrivingMode(sport);
        System.out.println("Car power after changing to SPORT mode is " + vehicle.getPower());
        System.out.println("Car suspension height after changing to SPORT mode is " + vehicle.getSuspensionHeight());

        System.out.println("******************************************************************************************");

        System.out.println("\n\nLiskov’s Substitution Principle example");
        ViolatedCar violatedCar = new ViolatedCar();
        System.out.println("Current Car is in Driving Gear");
        System.out.println("Changing Car Gear to Reverse");
        try {
            violatedCar.changeGear(Gear.R);
        }
        catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("It violated LSP.\n\nSolution to LSP");
        Car car = new Car();
        System.out.println("Current Car is in Driving Gear");
        System.out.println("Changing Car Gear to Reverse");
        car.changeGear(Gear.R);
        System.out.println("Changed Car Gear to Reverse by handling the logic in the changeGear function");

        System.out.println("******************************************************************************************");

        System.out.println("\n\nInterface Segregation Principle example");
        violatedCar.turnRadioOn();
        if(violatedCar.isRadioOn()) {
            System.out.println("Turned on the radio in the Car, as radio is present in the Car");
        }
        System.out.println("Turning the Camera on in the Car");
        violatedCar.turnCameraOn();
        System.out.println("As there is no Camera in the Car, turnCameraOn function has nothing to do. Similarly");
        ViolatedDrone violatedDrone = new ViolatedDrone();
        System.out.println("Turning the Radio on in the Drone");
        violatedDrone.turnRadioOn();
        System.out.println("It violated ISP.\n\nSolution to ISP");

        System.out.println("Turning the Radio on in the Car");
        car.turnRadioOn();
        if(car.isRadioOn()) {
            System.out.println("Turned on the radio in the Car, as radio is present in the Car. Similarly");
        }
        Drone drone = new Drone();
        System.out.println("Turning the Camera on in the Drone");
        drone.turnCameraOn();
        if(drone.isCameraOn()) {
            System.out.println("Turned on the camera in the Drone, as camera is present in the Drone.");
        }

        System.out.println("******************************************************************************************");

        System.out.println("\n\nDependency Inversion Principle example");
        ViolatedDriver violatedDriver = new ViolatedDriver(violatedVehicle);
        System.out.println("Driver accelerates the vehicle");
        violatedDriver.increaseSpeed();
        System.out.println("In this case we are using concrete class dependency instead of Abstraction layer dependency");
        System.out.println("It violated DIP.\n\nSolution to DIP");
        System.out.println("Driver accelerates the vehicle");
        Driver driver = new Driver(vehicle);
        driver.increaseSpeed();
        System.out.println("In this case we are using Abstraction layer dependency");
    }
}

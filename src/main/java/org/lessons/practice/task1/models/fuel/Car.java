package org.lessons.practice.task1.models.fuel;

public class Car extends FuelVehicle {
    @Override
    public void move() {
        System.out.println("Машина едет!");
    }

    @Override
    public void fuelUp() {
        System.out.println("Машина заправляется!");
    }
}

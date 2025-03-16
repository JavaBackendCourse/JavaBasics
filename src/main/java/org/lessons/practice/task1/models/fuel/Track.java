package org.lessons.practice.task1.models.fuel;

public class Track extends FuelVehicle {
    @Override
    public void move() {
        System.out.println("Грузовик едет!");
    }

    @Override
    public void fuelUp() {
        System.out.println("Грузовик заправляется!");
    }
}

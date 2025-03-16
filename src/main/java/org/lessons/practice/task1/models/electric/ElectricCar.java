package org.lessons.practice.task1.models.electric;

public class ElectricCar extends ElectricVehicle {

    @Override
    public void move() {
        System.out.println("Электрическая машина едет!");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Машина заряжается!");
    }
}

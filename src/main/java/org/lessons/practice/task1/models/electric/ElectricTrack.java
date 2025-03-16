package org.lessons.practice.task1.models.electric;

public class ElectricTrack extends ElectricVehicle {
    @Override
    public void move() {
        System.out.println("Электрический грузовик едет!");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Грузовик заряжается!");
    }
}

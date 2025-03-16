package org.lessons.practice.task1;

import org.lessons.practice.task1.models.Vehicle;
import org.lessons.practice.task1.models.electric.ElectricCar;
import org.lessons.practice.task1.models.electric.ElectricTrack;
import org.lessons.practice.task1.models.electric.ElectricVehicle;
import org.lessons.practice.task1.models.fuel.Car;
import org.lessons.practice.task1.models.fuel.FuelVehicle;
import org.lessons.practice.task1.models.fuel.Track;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>(List.of(
                new Car(),
                new Track(),
                new ElectricCar(),
                new ElectricTrack()
        ));

        vehicles.forEach(v -> {
            v.move();
            if (v instanceof ElectricVehicle e) {
                e.chargeBattery();
            }
            if (v instanceof FuelVehicle f) {
                f.fuelUp();
            }
        });
    }
}

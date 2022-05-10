package com.vehicles.project.persistence;

import com.vehicles.project.domain.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {

    private static List<Vehicle> vehicles = new ArrayList<>();

    public Vehicle findVehicleByPlate(String plate) {
        return vehicles.stream().filter(x -> x.getPlate().equals(plate)).findAny().get();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

}

package com.vehicles.project.application;

import com.vehicles.project.domain.Bike;
import com.vehicles.project.domain.Car;
import com.vehicles.project.domain.Tricicle;
import com.vehicles.project.domain.Vehicle;
import com.vehicles.project.utilities.ConstantsUtilities;

public class VehicleFactory {

    public Vehicle createVehicle(int type, String brand, String plate, String color) throws Exception {
        if (type == ConstantsUtilities.BIKE)
            return new Bike(plate, brand, color);
        else if (type == ConstantsUtilities.CAR)
            return new Car(plate, brand, color);
        else if (type == ConstantsUtilities.TRICICLE)
            return new Tricicle(plate, brand, color);
        else
            throw new Exception("It is not a car or a bike");
    }
}

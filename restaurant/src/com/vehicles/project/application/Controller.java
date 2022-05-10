package com.vehicles.project.application;

import com.vehicles.project.domain.Restaurant;
import com.vehicles.project.persistence.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public int createRestaurant(String name, int capacity){
        Restaurant restaurant = new Restaurant(name,capacity);
        new RestaurantRepository().addRestaurant(restaurant);
        return restaurant.getId();
    }

//    public String createVehicle(int type, String brand, String plate, String color) throws Exception {
//        Vehicle vehicle = new VehicleFactory().createVehicle(type, brand, plate, color);
//        new RestaurantRepository().addRestaurant(res);
//        return vehicle.getPlate();
//    }

    public void addWheels(String plate, String brandWheel, double diameterWheel) throws Exception {
        Vehicle vehicle = new RestaurantRepository().findVehicleByPlate(plate);

        List<Wheel> frontWheels = createWheels(vehicle.getNumFrontWheels(), brandWheel, diameterWheel);
        List<Wheel> backWheels = createWheels(vehicle.getNumBackWheels(), brandWheel, diameterWheel);
        vehicle.addWheels(frontWheels, backWheels);
    }

    public List<Wheel> createWheels(int numOfWheels, String brandWheel, double diameterWheel) throws Exception {
        List<Wheel> backWheels = new ArrayList<Wheel>();

        for (int i = 0; i < numOfWheels; i++) {
            backWheels.add(new Wheel(brandWheel, diameterWheel));
        }
        return backWheels;
    }


    public void paintVehicle(String plate, String color) {
        Vehicle vehicle = new RestaurantRepository().findVehicleByPlate(plate);
        vehicle.setColor(color);
    }


}

package com.vehicles.project.application;

import com.vehicles.project.domain.Restaurant;
import com.vehicles.project.persistence.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public int createRestaurant(String name){
        Restaurant restaurant = new Restaurant(name);
        new RestaurantRepository().addRestaurant(restaurant);
        return restaurant.getId();
    }

//    public String createVehicle(int type, String brand, String plate, String color) throws Exception {
//        Vehicle vehicle = new VehicleFactory().createVehicle(type, brand, plate, color);
//        new RestaurantRepository().addRestaurant(res);
//        return vehicle.getPlate();
//    }

    public void addPeopleInRestaurant(int id, int numPeople) throws Exception {
        Restaurant restaurant = new RestaurantRepository().findRestaurantById(id);
        restaurant.addPeopleInRestaurant(numPeople);
    }
}

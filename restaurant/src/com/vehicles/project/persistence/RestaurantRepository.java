package com.vehicles.project.persistence;

import com.vehicles.project.domain.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    private static List<Restaurant> restaurant = new ArrayList<>();

    public Vehicle findVehicleByPlate(String plate) {
        return vehicles.stream().filter(x -> x.getPlate().equals(plate)).findAny().get();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurant.add(restaurant);
    }

}

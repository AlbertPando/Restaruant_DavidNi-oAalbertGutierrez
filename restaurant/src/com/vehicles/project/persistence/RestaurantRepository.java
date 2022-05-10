package com.vehicles.project.persistence;

import com.vehicles.project.domain.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    private static List<Restaurant> restaurant = new ArrayList<>();

    public Restaurant findRestaurantById(int id) {
        return restaurant.stream().filter(x -> x.getId() == id).findAny().get();
    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurant.add(restaurant);
    }

}

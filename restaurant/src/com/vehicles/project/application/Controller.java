package com.vehicles.project.application;

import com.vehicles.project.domain.Restaurant;
import com.vehicles.project.persistence.RestaurantRepository;
import jdk.nashorn.internal.runtime.ECMAException;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public String createRestaurant(String name){
        Restaurant restaurant = new Restaurant(name);
        new RestaurantRepository().addRestaurant(restaurant);
        return restaurant.getId();
    }

    public void addPeopleInRestaurant(String id, int numPeople) throws Exception {
        Restaurant restaurant = new RestaurantRepository().findRestaurantById(id);
        System.out.println("Left " + restaurant.addPeopleInRestaurant(numPeople) + " people to add");
    }

    public void deleteTableInRestaurant(String id, int numTable) throws Exception {
        Restaurant restaurant = new RestaurantRepository().findRestaurantById(id);
        restaurant.deleteTable(numTable);
        System.out.println("Left the table " + numTable + " to the restaurant");
    }
}

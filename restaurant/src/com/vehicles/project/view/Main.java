package com.vehicles.project.view;


import Keyboard.Keyboard;
import com.vehicles.project.application.Controller;
import com.vehicles.project.utilities.ConstantsUtilities;

public class Main {

    public static void main(String[] args) {
            int restaurantId = createRestaurant();
            addPeopleInRestaurant(restaurantId);
    }

    private static void addPeopleInRestaurant(int id) {
        int numberOfPeople = askNumberOfPeopleToAdd();
        try {
            new Controller().addPeopleInRestaurant(id, numberOfPeople);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static int createRestaurant() {
        String name = askRestaurantName();
        return new Controller().createRestaurant(name);
    }

    public static String askRestaurantName() {
        System.out.println("Write the restaurant name please: ");
        return Keyboard.readString();
    }

    public static int askNumberOfPeopleToAdd() {
        System.out.println("Write the number of people to add: ");
        return Keyboard.readInt();
    }
}
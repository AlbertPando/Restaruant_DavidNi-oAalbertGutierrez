package com.vehicles.project.view;


import Keyboard.Keyboard;
import com.vehicles.project.application.Controller;
import com.vehicles.project.utilities.ConstantsUtilities;


public class Main {


    public static void main(String[] args) throws Exception {
            String restaurantId = createRestaurant();
            askToAddInRestaurant(restaurantId);
    }
    private static String createRestaurant() throws Exception {

        String nameRestaurant = askRestaurantName();
        return new Controller().createRestaurant(nameRestaurant);
    }

    private static void addPeople(String id) throws Exception{
        new Controller().addPeopleInRestaurant(id,askNumPeople());
    }
    private static void askToAddInRestaurant ( String id) {
        char ask = askYesOrNot();
        while (ask == ConstantsUtilities.YES){
            try {
                addPeople(id);
            }catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }
            ask=askYesOrNot();
        }
    }

    private static char askYesOrNot (){
        System.out.println("You want to add more people in the restaurant? (y or n)");
        return Keyboard.readChar();

    }
    private static String askRestaurantName() {
        System.out.println("Name of the restuarant: ");
        return Keyboard.readString();
    }

    public static int askNumPeople() {
        System.out.println("How many people for the reservation? ");
        return Keyboard.readInt();
    }

}
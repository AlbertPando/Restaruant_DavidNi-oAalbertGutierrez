package com.vehicles.project.view;


import Keyboard.Keyboard;
import com.vehicles.project.application.Controller;
import com.vehicles.project.utilities.ConstantsUtilities;

public class Main {

    public static void main(String[] args) {
        try {
            String plate = createVehicle();
            addWheelsToVehicle(plate);
            paintVehicle(plate);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void paintVehicle(String plate) {
        String color = askCarColor();
        new Controller().paintVehicle(plate, color);
    }

    private static void addWheelsToVehicle(String plate) throws Exception {
        String brandWheel = askBrandWheel();
        Double diameterWheel = askWheelDiameter();
        new Controller().addWheels(plate, brandWheel, diameterWheel);
    }

    private static String createVehicle() throws Exception {
        int type = askVehicleType();
        String brand = askCarBrand();
        String plate = askCarPlate();
        String color = askCarColor();
        return new Controller().createVehicle(type, brand, plate, color);
    }


    private static int askVehicleType() throws Exception {
        System.out.println("Write the vehicle you want ('bike' , 'car' or 'tricicle'): ");
        String option = Keyboard.readString();
        if (option.equals("bike"))
            return ConstantsUtilities.BIKE;
        if (option.equals("car"))
            return ConstantsUtilities.CAR;
        if (option.equals("tricicle"))
            return ConstantsUtilities.TRICICLE;
        else
            throw new Exception("The written text must be 'bike' or 'car'!");
    }

    private static String askBrandWheel() {
        System.out.println("Write the wheel brand: ");
        return Keyboard.readString();
    }

    private static Double askWheelDiameter() {
        System.out.println("Write the front wheel diameter: ");
        return Keyboard.readDouble();
    }

    private static String askCarPlate() {
        System.out.println("Write the vehicle plate: ");
        return Keyboard.readString();
    }

    public static String askCarBrand() {
        System.out.println("Write the vehicle brand: ");
        return Keyboard.readString();
    }

    public static String askCarColor() {
        System.out.println("Write the vehicle color: ");
        return Keyboard.readString();
    }
}
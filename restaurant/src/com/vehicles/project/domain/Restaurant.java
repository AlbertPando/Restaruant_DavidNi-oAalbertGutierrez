package com.vehicles.project.domain;

public class Restaurant {
    private static int counter;
    private int id;
    private String name;
    private int capacity;

    public Restaurant(String name, int capacity) {
        this.counter += 1;
        this.id = this.counter;
        this.name = name;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

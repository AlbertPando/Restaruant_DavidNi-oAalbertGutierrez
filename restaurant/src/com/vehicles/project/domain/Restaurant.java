package com.vehicles.project.domain;

public class Restaurant {
    private static int counter;
    private int id;
    private String name;
    private int capacity;
    private final int MAX_CAPACITY = 24;

    public Restaurant(String name) {
        this.counter += 1;
        this.id = this.counter;
        this.name = name;
        this.capacity = 0;
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

    public int addPeopleInRestaurant(int numberOfPeople) throws Exception{
        if (this.capacity + numberOfPeople > this.MAX_CAPACITY)
            throw new Exception("No es pot afegir aquesta quantitat de gent, estem plens");
        this.capacity += numberOfPeople;
        return this.MAX_CAPACITY - this.capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id == that.id;
    }
}

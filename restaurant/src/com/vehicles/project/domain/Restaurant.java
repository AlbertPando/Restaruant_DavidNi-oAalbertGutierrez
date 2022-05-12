package com.vehicles.project.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Integer> tables;
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
        this.tables = new ArrayList<Integer>();
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
        addPeopleGroup(numberOfPeople);
        return this.MAX_CAPACITY - this.capacity;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id == that.id;
    }
    public void addPeopleGroup(int numberOfPeople){
       this.tables.add(numberOfPeople);

        printAllGroups();
    }
    public void printAllGroups(){
        for (Integer table:
             this.tables) {
            System.out.print();
        }

    }
}
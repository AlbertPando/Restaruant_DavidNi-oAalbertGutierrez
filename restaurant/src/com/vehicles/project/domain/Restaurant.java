package com.vehicles.project.domain;

import java.util.UUID;

public class Restaurant {
    private Table[] tables;
    private static int counter;
    private String id;
    private String name;
    private int capacity;
    private final int MAX_CAPACITY = 24;
    private final int MAX_CAPACITY_IN_TABLE = 6;
    private final int MAX_TABLES = 4;

    public Restaurant(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.capacity = 0;
        this.tables = new Table[MAX_TABLES];
    }

    public String getId() {
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
            throw new Exception("You can't add that many people, we're full");
        this.capacity += numberOfPeople;
        addPeopleGroup(numberOfPeople);
        printAllGroups();
        return this.MAX_CAPACITY - this.capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id == that.id;
    }

    private void addPeopleGroup(int numberOfPeople) throws Exception {
        int numOfTables, actualPeople, totalPeople = numberOfPeople;
        if (totalPeople > MAX_CAPACITY_IN_TABLE){
            numOfTables = (int) Math.ceil((double) totalPeople/MAX_CAPACITY_IN_TABLE);
            System.out.println(totalPeople / MAX_CAPACITY_IN_TABLE);
        }
        else
            numOfTables = 1;

        for (int i = 0; i < numOfTables; i++){
            if (totalPeople > MAX_CAPACITY_IN_TABLE)
                actualPeople = 6;
            else
                actualPeople = totalPeople;

            putPeopleOnTables(actualPeople);

            totalPeople -= actualPeople;
        }
    }

    private void putPeopleOnTables(int numberOfPeople) throws Exception {
        for (int i = 0; i < this.tables.length; i++){
            if (this.tables[i] == null){
                this.tables[i] = new Table(numberOfPeople);
                return;
            }
        }
        throw new Exception("There is no more tables free.");
    }

    public void deleteTable (int tableNum) throws Exception {
        if (tableNum > 4)
            throw new Exception("There is only 4 tables in our restaurant.");
        else if (this.tables[tableNum - 1] == null)
            throw new Exception("This table is alredy empty.");

        this.tables[tableNum - 1] = null;
    }

    public void printAllGroups(){
        for (int i = 0; i < this.tables.length; i++)
            System.out.println("Table " + (i + 1) + ": " + this.tables[i].getNumberOfPeople() + " people.");
    }


}
package com.vehicles.project.application.dto;

import com.vehicles.project.domain.Restaurant;

public class RestaurantDTO {
    private int[] tables;
    private int id;
    private String name;
    private int capacity;

    public RestaurantDTO(){}

    public RestaurantDTO(String name){

    }

    public RestaurantDTO(Restaurant restaurant){

    }

    public int[] getTables() {
        return tables;
    }

    public void setTables(int[] tables) {
        this.tables = tables;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

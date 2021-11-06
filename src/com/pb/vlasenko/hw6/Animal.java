package com.pb.vlasenko.hw6;

import java.util.Objects;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }





    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void sleep() {
        System.out.println("это животное спит.");
    }

    public void makeNoise() {
        System.out.println(" шумит.");
    }

    public void eat() {
        System.out.println(" кушает.");
    }


}

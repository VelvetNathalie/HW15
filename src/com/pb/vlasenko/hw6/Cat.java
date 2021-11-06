package com.pb.vlasenko.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String sociability;
    private String poise;

    public Cat(String food, String location) {
        super("Wiskas", "Южноукраинск");
    }

    public Cat(String food, String location, String sociability, String poise) {
        super(food, location);
        this.sociability = sociability;
        this.poise = poise;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(sociability, cat.sociability) && Objects.equals(poise, cat.poise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sociability, poise);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "sociability='" + sociability + '\'' +
                ", poise='" + poise + '\'' +
                '}';
    }

    public String getSociability() {
        return sociability;
    }

    public void setSociability(String sociability) {
        this.sociability = sociability;
    }

    public String getPoise() {
        return poise;
    }

    public void setPoise(String poise) {
        this.poise = poise;
    }

    @Override
    public void eat() {
        System.out.println("кот хомячит " + getFood());

    }

    @Override
    public void makeNoise() {
        System.out.println("кот мяучит ");
    }



    }





package com.pb.vlasenko.hw6;

import java.util.Objects;

public class Dog extends Animal{

    private String watchman;
    private String powerful;
    public Dog (String food, String location) {
        super("Pedigree", "Киев");
    }

    public Dog(String food, String location, String watchman, String powerful) {
        super(food, location);
        this.watchman = watchman;
        this.powerful = powerful;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(watchman, dog.watchman) && Objects.equals(powerful, dog.powerful);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watchman, powerful);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "watchman='" + watchman + '\'' +
                ", powerful='" + powerful + '\'' +
                '}';
    }

    public String getWatchman() {
        return watchman;
    }

    public void setWatchman(String watchman) {
        this.watchman = watchman;
    }

    public String getPowerful() {
        return powerful;
    }

    public void setPowerful(String powerful) {
        this.powerful = powerful;
    }

    @Override
    public void eat() {
        System.out.println("пес грызет во сне " + getFood());

    }

    @Override
    public void makeNoise() {
        System.out.println("пес лает");
    }

}

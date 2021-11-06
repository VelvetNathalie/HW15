package com.pb.vlasenko.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String quickly;
    private String graceful;

    public Horse (String food,String location) {
        super("Сено","Вышгород");
    }

    public Horse(String food, String location, String quickly, String graceful) {
        super(food, location);
        this.quickly = quickly;
        this.graceful = graceful;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(quickly, horse.quickly) && Objects.equals(graceful, horse.graceful);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quickly, graceful);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "quickly='" + quickly + '\'' +
                ", graceful='" + graceful + '\'' +
                '}';
    }

    public String getQuickly() {
        return quickly;
    }

    public void setQuickly(String quickly) {
        this.quickly = quickly;
    }

    public String getGraceful() {
        return graceful;
    }

    public void setGraceful(String graceful) {
        this.graceful = graceful;
    }

    @Override
    public void eat() {
        System.out.println("конь жует " + getFood());

    }

    @Override
    public void makeNoise() {
        System.out.println("конь ржет ");
    }

}

package com.pb.vlasenko.hw7;

public class Skirt extends Clothes implements WomenClothes
{
    public Skirt(String size, String name, String colour, int price) {
        super(size, name, colour, price);
    }

    @Override
    public void dressWomen() {
        System.out.println( "женская одежда  "+getinfo());
    }
}

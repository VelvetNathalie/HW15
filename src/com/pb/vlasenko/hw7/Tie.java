package com.pb.vlasenko.hw7;

public class Tie extends Clothes implements ManClothes
{
    public Tie(String size, String name, String colour, int price) {
        super(size, name, colour, price);
    }

    @Override
    public void dressMan() {
        System.out.println( "мужская одежда "+ getinfo());
    }
}

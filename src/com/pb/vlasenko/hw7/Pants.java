package com.pb.vlasenko.hw7;

public  class Pants extends Clothes implements ManClothes ,WomenClothes
{
    public Pants(String size, String name, String colour, int price) {
        super(size, name, colour, price);
    }


    @Override
    public void dressMan() {
System.out.println( "мужская одежда "+getinfo());

    }

    @Override
    public void dressWomen() {
        System.out.println( "женская одежда  "+getinfo());

    }

}



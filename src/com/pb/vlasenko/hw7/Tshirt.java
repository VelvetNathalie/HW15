package com.pb.vlasenko.hw7;

public  class Tshirt extends Clothes implements ManClothes,WomenClothes{
    public Tshirt(String size, String name, String colour, int price) {
        super(size, name, colour, price);
    }

    @Override
    public void dressWomen() {
        System.out.println( "женская одежда  "+getinfo());
    }

    @Override
    public void dressMan() {
        System.out.println( "мужская одежда "+ getinfo());



    }
}

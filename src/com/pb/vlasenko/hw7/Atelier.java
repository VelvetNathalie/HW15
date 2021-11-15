package com.pb.vlasenko.hw7;

public class Atelier {
    public static void main(String[] args) {

        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Pants("S", "Pants Jeans", "black", 1500);
        clothes[1] = new Skirt("S", "Skirt Pan", "White", 1000);
        clothes[2] = new Tie("L", "Tie Gapp", "Green", 600);
        clothes[3] = new Tshirt("M", "Tshirt FH", "White", 900);

        Pants[] pants = new Pants[2];
        pants[0] = new Pants("M", "Pants bogaga", "black", 1800);
        pants[1] = new Pants("L", "Pants Chinos", "Orange", 2300);

        Skirt[] skirts = new Skirt[2];
        skirts[0] = new Skirt("L", "Skirt STRAIGHT SKIRT", "black", 900);
        skirts[1] = new Skirt("M", "Skirt SLIM SKIRT", "White", 950);

        Tie[] ties = new Tie[2];
        ties[0] = new Tie("Long", "Tie Gapp", "Orange", 6000);
        ties[1] = new Tie("Middle length", "Tie Gucci", "Green", 3000);

        Tshirt[] tshirts = new Tshirt[2];
        tshirts[0] = new Tshirt("XXS", "Tshirt Gucci", "WHite", 600);
        tshirts[1] = new Tshirt("L", "Tshirt Paco rabanne", "Black", 2300);

        System.out.println(pants[0] instanceof ManClothes);
        System.out.println(pants[1] instanceof WomenClothes);
        System.out.println(skirts[0] instanceof ManClothes);
        System.out.println(ties[0] instanceof ManClothes);
        System.out.println(tshirts[0] instanceof ManClothes);
        System.out.println(skirts[0] instanceof WomenClothes);
        System.out.println(ties[1] instanceof WomenClothes);
        System.out.println(tshirts[0] instanceof WomenClothes);


        ties[1].dressMan();
        skirts[1].dressWomen();

        System.out.println(ties[1].getinfo());
        System.out.println(clothes[1].getinfo());
        System.out.println(tshirts[1].getinfo());

        dressWomen(clothes);
        dressMan(clothes);

}

    static void dressMan(Clothes[] clothes)
        {
            System.out.println("это одежда мужская: ");
        for (Clothes clothes1:clothes)
        {
            if(clothes1 instanceof ManClothes)
            {((ManClothes)clothes1).dressMan();
            }
        }
        }


    static void dressWomen(Clothes[] clothes)
    { System.out.println("это одежда женская: ");
        for (Clothes clothes1:clothes)
        {
            if(clothes1 instanceof WomenClothes)
            {
                ((WomenClothes)clothes1).dressWomen();
            }

        }
    }


}



package com.pb.vlasenko.hw6;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class VetClinic {

    public static void main(String[] args) throws Exception {

        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Wiskas", "Южноукраинск");
        animals[1] = new Dog("Pedigree", "Киев");
        animals[2] = new Horse(" Сено ", " Вышгород ");


        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Milk", "Saratov", " More sociable", "More balanced character");
        cats[1] = new Cat("Royal Canin", "Chernigov", "crazy", "Less balance");

        Dog[] dogs = new Dog[2];
        dogs[1] = new Dog("Porridge", "Chernivtsi", "Good watchman", "Powerful Backbone");
        dogs[0] = new Dog("bones", "lviv", "bad watchman", "Small");

        Horse[] horses = new Horse[2];
        horses[0] = new Horse("Hay", "Saratov", "Very quickly", " Very graseful");
        horses[1] = new Horse("Wheat", "lviv", "Lihtning", "Highest level gfaseful");


        animals[0].sleep();
        animals[0].eat();
        animals[0].makeNoise();
        animals[1].sleep();
        animals[1].eat();
        animals[1].makeNoise();
        animals[2].sleep();
        animals[2].eat();
        animals[2].makeNoise();

        System.out.println("Comparison 0 1 : " + cats[0].equals(cats[1]));
        System.out.println("Comparison 0 1: " + dogs[0].equals(dogs[1]));
        System.out.println("Comparison 0 1: " + horses[0].equals(horses[1]));

        System.out.println("HashCode cat 1: " + cats[1].hashCode());
        System.out.println("HashCode cat 0: " + cats[0].hashCode());
        System.out.println("HashCode dog 1: " + dogs[1].hashCode());
        System.out.println("HashCode dog 0: " + dogs[0].hashCode());
        System.out.println("HashCode horse  1: " + horses[1].hashCode());
        System.out.println("HashCode horse 0: " + horses[0].hashCode());


        System.out.println("toString cats 0: " + cats[0].toString());
        System.out.println("toString cats 1: " + cats[1].toString());
        System.out.println("toString dog 0: " + dogs[0].toString());
        System.out.println("toString dog 1: " + dogs[1].toString());
        System.out.println("toString horse 0: " + horses[0].toString());
        System.out.println("toString horse 1: " + horses[1].toString());

        String[] string = new String[animals.length];


        Veterinarian veterinar = new Veterinarian();
        Class clazz = veterinar.getClass();
        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getMethods()));

        Class veterinarClazz = Class.forName("com.pb.vlasenko.hw6.Veterinarian");
        Class veterinarianClass = Veterinarian.class;
        Constructor constr = veterinarClazz.getConstructor(new Class[]{});
        Object obj = constr.newInstance();
        if (obj instanceof Veterinarian) {
            for (int i = 0; i < animals.length; i++) ;
            {
                ((Veterinarian) obj).treatAnimal(animals[2]);
                ((Veterinarian) obj).treatAnimal(animals[1]);
                ((Veterinarian) obj).treatAnimal(animals[0]);

            }


        }


    }}




package com.pb.vlasenko.hw10;

public class main {
    public static void main(String[] args) {
        NumBox<Float> floatBox = new NumBox<>(6);
        floatBox.add(1.2f);
        floatBox.add(1.6f);
        floatBox.add(5.9f);
        floatBox.add(-11.5f);
        floatBox.add(9.7f);
        floatBox.add(56.6f);
        print(floatBox);

        NumBox<Integer>integerBox=new NumBox<>(3);
        integerBox.add(5);
        integerBox.add(88);
        integerBox.add(745);
        print(integerBox);

    }

    private static void print(NumBox<?> numBox) {
        int length = numBox.length();

        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(numBox.get(i) + " ");
        }
        System.out.println();

        System.out.println("сумма: " + numBox.sum());
        System.out.println("среднее арифметическое среди элементов массива: " + numBox.average());
        System.out.println("максимальный элемент массива: " + numBox.max());
    }
}



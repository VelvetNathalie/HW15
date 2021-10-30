package com.pb.vlasenko.hw3;
import java.util.Scanner;
import java.util.Arrays;
    public class Array {
        public static void main(String[] args) {
            int[] mas = new int[10];
            int x = mas.length;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое число: ");


            for (int i = 0; i < mas.length; i++)
                mas[i] = scanner.nextInt();
            System.out.println("Введены следующие числа: ");
            for (int i1 = 0; i1 < mas.length; i1++)
            System.out.println(mas[i1]);

            int sum = Arrays.stream(mas).sum();
            System.out.println(" Сумма целых чисел: " + sum);

            {
                int counter = 0;
                for (int i = 0; i < mas.length; i++) {
                    if (mas[i] > 0)
                        ++counter;
                }
                System.out.println("Количество положительных элементов : "+counter);

                boolean isSorted = false;
                int buf;
                while(!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < mas.length-1; i++) {
                        if(mas[i] > mas[i+1]){
                            isSorted = false;

                            buf = mas[i];
                            mas[i] = mas[i+1];
                            mas[i+1] = buf;
                        }
                    }
                }
                System.out.println(" Сортируем от меньшего к большему" + Arrays.toString(mas));
            }


        }
    }





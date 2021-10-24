package com.pb.vlasenko.hw3;


import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 101);
        int attempt = 0;
        System.out.println("x= " + x);
        System.out.println("Введите целое число от 1 до 100:  ");
        System.out.println("Для окончания игры введите: 1000");
        Scanner scan = new Scanner(System.in);

            while (true) {
                attempt++;
                System.out.println("попытка " + attempt + ":  ");

                int y;
                y = scan.nextInt();
                Scanner in = new Scanner(System.in);

                if (y < 0 || y > 101) {
                    if (y != 1000)
                    { System.out.println("Введите целое число от 1 до 100:  ");
                }
                }
                if (y > x) {
                    System.out.println("Введенное число больше заданного");
                }
                if (y < x) {
                    System.out.println("Введенное число меньше заданного");
                }

                if (y == 1000) {
                    System.out.println("Конец игры!");
                    break;
                }
                if (y == x) {
                    System.out.println("ура!!! Вы угадали число с " + attempt + "попытки.");
                    System.out.println("Конец игры!");
                     break;
                }
                }
        System.out.println("Конец! Спасибо за участие");

            }


        }










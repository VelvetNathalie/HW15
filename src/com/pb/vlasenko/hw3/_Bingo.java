package com.pb.vlasenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class _Bingo {

    public static void main(String[] args) {
        int att = 0;

        int num = (int) (Math.random() * 101);

        Scanner scan = new Scanner(System.in);

        System.out.println("Для выхода введите -1");
        System.out.println("Введите число от 0 до 100:");

        while (true) {
            att++;
            System.out.println("Попытка " + att + ":");
            int userNum = scan.nextInt();

            if (userNum < 0 || userNum > 100) {
                if (userNum != -1) {
                    System.out.println("Введите число от 0 до 100");
                    continue;
                }
            }

            if (userNum == -1) {
                break;
            }

            if (userNum < num) {
                System.out.println("Число меньше заданого");
                continue;
            }

            if (userNum > num) {
                System.out.println("Число больше заданого");
                continue;
            }

            if (userNum == num) {
                System.out.println("Вы угадали!");
                break;
            }
        }
        System.out.println("Конец!");
    }
}

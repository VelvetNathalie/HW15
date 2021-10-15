package com.pb.vlasenko.hw2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Impute first number: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        System.out.println("Impute second number: ");
        Scanner scan2 = new Scanner(System.in);
        int y = scan.nextInt();


        System.out.println("Impute symbol: ");
        Scanner scan3 = new Scanner(System.in);
        String znak = scan.next();

        int result = 0;

        switch (znak) {
            case "+":
                result = x += y;
                System.out.println(result);
                break;
            case "-":
                result = x -= y;
                System.out.println(result);
                break;
            case "*":
                result = x *= y;
                System.out.println(result);
                break;
            case "/":
                if (y == 0 || x == 0)
                    System.out.println("Operation cannot be performed");
                else {
                    result = x /= y;
                    System.out.println(result);
                }
                break;
        }

    }
}


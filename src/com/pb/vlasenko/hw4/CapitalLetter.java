package com.pb.vlasenko.hw4;

import java.sql.Array;
import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {
    private static Object CapitalLetter;

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите вашу фразу: ");
        Scanner scan = new Scanner(System.in);

        String fraze = scan.nextLine();

        String Fraze = toUpperCaseForFirstLetter(fraze);
        System.out.println("Введена: " + Fraze);
    }

    private static String toUpperCaseForFirstLetter(String fraze) {
        StringBuilder builder = new StringBuilder(fraze);
        if (Character.isAlphabetic(fraze.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(fraze.charAt(0)));
        for (int i = 1; i < fraze.length(); i++)
            if (Character.isAlphabetic(fraze.charAt(i)) && Character.isSpaceChar(fraze.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(fraze.charAt(i)));

        return builder.toString();
    }
}




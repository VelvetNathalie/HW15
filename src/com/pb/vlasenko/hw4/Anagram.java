package com.pb.vlasenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        System.out.println("Пожалуйста, введите вашу фразу: ");
        Scanner scan = new Scanner(System.in);
        String fraze = scan.nextLine();
        String result = fraze.toLowerCase();
        System.out.println("Пожалуйста, введите вашу фразу 2: ");
        String fraze2 = scan.nextLine();
        String result2 = fraze2.toLowerCase();
        int n1 = 0;
        String textDigits = "";
        //StringBuilder textDigits = new StringBuilder();
        for (char ch : result.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                textDigits = textDigits + ch;
            } else {
                n1++;
            }
        }
        //System.out.println("Количество других символов: " + n1);
       // System.out.println(textDigits);

        int n2 = 0;
        String textDigits2 = "";

        for (char ch : result2.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                textDigits2 = textDigits2 + ch;
            } else {
                n2++;
            }
        }
       // System.out.println("Количество других символов2: " + n2);
        //System.out.println(textDigits2);
        if (isPermutation(textDigits2, textDigits))
            System.out.println("Ура, поздравляем!");
    }
    public static boolean isPermutation(String textDigits2, String textDigits)
    {
        char[] x = textDigits.toCharArray();
        char[] y = textDigits2.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x, y))
        {
            System.out.println("Ваша фраза является анаграммой!");
            return true;
        }
        System.out.println("Ваша фраза не является анаграммой :(");
        return false;
    }

    }














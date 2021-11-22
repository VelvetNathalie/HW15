package com.pb.vlasenko.HW9;
import java.io.*;
import java.util.Scanner;
import java.io.FileReader;
import java.io.Reader;

public class FileNumbers {


    public static void main(String[] args) throws Exception {

        int[][] mas = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mas[i][j] = (int) (Math.random() * 99) + 1;
            }
            Scanner scan = new Scanner(System.in);

            for (int j = 0; j < 10; j++) {
                System.out.print(mas[i][j] + " ");

            }

            System.out.println();
        }
        createNumbersFile(mas, "D:/numbers.txt");
        createOddNumbersFile("D:/numbers.txt", "D:/odd-numbers.txt");


    }

    private static void createNumbersFile(int[][] mas, String s) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(s));
            bw.write(String.valueOf(10));
            bw.newLine();
           bw.write(String.valueOf(10));
            bw.newLine();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++)
                {
                    mas[i][j] = (int) (Math.random() * 99) + 1;
                }
                Scanner scan = new Scanner(System.in);
                for (int j = 0; j < 10; j++) {
                }
                {for (int j = 0; j < 10; j++)
                    bw.write(String.valueOf(mas[i][j]));
                    bw.newLine();

                }
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[][] createOddNumbersFile(String s, String SS) {
        int[][] mas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(s))) {
            BufferedWriter bww = new BufferedWriter(new FileWriter(SS));
          int couls = Integer.parseInt(br.readLine());
           int rouls = Integer.parseInt(br.readLine());
            mas = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++)
                    if (i % 2 == 0) if (j % 2 == 0)
                       //System.out.print(mas[i][j] + " ");

                        bww.write(String.valueOf(mas[i][j]));
                for (int j = 0; j < 10; j++)
                       mas[i][j] = Integer.parseInt(br.readLine());
                bww.newLine();
            }
            bww.flush();
            bww.close();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
    }
        return mas;
}}












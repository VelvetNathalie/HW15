package com.pb.vlasenko.HW9;
import java.io.*;
import java.util.Scanner;
import java.io.FileReader;

public class FileNumbers {

    public static void main(String[] args) throws Exception {
        int[][] mas = new int[10][10];
        int i;
        int j;
        for (i = 0; i < 10; i++)
            for (j = 0; j < 10; j++)
                mas[i][j] = (int) (Math.random() * 99) + 1;

        createNumbersFile(mas, "D:/numbers.txt");
        createOddNumbersFile();



    }

    private static void createNumbersFile(int[][] mas, String s) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(s));

            mas = new int[10][10];
            //Random random = new Random();
            System.out.println("Создан файл: ");

            bw.newLine();

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    mas[i][j] = (int) (Math.random() * 99) + 1;
                    bw.write(mas[i][j] + "\n");

                }
                Scanner scan = new Scanner(System.in);

                for (int j = 0; j < 10; j++) {
                    System.out.print(mas[i][j] + " ");

                }

                System.out.println();
                bw.append("\n");
            }
            bw.newLine();
            Scanner scan = new Scanner(System.in);


            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void createOddNumbersFile() {
        try {
            try (Scanner in = new Scanner(new File("D:/numbers.txt"));
                 PrintWriter out = new PrintWriter(new FileWriter("odd-numbers.txt"));) {
                System.out.println("Вывод, с учетом замены целых четных чисел на '0':");
                while (in.hasNextLine()) {
                    Scanner line = new Scanner(in.nextLine());
                    while (line.hasNextInt()) {
                        int data = line.nextInt();
                        if (data % 2 == 0) {
                            System.out.format("%d -> 0, ", data);
                            data = 0;
                        } else
                            System.out.print(data + ", ");
                        out.print(data + ", ");
                    }
                    line.close();
                    out.println();
                    System.out.println();
                }
            } catch (FileNotFoundException e) {
                {
                    System.out.println("FileNotFoundException: " + e);
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
















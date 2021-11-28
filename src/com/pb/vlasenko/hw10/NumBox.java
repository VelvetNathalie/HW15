package com.pb.vlasenko.hw10;

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumBox <T extends Number> {

    // private final T[] numbers;

//
    //  public NumBox(T[] numbers) {
    //   this.numbers = numbers;
    //  }

    //@SuppressWarnings("unchecked")
    // public NumBox(int size)
   // {
   /// numbers = (T[]) new Number()[size];
    //}
//logim v massiv po indeksy
    //  public T get(int index) {
    //  return numbers[index];
    //  }

    // vuvodim s massiva po indeksu
    //  public void set(int index, T number) {
    //  this.numbers[index] = number;
    //  }/
    private List<T> numbers;

    public List<T> getNumbers() {
        return numbers;
    }


    public NumBox(List<T> numbers) {
        this.numbers = numbers;
    }

    public NumBox(float v) {
        numbers = new ArrayList<T>();
        //  public NumBox(Integer.MAX_VALUE){this.Integer.MAX_VALUE=
    }



    public T get(int index) {
        return numbers.get(index);
        //return ("число в массиве: " +index);
    }

    public int length(List<T>numbers) {
        System.out.println ("количество элементов: " );
        Scanner scan = new Scanner(System.in);
        scan.nextInt(length(numbers));;
        System.out.println ("текущее количество элементов:  " + length(numbers));
        //System.out.println(new StringBuilder().append("текущее количество элементов:  ").append(length()).toString());
        return 0;
           }

    public int add(T num)
   {
       System.out.println ("введите число: " );
      Scanner scan1 = new Scanner(System.in);
        numbers.add(num);
      //for
      //(T List: numbers)
       // int size=;
        //  boolean add = numbers.add(num);
         // if (int i =0; i <Length() ; i++);
           {  System.out.println("число в массив: " + num);
       }
           // else  System.out.println("Массив переполнен: ");
       //}
       return 0;
    }

   // int result = 0;
    public double average(List<T>numbers){
    double average = 0;
       // {
           // for (int i = 1; i < length(numbers); i++) {
              //  int sum = 0, count = 0;
              //  result = sum+T;
              //  getNumbers(numbers.contains());
             //   count++;
            //    result = sum / count;
              //  return result;

          //  }
          //  return 0;
       // }
          {if (length(numbers) > 0)
          {double sum = 0;
              for (int j = 0; j <length(numbers); j++) {
                //  sum += numbers.get(j);
              }
              average=average(numbers);
              //average = sum / length(numbers);
              System.out.println("Среднее арифметическое массива: " + average);
          }
          //return 0;
          } return 0;
    }




}



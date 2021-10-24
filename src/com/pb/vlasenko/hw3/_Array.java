package com.pb.vlasenko.hw3;
import java.util.Scanner;
public class _Array {
        public static void main(String[] args) {
            Scanner nums1 = new Scanner(System.in);
            int[] nums = new int[10];
            int sum = 0;

            for (int i = 0; i < nums.length; i++)
                nums[i] = nums1.nextInt();

            for (int x = 0; x < nums.length; x++)
                System.out.println(nums[x]);

            for (int num : nums) {
                sum = sum + num;
            }
            System.out.println("Сумма чисел массива равна " + sum);
        }
    }



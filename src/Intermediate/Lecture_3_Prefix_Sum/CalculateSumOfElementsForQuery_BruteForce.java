package Intermediate.Lecture_3_Prefix_Sum;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateSumOfElementsForQuery_BruteForce {

    public static void calculateQueryRangeSum(int[] arr, int q) {
        System.out.println(10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of array elements");

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter " + i + " element out of " + n + " elements");
            arr[i] = scn.nextInt();
        }

        System.out.println("Entered array is ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter number of queries ");
        int q = scn.nextInt();
        calculateQueryRangeSum(arr, q);
    }
}

package Lecture_8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestNumberInArray {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int largest(int[] arr) {
        int largestNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (largestNum < arr[i]) {
                largestNum = arr[i];
            }
        }

//        or method 2 using for in

//        for(int x: arr) {
//            if(x>largestNum) {
//                largestNum = x;
//            }
//        }

        return largestNum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        printArray(arr);
        int largestNum = largest(arr);
        System.out.println("Largest number present in array is " + largestNum);
    }
}

package Lecture_8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

    public static void playWithArray() {
        int[] marks = {10, 50, 30, 40, 50};
        System.out.println(marks);
        System.out.println(marks.length);
//        Printing array
        System.out.println(marks[1]);
//        Loop through array (0 to n-1(last index))
        for (int i = 0; i <= marks.length - 1; i++) {
            System.out.println("Print Array in loop " + marks[i]);
        }

//        For each loop -->>
        System.out.println("For each loop starts");
        for (int x : marks) {
            System.out.print(x + " ");
        }

//        Method 3 to print array using Arrays.toString()
        System.out.println("Using Arrays.toString()");
        System.out.println(Arrays.toString(marks));
    }

    public static void printArray() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

//        Creating array of length n
        int[] newArr = new int[n];

        int[] arr = new int[5];
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        1. Hardcoded Array
//        System.out.println("Hardcoded Array " );
//        playWithArray();

//        2. User Input array
//            printArray();

//        3. Take Input from array and print it.
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of array to be created ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Enter value at index " + i);
            arr[i] = scn.nextInt();
        }
        System.out.println("Array is " + arr);
        System.out.println("Stringed array is " + Arrays.toString(arr));
    }
}

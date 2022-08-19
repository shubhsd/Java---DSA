package Beginner.Lecture_8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndexOfKey {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Method 1 ==>> " + Arrays.toString(arr));
            System.out.print("Method 2 ==>> " + arr[i]);
        }
    }

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter key to find ");
        int key = scn.nextInt();
        int found = search(arr, key);
        if(found != -1) {
            System.out.println("Key found at index : " + found);
        } else {
            System.out.println("Key not found");
        }
        printArray(arr);
    }
}

package Lecture_10_2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayWithVariableColumns {
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
//            Iterate over cols in ith row
            int cols = arr[i].length;
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayWithVariableSize() {
//        2D array with hardcoded values
        int[][] arr = {{10, 20}, {30, 40, 50, 60}, {90, 100}};
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);

        print2DArray(arr);
    }

    public static void main(String[] args) {
//        arrayWithVariableSize();
//        Create an array without telling number of columns in every row
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int r = scn.nextInt();
        int[][] arr = new int[r][];
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < r; i++) {
            System.out.println("Enter cols in " + i + " rows");
            int cols = scn.nextInt();
//            Now we know number of columns so we will create new array here
            arr[i] = new int[cols];
//            once
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        print2DArray(arr);
    }
}

package Beginner.Lecture_10_2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][] arr = new int[m][n];

        int rows = arr.length;
        int cols = arr[0].length;
//        Print all elements of the array
//        Method - 1 - Print entire rows at once
        for(int i = 0; i<rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
//            Arrays.toString() -> converts array located at that address to string
        }

//        Method - 2  - Go to every element of ith row
        System.out.println("Using method - 2 ");
        for(int i = 0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package Lecture_10_2D_Arrays;

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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

//        2D array with hardcoded values
        int[][] arr = {{10, 20}, {30, 40, 50, 60}, {90, 100}};
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);

        print2DArray(arr);
    }
}

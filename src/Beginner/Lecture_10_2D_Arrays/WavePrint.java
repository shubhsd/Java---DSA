package Beginner.Lecture_10_2D_Arrays;

import java.util.Scanner;

public class WavePrint {

    public static void wavePrint(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
//                 even column - go from
                for (int r = 0; r < rows; r++) {
                    System.out.print(arr[r][col] + ",");
                }
            } else {
//                odd column - go from bottom to top
                for (int r = rows - 1; r >= 0; r--) {
                    System.out.print(arr[r][col] + ",");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
//        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
        wavePrint(arr);
    }
}

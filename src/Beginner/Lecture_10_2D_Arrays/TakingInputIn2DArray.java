package Beginner.Lecture_10_2D_Arrays;

import java.util.Scanner;

public class TakingInputIn2DArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();

        int[][] arr = new int[rows][cols];
        int rowLength = arr.length;
        int colLength = arr[0].length;

//        Reading all elements of arrat

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
//                System.out.println("Enter " + i + " row " + j + " index value");
                arr[i][j] = scn.nextInt();
            }
        }

//        Print 2D array
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

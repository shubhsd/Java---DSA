package Lecture_10_2D_Arrays;

import java.util.Scanner;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        Input number of rows and columns
        int m = scn.nextInt();
        int n = scn.nextInt();

//        Create array
        int[][] arr = new int[m][n];

        System.out.println("Length of array " + arr);
        System.out.println("Length of arr[0] i.e basically length of columns " + arr[0]);

//        Read the data
//        by default everything would be 0
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println(rows + " " + cols);

    }
}

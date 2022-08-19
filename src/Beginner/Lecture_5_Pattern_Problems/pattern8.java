package Beginner.Lecture_5_Pattern_Problems;

//Print upto n numbers
//      n = 10
//      1
//      2 3
//      4 5 6
//      7 8 9 10
//
//        n = 14
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14

//Here we don't know number of rows, but we know the final value

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int final_val = scn.nextInt();
        int val = 1;

        for (int i = 1; val <= final_val; i++) {
//            Method 1 for 1 inner loop
//            for (int j = 1; j <= i; j++) {
//                System.out.print(val + " ");
//                val++;
//                if (val > final_val) {
//                    break;
//                }
//            }
//            Method 2 for inner loop
            for (int j = 1; j <= i && val <= final_val; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }
}

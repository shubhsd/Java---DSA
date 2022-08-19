package Beginner.Lecture_5_Pattern_Problems;

import java.util.Scanner;

//Print Pattern
//
//      1
//    2 3 2
//  3 4 5 4 3
//4 5 6 7 6 5 4

public class pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
//            Spaces
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
//            Increasing order half
            int val = i;
            for (int cnt = 1; cnt <= i; cnt++) {
                System.out.print(val);
                val++;
            }
//            For  decreasing part
//            System.out.println("After Loop val is " + val);
            val = val - 2;
            for (int dec = 1; dec <= i - 1; dec++) {
                System.out.print(val);
                val--;
            }
            System.out.println();
        }
    }
}

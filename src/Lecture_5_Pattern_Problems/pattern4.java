package Lecture_5_Pattern_Problems;

import java.util.Scanner;

//Print triangle
//  *
// ***
//*****
public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        Print rows
        for (int i = 1; i <= n; i++) {
//         Spaces
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
//            Stars
            for (int stars = 1; stars <= 2 * i - 1; stars++) {
                System.out.print("*");
            }
//            Enter new line after each print
            System.out.println();
        }
    }
}

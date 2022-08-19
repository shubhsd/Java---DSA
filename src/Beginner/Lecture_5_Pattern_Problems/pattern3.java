package Beginner.Lecture_5_Pattern_Problems;

import java.util.Scanner;
//Triangle pattern
//        *
//        * *
//        * * *
//        * * * *
public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        Print rows
        for (int i = 1; i <= n; i++) {
//            Work to be done
//            Print n number of stars in each row
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("* ");
            }
//            Enter new line after each print
            System.out.println();
        }
    }
}

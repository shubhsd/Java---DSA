package Lecture_5_Pattern_Problems;

import java.util.Scanner;

//Number Pattern
//1
//2 3
//4 5 6
//7 8 9 10
public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }
}

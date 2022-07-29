package Lecture_5_Pattern_Problems;

//0/1 toggle pattern
//N = 5
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                val = 0;
            } else {
                val = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = 1 - val;
            }
            System.out.println();
        }
    }
}

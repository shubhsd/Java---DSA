package Lecture_5_Pattern_Problems;

import java.util.Scanner;

//Number pattern
//        1234
//        1234
//        1234
//        1234

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

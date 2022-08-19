package Beginner.Lecture_5_Pattern_Problems;

import java.util.Scanner;
//Number pattern
//        1
//        12
//        123
//        1234
public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

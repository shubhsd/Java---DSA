package Beginner.Lecture_1_2_3_4;

import java.util.Scanner;

public class AllPrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        for (int n = A; n <= B; n++) {
            int i = 2;
            for (; i <= n - 1; i++) {
                if (n % i == 0) {
                    break;
                }
            }
//        check value of i
            if (i == n) {
                System.out.println("Prime " + n );
            }
        }
    }
}


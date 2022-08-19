package Beginner.Lecture_1_2_3_4;

import java.util.Scanner;

public class PrimeNumberForMultipleInputs {
    public static void main(String[] args) {
//        T inputs
//        For each input print prime or not
//        T = 5
//        Input 7 11 4 8 13
//        Prime, Prime, not prime, not prime, prime

        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = scn.nextInt();
            int i = 2;
            for (; i <= n - 1; i++) {
                if (n % i == 0) {
                    break;
                }
            }
//        check value of i
            if (i == n) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}

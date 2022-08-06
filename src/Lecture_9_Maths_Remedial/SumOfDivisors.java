package Lecture_9_Maths_Remedial;

import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}

package Lecture_9_Maths_Remedial;

import java.util.Scanner;

public class SumOfDivisorsOptimised {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i + (n / i);
            }
//            Handling perfect square case
            if (i == n / i) {
                sum = sum - i;
            }
        }
        System.out.println(sum);
    }
}

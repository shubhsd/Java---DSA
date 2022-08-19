package Intermediate.Lecture_1_Intro_To_Problem_Solving;

import java.util.Scanner;

public class FindFactors {

    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count++;
                } else {
                    count = count + 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(countFactors(n));
    }
}

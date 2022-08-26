package Intermediate.Lecture_1_Intro_To_Problem_Solving;

import java.util.Scanner;

// You are given N positive integers.
// For each given integer A, you have to tell whether it is a perfect number or not.
// A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//Input Format
//        The first line of the input contains a single integer N.
//        Each of the next N lines contains a single integer A.
//In a separate line, print YES if a given integer is perfect, else print NO.
//Input 1:
//2
//4
//6
//Output 1:
//NO
//YES
//Explanation 1:
//        For A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
//        For A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int i = 0; i < N; i++) {
            int A = scn.nextInt();
            int sum = 0;
            for (int j = 1; j < A; j++) {
                if (A % j == 0) {
                    sum = sum + j;
                }
            }
            System.out.println(sum);
            if (sum == A) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

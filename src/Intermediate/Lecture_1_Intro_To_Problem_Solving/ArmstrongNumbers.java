package Intermediate.Lecture_1_Intro_To_Problem_Solving;

import java.util.Scanner;

//If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//You are given an integer N you need to print all the Armstrong Numbers between 1 to N.
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            int val = i;
            while (val > 0) {
                int rem = val % 10;
                sum = sum + (rem * rem * rem);
                val = val / 10;
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}

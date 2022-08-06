package Lecture_1_2_3_4;

import java.util.Scanner;

public class PrimeNumberBreakDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        //        Check if n is prime or not
        int i = 2;
        for (; i <= number - 1; i++) {
            if (number % i == 0) {
                break;
            }
        }
//        check value of i
        if (i == number) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}

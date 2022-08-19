package Beginner.Lecture_7_Maths;

import java.util.Scanner;

public class PrimeNumberOptimisation {

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
//        Came out of loop means no such divisor was present
        return true;
    }

    //    Print all numbers between a and b
    public static void printPrimes(int A, int B) {
        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (isPrime(n)) {
//            isPrime(n) return true or false
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
        int A = scn.nextInt();
        int B = scn.nextInt();

        printPrimes(A, B);
    }
}

package Beginner.Lecture_1_2_3_4;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        String op = scn.next();
        int n2 = scn.nextInt();

        switch (op) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "/":
                System.out.println(n1 / n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "%":
                System.out.println(n1 % n2);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}

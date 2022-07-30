package Lecture_6_Funtions;

import java.util.Scanner;

public class VeggieHelperWithReturnType {

    public static void veggieHelper(int qty, String name) {
        System.out.println("Bringing " + qty + " kg's of " + name);
    }

    public static int calculateBalance(int qty, String name, int money) {
        int unit_price = 12;
        int money_left = money - qty * unit_price;
        return money_left;
    }

    //    return float inside int
    public static int getMeAInt() {
        float num = 3.14f;
        return (int) num;
    }

    //    Return Scanner type
    public static Scanner getMeAScanner() {
        Scanner scn = new Scanner(System.in);
        return scn;
    }

    public static void main(String[] args) {
        veggieHelper(10, "Tomato");
        veggieHelper(15, "Kaddu");
        int bal = calculateBalance(7, "Sugar", 1000);
        System.out.println("Balance left " + bal);
    }
}

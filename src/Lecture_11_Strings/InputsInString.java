package Lecture_11_Strings;

import java.util.Scanner;

public class InputsInString {

    public static void readALetter() {
        Scanner scn = new Scanner(System.in);
        String s = scn.next(); //next gives first word from the string
        char letter = s.charAt(0);
        System.out.println(letter);
    }

    public static void example2() {
        Scanner scn = new Scanner(System.in);
        String firstName = scn.next(); //next gives first word from the string
        String lastName = scn.next();
        String line = scn.nextLine();
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(line.strip());
    }

    public static void largestString() {
//        read a number n, and then read n lines
//        Print the largest string out of n strings
//        eg: N = 5
//        apple
//        Mango shake
//        banana
//        Guava juice is good
//        something
//        Output - Guava juice is good
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();

        int largest = 0;
        String largestString = "";

        for (int i = 1; i <= n; i++) {
            String current = scn.nextLine();
            if(current.length() > largest) {
                largest = current.length();
                largestString = current;
            }
        }
        System.out.println("Largest string is  " + largestString);
    }

    public static void main(String[] args) {
        largestString();
    }
}

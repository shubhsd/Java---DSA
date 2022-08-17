package Lecture_11_Strings;

//reverse string
//eg: Hello how are you
//o/p -> olleH woh era uoy

import java.util.Scanner;

public class ReverseStringByEachWord {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        String words[] = line.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            System.out.println(s);
            sb.append(reverse(s));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}

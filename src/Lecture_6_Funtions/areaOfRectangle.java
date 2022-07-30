package Lecture_6_Funtions;

import java.util.Scanner;

public class areaOfRectangle {

    //    Function to calculate area
    public static int area(int l, int b) {
        int area = l * b;
        return area;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int b = scn.nextInt();
        int finalArea = area(l, b);
        System.out.println(finalArea);
    }
}

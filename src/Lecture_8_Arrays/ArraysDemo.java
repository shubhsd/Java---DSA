package Lecture_8_Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
//        1. Hardcoded Array
        int[] marks = {10, 20, 30, 40, 50};
        System.out.println(marks);
        System.out.println(marks.length);
//        Printing array
        System.out.println(marks[1]);
//        Loop through array (0 to n-1(last index))
        for (int i = 0; i <= marks.length - 1; i++) {
            System.out.println("Print Array in loop " + marks[i]);
        }
//        2. User Input array
    }
}

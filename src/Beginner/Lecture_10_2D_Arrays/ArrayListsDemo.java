package Beginner.Lecture_10_2D_Arrays;

import java.util.ArrayList;

public class ArrayListsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(9);
        arr.add(0, 4);
        arr.set(0,6);

//        Print all elements

        for(int i = 0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}

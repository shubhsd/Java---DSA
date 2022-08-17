package Lecture_10_2D_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDArrayLists {
    public static void main(String[] args) {
//        ArrayList<Integer> arr1D = new ArrayList<>();
//        We can also initialise our array list with some items
        ArrayList<Integer> arr1D = new ArrayList<>(Arrays.asList(1, 2, 3));
//        Here each object is an integer object for now
        arr1D.add(5);
        arr1D.add(9);
        arr1D.add(6);
        System.out.println(arr1D);

//        2D arraylist

        ArrayList<ArrayList<Integer>> arr2D = new ArrayList<>();
//        Create rows and add them
        ArrayList<Integer> row0 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(17);
        row1.add(18);
        row1.add(19);
        row1.add(20);
        row1.add(21);
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(7, 8, 9));

//        add these rows to 2D arraylist
        arr2D.add(row0);
        arr2D.add(row1);
        arr2D.add(row2);
//        Add something at 2nd index of any particular row eg: 0th row
        arr2D.get(0).add(2, 5);
        arr2D.get(0).add(100); //This will add at 100 as index is not specified

//        add any particular row at some index
        arr2D.add(1, row2);
        System.out.println(arr2D);

//        Iterate over each row

        for (int i = 0; i < arr2D.size(); i++) {
            System.out.println(arr2D.get(i));
        }

//        For iterating over individual elements
        System.out.println("------------------------------");
        for (int i = 0; i < arr2D.size(); i++) {
            for (int j = 0; j < arr2D.get(i).size(); j++) {
                System.out.print(arr2D.get(i).get(j) + " , ");
//                Means, inside this 2D arraylist give me the ith row and jth column
            }
            System.out.println();
        }
    }
}

package Lecture_10_2D_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArraylistsInputs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<ArrayList<String>> arr2D = new ArrayList<>();
        int rows = scn.nextInt();
        for (int i = 0; i < rows; i++) {
            ArrayList<String> StringList = new ArrayList<>();
            int cols = scn.nextInt();
            for (int j = 0; j < cols; j++) {
                String s = scn.next();
                StringList.add(s);
            }
            arr2D.add(StringList);
        }

        for (int i = 0; i < arr2D.size(); i++) {
            for (int j = 0; j < arr2D.get(i).size(); j++) {
                System.out.print(arr2D.get(i).get(j) + " , ");
            }
            System.out.println();
        }
    }
}

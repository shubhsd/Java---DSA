package Intermediate.Lecture_2_Intro_To_Arrays;

//Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.
//He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible, then return -1.
// A = [2, 4, 3, 1, 5]
//         B = 3
//
//         Example Output
//         Output 1:
//
//         2
//         We need to remove 4 and 5 to make 3 the biggest element.

import java.util.Scanner;

public class RemoveMaximumElement {

    public static int solve(int[] A, int B) {
        int n = A.length;
        int[] anotherArray = new int[n- 1];
        int count = 0;
        int found = 0;
        for(int i = 0; i<n; i++) {
            if(A[i] == B) {
                found++;
                break;
            }
        }
        if(found > 0) {
            for(int i = 0, k=0; i<n; i++) {
                if(A[i] > B) {
                    anotherArray[k++] = A[i];
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] A = {2, 4, 3, 1, 5};
        System.out.println(solve(A, 3));
    }
}

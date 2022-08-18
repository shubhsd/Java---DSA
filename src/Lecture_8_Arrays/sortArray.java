package Lecture_8_Arrays;

import java.util.Arrays;

public class sortArray {

    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 9, 8, 6, 4, 3, 2};
        Arrays.sort(arr);
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}

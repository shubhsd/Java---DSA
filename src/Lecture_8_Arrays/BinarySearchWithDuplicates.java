package Lecture_8_Arrays;

public class BinarySearchWithDuplicates {
//Find first occurence of given element
    public static int binarySearch(int[] arr, int element) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int ans = -1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
//            compare the mid
            if (arr[mid] > element) {
                endIndex = mid - 1;
            } else if (arr[mid] == element) {
                ans = mid;
                endIndex = mid - 1; //This means even if you found the occurence, go left to find other possible occurences
            } else {
                startIndex = mid + 1;
            }
        }
//        after the loop is over, ans stores the first occurrence
        return ans; //ans would be -1 if element is not present
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 2, 15, 20, 23, 26, 30}; //sorted array
        int element = 2;
        System.out.println(binarySearch(arr, element));
    }
}

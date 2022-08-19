package Beginner.Lecture_8_Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int element) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
//      Stop while loop when start becomes greater than end
//      which means that loop will keep on running till startIndex <= endIndex
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
//            compare the mid
            if (arr[mid] > element) {
                endIndex = mid - 1;
            } else if (arr[mid] == element) {
                return mid;
            } else {
                startIndex = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 9, 11, 15, 20, 23, 26, 30}; //sorted array
        int element = 7;
        System.out.println(binarySearch(arr, element));
    }
}

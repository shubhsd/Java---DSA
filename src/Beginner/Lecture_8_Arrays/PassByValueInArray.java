package Beginner.Lecture_8_Arrays;

import java.util.Arrays;

public class PassByValueInArray {

    public static void pesaDouble(int[] money) {
        for (int i = 0; i < money.length; i++) {
            money[i] = 2 * money[i];
        }
    }

    public static void main(String[] args) {
        int[] friends_money = {100, 200, 300};
        pesaDouble(friends_money);
        System.out.println(Arrays.toString(friends_money));
    }
}

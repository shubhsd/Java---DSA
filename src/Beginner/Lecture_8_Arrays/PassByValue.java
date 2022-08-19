package Beginner.Lecture_8_Arrays;

public class PassByValue {

    public static void paisaDouble(int money) {
        money = 2 * money;
        System.out.println("Money after doubling is " + money);
    }

    public static void main(String[] args) {
        int money = 100;
        System.out.println("Money before doubling " + money);
        paisaDouble(money);
        System.out.println("Money after doubling " + money);
    }
}

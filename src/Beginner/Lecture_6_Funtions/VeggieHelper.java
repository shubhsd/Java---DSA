package Beginner.Lecture_6_Funtions;

public class VeggieHelper {

    public static void veggieHelper(int qty, String name) {
        System.out.println("Bringing " + qty + " kg's of " + name);
    }

    public static void main(String[] args) {
        veggieHelper(10, "Tomato");
        veggieHelper(15, "Kaddu");
    }
}

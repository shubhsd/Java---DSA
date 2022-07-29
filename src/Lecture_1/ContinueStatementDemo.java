package Lecture_1;

public class ContinueStatementDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " before");
            if (i == 7) {
                i = i + 1;
                continue;
            }
            i = i + 2;
        }
    }
}

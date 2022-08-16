package Lecture_11_Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
//         fixed size
        char[] arr = new char[20];
//        more dynamic and more powerful
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(1, "iii"); 
        System.out.println(sb);
    }
}

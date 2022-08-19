package Beginner.Lecture_11_Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
//         fixed size
        char[] arr = new char[20];
//        more dynamic and more powerful
        StringBuilder sb = new StringBuilder("Hello");
//        Constraints : N<=1000
        sb.ensureCapacity(1000); //Saves time
        sb.insert(1, "iii");
        sb.append("world");
        sb.insert(1, "dasjhdjsgahdghuwyqt378423jsa");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);

//        Convert string builder to string
        System.out.println(sb.toString());

//        String functions => don't modify the string
//        String builder functions => modify the underlying character array
//        Character array =>It's not dynamic, have to write own logics
//        arrayList => dynamic array of objects (strings/string builder
    }
}

package Beginner.Lecture_5_Pattern_Problems;

//A
//BB
//CCC
//DDDD
public class pattern11_Alphabet {
    public static void main(String[] args) {
        int n = 5;
        char letter = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(letter);
            }
            letter = (char) (letter+ 1);
            System.out.println();
        }
    }
}

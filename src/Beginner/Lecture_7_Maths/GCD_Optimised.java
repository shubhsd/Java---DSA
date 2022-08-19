package Beginner.Lecture_7_Maths;

public class GCD_Optimised {
    public static void main(String[] args) {
        int A = 36;
        int B = 92;
        int A_, B_;

        while (A > 0) {
            A_ = B % A;
            B_ = A;

//            Update
            A = A_;
            B = B_;
        }
        System.out.println(B);
    }
}

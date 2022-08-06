package Lecture_9_Maths_Remedial;

public class BirthdayParadoxProblem {
    public static void main(String[] args) {
        int people = 1;
        double confidence = 1; //1 means 100%

//        Confidence means probability

//        Solving for different birthday
//        differentBirthday + sameBirthday = 1
//        differentBirthday = 1 - sameBirthday

        double sameBirthday = 0.50; //Given i.e confidence we want to be 50%
        double differentBirthday = 1 - sameBirthday;
        double numerator = 365;
        double denominator = 365;

        while (confidence >= differentBirthday) {
//            people will be added, then only confidence value will change
            System.out.println("People " + people + " Confidence " + confidence);
            confidence = confidence * (numerator - people) / denominator;
            people++;
        }
        System.out.println(people);
    }
}

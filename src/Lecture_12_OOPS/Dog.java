package Lecture_12_OOPS;

public class Dog {
    //    data members
    int age;
    String name;
    String breed;


//    Special function => Constructor => name same as classname
//    It is called automatically when we create object of this class.
    Dog() {
        System.out.println("Making a dog object");
    }

    //    Methods
    void introduce() {
        System.out.println("Name is " + name);
        if (age > 0) {
            System.out.println("age is " + age);
        }
        System.out.println("Breed is " + breed);
    }

    void bark() {
        if (age < 3) {
            System.out.println("Whup Whup");
        } else {
            System.out.println("Whoop Whoop");
        }
    }
}

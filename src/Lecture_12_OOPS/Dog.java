package Lecture_12_OOPS;

public class Dog {
    //    data members
    private int age;
    String name;
    String breed;


    //    Special function => Constructor => name same as classname
//    It is called automatically when we create object of this class.
    Dog() {
        age = 1; //default value to class data when constructor is called
        System.out.println("Making a dog object");
    }

//    Parameterised construcutor

    Dog(int dogAge, String dogName, String dogBreed) {
        System.out.println("Calling a parametrised constructor");
        age = dogAge;
        name = dogName;
        breed = dogBreed;
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

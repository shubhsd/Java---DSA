package Lecture_12_OOPS;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Bruno";
//        System.out.println(d1.age); //By default 0
        System.out.println(d1.name);
        System.out.println(d1.breed); // By default null
        System.out.println("---------------");
        d1.introduce();

        System.out.println("---------------");
        Dog d2 = new Dog();
//        d2.age = 1; //Age will not be accessible now as it was made private variable
        d2.breed = "Labrador";
        d2.introduce();
        d2.bark();

        System.out.println("---------------");
        Dog d3 = new Dog(7, "cody", "Shepherd");
        d3.introduce();
    }
}

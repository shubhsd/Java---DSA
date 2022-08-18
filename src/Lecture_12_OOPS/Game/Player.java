package Lecture_12_OOPS.Game;

public class Player {
    String name;
    int number;

//    Creating parameterised constructor
public Player(String playerName) {
        name = playerName;
    }
    public void makeGuess() {
        number = (int) (Math.random() * 10);
        System.out.println(name + " guessed the number " + number);
    }
}

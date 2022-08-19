package Beginner.Lecture_12_OOPS.Game;

public class Game {
    int expectedGuess;
    Player p1, p2, p3; //Player object was created

    Game(String name1, String name2, String name3) {
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    boolean checkWinner() {
        if (p1.number == expectedGuess) {
            System.out.println(p1.name + " wins");
            return true;
        } else if (p2.number == expectedGuess) {
            System.out.println(p2.name + " wins");
            return true;
        } else if (p3.number == expectedGuess) {
            System.out.println(p3.name + " wins");
            return true;
        }
        return false;
    }

    void launch() {
        expectedGuess = (int) (10 * Math.random());
//        Now we will ask every player to guess the number
        while (true) {
            System.out.println("Number to guess " + expectedGuess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();
//        Validate the guess
            boolean gameOver = checkWinner();
            if (gameOver) {
                break;
            }
//            Update the guess and play again
            expectedGuess = (int) (10 * Math.random());
        }
    }
}

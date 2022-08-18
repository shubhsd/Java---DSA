package Lecture_12_OOPS.Game;

public class GameTest {
    public static void main(String[] args) {

//        We will create Game here and with names of each player passed instead of creating players here like
//        Player p1 = new Player("Shubham");
//        p1.name = "Shubham";
//        Player p2 = new Player("Prateek");
//        p1.makeGuess();
//        p2.makeGuess();

        Game g = new Game("Shubham", "Prateek", "Narang");
        g.launch();
    }
}

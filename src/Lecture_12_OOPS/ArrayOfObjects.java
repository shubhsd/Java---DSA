package Lecture_12_OOPS;

import Lecture_12_OOPS.Game.Player;

import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Player players[] = new Player[5];
        for (int i = 0; i < 5; i++) {
            Scanner scn = new Scanner(System.in);
            String name = scn.nextLine();
//            Allocates memory for ith player
            players[i] = new Player(name);
            players[i].makeGuess();
        }
    }
}

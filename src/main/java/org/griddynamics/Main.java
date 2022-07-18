package org.griddynamics;

import org.griddynamics.tic_tac_toe.Game;

/*
 * Program entrance class
 */
public class Main {

    /*
     * Program entrance method
     */
    public static void main(String[] args) {
        // Creating game
        //Game tictactoe = Game.create2Human3x3();
        Game tictactoe = Game.createHumanEasy3x3();

        // Running
        tictactoe.run();
    }
}
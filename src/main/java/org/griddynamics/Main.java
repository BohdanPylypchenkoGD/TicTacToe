package org.griddynamics;

import org.griddynamics.tic_tac_toe.ui.GameTUI;

/*
 * Program entrance class
 */
public class Main {

    /*
     * Program entrance method
     */
    public static void main(String[] args) {
        // Creating game
        //Game tictactoe = Game.createHumanEasy3x3();

        // Running
        //tictactoe.run();
        GameTUI.cycleGameUI();
    }
}
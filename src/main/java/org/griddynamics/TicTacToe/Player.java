package org.griddynamics.TicTacToe;

import java.util.LinkedList;

/*
 * Abstract player class
 * All players are inherited from this class
 */
abstract class Player {

    // Char to represent on cell/grid
    private final char sign;

    // Occupied cells
    private final LinkedList<Cell> occupied;

    /*
     * Default constructor
     */
    Player(char sign) {
        this.sign = sign;
        this.occupied = new LinkedList<>();
    }

    /*
     * Preoccupied cells constructor
     */
    Player(char sign, LinkedList<Cell> occupied) {
        this.sign = sign;
        this.occupied = occupied;
    }

    /*
     * Sign getter
     */
    char getSign() {
        return sign;
    }

    /*
     * Returns true if move has been made successfully
     * Else false
     */
    boolean makeMove(int x, int y) {
        return false;
    }

    /*
     * Checks if player has won
     */
    boolean isWinner() {
        return false;
    }
}

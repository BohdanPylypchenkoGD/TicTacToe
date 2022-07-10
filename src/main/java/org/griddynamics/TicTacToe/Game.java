package org.griddynamics.TicTacToe;

/*
 * Game class
 * Represents TicTacToe game
 */
public class Game {

    // Players array
    private final Player[] players;

    // Game grid
    private final Grid grid;

    /*
     * Single private constructor
     */
    private Game(Player[] players, Grid grid) {
        this.players = players;
        this.grid = grid;
    }

    /*
     * Public static Game creator
     * (from players signs, grid dimension)
     */
    public static Game createGameFromSignsAndDim(char[] signs, int dimension) {
        return null;
    }

    /*
     * Public static Game creator
     * (from string, which represents initial game state)
     * ('_' is reserved for empty cell)
     */
    public static Game createGameFromStringRepresentation(String gameRepresentation) {
        return null;
    }

    /*
     * Runs game
     * Returns game winner
     */
    public Player run() {
        return null;
    }
}

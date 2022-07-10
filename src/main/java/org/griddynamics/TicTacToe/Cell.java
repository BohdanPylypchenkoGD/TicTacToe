package org.griddynamics.TicTacToe;

class Cell {

    // Game grid
    private final Grid grid;

    // Occupied player
    private Player occupantPlayer;

    // Private coordinates
    private final int x, y;

    /*
     * Free cell constructor
     */
    Cell(Grid grid, int x, int y) {
        this.grid = grid;
        this.x = x;
        this.y = y;
        this.occupantPlayer = null;
    }

    /*
     * Grid getter
     */
    Grid getGrid() {
        return this.grid;
    }

    /*
     * master getter
     */
    Player getOccupantPlayer() {
        return this.occupantPlayer;
    }

    /*
     * x getter
     */
    int getX() {
        return this.x;
    }

    /*
     * y getter
     */
    int getY() {
        return this.y;
    }

    /*
     * Occupies cell by player
     */
    boolean occupyByPlayer(Player player) {
        // Check if already occupied
        if (this.occupantPlayer == null) {
            return false;
        }

        // Not occupied -> assign, return true
        this.occupantPlayer = player;
        return true;
    }

    /*
     * toString overriding
     */
    @Override
    public String toString() {
        return " " + this.occupantPlayer.getSign();
    }
}

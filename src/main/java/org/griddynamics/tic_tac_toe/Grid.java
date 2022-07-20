package org.griddynamics.tic_tac_toe;

public final class Grid {

    // Cell matrix
    private final Cell[][] cells;

    // Free cell counter
    private int freeCellCounter;

    /*
     * Dimension constructor
     */
    Grid(int dimension) {
        // Initializing matrix
        cells = new Cell[dimension][dimension];

        // Initializing cells
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                cells[i][j] = new Cell(this, i, j);
            }
        }

        // Initializing free cell counter
        freeCellCounter = dimension * dimension;
    }

    /*
     * Dimension getter
     */
    public int getDimension() {
        return this.cells[0].length;
    }

    /*
     * Cell getter
     */
    public Cell getCell(int x, int y) {
        return this.cells[x][y];
    }

    /*
     * Row getter
     */
    public Cell[] getRow(int rowIndex) {
        Cell[] result = new Cell[this.getDimension()];
        for (int i = 0; i < result.length; i++) {
            result[i] = cells[rowIndex][i];
        }
        return result;
    }

    /*
     * Column getter
     */
    public Cell[] getColumn(int columnIndex) {
        Cell[] result = new Cell[this.getDimension()];
        for (int i = 0; i < result.length; i++) {
            result[i] = cells[i][columnIndex];
        }
        return result;
    }

    /*
     * Main diagonal getter
     */
    public Cell[] getMainDiagonal() {
        Cell[] result = new Cell[this.getDimension()];
        for (int i = 0; i < result.length; i++) {
            result[i] = cells[i][i];
        }
        return result;
    }

    /*
     * Additional diagonal getter
     */
    public Cell[] getAdditionalDiagonal() {
        Cell[] result = new Cell[this.getDimension()];
        for (int i = 0; i < result.length; i++) {
            result[i] = cells[this.getDimension() - 1 - i][i];
        }
        return result;
    }

    /*
     * Reduces grid's free cell count by one
     */
    void reduceFreeCellCount() {
        this.freeCellCounter--;
    }

    /*
     * Returns true, if there are free
     * (not occupied) cells
     * Otherwise - false
     */
    public boolean isFull() {
        return this.freeCellCounter == 0;
    }
}

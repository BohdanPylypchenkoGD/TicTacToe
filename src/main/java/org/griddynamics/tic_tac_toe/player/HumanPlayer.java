package org.griddynamics.tic_tac_toe.player;

import org.griddynamics.tic_tac_toe.Cell;
import org.griddynamics.tic_tac_toe.Grid;
import org.griddynamics.tic_tac_toe.ui.HumanPlayerTUI;

/*
 * Represents human player
 */
public final class HumanPlayer extends Player {

    /*
     * Default constructor
     */
    public HumanPlayer(Grid grid, char sign) {
        super(grid, sign);
    }

    /*
     * Implementing selectCellToOccupy for HumanPlayer
     */
    @Override
    protected Cell selectFreeCell() {
        // While user does not select free cell
        int[] coords;
        while (true) {
            // Getting coords from user
            coords = HumanPlayerTUI.getCoordsFromUser();

            // Checking coords for being in bounds
            if (!this.areCoordsInBounds(coords)) {
                HumanPlayerTUI.printCoordOutOfBoundError(this.getGrid().getDimension());
                continue;
            }

            // Checking for free
            if (this.getGrid().getCell(coords[0], coords[1]).getOccupantPlayer() == null) {
                // Success -> return
                return this.getGrid().getCell(coords[0], coords[1]);
            } else {
                // Failure -> show warning
                HumanPlayerTUI.printOccupiedCellCaptureWarning();
                continue;
            }
        }
    }

    /*
     * Checks if coords are in bounds
     */
    private boolean areCoordsInBounds(int[] coords) {
        for (int coord : coords) {
            if (coord < 0 || coord >= this.getGrid().getDimension()) {
                return false;
            }
        }
        return true;
    }
}

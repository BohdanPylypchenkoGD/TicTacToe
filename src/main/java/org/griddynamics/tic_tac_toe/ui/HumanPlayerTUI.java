package org.griddynamics.tic_tac_toe.ui;

import java.util.Arrays;
import java.util.Scanner;

/*
 * TUI for HumanPlayer
 */
public final class HumanPlayerTUI {

    // Scanner for stdin
    private static final Scanner scanIn = new Scanner(System.in);

    // Regex to get coords from user
    private static final String COORDS_REGEX = "\\d+ \\d+";

    /*
     * Gets cell coordinates from player
     */
    public static int[] getCoordsFromUser() {
        //scanIn.useDelimiter("\n");
        String buff;
        while (true) {
            // Printing message
            System.out.print("Enter the coordinates: ");

            // Getting input
            buff = scanIn.nextLine();

            // Checking for regex
            if (buff.matches(COORDS_REGEX)) {
                return Arrays.stream(buff.split(" ")).
                              mapToInt(Integer::parseInt).
                              map(e -> e - 1).
                              toArray();
            } else {
                System.out.println("You should enter numbers!");
            }
        }
    }

    /*
     * Shows coord out of bound error
     */
    public static void printCoordOutOfBoundError(int dimension) {
        System.out.printf("Coordinates should be from 1 to %d!\n", dimension);
    }

    /*
     * Shows occupied cell warning
     */
    public static void printOccupiedCellCaptureWarning() {
        System.out.println("This cell is occupied! Choose another one!");
    }
}

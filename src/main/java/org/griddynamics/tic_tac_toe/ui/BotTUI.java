package org.griddynamics.tic_tac_toe.ui;

/*
 * TUI for bots
 */
public final class BotTUI {

    // easy bot move message
    private static final String EASY_BOT_MSG = "Making move level \"%s\"\n";

    /*
     * Prints easy bot make move message
     */
    public static void printEasyBotMakeMoveMessage() {
        System.out.printf(EASY_BOT_MSG, "easy");
    }

    public static void printMiddleBotMakeMoveMessage() {
        System.out.printf(EASY_BOT_MSG, "medium");
    }
}

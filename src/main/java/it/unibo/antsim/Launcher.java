package it.unibo.antsim;

import javafx.application.Application;

/**
 * Entrypoint for the packaged JavaFX application.
 */
public final class Launcher {
    private Launcher() {
    }

    /**
     * Starts the application using JavaFX's launch mechanism.
     *
     * @param args startup arguments
     */
    public static void main(final String[] args) {
        Application.launch(Main.class, args);
    }
}

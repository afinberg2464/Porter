package com.speechrec;

import java.io.IOException;

import javafx.fxml.FXML;

/**
 * Created by Andrew Finberg 2019/11/17
 * This is the class for the Welcome screen
 */
public class PrimaryController {

    /**
     * This method should change the current screen to the Action screen
     *
     * @throws IOException throw exception
     */
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    /**
     * The quitProgram method should quit the program
     * with status code '0'
     */
    public void quitProgram() {
        System.exit(0);
    }
}

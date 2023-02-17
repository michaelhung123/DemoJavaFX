package com.myprojectfx.projectjavafx;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int b = 10;
        if (b > 0)
        App.setRoot("secondary");
    }
}

package wk3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private void handleFirstClick(ActionEvent e) {
        label.setText("ghjk");
    }
}

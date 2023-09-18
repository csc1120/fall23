package wk4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;

import java.util.Optional;

import static javafx.scene.control.Alert.AlertType.INFORMATION;
import static javafx.scene.control.Alert.AlertType.ERROR;

public class PasswordController {
    @FXML
    private PasswordField password;

    @FXML
    private void checkPassword(ActionEvent actionEvent) {
        int length = password.getText().length();
        if (length > 4) {
            Alert alert = new Alert(INFORMATION, "Congrats on that sweet password.");
            Optional<ButtonType> response = alert.showAndWait();
            if (response.isPresent()) {
                System.out.println("Thanks for acknowledging my hard work.");
            }
        } else {
            Alert alert = new Alert(ERROR, "Make that thing longer or you will likely be hacked.");
            Optional<ButtonType> response = alert.showAndWait();
            if (response.isPresent()) {
                System.out.println("Thanks for acknowledging your failure.");
            }

        }
    }
}

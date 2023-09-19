package wk4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextInputDialog;

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
            TextInputDialog dialog = new TextInputDialog();
            dialog.setTitle("Password in the clear prompt");
            dialog.setHeaderText("Enter a longer password");
            Optional<String> response = dialog.showAndWait();
            response.ifPresent(pw -> password.setText(pw));
            System.out.println("Lukas");
        }
    }
}

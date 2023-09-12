package wk3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class VigorHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        Button c = (Button) actionEvent.getSource();
        if (c.getText().substring(0, 1).equals("c")) {
            c.setText(c.getText() + ".");
        } else {
            c.setText(c.getText() + ":");
        }
    }
}

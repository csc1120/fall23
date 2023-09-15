package wk3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NotAsDumb extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("notAsDumb.fxml"));
        Pane root = (Pane) loader.load();
        stage.setScene(new Scene(root));
        stage.show();
    }
}

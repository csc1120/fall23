package wk2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class MyFirstGUI extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello World!");
        label.setFont(new Font(40));
        Pane pane = new VBox();
        pane.getChildren().add(label);
        pane.getChildren().add(new Button("Pick me"));
        Scene scene = new Scene(pane, 200, 400);
        stage.setTitle("Welcome to JavaFX!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

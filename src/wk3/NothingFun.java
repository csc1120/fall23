package wk3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class NothingFun extends Application {
    private Label a;
    @Override
    public void start(Stage stage) {
        a = new Label("only words I can spell like Happy");
        Button b = new Button("click me with vigor");
        //b.setOnAction(this);
        EventHandler<ActionEvent> handler = new VigorHandler();
        b.setOnAction(new BHandler());
        Button c = new Button("d");
        c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                a.setText("only words I can spell like Happy");
            }
        });
        Pane root = new VBox();
        root.getChildren().addAll(a, b, c);

        stage.setScene(new Scene(root));
        stage.show();
    }

    private class BHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            a.setText("not so happy");
            System.out.println("wow, thanks");
        }
    }
}

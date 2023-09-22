package wk4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class Driver extends Application {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 8, 7, 2, 1, 9, 8);
        Stream<Integer> numbers2 = Stream.of(3, 8, 7, 2, 1, 9, 8);
        List<String> words = List.of("happy", "discussion", "LoTiON", "stops", "locomotion");
        List<Control> controls = List.of(new Button("Help"), new Label("Help"),
                new Separator(), new Separator(), new TextField());
        List<Label> labels = List.of(new Label("Username"), new Label("Password"),
                new Label("First name"), new Label("Last name"));
        System.out.println(getEvens(numbers.stream()));
        System.out.println(countTions(words.stream()));
        System.out.println(countSeparators(controls.stream()));
        System.out.println(getLabeled(controls.stream()));
        System.out.println(getLengthStats(labels.stream()));
        launch();
    }

    public static List<Integer> getEvens(Stream<Integer> numbers) {
        return numbers.filter(num -> num % 2 == 0).toList();
    }

    public static int countTions(Stream<String> words) {
        return (int) words.map(word -> word.toLowerCase())
                .filter(word -> word .endsWith("tion"))
                .count();
        //return (int) words.filter(word -> word.toLowerCase().endsWith("tion")).count();
    }

    public static int countSeparators(Stream<Control> controls) {
        return (int) controls.filter(control -> control instanceof Separator).count();
    }

    public static List<Labeled> getLabeled(Stream<Control> controls) {
        return controls.filter(control -> control instanceof Labeled)
                .map(control -> (Labeled) control)
                .toList();
    }

    public static int countHelp(Stream<Control> controls) {
        return 0;
    }

    public static List<Integer> getLengths(Stream<Label> labels) {
        return labels.map(label -> label.getText().length()).toList();
    }

    public static IntSummaryStatistics getLengthStats(Stream<Label> labels) {
        return labels.mapToInt(label -> label.getText().length()).summaryStatistics();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Platform.exit();
    }
}

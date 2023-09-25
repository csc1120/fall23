package wk5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamOfFile {
    public static void main(String[] args) throws IOException {
        System.out.println("Monday: " + Files.lines(Path.of("data/sections20230829.csv"))
                        .map(line -> line.split(","))
                        .map(columns -> columns[2])
                        .filter(column -> column.equals("M"))
                .count());
    }
}

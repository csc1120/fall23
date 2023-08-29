package wk1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter filename");
        String filename = in.nextLine();
        Path path = Path.of("data/" + filename);
        try (Scanner fin = new Scanner(path)) {
            System.out.println(fin.nextLine());
        } catch (IOException e) {
            System.err.println("Trouble reading file");
        }
    }
}

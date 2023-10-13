package wk7;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<String> words = new wk6.LinkedList<>();
        words.add("Wednesday");
        words.add("Wendy's");
        words.add("elephant");
        words.add("rain");
        words.forEach(e -> System.out.println(e));
        for (String word : words) {
            System.out.println(word);
        }
    }
}

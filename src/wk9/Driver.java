package wk9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Driver {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "cheese", "orange", "ryan", "stuff" );
        System.out.println(binarySearch(words, "yogurt"));
        System.out.println(binarySearch(words, "orange"));
        System.out.println(binarySearch(words, "cheese"));
        System.out.println(binarySearch(words, "stuff"));
        System.out.println(binarySearch(words, "ryan"));
    }

    // Don't put nulls in this thing, or I'll misbehave
    public static boolean binarySearch(List<String> list, String target) {
        int start = 0;
        int end = list.size();
        int middle = end / 2;
        boolean found = false;
        //while (middle != start || middle != end) {
        while (start < end && !found) {
            String middleElement = list.get(middle);
            int compare = middleElement.compareTo(target);
            found = compare == 0;
            if (compare < 0) {
                start = middle + 1;
            } else if (compare > 0) {
                end = middle;
            }
            middle = (start + end) / 2;
        }
        return found;
    }
}

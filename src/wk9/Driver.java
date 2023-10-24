package wk9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Driver {
    public static void main(String[] args) {
//        List<String> words = List.of("apple", "cheese", "orange", "ryan", "stuff" );
//        System.out.println(binarySearch(words, "yogurt"));
//        System.out.println(binarySearch(words, "orange"));
//        System.out.println(binarySearch(words, "cheese"));
//        System.out.println(binarySearch(words, "stuff"));
//        System.out.println(binarySearch(words, "ryan"));
        System.out.println(factorial(5));
        System.out.println(factorialRec(5));
    }

    public static long factorialRec(int x) {
        long factorial = 1;
        if (x > 1) {
            factorial = x * factorialRec(x - 1);
        }
        return factorial;
    }

    // Don't put nulls in this thing, or I'll misbehave
    public static <T> boolean binarySearch(List<? extends Comparable<? super T>> list, T target) {
        int start = 0;
        int end = list.size();
        int middle = end / 2;
        boolean found = false;
        //while (middle != start || middle != end) {
        while (start < end && !found) {
            Comparable middleElement = list.get(middle);
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

    public static long factorial(int x) {
        long factorial = 1;
        for (int i = 2; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }
}














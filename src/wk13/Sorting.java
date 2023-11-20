package wk13;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Sorting {
    public static final int N = 100;
    public static final Random generator = new Random();

    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            nums.add(generator.nextInt(0, 500));
        }

        System.out.println(nums);
        System.out.println(benchmark(nums, list -> Collections.sort(list)));
        System.out.println(nums);

    }

    public static long benchmark(List<Integer> list, Sorter<Integer> sorter) {
        long start = System.nanoTime();
        sorter.sort(list);
        return System.nanoTime() - start;
    }

    public static <E> void selectionSort(List<? extends Comparable<E>> list) {
        // TODO
    }

    public static <E> void insertionSort(List<? extends Comparable<E>> list) {
        // TODO
    }
}

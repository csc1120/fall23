package wk11;

import java.util.LinkedList;
import java.util.List;

// Load factor = size / capacity
public class HashTable<E> {
    private List<E>[] table;
    public static final int DEFAULT_CAPACITY = 19;
    private int size;

    public HashTable() {
        table = new LinkedList<>[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(E element) {
        return false;
    }
}

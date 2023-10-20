package wk8;

import java.util.NoSuchElementException;

public class CircularQueue<E> implements PureQueue<E> {
    private final Object[] buffer;
    public static final int DEFAULT_CAPACITY = 5;
    private int frontIndex;
    private int backIndex;
    private boolean isEmpty;

    public CircularQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CircularQueue(int capacity) {
        buffer = new Object[capacity];
        frontIndex = 0;
        backIndex = 0;
        isEmpty = true;
    }

    @Override
    public void offer(E item) {
        if (backIndex == frontIndex && !isEmpty) {
            throw new IllegalStateException("Queue is already full");
        }
        buffer[backIndex] = item;
        backIndex = (backIndex + 1) % buffer.length;
        isEmpty = false;
    }

    @Override
    public E poll() {
        if (isEmpty) {
            throw new NoSuchElementException("No elements left");
        }
        E guyGoByeBye = (E) buffer[frontIndex];
        buffer[frontIndex] = null;
        frontIndex = (frontIndex + 1) % buffer.length;
        isEmpty = frontIndex == backIndex;
        return guyGoByeBye;
    }

    @Override
    public E peek() {
        if (isEmpty) {
            throw new NoSuchElementException("No elements left");
        }
        return (E) buffer[frontIndex];
    }

    @Override
    public int size() {
        return (backIndex + buffer.length - frontIndex) % buffer.length;
    }
}

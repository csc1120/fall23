package wk6;

import java.util.*;

public class LinkedList<E> implements List<E> {
    protected Node<E> head;
    private int size;

    protected static class Node<E> {
        public E value;
        public Node<E> next;

        private Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        private Node(E value) {
            this(value, null);
        }
    }

    public LinkedList() {
        head = null;
        size = 0;
    }

    private void addToFront(E element) {
        head = new Node<>(element, head);
        size++;
    }

    @Override
    public boolean add(E element) {
        if (head == null) {
            addToFront(element);
        } else {
            Node<E> walker = head;
            while (walker.next != null) {
                walker = walker.next;
            }
            walker.next = new Node<>(element);
            size++;
        }
        return true;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean contains(Object target) {
        return indexOf(target) >= 0;
    }

    @Override
    public E get(int index) {
        boundsCheck(index);
        Node<E> walker = head;
        for (int i = 0; i < index; i++) {
            walker = walker.next;
        }
        return walker.value;
    }

    @Override
    public int indexOf(Object target) {
        int indexFound = -1;
        boolean found = false;
        Node<E> walker = head;
        while (walker != null && !found) {
            indexFound++;
            found = Objects.equals(target, walker.value);
            walker = walker.next;
        }
        if (!found) {
            indexFound = -1;
        }
        return indexFound;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean remove(Object target) {
        boolean removed = false;
        int index = indexOf(target);
        if (index >= 0) {
            removed = true;
            remove(index);
        }
        return removed;
    }

    @Override
    public E remove(int index) {
        boundsCheck(index);
        E removedThing;
        if (index == 0) {
            removedThing = head.value;
            head = head.next;
        } else {
            Node<E> walker = head;
            for (int i = 0; i < index - 1; i++) {
                walker = walker.next;
            }
            removedThing = walker.next.value;
            walker.next = walker.next.next;
        }
        return removedThing;
    }

    private void boundsCheck(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + " on size: " + size());
        }
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size()];
        Node<E> walker = head;
        for (int i = 0; i < size(); i++) {
            result[i] = walker.value;
            walker = walker.next;
        }
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Did not implement");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Did not implement");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Did not implement");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Did not implement");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Did not implement");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Did not implement");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Did not implement");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Did not implement");
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Did not implement");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Did not implement");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Did not implement");
    }
}
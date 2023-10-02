package wk6;

import java.util.*;

public class LinkedList<E> implements List<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        E value;
        Node<E> next;

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
    }

    @Override
    public boolean contains(Object target) {
        return indexOf(target) >= 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object target) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(Object target) {
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}

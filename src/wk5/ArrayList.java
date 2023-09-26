package wk5;

import java.util.*;

public class ArrayList<E> implements List<E> {
    private Object[] data;

    public ArrayList() {
        data = new Object[0];
    }

    @Override
    public boolean add(E element) {
        Object[] biggerGuy = new Object[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            biggerGuy[i] = data[i];
        }
        biggerGuy[data.length] = element;
        data = biggerGuy;
        return true;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public void clear() {
        data = new Object[0];
    }

    @Override
    public boolean contains(Object target) {
        return indexOf(target) >= 0;
    }

    @Override
    public E get(int index) {
        return (E) data[index];
    }

    @Override
    public int indexOf(Object target) {
        int index = -1;
        for(int i = 0; index == -1 && i < size(); i++) {
            if (Objects.equals(target, data[i])) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean isEmpty() {
        return data.length == 0;
    }

    @Override
    public boolean remove(Object o) {
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
        return data.length;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
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

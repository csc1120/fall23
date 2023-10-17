package wk8;

import java.util.List;

public class Stack<E> implements PureStack<E> {
    private List<E> theWorker;

    public Stack(List<E> list) {
        theWorker = list;
        theWorker.clear();
    }

    @Override
    public void push(E item) {
        theWorker.add(0, item);
    }

    @Override
    public E pop() {
        return theWorker.remove(0);
    }

    @Override
    public E peek() {
        return theWorker.get(0);
    }

    @Override
    public int size() {
        return theWorker.size();
    }
}

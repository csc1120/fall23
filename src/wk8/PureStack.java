package wk8;

public interface PureStack<E> {
    void push(E item);
    E pop();
    E peek();
    int size();
}

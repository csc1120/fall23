package wk10;

import java.util.function.Consumer;

public class BinaryTree<E> {

    public BinaryTree() {

    }

    public BinaryTree(E element) {

    }

    public BinaryTree(E element, BinaryTree<E> left, BinaryTree<E> right) {

    }

    public BinaryTree<E> getLeftSubtree() {
        return null;
    }

    public BinaryTree<E> getRightSubtree() {
        return null;
    }

    public boolean isLeaf() {
        return false;
    }

    public void preOrderTraverse(Consumer<E> consumer) {

    }

    @Override
    public String toString() {
        return null;
    }
}

package wk10;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

public class BinaryTree<E> {

    private E value;
    private BinaryTree<E> left;
    private BinaryTree<E> right;

    public BinaryTree() {

    }

    public BinaryTree(E element) {
        this(element, null, null);
    }

    public BinaryTree(E element, BinaryTree<E> left, BinaryTree<E> right) {
        value = element;
        this.left = left;
        this.right = right;
    }

    public BinaryTree<E> getLeftSubtree() {
        return left;
    }

    public BinaryTree<E> getRightSubtree() {
        return right;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public void preOrderTraverse(Consumer<E> consumer) {
        preOrderTraverse(this, consumer);
    }

    private static <E> void preOrderTraverse(BinaryTree<E> root, Consumer<E> consumer) {
        consumer.accept(root.value);
        if (root.left != null) {
            preOrderTraverse(root.left, consumer);
        }
        if (root.right != null) {
            preOrderTraverse(root.right, consumer);
        }
    }

    @Override
    public String toString() {
        OutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        preOrderTraverse(value -> ps.print(value + ", "));
        String result = out.toString();
        return '[' + result.substring(0, result.length() - 2) + ']';
    }
}

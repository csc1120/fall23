package wk14;

public class BinaryTree<E> {
    private E value;
    private BinaryTree<E> parent;
    private BinaryTree<E> leftChild;
    private BinaryTree<E> rightChild;

    public BinaryTree(E value) {
        this(value, null, null);
    }

    public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right) {
        this.value = value;
        leftChild = left;
        if (left != null) {
            left.parent = this;
        }
        rightChild = right;
        if (right != null) {
            right.parent = this;
        }
        parent = null;
    }

    public int height() {
        return height(this);
    }

    public int size() {
        return height(this);
    }

    private static <E> int height(BinaryTree<E> tree) {
        return tree == null ? 0 : 1 + Math.max(height(tree.leftChild), height(tree.rightChild));
    }

    private static <E> int size(BinaryTree<E> tree) {
        return tree == null ? 0 : 1 + size(tree.leftChild) + size(tree.rightChild);
    }

}

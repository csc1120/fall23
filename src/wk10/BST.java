package wk10;

public class BST<E extends Comparable<? super E>> {
    private static final class Node<E> {
        Node<E> left;
        Node<E> right;
        E value;

        Node(E value, Node<E> left, Node<E> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private Node<E> root;

    public boolean contains(E target) {
        return contains(root, target);
    }

    private boolean contains(Node<E> subroot, E target) {
        boolean found = false;
        if (subroot != null) {
            int compare = subroot.value.compareTo(target);
        }
        return found;
    }

}

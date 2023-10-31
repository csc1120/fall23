package wk10;

import java.util.function.Consumer;

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

        Node(E value) {
            this(value, null, null);
        }
    }

    private Node<E> root;

    public BST() {
        root = null;
    }

    public void preOrder(Consumer<E> doIt) {
        preOrder(root, doIt);
    }

    private void preOrder(Node<E> subroot, Consumer<E> doIt) {
        if (subroot != null) {
            doIt.accept(subroot.value);
            preOrder(subroot.left, doIt);
            preOrder(subroot.right, doIt);
        }
    }

    public void inOrder(Consumer<E> doIt) {
        inOrder(root, doIt);
    }

    private void inOrder(Node<E> subroot, Consumer<E> doIt) {
        if (subroot != null) {
            inOrder(subroot.left, doIt);
            doIt.accept(subroot.value);
            inOrder(subroot.right, doIt);
        }
    }

    public void postOrder(Consumer<E> doIt) {
        postOrder(root, doIt);
    }

    private void postOrder(Node<E> subroot, Consumer<E> doIt) {
        if (subroot != null) {
            postOrder(subroot.left, doIt);
            postOrder(subroot.right, doIt);
            doIt.accept(subroot.value);
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean add(E element) {
        boolean added = false;
        if (isEmpty()) {
            root = new Node<>(element);
            added = true;
        } else {
            added = add(root, element);
        }
        return added;
    }

    private boolean add(Node<E> subroot, E element) {
        boolean added = false;
        int compare = subroot.value.compareTo(element);
        if (compare < 0) {
           if (subroot.right == null) {
               subroot.right = new Node<>(element);
           } else {
               added = add(subroot.right, element);
           }
        } else if (compare > 0) {
            if (subroot.left == null) {
                subroot.left = new Node<>(element);
            } else {
                added = add(subroot.left, element);
            }
        }
        return added;
    }

    public boolean contains(E target) {
        return contains(root, target);
    }

    private boolean contains(Node<E> subroot, E target) {
        boolean found = false;
        int compare;
        if (subroot != null) {
            compare = subroot.value.compareTo(target);
            if (compare == 0) {
                found = true;
            } else if (compare < 0) {
                found = contains(subroot.right, target);
            } else {
                found = contains(subroot.left, target);
            }
        }
        return found;
    }

    public int height() {
        return height(root);
    }

    private int height(Node<E> subroot) {
        int count = 0;
        if (subroot != null) {
            count = 1 + Math.max(height(subroot.left), height(subroot.right));
        }
        return count;
    }

    public int size() {
        return size(root);
    }

    private int size(Node<E> subroot) {
        int count = 0;
        if (subroot != null) {
            count = 1 + size(subroot.left) + size(subroot.right);
        }
        return count;
    }

}

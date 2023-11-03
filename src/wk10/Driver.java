package wk10;

import java.util.function.Consumer;

public class Driver {
    public static void main(String[] args) {
        BinaryTree<String> tree = new BinaryTree<>("opposites",
                new BinaryTree<>("happy"),
                new BinaryTree<>("sad"));
        System.out.println(tree);
    }

    public static void main2(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.add(5);
        bst.add(4);
        bst.add(0);
        bst.add(17);
        bst.add(38);
        bst.add(-9);
//        System.out.println(bst.contains(3));
//        System.out.println(bst.contains(-9));
//        System.out.println(bst.size());
//        System.out.println(bst.height());
        bst.postOrder(System.out::println);
    }
}

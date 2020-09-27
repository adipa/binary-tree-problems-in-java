package src.BST;

import src.BSTProblems.*;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(32);
        bt.insert(9);
        bt.insert(-12);
        bt.insert(3);
        bt.insert(87);
        bt.insert(43);
        bt.insert(-59);
        bt.insert(-4);
        bt.insert(66);

        Inorder in = new Inorder();
        System.out.print("Inorder Traversal:\n");
        in.inorderIterative(bt.root);

        Preorder pre = new Preorder();
        System.out.print("\nPreorder Traversal:\n");
        pre.preorderIterative(bt.root);

        Postorder post = new Postorder();
        System.out.print("\nPostorder Traversal:\n");
        post.postorderIterative(bt.root);

        LevelOrder lvl = new LevelOrder();
        System.out.print("\nLevel Order Traversal:\n");
        lvl.levelOrder(bt.root);

    }

}
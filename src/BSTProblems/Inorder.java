package src.BSTProblems;

import java.util.Stack;

import src.BST.Node;

public class Inorder {

    public void inorder(final Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public void inorderIterative(final Node root) {
        Stack<Node> stack = new Stack<Node>();
        Node current = root;

        while (current != null || !stack.empty()) {

            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                System.out.print(current.data + " ");
                current = current.right;
            }
        }

    }

}

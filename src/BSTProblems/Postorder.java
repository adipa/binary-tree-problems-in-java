package src.BSTProblems;

import java.util.Stack;

import src.BST.Node;

public class Postorder {

    public void postorder(final Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    public void postorderIterative(final Node root) {
        Stack<Node> stack = new Stack<Node>();
        Node current = root;
        while (current != null || !stack.empty()) {
            if (current != null) {
                if (current.right != null)
                    stack.push(current.right);
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                if (!stack.empty() && current.right != null && current.right == stack.peek()) {
                    stack.pop();
                    stack.push(current);
                    current = current.right;
                } else {
                    System.out.print(current.data + " ");
                    current = null;
                }
            }
        }

    }

}
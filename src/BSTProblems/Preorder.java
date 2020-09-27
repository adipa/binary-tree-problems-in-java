package src.BSTProblems;

import java.util.Stack;

import src.BST.Node;

public class Preorder {

    public void preorder(final Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public void preorderIterative(final Node root) {
        if (root == null)
            return;

        Stack<Node> stack = new Stack<Node>();
        Node current = root;
        stack.push(current);
        while (!stack.empty()) {
            if (current != null) {
                System.out.print(current.data + " ");
                if (current.right != null)
                    stack.push(current.right);
                current = current.left;
            } else {
                current = stack.pop();
            }
        }

    }

}

package src.BSTProblems;

import src.BST.Node;

public class Height {

    public int height(final Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

}
